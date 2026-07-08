package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS409S0200000_8;

/* JADX INFO: renamed from: X.0MAi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C564060MAi extends C09AY implements Function2<String[], int[], Unit> {
    public final /* synthetic */ Function1<String[], Boolean> LL;
    public final /* synthetic */ C0LH5 LLILLJJLI;
    public final /* synthetic */ C19EG LLILLL;
    public final /* synthetic */ String[] LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ C20656615sK LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ Function0<Unit> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C564060MAi(Function1<? super String[], Boolean> function1, C0LH5 c0lh5, C19EG c19eg, String[] strArr, Map<String, String> map, Function0<Unit> function0, C20656615sK c20656615sK, Function0<Unit> function02, Function0<Unit> function03) {
        super(2);
        this.LL = function1;
        this.LLILLJJLI = c0lh5;
        this.LLILLL = c19eg;
        this.LLILZ = strArr;
        this.LLILZIL = map;
        this.LLILZLL = function0;
        this.LLIZ = c20656615sK;
        this.LLIZLLLIL = function02;
        this.LLJ = function03;
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
            AwS409S0200000_8 awS409S0200000_8 = new AwS409S0200000_8(this.LLIZ, this.LLILZLL, 53);
            AwS409S0200000_8 awS409S0200000_82 = new AwS409S0200000_8(this.LLIZ, this.LLIZLLLIL, 54);
            AwS409S0200000_8 awS409S0200000_83 = new AwS409S0200000_8(this.LLIZ, this.LLJ, 55);
            c540290LGx.getClass();
            C540290LGx.LJIILJJIL(c19eg, strArr3, string, strLIZ, awS409S0200000_8, awS409S0200000_82, awS409S0200000_83, "");
        }
        return Unit.LIZ;
    }
}
