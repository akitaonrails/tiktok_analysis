package X;

import android.os.Bundle;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.HttpDns;
import java.util.List;

/* JADX INFO: renamed from: X.0oyl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493930oyl {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final List<String> LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final WeakHandler LJFF;

    public final void LIZ(Message message) {
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("dnsrecord_host", this.LIZ, bundle);
        message.setData(bundle);
    }

    public C1493930oyl(String str, long j, List<String> list, List<String> list2, int i) {
        this.LIZ = str;
        this.LJ = j;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = i;
        HttpDns.LJ().getClass();
        this.LJFF = new WeakHandler(C786410Ut5.W2(HttpDns.LLJJJ), HttpDns.LJ());
    }
}
