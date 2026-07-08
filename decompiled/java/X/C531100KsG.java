package X;

import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0KsG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531100KsG extends RecyclerView.ViewHolder {
    public final View LL;
    public final Function1<MediaModel, Unit> LLILLJJLI;
    public final SmartImageView LLILLL;
    public MediaModel LLILZ;
    public InterfaceC420801kM LLILZIL;
    public final Size LLILZLL;

    public C531100KsG(View view, Function1 function1) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = function1;
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.gg1);
        this.LLILLL = smartImageView;
        int iLJIIJ = (int) ((C12ES.LJIIJ(view.getContext()) - (3 * C12ES.LIZJ(1.5f, view.getContext()))) / 4);
        Size size = new Size(iLJIIJ, (int) (((double) iLJIIJ) * 1.0d));
        this.LLILZLL = size;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = size.getWidth();
        layoutParams.height = size.getHeight();
        C786410Ut5.Q8(smartImageView, new C580840MqI(this, 0));
    }
}
