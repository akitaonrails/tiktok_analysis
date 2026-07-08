package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05k2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.v2.QuickShareStoreManager$record$1$1", f = "QuickShareStoreManager.kt", l = {57}, m = "invokeSuspend")
public final class C1438005k2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1438105k3 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1438005k2(C1438105k3 c1438105k3, InterfaceC1364105Vn<? super C1438005k2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1438105k3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1438005k2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("QuickShareStoreManager@8711.record$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("QuickShareStoreManager@8711.record$1$1");
                return objLJFF;
            }
        }
        C1438105k3 c1438105k3 = this.LLILLJJLI;
        String str = c1438105k3.LIZ;
        if (str != null) {
            if (str.length() != 0) {
                z = false;
            }
            if (!z) {
                try {
                    String strLJ = C051M.LJ(C13LP.LLIIII(c1438105k3.LIZIZ), false);
                    Keva value = C1438105k3.LIZJ.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("quick_share_record_");
                    sbLIZ.append(str);
                    value.storeString(C2188811AlT.LIZIZ(sbLIZ), strLJ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("save uid=");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" count=");
                    sbLIZ2.append(C13LP.LLIIII(c1438105k3.LIZIZ).size());
                    C2188811AlT.LIZIZ(sbLIZ2);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1720006oQ.LIZJ("QuickShareStoreModel", "save failed", e);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("QuickShareStoreManager@8711.record$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
