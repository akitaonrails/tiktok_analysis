package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.crash.Npth;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0RIq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693620RIq {
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x005d: INVOKE (r1 I:java.lang.Object) = (r4 I:android.view.View), (r3 I:int) VIRTUAL call: android.view.View.getTag(int):java.lang.Object A[MD:(int):java.lang.Object (c)] (LINE:67108957), block:B:24:0x0058 */
    /* JADX WARN: Type inference failed for: r4v0, types: [android.view.View] */
    public static final void LIZ(int i, boolean z, View view, ViewGroup viewGroup) {
        ?? tag;
        String str;
        String str2 = null;
        try {
            if (!C693570RIl.LIZ() && C07HF.LIZ() && z) {
                C426750GoL.LJIIIZ(view, null, null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))), null, false, 27);
            }
            if (view.getParent() != null || view.isAttachedToWindow()) {
                String str3 = C0RPZ.LJIIJJI;
                Object tag2 = view.getTag(R.id.eln);
                if (tag2 instanceof String) {
                    str = (String) tag2;
                } else {
                    str = null;
                }
                Npth.addTag("feed_invalid_attached_component", str);
            }
            if (i >= 0) {
                viewGroup.addView(view, i);
            } else {
                viewGroup.addView(view);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String str4 = C0RPZ.LJIIJJI;
            Object tag3 = tag.getTag(R.id.eln);
            if (tag3 instanceof String) {
                str2 = (String) tag3;
            }
            Npth.addTag("feed_error_attached_component", str2);
        }
    }
}
