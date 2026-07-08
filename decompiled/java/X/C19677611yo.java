package X;

import android.graphics.Bitmap;
import android.util.Size;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import g1c.AjS71S0100000_29;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11yo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19677611yo extends RecyclerView.ViewHolder {
    public final View LL;
    public final InterfaceC1631630sYr<MediaModel, Integer, Bitmap, Long, Unit> LLILLJJLI;
    public final SmartImageView LLILLL;
    public MediaModel LLILZ;
    public int LLILZIL;
    public final Size LLILZLL;

    public C19677611yo(View view, InterfaceC1631630sYr interfaceC1631630sYr) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = interfaceC1631630sYr;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gg1);
        this.LLILLL = smartImageView;
        this.LLILZLL = C2482209o4.LIZ(view);
        C786410Ut5.I7(new AjS71S0100000_29(this, 7), smartImageView);
    }
}
