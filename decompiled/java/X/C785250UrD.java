package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0UrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C785250UrD extends C1119670fF7<C785250UrD> {
    public Integer LJJIIJZLJL;
    public int LJJIIZ;
    public boolean LJJIIZI;
    public Function0<Unit> LJJIJ;

    @Override // X.C1119670fF7
    /* JADX INFO: renamed from: LJI, reason: merged with bridge method [inline-methods] */
    public final C785260UrE LIZJ() {
        C785260UrE c785260UrE = new C785260UrE(this);
        C785250UrD c785250UrD = c785260UrE.LJJIIJ;
        CharSequence charSequence = c785250UrD.LJIJJ;
        c785260UrE.LJIILJJIL = charSequence;
        c785260UrE.LJJIIJZLJL = c785250UrD.LJJIJ;
        c785260UrE.LJJIIZ = c785250UrD.LJJIIZI;
        c785260UrE.LJJIIZI = c785250UrD.LJJIIZ;
        if (c785260UrE.LIZ != null && !TextUtils.isEmpty(charSequence)) {
            View viewSd = C786410Ut5.Sd(R.layout.gzb, C786410Ut5.ne(c785260UrE.LIZ), null);
            ((TextView) viewSd.findViewById(R.id.jdm)).setText(c785260UrE.LJJIIJ.LJIJJ);
            Integer num = this.LJJIIJZLJL;
            if (num != null) {
                int iIntValue = num.intValue();
                LiveIconView liveIconView = (LiveIconView) viewSd.findViewById(R.id.jcl);
                liveIconView.setIconAttr(iIntValue);
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
            c785260UrE.LJIJI = c785260UrE.LIZ.getResources().getDimensionPixelSize(R.dimen.an9);
            c785260UrE.LJIJJLI = c785260UrE.LIZ.getResources().getDimensionPixelSize(R.dimen.an9);
            c785260UrE.LJIJJ = c785260UrE.LIZ.getResources().getDimensionPixelSize(R.dimen.anb);
            c785260UrE.LJIL = c785260UrE.LIZ.getResources().getDimensionPixelSize(R.dimen.anb);
            c785260UrE.LJIIIZ = viewSd.getResources().getDimensionPixelSize(R.dimen.an_);
            c785260UrE.LIZJ = viewSd;
        }
        return c785260UrE;
    }

    public C785250UrD(View view) {
        super(C011Z.LIZ.LJIIIZ(), view);
        this.LJJIIZ = 66;
    }

    public final void LJII(int i) {
        this.LJJIIJZLJL = Integer.valueOf(i);
    }
}
