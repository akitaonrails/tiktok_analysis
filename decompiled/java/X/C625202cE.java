package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02cE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C625202cE extends Message<C625202cE, C625402cG> {
    public static final ProtoAdapter<C625202cE> ADAPTER = new ProtoAdapter<C625202cE>() { // from class: X.02cF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C625202cE decode(ProtoReader protoReader) {
            C625402cG c625402cG = new C625402cG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                                c625402cG.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                            } else {
                                c625402cG.LJFF = ProtoAdapter.INT64.decode(protoReader);
                            }
                        } else {
                            c625402cG.LJ = ProtoAdapter.INT64.decode(protoReader);
                        }
                    } else {
                        c625402cG.LIZLLL = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c625402cG.build();
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C625202cE c625202cE) {
            C625202cE c625202cE2 = c625202cE;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            return protoAdapter.encodedSizeWithTag(1, c625202cE2.reverse_index) + protoAdapter.encodedSizeWithTag(2, c625202cE2.room_id) + protoAdapter.encodedSizeWithTag(3, c625202cE2.slate_group_type) + c625202cE2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C625202cE c625202cE) {
            C625202cE c625202cE2 = c625202cE;
            ProtoAdapter<Long> protoAdapter = ProtoAdapter.INT64;
            protoAdapter.encodeWithTag(protoWriter, 1, c625202cE2.reverse_index);
            protoAdapter.encodeWithTag(protoWriter, 2, c625202cE2.room_id);
            protoAdapter.encodeWithTag(protoWriter, 3, c625202cE2.slate_group_type);
            protoWriter.writeBytes(c625202cE2.unknownFields());
        }
    };
    public Long reverse_index;
    public Long room_id;
    public Long slate_group_type;

    public C625202cE() {
    }

    @Override // com.squareup.wire.Message
    public C625402cG newBuilder() {
        return null;
    }

    public C625202cE(Long l, Long l2, Long l3) {
        this(l, l2, l3, ByteString.EMPTY);
    }

    public C625202cE(Long l, Long l2, Long l3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.reverse_index = l;
        this.room_id = l2;
        this.slate_group_type = l3;
    }
}
