package X;

import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;

/* JADX INFO: renamed from: X.0d0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033940d0q implements InterfaceC1034140d1A {
    public final ViewGroup LIZ;

    @Override // X.InterfaceC1034140d1A
    public final String getName() {
        return EnumC696280RSw.TT_PHOTO_MODE_PIC_FULL.getSlotName();
    }

    public C1033940d0q(ViewGroup viewGroup) {
        this.LIZ = viewGroup;
    }

    @Override // X.InterfaceC1034140d1A
    public final void LIZ(IAnoleManager iAnoleManager) {
        C786410Ut5.LJLLLLLL(8, this.LIZ);
        iAnoleManager.LJIIJJI(EnumC696280RSw.TT_PHOTO_MODE_PIC_FULL.getSlotName());
    }

    public final void LIZIZ(IAnoleManager iAnoleManager) {
        C786410Ut5.LJLLLLLL(0, this.LIZ);
        iAnoleManager.mount(this.LIZ, EnumC696280RSw.TT_PHOTO_MODE_PIC_FULL.getSlotName(), null);
    }
}
