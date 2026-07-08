package X;

import androidx.lifecycle.Lifecycle;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxyHost;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.11Dp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19465511Dp {
    public static final /* synthetic */ int LJ = 0;
    public final Lifecycle LIZ;
    public C19464911Dj LIZIZ;
    public C19464811Di LIZJ;
    public final CopyOnWriteArraySet<Object> LIZLLL;

    public final void LIZ(JediViewHolderProxy jediViewHolderProxy) {
        this.LIZ.removeObserver(jediViewHolderProxy);
        int i = C0JAL.LIZ[this.LIZ.getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i == 4 || i == 5) {
                    jediViewHolderProxy.onStop();
                    jediViewHolderProxy.onDestroy();
                }
            } else {
                jediViewHolderProxy.onDestroy();
            }
        } else if (!jediViewHolderProxy.LLILZIL) {
            jediViewHolderProxy.onDestroy();
        }
        this.LIZLLL.remove(jediViewHolderProxy);
    }

    public C19465511Dp(Lifecycle lifecycle, JediViewHolderProxyHost jediViewHolderProxyHost) {
        this.LIZ = lifecycle;
        jediViewHolderProxyHost.LLILLL.add(new AwS573S0100000_29(this, 1044));
        this.LIZLLL = new CopyOnWriteArraySet<>();
    }
}
