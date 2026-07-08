package X;

import android.content.Context;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ldf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365530ldf extends C09AY implements Function2<AbstractC1375550ltp, Boolean, Unit> {
    public final /* synthetic */ InterfaceC1369790lkX LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ C1371590lnR LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC1362720lZ8 LLILZIL;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365530ldf(InterfaceC1369790lkX interfaceC1369790lkX, Context context, C1371590lnR c1371590lnR, int i, InterfaceC1362720lZ8 interfaceC1362720lZ8, C259800zU<DialogC1389620mGW> c259800zU) {
        super(2);
        this.LL = interfaceC1369790lkX;
        this.LLILLJJLI = context;
        this.LLILLL = c1371590lnR;
        this.LLILZ = i;
        this.LLILZIL = interfaceC1362720lZ8;
        this.LLILZLL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(AbstractC1375550ltp abstractC1375550ltp, Boolean bool) {
        boolean zLJJIIJ;
        AbstractC1375550ltp abstractC1375550ltp2 = abstractC1375550ltp;
        if (bool.booleanValue()) {
            final InterfaceC1369790lkX interfaceC1369790lkX = this.LL;
            Context context = this.LLILLJJLI;
            final C1371590lnR c1371590lnR = this.LLILLL;
            final InterfaceC1362720lZ8 interfaceC1362720lZ8 = this.LLILZIL;
            zLJJIIJ = interfaceC1369790lkX.LJJIIJ(abstractC1375550ltp2, context, new C0M7Y() { // from class: X.0ldh
                @Override // X.C0M7Y
                public final View LIZIZ() {
                    C1264130j07 c1264130j07 = c1371590lnR.LJJL;
                    InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1371590lnR.LJJZZI;
                    return (View) c1264130j07.LIZ.get();
                }

                @Override // X.C0M7Y
                public final InterfaceC1362720lZ8 LIZ() {
                    return interfaceC1362720lZ8;
                }
            });
        } else {
            zLJJIIJ = false;
        }
        C1366480lfC.LIZ(zLJJIIJ, this.LLILLL, this.LL, this.LLILZ, this.LLILLJJLI, this.LLILZIL);
        if (C1366550lfJ.LIZ(this.LL.key())) {
            C571830Mbl.LIZ(this.LLILZLL.element);
        }
        return Unit.LIZ;
    }
}
