package X;

import android.view.View;
import com.bytedance.android.live.pincard.service.IPinCardService;
import java.util.Map;
import kotlin.jvm.internal.AwS626S0100000_12;

/* JADX INFO: renamed from: X.0UVo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773420UVo {
    public static final C773380UVk LIZ = new InterfaceC756430Tlp() { // from class: X.0UVk
        public static final /* synthetic */ int LIZ = 0;

        @Override // X.InterfaceC756430Tlp
        public final boolean Qi(EnumC1107860ew4 enumC1107860ew4) {
            return ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Qi(enumC1107860ew4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [X.0ew9] */
        /* JADX WARN: Type inference failed for: r2v2, types: [X.0UVl] */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Type inference failed for: r2v4 */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.bytedance.android.live.pincard.service.IPinCardService] */
        @Override // X.InterfaceC756430Tlp
        public final void LIZIZ(EnumC1107860ew4 enumC1107860ew4, final C756540Tm0 c756540Tm0) {
            ?? r2;
            ?? r3 = (IPinCardService) C1161920gLG.LIZJ(IPinCardService.class);
            if (enumC1107860ew4.getType() == EnumC1107900ew8.NATIVE) {
                ?? r22 = new C0UTI() { // from class: X.0UVl
                    @Override // X.InterfaceC1107910ew9
                    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                        c756540Tm0.onHide();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                        c756540Tm0.LJLJL();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZJ(EnumC1107860ew4 enumC1107860ew42, boolean z) {
                        c756540Tm0.LLLZIL();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                        c756540Tm0.LLLZI();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                        c756540Tm0.LLLZIIL(view, map);
                    }
                };
                c756540Tm0.LIZ = new AwS626S0100000_12((C773390UVl) r22, 27);
                r2 = r22;
            } else {
                r2 = new InterfaceC1107910ew9() { // from class: X.0UVm
                    @Override // X.InterfaceC1107910ew9
                    public final void LIZ(EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
                        c756540Tm0.onHide();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                        c756540Tm0.LJLJL();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZJ(EnumC1107860ew4 enumC1107860ew42, boolean z) {
                        c756540Tm0.LLLZIL();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LIZLLL(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
                        c756540Tm0.LLLZI();
                    }

                    @Override // X.InterfaceC1107910ew9
                    public final void LLLZIIL(View view, Map<String, ? extends Object> map) {
                        c756540Tm0.LLLZIIL(view, map);
                    }
                };
            }
            r3.Y70(enumC1107860ew4, r2);
        }

        @Override // X.InterfaceC756430Tlp
        public final void Rg(EnumC1107860ew4 enumC1107860ew4, EnumC1108010ewJ enumC1108010ewJ, Map<String, ? extends Object> map) {
            ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).Rg(enumC1107860ew4, enumC1108010ewJ, map);
        }

        @Override // X.InterfaceC756430Tlp
        public final void LIZ(EnumC1107860ew4 enumC1107860ew4, C756470Tlt c756470Tlt, C1107970ewF c1107970ewF, long j, Map map) {
            ((IPinCardService) C1161920gLG.LIZJ(IPinCardService.class)).DP(enumC1107860ew4, c756470Tlt, c1107970ewF, j, map);
        }
    };
}
