package X;

import Y.AUListenerS262S0100000_12;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: renamed from: X.0zjr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1907530zjr extends FrameLayout implements InterfaceC1907510zjp {
    public C1907570zjv LL;
    public C1907570zjv LLILLJJLI;
    public final C01GW LLILLL;
    public InterfaceC1907020zj2 LLILZ;
    public InterfaceC1907550zjt LLILZIL;

    private final AnimatorSet getAnimatorSet() {
        return (AnimatorSet) this.LLILLL.getValue();
    }

    @Override // X.InterfaceC1907510zjp
    public final void LJJIL() {
        InterfaceC1907020zj2 interfaceC1907020zj2 = this.LLILZ;
        if (interfaceC1907020zj2 != null) {
            interfaceC1907020zj2.LJJIL();
        }
    }

    public final C1907570zjv getNegativeButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.p4j);
            this.LLILLJJLI = (C1907570zjv) callbackFindViewById;
        }
        return (C1907570zjv) callbackFindViewById;
    }

    public final C1907570zjv getPositiveButtonFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.rik);
            this.LL = (C1907570zjv) callbackFindViewById;
        }
        return (C1907570zjv) callbackFindViewById;
    }

    @Override // X.InterfaceC1907510zjp
    public C1907570zjv getNegativeButton() {
        return getNegativeButtonFromXml();
    }

    @Override // X.InterfaceC1907510zjp
    public C1907570zjv getPositiveButton() {
        return getPositiveButtonFromXml();
    }

    @Override // X.InterfaceC1907510zjp
    public final void mq() {
        if (getAnimatorSet().isRunning()) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", getAlpha(), 0.0f);
        objectAnimatorOfFloat.setDuration(200L);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(getHeight(), 0);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LIZIZ());
        valueAnimatorOfInt.setDuration(250L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS262S0100000_12(this, 29));
        getAnimatorSet().play(valueAnimatorOfInt).with(objectAnimatorOfFloat);
        getAnimatorSet().start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1907550zjt interfaceC1907550zjt = this.LLILZIL;
        if (interfaceC1907550zjt != null) {
            interfaceC1907550zjt.onAttachedToWindow();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1907550zjt interfaceC1907550zjt = this.LLILZIL;
        if (interfaceC1907550zjt != null) {
            interfaceC1907550zjt.onDetachedFromWindow();
        }
    }

    public final void setNegativeButtonFromXml(C1907570zjv c1907570zjv) {
        this.LLILLJJLI = c1907570zjv;
    }

    public final void setPositiveButtonFromXml(C1907570zjv c1907570zjv) {
        this.LL = c1907570zjv;
    }

    public C1907530zjr(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(802));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.aak, this, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice r7, X.InterfaceC1907020zj2 r8) {
        /*
            r6 = this;
            java.lang.String r4 = "video_link"
            r6.LLILZ = r8
            r3 = 1
            r2 = 0
            com.ss.android.ugc.aweme.notice.api.bean.LinkBusinessExtra r0 = X.C1907540zjs.LIZ(r7)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L10
            java.lang.String r5 = r0.type     // Catch: java.lang.Exception -> L50
            if (r5 != 0) goto L12
        L10:
            java.lang.String r5 = ""
        L12:
            com.ss.android.ugc.aweme.profile.model.User r0 = X.C1907540zjs.LIZJ(r7)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L27
            int r0 = r0.getFollowStatus()     // Catch: java.lang.Exception -> L50
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L50
        L20:
            boolean r0 = android.text.TextUtils.equals(r5, r4)     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L32
            goto L29
        L27:
            r1 = r2
            goto L20
        L29:
            if (r1 == 0) goto L54
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L4e
            goto L54
        L32:
            java.lang.String r0 = "video_sharer"
            boolean r0 = android.text.TextUtils.equals(r5, r0)     // Catch: java.lang.Exception -> L50
            if (r0 != 0) goto L54
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r7.templateNotice     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L54
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton> r0 = r0.bottomButtons     // Catch: java.lang.Exception -> L50
            if (r0 == 0) goto L54
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Exception -> L50
            r0 = r0 ^ 1
            if (r0 != r3) goto L54
        L4e:
            r1 = 0
            goto L56
        L50:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L54:
            r1 = 8
        L56:
            int r0 = r6.getVisibility()
            r6.setVisibility(r1)
            X.C1602160rnK.LIZIZ(r0, r1, r6)
            int r0 = r6.getVisibility()
            if (r0 == 0) goto L67
            return
        L67:
            android.view.ViewGroup$LayoutParams r1 = r6.getLayoutParams()
            r0 = -2
            r1.height = r0
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r6)
            r6.setLayoutParams(r1)
            X.ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(r6)
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.setAlpha(r0)
            org.json.JSONObject r1 = X.C1907540zjs.LIZIZ(r7)     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L93
            java.lang.String r0 = "type"
            java.lang.String r0 = r1.optString(r0)     // Catch: java.lang.Exception -> L8f
            boolean r0 = android.text.TextUtils.equals(r4, r0)     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L93
            goto Lad
        L8f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L93:
            com.ss.android.ugc.aweme.notice.repo.list.bean.GeneralTemplateNotice r0 = r7.templateNotice
            if (r0 == 0) goto Lb2
            com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplate r0 = r0.uiTemplate
            if (r0 == 0) goto Lb2
            java.util.List<com.ss.android.ugc.aweme.notice.repo.list.uitemplate.NoticeUITemplateButton> r0 = r0.bottomButtons
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != r3) goto Lb2
            X.0zjo r2 = new X.0zjo
            r2.<init>()
            goto Lb2
        Lad:
            X.0zjq r2 = new X.0zjq
            r2.<init>()
        Lb2:
            r6.LLILZIL = r2
            if (r2 == 0) goto Lb9
            r2.LIZ(r7, r6)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1907530zjr.LIZ(com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice, X.0zj2):void");
    }
}
