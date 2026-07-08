package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS548S0100000_4;

/* JADX INFO: renamed from: X.0DHy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C336720DHy {
    public static final ViewModelStoreOwner LIZJ(C01GW<? extends ViewModelStoreOwner> c01gw) {
        return c01gw.getValue();
    }

    public static final ViewModelLazy LIZ(Fragment fragment, C19719912Dl c19719912Dl, Function0 function0, Function0 function02, Function0 function03) {
        if (function03 == null) {
            function03 = new AwS548S0100000_4(fragment, 15);
        }
        return new ViewModelLazy(c19719912Dl, function0, function03, function02);
    }
}
