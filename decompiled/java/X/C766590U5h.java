package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.effect.BeautySwitchStatusChange;
import com.bytedance.android.live.effect.OnLiveEffectSelectedEvent;
import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautyDownloadOptSetting;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBeautySwitchSetting;
import com.bytedance.android.livesdk.model.EnhanceChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0U5h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C766590U5h extends AbstractC761520Tu2 {
    public final DataChannel LIZLLL;
    public final LiveSmallItemBeautyViewModel LJ;
    public final String LJFF;
    public final String LJI;
    public ConstraintLayout LJII;
    public LiveIconView LJIIIIZZ;
    public ImageView LJIIIZ;
    public boolean LJIIJ;
    public C21411818qq LJIIJJI;
    public C16F5 LJIIL;
    public View LJIILIIL;
    public final C766640U5m LJIILJJIL;
    public final Set<String> LJIILL;
    public final C01GW LJIILLIIL;
    public boolean LJIIZILJ;
    public AnonymousClass0956 LJIJ;
    public final C781710UlV LJIJI;

    @Override // X.AbstractC761520Tu2
    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        if (LiveBeautySwitchSetting.INSTANCE.inExperiment() && u.LJJIIJZLJL(this.LJI, "beauty", false) && this.LJIIZILJ && C500260Jjc.LJJIFFI(InterfaceC766480U4w.LJJIII.LIZIZ()) && this.LJIILJJIL.LLJIJIL > 0) {
            C0U7R c0u7r = C0U7R.LIZ;
            DataChannel dataChannel = this.LIZLLL;
            C0U7R.LJIILIIL = true;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_close");
            c474500IjALIZ.LJIJJLI(dataChannel);
            c474500IjALIZ.LJJII("null", "effect_id");
            c474500IjALIZ.LJJII("null", "beauty_type_name");
            c474500IjALIZ.LJJII("null", "tab_name");
            c474500IjALIZ.LJJII("null", "resource_id");
            c474500IjALIZ.LJJII(Boolean.valueOf(C0U7R.LJIIIIZZ()), "beauty_status");
            c474500IjALIZ.LJJII("1", "is_switch_to_off");
            c474500IjALIZ.LIZ();
        }
        C21411818qq c21411818qq = this.LJIIJJI;
        if (c21411818qq != null) {
            C786410Ut5.C7(c21411818qq, null);
        }
        this.LJIIJ = false;
        AnonymousClass0956 anonymousClass09562 = this.LJIJ;
        if (anonymousClass09562 != null && anonymousClass09562.isActive() && (anonymousClass0956 = this.LJIJ) != null) {
            C23118094a.LIZIZ("dialog close", null, anonymousClass0956);
        }
        this.LJIILJJIL.LLILLJJLI = null;
        C781710UlV c781710UlV = this.LJIJI;
        if (c781710UlV != null) {
            c781710UlV.LIZIZ();
        }
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZIZ() {
        LiveIconView liveIconView;
        LiveIconView liveIconView2;
        this.LJIIZILJ = InterfaceC766480U4w.LJJIII.LIZIZ().booleanValue();
        this.LJIJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LJ), null, null, new C766570U5f(this, null), 3);
        this.LJIILJJIL.notifyDataSetChanged();
        this.LJIILJJIL.LLILLJJLI = this.LIZIZ;
        if (!LiveBeautySwitchSetting.INSTANCE.isV1()) {
            C21411818qq c21411818qq = this.LJIIJJI;
            if (c21411818qq != null) {
                C786410Ut5.C7(c21411818qq, (CompoundButton.OnCheckedChangeListener) this.LJIILLIIL.getValue());
            }
            C21411818qq c21411818qq2 = this.LJIIJJI;
            if (c21411818qq2 == null || this.LJIIZILJ != c21411818qq2.isChecked()) {
                LJIIIIZZ(this.LJIIZILJ);
            }
        } else if ((this.LJIIZILJ && (liveIconView2 = this.LJIIIIZZ) != null && liveIconView2.getVisibility() == 4) || (!this.LJIIZILJ && (liveIconView = this.LJIIIIZZ) != null && liveIconView.getVisibility() == 0)) {
            LJIIIIZZ(this.LJIIZILJ);
        }
        C781710UlV c781710UlV = this.LJIJI;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        if (C500260Jjc.LJJJIL(this.LIZLLL)) {
            return;
        }
        for (LiveEffect liveEffect : (ArrayList) this.LJIILJJIL.LL) {
            C0U7R c0u7r = C0U7R.LIZ;
            C0U7R.LJI.put(liveEffect.getResourceId(), Boolean.valueOf(C766620U5k.LIZIZ(liveEffect, this.LIZLLL)));
        }
    }

    @Override // X.AbstractC761520Tu2
    public final void LIZLLL() {
        C1EOY.LIZ.LJI(this.LIZIZ);
        C781710UlV c781710UlV = this.LJIJI;
        if (c781710UlV != null) {
            c781710UlV.LIZJ(true);
        }
        if (C500260Jjc.LJJJIL(this.LIZLLL)) {
            return;
        }
        for (LiveEffect liveEffect : (ArrayList) this.LJIILJJIL.LL) {
            C0U7R c0u7r = C0U7R.LIZ;
            C0U7R.LJI.put(liveEffect.getResourceId(), Boolean.valueOf(C766620U5k.LIZIZ(liveEffect, this.LIZLLL)));
        }
    }

    public final void LJ() {
        LiveBeautySwitchSetting liveBeautySwitchSetting = LiveBeautySwitchSetting.INSTANCE;
        if (liveBeautySwitchSetting.inExperiment() && u.LJJIIJZLJL(this.LJI, "beauty", false) && C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJIIJ))) {
            this.LJIIJ = true;
            if (liveBeautySwitchSetting.isV1()) {
                C500260Jjc.LJIILIIL(this.LJIIIZ);
                return;
            }
            C21411818qq c21411818qq = this.LJIIJJI;
            if (c21411818qq != null) {
                c21411818qq.setLoading(false);
            }
            C21411818qq c21411818qq2 = this.LJIIJJI;
            if (c21411818qq2 != null) {
                c21411818qq2.setEnabled(true);
            }
        }
    }

    public final void LJFF() {
        DataChannel dataChannel;
        C946060aj6 c946060aj6LIZ;
        C946050aj5 c946050aj5LIZIZ;
        C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIII;
        c20337914i1.LJFF(Boolean.valueOf(!c20337914i1.LIZIZ().booleanValue()));
        InterfaceC766480U4w.LJJIIJ.LJFF(Boolean.TRUE);
        LJIIIIZZ(c20337914i1.LIZIZ().booleanValue());
        this.LJIILJJIL.LLLLLZIL(c20337914i1.LIZIZ().booleanValue());
        LJI(c20337914i1.LIZIZ().booleanValue());
        if (!c20337914i1.LIZIZ().booleanValue() || (dataChannel = this.LIZLLL) == null || (c946060aj6LIZ = C0URX.LIZ(dataChannel, EnhanceChannel.class)) == null || (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) == null) {
            return;
        }
        c946050aj5LIZIZ.LJ();
    }

    public final void LJI(boolean z) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_take_beauty_on_and_off");
        c474500IjALIZ.LJIJJLI(this.LIZLLL);
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "switch_to");
        c474500IjALIZ.LJJII("beauty", "tab_name");
        c474500IjALIZ.LIZ();
    }

    public final void LJII(boolean z) {
        int i;
        int i2;
        if (LiveBeautySwitchSetting.INSTANCE.isV1()) {
            LiveIconView liveIconView = this.LJIIIIZZ;
            if (liveIconView != null) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 4;
                }
                C786410Ut5.LLJJIJIL(liveIconView, i2);
            }
        } else {
            C21411818qq c21411818qq = this.LJIIJJI;
            if (c21411818qq != null) {
                c21411818qq.setChecked(z);
            }
        }
        C16F5 c16f5 = this.LJIIL;
        if (c16f5 != null) {
            if (z) {
                i = 2131852334;
            } else {
                i = 2131852331;
            }
            c16f5.setText(C497740JfY.LJIJI(i));
        }
    }

    public final void LJIIIIZZ(boolean z) {
        LJII(z);
        DataChannel dataChannel = this.LIZLLL;
        if (dataChannel != null) {
            dataChannel.LC0(BeautySwitchStatusChange.class, Boolean.valueOf(z));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C766590U5h(ViewGroup viewGroup, DataChannel dataChannel, LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, String str, String str2) {
        int i;
        ConstraintLayout constraintLayout;
        LiveBeautySwitchSetting liveBeautySwitchSetting = LiveBeautySwitchSetting.INSTANCE;
        if (liveBeautySwitchSetting.inExperiment() && u.LJJIIJZLJL(str2, "beauty", false)) {
            i = R.layout.h67;
        } else {
            i = R.layout.gf3;
        }
        super(i, viewGroup);
        this.LIZLLL = dataChannel;
        this.LJ = liveSmallItemBeautyViewModel;
        this.LJFF = str;
        this.LJI = str2;
        C766640U5m c766640U5m = new C766640U5m(dataChannel, str2);
        this.LJIILJJIL = c766640U5m;
        this.LJIILL = new LinkedHashSet();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 931));
        this.LJIILLIIL = c01gwLIZIZ;
        if (liveBeautySwitchSetting.inExperiment() && u.LJJIIJZLJL(str2, "beauty", false)) {
            C20337914i1<Boolean> c20337914i1 = InterfaceC766480U4w.LJJIII;
            this.LJIIZILJ = c20337914i1.LIZIZ().booleanValue();
            C500260Jjc.LLFFF(this.LIZ.findViewById(R.id.buu));
            if (liveBeautySwitchSetting.isV1()) {
                ConstraintLayout constraintLayout2 = (ConstraintLayout) this.LIZ.findViewById(R.id.buw);
                this.LJII = constraintLayout2;
                C500260Jjc.LLFFF(constraintLayout2);
                this.LJIIIIZZ = (LiveIconView) this.LIZ.findViewById(R.id.pnk);
                this.LJIIIZ = (ImageView) this.LIZ.findViewById(R.id.wul);
                if (C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJIIJ)) && !LiveBeautyDownloadOptSetting.INSTANCE.inExperiment()) {
                    C500260Jjc.LLFFF(this.LJIIIZ);
                }
            } else {
                C21411818qq c21411818qq = (C21411818qq) this.LIZ.findViewById(R.id.bux);
                this.LJIIJJI = c21411818qq;
                if (c21411818qq != null) {
                    C786410Ut5.C7(c21411818qq, (CompoundButton.OnCheckedChangeListener) c01gwLIZIZ.getValue());
                }
                C500260Jjc.LLFFF(this.LJIIJJI);
                if (C500260Jjc.LJJIFFI(Boolean.valueOf(this.LJIIJ))) {
                    C21411818qq c21411818qq2 = this.LJIIJJI;
                    if (c21411818qq2 != null) {
                        c21411818qq2.setLoading(true);
                    }
                    C21411818qq c21411818qq3 = this.LJIIJJI;
                    if (c21411818qq3 != null) {
                        c21411818qq3.setEnabled(false);
                    }
                }
            }
            this.LJIILIIL = this.LIZ.findViewById(R.id.btt);
            this.LJIIL = (C16F5) this.LIZ.findViewById(R.id.buy);
            LJII(c20337914i1.LIZIZ().booleanValue());
            C500260Jjc.LLFFF(this.LJIILIIL);
            C500260Jjc.LLFFF(this.LJIIL);
            C16F5 c16f5 = this.LJIIL;
            if (c16f5 != null) {
                c16f5.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
            if (liveBeautySwitchSetting.isV1() && (constraintLayout = this.LJII) != null) {
                C500260Jjc.LJLIIIL(500L, constraintLayout, new AwS591S0100000_12(this, 1130));
            }
        }
        c766640U5m.LLILZIL = new InterfaceC766680U5q() { // from class: X.0U5g
            @Override // X.InterfaceC766680U5q
            public final void LIZIZ() {
                this.LIZ.LJ();
            }

            @Override // X.InterfaceC766680U5q
            public final void LIZJ() {
                C0U4R c0u4r = new C0U4R();
                c0u4r.LIZLLL = 2131852333;
                c0u4r.LJFF = true;
                c0u4r.LJII = this.LIZ.LIZLLL;
                c0u4r.LIZJ = "ttlive_faceRetouchToggle_enhanceBeautifyPanel_faceRetouchOffToast";
                C766270U4b.LJIIJ(c0u4r);
            }

            @Override // X.InterfaceC766680U5q
            public final void LIZ(int i2, LiveEffect liveEffect) {
                C946060aj6 c946060aj6LIZ;
                C946050aj5 c946050aj5LIZIZ;
                DataChannel dataChannel2 = this.LIZ.LIZLLL;
                if (dataChannel2 != null) {
                    dataChannel2.LC0(OnLiveEffectSelectedEvent.class, liveEffect);
                }
                DataChannel dataChannel3 = this.LIZ.LIZLLL;
                if (dataChannel3 != null && (c946060aj6LIZ = C0URX.LIZ(dataChannel3, EnhanceChannel.class)) != null && (c946050aj5LIZIZ = c946060aj6LIZ.LIZIZ()) != null) {
                    c946050aj5LIZIZ.LJ();
                }
                if (LiveBeautySwitchSetting.INSTANCE.inExperiment()) {
                    C473410IhP.LIZIZ(RunnableC761200TtW.LL);
                }
            }
        };
        this.LIZIZ.setAdapter(c766640U5m);
        this.LIZIZ.setLayoutManager(this.LIZJ);
        this.LIZIZ.setItemAnimator(null);
        this.LIZIZ.setHasFixedSize(true);
        C1EOY.LIZ.LJI(this.LIZIZ);
        this.LJIJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(liveSmallItemBeautyViewModel), null, null, new C766570U5f(this, null), 3);
        this.LJIJI = new C781710UlV(0, 0.0d, this.LIZIZ, new AwS626S0100000_12(this, 66));
    }
}
