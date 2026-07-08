package X;

import Y.AObjectS351S0100000_8;
import Y.AObjectS383S0100000_8;
import Y.AObjectS61S0000000_8;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LFJ extends C09AY implements Function2<String[], int[], Unit> {
    public final /* synthetic */ Function1<String[], Boolean> LL;
    public final /* synthetic */ C0LH5 LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String[] LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LFJ(AObjectS351S0100000_8 aObjectS351S0100000_8, C0LFG c0lfg, C19EG c19eg, String[] strArr, Map map, AObjectS61S0000000_8 aObjectS61S0000000_8, AObjectS383S0100000_8 aObjectS383S0100000_8, AObjectS383S0100000_8 aObjectS383S0100000_82) {
        super(2);
        this.LL = aObjectS351S0100000_8;
        this.LLILLJJLI = c0lfg;
        this.LLILLL = c19eg;
        this.LLILZ = strArr;
        this.LLILZIL = map;
        this.LLILZLL = aObjectS61S0000000_8;
        this.LLIZ = aObjectS383S0100000_8;
        this.LLIZLLLIL = aObjectS383S0100000_82;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(String[] strArr, int[] iArr) {
        String[] strArr2 = strArr;
        int[] iArr2 = iArr;
        String[] strArrLJI = C533930Kwp.LJI(iArr2, strArr2);
        if (this.LL.invoke(strArrLJI).booleanValue()) {
            this.LLILLJJLI.LIZ(iArr2, strArr2);
        } else {
            C540290LGx c540290LGx = C540290LGx.LIZ;
            C19EG c19eg = this.LLILLL;
            String[] strArr3 = this.LLILZ;
            String string = c19eg.getString(2131849201);
            C19EG c19eg2 = this.LLILLL;
            Map<String, String> map = this.LLILZIL;
            c540290LGx.getClass();
            String strLIZ = C540290LGx.LIZ(c19eg2, map, strArrLJI);
            Function0<Unit> function0 = this.LLILZLL;
            Function0<Unit> function02 = this.LLIZ;
            Function0<Unit> function03 = this.LLIZLLLIL;
            c540290LGx.getClass();
            C540290LGx.LJIILJJIL(c19eg, strArr3, string, strLIZ, function0, function02, function03, "");
        }
        return Unit.LIZ;
    }
}
