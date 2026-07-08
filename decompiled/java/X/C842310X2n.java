package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.CookieManager;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0X2n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842310X2n extends CookieManager {
    public final InterfaceC842320X2o LIZ;
    public final InterfaceC842330X2p LIZIZ;

    public C842310X2n(C842370X2t c842370X2t) {
        C842350X2r c842350X2r = InterfaceC842330X2p.LIZ;
        this.LIZ = c842370X2t;
        this.LIZIZ = c842350X2r;
    }

    public final void LIZ(URI uri, List<String> list) {
        if (uri != null && list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                if (!C2093608Ic.LJ(str)) {
                    try {
                        arrayList.addAll(C842390X2v.LIZJ(str));
                    } catch (IllegalArgumentException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            LIZIZ(uri, arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }

    public final void LIZIZ(URI uri, List<C842390X2v> list) {
        String strSubstring;
        String lowerCase;
        if (C0IKQ.LIZ(list)) {
            return;
        }
        for (C842390X2v c842390X2v : (ArrayList) list) {
            if (TextUtils.isEmpty(c842390X2v.LLILZ)) {
                String host = uri.getHost();
                if (host == null) {
                    lowerCase = null;
                } else {
                    lowerCase = host.toLowerCase(Locale.US);
                }
                c842390X2v.LLILZ = lowerCase;
            }
            if (TextUtils.isEmpty(c842390X2v.LLIZ)) {
                String path = uri.getPath();
                if (TextUtils.isEmpty(path)) {
                    strSubstring = "/";
                } else {
                    strSubstring = path.substring(0, path.lastIndexOf(47) + 1);
                }
                c842390X2v.LLIZ = strSubstring;
            }
            if ("".equals(c842390X2v.LLIZLLLIL)) {
                c842390X2v.LLIZLLLIL = Integer.toString(C842380X2u.getEffectivePort(uri.getScheme(), uri.getPort()));
            } else if (c842390X2v.LLIZLLLIL == null || C842390X2v.LIZLLL(c842390X2v, uri)) {
            }
            if (this.LIZIZ.LIZ(c842390X2v, uri)) {
                this.LIZ.LIZ(c842390X2v, uri);
            }
        }
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        int i;
        if (uri != null && map != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C842390X2v> it2 = this.LIZ.get(uri).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                C842390X2v next = it2.next();
                Set<String> set = C842390X2v.LLJILJILJ;
                String path = uri.getPath();
                String strLIZIZ = "/";
                if (path == null) {
                    path = "/";
                } else if (!path.endsWith("/")) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(path);
                    sbLIZ.append("/");
                    path = C2188811AlT.LIZIZ(sbLIZ);
                }
                String str = next.LLIZ;
                if (str != null) {
                    if (str.endsWith("/")) {
                        strLIZIZ = str;
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append(str);
                        sbLIZ2.append("/");
                        strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    }
                }
                if (path.startsWith(strLIZIZ) && (!next.LLJ || "https".equalsIgnoreCase(uri.getScheme()))) {
                    if (C842390X2v.LIZLLL(next, uri)) {
                        arrayList.add(next);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return Collections.emptyMap();
            }
            StringBuilder sb = new StringBuilder();
            Iterator it3 = arrayList.iterator();
            int iMin = 1;
            while (it3.hasNext()) {
                iMin = Math.min(iMin, ((C842390X2v) it3.next()).LLJILJIL);
            }
            if (iMin == 1) {
                sb.append("$Version=\"1\"; ");
            }
            sb.append(((C842390X2v) ListProtector.get(arrayList, 0)).toString());
            for (i = 1; i < arrayList.size(); i++) {
                sb.append("; ");
                sb.append(((C842390X2v) ListProtector.get(arrayList, i)).toString());
            }
            return Collections.singletonMap("Cookie", Collections.singletonList(sb.toString()));
        }
        throw new IllegalArgumentException();
    }

    @Override // java.net.CookieManager, java.net.CookieHandler
    public final void put(URI uri, Map<String, List<String>> map) {
        if (uri != null && map != null) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                String key = entry.getKey();
                if (key != null && (key.equalsIgnoreCase("Set-cookie") || key.equalsIgnoreCase("Set-cookie2"))) {
                    Iterator<String> it2 = entry.getValue().iterator();
                    while (it2.hasNext()) {
                        try {
                            Iterator it3 = ((ArrayList) C842390X2v.LIZJ(it2.next())).iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next());
                            }
                        } catch (IllegalArgumentException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                }
            }
            LIZIZ(uri, arrayList);
            return;
        }
        throw new IllegalArgumentException();
    }
}
