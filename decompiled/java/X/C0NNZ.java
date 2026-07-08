package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabPreloadTTLSetting;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNZ implements C0H62 {
    public static long LLILLJJLI;
    public static final C0NNZ LL = new C0NNZ();
    public static String LLILLL = "";

    public static final void LIZ(C19EG c19eg, String str) {
        C036E.LIZ.LIZ(LL);
        if (!Intrinsics.LJFF(str, LLILLL)) {
            LLILLL = str;
            return;
        }
        if (System.currentTimeMillis() < LLILLJJLI) {
            return;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
        c1389890mGx.LJIIIZ(2131829444);
        c1389890mGx.LJIIJJI();
        C0NNY.LIZ(2131829444);
        LLILLJJLI = System.currentTimeMillis() + ((long) 3600000);
    }

    @Override // X.C0H62
    public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
        LLILLJJLI = (LLILLJJLI - ((long) 3600000)) + ((long) FriendsTabPreloadTTLSetting.DEFAULT);
    }
}
