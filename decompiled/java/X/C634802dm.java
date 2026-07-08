package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C634802dm extends Message<C634802dm, C634902dn> {
    public static final ProtoAdapter<C634802dm> ADAPTER = new ProtoAdapter<C634802dm>() { // from class: X.02dl
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C634802dm decode(ProtoReader protoReader) {
            C634802dm c634802dm = new C634802dm();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c634802dm.tts_voice_reuse_params = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c634802dm.tts_voice_attr = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c634802dm;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C634802dm c634802dm) {
            C634802dm c634802dm2 = c634802dm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c634802dm2.tts_voice_attr) + protoAdapter.encodedSizeWithTag(2, c634802dm2.tts_voice_reuse_params) + c634802dm2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C634802dm c634802dm) {
            C634802dm c634802dm2 = c634802dm;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c634802dm2.tts_voice_attr);
            protoAdapter.encodeWithTag(protoWriter, 2, c634802dm2.tts_voice_reuse_params);
            protoWriter.writeBytes(c634802dm2.unknownFields());
        }
    };
    public String tts_voice_attr;
    public String tts_voice_reuse_params;

    public C634802dm() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C634902dn newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
