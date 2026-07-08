package X;

import Y.ACListenerS130S0200000_28;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS429S0200000_28;

/* JADX INFO: renamed from: X.10R6, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10R6 extends RecyclerView.ViewHolder {
    public final C21592419es LL;
    public final C01GW LLILLJJLI;
    public final ImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public C19246810Rm LLILZLL;
    public final /* synthetic */ C10R4 LLIZ;

    public final int I5() {
        return getAdapterPosition() - 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10R6(C10R4 c10r4, View view) {
        super(view);
        this.LLIZ = c10r4;
        Context context = view.getContext();
        this.LL = new C21592419es(C12ES.LIZJ(8.0f, context), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, context), ColorProtector.parseColor("#1f000000"), C12ES.LIZJ(8.0f, context));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS429S0200000_28(view, this, 169));
        this.LLILLJJLI = c01gwLIZIZ;
        this.LLILLL = (ImageView) this.itemView.findViewById(R.id.dq_);
        this.LLILZ = (TuxTextView) this.itemView.findViewById(R.id.h5g);
        this.LLILZIL = (TuxTextView) this.itemView.findViewById(R.id.nnw);
        if (c01gwLIZIZ.getValue() != null) {
            view.setBackground((Drawable) c01gwLIZIZ.getValue());
        }
        C786410Ut5.I7(new ACListenerS130S0200000_28(this, c10r4, 69), view);
        view.setLayerType(1, null);
    }
}
