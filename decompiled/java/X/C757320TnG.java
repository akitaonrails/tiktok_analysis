package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.live.business.links.ui.LynxContainerWrapperFragment;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;

/* JADX INFO: renamed from: X.0TnG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757320TnG extends AbstractC756290Tlb {
    @Override // X.AbstractC756290Tlb
    public final void LIZ(Context context) {
        FragmentManager supportFragmentManager;
        Fragment fragmentLJJJJZI;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if ((activityLIZ instanceof C19EG) && (supportFragmentManager = ((C19EG) activityLIZ).getSupportFragmentManager()) != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("LynxContainerWrapperFragment")) != null && (fragmentLJJJJZI instanceof DialogFragment)) {
            ((DialogFragment) fragmentLJJJJZI).dismissAllowingStateLoss();
        }
    }

    @Override // X.AbstractC756290Tlb
    public final void LIZIZ(Context context) {
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (!(activityLIZ instanceof C19EG)) {
            return;
        }
        String strLIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZIZ.getValue()).liveLinkPin.LIZ();
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            strLIZ = C08RU.LIZ(bundle, strLIZ);
        }
        FragmentManager supportFragmentManager = ((C19EG) activityLIZ).getSupportFragmentManager();
        LynxContainerWrapperFragment lynxContainerWrapperFragment = new LynxContainerWrapperFragment();
        Bundle bundle2 = new Bundle();
        C786410Ut5.LJJJI("SCHEMA", strLIZ, bundle2);
        lynxContainerWrapperFragment.setArguments(bundle2);
        if (supportFragmentManager != null) {
            lynxContainerWrapperFragment.show(supportFragmentManager, "LynxContainerWrapperFragment");
        }
    }
}
