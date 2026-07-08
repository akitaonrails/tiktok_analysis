package X;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS563S0100000_19;
import wh6.AbS509S0200000_19;

/* JADX INFO: renamed from: X.0itR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1259990itR extends RecyclerView.ViewHolder implements InterfaceC487330J9f {
    public final String LL;
    public final Fragment LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final Integer LLILZIL;
    public final SmartImageView LLILZLL;
    public final TuxTextView LLIZ;
    public final C01GW LLIZLLLIL;
    public final C0HZQ LLJ;
    public Aweme LLJI;
    public int LLJIJIL;
    public final C0M3E LLJILJIL;
    public final View LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxIconView LLJJ;
    public final C01GW LLJJI;

    public final void I5() {
        ViewGroup.LayoutParams layoutParams = this.itemView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = C19252910Tv.LIZIZ.LIZLLL().LJI().LJJIJ(this.LLILZ, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(165)), this.itemView.getContext());
        }
    }

    @Override // X.InterfaceC487330J9f
    public final void onConfigurationChanged(Activity activity, Configuration configuration) {
        I5();
    }

    public C1259990itR(View view, String str, Fragment fragment, int i, int i2, Integer num) {
        super(view);
        this.LL = str;
        this.LLILLJJLI = fragment;
        this.LLILLL = i;
        this.LLILZ = i2;
        this.LLILZIL = num;
        this.LLIZLLLIL = C1509305vX.LIZ(new AwS558S0100000_14(view, 1337));
        this.LLJIJIL = -1;
        this.LLJJI = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2874));
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.eqx);
        this.LLILZLL = (SmartImageView) view.findViewById(R.id.v2k);
        this.LLIZ = (TuxTextView) view.findViewById(R.id.v2l);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_top);
        this.LLJILLL = tuxTextView;
        this.LLJJ = (TuxIconView) view.findViewById(R.id.lcd);
        View viewFindViewById = view.findViewById(R.id.video_cover_mask);
        this.LLJILJILJ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
        }
        if (num != null && num.intValue() == 1) {
            C0HZQ c0hzq = (C0HZQ) view.findViewById(R.id.v2j);
            this.LLJ = c0hzq;
            if (c0hzq != null) {
                c0hzq.setChecked(false);
                C786410Ut5.D7(c0hzq, new C1265910j2z(this, 5));
            }
        }
        C0M3E c0m3eLJIIJJI = C1EE2.LIZIZ.LJIIJJI(viewGroup);
        this.LLJILJIL = c0m3eLJIIJJI;
        C786410Ut5.I7(new AbS509S0200000_19(this, view, 6), view);
        if (tuxTextView != null) {
            c0m3eLJIIJJI.LIZ(tuxTextView);
        }
        I5();
    }
}
