package X;

import android.view.View;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0Rzg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C714060Rzg implements IEvent {
    public final boolean LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public WeakReference<View> LJFF;

    public C714060Rzg(int i, String str) {
        this(false, i, "", str);
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public /* synthetic */ C714060Rzg(boolean z, int i, String str, String str2) {
        this(z, i, str, str2, "");
    }

    public C714060Rzg(boolean z, int i, String str, String str2, String str3) {
        this.LIZ = z;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = str3;
    }
}
