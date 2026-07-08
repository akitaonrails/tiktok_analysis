package X;

import com.bytedance.hybrid.spark.schema.SchemaBundle;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import java.util.Collection;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07iP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1937507iP extends AbstractC1938007iU {
    public final Object LJFF;

    @Override // X.AbstractC1938007iU
    public final boolean LIZJ(SchemaBundle schemaBundle) {
        Object obj = this.LJFF;
        if (obj instanceof String) {
            String path = schemaBundle.getPath();
            if (path != null && a0.LJJIIZI(path, (CharSequence) this.LJFF, false)) {
                return true;
            }
            return false;
        }
        if (obj instanceof h) {
            Iterable<k> iterable = (Iterable) obj;
            if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                return false;
            }
            for (k kVar : iterable) {
                String path2 = schemaBundle.getPath();
                if (path2 != null && a0.LJJIIZI(path2, kVar.LJIL(), false)) {
                    return true;
                }
            }
            return false;
        }
        throw new C1937907iT("unexpected path param");
    }

    public C1937507iP(h hVar, n nVar, int i) {
        Object c098200Yq;
        super(hVar, nVar, i);
        k kVarLJJIIZ = nVar.LJJIIZ("path");
        try {
            c098200Yq = kVarLJJIIZ.LJIIL();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        this.LJFF = (C189200o6.m7isFailureimpl(c098200Yq) || c098200Yq == null) ? kVarLJJIIZ.LJIL() : c098200Yq;
    }
}
