package Y;

import X.C013C;
import X.C080U;
import X.C09N1;
import X.C09N5;
import X.C09NT;
import X.C0VSJ;
import X.C0VSP;
import X.C1AF0;
import X.C1C7U;
import X.C2188308hl;
import X.C2188408hm;
import X.C2400409as;
import X.C2475009mu;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS67S1200000_3 implements Callable {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS67S1200000_3 aCallableS67S1200000_3) throws Throwable {
        C1C7U.LIZ("FileCopyUtilsKt@2056.copyVideoToMediaLibrary$1");
        try {
            if (C2400409as.LJIIIIZZ((Context) aCallableS67S1200000_3.l1, new C0VSJ(aCallableS67S1200000_3.s0).getName()) == null) {
                Uri uriLIZLLL = C2400409as.LIZLLL((Context) aCallableS67S1200000_3.l1, new C0VSJ(aCallableS67S1200000_3.s0).getName());
                if (uriLIZLLL != null) {
                    Context context = (Context) aCallableS67S1200000_3.l1;
                    String str = aCallableS67S1200000_3.s0;
                    C09N1.LIZIZ(new C0VSP(str), C09NT.LJI(context.getContentResolver(), uriLIZLLL));
                }
                String strLIZ = C09N5.LIZ((Context) aCallableS67S1200000_3.l1, uriLIZLLL);
                if (strLIZ != null) {
                    C2400409as.LJIIJ((Context) aCallableS67S1200000_3.l1, strLIZ);
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ((C013C) aCallableS67S1200000_3.l2).element = false;
            C1AF0.LJFF(e, "open share video failed");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FileCopyUtilsKt@2056.copyVideoToMediaLibrary$1");
        return unit;
    }

    public static final Object call$1(ACallableS67S1200000_3 aCallableS67S1200000_3) {
        String str = aCallableS67S1200000_3.s0;
        Bitmap bitmap = (Bitmap) aCallableS67S1200000_3.l1;
        Runnable runnable = (Runnable) aCallableS67S1200000_3.l2;
        C1C7U.LIZ("EffectVideoCoverPresenter@1daf.trySaveCoverToFileInBackground$1L");
        if (!TextUtils.isEmpty(str) && bitmap != null) {
            C2475009mu.LJFF(60, Bitmap.CompressFormat.PNG, bitmap, new C0VSJ(str));
        }
        if (runnable != null) {
            runnable.run();
        }
        C1C7U.LIZIZ("EffectVideoCoverPresenter@1daf.trySaveCoverToFileInBackground$1L");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object call$2(Y.ACallableS67S1200000_3 r12) {
        /*
            java.lang.String r11 = "SearchDualStreamMobHelper@b2f5.appendDualStreamMobToAllAwemes$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r0 = r12.l1
            java.util.List r0 = (java.util.List) r0
            java.util.List r4 = X.C0PN8.LJJI(r0)
            java.lang.String r5 = r12.s0
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r3 = r4.iterator()
            r10 = 0
        L16:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r2 = r3.next()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = (com.ss.android.ugc.aweme.feed.model.Aweme) r2
            java.lang.String r0 = r2.getAid()
            boolean r1 = X.C123100dR.LIZ(r0)
            java.lang.String r0 = r2.getAid()
            boolean r0 = r0.equals(r5)
            r0 = r0 & r1
            if (r0 == 0) goto L8b
            if (r10 < 0) goto L92
            X.0PIF r0 = X.C0PIF.LIZ
            java.lang.Object r1 = r12.l2
            java.lang.Integer r1 = (java.lang.Integer) r1
            r0.getClass()
            r9 = 0
            if (r1 == 0) goto L89
            r1.intValue()
            java.util.Map<java.lang.Integer, java.lang.Integer> r0 = X.C0PIF.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L89
            java.lang.String r8 = r0.toString()
        L56:
            java.util.Iterator r7 = r4.iterator()
            r6 = 0
        L5b:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L92
            java.lang.Object r5 = r7.next()
            int r4 = r6 + 1
            if (r6 < 0) goto L8e
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = (com.ss.android.ugc.aweme.feed.model.Aweme) r5
            X.0PIF r3 = X.C0PIF.LIZ
            if (r8 != 0) goto L87
            java.lang.String r2 = ""
        L71:
            if (r6 != r10) goto L81
            r1 = 0
        L74:
            int r6 = r6 - r10
            int r0 = java.lang.Math.abs(r6)
            r3.getClass()
            X.C0PIF.LJFF(r1, r0, r5, r2)
            r6 = r4
            goto L5b
        L81:
            if (r6 >= r10) goto L85
            r1 = 2
            goto L74
        L85:
            r1 = 1
            goto L74
        L87:
            r2 = r8
            goto L71
        L89:
            r8 = r9
            goto L56
        L8b:
            int r10 = r10 + 1
            goto L16
        L8e:
            X.C1697810uHb.LJIJI()
            throw r9
        L92:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACallableS67S1200000_3.call$2(Y.ACallableS67S1200000_3):java.lang.Object");
    }

    public static final Object call$3(ACallableS67S1200000_3 aCallableS67S1200000_3) {
        C2188408hm c2188408hm;
        C1C7U.LIZ("PrefetchNetworkExecutor@3761.get$1");
        try {
            ArrayList arrayList = new ArrayList();
            if (((Map) aCallableS67S1200000_3.l1) != null && (!r0.isEmpty())) {
                for (Map.Entry entry : ((Map) aCallableS67S1200000_3.l1).entrySet()) {
                    arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
                }
            }
            c2188408hm = new C2188408hm(true, ((C2188308hl) aCallableS67S1200000_3.l2).LIZ.doGet(aCallableS67S1200000_3.s0, Collections.emptyMap(), arrayList).execute().LIZIZ.getBytes(Charsets.UTF_8), null);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2188408hm = new C2188408hm(false, null, th);
        }
        C1C7U.LIZIZ("PrefetchNetworkExecutor@3761.get$1");
        return c2188408hm;
    }

    public ACallableS67S1200000_3(Bitmap bitmap, String str, int i) {
        this.$t = i;
        this.s0 = str;
        this.l1 = bitmap;
        this.l2 = null;
    }

    public ACallableS67S1200000_3(Object obj, String str, Object obj2, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
        this.l2 = obj2;
    }
}
