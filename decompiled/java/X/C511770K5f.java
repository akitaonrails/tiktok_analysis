package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.comp.api.subscription.ISubscribeService;
import com.bytedance.android.livesdk.comp.api.subscription.status.ISubscriptionStatusService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0K5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511770K5f extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Uri LLILZLL;
    public final /* synthetic */ Context LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ Room LLJILJIL;
    public final /* synthetic */ String LLJILJILJ;
    public final /* synthetic */ String LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ C511750K5d LLJJI;
    public final /* synthetic */ C259800zU<Fragment> LLJJIII;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C511770K5f(String str, String str2, String str3, int i, String str4, Uri uri, Context context, String str5, String str6, String str7, String str8, Room room, String str9, String str10, String str11, C511750K5d c511750K5d, C259800zU<Fragment> c259800zU) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = str4;
        this.LLILZLL = uri;
        this.LLIZ = context;
        this.LLIZLLLIL = str5;
        this.LLJ = str6;
        this.LLJI = str7;
        this.LLJIJIL = str8;
        this.LLJILJIL = room;
        this.LLJILJILJ = str9;
        this.LLJILLL = str10;
        this.LLJJ = str11;
        this.LLJJI = c511750K5d;
        this.LLJJIII = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_change_price_sheet_agree");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII(this.LL, "show_entrance");
        c474500IjALIZ.LJJII("notify_and_consent", "show_type");
        c474500IjALIZ.LJJII(this.LLILLJJLI, "old_price");
        c474500IjALIZ.LJJII(this.LLILLL, "new_price");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILZ), "subscribe_month");
        c474500IjALIZ.LJJII("auto_sub", "subscribe_type");
        c474500IjALIZ.LJJII(this.LLILZIL, "renewal_time");
        c474500IjALIZ.LIZ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(this.LLILZLL);
        Uri uri = this.LLILZLL;
        Iterator<T> it2 = queryParameterNames.iterator();
        while (true) {
            String str = "";
            if (!it2.hasNext()) {
                break;
            }
            String str2 = (String) it2.next();
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                str = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            linkedHashMap.put(str2, str);
        }
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(this.LLILZLL, "log_param");
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null) {
            linkedHashMap.putAll(C500260Jjc.LL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2));
        }
        FragmentManager fragmentManagerLJIL = C520010KaN.LJIL(this.LLIZ, false);
        if (fragmentManagerLJIL != null) {
            String str3 = this.LLIZLLLIL;
            String str4 = this.LLJ;
            String str5 = this.LLJI;
            String string = this.LLJIJIL;
            Room room = this.LLJILJIL;
            String str6 = this.LLJILJILJ;
            String str7 = this.LLJILLL;
            String str8 = this.LLJJ;
            ((ISubscribeService) C1161920gLG.LIZJ(ISubscribeService.class)).Ae();
            Boolean bool = Boolean.FALSE;
            if (str5 == null) {
                str5 = "";
            }
            if (string == null && (room == null || (string = Long.valueOf(room.getId()).toString()) == null)) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            C0KBB.LIZJ(fragmentManagerLJIL, new C0KCF(str3, null, str4, true, 0, "normal_sub", "", "app_start", null, bool, "", str5, "vertical", "main_page", string, true, "", true, null, 0, str6, str7, null, null, str8, 0, null, 0L, 0L, false, -351271166, 15), linkedHashMap);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LLIZ);
        if (c19egLIZIZ != null) {
            ((ISubscriptionStatusService) this.LLJJI.LIZ.getValue()).cp1(c19egLIZIZ, this.LLIZ).LIZIZ(c19egLIZIZ, new C511800K5i(this.LLJJIII));
        }
        return Unit.LIZ;
    }
}
