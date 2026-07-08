package com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings;

import X.C01JX;
import X.C0UX6;
import X.C12ES;
import X.C1324720kZq;
import X.C1602160rnK;
import X.C16F5;
import X.C16FS;
import X.C1748440vbG;
import X.C1749190vcT;
import X.C1819620xS4;
import X.C1850730yGF;
import X.C1954807lC;
import X.C20743716Ff;
import X.C21578619ce;
import X.C2187701Ajg;
import X.C2188811AlT;
import X.C310501Ih;
import X.C319501Lt;
import X.C334801Rq;
import X.C419910GdJ;
import X.C429201li;
import X.C429301lj;
import X.C429770GtD;
import X.C429901lp;
import X.C430001lq;
import X.C439101nJ;
import X.C497740JfY;
import X.C500260Jjc;
import X.C511901z3;
import X.C513001zE;
import X.C5183020f;
import X.C5185020h;
import X.C786410Ut5;
import X.C915980Zwa;
import X.C937280aUw;
import X.EnumC311901Iv;
import X.EnumC429101lh;
import X.InterfaceC423301kl;
import X.InterfaceC430501lv;
import X.InterfaceC934710aQn;
import X.InterfaceC954180awC;
import X.RunnableC514801zW;
import X.ViewOnFocusChangeListenerC986980bn6;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes.dex */
public final class CountDownForAllV2SettingsDialog extends BaseSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emE+KSwiZz8/KTxiKiAmHELIOSJjEoJjg9Lio+KCM/PndiKiA+JSoiZzo6ZjYpPTs6JiI/Zww8PSs4DSAkJgMjOw4/JBN+GionPCwiLjwXISQgJig=";
    public final int LLL;
    public final String LLLF;
    public CountdownForAllConfigWrapper LLLFF;
    public final InterfaceC423301kl LLLFFI;
    public final C334801Rq LLLFZ;
    public final Boolean LLLI;
    public C21578619ce LLLII;
    public View LLLIIII;
    public View LLLIIIIL;
    public View LLLIIIL;
    public C20743716Ff LLLIIL;
    public C1749190vcT LLLIILIL;
    public C1748440vbG LLLIL;
    public long LLLILZ;
    public C16F5 LLLILZJ;
    public View LLLILZLLLI;
    public View LLLIZZ;
    public C1324720kZq LLLJ;
    public TextView LLLJIL;
    public C429770GtD LLLJL;
    public String LLLL;
    public String LLLLII;
    public int LLLLIIIILLL;
    public long LLLLIIL;
    public C429901lp LLLLIILL;
    public C430001lq LLLLIILLL;
    public C16F5 LLLLIL;
    public C16FS LLLLILI;
    public CountDownForAllV2EffectPreviewDialog LLLLJ;
    public C429301lj LLLLJI;
    public EnumC311901Iv LLLLL;
    public final C513001zE LLLLLIL;
    public final ViewOnFocusChangeListenerC986980bn6 LLLLLILLIL;

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final int aS() {
        return 2;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment
    public final int layoutId() {
        return R.layout.g91;
    }

    public final long ES() {
        int i = this.LLL;
        if (i == 1) {
            C429901lp c429901lp = this.LLLLIILL;
            if (c429901lp != null) {
                return c429901lp.getSelectedDuration();
            }
            return 0L;
        }
        if (i != 2) {
            return 0L;
        }
        C430001lq c430001lq = this.LLLLIILLL;
        return (c430001lq != null ? c430001lq.getSelectedOvertimeDuration() : 0L) + this.LLLLIIL;
    }

    public final void FS() {
        int i = this.LLL;
        if (i == 1) {
            C16F5 c16f5 = this.LLLLIL;
            if (c16f5 != null) {
                C786410Ut5.LLJJJJ(c16f5, 8);
                return;
            }
            return;
        }
        if (i == 2) {
            C16F5 c16f52 = this.LLLLIL;
            if (c16f52 != null) {
                C786410Ut5.LLJJJJ(c16f52, 0);
            }
            QS();
        }
    }

    public final void GS() {
        long j;
        C20743716Ff c20743716Ff;
        CountdownForAllConfigWrapper countdownForAllConfigWrapper;
        CountdownForAllConfigWrapper countdownForAllConfigWrapper2 = this.LLLFF;
        if (countdownForAllConfigWrapper2 != null) {
            j = countdownForAllConfigWrapper2.targetScore;
            if (j < 0) {
                j = 0;
            }
        } else {
            j = 0;
        }
        this.LLLILZ = j;
        C1749190vcT c1749190vcT = this.LLLIILIL;
        if (c1749190vcT != null) {
            C1748440vbG c1748440vbG = new C1748440vbG(c1749190vcT.getContext(), null, 6);
            C786410Ut5.L6(c1748440vbG, new ViewGroup.LayoutParams(-1, C439101nJ.LIZ(48)));
            this.LLLIL = c1748440vbG;
            c1749190vcT.setFormField(c1748440vbG);
        }
        long j2 = this.LLLILZ;
        if (j2 > 0) {
            C1748440vbG c1748440vbG2 = this.LLLIL;
            if (c1748440vbG2 != null) {
                c1748440vbG2.LLJLILLLLZIIL.setText(String.valueOf(j2));
            }
        } else {
            C1748440vbG c1748440vbG3 = this.LLLIL;
            if (c1748440vbG3 != null) {
                c1748440vbG3.LLJLILLLLZIIL.setText("");
            }
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_polygon_circle;
        c419910GdJ.LIZLLL = null;
        C1748440vbG c1748440vbG4 = this.LLLIL;
        if (c1748440vbG4 != null) {
            TuxIconView tuxIconViewLJ = c1748440vbG4.LJ(c419910GdJ, true);
            TuxIconView tuxIconView = c1748440vbG4.LLJL;
            if (tuxIconView != null) {
                C786410Ut5.LJJLIIIJLLLLLLLZ(c1748440vbG4, tuxIconView);
            }
            c1748440vbG4.LLJL = tuxIconViewLJ;
            tuxIconViewLJ.setContentDescription(null);
            c1748440vbG4.LIZIZ(tuxIconViewLJ);
        }
        C1748440vbG c1748440vbG5 = this.LLLIL;
        if (c1748440vbG5 != null) {
            c1748440vbG5.setPlaceholderText(C497740JfY.LJIJI(2131851957));
        }
        if (this.LLL == 1) {
            C1748440vbG c1748440vbG6 = this.LLLIL;
            if (c1748440vbG6 != null) {
                c1748440vbG6.LJIILLIIL(true);
            }
        } else {
            C1748440vbG c1748440vbG7 = this.LLLIL;
            if (c1748440vbG7 != null) {
                c1748440vbG7.LJIILLIIL(false);
            }
        }
        C1748440vbG c1748440vbG8 = this.LLLIL;
        if (c1748440vbG8 != null) {
            c1748440vbG8.LJIILIIL(2, false);
        }
        C1748440vbG c1748440vbG9 = this.LLLIL;
        if (c1748440vbG9 != null) {
            c1748440vbG9.LIZ(this.LLLLLIL);
        }
        C1748440vbG c1748440vbG10 = this.LLLIL;
        if (c1748440vbG10 != null) {
            c1748440vbG10.setOnFocusChangeListener(this.LLLLLILLIL);
        }
        long j3 = this.LLLILZ;
        String strLJFF = (1 > j3 || j3 >= Long.MAX_VALUE) ? "XXX" : C1850730yGF.LJFF(j3);
        C429770GtD c429770GtD = this.LLLJL;
        if (c429770GtD != null) {
            c429770GtD.setGuestEffectTargetScoreText(strLJFF);
        }
        View view = this.LLLIZZ;
        if (view != null) {
            C500260Jjc.LJLIIIL(500L, view, new C5183020f(this, 182));
        }
        C20743716Ff c20743716Ff2 = this.LLLIIL;
        if (c20743716Ff2 != null) {
            c20743716Ff2.setChecked(this.LLLI.booleanValue() || this.LLLILZ > 0 || ((countdownForAllConfigWrapper = this.LLLFF) != null && countdownForAllConfigWrapper.isForceShowScoreArea > 0));
        }
        InterfaceC934710aQn.Fc.LJFF(Boolean.FALSE);
        C20743716Ff c20743716Ff3 = this.LLLIIL;
        if (c20743716Ff3 != null) {
            C1749190vcT c1749190vcT2 = this.LLLIILIL;
            if (c1749190vcT2 != null) {
                C500260Jjc.LJLJLJ(c1749190vcT2, C500260Jjc.LJJJI(Boolean.valueOf(c20743716Ff3.isChecked())));
            }
            View view2 = this.LLLILZLLLI;
            if (view2 != null) {
                C500260Jjc.LJLJLJ(view2, C500260Jjc.LJJJI(Boolean.valueOf(c20743716Ff3.isChecked())));
            }
            C16F5 c16f5 = this.LLLILZJ;
            if (c16f5 != null) {
                C500260Jjc.LJLJLJ(c16f5, !c20743716Ff3.isChecked());
            }
        }
        int i = this.LLL;
        if (i != 1) {
            if (i != 2 || (c20743716Ff = this.LLLIIL) == null) {
                return;
            }
            C786410Ut5.LLJJJIL(c20743716Ff, 8);
            return;
        }
        C20743716Ff c20743716Ff4 = this.LLLIIL;
        if (c20743716Ff4 != null) {
            C786410Ut5.LLJJJIL(c20743716Ff4, 0);
        }
        C20743716Ff c20743716Ff5 = this.LLLIIL;
        if (c20743716Ff5 != null) {
            C786410Ut5.A7(c20743716Ff5, new C511901z3(this, 4));
        }
    }

    public final void HS() {
        int i = this.LLL;
        if (i == 1) {
            C429901lp c429901lp = this.LLLLIILL;
            if (c429901lp != null) {
                int visibility = c429901lp.getVisibility();
                c429901lp.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c429901lp);
            }
            C430001lq c430001lq = this.LLLLIILLL;
            if (c430001lq != null) {
                int visibility2 = c430001lq.getVisibility();
                c430001lq.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c430001lq);
            }
            C429901lp c429901lp2 = this.LLLLIILL;
            if (c429901lp2 != null) {
                c429901lp2.LLJIJIL = this.LLJLLL;
                c429901lp2.setSelectedButtonByMin(this.LLLLIIIILLL);
                return;
            }
            return;
        }
        if (i == 2) {
            C430001lq c430001lq2 = this.LLLLIILLL;
            if (c430001lq2 != null) {
                int visibility3 = c430001lq2.getVisibility();
                c430001lq2.setVisibility(0);
                C1602160rnK.LIZIZ(visibility3, 0, c430001lq2);
            }
            C429901lp c429901lp3 = this.LLLLIILL;
            if (c429901lp3 != null) {
                int visibility4 = c429901lp3.getVisibility();
                c429901lp3.setVisibility(8);
                C1602160rnK.LIZIZ(visibility4, 8, c429901lp3);
            }
            C430001lq c430001lq3 = this.LLLLIILLL;
            if (c430001lq3 != null) {
                c430001lq3.setDurationChangeListener(new InterfaceC430501lv() { // from class: X.01ll
                    @Override // X.InterfaceC430501lv
                    public final void LIZ() {
                        this.LIZ.QS();
                    }
                });
            }
        }
    }

    public final void JS() {
        C1748440vbG c1748440vbG = this.LLLIL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(0);
        }
        C1749190vcT c1749190vcT = this.LLLIILIL;
        if (c1749190vcT != null) {
            c1749190vcT.LJFF(false);
        }
        C429770GtD c429770GtD = this.LLLJL;
        if (c429770GtD != null) {
            c429770GtD.setGuestEffectTargetScoreText(C1850730yGF.LJFF(this.LLLILZ));
        }
        C16FS c16fs = this.LLLLILI;
        if (c16fs != null) {
            c16fs.setEnabled(true);
        }
    }

    public final void PS() {
        C16FS c16fs;
        List<LinkUser> listLIZLLL;
        int i = this.LLL;
        if (i != 1) {
            if (i != 2 || (c16fs = this.LLLLILI) == null) {
                return;
            }
            c16fs.setText(C497740JfY.LJIJI(2131854116));
            return;
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        boolean z = (interfaceC954180awCLLJLL == null || (listLIZLLL = interfaceC954180awCLLJLL.LIZLLL()) == null || listLIZLLL.size() <= 1) ? false : true;
        C16FS c16fs2 = this.LLLLILI;
        if (c16fs2 != null) {
            c16fs2.setText((C937280aUw.LIZIZ(this.LLLF) || !z) ? C497740JfY.LJIJI(2131854116) : C497740JfY.LJIJI(2131853902));
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.LLLFFI.dismiss();
        super.onDestroyView();
    }

    public final String BS() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_target_set=");
        sbLIZ.append(this.LLLILZ > 0 ? 1 : 0);
        sbLIZ.append("&is_resource_set=");
        sbLIZ.append(!a0.LJJJIL(this.LLLL) ? 1 : 0);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void QS() {
        long j = 60;
        long jES = ES() / j;
        long jES2 = ES() % j;
        if (jES2 == 0) {
            C16F5 c16f5 = this.LLLLIL;
            if (c16f5 != null) {
                c16f5.setText(C497740JfY.LJIJJ(2131851955, Long.valueOf(jES)));
                return;
            }
            return;
        }
        C16F5 c16f52 = this.LLLLIL;
        if (c16f52 != null) {
            c16f52.setText(C497740JfY.LJIJJ(2131851942, Long.valueOf(jES), Long.valueOf(jES2)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        TuxSheet tuxSheet;
        super.onDestroy();
        CountDownForAllV2EffectPreviewDialog countDownForAllV2EffectPreviewDialog = this.LLLLJ;
        if (countDownForAllV2EffectPreviewDialog != null) {
            countDownForAllV2EffectPreviewDialog.close(1);
        }
        C429901lp c429901lp = this.LLLLIILL;
        if (c429901lp != null && (tuxSheet = c429901lp.LLJI) != null) {
            tuxSheet.dismissAllowingStateLoss();
        }
        C429301lj c429301lj = this.LLLLJI;
        if (c429301lj != null) {
            c429301lj.LIZ();
        }
    }

    public final void NS(EnumC429101lh enumC429101lh) {
        C1748440vbG c1748440vbG = this.LLLIL;
        if (c1748440vbG != null) {
            c1748440vbG.setValidationStatus(3);
        }
        C429770GtD c429770GtD = this.LLLJL;
        if (c429770GtD != null) {
            c429770GtD.setGuestEffectTargetScoreText("XXX");
        }
        int i = C429201li.LIZ[enumC429101lh.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C1749190vcT c1749190vcT = this.LLLIILIL;
                    if (c1749190vcT != null) {
                        c1749190vcT.LIZJ(C497740JfY.LJIJI(2131851956));
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                C1749190vcT c1749190vcT2 = this.LLLIILIL;
                if (c1749190vcT2 != null) {
                    c1749190vcT2.LIZJ(C497740JfY.LJIJI(2131853905));
                }
            }
        } else {
            C1749190vcT c1749190vcT3 = this.LLLIILIL;
            if (c1749190vcT3 != null) {
                c1749190vcT3.LIZJ(C497740JfY.LJIJI(2131851956));
            }
        }
        C1749190vcT c1749190vcT4 = this.LLLIILIL;
        if (c1749190vcT4 != null) {
            c1749190vcT4.LJFF(true);
        }
        C1749190vcT c1749190vcT5 = this.LLLIILIL;
        if (c1749190vcT5 != null) {
            HandlerHook.viewPostDelay(c1749190vcT5, new RunnableC514801zW(this, 30), 220L);
        }
        C16FS c16fs = this.LLLLILI;
        if (c16fs != null) {
            c16fs.setEnabled(false);
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        SheetOptions sheetOptionsIS = super.iS(context);
        sheetOptionsIS.LIZ(1, null);
        return sheetOptionsIS;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Boolean boolValueOf;
        if (this.LLLLL != EnumC311901Iv.BOTTOM_BUTTON) {
            int i2 = this.LLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(BS());
            sbLIZ.append("&switch=");
            C20743716Ff c20743716Ff = this.LLLIIL;
            if (c20743716Ff != null) {
                boolValueOf = Boolean.valueOf(c20743716Ff.isChecked());
            } else {
                boolValueOf = null;
            }
            sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
            C319501Lt.LIZJ(i2, "close", C2188811AlT.LIZIZ(sbLIZ));
        }
        super.x1(i);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.BaseSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        long j2;
        String str;
        int i;
        String str2;
        View view2;
        ViewTreeObserver viewTreeObserver;
        super.onViewCreated(view, bundle);
        this.LLLFFI.LIZ();
        this.LLLIIII = view.findViewById(R.id.uv7);
        this.LLLIIL = (C20743716Ff) view.findViewById(R.id.uxb);
        this.LLLIIIIL = view.findViewById(R.id.uw5);
        this.LLLIIIL = view.findViewById(R.id.k33);
        this.LLLIILIL = (C1749190vcT) view.findViewById(R.id.uvh);
        this.LLLLILI = (C16FS) view.findViewById(R.id.uv1);
        this.LLLII = (C21578619ce) view.findViewById(R.id.ezj);
        this.LLLLIILL = (C429901lp) view.findViewById(R.id.uwj);
        this.LLLLIILLL = (C430001lq) view.findViewById(R.id.ux_);
        this.LLLLIL = (C16F5) view.findViewById(R.id.uwl);
        this.LLLILZJ = (C16F5) view.findViewById(R.id.wtu);
        this.LLLILZLLLI = view.findViewById(R.id.ux5);
        this.LLLIZZ = view.findViewById(R.id.ux7);
        this.LLLJ = (C1324720kZq) view.findViewById(R.id.ux2);
        this.LLLJIL = (TextView) view.findViewById(R.id.ux6);
        this.LLLJL = (C429770GtD) view.findViewById(R.id.ux4);
        CountdownForAllConfigWrapper countdownForAllConfigWrapper = this.LLLFF;
        if (countdownForAllConfigWrapper != null) {
            j = countdownForAllConfigWrapper.duration;
        } else {
            j = 0;
        }
        this.LLLLIIL = j;
        if (countdownForAllConfigWrapper != null) {
            j2 = countdownForAllConfigWrapper.duration;
        } else {
            j2 = 0;
        }
        int i2 = (int) (j2 / ((long) 60));
        if (i2 < 1) {
            i2 = 1;
        }
        this.LLLLIIIILLL = i2;
        String str3 = "";
        if (countdownForAllConfigWrapper == null || (str = countdownForAllConfigWrapper.resourceId) == null) {
            str = "";
        }
        Boolean boolValueOf = null;
        zS(null, str);
        FS();
        GS();
        View view3 = this.LLLIIIL;
        if (view3 != null) {
            C500260Jjc.LJLIIIL(500L, view3, new C5183020f(this, 180));
        }
        HS();
        PS();
        C16FS c16fs = this.LLLLILI;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new C5183020f(this, 181));
        }
        C429301lj c429301lj = this.LLLLJI;
        if (c429301lj != null) {
            c429301lj.LIZ();
        }
        C429301lj c429301lj2 = new C429301lj(this.LLJZ);
        C5185020h c5185020h = new C5185020h(this, 25);
        if (c429301lj2.LIZIZ == null && (view2 = c429301lj2.LIZ) != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener) c429301lj2.LJ.getValue();
            viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            C2187701Ajg.LIZ(viewTreeObserver, onGlobalLayoutListener, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        c429301lj2.LIZIZ = c5185020h;
        this.LLLLJI = c429301lj2;
        C310501Ih.LIZLLL("setting_page");
        int i3 = this.LLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("is_target_set=");
        CountdownForAllConfigWrapper countdownForAllConfigWrapper2 = this.LLLFF;
        if (countdownForAllConfigWrapper2 != null && countdownForAllConfigWrapper2.targetScore > 0) {
            i = 1;
        } else {
            i = 0;
        }
        sbLIZ.append(i);
        sbLIZ.append("&is_resource_set=");
        CountdownForAllConfigWrapper countdownForAllConfigWrapper3 = this.LLLFF;
        if (countdownForAllConfigWrapper3 != null && (str2 = countdownForAllConfigWrapper3.resourceId) != null) {
            str3 = str2;
        }
        sbLIZ.append(!a0.LJJJIL(str3) ? 1 : 0);
        sbLIZ.append("&switch=");
        C20743716Ff c20743716Ff = this.LLLIIL;
        if (c20743716Ff != null) {
            boolValueOf = Boolean.valueOf(c20743716Ff.isChecked());
        }
        sbLIZ.append(C500260Jjc.LJJJI(boolValueOf) ? 1 : 0);
        C319501Lt.LIZJ(i3, "setting_dialog_show", C2188811AlT.LIZIZ(sbLIZ));
        RedDotExtensionKt.LIZ(C0UX6.GUEST_COUNT_DOWN_ENTRANCE);
    }

    public final void zS(LiveEffect liveEffect, String str) {
        UrlModel icon;
        List<String> list;
        if (!a0.LJJJIL(str) && !Intrinsics.LJFF(str, "")) {
            TextView textView = this.LLLJIL;
            if (textView != null) {
                C439101nJ.LJI(textView);
            }
            if (liveEffect != null && (icon = liveEffect.getIcon()) != null && (list = icon.urlList) != null) {
                C1324720kZq c1324720kZq = this.LLLJ;
                if (c1324720kZq != null) {
                    C12ES.LJIILL(0, c1324720kZq);
                }
                C1819620xS4.LIZ().LIZJ(list).LJJI(this.LLLJ);
            } else {
                C01JX.LIZJ(str, true, new C5185020h(this, 24));
            }
        } else {
            C1324720kZq c1324720kZq2 = this.LLLJ;
            if (c1324720kZq2 != null) {
                C439101nJ.LJI(c1324720kZq2);
            }
            TextView textView2 = this.LLLJIL;
            if (textView2 != null) {
                C12ES.LJIILL(0, textView2);
            }
        }
        this.LLLL = str;
        JS();
        C16FS c16fs = this.LLLLILI;
        if (c16fs != null) {
            c16fs.setEnabled(true);
        }
    }

    public CountDownForAllV2SettingsDialog(DataChannel dataChannel, int i, String str, CountdownForAllConfigWrapper countdownForAllConfigWrapper, InterfaceC423301kl interfaceC423301kl, C334801Rq c334801Rq) {
        super(dataChannel);
        this.LLL = i;
        this.LLLF = str;
        this.LLLFF = countdownForAllConfigWrapper;
        this.LLLFFI = interfaceC423301kl;
        this.LLLFZ = c334801Rq;
        this.LLLI = InterfaceC934710aQn.Fc.LIZIZ();
        CountdownForAllConfigWrapper countdownForAllConfigWrapper2 = this.LLLFF;
        String str2 = (countdownForAllConfigWrapper2 == null || (str2 = countdownForAllConfigWrapper2.resourceId) == null) ? "" : str2;
        this.LLLL = str2;
        this.LLLLII = str2;
        this.LLLLL = EnumC311901Iv.OTHER;
        this.LLLLLIL = new C513001zE(this, 0);
        this.LLLLLILLIL = new ViewOnFocusChangeListenerC986980bn6(this, 0);
    }
}
