package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lf0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1366360lf0 extends DialogC1368760lis {
    public static final /* synthetic */ int LLLLIIIILLL = 0;
    public final Activity LLLILZLLLI;
    public final Set<IMContact> LLLIZZ;
    public final SharePackage LLLJ;
    public final Map<String, String> LLLJIL;
    public final Map<String, String> LLLJL;
    public boolean LLLL;
    public final C01GW LLLLII;

    @Override // X.DialogC1368760lis
    public final String LJLIIIL() {
        return "screenshot_share_panel";
    }

    @Override // X.DialogC1368760lis
    public final void LJLJI() {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayoutLJLIIL = LJLIIL();
        if (frameLayoutLJLIIL == null || (layoutParams = frameLayoutLJLIIL.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = C814420VxA.LIZIZ(C14KQ.LJ(getContext()) * 0.73f);
    }

    @Override // X.DialogC1368760lis, X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        super.dismiss();
        C1366560lfK.LL.getClass();
        C1366560lfK.LLILLJJLI = false;
        View viewLJLIL = LJLIL();
        if (viewLJLIL == null || (viewTreeObserver = viewLJLIL.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLII.getValue();
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // X.DialogC1368760lis
    public final void LJLJJI(boolean z) {
        View view = this.LLLFFI;
        if (view != null) {
            C786410Ut5.LJLLLLLL(8, view);
        }
    }

    @Override // X.DialogC1368760lis, X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        String str;
        ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        C1366560lfK.LL.getClass();
        C1366560lfK.LLILLJJLI = true;
        View viewLJLIL = LJLIL();
        if (viewLJLIL != null && (viewTreeObserver = viewLJLIL.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLII.getValue();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        TextView textView = (TextView) findViewById(R.id.title);
        if (textView != null) {
            textView.setText(getContext().getString(R.string.tba));
        }
        String string = this.LLLJ.extras.getString("enter_from");
        C1366320lew c1366320lew = C1366320lew.LIZ;
        C0I0B.LJFF.LIZIZ();
        c1366320lew.getClass();
        C830490Whz c830490Whz = new C830490Whz();
        if (string == null) {
            str = "other_page";
        } else {
            str = string;
        }
        c830490Whz.put("enter_from", str);
        if (Intrinsics.LJFF(string, "video_detail_page")) {
            c830490Whz.put("enter_dm", "video_detail_page");
        }
        C20684815ws.LJIILLIIL("show_screenshot_more_panel", c830490Whz);
    }

    public DialogC1366360lf0(Activity activity, BaseContent baseContent, InterfaceC1365250ldD interfaceC1365250ldD, C1366330lex c1366330lex, SharePackage sharePackage, Map map, Map map2, Set set, boolean z, boolean z2) {
        super(activity, set, false, interfaceC1365250ldD, false, sharePackage, baseContent, map, map2, null, null, null, Boolean.FALSE, false, false, z, z2, false, false, false, c1366330lex, true, true, null, 9334292);
        this.LLLILZLLLI = activity;
        this.LLLIZZ = set;
        this.LLLJ = sharePackage;
        this.LLLJIL = map;
        this.LLLJL = map2;
        this.LLLLII = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1614));
    }
}
