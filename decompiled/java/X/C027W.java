package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import okio.ByteString;

/* JADX INFO: renamed from: X.027W, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C027W extends Message<C027W, C581402Om> {
    public static final ProtoAdapter<C027W> ADAPTER = new ProtoAdapter<C027W>() { // from class: X.023H
        public final ProtoAdapter<Map<Integer, String>> LIZ;
        public final ProtoAdapter<Map<Integer, String>> LIZIZ;

        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            this.LIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
            this.LIZIZ = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter2);
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C027W decode(ProtoReader protoReader) {
            C027W c027w = new C027W();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c027w.billing_agreement.putAll(this.LIZ.decode(protoReader));
                            break;
                        case 2:
                            c027w.recurring_billing_label.putAll(this.LIZIZ.decode(protoReader));
                            break;
                        case 3:
                            c027w.payment_description = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 4:
                            c027w.token_notification_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c027w.management_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c027w.fallback_display_price = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 7:
                            c027w.fallback_display_price_switch = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 8:
                            c027w.agreement_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c027w;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C027W c027w) {
            C027W c027w2 = c027w;
            int iEncodedSizeWithTag = this.LIZ.encodedSizeWithTag(1, c027w2.billing_agreement) + this.LIZIZ.encodedSizeWithTag(2, c027w2.recurring_billing_label);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, c027w2.payment_description) + protoAdapter.encodedSizeWithTag(4, c027w2.token_notification_url) + protoAdapter.encodedSizeWithTag(5, c027w2.management_url) + protoAdapter.encodedSizeWithTag(6, c027w2.fallback_display_price) + ProtoAdapter.BOOL.encodedSizeWithTag(7, c027w2.fallback_display_price_switch) + ProtoAdapter.INT32.encodedSizeWithTag(8, c027w2.agreement_type) + c027w2.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, C027W c027w) {
        }
    };
    public Integer agreement_type;
    public Map<Integer, String> billing_agreement;
    public String fallback_display_price;
    public Boolean fallback_display_price_switch;
    public String management_url;
    public String payment_description;
    public Map<Integer, String> recurring_billing_label;
    public String token_notification_url;

    @Override // com.squareup.wire.Message
    public C581402Om newBuilder() {
        return null;
    }

    public C027W() {
        super(ADAPTER, ByteString.EMPTY);
        this.billing_agreement = new LinkedHashMap();
        this.recurring_billing_label = new LinkedHashMap();
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
