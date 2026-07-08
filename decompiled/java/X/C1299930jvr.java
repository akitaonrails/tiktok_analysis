package X;

import com.lynx.tasm.LynxTemplateRender;
import com.lynx.tasm.TemplateBundle;

/* JADX INFO: renamed from: X.0jvr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class C1299930jvr implements InterfaceC1290540jgi {
    public final /* synthetic */ C1309800kBm LIZ;

    public /* synthetic */ C1299930jvr(C1309800kBm c1309800kBm) {
        this.LIZ = c1309800kBm;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1290540jgi
    public final void LIZ(C1289590jfB c1289590jfB) {
        C1309800kBm c1309800kBm = this.LIZ;
        boolean z = LynxTemplateRender.LJJZZI;
        int i = C1299920jvq.LIZ[c1289590jfB.LIZ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c1309800kBm.onFailed(c1289590jfB.LIZJ.getMessage());
                return;
            }
            return;
        }
        c1309800kBm.LIZIZ((TemplateBundle) c1289590jfB.LIZIZ);
    }
}
