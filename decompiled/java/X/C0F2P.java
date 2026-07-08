package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0F2P, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.autocut.autocutanchor.AutoCutAnchorMediaProcessImpl$waitMockTaskFinished$terminalTask$1$2", f = "AutoCutAnchorMediaProcessImpl.kt", l = {}, m = "invokeSuspend")
public final class C0F2P extends C09AX implements Function2<C0LSZ, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C0F2P(InterfaceC1364105Vn<? super C0F2P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0F2P c0f2p = new C0F2P(interfaceC1364105Vn);
        c0f2p.LL = obj;
        return c0f2p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0LSZ c0lsz = (C0LSZ) this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutAnchorMediaProcessImpl observe mock task: taskId=");
        sbLIZ.append(c0lsz.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(c0lsz.LJ);
        sbLIZ.append(", step=");
        sbLIZ.append(c0lsz.LJI);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(c0lsz.LJ, "FINISHED") && !Intrinsics.LJFF(c0lsz.LJ, "FAILED") && !Intrinsics.LJFF(c0lsz.LJ, "CANCELED")) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AutoCutAnchorMediaProcessImpl@74a8.waitMockTaskFinished$terminalTask$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C0LSZ c0lsz, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c0lsz, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
