package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15DX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DX implements InterfaceC974780bTQ {
    @Override // X.InterfaceC974780bTQ
    public final int LIZIZ() {
        return 4;
    }

    @Override // X.InterfaceC974780bTQ
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.InterfaceC974780bTQ
    public final boolean LJ() {
        return true;
    }

    @Override // X.InterfaceC974780bTQ
    public final long LIZ() {
        return LiveMatchLowEndOptimizationSettings.INSTANCE.getArmiesMessageCriticalInterval();
    }

    @Override // X.InterfaceC974780bTQ
    public final long LJI() {
        return LiveMatchLowEndOptimizationSettings.INSTANCE.getHammerCriticalInterval();
    }

    @Override // X.InterfaceC974780bTQ
    public final void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z, boolean z2) {
        ISmokeAnimationAbility iSmokeAnimationAbility;
        ISmokeAnimationAbility iSmokeAnimationAbility2;
        if (z) {
            if (interfaceC665370Q7z != null && (iSmokeAnimationAbility2 = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) != null) {
                iSmokeAnimationAbility2.By0(z2);
                return;
            }
            return;
        }
        if (interfaceC665370Q7z == null || (iSmokeAnimationAbility = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) == null) {
            return;
        }
        iSmokeAnimationAbility.Pk1(z2);
    }

    @Override // X.InterfaceC974780bTQ
    public final void LJFF(C1324720kZq c1324720kZq, String str, String str2) {
        String str3 = C15DD.LLJLLIL.get(str2);
        if (c1324720kZq != null) {
            if (str3 != null) {
                str2 = str3;
            }
            c1324720kZq.setTag(R.id.yv7, str2);
        }
        C1143680frq.LIZLLL(c1324720kZq, "tiktok_live_match_redesign_resource_2", str3);
    }
}
