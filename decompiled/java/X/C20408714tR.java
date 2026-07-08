package X;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookPolymerizationDialog;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20408714tR {
    public final PlaybookAnchorViewModel LIZ;
    public final LifecycleOwner LIZIZ;
    public final Function0<Context> LIZJ;
    public final Function0<Unit> LIZLLL;
    public View LJ;
    public C1324720kZq LJFF;
    public TextView LJI;
    public LiveIconView LJII;
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new C20408814tS(this));

    public final Context LIZ() {
        return (Context) this.LJIIIIZZ.getValue();
    }

    public static final int LIZIZ(String str, C20408714tR c20408714tR) {
        try {
            return Color.parseColor(C2469909m5.LIZIZ(str));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("parseColor color:");
            sbLIZ.append(str);
            sbLIZ.append(" error:");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("PlaybookBannerView", C2188811AlT.LIZIZ(sbLIZ));
            return C20736316Cj.LIZIZ(R.attr.eyv, c20408714tR.LIZ());
        }
    }

    public C20408714tR(PlaybookAnchorViewModel playbookAnchorViewModel, PlaybookPolymerizationDialog playbookPolymerizationDialog, C20408614tQ c20408614tQ, C20408914tT c20408914tT) {
        this.LIZ = playbookAnchorViewModel;
        this.LIZIZ = playbookPolymerizationDialog;
        this.LIZJ = c20408614tQ;
        this.LIZLLL = c20408914tT;
    }
}
