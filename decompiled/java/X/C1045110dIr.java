package X;

import android.graphics.PointF;
import android.graphics.RectF;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS382S0200000_16;

/* JADX INFO: renamed from: X.0dIr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045110dIr implements InterfaceC1066480drK {
    public final InterfaceC1045100dIq LIZ;
    public C0P0T LIZIZ;

    public C1045110dIr(C1044460dHo c1044460dHo) {
        this.LIZ = c1044460dHo;
    }

    @Override // X.InterfaceC1066480drK
    public final void LIZ(AbstractC1384320m7y abstractC1384320m7y, RectF rectF, PointF pointF, int i) {
        int iIntValue;
        if (abstractC1384320m7y instanceof C1044660dI8) {
            C1044660dI8 c1044660dI8 = (C1044660dI8) abstractC1384320m7y;
            int[] iArr = new int[2];
            this.LIZ.LIZIZ().LIZ.getLocationInWindow(iArr);
            int i2 = iArr[1];
            C450860Hm8 c450860Hm8 = new C450860Hm8(this.LIZ.getContext());
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.uj, this.LIZ.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            c450860Hm8.LJI(iIntValue);
            c450860Hm8.LJIIJ(new AwS382S0200000_16(this, c1044660dI8, 134));
            c450860Hm8.LIZJ(new AwS382S0200000_16(this, c1044660dI8, 135));
            c450860Hm8.LLILLJJLI.LIZLLL = EnumC1235690iGF.BOTTOM;
            c450860Hm8.LIZ((int) pointF.x, ((int) rectF.bottom) + i2);
            c450860Hm8.LLILLJJLI.LJII = 3000L;
            this.LIZIZ = c450860Hm8.LIZIZ();
            this.LIZ.D0().LJJIJIIJIL(1001, c1044660dI8, null);
            this.LIZ.LIZIZ().LIZ.invalidate();
            C0P0T c0p0t = this.LIZIZ;
            if (c0p0t != null) {
                c0p0t.show();
            }
            this.LIZ.getLogger().logAd(C1045130dIt.LIZ, new AwS382S0200000_16(this, c1044660dI8, 136));
            return;
        }
        if (!(abstractC1384320m7y instanceof AbstractC1044650dI7)) {
            return;
        }
        AbstractC1044650dI7 abstractC1044650dI7 = (AbstractC1044650dI7) abstractC1384320m7y;
        this.LIZ.getLogger().logAd(C1045120dIs.LIZ, new AwS382S0200000_16(this, abstractC1044650dI7, 133));
        this.LIZ.LIZ().invoke(abstractC1044650dI7);
    }
}
