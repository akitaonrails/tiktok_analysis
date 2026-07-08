package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS96S1200000_11;
import wh6.AbS693S0100000_11;

/* JADX INFO: renamed from: X.0SVQ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SVQ extends ConstraintLayout implements InterfaceC722460SVo<C0SVS> {
    public final View LL;
    public final TuxIconView LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;

    public final void e0(TuxIconView tuxIconView, C722300SUy c722300SUy) {
        int i = c722300SUy.LIZ;
        if (i != C0SV1.LOCAL.ordinal() && i != C0SV1.REMOTE.ordinal() && i == C0SV1.TUX.ordinal()) {
            int i2 = c722300SUy.LIZIZ;
            if (i2 != -1) {
                tuxIconView.setIconRes(i2);
            }
            Integer numLIZJ = c722300SUy.LIZJ;
            if (numLIZJ != null || (numLIZJ = C1308910kAL.LIZJ(R.attr.ee, getContext())) != null) {
                tuxIconView.setTintColor(numLIZJ.intValue());
            }
        }
    }

    @Override // X.InterfaceC722460SVo
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public final void LLLLZLLLI(C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        Integer num;
        Integer numLIZJ;
        C0SVT c0svt = c0svs.LIZJ;
        if (c0svt == null) {
            int iOrdinal = C0SXM.COLOR.ordinal();
            if (C1865950yen.LIZ()) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.il, getContext());
            } else if (C1865950yen.LIZIZ()) {
                numLIZJ = C1308910kAL.LIZJ(R.attr.im, getContext());
            } else {
                numLIZJ = C1308910kAL.LIZJ(R.attr.bt, getContext());
            }
            c0svt = new C0SVT(iOrdinal, 0, numLIZJ, 2);
        }
        int i = c0svt.LIZ;
        if (i == C0SXM.IMAGE.ordinal()) {
            int i2 = c0svt.LIZIZ;
            if (i2 > 0) {
                this.LL.setBackgroundResource(i2);
            }
        } else if (i == C0SXM.COLOR.ordinal() && (num = c0svt.LIZJ) != null) {
            this.LL.setBackgroundColor(num.intValue());
        }
        ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(this.LL, EnumC700430Rdh.POSITIVE);
        Function1<View, Unit> function1 = c0svs.LJ;
        if (function1 != null) {
            C786410Ut5.I7(new AbS693S0100000_11(new AwS96S1200000_11(interfaceC722440SVm, function1, 9), 16), this.LL);
            C2271391DvN.LIZ(this.LL, (C1A5L) C2271381DvM.LLLZZ.getValue());
        } else {
            C786410Ut5.I7(null, this.LL);
        }
        e0(this.LLILLJJLI, c0svs.LIZ);
        this.LLILZ.setText(c0svs.LIZIZ);
        C722300SUy c722300SUy = c0svs.LIZLLL;
        if (c722300SUy != null) {
            e0(this.LLILLL, c722300SUy);
            C786410Ut5.LLLLLLZZ(this.LLILLL, 0);
        } else {
            C786410Ut5.LLLLLLZZ(this.LLILLL, 8);
        }
    }

    public C0SVQ(Context context, C0SVS c0svs, InterfaceC722440SVm<C0SVS> interfaceC722440SVm) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.i3a, C786410Ut5.ne(context), this);
        this.LL = viewSd;
        this.LLILLJJLI = (TuxIconView) viewSd.findViewById(R.id.bry);
        this.LLILLL = (TuxIconView) viewSd.findViewById(R.id.bs3);
        this.LLILZ = (TuxTextView) viewSd.findViewById(R.id.bsc);
        LLLLZLLLI(c0svs, interfaceC722440SVm);
    }
}
