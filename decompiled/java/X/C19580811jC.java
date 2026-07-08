package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.List;

/* JADX INFO: renamed from: X.11jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19580811jC {
    public static final boolean LIZ(InteractStickerStruct interactStickerStruct) {
        List<NormalTrackTimeStamp> trackTimeStampCache;
        NormalTrackTimeStamp normalTrackTimeStamp;
        List<NormalTrackTimeStamp> list = null;
        try {
            if (interactStickerStruct.getTrackTimeStampCache() == null) {
                trackTimeStampCache = (List) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), interactStickerStruct.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.11jD
                }.getType());
                try {
                    interactStickerStruct.setTrackTimeStampCache(trackTimeStampCache);
                } catch (s e) {
                    e = e;
                    list = trackTimeStampCache;
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("InteractStickerUtils.kt : e ");
                    sbLIZ.append(e);
                    C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    trackTimeStampCache = list;
                }
            } else {
                trackTimeStampCache = interactStickerStruct.getTrackTimeStampCache();
            }
        } catch (s e2) {
            e = e2;
        }
        if (trackTimeStampCache == null || trackTimeStampCache.isEmpty() || (normalTrackTimeStamp = (NormalTrackTimeStamp) C13LP.LJJJJZI(trackTimeStampCache)) == null) {
            return true;
        }
        return true ^ normalTrackTimeStamp.isWholeDuration();
    }
}
