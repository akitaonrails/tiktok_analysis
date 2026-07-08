package X;

import android.widget.CompoundButton;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesMoreSettingsPage;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.assem.ChatSwitchAssem;

/* JADX INFO: renamed from: X.1Ami, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189581Ami implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
        }
    }

    public C2189581Ami(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onCheckedChanged$0(C2189581Ami c2189581Ami, CompoundButton compoundButton, boolean z) {
        C19EG c19egLIZ = C724240Sb0.LIZ((ChatSwitchAssem) c2189581Ami.l0);
        if (c19egLIZ != null) {
            ChatSwitchAssem chatSwitchAssem = (ChatSwitchAssem) c2189581Ami.l0;
            chatSwitchAssem.hp().LLJ.invoke(chatSwitchAssem.kp(), c19egLIZ);
        }
    }

    public static final void onCheckedChanged$1(C2189581Ami c2189581Ami, CompoundButton compoundButton, boolean z) {
        ((ViewerWishesMoreSettingsPage) c2189581Ami.l0).LLL = z;
    }

    public static final void onCheckedChanged$2(C2189581Ami c2189581Ami, CompoundButton compoundButton, boolean z) {
        C16FS c16fs;
        C16FS c16fs2;
        C16FS c16fs3;
        C16FS c16fs4;
        ViewerWishesMoreSettingsPage viewerWishesMoreSettingsPage = (ViewerWishesMoreSettingsPage) c2189581Ami.l0;
        if (z) {
            viewerWishesMoreSettingsPage.FS(true);
            C16FS c16fs5 = viewerWishesMoreSettingsPage.LLLIL;
            if ((c16fs5 == null || !c16fs5.isSelected()) && (((c16fs = viewerWishesMoreSettingsPage.LLLILZ) == null || !c16fs.isSelected()) && (((c16fs2 = viewerWishesMoreSettingsPage.LLLILZJ) == null || !c16fs2.isSelected()) && (((c16fs3 = viewerWishesMoreSettingsPage.LLLILZLLLI) == null || !c16fs3.isSelected()) && (c16fs4 = viewerWishesMoreSettingsPage.LLLIL) != null)))) {
                c16fs4.setSelected(true);
            }
            C16FS c16fs6 = viewerWishesMoreSettingsPage.LLLIL;
            if (c16fs6 != null && c16fs6.isSelected()) {
                viewerWishesMoreSettingsPage.LLLF = 1L;
                return;
            }
            C16FS c16fs7 = viewerWishesMoreSettingsPage.LLLILZ;
            if (c16fs7 != null && c16fs7.isSelected()) {
                viewerWishesMoreSettingsPage.LLLF = 5L;
                return;
            }
            C16FS c16fs8 = viewerWishesMoreSettingsPage.LLLILZJ;
            if (c16fs8 != null && c16fs8.isSelected()) {
                viewerWishesMoreSettingsPage.LLLF = 15L;
                return;
            }
            C16FS c16fs9 = viewerWishesMoreSettingsPage.LLLILZLLLI;
            if (c16fs9 == null || !c16fs9.isSelected()) {
                return;
            }
            viewerWishesMoreSettingsPage.LLLF = 30L;
            return;
        }
        viewerWishesMoreSettingsPage.LLLF = 0L;
        viewerWishesMoreSettingsPage.FS(false);
    }

    public static final void onCheckedChanged$3(C2189581Ami c2189581Ami, CompoundButton compoundButton, boolean z) {
        ((ViewerWishesMoreSettingsPage) c2189581Ami.l0).LLLFF = z;
    }

    public static final void onCheckedChanged$4(C2189581Ami c2189581Ami, CompoundButton compoundButton, boolean z) {
        ((ViewerWishesMoreSettingsPage) c2189581Ami.l0).LLLFFI = z;
    }
}
