package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Dg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C552202Dg extends Message<C552202Dg, C02IW> {
    public static final ProtoAdapter<C552202Dg> ADAPTER = new ProtoAdapter<C552202Dg>() { // from class: X.02Aw
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C552202Dg decode(ProtoReader protoReader) {
            C552202Dg c552202Dg = new C552202Dg();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                    } else {
                        c552202Dg.suggest_words.add(C545902Av.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c552202Dg;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C552202Dg c552202Dg) {
            C552202Dg c552202Dg2 = c552202Dg;
            return C545902Av.ADAPTER.asRepeated().encodedSizeWithTag(1, c552202Dg2.suggest_words) + c552202Dg2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C552202Dg c552202Dg) {
            C552202Dg c552202Dg2 = c552202Dg;
            C545902Av.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c552202Dg2.suggest_words);
            protoWriter.writeBytes(c552202Dg2.unknownFields());
        }
    };
    public List<C545902Av> suggest_words;

    public C552202Dg() {
        super(ADAPTER, ByteString.EMPTY);
        this.suggest_words = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C02IW newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
