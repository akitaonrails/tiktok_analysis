package X;

import X.C830490Whz;
import android.util.Pair;
import com.bytedance.crash.upload.network.RetrofitCrashService;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0W1Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W1Q implements C0W1E {
    public static List<C080U> LIZ(Map<String, String> map) {
        C830490Whz c830490WhzLIZ;
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            HashMap map2 = (HashMap) map;
            if (!map2.isEmpty()) {
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry != null) {
                        arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                    }
                }
            }
        }
        try {
            InterfaceC803900VgC interfaceC803900VgC = C0W1D.LIZIZ;
            if (interfaceC803900VgC != null && (c830490WhzLIZ = ((C0W1R) interfaceC803900VgC).LIZ("ttnet")) != null && !c830490WhzLIZ.isEmpty()) {
                for (Map.Entry entry2 : (C830490Whz.a) c830490WhzLIZ.entrySet()) {
                    if (entry2 != null) {
                        arrayList.add(new C080U((String) entry2.getKey(), (String) entry2.getValue()));
                    }
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return arrayList;
    }

    public static byte[] LIZLLL(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        if (inputStream == null) {
            return new byte[0];
        }
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 != i) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                inputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static final Pair<Integer, byte[]> LIZIZ(String str, Map<String, String> map) throws IOException {
        C0X9S<TypedInput> c0x9sFetch;
        boolean zLJI = MethodIDManager.LJI(137888);
        List<C080U> listLIZ = LIZ(null);
        RetrofitCrashService retrofitCrashService = (RetrofitCrashService) C1515120pWw.LJIIIZ(RetrofitCrashService.class, str);
        if (((ArrayList) listLIZ).size() > 0) {
            c0x9sFetch = retrofitCrashService.fetch(str, listLIZ, map, false);
        } else {
            c0x9sFetch = retrofitCrashService.fetch(str, map, false);
        }
        C0X52<TypedInput> c0x52Execute = c0x9sFetch.execute();
        Pair<Integer, byte[]> pair = new Pair<>(Integer.valueOf(c0x52Execute.LIZ.LIZIZ), LIZLLL(c0x52Execute.LIZIZ.in()));
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return pair;
    }

    public static final Pair LIZJ(String str, Map map, byte[] bArr) {
        int statusCode = 0;
        byte[] bArrLIZLLL = null;
        try {
            C0X52<TypedInput> c0x52Execute = ((RetrofitCrashService) C1515120pWw.LJIIIZ(RetrofitCrashService.class, str)).report(str, new TypedByteArray("application/json; charset=utf-8", bArr, new String[0]), LIZ(map), false).execute();
            bArrLIZLLL = LIZLLL(c0x52Execute.LIZIZ.in());
            statusCode = c0x52Execute.LIZ.LIZIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            try {
                if (th instanceof C1494430ozZ) {
                    statusCode = ((C1494430ozZ) th).getStatusCode();
                }
                if (th instanceof C1494690ozz) {
                    statusCode = ((C1494690ozz) th).getStatusCode();
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return new Pair(Integer.valueOf(statusCode), bArrLIZLLL);
    }
}
