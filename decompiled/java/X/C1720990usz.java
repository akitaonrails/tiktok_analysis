package X;

import Y.ARunnableS59S0300000_26;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.pipo.stellar.base.model.ImageDO;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0usz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1720990usz extends AbstractC1720840usk<ImageDO> {
    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adt;
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, ImageDO imageDO, EnumC1720670usT enumC1720670usT) {
        AppCompatImageView appCompatImageView;
        ImageDO imageDO2 = imageDO;
        super.LJFF(view, imageDO2, enumC1720670usT);
        InterfaceC1720050urT interfaceC1720050urT = null;
        if (view instanceof AppCompatImageView) {
            appCompatImageView = (AppCompatImageView) view;
        } else {
            appCompatImageView = null;
        }
        C1721300utU c1721300utU = C1721300utU.LIZ;
        C1720760usc c1720760usc = this.LL;
        if (c1720760usc != null) {
            interfaceC1720050urT = c1720760usc.LIZIZ;
        }
        c1721300utU.getClass();
        C1721300utU.LJIJI(appCompatImageView, imageDO2, interfaceC1720050urT);
        if (appCompatImageView != null) {
            HandlerHook.viewPost(appCompatImageView, new ARunnableS59S0300000_26(appCompatImageView, imageDO2, view, 8));
        }
    }
}
