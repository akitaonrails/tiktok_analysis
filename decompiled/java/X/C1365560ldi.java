package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ldi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365560ldi extends AbstractC1365570ldj {
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ C1371590lnR LLILZ;
    public final /* synthetic */ InterfaceC1362720lZ8 LLILZIL;
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LLILZLL;

    @Override // X.AbstractC1365570ldj
    public final void LIZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
        int iIntValue;
        BaseSharePackage baseSharePackage;
        BaseSharePackage baseSharePackage2;
        Object tag;
        if (view != null && (tag = view.getTag(R.id.e12)) != null && (tag instanceof Integer)) {
            iIntValue = ((Number) tag).intValue();
        } else {
            iIntValue = -1;
        }
        C786410Ut5.LJJJI("share_platform", interfaceC1369790lkX.key(), this.LLILZ.LJIJJ.extras);
        InterfaceC1366500lfE interfaceC1366500lfE = C1370370llT.LJIIIIZZ;
        if (interfaceC1366500lfE != null) {
            interfaceC1366500lfE.LIZLLL();
        }
        if ((!interfaceC1369790lkX.LIZJ() || interfaceC1369790lkX.LJJJLIIL()) && !interfaceC1369790lkX.LJJLIIIJJI() && (baseSharePackage = this.LLILLJJLI) != null && baseSharePackage.LIZJ() && (baseSharePackage2 = this.LLILLJJLI) != null && baseSharePackage2.LIZLLL(interfaceC1369790lkX)) {
            if (Intrinsics.LJFF(interfaceC1369790lkX.key(), "repost")) {
                this.LLILZIL.F8(new C1366420lf6());
            } else {
                this.LLILZIL.F8(new C572640Md4());
            }
        }
        if (this.LLILZ.LJIJJ.LJI(this.LL, interfaceC1369790lkX)) {
            return;
        }
        interfaceC1369790lkX.LJJI();
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1365520lde(this.LLILZ, interfaceC1369790lkX, this.LLILLL, view, this.LLILZLL, this.LLILZIL, iIntValue, null), 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365560ldi(Context context, C1371590lnR c1371590lnR, InterfaceC1362720lZ8 interfaceC1362720lZ8, C259800zU<DialogC1389620mGW> c259800zU, BaseSharePackage baseSharePackage) {
        super(context, baseSharePackage);
        this.LLILLL = context;
        this.LLILZ = c1371590lnR;
        this.LLILZIL = interfaceC1362720lZ8;
        this.LLILZLL = c259800zU;
    }
}
