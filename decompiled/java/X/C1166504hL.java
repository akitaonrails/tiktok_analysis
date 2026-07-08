package X;

import com.bytedance.hybrid.spark.raven.page.RavenFragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04hL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1166504hL extends C09AY implements Function0<String> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ RavenFragment<CONTEXT> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1166504hL(String str, boolean z, boolean z2, boolean z3, RavenFragment<CONTEXT> ravenFragment) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = ravenFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("finishSupplementWaitingByInsert source=");
        sbLIZ.append(this.LL);
        sbLIZ.append(" resumedContinuation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(" skipImmediateMaybeRestore=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(" deferReleaseHoldUiUntilPreDraw=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLILZIL.fT(null));
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
