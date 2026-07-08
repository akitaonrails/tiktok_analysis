package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;

/* JADX INFO: renamed from: X.0EA3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EA3 {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(ResourceItem resourceItem) {
        if (resourceItem.getParentResource() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(resourceItem.getParentResource().getName());
            sbLIZ.append(resourceItem.getName());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return resourceItem.getName();
    }
}
