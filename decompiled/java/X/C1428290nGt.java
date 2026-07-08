package X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0nGt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1428290nGt extends RecyclerView.ViewHolder {
    public final View LL;
    public final Context LLILLJJLI;
    public final LinearLayout LLILLL;
    public final TuxTextView LLILZ;
    public final List<TextView> LLILZIL;
    public final List<C20626615nU> LLILZLL;
    public final C1295960jpS LLIZ;

    public C1428290nGt(View view) {
        String str;
        super(view);
        this.LL = view;
        Context context = this.itemView.getContext();
        this.LLILLJJLI = context;
        this.LLILLL = (LinearLayout) this.itemView.findViewById(R.id.m6p);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.xiq);
        this.LLILZIL = new ArrayList();
        this.LLILZLL = new ArrayList();
        this.LLIZ = (C1295960jpS) this.itemView.findViewById(R.id.xhc);
        View view2 = this.itemView;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.bx);
        view2.setBackground(c384050F3z.LIZ(context));
        for (int i = 0; i < 5; i++) {
            TuxTextView tuxTextView = new TuxTextView(this.LLILLJJLI, null, 6, 0);
            C786410Ut5.R6(tuxTextView, new LinearLayout.LayoutParams(-1, -2));
            tuxTextView.setTuxFont(41);
            tuxTextView.setTextColorRes(R.attr.a1h);
            C20626615nU c20626615nU = new C20626615nU(this.LLILLJJLI, null, 6);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 16;
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20626615nU);
            c20626615nU.setLayoutParams(layoutParams);
            C426750GoL.LJIIIZ(c20626615nU, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12))), 0, false, 16);
            if (i % 2 == 0) {
                str = "50%";
            } else {
                str = "100%";
            }
            c20626615nU.setPlaceholderConfig(new C20626915nX(str).LIZIZ());
            c20626615nU.setRadius(C418440Gaw.LIZIZ(4));
            c20626615nU.setLoading(true);
            c20626615nU.addView(tuxTextView);
            this.LLILLL.addView(c20626615nU);
            ((ArrayList) this.LLILZIL).add(tuxTextView);
            ((ArrayList) this.LLILZLL).add(c20626615nU);
        }
        C1295960jpS c1295960jpS = this.LLIZ;
        if (C960203pA.LIZIZ(c1295960jpS.getContext())) {
            c1295960jpS.setAnimation("search_tako_dots_loading_darkmode_tux_lottie.json");
        } else {
            c1295960jpS.setAnimation("search_tako_dots_loading_lightmode_tux_lottie.json");
        }
        c1295960jpS.setRepeatCount(-1);
        c1295960jpS.setRepeatMode(1);
    }

    public final void I5(boolean z) {
        Iterator<C20626615nU> it2 = this.LLILZLL.iterator();
        while (it2.hasNext()) {
            it2.next().setLoading(z);
        }
        int size = ((ArrayList) this.LLILZIL).size() - 1;
        int size2 = ((ArrayList) this.LLILZLL).size();
        if (size2 <= size) {
            while (true) {
                C786410Ut5.LJJL((View) ListProtector.get(this.LLILZIL, size), this.LLILLL);
                ListProtector.remove(this.LLILZIL, size);
                if (size == size2) {
                    break;
                } else {
                    size--;
                }
            }
        }
        if (z) {
            this.LLILZ.setText(C1383370m6R.LJIIJ(2131830575));
            this.LLILZ.setTextColorRes(R.attr.a1k);
            if (!this.LLIZ.isAnimating()) {
                this.LLIZ.cancelAnimation();
                C786410Ut5.LLD(0, this.LLIZ);
                this.LLIZ.setProgress(0.0f);
                this.LLIZ.playAnimation();
                return;
            }
            return;
        }
        this.LLIZ.cancelAnimation();
        C786410Ut5.LLD(8, this.LLIZ);
    }
}
