package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.highlight.viewmodel.LiveHighlightViewModel$selectMusic$1$6", f = "LiveHighlightViewModel.kt", l = {419}, m = "invokeSuspend")
public final class C323790Cmf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C259800zU<String> LLILLL;
    public final /* synthetic */ LiveHighlightViewModel LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323790Cmf(C259800zU<String> c259800zU, LiveHighlightViewModel liveHighlightViewModel, long j, Context context, InterfaceC1364105Vn<? super C323790Cmf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = liveHighlightViewModel;
        this.LLILZIL = j;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323790Cmf c323790Cmf = new C323790Cmf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c323790Cmf.LLILLJJLI = obj;
        return c323790Cmf;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C259800zU<String> c259800zU;
        C1C7U.LIZ("LiveHighlightViewModel@9d4.selectMusic$1$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    c259800zU = (C259800zU) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c259800zU = this.LLILLL;
                LiveHighlightViewModel liveHighlightViewModel = this.LLILZ;
                long j = this.LLILZIL;
                Context context = this.LLILZLL;
                this.LLILLJJLI = c259800zU;
                this.LL = 1;
                liveHighlightViewModel.getClass();
                obj = LiveHighlightViewModel.wQ2(j, context, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveHighlightViewModel@9d4.selectMusic$1$6");
                    return objLJFF;
                }
            }
            String str = (String) obj;
            T t = str;
            if (str == null) {
                t = "";
            }
            c259800zU.element = t;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("LiveHighlightViewModel@9d4.selectMusic$1$6");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends Unit>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
