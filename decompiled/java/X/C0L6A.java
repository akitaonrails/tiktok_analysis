package X;

import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdkapi.subscribe.emote.LiveSubMediaModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0L6A, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public class C0L6A extends RecyclerView.ViewHolder {
    public final ViewGroup LL;
    public final C1322110kVd LLILLJJLI;
    public final View LLILLL;
    public final FrameLayout LLILZ;
    public final View LLILZIL;
    public final /* synthetic */ C0L69 LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L6A(C0L69 c0l69, ViewGroup viewGroup) {
        super(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gr6, viewGroup, false));
        this.LLILZLL = c0l69;
        this.LL = viewGroup;
        this.LLILLJJLI = (C1322110kVd) this.itemView.findViewById(R.id.video_cover);
        this.LLILLL = this.itemView.findViewById(R.id.fkz);
        this.LLILZ = (FrameLayout) this.itemView.findViewById(R.id.tsc);
        View viewFindViewById = this.itemView.findViewById(R.id.fkx);
        this.LLILZIL = this.itemView.findViewById(R.id.rp6);
        float fLIZIZ = C497740JfY.LIZIZ(2.0f);
        int iLIZ = C446980Hfs.LIZ(viewGroup.getContext(), R.color.di);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(iLIZ);
        gradientDrawable.setStroke(0, 0);
        gradientDrawable.setCornerRadii(new float[]{0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ, fLIZIZ});
        if (C497740JfY.LJJ()) {
            int iLIZ2 = C446980Hfs.LIZ(viewGroup.getContext(), R.color.di);
            gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(iLIZ2);
            gradientDrawable.setStroke(0, 0);
            gradientDrawable.setCornerRadii(new float[]{fLIZIZ, fLIZIZ, 0.0f, 0.0f, fLIZIZ, fLIZIZ, 0.0f, 0.0f});
        }
        viewFindViewById.setBackground(gradientDrawable);
    }

    public final void I5(LiveSubMediaModel liveSubMediaModel, int i) {
        if (liveSubMediaModel == null) {
            return;
        }
        int i2 = 8;
        if (this.LLILZLL.LL.size() <= 1) {
            C786410Ut5.LJLLLLLL(8, this.LLILLL);
        }
        View view = this.LLILZIL;
        if (this.LLILZLL.LLILLL == i) {
            i2 = 0;
        }
        C786410Ut5.LJLLLLLL(i2, view);
    }
}
