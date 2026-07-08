package X;

import Y.ACListenerS143S0100000_8;
import Y.ARunnableS108S0100000_8;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.airemix.api.IAIRemixService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0M5p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562830M5p extends C0M6E {
    public final TuxTextView LLJI;
    public ViewGroup LLJIJIL;
    public final ViewGroup LLJILJIL;
    public final TuxIconView LLJILJILJ;
    public final C426320Gne LLJILLL;
    public final TuxTextView LLJJ;
    public final ViewGroup LLJJI;
    public final TuxTextView LLJJIII;
    public C427760Gpy LLJJIJI;
    public final ViewGroup LLJJIJIIJIL;
    public ViewGroup LLJJIJIL;
    public EnumC562840M5q LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public long LLJJJJJIL;
    public C553680Lna LLJJJJLIIL;
    public final C01GW LLJJL;
    public final AwS587S0100000_8 LLJJLIIIJLLLLLLLZ;
    public ARunnableS108S0100000_8 LLJL;

    @Override // X.InterfaceC1259900itI
    public final void M0() {
    }

    public final IAIRemixService P5() {
        return (IAIRemixService) this.LLJJL.getValue();
    }

    public final void R5(C553680Lna c553680Lna) {
        Context context;
        C19EG c19egLIZIZ;
        if (c553680Lna != null && (context = this.LLILZIL) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            int i = this.LLJJJIL + 1;
            this.LLJJJIL = i;
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c19egLIZIZ), C0PEM.LIZJ, null, new C562810M5n(this, i, c553680Lna, null), 2);
        }
    }

    public final void S5(C553680Lna c553680Lna) {
        String strLIZIZ;
        EnumC562840M5q enumC562840M5q = this.LLJJJ;
        if (enumC562840M5q != EnumC562840M5q.LL && enumC562840M5q != EnumC562840M5q.LLILLJJLI) {
            if (c553680Lna.LJFF <= 0) {
                ViewGroup viewGroup = this.LLJJI;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
                this.LLJJJ = EnumC562840M5q.LLILZ;
                return;
            }
            this.LLJJJ = EnumC562840M5q.LLILLL;
            ViewGroup viewGroup2 = this.LLJJI;
            if (viewGroup2 != null) {
                C786410Ut5.LJLZ(0, viewGroup2);
            }
            long j = c553680Lna.LJFF;
            if (j <= 0) {
                strLIZIZ = "";
            } else {
                double d = j;
                double d2 = d / 1048576.0d;
                if (d < 1.073741824E9d) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1)));
                    sbLIZ.append(" MB");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2 / ((double) 1024))}, 1)));
                    sbLIZ2.append(" GB");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                }
            }
            TuxTextView tuxTextView = this.LLJJIII;
            if (tuxTextView != null) {
                tuxTextView.setText(strLIZIZ);
            }
        }
    }

    public C562830M5p(View view, ViewGroup viewGroup) {
        super(view, viewGroup);
        this.LLJJJ = EnumC562840M5q.LLILZ;
        this.LLJJL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(462));
        this.LLJJLIIIJLLLLLLLZ = new AwS587S0100000_8(this, 660);
        SmartImageView smartImageView = (SmartImageView) view.findViewById(R.id.cover);
        this.LLILLJJLI = smartImageView;
        C786410Ut5.Q8(smartImageView, new ACListenerS143S0100000_8(this, 135));
        this.LLJI = (TuxTextView) view.findViewById(R.id.zj5);
        this.LLJILJIL = (ViewGroup) this.itemView.findViewById(R.id.xeq);
        this.LLJILJILJ = (TuxIconView) this.itemView.findViewById(R.id.k46);
        this.LLJILLL = (C426320Gne) this.itemView.findViewById(R.id.s9t);
        this.LLJJ = (TuxTextView) this.itemView.findViewById(R.id.tv_status);
        this.LLJJI = (ViewGroup) this.itemView.findViewById(R.id.cda);
        this.LLJJIII = (TuxTextView) this.itemView.findViewById(R.id.cdb);
        this.LLJJIJIIJIL = (ViewGroup) this.itemView.findViewById(R.id.cb2);
    }
}
