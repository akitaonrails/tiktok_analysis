package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS243S0000000_11;

/* JADX INFO: renamed from: X.0Svo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737140Svo extends AbstractC737180Svs {
    public final C735210Ssh LL;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLJJLI;

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_story_star_2;
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131836884;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_add_to_story_action";
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setIconRes(R.raw.icon_story_star_2);
            tuxIconView.setTintColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(2131836884);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            C786410Ut5.LLLLLL(c427760Gpy, 8);
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.AbstractC737180Svs
    public final boolean LIZIZ() {
        return C1618440sDa.LIZIZ.LJIJJLI().LJIJI(this.LL.LIZ, false);
    }

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        C734080Sqs c734080Sqs = C734080Sqs.LIZ;
        String value = this.LL.LJI.getValue();
        C735210Ssh c735210Ssh = this.LL;
        String str = c735210Ssh.LJFF ? "user" : "visitor";
        String str2 = c735210Ssh.LJIIIZ;
        c734080Sqs.getClass();
        C734080Sqs.LIZ(value, str, "add_to_story", str2);
        LJJIIZ();
    }

    public final void LJJIIZ() {
        C1618440sDa c1618440sDa = C1618440sDa.LIZIZ;
        InterfaceC1618460sDc interfaceC1618460sDcLJIJJLI = c1618440sDa.LJIJJLI();
        C735210Ssh c735210Ssh = this.LL;
        Context context = c735210Ssh.LIZIZ;
        Aweme aweme = c735210Ssh.LIZ;
        interfaceC1618460sDcLJIJJLI.LJIIJ(new C20271514Tp(context, aweme, "profile_long_press", null, null, null, 0, aweme.getAwemeType() == 150 ? C1375730lu7.LIZIZ.LJI() : -1, null, false, null, null, C298460Bmu.LIZ(), false, null, null, null, null, 1031672));
        c1618440sDa.LJIJJLI().LJI(this.LL.LIZ, "share_to_story_click", AFwS243S0000000_11.get$arr$(660));
        Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILLJJLI;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public C737140Svo(C735210Ssh c735210Ssh) {
        this.LL = c735210Ssh;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
        LJJIIZ();
    }
}
