package X;

import Y.AgS98S1100000_5;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F2Q, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$waitMockTaskFinished$terminalTask$1", f = "AutoCutAnchorMediaProcessImpl.kt", l = {638}, m = "invokeSuspend")
public final class C0F2Q extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ>, Object> {
    public int LL;
    public final /* synthetic */ ICreationAsyncTaskManager LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F2Q(ICreationAsyncTaskManager iCreationAsyncTaskManager, String str, String str2, InterfaceC1364105Vn<? super C0F2Q> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iCreationAsyncTaskManager;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F2Q(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1");
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
            final InterfaceC346201Wa<List<C0LSZ>> interfaceC346201WaLJJJJLI = this.LLILLJJLI.LJJJJLI(this.LLILLL);
            final String str = this.LLILZ;
            InterfaceC346201Wa<C0LSZ> interfaceC346201Wa = new InterfaceC346201Wa<C0LSZ>() { // from class: X.0F2R
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super C0LSZ> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = interfaceC346201WaLJJJJLI.collect(new AgS98S1100000_5(str, interfaceC346701Wf, 2), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            };
            C0F2P c0f2p = new C0F2P(null);
            this.LL = 1;
            obj = C09IC.LJIJ(interfaceC346201Wa, this, c0f2p);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0LSZ> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
