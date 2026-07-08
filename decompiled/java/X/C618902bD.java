package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02bD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C618902bD extends Message<C618902bD, C619002bE> {
    public static final ProtoAdapter<C618902bD> ADAPTER = new ProtoAdapter<C618902bD>() { // from class: X.02bC
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C618902bD decode(ProtoReader protoReader) {
            C618902bD c618902bD = new C618902bD();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                        } else {
                            c618902bD.notify_msg = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c618902bD.platforms.add(ProtoAdapter.STRING.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c618902bD;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C618902bD c618902bD) {
            C618902bD c618902bD2 = c618902bD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.asRepeated().encodedSizeWithTag(1, c618902bD2.platforms) + protoAdapter.encodedSizeWithTag(2, c618902bD2.notify_msg) + c618902bD2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C618902bD c618902bD) {
            C618902bD c618902bD2 = c618902bD;
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 1, c618902bD2.platforms);
            protoAdapter.encodeWithTag(protoWriter, 2, c618902bD2.notify_msg);
            protoWriter.writeBytes(c618902bD2.unknownFields());
        }
    };
    public String notify_msg;
    public List<String> platforms;

    public C618902bD() {
        super(ADAPTER, ByteString.EMPTY);
        this.platforms = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C619002bE newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
