package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS565S0100000_21;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0lgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1367590lgz extends DialogC1368760lis {
    public static final /* synthetic */ int LLLLIIL = 0;
    public final Activity LLLILZLLLI;
    public final Set<IMContact> LLLIZZ;
    public final Map<String, String> LLLJ;
    public final Map<String, String> LLLJIL;
    public final boolean LLLJL;
    public final Map<String, String> LLLL;
    public boolean LLLLII;
    public final C01GW LLLLIIIILLL;

    public DialogC1367590lgz() {
        throw null;
    }

    @Override // X.DialogC1368760lis
    public final void LJLJI() {
        super.LJLJI();
        if (this.LLLJL) {
            C1383370m6R.LIZ(LJLIIL(), new AwS600S0100000_21(this, 406));
        }
    }

    @Override // X.DialogC1368760lis, X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        View viewLJLIL;
        ViewTreeObserver viewTreeObserver;
        super.dismiss();
        if (!this.LLLJL || (viewLJLIL = LJLIL()) == null || (viewTreeObserver = viewLJLIL.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLIIIILLL.getValue();
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
    }

    @Override // X.DialogC1368760lis, X.DialogC1389100mFg, X.C19GU, X.C19EK, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        View viewLJLIL;
        ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        Map<String, String> map = this.LLLL;
        C0I0B.LJFF.LIZIZ();
        C13DA c13da = new C13DA();
        c13da.putAll(map);
        C20684815ws.LJIILLIIL("show_send_message_panel", c13da.build());
        if (this.LLLJL && (viewLJLIL = LJLIL()) != null && (viewTreeObserver = viewLJLIL.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLIIIILLL.getValue();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public DialogC1367590lgz(Activity activity, C08CX c08cx, C1235920iGc c1235920iGc, SharePackage sharePackage, boolean z, boolean z2, Map map) {
        super(activity, c08cx, false, c1235920iGc, false, sharePackage, null, null, null, null, null, null, Boolean.valueOf(z), true, false, true, true, true, false, false, null, false, false, null, 15728640);
        this.LLLILZLLLI = activity;
        this.LLLIZZ = c08cx;
        this.LLLJ = null;
        this.LLLJIL = null;
        this.LLLJL = z2;
        this.LLLL = map;
        this.LLLLIIIILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1611));
    }
}
