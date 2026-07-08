package X;

import android.app.Dialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.15t7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@InterfaceC20647615qs("feed_location_permission_hint")
public final class C20661515t7 extends AbstractC20660015ss<Dialog> {
    public final C19EG LL;
    public final String LLILLL;
    public final Function1<C19EG, Unit> LLILZ;
    public final boolean LLILLJJLI = true;
    public final int LLILZIL = 210;

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // com.bytedance.poplayer.IPopupTask
    public final Object showPopup(C688120Qyw c688120Qyw) {
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LJFF(2131850512);
        String str = this.LLILLL;
        if (str == null) {
            str = "";
        }
        c1397580mTM.LIZIZ(str);
        c1397580mTM.LJII = false;
        C1238130iKB.LIZ(c1397580mTM, new AwS610S0100000_31(this, 478));
        c1397580mTM.LJ(AFwS276S0000000_31.get$arr$(324));
        return new C1397510mTF(c1397580mTM).LJ();
    }

    public C20661515t7(C19EG c19eg, String str, AFwS281S0000000_34 aFwS281S0000000_34) {
        this.LL = c19eg;
        this.LLILLL = str;
        this.LLILZ = aFwS281S0000000_34;
    }
}
