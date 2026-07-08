package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.AnchorKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S21, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S21 {
    public static boolean LIZ(Aweme aweme) {
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        CelebrationMetaData celebrationMetaData;
        if (((Number) C1245204u2.LIZ.getValue()).intValue() > 0) {
            AnchorCommonStruct anchorCommonStruct = null;
            if ((!C729510SjV.LJJ(aweme) || aweme == null || (celebrationMetaData = aweme.getCelebrationMetaData()) == null || celebrationMetaData.celebrationType == null) && (anchors = aweme.getAnchors()) != null) {
                Iterator<AnchorCommonStruct> it2 = anchors.iterator();
                int i = 0;
                while (it2.hasNext()) {
                    if (it2.next().getType() == EnumC1430380nKG.PROP.getTYPE()) {
                        i++;
                    }
                }
                if (i == 1 && !C10EU.LJIILIIL() && (anchors2 = aweme.getAnchors()) != null) {
                    Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        AnchorCommonStruct next = it3.next();
                        if (next.getType() == EnumC1430380nKG.PROP.getTYPE()) {
                            anchorCommonStruct = next;
                            break;
                        }
                    }
                    AnchorCommonStruct anchorCommonStruct2 = anchorCommonStruct;
                    if (anchorCommonStruct2 != null && !Intrinsics.LJFF(AnchorKt.getExtraBasedOnKey(anchorCommonStruct2, "sub_type"), "ai_self")) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
