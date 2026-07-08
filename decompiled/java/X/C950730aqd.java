package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0aqd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C950730aqd extends AbstractC960470b6L<C950750aqf> {
    public final Function0<C950690aqZ> LL;
    public final C1324720kZq LLILLJJLI;
    public final View LLILLL;
    public final C01GW LLILZ;

    public C950730aqd(View view, Function0<C950690aqZ> function0) {
        super(view);
        this.LL = function0;
        this.LLILLJJLI = (C1324720kZq) view.findViewById(R.id.kb6);
        this.LLILLL = view.findViewById(R.id.bnu);
        this.LLILZ = C452501pT.LIZIZ(new AwS559S0100000_15(view, 593));
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        LiveEffect liveEffect;
        String strLJJLIIIJLLLLLLLZ;
        C950750aqf c950750aqf = (C950750aqf) obj;
        if (c950750aqf.LIZIZ) {
            View view = this.LLILLL;
            if (view != null) {
                C12ES.LJIILL(0, view);
            }
        } else {
            View view2 = this.LLILLL;
            if (view2 != null) {
                C12ES.LJIILL(4, view2);
            }
        }
        View view3 = this.itemView;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new AwS381S0200000_15(this, c950750aqf, 82));
        }
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null && (liveEffect = c950750aqf.LIZ) != null) {
            String strLJJ = liveEffect.LJJ();
            C0VSJ c0vsj = null;
            if ((strLJJ != null && (!a0.LJJJIL(strLJJ))) || ((strLJJLIIIJLLLLLLLZ = liveEffect.LJJLIIIJLLLLLLLZ()) != null && (!a0.LJJJIL(strLJJLIIIJLLLLLLLZ)) && (strLJJ = new C0VSJ(EnumC771350UNp.SHARE_EFFECT.getFullPath(), strLJJLIIIJLLLLLLLZ).getAbsolutePath()) != null)) {
                C0VSJ c0vsj2 = new C0VSJ(strLJJ);
                if (c0vsj2.exists() && c0vsj2.isFile() && c0vsj2.canRead() && c0vsj2.length() > 0) {
                    c0vsj = c0vsj2;
                }
            }
            String strLLJLLIL = liveEffect.LLJLLIL();
            C1324610kZf c1324610kZfLJIIL = C1819620xS4.LIZ().LJIIL((Drawable) this.LLILZ.getValue());
            c1324610kZfLJIIL.LJI = 200;
            c1324610kZfLJIIL.LJII = 200;
            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
            Float fValueOf = Float.valueOf(12.0f);
            c1546210qL5.getClass();
            c1324610kZfLJIIL.LJIJI(Float.valueOf(C1546210qL5.LIZ(fValueOf)));
            if (c0vsj != null) {
                c1324610kZfLJIIL.LJIIJ(c0vsj);
            } else {
                c1324610kZfLJIIL.setUrl(strLLJLLIL);
            }
            c1324610kZfLJIIL.LJJI(c1324720kZq);
        }
    }
}
