package X;

import com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.event.SearchAdEventLogger;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0cQD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1011230cQD implements InterfaceC1007690cKV {
    public int LIZIZ;
    public int LIZJ;
    public final Map<Integer, C1007710cKX> LIZ = Collections.synchronizedMap(new HashMap());
    public final SearchAdEventLogger LIZLLL = new SearchAdEventLogger();

    @Override // X.InterfaceC1007690cKV
    public final int LJLJJL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1007690cKV
    public final int getImageCount() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1007690cKV
    public final C1007710cKX LJLJJLL(int i) {
        return this.LIZ.get(Integer.valueOf(i));
    }
}
