package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.02mG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C687402mG extends Message<C687402mG, C687502mH> {
    public static final ProtoAdapter<C687402mG> ADAPTER = new ProtoAdapter<C687402mG>() { // from class: X.02mF
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C687402mG decode(ProtoReader protoReader) {
            C687402mG c687402mG = new C687402mG();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c687402mG.risk_level = ProtoAdapter.INT32.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c687402mG;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C687402mG c687402mG) {
            C687402mG c687402mG2 = c687402mG;
            return ProtoAdapter.INT32.encodedSizeWithTag(1, c687402mG2.risk_level) + c687402mG2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C687402mG c687402mG) {
            C687402mG c687402mG2 = c687402mG;
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, c687402mG2.risk_level);
            protoWriter.writeBytes(c687402mG2.unknownFields());
        }
    };
    public Integer risk_level;

    public C687402mG() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C687502mH newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
