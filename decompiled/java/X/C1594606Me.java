package X;

import android.app.Activity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Me, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.webcontainer.hybrid.PnShybridKitBuilder$show$1", f = "PnShybridKitBuilder.kt", l = {}, m = "invokeSuspend")
public final class C1594606Me extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1594706Mf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1594606Me(C1594706Mf c1594706Mf, InterfaceC1364105Vn<? super C1594606Me> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1594706Mf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1594606Me c1594606Me = new C1594606Me(this.LLILLJJLI, interfaceC1364105Vn);
        c1594606Me.LL = obj;
        return c1594606Me;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activityLIZIZ;
        C19EG c19eg;
        C1C7U.LIZ("PnShybridKitBuilder@5ad8.show$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        AbstractC1387200mCc abstractC1387200mCcLIZIZ = C1906580ziK.LIZIZ();
        Integer numLJ = null;
        if (abstractC1387200mCcLIZIZ != null) {
            activityLIZIZ = abstractC1387200mCcLIZIZ.LIZIZ();
        } else {
            activityLIZIZ = null;
        }
        if ((activityLIZIZ instanceof C19EG) && (c19eg = (C19EG) activityLIZIZ) != null) {
            SparkContext sparkContext = this.LLILLJJLI.LIZ;
            if (sparkContext == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("PnShybridKitBuilder@5ad8.show$1");
                return unit;
            }
            DialogFragment dialogFragment = (DialogFragment) sparkContext.LJFF(SparkPopup.class);
            if (dialogFragment != null && !dialogFragment.isAdded()) {
                FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("SparkPopup#");
                String str = sparkContext.containerId;
                if (str != null) {
                    numLJ = C2286608xc.LJ(str.hashCode());
                }
                sbLIZ.append(numLJ);
                dialogFragment.show(supportFragmentManager, C2188811AlT.LIZIZ(sbLIZ));
            } else {
                C1541950qED.LIZJ.getClass();
                new C1541950qED(c19eg, sparkContext).LIZIZ();
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("PnShybridKitBuilder@5ad8.show$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("PnShybridKitBuilder@5ad8.show$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
