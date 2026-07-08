package X;

import android.view.View;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0ld0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1365120ld0 implements InterfaceC790320UzO {
    public static final /* synthetic */ int LIZLLL = 0;
    public final View LIZ;
    public final ShareTextBoxViewModel LIZIZ;
    public final C1365110lcz LIZJ;

    static {
        new C1365070lcv();
    }

    @Override // X.InterfaceC790320UzO
    public final void E3(SharePackage sharePackage) {
        C1365110lcz c1365110lcz = this.LIZJ;
        c1365110lcz.LIZJ = sharePackage;
        C786410Ut5.l(c1365110lcz.LJIILJJIL, 0);
        c1365110lcz.LJ(true);
    }

    @Override // X.InterfaceC790320UzO
    public final void LIZ(String str) {
        C1365110lcz c1365110lcz = this.LIZJ;
        c1365110lcz.LJIIJJI.setText(str);
        c1365110lcz.LJIIJJI.setSelection(str.length());
    }

    public final void LIZIZ(boolean z) {
        C1365110lcz c1365110lcz = this.LIZJ;
        if (z) {
            if (c1365110lcz.LIZJ.extras.getBoolean("key_hide_create_group_chat_hint")) {
                C786410Ut5.LJZL(8, (LinearLayout) c1365110lcz.LIZIZ.findViewById(R.id.j6q));
            }
        } else {
            c1365110lcz.getClass();
        }
        if (this.LIZ.getVisibility() == 0 && !z) {
            this.LIZJ.getClass();
        } else {
            if (this.LIZ.getVisibility() != 8 || !z) {
                return;
            }
            this.LIZJ.LIZIZ();
        }
    }

    @Override // X.InterfaceC790320UzO
    public final void x9(List<? extends IMContact> list) {
        this.LIZIZ.x9(list);
        if (list.isEmpty()) {
            LIZIZ(false);
            C786410Ut5.LJLLLLLL(8, this.LIZ);
        } else {
            LIZIZ(true);
            C786410Ut5.LJLLLLLL(0, this.LIZ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1365120ld0(android.view.View r21, com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel r22, java.util.Set<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r23, final boolean r24, final X.C1365110lcz r25) {
        /*
            Method dump skipped, instruction units count: 646
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365120ld0.<init>(android.view.View, com.ss.android.ugc.aweme.im.sharepanel.impl.share.ui.textbox.ShareTextBoxViewModel, java.util.Set, boolean, X.0lcz):void");
    }
}
