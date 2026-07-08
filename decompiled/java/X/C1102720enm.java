package X;

import Y.AObserverS210S0100000_6;
import Y.AObserverS220S0100000_16;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.toolbar.TBViewModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.toolbarv2.ToolbarShowEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0enm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1102720enm implements InterfaceC1102870eo1 {
    public static final Set<String> LJIIIZ = C13LQ.LJLIIL(new String[]{"btm_pre", "btm_ppre", "btm_pre_show_id"});
    public final C1099960ejK LIZ;
    public final ViewGroup LIZIZ;
    public final List<EnumC1102740eno> LIZJ;
    public final AbstractC1102590enZ LIZLLL;
    public final Map<EnumC1102740eno, InterfaceC1102810env> LJ;
    public final Map<EnumC1102740eno, InterfaceC785120Ur0> LJFF = new LinkedHashMap();
    public final Map<EnumC1102740eno, InterfaceC1102810env> LJI = new LinkedHashMap();
    public final Map<EnumC1102740eno, ViewGroup> LJII = new LinkedHashMap();
    public final BPEAHandler LJIIIIZZ = new BPEAHandler(Looper.getMainLooper(), new C1151670g4j(this, 11));

    public final void LJFF() {
        TBViewModel viewModel;
        for (Map.Entry<EnumC1102740eno, InterfaceC1102810env> entry : this.LJ.entrySet()) {
            EnumC1102740eno key = entry.getKey();
            entry.getValue();
            if (this.LIZJ.contains(key) && !this.LJI.containsKey(key) && (viewModel = key.getViewModel(this.LIZ.LIZJ)) != null) {
                Context context = this.LIZ.LIZ;
                if (context == null) {
                    context = this.LIZIZ.getContext();
                }
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setId(C1103080eoM.LIZIZ(key));
                frameLayout.setTag(key);
                C786410Ut5.a6(frameLayout, C1099910ejF.LIZ(this.LIZ.LIZLLL));
                AbstractC1102590enZ abstractC1102590enZ = this.LIZLLL;
                if (abstractC1102590enZ != null) {
                    abstractC1102590enZ.LIZIZ(key, viewModel);
                }
                C1099910ejF.LIZLLL(this.LIZ, frameLayout, viewModel);
                this.LIZIZ.addView(frameLayout, LJ(key));
                this.LJI.put(key, null);
                this.LJII.put(key, frameLayout);
            }
            BPEAHandler bPEAHandler = this.LJIIIIZZ;
            Message message = new Message();
            message.what = 0;
            message.obj = key;
            C786410Ut5.LJLJJL(bPEAHandler, message);
        }
    }

    @Override // X.InterfaceC1102870eo1
    public final void release() {
        for (Map.Entry entry : ((LinkedHashMap) this.LJI).entrySet()) {
            EnumC1102740eno enumC1102740eno = (EnumC1102740eno) entry.getKey();
            InterfaceC1102810env interfaceC1102810env = (InterfaceC1102810env) entry.getValue();
            InterfaceC785120Ur0 interfaceC785120Ur0 = (InterfaceC785120Ur0) ((LinkedHashMap) this.LJFF).get(enumC1102740eno);
            if (interfaceC785120Ur0 != null) {
                View contentView = interfaceC785120Ur0.getContentView();
                C0JGN c0jgn = C0JGL.LIZ;
                C0JGL.LIZIZ(this.LIZ.LIZLLL, enumC1102740eno, contentView);
                if (interfaceC1102810env != null) {
                    interfaceC1102810env.LIZLLL(this.LIZ, interfaceC785120Ur0);
                }
            }
        }
        this.LJIIIIZZ.removeCallbacksAndMessages(null);
        C786410Ut5.LJJJJI(this.LIZIZ);
        ((LinkedHashMap) this.LJFF).clear();
        ((LinkedHashMap) this.LJI).clear();
        ((LinkedHashMap) this.LJII).clear();
    }

    @Override // X.InterfaceC1102870eo1
    public final List<EnumC1102740eno> getButtons() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1102870eo1
    public final InterfaceC1103130eoR LIZIZ(EnumC1102740eno enumC1102740eno) {
        return (InterfaceC1103130eoR) ((LinkedHashMap) this.LJFF).get(enumC1102740eno);
    }

    @Override // X.InterfaceC1102870eo1
    public final void LIZJ(EnumC1102740eno enumC1102740eno) {
        Fragment fragment;
        this.LJIIIIZZ.removeMessages(0, enumC1102740eno);
        if (this.LJII.containsKey(enumC1102740eno)) {
            LifecycleOwner lifecycleOwner = this.LIZ.LIZIZ;
            if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
                C1102860eo0.LIZ(enumC1102740eno, fragment).LLIZ.setValue(new C1102510enR(false, true));
            }
            C786410Ut5.LJJJLZIJ((View) ((LinkedHashMap) this.LJII).get(enumC1102740eno), this.LIZIZ);
            this.LJI.remove(enumC1102740eno);
            this.LJII.remove(enumC1102740eno);
            return;
        }
        LIZLLL(enumC1102740eno);
    }

    public final void LIZLLL(EnumC1102740eno enumC1102740eno) {
        Fragment fragment;
        InterfaceC785120Ur0 interfaceC785120Ur0 = (InterfaceC785120Ur0) ((LinkedHashMap) this.LJFF).get(enumC1102740eno);
        if (interfaceC785120Ur0 == null) {
            return;
        }
        View contentView = interfaceC785120Ur0.getContentView();
        C0JGN c0jgn = C0JGL.LIZ;
        C0JGL.LIZIZ(this.LIZ.LIZLLL, enumC1102740eno, contentView);
        LifecycleOwner lifecycleOwner = this.LIZ.LIZIZ;
        if ((lifecycleOwner instanceof Fragment) && (fragment = (Fragment) lifecycleOwner) != null) {
            C1102860eo0.LIZ(enumC1102740eno, fragment).LLIZ.setValue(new C1102510enR(false, true));
        }
        InterfaceC1102810env interfaceC1102810env = (InterfaceC1102810env) ((LinkedHashMap) this.LJI).get(enumC1102740eno);
        if (interfaceC1102810env != null) {
            interfaceC1102810env.LIZLLL(this.LIZ, interfaceC785120Ur0);
        }
        C786410Ut5.LJJJLZIJ(interfaceC785120Ur0.LIZJ(), this.LIZIZ);
        this.LJFF.remove(enumC1102740eno);
        this.LJI.remove(enumC1102740eno);
        this.LJII.remove(enumC1102740eno);
    }

    public final int LJ(EnumC1102740eno enumC1102740eno) {
        Set setKeySet = ((LinkedHashMap) this.LJI).keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (this.LIZJ.indexOf(obj) < this.LIZJ.indexOf(enumC1102740eno)) {
                arrayList.add(obj);
            }
        }
        return Math.min(arrayList.size(), this.LIZIZ.getChildCount());
    }

    @Override // X.InterfaceC1102870eo1
    public final void LIZ(final EnumC1102740eno enumC1102740eno, final InterfaceC1102810env interfaceC1102810env) {
        int layoutId;
        String str;
        Room room;
        LiveIconView liveIconView;
        C1102880eo2 c1102880eo2IconConfig;
        if (!this.LIZJ.contains(enumC1102740eno) || Intrinsics.LJFF(((LinkedHashMap) this.LJI).get(enumC1102740eno), interfaceC1102810env)) {
            return;
        }
        LIZLLL(enumC1102740eno);
        this.LJI.put(enumC1102740eno, interfaceC1102810env);
        TBViewModel viewModel = enumC1102740eno.getViewModel(this.LIZ.LIZJ);
        if (viewModel != null) {
            this.LJIIIIZZ.removeMessages(0, enumC1102740eno);
            Integer numLayoutID = enumC1102740eno.layoutID(this.LIZ.LIZLLL);
            if (numLayoutID != null) {
                layoutId = numLayoutID.intValue();
            } else {
                layoutId = this.LIZ.LIZLLL.getLayoutStyle().getLayoutId();
            }
            C0JGN c0jgn = C0JGL.LIZ;
            C1099960ejK c1099960ejK = this.LIZ;
            View viewLIZ = C0JGL.LIZ(c1099960ejK.LIZ, c1099960ejK.LIZJ, layoutId);
            if (viewLIZ == null) {
                viewLIZ = C500260Jjc.LJIILL(layoutId, this.LIZIZ, false);
            }
            View viewFindViewById = viewLIZ.findViewById(R.id.y74);
            String strLLFF = null;
            if ((viewFindViewById instanceof LiveIconView) && (liveIconView = (LiveIconView) viewFindViewById) != null && (c1102880eo2IconConfig = enumC1102740eno.iconConfig(this.LIZ.LIZLLL)) != null) {
                liveIconView.setIconHeightRatio(c1102880eo2IconConfig.LJFF);
                liveIconView.setIconWidthRatio(c1102880eo2IconConfig.LJ);
                int i = c1102880eo2IconConfig.LIZ;
                if (i != -1) {
                    liveIconView.setIconTint(i);
                } else {
                    int i2 = c1102880eo2IconConfig.LJI;
                    if (i2 != -1) {
                        liveIconView.setIconTint(C20736316Cj.LIZIZ(i2, this.LIZ.LIZ));
                    }
                }
                Integer num = c1102880eo2IconConfig.LIZIZ;
                if (num != null) {
                    liveIconView.setIconBackgroundAppearance(num.intValue());
                }
                Integer num2 = c1102880eo2IconConfig.LIZJ;
                if (num2 != null) {
                    liveIconView.setIconBackground(num2.intValue());
                } else {
                    Integer num3 = c1102880eo2IconConfig.LIZLLL;
                    if (num3 != null) {
                        liveIconView.setIconBackgroundColor(num3.intValue());
                    }
                }
                liveIconView.setLayoutDirection(C497740JfY.LJJ() ? 1 : 0);
            }
            if (viewModel.isVisible()) {
                String identifier = enumC1102740eno.getIdentifier();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_show");
                c474500IjALIZ.LJIJJLI(this.LIZ.LIZJ);
                DataChannel dataChannel = this.LIZ.LIZJ;
                if (dataChannel != null) {
                    strLLFF = C500260Jjc.LLFF(dataChannel);
                }
                c474500IjALIZ.LJJII(strLLFF, "user_type");
                c474500IjALIZ.LJJII(identifier, "button_name");
                if (C497740JfY.LJIL()) {
                    str = "portrait";
                } else {
                    str = "landscape";
                }
                c474500IjALIZ.LJJII(str, "room_orientation");
                if (Intrinsics.LJFF(identifier, EnumC1102740eno.SHARE.getIdentifier()) && (room = (Room) this.LIZ.LIZJ.gg0(RoomChannel.class)) != null && room.ecommerceActivityInfo != null) {
                    c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
                }
                c474500IjALIZ.LIZ();
            }
            ViewGroup frameLayout = (ViewGroup) ((LinkedHashMap) this.LJII).get(enumC1102740eno);
            if (frameLayout == null) {
                Context context = this.LIZ.LIZ;
                if (context == null) {
                    context = viewLIZ.getContext();
                }
                frameLayout = new FrameLayout(context);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().LIZ), (int) C497740JfY.LIZIZ(this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().LIZIZ));
            layoutParams.gravity = 1;
            if (Intrinsics.LJFF(this.LIZ.LIZJ.gg0(C0TZM.class), Boolean.TRUE)) {
                layoutParams.topMargin = (int) C497740JfY.LIZIZ(8.0f);
                layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(12.0f);
            } else {
                layoutParams.topMargin = (int) C497740JfY.LIZIZ(12.0f);
                layoutParams.bottomMargin = (int) C497740JfY.LIZIZ(16.0f);
            }
            frameLayout.addView(viewLIZ, layoutParams);
            if (!Intrinsics.LJFF(frameLayout, ((LinkedHashMap) this.LJII).get(enumC1102740eno))) {
                AbstractC1102590enZ abstractC1102590enZ = this.LIZLLL;
                if (abstractC1102590enZ != null) {
                    abstractC1102590enZ.LIZIZ(enumC1102740eno, viewModel);
                }
                C1099910ejF.LIZLLL(this.LIZ, frameLayout, viewModel);
            }
            if (enumC1102740eno.isLiveDesignLayout(this.LIZ.LIZLLL)) {
                C1099960ejK c1099960ejK2 = this.LIZ;
                LiveIconView liveIconView2 = (LiveIconView) frameLayout.findViewById(R.id.y74);
                if (liveIconView2 != null) {
                    viewModel.LL.observe(c1099960ejK2.LIZIZ, new C513601zK((Object) liveIconView2, 54));
                }
                C16F5 c16f5 = (C16F5) frameLayout.findViewById(R.id.y7s);
                if (c16f5 != null) {
                    if (c1099960ejK2.LIZLLL.getStyleDesc().LIZ) {
                        C786410Ut5.LLJJJJ(c16f5, 0);
                        viewModel.LLILLJJLI.observe(c1099960ejK2.LIZIZ, new C513601zK((Object) c16f5, 55));
                    } else {
                        C786410Ut5.LLJJJJ(c16f5, 8);
                    }
                }
                C16F5 c16f52 = (C16F5) frameLayout.findViewById(R.id.y7t);
                if (c16f52 != null) {
                    c1099960ejK2.LIZLLL.getStyleDesc().getClass();
                    C786410Ut5.LLJJJJ(c16f52, 8);
                }
                viewModel.LLILZIL.observe(c1099960ejK2.LIZIZ, new AObserverS210S0100000_6(frameLayout, 50));
                View viewFindViewById2 = frameLayout.findViewById(R.id.y7r);
                if (viewFindViewById2 != null) {
                    viewModel.LLJI.observe(c1099960ejK2.LIZIZ, new AObserverS220S0100000_16(viewFindViewById2, 41));
                }
            }
            final long jG0 = interfaceC1102810env.g0();
            C786410Ut5.K7(frameLayout, new C01DW(jG0) { // from class: X.0ej7
                @Override // X.C01DW
                public final void LIZ(View view) {
                    if (C468250IXv.LIZJ(this.LLILLL.LIZ.LIZJ) && enumC1102740eno != EnumC1102740eno.SHARE) {
                        C468250IXv.LJ(this.LLILLL.LIZ.LIZJ, "bottom_zone");
                    } else {
                        if (C468250IXv.LIZ(this.LLILLL.LIZ.LIZJ)) {
                            C468250IXv.LIZIZ(this.LLILLL.LIZ.LIZJ, "share");
                        }
                        interfaceC1102810env.onClick(view);
                    }
                    this.LLILLL.LJI(enumC1102740eno, false);
                }

                @Override // X.C01DW
                public final void LIZIZ(View view) {
                    this.LLILLL.LJI(enumC1102740eno, true);
                }
            });
            frameLayout.setOnLongClickListener(new ViewOnLongClickListenerC1151640g4g(interfaceC1102810env, 6));
            frameLayout.setTag(enumC1102740eno);
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer numValueOf = Integer.valueOf((int) C497740JfY.LIZIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer numValueOf2 = Integer.valueOf((int) C497740JfY.LIZIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            Integer numValueOf3 = Integer.valueOf((int) C497740JfY.LIZIZ(0.0f));
            this.LIZ.LIZLLL.getLayoutStyle().getLayoutParams().getClass();
            View view = viewLIZ;
            C426750GoL.LJIIL(viewLIZ, numValueOf, numValueOf2, numValueOf3, Integer.valueOf((int) C497740JfY.LIZIZ(0.0f)), 16);
            if (!Intrinsics.LJFF(frameLayout, ((LinkedHashMap) this.LJII).get(enumC1102740eno))) {
                frameLayout.setId(C1103080eoM.LIZIZ(enumC1102740eno));
                frameLayout.setTag(enumC1102740eno);
                C786410Ut5.X5(C1099910ejF.LIZ(this.LIZ.LIZLLL), frameLayout);
            }
            ViewGroup viewGroup = frameLayout;
            C945840aik c945840aik = new C945840aik(viewGroup, view, enumC1102740eno, this.LIZ, viewModel);
            this.LJFF.put(enumC1102740eno, c945840aik);
            interfaceC1102810env.LIZIZ(this.LIZ, c945840aik);
            viewGroup.setClipChildren(!interfaceC1102810env.f1());
            viewGroup.setClipToPadding(false);
            if (viewGroup.getParent() == null) {
                this.LIZIZ.addView(viewGroup, LJ(enumC1102740eno));
            }
            this.LIZ.LIZJ.FQ2(ToolbarShowEvent.class);
            this.LJII.remove(enumC1102740eno);
        }
    }

    public final void LJI(EnumC1102740eno enumC1102740eno, boolean z) {
        String strLLFF;
        View viewLIZJ;
        String str;
        Room room;
        String string;
        String identifier = enumC1102740eno.getIdentifier();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toolbar_button_click");
        c474500IjALIZ.LJIJJLI(this.LIZ.LIZJ);
        DataChannel dataChannel = this.LIZ.LIZJ;
        Map mapLJIILLIIL = null;
        if (dataChannel != null) {
            strLLFF = C500260Jjc.LLFF(dataChannel);
        } else {
            strLLFF = null;
        }
        c474500IjALIZ.LJJII(strLLFF, "user_type");
        InterfaceC785120Ur0 interfaceC785120Ur0 = (InterfaceC785120Ur0) ((LinkedHashMap) this.LJFF).get(enumC1102740eno);
        if (interfaceC785120Ur0 != null) {
            viewLIZJ = interfaceC785120Ur0.LIZJ();
        } else {
            viewLIZJ = null;
        }
        if (Intrinsics.LJFF(identifier, EnumC1102740eno.SHARE.getIdentifier()) && viewLIZJ != null) {
            try {
                Map mapLJI = C2211631BhB.LJI(viewLIZJ);
                if (mapLJI != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Map.Entry entry : ((LinkedHashMap) mapLJI).entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (!LJIIIZ.contains(str2) && value != null && (string = value.toString()) != null) {
                            arrayList.add(new Pair(str2, string));
                        }
                    }
                    mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        c474500IjALIZ.LJJIIZI(mapLJIILLIIL);
        c474500IjALIZ.LJJII(identifier, "button_name");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_false_trigger");
        if (C497740JfY.LJIL()) {
            str = "portrait";
        } else {
            str = "landscape";
        }
        c474500IjALIZ.LJJII(str, "room_orientation");
        if (Intrinsics.LJFF(identifier, EnumC1102740eno.SHARE.getIdentifier()) && (room = (Room) this.LIZ.LIZJ.gg0(RoomChannel.class)) != null && room.ecommerceActivityInfo != null) {
            c474500IjALIZ.LJJII("TEMAI", "EVENT_ORIGIN_FEATURE");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1102720enm(C1099960ejK c1099960ejK, ViewGroup viewGroup, List<? extends EnumC1102740eno> list, AbstractC1102590enZ abstractC1102590enZ, Map<EnumC1102740eno, InterfaceC1102810env> map) {
        this.LIZ = c1099960ejK;
        this.LIZIZ = viewGroup;
        this.LIZJ = list;
        this.LIZLLL = abstractC1102590enZ;
        this.LJ = map;
    }
}
