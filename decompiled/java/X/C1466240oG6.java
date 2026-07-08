package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import java.util.List;

/* JADX INFO: renamed from: X.0oG6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1466240oG6 {
    public static final BaseStickerModel LIZ(InteractStickerStruct interactStickerStruct, EnumC1466150oFx enumC1466150oFx, int i, int i2) {
        Object c098200Yq;
        float startTime;
        float endTime;
        float startTime2;
        float endTime2;
        float fFloatValue;
        float x;
        Float scale;
        try {
            c098200Yq = (NormalTrackTimeStamp) C13LP.LJJJLZIJ(0, (List) C19598511m3.LIZ().LJIIIIZZ(interactStickerStruct.getTrackList(), new TypeToken<List<? extends NormalTrackTimeStamp>>() { // from class: X.0oG7
            }.getType()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        NormalTrackTimeStamp normalTrackTimeStamp = (NormalTrackTimeStamp) c098200Yq;
        float rotation = 0.0f;
        if (normalTrackTimeStamp != null) {
            startTime = normalTrackTimeStamp.getStartTime();
            endTime = normalTrackTimeStamp.getEndTime();
            startTime2 = normalTrackTimeStamp.getStartTime();
            endTime2 = normalTrackTimeStamp.getEndTime();
            rotation = normalTrackTimeStamp.getRotation();
        } else {
            startTime = 0.0f;
            endTime = 0.0f;
            startTime2 = 0.0f;
            endTime2 = 0.0f;
        }
        if (normalTrackTimeStamp != null && (scale = normalTrackTimeStamp.getScale()) != null) {
            fFloatValue = scale.floatValue();
        } else {
            fFloatValue = 1.0f;
        }
        float f = i;
        float y = 0.5f;
        if (normalTrackTimeStamp != null) {
            x = normalTrackTimeStamp.getX();
        } else {
            x = 0.5f;
        }
        float f2 = (f * x) - (i / 2);
        float f3 = i2;
        if (normalTrackTimeStamp != null) {
            y = normalTrackTimeStamp.getY();
        }
        return new BaseStickerModel(0, 0, enumC1466150oFx, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, f2, (f3 * y) - (i2 / 2), fFloatValue, rotation, startTime, endTime, false, startTime2, endTime2, false, 0.0f, null, null, null, false, -937426949, 15, null);
    }
}
