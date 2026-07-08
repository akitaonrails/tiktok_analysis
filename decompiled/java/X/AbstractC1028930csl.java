package X;

import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0csl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1028930csl extends AbstractC1028910csj<C1029040csw> {
    public static final C01GW<InterfaceC1029080ct0<C1029060csy>> LJFF = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(433));
    public static final C01GW<InterfaceC1029080ct0<C1029060csy>> LJI = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(434));
    public final InterfaceC1028790csX<C1029060csy> LJ;

    public InterfaceC1028790csX<C1029060csy> LIZIZ() {
        return this.LJ;
    }

    public AbstractC1028930csl(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LJ = new C1029000css(new C1029100ct2()).LIZ(LJFF.getValue()).LIZ(LJI.getValue());
    }

    public C1029040csw LJIIIIZZ(C1028760csU c1028760csU) {
        C1029040csw c1029040csw = (C1029040csw) c1028760csU.LIZ(C1029040csw.class);
        if (c1029040csw == null) {
            CommonAdData commonAdData = (CommonAdData) c1028760csU.LIZ(CommonAdData.class);
            if (commonAdData != null) {
                return new C1029040csw(commonAdData, null, null, null, 14);
            }
            return null;
        }
        return c1029040csw;
    }
}
