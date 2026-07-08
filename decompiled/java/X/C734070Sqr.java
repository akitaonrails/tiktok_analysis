package X;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734070Sqr extends AbstractC737180Svs {
    public final C735210Ssh LL;
    public Function2<? super Boolean, ? super Exception, Unit> LLILLJJLI;

    @Override // X.InterfaceC1370310llN
    public final int LJIIIIZZ() {
        return R.raw.icon_camera_share_fill;
    }

    @Override // X.InterfaceC1370310llN
    public final void LJIILIIL(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC1370310llN
    public final int LJJLIIIJJIZ() {
        return 2131836870;
    }

    @Override // X.InterfaceC1370310llN
    public final String key() {
        return "long_press_share_action";
    }

    @Override // X.AbstractC737180Svs
    public final View LIZ() {
        View viewLJLLJ = C786410Ut5.LJLLJ(this.LL.LIZIZ, R.layout.efk, null);
        if (viewLJLLJ == null) {
            return null;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) viewLJLLJ.findViewById(R.id.a2e);
        if (constraintLayout != null) {
            C786410Ut5.m6(constraintLayout, new C19ME(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48))));
        }
        TuxIconView tuxIconView = (TuxIconView) viewLJLLJ.findViewById(R.id.k1_);
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
        TuxTextView tuxTextView = (TuxTextView) viewLJLLJ.findViewById(R.id.xom);
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
            tuxTextView.setText(2131836870);
        }
        C427760Gpy c427760Gpy = (C427760Gpy) viewLJLLJ.findViewById(R.id.bkc);
        if (c427760Gpy != null) {
            List<UrlModel> list = this.LL.LJII;
            if (list == null || list.isEmpty()) {
                C786410Ut5.LLLLLL(c427760Gpy, 8);
            } else {
                List<UrlModel> list2 = this.LL.LJII;
                if (list2 != null) {
                    C786410Ut5.LLLLLL(c427760Gpy, 0);
                    c427760Gpy.setSize(EnumC428930Grr.SMALL);
                    c427760Gpy.setTotalCount(list2.size());
                    int i = 0;
                    for (UrlModel urlModel : list2) {
                        int i2 = i + 1;
                        if (i < 0) {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                        Object objLJJLIIIJL = C13LP.LJJLIIIJL(urlModel.getUrlList());
                        if (objLJJLIIIJL != null) {
                            C427760Gpy.LIZ(c427760Gpy, i, objLJJLIIIJL, "", null, null, false, null, 2040);
                        }
                        i = i2;
                    }
                }
            }
        }
        C427690Gpr.LJ(viewLJLLJ, 0.0f);
        C1378990lzN.LIZIZ(viewLJLLJ, Float.valueOf(C418440Gaw.LIZIZ(8)), null, null, null, null, 30);
        return viewLJLLJ;
    }

    @Override // X.AbstractC737180Svs
    public final void LJJ() {
        C734080Sqs c734080Sqs = C734080Sqs.LIZ;
        String value = this.LL.LJI.getValue();
        C735210Ssh c735210Ssh = this.LL;
        String str = c735210Ssh.LJFF ? "user" : "visitor";
        String str2 = c735210Ssh.LJIIIZ;
        c734080Sqs.getClass();
        C734080Sqs.LIZ(value, str, "share", str2);
        Function2<? super Boolean, ? super Exception, Unit> function2 = this.LLILLJJLI;
        if (function2 != null) {
            function2.invoke(Boolean.TRUE, null);
        }
    }

    public C734070Sqr(C735210Ssh c735210Ssh) {
        this.LL = c735210Ssh;
    }
}
