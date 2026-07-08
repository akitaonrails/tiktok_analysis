package X;

import Y.ACallableS21S2100000_20;
import Y.ACallableS425S0100000_20;
import Y.ACallableS61S1100000_8;
import Y.ACallableS70S1200000_20;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.content.res.Resources;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipInputStream;

/* JADX INFO: renamed from: X.0jmh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294250jmh {
    public static final Map<String, C1292030jj7<C1294720jnS>> LIZ = new HashMap();
    public static final Set<InterfaceC1294290jml> LIZIZ = new HashSet();
    public static final byte[] LIZJ = {80, 75, 3, 4};

    public static void LJIILLIIL(boolean z) {
        ArrayList arrayList = new ArrayList(LIZIZ);
        for (int i = 0; i < arrayList.size(); i++) {
            ((InterfaceC1294290jml) ListProtector.get(arrayList, i)).LIZ();
        }
    }

    public static C1292030jj7<C1294720jnS> LIZIZ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return LIZ(strLIZIZ, new ACallableS21S2100000_20(C786410Ut5.N3(context), str, strLIZIZ, 1), null);
    }

    public static C1292000jj4<C1294720jnS> LIZJ(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("asset_");
        sbLIZ.append(str);
        return LIZLLL(context, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static C1292030jj7<C1294720jnS> LJ(InputStream inputStream, String str) {
        return LIZ(str, new ACallableS61S1100000_8(inputStream, str, 1), new ARunnableS120S0100000_20(inputStream, 23));
    }

    public static C1292000jj4<C1294720jnS> LJFF(InputStream inputStream, String str) {
        try {
            C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZJ(inputStream));
            String[] strArr = AbstractC1295900jpM.LLILZIL;
            C1292000jj4<C1294720jnS> c1292000jj4LJI = LJI(new C1296380jq8(c1496670p3B), str, true);
            C1294350jmr.LIZIZ(inputStream);
            return c1292000jj4LJI;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1294350jmr.LIZIZ(inputStream);
            throw th;
        }
    }

    public static C1292030jj7<C1294720jnS> LJII(final String str, final String str2) {
        return LIZ(str2, new Callable() { // from class: X.0jmi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str3 = str;
                String str4 = str2;
                C1C7U.LIZ("LottieCompositionFactory@f22f.fromJsonString$1L");
                C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZJ(new ByteArrayInputStream(str3.getBytes())));
                String[] strArr = AbstractC1295900jpM.LLILZIL;
                C1292000jj4 c1292000jj4LJI = C1294250jmh.LJI(new C1296380jq8(c1496670p3B), str4, true);
                C1C7U.LIZIZ("LottieCompositionFactory@f22f.fromJsonString$1L");
                return c1292000jj4LJI;
            }
        }, null);
    }

    public static C1292030jj7 LJIIIIZZ(int i, Context context) {
        return LJIIIZ(context, i, LJIIZILJ(i, context));
    }

    public static C1292030jj7<C1294720jnS> LJIIJJI(Context context, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("url_");
        sbLIZ.append(str);
        return LJIIL(context, str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public static String LJIIZILJ(int i, Context context) {
        String str;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rawRes");
        if ((context.getResources().getConfiguration().uiMode & 48) == 32) {
            str = "_night_";
        } else {
            str = "_day_";
        }
        sbLIZ.append(str);
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C1292030jj7<C1294720jnS> LIZ(final String str, Callable<C1292000jj4<C1294720jnS>> callable, Runnable runnable) {
        C1294720jnS c1294720jnSLIZJ;
        C1292030jj7<C1294720jnS> c1292030jj7 = null;
        if (str == null) {
            c1294720jnSLIZJ = null;
        } else {
            c1294720jnSLIZJ = C2248608rU.LIZIZ.LIZ.LIZJ(str);
        }
        if (c1294720jnSLIZJ != null) {
            c1292030jj7 = new C1292030jj7<>(new ACallableS425S0100000_20(c1294720jnSLIZJ, 2), false);
        }
        if (str != null) {
            HashMap map = (HashMap) LIZ;
            if (map.containsKey(str)) {
                c1292030jj7 = (C1292030jj7) map.get(str);
            }
        }
        if (c1292030jj7 != null) {
            if (runnable != null) {
                runnable.run();
            }
            return c1292030jj7;
        }
        C1292030jj7<C1294720jnS> c1292030jj72 = new C1292030jj7<>(callable, false);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            c1292030jj72.LIZIZ(new InterfaceC1292040jj8() { // from class: X.0jmk
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    String str2 = str;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    HashMap map2 = (HashMap) C1294250jmh.LIZ;
                    map2.remove(str2);
                    atomicBoolean2.set(true);
                    if (map2.size() == 0) {
                        C1294250jmh.LJIILLIIL(true);
                    }
                }
            });
            c1292030jj72.LIZ(new InterfaceC1292040jj8() { // from class: X.0jmj
                @Override // X.InterfaceC1292040jj8
                public final void onResult(Object obj) {
                    String str2 = str;
                    AtomicBoolean atomicBoolean2 = atomicBoolean;
                    HashMap map2 = (HashMap) C1294250jmh.LIZ;
                    map2.remove(str2);
                    atomicBoolean2.set(true);
                    if (map2.size() == 0) {
                        C1294250jmh.LJIILLIIL(true);
                    }
                }
            });
            if (!atomicBoolean.get()) {
                HashMap map2 = (HashMap) LIZ;
                map2.put(str, c1292030jj72);
                if (map2.size() == 1) {
                    LJIILLIIL(false);
                }
            }
        }
        return c1292030jj72;
    }

    public static C1292000jj4<C1294720jnS> LIZLLL(Context context, String str, String str2) {
        try {
            if (!str.endsWith(".zip") && !str.endsWith(".lottie")) {
                return LJFF(context.getAssets().open(str), str2);
            }
            return LJIILJJIL(context, new ZipInputStream(context.getAssets().open(str)), str2);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return new C1292000jj4<>(e);
        }
    }

    public static C1292000jj4 LJI(C1296380jq8 c1296380jq8, String str, boolean z) {
        try {
            try {
                C1294720jnS c1294720jnSLIZ = C1294700jnQ.LIZ(c1296380jq8);
                if (str != null) {
                    C2248608rU.LIZIZ.LIZ.LIZLLL(str, c1294720jnSLIZ);
                }
                C1292000jj4 c1292000jj4 = new C1292000jj4(c1294720jnSLIZ);
                if (z) {
                    C1294350jmr.LIZIZ(c1296380jq8);
                }
                return c1292000jj4;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1292000jj4 c1292000jj42 = new C1292000jj4(e);
                if (z) {
                    C1294350jmr.LIZIZ(c1296380jq8);
                }
                return c1292000jj42;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (z) {
                C1294350jmr.LIZIZ(c1296380jq8);
            }
            throw th;
        }
    }

    public static C1292030jj7<C1294720jnS> LJIIIZ(Context context, final int i, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context contextN3 = C786410Ut5.N3(context);
        return LIZ(str, new Callable() { // from class: X.0jjO
            @Override // java.util.concurrent.Callable
            public final Object call() {
                WeakReference weakReference2 = weakReference;
                Context context2 = contextN3;
                int i2 = i;
                String str2 = str;
                C1C7U.LIZ("LottieCompositionFactory@f22f.fromRawRes$1L");
                Context context3 = (Context) weakReference2.get();
                if (context3 != null) {
                    context2 = context3;
                }
                C1292000jj4<C1294720jnS> c1292000jj4LJIIJ = C1294250jmh.LJIIJ(context2, i2, str2);
                C1C7U.LIZIZ("LottieCompositionFactory@f22f.fromRawRes$1L");
                return c1292000jj4LJIIJ;
            }
        }, null);
    }

    public static C1292000jj4<C1294720jnS> LJIIJ(Context context, int i, String str) {
        Boolean bool;
        try {
            C1496670p3B c1496670p3B = new C1496670p3B(C1496330p2d.LIZJ(context.getResources().openRawResource(i)));
            try {
                C1496670p3B c1496670p3BLIZIZ = c1496670p3B.LIZIZ();
                byte[] bArr = LIZJ;
                int length = bArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (c1496670p3BLIZIZ.readByte() != bArr[i2]) {
                            bool = Boolean.FALSE;
                            break;
                        }
                        i2++;
                    } else {
                        c1496670p3BLIZIZ.close();
                        bool = Boolean.TRUE;
                        break;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1292050jj9.LIZ.getClass();
                bool = Boolean.FALSE;
            } catch (NoSuchMethodError e2) {
                TryCatchGuardChecker.doCheck(e2);
                bool = Boolean.FALSE;
            }
            if (bool.booleanValue()) {
                return LJIILJJIL(context, new ZipInputStream(new C1496680p3C(c1496670p3B)), str);
            }
            return LJFF(new C1496680p3C(c1496670p3B), str);
        } catch (Resources.NotFoundException e3) {
            TryCatchGuardChecker.doCheck(e3);
            return new C1292000jj4<>(e3);
        }
    }

    public static C1292030jj7<C1294720jnS> LJIIL(Context context, String str, String str2) {
        return LIZ(str2, new ACallableS21S2100000_20(context, str, str2, 0), null);
    }

    public static C1292030jj7<C1294720jnS> LJIILIIL(Context context, ZipInputStream zipInputStream, String str) {
        return LIZ(str, new ACallableS70S1200000_20(context, zipInputStream, str, 0), new ARunnableS120S0100000_20(zipInputStream, 22));
    }

    public static C1292000jj4 LJIILJJIL(Context context, ZipInputStream zipInputStream, String str) {
        try {
            C1292000jj4<C1294720jnS> c1292000jj4LJIILL = LJIILL(context, zipInputStream, str);
            C1294350jmr.LIZIZ(zipInputStream);
            return c1292000jj4LJIILL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1294350jmr.LIZIZ(zipInputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010a A[Catch: IOException -> 0x0267, TryCatch #0 {IOException -> 0x0267, blocks: (B:3:0x000a, B:6:0x0014, B:8:0x0020, B:9:0x0023, B:10:0x0028, B:12:0x0034, B:13:0x0038, B:15:0x0044, B:16:0x005d, B:19:0x0067, B:21:0x006f, B:23:0x0077, B:25:0x007f, B:27:0x0087, B:29:0x008f, B:30:0x0093, B:46:0x0100, B:48:0x010a, B:49:0x0126, B:45:0x00dd, B:50:0x012b, B:31:0x00b1, B:37:0x00c8, B:39:0x00cd, B:43:0x00db, B:42:0x00d5), top: B:99:0x000a, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1292000jj4<X.C1294720jnS> LJIILL(android.content.Context r12, java.util.zip.ZipInputStream r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1294250jmh.LJIILL(android.content.Context, java.util.zip.ZipInputStream, java.lang.String):X.0jj4");
    }
}
