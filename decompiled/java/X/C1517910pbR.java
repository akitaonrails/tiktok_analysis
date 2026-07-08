package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import okio.ByteString;

/* JADX INFO: renamed from: X.0pbR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1517910pbR extends Message<C1517910pbR, C1517920pbS> {
    public static final ProtoAdapter<C1517910pbR> ADAPTER = new ProtoAdapter<C1517910pbR>() { // from class: X.0pbQ
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1517910pbR decode(ProtoReader protoReader) {
            C1517910pbR c1517910pbR = new C1517910pbR();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c1517910pbR.impr_id = ProtoAdapter.STRING.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1517910pbR;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1517910pbR c1517910pbR) {
            C1517910pbR c1517910pbR2 = c1517910pbR;
            return ProtoAdapter.STRING.encodedSizeWithTag(1, c1517910pbR2.impr_id) + c1517910pbR2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1517910pbR c1517910pbR) {
            C1517910pbR c1517910pbR2 = c1517910pbR;
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, c1517910pbR2.impr_id);
            protoWriter.writeBytes(c1517910pbR2.unknownFields());
        }
    };
    public String impr_id;

    public C1517910pbR() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C1517920pbS newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
