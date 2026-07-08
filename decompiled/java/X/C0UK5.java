package X;

import Y.ARunnableS9S0301000_12;
import com.bytedance.android.livesdk.broadcast.preview.modecontainer.PreviewWidgetLoadConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0UK5, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UK5 {
    public final C0UK8 LIZ;
    public final PreviewWidgetLoadConfig LIZIZ;
    public final Function0<Unit> LIZJ;
    public ARunnableS9S0301000_12 LIZLLL;
    public boolean LJ;
    public boolean LJFF;

    public final void LIZ() {
        this.LJ = true;
        ARunnableS9S0301000_12 aRunnableS9S0301000_12 = this.LIZLLL;
        if (aRunnableS9S0301000_12 != null) {
            C0IK5.LIZLLL(aRunnableS9S0301000_12);
        }
        this.LIZLLL = null;
        this.LJFF = false;
        this.LIZ.LIZ.clear();
    }

    public C0UK5(C0UK8 c0uk8, PreviewWidgetLoadConfig previewWidgetLoadConfig, AwS556S0100000_12 awS556S0100000_12) {
        this.LIZ = c0uk8;
        this.LIZIZ = previewWidgetLoadConfig;
        this.LIZJ = awS556S0100000_12;
    }

    public final void LIZIZ(int i, long j, List list) {
        if (this.LJ) {
            return;
        }
        if (i >= list.size()) {
            if (!this.LJFF) {
                this.LJFF = true;
                Function0<Unit> function0 = this.LIZJ;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            }
            return;
        }
        C770410UJz c770410UJz = (C770410UJz) ListProtector.get(list, i);
        ARunnableS9S0301000_12 aRunnableS9S0301000_12 = new ARunnableS9S0301000_12(this, c770410UJz, i, list, 1);
        this.LIZLLL = aRunnableS9S0301000_12;
        if (j > 0) {
            C486790J7d.LIZLLL(aRunnableS9S0301000_12, aRunnableS9S0301000_12, j);
        } else {
            aRunnableS9S0301000_12.run();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preview_load_phase_schedule priority=");
        sbLIZ.append(c770410UJz.LIZ);
        sbLIZ.append(" delay=");
        sbLIZ.append(j);
        sbLIZ.append("ms");
        C20441214yg.LJIIIZ("VideoModeContainer", C2188811AlT.LIZIZ(sbLIZ));
    }
}
