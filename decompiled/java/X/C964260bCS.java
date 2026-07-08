package X;

import Y.ACListenerS150S0100000_15;
import Y.ACListenerS81S0300000_15;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bCS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964260bCS {
    public final C964350bCb LIZ;

    public C964260bCS(C964350bCb c964350bCb) {
        this.LIZ = c964350bCb;
    }

    public final void LIZ(View view, C963810bBj c963810bBj) {
        String strLJIJI;
        ImageView imageView = (ImageView) view.findViewById(R.id.ifp);
        if (imageView != null) {
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(c963810bBj.LIZJ.getAvatarThumb());
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            c1324610kZfLJIIIZ.LJJI(imageView);
            C786410Ut5.Q7(imageView, new ACListenerS150S0100000_15(c963810bBj, 212));
        }
        TextView textView = (TextView) view.findViewById(R.id.ifr);
        if (textView != null) {
            textView.setText(C0KVU.LIZ(c963810bBj.LIZJ));
        }
        C16FS c16fs = (C16FS) view.findViewById(R.id.ifq);
        if (c16fs != null) {
            if (c963810bBj.LIZ()) {
                c16fs.j0(R.style.a85);
                c16fs.setText(C497740JfY.LJIJI(2131853485));
            } else {
                c16fs.j0(R.style.a7h);
                if (c963810bBj.LIZIZ == 3) {
                    strLJIJI = C497740JfY.LJIJI(2131841702);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131840617);
                }
                c16fs.setText(strLJIJI);
            }
            c16fs.setMinHeight(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
            C786410Ut5.h8(c16fs, new ACListenerS81S0300000_15(this, view, c963810bBj, 6));
        }
    }
}
