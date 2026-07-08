package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.zhiliaoapp.musically.R;
import wh6.AbS510S0200000_24;

/* JADX INFO: renamed from: X.0rDM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579860rDM extends AbstractC1579890rDP<C1579480rCk> {
    public C1579480rCk LL;
    public RemoteImageView LLILLJJLI;
    public View LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public final /* synthetic */ Context LLILZLL;
    public final /* synthetic */ C1579830rDJ LLIZ;

    @Override // X.AbstractC1579890rDP
    public final void onViewCreated(View view) {
        this.LLILLJJLI = (RemoteImageView) view.findViewById(R.id.kgf);
        this.LLILLL = view.findViewById(R.id.tp1);
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.tv_ranking);
        TuxTextView tuxTextView2 = null;
        if (tuxTextView != null) {
            tuxTextView.setTextColor(C1578770rBb.LIZ(this.LLILZLL, R.attr.a0p));
        } else {
            tuxTextView = null;
        }
        this.LLILZ = tuxTextView;
        TuxTextView tuxTextView3 = (TuxTextView) view.findViewById(R.id.tv_title);
        if (tuxTextView3 != null) {
            tuxTextView3.setTextColor(C1578770rBb.LIZ(this.LLILZLL, R.attr.a1h));
            tuxTextView2 = tuxTextView3;
        }
        this.LLILZIL = tuxTextView2;
        C786410Ut5.I7(new AbS510S0200000_24(this, this.LLIZ, 1), view);
    }

    @Override // X.AbstractC1579890rDP
    public final void I5(int i, Object obj) {
        String str;
        Integer numLIZJ;
        int iIntValue;
        String str2;
        C1579480rCk c1579480rCk = (C1579480rCk) obj;
        this.LL = c1579480rCk;
        RemoteImageView remoteImageView = this.LLILLJJLI;
        if (remoteImageView != null) {
            if (c1579480rCk != null) {
                str2 = c1579480rCk.LJFF;
            } else {
                str2 = null;
            }
            C1324840ka2.LJIIJ(remoteImageView, str2, 144, 190);
        }
        int i2 = i + 1;
        View view = this.LLILLL;
        if (view != null) {
            Context context = this.LLILZLL;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        numLIZJ = C1308910kAL.LIZJ(R.attr.zc, context);
                    } else {
                        numLIZJ = C1308910kAL.LIZJ(R.attr.a16, context);
                    }
                } else {
                    numLIZJ = C1308910kAL.LIZJ(R.attr.zs, context);
                }
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
            }
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -16777216;
            }
            view.setBackgroundColor(iIntValue);
        }
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(String.valueOf(i2));
        }
        TuxTextView tuxTextView2 = this.LLILZIL;
        if (tuxTextView2 != null) {
            if (c1579480rCk == null || (str = c1579480rCk.LJI) == null) {
                str = "";
            }
            tuxTextView2.setText(str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1579860rDM(ViewGroup viewGroup, Context context, C1579830rDJ c1579830rDJ) {
        super(R.layout.f50, viewGroup);
        this.LLILZLL = context;
        this.LLIZ = c1579830rDJ;
    }
}
