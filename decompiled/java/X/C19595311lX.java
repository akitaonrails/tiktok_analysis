package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe.CoverLimitInfo;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe.FeedStickerSafeRuleInfo;
import com.ss.android.ugc.feed.platform.cell.component.stickermanager.gesturesafe.ForbidGestureInfo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.11lX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19595311lX {
    public static final boolean LIZ(InteractStickerStruct interactStickerStruct, Aweme aweme, String str) {
        float width;
        List list;
        FeedStickerSafeRuleInfo feedStickerSafeRuleInfo = (FeedStickerSafeRuleInfo) C19595511lZ.LIZ.getValue();
        if (feedStickerSafeRuleInfo == null) {
            return false;
        }
        ArrayList<String> arrayList = feedStickerSafeRuleInfo.globalForbidGesture;
        if (arrayList != null && arrayList.contains(str)) {
            return true;
        }
        CoverLimitInfo coverLimitInfo = feedStickerSafeRuleInfo.coverLimitInfo;
        if (coverLimitInfo != null && aweme != null) {
            float f = 0.0f;
            for (InteractStickerStruct interactStickerStruct2 : aweme.getInteractStickerStructs()) {
                if (coverLimitInfo.types.contains(Integer.valueOf(interactStickerStruct2.getType()))) {
                    try {
                        list = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), interactStickerStruct2.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.11lY
                        }.getType());
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("GestureSafeHelper -> stickerArea: e ");
                        sbLIZ.append(e);
                        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (list == null) {
                        width = 0.0f;
                    } else {
                        width = ((NormalTrackTimeStamp) C13LP.LJJJJZI(list)).getWidth() * ((NormalTrackTimeStamp) C13LP.LJJJJZI(list)).getHeight();
                    }
                    f += width;
                }
            }
            if (f >= coverLimitInfo.limit && coverLimitInfo.types.contains(Integer.valueOf(interactStickerStruct.getType()))) {
                return true;
            }
        }
        ArrayList<ForbidGestureInfo> arrayList2 = feedStickerSafeRuleInfo.forbidGestureList;
        if (arrayList2 != null) {
            for (ForbidGestureInfo forbidGestureInfo : arrayList2) {
                if (forbidGestureInfo.stickerType == interactStickerStruct.getType() && forbidGestureInfo.forbidGesture.contains(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
