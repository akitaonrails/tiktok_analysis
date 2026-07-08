package X;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.services.external.IComplianceService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XhN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public abstract class AbstractC855590XhN extends LinearLayout {
    public IComplianceService LL;
    public Fragment LLILLJJLI;

    public abstract void LIZ(int i, C855810Xhj c855810Xhj);

    public abstract void LIZIZ(C855500XhE c855500XhE);

    public abstract void LIZJ(int i);

    public abstract void LIZLLL();

    public abstract void LJFF();

    public abstract boolean LJI();

    public boolean LJII() {
        return false;
    }

    public abstract void LJIIIIZZ();

    public abstract void LJIIIZ(boolean z);

    public abstract String LJIIJ();

    public abstract int getSaveUploadType();

    public abstract void setSaveLocalEnabled(boolean z);

    public abstract void setSyncIconSize(int i);

    public abstract void setSyncShareViewTextColor(int i);

    public abstract void setSyncShareViewTextSize(float f);

    public void setSyncShareViewTitle(String str) {
    }

    public final void LJ() {
        Bundle bundle = new Bundle();
        IComplianceService iComplianceService = this.LL;
        if (iComplianceService != null) {
            bundle.putInt("publish_private_status", iComplianceService.getPublishPermission());
            bundle.putBoolean("music_prevent_download", this.LL.getMusicPreventDownload());
        }
        JSONObject jSONObject = C1379930m0t.LIZ;
        C1379920m0s.LIZ(bundle, null, "ug_publish_share_click");
    }

    public IComplianceService getComplianceService() {
        return this.LL;
    }

    public Fragment getFragment() {
        return this.LLILLJJLI;
    }

    public AbstractC855590XhN(Context context) {
        super(context);
    }

    public void setComplianceService(IComplianceService iComplianceService) {
        this.LL = iComplianceService;
    }
}
