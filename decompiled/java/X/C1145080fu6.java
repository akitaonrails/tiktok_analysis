package X;

import com.bytedance.android.live.liveinteract.multimatch.matchitem.ability.IMatchItemAbility;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.smokeanim.MatchItemSmokeEffectAssem;

/* JADX INFO: renamed from: X.0fu6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145080fu6 extends C0IYA {
    public final /* synthetic */ MatchItemSmokeEffectAssem LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.C0IYA
    public final void LJ(boolean z) {
        IMatchItemAbility iMatchItemAbility;
        if (z) {
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this.LIZ);
            if (interfaceC665370Q7zLJIIL != null && (iMatchItemAbility = (IMatchItemAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, IMatchItemAbility.class, null)) != null) {
                iMatchItemAbility.hE0(this.LIZ.LLJJJ, this.LIZIZ);
            }
        } else {
            IMatchItemAbility iMatchItemAbility2 = (IMatchItemAbility) C1558520qew.LIZ(C1558520qew.LJIIL(this.LIZ), IMatchItemAbility.class, null);
            if (iMatchItemAbility2 != null) {
                iMatchItemAbility2.Gf1(this.LIZ.LLJJJ, "load_gecko_image_failed");
            }
        }
        this.LIZ.LLJJJ = C1145010ftz.LIZ();
    }

    public C1145080fu6(MatchItemSmokeEffectAssem matchItemSmokeEffectAssem, boolean z) {
        this.LIZ = matchItemSmokeEffectAssem;
        this.LIZIZ = z;
    }
}
