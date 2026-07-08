package X;

import com.ss.android.ugc.aweme.poi.detail.bottomspace.BottomSpaceCell;
import com.ss.android.ugc.aweme.poi.detail.bottomspace.BottomSpaceModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gnM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179340gnM implements InterfaceC1181600gr0 {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1181600gr0
    public final void LIZJ(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv, C1180920gpu c1180920gpu) {
    }

    @Override // X.InterfaceC1181600gr0
    public final boolean LJ() {
        return false;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<BottomSpaceModule> LIZIZ() {
        return new C1208890hZ1(36);
    }

    @Override // X.InterfaceC1181600gr0
    public final void LJI(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        viewOnAttachStateChangeListenerC20604515jv.LJIILJJIL(BottomSpaceCell.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        BottomSpaceModule bottomSpaceModule;
        if (baseComponentData == null || !(baseComponentData instanceof BottomSpaceModule) || (bottomSpaceModule = (BottomSpaceModule) baseComponentData) == null || !Intrinsics.LJFF(bottomSpaceModule.getShowBottomSpace(), Boolean.TRUE)) {
            return false;
        }
        return true;
    }
}
