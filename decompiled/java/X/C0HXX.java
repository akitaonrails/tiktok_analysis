package X;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HXX, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@InterfaceC20647615qs("profile_social_avatar_share_to_dm")
public final class C0HXX extends C10GR {
    public final C19EG LL;
    public final int LLILLJJLI = 140;
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(621));

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLJJLI;
    }

    public C0HXX(C19EG c19eg) {
        this.LL = c19eg;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LL), null, null, new C0HXW(this, c20656615sK, null), 3);
    }
}
