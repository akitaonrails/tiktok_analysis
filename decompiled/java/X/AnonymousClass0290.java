package X;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import okio.ByteString;

/* JADX INFO: renamed from: X.0290, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0290 extends Message<AnonymousClass0290, C02N8> {
    public static final ProtoAdapter<AnonymousClass0290> ADAPTER = new ProtoAdapter<AnonymousClass0290>() { // from class: X.024K
        {
            FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final AnonymousClass0290 decode(ProtoReader protoReader) {
            AnonymousClass0290 anonymousClass0290 = new AnonymousClass0290();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag != -1) {
                    switch (iNextTag) {
                        case 1:
                            anonymousClass0290.display_disable_methods = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case 2:
                            anonymousClass0290.view_all_type = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case 3:
                        default:
                            protoReader.peekFieldEncoding().rawProtoAdapter().decode(protoReader);
                            break;
                        case 4:
                            anonymousClass0290.select_button = C02G8.ADAPTER.decode(protoReader);
                            break;
                        case 5:
                            anonymousClass0290.pay_button = C02G8.ADAPTER.decode(protoReader);
                            break;
                        case 6:
                            anonymousClass0290.safe_tip = C02VO.ADAPTER.decode(protoReader);
                            break;
                        case 7:
                            anonymousClass0290.view_all_bottom_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case 8:
                            anonymousClass0290.view_all_top_key = ProtoAdapter.STRING.decode(protoReader);
                            break;
                        case BdTuring.TYPE_ECAF /* 9 */:
                            anonymousClass0290.view_all_icon_num = ProtoAdapter.INT32.decode(protoReader);
                            break;
                        case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                            anonymousClass0290.enable_venmo_native = ProtoAdapter.BOOL.decode(protoReader);
                            break;
                        case BdTuring.TYPE_EMAIL /* 11 */:
                            anonymousClass0290.user_status = ProtoAdapter.STRING.decode(protoReader);
                            break;
                    }
                } else {
                    protoReader.endMessage(jBeginMessage);
                    return anonymousClass0290;
                }
            }
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final int encodedSize(AnonymousClass0290 anonymousClass0290) {
            AnonymousClass0290 anonymousClass02902 = anonymousClass0290;
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, anonymousClass02902.display_disable_methods);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.INT32;
            int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, anonymousClass02902.view_all_type);
            ProtoAdapter<C02G8> protoAdapter3 = C02G8.ADAPTER;
            int iEncodedSizeWithTag3 = iEncodedSizeWithTag2 + protoAdapter3.encodedSizeWithTag(4, anonymousClass02902.select_button) + protoAdapter3.encodedSizeWithTag(5, anonymousClass02902.pay_button) + C02VO.ADAPTER.encodedSizeWithTag(6, anonymousClass02902.safe_tip);
            ProtoAdapter<String> protoAdapter4 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag3 + protoAdapter4.encodedSizeWithTag(7, anonymousClass02902.view_all_bottom_key) + protoAdapter4.encodedSizeWithTag(8, anonymousClass02902.view_all_top_key) + protoAdapter2.encodedSizeWithTag(9, anonymousClass02902.view_all_icon_num) + protoAdapter.encodedSizeWithTag(10, anonymousClass02902.enable_venmo_native) + protoAdapter4.encodedSizeWithTag(11, anonymousClass02902.user_status) + anonymousClass02902.unknownFields().size();
        }

        @Override // com.squareup.wire.ProtoAdapter
        public final /* bridge */ /* synthetic */ void encode(ProtoWriter protoWriter, AnonymousClass0290 anonymousClass0290) {
        }
    };
    public Boolean display_disable_methods;
    public Boolean enable_venmo_native;
    public C02G8 pay_button;
    public C02VO safe_tip;
    public C02G8 select_button;
    public String user_status;
    public String view_all_bottom_key;
    public Integer view_all_icon_num;
    public String view_all_top_key;
    public Integer view_all_type;

    public AnonymousClass0290() {
        super(ADAPTER, ByteString.EMPTY);
    }

    @Override // com.squareup.wire.Message
    public C02N8 newBuilder() {
        return null;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        newBuilder();
        return null;
    }
}
