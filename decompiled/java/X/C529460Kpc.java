package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;

/* JADX INFO: renamed from: X.0Kpc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C529460Kpc extends RecyclerView.ViewHolder {
    public final View LL;
    public final C1325000kaI LLILLJJLI;
    public final TextView LLILLL;
    public final TextView LLILZ;

    public final void I5(C523930Kgh c523930Kgh) {
        final TikTokMediaModel next;
        int i;
        this.LL.setTag(c523930Kgh);
        this.LLILLL.setText(c523930Kgh.LIZ);
        this.LLILZ.setText(String.valueOf(c523930Kgh.LIZJ.size() + c523930Kgh.LIZLLL.size()));
        if (C0BYL.LIZ() && c523930Kgh.LIZJ.isEmpty() && c523930Kgh.LIZLLL.isEmpty()) {
            if (c523930Kgh.LIZIZ != null) {
                if (this.LLILLJJLI.getLayoutParams().width > 0) {
                    i = this.LLILLJJLI.getLayoutParams().width;
                } else {
                    i = -1;
                }
                String string = c523930Kgh.LIZIZ.toString();
                if (!string.equals(this.LLILLJJLI.getTag())) {
                    C1324750kZt.LJIIJ(this.LLILLJJLI, string, i, i, Bitmap.Config.ARGB_4444);
                    this.LLILLJJLI.setTag(string);
                    return;
                }
                return;
            }
            this.LLILLJJLI.setImageDrawable(null);
            return;
        }
        if (!C2401009ay.LIZ(c523930Kgh.LIZJ)) {
            next = c523930Kgh.LIZJ.iterator().next();
        } else {
            if (!C2401009ay.LIZ(c523930Kgh.LIZLLL)) {
                next = c523930Kgh.LIZLLL.iterator().next();
            }
            this.LLILLJJLI.setImageDrawable(null);
            this.LLILLJJLI.setTag(null);
        }
        if (next != null) {
            C2286708xd.LIZIZ(new InterfaceC2286808xe() { // from class: X.0Kpe
                @Override // X.InterfaceC2286808xe
                public final void LIZ(Object obj) {
                    int i2;
                    C529460Kpc c529460Kpc = this.LIZ;
                    MediaModel mediaModel = next;
                    c529460Kpc.getClass();
                    if (obj != null && ((Boolean) obj).booleanValue()) {
                        if (c529460Kpc.LLILLJJLI.getLayoutParams().width > 0) {
                            i2 = c529460Kpc.LLILLJJLI.getLayoutParams().width;
                        } else {
                            i2 = -1;
                        }
                        String string2 = C2471909mP.LJIILIIL(mediaModel.LJFF()).toString();
                        if (!string2.equals(c529460Kpc.LLILLJJLI.getTag())) {
                            C1324750kZt.LJIIJ(c529460Kpc.LLILLJJLI, string2, i2, i2, Bitmap.Config.ARGB_4444);
                            c529460Kpc.LLILLJJLI.setTag(string2);
                        }
                    }
                }
            }, next.LJFF(), C289360BVu.LIZ());
            return;
        }
        this.LLILLJJLI.setImageDrawable(null);
        this.LLILLJJLI.setTag(null);
    }

    public C529460Kpc(View view, C1325000kaI c1325000kaI, TextView textView, TextView textView2) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = c1325000kaI;
        this.LLILLL = textView;
        this.LLILZ = textView2;
    }
}
