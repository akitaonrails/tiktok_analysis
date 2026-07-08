package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1Bzx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2223271Bzx extends Message<C2223271Bzx, C2223281Bzy> {
    public static final ProtoAdapter<C2223271Bzx> ADAPTER = new ProtoAdapter<C2223271Bzx>() { // from class: X.1Bzw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C2223271Bzx decode(ProtoReader protoReader) {
            C2223271Bzx c2223271Bzx = new C2223271Bzx();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c2223271Bzx.ba_anchor_infos.add(C2223241Bzu.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c2223271Bzx;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C2223271Bzx c2223271Bzx) {
            C2223271Bzx c2223271Bzx2 = c2223271Bzx;
            return C2223241Bzu.ADAPTER.asRepeated().encodedSizeWithTag(1, c2223271Bzx2.ba_anchor_infos) + c2223271Bzx2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C2223271Bzx c2223271Bzx) {
            C2223271Bzx c2223271Bzx2 = c2223271Bzx;
            C2223241Bzu.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c2223271Bzx2.ba_anchor_infos);
            protoWriter.writeBytes(c2223271Bzx2.unknownFields());
        }
    };
    public List<C2223241Bzu> ba_anchor_infos;

    public C2223271Bzx() {
        super(ADAPTER, ByteString.EMPTY);
        this.ba_anchor_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C2223281Bzy newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
