package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02pM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C706602pM extends Message<C706602pM, C706702pN> {
    public static final ProtoAdapter<C706602pM> ADAPTER = new ProtoAdapter<C706602pM>() { // from class: X.02pL
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C706602pM decode(ProtoReader protoReader) {
            C706602pM c706602pM = new C706602pM();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    if (iNextTag != 1) {
                        if (iNextTag != 2) {
                            if (iNextTag != 3) {
                                if (iNextTag != 4) {
                                    if (iNextTag != 5) {
                                        protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                                    } else {
                                        c706602pM.icon = C029C.ADAPTER.decode(protoReader);
                                    }
                                } else {
                                    c706602pM.button = C2263631Dir.ADAPTER.decode(protoReader);
                                }
                            } else {
                                c706602pM.bill_summary = C02YH.ADAPTER.decode(protoReader);
                            }
                        } else {
                            c706602pM.description.add(C1COL.ADAPTER.decode(protoReader));
                        }
                    } else {
                        c706602pM.title = C1COL.ADAPTER.decode(protoReader);
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c706602pM;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C706602pM c706602pM) {
            C706602pM c706602pM2 = c706602pM;
            ProtoAdapter<C1COL> protoAdapter = C1COL.ADAPTER;
            return protoAdapter.encodedSizeWithTag(1, c706602pM2.title) + protoAdapter.asRepeated().encodedSizeWithTag(2, c706602pM2.description) + C02YH.ADAPTER.encodedSizeWithTag(3, c706602pM2.bill_summary) + C2263631Dir.ADAPTER.encodedSizeWithTag(4, c706602pM2.button) + C029C.ADAPTER.encodedSizeWithTag(5, c706602pM2.icon) + c706602pM2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C706602pM c706602pM) {
        }
    };
    public C02YH bill_summary;
    public C2263631Dir button;
    public List<C1COL> description;
    public C029C icon;
    public C1COL title;

    public C706602pM() {
        super(ADAPTER, ByteString.EMPTY);
        this.description = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C706702pN newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
