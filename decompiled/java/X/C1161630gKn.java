package X;

import com.bytedance.hybrid.spark.raven.data.Node;
import com.bytedance.hybrid.spark.raven.data.PageInfo;
import com.bytedance.hybrid.spark.raven.data.RavenPage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.showcase.mix.view.StoreMixTabFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gKn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161630gKn extends AbstractC1161490gKZ implements InterfaceC1160790gJR {
    public final LinkedHashMap<String, Long> LLILLJJLI = new LinkedHashMap<>();
    public final Map<String, Object> LLILLL = new LinkedHashMap();
    public final Object LLILZ = new Object();
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final /* synthetic */ StoreMixTabFragment LLIZ;

    @Override // X.InterfaceC1160790gJR
    public final void LIZJ(C1161040gJq c1161040gJq, boolean z) {
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIZ(C1160990gJl c1160990gJl, String str) {
    }

    @Override // X.InterfaceC1160790gJR
    public final C1161000gJm LJIIJ(C1161000gJm c1161000gJm) {
        return c1161000gJm;
    }

    @Override // X.InterfaceC1160790gJR
    public final void onSuccess() {
        LJIIJJI(System.currentTimeMillis(), "data_process_success", C2097608Jq.LJ());
    }

    public C1161630gKn(StoreMixTabFragment storeMixTabFragment) {
        this.LLIZ = storeMixTabFragment;
    }

    @Override // X.InterfaceC1160790gJR
    public final void LIZLLL(C1161040gJq c1161040gJq) {
        int size;
        List<C1161140gK0> listLIZ;
        List<C1161140gK0> listLIZIZ;
        Pair[] pairArr = new Pair[2];
        int size2 = 0;
        if (c1161040gJq != null && (listLIZIZ = c1161040gJq.LIZIZ()) != null) {
            size = listLIZIZ.size();
        } else {
            size = 0;
        }
        pairArr[0] = new Pair("body_component_count", Integer.valueOf(size));
        if (c1161040gJq != null && (listLIZ = c1161040gJq.LIZ()) != null) {
            size2 = listLIZ.size();
        }
        pairArr[1] = new Pair("all_component_count", Integer.valueOf(size2));
        LJIIJJI(System.currentTimeMillis(), "parse_transform_complete", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJ(C1161000gJm c1161000gJm) {
        LJIIJJI(System.currentTimeMillis(), "parse_start", C2097608Jq.LJ());
    }

    @Override // X.InterfaceC1160790gJR
    public final void LJIIIIZZ(C1161000gJm c1161000gJm) {
        int iIntValue;
        int size;
        RavenPage ravenPage;
        Map<String, List<String>> layout;
        RavenPage ravenPage2;
        Map<String, Node> nodes;
        RavenPage ravenPage3;
        PageInfo pageInfo;
        Integer num;
        Pair[] pairArr = new Pair[3];
        if (c1161000gJm != null && (ravenPage3 = c1161000gJm.LIZ) != null && (pageInfo = ravenPage3.getPageInfo()) != null && (num = pageInfo.responseType) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        int size2 = 0;
        pairArr[0] = new Pair("response_type", Integer.valueOf(iIntValue));
        if (c1161000gJm != null && (ravenPage2 = c1161000gJm.LIZ) != null && (nodes = ravenPage2.getNodes()) != null) {
            size = nodes.size();
        } else {
            size = 0;
        }
        pairArr[1] = new Pair("node_count", Integer.valueOf(size));
        if (c1161000gJm != null && (ravenPage = c1161000gJm.LIZ) != null && (layout = ravenPage.getLayout()) != null) {
            size2 = layout.size();
        }
        pairArr[2] = new Pair("layout_count", Integer.valueOf(size2));
        LJIIJJI(System.currentTimeMillis(), "response_received", C2097608Jq.LJIIIIZZ(pairArr));
    }

    @Override // X.InterfaceC1160790gJR
    public final void onError(Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = "";
        }
        LJIIJJI(System.currentTimeMillis(), "data_process_error", C2097908Jt.LIZJ(new Pair("error_msg", message)));
    }

    public final void LJIIJJI(long j, String str, Map map) {
        synchronized (this.LLILZ) {
            try {
                if (Intrinsics.LJFF(str, "submit_first_screen_start")) {
                    this.LLILLJJLI.clear();
                    ((LinkedHashMap) this.LLILLL).clear();
                    this.LLILZLL = false;
                    this.LLILZIL = true;
                }
                if (!this.LLILZIL) {
                    return;
                }
                this.LLILLJJLI.put(str, Long.valueOf(j));
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        this.LLILLL.put(str2, value);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILIIL(String str, String str2, String str3, Map map) {
        long jLongValue;
        Long l = this.LLILLJJLI.get(str2);
        Long l2 = this.LLILLJJLI.get(str3);
        if (l != null && l2 != null) {
            jLongValue = l2.longValue() - l.longValue();
        } else {
            jLongValue = -1;
        }
        map.put(str, Long.valueOf(jLongValue));
    }
}
