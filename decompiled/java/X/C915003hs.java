package X;

import Y.ARunnableS34S0300000_1;
import android.os.Looper;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03hs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C915003hs extends C09AY implements InterfaceC1631630sYr<String, String, String, Cashier, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C915003hs(String str, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        super(4);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = function0;
        this.LLILZ = function02;
    }

    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(String str, String str2, String str3, Cashier cashier) {
        String str4 = str;
        C931003kS c931003kS = C932203ke.LIZ;
        C915603hy c915603hy = new C915603hy(this.LL);
        String str5 = this.LLILLJJLI;
        c915603hy.LJI = str4;
        c915603hy.LIZJ = str4;
        c915603hy.LIZ = str2;
        c915603hy.LJII = str3;
        c915603hy.LIZIZ = String.valueOf(System.currentTimeMillis());
        if (str5 != null) {
            c915603hy.LJFF = str5;
        }
        final Function0<Unit> function0 = this.LLILLL;
        final Function0<Unit> function02 = this.LLILZ;
        InterfaceC919703id interfaceC919703id = new InterfaceC919703id() { // from class: X.03i8
            @Override // X.InterfaceC919703id
            public final void LIZ(C915703hz c915703hz) {
                if (c915703hz.LJFF != null) {
                    function0.invoke();
                } else {
                    function02.invoke();
                }
            }
        };
        if (c931003kS.LIZ.get()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("get installment card bin list with ");
            sbLIZ.append(c915603hy.toString());
            C2188811AlT.LIZIZ(sbLIZ);
            C914603ho c914603ho = (C914603ho) C1724150uy5.LJIIL.LIZLLL();
            c914603ho.getClass();
            if (Looper.getMainLooper() == Looper.myLooper()) {
                RunnableC823120WQs.LIZIZ(new ARunnableS34S0300000_1(c914603ho, c915603hy, interfaceC919703id, 9));
            } else {
                C914603ho.LIZIZ(c915603hy, interfaceC919703id);
            }
            return Unit.LIZ;
        }
        throw new IllegalArgumentException("please init first");
    }
}
