package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationPrefetchEndEvent;
import com.ss.android.ugc.aweme.cla.et.newet.ClaPerfTranslationPrefetchStartEvent;

/* JADX INFO: renamed from: X.016w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2808016w implements InterfaceC1389740mGi {
    public final long LIZ = SystemClock.elapsedRealtime();
    public final C017C LIZIZ;

    public C2808016w(C00I7 c00i7, String str, String str2, String str3) {
        C017C c017c = new C017C();
        c017c.LIZIZ(c00i7);
        this.LIZIZ = c017c;
        c017c.LIZIZ(new AnonymousClass0074(str3, str, str2));
        C207069161b.LJ(ClaPerfTranslationPrefetchStartEvent.class, c017c, new AnonymousClass0174(), null, 24);
    }

    @Override // X.InterfaceC1389740mGi
    public final void LIZ(boolean z, Integer num, String str, String str2, Integer num2, Integer num3) {
        String str3;
        if (z) {
            str3 = "success";
        } else {
            str3 = "fail";
        }
        this.LIZIZ.LIZIZ(new C013V(Integer.valueOf((int) (SystemClock.elapsedRealtime() - this.LIZ)), str3, str, num, num2, num3, str2));
        C207069161b.LJ(ClaPerfTranslationPrefetchEndEvent.class, this.LIZIZ, new AnonymousClass0174(), null, 24);
    }
}
