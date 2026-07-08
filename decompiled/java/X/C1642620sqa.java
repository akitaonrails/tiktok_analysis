package X;

import Y.ACListenerS159S0100000_25;
import Y.ATListenerS345S0200000_25;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS269S0300000_25;
import u4.q0;

/* JADX INFO: renamed from: X.0sqa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1642620sqa extends RecyclerView.ViewHolder {
    public final C1322110kVd LL;
    public final TextView LLILLJJLI;
    public final ImageView LLILLL;
    public final int LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public final /* synthetic */ C1642600sqY LLIZ;

    public final void I5(C1642670sqf c1642670sqf) {
        Drawable drawable;
        float f;
        C1324750kZt.LJIIIZ(this.LL, String.valueOf(c1642670sqf.LIZ.LIZ.LJIIIIZZ), -1, -1);
        this.LLILLJJLI.setText(c1642670sqf.LIZ.LIZ.LIZJ);
        ImageView imageView = this.LLILLL;
        C1642630sqb c1642630sqb = this.LLIZ.LLILLL;
        if (c1642670sqf.LIZIZ) {
            drawable = c1642630sqb.LLJIJIL;
        } else {
            drawable = c1642630sqb.LLJI;
        }
        imageView.setImageDrawable(drawable);
        if (c1642670sqf.LIZ.LIZJ) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        C786410Ut5.V4(imageView, f);
        this.LLILZIL = c1642670sqf.LIZIZ;
        this.LLILZLL = c1642670sqf.LIZ.LIZJ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1642620sqa(C1642600sqY c1642600sqY, LinearLayout linearLayout) {
        super(linearLayout);
        this.LLIZ = c1642600sqY;
        C1322110kVd c1322110kVd = (C1322110kVd) linearLayout.getChildAt(0);
        this.LL = c1322110kVd;
        TextView textView = (TextView) linearLayout.getChildAt(1);
        this.LLILLJJLI = textView;
        this.LLILLL = (ImageView) linearLayout.getChildAt(2);
        this.LLILZ = c1642600sqY.LLILLL.getContext().getResources().getColor(R.color.a0t);
        C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
        hierarchy = hierarchy == null ? new C1331090kk7(c1642600sqY.LLILLL.getResources()).LIZ() : hierarchy;
        C1331100kk8 c1331100kk8 = new C1331100kk8();
        c1331100kk8.LIZIZ = c1642600sqY.LLILLL.getFilterBoxViewConfigure().LIZ.LIZ;
        if (!c1642600sqY.LLILLL.getFilterBoxViewConfigure().LIZ.LIZ) {
            c1331100kk8.LJII(c1642600sqY.LLILLL.getFilterBoxViewConfigure().LIZ.LIZIZ);
        }
        hierarchy.LJJIII(c1331100kk8);
        hierarchy.LJIIZILJ(InterfaceC1320380kSq.LJI);
        c1322110kVd.setHierarchy(hierarchy);
        int iLIZIZ = (int) C11VU.LIZIZ(c1642600sqY.LLILLL.getFilterBoxViewConfigure().LIZ.LIZJ, c1642600sqY.LLILLL.getContext());
        int iLIZIZ2 = (int) C11VU.LIZIZ(c1642600sqY.LLILLL.getFilterBoxViewConfigure().LIZ.LIZLLL, c1642600sqY.LLILLL.getContext());
        ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
        layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(iLIZIZ, iLIZIZ2) : layoutParams;
        layoutParams.width = iLIZIZ;
        layoutParams.height = iLIZIZ2;
        C786410Ut5.c7(this.LL, layoutParams);
        C786410Ut5.R7(linearLayout, new ACListenerS159S0100000_25(new AwS269S0300000_25(this, c1642600sqY, c1642600sqY.LLILLL, 4), 2));
        linearLayout.setOnTouchListener(new ATListenerS345S0200000_25(linearLayout, this, 0));
        textView.setImportantForAccessibility(2);
        q0.LJIJ(linearLayout, new C1698450uId(this, 0));
    }
}
