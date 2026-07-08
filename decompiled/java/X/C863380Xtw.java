package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xtw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863380Xtw extends C09AY implements Function0<Keva> {
    public final /* synthetic */ C20337314hv LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C863380Xtw(C20337314hv c20337314hv) {
        super(0);
        this.LL = c20337314hv;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LIZ);
        sbLIZ.append("_studio_abnormal_exit_repo");
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
