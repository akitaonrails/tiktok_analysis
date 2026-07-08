package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.effect.EffectPointModel;
import dmt.av.video.ReplayLiveData;
import java.util.List;

/* JADX INFO: renamed from: X.0EYL, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EYL {
    public static void LIZ(List list, ReplayLiveData replayLiveData, C0EYO c0eyo, Boolean bool, boolean z) {
        int uiStartPoint;
        int uiEndPoint;
        for (int i = 0; i < list.size(); i++) {
            EffectPointModel effectPointModel = (EffectPointModel) ListProtector.get(list, i);
            if (effectPointModel.getType() != 2) {
                String resDir = effectPointModel.getResDir();
                if (bool.booleanValue()) {
                    uiStartPoint = effectPointModel.getStartPoint();
                } else {
                    uiStartPoint = effectPointModel.getUiStartPoint();
                }
                C0EYM c0eymLIZIZ = C0EYM.LIZIZ(uiStartPoint, resDir);
                c0eymLIZIZ.LJ = effectPointModel.getUiStartPoint();
                c0eymLIZIZ.LJFF = effectPointModel.getUiEndPoint();
                c0eymLIZIZ.LJIIIIZZ = effectPointModel.getSelectedColor();
                c0eymLIZIZ.LJIILIIL = effectPointModel.getKey();
                c0eymLIZIZ.LJIILL = effectPointModel.getName();
                c0eymLIZIZ.LJII = effectPointModel.isFromEnd();
                c0eymLIZIZ.LJIIZILJ = effectPointModel.getCategory();
                c0eymLIZIZ.LJIIJ = effectPointModel.getSelectFrom();
                c0eymLIZIZ.LJIIJJI = effectPointModel.getEntrancePoint();
                c0eymLIZIZ.LJIIIZ = effectPointModel.getIndex();
                c0eymLIZIZ.LJIILLIIL = effectPointModel.getDuration();
                c0eymLIZIZ.LJIJ = effectPointModel.getExtra();
                c0eymLIZIZ.LIZIZ = new String[]{effectPointModel.getUuid()};
                c0eymLIZIZ.LJIJJLI = z;
                c0eymLIZIZ.LJIJI = effectPointModel.getAdjustParams();
                c0eymLIZIZ.LJIJJ = effectPointModel.getIsNewEngineEffect();
                if (replayLiveData != null) {
                    replayLiveData.setValue(c0eymLIZIZ);
                }
                if (c0eyo != null) {
                    c0eyo.LIZ(c0eymLIZIZ);
                }
                if (bool.booleanValue()) {
                    uiEndPoint = effectPointModel.getEndPoint();
                } else {
                    uiEndPoint = effectPointModel.getUiEndPoint();
                }
                C0EYM c0eymLIZJ = C0EYM.LIZJ(uiEndPoint);
                c0eymLIZJ.LJ = effectPointModel.getUiStartPoint();
                c0eymLIZJ.LJFF = effectPointModel.getUiEndPoint();
                c0eymLIZJ.LJII = effectPointModel.isFromEnd();
                c0eymLIZJ.LIZIZ = new String[]{effectPointModel.getUuid()};
                c0eymLIZJ.LJIJJLI = z;
                c0eymLIZJ.LJIJJ = effectPointModel.getIsNewEngineEffect();
                if (replayLiveData != null) {
                    replayLiveData.setValue(c0eymLIZJ);
                }
                if (c0eyo != null) {
                    c0eyo.LIZ(c0eymLIZJ);
                }
            }
        }
    }
}
