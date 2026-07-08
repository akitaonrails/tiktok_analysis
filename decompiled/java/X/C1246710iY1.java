package X;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.setting.serverpush.model.ContentLanguage;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS239S0300000_30;
import njp.a;

/* JADX INFO: renamed from: X.0iY1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.trill.setting.compose.DisplayAndCaptionVM$fetchPushSettings$1$2$1", f = "DisplayAndCaptionVM.kt", l = {}, m = "invokeSuspend")
public final class C1246710iY1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ PushSettings LL;
    public final /* synthetic */ DisplayAndCaptionVM LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1246710iY1(PushSettings pushSettings, DisplayAndCaptionVM displayAndCaptionVM, Context context, String str, InterfaceC1364105Vn<? super C1246710iY1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = pushSettings;
        this.LLILLJJLI = displayAndCaptionVM;
        this.LLILLL = context;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1246710iY1(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ContentLanguage> list;
        String string;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        C1C7U.LIZ("DisplayAndCaptionVM@7d78.fetchPushSettings$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        PushSettings pushSettings = this.LL;
        if (pushSettings != null && (list = pushSettings.translationLanguage) != null && !list.isEmpty()) {
            ContentLanguage contentLanguage = this.LL.selectedTranslationLanguage;
            String str = "";
            if (contentLanguage != null) {
                this.LLILLJJLI.LLILLJJLI = contentLanguage.getLanguageCode();
                C1839820xye.LIZ().LIZJ(contentLanguage.getLanguageCode());
                string = contentLanguage.getLocalName();
            } else {
                this.LLILLJJLI.LLILLJJLI = "empty";
                Resources resources = this.LLILLL.getResources();
                if (resources == null || (string = resources.getString(R.string.m8s)) == null) {
                    string = "";
                }
            }
            this.LLILLJJLI.setState(new C14XJ(string, this.LLILLL, this.LL, this.LLILZ));
            I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
            if (i18nServiceApi != null && (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) != null) {
                C844470XAv.LIZ.getClass();
                String strLJIILJJIL = i18nManagerServiceApiLIZ.LJIILJJIL(C844470XAv.LIZ());
                if (strLJIILJJIL != null) {
                    str = strLJIILJJIL;
                }
            }
            C1246730iY3.LIZ(str, this.LLILLJJLI.LLILLJJLI);
            DisplayAndCaptionVM displayAndCaptionVM = this.LLILLJJLI;
            displayAndCaptionVM.setState(new AwS239S0300000_30(this.LLILLL, this.LL, displayAndCaptionVM, 9));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DisplayAndCaptionVM@7d78.fetchPushSettings$1$2$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DisplayAndCaptionVM@7d78.fetchPushSettings$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
