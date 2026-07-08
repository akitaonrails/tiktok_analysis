package X;

import com.ss.android.ugc.tools.utils.KeyboardUtils;

/* JADX INFO: renamed from: X.11BV, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BV {
    public static final void LIZ(C391430FWj c391430FWj) {
        if (c391430FWj == null) {
            return;
        }
        c391430FWj.setFocusable(true);
        c391430FWj.setFocusableInTouchMode(true);
        c391430FWj.requestFocus();
        KeyboardUtils.LIZJ(c391430FWj.getContext(), c391430FWj);
        c391430FWj.setSelection(C2204961BRm.LLJILLL(c391430FWj, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkiEQrAYo38If7d/GKSUTCht9H7NAc+XTKPCt1xZJ11DpWxXUhcUU0cvA16D0BU1H7J/H", null)).length());
    }
}
