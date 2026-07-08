package com.bytedance.android.live.design.resource.theme;

import X.C011Z;
import X.C1119850fFP;
import X.C1834150xpV;
import X.C513200KAs;
import X.InterfaceC513210KAt;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.appcompat.app.AppCompatDialogFragment;

/* JADX INFO: loaded from: classes8.dex */
public class LiveThemeAwareAppCompatDialogFragment extends AppCompatDialogFragment implements InterfaceC513210KAt {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiLSogISIiZz02Oyo5Oyw2ZjHELIOSEkLCI2ZgklPyoHICAhLA4kKTcpCD8jCyohOS4nDCwtJSA0DjctLiI2JjE=";

    @Override // X.InterfaceC513210KAt
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return C513200KAs.LIZ(context);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C1834150xpV.LIZ(getContext(), false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        int iLIZ = C513200KAs.LIZ(getContext());
        C1119850fFP c1119850fFP = C011Z.LIZ;
        if (iLIZ != c1119850fFP.LJIILJJIL(getContext())) {
            return C1834150xpV.LIZLLL(super.onGetLayoutInflater(bundle), C513200KAs.LIZ(getContext()));
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
