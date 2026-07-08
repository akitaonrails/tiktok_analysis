package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.commercialize.live.business.links.ui.LynxContainerWrapperFragment;
import com.ss.android.ugc.aweme.commercialize.live.settings.BASchemaConfig;

/* JADX INFO: renamed from: X.0TnF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C757310TnF extends AbstractC756290Tlb {
    @Override // X.AbstractC756290Tlb
    public final void LIZ(Context context) {
        Fragment fragmentLJJJJZI;
        if (!(C1388190mED.LIZ(context) instanceof C19EG)) {
            return;
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            if (supportFragmentManager != null && (fragmentLJJJJZI = supportFragmentManager.LJJJJZI("LynxContainerWrapperFragment")) != null && (fragmentLJJJJZI instanceof DialogFragment)) {
                ((DialogFragment) fragmentLJJJJZI).dismissAllowingStateLoss();
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC756290Tlb
    public final void LIZIZ(Context context) {
        if (!(C1388190mED.LIZ(context) instanceof C19EG)) {
            return;
        }
        String strLIZ = ((BASchemaConfig.BASchemaConfigData) BASchemaConfig.LIZIZ.getValue()).liveLinkPin.LIZ();
        Bundle bundle = this.LIZ;
        if (bundle != null) {
            strLIZ = C08RU.LIZ(bundle, strLIZ);
        }
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            FragmentManager supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
            LynxContainerWrapperFragment lynxContainerWrapperFragment = new LynxContainerWrapperFragment();
            Bundle bundle2 = new Bundle();
            C786410Ut5.LJJJI("SCHEMA", strLIZ, bundle2);
            lynxContainerWrapperFragment.setArguments(bundle2);
            if (supportFragmentManager != null) {
                lynxContainerWrapperFragment.show(supportFragmentManager, "LynxContainerWrapperFragment");
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
