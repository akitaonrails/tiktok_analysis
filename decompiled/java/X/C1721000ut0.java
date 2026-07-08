package X;

import android.view.View;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0ut0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721000ut0 extends AbstractC1720840usk<TextDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.ae1;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, TextDO textDO, EnumC1720670usT enumC1720670usT) {
        TuxTextView tuxTextView;
        TextDO textDO2 = textDO;
        super.LJFF(view, textDO2, enumC1720670usT);
        InterfaceC1720050urT interfaceC1720050urT = null;
        if ((view instanceof TuxTextView) && (tuxTextView = (TuxTextView) view) != null) {
            C1721300utU c1721300utU = C1721300utU.LIZ;
            C1720760usc c1720760usc = this.LL;
            if (c1720760usc != null) {
                interfaceC1720050urT = c1720760usc.LIZIZ;
            }
            c1721300utU.getClass();
            C1721300utU.LJIL(interfaceC1720050urT, textDO2, tuxTextView);
        }
    }
}
