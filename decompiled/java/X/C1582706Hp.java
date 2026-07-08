package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1582706Hp {
    public static final C06DF LJII;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LJIIIIZZ;
    public static final C1582706Hp LJIIIZ;
    public static final C823170WQx<String> LJIIJ;
    public final Function0<Keva> LIZ;
    public final Function1<String, String> LIZIZ;
    public final C054G LIZJ;
    public final AtomicBoolean LIZLLL;
    public final List<InterfaceC1583506Hx> LJ;
    public final C1DEV LJFF;
    public volatile C1598406Nq LJI;

    /* JADX WARN: Type inference failed for: r0v3, types: [X.06DF] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1582706Hp.class, "ttDispatchers", "getTtDispatchers()Lcom/ss/android/ugc/aweme/im/saas/host/api/utils/IMDispatchers;", 0);
        C13LE.LIZ.getClass();
        LJIIIIZZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LJII = new Object() { // from class: X.06DF
        };
        LJIIIZ = new C1582706Hp(null);
        LJIIJ = new C823170WQx<>();
    }

    public C1582706Hp() {
        this(null);
    }

    public C1582706Hp(Object obj) {
        AFwS187S0000000_2 aFwS187S0000000_2 = AFwS187S0000000_2.get$arr$(874);
        AFwS229S0000000_2 aFwS229S0000000_2 = AFwS229S0000000_2.get$arr$(601);
        this.LIZ = aFwS187S0000000_2;
        this.LIZIZ = aFwS229S0000000_2;
        C1598406Nq c1598406Nq = this.LJI;
        if (c1598406Nq == null) {
            synchronized (this) {
                c1598406Nq = this.LJI;
                if (c1598406Nq == null) {
                    c1598406Nq = (C1598406Nq) C1807670x8n.LLLLLJIL();
                    this.LJI = c1598406Nq;
                }
            }
        }
        this.LIZJ = C2296808zG.LIZ(c1598406Nq.LIZ.plus(C2296908zH.LIZ()));
        this.LIZLLL = new AtomicBoolean(false);
        this.LJ = new ArrayList();
        this.LJFF = C2191201ApK.LIZ();
        ((C1400340mXo) C0I0B.LJFF.LIZ()).LIZLLL(new InterfaceC908170Zjz() { // from class: X.06Hu
            @Override // X.InterfaceC908170Zjz
            public final void onAccountResult(int i, boolean z, int i2, User user) {
                if (z) {
                    if (i == 2 || i == 3) {
                        C23118094a.LJ(this.LL.LIZJ.LL);
                        C1582706Hp.LJIIJ.clear();
                        this.LL.LIZLLL.compareAndSet(false, false);
                    }
                }
            }
        });
    }

    public static String LIZ(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ(String str, String str2) {
        long jLJII = C0YNP.LJII(str);
        if (((C1400340mXo) C0I0B.LJFF.LIZ()).LIZJ(String.valueOf(jLJII))) {
            return false;
        }
        if (((Number) C1583406Hw.LIZ.getValue()).intValue() == 1 && jLJII < 0) {
            return false;
        }
        String string = this.LIZ.invoke().getString(LIZ(str, str2), CardStruct.IStatusCode.DEFAULT);
        C23250099c.LIZLLL(this.LIZJ, null, null, new C1582406Hm(this, str, jLJII, str2, string, null), 3);
        return Intrinsics.LJFF(string, "1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ba  */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.util.List<java.lang.Long> r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1582706Hp.LIZJ(java.util.List, X.05Vn):java.lang.Object");
    }
}
