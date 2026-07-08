package X;

import android.util.LruCache;
import com.bytedance.keva.Keva;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.IAccountUserService;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS224S0000000_33;

/* JADX INFO: renamed from: X.1A7a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC2174161A7a implements C0SKI {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public boolean LJFF;
    public boolean LJI;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(602));
    public final C01GW LJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(599));
    public final C01GW LJII = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(601));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(600));

    public abstract EnumC993490bxb LJFF();

    public abstract boolean LJIIIIZZ();

    public abstract int LJIIIZ();

    public final Keva LJI() {
        return (Keva) this.LIZLLL.getValue();
    }

    @Override // X.C0SKI
    public final String LJ(String str) {
        Integer num = (Integer) ((LruCache) this.LJII.getValue()).get(str);
        if (num != null) {
            return num.toString();
        }
        return null;
    }

    public final String LJII(String str) {
        if (((IAccountUserService) this.LJ.getValue()).isLogin()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(((IAccountUserService) this.LJ.getValue()).getCurUserId());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return str;
    }

    @Override // X.C0SKI
    public final void LIZ(String str, String str2) {
        boolean z;
        if (!LIZLLL(str, str2)) {
            return;
        }
        String strLJII = LJII(this.LIZ);
        String strLJII2 = LJII(this.LIZIZ);
        long j = LJI().getLong(strLJII, 0L) + 1;
        LJI().storeLong(strLJII, j);
        LJI().storeLong(strLJII2, NetworkUtils.getServerTimeMills());
        if (j < ((Number) C04VF.LIZ.getValue()).intValue()) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
    }

    @Override // X.C0SKI
    public final void LIZIZ(String str, boolean z) {
        if (str != null) {
            ((LruCache) this.LJIIIIZZ.getValue()).put(str, Boolean.valueOf(z));
        }
    }

    @Override // X.C0SKI
    public final void LIZJ(String str, String str2) {
        if (!LIZLLL(str, str2)) {
            return;
        }
        this.LJFF = true;
        LJI().storeBoolean(LJII(this.LIZJ), true);
    }

    @Override // X.C0SKI
    public final boolean LIZLLL(String str, String str2) {
        AbstractC1556910qcL abstractC1556910qcLInvoke;
        C2174211A7f c2174211A7f = C2174211A7f.LIZ;
        boolean z = this.LJI;
        LruCache lruCache = (LruCache) this.LJIIIIZZ.getValue();
        boolean zLJIIIIZZ = LJIIIIZZ();
        EnumC993490bxb enumC993490bxbLJFF = LJFF();
        boolean z2 = this.LJFF;
        c2174211A7f.getClass();
        C2174251A7j c2174251A7j = new C2174251A7j(str, str2, z, lruCache, zLJIIIIZZ, enumC993490bxbLJFF, z2);
        Iterator<Function1<C2174251A7j, AbstractC1556910qcL>> it2 = C2174211A7f.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                abstractC1556910qcLInvoke = it2.next().invoke(c2174251A7j);
                if (abstractC1556910qcLInvoke != null) {
                    break;
                }
            } else {
                abstractC1556910qcLInvoke = new AbstractC1556910qcL() { // from class: X.0qcM
                };
                break;
            }
        }
        if (abstractC1556910qcLInvoke instanceof C1556920qcM) {
            return true;
        }
        if (abstractC1556910qcLInvoke instanceof C1556900qcK) {
            if (C123100dR.LIZ(str)) {
                ((LruCache) this.LJII.getValue()).put(str, Integer.valueOf(((C1556900qcK) abstractC1556910qcLInvoke).LIZIZ));
                return false;
            }
            return false;
        }
        throw new C1954807lC();
    }

    public AbstractC2174161A7a(String str, String str2, String str3) {
        boolean z;
        boolean z2;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LJI = true;
        String strLJII = LJII(str2);
        String strLJII2 = LJII(str);
        String strLJII3 = LJII(str3);
        long j = LJI().getLong(strLJII, 0L);
        long serverTimeMills = NetworkUtils.getServerTimeMills();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(12, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.set(11, 23);
        calendar.set(13, 59);
        calendar.set(12, 59);
        calendar.set(14, 999);
        C1387320mCo c1387320mCo = new C1387320mCo(timeInMillis, calendar.getTimeInMillis());
        if (serverTimeMills >= c1387320mCo.LIZ && serverTimeMills <= c1387320mCo.LIZIZ) {
            this.LJFF = LJI().getBoolean(strLJII3, false);
            if (LJI().getLong(strLJII2, 0L) < LJIIIZ()) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.LJI = z2;
            return;
        }
        LJI().storeLong(strLJII2, 0L);
        LJI().storeBoolean(strLJII3, false);
        this.LJFF = false;
        if (LJIIIZ() > 0) {
            z = true;
        } else {
            z = false;
        }
        this.LJI = z;
    }
}
