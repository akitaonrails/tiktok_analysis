package X;

import android.view.View;
import androidx.compose.foundation.layout.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS426S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0to1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679470to1 extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ C05P1<String> LL;
    public final /* synthetic */ C05P1<Boolean> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1676910tjt<Boolean> LLILZ;
    public final /* synthetic */ Function1<EnumC1679580toC, Unit> LLILZIL;
    public final /* synthetic */ Function1<EnumC1679580toC, Unit> LLILZLL;
    public final /* synthetic */ Function1<View, Unit> LLIZ;
    public final /* synthetic */ C1679570toB LLIZLLLIL;
    public final /* synthetic */ Function1<String, Boolean> LLJ;
    public final /* synthetic */ C05P0<C1686970u07> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1679470to1(C05P1<String> c05p1, C05P1<Boolean> c05p12, String str, C1676910tjt<Boolean> c1676910tjt, Function1<? super EnumC1679580toC, Unit> function1, Function1<? super EnumC1679580toC, Unit> function12, Function1<? super View, Unit> function13, C1679570toB c1679570toB, Function1<? super String, Boolean> function14, C05P0<C1686970u07> c05p0) {
        super(2);
        this.LL = c05p1;
        this.LLILLJJLI = c05p12;
        this.LLILLL = str;
        this.LLILZ = c1676910tjt;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = function13;
        this.LLIZLLLIL = c1679570toB;
        this.LLJ = function14;
        this.LLJI = c05p0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC1680500tpg interfaceC1680500tpg, Integer num) {
        InterfaceC1680500tpg interfaceC1680500tpg2 = interfaceC1680500tpg;
        if ((num.intValue() & 3) == 2 && interfaceC1680500tpg2.LIZ()) {
            interfaceC1680500tpg2.LIZJ();
        } else {
            C05P1<String> c05p1 = this.LL;
            C05P1<Boolean> c05p12 = this.LLILLJJLI;
            String str = this.LLILLL;
            C1676910tjt<Boolean> c1676910tjt = this.LLILZ;
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            C1679460to0.LJIIIZ(c05p1, c05p12, str, c1676910tjt, C1679030tnJ.LIZIZ(c1685760tyA, "voiceHintText"), interfaceC1680500tpg2, 24576, 0);
            C1679460to0.LJFF(this.LLILZIL, this.LLILZLL, this.LLIZ, C1679030tnJ.LIZIZ(c1685760tyA, "changeToText"), interfaceC1680500tpg2, 3072, 0);
            C1679460to0.LJII(C1679030tnJ.LIZIZ(c1685760tyA, "sendShadow"), interfaceC1680500tpg2, 6, 0);
            C1679460to0.LIZJ(C1679030tnJ.LIZIZ(c1685760tyA, "background"), interfaceC1680500tpg2, 6, 0);
            C1679570toB c1679570toB = this.LLIZLLLIL;
            EnumC1679580toC enumC1679580toC = c1679570toB.LLILLJJLI;
            String str2 = c1679570toB.LL;
            C1686970u07 value = this.LLJI.getValue();
            interfaceC1680500tpg2.LJJIIJZLJL(5004770);
            C05P0<C1686970u07> c05p0 = this.LLJI;
            Object objLJJ = interfaceC1680500tpg2.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new AwS604S0100000_25((C05P0) c05p0, (C05P0<Boolean>) 536);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ);
            }
            interfaceC1680500tpg2.LJ();
            C1679460to0.LJ(enumC1679580toC, str2, value, (Function1) objLJJ, this.LLILZIL, c.LJIJI(C1682520tsw.LJIIJ(C1679030tnJ.LIZIZ(c1685760tyA, "inputText"), 0.0f, 12, 1), null, 3), interfaceC1680500tpg2, 199680, 0);
            C1679460to0.LIZIZ(C1679030tnJ.LIZIZ(c1685760tyA, "imeSpacer"), interfaceC1680500tpg2, 6, 0);
            C1679460to0.LJIIJ(384, 0, interfaceC1680500tpg2, C1679030tnJ.LIZIZ(c1685760tyA, "changeToVoice"), this.LLILZIL, this.LLILZLL);
            String str3 = this.LLJI.getValue().LIZ.LLILLJJLI;
            Function1<String, Boolean> function1 = this.LLJ;
            interfaceC1680500tpg2.LJJIIJZLJL(-1633490746);
            boolean zLJJIIJ = interfaceC1680500tpg2.LJJIIJ(this.LLILZIL);
            Function1<EnumC1679580toC, Unit> function12 = this.LLILZIL;
            C05P0<C1686970u07> c05p02 = this.LLJI;
            Object objLJJ2 = interfaceC1680500tpg2.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS426S0200000_25(c05p02, function12, 116);
                interfaceC1680500tpg2.LJJIJIIJI(objLJJ2);
            }
            interfaceC1680500tpg2.LJ();
            C1679460to0.LJI(str3, function1, (Function0) objLJJ2, C1679030tnJ.LIZIZ(c1685760tyA, "sendButton"), interfaceC1680500tpg2, 3072, 0);
        }
        return Unit.LIZ;
    }
}
