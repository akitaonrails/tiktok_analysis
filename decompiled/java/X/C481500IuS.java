package X;

import com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.interact.viewmodel.MultiTopLiveRandomMatchViewModel$startRandomMatch$1", f = "MultiTopLiveRandomMatchViewModel.kt", l = {108, 119, 126, 142}, m = "invokeSuspend")
public final class C481500IuS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ MultiTopLiveRandomMatchViewModel LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ long LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C481500IuS(MultiTopLiveRandomMatchViewModel multiTopLiveRandomMatchViewModel, String str, long j, InterfaceC1364105Vn<? super C481500IuS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = multiTopLiveRandomMatchViewModel;
        this.LLILZLL = str;
        this.LLIZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C481500IuS c481500IuS = new C481500IuS(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c481500IuS.LLILZ = obj;
        return c481500IuS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0139  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C481500IuS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
