package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0gqy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1181580gqy extends BaseComponentData implements Serializable {
    public boolean LL;

    public C1181580gqy() {
        this(false);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public final boolean isShown() {
        return this.LL;
    }

    public C1181580gqy(boolean z) {
        this.LL = z;
    }

    public final void setShown(boolean z) {
        this.LL = z;
    }
}
