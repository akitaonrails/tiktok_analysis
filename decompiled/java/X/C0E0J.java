package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E0J, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicApplyHandler$applyMagic$1", f = "MagicApplyHandler.kt", l = {}, m = "invokeSuspend")
public final class C0E0J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0E0B LL;
    public final /* synthetic */ ResourceItem LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C0E0I LLILZIL;
    public final /* synthetic */ InterfaceC497601wk LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0J(C0E0B c0e0b, ResourceItem resourceItem, boolean z, int i, C0E0I c0e0i, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0E0J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0e0b;
        this.LLILLJJLI = resourceItem;
        this.LLILLL = z;
        this.LLILZ = i;
        this.LLILZIL = c0e0i;
        this.LLILZLL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E0J(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0334 A[Catch: JSONException -> 0x0340, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0340, blocks: (B:150:0x032e, B:152:0x0334), top: B:234:0x032e }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0478  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E0J.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
