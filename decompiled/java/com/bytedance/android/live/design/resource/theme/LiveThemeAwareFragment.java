package com.bytedance.android.live.design.resource.theme;

import X.C011Z;
import X.C1119850fFP;
import X.C1834150xpV;
import X.C513200KAs;
import X.InterfaceC513210KAt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes8.dex */
public class LiveThemeAwareFragment extends Fragment implements InterfaceC513210KAt {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLSogISIiZz02HELIOSOyo5Oyw2ZjEkLCI2ZgklPyoHICAhLA4kKTcpDz0yLygpJzs=";

    @Override // X.InterfaceC513210KAt
    public /* synthetic */ int getThemeOverlay(Context context) {
        return C513200KAs.LIZ(context);
    }

    public /* synthetic */ boolean isLight(Context context) {
        return C513200KAs.LIZIZ(this, context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1834150xpV.LIZ(getContext(), false);
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int themeOverlay = getThemeOverlay(getContext());
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (themeOverlay != c1119850fFP.LJIILJJIL(getContext())) {
            return C1834150xpV.LIZLLL(super.onGetLayoutInflater(bundle), getThemeOverlay(getContext()));
        }
        if (c1119850fFP.LJIJ(getContext())) {
            boolean zLJIJJ = c1119850fFP.LJIJJ(getContext());
            boolean zLJIIZILJ = c1119850fFP.LJIIZILJ(getContext());
            if (!zLJIJJ && zLJIIZILJ) {
                return C1834150xpV.LJ(super.onGetLayoutInflater(bundle));
            }
        }
        return super.onGetLayoutInflater(bundle);
    }
}
