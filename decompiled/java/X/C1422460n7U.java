package X;

import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateCategoryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0n7U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1422460n7U {
    public static final boolean LIZ(TemplateCategoryData templateCategoryData) {
        String str;
        if (templateCategoryData != null) {
            str = templateCategoryData.key;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "create_tab_search");
    }

    public static final boolean LIZIZ(TemplateCategoryData templateCategoryData) {
        String str;
        if (templateCategoryData != null) {
            str = templateCategoryData.key;
        } else {
            str = null;
        }
        return Intrinsics.LJFF(str, "create_tab_search_trending");
    }
}
