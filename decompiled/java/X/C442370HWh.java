package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HWh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC1294060jmO
public final class C442370HWh {
    public C442370HWh(C0SRL c0srl) {
        long jLongValue;
        View viewLIZIZ = C21146717pB.LIZIZ(c0srl.LIZLLL(), R.layout.ea4, null, false);
        ViewGroup viewGroupLJIIIIZZ = c0srl.LJIIIIZZ();
        if (viewGroupLJIIIIZZ != null) {
            viewGroupLJIIIIZZ.addView(viewLIZIZ);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLIZIZ.findViewById(R.id.rlh);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            Aweme aweme = c0srl.LIZJ;
            Long lValueOf = aweme != null ? Long.valueOf(aweme.getCreateTime()) : null;
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue() * 1000;
            } else {
                jLongValue = 0;
            }
            tuxTextView.setText(C2215101Bmm.LJFF(jLongValue));
            tuxTextView.setGravity(8388611);
        }
    }
}
