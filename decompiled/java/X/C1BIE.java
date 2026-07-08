package X;

import Y.ARunnableS107S0000000_34;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.FacebookSdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BIE, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BIE {
    public static final C1BIE LIZ;
    public static final List<C1BIF> LIZIZ;
    public static final List<C1BIF> LIZJ;
    public static final AtomicBoolean LIZLLL;
    public static final Integer[] LJ;

    static {
        C1BIE c1bie = new C1BIE();
        LIZ = c1bie;
        LIZIZ = c1bie.LIZ();
        ArrayList arrayList = null;
        if (!C807660VmG.LIZ(c1bie)) {
            try {
                ArrayList arrayListLJ = C1697810uHb.LJ(new C1BIF() { // from class: X.1BII
                    @Override // X.C1BIF
                    public final /* bridge */ /* synthetic */ String LIZIZ() {
                        return null;
                    }

                    @Override // X.C1BIF
                    public final String LIZJ() {
                        return "com.facebook.arstudio.player";
                    }
                });
                arrayListLJ.addAll(c1bie.LIZ());
                arrayList = arrayListLJ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZJ = arrayList;
        C1BIE c1bie2 = LIZ;
        c1bie2.getClass();
        if (!C807660VmG.LIZ(c1bie2)) {
            try {
                HashMap map = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new C1BIF() { // from class: X.1BIJ
                    @Override // X.C1BIF
                    public final /* bridge */ /* synthetic */ String LIZIZ() {
                        return null;
                    }

                    @Override // X.C1BIF
                    public final String LIZJ() {
                        return "com.facebook.orca";
                    }
                });
                List<C1BIF> list = LIZIZ;
                map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
                map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
                map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
                map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
                map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                map.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
        LIZLLL = new AtomicBoolean(false);
        LJ = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    public static final void LJIIJJI() {
        if (C807660VmG.LIZ(C1BIE.class)) {
            return;
        }
        try {
            if (LIZLLL.compareAndSet(false, true)) {
                FacebookSdk.LJ().execute(new ARunnableS107S0000000_34(8));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public final List<C1BIF> LIZ() {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            return C1697810uHb.LJ(new C1BIF() { // from class: X.1BIG
                @Override // X.C1BIF
                public final String LIZIZ() {
                    return "com.facebook.katana.ProxyAuth";
                }

                @Override // X.C1BIF
                public final String LIZJ() {
                    return "com.facebook.katana";
                }

                @Override // X.C1BIF
                public final void LJ() {
                    FacebookSdk.LIZJ().getApplicationInfo();
                }
            }, new C1BIF() { // from class: X.1BIH
                @Override // X.C1BIF
                public final String LIZIZ() {
                    return "com.facebook.katana.ProxyAuth";
                }

                @Override // X.C1BIF
                public final String LIZJ() {
                    return "com.facebook.wakizashi";
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.content.Intent LIZLLL(android.content.Context r5) {
        /*
            java.lang.Class<X.1BIE> r0 = X.C1BIE.class
            boolean r0 = X.C807660VmG.LIZ(r0)
            r4 = 0
            if (r0 == 0) goto La
            return r4
        La:
            java.util.List<X.1BIF> r0 = X.C1BIE.LIZIZ     // Catch: java.lang.Throwable -> L5a
            java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L5a
        L10:
            boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L59
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L5a
            X.1BIF r2 = (X.C1BIF) r2     // Catch: java.lang.Throwable -> L5a
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "com.facebook.platform.PLATFORM_SERVICE"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = r2.LIZJ()     // Catch: java.lang.Throwable -> L5a
            android.content.Intent r1 = r1.setPackage(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.String r0 = "android.intent.category.DEFAULT"
            android.content.Intent r2 = r1.addCategory(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.Class<X.1BIE> r0 = X.C1BIE.class
            boolean r0 = X.C807660VmG.LIZ(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L55
            if (r2 == 0) goto L55
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L51
            r0 = 0
            android.content.pm.ResolveInfo r0 = r1.resolveService(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L55
            android.content.pm.ServiceInfo r0 = r0.serviceInfo     // Catch: java.lang.Throwable -> L51
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L51
            boolean r0 = X.C2178608gC.LIZ(r5, r0)     // Catch: java.lang.Throwable -> L51
            if (r0 != 0) goto L56
            goto L55
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L5a
        L55:
            r2 = r4
        L56:
            if (r2 == 0) goto L10
            return r2
        L59:
            return r4
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BIE.LIZLLL(android.content.Context):android.content.Intent");
    }

    public static final UUID LJI(Intent intent) {
        String stringExtra;
        UUID uuidFromString = null;
        if (C807660VmG.LIZ(C1BIE.class) || intent == null) {
            return null;
        }
        try {
            if (LJIIJ(LJIIIZ(intent))) {
                Bundle bundleG3 = C786410Ut5.g3(intent, "com.facebook.platform.protocol.BRIDGE_ARGS");
                if (bundleG3 != null) {
                    stringExtra = bundleG3.getString("action_id");
                } else {
                    stringExtra = null;
                }
            } else {
                try {
                    stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    stringExtra = null;
                }
            }
            if (stringExtra != null) {
                try {
                    uuidFromString = UUID.fromString(stringExtra);
                    return uuidFromString;
                } catch (IllegalArgumentException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
            }
            return uuidFromString;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return uuidFromString;
        }
    }

    public static final Bundle LJIIIIZZ(Intent intent) {
        Bundle extras = null;
        if (C807660VmG.LIZ(C1BIE.class)) {
            return null;
        }
        try {
            if (!LJIIJ(LJIIIZ(intent))) {
                try {
                    extras = intent.getExtras();
                    return extras;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return extras;
                }
            }
            return C786410Ut5.g3(intent, "com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return extras;
        }
    }

    public static final int LJIIIZ(Intent intent) {
        if (C807660VmG.LIZ(C1BIE.class)) {
            return 0;
        }
        try {
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0;
        }
    }

    public static final boolean LJIIJ(int i) {
        if (C807660VmG.LIZ(C1BIE.class)) {
            return false;
        }
        try {
            if (!C13LQ.LJIILLIIL(Integer.valueOf(i), LJ) || i < 20140701) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3 A[Catch: all -> 0x00b5, TRY_ENTER, TryCatch #1 {all -> 0x00b5, blocks: (B:5:0x000a, B:40:0x00b1, B:41:0x00b4, B:32:0x00a3, B:9:0x0040, B:7:0x0021), top: B:45:0x000a, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088 A[EXC_TOP_SPLITTER, LOOP:0: B:51:0x0088->B:27:0x008e, LOOP_START, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.TreeSet<java.lang.Integer> LJFF(X.C1BIF r13) {
        /*
            r12 = this;
            java.lang.String r3 = "version"
            boolean r0 = X.C807660VmG.LIZ(r12)
            r8 = 0
            if (r0 == 0) goto La
            return r8
        La:
            java.util.TreeSet r2 = new java.util.TreeSet     // Catch: java.lang.Throwable -> Lb5
            r2.<init>()     // Catch: java.lang.Throwable -> Lb5
            android.content.Context r0 = com.facebook.FacebookSdk.LIZJ()     // Catch: java.lang.Throwable -> Lb5
            android.content.ContentResolver r5 = r0.getContentResolver()     // Catch: java.lang.Throwable -> Lb5
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = X.C807660VmG.LIZ(r12)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L43
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = "content://"
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = r13.LIZJ()     // Catch: java.lang.Throwable -> L3f
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = ".provider.PlatformProvider/versions"
            r1.append(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L3f
            android.net.Uri r6 = android.net.Uri.parse(r0)     // Catch: java.lang.Throwable -> L3f
            goto L44
        L3f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb5
        L43:
            r6 = r8
        L44:
            android.content.Context r0 = com.facebook.FacebookSdk.LIZJ()     // Catch: java.lang.Throwable -> La7
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch: java.lang.Throwable -> La7
            java.lang.String r1 = r13.LIZJ()     // Catch: java.lang.Throwable -> La7
            java.lang.String r0 = ".provider.PlatformProvider"
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.LJIIJJI(r0, r1)     // Catch: java.lang.Throwable -> La7
            r0 = 0
            android.content.pm.ProviderInfo r0 = r4.resolveContentProvider(r1, r0)     // Catch: java.lang.RuntimeException -> L5c java.lang.Throwable -> La7
            goto L61
        L5c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
            r0 = r8
        L61:
            if (r0 == 0) goto La0
            X.0WZX r11 = new X.0WZX     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.SecurityException -> L7c java.lang.NullPointerException -> L81 java.lang.Throwable -> La7
            java.lang.String r1 = "dzBzEgQ7XM/eWlgqCxuKcsSh7EXilp2Y+WiwKUuZyl3xwaKd"
            java.lang.String r0 = "019e5"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.SecurityException -> L7c java.lang.NullPointerException -> L81 java.lang.Throwable -> La7
            r11.<init>(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.SecurityException -> L7c java.lang.NullPointerException -> L81 java.lang.Throwable -> La7
            r9 = r8
            r10 = r8
            android.database.Cursor r1 = X.C2204961BRm.LJJJ(r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.IllegalArgumentException -> L77 java.lang.SecurityException -> L7c java.lang.NullPointerException -> L81 java.lang.Throwable -> La7
            goto L86
        L77:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
            goto L85
        L7c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
            goto L85
        L81:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La7
        L85:
            r1 = r8
        L86:
            if (r1 == 0) goto La1
        L88:
            boolean r0 = r1.moveToNext()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto La1
            int r0 = r1.getColumnIndex(r3)     // Catch: java.lang.Throwable -> L9e
            int r0 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L9e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L9e
            r2.add(r0)     // Catch: java.lang.Throwable -> L9e
            goto L88
        L9e:
            r0 = move-exception
            goto La9
        La0:
            r1 = r8
        La1:
            if (r1 == 0) goto La6
            r1.close()     // Catch: java.lang.Throwable -> Lb5
        La6:
            return r2
        La7:
            r0 = move-exception
            r1 = r8
        La9:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lad
            goto Laf
        Lad:
            r0 = move-exception
            goto La9
        Laf:
            if (r1 == 0) goto Lb4
            r1.close()     // Catch: java.lang.Throwable -> Lb5
        Lb4:
            throw r0     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BIE.LJFF(X.1BIF):java.util.TreeSet");
    }

    public final C1BIK LJII(List<? extends C1BIF> list, int[] iArr) {
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            LJIIJJI();
            if (list == null) {
                C1BIK c1bik = new C1BIK();
                c1bik.LIZ = -1;
                return c1bik;
            }
            for (C1BIF c1bif : list) {
                TreeSet<Integer> treeSet = c1bif.LIZ;
                int iIntValue = 0;
                if (treeSet == null || !Intrinsics.LJFF(Boolean.valueOf(treeSet.isEmpty()), Boolean.FALSE)) {
                    c1bif.LIZ(false);
                }
                TreeSet<Integer> treeSet2 = c1bif.LIZ;
                if (!C807660VmG.LIZ(C1BIE.class)) {
                    try {
                        iIntValue = LJ[0].intValue();
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                int iLIZIZ = LIZIZ(treeSet2, iIntValue, iArr);
                if (iLIZIZ != -1) {
                    C1BIK c1bik2 = new C1BIK();
                    c1bik2.LIZ = iLIZIZ;
                    return c1bik2;
                }
            }
            C1BIK c1bik3 = new C1BIK();
            c1bik3.LIZ = -1;
            return c1bik3;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if ((r5 % 2) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        return java.lang.Math.min(r3, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LIZIZ(java.util.TreeSet<java.lang.Integer> r8, int r9, int[] r10) {
        /*
            java.lang.Class<X.1BIE> r0 = X.C1BIE.class
            boolean r0 = X.C807660VmG.LIZ(r0)
            r7 = 0
            if (r0 == 0) goto La
            return r7
        La:
            r6 = -1
            if (r8 != 0) goto Le
            return r6
        Le:
            int r0 = r10.length     // Catch: java.lang.Throwable -> L4a
            int r5 = r0 + (-1)
            java.util.Iterator r4 = r8.descendingIterator()     // Catch: java.lang.Throwable -> L4a
            r3 = -1
        L16:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> L4a
            if (r0 == 0) goto L49
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L4a
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L4a
            int r3 = java.lang.Math.max(r3, r0)     // Catch: java.lang.Throwable -> L4a
        L2a:
            if (r5 < 0) goto L48
            r1 = r10[r5]     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L4a
            if (r1 <= r0) goto L37
            int r5 = r5 + (-1)
            goto L2a
        L37:
            r1 = r10[r5]     // Catch: java.lang.Throwable -> L4a
            int r0 = r2.intValue()     // Catch: java.lang.Throwable -> L4a
            if (r1 != r0) goto L16
            int r0 = r5 % 2
            if (r0 != 0) goto L49
            int r6 = java.lang.Math.min(r3, r9)     // Catch: java.lang.Throwable -> L4a
            return r6
        L48:
            return r6
        L49:
            return r6
        L4a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1BIE.LIZIZ(java.util.TreeSet, int, int[]):int");
    }

    public static final Intent LJ(Intent intent, Bundle bundle, C1BJO c1bjo) {
        Bundle bundle2;
        if (C807660VmG.LIZ(C1BIE.class)) {
            return null;
        }
        try {
            UUID uuidLJI = LJI(intent);
            if (uuidLJI == null) {
                return null;
            }
            Intent intent2 = new Intent();
            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", LJIIIZ(intent));
            Bundle bundle3 = new Bundle();
            C786410Ut5.LJJJI("action_id", uuidLJI.toString(), bundle3);
            if (c1bjo != null) {
                if (!C807660VmG.LIZ(C1BIE.class)) {
                    try {
                        bundle2 = new Bundle();
                        C786410Ut5.LJJJI("error_description", c1bjo.toString(), bundle2);
                        if (c1bjo instanceof C1BIN) {
                            C786410Ut5.LJJJI("error_type", "UserCanceled", bundle2);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        bundle2 = null;
                    }
                    C786410Ut5.LJJIIZI(bundle3, bundle2, "error");
                } else {
                    bundle2 = null;
                    C786410Ut5.LJJIIZI(bundle3, bundle2, "error");
                }
            }
            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
            if (bundle != null) {
                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
            }
            return intent2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            return null;
        }
    }

    public final Intent LIZJ(C1BIF c1bif, String str, Collection collection, String str2, boolean z, C1BIP c1bip, String str3, String str4, boolean z2, String str5, boolean z3, EnumC824980WXw enumC824980WXw, boolean z4, boolean z5, String str6) {
        boolean z6;
        if (C807660VmG.LIZ(this)) {
            return null;
        }
        try {
            String strLIZIZ = c1bif.LIZIZ();
            if (strLIZIZ == null) {
                return null;
            }
            Intent intentPutExtra = new Intent().setClassName(c1bif.LIZJ(), strLIZIZ).putExtra("client_id", str);
            C786410Ut5.E2();
            intentPutExtra.putExtra("facebook_sdk_version", "17.0.0");
            if (collection == null || collection.isEmpty()) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (!z6) {
                intentPutExtra.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!C0W7Q.LJIILL(str2)) {
                intentPutExtra.putExtra("e2e", str2);
            }
            intentPutExtra.putExtra("state", str3);
            intentPutExtra.putExtra("response_type", c1bif.LIZLLL());
            intentPutExtra.putExtra("nonce", str6);
            intentPutExtra.putExtra("return_scopes", "true");
            if (z) {
                intentPutExtra.putExtra("default_audience", c1bip.getNativeProtocolAudience());
            }
            intentPutExtra.putExtra("legacy_override", C786410Ut5.D2());
            intentPutExtra.putExtra("auth_type", str4);
            if (z2) {
                intentPutExtra.putExtra("fail_on_logged_out", true);
            }
            intentPutExtra.putExtra("messenger_page_id", str5);
            intentPutExtra.putExtra("reset_messenger_state", z3);
            if (z4) {
                intentPutExtra.putExtra("fx_app", enumC824980WXw.toString());
            }
            if (z5) {
                intentPutExtra.putExtra("skip_dedupe", true);
            }
            return intentPutExtra;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }
}
