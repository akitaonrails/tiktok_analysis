package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.mime.MultipartTypedOutput;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedFile;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.mime.TypedString;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.network.connectionclass.DeviceBandwidthSampler;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.app.CommandDispatcher;
import com.ss.android.ugc.aweme.net.IIESNetworkApi;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: X.0XHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C846130XHf implements InterfaceC846090XHb {
    public static final Map<String, Retrofit> LIZLLL = new HashMap();
    public final List<InterfaceC1904907d9> LIZ = new ArrayList();
    public C1493620oyG LIZIZ;
    public C0X30 LIZJ;

    public final void LJIIL(InterfaceC1904907d9 interfaceC1904907d9) {
        if (interfaceC1904907d9 != null) {
            ((ArrayList) this.LIZ).add(interfaceC1904907d9);
        }
    }

    public final IIESNetworkApi LJIILIIL(String str) {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        HashMap map = (HashMap) LIZLLL;
        Retrofit retrofitLJIIIIZZ = (Retrofit) map.get(str);
        if (retrofitLJIIIIZZ == null) {
            List<InterfaceC1904907d9> list = this.LIZ;
            CopyOnWriteArrayList<InterfaceC1904907d9> copyOnWriteArrayList = C1515120pWw.LIZ;
            synchronized (C1515120pWw.class) {
                retrofitLJIIIIZZ = C1515120pWw.LJIIIIZZ(str, list);
            }
            map.put(str, retrofitLJIIIIZZ);
        }
        return (IIESNetworkApi) C1515120pWw.LJII(retrofitLJIIIIZZ, IIESNetworkApi.class);
    }

    public static String LJIILLIIL(String str, List list) {
        if (list != null && !TextUtils.isEmpty(str)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C080U c080u = (C080U) it2.next();
                if (str.equalsIgnoreCase(c080u.LIZ)) {
                    return c080u.LIZIZ;
                }
            }
            return null;
        }
        return null;
    }

    public static void LJIIZILJ(String str, String[] strArr) {
        if (strArr != null && strArr.length != 0 && !TextUtils.isEmpty(str)) {
            try {
                strArr[0] = str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC846090XHb
    public final byte[] LIZJ(int i, String str) throws IOException {
        TypedInput typedInput;
        long j;
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
        String str2 = (String) pairLIZJ.first;
        String str3 = (String) pairLIZJ.second;
        IIESNetworkApi iIESNetworkApiLJIILIIL = LJIILIIL(str2);
        if (iIESNetworkApiLJIILIIL != null) {
            C0X52<TypedInput> c0x52Execute = iIESNetworkApiLJIILIIL.downloadFile(true, i, str3, linkedHashMap).execute();
            if (c0x52Execute.LIZJ() && (typedInput = c0x52Execute.LIZIZ) != null) {
                InputStream inputStreamIn = typedInput.in();
                String strLJIILLIIL = LJIILLIIL("Content-Length", c0x52Execute.LIZ.LIZLLL);
                if (strLJIILLIIL != null) {
                    j = CastLongProtector.parseLong(strLJIILLIIL);
                } else {
                    j = -1;
                }
                return NetworkUtils.stream2ByteArray(i, inputStreamIn, j);
            }
        }
        return null;
    }

    @Override // X.InterfaceC846090XHb
    public final String LIZLLL(int i, int i2, String str, List<InterfaceC846210XHn> list) throws Exception {
        if (C2093608Ic.LJ(str)) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                for (InterfaceC846210XHn interfaceC846210XHn : list) {
                    String name = interfaceC846210XHn.getName();
                    String value = interfaceC846210XHn.getValue();
                    if (name != null && name.length() > 0) {
                        arrayList.add(new C080U(name, value));
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                NetworkUtils.handleApiError(str, e, System.currentTimeMillis() - jCurrentTimeMillis, null);
                throw e;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
        String str2 = (String) pairLIZJ.first;
        String str3 = (String) pairLIZJ.second;
        IIESNetworkApi iIESNetworkApiLJIILIIL = LJIILIIL(str2);
        if (iIESNetworkApiLJIILIIL == null) {
            return null;
        }
        C0X30 c0x30 = this.LIZJ;
        if (c0x30 != null) {
            C842430X2z c842430X2z = (C842430X2z) c0x30;
            if (!c842430X2z.LIZ) {
                DeviceBandwidthSampler deviceBandwidthSampler = C842420X2y.LIZ;
                if (deviceBandwidthSampler.LIZIZ.getAndIncrement() == 0) {
                    C786410Ut5.LJLILLLLZI(deviceBandwidthSampler.LIZJ, 1);
                    deviceBandwidthSampler.LIZLLL = SystemClock.elapsedRealtime();
                }
                c842430X2z.LIZIZ = str;
                c842430X2z.LIZ = true;
            }
        }
        C0X9S<String> c0x9sDoDetete = iIESNetworkApiLJIILIIL.doDetete(i2, str3, linkedHashMap, arrayList, this.LIZIZ);
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        C0X52<String> c0x52Execute = c0x9sDoDetete.execute();
        C0X30 c0x302 = this.LIZJ;
        if (c0x302 != null) {
            ((C842430X2z) c0x302).LIZ(str);
        }
        long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
        if (NetworkUtils.getCommandListener() != null) {
            NetworkUtils.getCommandListener().getClass();
            if (!C2093608Ic.LJ("X-SS-Command")) {
                ArrayList arrayList2 = new ArrayList();
                for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                    if ("X-SS-Command".equalsIgnoreCase(c080u.LIZ)) {
                        arrayList2.add(c080u.LIZIZ);
                    }
                }
                ((CommandDispatcher) NetworkUtils.getCommandListener()).LIZIZ(arrayList2);
            }
        }
        if (c0x52Execute.LIZJ()) {
            String str4 = c0x52Execute.LIZIZ;
            NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str4);
            NetworkUtils.handleApiOk(str, jCurrentTimeMillis3, null);
            return str4;
        }
        C2175508fh c2175508fh = c0x52Execute.LIZ;
        throw new C0XI3(c2175508fh.LIZIZ, LJIILLIIL("Reason-Phrase", c2175508fh.LIZLLL));
    }

    @Override // X.InterfaceC846090XHb
    public final String LIZ(int i, String str, C846120XHe c846120XHe, long j, C0XI0[] c0xi0Arr) {
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        for (InterfaceC846230XHp interfaceC846230XHp : (HashSet) c846120XHe.LIZ) {
            if (interfaceC846230XHp instanceof C846200XHm) {
                multipartTypedOutput.addPart(interfaceC846230XHp.getName(), new TypedString((String) interfaceC846230XHp.getValue()));
            } else if (interfaceC846230XHp instanceof C846190XHl) {
                C846190XHl c846190XHl = (C846190XHl) interfaceC846230XHp;
                multipartTypedOutput.addPart(c846190XHl.LIZ, new TypedByteArray(null, c846190XHl.LIZIZ, c846190XHl.LIZJ));
            } else if (interfaceC846230XHp instanceof C846180XHk) {
                multipartTypedOutput.addPart(interfaceC846230XHp.getName(), new TypedFile(null, (File) interfaceC846230XHp.getValue()));
            }
        }
        return LJIILL(0, i, str, null, multipartTypedOutput, null, this.LIZIZ, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJFF(int i, String str, byte[] bArr, String str2, String str3, List list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new C080U("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new C080U("Content-Type", str3));
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) it2.next();
                arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
            }
        }
        return LJIILJJIL("put", i, str, null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.LIZIZ, null);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJII(int i, int i2, String str, List list, C0XI0[] c0xi0Arr, List list2) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
            map.put(c2259691DcV.LL, c2259691DcV.LLILLJJLI);
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) it3.next();
                arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
            }
        }
        return LJIILL(i, i2, str, map, null, arrayList, this.LIZIZ, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIIZ(int i, int i2, String str, C846120XHe c846120XHe, C0XI0[] c0xi0Arr, List list) {
        List arrayList = new ArrayList();
        MultipartTypedOutput multipartTypedOutput = new MultipartTypedOutput();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
            multipartTypedOutput.addPart(c2259691DcV.LL, new TypedString(c2259691DcV.LLILLJJLI));
        }
        for (InterfaceC846230XHp interfaceC846230XHp : (HashSet) c846120XHe.LIZ) {
            if (interfaceC846230XHp instanceof C846200XHm) {
                multipartTypedOutput.addPart(interfaceC846230XHp.getName(), new TypedString((String) interfaceC846230XHp.getValue()));
            } else if (interfaceC846230XHp instanceof C846190XHl) {
                C846190XHl c846190XHl = (C846190XHl) interfaceC846230XHp;
                multipartTypedOutput.addPart(c846190XHl.LIZ, new TypedByteArray(null, c846190XHl.LIZIZ, c846190XHl.LIZJ));
            } else if (interfaceC846230XHp instanceof C846180XHk) {
                multipartTypedOutput.addPart(interfaceC846230XHp.getName(), new TypedFile(null, (File) interfaceC846230XHp.getValue()));
            }
        }
        return LJIILL(i, i2, str, null, multipartTypedOutput, arrayList, this.LIZIZ, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIJ(int i, int i2, String str, List list, C0XI0[] c0xi0Arr, List list2) {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
            map.put(c2259691DcV.LL, c2259691DcV.LLILLJJLI);
        }
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                InterfaceC846210XHn interfaceC846210XHn = (InterfaceC846210XHn) it3.next();
                arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
            }
        }
        return LJIILJJIL("put", i2, str, map, null, arrayList, this.LIZIZ, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIJJI(int i, int i2, String str, String str2, String str3, byte[] bArr) {
        return LJIIIIZZ(i, i2, str, bArr, str2, str3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0059 A[Catch: Exception -> 0x0168, TryCatch #1 {Exception -> 0x0168, blocks: (B:15:0x0040, B:17:0x0059, B:19:0x005d), top: B:75:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0167 A[RETURN] */
    @Override // X.InterfaceC846090XHb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LJ(int r20, int r21, java.lang.String r22, boolean r23, java.util.List r24, X.C846160XHi r25, boolean r26) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C846130XHf.LJ(int, int, java.lang.String, boolean, java.util.List, X.0XHi, boolean):java.lang.String");
    }

    @Override // X.InterfaceC846090XHb
    public final String LJIIIIZZ(int i, int i2, String str, byte[] bArr, String str2, String str3, List<InterfaceC846210XHn> list) {
        ArrayList arrayList = new ArrayList();
        if (str2 != null) {
            arrayList.add(new C080U("Content-Encoding", str2));
        }
        if (str3 != null && str3.length() > 0) {
            arrayList.add(new C080U("Content-Type", str3));
        }
        if (list != null) {
            for (InterfaceC846210XHn interfaceC846210XHn : list) {
                arrayList.add(new C080U(interfaceC846210XHn.getName(), interfaceC846210XHn.getValue()));
            }
        }
        return LJIILL(i, i2, str, null, new TypedByteArray(str3, bArr, new String[0]), arrayList, this.LIZIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LJIILJJIL(String str, int i, String str2, Map map, TypedOutput typedOutput, List list, C1493620oyG c1493620oyG, C0XI0[] c0xi0Arr) throws Exception {
        C0X9S<String> c0x9sDoPost;
        Map map2 = map;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return null;
        }
        if (!"get".equals(str)) {
            if (!"delete".equals(str)) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str2, linkedHashMap);
                    String str3 = (String) pairLIZJ.first;
                    String str4 = (String) pairLIZJ.second;
                    IIESNetworkApi iIESNetworkApiLJIILIIL = LJIILIIL(str3);
                    if (iIESNetworkApiLJIILIIL == 0) {
                        return null;
                    }
                    if (typedOutput != null) {
                        if ("put".equals(str)) {
                            c0x9sDoPost = iIESNetworkApiLJIILIIL.putBody(i, str4, linkedHashMap, typedOutput, list, c1493620oyG);
                        } else {
                            c0x9sDoPost = iIESNetworkApiLJIILIIL.postBody(i, str4, linkedHashMap, typedOutput, list, c1493620oyG);
                        }
                    } else {
                        if (map2 == null) {
                            map2 = new HashMap();
                        }
                        if ("put".equals(str)) {
                            c0x9sDoPost = iIESNetworkApiLJIILIIL.doPut(i, str4, linkedHashMap, map2, list, c1493620oyG);
                        } else {
                            c0x9sDoPost = iIESNetworkApiLJIILIIL.doPost(i, str4, linkedHashMap, map2, list, c1493620oyG);
                        }
                    }
                    if (c0xi0Arr != null && c0xi0Arr.length > 0) {
                        c0xi0Arr[0] = new C846240XHq(c0x9sDoPost);
                    }
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    C0X30 c0x30 = this.LIZJ;
                    if (c0x30 != null) {
                        C842430X2z c842430X2z = (C842430X2z) c0x30;
                        if (!c842430X2z.LIZ) {
                            DeviceBandwidthSampler deviceBandwidthSampler = C842420X2y.LIZ;
                            if (deviceBandwidthSampler.LIZIZ.getAndIncrement() == 0) {
                                C786410Ut5.LJLILLLLZI(deviceBandwidthSampler.LIZJ, 1);
                                deviceBandwidthSampler.LIZLLL = SystemClock.elapsedRealtime();
                            }
                            c842430X2z.LIZIZ = str2;
                            c842430X2z.LIZ = true;
                        }
                    }
                    C0X52<String> c0x52Execute = c0x9sDoPost.execute();
                    C0X30 c0x302 = this.LIZJ;
                    if (c0x302 != null) {
                        ((C842430X2z) c0x302).LIZ(str2);
                    }
                    long jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis2;
                    LJIILLIIL("X-TT-LOGID", c0x52Execute.LIZ.LIZLLL);
                    if (NetworkUtils.getCommandListener() != null) {
                        NetworkUtils.getCommandListener().getClass();
                        if (!C2093608Ic.LJ("X-SS-Command")) {
                            ArrayList arrayList = new ArrayList();
                            for (C080U c080u : c0x52Execute.LIZ.LIZLLL) {
                                if ("X-SS-Command".equalsIgnoreCase(c080u.LIZ)) {
                                    arrayList.add(c080u.LIZIZ);
                                }
                            }
                            ((CommandDispatcher) NetworkUtils.getCommandListener()).LIZIZ(arrayList);
                        }
                    }
                    if (c0x52Execute.LIZJ()) {
                        String str5 = c0x52Execute.LIZIZ;
                        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_net_lancet_ServerTimeLancet_handleTimeStampFromResponse(str5);
                        NetworkUtils.handleApiOk(str2, jCurrentTimeMillis3, null);
                        return str5;
                    }
                    C2175508fh c2175508fh = c0x52Execute.LIZ;
                    throw new C0XI3(c2175508fh.LIZIZ, LJIILLIIL("Reason-Phrase", c2175508fh.LIZLLL));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    NetworkUtils.handleApiError(str2, e, System.currentTimeMillis() - jCurrentTimeMillis, null);
                    throw e;
                }
            }
            throw new RuntimeException("doInternal temporary does not support delete ");
        }
        throw new RuntimeException("doInternal does not support get");
    }

    public final String LJIILL(int i, int i2, String str, Map map, TypedOutput typedOutput, List list, C1493620oyG c1493620oyG, C0XI0[] c0xi0Arr) {
        return LJIILJJIL("post", i2, str, map, typedOutput, list, c1493620oyG, c0xi0Arr);
    }

    @Override // X.InterfaceC846090XHb
    public final boolean LIZIZ(int i, String str, StringBuffer stringBuffer, StringBuffer stringBuffer2, StringBuffer stringBuffer3, InterfaceC846250XHr interfaceC846250XHr, String str2, List list, String[] strArr, int[] iArr) {
        return LJI(i, str, stringBuffer.toString(), stringBuffer2.toString(), stringBuffer3.toString(), interfaceC846250XHr, str2, list, strArr, iArr);
    }

    @Override // X.InterfaceC846090XHb
    public final boolean LJI(int i, final String str, String str2, String str3, String str4, InterfaceC846250XHr interfaceC846250XHr, String str5, List list, String[] strArr, int[] iArr) throws Throwable {
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        String str6 = null;
        try {
            String userAgent = NetworkUtils.getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(userAgent);
                sbLIZ.append(" cronet/1.0.3.2");
                userAgent = C2188811AlT.LIZIZ(sbLIZ);
            }
            arrayList.add(new C080U("User-Agent", userAgent));
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C2259691DcV c2259691DcV = (C2259691DcV) it2.next();
                    arrayList.add(new C080U(c2259691DcV.LL, c2259691DcV.LLILLJJLI));
                }
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(str, linkedHashMap);
            String str7 = (String) pairLIZJ.first;
            String str8 = (String) pairLIZJ.second;
            IIESNetworkApi iIESNetworkApiLJIILIIL = LJIILIIL(str7);
            if (iIESNetworkApiLJIILIIL != null) {
                final C0X9S<TypedInput> c0x9sDownloadFile = iIESNetworkApiLJIILIIL.downloadFile(true, i, str8, linkedHashMap, arrayList, this.LIZIZ);
                C0X52<TypedInput> c0x52Execute = c0x9sDownloadFile.execute();
                if (c0x52Execute.LIZJ()) {
                    TypedInput typedInput = c0x52Execute.LIZIZ;
                    if (typedInput != null) {
                        InputStream inputStreamIn = typedInput.in();
                        List<C080U> list2 = c0x52Execute.LIZ.LIZLLL;
                        long j = -1;
                        if (list2 != null && !list2.isEmpty()) {
                            for (C080U c080u : list2) {
                                if ("Content-Length".equals(c080u.LIZ)) {
                                    String str9 = c080u.LIZIZ;
                                    if (!TextUtils.isEmpty(str9)) {
                                        j = Long.parseLong(str9);
                                    }
                                } else if ("Content-Encoding".equals(c080u.LIZ)) {
                                    String str10 = c080u.LIZIZ;
                                    if (!TextUtils.isEmpty(str10) && "gzip".equalsIgnoreCase(str10)) {
                                        inputStreamIn = new GZIPInputStream(inputStreamIn);
                                    }
                                } else if ("x-snssdk.remoteaddr".equals(c080u.LIZ)) {
                                    str6 = c080u.LIZIZ;
                                }
                            }
                        }
                        if (iArr != null) {
                            try {
                                if (iArr.length > 0) {
                                    iArr[0] = 0;
                                    if (j <= 2147483647L) {
                                        iArr[0] = (int) j;
                                    }
                                }
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                                LJIIZILJ(str6, strArr);
                                throw th;
                            }
                        }
                        boolean zStream2File = NetworkUtils.stream2File(inputStreamIn, j, new InterfaceC846320XHy(str, c0x9sDownloadFile) { // from class: X.0XHs
                            public final /* synthetic */ C0X9S LIZ;

                            {
                                this.LIZ = c0x9sDownloadFile;
                            }
                        }, i, str2, str3, str4, interfaceC846250XHr, str5, null);
                        LJIIZILJ(str6, strArr);
                        return zStream2File;
                    }
                } else {
                    C2175508fh c2175508fh = c0x52Execute.LIZ;
                    throw new C0XI3(c2175508fh.LIZIZ, LJIILLIIL("Reason-Phrase", c2175508fh.LIZLLL));
                }
            }
            LJIIZILJ(null, strArr);
            return false;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
