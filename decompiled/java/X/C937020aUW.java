package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateMapData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.ToolsTypeStateUpdateEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.PlaybookEditorUgcSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0aUW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C937020aUW extends AbstractC960470b6L<C20408114tL> {
    public final DataChannel LL;
    public final LifecycleOwner LLILLJJLI;
    public final InterfaceC937090aUd LLILLL;
    public final View LLILZ;
    public final View LLILZIL;
    public final LiveIconView LLILZLL;
    public final C21569819bE LLIZ;
    public final C16F5 LLIZLLLIL;
    public final View LLJ;
    public final View LLJI;
    public final LiveIconView LLJIJIL;
    public final C21569819bE LLJILJIL;
    public final C16F5 LLJILJILJ;
    public final View LLJILLL;
    public final View LLJJ;
    public final LiveIconView LLJJI;
    public final C21569819bE LLJJIII;
    public final C16F5 LLJJIJI;
    public final View LLJJIJIIJIL;
    public final LiveIconView LLJJIJIL;
    public final C21569819bE LLJJJ;
    public final C16F5 LLJJJIL;
    public final View LLJJJJ;
    public final LiveIconView LLJJJJJIL;
    public final C21569819bE LLJJJJLIIL;
    public final C16F5 LLJJL;
    public final View LLJJLIIIJLLLLLLLZ;
    public final LiveIconView LLJL;
    public final View LLJLIL;
    public final View LLJLILLLLZIIL;

    public final void V5() {
        C500260Jjc.LJLJLJ(this.LLJJIJIIJIL, !C924230a9t.LIZ(2));
        if (C500260Jjc.LJJJJIZL(this.LLJJIJIIJIL)) {
            C932160aMg.LJFF(EnumC936960aUQ.LIVE_SHOW, "show", EnumC937290aUx.MULTI_TOOL, C500260Jjc.LJJIL(), 0);
        }
        if (C500260Jjc.LJJIL()) {
            S5(this.LLJJJ, false);
            R5(this, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJIL, false, null, 48);
        } else {
            S5(this.LLJJJ, P5(EnumC936960aUQ.LIVE_SHOW));
            R5(this, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJIL, true, new C936910aUL(this), 16);
        }
    }

    public final void W5() {
        C16F5 c16f5;
        View view = this.LLJJ;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, true);
        }
        C500260Jjc.LJLJLJ(this.LLJILLL, RedDotExtensionKt.LJIILLIIL(C0UX6.MULTI_GUEST_TEXT_BANNER_RED_DOT));
        C915980Zwa.LIZLLL().BT1(EnumC937290aUx.MULTI_TOOL, false, EnumC919090a1b.SHOW, false);
        S5(this.LLJJIII, P5(EnumC936960aUQ.NOTICE_BOARD));
        R5(this, this.LLJJ, this.LLJJI, this.LLJJIJI, true, new C936930aUN(this), 16);
        if (!MultiguestNoticeboardV2Setting.INSTANCE.templateEnable() || (c16f5 = this.LLJJIJI) == null) {
            return;
        }
        c16f5.setText(C497740JfY.LJIJI(2131854991));
    }

    public final void T5() {
        if (!C924220a9s.LIZIZ()) {
            View view = this.LLJI;
            if (view != null) {
                C500260Jjc.LJLJLJ(view, false);
                return;
            }
            return;
        }
        View view2 = this.LLJI;
        if (view2 != null) {
            C500260Jjc.LJLJLJ(view2, true);
        }
        EnumC936960aUQ enumC936960aUQ = EnumC936960aUQ.COUNTDOWN_FOR_ALL;
        C932160aMg.LJFF(enumC936960aUQ, "show", EnumC937290aUx.MULTI_TOOL, C500260Jjc.LJJIL(), 0);
        S5(this.LLJILJIL, P5(enumC936960aUQ));
        R5(this, this.LLJI, this.LLJIJIL, this.LLJILJILJ, !C500260Jjc.LJJIL(), new C936920aUM(this), 16);
        if (C924220a9s.LIZJ()) {
            RedDotExtensionKt.LJI(this.LLJ, this.LLILLJJLI, null, C0UX6.GUEST_COUNT_DOWN_ENTRANCE, null);
        }
    }

    public final void U5() {
        if (!C986270blx.LIZ()) {
            C500260Jjc.LJLJLJ(this.LLILZIL, false);
            boolean zLIZJ = C936270aTJ.LIZJ(true);
            C500260Jjc.LJLJLJ(this.LLJJJJ, zLIZJ);
            if (zLIZJ) {
                C932160aMg.LJFF(EnumC936960aUQ.WALLPAPER, "show", EnumC937290aUx.MULTI_TOOL, C500260Jjc.LJJIL(), 0);
            }
            if (C500260Jjc.LJJIL()) {
                S5(this.LLJJJJLIIL, false);
                R5(this, this.LLJJJJ, this.LLJJJJJIL, this.LLJJL, false, null, 48);
                return;
            } else {
                S5(this.LLJJJJLIIL, P5(EnumC936960aUQ.WALLPAPER));
                R5(this, this.LLJJJJ, this.LLJJJJJIL, this.LLJJL, true, new C936870aUH(this), 16);
                return;
            }
        }
        C500260Jjc.LJLJLJ(this.LLILZIL, true);
        C500260Jjc.LJLJLJ(this.LLJJJJ, false);
        EnumC936960aUQ enumC936960aUQ = EnumC936960aUQ.GUEST_SHOWDOWN;
        C932160aMg.LJFF(enumC936960aUQ, "show", EnumC937290aUx.MULTI_TOOL, C500260Jjc.LJJIL(), 0);
        if (C500260Jjc.LJJIL()) {
            S5(this.LLIZ, false);
            R5(this, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, false, null, 48);
        } else {
            S5(this.LLIZ, P5(enumC936960aUQ));
            R5(this, this.LLILZIL, this.LLILZLL, this.LLIZLLLIL, true, new C936890aUJ(this), 16);
            HashMap map = new HashMap();
            C01Z4.LIZ(null, map);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_anchor_guest_showdown_entrance");
            c474500IjALIZ.LJJIIZI(map);
            c474500IjALIZ.LJJII("show", "action_type");
            MultiGuestDataHolder multiGuestDataHolder = C920830a4P.LIZ;
            c474500IjALIZ.LJJII(Integer.valueOf((multiGuestDataHolder == null || multiGuestDataHolder.LJJIFFI <= 0) ? 0 : 1), "is_guest_connection");
            c474500IjALIZ.LJJII(C917520Zz4.LIZJ(), "layout_id");
            c474500IjALIZ.LJJII("multi_tool", "position");
            c474500IjALIZ.LIZ();
        }
        RedDotExtensionKt.LJI(this.LLILZ, this.LLILLJJLI, null, C0UX6.GUEST_SHOWDOWN_ENTRANCE, null);
    }

    public final boolean P5(EnumC936960aUQ enumC936960aUQ) {
        Map map;
        Boolean bool;
        DataChannel dataChannel = this.LL;
        if (dataChannel != null && (map = (Map) dataChannel.gg0(ToolsTypeStateMapData.class)) != null && (bool = (Boolean) map.get(enumC936960aUQ)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static void N5(String str, Function0 function0) {
        if (C500260Jjc.LJJIL()) {
            function0.invoke();
            return;
        }
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        Boolean boolValueOf = null;
        if (interfaceC941720ac6LIZIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC941720ac6LIZIZ.LIZJ(str, new C937100aUe(function0), null));
        }
        if (C500260Jjc.LJJIFFI(boolValueOf)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receive ShowPlaybookPlayToolPage ");
            sbLIZ.append(str);
            sbLIZ.append(" return as can't start");
            C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void S5(C21569819bE c21569819bE, boolean z) {
        if (z) {
            if (c21569819bE != null) {
                int visibility = c21569819bE.getVisibility();
                c21569819bE.setVisibility(0);
                C1602160rnK.LIZIZ(visibility, 0, c21569819bE);
                c21569819bE.LIZIZ();
                c21569819bE.LJFF();
                return;
            }
            return;
        }
        if (c21569819bE == null) {
            return;
        }
        int visibility2 = c21569819bE.getVisibility();
        c21569819bE.setVisibility(8);
        C1602160rnK.LIZIZ(visibility2, 8, c21569819bE);
        c21569819bE.LIZIZ();
    }

    @Override // X.AbstractC960470b6L
    public final void I5(int i, Object obj) {
        C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolder", "onBindViewHolder");
    }

    public static final C21569819bE L5(View view, C937020aUW c937020aUW, int i) {
        C21569819bE c21569819bE = (C21569819bE) view.findViewById(i);
        c937020aUW.getClass();
        if (c21569819bE != null) {
            c21569819bE.LIZJ(EnumC21569519bB.LIVE_INBOX_LIVING_ICON_NEW);
            c21569819bE.setOuterCircleStrokeWidth(C418440Gaw.LIZIZ(2));
        }
        return c21569819bE;
    }

    public C937020aUW(View view, PlaybookAnchorViewModel playbookAnchorViewModel, DataChannel dataChannel, LifecycleOwner lifecycleOwner, InterfaceC937090aUd interfaceC937090aUd) {
        boolean z;
        MutableLiveData<Boolean> mutableLiveData;
        String strLJJIFFI;
        super(view);
        this.LL = dataChannel;
        this.LLILLJJLI = lifecycleOwner;
        this.LLILLL = interfaceC937090aUd;
        this.LLJLILLLLZIIL = view.findViewById(R.id.zlu);
        this.LLILZ = view.findViewById(R.id.jag);
        this.LLILZIL = view.findViewById(R.id.ndl);
        this.LLILZLL = (LiveIconView) view.findViewById(R.id.lj0);
        this.LLIZ = L5(view, this, R.id.lj1);
        C16F5 c16f5 = (C16F5) view.findViewById(R.id.zom);
        this.LLIZLLLIL = c16f5;
        this.LLJ = view.findViewById(R.id.eyu);
        this.LLJI = view.findViewById(R.id.nc7);
        this.LLJIJIL = (LiveIconView) view.findViewById(R.id.ld4);
        this.LLJILJIL = L5(view, this, R.id.ld5);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.zfw);
        this.LLJILLL = view.findViewById(R.id.pcp);
        this.LLJJ = view.findViewById(R.id.nfv);
        this.LLJJI = (LiveIconView) view.findViewById(R.id.lpz);
        this.LLJJIII = L5(view, this, R.id.lq0);
        this.LLJJIJI = (C16F5) view.findViewById(R.id.zzl);
        this.LLJJIJIIJIL = view.findViewById(R.id.nf0);
        this.LLJJIJIL = (LiveIconView) view.findViewById(R.id.lng);
        this.LLJJJ = L5(view, this, R.id.lnh);
        this.LLJJJIL = (C16F5) view.findViewById(R.id.zvi);
        this.LLJJJJ = view.findViewById(R.id.njr);
        this.LLJJJJJIL = (LiveIconView) view.findViewById(R.id.lzo);
        this.LLJJJJLIIL = L5(view, this, R.id.lzp);
        this.LLJJL = (C16F5) view.findViewById(R.id.tv_wallpaper);
        C19MX c19mx = (C19MX) view.findViewById(R.id.qm8);
        View viewFindViewById = view.findViewById(R.id.lrd);
        this.LLJJLIIIJLLLLLLLZ = view.findViewById(R.id.tv_playbooks);
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0aUb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.LL.LLILLL.j9();
            }
        }, viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.qsw);
        this.LLJLIL = viewFindViewById2;
        LiveIconView liveIconView = (LiveIconView) view.findViewById(R.id.ldz);
        this.LLJL = liveIconView;
        if (c16f5 != null) {
            String strLJIJI = C497740JfY.LJIJI(2131852904);
            if (strLJIJI != null) {
                strLJJIFFI = u.LJJIFFI(strLJIJI, "\\u200B", "\u200b", false);
            } else {
                strLJJIFFI = null;
            }
            c16f5.setText(strLJJIFFI);
        }
        if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
            C500260Jjc.LJLJLJ(liveIconView, true);
            C978360bZC.LJIJJ("playbook_original", "create_entrance", null, "create", null, 48);
            C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0aUa
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.LL.LLILLL.ab();
                    C978360bZC.LJIJ("playbook_original", "create_entrance", null, "create", false, null, null);
                }
            }, liveIconView);
            if (C500260Jjc.LJJIJLIJ()) {
                RedDotExtensionKt.LJI(viewFindViewById2, lifecycleOwner, null, C0UX6.PLAYBOOK_UGC_ENTRANCE, null);
            }
        } else {
            C500260Jjc.LJLJLJ(liveIconView, false);
        }
        if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLJIJIL) != null) {
            mutableLiveData.observe(this.LLILLJJLI, new Observer() { // from class: X.0aUX
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    if (((Boolean) obj).booleanValue() && !C500260Jjc.LJJIL()) {
                        C500260Jjc.LJLJLJ(this.LL.LLJL, true);
                        final C937020aUW c937020aUW = this.LL;
                        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0aUc
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                c937020aUW.LLILLL.ab();
                            }
                        }, c937020aUW.LLJL);
                        return;
                    }
                    if (PlaybookEditorUgcSetting.INSTANCE.isUgcEnable()) {
                        return;
                    }
                    C500260Jjc.LJLJLJ(this.LL.LLJL, false);
                }
            });
        }
        if (dataChannel != null) {
            dataChannel.BQ2(lifecycleOwner, ToolsTypeStateUpdateEvent.class, new C937010aUV(this));
        }
        V5();
        U5();
        T5();
        W5();
        if (c19mx != null) {
            z = true;
            int[] referencedIds = c19mx.getReferencedIds();
            if (referencedIds != null) {
                for (int i : referencedIds) {
                    if (z && this.itemView.findViewById(i).getVisibility() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                }
            }
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateTvPlaybookUi allGone:");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("PlaybookPolymerizationHeaderTopViewHolder", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        if (C500260Jjc.LJJJJIZL(this.LLJJIJIIJIL)) {
            arrayList.add(EnumC936960aUQ.LIVE_SHOW);
        }
        if (C500260Jjc.LJJJJIZL(this.LLILZIL)) {
            arrayList.add(EnumC936960aUQ.GUEST_SHOWDOWN);
        }
        if (C500260Jjc.LJJJJIZL(this.LLJI)) {
            arrayList.add(EnumC936960aUQ.COUNTDOWN_FOR_ALL);
        }
        if (C500260Jjc.LJJJJIZL(this.LLJJ)) {
            arrayList.add(EnumC936960aUQ.NOTICE_BOARD);
        }
        if (C500260Jjc.LJJJJIZL(this.LLJJJJ)) {
            arrayList.add(EnumC936960aUQ.WALLPAPER);
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIJJI(arrayList);
        C978360bZC.LJII("show");
        View view2 = this.LLJLILLLLZIIL;
        if (view2 != null) {
            C786410Ut5.I7(new View.OnClickListener() { // from class: X.0aUY
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    C915190ZvJ c915190ZvJ2 = C978360bZC.LIZJ;
                    C978360bZC.LJII("click");
                    C937020aUW c937020aUW = this.LL;
                    InterfaceC937090aUd interfaceC937090aUd2 = c937020aUW.LLILLL;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new C949720ap0(2, c937020aUW.itemView.getContext().getString(2131854068)));
                    if (C500260Jjc.LJJJJIZL(c937020aUW.LLILZIL)) {
                        arrayList2.add(new C949720ap0(8, c937020aUW.itemView.getContext().getString(2131852903)));
                    }
                    if (C500260Jjc.LJJJJIZL(c937020aUW.LLJJIJIIJIL)) {
                        arrayList2.add(new C949720ap0(5, c937020aUW.itemView.getContext().getString(2131843568)));
                    }
                    if (C500260Jjc.LJJJJIZL(c937020aUW.LLJI)) {
                        arrayList2.add(new C949720ap0(3, c937020aUW.itemView.getContext().getString(2131853920)));
                    }
                    if (C500260Jjc.LJJJJIZL(c937020aUW.LLJJ)) {
                        arrayList2.add(new C949720ap0(6, c937020aUW.itemView.getContext().getString(2131854020)));
                    }
                    if (C500260Jjc.LJJJJIZL(c937020aUW.LLJJJJ)) {
                        arrayList2.add(new C949720ap0(7, c937020aUW.itemView.getContext().getString(2131843396)));
                    }
                    arrayList2.add(new C949720ap0(1, c937020aUW.itemView.getContext().getString(2131852495)));
                    interfaceC937090aUd2.pe(arrayList2);
                }
            }, view2);
        }
    }

    public static void R5(C937020aUW c937020aUW, View view, LiveIconView liveIconView, C16F5 c16f5, boolean z, final Function0 function0, int i) {
        final Function0 function02 = null;
        if ((i & 32) != 0) {
            function0 = null;
        }
        c937020aUW.getClass();
        if (z) {
            if (liveIconView != null) {
                liveIconView.setIconTintAttr(R.attr.ezq);
            }
            if (c16f5 != null) {
                c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezq, c937020aUW.itemView.getContext()));
            }
            C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0aUf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Function0<Unit> function03 = function0;
                    if (function03 != null) {
                        function03.invoke();
                    }
                }
            }, view);
            return;
        }
        if (liveIconView != null) {
            liveIconView.setIconTintAttr(R.attr.ezy);
        }
        if (c16f5 != null) {
            c16f5.setTextColor(C497740JfY.LIZLLL(R.attr.ezy, c937020aUW.itemView.getContext()));
        }
        C1570050qxX.LIZ(new View.OnClickListener() { // from class: X.0aUg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
            }
        }, view);
    }
}
