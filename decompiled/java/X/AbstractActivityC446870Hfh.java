package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS236S0000000_6;

/* JADX INFO: renamed from: X.0Hfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractActivityC446870Hfh extends BaseActivity {
    public abstract Fragment LLLLLZL();

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        activityConfiguration(AFwS236S0000000_6.get$arr$(477));
        super.onCreate(bundle);
        setContentView(R.layout.dns);
        C19EH c19ehLJIIJ = getSupportFragmentManager().LJIIJ();
        c19ehLJIIJ.LJIJJLI(R.anim.fv, R.anim.g2, 0, R.anim.g2);
        c19ehLJIIJ.LJIJ(R.id.iiv, LLLLLZL(), "TAG_CONTAINER");
        c19ehLJIIJ.LJIIJ();
    }
}
