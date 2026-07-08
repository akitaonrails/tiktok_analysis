package com.bytedance.android.live.design.resource.theme;

import X.C011Z;
import X.C1119850fFP;
import X.C1834150xpV;
import X.C513200KAs;
import X.InterfaceC513210KAt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.ss.android.ugc.aweme.tux.business.base.GlobalHookDialogFragment;

/* JADX INFO: loaded from: classes8.dex */
public abstract class LiveThemeAwareDialogFragment extends GlobalHookDialogFragment implements InterfaceC513210KAt {
    @Override // X.InterfaceC513210KAt
    public /* synthetic */ int getThemeOverlay(Context context) {
        return C513200KAs.LIZ(context);
    }

    public boolean isFollowAppTheme() {
        return false;
    }

    public abstract boolean isSheet();

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1834150xpV.LIZ(getContext(), isFollowAppTheme());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int themeOverlay = getThemeOverlay(getContext());
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (themeOverlay != c1119850fFP.LJIILJJIL(getContext())) {
            return C1834150xpV.LIZLLL(super.onGetLayoutInflater(bundle), getThemeOverlay(getContext()));
        }
        if (c1119850fFP.LJIJ(getContext())) {
            if (isFollowAppTheme()) {
                return C1834150xpV.LIZJ(super.onGetLayoutInflater(bundle));
            }
            boolean zLJIJJ = c1119850fFP.LJIJJ(getContext());
            boolean zLJIIZILJ = c1119850fFP.LJIIZILJ(getContext());
            if (!zLJIJJ && zLJIIZILJ) {
                return C1834150xpV.LJ(super.onGetLayoutInflater(bundle));
            }
        }
        return super.onGetLayoutInflater(bundle);
    }
}
