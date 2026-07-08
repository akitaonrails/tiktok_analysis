package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.12g4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19816212g4 implements InterfaceC19797112cz {
    public final Double LL;

    @Override // X.InterfaceC19797112cz
    public final Iterator<InterfaceC19797112cz> LJI() {
        return null;
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LIZIZ() {
        return new C19816212g4(this.LL);
    }

    @Override // X.InterfaceC19797112cz
    public final Boolean LIZLLL() {
        return Boolean.valueOf((Double.isNaN(this.LL.doubleValue()) || this.LL.doubleValue() == 0.0d) ? false : true);
    }

    @Override // X.InterfaceC19797112cz
    public final String LJFF() {
        if (Double.isNaN(this.LL.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(this.LL.doubleValue())) {
            return this.LL.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.LL.doubleValue());
        BigDecimal bigDecimal = bigDecimalValueOf.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalValueOf.stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimal.scale() > 0 ? bigDecimal.precision() : bigDecimal.scale()) - 1);
        String str = decimalFormat.format(bigDecimal);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i = CastIntegerProtector.parseInt(str.substring(iIndexOf + 1));
        return (i >= 0 ? i >= 21 : i <= -7) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimal.toPlainString();
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        return LJFF();
    }

    @Override // X.InterfaceC19797112cz
    public final Double LJ() {
        return this.LL;
    }

    public C19816212g4(Double d) {
        if (d == null) {
            this.LL = Double.valueOf(Double.NaN);
        } else {
            this.LL = d;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C19816212g4)) {
            return false;
        }
        return this.LL.equals(((C19816212g4) obj).LL);
    }

    @Override // X.InterfaceC19797112cz
    public final InterfaceC19797112cz LJIIJ(String str, C19795712cl c19795712cl, List<InterfaceC19797112cz> list) {
        if ("toString".equals(str)) {
            return new C19797512d3(LJFF());
        }
        throw new IllegalArgumentException(C786410Ut5.j4("%s.%s is not a function.", new Object[]{LJFF(), str}));
    }
}
