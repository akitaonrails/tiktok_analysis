package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Eqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.logic.AsyncTasksPanelViewModel$undoRedoListener$1$after$2", f = "AsyncTasksPanelViewModel.kt", l = {652, 661, 667}, m = "invokeSuspend")
public final class C377220Eqe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public ICreationAsyncTaskManager LLIZ;
    public int LLIZLLLIL;
    public final /* synthetic */ AsyncTasksPanelViewModel LLJ;
    public final /* synthetic */ C259800zU<Set<String>> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C377220Eqe(AsyncTasksPanelViewModel asyncTasksPanelViewModel, C259800zU<Set<String>> c259800zU, InterfaceC1364105Vn<? super C377220Eqe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = asyncTasksPanelViewModel;
        this.LLJI = c259800zU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C377220Eqe(this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0197 A[LOOP:1: B:50:0x0191->B:52:0x0197, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C377220Eqe.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
