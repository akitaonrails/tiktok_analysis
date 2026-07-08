package Y;

import X.C1374860lsi;
import X.C1C7U;
import X.C2477909nN;
import X.C349180DmW;
import X.C352000Dr4;
import X.C353310DtB;
import X.InterfaceC351940Dqy;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.trill.share.data.ShareDatabase;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS191S0000000_5;

/* JADX INFO: loaded from: classes6.dex */
public class ACallableS8S1101000_5 implements Callable {
    public final int $t;
    public int i2;
    public Object l1;
    public String s0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS8S1101000_5 aCallableS8S1101000_5) throws Throwable {
        C1C7U.LIZ("MultiEditVideoHelper@300b.saveCoverImageWithCallback$1");
        C2477909nN.LJI((Bitmap) aCallableS8S1101000_5.l1, aCallableS8S1101000_5.s0, null, aCallableS8S1101000_5.i2, 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MultiEditVideoHelper@300b.saveCoverImageWithCallback$1");
        return unit;
    }

    public static final Object call$1(ACallableS8S1101000_5 aCallableS8S1101000_5) {
        C1374860lsi c1374860lsi = (C1374860lsi) aCallableS8S1101000_5.l1;
        String str = aCallableS8S1101000_5.s0;
        int i = aCallableS8S1101000_5.i2;
        c1374860lsi.getClass();
        C1C7U.LIZ("I18nShareOrderUtil@97be.addShareRecord$1L");
        if (TextUtils.equals("more", str)) {
            C1C7U.LIZIZ("I18nShareOrderUtil@97be.addShareRecord$1L");
            return null;
        }
        try {
            ShareDatabase shareDatabase = c1374860lsi.LIZLLL;
            if (shareDatabase != null) {
                InterfaceC351940Dqy interfaceC351940DqyLIZIZ = shareDatabase.LIZIZ();
                interfaceC351940DqyLIZIZ.LIZLLL(new C353310DtB(Long.valueOf(System.currentTimeMillis()), str, Integer.valueOf(i)));
                Integer num = c1374860lsi.LJ;
                if (num != null) {
                    interfaceC351940DqyLIZIZ.LJ(num);
                }
                if (C349180DmW.LIZ.contains(str)) {
                    C349180DmW.LIZ.remove(str);
                }
                ListProtector.add(C349180DmW.LIZ, 0, str);
                ListProtector.add(C349180DmW.LIZIZ, 0, str);
                C352000Dr4.LIZIZ.LIZIZ(AFwS191S0000000_5.get$arr$(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1C7U.LIZIZ("I18nShareOrderUtil@97be.addShareRecord$1L");
        return null;
    }

    public ACallableS8S1101000_5(Object obj, int i, String str, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.s0 = str;
        this.i2 = i;
    }
}
