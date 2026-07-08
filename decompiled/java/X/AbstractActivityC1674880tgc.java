package X;

import android.R;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import nv7.c0;

/* JADX INFO: renamed from: X.0tgc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractActivityC1674880tgc extends ActivityC214874197g {
    public View LLILZ;
    public int LLILZIL;
    public boolean LL = true;
    public boolean LLILLJJLI = true;
    public boolean LLILLL = true;
    public ViewOnLayoutChangeListenerC1698100uI4 LLILZLL = new ViewOnLayoutChangeListenerC1698100uI4(this, 6);

    public int LLLLZLL() {
        return -16777216;
    }

    public abstract void LLLLZLLLI(boolean z);

    public abstract void LLLZ();

    public abstract void LLLZIL(boolean z);

    public final void LLLZLZ() {
        LLLZ();
        if (!(LLLLZLLIL() instanceof C1660610tJb)) {
            if (LLLLZLLIL() instanceof c0) {
                LLLZIL(((c0) LLLLZLLIL()).LJII());
                LLLLZLLLI(((c0) LLLLZLLIL()).LJIIIIZZ());
                return;
            }
            return;
        }
        switch (C1660610tJb.LIZ.LIZIZ()) {
            case 1:
            case 4:
                LLLZIL(true);
                LLLLZLLLI(true);
                break;
            case 2:
            case 5:
                LLLZIL(false);
                LLLLZLLLI(true);
                break;
            case 3:
            case 6:
                LLLZIL(true);
                LLLLZLLLI(false);
                break;
            default:
                LLLZIL(false);
                LLLLZLLLI(false);
                break;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        View view = this.LLILZ;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.LLILZLL);
            this.LLILZLL = null;
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19EG, X.C19FO, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.LLILLJJLI) {
            this.LLILLJJLI = false;
            if (LLLLZLLIL() instanceof c0) {
                this.LLILZIL = c0.LIZ.o2();
            } else {
                int iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight = ScreenUtils.com_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight(this);
                this.LLILZIL = iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight;
                if (iCom_ss_android_ugc_aweme_shortvideo_ScreenUtils_com_ss_android_ugc_tiktok_tools_performance_lancet_SearchPreloadLancet_getNavigationBarHeight != LLLLZLLIL().o2()) {
                    LLLLZLLIL().s2(this.LLILZIL);
                }
            }
            LLLZLZ();
            boolean z = this.LLILLL;
            View view = this.LLILZ;
            if (view != null) {
                if (z) {
                    view.addOnLayoutChangeListener(this.LLILZLL);
                } else {
                    view.removeOnLayoutChangeListener(this.LLILZLL);
                }
            }
        }
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.C19GS, X.C19EG, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.LL) {
            this.LL = false;
            getWindow().clearFlags(1024);
            C1741950vQn.LIZ(this);
            getWindow().setNavigationBarColor(-16777216);
            getWindow().getDecorView().setBackgroundColor(LLLLZLL());
            C497820Jfg.LIZJ(this);
            LLLLZLLIL().p2();
            this.LLILZ = findViewById(R.id.content);
        }
    }

    public InterfaceC1674890tgd LLLLZLLIL() {
        return C1660610tJb.LIZ;
    }

    @Override // X.ActivityC214874197g, X.AbstractActivityC19422710yn, com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, X.C19EG, androidx.activity.ComponentActivity, X.C19FO, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LLILLL = true;
    }

    @Override // com.bytedance.ies.foundation.activity.BaseActivity, X.ActivityC21503719Dn, android.app.Activity
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("activity_tag", getClass().getSimpleName());
        C20684815ws.LJIILLIIL("studio_activity_on_restore", c2344009Gk.LIZ);
    }
}
