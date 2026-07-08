package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;

/* JADX INFO: renamed from: X.18QV, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18QV implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final int LIZJ;
    public final Float LIZLLL;
    public final C18QX LJ;
    public final /* synthetic */ C18QT LJFF;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        LevelListDrawable levelListDrawable = new LevelListDrawable();
        C1326790kdB.LIZ.getClass();
        C1326790kdB.LIZLLL(str).LJJII(new C21524719Lp(this, levelListDrawable, this.LJFF, 1));
        return levelListDrawable;
    }

    public /* synthetic */ C18QV(C18QT c18qt, Context context, C18QS c18qs, int i, Float f) {
        this(c18qt, context, c18qs, i, f, null);
    }

    public C18QV(C18QT c18qt, Context context, C18QS c18qs, int i, Float f, C18QX c18qx) {
        this.LJFF = c18qt;
        this.LIZ = context;
        this.LIZIZ = c18qs;
        this.LIZJ = i;
        this.LIZLLL = f;
        this.LJ = c18qx;
    }
}
