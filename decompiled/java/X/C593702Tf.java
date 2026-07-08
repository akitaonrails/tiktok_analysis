package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C593702Tf extends Message<C593702Tf, C593802Tg> {
    public static final ProtoAdapter<C593702Tf> ADAPTER = new ProtoAdapter<C593702Tf>() { // from class: X.02Te
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C593702Tf decode(ProtoReader protoReader) {
            C593702Tf c593702Tf = new C593702Tf();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c593702Tf.sati_param_for_pitaya = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c593702Tf.client_ai_upload_json_str = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c593702Tf;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C593702Tf c593702Tf) {
            C593702Tf c593702Tf2 = c593702Tf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c593702Tf2.client_ai_upload_json_str) + protoAdapter.encodedSizeWithTag(2, c593702Tf2.sati_param_for_pitaya) + c593702Tf2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C593702Tf c593702Tf) {
            C593702Tf c593702Tf2 = c593702Tf;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c593702Tf2.client_ai_upload_json_str);
            protoAdapter.encodeWithTag(protoWriter, 2, c593702Tf2.sati_param_for_pitaya);
            protoWriter.writeBytes(c593702Tf2.unknownFields());
        }
    };
    public String client_ai_upload_json_str;
    public String sati_param_for_pitaya;

    public C593702Tf() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C593802Tg newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
