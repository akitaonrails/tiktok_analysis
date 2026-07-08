package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nui, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.share.quickexternalshare.QuickExternalShareProductSensor$tryToUpdatePendingState$1$hasHandle$1", f = "QuickExternalShareProductSensor.kt", l = {353}, m = "invokeSuspend")
public final class C609060Nui extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ VideoItemParams LLILZ;
    public final /* synthetic */ C259800zU<C609080Nuk> LLILZIL;
    public final /* synthetic */ C608530Ntr LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C609060Nui(String str, VideoItemParams videoItemParams, C259800zU<C609080Nuk> c259800zU, C608530Ntr c608530Ntr, InterfaceC1364105Vn<? super C609060Nui> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = videoItemParams;
        this.LLILZIL = c259800zU;
        this.LLILZLL = c608530Ntr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C609060Nui(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0229  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C609060Nui.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
