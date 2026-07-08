package X;

import android.content.DialogInterface;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.service.chatroom.IIMChatRoomOpenService;
import com.ss.android.ugc.aweme.music.model.AddSongContextData;
import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import java.util.Map;

/* JADX INFO: renamed from: X.0P4R, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4R implements DialogInterface.OnDismissListener {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 3:
                onDismiss$3(this, dialogInterface);
                break;
            case 4:
                onDismiss$4(this, dialogInterface);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026 A[PHI: r3
      0x0026: PHI (r3v4 java.lang.String) = (r3v1 java.lang.String), (r3v5 java.lang.String) binds: [B:10:0x0024, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[PHI: r3
      0x002e: PHI (r3v3 java.lang.String) = (r3v1 java.lang.String), (r3v4 java.lang.String) binds: [B:10:0x0024, B:12:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onDismiss$0(X.C0P4R r3, android.content.DialogInterface r4) {
        /*
            java.lang.Object r0 = r3.l0
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            if (r0 == 0) goto L9
            r0.invoke()
        L9:
            X.0ONq r2 = com.ss.android.ugc.aweme.inbox.bulletin.BulletinCreateFragment.LLIZLLLIL
            java.lang.String r0 = com.bytedance.tux.sheet.sheet.TuxSheet._pnsPageId
            X.0De4 r4 = X.C1391190mJ3.LJIIJJI(r4)
            java.lang.Object r1 = r3.l1
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2.getClass()
            if (r1 == 0) goto L22
            java.lang.String r0 = "enter_from"
            java.lang.String r3 = r1.getString(r0)
            if (r3 != 0) goto L26
        L22:
            java.lang.String r3 = "notification_page"
            if (r1 == 0) goto L2e
        L26:
            java.lang.String r0 = "user_type"
            java.lang.String r2 = r1.getString(r0)
            if (r2 != 0) goto L30
        L2e:
            java.lang.String r2 = ""
        L30:
            boolean r0 = r4 instanceof X.C0OKX
            if (r0 == 0) goto L40
            java.lang.String r1 = "create"
        L36:
            X.0OPQ r0 = X.C0OPQ.LIZ
            r0.getClass()
            r0 = 2
            X.C0OPQ.LJIILLIIL(r0, r3, r1, r2)
            return
        L40:
            boolean r0 = r4 instanceof X.C618470ONp
            if (r0 == 0) goto L47
            java.lang.String r1 = "cross"
            goto L36
        L47:
            java.lang.String r1 = "blank"
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P4R.onDismiss$0(X.0P4R, android.content.DialogInterface):void");
    }

    public static final void onDismiss$1(C0P4R c0p4r, DialogInterface dialogInterface) {
        C013C c013c = (C013C) c0p4r.l0;
        C013C c013c2 = (C013C) c0p4r.l1;
        if (c013c.element && c013c2.element) {
            C1483410ohn.LJLJJI().LJIILLIIL();
        }
    }

    public static final void onDismiss$2(C0P4R c0p4r, DialogInterface dialogInterface) {
        Fragment fragmentLJFF;
        C633020OsG c633020OsG = C633020OsG.LIZIZ;
        C19EG c19eg = (C19EG) c0p4r.l0;
        IIMChatRoomOpenService iIMChatRoomOpenService = (IIMChatRoomOpenService) PluggableExtentionKt.pluggableSpi$default(IIMChatRoomOpenService.class, false, false, false, 14, null);
        if (iIMChatRoomOpenService != null) {
            fragmentLJFF = iIMChatRoomOpenService.LJFF((C19EG) c0p4r.l0);
        } else {
            fragmentLJFF = null;
        }
        c633020OsG.LJJIIZI(c19eg, fragmentLJFF, (AddSongContextData) c0p4r.l1, DspPlatform.UNKNOWN, null, true);
    }

    public static final void onDismiss$3(C0P4R c0p4r, DialogInterface dialogInterface) {
        String str;
        C635570OwN c635570OwN = (C635570OwN) c0p4r.l0;
        int i = c635570OwN.LIZIZ;
        if (c635570OwN.LIZJ) {
            str = "button";
        } else {
            str = "other";
        }
        C635570OwN.LIZ("close_inbox_notification_setting", i, str, (NotificationSubscribeSettingsList) c0p4r.l1);
    }

    public static final void onDismiss$4(C0P4R c0p4r, DialogInterface dialogInterface) {
        if (!((C013C) c0p4r.l0).element) {
            Map map = (Map) c0p4r.l1;
            map.put("click_area", "keep");
            C1731680vAE.LIZIZ(map, false);
        }
    }

    public C0P4R(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
