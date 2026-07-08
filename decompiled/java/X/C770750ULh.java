package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.tux.sheet.intro.TuxIntroFragment;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ULh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770750ULh {
    public Drawable LIZ;
    public C419910GdJ LIZIZ;
    public Function1<? super ImageView, Unit> LIZJ;
    public CharSequence LJ;
    public CharSequence LJFF;
    public CharSequence LJII;
    public C770770ULj LJIIIIZZ;
    public Function1<? super C770770ULj, Unit> LJIIIZ;
    public CharSequence LJIIJ;
    public C770770ULj LJIIJJI;
    public Function1<? super C770770ULj, Unit> LJIIL;
    public View LJIILIIL;
    public boolean LJIILJJIL;
    public View LJIILL;
    public boolean LJIJ;
    public Integer LJIJI;
    public int LIZLLL = 1;
    public final List<Object> LJI = new ArrayList();
    public boolean LJIILLIIL = true;
    public boolean LJIIZILJ = true;

    public final TuxIntroFragment LIZ() {
        this.LJIIZILJ = false;
        TuxIntroFragment tuxIntroFragment = new TuxIntroFragment();
        tuxIntroFragment.LL = this;
        return tuxIntroFragment;
    }

    public final C1390920mIc LIZIZ() {
        this.LJIIZILJ = true;
        TuxIntroFragment tuxIntroFragment = new TuxIntroFragment();
        tuxIntroFragment.LL = this;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = tuxIntroFragment;
        tuxSheet.LLJLILLLLZIIL = false;
        c1390920mIc.LJIIIIZZ(0);
        c1390920mIc.LIZ.LLJ = this.LJIILLIIL;
        Integer num = this.LJIJI;
        if (num != null) {
            c1390920mIc.LIZLLL(num.intValue(), false);
        }
        return c1390920mIc;
    }

    public final void LIZJ(CharSequence charSequence) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(Collections.singletonList(charSequence));
    }

    public final void LIZLLL(List list) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(list);
    }

    public final void LJ(C1667580tUq... c1667580tUqArr) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(C13LQ.LJJLL(c1667580tUqArr));
    }

    public final void LJFF(C345890DhD... c345890DhDArr) {
        ((ArrayList) this.LJI).clear();
        ((ArrayList) this.LJI).addAll(C13LQ.LJJLL(c345890DhDArr));
    }

    public final void LJI(CharSequence charSequence, Function1 function1) {
        C770770ULj c770770ULj = new C770770ULj();
        c770770ULj.LIZIZ(charSequence);
        c770770ULj.LIZJ = function1;
        this.LJIIIIZZ = c770770ULj;
        this.LJII = c770770ULj.LJFF;
        this.LJIIIZ = function1;
    }

    public final void LJII(CharSequence charSequence, Function1 function1) {
        C770770ULj c770770ULj = new C770770ULj();
        c770770ULj.LIZIZ(charSequence);
        c770770ULj.LIZJ = function1;
        this.LJIIJJI = c770770ULj;
        this.LJIIJ = c770770ULj.LJFF;
        this.LJIIL = function1;
    }
}
