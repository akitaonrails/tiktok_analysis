package X;

import com.ss.android.ugc.aweme.app.api.RequestLog;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.io.Serializable;

/* JADX INFO: renamed from: X.0gpH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1180530gpH extends BaseComponentData implements Serializable {
    public final transient String LL;
    public final transient String LLILLJJLI;

    public C1180530gpH() {
        this(null, null);
    }

    @Override // com.ss.android.ugc.aweme.slash.component.BaseComponentData, X.InterfaceC1201180hMa
    public /* bridge */ /* synthetic */ RequestLog getRequestLog() {
        return C1201190hMb.LIZ(this);
    }

    public String getBusinessData() {
        return this.LLILLJJLI;
    }

    public String getUrl() {
        return this.LL;
    }

    public C1180530gpH(String str, String str2) {
        this.LL = str;
        this.LLILLJJLI = str2;
    }
}
