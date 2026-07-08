package X;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0txS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1685320txS {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS214S0000000_25.get$arr$(598));

    public static ViewModelStoreOwner LIZ(InterfaceC1680500tpg interfaceC1680500tpg) {
        interfaceC1680500tpg.LJJIJIIJIL(-584162872);
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) interfaceC1680500tpg.LJJIL(LIZ);
        if (viewModelStoreOwner == null) {
            viewModelStoreOwner = ViewTreeViewModelStoreOwner.get((View) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LJFF));
        }
        interfaceC1680500tpg.LJJIJLIJ();
        return viewModelStoreOwner;
    }
}
