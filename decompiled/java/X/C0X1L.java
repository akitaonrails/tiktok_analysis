package X;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.compliance.api.model.HeaderParamConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import okhttp3.Request;

/* JADX INFO: renamed from: X.0X1L, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1L implements InterfaceC841900X0y, InterfaceC841910X0z, C0X0V {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LIZ(C841880X0w<Request, C0XLY> c841880X0w) {
        return c841880X0w;
    }

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LJI(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        return c841880X0w;
    }

    static {
        new BPEAHandler(Looper.getMainLooper());
    }

    public static void LJII(C0X1N c0x1n) {
        Set<String> set;
        Uri uri;
        Set<String> queryParameterNames;
        HeaderParamConfig headerParamConfigLIZ = C0X1M.LIZ();
        if (headerParamConfigLIZ != null) {
            set = headerParamConfigLIZ.denyKeys;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(c0x1n.LIZJ) && (queryParameterNames = UriProtector.getQueryParameterNames((uri = UriProtector.parse(c0x1n.LIZJ)))) != null && !queryParameterNames.isEmpty()) {
            c0x1n.LJIIIIZZ.addAll(queryParameterNames);
            if (set != null && !set.isEmpty() && !C0X1M.LIZIZ(headerParamConfigLIZ, c0x1n.LIZJ)) {
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                ArrayList<String> arrayList = new ArrayList();
                for (Object obj : queryParameterNames) {
                    if (!set.contains(((String) obj).toLowerCase(Locale.ROOT))) {
                        arrayList.add(obj);
                    }
                }
                for (String str : arrayList) {
                    builderClearQuery.appendQueryParameter(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str));
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : queryParameterNames) {
                    if (set.contains(((String) obj2).toLowerCase(Locale.ROOT))) {
                        arrayList2.add(obj2);
                    }
                }
                if (!arrayList2.isEmpty()) {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        c0x1n.LJIIIZ.add((String) it2.next());
                    }
                    c0x1n.LIZ = true;
                }
                c0x1n.LIZLLL = builderClearQuery.build().toString();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Q, com.bytedance.retrofit2.client.Request] */
    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LIZIZ(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        String url;
        Set<String> set;
        String str;
        com.bytedance.retrofit2.client.Request request = c841880X0w.LIZ;
        String str2 = null;
        if (request != null && (url = request.getUrl()) != null && u.LJJIIJZLJL(url, "http://", false)) {
            HeaderParamConfig headerParamConfigLIZ = C0X1M.LIZ();
            if (headerParamConfigLIZ != null) {
                set = headerParamConfigLIZ.denyKeys;
            } else {
                set = null;
            }
            C0X1N c0x1n = new C0X1N("2", url);
            LJII(c0x1n);
            List<C080U> headers = request.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                Set<String> set2 = c0x1n.LJ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(headers, 10));
                Iterator<C080U> it2 = headers.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                set2.addAll(arrayList);
                if (!C0X1M.LIZIZ(headerParamConfigLIZ, c0x1n.LIZJ)) {
                    ArrayList arrayList2 = new ArrayList();
                    for (C080U c080u : headers) {
                        C080U c080u2 = c080u;
                        if (set == null || !set.contains(c080u2.LIZ.toLowerCase(Locale.ROOT))) {
                            arrayList2.add(c080u);
                        }
                    }
                    Set setLJLLLLLL = C13LP.LJLLLLLL(headers, arrayList2);
                    if (!setLJLLLLLL.isEmpty()) {
                        Iterator it3 = setLJLLLLLL.iterator();
                        while (it3.hasNext()) {
                            c0x1n.LJFF.add(((C080U) it3.next()).LIZ);
                        }
                        c0x1n.LIZ = true;
                    }
                    headers = arrayList2;
                }
                Iterator<C080U> it4 = headers.iterator();
                int i = 0;
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it4.next().LIZ, "Cookie")) {
                        if (i >= 0) {
                            C080U c080u3 = (C080U) ListProtector.get(headers, i);
                            if (c080u3 != null) {
                                str = c080u3.LIZIZ;
                            } else {
                                str = null;
                            }
                            ListProtector.set(headers, i, new C080U(((C080U) ListProtector.get(headers, i)).LIZ, LJ(str, c0x1n)));
                        }
                    } else {
                        i++;
                    }
                }
                Iterator<C080U> it5 = headers.iterator();
                int i2 = 0;
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it5.next().LIZ, "X-SS-Cookie")) {
                        if (i2 >= 0) {
                            C080U c080u4 = (C080U) ListProtector.get(headers, i2);
                            if (c080u4 != null) {
                                str2 = c080u4.LIZIZ;
                            }
                            ListProtector.set(headers, i2, new C080U(((C080U) ListProtector.get(headers, i2)).LIZ, LJ(str2, c0x1n)));
                        }
                    } else {
                        i2++;
                    }
                }
            }
            if (c0x1n.LIZ) {
                C0XMB c0xmbNewBuilder = request.newBuilder();
                String str3 = c0x1n.LIZLLL;
                if (str3 == null) {
                    str3 = c0x1n.LIZJ;
                }
                c0xmbNewBuilder.LIZJ(str3);
                if (headers != null && !headers.isEmpty()) {
                    c0xmbNewBuilder.LIZJ = headers;
                }
                c841880X0w.LIZ = c0xmbNewBuilder.LIZ();
            }
            C0X1M.LIZJ(c0x1n);
        }
        return c841880X0w;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [Q, okhttp3.Request] */
    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LJFF(C841880X0w<Request, C0XLY> c841880X0w) {
        C0XLQ c0xlqUrl;
        String str;
        Set<String> set;
        Set<String> setLJFF;
        Request request = c841880X0w.LIZ;
        C0X1U c0x1uLJI = null;
        if (request != null && (c0xlqUrl = request.url()) != null && (str = c0xlqUrl.LJIIIIZZ) != null && u.LJJIIJZLJL(str, "http://", false)) {
            HeaderParamConfig headerParamConfigLIZ = C0X1M.LIZ();
            if (headerParamConfigLIZ != null) {
                set = headerParamConfigLIZ.denyKeys;
            } else {
                set = null;
            }
            C0X1N c0x1n = new C0X1N("4", str);
            LJII(c0x1n);
            C0X1V c0x1vHeaders = request.headers();
            if (c0x1vHeaders != null) {
                c0x1n.LJ.addAll(c0x1vHeaders.LJFF());
                c0x1uLJI = c0x1vHeaders.LJI();
                if (!C0X1M.LIZIZ(headerParamConfigLIZ, str) && set != null && !set.isEmpty() && (setLJFF = c0x1vHeaders.LJFF()) != null) {
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj : setLJFF) {
                        if (set.contains(((String) obj).toLowerCase(Locale.ROOT))) {
                            arrayList.add(obj);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        for (String str2 : arrayList) {
                            c0x1n.LJFF.add(str2);
                            c0x1uLJI.LIZLLL(str2);
                        }
                        c0x1n.LIZ = true;
                    }
                }
                String strLIZJ = c0x1uLJI.LIZJ("Cookie");
                if (strLIZJ != null && !a0.LJJJIL(strLIZJ)) {
                    c0x1uLJI.LJ("Cookie", LJ(strLIZJ, c0x1n));
                }
                String strLIZJ2 = c0x1uLJI.LIZJ("X-SS-Cookie");
                if (strLIZJ2 != null && !a0.LJJJIL(strLIZJ2)) {
                    c0x1uLJI.LJ("X-SS-Cookie", LJ(strLIZJ2, c0x1n));
                }
            }
            if (c0x1n.LIZ) {
                C0X33 c0x33NewBuilder = request.newBuilder();
                String str3 = c0x1n.LIZLLL;
                if (str3 != null) {
                    str = str3;
                }
                c0x33NewBuilder.LJII(str);
                if (c0x1uLJI != null) {
                    c0x33NewBuilder.LIZLLL = new C0X1V(c0x1uLJI).LJI();
                }
                c841880X0w.LIZ = c0x33NewBuilder.LIZIZ();
            }
            C0X1M.LIZJ(c0x1n);
        }
        return c841880X0w;
    }

    public static String LJ(String str, C0X1N c0x1n) {
        Set<String> set;
        int i;
        boolean z;
        HeaderParamConfig headerParamConfigLIZ = C0X1M.LIZ();
        if (headerParamConfigLIZ != null) {
            set = headerParamConfigLIZ.denyKeys;
        } else {
            set = null;
        }
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            String[] strArr = (String[]) new Regex(";").split(str, 0).toArray(new String[0]);
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                String[] strArr2 = (String[]) new Regex("=").split(str2, i2).toArray(new String[i2]);
                if (strArr2.length > 1) {
                    String str3 = strArr2[i2];
                    int length2 = str3.length() - 1;
                    int i4 = 0;
                    boolean z2 = false;
                    while (i4 <= length2) {
                        if (!z2) {
                            i = i4;
                        } else {
                            i = length2;
                        }
                        if (Intrinsics.LJI(str3.charAt(i), 32) <= 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z2) {
                            if (!z) {
                                z2 = true;
                            } else {
                                i4++;
                            }
                        } else {
                            if (!z) {
                                break;
                            }
                            length2--;
                        }
                    }
                    String string = str3.subSequence(i4, length2 + 1).toString();
                    c0x1n.LJI.add(string);
                    if (set != null && set.contains(string.toLowerCase(Locale.ROOT)) && !C0X1M.LIZIZ(headerParamConfigLIZ, c0x1n.LIZJ)) {
                        c0x1n.LJII.add(string);
                        c0x1n.LIZ = true;
                    } else {
                        sb.append(str2);
                        sb.append(";");
                    }
                } else {
                    sb.append(str2);
                    sb.append(";");
                }
                i3++;
                i2 = 0;
            }
            if (!C0X1M.LIZIZ(headerParamConfigLIZ, c0x1n.LIZJ)) {
                return sb.toString();
            }
            return str;
        }
        return str;
    }
}
