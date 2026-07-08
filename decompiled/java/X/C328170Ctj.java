package X;

import com.ss.android.ugc.aweme.story.experiment.viewlist.ViewerListDiskCacheExpData;

/* JADX INFO: renamed from: X.0Ctj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328170Ctj {
    public static final ViewerListDiskCacheExpData LIZ;

    static {
        ViewerListDiskCacheExpData viewerListDiskCacheExpData = new ViewerListDiskCacheExpData(false, 1800000L, 43200000L, 3, false);
        ViewerListDiskCacheExpData viewerListDiskCacheExpData2 = (ViewerListDiskCacheExpData) C0C64.LJIILLIIL().LJJII(ViewerListDiskCacheExpData.class, viewerListDiskCacheExpData, "viewer_list_disk_cache_exp", true);
        if (viewerListDiskCacheExpData2 != null) {
            viewerListDiskCacheExpData = viewerListDiskCacheExpData2;
        }
        LIZ = viewerListDiskCacheExpData;
    }
}
