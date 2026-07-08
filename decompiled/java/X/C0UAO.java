package X;

import Y.ACListenerS116S0200000_12;
import Y.ACListenerS147S0100000_12;
import Y.ARunnableS23S0101000_12;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.DialogFragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelKt;
import androidx.viewpager.widget.ViewPager;
import avg.f;
import com.bytedance.android.live.base.model.UrlModel;
import com.bytedance.android.live.effect.StickerSearchDialogEvent;
import com.bytedance.android.live.effect.TrendingPanelStickerChannel;
import com.bytedance.android.live.effect.api.StickerPanelHideEvent;
import com.bytedance.android.live.effect.api.StickerPanelShowEvent;
import com.bytedance.android.live.effect.model.LiveEffectAdaptiveChannel;
import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.dataChannel.GreenScreenCreatorBlockChannel;
import com.bytedance.android.livesdk.dataChannel.LiveDialogStatusChannel;
import com.bytedance.android.livesdk.dataChannel.StickerCancelChannel;
import com.bytedance.android.livesdk.dataChannel.StickerHintShowChannel;
import com.bytedance.android.livesdk.livesetting.effect.LiveEffectStructureOptSetting;
import com.bytedance.android.livesdk.model.SharedEffect;
import com.bytedance.android.livesdk.model.StickerEffectChannel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.AwS626S0100000_12;
import kotlin.jvm.internal.Intrinsics;
import mf.a;

