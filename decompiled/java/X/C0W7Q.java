package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: renamed from: X.0W7Q, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7Q {
    public static int LIZ;
    public static long LIZIZ = -1;
    public static long LIZJ = -1;
    public static long LIZLLL = -1;
    public static String LJ = "";
    public static String LJFF = "";
    public static String LJI = "NoCarrier";
    public static String LJII = "";
    public static Locale LJIIIIZZ;

    public static final boolean LJIIL() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(C786410Ut5.j4("fb%s://applinks", Arrays.copyOf(new Object[]{FacebookSdk.LIZLLL()}, 1))));
            Context contextLIZJ = FacebookSdk.LIZJ();
            PackageManager packageManager = contextLIZJ.getPackageManager();
            String packageName = contextLIZJ.getPackageName();
            Iterator it2 = C2204961BRm.LJJJJZ(packageManager, intent, 65536, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"})).iterator();
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(packageName, ((ResolveInfo) it2.next()).activityInfo.packageName)) {
                    return true;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return false;
    }

    public static final void LIZJ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static final Map<String, Object> LIZLLL(JSONObject jSONObject) {
        int length;
        HashMap map = new HashMap();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames != null && (length = jSONArrayNames.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                try {
                    String string = jSONArrayNames.getString(i);
                    Object objLIZLLL = jSONObject.get(string);
                    if (objLIZLLL instanceof JSONObject) {
                        objLIZLLL = LIZLLL((JSONObject) objLIZLLL);
                    }
                    map.put(string, objLIZLLL);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return map;
    }

    public static final Map<String, String> LJ(JSONObject jSONObject) {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String strOptString = jSONObject.optString(next);
            if (strOptString != null) {
                map.put(next, strOptString);
            }
        }
        return map;
    }

    public static final void LJI(URLConnection uRLConnection) {
        if (uRLConnection != null && (uRLConnection instanceof HttpURLConnection)) {
            ((HttpURLConnection) uRLConnection).disconnect();
        }
    }

    public static final boolean LJIILIIL(Context context) {
        if (Build.VERSION.SDK_INT >= 27) {
            return context.getPackageManager().hasSystemFeature("android.hardware.type.pc");
        }
        String str = Build.DEVICE;
        if (str != null && new Regex(".+_cheets|cheets_.+").matches(str)) {
            return true;
        }
        return false;
    }

    public static boolean LJIILJJIL(Context context) {
        Method methodLJIIIZ = LJIIIZ("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
        if (methodLJIIIZ == null) {
            return false;
        }
        Object objLJIIJJI = LJIIJJI(null, methodLJIIIZ, context);
        if ((objLJIIJJI instanceof Integer) && Intrinsics.LJFF(objLJIIJJI, 0)) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILL(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJIILLIIL(Uri uri) {
        if (uri != null) {
            if (u.LJIJI("http", uri.getScheme(), true) || u.LJIJI("https", uri.getScheme(), true) || u.LJIJI("fbstaging", uri.getScheme(), true)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final List<String> LJIIZILJ(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                arrayList.add(jSONArray.getString(i));
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return arrayList;
    }

    public static final Bundle LJIJ(String str) {
        Bundle bundle = new Bundle();
        if (!LJIILL(str)) {
            if (str != null) {
                Object[] array = a0.LJJLIIIJILLIZJL(str, new String[]{"&"}, 0, 6).toArray(new String[0]);
                if (array != null) {
                    String[] strArr = (String[]) array;
                    int length = strArr.length;
                    int i = 0;
                    while (i < length) {
                        String str2 = strArr[i];
                        i++;
                        Object[] array2 = a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, 0, 6).toArray(new String[0]);
                        if (array2 != null) {
                            String[] strArr2 = (String[]) array2;
                            try {
                                if (strArr2.length == 2) {
                                    C786410Ut5.LJJJI(URLDecoder.decode(strArr2[0], "UTF-8"), URLDecoder.decode(strArr2[1], "UTF-8"), bundle);
                                } else if (strArr2.length == 1) {
                                    C786410Ut5.LJJJI(URLDecoder.decode(strArr2[0], "UTF-8"), "", bundle);
                                }
                            } catch (UnsupportedEncodingException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalStateException("Required value was null.");
            }
        }
        return bundle;
    }

    public static final Map<String, String> LJIJJ(Parcel parcel) {
        int i = parcel.readInt();
        if (i < 0) {
            return null;
        }
        HashMap map = new HashMap();
        if (i > 0) {
            int i2 = 0;
            do {
                i2++;
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string != null && string2 != null) {
                    map.put(string, string2);
                }
            } while (i2 < i);
        }
        return map;
    }

    public static void LIZIZ(Context context, String str) {
        String strLLIZ;
        int i;
        boolean z;
        CookieSyncManager.createInstance(context).sync();
        CookieManager cookieManagerA2 = C786410Ut5.A2();
        String strLLIZ2 = C2204961BRm.LLIZ(cookieManagerA2, str, new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"}));
        if (strLLIZ2 == null) {
            return;
        }
        int i2 = 0;
        Object[] array = a0.LJJLIIIJILLIZJL(strLLIZ2, new String[]{";"}, 0, 6).toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            int length = strArr.length;
            int i3 = 0;
            while (i3 < length) {
                String str2 = strArr[i3];
                i3++;
                Object[] array2 = a0.LJJLIIIJILLIZJL(str2, new String[]{"="}, i2, 6).toArray(new String[i2]);
                if (array2 != null) {
                    String[] strArr2 = (String[]) array2;
                    if (strArr2.length > 0) {
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
                            } else if (!z) {
                                break;
                            } else {
                                length2--;
                            }
                        }
                        C2204961BRm.LLJ(cookieManagerA2, str, Intrinsics.LJIIJJI("=;expires=Sat, 1 Jan 2000 00:00:01 UTC;", str3.subSequence(i4, length2 + 1).toString()), new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"}));
                        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"}))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
                            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
                        }
                    }
                    i2 = 0;
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            cookieManagerA2.removeExpiredCookie();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:14:0x0024
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final int LJFF(java.io.InputStream r6, java.io.OutputStream r7) {
        /*
            r1 = 0
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L24
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L24
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r4 = new byte[r0]     // Catch: java.lang.Throwable -> L21
            r3 = 0
            r2 = 0
        Lc:
            int r1 = r5.read(r4)     // Catch: java.lang.Throwable -> L21
            r0 = -1
            if (r1 == r0) goto L18
            r7.write(r4, r3, r1)     // Catch: java.lang.Throwable -> L21
            int r2 = r2 + r1
            goto Lc
        L18:
            r5.close()
            if (r6 == 0) goto L20
            r6.close()
        L20:
            return r2
        L21:
            r0 = move-exception
            r1 = r5
            goto L25
        L24:
            r0 = move-exception
        L25:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            if (r6 == 0) goto L32
            r6.close()
        L32:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W7Q.LJFF(java.io.InputStream, java.io.OutputStream):int");
    }

    public static final void LJIJI(Bundle bundle, Object obj) {
        if (obj instanceof Boolean) {
            bundle.putBoolean("media", ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof boolean[]) {
            bundle.putBooleanArray("media", (boolean[]) obj);
            return;
        }
        if (obj instanceof Double) {
            bundle.putDouble("media", ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof double[]) {
            bundle.putDoubleArray("media", (double[]) obj);
            return;
        }
        if (obj instanceof Integer) {
            bundle.putInt("media", ((Number) obj).intValue());
            return;
        }
        if (obj instanceof int[]) {
            bundle.putIntArray("media", (int[]) obj);
            return;
        }
        if (obj instanceof Long) {
            bundle.putLong("media", ((Number) obj).longValue());
            return;
        }
        if (obj instanceof long[]) {
            bundle.putLongArray("media", (long[]) obj);
        } else if (obj instanceof String) {
            C786410Ut5.LJJJI("media", (String) obj, bundle);
        } else {
            C786410Ut5.LJJJI("media", ((JSONArray) obj).toString(), bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x01dc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIL(android.content.Context r12, org.json.JSONObject r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 551
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0W7Q.LJIL(android.content.Context, org.json.JSONObject):void");
    }

    public static final void LJJ(Parcel parcel, Map<String, String> map) {
        if (map == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            parcel.writeString(key);
            parcel.writeString(value);
        }
    }

    public static final Uri LIZ(String str, String str2, Bundle bundle) {
        Object obj;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https");
        builder.authority(str);
        builder.path(str2);
        if (bundle != null) {
            for (String str3 : bundle.keySet()) {
                try {
                    obj = bundle.get(str3);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    obj = null;
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    obj = null;
                }
                if (obj instanceof String) {
                    builder.appendQueryParameter(str3, (String) obj);
                }
            }
        }
        return builder.build();
    }

    public static final Date LJII(Bundle bundle, String str, Date date) {
        Object obj;
        long jLongValue;
        if (bundle == null) {
            return null;
        }
        try {
            obj = bundle.get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            obj = null;
        } catch (OutOfMemoryError e2) {
            TryCatchGuardChecker.doCheck(e2);
            obj = null;
        }
        if (obj instanceof Long) {
            jLongValue = ((Number) obj).longValue();
        } else {
            if (obj instanceof String) {
                try {
                    jLongValue = Long.parseLong((String) obj);
                } catch (NumberFormatException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            return null;
        }
        if (jLongValue == 0) {
            return new Date(Long.MAX_VALUE);
        }
        return new Date(date.getTime() + (jLongValue * 1000));
    }

    public static final Method LJIIIIZZ(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Method LJIIIZ(String str, String str2, Class<?>... clsArr) {
        try {
            return LJIIIIZZ(Class.forName(str), str2, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final Object LJIIJ(String str, String str2, JSONObject jSONObject) throws JSONException {
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && ((!(objOpt instanceof String) || (objOpt = new JSONTokener((String) objOpt).nextValue()) != null) && !(objOpt instanceof JSONObject) && !(objOpt instanceof JSONArray))) {
            if (str2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.putOpt(str2, objOpt);
                return jSONObject2;
            }
            throw new C1BJO("Got an unexpected non-JSON object.");
        }
        return objOpt;
    }

    public static final Object LJIIJJI(Object obj, Method method, Object... objArr) {
        try {
            return C2204961BRm.a0(method, obj, Arrays.copyOf(objArr, objArr.length), new C0WZX("dzBzEgQ7XM/eWlgqCxuKcsSh7EXiloaN5G2vOGI=", new String[]{"019e5"}));
        } catch (IllegalAccessException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        } catch (InvocationTargetException e2) {
            TryCatchGuardChecker.doCheck(e2);
            return null;
        }
    }

    public static final void LJIJJLI(JSONObject jSONObject, C0W7P c0w7p, boolean z, Context context) throws JSONException {
        C1EPD c1epd = C1EPD.ServiceUpdateCompliance;
        if (!C1BJN.LIZJ(c1epd)) {
            jSONObject.put("anon_id", "");
        }
        jSONObject.put("application_tracking_enabled", !z);
        jSONObject.put("advertiser_id_collection_enabled", C1BJJ.LIZIZ());
        if (c0w7p != null) {
            if (C1BJN.LIZJ(c1epd) && (Build.VERSION.SDK_INT < 31 || !LJIILJJIL(context) || !c0w7p.LJ)) {
                jSONObject.put("anon_id", "");
            }
            if (c0w7p.LIZJ != null && (!C1BJN.LIZJ(c1epd) || Build.VERSION.SDK_INT < 31 || !LJIILJJIL(context) || !c0w7p.LJ)) {
                jSONObject.put("attribution", c0w7p.LIZJ);
            }
            if (c0w7p.LIZ() != null) {
                jSONObject.put("advertiser_id", c0w7p.LIZ());
                jSONObject.put("advertiser_tracking_enabled", !c0w7p.LJ);
            }
            if (!c0w7p.LJ && "".length() != 0) {
                jSONObject.put("ud", "");
            }
            String str = c0w7p.LIZLLL;
            if (str != null) {
                jSONObject.put("installer_package", str);
            }
        }
    }
}
