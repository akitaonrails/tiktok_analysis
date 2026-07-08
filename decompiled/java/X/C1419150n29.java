package X;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.gamora.editor.recommendeffect.net.RecommendEffectItem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n29, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419150n29 extends RecyclerView.ViewHolder {
    public RecommendEffectItem LL;
    public final C1324800kZy LLILLJJLI;
    public final C417370GYd LLILLL;
    public final ImageView LLILZ;
    public final /* synthetic */ ViewOnClickListenerC1419140n28 LLILZIL;

    public final void I5() {
        C417370GYd c417370GYd = this.LLILLL;
        int visibility = c417370GYd.getVisibility();
        c417370GYd.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c417370GYd);
        C417370GYd c417370GYd2 = this.LLILLL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.e4);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(10));
        c417370GYd2.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1419150n29(ViewOnClickListenerC1419140n28 viewOnClickListenerC1419140n28, View view) {
        super(view);
        this.LLILZIL = viewOnClickListenerC1419140n28;
        C1324800kZy c1324800kZy = (C1324800kZy) view.findViewById(R.id.w65);
        c1324800kZy.LLJILJIL = true;
        c1324800kZy.setRectFRadius(C418440Gaw.LIZIZ(10));
        int i = C1324800kZy.LLJILLL;
        c1324800kZy.setClipStyle(1);
        c1324800kZy.getLayoutParams().width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        c1324800kZy.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60));
        this.LLILLJJLI = c1324800kZy;
        this.LLILLL = (C417370GYd) view.findViewById(R.id.w4l);
        this.LLILZ = (ImageView) view.findViewById(R.id.gvt);
    }
}
