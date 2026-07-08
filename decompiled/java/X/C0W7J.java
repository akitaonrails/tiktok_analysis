package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creation.sender.MediaMsgSendManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0W7J, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7J extends C09AY implements Function0<Boolean> {
    public C0W7J() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() throws Throwable {
        MediaMsgSendManager.LIZ.getClass();
        boolean zLJJIIJZLJL = false;
        try {
            String strLIZ = C2105708Mt.LIZ("ro.miui.ui.version.name");
            int length = strLIZ.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.LJI(strLIZ.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String string = strLIZ.subSequence(i, length + 1).toString();
            if (string != null) {
                if (!(string.length() == 0)) {
                    zLJJIIJZLJL = u.LJJIIJZLJL(string.substring(1), "12", false);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return Boolean.valueOf(zLJJIIJZLJL);
    }
}
