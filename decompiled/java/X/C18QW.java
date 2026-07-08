package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18QW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QW implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final int LIZJ;
    public final Float LIZLLL;
    public final C18QX LJ;
    public final /* synthetic */ C18QS LJFF;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        C1331660kl2.LJIIIZ(str).LJJII(new C21524719Lp(this, levelListDrawable, this.LJFF, 0));
        return levelListDrawable;
    }

    public /* synthetic */ C18QW(C18QS c18qs, Context context, TextView textView, int i, Float f) {
        this(c18qs, context, textView, i, f, null);
    }

    public C18QW(C18QS c18qs, Context context, TextView textView, int i, Float f, C18QX c18qx) {
        this.LJFF = c18qs;
        this.LIZ = context;
        this.LIZIZ = textView;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = c18qx;
    }
}
