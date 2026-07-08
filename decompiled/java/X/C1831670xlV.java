package X;

import android.graphics.Rect;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.scenery.zoom.SceneryCropPictureAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0xlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1831670xlV extends C09AY implements Function2<UIAssem, Integer, Unit> {
    public final /* synthetic */ SceneryCropPictureAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1831670xlV(SceneryCropPictureAssem sceneryCropPictureAssem) {
        super(2);
        this.LL = sceneryCropPictureAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue != 0) {
            if (iIntValue != 1) {
                if (iIntValue == 3) {
                    SceneryCropPictureAssem sceneryCropPictureAssem = this.LL;
                    Rect rect = sceneryCropPictureAssem.LLJJIJIIJIL;
                    sceneryCropPictureAssem.LLJJJ = rect;
                    if (rect != null) {
                        sceneryCropPictureAssem.lp().setDisplayWindowRect(this.LL.LLJJIJIIJIL);
                    }
                    SceneryCropPictureAssem sceneryCropPictureAssem2 = this.LL;
                    sceneryCropPictureAssem2.LLJJIJIL = sceneryCropPictureAssem2.mp();
                    C500260Jjc.LLFFF(this.LL.mp());
                    C500260Jjc.LJIILIIL(this.LL.op());
                }
            } else {
                SceneryCropPictureAssem sceneryCropPictureAssem3 = this.LL;
                Rect rect2 = sceneryCropPictureAssem3.LLJJIJI;
                sceneryCropPictureAssem3.LLJJJ = rect2;
                if (rect2 != null) {
                    sceneryCropPictureAssem3.lp().setDisplayWindowRect(this.LL.LLJJJ);
                }
                SceneryCropPictureAssem sceneryCropPictureAssem4 = this.LL;
                sceneryCropPictureAssem4.LLJJIJIL = sceneryCropPictureAssem4.op();
                C500260Jjc.LJIILIIL(this.LL.mp());
                C500260Jjc.LLFFF(this.LL.op());
            }
        } else {
            SceneryCropPictureAssem sceneryCropPictureAssem5 = this.LL;
            sceneryCropPictureAssem5.LLJJJ = null;
            C500260Jjc.LJIILIIL(sceneryCropPictureAssem5.op());
            C500260Jjc.LJIILIIL(this.LL.mp());
        }
        return Unit.LIZ;
    }
}
