package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02rp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721902rp {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Aweme aweme) {
        StandardComponentInfo standardComponentInfo;
        StandardTagContainerStruct standardTagContainerStruct;
        List<StandardTagStruct> list;
        if (aweme != null && (standardComponentInfo = aweme.getStandardComponentInfo()) != null && (standardTagContainerStruct = standardComponentInfo.metaTag) != null && (list = standardTagContainerStruct.tags) != null && (!list.isEmpty())) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(Aweme aweme, String str) {
        StandardTagContainerStruct standardTagContainerStruct;
        List<StandardTagStruct> list;
        String str2;
        StandardTagContainerStruct standardTagContainerStruct2;
        List<StandardTagStruct> list2;
        String str3;
        if (aweme != null && aweme.getStandardComponentInfo() != null) {
            StandardComponentInfo standardComponentInfo = aweme.getStandardComponentInfo();
            if (standardComponentInfo != null && (standardTagContainerStruct2 = standardComponentInfo.highTag) != null && (list2 = standardTagContainerStruct2.tags) != null) {
                Iterator<StandardTagStruct> it2 = list2.iterator();
                while (it2.hasNext()) {
                    StandardTagKey standardTagKey = it2.next().key;
                    if (standardTagKey != null) {
                        str3 = standardTagKey.componentKey;
                    } else {
                        str3 = null;
                    }
                    if (Intrinsics.LJFF(str3, str)) {
                        return true;
                    }
                }
            }
            StandardComponentInfo standardComponentInfo2 = aweme.getStandardComponentInfo();
            if (standardComponentInfo2 != null && (standardTagContainerStruct = standardComponentInfo2.metaTag) != null && (list = standardTagContainerStruct.tags) != null) {
                Iterator<StandardTagStruct> it3 = list.iterator();
                while (it3.hasNext()) {
                    StandardTagKey standardTagKey2 = it3.next().key;
                    if (standardTagKey2 != null) {
                        str2 = standardTagKey2.componentKey;
                    } else {
                        str2 = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
