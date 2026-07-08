package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0bgY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982920bgY extends C0J8P<C982910bgX, C984780bjY> {
    public final boolean LIZIZ;

    public C982920bgY(boolean z) {
        this.LIZIZ = z;
    }

    @Override // X.C0J8P
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX) {
        LJIIIIZZ((C984780bjY) viewHolder, c982910bgX);
    }

    @Override // X.C0J8P
    /* JADX INFO: renamed from: LJ */
    public final RecyclerView.ViewHolder LJIIJ(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return new C984780bjY(C786410Ut5.Td(layoutInflater, R.layout.h55, viewGroup, false));
    }

    public final void LJIIIIZZ(C984780bjY c984780bjY, C982910bgX c982910bgX) {
        String strLJIJI;
        ImageView imageView = (ImageView) c984780bjY.LLILLJJLI.getValue();
        C1121670fIL.LJIILIIL(imageView, c982910bgX.LIZIZ, imageView.getWidth(), imageView.getHeight(), R.drawable.el_);
        C500260Jjc.LJLJLJ((View) c984780bjY.LLILZ.getValue(), c982910bgX.LJII);
        C500260Jjc.LJLJLJ((View) c984780bjY.LLILZIL.getValue(), c982910bgX.LJIIIIZZ);
        C500260Jjc.LJLJLJ((View) c984780bjY.LLILZLL.getValue(), c982910bgX.LJIIIIZZ);
        ((TextView) c984780bjY.LLILZLL.getValue()).setText(c982910bgX.LJIIIZ);
        ((TextView) c984780bjY.LLIZ.getValue()).setText(c982910bgX.LIZJ);
        if (this.LIZIZ) {
            C500260Jjc.LJLJLJ((View) c984780bjY.LLJ.getValue(), false);
            C500260Jjc.LJLJLJ((View) c984780bjY.LLIZLLLIL.getValue(), true);
            TextView textView = (TextView) c984780bjY.LLIZLLLIL.getValue();
            int i = c982910bgX.LJIJ;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            strLJIJI = "";
                        } else {
                            strLJIJI = C497740JfY.LJIJI(2131856735);
                        }
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131856734);
                    }
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131856733);
                }
            } else {
                strLJIJI = C497740JfY.LJIJI(2131856732);
            }
            textView.setText(strLJIJI);
            return;
        }
        C500260Jjc.LJLJLJ((View) c984780bjY.LLJ.getValue(), c982910bgX.LJI);
        C500260Jjc.LJLJLJ((View) c984780bjY.LLIZLLLIL.getValue(), false);
    }

    @Override // X.C0J8P
    public final void LIZLLL(RecyclerView.ViewHolder viewHolder, C982910bgX c982910bgX, List list) {
        C984780bjY c984780bjY = (C984780bjY) viewHolder;
        C982910bgX c982910bgX2 = c982910bgX;
        if (list.size() <= 0) {
            LIZJ(c984780bjY, c982910bgX2);
        } else {
            LJIIIIZZ(c984780bjY, c982910bgX2);
        }
    }
}
