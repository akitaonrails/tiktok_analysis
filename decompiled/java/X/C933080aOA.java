package X;

import Y.AcS187S0300000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.IThemeAbility;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.ui.NoticeboardSwitchSpotFragment;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aOA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933080aOA extends FrameLayout implements C1AXB, LifecycleOwner {
    public InterfaceC937840aVq LL;
    public final DataChannel LLILLJJLI;
    public final EnumC933200aOM LLILLL;
    public final InterfaceC940580aaG LLILZ;
    public TuxTextView LLILZIL;
    public ConstraintLayout LLILZLL;
    public C19R8 LLIZ;
    public ViewGroup LLIZLLLIL;
    public ViewGroup LLJ;
    public IThemeAbility LLJI;
    public final C11NJ LLJIJIL;
    public final LifecycleRegistry LLJILJIL;
    public View LLJILJILJ;
    public LiveActionSheetDialog LLJILLL;
    public Long LLJJ;
    public LiveDialog LLJJI;

    @Override // X.C1AXB
    public Boolean getAudioMute() {
        return null;
    }

    @Override // X.C1AXB
    public String getLinkMicId() {
        return null;
    }

    @Override // X.C1AXB
    public Long getUid() {
        return null;
    }

    @Override // X.C1AXB
    public Boolean getVideoMute() {
        return null;
    }

    @Override // X.C1AXB
    public final boolean isEmpty() {
        return true;
    }

    private final int getEmptyViewLayoutId() {
        return this.LLILLL == EnumC933200aOM.ANCHOR ? R.layout.hdj : R.layout.hdl;
    }

    public final ConstraintLayout getClMaskFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.dxb);
            this.LLILZLL = (ConstraintLayout) callbackFindViewById;
        }
        return (ConstraintLayout) callbackFindViewById;
    }

    public final C953770avX getCurrentDraftItem() {
        C953770avX c953770avXLJFF;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null || (c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(str)) == null) {
            return null;
        }
        return c953770avXLJFF;
    }

    public final C19R8 getLlTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.nil);
            this.LLIZ = (C19R8) callbackFindViewById;
        }
        return (C19R8) callbackFindViewById;
    }

    @Override // X.C1AXB
    public Integer getLogicPos() {
        return Integer.valueOf(this.LL.LJIILL());
    }

    public final View getRoundCornerBgView() {
        View view = this.LLJILJILJ;
        if (view == null) {
            view = new View(getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            C786410Ut5.W5(view, layoutParams);
            C786410Ut5.LJLLLLLL(8, view);
        }
        this.LLJILJILJ = view;
        return view;
    }

    public final TuxTextView getTvTagFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tv_tag);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    @Override // X.C1AXB
    public Integer getUiPos() {
        return Integer.valueOf(this.LL.LJIIIIZZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x0265  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            Method dump skipped, instruction units count: 641
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C933080aOA.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C20441214yg.LJIIIZ("NoticeboardMask", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        if (this.LLJILJIL.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            Lifecycle.State currentState = this.LLJILJIL.getCurrentState();
            Lifecycle.State state = Lifecycle.State.DESTROYED;
            if (currentState != state) {
                this.LLJILJIL.setCurrentState(state);
            }
        }
        LiveActionSheetDialog liveActionSheetDialog = this.LLJILLL;
        if (liveActionSheetDialog != null) {
            liveActionSheetDialog.dismiss();
            C785410UrT.LIZ(liveActionSheetDialog);
        }
        LiveDialog liveDialog = this.LLJJI;
        if (liveDialog != null) {
            liveDialog.dismiss();
            C785410UrT.LIZ(liveDialog);
        }
        Long l = this.LLJJ;
        if (l != null) {
            C19322110iZ.LIZ(l.longValue());
        }
        this.LLJIJIL.LJ();
        InterfaceC940580aaG interfaceC940580aaG = this.LLILZ;
        if (interfaceC940580aaG != null) {
            interfaceC940580aaG.LJ(getRoundCornerBgView(), this);
        }
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
    }

    public final boolean LIZ() {
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        return (interfaceC302601FgLIZ == null || interfaceC302601FgLIZ.LJIJI() || ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LLILLJJLI)) ? false : true;
    }

    public final void LIZJ() {
        MicPositionInfo micPositionInfo;
        Integer numLJIILJJIL;
        final boolean z;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        Layout layoutLJFF;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL2;
        InterfaceC937820aVo interfaceC937820aVoLJJJJZ;
        List<InterfaceC937840aVq> allLayoutWindows;
        List<PosIdentity> listLIZIZ;
        InterfaceC927510aFB interfaceC927510aFB;
        List<PosIdentity> listLIZIZ2;
        String strLJIJI;
        List<PosIdentity> listLIZIZ3;
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 != null) {
            String strLJ = this.LL.LJ();
            if (strLJ == null) {
                strLJ = "";
            }
            OnLineMicInfo onLineMicInfoLLII = interfaceC954180awCLLJLL2.LLII(strLJ);
            if (onLineMicInfoLLII == null || (micPositionInfo = onLineMicInfoLLII.micPositionData) == null) {
                return;
            }
            final int i = micPositionInfo.position;
            LiveActionSheetDialog liveActionSheetDialog = this.LLJILLL;
            if (liveActionSheetDialog != null) {
                liveActionSheetDialog.dismiss();
                C785410UrT.LIZ(liveActionSheetDialog);
            }
            Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
            InterfaceC927510aFB interfaceC927510aFB2 = objLJIIIZ instanceof InterfaceC927510aFB ? (InterfaceC927510aFB) objLJIIIZ : null;
            ArrayList arrayList = new ArrayList();
            C918060Zzw c918060Zzw = C918060Zzw.LIZ;
            boolean zLIZJ = C930540aK4.LIZJ();
            c918060Zzw.getClass();
            if (!C918060Zzw.LIZ(zLIZJ)) {
                z = (interfaceC927510aFB2 == null || (numLJIILJJIL = interfaceC927510aFB2.LJIILJJIL()) == null || numLJIILJJIL.intValue() != i) ? false : true;
            } else if (interfaceC927510aFB2 != null && (listLIZIZ3 = interfaceC927510aFB2.LIZIZ()) != null) {
                Iterator<PosIdentity> it2 = listLIZIZ3.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    PosIdentity next = it2.next();
                    if (next.LJFF(this.LL.LJ())) {
                        if (next != null) {
                        }
                    }
                }
            }
            if (LIZ()) {
                C933010aO3 c933010aO3 = new C933010aO3();
                if (z) {
                    C915850ZwN.LJIIJJI(24, 0L, "show", null, true);
                    strLJIJI = C497740JfY.LJIJI(2131853972);
                } else {
                    strLJIJI = C497740JfY.LJIJI(2131853967);
                }
                c933010aO3.LIZ = strLJIJI;
                c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNz
                    @Override // X.InterfaceC933880aPS
                    public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                        Long l;
                        Long l2;
                        String str = null;
                        if (z) {
                            C915850ZwN.LJIIJJI(24, 0L, "click", null, true);
                            EnumC945540aiG enumC945540aiG = EnumC945540aiG.SHRINK;
                            C953770avX currentDraftItem = this.getCurrentDraftItem();
                            if (currentDraftItem != null) {
                                l2 = currentDraftItem.LJIIL;
                            } else {
                                l2 = null;
                            }
                            C953770avX currentDraftItem2 = this.getCurrentDraftItem();
                            if (currentDraftItem2 != null) {
                                str = currentDraftItem2.LJIILIIL;
                            }
                            C946850akN.LJII(enumC945540aiG, l2, str);
                        } else {
                            EnumC945540aiG enumC945540aiG2 = EnumC945540aiG.EXPAND;
                            C953770avX currentDraftItem3 = this.getCurrentDraftItem();
                            if (currentDraftItem3 != null) {
                                l = currentDraftItem3.LJIIL;
                            } else {
                                l = null;
                            }
                            C953770avX currentDraftItem4 = this.getCurrentDraftItem();
                            if (currentDraftItem4 != null) {
                                str = currentDraftItem4.LJIILIIL;
                            }
                            C946850akN.LJII(enumC945540aiG2, l, str);
                        }
                        InterfaceC927510aFB interfaceC927510aFB3 = (InterfaceC927510aFB) new C304201Fw("ZOOM_SERVICE").LIZ();
                        if (interfaceC927510aFB3 != null) {
                            interfaceC927510aFB3.LJ(i, new AwS381S0200000_15(this, liveActionSheetDialog2, 38), !z, true);
                        }
                    }
                };
                arrayList.add(new C933070aO9(c933010aO3));
            }
            C918060Zzw c918060Zzw2 = C918060Zzw.LIZ;
            boolean zLIZJ2 = C930540aK4.LIZJ();
            c918060Zzw2.getClass();
            if (C918060Zzw.LIZ(zLIZJ2) && LIZ()) {
                Object objLJIIIZ2 = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
                if ((objLJIIIZ2 instanceof InterfaceC927510aFB) && (interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ2) != null && (listLIZIZ2 = interfaceC927510aFB.LIZIZ()) != null) {
                    Iterator<PosIdentity> it3 = listLIZIZ2.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        PosIdentity next2 = it3.next();
                        PosIdentity posIdentity = next2;
                        if (posIdentity.type == 2 && Intrinsics.LJFF(posIdentity.value, this.LL.LJ())) {
                            if (next2 == null) {
                                break;
                            }
                        }
                    }
                    if (interfaceC927510aFB2 != null) {
                        C915850ZwN.LJ("show", 0L, null, false, true);
                        C933010aO3 c933010aO32 = new C933010aO3();
                        c933010aO32.LIZ = C497740JfY.LJIJI(2131853912);
                        c933010aO32.LIZJ = new InterfaceC933880aPS() { // from class: X.0a1H
                            @Override // X.InterfaceC933880aPS
                            public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                                C915850ZwN.LJ("click", 0L, null, false, true);
                                InterfaceC927510aFB interfaceC927510aFB3 = (InterfaceC927510aFB) new C304201Fw("ZOOM_SERVICE").LIZ();
                                if (interfaceC927510aFB3 != null) {
                                    interfaceC927510aFB3.LJ(i, new AwS381S0200000_15(this, liveActionSheetDialog2, 37), true, false);
                                }
                            }
                        };
                        arrayList.add(new C933070aO9(c933010aO32));
                    }
                } else if (interfaceC927510aFB2 != null && (listLIZIZ = interfaceC927510aFB2.LIZIZ()) != null && listLIZIZ.size() == 1) {
                    C915850ZwN.LJ("show", 0L, null, false, true);
                    C933010aO3 c933010aO322 = new C933010aO3();
                    c933010aO322.LIZ = C497740JfY.LJIJI(2131853912);
                    c933010aO322.LIZJ = new InterfaceC933880aPS() { // from class: X.0a1H
                        @Override // X.InterfaceC933880aPS
                        public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                            C915850ZwN.LJ("click", 0L, null, false, true);
                            InterfaceC927510aFB interfaceC927510aFB3 = (InterfaceC927510aFB) new C304201Fw("ZOOM_SERVICE").LIZ();
                            if (interfaceC927510aFB3 != null) {
                                interfaceC927510aFB3.LJ(i, new AwS381S0200000_15(this, liveActionSheetDialog2, 37), true, false);
                            }
                        }
                    };
                    arrayList.add(new C933070aO9(c933010aO322));
                }
            }
            InterfaceC954180awC interfaceC954180awCLLJLL3 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL3 != null && (interfaceC937900aVwLLIIJLIL = interfaceC954180awCLLJLL3.LLIIJLIL()) != null && (layoutLJFF = interfaceC937900aVwLLIIJLIL.LJFF()) != null && layoutLJFF.isFixedType() && interfaceC927510aFB2 != null && (!interfaceC927510aFB2.LJIIIIZZ()) && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (interfaceC937900aVwLLIIJLIL2 = interfaceC954180awCLLJLL.LLIIJLIL()) != null && (interfaceC937820aVoLJJJJZ = interfaceC937900aVwLLIIJLIL2.LJJJJZ()) != null && (allLayoutWindows = interfaceC937820aVoLJJJJZ.getAllLayoutWindows()) != null) {
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC937840aVq interfaceC937840aVq : allLayoutWindows) {
                    if (interfaceC937840aVq.LJIILIIL()) {
                        arrayList2.add(interfaceC937840aVq);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    arrayList3.add(Integer.valueOf(((InterfaceC937840aVq) it4.next()).LJIILL()));
                }
                if (arrayList3.size() > 1) {
                    C933010aO3 c933010aO33 = new C933010aO3();
                    c933010aO33.LIZ = C497740JfY.LJIJI(2131854003);
                    c933010aO33.LIZJ = new InterfaceC933880aPS() { // from class: X.0aO1
                        @Override // X.InterfaceC933880aPS
                        public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                            FragmentManager fragmentManager;
                            DataChannel dataChannel = this.getDataChannel();
                            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                                C933080aOA c933080aOA = this;
                                int i2 = i;
                                NoticeboardSwitchSpotFragment noticeboardSwitchSpotFragment = new NoticeboardSwitchSpotFragment();
                                noticeboardSwitchSpotFragment.LLJLLL = i2;
                                c933080aOA.LLJJ = noticeboardSwitchSpotFragment.uS(fragmentManager);
                            }
                            liveActionSheetDialog2.dismiss();
                            C785410UrT.LIZ(liveActionSheetDialog2);
                        }
                    };
                    arrayList.add(new C933070aO9(c933010aO33));
                }
            }
            C933010aO3 c933010aO34 = new C933010aO3();
            c933010aO34.LIZ = C497740JfY.LJIJI(2131854000);
            c933010aO34.LIZJ = new InterfaceC933880aPS() { // from class: X.0aO0
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                    Long l;
                    EnumC945540aiG enumC945540aiG = EnumC945540aiG.EDIT;
                    C953770avX currentDraftItem = this.LIZ.getCurrentDraftItem();
                    String str = null;
                    if (currentDraftItem != null) {
                        l = currentDraftItem.LJIIL;
                    } else {
                        l = null;
                    }
                    C953770avX currentDraftItem2 = this.LIZ.getCurrentDraftItem();
                    if (currentDraftItem2 != null) {
                        str = currentDraftItem2.LJIILIIL;
                    }
                    C946850akN.LJII(enumC945540aiG, l, str);
                    liveActionSheetDialog2.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog2);
                    IInteractService iInteractServiceLIZLLL = C915980Zwa.LIZLLL();
                    Context context = this.LIZ.getContext();
                    DataChannel dataChannel = this.LIZ.getDataChannel();
                    EnumC952890au7 enumC952890au7 = EnumC952890au7.MASK;
                    C953610avH.LJJI.getClass();
                    String str2 = C953610avH.LJJII;
                    if (str2 == null) {
                        str2 = "";
                    }
                    iInteractServiceLIZLLL.Bg0(context, dataChannel, enumC952890au7, new C916750Zxp(2, 0L, str2), true, true, null, null, null, null);
                }
            };
            arrayList.add(new C933070aO9(c933010aO34));
            C933000aO2 c933000aO2 = new C933000aO2();
            c933000aO2.LIZ = C497740JfY.LJIJI(2131854001);
            c933000aO2.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNv
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v32, types: [T, X.0a1A] */
                /* JADX WARN: Type inference failed for: r0v34, types: [T, X.0a1A] */
                /* JADX WARN: Type inference failed for: r0v39, types: [T, X.0a1A] */
                /* JADX WARN: Type inference failed for: r0v43, types: [T, X.0a1A] */
                /* JADX WARN: Type inference failed for: r0v46, types: [T, X.0avX] */
                /* JADX WARN: Type inference failed for: r4v2, types: [T, X.0a1A] */
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                    LiveDialog liveDialogLIZ;
                    Long l;
                    ?? LJFF;
                    liveActionSheetDialog2.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog2);
                    MultiguestNoticeboardV2Setting multiguestNoticeboardV2Setting = MultiguestNoticeboardV2Setting.INSTANCE;
                    int i2 = 2131854009;
                    int i3 = 2131854013;
                    if (multiguestNoticeboardV2Setting.templateEnable()) {
                        C933080aOA c933080aOA = this.LIZ;
                        c933080aOA.getClass();
                        if (!multiguestNoticeboardV2Setting.isPreviewEnable()) {
                            i3 = 2131854012;
                        }
                        String strLJIJI2 = C497740JfY.LJIJI(i3);
                        String strLJIJI3 = C497740JfY.LJIJI(2131854009);
                        String strLJIJI4 = C497740JfY.LJIJI(2131854001);
                        String strLJIJI5 = C497740JfY.LJIJI(2131854971);
                        C259800zU c259800zU = new C259800zU();
                        ?? r4 = EnumC918820a1A.NOTHING;
                        c259800zU.element = r4;
                        C259800zU c259800zU2 = new C259800zU();
                        C953610avH.LJJI.getClass();
                        String str = C953610avH.LJJII;
                        if (str != null && (LJFF = C953760avW.LIZIZ.LIZ().LJFF(str)) != 0) {
                            c259800zU2.element = LJFF;
                        }
                        C953770avX c953770avX = (C953770avX) c259800zU2.element;
                        if (c953770avX != null && (l = c953770avX.LJIIL) != null && !c953770avX.LJIILJJIL) {
                            C953230auf c953230auf = C953230auf.LIZ;
                            String str2 = c953770avX.LJII;
                            c953230auf.getClass();
                            if (!C953230auf.LJIIJ(str2)) {
                                if (C953230auf.LJIILIIL(l.longValue())) {
                                    if (C953230auf.LJIIL(l.longValue())) {
                                        strLJIJI2 = C497740JfY.LJIJI(2131854983);
                                        strLJIJI3 = C497740JfY.LJIJI(2131854982);
                                        strLJIJI4 = C497740JfY.LJIJI(2131854984);
                                        c259800zU.element = EnumC918820a1A.UPDATE;
                                    } else {
                                        strLJIJI2 = C497740JfY.LJIJI(2131854986);
                                        strLJIJI3 = C497740JfY.LJIJI(2131854985);
                                        strLJIJI4 = C497740JfY.LJIJI(2131854977);
                                        c259800zU.element = EnumC918820a1A.CREATE;
                                    }
                                } else if (Intrinsics.LJFF(C953230auf.LJI(l.longValue()), c953770avX.LJII)) {
                                    strLJIJI2 = C497740JfY.LJIJI(2131854961);
                                    strLJIJI3 = C497740JfY.LJIJI(2131854959);
                                    strLJIJI4 = C497740JfY.LJIJI(2131854977);
                                    c259800zU.element = EnumC918820a1A.SAVE;
                                } else {
                                    strLJIJI2 = C497740JfY.LJIJI(2131854961);
                                    strLJIJI3 = C497740JfY.LJIJI(2131854960);
                                    strLJIJI4 = C497740JfY.LJIJI(2131854977);
                                    c259800zU.element = EnumC918820a1A.CREATE;
                                }
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("templateMaskOperation: ");
                        sbLIZ.append(c259800zU.element);
                        C20441214yg.LIZIZ("NoticeboardMask", C2188811AlT.LIZIZ(sbLIZ));
                        C933080aOA.LIZIZ((C953770avX) c259800zU2.element);
                        if (c259800zU.element != r4) {
                            C782110Um9 c782110Um9 = new C782110Um9(C520010KaN.LJJIJ(c933080aOA, true));
                            c782110Um9.LJIILLIIL = false;
                            c782110Um9.LJIILL = false;
                            c782110Um9.LIZJ = strLJIJI2;
                            c782110Um9.LJIIIZ(strLJIJI3);
                            c782110Um9.LJIILJJIL(strLJIJI4, new AcS187S0300000_15(c259800zU2, c259800zU, c933080aOA, 4));
                            c782110Um9.LJIIJJI(strLJIJI5, new InterfaceC743640TFa() { // from class: X.0aO7
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                }
                            });
                            C786410Ut5.E4(c782110Um9.LIZ());
                            return;
                        }
                        return;
                    }
                    C933080aOA c933080aOA2 = this.LIZ;
                    c933080aOA2.getClass();
                    if (!multiguestNoticeboardV2Setting.isPreviewEnable()) {
                        i3 = 2131854012;
                    }
                    String strLJIJI6 = C497740JfY.LJIJI(i3);
                    if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
                        i2 = 2131854010;
                    }
                    String strLJIJI7 = C497740JfY.LJIJI(i2);
                    String strLJIJI8 = C497740JfY.LJIJI(2131854001);
                    String strLJIJI9 = C497740JfY.LJIJI(2131854011);
                    Context contextLJJIJ = C520010KaN.LJJIJ(c933080aOA2, true);
                    if (contextLJJIJ != null) {
                        C782110Um9 c782110Um92 = new C782110Um9(contextLJJIJ);
                        c782110Um92.LJIILLIIL = false;
                        c782110Um92.LJIILL = false;
                        c782110Um92.LIZJ = strLJIJI6;
                        c782110Um92.LJIIIZ(strLJIJI7);
                        c782110Um92.LJIILJJIL(strLJIJI8, new AcS496S0100000_15(c933080aOA2, 22));
                        c782110Um92.LJIIJJI(strLJIJI9, new InterfaceC743640TFa() { // from class: X.0aO6
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        liveDialogLIZ = c782110Um92.LIZ();
                    } else {
                        liveDialogLIZ = null;
                    }
                    c933080aOA2.LLJJI = liveDialogLIZ;
                    if (liveDialogLIZ == null) {
                        return;
                    }
                    C786410Ut5.E4(liveDialogLIZ);
                }
            };
            arrayList.add(new C933060aO8(c933000aO2));
            C935270aRh c935270aRh = new C935270aRh(getContext());
            c935270aRh.LIZIZ(arrayList);
            C933100aOC c933100aOC = new C933100aOC();
            c933100aOC.LIZ = C497740JfY.LJIJI(2131851480);
            c933100aOC.LIZJ = new InterfaceC933880aPS() { // from class: X.0aOB
                @Override // X.InterfaceC933880aPS
                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                    liveActionSheetDialog2.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog2);
                }
            };
            c935270aRh.LIZLLL = new C933150aOH(c933100aOC);
            LiveActionSheetDialog liveActionSheetDialogLIZ = c935270aRh.LIZ();
            this.LLJILLL = liveActionSheetDialogLIZ;
            C786410Ut5.F4(liveActionSheetDialogLIZ);
        }
    }

    @Override // X.C1AXB
    public int getH() {
        return getHeight();
    }

    @Override // X.C1AXB
    public int getW() {
        return getWidth();
    }

    @Override // android.view.View, X.C1AXB
    public int getX() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getLeft();
    }

    @Override // android.view.View, X.C1AXB
    public int getY() {
        View view;
        Object parent = getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return -1;
        }
        return view.getTop();
    }

    public final DataChannel getDataChannel() {
        return this.LLILLJJLI;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.LLJILJIL;
    }

    public final EnumC933200aOM getRole() {
        return this.LLILLL;
    }

    public final InterfaceC937840aVq getWindow() {
        return this.LL;
    }

    public static void LIZIZ(C953770avX c953770avX) {
        Long l;
        String str;
        EnumC945540aiG enumC945540aiG = EnumC945540aiG.REMOVE;
        if (c953770avX != null) {
            l = c953770avX.LJIIL;
            str = c953770avX.LJIILIIL;
        } else {
            l = null;
            str = null;
        }
        C946850akN.LJII(enumC945540aiG, l, str);
        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
        if (interfaceC945610aiNLIZ != null) {
            interfaceC945610aiNLIZ.LJFF(null);
        }
    }

    public final void setClMaskFromXml(ConstraintLayout constraintLayout) {
        this.LLILZLL = constraintLayout;
    }

    public final void setLlTagFromXml(C19R8 c19r8) {
        this.LLIZ = c19r8;
    }

    public final void setTvTagFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setWindow(InterfaceC937840aVq interfaceC937840aVq) {
        this.LL = interfaceC937840aVq;
    }

    public C933080aOA(InterfaceC937840aVq interfaceC937840aVq, DataChannel dataChannel, Context context, EnumC933200aOM enumC933200aOM, InterfaceC940580aaG interfaceC940580aaG) {
        super(context);
        this.LL = interfaceC937840aVq;
        this.LLILLJJLI = dataChannel;
        this.LLILLL = enumC933200aOM;
        this.LLILZ = interfaceC940580aaG;
        this.LLJIJIL = new C11NJ();
        this.LLJILJIL = new LifecycleRegistry(this);
    }
}
