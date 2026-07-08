package X;

import com.ss.android.ugc.aweme.aigc.asynctask.CompositionMediaItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LBB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.asynctask.tasks.NleRestoreTask$fetchNleModelFromJson$1", f = "NleRestoreTask.kt", l = {290, 408}, m = "invokeSuspend")
public final class C0LBB extends C09AX implements Function2<C094D<? super C539060LCe>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0LGV LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ List<CompositionMediaItem> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LBB(C0LGV c0lgv, String str, List<CompositionMediaItem> list, InterfaceC1364105Vn<? super C0LBB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0lgv;
        this.LLILZ = str;
        this.LLILZIL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0LBB c0lbb = new C0LBB(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c0lbb.LLILLJJLI = obj;
        return c0lbb;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0199 A[ADDED_TO_REGION, REMOVE] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LBB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super C539060LCe> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
