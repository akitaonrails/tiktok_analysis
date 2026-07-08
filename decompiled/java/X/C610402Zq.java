package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02Zq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C610402Zq extends Message<C610402Zq, C610502Zr> {
    public static final ProtoAdapter<C610402Zq> ADAPTER = new ProtoAdapter<C610402Zq>() { // from class: X.02Zp
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C610402Zq decode(ProtoReader protoReader) {
            C610402Zq c610402Zq = new C610402Zq();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            } else {
                                c610402Zq.first_round_sug = C2223461C0q.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c610402Zq.word_hint = ProtoAdapter.STRING.decode(protoReader);
                        }
                    } else {
                        c610402Zq.tako_sug_word_list.add(C02SH.ADAPTER.decode(protoReader));
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c610402Zq;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C610402Zq c610402Zq) {
            C610402Zq c610402Zq2 = c610402Zq;
            return C02SH.ADAPTER.asRepeated().encodedSizeWithTag(1, c610402Zq2.tako_sug_word_list) + ProtoAdapter.STRING.encodedSizeWithTag(2, c610402Zq2.word_hint) + C2223461C0q.ADAPTER.encodedSizeWithTag(3, c610402Zq2.first_round_sug) + c610402Zq2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C610402Zq c610402Zq) {
            C610402Zq c610402Zq2 = c610402Zq;
            C02SH.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, c610402Zq2.tako_sug_word_list);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, c610402Zq2.word_hint);
            C2223461C0q.ADAPTER.encodeWithTag(protoWriter, 3, c610402Zq2.first_round_sug);
            protoWriter.writeBytes(c610402Zq2.unknownFields());
        }
    };
    public C2223461C0q first_round_sug;
    public List<C02SH> tako_sug_word_list;
    public String word_hint;

    public C610402Zq() {
        super(ADAPTER, ByteString.EMPTY);
        this.tako_sug_word_list = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C610502Zr newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
