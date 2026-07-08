package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.widget.Widget;

/* JADX INFO: renamed from: X.0Jaj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C494750Jaj {
    public static final EnumC494740Jai LIZ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            return EnumC494740Jai.FRAGMENT;
        }
        if (lifecycleOwner instanceof C19EG) {
            return EnumC494740Jai.ROOT_CONTAINER;
        }
        if (lifecycleOwner instanceof InterfaceC214902198i) {
            return EnumC494740Jai.ROOT_CONTAINER;
        }
        if (lifecycleOwner instanceof Widget) {
            return EnumC494740Jai.WIDGET;
        }
        return EnumC494740Jai.FRAGMENT;
    }
}
