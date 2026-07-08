package X;

import Y.ARunnableS39S0300000_6;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.fragment.StellarFragment;
import com.bytedance.pipo.stellar.base.fragment.StellarViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HA1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.pipo.stellar.base.fragment.StellarFragment$initLoading$2", f = "StellarFragment.kt", l = {685}, m = "invokeSuspend")
public final class C0HA1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StellarFragment LLILLL;
    public final /* synthetic */ View LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HA1(StellarFragment stellarFragment, View view, InterfaceC1364105Vn<? super C0HA1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stellarFragment;
        this.LLILZ = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HA1 c0ha1 = new C0HA1(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0ha1.LLILLJJLI = obj;
        return c0ha1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        View viewInvoke;
        String str;
        C1C7U.LIZ("StellarFragment@cf07.initLoading$2");
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
            Object obj2 = this.LLILLJJLI;
            long j = this.LLILLL.LLJI;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("StellarFragment@cf07.initLoading$2");
                return objLJFF;
            }
        }
        Function0<? extends View> function0 = this.LLILLL.LLJIJIL;
        if (function0 != null) {
            viewInvoke = function0.invoke();
        } else {
            viewInvoke = null;
        }
        StellarViewModel stellarViewModelSR = this.LLILLL.SR();
        if (viewInvoke == null) {
            z = false;
        }
        C1716280ulO c1716280ulO = stellarViewModelSR.LLILLJJLI;
        c1716280ulO.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("event_type", "show");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("load_result", str);
        c1716280ulO.LIZJ("rd_pipo_lottie_show", C2097608Jq.LJIIL(c1716280ulO.LJI, linkedHashMap));
        if (viewInvoke != null) {
            StellarFragment stellarFragment = this.LLILLL;
            View view = this.LLILZ;
            viewInvoke.setTag(stellarFragment.LLIZLLLIL);
            ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.w30);
            View viewFindViewWithTag = view.findViewWithTag(stellarFragment.LLIZ);
            if (stellarFragment.LLJILLL == null) {
                C786410Ut5.T4(viewInvoke, 0.0f);
            }
            try {
                ViewParent parent = viewInvoke.getParent();
                if (parent instanceof ViewGroup) {
                    C786410Ut5.LJJJLZIJ(viewInvoke, (ViewGroup) parent);
                }
                viewGroup.addView(viewInvoke);
                C189200o6.m2constructorimpl(Boolean.valueOf(HandlerHook.viewPost(viewInvoke, new ARunnableS39S0300000_6(stellarFragment, viewFindViewWithTag, viewInvoke, 0))));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StellarFragment@cf07.initLoading$2");
        return unit;
    }
}
