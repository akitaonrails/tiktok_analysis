package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MissionTextStruct;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Ovq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635240Ovq {
    public static final void LIZ(TuxTextView tuxTextView, MissionTextStruct missionTextStruct) {
        if (missionTextStruct == null || tuxTextView == null) {
            return;
        }
        tuxTextView.setText(missionTextStruct.text);
        if (!a0.LJJJIL(missionTextStruct.color)) {
            C01GW c01gw = C2248361CzK.LIZ;
            Integer numLJ = C2248361CzK.LJ(tuxTextView.getContext(), missionTextStruct.color);
            if (numLJ != null) {
                tuxTextView.setTextColor(numLJ.intValue());
            }
        }
        if (!a0.LJJJIL(missionTextStruct.font)) {
            C01GW c01gw2 = C2248361CzK.LIZ;
            Integer numLIZIZ = C2248361CzK.LIZIZ(missionTextStruct.font);
            if (numLIZIZ != null) {
                tuxTextView.setTuxFont(numLIZIZ.intValue());
            }
        }
    }

    public static final void LIZIZ(TuxTextView tuxTextView, MissionTextStruct missionTextStruct) {
        if (missionTextStruct == null) {
            C0DTR.LIZIZ(tuxTextView);
        } else if (a0.LJJJIL(missionTextStruct.text)) {
            C0DTR.LIZIZ(tuxTextView);
        } else {
            C12ES.LJIILL(0, tuxTextView);
            LIZ(tuxTextView, missionTextStruct);
        }
    }
}
