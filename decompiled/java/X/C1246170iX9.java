package X;

import Y.ACListenerS154S0100000_19;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iX9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("campus_verified_profile_banner")
public final class C1246170iX9 extends AbstractC20660115st<View> {
    public final C20515215Pi LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Function0<Unit> LLILZ;
    public final Function1<EnumC1246200iXC, Unit> LLILZIL;
    public final Function0<Unit> LLILZLL;
    public final Function1<EnumC1246200iXC, Unit> LLIZ;
    public final int LLIZLLLIL;
    public EnumC1246200iXC LLJ;
    public boolean LLJI;

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZLLLIL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C20515215Pi c20515215Pi = this.LL;
        c20515215Pi.LJI(AFwS232S0000000_4.get$arr$(9));
        c20515215Pi.LIZJ(this.LLILLJJLI);
        c20515215Pi.LIZ(this.LLILLL);
        C1057450dcl c1057450dcl = c20515215Pi.LIZ;
        c1057450dcl.LIZJ = false;
        c1057450dcl.LJIIJJI = new ACListenerS154S0100000_19(this, 23);
        c1057450dcl.LJIILIIL = new ACListenerS154S0100000_19(this, 24);
        c20515215Pi.LIZ.LJIILJJIL = new AwS598S0100000_19(this, 44);
        C20515215Pi c20515215Pi2 = this.LL;
        c20515215Pi2.LIZ.LJIILLIIL = true;
        c20515215Pi2.LJ();
        C20514915Pf c20514915Pf = c20515215Pi2.LJ;
        this.LLILZ.invoke();
        return c20514915Pf;
    }

    public C1246170iX9(C0TGX c0tgx, C20515215Pi c20515215Pi, AFwS207S0000000_19 aFwS207S0000000_19, AwS598S0100000_19 awS598S0100000_19, AFwS207S0000000_19 aFwS207S0000000_192, AFwS257S0000000_19 aFwS257S0000000_19) {
        super(c0tgx);
        this.LL = c20515215Pi;
        this.LLILLJJLI = 2131858057;
        this.LLILLL = 2131858056;
        this.LLILZ = aFwS207S0000000_19;
        this.LLILZIL = awS598S0100000_19;
        this.LLILZLL = aFwS207S0000000_192;
        this.LLIZ = aFwS257S0000000_19;
        this.LLIZLLLIL = 250;
    }
}
