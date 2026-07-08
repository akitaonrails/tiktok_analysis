package X;

import android.content.Context;
import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357750E0v {
    public static final boolean LIZ(ResourceItem resourceItem, Context context) {
        boolean zLJFF = Intrinsics.LJFF(resourceItem.getName(), context.getString(2131846494));
        boolean zLJFF2 = Intrinsics.LJFF(resourceItem.getIcon(), "");
        boolean zLJFF3 = Intrinsics.LJFF(resourceItem.getPath(), "");
        if (zLJFF && zLJFF2 && zLJFF3) {
            return true;
        }
        return false;
    }
}
