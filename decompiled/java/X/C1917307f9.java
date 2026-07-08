package X;

import android.util.LruCache;
import com.bytedance.hybrid.spark.roma.deploy.model.SparkAppModel;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.07f9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1917307f9 implements Iterable, C03W4 {
    public final Keva LL = Keva.getRepo("spark_apps");
    public final Gson LLILLJJLI = new Gson();
    public final LruCache<String, SparkAppModel> LLILLL = new LruCache<>(10);

    @Override // java.lang.Iterable
    public final Iterator<Pair<String, SparkAppModel>> iterator() {
        Set<String> allKey = this.LL.getAllKey();
        ArrayList arrayList = new ArrayList();
        for (String str : allKey) {
            SparkAppModel sparkAppModelLIZJ = LIZJ(str);
            if (sparkAppModelLIZJ != null) {
                arrayList.add(new Pair(str, sparkAppModelLIZJ));
            }
        }
        return arrayList.iterator();
    }

    public final SparkAppModel LIZJ(String str) {
        Object c098200Yq;
        String string = this.LL.getString(str, "");
        Object obj = null;
        if (string == null) {
            return null;
        }
        try {
            c098200Yq = (SparkAppModel) this.LLILLJJLI.LJII(string, SparkAppModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (SparkAppModel) obj;
    }
}
