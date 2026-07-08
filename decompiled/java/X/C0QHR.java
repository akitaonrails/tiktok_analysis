package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;

/* JADX INFO: renamed from: X.0QHR, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QHR implements InterfaceC1600790rl7 {
    public static final C0QHR LIZ = new C0QHR();

    @Override // X.InterfaceC1600790rl7
    public final C0PI6 LJJII() {
        throw null;
    }

    @Override // X.InterfaceC1600790rl7
    public final boolean LJIILL(Aweme aweme) {
        if ((aweme == null || !AwemeBizExtKt.isSubAweme(aweme)) && !C656640PpG.LIZ.LJFF(aweme)) {
            return false;
        }
        return true;
    }
}
