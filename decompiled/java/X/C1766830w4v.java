package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LevelListDrawable;
import android.text.Html;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0w4v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766830w4v implements Html.ImageGetter {
    public final Context LIZ;
    public final TextView LIZIZ;
    public final /* synthetic */ C1766800w4s LIZJ;

    @Override // android.text.Html.ImageGetter
    public final Drawable getDrawable(String str) {
        final LevelListDrawable levelListDrawable = new LevelListDrawable();
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str);
        final C1766800w4s c1766800w4s = this.LIZJ;
        c1331670kl3LJIIIZ.LJJII(new InterfaceC1331910klR() { // from class: X.0w4u
            @Override // X.InterfaceC1331910klR
            public final void onProgress(float f) {
            }

            @Override // X.InterfaceC1331910klR
            public final void onCanceled() {
                c1766800w4s.LJJJJJ();
            }

            @Override // X.InterfaceC1331910klR
            public final void LIZ(Bitmap bitmap) {
                if (bitmap == null) {
                    return;
                }
                levelListDrawable.addLevel(1, 1, new BitmapDrawable(this.LL.LIZ.getResources(), bitmap));
                levelListDrawable.setBounds(0, 0, (bitmap.getWidth() * C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14))) / bitmap.getHeight(), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
                levelListDrawable.setLevel(1);
                this.LL.LIZIZ.requestLayout();
                C1766800w4s c1766800w4s2 = c1766800w4s;
                int i = c1766800w4s2.LLJJL + 1;
                c1766800w4s2.LLJJL = i;
                if (i == c1766800w4s2.LLJJJJLIIL) {
                    c1766800w4s2.LJJJJJ();
                }
            }

            @Override // X.InterfaceC1331910klR
            public final void onFailed(Throwable th) {
                c1766800w4s.LJJJJJ();
            }
        });
        return levelListDrawable;
    }

    public C1766830w4v(C1766800w4s c1766800w4s, Context context, TextView textView) {
        this.LIZJ = c1766800w4s;
        this.LIZ = context;
        this.LIZIZ = textView;
    }
}
