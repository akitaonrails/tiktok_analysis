package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0U2I, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public class C0U2I extends C0U2G {
    public final ViewGroup LLJJIII;
    public final List<C1324720kZq> LLJJIJI;

    @Override // X.C0U2M
    public boolean L5() {
        return false;
    }

    @Override // X.C0U2G
    public void R5(C0U22 c0u22) {
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        V5(c0u22);
    }

    public void V5(C0U22 c0u22) {
        String strLJIIL;
        if (!c0u22.LJIIJ().isEmpty()) {
            C500260Jjc.LLFFF(this.LLJJIII);
            int i = 0;
            for (C1324720kZq c1324720kZq : this.LLJJIJI) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1324720kZq c1324720kZq2 = c1324720kZq;
                    ImageModel imageModel = (ImageModel) C13LP.LJJJLZIJ(i, c0u22.LJIIJ());
                    if (imageModel != null) {
                        C500260Jjc.LLFFF(c1324720kZq2);
                        if (i < 2 || (i == 2 && c0u22.LJIILL == 3)) {
                            C1324610kZf c1324610kZfLJFF = C1819620xS4.LIZ().LJFF(Boolean.FALSE);
                            c1324610kZfLJFF.LJIILIIL = Boolean.TRUE;
                            c1324610kZfLJFF.LJIIIZ = R.drawable.ela;
                            c1324610kZfLJFF.LJIIL = new C786400Ut4(c1324720kZq2, 2);
                            c1324610kZfLJFF.LJIIIZ(imageModel);
                            c1324610kZfLJFF.LJJI(c1324720kZq2);
                            if (c1324720kZq2 != null) {
                                c1324720kZq2.setForeground(C497740JfY.LJIIJ(R.drawable.ezt));
                            }
                        } else if (c1324720kZq2 != null) {
                            c1324720kZq2.setForeground(null);
                            c1324720kZq2.setImageResource(R.drawable.eml);
                        }
                    } else {
                        C500260Jjc.LJIILIIL(c1324720kZq2);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        } else {
            C500260Jjc.LJIILIIL(this.LLJJIII);
        }
        C16F5 c16f5 = this.LLILZLL;
        if (c16f5 != null) {
            int i3 = c0u22.LJIILL;
            if (i3 > 0) {
                strLJIIL = C497740JfY.LJIIL(2131755489, i3, Integer.valueOf(i3));
            } else {
                strLJIIL = "";
            }
            c16f5.setText(strLJIIL);
        }
        C500260Jjc.LJIILIIL(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0U2I(int i, View view, Function1<? super Long, Integer> function1) {
        super(i, view, function1);
        this.LLJJIII = (ViewGroup) view.findViewById(R.id.tbh);
        this.LLJJIJI = C1697810uHb.LJIIJJI(view.findViewById(R.id.tbe), view.findViewById(R.id.tbf), view.findViewById(R.id.tbg));
    }

    @Override // X.C0U2G, X.C0U2M
    public void N5(C0U22 c0u22, int i, C0U2K c0u2k) {
        super.N5(c0u22, i, c0u2k);
        if (C0U2T.LIZ[c0u2k.ordinal()] == 1) {
            V5(c0u22);
        }
    }
}
