package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.duet.model.DuetDetailModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS573S0100000_29;

/* JADX INFO: renamed from: X.10lg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19341410lg implements InterfaceC19341110ld {
    public final Context LIZIZ;
    public final Function0<String> LIZJ;
    public RemoteImageView LIZLLL;
    public TextView LJ;
    public TextView LJFF;
    public ViewGroup LJI;
    public TextView LJII;
    public View LJIIIIZZ;

    @Override // X.InterfaceC19341110ld
    public final void LIZ(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.jit);
        if (viewGroup != null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LIZIZ), R.layout.ftv, viewGroup, true);
            this.LIZLLL = (RemoteImageView) viewTd.findViewById(R.id.gbm);
            this.LJ = (TextView) viewTd.findViewById(R.id.gbv);
            this.LJFF = (TextView) viewTd.findViewById(R.id.gbw);
            this.LJI = (ViewGroup) viewTd.findViewById(R.id.ncq);
            this.LJII = (TextView) viewTd.findViewById(R.id.zje);
            this.LJIIIIZZ = viewTd.findViewById(R.id.gbk);
        }
    }

    @Override // X.InterfaceC19341110ld
    public final void LIZIZ(DuetDetailModel duetDetailModel) {
        C1324840ka2.LJFF(this.LIZLLL, duetDetailModel.cover);
        TextView textView = this.LJ;
        if (textView != null) {
            textView.setText(duetDetailModel.pageTitle);
        }
        TextView textView2 = this.LJFF;
        if (textView2 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(duetDetailModel.videoCount);
            sbLIZ.append(' ');
            textView2.setText(C2188811AlT.LIZIZ(sbLIZ));
        }
        C19354710np c19354710np = EnumC19354610no.Companion;
        Integer num = duetDetailModel.remindType;
        c19354710np.getClass();
        EnumC19354610no enumC19354610noLIZ = C19354710np.LIZ(num);
        if (enumC19354610noLIZ != null) {
            int i = 8;
            if (enumC19354610noLIZ == EnumC19354610no.UNKNOWN_REMIND_TYPE) {
                ViewGroup viewGroup = this.LJI;
                if (viewGroup != null) {
                    C786410Ut5.LJLZ(8, viewGroup);
                }
            } else {
                ViewGroup viewGroup2 = this.LJI;
                if (viewGroup2 != null) {
                    C786410Ut5.LJLZ(0, viewGroup2);
                }
                TextView textView3 = this.LJII;
                if (textView3 != null) {
                    textView3.setText(this.LIZIZ.getString(enumC19354610noLIZ.getTextId()));
                }
                View view = this.LJIIIIZZ;
                if (view != null) {
                    if (enumC19354610noLIZ == EnumC19354610no.REMIND_SELF_SEE || enumC19354610noLIZ == EnumC19354610no.REMIND_FRIEND_SEE || enumC19354610noLIZ == EnumC19354610no.REMIND_ANYONE_SEE) {
                        i = 0;
                    }
                    C786410Ut5.LJLLLLLL(i, view);
                }
            }
        }
        RemoteImageView remoteImageView = this.LIZLLL;
        if (remoteImageView != null) {
            C786410Ut5.E9(remoteImageView, new ACListenerS163S0100000_29(this, 31));
        }
        View view2 = this.LJIIIIZZ;
        if (view2 != null) {
            C786410Ut5.I7(new C12Y5(this, 8), view2);
        }
    }

    public C19341410lg(C19EG c19eg, AwS573S0100000_29 awS573S0100000_29) {
        this.LIZIZ = c19eg;
        this.LIZJ = awS573S0100000_29;
    }
}