/* JADX INFO: renamed from: X.0UAO, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UAO implements C0U5V, View.OnLayoutChangeListener {
    public final DataChannel LL;
    public final View LLILLJJLI;
    public final C0UAV LLILLL;
    public C0UDG LLILZ;
    public final C19YU LLILZIL;
    public final ViewPager LLILZLL;
    public final View LLIZ;
    public final View LLIZLLLIL;
    public C1888650zFP LLJ;
    public final StickerEffectViewModel LLJI;
    public final C0UAP LLJIJIL;
    public final ViewGroup LLJILJIL;
    public final C0UBC LLJILJILJ;
    public final List<C0UBH> LLJILLL;
    public final List<C0UBH> LLJJ;
    public InterfaceC767730U9r LLJJI;
    public LiveEffect LLJJIII;
    public int LLJJIJI;
    public long LLJJIJIIJIL;
    public int LLJJIJIL;
    public boolean LLJJJ;
    public boolean LLJJJIL;
    public final C0UAZ LLJJJJ;
    public C0UBI LLJJJJJIL;
    public LiveEffect LLJJJJLIIL;
    public Map<String, String> LLJJL;

    @Override // X.C0U5V
    public final void LIZIZ() {
        C946050aj5 c946050aj5LIZIZ;
        this.LLJJJ = false;
        this.LLJJIJIL = this.LLILZIL.getSelectedTabPosition();
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJJIIJ(SystemClock.elapsedRealtime() - this.LLJJIJIIJIL, this.LL, this.LLJIJIL.getCount() > 0, false, false, "close");
        C767780U9w c767780U9w = C767780U9w.LIZ;
        C0UBI c0ubi = this.LLJJJJJIL;
        if (c0ubi != null) {
            C767780U9w.LIZJ.remove(c0ubi);
        }
        this.LLJIJIL.LJJIJLIJ();
        UrlModel urlModel = LiveEffect.LIZLLL;
        LiveEffect liveEffect = this.LLJJJJLIIL;
        C767630U9h c767630U9h = C767630U9h.LL;
        C767640U9i c767640U9iP71 = c767630U9h.p71("");
        if (C0UCX.LIZ(liveEffect, c767640U9iP71 != null ? c767640U9iP71.LIZ : null)) {
            c767630U9h.EN2("");
        }
        LiveEffect liveEffect2 = C0U9D.LIZ;
        if (liveEffect2 != null && InterfaceC766480U4w.LJJIJ.LIZIZ().contains(liveEffect2.getResourceId())) {
            C0U9D.LIZJ();
        }
        C0UAS.LIZIZ = null;
        C0UAY c0uay = C0UAS.LIZJ;
        if (c0uay != null) {
            C0UA1.LIZ().tr(c0uay);
        }
        C0UAS.LIZJ = null;
        InterfaceC767730U9r interfaceC767730U9r = this.LLJJI;
        if (interfaceC767730U9r != null) {
            interfaceC767730U9r.LJ(C0UD4.LIZIZ);
        }
        if (C500260Jjc.LJJIJLIJ()) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LJ(C13LE.LIZ(StickerHintShowChannel.class));
        } else {
            this.LL.LC0(StickerPanelHideEvent.class, this.LLJJI);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("shouldClearCache: ");
        LiveEffectStructureOptSetting liveEffectStructureOptSetting = LiveEffectStructureOptSetting.INSTANCE;
        sbLIZ.append(liveEffectStructureOptSetting.shouldClearCache());
        C20441214yg.LIZIZ("LiveStickerDialogView", C2188811AlT.LIZIZ(sbLIZ));
        if (liveEffectStructureOptSetting.shouldClearCache()) {
            this.LLJI.LLILZ.clearCache();
        }
        C0UC4.LIZIZ = "normal_icon";
        this.LLJJIJI = 0;
        this.LLILLJJLI.removeOnLayoutChangeListener(this);
        this.LL.zW(LiveDialogStatusChannel.class, new C770910ULx(false, 0, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.STICKER_EFFECT_PANEL));
        C946060aj6 c946060aj6 = (C946060aj6) this.LL.gg0(StickerEffectChannel.class);
        if (c946060aj6 == null || (c946050aj5LIZIZ = c946060aj6.LIZIZ()) == null) {
            return;
        }
        c946050aj5LIZIZ.LIZIZ(1);
    }

    @Override // X.C0U5V
    public final boolean LIZJ() {
        return false;
    }

    public final void LJIIIIZZ() {
        ((ArrayList) this.LLJILLL).clear();
        ((ArrayList) this.LLJILLL).addAll(this.LLJI.LQ2());
        ((ArrayList) this.LLJILLL).addAll(this.LLJJ);
    }

    @Override // X.C0U5V
    public final void onDialogBackground() {
        this.LLJIJIL.LJJIJL();
    }

    @Override // X.C0U5V
    public final void onDialogForeground() {
        this.LLJIJIL.LJJIL();
    }

    @Override // X.C0U5V
    public final View getView() {
        return this.LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [X.0UBI, java.lang.Object] */
    @Override // X.C0U5V
    public final void LIZLLL(DialogFragment dialogFragment) {
        String str;
        LiveEffect liveEffect;
        String str2;
        boolean zLLIILII;
        String str3;
        String str4;
        String str5;
        C946050aj5 c946050aj5LIZIZ;
        int i;
        String strLJLL;
        this.LLJJJ = true;
        this.LL.EQ2(dialogFragment, LiveEffectAdaptiveChannel.class, new AwS591S0100000_12(this, 102));
        this.LLJJIII = (LiveEffect) C13LP.LJJJLL(C0UA1.LIZ().qr(C0UD4.LIZIZ));
        Iterator it2 = ((ArrayList) this.LLJILLL).iterator();
        int i2 = 0;
        while (true) {
            if (it2.hasNext()) {
                String str6 = ((C0UBH) it2.next()).LIZIZ;
                LiveEffect liveEffect2 = this.LLJJIII;
                if (liveEffect2 == null || (strLJLL = liveEffect2.LJLL()) == null) {
                    strLJLL = "";
                }
                if (Intrinsics.LJFF(str6, strLJLL)) {
                    break;
                } else {
                    i2++;
                }
            } else {
                i2 = -1;
                break;
            }
        }
        this.LLJJIJIL = i2;
        C0UAV.LIZIZ(this.LLILLL, this.LLJJIII, C13LP.LJJJJ(this.LLJJIII, this.LLJI.LLILZ.LJJJ().LIZIZ), false, 12);
        boolean z = this.LLJJJIL;
        C767860UAe.LJIL = z;
        if (z && (i = this.LLJJIJIL) >= 0) {
            C473410IhP.LIZJ(new ARunnableS23S0101000_12(i, this, 12), 200L);
        }
        C946060aj6 c946060aj6 = (C946060aj6) this.LL.gg0(StickerEffectChannel.class);
        if (c946060aj6 != null) {
            str = c946060aj6.LIZIZ;
        } else {
            str = null;
        }
        if (C937280aUw.LIZ(str) && this.LLJJIII == null) {
            Iterator it3 = ((ArrayList) this.LLJILLL).iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (!((C0UBH) it3.next()).LIZJ) {
                    if (i3 >= 0) {
                        C473410IhP.LIZJ(new ARunnableS23S0101000_12(i3, this, 12), 200L);
                    }
                } else {
                    i3++;
                }
            }
        }
        this.LLJJJIL = false;
        C767640U9i c767640U9iP71 = C767630U9h.LL.p71("");
        if (c767640U9iP71 != null) {
            liveEffect = c767640U9iP71.LIZ;
        } else {
            liveEffect = null;
        }
        this.LLJJJJLIIL = liveEffect;
        if (liveEffect == null) {
            str2 = "normal_icon";
        } else {
            str2 = "special_icon";
        }
        C0UC4.LIZIZ = str2;
        if (liveEffect != null) {
            zLLIILII = liveEffect.LLIILII();
        } else {
            zLLIILII = false;
        }
        C0UC4.LJIIJ = zLLIILII;
        this.LLJJIJIIJIL = SystemClock.elapsedRealtime();
        this.LLILLJJLI.addOnLayoutChangeListener(this);
        InterfaceC767730U9r interfaceC767730U9r = this.LLJJI;
        if (interfaceC767730U9r != null) {
            interfaceC767730U9r.LJIIJJI(C0UD4.LIZIZ);
        }
        if (C500260Jjc.LJJIJLIJ()) {
            C770220UJg c770220UJg = C770220UJg.LIZ;
            C770220UJg.LIZLLL(C13LE.LIZ(StickerHintShowChannel.class));
        } else {
            this.LL.FQ2(StickerPanelShowEvent.class);
        }
        if (this.LLJJJJLIIL != null) {
            this.LLJIJIL.notifyDataSetChanged();
        }
        InterfaceC767730U9r interfaceC767730U9r2 = this.LLJJI;
        if (interfaceC767730U9r2 != null) {
            interfaceC767730U9r2.LJIILL(this.LLJILJIL);
        }
        Iterator it4 = ((ArrayList) this.LLJIJIL.LLJILJIL).iterator();
        while (it4.hasNext()) {
            ((AbstractC767840UAc) it4.next()).LJFF();
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LLJI), null, null, new C404001he(this, null), 3);
        C0UAV c0uav = this.LLILLL;
        c0uav.getClass();
        if (C13LP.LJJJLL(C0UA1.LIZ().LJ(C0UD4.LIZIZ)) == null) {
            C786410Ut5.LLJJLIIIJLLLLLLLZ(c0uav, 8);
        } else {
            C786410Ut5.LLJJLIIIJLLLLLLLZ(c0uav, 0);
        }
        this.LLILZ = (C0UDG) this.LLILLJJLI.findViewById(R.id.gvj);
        ?? r1 = new C0UA7() { // from class: X.0UBI
            @Override // X.C0UA7
            public final void LIZ(LiveEffect liveEffect3) {
                C0UAO.LJIIIZ(this.LIZ, liveEffect3, null, 2);
            }

            @Override // X.C0UA7
            public final void LIZIZ(LiveEffect liveEffect3) {
                C0UAO.LJIIIZ(this.LIZ, null, liveEffect3, 1);
            }
        };
        this.LLJJJJJIL = r1;
        C767780U9w.LIZJ.add((C0UA7) r1);
        C0UDG c0udg = this.LLILZ;
        if (c0udg != null) {
            c0udg.setClickListener(new AwS556S0100000_12(this, 721));
        }
        this.LLJIJIL.LJJJ();
        C0UDG c0udg2 = this.LLILZ;
        if (c0udg2 != null) {
            c0udg2.LIZIZ(this.LLJJIII);
        }
        C946060aj6 c946060aj62 = (C946060aj6) this.LL.gg0(StickerEffectChannel.class);
        if (c946060aj62 != null && (c946050aj5LIZIZ = c946060aj62.LIZIZ()) != null) {
            c946050aj5LIZIZ.LJFF(0);
        }
        Map<String, String> map = this.LLJJL;
        if (map != null && (str3 = map.get("tab_key")) != null && C500260Jjc.LJJIIZ(str3)) {
            List<C0UBH> list = this.LLJILLL;
            if ((list instanceof Collection) && ((ArrayList) list).isEmpty()) {
                return;
            }
            Iterator it5 = ((ArrayList) list).iterator();
            while (it5.hasNext()) {
                String lowerCase = ((C0UBH) it5.next()).LIZIZ.toLowerCase(Locale.ENGLISH);
                Map<String, String> map2 = this.LLJJL;
                if (map2 != null) {
                    str4 = map2.get("tab_key");
                } else {
                    str4 = null;
                }
                if (Intrinsics.LJFF(lowerCase, str4)) {
                    C0UBC c0ubc = this.LLJILJILJ;
                    Map<String, String> map3 = this.LLJJL;
                    if (map3 == null || (str5 = map3.get("tab_key")) == null) {
                        str5 = "trending";
                    }
                    c0ubc.LIZ(str5);
                    return;
                }
            }
        }
    }

    public final void LJFF(LiveEffect liveEffect) {
        Boolean boolValueOf;
        if (liveEffect != null) {
            boolValueOf = Boolean.valueOf(C767250U7v.LJ(liveEffect));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LiveEffect liveEffect2 = (LiveEffect) DataChannelGlobal.LLILZ.gg0(C931050aKt.class);
            if (liveEffect != null && liveEffect2 != null && Intrinsics.LJFF(liveEffect.LLILII(), liveEffect2.getResourceId())) {
                liveEffect = liveEffect2;
            }
        }
        C0UAV.LIZIZ(this.LLILLL, liveEffect, C13LP.LJJJJ(liveEffect, this.LLJI.LLILZ.LJJJ().LIZIZ), false, 12);
    }

    public final void LJI(boolean z) {
        this.LLJJJ = false;
        this.LLJJI = null;
        C767780U9w c767780U9w = C767780U9w.LIZ;
        C0UBI c0ubi = this.LLJJJJJIL;
        if (c0ubi != null) {
            C767780U9w.LIZJ.remove(c0ubi);
        }
        InterfaceC767730U9r interfaceC767730U9r = this.LLJJI;
        if (interfaceC767730U9r != null) {
            interfaceC767730U9r.onDestroy();
        }
        C500260Jjc.LJJJI(null);
        C0U9D.LIZJ();
        C0UAP c0uap = this.LLJIJIL;
        for (AbstractC767840UAc abstractC767840UAc : (ArrayList) c0uap.LLJILJIL) {
            abstractC767840UAc.LIZJ();
            abstractC767840UAc.LIZJ.LLLZLL();
        }
        ((ArrayList) c0uap.LLJILJIL).clear();
        C767980UAq c767980UAq = c0uap.LLJ;
        if (c767980UAq != null) {
            c767980UAq.LIZJ.LLLZLL();
        }
        C767940UAm c767940UAm = c0uap.LLJIJIL;
        if (c767940UAm != null) {
            c767940UAm.LIZJ.LLLZLL();
        }
        C767850UAd c767850UAd = c0uap.LLJI;
        if (c767850UAd != null) {
            c767850UAd.LIZJ.LLLZLL();
        }
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [X.0UA6, X.0UAZ] */
    public C0UAO(Context context, DataChannel dataChannel) {
        this.LL = dataChannel;
        View viewSd = C786410Ut5.Sd(R.layout.ged, C786410Ut5.ne(context), null);
        this.LLILLJJLI = viewSd;
        final C0UAV c0uav = (C0UAV) viewSd.findViewById(R.id.hqx);
        this.LLILLL = c0uav;
        C19YU c19yu = (C19YU) viewSd.findViewById(R.id.wz1);
        this.LLILZIL = c19yu;
        ViewPager viewPager = (ViewPager) viewSd.findViewById(R.id.w6p);
        this.LLILZLL = viewPager;
        View viewFindViewById = viewSd.findViewById(R.id.w7d);
        this.LLIZ = viewFindViewById;
        View viewFindViewById2 = viewSd.findViewById(R.id.w4y);
        this.LLIZLLLIL = viewFindViewById2;
        StickerEffectViewModel stickerEffectViewModelLIZ = C0U60.LIZ();
        C767620U9g c767620U9g = (C767620U9g) dataChannel.gg0(LiveEffectAdaptiveChannel.class);
        if (c767620U9g != null) {
            int i = c767620U9g.LIZ;
            stickerEffectViewModelLIZ.LLJJ.getClass();
            C767760U9u.LIZJ = i;
        }
        this.LLJI = stickerEffectViewModelLIZ;
        C0UAP c0uap = new C0UAP(dataChannel, C0UD4.LIZIZ, C0UA1.LIZ(), stickerEffectViewModelLIZ);
        this.LLJIJIL = c0uap;
        this.LLJILJIL = (ViewGroup) viewSd.findViewById(R.id.view_stub);
        C0UBC c0ubc = new C0UBC(c19yu, viewPager, -1);
        this.LLJILJILJ = c0ubc;
        this.LLJILLL = new ArrayList();
        this.LLJJ = new ArrayList();
        this.LLJJIJIL = -1;
        ?? r6 = new C0UA6() { // from class: X.0UAZ
            @Override // X.C0UA6
            public final void LIZ(LiveEffect liveEffect, LiveEffect liveEffect2) {
                this.LIZ.LLJJIII = liveEffect2;
                this.LIZ.LJII(liveEffect, liveEffect2);
            }
        };
        this.LLJJJJ = r6;
        LinearLayout.inflate(c0uav.getContext(), R.layout.ge_, c0uav);
        if (C768880UEc.LIZ()) {
            c0uav.getMIconIV().setImageResource(R.drawable.efn);
        }
        View.OnClickListener aCListenerS116S0200000_12 = new ACListenerS116S0200000_12(c0uav, dataChannel, 47);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS116S0200000_12) : aCListenerS116S0200000_12);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c0uav);
        }
        c0uav.setOnClickListener(aVar);
        c0uav.getMIconIV().setOnStateChangeListener(new InterfaceC20588415hK() { // from class: X.0UAU
            @Override // X.InterfaceC20588415hK
            public final void LIZ() {
                C0UBJ favoriteStatusListener;
                if (!c0uav.getNeedCallback() || (favoriteStatusListener = c0uav.getFavoriteStatusListener()) == null) {
                    return;
                }
                C0UAV c0uav2 = c0uav;
                favoriteStatusListener.LIZ(c0uav2.LLILZLL, c0uav2.LLILZIL);
            }

            @Override // X.InterfaceC20588415hK
            public final void onStateChange(int i2) {
                String strLJIJI;
                if (i2 == 1) {
                    c0uav.getMIconIV().setSelected(c0uav.LLILZIL);
                    C0UAV c0uav2 = c0uav;
                    if (c0uav2.LLILZIL) {
                        strLJIJI = C497740JfY.LJIJI(2131823290);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131824461);
                    }
                    c0uav2.setContentDescription(strLJIJI);
                }
            }
        });
        dataChannel.BQ2(dataChannel.LLILZ, StickerCancelChannel.class, new AwS591S0100000_12(c0uav, 727));
        dataChannel.EQ2(dataChannel.LLILZ, GreenScreenCreatorBlockChannel.class, new AwS591S0100000_12(c0uav, 728));
        C444140HbI.LIZ(c0uav, new AwS626S0100000_12(c0uav, 41));
        c0uav.setShowEnable(true);
        C500260Jjc.LJIILIIL(c0uav);
        c0uav.setFavoriteStatusListener(new C0UBJ() { // from class: X.0Ts0
            @Override // X.C0UBJ
            public final void LIZ(LiveEffect liveEffect, boolean z) {
                String str;
                Long lValueOf;
                String resourceId;
                String strLJLL;
                String value;
                String searchId;
                int source;
                Integer numLJJIJL;
                C0U6H c0u6hLJZI;
                this.LIZ.LL.SX0(C760250Trz.class, "icon");
                Integer numValueOf = null;
                if (liveEffect != null) {
                    C0UAO c0uao = this.LIZ;
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c0uao.LLJI), null, null, new C403901hd(c0uao, liveEffect, z, null), 3);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_favorite_click");
                c474500IjALIZ.LJIJJLI(this.LIZ.LL);
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C931040aKs.class), "enter_from");
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930950aKj.class), "banner_id");
                c474500IjALIZ.LJJII(dataChannelGlobal.gg0(C930960aKk.class), "banner_from");
                if (z) {
                    str = "favorite";
                } else {
                    str = "cancel_favorite";
                }
                c474500IjALIZ.LJJII(str, "click_type");
                if (liveEffect != null) {
                    lValueOf = Long.valueOf(liveEffect.getEffectId());
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "sticker_id");
                if (liveEffect != null) {
                    resourceId = liveEffect.getResourceId();
                } else {
                    resourceId = null;
                }
                c474500IjALIZ.LJJII(resourceId, "resource_id");
                if (liveEffect != null) {
                    strLJLL = liveEffect.LJLL();
                } else {
                    strLJLL = null;
                }
                c474500IjALIZ.LJJII(strLJLL, "tab");
                if (liveEffect != null && (c0u6hLJZI = liveEffect.LJZI()) != null) {
                    value = c0u6hLJZI.getValue();
                } else {
                    value = null;
                }
                c474500IjALIZ.LJJII(value, "search_result_type");
                if (liveEffect != null) {
                    searchId = liveEffect.getSearchId();
                } else {
                    searchId = null;
                }
                c474500IjALIZ.LJJII(searchId, "search_id");
                if (liveEffect != null && (numLJJIJL = liveEffect.LJJIJL()) != null) {
                    numValueOf = Integer.valueOf(numLJJIJL.intValue() + 1);
                }
                c474500IjALIZ.LJJII(String.valueOf(numValueOf), "impr_position");
                c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0U7C.LJIILLIIL(liveEffect))) ? 1 : 0), "is_avatar");
                c474500IjALIZ.LJJII(String.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C767250U7v.LIZLLL(liveEffect))) ? 1 : 0), "is_group_sticker");
                c474500IjALIZ.LJJII(Integer.valueOf(C0UC4.LJIILLIIL ? 1 : 0), "is_new_anchor_guide");
                if (liveEffect != null) {
                    source = liveEffect.getSource();
                } else {
                    source = 0;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(source), "source");
                c474500IjALIZ.LJJII("icon", "method");
                c474500IjALIZ.LJJIJL();
            }
        });
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(stickerEffectViewModelLIZ), null, null, new C404101hf(this, null), 3);
        viewSd.findViewById(R.id.w4y).getBackground().setAlpha(255);
        C786410Ut5.I7(new ACListenerS147S0100000_12(this, 58), viewSd.findViewById(R.id.cko));
        C500260Jjc.LJIILIIL(viewFindViewById2);
        C500260Jjc.LLFFF(viewFindViewById);
        viewFindViewById.setBackgroundResource(R.drawable.ef4);
        viewPager.setBackgroundResource(R.drawable.ef2);
        c0uav.LIZJ();
        C0UDG c0udg = this.LLILZ;
        if (c0udg != null) {
            c0udg.LLILZLL.setBackgroundResource(R.drawable.ef3);
        }
        c0uap.LLIZ = r6;
        C0UBQ c0ubq = C0UBQ.LIZ;
        C0UBQ.LIZLLL = new WeakReference<>(this.LLJJJJ);
        C0UFI c0ufi = C0UFI.LIZ;
        new WeakReference(this.LLJJJJ);
        C0UA4.LIZ = new WeakReference<>(this.LLJJJJ);
        viewPager.setAdapter(c0uap);
        viewPager.setOffscreenPageLimit(1);
        this.LLILZIL.LJIILLIIL(this.LLILZLL, false, false);
        c19yu.LIZIZ(new InterfaceC1883670z7N() { // from class: X.0UAQ
            @Override // X.InterfaceC1883670z7N
            public final void LIZ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZJ(C1888650zFP c1888650zFP) {
            }

            @Override // X.InterfaceC1883670z7N
            public final void LIZIZ(C1888650zFP c1888650zFP, boolean z, boolean z2) {
                Object obj;
                C0UBH c0ubh;
                String str;
                int i2;
                String str2;
                String str3;
                C0UAO c0uao = this.LIZ;
                c0uao.LLJ = c1888650zFP;
                LiveEffect liveEffect = null;
                if (c1888650zFP != null) {
                    obj = c1888650zFP.LIZ;
                } else {
                    obj = null;
                }
                if (obj instanceof C0UBH) {
                    c0ubh = (C0UBH) obj;
                } else {
                    c0ubh = null;
                }
                InterfaceC767730U9r interfaceC767730U9r = c0uao.LLJJI;
                if (interfaceC767730U9r != null) {
                    if (c0ubh != null) {
                        str2 = c0ubh.LIZ;
                        str3 = c0ubh.LIZIZ;
                    } else {
                        str2 = null;
                        str3 = null;
                    }
                    interfaceC767730U9r.LJIIZILJ(str2, str3);
                }
                if (c0ubh != null) {
                    str = c0ubh.LIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "search")) {
                    C0UAO c0uao2 = this.LIZ;
                    C767830UAb c767830UAb = c0uao2.LLJI.LLJILLL;
                    List<LiveEffect> listQr = C0UA1.LIZ().qr(C0UD4.LIZIZ);
                    if (listQr != null) {
                        liveEffect = (LiveEffect) C13LP.LJJJLL(listQr);
                    }
                    c767830UAb.LIZLLL = liveEffect;
                    if (c767830UAb.LIZJ.isEmpty()) {
                        List<LiveEffect> arrayList = (List) c0uao2.LL.gg0(TrendingPanelStickerChannel.class);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        c767830UAb.LIZJ = arrayList;
                    }
                    if (z2) {
                        this.LIZ.LL.LC0(StickerSearchDialogEvent.class, Boolean.TRUE);
                    }
                }
                C0UAP c0uap2 = this.LIZ.LLJIJIL;
                if (c1888650zFP != null) {
                    i2 = c1888650zFP.LIZLLL;
                } else {
                    i2 = 0;
                }
                c0uap2.LJJIZ(i2);
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(stickerEffectViewModelLIZ.LQ2());
        arrayList.add(new C0UBH(C497740JfY.LJIJI(2131841513), "", true));
        c0uap.setData(arrayList);
        c0ubc.LIZJ = stickerEffectViewModelLIZ.LQ2().size();
        c0ubc.LIZIZ(arrayList);
        InterfaceC766480U4w.LJJIIJZLJL.LJFF(Boolean.TRUE);
        C500260Jjc.LJLL(0, (int) C497740JfY.LIZIZ(262.0f), viewPager);
        C0UC4 c0uc4 = C0UC4.LIZ;
        C0UC4.LJJI = this.LLJJL;
    }

    public final void LJII(LiveEffect liveEffect, LiveEffect liveEffect2) {
        C946050aj5 c946050aj5LIZIZ;
        String resourceId;
        LifecycleOwner lifecycleOwner;
        if (this.LLJJI != null) {
            if (liveEffect2 != null) {
                C767720U9q logParams = liveEffect2.getLogParams();
                if (logParams != null) {
                    logParams.LIZJ = false;
                }
                C0U8F c0u8f = C0U8F.LIZ;
                LiveEffect liveEffectLIZJ = C0U8F.LIZJ(liveEffect2);
                liveEffectLIZJ.getLogParams().LIZJ = false;
                C0UC4 c0uc4 = C0UC4.LIZ;
                DataChannel dataChannel = this.LL;
                String str = C0UD4.LIZIZ;
                C0UC4.LJJIII(dataChannel, false, liveEffectLIZJ, str);
                if (C767250U7v.LIZLLL(liveEffect)) {
                    C20441214yg.LIZIZ("EffectMonitor#ComposerRemove", "");
                    C0UA1.LIZ().lr(str);
                }
                InterfaceC767730U9r interfaceC767730U9r = this.LLJJI;
                if (interfaceC767730U9r != null) {
                    interfaceC767730U9r.LJIIL(liveEffectLIZJ);
                }
                if (!C767250U7v.LIZLLL(liveEffect2)) {
                    C20441214yg.LIZIZ("EffectMonitor#ComposerReplace", "");
                    C0UA1.LIZ().Gr(str, liveEffect, liveEffectLIZJ);
                }
                InterfaceC767730U9r interfaceC767730U9r2 = this.LLJJI;
                if (interfaceC767730U9r2 != null) {
                    interfaceC767730U9r2.LJFF(liveEffectLIZJ);
                }
            } else if (liveEffect != null) {
                C0UA1.LIZ().lr(C0UD4.LIZIZ);
                InterfaceC767730U9r interfaceC767730U9r3 = this.LLJJI;
                if (interfaceC767730U9r3 != null) {
                    interfaceC767730U9r3.LJIILJJIL(liveEffect);
                }
            }
            C0UDG c0udg = this.LLILZ;
            if (c0udg != null) {
                c0udg.LIZIZ(liveEffect2);
            }
        }
        this.LLJIJIL.LJJJ();
        LJFF(liveEffect2);
        if (liveEffect2 != null && !Intrinsics.LJFF(liveEffect2.LJLL(), "Recents")) {
            C0UBC c0ubc = this.LLJILJILJ;
            c0ubc.getClass();
            DataChannel dataChannelLJIIIZ = C782710Un7.LJIIIZ(C782710Un7.LIZ);
            if (dataChannelLJIIIZ != null && (lifecycleOwner = dataChannelLJIIIZ.LLILZ) != null) {
                RedDotExtensionKt.LJI(null, lifecycleOwner, null, C0UX6.LIVE_EFFECT_RECENT_TAB, new AwS591S0100000_12(c0ubc, 726));
            }
        }
        C946060aj6 c946060aj6 = (C946060aj6) this.LL.gg0(StickerEffectChannel.class);
        if (c946060aj6 != null && (c946050aj5LIZIZ = c946060aj6.LIZIZ()) != null) {
            if (liveEffect2 == null || (resourceId = liveEffect2.getResourceId()) == null) {
                resourceId = "";
            }
            c946050aj5LIZIZ.LIZ(new SharedEffect(resourceId, "", liveEffect2));
        }
    }

    public static void LJIIIZ(C0UAO c0uao, LiveEffect liveEffect, LiveEffect liveEffect2, int i) {
        if ((i & 1) != 0) {
            liveEffect = null;
        }
        if ((i & 2) != 0) {
            liveEffect2 = null;
        }
        c0uao.LJII(liveEffect, liveEffect2);
        C0UAP c0uap = c0uao.LLJIJIL;
        int i2 = 0;
        if (liveEffect == null) {
            c0uap.getClass();
        } else {
            AbstractC767840UAc abstractC767840UAc = c0uap.LLJILJILJ;
            if (abstractC767840UAc != null) {
                Iterator it2 = ((ArrayList) abstractC767840UAc.LIZJ.LL).iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (Intrinsics.LJFF(it2.next(), liveEffect)) {
                        if (i3 >= 0) {
                            ArrayList arrayList = new ArrayList();
                            arrayList.addAll(abstractC767840UAc.LIZJ.LL);
                            ListProtector.remove(arrayList, i3);
                            C0U9D.LIZJ();
                            abstractC767840UAc.LIZJ.LLLLLLLZIL(arrayList);
                            C21341918fZ c21341918fZLIZ = C21342318fd.LIZ(new C766240U3y(abstractC767840UAc.LIZJ.LL, arrayList), true);
                            ListProtector.remove(abstractC767840UAc.LIZJ.LL, i3);
                            c21341918fZLIZ.LIZJ(abstractC767840UAc.LIZJ);
                        }
                    } else {
                        i3++;
                    }
                }
            }
        }
        if (liveEffect2 != null) {
            List<C0UBH> list = c0uao.LLJILLL;
            C1888650zFP c1888650zFP = c0uao.LLJ;
            if (c1888650zFP != null) {
                i2 = c1888650zFP.LIZLLL;
            }
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(c0uao.LLJI), null, null, new C403801hc(c0uao, ((C0UBH) ListProtector.get(list, i2)).LIZIZ, null), 3);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height = this.LLILLJJLI.getHeight() - this.LLILLJJLI.findViewById(R.id.fy5).getHeight();
        if (this.LLJJIJI != height) {
            this.LLJJIJI = height;
            this.LL.zW(LiveDialogStatusChannel.class, new C770910ULx(true, height, hashCode(), EnumC761940Tui.DIALOG_BIZ_SECONDARY_EFFECT_PANEL, EnumC766540U5c.STICKER_EFFECT_PANEL));
        }
    }
}
