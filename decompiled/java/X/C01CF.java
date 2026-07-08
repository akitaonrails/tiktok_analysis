package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.TreeSet;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01CF, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01CF {
    public static C01CG LIZ(String str) {
        Object c098200Yq;
        TreeSet treeSet;
        List listLJJLIIIJ;
        try {
            c098200Yq = UriProtector.parse(str);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            return null;
        }
        Uri uri = (Uri) c098200Yq;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(uri.getScheme());
        stringBuffer.append("://");
        stringBuffer.append(uri.getAuthority());
        stringBuffer.append(uri.getPath());
        String string = stringBuffer.toString();
        String query = uri.getQuery();
        if (query != null && (listLJJLIIIJ = a0.LJJLIIIJ(query, new char[]{'&'}, false, 0, 6)) != null) {
            treeSet = new TreeSet(listLJJLIIIJ);
        } else {
            treeSet = new TreeSet();
        }
        return new C01CG(string, treeSet);
    }
}
