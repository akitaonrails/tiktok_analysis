package X;

import Y.ACListenerS134S0200000_32;
import Y.AObjectS78S0000000_28;
import android.content.Context;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import avg.f;
import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaBuilder;
import com.ss.android.ugc.aweme.creative.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.publish.IAVPublishPageUIRefactorService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import mf.a;

/* JADX INFO: renamed from: X.10FN, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10FN extends C10FO implements View.OnClickListener, C194E {
    public ArrayList<View.OnClickListener> LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public final boolean LLJILJIL;
    public final boolean LLJILJILJ;
    public final boolean LLJILLL;
    public CMPreviewInfo LLJJ;
    public boolean LLJJI;
    public int LLJJIII;
    public boolean LLJJIJI;

    public final void LIZLLL() {
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILJJIL("");
    }

    public int getPermission() {
        return this.LLIZLLLIL;
    }

    public C10FN(Context context) {
        boolean z;
        boolean z2;
        int i;
        View.OnClickListener fVar;
        int i2;
        super(context, null);
        this.LLIZLLLIL = -1;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_creation_post_privacy_grammar", true) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJILJILJ = z;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_creation_post_privacy_text", true) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.LLJILLL = z2;
        this.LLJJ = null;
        this.LLJJI = true;
        this.LLJJIII = 0;
        this.LLJJIJI = false;
        C19292410dm currentUser = C0CHQ.LIZ().getAccountService().getCurrentUser();
        if (currentUser != null) {
            this.LLJILJIL = currentUser.LJIIJJI();
        }
        setLeftTuxIcon(R.raw.icon_unlock);
        if (z) {
            if (this.LLJILJIL) {
                i2 = 2131844948;
            } else {
                i2 = 2131844947;
            }
            setTitle(i2);
        } else {
            if (this.LLJI) {
                i = 2131844965;
            } else {
                i = 2131850517;
            }
            setTitle(i);
            if (this.LLJILJIL) {
                setLabelText(2131845585);
            } else {
                setLabelText(R.string.dlw);
            }
        }
        if (C1848410yCV.LIZ) {
            fVar = new f(this);
        } else {
            fVar = this;
        }
        a aVar = new a(fVar);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
        if (C298670BnF.LIZ()) {
            KevaBuilder.getInstance().setContext(context);
        }
    }

    private void setShowArrow(Boolean bool) {
        C11G4 c11g4 = (C11G4) this.LL.getAccessory();
        Objects.requireNonNull(c11g4);
        c11g4.LJIILLIIL(bool.booleanValue());
    }

    @Override // X.C194E
    public final void LIZ(ACListenerS134S0200000_32 aCListenerS134S0200000_32) {
        if (this.LLIZ == null) {
            this.LLIZ = new ArrayList<>();
        }
        this.LLIZ.add(aCListenerS134S0200000_32);
    }

    @Override // X.C194E
    public final void LIZIZ(boolean z) {
        if (z) {
            C855510XhF.LIZ.getClass();
            if (C0L44.LIZ()) {
                Keva keva = C1413370msp.LIZ;
                if (!keva.getBoolean("IS_FIRST_TIME_CREATION_SUBS_PERMISSION_HIGHLIGHT", true)) {
                    return;
                }
                if (C298650BnD.LIZ() && this.LLJI) {
                    return;
                }
                keva.storeBoolean("IS_FIRST_TIME_CREATION_SUBS_PERMISSION_HIGHLIGHT", false);
                C06LR.LIZIZ(this.LLILLJJLI);
                setSubtitle(getContext().getString(2131830331));
            }
        }
    }

    @Override // X.C194E
    public final void LIZJ(boolean z) {
        this.LLJIJIL = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x00f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(int r4) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10FN.LJ(int):void");
    }

    @Override // X.C194E
    public final void lq(boolean z) {
        this.LLJJI = z;
        LJ(this.LLIZLLLIL);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1653260t7k.LIZ("click_publish_setting_entrance");
        if ((C0C64.LJIILLIIL().LJIJ(31744, 0, "creative_tools_publish_first_frame_opt", true) & 4) == 0 || this.LL.getShowAlertBadge()) {
            this.LL.setShowAlertBadge(false);
        }
        if (C086I.LIZIZ(this.LLIZ)) {
            return;
        }
        Iterator<View.OnClickListener> it2 = this.LLIZ.iterator();
        while (it2.hasNext()) {
            it2.next().onClick(view);
        }
        C0T6J.LIZ(view, new AObjectS78S0000000_28(10));
    }

    @Override // X.C194E
    public void setAdvPromotable(boolean z) {
        this.LLJ = z;
        LJ(this.LLIZLLLIL);
    }

    @Override // X.C194E
    public void setCmPreviewInfo(CMPreviewInfo cMPreviewInfo) {
        String string;
        if (this.LLIZLLLIL != 4) {
            return;
        }
        this.LLJJ = cMPreviewInfo;
        if (cMPreviewInfo == null) {
            setSubtitle("");
            return;
        }
        if (this.LLJI) {
            setSubtitle("");
            return;
        }
        C443120HZe c443120HZeLIZ = C10FS.LIZ(false, Float.valueOf(C10FS.LJ(cMPreviewInfo.previewDurationTimeInMs)));
        if (((String) c443120HZeLIZ.getSecond()).isEmpty()) {
            string = getContext().getString(2131830330, c443120HZeLIZ.getThird());
        } else {
            string = getContext().getString(2131830329, c443120HZeLIZ.getSecond(), c443120HZeLIZ.getThird());
        }
        setSubtitle(string);
    }

    @Override // X.C194E
    public void setIconEnableColor(int i) {
        this.LL.setIconEnableColor(i);
        this.LLJJIJI = true;
        int i2 = this.LLJJIII;
        if (i2 != 0) {
            setLeftTuxIcon(i2);
            this.LLJJIII = 0;
        }
    }

    @Override // X.C194E
    public void setImageMode(boolean z) {
        this.LLJI = z;
    }

    @Override // X.C10FO
    public void setLeftTuxIcon(int i) {
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = i;
        if (!this.LLJJIJI) {
            this.LLJJIII = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        }
        this.LL.setIcon(c419910GdJ);
        IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi(IAVPublishPageUIRefactorService.class);
        if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableRefactorPublishUI()) {
            C418440Gaw.LIZ(Float.valueOf(18.0f));
            C418440Gaw.LIZ(Float.valueOf(18.0f));
        }
    }

    @Override // X.C194E
    public void setPermission(int i) {
        this.LLIZLLLIL = i;
        LJ(i);
    }

    @Override // X.C10FO
    public void setTitle(int i) {
        String string = getContext().getString(i);
        this.LLILLL = string;
        C127K c127k = this.LL;
        if (c127k != null) {
            C444910HcX c444910HcX = new C444910HcX(string);
            c444910HcX.LIZ(42);
            c127k.setTitle(c444910HcX);
        }
    }

    public final void LJFF(int i, boolean z) {
        if (z) {
            this.LLILZIL = getContext().getString(i);
            C444910HcX c444910HcX = new C444910HcX(this.LLILZIL);
            if (C1308910kAL.LIZJ(R.attr.a04, getContext()) != null) {
                C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(C1308910kAL.LIZJ(R.attr.a04, getContext()).intValue()), 0, this.LLILZIL.length(), 33);
            }
            C11G4 c11g4 = (C11G4) this.LL.getAccessory();
            Objects.requireNonNull(c11g4);
            c11g4.LJIILJJIL(c444910HcX);
            return;
        }
        setLabelText(i);
    }

    public final void LJI(int i, boolean z) {
        if (z && this.LLJILJILJ) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a04);
            this.LL.setIcon(c419910GdJ);
            IAVPublishPageUIRefactorService iAVPublishPageUIRefactorService = (IAVPublishPageUIRefactorService) PluggableExtentionKt.pluggableSpi(IAVPublishPageUIRefactorService.class);
            if (iAVPublishPageUIRefactorService != null && iAVPublishPageUIRefactorService.enableRefactorPublishUI()) {
                C418440Gaw.LIZ(Float.valueOf(18.0f));
                C418440Gaw.LIZ(Float.valueOf(18.0f));
                return;
            }
            return;
        }
        setLeftTuxIcon(i);
    }

    public final void LJII(int i, boolean z) {
        if (z) {
            this.LLILLL = getContext().getString(i);
            C444910HcX c444910HcX = new C444910HcX(this.LLILLL);
            c444910HcX.LIZ(42);
            if (C1308910kAL.LIZJ(R.attr.a04, getContext()) != null) {
                C786410Ut5.s2(c444910HcX, new ForegroundColorSpan(C1308910kAL.LIZJ(R.attr.a04, getContext()).intValue()), 0, this.LLILLL.length(), 33);
            }
            this.LL.setTitle(c444910HcX);
            return;
        }
        setTitle(i);
    }
}
