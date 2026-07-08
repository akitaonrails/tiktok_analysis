package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15tV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20663915tV implements InterfaceC20663615tS {
    public final Activity LL;
    public final InnerPushMessage LLILLJJLI;
    public final C20664415ta LLILLL;
    public C20665215ti LLILZ;
    public PopupWindow.OnDismissListener LLILZIL;
    public Function0<Unit> LLILZLL;
    public C21647019ng LLIZ;
    public C21647019ng LLIZLLLIL;

    @Override // X.InterfaceC20663615tS
    public final void dismiss() {
        this.LLILLL.LIZIZ(new C20664015tW(this));
    }

    @Override // X.InterfaceC20663615tS
    public final int getMessageType() {
        return this.LLILLJJLI.getType();
    }

    @Override // X.InterfaceC20663615tS
    public final boolean isShowing() {
        return this.LLILLL.LLIZLLLIL;
    }

    @Override // X.InterfaceC20663615tS
    public final C20665215ti LJIILLIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20663615tS
    public final InnerPushMessage getMsg() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC20663615tS
    public final void LJII(InnerPushMessage innerPushMessage) {
        C20644215qK.LIZ(innerPushMessage);
    }

    @Override // X.InterfaceC20663615tS
    public final void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.LLILZIL = onDismissListener;
    }

    public C20663915tV(Activity activity, InnerPushMessage innerPushMessage) {
        this.LL = activity;
        this.LLILLJJLI = innerPushMessage;
        C20664415ta c20664415ta = new C20664415ta(activity);
        c20664415ta.setInnerPushNotifier(this);
        this.LLILLL = c20664415ta;
    }

    @Override // X.InterfaceC20665015tg
    public final void LJIJI(String str, boolean z) {
        C20664415ta c20664415ta = this.LLILLL;
        if (!c20664415ta.LLJ && c20664415ta.LLIZLLLIL) {
            this.LLILLL.LIZIZ(new C20664015tW(this));
            C20663715tT.LIZ.LJFF(this.LLILLJJLI, z, str);
        }
    }

    @Override // X.InterfaceC20663615tS
    public final void LJJIII(C20665215ti c20665215ti, InnerPushMessage innerPushMessage) {
        ViewGroup viewGroup;
        long j;
        if (c20665215ti == null) {
            return;
        }
        View decorView = this.LL.getWindow().getDecorView();
        if ((decorView instanceof ViewGroup) && (viewGroup = (ViewGroup) decorView) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Exit show isShowing:");
            sbLIZ.append(this.LLILLL.LLIZLLLIL);
            sbLIZ.append(" isDismissing:");
            sbLIZ.append(this.LLILLL.LLJ);
            sbLIZ.append(" isShowing:");
            sbLIZ.append(this.LLILLL.LLIZLLLIL);
            sbLIZ.append(' ');
            C19290510dT.LIZ("InnerPushDMContainer", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILZ = c20665215ti;
            this.LLILLL.setMessage(innerPushMessage);
            this.LLILLL.LIZ(c20665215ti);
            C20664415ta c20664415ta = this.LLILLL;
            InnerPushConfig config = innerPushMessage.getConfig();
            if (config != null) {
                j = ((long) config.popupDurationSeconds) * 1000;
            } else {
                j = Mp4ScreenVideoLoadTimeout.CONTROL;
            }
            c20664415ta.setShowDuration(j);
            InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
            if (uiTemplate != null) {
                this.LLILLL.setInnerPushLayoutRadius(uiTemplate.globalRadius);
            }
            C20644215qK.LIZ(innerPushMessage);
            C20664415ta c20664415ta2 = this.LLILLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 48;
            layoutParams.topMargin = C497820Jfg.LIZJ(this.LL);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20664415ta2);
            c20664415ta2.setLayoutParams(layoutParams);
            viewGroup.addView(this.LLILLL);
            this.LLILLL.onShow();
            if (innerPushMessage.getType() == 21) {
                IMessageAlertToneService.LIZ.getClass();
                IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
                if (iMessageAlertToneServiceLIZ != null) {
                    iMessageAlertToneServiceLIZ.LJIIIZ();
                    return;
                }
                return;
            }
            return;
        }
        C19331210k2 c19331210k2 = C19331210k2.LIZ;
        EnumC19330310jt enumC19330310jt = EnumC19330310jt.DROP_BY_CTX_INVALID;
        c19331210k2.getClass();
        C19331210k2.LJIIIIZZ(innerPushMessage, enumC19330310jt);
    }

    @Override // X.InterfaceC20663615tS
    public final void LIZJ(InnerPushMessage innerPushMessage, int[] iArr, boolean z, boolean z2) {
        if (C20731216Ak.LIZ() && z2) {
            C20665215ti c20665215ti = this.LLILZ;
            if (c20665215ti == null) {
                return;
            }
            C20665215ti c20665215ti2 = new C20665215ti(this, this.LL);
            c20665215ti2.LIZIZ(innerPushMessage);
            C20663515tR.LJII(C20663715tT.LIZ, innerPushMessage, false, c20665215ti2, 2);
            C19746412Nq c19746412Nq = new C19746412Nq("Exit_TranslationY", new C0HV5(C418440Gaw.LIZIZ(0), C418440Gaw.LIZIZ(Integer.valueOf(c20665215ti.getMeasuredHeight()))));
            C19746412Nq c19746412Nq2 = new C19746412Nq("Exit_Alpha", new C0HUY(1.0f, 0.0f));
            Activity activity = this.LL;
            EnumC19746112Nn enumC19746112Nn = EnumC19746112Nn.SPRING;
            this.LLIZ = new C21647019ng(activity, c20665215ti, new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), C1697810uHb.LJIIJJI(c19746412Nq, c19746412Nq2)), false);
            this.LLIZLLLIL = new C21647019ng(this.LL, c20665215ti2, new C19746312Np(enumC19746112Nn, new C0HU6(new C1342130l1v(322.27f), new C1342130l1v(35.9f)), C1697810uHb.LJIIJJI(new C19746412Nq("Enter_TranslationY", new C0HV5(C418440Gaw.LIZIZ(Integer.valueOf(-c20665215ti.getMeasuredHeight())), C418440Gaw.LIZIZ(0))), new C19746412Nq("Enter_Alpha", new C0HUY(0.0f, 1.0f)))), false);
            C20664415ta c20664415ta = this.LLILLL;
            c20664415ta.getClass();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = c20664415ta.LLILLJJLI;
            if (frameLayout != null) {
                frameLayout.addView(c20665215ti2, layoutParams);
            }
            C16HW c16hw = new C16HW(this, c20665215ti, 3);
            C16HW c16hw2 = new C16HW(this, c20665215ti2, 2);
            C21647019ng c21647019ng = this.LLIZLLLIL;
            if (c21647019ng != null) {
                c21647019ng.LIZJ("Enter_TranslationY", c16hw2);
            }
            C21647019ng c21647019ng2 = this.LLIZ;
            if (c21647019ng2 != null) {
                c21647019ng2.LIZJ("Exit_TranslationY", c16hw);
            }
            C21647019ng c21647019ng3 = this.LLIZ;
            if (c21647019ng3 != null) {
                c21647019ng3.LJI(true);
            }
            C21647019ng c21647019ng4 = this.LLIZLLLIL;
            if (c21647019ng4 != null) {
                c21647019ng4.LJI(true);
            }
        } else {
            C20665215ti c20665215ti3 = this.LLILZ;
            if (c20665215ti3 != null) {
                c20665215ti3.LIZLLL(innerPushMessage, iArr);
            }
        }
        if (z) {
            this.LLILLL.LIZJ();
        }
        if (innerPushMessage.getType() == 21) {
            IMessageAlertToneService.LIZ.getClass();
            IMessageAlertToneService iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
            if (iMessageAlertToneServiceLIZ != null) {
                iMessageAlertToneServiceLIZ.LJIIIZ();
            }
        }
    }
}
