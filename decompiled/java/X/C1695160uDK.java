package X;

import android.os.Build;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: renamed from: X.0uDK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695160uDK {
    public static final float LIZ(float f, InterfaceC1690500u5o interfaceC1690500u5o) {
        if (C1682440tso.LIZ(0L, C1682440tso.LIZJ)) {
            return f;
        }
        long jLIZJ = C1682440tso.LIZJ(0L);
        if (C1682450tsp.LIZ(jLIZJ, 4294967296L)) {
            return interfaceC1690500u5o.LJLLL(0L);
        }
        if (C1682450tsp.LIZ(jLIZJ, 8589934592L)) {
            return f * C1682440tso.LIZLLL(0L);
        }
        return Float.NaN;
    }

    public static final void LIZIZ(Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            LJ(spannable, new ForegroundColorSpan(C1685850tyJ.LJIIIZ(j)), i, i2);
        }
    }

    public static final void LIZLLL(Spannable spannable, C1694560uCM c1694560uCM, int i, int i2) {
        C1694530uCJ c1694530uCJ;
        LocaleSpan localeSpan;
        if (c1694560uCM != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(c1694560uCM, 10));
                Iterator<C1694530uCJ> it2 = c1694560uCM.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LIZ);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                localeSpan = new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
            } else {
                if (c1694560uCM.isEmpty()) {
                    c1694530uCJ = (C1694530uCJ) ListProtector.get(C1695650uE7.LIZ.LIZ().LL, 0);
                } else {
                    c1694530uCJ = (C1694530uCJ) ListProtector.get(c1694560uCM.LL, 0);
                }
                localeSpan = new LocaleSpan(c1694530uCJ.LIZ);
            }
            LJ(spannable, localeSpan, i, i2);
        }
    }

    public static final void LJ(Spannable spannable, Object obj, int i, int i2) {
        C786410Ut5.o2(spannable, obj, i, i2, 33);
    }

    public static final void LIZJ(Spannable spannable, long j, InterfaceC1690500u5o interfaceC1690500u5o, int i, int i2) {
        long jLIZJ = C1682440tso.LIZJ(j);
        if (C1682450tsp.LIZ(jLIZJ, 4294967296L)) {
            LJ(spannable, new AbsoluteSizeSpan(C814420VxA.LIZIZ(interfaceC1690500u5o.LJLLL(j)), false), i, i2);
        } else {
            if (!C1682450tsp.LIZ(jLIZJ, 8589934592L)) {
                return;
            }
            LJ(spannable, new RelativeSizeSpan(C1682440tso.LIZLLL(j)), i, i2);
        }
    }
}
