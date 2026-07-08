package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.018F, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C018F {
    public final List<String> LIZ;
    public final List<String> LIZIZ;

    public static C018F LIZ(Uri uri) {
        List listLJJLIIIJ;
        List<String> pathSegments;
        String host;
        if (uri == null || (host = uri.getHost()) == null || (listLJJLIIIJ = a0.LJJLIIIJ(host, new char[]{'.'}, false, 0, 6)) == null) {
            listLJJLIIIJ = C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJ) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        arrayList.add("/");
        if (uri == null || (pathSegments = uri.getPathSegments()) == null) {
            pathSegments = C13BV.INSTANCE;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator<String> it2 = pathSegments.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJ2 = a0.LJJLIIIJ(it2.next(), new char[]{'.'}, false, 0, 6);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : listLJJLIIIJ2) {
                if (((String) obj2).length() > 0) {
                    arrayList3.add(obj2);
                }
            }
            C19719612Di.LJJI(arrayList3, arrayList2);
        }
        arrayList.addAll(arrayList2);
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames.isEmpty()) {
            return new C018F(arrayList, null);
        }
        return new C018F(arrayList, new ArrayList(queryParameterNames));
    }

    public C018F(List<String> list, List<String> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
