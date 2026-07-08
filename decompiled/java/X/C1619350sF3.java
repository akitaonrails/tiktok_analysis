package X;

import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.hox.Hox;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ICoinService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.service.protection.TooltipApplicabilityService;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0sF3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("homepage_hot_search_tips")
public final class C1619350sF3 extends C10GR {
    public final C19EG LL;
    public final View LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final InterfaceC1685420txc<View, String, String, String, String, Unit> LLILZIL;
    public C0P0T LLILZLL;
    public final int LLIZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [X.10Qm] */
    /* JADX WARN: Type inference failed for: r1v12, types: [X.10Qm, X.10Qp] */
    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        C670650QSh.LIZ.getClass();
        if (C670650QSh.LIZIZ.LJFF.length() == 0) {
            return false;
        }
        final View view = this.LLILLJJLI;
        final C19EG c19eg = this.LL;
        final ?? r1 = new InterfaceC19244510Qp(view) { // from class: X.10Qm
            public final View LIZ;

            @Override // X.InterfaceC19244510Qp
            public final int getScene() {
                return EnumC19243910Qj.FEED.getValue();
            }

            @Override // X.InterfaceC19244510Qp
            public final int getType() {
                return EnumC19243810Qi.SEARCH_HOT_BUBBLE.getValue();
            }

            {
                this.LIZ = view;
            }
        };
        try {
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (!new AbstractC1593880rZy(r1, c19eg) { // from class: X.0hlO
            @Override // X.InterfaceC1590940rVE
            public final void LIZ() {
            }

            @Override // X.InterfaceC1590940rVE
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC1590940rVE
            public final void q0(Function0<Unit> function0) {
            }

            {
                WeakReference weakReference = new WeakReference(c19eg);
            }
        }.shouldShow()) {
            if (C0QS0.LIZIZ().searchBubbleProtectionMode == 1) {
                C670650QSh c670650QSh = C670650QSh.LIZ;
                final View view2 = this.LLILLJJLI;
                final C19EG c19eg2 = this.LL;
                c670650QSh.getClass();
                final ?? r12 = new InterfaceC19244510Qp(view2) { // from class: X.10Qm
                    public final View LIZ;

                    @Override // X.InterfaceC19244510Qp
                    public final int getScene() {
                        return EnumC19243910Qj.FEED.getValue();
                    }

                    @Override // X.InterfaceC19244510Qp
                    public final int getType() {
                        return EnumC19243810Qi.SEARCH_HOT_BUBBLE.getValue();
                    }

                    {
                        this.LIZ = view2;
                    }
                };
                new AbstractC1593880rZy(r12, c19eg2) { // from class: X.0hlO
                    @Override // X.InterfaceC1590940rVE
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1590940rVE
                    public final boolean LIZIZ() {
                        return true;
                    }

                    @Override // X.InterfaceC1590940rVE
                    public final void q0(Function0<Unit> function0) {
                    }

                    {
                        WeakReference weakReference = new WeakReference(c19eg2);
                    }
                };
                try {
                    if (!(true ^ TooltipApplicabilityService.LJII().LIZLLL(r12))) {
                        C1619390sF7.LIZ("protection_mode_others");
                        return false;
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                C1619390sF7.LIZ("protection_mode");
                return false;
            }
        }
        if (C1908480zlO.LIZIZ.LJIIIZ(false)) {
            C1619390sF7.LIZ("inapp_push");
            return false;
        }
        C670650QSh c670650QSh2 = C670650QSh.LIZ;
        C19EG c19eg3 = this.LL;
        c670650QSh2.getClass();
        if (!C670650QSh.LIZ(c19eg3)) {
            C1619390sF7.LIZ("guide_intercept");
            return false;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        TuxTextView tuxTextView = new TuxTextView(this.LL, null, 6, 0);
        tuxTextView.setTextColorRes(R.attr.e1);
        tuxTextView.setTuxFont(62);
        tuxTextView.setMaxLines(1);
        tuxTextView.setText(C670650QSh.LIZIZ.LJFF);
        C786410Ut5.R6(tuxTextView, layoutParams);
        if (C670650QSh.LIZIZ.LJFF.length() > 0) {
            String str = C670650QSh.LIZIZ.LJFF;
            if (tuxTextView.getPaint().measureText(str) + (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)) * 2) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)) + C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)) <= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(264))) {
                if (!C670650QSh.LJ) {
                    C1619390sF7.LIZ("main_page_invisible");
                    return false;
                }
                if (((ICoinService) ServiceManager.get().getService(ICoinService.class)).LJIILJJIL()) {
                    return false;
                }
                return Hox.LLJILJIL.LIZ(this.LL).KQ2("HOME") || !((Boolean) C04SR.LIZ.getValue()).booleanValue();
            }
            C670650QSh.LIZIZ = new C670640QSg();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SearchHotTipsPopupTask text length is not available, text is ");
            sbLIZ.append(str);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        C1619390sF7.LIZ("length_unavailable");
        return false;
    }

    @Override // X.InterfaceC20660415sw
    public final C688120Qyw i2() {
        C19EG c19eg = this.LL;
        return new C688120Qyw(c19eg, c19eg, null);
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0153  */
    @Override // X.InterfaceC20659015si
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.C688120Qyw r19, final X.C20656615sK r20) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1619350sF3.LJFF(X.0Qyw, X.15sK):void");
    }

    public C1619350sF3(C19EG c19eg, View view, String str, InterfaceC1685420txc interfaceC1685420txc) {
        AFwS213S0000000_24 aFwS213S0000000_24 = AFwS213S0000000_24.get$arr$(503);
        this.LL = c19eg;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = aFwS213S0000000_24;
        this.LLILZIL = interfaceC1685420txc;
        this.LLIZ = 7006;
    }
}
