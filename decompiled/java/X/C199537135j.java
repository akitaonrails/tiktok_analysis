package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.135j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C199537135j extends C199536135i {
    public static final C135Z LLJI = new C135Z("=&-_.!~*'()@:$,;/?:", false);
    public final String LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final int LLILZLL;
    public List<String> LLIZ;
    public final String LLIZLLLIL;
    public final boolean LLJ;

    public C199537135j() {
        this.LLILZLL = -1;
    }

    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        StringBuilder sb = new StringBuilder();
        String str = this.LLILLL;
        str.getClass();
        sb.append(str);
        sb.append("://");
        String strLIZ = this.LLILZIL;
        if (strLIZ != null) {
            if (!this.LLJ) {
                strLIZ = C199546135s.LIZIZ.LIZ(strLIZ);
            }
            sb.append(strLIZ);
            sb.append('@');
        }
        String str2 = this.LLILZ;
        str2.getClass();
        sb.append(str2);
        int i = this.LLILZLL;
        if (i != -1) {
            sb.append(':');
            sb.append(i);
        }
        sbLIZ.append(sb.toString());
        StringBuilder sb2 = new StringBuilder();
        List<String> list = this.LLIZ;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String strLIZ2 = (String) ListProtector.get(this.LLIZ, i2);
                if (i2 != 0) {
                    sb2.append('/');
                }
                if (strLIZ2.length() != 0) {
                    if (!this.LLJ) {
                        strLIZ2 = C199546135s.LIZ.LIZ(strLIZ2);
                    }
                    sb2.append(strLIZ2);
                }
            }
        }
        C199538135k c199538135k = new C199538135k(this);
        boolean z = this.LLJ;
        Iterator<Map.Entry<String, Object>> it2 = c199538135k.iterator();
        boolean zLIZJ = true;
        while (true) {
            C199542135o c199542135o = (C199542135o) it2;
            if (!c199542135o.hasNext()) {
                break;
            }
            Map.Entry<String, Object> next = c199542135o.next();
            Object value = next.getValue();
            if (value != null) {
                String key = z ? next.getKey() : C199546135s.LIZJ.LIZ(next.getKey());
                if (value instanceof Collection) {
                    Iterator it3 = ((Collection) value).iterator();
                    while (it3.hasNext()) {
                        zLIZJ = LIZJ(zLIZJ, sb2, key, it3.next(), z);
                    }
                } else {
                    zLIZJ = LIZJ(zLIZJ, sb2, key, value, z);
                }
            }
        }
        String strLIZ3 = this.LLIZLLLIL;
        if (strLIZ3 != null) {
            sb2.append('#');
            if (!this.LLJ) {
                strLIZ3 = LLJI.LIZ(strLIZ3);
            }
            sb2.append(strLIZ3);
        }
        sbLIZ.append(sb2.toString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C199536135i, java.util.AbstractMap
    /* JADX INFO: renamed from: LJ, reason: merged with bridge method [inline-methods] */
    public final C199537135j clone() {
        C199537135j c199537135j = (C199537135j) super.clone();
        if (this.LLIZ != null) {
            c199537135j.LLIZ = new ArrayList(this.LLIZ);
        }
        return c199537135j;
    }

    @Override // X.C199536135i, java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return LIZLLL().hashCode();
    }

    @Override // X.C199536135i, java.util.AbstractMap
    public final String toString() {
        return LIZLLL();
    }

    public C199537135j(int i) throws Throwable {
        ArrayList arrayList;
        String strLIZ;
        boolean z;
        String strSubstring;
        String strDecode;
        try {
            URL url = new URL("https://oauth2.googleapis.com/token");
            String protocol = url.getProtocol();
            String host = url.getHost();
            int port = url.getPort();
            String path = url.getPath();
            String ref = url.getRef();
            String query = url.getQuery();
            String userInfo = url.getUserInfo();
            this.LLILZLL = -1;
            this.LLILLL = protocol.toLowerCase(Locale.US);
            this.LLILZ = host;
            this.LLILZLL = port;
            if (path != null && path.length() != 0) {
                arrayList = new ArrayList();
                int i2 = 0;
                do {
                    int iIndexOf = path.indexOf(47, i2);
                    if (iIndexOf != -1) {
                        z = true;
                        strSubstring = path.substring(i2, iIndexOf);
                    } else {
                        z = false;
                        strSubstring = path.substring(i2);
                    }
                    C135Z c135z = C199546135s.LIZ;
                    if (strSubstring == null) {
                        strDecode = null;
                    } else {
                        try {
                            strDecode = URLDecoder.decode(strSubstring.replace("+", "%2B"), StandardCharsets.UTF_8.name());
                        } catch (UnsupportedEncodingException e) {
                            TryCatchGuardChecker.doCheck(e);
                            throw new RuntimeException(e);
                        }
                    }
                    arrayList.add(strDecode);
                    i2 = iIndexOf + 1;
                } while (z);
            } else {
                arrayList = null;
            }
            this.LLIZ = arrayList;
            this.LLJ = false;
            if (ref != null) {
                strLIZ = C199546135s.LIZ(ref);
            } else {
                strLIZ = null;
            }
            this.LLIZLLLIL = strLIZ;
            if (query != null) {
                int i3 = C199532135e.LIZ;
                try {
                    C199532135e.LIZ(new StringReader(query), this, true);
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C08KI.LIZIZ(e2);
                    throw new RuntimeException(e2);
                }
            }
            this.LLILZIL = userInfo != null ? C199546135s.LIZ(userInfo) : null;
        } catch (MalformedURLException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw new IllegalArgumentException(e3);
        }
    }

    @Override // X.C199536135i, java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (super.equals(obj) && (obj instanceof C199537135j)) {
            return LIZLLL().equals(((C199537135j) obj).LIZLLL());
        }
        return false;
    }

    @Override // X.C199536135i
    public final void LIZIZ(Object obj, String str) {
        super.LIZIZ(obj, str);
    }

    public static boolean LIZJ(boolean z, StringBuilder sb, String str, Object obj, boolean z2) {
        String strLIZ;
        if (z) {
            sb.append('?');
            z = false;
        } else {
            sb.append('&');
        }
        sb.append(str);
        if (z2) {
            strLIZ = obj.toString();
        } else {
            strLIZ = C199546135s.LIZJ.LIZ(obj.toString());
        }
        if (strLIZ.length() != 0) {
            sb.append('=');
            sb.append(strLIZ);
        }
        return z;
    }
}
