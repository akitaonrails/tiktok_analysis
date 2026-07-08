package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$restoreDraftProgressWithAsyncTask$2", f = "DraftViewModel.kt", l = {372, 373, 379}, m = "invokeSuspend")
public final class C2330209Bc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public DraftViewModel LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ ICreationAsyncTaskManager LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;
    public final /* synthetic */ DraftViewModel LLJ;
    public final /* synthetic */ Set<String> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330209Bc(ICreationAsyncTaskManager iCreationAsyncTaskManager, List<String> list, DraftViewModel draftViewModel, Set<String> set, InterfaceC1364105Vn<? super C2330209Bc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = iCreationAsyncTaskManager;
        this.LLIZLLLIL = list;
        this.LLJ = draftViewModel;
        this.LLJI = set;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2330209Bc(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x008d -> B:8:0x002b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2330209Bc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
