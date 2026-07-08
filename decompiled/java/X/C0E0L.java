package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0L, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E0L {
    public static final boolean LIZ(ResourceItem resourceItem) {
        if (Intrinsics.LJFF(resourceItem.getIcon(), "") && Intrinsics.LJFF(resourceItem.getPath(), "")) {
            return true;
        }
        return false;
    }
}
