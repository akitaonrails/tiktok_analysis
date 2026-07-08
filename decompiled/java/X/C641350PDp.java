package X;

import Y.ARunnableS79S0200000_10;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0PDp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.skylight.plat.SkylightListViewModel$replaceAllItems$1", f = "SkylightListViewModel.kt", l = {1061}, m = "invokeSuspend")
public final class C641350PDp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public Object LLILLJJLI;
    public SkylightListViewModel LLILLL;
    public int LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ SkylightListViewModel LLILZLL;
    public final /* synthetic */ List<InterfaceC1891350zJl> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C641350PDp(SkylightListViewModel skylightListViewModel, List<? extends InterfaceC1891350zJl> list, InterfaceC1364105Vn<? super C641350PDp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = skylightListViewModel;
        this.LLIZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C641350PDp c641350PDp = new C641350PDp(this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c641350PDp.LLILZIL = obj;
        return c641350PDp;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SkylightListViewModel skylightListViewModel;
        C1DEV c1dev;
        List<InterfaceC1891350zJl> list;
        C20600815jK<InterfaceC1891350zJl> state;
        C1C7U.LIZ("SkylightListViewModel@8bc2.replaceAllItems$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                skylightListViewModel = this.LLILLL;
                list = (List) this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILZIL;
            skylightListViewModel = this.LLILZLL;
            c1dev = skylightListViewModel.LLJJJJ;
            list = this.LLIZ;
            this.LLILZIL = obj2;
            this.LL = c1dev;
            this.LLILLJJLI = list;
            this.LLILLL = skylightListViewModel;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("SkylightListViewModel@8bc2.replaceAllItems$1");
                return objLJFF;
            }
        }
        try {
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("replace all items, size: ");
            sbLIZ.append(list.size());
            C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ));
            ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = skylightListViewModel.LLJJIJI;
            if (viewOnAttachStateChangeListenerC20604515jv == null || !viewOnAttachStateChangeListenerC20604515jv.isComputingLayout()) {
                z = false;
            }
            if (z) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("safeMutateListAlways: defer during layout, reason=");
                sbLIZ2.append("replaceAllItems");
                sbLIZ2.append(", vh=");
                sbLIZ2.append(skylightListViewModel.LLJILLL);
                C1720106oR.LJI("SkylightListViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                Boolean.valueOf(HandlerHook.viewPost(viewOnAttachStateChangeListenerC20604515jv, new ARunnableS79S0200000_10(skylightListViewModel, list, 19)));
            } else {
                ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv2 = skylightListViewModel.LLJJIJI;
                if (viewOnAttachStateChangeListenerC20604515jv2 != null && (state = viewOnAttachStateChangeListenerC20604515jv2.getState()) != null) {
                    state.LJIILL(list, null);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        c1dev.LIZIZ(null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SkylightListViewModel@8bc2.replaceAllItems$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
