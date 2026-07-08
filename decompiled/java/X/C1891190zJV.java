package X;

import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0zJV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.journey.step.push.PushPermissionBackgroundFragment$onResume$1", f = "PushPermissionBackgroundFragment.kt", l = {164}, m = "invokeSuspend")
public final class C1891190zJV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PushPermissionBackgroundFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1891190zJV(PushPermissionBackgroundFragment pushPermissionBackgroundFragment, InterfaceC1364105Vn<? super C1891190zJV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pushPermissionBackgroundFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1891190zJV(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushPermissionBackgroundFragment@3adb.onResume$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C099F c099f = this.LLILLJJLI.LLJJIJIIJIL;
            this.LL = 1;
            if (c099f.LJLIIIL(this) == objLJFF) {
                C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.onResume$1");
                return objLJFF;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResume after enter animation, pushPopupStatus: ");
        sbLIZ.append(this.LLILLJJLI.LLJJIII);
        C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.getClass();
        AbstractC20656215sG abstractC20656215sGLJ = PopupManager.LJ();
        if (abstractC20656215sGLJ != null) {
            C1911410zq7.LIZ("PushPermissionFragment", "hasPendingPopupTask: true");
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("pendingTask: ");
            sbLIZ2.append(abstractC20656215sGLJ);
            C1911410zq7.LIZ("PushPermissionFragment", C2188811AlT.LIZIZ(sbLIZ2));
            PushPermissionBackgroundFragment pushPermissionBackgroundFragment = this.LLILLJJLI;
            pushPermissionBackgroundFragment.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1891170zJT(500L, pushPermissionBackgroundFragment, null), 3);
        } else {
            C1911410zq7.LIZ("PushPermissionFragment", "hasPendingPopupTask: false");
            this.LLILLJJLI.aS();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushPermissionBackgroundFragment@3adb.onResume$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
