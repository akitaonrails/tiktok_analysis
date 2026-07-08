package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0oGp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class DialogInterfaceOnDismissListenerC1466690oGp implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        switch (this.$t) {
            case 0:
                onDismiss$0(this, dialogInterface);
                break;
            case 1:
                onDismiss$1(this, dialogInterface);
                break;
            case 2:
                onDismiss$2(this, dialogInterface);
                break;
        }
    }

    public static final void onDismiss$0(DialogInterfaceOnDismissListenerC1466690oGp dialogInterfaceOnDismissListenerC1466690oGp, DialogInterface dialogInterface) {
        ((InterfaceC1444370ngp) dialogInterfaceOnDismissListenerC1466690oGp.l0).LIZIZ((Fragment) dialogInterfaceOnDismissListenerC1466690oGp.l1);
        ((C1444420ngu) dialogInterfaceOnDismissListenerC1466690oGp.l2).W2(dialogInterface);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$1(X.DialogInterfaceOnDismissListenerC1466690oGp r4, android.content.DialogInterface r5) {
        /*
            java.lang.Object r0 = r4.l0
            X.013C r0 = (X.C013C) r0
            boolean r0 = r0.element
            if (r0 != 0) goto L3d
            X.0LAB r3 = new X.0LAB
            r3.<init>()
            java.lang.String r1 = "action"
            java.lang.String r0 = "cancel"
            r3.LJ(r1, r0)
            java.lang.Object r0 = r4.l1
            X.0ngw r0 = (X.C1444440ngw) r0
            com.ss.android.ugc.aweme.publish.privacy.PermissionConfigure r0 = r0.LLILZLL
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = r0.getVideoPublishEditModel()
            if (r0 == 0) goto L74
            int r0 = r0.isPrivate
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L26:
            r2 = 1
            if (r1 == 0) goto L5e
            int r0 = r1.intValue()
            if (r0 != r2) goto L54
            java.lang.String r1 = "Only you"
        L31:
            java.lang.String r0 = "final_status"
            r3.LJ(r0, r1)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.LIZ
            java.lang.String r0 = "click_visibility_notice"
            X.C20684815ws.LJIILLIIL(r0, r1)
        L3d:
            java.lang.Object r1 = r4.l2
            X.0XiI r1 = (X.InterfaceC856160XiI) r1
            java.lang.Object r0 = r4.l1
            X.0ngw r0 = (X.C1444440ngw) r0
            r1.LIZJ(r0)
            java.lang.Object r0 = r4.l1
            X.0ngw r0 = (X.C1444440ngw) r0
            android.content.DialogInterface$OnDismissListener r0 = r0.LLIZ
            if (r0 == 0) goto L53
            r0.onDismiss(r5)
        L53:
            return
        L54:
            int r1 = r1.intValue()
            r0 = 2
            if (r1 != r0) goto L5e
            java.lang.String r1 = "Friend"
            goto L31
        L5e:
            com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService r0 = com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider.LJIJJ()
            com.ss.android.ugc.tiktok.tpsc.model.PrivacyUserSettingsV2 r0 = r0.LJIIIIZZ()
            if (r0 == 0) goto L71
            boolean r0 = X.C103K.LIZ(r0)
            if (r0 != r2) goto L71
            java.lang.String r1 = "Follower"
            goto L31
        L71:
            java.lang.String r1 = "Everyone"
            goto L31
        L74:
            r1 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogInterfaceOnDismissListenerC1466690oGp.onDismiss$1(X.0oGp, android.content.DialogInterface):void");
    }

    public static final void onDismiss$2(DialogInterfaceOnDismissListenerC1466690oGp dialogInterfaceOnDismissListenerC1466690oGp, DialogInterface dialogInterface) {
        ((InterfaceC1444370ngp) dialogInterfaceOnDismissListenerC1466690oGp.l0).LIZIZ((Fragment) dialogInterfaceOnDismissListenerC1466690oGp.l1);
        ((C1444350ngn) dialogInterfaceOnDismissListenerC1466690oGp.l2).LJIJI(dialogInterface);
    }

    public DialogInterfaceOnDismissListenerC1466690oGp(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
