package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.063D, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoEnterUtil$enterNewAIBot$1", f = "TakoEnterUtil.kt", l = {1353, 962, 963}, m = "invokeSuspend")
public final class C063D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C013C LL;
    public AnonymousClass0957 LLILLJJLI;
    public C099G LLILLL;
    public C259800zU LLILZ;
    public long LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ TakoEnterParams LLJ;
    public final /* synthetic */ Context LLJI;
    public final /* synthetic */ View LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C063D(TakoEnterParams takoEnterParams, Context context, View view, InterfaceC1364105Vn<? super C063D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = takoEnterParams;
        this.LLJI = context;
        this.LLJIJIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C063D c063d = new C063D(this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c063d.LLIZLLLIL = obj;
        return c063d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170 A[Catch: CancellationException -> 0x01bb, TryCatch #1 {CancellationException -> 0x01bb, blocks: (B:35:0x0133, B:36:0x0136, B:39:0x0140, B:41:0x0144, B:43:0x014a, B:44:0x014d, B:45:0x0170, B:47:0x0177, B:48:0x017a, B:52:0x0199, B:55:0x01a4, B:31:0x0116), top: B:71:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0177 A[Catch: CancellationException -> 0x01bb, TryCatch #1 {CancellationException -> 0x01bb, blocks: (B:35:0x0133, B:36:0x0136, B:39:0x0140, B:41:0x0144, B:43:0x014a, B:44:0x014d, B:45:0x0170, B:47:0x0177, B:48:0x017a, B:52:0x0199, B:55:0x01a4, B:31:0x0116), top: B:71:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a3  */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, X.0mGW, android.app.Dialog] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C063D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
