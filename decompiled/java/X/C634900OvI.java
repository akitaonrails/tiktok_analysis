package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0OvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634900OvI {
    public static final C13DQ LIZ = C13ZT.LIZJ(AFwS195S0000000_9.get$arr$(401));

    public static final Fragment LIZ(AbstractC738140SxQ abstractC738140SxQ) {
        LifecycleOwner parent = abstractC738140SxQ.getParent();
        if (parent instanceof Fragment) {
            return (Fragment) parent;
        }
        if (parent instanceof UIAssem) {
            return LIZ((AbstractC738140SxQ) parent);
        }
        return null;
    }
}
