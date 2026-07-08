package X;

import android.graphics.PointF;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.l;
import com.ss.android.ugc.aweme.sticker.data.BaseTrackTimeStamp;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.NormalTrackTimeStamp;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: X.0o9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1462390o9t {
    public static final void LIZIZ(InteractStickerStruct interactStickerStruct, List<? extends BaseTrackTimeStamp> list) {
        if (C2401009ay.LIZ(list)) {
            interactStickerStruct.setTrackList("");
            return;
        }
        try {
            interactStickerStruct.setTrackList(GsonProtectorUtils.toJson(C123O.LIZ(), list));
        } catch (l e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static final InteractStickerStruct LIZ(int i, float f, float f2, PointF pointF, PointF pointF2, float f3) {
        InteractStickerStruct interactStickerStruct = new InteractStickerStruct();
        interactStickerStruct.setType(i);
        NormalTrackTimeStamp normalTrackTimeStamp = new NormalTrackTimeStamp();
        C196924122w.LLZLL.getClass();
        normalTrackTimeStamp.setRotation(C1462400o9u.LIZ(f));
        normalTrackTimeStamp.setScale(Float.valueOf(f2));
        normalTrackTimeStamp.setX(pointF.x);
        normalTrackTimeStamp.setY(pointF.y);
        normalTrackTimeStamp.setStartTime(0.0f);
        normalTrackTimeStamp.setEndTime(f3);
        normalTrackTimeStamp.setWidth(pointF2.x);
        normalTrackTimeStamp.setHeight(pointF2.y);
        LinkedList linkedList = new LinkedList();
        linkedList.add(normalTrackTimeStamp);
        LIZIZ(interactStickerStruct, linkedList);
        return interactStickerStruct;
    }
}
