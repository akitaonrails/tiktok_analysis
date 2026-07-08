package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552502Dj extends Message<C552502Dj, C569802Ka> {
    public static final ProtoAdapter<C552502Dj> ADAPTER = new ProtoAdapter<C552502Dj>() { // from class: X.02DG
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552502Dj decode(ProtoReader protoReader) {
            C552502Dj c552502Dj = new C552502Dj();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c552502Dj.info_bars.add(C02DF.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552502Dj;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552502Dj c552502Dj) {
            C552502Dj c552502Dj2 = c552502Dj;
            return C02DF.ADAPTER.asRepeated().encodedSizeWithTag(1, c552502Dj2.info_bars) + c552502Dj2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552502Dj c552502Dj) {
            C552502Dj c552502Dj2 = c552502Dj;
            C02DF.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c552502Dj2.info_bars);
            protoWriter.writeBytes(c552502Dj2.unknownFields());
        }
    };
    public List<C02DF> info_bars;

    public C552502Dj() {
        super(ADAPTER, ByteString.EMPTY);
        this.info_bars = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C569802Ka newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
