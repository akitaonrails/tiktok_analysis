package X;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.libra.EcomPdpPictureInPictureUiEnhanceConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vpD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757090vpD implements InterfaceC1757120vpG {
    public final InterfaceC1757230vpR LIZ;
    public final FrameLayout LIZIZ;
    public final boolean LIZJ;
    public final Function0<Unit> LIZLLL;

    @Override // X.InterfaceC1757120vpG
    public final void LIZJ(boolean z) {
    }

    @Override // X.InterfaceC1757120vpG
    public final void LIZIZ() {
        EnumC1757150vpJ enumC1757150vpJ;
        C1757130vpH c1757130vpHCf = this.LIZ.cf();
        if (c1757130vpHCf == null || (enumC1757150vpJ = c1757130vpHCf.LIZIZ) == null || enumC1757150vpJ == EnumC1757150vpJ.HIDE) {
            this.LIZ.play();
        }
    }

    @Override // X.InterfaceC1757120vpG
    public final boolean isShowing() {
        C1757130vpH c1757130vpHCf = this.LIZ.cf();
        return c1757130vpHCf != null && c1757130vpHCf.LIZ;
    }

    @Override // X.InterfaceC1757120vpG
    public final void show() {
        int iLIZIZ;
        Rect rect;
        if (EcomPdpPictureInPictureUiEnhanceConfig.LIZ() != 0) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(EcomPdpPictureInPictureUiEnhanceConfig.LIZ())));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(this.LIZJ ? 80 : 0))) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(80));
        }
        Size sizeLIZ = this.LIZ.LIZ();
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(86));
        int width = this.LIZIZ.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        int height = this.LIZIZ.getHeight() - iLIZIZ;
        if (((Boolean) C268730Ag3.LIZ.getValue()).booleanValue()) {
            if (width - iLIZIZ2 < sizeLIZ.getWidth() || height - iLIZIZ3 < sizeLIZ.getHeight()) {
                C1019103yf.LIZ(EnumC1014603xw.ERR_PDP_FYP_PIP_SAFE_AREA_TOO_SMALL, null, null);
            }
            int width2 = sizeLIZ.getWidth() + iLIZIZ2;
            if (width < width2) {
                width = width2;
            }
            int height2 = sizeLIZ.getHeight() + iLIZIZ3;
            if (height < height2) {
                height = height2;
            }
            rect = new Rect(iLIZIZ2, iLIZIZ3, width, height);
        } else {
            rect = new Rect(iLIZIZ2, iLIZIZ3, width, height);
        }
        this.LIZ.LIZIZ(rect, new Point((this.LIZIZ.getWidth() - sizeLIZ.getWidth()) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), (this.LIZIZ.getHeight() - sizeLIZ.getHeight()) - iLIZIZ), new AwS570S0100000_26(this, 1475));
    }

    @Override // X.InterfaceC1757120vpG
    public final void LIZ(boolean z) {
        C1757130vpH c1757130vpHCf = this.LIZ.cf();
        if (c1757130vpHCf != null && c1757130vpHCf.LIZ) {
            this.LIZ.pause();
        }
    }

    @Override // X.InterfaceC1757120vpG
    public final void k(EnumC1757150vpJ enumC1757150vpJ, boolean z) {
        this.LIZ.k(enumC1757150vpJ, z);
    }

    public C1757090vpD(InterfaceC1757230vpR interfaceC1757230vpR, FrameLayout frameLayout, boolean z, Function0<Unit> function0) {
        this.LIZ = interfaceC1757230vpR;
        this.LIZIZ = frameLayout;
        this.LIZJ = z;
        this.LIZLLL = function0;
    }
}
