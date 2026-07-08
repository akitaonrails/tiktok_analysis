package X;

import com.bytedance.hybrid.spark.raven.component.BaseComponentData;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.MynaRavenUIAssem;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaCell;
import com.bytedance.hybrid.spark.raven.component.builtin.myna.RavenMynaModule;

/* JADX INFO: renamed from: X.0gKe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1161540gKe implements InterfaceC1161480gKY, InterfaceC1161470gKX {
    @Override // X.InterfaceC1161120gJy
    public final void LIZ() {
    }

    @Override // X.InterfaceC1161470gKX
    public final C19719912Dl LIZLLL() {
        return C13LE.LIZ(MynaRavenUIAssem.class);
    }

    @Override // X.InterfaceC1161120gJy
    public final void service() {
    }

    @Override // X.InterfaceC1161120gJy
    public final InterfaceC1161070gJt<?> LIZIZ() {
        return new InterfaceC1161070gJt<RavenMynaModule>() { // from class: X.0gKf
            @Override // X.InterfaceC1161070gJt
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1161070gJt
            public final Class<RavenMynaModule> LIZ() {
                return RavenMynaModule.class;
            }
        };
    }

    @Override // X.InterfaceC1161480gKY
    public final void LIZJ(C18Z8 c18z8) {
        c18z8.LJIILJJIL(RavenMynaCell.class);
    }

    @Override // X.InterfaceC1161120gJy
    public final boolean LJ(BaseComponentData baseComponentData) {
        return baseComponentData instanceof RavenMynaModule;
    }
}
