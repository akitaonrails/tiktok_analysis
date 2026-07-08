package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.android.live.liveinteract.multimatch.business.dialog.base.settingview.UpRightIconViewModel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS102S0110000_15;

/* JADX INFO: renamed from: X.0bZp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C978750bZp {
    public static final /* synthetic */ int LJJI = 0;
    public final Fragment LIZ;
    public ViewGroup LIZIZ;
    public C1324720kZq LIZJ;
    public C16F5 LIZLLL;
    public View LJ;
    public View LJFF;
    public View LJI;
    public LinearLayout LJII;
    public LinearLayout LJIIIIZZ;
    public C16F5 LJIIIZ;
    public View LJIIJ;
    public AnimatorSet LJIIJJI;
    public Function0<Unit> LJIIL;
    public InterfaceC963450bB9 LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ = true;
    public final InterfaceC975810bV5 LJIJI = C915980Zwa.LJI().LIZLLL();
    public final InterfaceC978510bZR LJIJJ = C915980Zwa.LJI().LJI();
    public UpRightIconViewModel LJIJJLI;
    public String LJIL;
    public Integer LJJ;

    public C978750bZp(Fragment fragment) {
        this.LIZ = fragment;
    }

    public final void LIZJ(boolean z) {
        InterfaceC973730bRj interfaceC973730bRjYf2;
        LiveData<GiftMode> liveDataLJI;
        Boolean boolValueOf;
        InterfaceC973730bRj interfaceC973730bRjYf22;
        boolean z2 = false;
        if (z) {
            InterfaceC973730bRj interfaceC973730bRjYf23 = C915980Zwa.LJFF().yf2(true);
            if (interfaceC973730bRjYf23 != null && interfaceC973730bRjYf23.q9() == 0) {
                InterfaceC973730bRj interfaceC973730bRjYf24 = C915980Zwa.LJFF().yf2(true);
                if (interfaceC973730bRjYf24 != null) {
                    boolValueOf = Boolean.valueOf(interfaceC973730bRjYf24.LJJIIJ());
                } else {
                    boolValueOf = null;
                }
                if (C500260Jjc.LJJIJIIJIL(boolValueOf) && (interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(true)) != null) {
                    interfaceC973730bRjYf22.LJJLIIIIJ(C973890bRz.LJII);
                }
            }
            interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(true);
        } else {
            interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        }
        if (interfaceC973730bRjYf2 != null) {
            interfaceC973730bRjYf2.LJIIZILJ(false);
        }
        if (C915980Zwa.LJFF().RY(z) == EnumC964170bCJ.INVITED) {
            z2 = true;
        }
        this.LJIILLIIL = z2;
        boolean zDw1 = C915980Zwa.LIZLLL().dw1();
        this.LJIIZILJ = zDw1;
        this.LJIJ = !zDw1;
        AnimatorSet animatorSet = this.LJIIJJI;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIIJJI;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        this.LJIIJJI = null;
        AwS102S0110000_15 awS102S0110000_15 = new AwS102S0110000_15(this, z, 2);
        if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
            this.LJIJJ.LJI().observe(this.LIZ, new C978760bZq(awS102S0110000_15));
            return;
        }
        InterfaceC975810bV5 interfaceC975810bV5 = this.LJIJI;
        if (interfaceC975810bV5 == null || (liveDataLJI = interfaceC975810bV5.LJI()) == null) {
            return;
        }
        liveDataLJI.observe(this.LIZ, new C978760bZq(awS102S0110000_15));
    }

    public final void LJ(float f) {
        View view = this.LJI;
        if (view != null) {
            C786410Ut5.T4(view, f);
        }
        C16F5 c16f5 = this.LIZLLL;
        if (c16f5 != null) {
            C786410Ut5.k5(c16f5, f);
        }
        C1324720kZq c1324720kZq = this.LIZJ;
        if (c1324720kZq != null) {
            C786410Ut5.h5(c1324720kZq, f);
        }
        C16F5 c16f52 = this.LJIIIZ;
        if (c16f52 != null) {
            C786410Ut5.k5(c16f52, f);
        }
        View view2 = this.LJIIJ;
        if (view2 != null) {
            C786410Ut5.T4(view2, f);
        }
    }

    public static void LIZLLL(boolean z, InterfaceC963450bB9 interfaceC963450bB9) {
        if (interfaceC963450bB9 != null) {
            interfaceC963450bB9.Rn(EnumC977660bY4.TYPE_MATCH_GIFT_SELECT, C979970bbn.LIZ(z));
        }
    }

    public final void LIZ(View view, InterfaceC963450bB9 interfaceC963450bB9, Function0<Unit> function0) {
        this.LIZIZ = (ViewGroup) view.findViewById(R.id.iyt);
        this.LIZJ = (C1324720kZq) view.findViewById(R.id.iy1);
        this.LIZLLL = (C16F5) view.findViewById(R.id.iyo);
        this.LJ = view.findViewById(R.id.iyu);
        this.LJI = view.findViewById(R.id.j09);
        this.LJII = (LinearLayout) view.findViewById(R.id.ndi);
        this.LJIIIIZZ = (LinearLayout) view.findViewById(R.id.nfp);
        this.LJIIIZ = (C16F5) view.findViewById(R.id.p6s);
        this.LJIIJ = view.findViewById(R.id.p6r);
        this.LJFF = view;
        this.LJIILL = true;
        this.LJIILIIL = interfaceC963450bB9;
        this.LJIIL = function0;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findView isShowSelectAnimator = ");
        sbLIZ.append(this.LJIILL);
        C20441214yg.LJIIIZ("GiftOnlySelectUtils", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(boolean r18, com.bytedance.android.livesdk.model.message.common.Text r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C978750bZp.LJFF(boolean, com.bytedance.android.livesdk.model.message.common.Text, boolean):void");
    }

    public final ComposeView LIZIZ(DataChannel dataChannel, boolean z, InterfaceC963450bB9 interfaceC963450bB9, boolean z2) {
        Context context = this.LIZ.getContext();
        LifecycleOwner viewLifecycleOwner = this.LIZ.getViewLifecycleOwner();
        if (context == null) {
            return null;
        }
        ComposeView composeView = new ComposeView(context, null, 6);
        C20174413wk.LIZIZ(composeView, new C19719212De(1380841931, new C980370bcR(viewLifecycleOwner, interfaceC963450bB9, this, dataChannel, z2, z), true));
        return composeView;
    }
}
