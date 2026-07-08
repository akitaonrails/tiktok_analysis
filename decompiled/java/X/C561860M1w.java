package X;

import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M1w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.components.DraftBoxOrganizerComponent$evaluateAndShowIntroIfEligible$1", f = "DraftBoxOrganizerComponent.kt", l = {715, 749}, m = "invokeSuspend")
public final class C561860M1w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0M26 LLILZ;
    public final /* synthetic */ C0M22 LLILZIL;
    public final /* synthetic */ DraftBoxFragment LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561860M1w(String str, C0M26 c0m26, C0M22 c0m22, DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561860M1w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = c0m26;
        this.LLILZIL = c0m22;
        this.LLILZLL = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C561860M1w c561860M1w = new C561860M1w(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c561860M1w.LLILLJJLI = obj;
        return c561860M1w;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ed  */
    /* JADX WARN: Type inference failed for: r3v12, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C561860M1w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
