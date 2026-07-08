package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.02dL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C632102dL extends Message<C632102dL, C632202dM> {
    public static final ProtoAdapter<C632102dL> ADAPTER = new ProtoAdapter<C632102dL>() { // from class: X.02dK
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C632102dL decode(ProtoReader protoReader) {
            C632102dL c632102dL = new C632102dL();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c632102dL.payment_service_fee = C614702aX.ADAPTER.decode(protoReader);
                            break;
                        case 2:
                            c632102dL.payment_service_fee_tips = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 3:
                            c632102dL.payment_service_fee_tool_tips = C645602fW.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c632102dL.payment_promotion_info = AnonymousClass0220.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            c632102dL.deduplicated_payment_fee_promotion_texts.add(ProtoAdapter.STRING.decode(protoReader));
                            break;
                        case 6:
                            c632102dL.payment_fee_promotion_basic_infos.add(C631802dI.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c632102dL;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C632102dL c632102dL) {
            C632102dL c632102dL2 = c632102dL;
            int iEncodedSizeWithTag = C614702aX.ADAPTER.encodedSizeWithTag(1, c632102dL2.payment_service_fee);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, c632102dL2.payment_service_fee_tips) + C645602fW.ADAPTER.encodedSizeWithTag(3, c632102dL2.payment_service_fee_tool_tips) + AnonymousClass0220.ADAPTER.encodedSizeWithTag(4, c632102dL2.payment_promotion_info) + protoAdapter.asRepeated().encodedSizeWithTag(5, c632102dL2.deduplicated_payment_fee_promotion_texts) + C631802dI.ADAPTER.asRepeated().encodedSizeWithTag(6, c632102dL2.payment_fee_promotion_basic_infos) + c632102dL2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C632102dL c632102dL) {
        }
    };
    public List<String> deduplicated_payment_fee_promotion_texts;
    public List<C631802dI> payment_fee_promotion_basic_infos;
    public AnonymousClass0220 payment_promotion_info;
    public C614702aX payment_service_fee;
    public String payment_service_fee_tips;
    public C645602fW payment_service_fee_tool_tips;

    public C632102dL() {
        super(ADAPTER, ByteString.EMPTY);
        this.deduplicated_payment_fee_promotion_texts = C1516540pZE.LJIIIIZZ();
        this.payment_fee_promotion_basic_infos = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C632202dM newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
