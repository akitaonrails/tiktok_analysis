package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.ButtonDO;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0usy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720980usy extends AbstractC1720840usk<ButtonDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adi;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ButtonDO buttonDO, EnumC1720670usT enumC1720670usT) {
        C197039127h c197039127h;
        ButtonDO buttonDO2 = buttonDO;
        super.LJFF(view, buttonDO2, enumC1720670usT);
        InterfaceC1720050urT interfaceC1720050urT = null;
        if ((view instanceof C197039127h) && (c197039127h = (C197039127h) view) != null) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            C1720760usc c1720760usc = this.LL;
            if (c1720760usc != null) {
                interfaceC1720050urT = c1720760usc.LIZIZ;
            }
            c1721300utU.getClass();
            C1721300utU.LJIJ(c197039127h, buttonDO2, interfaceC1720050urT);
        }
    }
}
