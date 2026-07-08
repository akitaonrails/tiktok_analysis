package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBizExtKt;
import com.ss.android.ugc.aweme.feed.panel.BaseListFragmentPanel;
import com.ss.android.ugc.aweme.profile.model.User;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0iET, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234590iET {
    public final BaseListFragmentPanel LIZ;
    public final String LIZIZ;
    public final WeakReference<Context> LIZJ;
    public boolean LIZLLL = true;
    public Aweme LJ;
    public AnonymousClass0956 LJFF;
    public AnonymousClass0957<? extends C189200o6<? extends Aweme>> LJI;

    public final void LIZ(User user) {
        Aweme aweme = this.LJ;
        if (aweme != null) {
            C2276471E8n.LIZIZ.LIZIZ("recommend_feed", "@LinkRelation_Video", "insert aweme by reuse cache");
            if (user != null) {
                AwemeBizExtKt.setSharer(aweme, user);
            }
            new C1234490iEJ(this.LIZ, aweme, null).LIZ();
            return;
        }
        if (C0BY3.LIZ()) {
            AnonymousClass0957<? extends C189200o6<? extends Aweme>> anonymousClass0957 = this.LJI;
            if (anonymousClass0957 != null) {
                this.LJI = null;
                this.LJFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1234580iES(anonymousClass0957, this, user, null), 2);
                return;
            }
            return;
        }
        this.LJFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LIZ), C0PEM.LIZJ, null, new C1234570iER(this, user, null), 2);
    }

    public C1234590iET(BaseListFragmentPanel baseListFragmentPanel, String str) {
        this.LIZ = baseListFragmentPanel;
        this.LIZIZ = str;
        this.LIZJ = new WeakReference<>(baseListFragmentPanel.getContext());
    }
}
