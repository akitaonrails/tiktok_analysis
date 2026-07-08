package Y;

import X.C21295818Vo;
import X.C21296918Vz;
import X.C21383018mC;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class ACListenerS63S0101000_32 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS63S0101000_32 aCListenerS63S0101000_32, View view) {
        ((C21383018mC) aCListenerS63S0101000_32.l0).LLILLJJLI.z1(aCListenerS63S0101000_32.i1);
    }

    public static final void onClick$1(ACListenerS63S0101000_32 aCListenerS63S0101000_32, View view) {
        C21295818Vo c21295818Vo;
        Object tag = view.getTag();
        if ((tag instanceof C21295818Vo) && (c21295818Vo = (C21295818Vo) tag) != null) {
            C21296918Vz c21296918Vz = (C21296918Vz) aCListenerS63S0101000_32.l0;
            int i = aCListenerS63S0101000_32.i1;
            if (c21295818Vo.LJI) {
                c21296918Vz.LLLLIL().LJII.invoke(Integer.valueOf(i));
            } else {
                c21296918Vz.LLLLIL().LJIIIIZZ.invoke(c21295818Vo);
            }
        }
    }

    public static final void onClick$2(ACListenerS63S0101000_32 aCListenerS63S0101000_32, View view) {
        Object tag = view.getTag();
        if ((tag instanceof C21295818Vo) && tag != null) {
            ((C21296918Vz) aCListenerS63S0101000_32.l0).LLLLIL().LJII.invoke(Integer.valueOf(aCListenerS63S0101000_32.i1));
        }
    }

    public ACListenerS63S0101000_32(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
