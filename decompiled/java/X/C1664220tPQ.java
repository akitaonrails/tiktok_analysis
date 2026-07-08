package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Space;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tPQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664220tPQ extends AbstractC1664130tPH {
    public static final int LLJILJIL = C366700EZg.LIZ(60.0d);
    public static final int LLJILJILJ = C366700EZg.LIZ(72.0d);
    public static final int LLJILLL = (int) (((double) C1415610mwR.LIZIZ()) * 0.14d);
    public static final int LLJJ = (int) (((double) C1415610mwR.LIZIZ()) * 0.22d);
    public static final int LLJJI = C366700EZg.LIZ(74.0d);
    public static final int LLJJIII = C366700EZg.LIZ(88.0d);
    public final boolean LLJI;
    public Function0<Boolean> LLJIJIL;

    @Override // X.AbstractC1664130tPH
    public final void LLLFZ() {
    }

    @Override // X.AbstractC1664130tPH
    public final void LLLIIIIL() {
    }

    public C1664220tPQ(boolean z) {
        this.LLJI = z;
    }

    @Override // X.AbstractC1664130tPH, X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        C1664150tPJ c1664150tPJ = (C1664150tPJ) ListProtector.get(this.LLILLL, i);
        if (c1664150tPJ.LIZLLL) {
            return 10;
        }
        if (c1664150tPJ.LIZIZ) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC1664130tPH
    public final RecyclerView.ViewHolder LLLIILIL(ViewGroup viewGroup, int i, C1664160tPK c1664160tPK) {
        FrameLayout frameLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (i != 0) {
            if (i != 10) {
                final Space space = new Space(viewGroup.getContext());
                return new RecyclerView.ViewHolder(space) { // from class: X.0tPR
                };
            }
            FrameLayout frameLayout2 = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ui, viewGroup, false);
            View viewFindViewById = frameLayout2.findViewById(R.id.w4q);
            C1295960jpS c1295960jpS = (C1295960jpS) frameLayout2.findViewById(R.id.m6n);
            c1295960jpS.setAnimationFromUrl("https://p16-amd-va.tiktokcdn.com/obj/musically-maliva-obj/Speech_to_song.json");
            c1295960jpS.setRepeatCount(-1);
            c1295960jpS.playAnimation();
            TuxTextView tuxTextView = (TuxTextView) frameLayout2.findViewById(R.id.zjr);
            if (this.LLJI) {
                i5 = LLJILJILJ;
                i6 = LLJJ;
            } else {
                i5 = LLJILJIL;
                i6 = LLJILLL;
            }
            int iMin = Math.min(i5, i6);
            c1295960jpS.getLayoutParams().width = iMin;
            c1295960jpS.getLayoutParams().height = iMin;
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if (this.LLJI) {
                i7 = LLJJIII;
            } else {
                i7 = LLJJI;
            }
            layoutParams.width = i7;
            tuxTextView.setHorizontalFadingEdgeEnabled(true);
            tuxTextView.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, tuxTextView.getContext()));
            viewFindViewById.getLayoutParams().width = iMin + C366700EZg.LIZ(8.0d);
            viewFindViewById.getLayoutParams().height = viewFindViewById.getLayoutParams().width;
            C1664310tPZ c1664310tPZ = new C1664310tPZ(frameLayout2, null, tuxTextView, viewFindViewById, c1664160tPK, null);
            c1664310tPZ.LLJJ = new C1664250tPT(viewFindViewById, null);
            return c1664310tPZ;
        }
        Function0<Boolean> function0 = this.LLJIJIL;
        if (function0 != null && function0.invoke().booleanValue()) {
            frameLayout = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uf, viewGroup, false);
        } else {
            frameLayout = (FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.uh, viewGroup, false);
        }
        View viewFindViewById2 = frameLayout.findViewById(R.id.w4q);
        SmartImageView smartImageView = (SmartImageView) frameLayout.findViewById(R.id.lfj);
        TuxTextView tuxTextView2 = (TuxTextView) frameLayout.findViewById(R.id.zjr);
        if (this.LLJI) {
            i2 = LLJILJILJ;
            i3 = LLJJ;
        } else {
            i2 = LLJILJIL;
            i3 = LLJILLL;
        }
        int iMin2 = Math.min(i2, i3);
        C19670911xj c19670911xj = (C19670911xj) frameLayout.findViewById(R.id.lno);
        smartImageView.getLayoutParams().width = iMin2;
        smartImageView.getLayoutParams().height = iMin2;
        c19670911xj.getLayoutParams().width = iMin2;
        c19670911xj.getLayoutParams().height = iMin2;
        ViewGroup.LayoutParams layoutParams2 = tuxTextView2.getLayoutParams();
        if (this.LLJI) {
            i4 = LLJJIII;
        } else {
            i4 = LLJJI;
        }
        layoutParams2.width = i4;
        tuxTextView2.setHorizontalFadingEdgeEnabled(true);
        tuxTextView2.setFadingEdgeLength((int) C12ES.LIZJ(4.0f, tuxTextView2.getContext()));
        viewFindViewById2.getLayoutParams().width = iMin2 + C366700EZg.LIZ(8.0d);
        viewFindViewById2.getLayoutParams().height = viewFindViewById2.getLayoutParams().width;
        C1664310tPZ c1664310tPZ2 = new C1664310tPZ(frameLayout, smartImageView, tuxTextView2, viewFindViewById2, c1664160tPK, c19670911xj);
        c1664310tPZ2.LLJJ = new C1664250tPT(viewFindViewById2, c19670911xj);
        return c1664310tPZ2;
    }
}
