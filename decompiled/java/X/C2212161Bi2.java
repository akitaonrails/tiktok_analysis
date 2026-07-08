package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bi2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2212161Bi2 {
    public static int LIZ = -1;

    public static int LJ() {
        int iLIZIZ = 0;
        int iLIZIZ2 = (int) C1057810ddL.LIZIZ(0, C2212231Bi9.LJIILL);
        if (iLIZIZ2 > 0) {
            return iLIZIZ2;
        }
        int i = 960;
        if (Build.VERSION.SDK_INT < 30) {
            Point point = new Point();
            WindowManager windowManager = (WindowManager) C786410Ut5.H2(C2212231Bi9.LJIILL, "window");
            if (windowManager != null) {
                C2204961BRm.LLILZIL(windowManager, new C0WZX("dzBzEhEpEcvSUUUuTBbKZy4FEza7J60guilFZQ3oDVA/yjs9xsg0tF3k4Vc=", null)).getSize(point);
            }
            double d = C2212231Bi9.LJIILL.getResources().getDisplayMetrics().density;
            if (d <= 1.1d) {
                i = 100;
            } else if (d > 1.6d) {
                i = 1260;
            }
            return (((point.y - C2212301BiG.LIZIZ(C2212231Bi9.LJIILL)) * 200) / i) + ((int) C1057810ddL.LIZIZ(25.0f, C2212231Bi9.LJIILL));
        }
        try {
            Context context = C2212231Bi9.LJIILL;
            if (context != null) {
                C0IKF.LIZ.getClass();
                Rect rectLIZ = C465320IMo.LIZ().LIZIZ(context).LIZ();
                if (rectLIZ.height() > 0) {
                    double d2 = C2212231Bi9.LJIILL.getResources().getDisplayMetrics().density;
                    if (d2 <= 1.1d) {
                        i = 100;
                    } else if (d2 > 1.6d) {
                        i = 1260;
                    }
                    iLIZIZ = ((int) C1057810ddL.LIZIZ(25.0f, C2212231Bi9.LJIILL)) + (((rectLIZ.height() - C2212301BiG.LIZIZ(C2212231Bi9.LJIILL)) * 200) / i);
                    return iLIZIZ;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return iLIZIZ;
    }

    public static long LJII() {
        if (!C2212231Bi9.LJJJJ) {
            LIZ = EnumC2212431BiT.ENABLE_VALID_TIME_DISABLED.getCode();
            return System.currentTimeMillis();
        }
        if (((C2212231Bi9.LJJJJI / LSPassThroughRecordSizeConfig.DEFAULT) % 10 == 1) && !C2212231Bi9.LJJIIZ && C2212231Bi9.LJIILJJIL != null && C0XK4.LIZIZ() != 0) {
            LIZ = EnumC2212431BiT.CLIENT_TIME_USED.getCode();
            C2212231Bi9.LJIILJJIL.getClass();
            return C0XK4.LIZIZ();
        }
        C2211961Bhi c2211961BhiLIZ = C2211961Bhi.LIZ();
        if (!c2211961BhiLIZ.LJII) {
            long j = c2211961BhiLIZ.LJI;
            if (j != -1) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("time check, remote time back:");
                sbLIZ.append(j);
                C2212381BiO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                LIZ = EnumC2212431BiT.REMOTE_TIME_USED.getCode();
                return j;
            }
        }
        long jLJIIIZ = C2212141Bi0.LJIIIIZZ().LJIIIZ();
        if (jLJIIIZ == 0) {
            if ((C2212231Bi9.LJJJJI / 10) % 10 != 1) {
                return -1L;
            }
            C2212381BiO.LIZIZ("time check, hasn't preLaunchTime");
            LIZ = EnumC2212431BiT.NO_PRE_LAUNCH_TIME_FIRST_INSTALL.getCode();
            return System.currentTimeMillis();
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < jLJIIIZ) {
            if (C2212231Bi9.LJJJJI % 10 != 1) {
                return -1L;
            }
            LIZ = EnumC2212431BiT.NO_PRE_LAUNCH_TIME_RESTART.getCode();
            return System.currentTimeMillis();
        }
        long jLJIIJ = C2212141Bi0.LJIIIIZZ().LJIIJ();
        long j2 = jElapsedRealtime - jLJIIIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("time check, last remote time: ");
        sbLIZ2.append(jLJIIJ);
        sbLIZ2.append(", time gap between launch: ");
        sbLIZ2.append(j2);
        sbLIZ2.append(", current time calculated: ");
        long j3 = jLJIIJ + j2;
        sbLIZ2.append(j3);
        C2212381BiO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        LIZ = EnumC2212431BiT.CALCULATED_TIME.getCode();
        return j3;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x024a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.StringBuilder LJIIIIZZ() {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212161Bi2.LJIIIIZZ():java.lang.StringBuilder");
    }

    public static Pair<Integer, Long> LJIILLIIL() {
        long jLIZIZ = C2212231Bi9.LJIILJJIL != null ? C0XK4.LIZIZ() : 0L;
        long jLJIIIZ = C2212141Bi0.LJIIIIZZ().LJIIIZ();
        if (jLJIIIZ == 0) {
            return (C2212231Bi9.LJJJJI / 10) % 10 == 1 ? new Pair<>(-1, 0L) : new Pair<>(0, 0L);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < jLJIIIZ) {
            return C2212231Bi9.LJJJJI % 10 == 1 ? new Pair<>(-1, 0L) : new Pair<>(1, 0L);
        }
        long jAbs = Math.abs(jLIZIZ - (C2212141Bi0.LJIIIIZZ().LJIIJ() + (jElapsedRealtime - jLJIIIZ)));
        return jAbs >= 1000 ? new Pair<>(2, Long.valueOf(jAbs)) : new Pair<>(-1, 0L);
    }

    public static JSONObject LJIL() {
        try {
            String strLIZLLL = C2212141Bi0.LJIIIIZZ().LIZJ.LIZLLL("key_splash_show_times_map");
            if (TextUtils.isEmpty(strLIZLLL)) {
                return null;
            }
            return new JSONObject(strLIZLLL);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZIZ(String str) throws Throwable {
        if (C2211541Bh2.LIZ(str)) {
            return false;
        }
        try {
            int iLJIILJJIL = LJIILJJIL(str);
            if (iLJIILJJIL != 1) {
                if (iLJIILJJIL != 2 && iLJIILJJIL != 5) {
                    return false;
                }
                return true;
            }
            Uri uri = UriProtector.parse(str);
            if ("sslocal".equalsIgnoreCase(uri.getScheme())) {
                return true;
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(uri);
            List listLJJJJZ = C2204961BRm.LJJJJZ(C2212231Bi9.LJIILL.getPackageManager(), intent, 65536, new C0WZX("dzBzEhEpEcvSUUUuTBbKZy4FEza7J60guilFZQ3oDVdtos0DXyjqkg==", null));
            if (listLJJJJZ == null) {
                return false;
            }
            if (listLJJJJZ.size() <= 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2212291BiF.LIZLLL().LIZ("key_exception_open_url", e);
            return false;
        }
    }

    public static void LIZLLL(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static String LJIIIZ(HashMap<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!C2211541Bh2.LIZ(entry.getKey()) && !C2211541Bh2.LIZ(entry.getValue())) {
                sb.append("&");
                sb.append(C786410Ut5.j4("%s=%s", new Object[]{entry.getKey(), entry.getValue()}));
            }
        }
        return sb.toString();
    }

    public static String LJIIJ(String str) {
        if (C2211541Bh2.LIZ(str)) {
            return null;
        }
        String str2 = C2212231Bi9.LIZ;
        if (TextUtils.isEmpty(null)) {
            return null;
        }
        return LIZJ(null, str);
    }

    public static String LJIIJJI(C2212321BiI c2212321BiI) {
        List<String> list;
        if (c2212321BiI == null || (list = c2212321BiI.LIZ) == null || list.isEmpty()) {
            return null;
        }
        String str = (String) ListProtector.get(list, 0);
        if (C2211541Bh2.LIZ(str) && list.size() >= 2) {
            String str2 = (String) ListProtector.get(list, 1);
            if (C2211541Bh2.LIZ(str2) && list.size() >= 3) {
                return (String) ListProtector.get(list, 2);
            }
            return str2;
        }
        return str;
    }

    public static String LJIILIIL(String str) {
        String strLIZJ;
        String strLIZJ2 = null;
        if (C2212231Bi9.LJIIIIZZ().LIZIZ) {
            if (!C2211541Bh2.LIZ(str)) {
                String strLJ = C2212231Bi9.LJ();
                String strLJI = C2212231Bi9.LJI();
                if (!TextUtils.isEmpty(strLJ) || !TextUtils.isEmpty(strLJI)) {
                    if (strLJ != null && strLJ.equals(strLJI)) {
                        return LIZJ(strLJ, str);
                    }
                    if (!TextUtils.isEmpty(strLJ)) {
                        strLIZJ = LIZJ(strLJ, str);
                    } else {
                        strLIZJ = null;
                    }
                    if (!TextUtils.isEmpty(strLJI)) {
                        strLIZJ2 = LIZJ(strLJI, str);
                    }
                    if ((!TextUtils.isEmpty(strLIZJ) && new C0VSJ(strLIZJ).exists()) || TextUtils.isEmpty(strLIZJ2) || !new C0VSJ(strLIZJ2).exists()) {
                        return strLIZJ;
                    }
                    return strLIZJ2;
                }
            }
            return null;
        }
        if (C2211541Bh2.LIZ(str)) {
            return null;
        }
        String strLJ2 = C2212231Bi9.LJ();
        if (TextUtils.isEmpty(strLJ2)) {
            return null;
        }
        return LIZJ(strLJ2, str);
    }

    public static int LJIILJJIL(String str) {
        if (C2211541Bh2.LIZ(str)) {
            return 0;
        }
        try {
            if (C2211541Bh2.LIZ(UriProtector.parse(str).getScheme())) {
                return 0;
            }
            if (!TextUtils.isEmpty(str) && (str.startsWith("http://") || str.startsWith("https://"))) {
                return 2;
            }
            if (!C1059910dgj.LIZ(str)) {
                return 1;
            }
            return 5;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public static String LJIILL(C2212151Bi1 c2212151Bi1) {
        if (c2212151Bi1 != null && c2212151Bi1.LIZJ()) {
            return LJIILIIL(c2212151Bi1.LIZLLL);
        }
        return null;
    }

    public static String LJIIZILJ(C2212151Bi1 c2212151Bi1) {
        List<String> list;
        if (c2212151Bi1 != null && (list = c2212151Bi1.LIZJ) != null && !((ArrayList) list).isEmpty()) {
            return C2211531Bh1.LIZIZ((String) ListProtector.get(c2212151Bi1.LIZJ, 0));
        }
        return null;
    }

    public static boolean LJIJI(C2212201Bi6 c2212201Bi6) {
        if (c2212201Bi6 == null) {
            return false;
        }
        return c2212201Bi6.LJIIIIZZ();
    }

    public static boolean LJIJJ(C2212141Bi0 c2212141Bi0) {
        int iLIZIZ = c2212141Bi0.LIZJ.LIZIZ("splash_ad_show_limit");
        if (iLIZIZ > 0 && c2212141Bi0.LJIILIIL() >= iLIZIZ) {
            return true;
        }
        return false;
    }

    public static byte[] LJIJJLI(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                try {
                    int i = inputStream.read(bArr);
                    if (i > -1) {
                        byteArrayOutputStream.write(bArr, 0, i);
                    } else {
                        byteArrayOutputStream.flush();
                        byteArrayOutputStream.close();
                        LIZLLL(byteArrayOutputStream);
                        return byteArrayOutputStream.toByteArray();
                    }
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    LIZLLL(byteArrayOutputStream);
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LIZLLL(byteArrayOutputStream);
                throw th;
            }
            TryCatchGuardChecker.doCheck(th);
            LIZLLL(byteArrayOutputStream);
            throw th;
        }
    }

    public static String LIZJ(String str, String str2) {
        try {
            C0VSJ c0vsj = new C0VSJ(str);
            if (!c0vsj.isDirectory()) {
                c0vsj.delete();
            }
            if (!c0vsj.exists()) {
                c0vsj.mkdirs();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(C08HH.LIZ(str2));
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2212381BiO.LJFF(" illegal cache path ");
            return null;
        }
    }

    public static byte[] LJFF(byte[] bArr, String str) {
        try {
            int length = str.length() / 2;
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr2[i] = CastIntegerProtector.valueOf(str.substring(i2, i2 + 2), 16).byteValue();
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 12, bArr.length);
            IvParameterSpec ivParameterSpec = new IvParameterSpec(Arrays.copyOfRange(bArr, 0, 12));
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArrCopyOfRange);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List<C2212201Bi6> LJI(List<C2212201Bi6> list, List<C2212201Bi6> list2) {
        if (list == null) {
            list = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2212201Bi6 c2212201Bi6 = (C2212201Bi6) ListProtector.get(list, i);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.set(11, 23);
            calendar.set(12, 59);
            calendar.set(13, 59);
            calendar.set(14, 999);
            if (c2212201Bi6.LJI() <= calendar.getTimeInMillis() && jCurrentTimeMillis < c2212201Bi6.LJFF()) {
                arrayList.add(c2212201Bi6);
                C2212381BiO.LJ(c2212201Bi6.LLJI, "preload progress: suitable first-show ad");
            } else {
                C2212381BiO.LJ(c2212201Bi6.LLJI, "preload progress: first-show ad expired");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (C2212081Bhu.LIZ(list2)) {
            return arrayList;
        }
        for (C2212201Bi6 c2212201Bi62 : (ArrayList) list2) {
            if (c2212201Bi62.LLJLILLLLZIIL == 1) {
                arrayList2.add(c2212201Bi62);
                C2212381BiO.LJ(c2212201Bi62.LLJI, "preload progress: get one first-show ad");
            }
        }
        arrayList.removeAll(arrayList2);
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    public static int LJIIL(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return ColorProtector.parseColor(str2);
        }
    }

    public static boolean LJIJ(String str, C2212141Bi0 c2212141Bi0) {
        if (C2211541Bh2.LIZ(str)) {
            return false;
        }
        String[] strArr = {LJIIJ(str), LJIILIIL(str)};
        int i = 0;
        do {
            String str2 = strArr[i];
            if (!TextUtils.isEmpty(str2) && new C0VSJ(str2).exists()) {
                if (c2212141Bi0.LJIILJJIL(str)) {
                    return true;
                }
                C2212051Bhr c2212051BhrLIZJ = C2212051Bhr.LIZJ();
                c2212051BhrLIZJ.getClass();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject2.putOpt("uri", str);
                    }
                    if (!TextUtils.isEmpty(str2)) {
                        jSONObject2.putOpt("path", str2);
                    }
                    jSONObject2.put("log_extra", C2212061Bhs.LIZIZ().LIZJ());
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                c2212051BhrLIZJ.LJFF("splash_ad", "error_save_sp", jSONObject, 84378473382L);
                C2212061Bhs.LIZIZ().getClass();
                C2212221Bi8 c2212221Bi8LIZIZ = C2212221Bi8.LIZIZ();
                c2212221Bi8LIZIZ.getClass();
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    c2212221Bi8LIZIZ.LIZ.put(str2, str);
                }
            }
            i++;
        } while (i < 2);
        synchronized (c2212141Bi0) {
            if (C2211541Bh2.LIZ(str)) {
                return false;
            }
            C2212121Bhy c2212121Bhy = c2212141Bi0.LIZJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("splash_ad_url_has_download_");
            sbLIZ.append(C08HH.LIZ(str));
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C2212111Bhx c2212111Bhx = c2212121Bhy.LIZ;
            if (strLIZIZ == null) {
                c2212111Bhx.getClass();
            } else {
                c2212111Bhx.LIZIZ.remove(strLIZIZ);
            }
            c2212121Bhy.LIZ();
            return false;
        }
    }

    public static List<C2212201Bi6> LIZ(JSONArray jSONArray, long j, boolean z) {
        JSONObject jSONObjectLJIL;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (z) {
            jSONObjectLJIL = LJIL();
        } else {
            jSONObjectLJIL = null;
        }
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                C2212201Bi6 c2212201Bi6 = new C2212201Bi6();
                c2212201Bi6.LIZLLL(jSONObjectOptJSONObject, j, z);
                if (z) {
                    if (jSONObjectLJIL != null) {
                        int iOptInt = jSONObjectLJIL.optInt(String.valueOf(c2212201Bi6.LLJI), 0);
                        c2212201Bi6.LLLJL = iOptInt;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("show times updated, id:");
                        sbLIZ.append(c2212201Bi6.LLJI);
                        sbLIZ.append(", current show time: ");
                        sbLIZ.append(iOptInt);
                        C2212381BiO.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else if (LJIJI(c2212201Bi6)) {
                    C2212051Bhr.LIZJ().LJIIIZ(c2212201Bi6, "topview_boarding");
                }
                arrayList.add(c2212201Bi6);
            }
        }
        return arrayList;
    }
}
