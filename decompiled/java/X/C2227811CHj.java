package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.1CHj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2227811CHj extends Message<C2227811CHj, C2227821CHk> {
    public static final ProtoAdapter<C2227811CHj> ADAPTER = new ProtoAdapter<C2227811CHj>() { // from class: X.1CHi
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2227811CHj decode(ProtoReader protoReader) {
            C2227811CHj c2227811CHj = new C2227811CHj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c2227811CHj.live_appointment = C2227781CHg.ADAPTER.decode(protoReader);
                        }
                    } else {
                        c2227811CHj.link_info = C2251301D9s.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2227811CHj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2227811CHj c2227811CHj) {
            C2227811CHj c2227811CHj2 = c2227811CHj;
            return C2251301D9s.ADAPTER.encodedSizeWithTag(1, c2227811CHj2.link_info) + C2227781CHg.ADAPTER.encodedSizeWithTag(2, c2227811CHj2.live_appointment) + c2227811CHj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2227811CHj c2227811CHj) {
            C2227811CHj c2227811CHj2 = c2227811CHj;
            C2251301D9s.ADAPTER.encodeWithTag(protoWriter, 1, c2227811CHj2.link_info);
            C2227781CHg.ADAPTER.encodeWithTag(protoWriter, 2, c2227811CHj2.live_appointment);
            protoWriter.writeBytes(c2227811CHj2.unknownFields());
        }
    };
    public C2251301D9s link_info;
    public C2227781CHg live_appointment;

    public C2227811CHj() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C2227821CHk newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
