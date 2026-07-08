package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0C5W, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C5W {
    public static final C0C5W LIZIZ = new C0C5W();
    public volatile C307960C5i LIZ;

    public void onEvent(C307890C5b c307890C5b) {
        try {
            C307960C5i c307960C5i = this.LIZ;
            if (c307960C5i != null && c307960C5i.LIZ.LIZIZ != null) {
                c307960C5i.LIZ.LIZIZ.onEvent();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
