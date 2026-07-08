package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;
import okio.ByteString;

/* JADX INFO: renamed from: X.1DA4, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DA4 extends Message<C1DA4, C1DA5> {
    public static final ProtoAdapter<C1DA4> ADAPTER = new ProtoAdapter<C1DA4>() { // from class: X.1DA3
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final C1DA4 decode(ProtoReader protoReader) {
            C1DA4 c1da4 = new C1DA4();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            c1da4.paywall_expr_group = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 2:
                            c1da4.panel_show_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 3:
                            c1da4.panel_ori_price = C1615780s9I.ADAPTER.decode(protoReader);
                            break;
                        case 4:
                            c1da4.after_purchase_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 5:
                            c1da4.after_purchase_redirect_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 6:
                            c1da4.after_purchase_redirect_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 7:
                            c1da4.after_purchase_popup_redirect_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            c1da4.subs_options.add(C1DA1.ADAPTER.decode(protoReader));
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            c1da4.after_subs_toast = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            c1da4.after_subs_redirect_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            c1da4.after_subs_popup_redirect_url = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                            c1da4.entitlements.add(C2251211D9j.ADAPTER.decode(protoReader));
                            break;
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return c1da4;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(C1DA4 c1da4) {
            C1DA4 c1da42 = c1da4;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, c1da42.paywall_expr_group);
            ProtoAdapter<C1615780s9I> protoAdapter2 = C1615780s9I.ADAPTER;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, c1da42.panel_show_price) + protoAdapter2.encodedSizeWithTag(3, c1da42.panel_ori_price);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, c1da42.after_purchase_toast) + protoAdapter3.encodedSizeWithTag(5, c1da42.after_purchase_redirect_url) + protoAdapter.encodedSizeWithTag(6, c1da42.after_purchase_redirect_type) + protoAdapter3.encodedSizeWithTag(7, c1da42.after_purchase_popup_redirect_url) + C1DA1.ADAPTER.asRepeated().encodedSizeWithTag(8, c1da42.subs_options) + protoAdapter3.encodedSizeWithTag(9, c1da42.after_subs_toast) + protoAdapter3.encodedSizeWithTag(10, c1da42.after_subs_redirect_url) + protoAdapter3.encodedSizeWithTag(11, c1da42.after_subs_popup_redirect_url) + C2251211D9j.ADAPTER.asRepeated().encodedSizeWithTag(12, c1da42.entitlements) + c1da42.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final void encode(ProtoWriter protoWriter, C1DA4 c1da4) {
            C1DA4 c1da42 = c1da4;
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 1, c1da42.paywall_expr_group);
            ProtoAdapter<C1615780s9I> protoAdapter2 = C1615780s9I.ADAPTER;
            protoAdapter2.encodeWithTag(protoWriter, 2, c1da42.panel_show_price);
            protoAdapter2.encodeWithTag(protoWriter, 3, c1da42.panel_ori_price);
            ProtoAdapter<String> protoAdapter3 = ProtoAdapter.STRING;
            protoAdapter3.encodeWithTag(protoWriter, 4, c1da42.after_purchase_toast);
            protoAdapter3.encodeWithTag(protoWriter, 5, c1da42.after_purchase_redirect_url);
            protoAdapter.encodeWithTag(protoWriter, 6, c1da42.after_purchase_redirect_type);
            protoAdapter3.encodeWithTag(protoWriter, 7, c1da42.after_purchase_popup_redirect_url);
            C1DA1.ADAPTER.asRepeated().encodeWithTag(protoWriter, 8, c1da42.subs_options);
            protoAdapter3.encodeWithTag(protoWriter, 9, c1da42.after_subs_toast);
            protoAdapter3.encodeWithTag(protoWriter, 10, c1da42.after_subs_redirect_url);
            protoAdapter3.encodeWithTag(protoWriter, 11, c1da42.after_subs_popup_redirect_url);
            C2251211D9j.ADAPTER.asRepeated().encodeWithTag(protoWriter, 12, c1da42.entitlements);
            protoWriter.writeBytes(c1da42.unknownFields());
        }
    };
    public String after_purchase_popup_redirect_url;
    public Integer after_purchase_redirect_type;
    public String after_purchase_redirect_url;
    public String after_purchase_toast;
    public String after_subs_popup_redirect_url;
    public String after_subs_redirect_url;
    public String after_subs_toast;
    public List<C2251211D9j> entitlements;
    public C1615780s9I panel_ori_price;
    public C1615780s9I panel_show_price;
    public Integer paywall_expr_group;
    public List<C1DA1> subs_options;

    public C1DA4() {
        super(ADAPTER, ByteString.EMPTY);
        this.subs_options = C1516540pZE.LJIIIIZZ();
        this.entitlements = C1516540pZE.LJIIIIZZ();
    }

    @Override // com.squareup.wire.Message
    public C1DA5 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
