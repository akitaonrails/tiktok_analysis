package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pc3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1518290pc3 extends Message<C1518290pc3, C1518300pc4> {
    public static final ProtoAdapter<C1518290pc3> ADAPTER = new ProtoAdapter<C1518290pc3>() { // from class: X.0pc2
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1518290pc3 decode(ProtoReader protoReader) {
            C1518290pc3 c1518290pc3 = new C1518290pc3();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c1518290pc3.deleted_card_id = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c1518290pc3.slate_group_type = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c1518290pc3.is_hot_refresh = ProtoAdapter.BOOL.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1518290pc3;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1518290pc3 c1518290pc3) {
            C1518290pc3 c1518290pc32 = c1518290pc3;
            int iEncodedSizeWithTag = ProtoAdapter.BOOL.encodedSizeWithTag(1, c1518290pc32.is_hot_refresh);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c1518290pc32.slate_group_type) + protoAdapter.encodedSizeWithTag(3, c1518290pc32.deleted_card_id) + c1518290pc32.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1518290pc3 c1518290pc3) {
            C1518290pc3 c1518290pc32 = c1518290pc3;
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, c1518290pc32.is_hot_refresh);
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 2, c1518290pc32.slate_group_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c1518290pc32.deleted_card_id);
            protoWriter.writeBytes(c1518290pc32.unknownFields());
        }
    };
    public Long deleted_card_id;
    public Boolean is_hot_refresh;
    public Long slate_group_type;

    @Override // com.squareup.wire.Message
    public C1518300pc4 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }

    public C1518290pc3(Boolean bool, Long l, Long l2) {
        this(bool, l, l2, ByteString.EMPTY);
    }

    public C1518290pc3(Boolean bool, Long l, Long l2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.is_hot_refresh = bool;
        this.slate_group_type = l;
        this.deleted_card_id = l2;
    }
}
