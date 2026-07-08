package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.lite.autoservice.ILiteLynxApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0q7T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.bytedance.lynx.hybrid.lite.LiteLynxKitView$setStatus$1", f = "LiteLynxKitView.kt", l = {533}, m = "invokeSuspend")
public final class C1537770q7T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1537720q7O LLILLJJLI;
    public final /* synthetic */ InterfaceC1538610q8p LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1537770q7T(C1537720q7O c1537720q7O, InterfaceC1538610q8p interfaceC1538610q8p, InterfaceC1364105Vn<? super C1537770q7T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1537720q7O;
        this.LLILLL = interfaceC1538610q8p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1537770q7T(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long j;
        Integer loadingBgColor;
        C1C7U.LIZ("LiteLynxKitView@73dd.setStatus$1");
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
            C1538590q8n c1538590q8n = this.LLILLJJLI.getHybridContext().liteLynxConfig;
            if (c1538590q8n != null) {
                j = c1538590q8n.LIZJ;
            } else {
                j = 100;
            }
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("LiteLynxKitView@73dd.setStatus$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.getClass();
        C1537720q7O c1537720q7O = this.LLILLJJLI;
        EnumC1538460q8a enumC1538460q8a = c1537720q7O.LLJJ;
        if (enumC1538460q8a != EnumC1538460q8a.SUCCESS && enumC1538460q8a != EnumC1538460q8a.FAIL) {
            c1537720q7O.LJIJ();
            ViewGroup viewGroup = this.LLILLJJLI.LLJJIJI;
            if (viewGroup != null) {
                C786410Ut5.LJLZ(0, viewGroup);
            }
            View viewLJJLIIIJILLIZJL = this.LLILLL.LJJLIIIJILLIZJL();
            if (viewLJJLIIIJILLIZJL != null) {
                C1537720q7O c1537720q7O2 = this.LLILLJJLI;
                ViewGroup viewGroup2 = c1537720q7O2.LLJJIJI;
                if (viewGroup2 != null) {
                    C786410Ut5.LJJJJI(viewGroup2);
                }
                C1041450dCx.LIZJ(viewLJJLIIIJILLIZJL);
                ViewGroup viewGroup3 = c1537720q7O2.LLJJIJI;
                if (viewGroup3 != null) {
                    viewGroup3.addView(viewLJJLIIIJILLIZJL, new FrameLayout.LayoutParams(-1, -1));
                }
                C587540N2q.LIZ.getClass();
                ILiteLynxApi iLiteLynxApi = (ILiteLynxApi) C587540N2q.LIZ(ILiteLynxApi.class);
                if (iLiteLynxApi != null && (loadingBgColor = iLiteLynxApi.getLoadingBgColor(c1537720q7O2.getContext(), c1537720q7O2.getHybridContext())) != null) {
                    c1537720q7O2.setBackgroundColor(loadingBgColor.intValue());
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiteLynxKitView@73dd.setStatus$1");
        return unit;
    }
}
