package X;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.LiveContainerActivity;
import com.ss.android.ugc.aweme.live.livehostimpl.livereply.replaylist.LiveReplayListActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Iyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractActivityC484150Iyj extends BaseActivity implements InterfaceC20573715ex {
    @Override // X.InterfaceC20573715ex
    public final void E4() {
    }

    @Override // X.InterfaceC20573715ex
    public boolean K6() {
        return this instanceof LiveContainerActivity;
    }

    public int getPageType() {
        return -1;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity
    public boolean isDarkModeSupported() {
        return this instanceof LiveReplayListActivity;
    }

    @Override // X.InterfaceC20573715ex
    public boolean wy() {
        return this instanceof LiveReplayListActivity;
    }

    static {
        C20338414i6.LIZIZ("BaseLiveSdkActivity");
    }

    public int LLLLLZL() {
        return C011Z.LIZ.LJIIIZ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectLIZ = C487020J8a.LIZ(this, arrayList);
        try {
            super.onResume();
            IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
            if (iHostAction != null) {
                iHostAction.setCurrentPage(getPageType());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2450709iz.LJ(arrayList, jSONObjectLIZ);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fragments extra info: ");
            sbLIZ.append(jSONObjectLIZ);
            C13SZ.LIZ(e, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
            throw e;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        C1107670evl.LIZ = null;
        C1107670evl.LIZIZ = 0;
        C1124870fNV.LIZJ().getClass();
        C1124870fNV.LJ();
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onPause() {
        super.onPause();
        IHostAction iHostAction = (IHostAction) C1161920gLG.LIZJ(IHostAction.class);
        if (iHostAction != null) {
            iHostAction.setCurrentPage(-1);
        }
    }

    public void vQ() {
        List<Fragment> listLJJLIIIJL = getSupportFragmentManager().LJJLIIIJL();
        if (!listLJJLIIIJL.isEmpty()) {
            C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
            Iterator<Fragment> it2 = listLJJLIIIJL.iterator();
            while (it2.hasNext()) {
                c19ehLJIIJ.LJIIZILJ(it2.next());
            }
            c19ehLJIIJ.LJIIL();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            C157W.LIZIZ().LIZ(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        boolean zLJI = MethodIDManager.LJI(202387);
        super.onCreate(bundle);
        getTheme().applyStyle(LLLLLZL(), false);
        C0JBU.LIZ();
        Window window = getWindow();
        window.getDecorView().setSystemUiVisibility(256);
        window.addFlags(Integer.MIN_VALUE);
        window.setNavigationBarColor(-16777216);
        C1107670evl.LIZ(this);
        C783810Uot.LIZLLL.LIZIZ = true;
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
