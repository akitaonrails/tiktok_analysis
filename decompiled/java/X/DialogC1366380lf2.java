package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0lf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class DialogC1366380lf2 extends DialogC1368760lis {
    public static volatile boolean LLLLIILL;
    public final Activity LLLILZLLLI;
    public final Set<IMContact> LLLIZZ;
    public final SharePackage LLLJ;
    public final Map<String, String> LLLJIL;
    public final Map<String, String> LLLJL;
    public final Map<String, String> LLLL;
    public final Function0<Unit> LLLLII;
    public boolean LLLLIIIILLL;
    public final C01GW LLLLIIL;

    @Override // X.DialogC1368760lis
    public final void LJLJI() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        int i = this.LLLJ.extras.getInt("key_share_send_to_dialog_height", -1);
        if (i > 0) {
            FrameLayout frameLayoutLJLIIL = LJLIIL();
            if (frameLayoutLJLIIL == null || (layoutParams2 = frameLayoutLJLIIL.getLayoutParams()) == null) {
                return;
            }
            layoutParams2.height = i;
            return;
        }
        FrameLayout frameLayoutLJLIIL2 = LJLIIL();
        if (frameLayoutLJLIIL2 == null || (layoutParams = frameLayoutLJLIIL2.getLayoutParams()) == null) {
            return;
        }
        layoutParams.height = C814420VxA.LIZIZ(C14KQ.LJ(getContext()) * 0.73f);
    }

    @Override // X.DialogC1368760lis, X.DialogC19728412Gs, android.app.Dialog
    public final void show() throws Throwable {
        Object obj;
        C0WZX c0wzx = new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOOlLYzG3SDhT2DsSx9m1G5IYHvFWqNTg3AHF25IjZCJc004IOhXa8/vZtgBcjKQYFlGbQwXRCohvPQDsc22d1Q8spFPsdQhi2U=", null);
        C0WST c0wst = new C0WST();
        Object[] objArr = new Object[0];
        C0WZW c0wzw = new C0WZW(false, "()V", c0wzx);
        C0WSU c0wsuLIZIZ = c0wst.LIZIZ(300000, "com/ss/android/ugc/aweme/im/sharepanel/impl/share/ui/morecontacts/MoreContactsShareBottomDialog", "show", this, objArr, "void", c0wzw);
        if (c0wsuLIZIZ.LIZ) {
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/im/sharepanel/impl/share/ui/morecontacts/MoreContactsShareBottomDialog", "show", null, objArr, this, c0wzw, false);
        } else {
            Object[] objArr2 = c0wsuLIZIZ.LIZJ;
            DialogC1368760lis dialogC1368760lis = (objArr2 == null || (obj = objArr2[0]) == null) ? this : (DialogC1368760lis) obj;
            super.show();
            c0wst.LIZ(300000, "com/ss/android/ugc/aweme/im/sharepanel/impl/share/ui/morecontacts/MoreContactsShareBottomDialog", "show", null, objArr, dialogC1368760lis, c0wzw, true);
        }
        LLLLIILL = true;
    }

    @Override // X.DialogC1368760lis, X.C19GU, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        ViewTreeObserver viewTreeObserver;
        super.dismiss();
        LLLLIILL = false;
        View viewLJLIL = LJLIL();
        if (viewLJLIL != null && (viewTreeObserver = viewLJLIL.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLIIL.getValue();
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        Function0<Unit> function0 = this.LLLLII;
        if (function0 != null) {
            function0.invoke();
        }
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
        ViewTreeObserver viewTreeObserver;
        super.onCreate(bundle);
        View viewLJLIL = LJLIL();
        if (viewLJLIL != null && (viewTreeObserver = viewLJLIL.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) this.LLLLIIL.getValue();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public DialogC1366380lf2(Activity activity, C08CX c08cx, InterfaceC1365250ldD interfaceC1365250ldD, SharePackage sharePackage, BaseContent baseContent, Map map, Map map2, Map map3, boolean z, boolean z2, boolean z3, boolean z4, Function0 function0) {
        super(activity, c08cx, false, interfaceC1365250ldD, false, sharePackage, baseContent, map, map2, map3, null, null, Boolean.FALSE, false, false, z, z2, false, false, false, null, z3, z4, null, 10382356);
        this.LLLILZLLLI = activity;
        this.LLLIZZ = c08cx;
        this.LLLJ = sharePackage;
        this.LLLJIL = map;
        this.LLLJL = map2;
        this.LLLL = map3;
        this.LLLLII = function0;
        this.LLLLIIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 1613));
    }
}
