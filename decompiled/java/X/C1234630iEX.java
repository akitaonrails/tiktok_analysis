package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;

/* JADX INFO: renamed from: X.0iEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234630iEX {
    public final BaseListFragmentPanel LIZ;
    public final String LIZIZ;
    public Aweme LIZJ;
    public AnonymousClass0956 LIZLLL;
    public AnonymousClass0957<? extends C189200o6<? extends Aweme>> LJ;

    public final void LIZ() {
        Aweme aweme = this.LIZJ;
        if (aweme != null) {
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "insert aweme by reuse cache");
            new C1234490iEJ(this.LIZ, aweme, null).LIZ();
            return;
        }
        AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957 = this.LJ;
        if (anonymousClass0957 != null) {
            this.LJ = null;
            this.LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1234620iEW(anonymousClass0957, this, null), 2);
        }
    }

    public C1234630iEX(BaseListFragmentPanel baseListFragmentPanel, String str) {
        this.LIZ = baseListFragmentPanel;
        this.LIZIZ = str;
    }
}
