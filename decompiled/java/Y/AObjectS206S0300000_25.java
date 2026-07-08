package Y;

import X.C1448290nn9;
import X.C1638140sjM;
import X.C1677730tlD;
import X.EnumC1448830no1;
import X.EnumC1647590syb;
import X.InterfaceC1648570t0B;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import lnn.q;

/* JADX INFO: loaded from: classes26.dex */
public class AObjectS206S0300000_25 implements Function0 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$t) {
            case 0:
                return invoke$0(this);
            case 1:
                return invoke$1(this);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS206S0300000_25 aObjectS206S0300000_25) {
        q qVar = (q) aObjectS206S0300000_25.l0;
        InterfaceC1648570t0B interfaceC1648570t0B = (InterfaceC1648570t0B) aObjectS206S0300000_25.l1;
        ShortVideoContext shortVideoContext = (ShortVideoContext) aObjectS206S0300000_25.l2;
        qVar.pp2(false, "");
        C1638140sjM.LIZ(EnumC1647590syb.LIGHTENING);
        interfaceC1648570t0B.xB(new C1448290nn9(EnumC1448830no1.CLICK), shortVideoContext.creativeModel.aigcMetadataModel.isAigcEffect);
        return null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object] */
    public static final Object invoke$1(AObjectS206S0300000_25 aObjectS206S0300000_25) {
        ?? r3 = aObjectS206S0300000_25.l0;
        C1677730tlD c1677730tlD = (C1677730tlD) aObjectS206S0300000_25.l1;
        ?? r1 = aObjectS206S0300000_25.l2;
        if (!Intrinsics.LJFF(r3, c1677730tlD.LL) || !Intrinsics.LJFF(r1, c1677730tlD.LLILLJJLI)) {
            c1677730tlD.LL = r3;
            c1677730tlD.LLILLJJLI = r1;
            c1677730tlD.LJIIL();
        }
        return Unit.LIZ;
    }

    public AObjectS206S0300000_25(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
