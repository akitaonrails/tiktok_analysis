package X;

import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.os.CountDownTimer;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.nativeendlayercomponent.model.NativeEndLayerDataModel;
import com.ss.android.ugc.aweme.web.experiment.EndlayerAutoReportConfigExp;
import kotlin.jvm.internal.AwS103S0110000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cE8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class ViewOnClickListenerC1003740cE8 extends AbstractC1014240cV4 implements View.OnClickListener {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public FrameLayout LLJLIL;
    public TuxTextView LLJLILLLLZIIL;
    public TuxTextView LLJLL;
    public TuxTextView LLJLLIL;
    public LinearLayout LLJLLL;
    public LinearLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public LinearLayout LLL;
    public C1003810cEF LLLF;
    public FrameLayout LLLFF;
    public FrameLayout LLLFFI;
    public SmartImageView LLLFZ;
    public TuxTextView LLLI;
    public TuxTextView LLLII;
    public C197039127h LLLIIII;
    public TuxTextView LLLIIIIL;
    public TuxIconView LLLIIIL;
    public InterfaceC1034470d1h LLLIIL;
    public final BPEAHandler LLLIILIL;
    public CountDownTimer LLLIL;
    public int LLLILZ;
    public final C01GW LLLILZJ;
    public final C01GW LLLILZLLLI;
    public final C01GW LLLIZZ;
    public boolean LLLJ;
    public boolean LLLJIL;
    public volatile C1003530cDn LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(ViewOnClickListenerC1003740cE8.class, "maskStyleService", "getMaskStyleService$anole_release()Lcom/ss/android/ugc/aweme/commercialize/service/IMaskStyleService;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILIIL() {
        return false;
    }

    public final InterfaceC1003550cDp LJJI() {
        C1003530cDn c1003530cDn = this.LLLJL;
        if (c1003530cDn == null) {
            synchronized (this) {
                c1003530cDn = this.LLLJL;
                if (c1003530cDn == null) {
                    C1003530cDn c1003530cDn2 = (C1003530cDn) C1807670x8n.LJJIL();
                    this.LLLJL = c1003530cDn2;
                    return c1003530cDn2;
                }
            }
        }
        return c1003530cDn;
    }

    public final NativeEndLayerDataModel LJJ() {
        return (NativeEndLayerDataModel) this.LLLIZZ.getValue();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        return new C1014500cVU(true, null);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        super.LIZ();
        CountDownTimer countDownTimer = this.LLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C786410Ut5.LJLIIL(200L, this.LLLIILIL, new ARunnableS116S0100000_16(this, 264));
        this.LLLJIL = false;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        super.LJ();
        this.LLLJIL = false;
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIILL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NativeEndLayerComponent,type:");
        sbLIZ.append(this.LL.type);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Dk(AnoleComponentAppearModel anoleComponentAppearModel) {
        super.Dk(anoleComponentAppearModel);
        CountDownTimer countDownTimer = this.LLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C1003750cE9.LIZ(this, "endlayer_close_dealloc");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJII(AnoleComponentAppearModel anoleComponentAppearModel) {
        Integer numValueOf;
        boolean z;
        long j;
        EndlayerAutoReportConfigExp.EndlayerAutoReportConfig endlayerAutoReportConfig;
        EndlayerAutoReportConfigExp.EndlayerAutoReportConfig endlayerAutoReportConfig2;
        super.LJII(anoleComponentAppearModel);
        C1003720cE6 c1003720cE6 = (C1003720cE6) this.LLLILZLLLI.getValue();
        boolean z2 = this.LLLJIL;
        NativeEndLayerDataModel nativeEndLayerDataModelLJJ = LJJ();
        if (nativeEndLayerDataModelLJJ != null) {
            numValueOf = Integer.valueOf(nativeEndLayerDataModelLJJ.showType);
        } else {
            numValueOf = null;
        }
        c1003720cE6.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) c1003720cE6.LIZJ.getValue(), new AwS103S0110000_16(z2, numValueOf, 7));
        NativeEndLayerDataModel nativeEndLayerDataModelLJJ2 = LJJ();
        if (nativeEndLayerDataModelLJJ2 != null && nativeEndLayerDataModelLJJ2.shouldLoadIAB) {
            BPEAHandler bPEAHandler = this.LLLIILIL;
            ARunnableS116S0100000_16 aRunnableS116S0100000_16 = new ARunnableS116S0100000_16(this, 265);
            NativeEndLayerDataModel nativeEndLayerDataModelLJJ3 = LJJ();
            if (nativeEndLayerDataModelLJJ3 != null && nativeEndLayerDataModelLJJ3.showType == 1) {
                z = this.LLLJ;
            } else {
                z = false;
            }
            long j2 = 0;
            if (z && (endlayerAutoReportConfig2 = (EndlayerAutoReportConfigExp.EndlayerAutoReportConfig) EndlayerAutoReportConfigExp.LIZIZ.getValue()) != null) {
                j = endlayerAutoReportConfig2.autoReportClickTime;
            } else {
                j = 0;
            }
            C786410Ut5.LJLIIL(j, bPEAHandler, aRunnableS116S0100000_16);
            BPEAHandler bPEAHandler2 = this.LLLIILIL;
            ARunnableS116S0100000_16 aRunnableS116S0100000_162 = new ARunnableS116S0100000_16(this, 266);
            NativeEndLayerDataModel nativeEndLayerDataModelLJJ4 = LJJ();
            if (nativeEndLayerDataModelLJJ4 != null && nativeEndLayerDataModelLJJ4.showType == 1 && this.LLLJ && (endlayerAutoReportConfig = (EndlayerAutoReportConfigExp.EndlayerAutoReportConfig) EndlayerAutoReportConfigExp.LIZIZ.getValue()) != null) {
                j2 = endlayerAutoReportConfig.autoLoadIab;
            }
            C786410Ut5.LJLIIL(j2, bPEAHandler2, aRunnableS116S0100000_162);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        if (abstractC1003980cEW instanceof C991730bul) {
            if (((C991730bul) abstractC1003980cEW).LIZ) {
                CountDownTimer countDownTimer = this.LLLIL;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                int i = this.LLLILZ;
                if (i > 0) {
                    this.LLLIL = new CountDownTimerC1003760cEA(this, ((long) i) * 1000).start();
                    return;
                }
                return;
            }
            CountDownTimer countDownTimer2 = this.LLLIL;
            if (countDownTimer2 == null) {
                return;
            }
            countDownTimer2.cancel();
            return;
        }
        if (!(abstractC1003980cEW instanceof C991240bty) || !((C991240bty) abstractC1003980cEW).LIZ.has("executed_lf_gecko_immediately_task")) {
            return;
        }
        this.LLLJIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x023b  */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nk(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel r12) {
        /*
            Method dump skipped, instruction units count: 650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC1003740cE8.Nk(com.ss.android.ugc.aweme.commercialize.model.AnoleComponentAppearModel):void");
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        Integer numValueOf5;
        Integer numValueOf6;
        Integer numValueOf7;
        Integer numValueOf8;
        Integer numValueOf9;
        Integer numValueOf10;
        Integer numValueOf11;
        NativeEndLayerDataModel nativeEndLayerDataModelLJJ;
        if (C0OBG.LIZIZ(view)) {
            return;
        }
        Integer numValueOf12 = null;
        if (view != null && (numValueOf = Integer.valueOf(view.getId())) != null) {
            View view2 = this.LLJJIJIL;
            if (view2 != null) {
                numValueOf2 = Integer.valueOf(view2.getId());
            } else {
                numValueOf2 = null;
            }
            if (!Intrinsics.LJFF(numValueOf, numValueOf2)) {
                FrameLayout frameLayout = this.LLLFF;
                if (frameLayout != null) {
                    numValueOf3 = Integer.valueOf(frameLayout.getId());
                } else {
                    numValueOf3 = null;
                }
                if (!Intrinsics.LJFF(numValueOf, numValueOf3)) {
                    TuxTextView tuxTextView = this.LLJLILLLLZIIL;
                    if (tuxTextView != null) {
                        numValueOf4 = Integer.valueOf(tuxTextView.getId());
                    } else {
                        numValueOf4 = null;
                    }
                    if (!Intrinsics.LJFF(numValueOf, numValueOf4)) {
                        C197039127h c197039127h = this.LLLIIII;
                        if (c197039127h != null) {
                            numValueOf5 = Integer.valueOf(c197039127h.getId());
                        } else {
                            numValueOf5 = null;
                        }
                        if (!Intrinsics.LJFF(numValueOf, numValueOf5)) {
                            SmartImageView smartImageView = this.LLLFZ;
                            if (smartImageView != null) {
                                numValueOf6 = Integer.valueOf(smartImageView.getId());
                            } else {
                                numValueOf6 = null;
                            }
                            if (Intrinsics.LJFF(numValueOf, numValueOf6)) {
                                C1003750cE9.LIZJ(this, 11);
                                return;
                            }
                            TuxTextView tuxTextView2 = this.LLLI;
                            if (tuxTextView2 != null) {
                                numValueOf7 = Integer.valueOf(tuxTextView2.getId());
                            } else {
                                numValueOf7 = null;
                            }
                            if (Intrinsics.LJFF(numValueOf, numValueOf7)) {
                                C1003750cE9.LIZJ(this, 14);
                                return;
                            }
                            FrameLayout frameLayout2 = this.LLLFFI;
                            if (frameLayout2 != null) {
                                numValueOf8 = Integer.valueOf(frameLayout2.getId());
                            } else {
                                numValueOf8 = null;
                            }
                            if (Intrinsics.LJFF(numValueOf, numValueOf8)) {
                                C1003750cE9.LIZJ(this, 92);
                                return;
                            }
                            TuxTextView tuxTextView3 = this.LLLII;
                            if (tuxTextView3 != null) {
                                numValueOf9 = Integer.valueOf(tuxTextView3.getId());
                            } else {
                                numValueOf9 = null;
                            }
                            if (Intrinsics.LJFF(numValueOf, numValueOf9)) {
                                C1003750cE9.LIZJ(this, 12);
                                return;
                            }
                            TuxTextView tuxTextView4 = this.LLJLL;
                            if (tuxTextView4 != null) {
                                numValueOf10 = Integer.valueOf(tuxTextView4.getId());
                            } else {
                                numValueOf10 = null;
                            }
                            if (!Intrinsics.LJFF(numValueOf, numValueOf10)) {
                                TuxTextView tuxTextView5 = this.LLLIIIIL;
                                if (tuxTextView5 != null) {
                                    numValueOf11 = Integer.valueOf(tuxTextView5.getId());
                                } else {
                                    numValueOf11 = null;
                                }
                                if (!Intrinsics.LJFF(numValueOf, numValueOf11)) {
                                    TuxTextView tuxTextView6 = this.LLJLLIL;
                                    if (tuxTextView6 != null) {
                                        numValueOf12 = Integer.valueOf(tuxTextView6.getId());
                                    }
                                    if (!Intrinsics.LJFF(numValueOf, numValueOf12) || (nativeEndLayerDataModelLJJ = LJJ()) == null || !nativeEndLayerDataModelLJJ.isOneToN()) {
                                        return;
                                    }
                                    this.LLILLL.LJIJ(new C989550brF(new C1003800cEE()), this);
                                    C2184171Adz.LIZLLL("background_ad", "nextad_click", this.LLILLJJLI.LIZLLL).LJII();
                                    return;
                                }
                            }
                            C1003750cE9.LIZIZ(this, "button");
                            return;
                        }
                    }
                    C1003750cE9.LIZJ(this, 3);
                    return;
                }
            }
            NativeEndLayerDataModel nativeEndLayerDataModelLJJ2 = LJJ();
            if (nativeEndLayerDataModelLJJ2 != null && nativeEndLayerDataModelLJJ2.isOneToN()) {
                return;
            }
            C1003750cE9.LIZIZ(this, null);
        }
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        super.Fk(viewGroup, interfaceC1014340cVE);
        this.LLLJIL = false;
    }

    public ViewOnClickListenerC1003740cE8(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLLIILIL = new BPEAHandler(Looper.getMainLooper());
        this.LLLILZ = -1;
        this.LLLILZJ = C452501pT.LIZIZ(new AwS560S0100000_16(anoleComponentModel, 1019));
        this.LLLILZLLLI = C452501pT.LIZIZ(new AwS260S0300000_16(this, anoleComponentModel, c1009340cNA, 36));
        this.LLLIZZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, 1018));
    }
}
