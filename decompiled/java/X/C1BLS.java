package X;

import Y.ACallableS21S1000000_3;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.Locale;
import jv6.a;

/* JADX INFO: renamed from: X.1BLS, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BLS extends AbstractC2203321BLe<C1BLX> {
    @Override // X.AbstractC2203321BLe
    public final boolean LIZ() {
        Activity validTopActivity;
        final C1BLX c1blx = (C1BLX) this.LIZ;
        C1BLR.LIZIZ(c1blx);
        Locale locale = c1blx.LJIILLIIL;
        if (C2109608Og.LIZJ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("base-");
            sbLIZ.append(C786410Ut5.t2(locale));
            sbLIZ.append(".apk");
            if (!C2109608Og.LIZ.getBoolean(C2188811AlT.LIZIZ(sbLIZ), false)) {
                C11NZ.LJJJJI(new ACallableS21S1000000_3(C786410Ut5.t2(locale), 9)).LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LIZIZ(new InterfaceC626120Oh8<Boolean>() { // from class: X.1BLa
                    @Override // X.InterfaceC626120Oh8
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onError(Throwable th) {
                        C1BLQ.LIZJ(6, c1blx);
                    }

                    @Override // X.InterfaceC626120Oh8
                    public final void onNext(Boolean bool) {
                        if (bool.booleanValue()) {
                            C844470XAv.LIZ.getClass();
                            a.install(C844470XAv.LIZ());
                        }
                        C1BLQ.LIZJ(5, c1blx);
                        c1blx.LIZJ(1);
                    }
                });
                return false;
            }
            C1BLQ.LIZJ(5, c1blx);
            c1blx.LIZJ(1);
            return true;
        }
        if (LIZIZ(locale)) {
            C1BLQ.LIZJ(5, c1blx);
            c1blx.LIZJ(1);
            return true;
        }
        AbstractC2457909k9 abstractC2457909k9LIZ = C20338014i2.LIZ(c1blx.LIZ);
        if (abstractC2457909k9LIZ != null) {
            C1BLQ.LIZJ(abstractC2457909k9LIZ.LJII(), c1blx);
            if (abstractC2457909k9LIZ.LJII() == 2 || abstractC2457909k9LIZ.LJII() == 4) {
                C1BLL.LJ().LJFF(c1blx.LIZ).LIZ(c1blx);
                return false;
            }
        } else {
            C1BLQ.LIZJ(0, c1blx);
        }
        if (TextUtils.equals("ceb", C786410Ut5.t2(locale))) {
            C844470XAv.LIZ.getClass();
            try {
                if (C786410Ut5.Y3(C844470XAv.LIZ().getPackageManager(), "com.android.vending", 0).versionCode < 81510000) {
                    if (!c1blx.LJFF && (validTopActivity = ActivityStack.getValidTopActivity()) != null) {
                        C21566919al c21566919al = new C21566919al(validTopActivity);
                        c21566919al.LIZ(2131840499);
                        c21566919al.LJIIJ(R.string.fte, null, false);
                        new C21566519ah(c21566919al).LIZLLL();
                    }
                    c1blx.LIZ(3, c1blx.LJIIIIZZ, null);
                    return false;
                }
            } catch (PackageManager.NameNotFoundException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        C1BLL.LJ().LIZIZ(c1blx);
        return false;
    }

    public C1BLS(C1BLX c1blx) {
        super(c1blx);
    }

    public static boolean LIZIZ(Locale locale) {
        try {
            String strT2 = C786410Ut5.t2(locale);
            if (TextUtils.equals("en", strT2)) {
                return true;
            }
            return C1BLO.LIZJ.LJI().contains(strT2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return false;
        }
    }
}
