package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.ISmokeAnimationAbility;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLowEndOptimizationSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15DZ, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15DZ implements InterfaceC974780bTQ {
    @Override // X.InterfaceC974780bTQ
    public final int LIZIZ() {
        return 12;
    }

    @Override // X.InterfaceC974780bTQ
    public final boolean LIZLLL() {
        return true;
    }

    @Override // X.InterfaceC974780bTQ
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC974780bTQ
    public final long LIZ() {
        return LiveMatchLowEndOptimizationSettings.INSTANCE.getArmiesMessageSeriousInterval();
    }

    @Override // X.InterfaceC974780bTQ
    public final long LJI() {
        return LiveMatchLowEndOptimizationSettings.INSTANCE.getHammerSeriousInterval();
    }

    @Override // X.InterfaceC974780bTQ
    public final void LIZJ(InterfaceC665370Q7z interfaceC665370Q7z, boolean z, boolean z2) {
        ISmokeAnimationAbility iSmokeAnimationAbility;
        ISmokeAnimationAbility iSmokeAnimationAbility2;
        if (z) {
            if (interfaceC665370Q7z != null && (iSmokeAnimationAbility2 = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) != null) {
                iSmokeAnimationAbility2.sh2(z2);
                return;
            }
            return;
        }
        if (interfaceC665370Q7z == null || (iSmokeAnimationAbility = (ISmokeAnimationAbility) C1558520qew.LIZ(interfaceC665370Q7z, ISmokeAnimationAbility.class, null)) == null) {
            return;
        }
        iSmokeAnimationAbility.WK1(z2);
    }

    @Override // X.InterfaceC974780bTQ
    public final void LJFF(C1324720kZq c1324720kZq, String str, String str2) {
        Object tag;
        if (c1324720kZq != null) {
            tag = c1324720kZq.getTag(R.id.yv7);
        } else {
            tag = null;
        }
        if (Intrinsics.LJFF(tag, str2)) {
            return;
        }
        if (c1324720kZq != null) {
            c1324720kZq.setTag(R.id.yv7, str2);
        }
        C1143680frq.LIZLLL(c1324720kZq, str, str2);
    }
}
