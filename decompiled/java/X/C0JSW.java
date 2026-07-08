package X;

import com.bytedance.android.livesdk.hangout.HangoutRandomMatchPanelFragment;

/* JADX INFO: renamed from: X.0JSW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JSW {
    public static HangoutRandomMatchPanelFragment LIZ(String str, int i, int i2) {
        boolean z;
        if ((i2 & 2) != 0) {
            i = 30;
        }
        boolean z2 = false;
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = true;
        }
        HangoutRandomMatchPanelFragment hangoutRandomMatchPanelFragment = new HangoutRandomMatchPanelFragment();
        hangoutRandomMatchPanelFragment.LL = str;
        hangoutRandomMatchPanelFragment.LLILLJJLI = i;
        hangoutRandomMatchPanelFragment.LLILLL = z;
        hangoutRandomMatchPanelFragment.LLILZ = z2;
        return hangoutRandomMatchPanelFragment;
    }
}
