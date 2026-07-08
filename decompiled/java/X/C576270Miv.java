package X;

import Y.AObjectS351S0100000_8;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.experiment.PastMemoryTextFontConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS23S0001000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0Miv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576270Miv {
    public final C568190MQf LIZ;
    public final List<Integer> LIZIZ;
    public final C1664680tQA<C576280Miw> LIZJ;
    public final C1664680tQA LIZLLL;
    public final C1664680tQA<C576280Miw> LJ;
    public final C1664680tQA LJFF;
    public int LJI;
    public final List<Integer> LJII;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(int i) {
        if (i != ((C576280Miw) this.LIZLLL.LIZ).LIZ && i != -1) {
            this.LIZ.LIZ.LJIIJ(Unit.LIZ);
            this.LJ.LIZLLL(new AwS587S0100000_8(this, 672), true);
            this.LIZJ.LIZLLL(new AwS23S0001000_8(i, 12), true);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public C576270Miv(C568190MQf c568190MQf, LifecycleOwner lifecycleOwner, List<Integer> list) {
        List<Integer> listLJIILJJIL;
        this.LIZ = c568190MQf;
        this.LIZIZ = list;
        C1664680tQA<C576280Miw> c1664680tQA = new C1664680tQA<>(new C576280Miw(-1));
        this.LIZJ = c1664680tQA;
        this.LIZLLL = c1664680tQA;
        C1664680tQA<C576280Miw> c1664680tQA2 = new C1664680tQA<>(new C576280Miw(-1));
        this.LJ = c1664680tQA2;
        this.LJFF = c1664680tQA2;
        this.LJI = -1;
        C576290Mix.LIZ.getClass();
        if (((PastMemoryTextFontConfig) C576290Mix.LIZJ.getValue()).useClassicTextStyleLang.contains(C576290Mix.LIZ())) {
            if (((Number) C272850Amh.LIZ.getValue()).intValue() == 0) {
                listLJIILJJIL = C1697810uHb.LJIILJJIL(0, 1);
            } else {
                listLJIILJJIL = C1697810uHb.LJIILJJIL(1, 0);
            }
        } else if (((Number) C272850Amh.LIZ.getValue()).intValue() == 0) {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(1, 2, 3, 0);
        } else {
            listLJIILJJIL = C1697810uHb.LJIILJJIL(0, 1, 2, 3);
        }
        this.LJII = listLJIILJJIL;
        c568190MQf.LIZLLL.LJI.LJIIIZ(lifecycleOwner, Lifecycle.State.CREATED, new AwS587S0100000_8(new AObjectS351S0100000_8(this, 7), 322));
    }
}
