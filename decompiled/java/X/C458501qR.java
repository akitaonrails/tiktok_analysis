package X;

import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01qR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$showToolTip$1", f = "ECDuringLiveBroadcasterWidget.kt", l = {}, m = "invokeSuspend")
public final class C458501qR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C180M LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C458501qR(C180M c180m, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c180m;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C458501qR(this.LLILLJJLI, this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        Resources resources;
        Integer numLJ;
        C1C7U.LIZ("ECDuringLiveBroadcasterWidget@b309.showToolTip$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            string = "";
            if (!TextUtils.isEmpty(this.LL) && (resources = this.LLILLJJLI.LLILZ.getResources()) != null && (numLJ = C2286608xc.LJ(C786410Ut5.n3(resources, this.LL, "string", this.LLILLJJLI.LLILZ.getPackageName()))) != null && numLJ.intValue() > 0) {
                string = this.LLILLJJLI.LLILZ.getString(numLJ.intValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (TextUtils.isEmpty(string)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.showToolTip$1");
            return unit;
        }
        final C180M c180m = this.LLILLJJLI;
        c180m.LLILLJJLI.LJFF("ECOM_ANCHOR_SMART_PIN_SUGGESTION", string, new InterfaceC1123790fLl() { // from class: X.01xW
            @Override // X.InterfaceC1123790fLl
            public final void onDismiss() {
                C180M c180m2 = c180m;
                C23250099c.LIZLLL(c180m2.LLJJI, null, null, new C327401Ou(c180m2, null), 3);
            }

            @Override // X.InterfaceC1123790fLl
            public final void onShow() {
                C180M c180m2 = c180m;
                c180m2.LLJJIJIIJIL = true;
                C180R.LIZIZ(c180m2.LLIZ, AnonymousClass0207.get$arr$(112));
                C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C502501xX(null), 3);
            }
        });
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ECDuringLiveBroadcasterWidget@b309.showToolTip$1");
        return unit2;
    }
}
