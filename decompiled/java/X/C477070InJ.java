package X;

import android.content.Context;
import android.util.AttributeSet;

/* JADX INFO: renamed from: X.0InJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477070InJ extends C477080InK {
    public InterfaceC477120InO LLILZ;

    public final void setOnVisibilityChangeListener(InterfaceC477120InO interfaceC477120InO) {
        this.LLILZ = interfaceC477120InO;
        if (interfaceC477120InO != null) {
            getVisibility();
            interfaceC477120InO.LIZ(getVisibility());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0094  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setVisibility(int r9) {
        /*
            r8 = this;
            int r0 = r8.getVisibility()
            if (r0 != r9) goto L7
            return
        L7:
            super.setVisibility(r9)
            X.0InO r0 = r8.LLILZ
            if (r0 == 0) goto L11
            r0.LIZ(r9)
        L11:
            r5 = 0
            r2 = 1
            if (r9 != 0) goto L8a
            com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting r0 = com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveNotificationSetting.INSTANCE
            boolean r0 = r0.getEnable()
            if (r0 == 0) goto L8a
            X.0Inq r0 = r8.getLiveNotificationBell()
            X.C339190DRl.LIZLLL(r0)
            java.lang.Long r0 = X.C484270Iyv.LIZLLL
            if (r0 == 0) goto L42
            long r6 = r0.longValue()
            r3 = 0
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 <= 0) goto L88
            r1 = 1
        L33:
            X.0Inq r0 = r8.getLiveNotificationBell()
            if (r0 == 0) goto L42
            if (r1 == 0) goto L80
            android.view.View r0 = r0.getAlertDot()
            X.C339190DRl.LIZLLL(r0)
        L42:
            java.lang.String r0 = "show_icon"
            X.C484460IzE.LIZ(r0)
        L47:
            com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveEventSpaceSetting r0 = com.bytedance.android.livesdk.livesetting.skylight.LiveTopLiveEventSpaceSetting.INSTANCE
            boolean r0 = r0.getEnable()
            if (r0 == 0) goto L94
            X.0Io3 r0 = r8.getLiveEventSpaceButton()
            if (r0 == 0) goto L58
            r0.LIZLLL(r2)
        L58:
            com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting r0 = com.bytedance.android.livesdk.livesetting.watchlive.LiveWatchLaterSettingSetting.INSTANCE
            int r0 = r0.getValue()
            if (r0 != r2) goto La0
            X.0Inn r0 = r8.getLiveWatchLaterButton()
            X.C339190DRl.LIZLLL(r0)
            java.lang.Class<com.bytedance.android.feed.api.ILiveFeedApiService> r0 = com.bytedance.android.feed.api.ILiveFeedApiService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.feed.api.ILiveFeedApiService r0 = (com.bytedance.android.feed.api.ILiveFeedApiService) r0
            r0.zr()
            int r1 = X.C468640IZi.LIZ()
            X.0Inn r0 = r8.getLiveWatchLaterButton()
            if (r0 == 0) goto L7f
            r0.j0(r1)
        L7f:
            return
        L80:
            android.view.View r0 = r0.getAlertDot()
            X.C339190DRl.LIZIZ(r0)
            goto L42
        L88:
            r1 = 0
            goto L33
        L8a:
            X.0Inq r0 = r8.getLiveNotificationBell()
            X.C339190DRl.LIZIZ(r0)
            if (r9 != 0) goto L94
            goto L47
        L94:
            X.0Io3 r0 = r8.getLiveEventSpaceButton()
            if (r0 == 0) goto L9d
            r0.LIZLLL(r5)
        L9d:
            if (r9 != 0) goto La0
            goto L58
        La0:
            X.0Inn r0 = r8.getLiveWatchLaterButton()
            X.C339190DRl.LIZIZ(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477070InJ.setVisibility(int):void");
    }

    public C477070InJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }
}
