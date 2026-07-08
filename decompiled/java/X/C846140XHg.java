package X;

import android.util.Pair;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0XHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C846140XHg implements InterfaceC846090XHb {
    public final InterfaceC846090XHb LIZ;
    public final String LIZIZ;

    public C846140XHg(C842950X4z c842950X4z) {
        this.LIZ = c842950X4z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("https://");
        sbLIZ.append(C844470XAv.LJIIIIZZ.LIZ);
        this.LIZIZ = C2188811AlT.LIZIZ(sbLIZ);
    }

    public static ArrayList LJIILIIL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) it2.next();
                String name = interfaceC846210XHn.getName();
                String value = interfaceC846210XHn.getValue();
                if (name != null && name.length() > 0) {
                    arrayList.add(new C080U(name, value));
                }
            }
        }
        return arrayList;
    }

    public static HashMap LJIILJJIL(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
                map.put(c2259691DcV.LL, c2259691DcV.LLILLJJLI);
            }
        }
        return map;
    }

    @Override // X.InterfaceC846090XHb
    public final byte[] LIZJ(int i, String str) {
        return this.LIZ.LIZJ(i, str);
    }

    public static void LJIIL(String str, String str2, ArrayList arrayList) {
        if (str != null) {
            arrayList.add(new C080U("Content-Encoding", str));
        }
        if (str2 != null && str2.length() > 0) {
            arrayList.add(new C080U("Content-Type", str2));
        }
    }

    @Override // X.InterfaceC846090XHb
    public final String LIZLLL(int i, int i2, String str, List<InterfaceC846210XHn> list) {
        return LJIILL(i2, str, new HashMap(), null, LJIILIIL(list), null);
    }

    @Override // X.InterfaceC846090XHb
    public final String LIZ(int i, String str, C846120XHe c846120XHe, long j, C0XI0[] c0xi0Arr) {
        return this.LIZ.LIZ(i, str, c846120XHe, j, c0xi0Arr);
    }

    public static String LJIILL(int i, String str, Map map, TypedOutput typedOutput, List list, C0XI0[] c0xi0Arr) throws IOException {
        C0X9S<String> c0x9sDoPost;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
        String str2 = (String) pairLIZJ.first;
        String str3 = (String) pairLIZJ.second;
        IIESNetworkApi iIESNetworkApi = (IIESNetworkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(str2).build().retrofit.LIZ(IIESNetworkApi.class);
        if (typedOutput != null) {
            c0x9sDoPost = iIESNetworkApi.postBody(i, str3, linkedHashMap, typedOutput, list, null);
        } else {
            c0x9sDoPost = iIESNetworkApi.doPost(i, str3, linkedHashMap, map, list, null);
        }
        if (c0xi0Arr != null && c0xi0Arr.length != 0) {
            c0xi0Arr[0] = new C846240XHq(c0x9sDoPost);
        }
        return c0x9sDoPost.execute().LIZIZ;
    }

    @Override // X.InterfaceC846090XHb
    public final String LJFF(int i, String str, byte[] bArr, String str2, String str3, List list) {
        ArrayList arrayListLJIILIIL = LJIILIIL(list);
        LJIIL(str2, str3, arrayListLJIILIIL);
        return LJIILL(i, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), arrayListLJIILIIL, null);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJII(int i, int i2, String str, List list, C0XI0[] c0xi0Arr, List list2) {
        return LJIILL(i2, str, LJIILJJIL(list), null, LJIILIIL(list2), c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIIZ(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr, List list) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
                multipartTypedOutput.addPart(c2259691DcV.LL, new TypedString(c2259691DcV.LLILLJJLI));
            }
        }
        if (c846120XHe != null) {
            for (InterfaceC846230XHp interfaceC846230XHp : (HashSet) c846120XHe.LIZ) {
                if (interfaceC846230XHp instanceof C846200XHm) {
                    C846200XHm c846200XHm = (C846200XHm) interfaceC846230XHp;
                    multipartTypedOutput.addPart(c846200XHm.LIZ, new TypedString(c846200XHm.LIZIZ));
                } else if (interfaceC846230XHp instanceof C846190XHl) {
                    C846190XHl c846190XHl = (C846190XHl) interfaceC846230XHp;
                    multipartTypedOutput.addPart(c846190XHl.LIZ, new TypedByteArray(null, c846190XHl.LIZIZ, c846190XHl.LIZJ));
                } else if (interfaceC846230XHp instanceof C846180XHk) {
                    C846180XHk c846180XHk = (C846180XHk) interfaceC846230XHp;
                    multipartTypedOutput.addPart(c846180XHk.LIZ, new TypedFile(null, c846180XHk.LIZIZ));
                }
            }
        }
        return LJIILL(i2, str, new HashMap(), multipartTypedOutput, null, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIJ(int i, int i2, String str, List list, C0XI0[] c0xi0Arr, List list2) {
        return LJIILL(i2, str, LJIILJJIL(list), null, LJIILIIL(list2), null);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIJJI(int i, int i2, String str, String str2, String str3, byte[] bArr) {
        return LJIIIIZZ(i, i2, str, bArr, str2, str3, null);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJ(int i, int i2, String str, boolean z, List list, C846160XHi c846160XHi, boolean z2) {
        return ((IIESNetworkApi) ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(this.LIZIZ).build().retrofit.LIZ(IIESNetworkApi.class)).doGet(true, i2, str, new HashMap(), LJIILIIL(list), null).execute().LIZIZ;
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIIIZZ(int i, int i2, String str, byte[] bArr, String str2, String str3, List<InterfaceC846210XHn> list) {
        ArrayList arrayListLJIILIIL = LJIILIIL(list);
        LJIIL(str2, str3, arrayListLJIILIIL);
        return LJIILL(i2, str, new HashMap(), new TypedByteArray(str3, bArr, new String[0]), arrayListLJIILIIL, null);
    }

    @Override // X.InterfaceC846090XHb
    public final boolean LIZIZ(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC846250XHr interfaceC846250XHr, String str2, List list, String[] strArr, int[] iArr) {
        return this.LIZ.LIZIZ(i, str, stringBuffer, stringBuffer2, stringBuffer3, interfaceC846250XHr, str2, list, strArr, iArr);
    }

    @Override // X.InterfaceC846090XHb
    public final boolean LJI(int i, String str, String str2, String str3, String str4, InterfaceC846250XHr interfaceC846250XHr, String str5, List list, String[] strArr, int[] iArr) {
        return this.LIZ.LJI(i, str, str2, str3, str4, interfaceC846250XHr, str5, list, strArr, iArr);
    }
}
