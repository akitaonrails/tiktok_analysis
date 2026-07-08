package X;

import Y.ARunnableS112S0100000_12;
import Y.ARunnableS38S1100000_34;
import android.app.Activity;
import com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.page.main.fragment.MiniGameFragment;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.1AuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194231AuD implements IMiniGameRuntimeAPI.LaunchResultListener {
    public final WeakReference<MiniGameFragment> LIZ;

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
    public final void onFirstOnScreenCanvasFrame() {
        MiniGameFragment miniGameFragment;
        Activity activityHS;
        WeakReference<MiniGameFragment> weakReference = this.LIZ;
        if (weakReference == null || (miniGameFragment = weakReference.get()) == null || (activityHS = miniGameFragment.hS()) == null) {
            return;
        }
        activityHS.runOnUiThread(new ARunnableS112S0100000_12(this, 209));
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
    public final void onSuccess() {
        MiniGameFragment miniGameFragment = this.LIZ.get();
        if (miniGameFragment != null) {
            MiniGameFragment.jT(miniGameFragment);
        }
        JSONArray jSONArray = C2196361Axe.LIZ;
        MiniGameFragment miniGameFragment2 = this.LIZ.get();
        C2196361Axe.LJ(miniGameFragment2 != null ? miniGameFragment2.LLJJL : null, true, "");
        this.LIZ.get();
        MiniGameFragment miniGameFragment3 = this.LIZ.get();
        if (miniGameFragment3 != null) {
            miniGameFragment3.OT();
        }
        MiniGameFragment miniGameFragment4 = this.LIZ.get();
        if (miniGameFragment4 != null) {
            miniGameFragment4.IT();
        }
        C09ZS c09zs = C09ZS.LIZ;
        C09ZV c09zv = new C09ZV() { // from class: X.1AuC
            @Override // X.C09ZV
            public final void LIZ(String str) {
                Activity activityHS;
                boolean z;
                MiniGameFragment miniGameFragment5 = this.LIZ.LIZ.get();
                if (miniGameFragment5 != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("CoreJS loaded, gameRuntime is not null: ");
                    MiniGameFragment miniGameFragment6 = this.LIZ.LIZ.get();
                    if (miniGameFragment6 != null && miniGameFragment6.nT() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    sbLIZ.append(z);
                    sbLIZ.append(", codeJS content size: ");
                    sbLIZ.append(str.length());
                    miniGameFragment5.VT(C2188811AlT.LIZIZ(sbLIZ));
                }
                MiniGameFragment miniGameFragment7 = this.LIZ.LIZ.get();
                if (miniGameFragment7 != null && (activityHS = miniGameFragment7.hS()) != null) {
                    activityHS.runOnUiThread(new ARunnableS38S1100000_34(this.LIZ, str, 5));
                }
            }

            @Override // X.C09ZV
            public final void LIZIZ(String str) {
                MiniGameFragment miniGameFragment5 = this.LIZ.LIZ.get();
                if (miniGameFragment5 != null) {
                    miniGameFragment5.VT(str);
                }
            }
        };
        c09zs.getClass();
        C09ZS.LJ(c09zv);
    }

    public C2194231AuD(WeakReference<MiniGameFragment> weakReference) {
        this.LIZ = weakReference;
    }

    @Override // com.bytedance.amg.minigameruntime.api.IMiniGameRuntimeAPI.LaunchResultListener
    public final void onFailed(Exception exc) {
        SchemaParserData schemaParserData;
        JSONArray jSONArray = C2196361Axe.LIZ;
        MiniGameFragment miniGameFragment = this.LIZ.get();
        if (miniGameFragment != null) {
            schemaParserData = miniGameFragment.LLJJL;
        } else {
            schemaParserData = null;
        }
        String message = exc.getMessage();
        if (message == null) {
            message = "";
        }
        C2196361Axe.LJ(schemaParserData, false, message);
        this.LIZ.get();
    }
}
