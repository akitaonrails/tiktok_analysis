package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AFK, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AFK extends C09AY implements Function0<C1AFO> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1AFK(C1AXM c1axm) {
        super(0);
        this.LL = c1axm;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [X.1AFO] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ C1AFO invoke() {
        C1AXM c1axm = this.LL;
        final C2177031AIb c2177031AIb = c1axm.LL;
        final OnLineMicInfo onLineMicInfo = c1axm.LLJJIJIL;
        final C1AFM c1afm = new C1AFM(c1axm);
        final C1AFL c1afl = new C1AFL(this.LL);
        return new InterfaceC2181151AXx(c2177031AIb, onLineMicInfo, c1afm, c1afl) { // from class: X.1AFO
            public final C2177031AIb LIZ;
            public final OnLineMicInfo LIZIZ;
            public final Function0<LinkUser> LIZJ;
            public final Function0<Boolean> LIZLLL;
            public final int LJ = hashCode();

            static {
                new Object() { // from class: X.1ADr
                };
            }

            @Override // X.InterfaceC2181151AXx
            public final Map<String, OnLineMicInfo> LIZ() {
                if (!this.LIZLLL.invoke().booleanValue()) {
                    C20441214yg.LJIIIZ(LIZJ(), "audience getFixedPositionMap");
                    return this.LIZ.LJFF.LJIIIIZZ();
                }
                HashMap map = new HashMap();
                map.putAll(this.LIZ.LJFF.LIZ());
                String strLIZJ = LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("guestOrAnchor getFixedPositionMap size = ");
                sbLIZ.append(map.size());
                C20441214yg.LJIIIZ(strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
                return map;
            }

            @Override // X.InterfaceC2181151AXx
            public final int LIZIZ() {
                return this.LIZLLL.invoke().booleanValue() ? this.LIZ.LJFF.LIZIZ() : this.LIZ.LJFF.LJJIIJZLJL();
            }

            @Override // X.InterfaceC2181151AXx
            public final boolean LJIIL() {
                return this.LIZ.LJFF.LJIIL();
            }

            @Override // X.InterfaceC2181151AXx
            public final Map<String, OnLineMicInfo> LJJII() {
                if (!this.LIZLLL.invoke().booleanValue()) {
                    return this.LIZ.LJFF.LJJJJIZL();
                }
                HashMap map = new HashMap();
                map.putAll(this.LIZ.LJFF.LJJII());
                return map;
            }

            @Override // X.InterfaceC2181151AXx
            public final Map<String, OnLineMicInfo> LJJIJIIJIL() {
                if (!this.LIZLLL.invoke().booleanValue()) {
                    C20441214yg.LJIIIZ(LIZJ(), "audience getFixedPositionMapDirectly");
                    return this.LIZ.LJFF.LJIIIIZZ();
                }
                HashMap map = new HashMap();
                map.putAll(this.LIZ.LJFF.LJJIJIIJIL());
                String strLIZJ = LIZJ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("guestOrAnchor getFixedPositionMapDirectly size = ");
                sbLIZ.append(map.size());
                C20441214yg.LJIIIZ(strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
                return map;
            }

            public final String LIZJ() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("InternalMicPositionManager");
                sbLIZ.append(this.LJ);
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            @Override // X.InterfaceC2181151AXx
            public final OnLineMicInfo LJFF(String str) {
                if (this.LIZLLL.invoke().booleanValue()) {
                    String strLIZJ = LIZJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("guestOrAnchor getFloatPosition linkMicId = ");
                    sbLIZ.append(str);
                    C20441214yg.LJIIIZ(strLIZJ, C2188811AlT.LIZIZ(sbLIZ));
                    OnLineMicInfo onLineMicInfoLJFF = this.LIZ.LJFF.LJFF(str);
                    if (onLineMicInfoLJFF == null && Intrinsics.LJFF(str, this.LIZJ.invoke().getActualLinkMicId())) {
                        return this.LIZIZ;
                    }
                    return onLineMicInfoLJFF;
                }
                String strLIZJ2 = LIZJ();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("audience getFloatPosition linkMicId = ");
                sbLIZ2.append(str);
                C20441214yg.LJIIIZ(strLIZJ2, C2188811AlT.LIZIZ(sbLIZ2));
                return this.LIZ.LJFF.LJJIJLIJ(str);
            }

            @Override // X.InterfaceC2181151AXx
            public final int LJII(int i) {
                return this.LIZ.LJFF.LJII(i);
            }

            @Override // X.InterfaceC2181151AXx
            public final int LJIILLIIL(int i) {
                return this.LIZ.LJFF.LJIILLIIL(i);
            }

            @Override // X.InterfaceC2181151AXx
            public final void LJIJ(Map map) {
                this.LIZ.LJFF.LJIJ(map);
            }

            @Override // X.InterfaceC2181151AXx
            public final OnLineMicInfo LJIJI(String str) {
                if (this.LIZLLL.invoke().booleanValue()) {
                    OnLineMicInfo onLineMicInfoLJIJI = this.LIZ.LJFF.LJIJI(str);
                    if (onLineMicInfoLJIJI == null) {
                        if (Intrinsics.LJFF(str, this.LIZJ.invoke().getActualLinkMicId())) {
                            return this.LIZIZ;
                        }
                        return null;
                    }
                    return onLineMicInfoLJIJI;
                }
                return this.LIZ.LJFF.LJJIJIIJI(str);
            }

            {
                this.LIZ = c2177031AIb;
                this.LIZIZ = onLineMicInfo;
                this.LIZJ = c1afm;
                this.LIZLLL = c1afl;
            }
        };
    }
}
