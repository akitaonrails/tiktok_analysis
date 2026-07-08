package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C621402bc extends Message<C621402bc, C621502bd> {
    public static final ProtoAdapter<C621402bc> ADAPTER = new ProtoAdapter<C621402bc>() { // from class: X.02bb
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C621402bc decode(ProtoReader protoReader) {
            C621402bc c621402bc = new C621402bc();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c621402bc.live_owner_name = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c621402bc.room_id = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c621402bc;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C621402bc c621402bc) {
            C621402bc c621402bc2 = c621402bc;
            return ProtoAdapter.INT64.encodedSizeWithTag(1, c621402bc2.room_id) + ProtoAdapter.STRING.encodedSizeWithTag(2, c621402bc2.live_owner_name) + c621402bc2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C621402bc c621402bc) {
            C621402bc c621402bc2 = c621402bc;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c621402bc2.room_id);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c621402bc2.live_owner_name);
            protoWriter.writeBytes(c621402bc2.unknownFields());
        }
    };
    public String live_owner_name;
    public Long room_id;

    public C621402bc() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C621502bd newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
