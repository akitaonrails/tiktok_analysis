package X;

import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0CuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C328680CuY extends C09AY implements Function1<InterfaceC342000Daw, Unit> {
    public final /* synthetic */ WeakReference<C1860130yVP> LL;
    public final /* synthetic */ InterfaceC328600CuQ LLILLJJLI;
    public final /* synthetic */ InterfaceC328600CuQ LLILLL;
    public final /* synthetic */ C0R20 LLILZ;
    public final /* synthetic */ InterfaceC328580CuO LLILZIL;
    public final /* synthetic */ C0GV2 LLILZLL;
    public final /* synthetic */ C0GV3 LLIZ;
    public final /* synthetic */ Function1<InterfaceC342000Daw, Unit> LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;
    public final /* synthetic */ Function1<InterfaceC342000Daw, Unit> LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C328680CuY(WeakReference<C1860130yVP> weakReference, InterfaceC328600CuQ interfaceC328600CuQ, InterfaceC328600CuQ interfaceC328600CuQ2, C0R20 c0r20, InterfaceC328580CuO interfaceC328580CuO, C0GV2 c0gv2, C0GV3 c0gv3, Function1<? super InterfaceC342000Daw, Unit> function1, boolean z, Function1<? super InterfaceC342000Daw, Unit> function12) {
        super(1);
        this.LL = weakReference;
        this.LLILLJJLI = interfaceC328600CuQ;
        this.LLILLL = interfaceC328600CuQ2;
        this.LLILZ = c0r20;
        this.LLILZIL = interfaceC328580CuO;
        this.LLILZLL = c0gv2;
        this.LLIZ = c0gv3;
        this.LLIZLLLIL = function1;
        this.LLJ = z;
        this.LLJI = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC342000Daw interfaceC342000Daw) {
        InterfaceC342000Daw interfaceC342000Daw2 = interfaceC342000Daw;
        C1860130yVP c1860130yVP = this.LL.get();
        if (c1860130yVP != null) {
            InterfaceC328600CuQ interfaceC328600CuQ = this.LLILLJJLI;
            InterfaceC328600CuQ interfaceC328600CuQ2 = this.LLILLL;
            C0R20 c0r20 = this.LLILZ;
            InterfaceC328580CuO interfaceC328580CuO = this.LLILZIL;
            C0GV2 c0gv2 = this.LLILZLL;
            C0GV3 c0gv3 = this.LLIZ;
            Function1<InterfaceC342000Daw, Unit> function1 = this.LLIZLLLIL;
            boolean z = this.LLJ;
            Function1<InterfaceC342000Daw, Unit> function12 = this.LLJI;
            C341990Dav.LIZJ(c1860130yVP, interfaceC342000Daw2, interfaceC328600CuQ, interfaceC328600CuQ2, c0r20, interfaceC328580CuO, c0gv2, c0gv3);
            if (function1 != null) {
                function1.invoke(interfaceC342000Daw2);
            }
            if (z && function12 != null) {
                function12.invoke(interfaceC342000Daw2);
            }
        }
        return Unit.LIZ;
    }
}
