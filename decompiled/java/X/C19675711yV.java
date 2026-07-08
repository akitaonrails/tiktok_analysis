package X;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS71S0100000_29;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11yV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19675711yV extends RecyclerView.ViewHolder {
    public final View LL;
    public final InterfaceC1631630sYr<MediaModel, Integer, Long, Bitmap, Unit> LLILLJJLI;
    public final SmartImageView LLILLL;
    public MediaModel LLILZ;
    public int LLILZIL;
    public final Size LLILZLL;

    public C19675711yV(View view, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC1631630sYr;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gg1);
        this.LLILLL = smartImageView;
        int iLJIIJ = (int) ((C12ES.LJIIJ(view.getContext()) - (3 * C12ES.LIZJ(1.5f, view.getContext()))) / 4);
        Size size = new Size(iLJIIJ, (int) (((double) iLJIIJ) * 1.0d));
        this.LLILZLL = size;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        C786410Ut5.I7(new AjS71S0100000_29(this, 8), smartImageView);
    }
}
