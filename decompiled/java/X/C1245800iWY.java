package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.sheet.intro.TuxPanel;
import com.ss.android.ugc.aweme.services.IMainSAFLifecycleKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS263S0300000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iWY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@InterfaceC20647615qs("campus_add_school_popup")
public final class C1245800iWY extends AbstractC20659615so<TuxPanel> {
    public final C19EG LL;
    public final C1245860iWe LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(714));

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return 0;
    }

    @Override // com.bytedance.poplayer.BaseStandardPopupTask, com.bytedance.poplayer.IStandardPopupTask
    public final void LIZIZ() {
        ((C1007300cJs) this.LLILZ.getValue()).LIZ().storeBoolean("has_seen_add_school_popup", true);
        C0DOO c0doo = C0DOO.LIZ;
        EnumC1245820iWa enumC1245820iWa = EnumC1245820iWa.SHOW;
        C1245860iWe c1245860iWe = this.LLILLJJLI;
        c0doo.getClass();
        C0DOO.LJ(enumC1245820iWa, c1245860iWe);
    }

    @Override // X.AbstractC20656215sG
    public final String getPopupEnterFrom() {
        return C1231410i9L.LIZ[this.LLILLJJLI.internalEnterFrom.ordinal()] == 1 ? "edit_profile_page" : super.getPopupEnterFrom();
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false), null);
    }

    @Override // com.bytedance.poplayer.IStandardPopupTask
    public final Object LJII(C688120Qyw c688120Qyw) {
        C1245770iWV c1245770iWV = new C1245770iWV(null, 0, new AwS563S0100000_19(this, 3150), null, null, new AwS598S0100000_19(this, 800), new AwS598S0100000_19(this, 801), false, 152);
        C1245760iWU c1245760iWU = C1245760iWU.LIZ;
        C19EG c19eg = this.LL;
        LifecycleOwner lifecycleOwnerRequireMainSAFLifecycle = IMainSAFLifecycleKt.requireMainSAFLifecycle(c19eg, null, false);
        c1245760iWU.getClass();
        return C1245760iWU.LIZ(c19eg, lifecycleOwnerRequireMainSAFLifecycle, c1245770iWV);
    }

    public C1245800iWY(C19EG c19eg, C1245860iWe c1245860iWe, AwS263S0300000_19 awS263S0300000_19) {
        this.LL = c19eg;
        this.LLILLJJLI = c1245860iWe;
        this.LLILLL = awS263S0300000_19;
    }
}
