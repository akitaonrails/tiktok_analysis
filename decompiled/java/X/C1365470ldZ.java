package X;

import Y.ARunnableS109S0100000_9;
import android.app.Activity;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.GuideShareSelfAwemeConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS565S0100000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ldZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1365470ldZ extends AbstractC1375780luC implements InterfaceC1368050lhj {
    public final Activity LLJJJJJIL;
    public RecyclerView LLJJJJLIIL;
    public final C01GW LLJJL;

    @Override // X.AbstractC1375780luC, X.C214906198m, android.widget.PopupWindow
    public final void dismiss() {
        Aweme aweme;
        super.dismiss();
        RecyclerView recyclerView = this.LLJJJJLIIL;
        if (recyclerView != null) {
            C2211751BhN.LIZIZ(recyclerView);
        }
        C1374870lsj c1374870lsj = C1374870lsj.LIZ;
        Aweme aweme2 = this.LLJJIJI;
        boolean z = AbstractC1375780luC.LLJJJJ;
        c1374870lsj.getClass();
        if (((GuideShareSelfAwemeConfig) C0N1Y.LIZIZ.getValue()).ugFriendsPageGuideShare <= 0 || z || aweme2 == null || !C123100dR.LIZ(aweme2.getAid()) || (aweme = this.LLJJIJI) == null) {
            return;
        }
        C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS109S0100000_9(aweme, 142));
    }

    public final String LJJIIJZLJL(Aweme aweme) {
        if (aweme.isSubOnlyVideo()) {
            return this.LLILZLL.getResources().getString(2131845117);
        }
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
        boolean z = true;
        if (statusSafety != null && statusSafety.getPrivateStatus() == 2) {
            return this.LLILZLL.getResources().getString(2131845116);
        }
        AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety2 == null || statusSafety2.getPrivateStatus() != 0) {
            z = false;
        }
        if (z) {
            if (C0XQ7.LJFF().getCurUser().isSecret()) {
                return this.LLILZLL.getResources().getString(2131845115);
            }
            return this.LLILZLL.getResources().getString(2131845114);
        }
        return this.LLILZLL.getResources().getString(2131845114);
    }

    public final String LJJIIZ(Aweme aweme) {
        if (aweme.isSubOnlyVideo()) {
            return this.LLILZLL.getResources().getString(2131845126);
        }
        AwemeStatus statusSafety = AwemeExtKt.getStatusSafety(aweme);
        boolean z = true;
        if (statusSafety != null && statusSafety.getPrivateStatus() == 2) {
            return this.LLILZLL.getResources().getString(2131845125);
        }
        AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety2 == null || statusSafety2.getPrivateStatus() != 0) {
            z = false;
        }
        if (z) {
            if (C0XQ7.LJFF().getCurUser().isSecret()) {
                return this.LLILZLL.getResources().getString(2131845124);
            }
            return this.LLILZLL.getResources().getString(2131845123);
        }
        return this.LLILZLL.getResources().getString(2131845123);
    }

    @Override // X.InterfaceC1368050lhj
    public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
        C786410Ut5.LJJJI("enter_from", "publish_share_panel", this.LLJJIII.LJIJJ.extras);
        C786410Ut5.LJJJI("enter_method", "publish_then_share", this.LLJJIII.LJIJJ.extras);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1365490ldb(this, interfaceC1369790lkX, view, null), 3);
    }

    public C1365470ldZ(C19EG c19eg, C1371590lnR c1371590lnR, String[] strArr, Aweme aweme) {
        CharSequence text;
        CharSequence text2;
        super(c19eg, c1371590lnR, strArr, aweme);
        this.LLJJJJJIL = c19eg;
        RecyclerView recyclerView = (RecyclerView) this.LL.findViewById(R.id.v1g);
        this.LLJJJJLIIL = recyclerView;
        if (recyclerView != null) {
            C786410Ut5.LLIZLLLIL(recyclerView, 8);
        }
        if (C1375340ltU.LIZJ(aweme)) {
            TuxTextView tuxTextView = this.LLILLL;
            if (C1365290ldH.LIZ()) {
                text2 = LJJIIJZLJL(aweme);
            } else {
                text2 = this.LLILZLL.getResources().getText(2131847859);
            }
            tuxTextView.setText(text2);
        } else {
            TuxTextView tuxTextView2 = this.LLILLL;
            if (C1365290ldH.LIZ()) {
                text = LJJIIZ(aweme);
            } else {
                text = this.LLILZLL.getResources().getText(2131838935);
            }
            tuxTextView2.setText(text);
        }
        C426750GoL.LJIIIZ(this.LLILLL, Integer.valueOf(c19eg.getResources().getDimensionPixelOffset(R.dimen.ag1)), 0, 0, 0, false, 16);
        C786410Ut5.LLIZLLLIL(this.LLJJIJIIJIL, 8);
        JSONObject jSONObject = C1379930m0t.LIZ;
        C1379920m0s.LIZ(null, aweme, "ug_publish_popup_share_show");
        this.LLJJL = C452501pT.LIZIZ(new AwS565S0100000_21((C1365280ldG) this, 38));
    }
}
