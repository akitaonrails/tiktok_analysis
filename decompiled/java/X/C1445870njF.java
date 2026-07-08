package X;

import Y.ARunnableS41S0110000_22;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore;
import com.ss.android.ugc.aweme.shortvideo.PublishFailMsg;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0njF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445870njF extends C214906198m implements InterfaceC1380420m1g, InterfaceC1442990neb {
    public final C19EG LL;
    public final C1439050nYF LLILLJJLI;
    public final boolean LLILLL;
    public final PublishFailMsg LLILZ;
    public final View LLILZIL;
    public RelativeLayout LLILZLL;
    public C1380400m1e LLIZ;
    public InterfaceC1445880njG LLIZLLLIL;
    public final boolean LLJ;
    public boolean LLJI;
    public String LLJIJIL;

    @Override // X.InterfaceC1380420m1g
    public final void LIZ() {
    }

    @Override // X.InterfaceC1380420m1g
    public final void LIZIZ() {
        LJIILIIL(false, false);
    }

    @Override // X.InterfaceC1442990neb
    public final void LJJI() {
        if (this.LL.isFinishing()) {
            return;
        }
        InterfaceC1445880njG interfaceC1445880njG = this.LLIZLLLIL;
        if (interfaceC1445880njG != null) {
            interfaceC1445880njG.LIZ(null);
        }
        this.LLIZ.LIZIZ();
        try {
            showAtLocation(this.LL.getWindow().getDecorView(), 48, 0, 0);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJI(this);
            C787990Uvd.LIZ.getClass();
            C994003uc.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJIIJZLJL() {
        /*
            r3 = this;
            X.0nYF r0 = r3.LLILLJJLI
            com.ss.android.ugc.aweme.draft.model.AwemeDraft r2 = r0.LIZ
            boolean r0 = r3.LLILLL
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = r2.LJIILL()
            if (r0 != 0) goto L31
            boolean r0 = r2.LJIIL()
            if (r0 != 0) goto L31
            X.0Vh4 r0 = X.C036E.LIZ     // Catch: java.lang.Exception -> L1e
            boolean r0 = r0.LIZIZ()     // Catch: java.lang.Exception -> L1e
            if (r0 == 0) goto L31
            goto L23
        L1e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L31
        L23:
            X.01GW r0 = X.C2547209yY.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L3b
        L31:
            com.ss.android.ugc.aweme.shortvideo.PublishFailMsg r0 = r3.LLILZ
            java.lang.String r0 = r0.publishFailedString
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L3c
        L3b:
            r1 = 1
        L3c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1445870njF.LJJIIJZLJL():boolean");
    }

    public final int LJJIIJ() {
        return LJJIIJZLJL() ? C497820Jfg.LIZJ(C0CHQ.LIZ) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)) : C497820Jfg.LIZJ(C0CHQ.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final int getJumpTo() {
        return IUploadRecoverInfoStore.DefaultImpls.getJumpTo(this);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final Pair<String, String> getText() {
        return IUploadRecoverInfoStore.DefaultImpls.getText(this);
    }

    @Override // X.InterfaceC1442990neb
    public final C19EG getActivity() {
        return this.LL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final String getSchema() {
        return this.LLJIJIL;
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void isBackUp(boolean z) {
        IUploadRecoverInfoStore.DefaultImpls.isBackUp(this, z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setHintLayerEnabled(boolean z) {
        IUploadRecoverInfoStore.DefaultImpls.setHintLayerEnabled(this, z);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setJumpTo(int i) {
        IUploadRecoverInfoStore.DefaultImpls.setJumpTo(this, i);
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setSchema(String str) {
        this.LLJIJIL = str;
    }

    @Override // X.InterfaceC1442990neb
    public final void setVisibility(boolean z) {
        HandlerHook.viewPost(this.LLILZIL, new ARunnableS41S0110000_22(this, z, 1));
    }

    @Override // X.InterfaceC1442990neb
    public final void LJIILIIL(boolean z, boolean z2) {
        C1439650nZD.LJI = false;
        if (!this.LLJ && !this.LLJI && !z && !z2) {
            C0CHQ.LIZ().getPublishService().LJIIL().LIZIZ(C13BV.INSTANCE);
        }
        if (isShowing() && !this.LL.isFinishing() && this.LLIZ.hasWindowFocus()) {
            this.LLIZ.LIZ(0.0f, true);
        }
        InterfaceC1445880njG interfaceC1445880njG = this.LLIZLLLIL;
        if (interfaceC1445880njG != null) {
            interfaceC1445880njG.LIZIZ(z, false);
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.video.IUploadRecoverInfoStore
    public final void setText(String str, String str2) {
        InterfaceC1445880njG interfaceC1445880njG = this.LLIZLLLIL;
        if (interfaceC1445880njG != null) {
            interfaceC1445880njG.setText(str, "");
        }
    }

    public C1445870njF(C19EG c19eg, C1439050nYF c1439050nYF, boolean z, boolean z2, PublishFailMsg publishFailMsg) {
        int i;
        InterfaceC1445880njG c1443060nei;
        super(c19eg);
        this.LL = c19eg;
        this.LLILLJJLI = c1439050nYF;
        this.LLILLL = z2;
        this.LLILZ = publishFailMsg;
        LayoutInflater layoutInflater = c19eg.getLayoutInflater();
        C365090ETb.LIZIZ();
        boolean zLIZJ = ComplianceServiceProvider.LJFF().LIZJ(1);
        this.LLJ = zLIZJ;
        if (LJJIIJZLJL()) {
            i = R.layout.d_7;
        } else if (zLIZJ) {
            i = R.layout.d_3;
        } else {
            i = R.layout.d_6;
        }
        View viewSd = C786410Ut5.Sd(i, layoutInflater, null);
        this.LLILZIL = viewSd;
        this.LLILZLL = (RelativeLayout) viewSd.findViewById(R.id.tp_);
        C1380400m1e c1380400m1e = (C1380400m1e) viewSd.findViewById(R.id.si1);
        this.LLIZ = c1380400m1e;
        c1380400m1e.LLILLL = this.LLILZLL;
        c1380400m1e.setPullUpListener(this);
        if (zLIZJ) {
            AwemeDraft awemeDraft = c1439050nYF.LIZ;
            RelativeLayout relativeLayout = this.LLILZLL;
            if (relativeLayout != null) {
                c1443060nei = new C1443200new(c19eg, awemeDraft, this, relativeLayout);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            RelativeLayout relativeLayout2 = this.LLILZLL;
            if (relativeLayout2 != null) {
                c1443060nei = new C1443060nei(c19eg, c1439050nYF, this, relativeLayout2, z, publishFailMsg);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        this.LLIZLLLIL = c1443060nei;
        C1380400m1e c1380400m1e2 = this.LLIZ;
        if (c1380400m1e2 != null) {
            c1380400m1e2.setWindowHeight(LJJIIJ());
        }
        ((FrameLayout.LayoutParams) this.LLILZLL.getLayoutParams()).topMargin = LJJIIJ();
        setBackgroundDrawable(new ColorDrawable(0));
        setClippingEnabled(false);
        setContentView(viewSd);
        setWidth(C12ES.LJIIJ(C0CHQ.LIZ));
        setHeight(-2);
        setAnimationStyle(R.style.afu);
        C1439650nZD.LJI = true;
    }
}
