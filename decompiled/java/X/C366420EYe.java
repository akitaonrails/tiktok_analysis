package X;

import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.ss.android.ugc.aweme.filter.FilterBean;

/* JADX INFO: renamed from: X.0EYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C366420EYe {
    public static final FilterBean LIZ(NLESegmentComposerFilter nLESegmentComposerFilter) {
        String resourceFile = null;
        FilterBean filterBeanLJ = C1453230nv7.LJ(C0CHQ.LIZ().LJJIJ(null).LIZIZ().LJJI(), nLESegmentComposerFilter.getEffectSDKFilter().getResourceId());
        if (filterBeanLJ == null) {
            return null;
        }
        NLEResourceNode effectSDKFilter = nLESegmentComposerFilter.getEffectSDKFilter();
        if (effectSDKFilter != null) {
            resourceFile = effectSDKFilter.getResourceFile();
        }
        String filterFilePath = filterBeanLJ.getFilterFilePath();
        if (filterFilePath == null || filterFilePath.length() == 0) {
            filterBeanLJ.setFilterFilePath(resourceFile);
        }
        String filterFolder = filterBeanLJ.getFilterFolder();
        if (filterFolder == null || filterFolder.length() == 0) {
            filterBeanLJ.setFilterFolder(resourceFile);
        }
        return filterBeanLJ;
    }
}
