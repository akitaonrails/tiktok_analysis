package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LOA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl$realNavigateCloudDraftEdit$4", f = "NavigateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0LOA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C259800zU<DialogC1389620mGW> LL;
    public final /* synthetic */ NavigateServiceImpl LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ AIGCDraft LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LOA(C259800zU<DialogC1389620mGW> c259800zU, NavigateServiceImpl navigateServiceImpl, Context context, AIGCDraft aIGCDraft, InterfaceC1364105Vn<? super C0LOA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c259800zU;
        this.LLILLJJLI = navigateServiceImpl;
        this.LLILLL = context;
        this.LLILZ = aIGCDraft;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LOA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        T t;
        C0LOF c0lofLIZ;
        Function1<Context, String> function1;
        String strInvoke;
        C1C7U.LIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C259800zU<DialogC1389620mGW> c259800zU = this.LL;
        NavigateServiceImpl navigateServiceImpl = this.LLILLJJLI;
        Context context = this.LLILLL;
        InterfaceC546090LbL interfaceC546090LbL = this.LLILZ.businessKey;
        navigateServiceImpl.getClass();
        C547860LeC.LIZ.getClass();
        C546230LbZ c546230LbZLJ = C547860LeC.LIZIZ().LJ(interfaceC546090LbL);
        if (c546230LbZLJ != null && (c0lofLIZ = c546230LbZLJ.LIZ()) != null && (function1 = c0lofLIZ.LIZLLL) != null && (strInvoke = function1.invoke(context)) != null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.LJJLJLI(strInvoke);
            dialogC1389620mGW.LJJLL(false);
            C786410Ut5.J4(dialogC1389620mGW);
            t = dialogC1389620mGW;
        } else {
            t = 0;
        }
        c259800zU.element = t;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NavigateServiceImpl@832b.realNavigateCloudDraftEdit$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
