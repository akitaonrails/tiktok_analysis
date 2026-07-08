package Y;

import X.AnonymousClass0956;
import X.C0P0T;
import X.C0PEM;
import X.C1591506Kz;
import X.C197039127h;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C484430IzB;
import X.C484470IzF;
import android.content.Context;
import android.view.View;
import com.bytedance.android.livesdk.feed.adapter.viewholder.GoLiveViewHolder;
import com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.api.feed.NoticeButton;
import webcast.api.feed.NoticeItem;
import webcast.api.feed.NoticeUIInfo;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS21S0301000_7 implements View.OnClickListener {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS21S0301000_7 aCListenerS21S0301000_7, View view) {
        ((C0P0T) aCListenerS21S0301000_7.l0).dismiss();
        ((GoLiveViewHolder) aCListenerS21S0301000_7.l1).R5(aCListenerS21S0301000_7.i3, true);
        ((Function0) aCListenerS21S0301000_7.l2).invoke();
    }

    public static final void onClick$1(ACListenerS21S0301000_7 aCListenerS21S0301000_7, View view) {
        ((Function0) aCListenerS21S0301000_7.l0).invoke();
        C484470IzF c484470IzF = C484470IzF.LIZ;
        int i = aCListenerS21S0301000_7.i3;
        NoticeItem noticeItem = (NoticeItem) aCListenerS21S0301000_7.l1;
        Context context = ((LiveNotificationItem) aCListenerS21S0301000_7.l2).getContext();
        int iGl = ((LiveNotificationItem) aCListenerS21S0301000_7.l2).gl();
        c484470IzF.getClass();
        C484470IzF.LIZJ(i, noticeItem, context, "live_activity_notification_message_head", iGl, true);
    }

    public static final void onClick$2(ACListenerS21S0301000_7 aCListenerS21S0301000_7, View view) {
        ((Function0) aCListenerS21S0301000_7.l0).invoke();
        C484470IzF c484470IzF = C484470IzF.LIZ;
        int i = aCListenerS21S0301000_7.i3;
        NoticeItem noticeItem = (NoticeItem) aCListenerS21S0301000_7.l1;
        Context context = ((LiveNotificationItem) aCListenerS21S0301000_7.l2).getContext();
        int iGl = ((LiveNotificationItem) aCListenerS21S0301000_7.l2).gl();
        c484470IzF.getClass();
        C484470IzF.LIZJ(i, noticeItem, context, "live_activity_notification_message_click", iGl, false);
    }

    public static final void onClick$3(ACListenerS21S0301000_7 aCListenerS21S0301000_7, View view) {
        C197039127h c197039127h;
        NoticeUIInfo noticeUIInfo;
        NoticeButton noticeButton;
        Integer numValueOf;
        ((Function0) aCListenerS21S0301000_7.l0).invoke();
        AnonymousClass0956 anonymousClass0956 = ((LiveNotificationItem) aCListenerS21S0301000_7.l1).L5().LLILZLL;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            C484470IzF c484470IzF = C484470IzF.LIZ;
            int i = aCListenerS21S0301000_7.i3;
            NoticeItem noticeItem = (NoticeItem) aCListenerS21S0301000_7.l2;
            Context context = ((LiveNotificationItem) aCListenerS21S0301000_7.l1).getContext();
            int iGl = ((LiveNotificationItem) aCListenerS21S0301000_7.l1).gl();
            c484470IzF.getClass();
            C484470IzF.LIZJ(i, noticeItem, context, "live_activity_notification_message_button", iGl, false);
        }
        C484430IzB c484430IzBL5 = ((LiveNotificationItem) aCListenerS21S0301000_7.l1).L5();
        NoticeUIInfo noticeUIInfo2 = c484430IzBL5.LLILZ;
        if (noticeUIInfo2 != null && noticeUIInfo2.uiType == 1 && (c197039127h = c484430IzBL5.LLILLJJLI) != null && c197039127h.getVisibility() == 0 && (noticeUIInfo = c484430IzBL5.LLILZ) != null && (noticeButton = noticeUIInfo.button) != null && (numValueOf = Integer.valueOf(noticeButton.buttonType)) != null && numValueOf.intValue() == 1) {
            C197039127h c197039127h2 = c484430IzBL5.LLILLJJLI;
            if (c197039127h2 != null) {
                c197039127h2.setText(c484430IzBL5.getContext().getString(R.string.jqm));
            }
            C1DFH c1dfh = C0PEM.LIZ;
            c484430IzBL5.LLILZLL = C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1591506Kz(c484430IzBL5, null), 3);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ACListenerS21S0301000_7(int r2, com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem r3, kotlin.jvm.internal.AwS408S0200000_7 r4, webcast.api.feed.NoticeItem r5, int r6) {
        /*
            r1 = this;
            r1.$t = r6
            switch(r6) {
                case 1: goto L12;
                case 2: goto L12;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.l0 = r4
            r0.l1 = r3
            r0.i3 = r2
            r0.l2 = r5
        Le:
            r0.<init>()
            return
        L12:
            r0 = r1
            r0.l0 = r4
            r0.i3 = r2
            r0.l1 = r5
            r0.l2 = r3
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS21S0301000_7.<init>(int, com.ss.android.ugc.aweme.live.toplives.notifications.LiveNotificationItem, kotlin.jvm.internal.AwS408S0200000_7, webcast.api.feed.NoticeItem, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS21S0301000_7(C0P0T c0p0t, C0P0T c0p0t2, GoLiveViewHolder goLiveViewHolder, int i, Function0<Unit> function0) {
        this.$t = function0;
        this.l0 = c0p0t;
        this.l1 = c0p0t2;
        this.i3 = goLiveViewHolder;
        this.l2 = i;
    }
}
