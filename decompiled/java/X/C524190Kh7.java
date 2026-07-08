package X;

import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kh7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C524190Kh7 {
    public static final TikTokMediaModel LIZIZ(String str, List list) {
        Object next;
        Iterator it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((MediaModel) next).id, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return (TikTokMediaModel) next;
    }

    public static final boolean LIZ(TikTokMediaModel tikTokMediaModel, Integer num, View view) {
        if (num != null && num.intValue() != -1 && num != null) {
            if (num.intValue() == 2 && tikTokMediaModel.LJIIJ()) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131850070);
                creativeToastBuilder.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(view, 6014, creativeToastBuilder);
                return false;
            }
            if (num.intValue() == 1 && tikTokMediaModel.LJIILJJIL()) {
                CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
                creativeToastBuilder2.messageRes(2131850069);
                creativeToastBuilder2.isTuxToastLegacy(true);
                C1390380mHk.LIZLLL(view, 6013, creativeToastBuilder2);
                return false;
            }
        }
        return true;
    }
}
