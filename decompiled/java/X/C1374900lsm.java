package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.ss.android.ugc.aweme.share.settings.EnhanceSharePanelUIConfig;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lsm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374900lsm extends FrameLayout {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1369580lkC LL;
    public InterfaceC1375180ltE LLILLJJLI;
    public String LLILLL;
    public boolean LLILZ;

    public final void LIZ() {
        C1369580lkC c1369580lkC = this.LL;
        if (c1369580lkC != null) {
            c1369580lkC.LJIIZILJ(C1374850lsh.LIZ(getContext(), this.LLILZ), false);
            c1369580lkC.LLJJ = new InterfaceC1368050lhj() { // from class: X.0lsp
                @Override // X.InterfaceC1368050lhj
                public final void LJIIIIZZ(InterfaceC1369790lkX interfaceC1369790lkX, View view) {
                    C1374860lsi.LIZJ().LIZ(0, interfaceC1369790lkX.key(), "others_video_share_list");
                    C1374900lsm c1374900lsm = this.LL;
                    c1374900lsm.getClass();
                    if (!(interfaceC1369790lkX instanceof CopyLinkChannel) && !(interfaceC1369790lkX instanceof C06VO)) {
                        String str = c1374900lsm.LLILLL;
                        if (str == null) {
                            str = "personal_homepage";
                        }
                        C735800Ste c735800Ste = new C735800Ste("share_person");
                        String strKey = interfaceC1369790lkX.key();
                        C2082308Dt c2082308Dt = InterfaceC1210900hcG.LIZ;
                        c735800Ste.LJFF("platform", strKey, c2082308Dt);
                        c735800Ste.LJFF("enter_from", str, c2082308Dt);
                        c735800Ste.LJFF("enter_method", "qr_code_share", c2082308Dt);
                        c735800Ste.LJFF("item_author_type", "1", c2082308Dt);
                        c735800Ste.LJIILJJIL();
                    }
                    InterfaceC1375180ltE callback = this.LL.getCallback();
                    if (callback != null) {
                        callback.LIZ(interfaceC1369790lkX);
                    }
                }
            };
        }
    }

    public final InterfaceC1375180ltE getCallback() {
        return this.LLILLJJLI;
    }

    public final boolean getEnableInstagramStory() {
        return this.LLILZ;
    }

    public final String getSharePersonEnterFrom() {
        return this.LLILLL;
    }

    public final void setCallback(InterfaceC1375180ltE interfaceC1375180ltE) {
        this.LLILLJJLI = interfaceC1375180ltE;
    }

    public final void setEnableInstagramStory(boolean z) {
        if (this.LLILZ != z) {
            this.LLILZ = z;
            LIZ();
        }
    }

    public final void setSharePersonEnterFrom(String str) {
        this.LLILLL = str;
        C1369580lkC c1369580lkC = this.LL;
        if (c1369580lkC != null) {
            C1370940lmO c1370940lmO = new C1370940lmO();
            String str2 = this.LLILLL;
            if (str2 == null) {
                str2 = "personal_homepage";
            }
            c1370940lmO.LIZIZ("enter_from", str2);
            c1370940lmO.LIZIZ("enter_method", "qr_code_share");
            SharePackage sharePackage = new SharePackage(c1370940lmO);
            C1371600lnS c1371600lnS = new C1371600lnS();
            c1371600lnS.LJJIIJ = sharePackage;
            c1369580lkC.LLJJIII = new C1371590lnR(c1371600lnS);
        }
    }

    public C1374900lsm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.f8o, this, true);
        C1369580lkC c1369580lkC = (C1369580lkC) findViewById(R.id.user_qr_code_share_channel_bar);
        this.LL = c1369580lkC;
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0ltL
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        }, findViewById(R.id.v2i));
        if (c1369580lkC != null) {
            EnhanceSharePanelUIConfig enhanceSharePanelUIConfigLIZIZ = C1371040lmY.LIZIZ();
            c1369580lkC.setSquareStyle(enhanceSharePanelUIConfigLIZIZ != null ? Intrinsics.LJFF(enhanceSharePanelUIConfigLIZIZ.useSquareIcon, Boolean.TRUE) : false);
        }
        LIZ();
    }
}
