package X;

import android.content.Context;
import com.ss.android.ugc.aweme.experiment.FFPImageAssetCDNConfigSettings;
import com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage$setupBackgroundImage$1", f = "SuggestAuthPage.kt", l = {}, m = "invokeSuspend")
public final class C1070690dy7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SuggestAuthPage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1070690dy7(SuggestAuthPage suggestAuthPage, InterfaceC1364105Vn<? super C1070690dy7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestAuthPage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1070690dy7 c1070690dy7 = new C1070690dy7(this.LLILLJJLI, interfaceC1364105Vn);
        c1070690dy7.LL = obj;
        return c1070690dy7;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SuggestAuthPage@a836.setupBackgroundImage$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Context context = this.LLILLJJLI.getContext();
        if (context != null && C960203pA.LIZIZ(context)) {
            Context context2 = this.LLILLJJLI.getContext();
            if (context2 != null && C426750GoL.LIZLLL(context2)) {
                str = FFPImageAssetCDNConfigSettings.LIZ().ffpAssetConfig.suggestAuthPageRTLBGDark;
            } else {
                str = FFPImageAssetCDNConfigSettings.LIZ().ffpAssetConfig.suggestAuthPageLTRBGDark;
            }
        } else {
            Context context3 = this.LLILLJJLI.getContext();
            if (context3 != null && C426750GoL.LIZLLL(context3)) {
                str = FFPImageAssetCDNConfigSettings.LIZ().ffpAssetConfig.suggestAuthPageRTLBGLight;
            } else {
                str = FFPImageAssetCDNConfigSettings.LIZ().ffpAssetConfig.suggestAuthPageLTRBGLight;
            }
        }
        if (str == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SuggestAuthPage@a836.setupBackgroundImage$1");
            return unit;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(interfaceC497601wk, C2107308Nj.LIZ, null, new C1070680dy6(str, this.LLILLJJLI, null), 2);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SuggestAuthPage@a836.setupBackgroundImage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
