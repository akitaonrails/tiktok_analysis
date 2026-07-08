package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Ue, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C596202Ue extends Message<C596202Ue, C596302Uf> {
    public static final ProtoAdapter<C596202Ue> ADAPTER = new ProtoAdapter<C596202Ue>() { // from class: X.02Ud
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C596202Ue decode(ProtoReader protoReader) {
            C596202Ue c596202Ue = new C596202Ue();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c596202Ue.now_creation_type = ProtoAdapter.INT32.decode(protoReader);
                            }
                        } else {
                            c596202Ue.now_post_camera_type = ProtoAdapter.INT32.decode(protoReader);
                        }
                    } else {
                        c596202Ue.expired_at = ProtoAdapter.INT64.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c596202Ue;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C596202Ue c596202Ue) {
            C596202Ue c596202Ue2 = c596202Ue;
            int iEncodedSizeWithTag = ProtoAdapter.INT64.encodedSizeWithTag(1, c596202Ue2.expired_at);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c596202Ue2.now_post_camera_type) + protoAdapter.encodedSizeWithTag(3, c596202Ue2.now_creation_type) + c596202Ue2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C596202Ue c596202Ue) {
            C596202Ue c596202Ue2 = c596202Ue;
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 1, c596202Ue2.expired_at);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, c596202Ue2.now_post_camera_type);
            protoAdapter.encodeWithTag(protoWriter, 3, c596202Ue2.now_creation_type);
            protoWriter.writeBytes(c596202Ue2.unknownFields());
        }
    };
    public Long expired_at;
    public Integer now_creation_type;
    public Integer now_post_camera_type;

    public C596202Ue() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C596302Uf newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
