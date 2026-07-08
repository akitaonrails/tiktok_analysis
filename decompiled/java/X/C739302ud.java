package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02ud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C739302ud extends Message<C739302ud, C739402ue> {
    public static final ProtoAdapter<C739302ud> ADAPTER = new ProtoAdapter<C739302ud>() { // from class: X.02uc
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C739302ud decode(ProtoReader protoReader) {
            C739302ud c739302ud = new C739302ud();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c739302ud.vertex = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c739302ud.fragment = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c739302ud;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C739302ud c739302ud) {
            C739302ud c739302ud2 = c739302ud;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, c739302ud2.fragment) + protoAdapter.encodedSizeWithTag(2, c739302ud2.vertex) + c739302ud2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C739302ud c739302ud) {
            C739302ud c739302ud2 = c739302ud;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, c739302ud2.fragment);
            protoAdapter.encodeWithTag(protoWriter, 2, c739302ud2.vertex);
            protoWriter.writeBytes(c739302ud2.unknownFields());
        }
    };
    public String fragment;
    public String vertex;

    public C739302ud() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C739402ue newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
