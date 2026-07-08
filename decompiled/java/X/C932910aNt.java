package X;

import Y.AcS187S0300000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.action.LiveActionSheetDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.switchspot.SwitchSpotDialogFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownEntranceClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.GuestShowdownOnMaskClickEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.anchor.ui.NoticeboardSwitchSpotFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.guest.ClickNoticeboardEvent;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.android.livesdk.model.MultiGuestExpandEvent;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aNt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C932910aNt extends C933210aON {
    public final InterfaceC920220a3Q LIZJ;
    public LiveActionSheetDialog LIZLLL;
    public Long LJ;

    public static C953770avX LJI() {
        C953770avX c953770avXLJFF;
        C953610avH.LJJI.getClass();
        String str = C953610avH.LJJII;
        if (str == null || (c953770avXLJFF = C953760avW.LIZIZ.LIZ().LJFF(str)) == null) {
            return null;
        }
        return c953770avXLJFF;
    }

    public static void LJIIIIZZ(C953770avX c953770avX) {
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

    public final boolean LJFF(C957020b0m c957020b0m) {
        Boolean boolValueOf;
        InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
        if ((interfaceC302601FgLIZ == null || !interfaceC302601FgLIZ.LJIJI()) && !((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(this.LIZ)) {
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            Boolean boolValueOf2 = null;
            if (interfaceC938530aWxLIZ != null) {
                boolValueOf = Boolean.valueOf(interfaceC938530aWxLIZ.isRunning());
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJIFFI(boolValueOf)) {
                C01GW<C927600aFK> c01gw = C927600aFK.LIZIZ;
                C307001Gy.LIZ().getClass();
                if (!C01ZD.LIZ(7)) {
                    return true;
                }
                MultiGuestSpotExtra multiGuestExtra = c957020b0m.getMultiGuestExtra();
                if (multiGuestExtra != null) {
                    boolValueOf2 = Boolean.valueOf(multiGuestExtra.isSingleZoomEnabled);
                }
                if (C500260Jjc.LJJJI(boolValueOf2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void LJII(C934280aQ6 c934280aQ6, final C957020b0m c957020b0m) {
        String strLIZLLL;
        String str;
        InterfaceC954180awC interfaceC954180awCLLJLL;
        OnLineMicInfo onLineMicInfoLLII;
        MicPositionInfo micPositionInfo;
        InterfaceC927510aFB interfaceC927510aFB;
        Integer numLJIILJJIL;
        final boolean z;
        C933130aOF c933070aO9;
        PosIdentity posIdentity;
        List<PosIdentity> listLIZIZ;
        MultiGuestSpotExtra multiGuestExtra;
        String strLJIJI;
        List<PosIdentity> listLIZIZ2;
        if (C930540aK4.LIZJ()) {
            int i = 0;
            final Context contextLJJIJ = C520010KaN.LJJIJ(c934280aQ6, false);
            if (contextLJJIJ == null) {
                contextLJJIJ = c934280aQ6.getContext();
            }
            PosIdentity posIdentity2 = c957020b0m.getPosIdentity();
            if (posIdentity2 != null && posIdentity2.type == 2 && (str = posIdentity2.value) != null && (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) != null && (onLineMicInfoLLII = interfaceC954180awCLLJLL.LLII(str)) != null && (micPositionInfo = onLineMicInfoLLII.micPositionData) != null) {
                final int i2 = micPositionInfo.position;
                LiveActionSheetDialog liveActionSheetDialog = this.LIZLLL;
                if (liveActionSheetDialog != null) {
                    liveActionSheetDialog.dismiss();
                    C785410UrT.LIZ(liveActionSheetDialog);
                }
                Object objLJIIIZ = C948450amx.LIZIZ.LJIIIZ("ZOOM_SERVICE");
                if (objLJIIIZ instanceof InterfaceC927510aFB) {
                    interfaceC927510aFB = (InterfaceC927510aFB) objLJIIIZ;
                } else {
                    interfaceC927510aFB = null;
                }
                ArrayList arrayList = new ArrayList();
                C918060Zzw c918060Zzw = C918060Zzw.LIZ;
                boolean zLIZJ = C930540aK4.LIZJ();
                c918060Zzw.getClass();
                if (C918060Zzw.LIZ(zLIZJ)) {
                    if (interfaceC927510aFB != null && (listLIZIZ2 = interfaceC927510aFB.LIZIZ()) != null) {
                        Iterator<PosIdentity> it2 = listLIZIZ2.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PosIdentity next = it2.next();
                            if (next.LJFF(str)) {
                                if (next != null) {
                                }
                            }
                        }
                    }
                    z = false;
                } else if (interfaceC927510aFB != null && (numLJIILJJIL = interfaceC927510aFB.LJIILJJIL()) != null && numLJIILJJIL.intValue() == i2) {
                    z = true;
                } else {
                    z = false;
                }
                if (LJFF(c957020b0m)) {
                    C933010aO3 c933010aO3 = new C933010aO3();
                    if (z) {
                        C915850ZwN.LJIIJJI(24, 0L, "show", null, true);
                        strLJIJI = C497740JfY.LJIJI(2131853972);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131853967);
                    }
                    c933010aO3.LIZ = strLJIJI;
                    c933010aO3.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNy
                        @Override // X.InterfaceC933880aPS
                        public final void LIZ(final LiveActionSheetDialog liveActionSheetDialog2) {
                            Long l;
                            Long l2;
                            String str2 = null;
                            if (z) {
                                C915850ZwN.LJIIJJI(24, 0L, "click", null, true);
                                EnumC945540aiG enumC945540aiG = EnumC945540aiG.SHRINK;
                                this.getClass();
                                C953770avX c953770avXLJI = C932910aNt.LJI();
                                if (c953770avXLJI != null) {
                                    l2 = c953770avXLJI.LJIIL;
                                } else {
                                    l2 = null;
                                }
                                this.getClass();
                                C953770avX c953770avXLJI2 = C932910aNt.LJI();
                                if (c953770avXLJI2 != null) {
                                    str2 = c953770avXLJI2.LJIILIIL;
                                }
                                C946850akN.LJII(enumC945540aiG, l2, str2);
                            } else {
                                EnumC945540aiG enumC945540aiG2 = EnumC945540aiG.EXPAND;
                                this.getClass();
                                C953770avX c953770avXLJI3 = C932910aNt.LJI();
                                if (c953770avXLJI3 != null) {
                                    l = c953770avXLJI3.LJIIL;
                                } else {
                                    l = null;
                                }
                                this.getClass();
                                C953770avX c953770avXLJI4 = C932910aNt.LJI();
                                if (c953770avXLJI4 != null) {
                                    str2 = c953770avXLJI4.LJIILIIL;
                                }
                                C946850akN.LJII(enumC945540aiG2, l, str2);
                            }
                            PosIdentity posIdentity3 = c957020b0m.getPosIdentity();
                            if (posIdentity3 != null) {
                                final boolean z2 = z;
                                final C932910aNt c932910aNt = this;
                                final C957020b0m c957020b0m2 = c957020b0m;
                                InterfaceC927510aFB interfaceC927510aFB2 = (InterfaceC927510aFB) new C304201Fw("ZOOM_SERVICE").LIZ();
                                if (interfaceC927510aFB2 != null) {
                                    interfaceC927510aFB2.LIZ(posIdentity3, !z2, true, new InterfaceC920110a3F() { // from class: X.0aNs
                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZ(int i3, String str3, String str4, Throwable th) {
                                        }

                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZJ(String str3) {
                                            LiveActionSheetDialog liveActionSheetDialog3 = liveActionSheetDialog2;
                                            liveActionSheetDialog3.dismiss();
                                            C785410UrT.LIZ(liveActionSheetDialog3);
                                            if (!z2) {
                                                c932910aNt.LIZ.FQ2(MultiGuestExpandEvent.class);
                                            }
                                        }

                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                                            LiveActionSheetDialog liveActionSheetDialog3 = liveActionSheetDialog2;
                                            liveActionSheetDialog3.dismiss();
                                            C785410UrT.LIZ(liveActionSheetDialog3);
                                            c932910aNt.LJIIIZ(c957020b0m2, list, function1);
                                        }
                                    });
                                }
                            }
                        }
                    };
                    arrayList.add(new C933070aO9(c933010aO3));
                }
                C918060Zzw c918060Zzw2 = C918060Zzw.LIZ;
                boolean zLIZJ2 = C930540aK4.LIZJ();
                c918060Zzw2.getClass();
                String str2 = "show";
                if (C918060Zzw.LIZ(zLIZJ2) && LJFF(c957020b0m) && (((posIdentity = c957020b0m.getPosIdentity()) == null || posIdentity.type != 2 || posIdentity.value == null || (multiGuestExtra = c957020b0m.getMultiGuestExtra()) == null || !multiGuestExtra.isEnlarged) && interfaceC927510aFB != null && (listLIZIZ = interfaceC927510aFB.LIZIZ()) != null && listLIZIZ.size() == 1)) {
                    str2 = "show";
                    C915850ZwN.LJ(str2, 0L, null, false, true);
                    C933010aO3 c933010aO32 = new C933010aO3();
                    c933010aO32.LIZ = C497740JfY.LJIJI(2131853912);
                    c933010aO32.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNq
                        @Override // X.InterfaceC933880aPS
                        public final void LIZ(final LiveActionSheetDialog liveActionSheetDialog2) {
                            C915850ZwN.LJ("click", 0L, null, false, true);
                            PosIdentity posIdentity3 = c957020b0m.getPosIdentity();
                            if (posIdentity3 != null) {
                                final C932910aNt c932910aNt = this;
                                final C957020b0m c957020b0m2 = c957020b0m;
                                InterfaceC927510aFB interfaceC927510aFB2 = (InterfaceC927510aFB) new C304201Fw("ZOOM_SERVICE").LIZ();
                                if (interfaceC927510aFB2 != null) {
                                    interfaceC927510aFB2.LIZ(posIdentity3, true, false, new InterfaceC920110a3F() { // from class: X.0aNr
                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZ(int i3, String str3, String str4, Throwable th) {
                                        }

                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZJ(String str3) {
                                            LiveActionSheetDialog liveActionSheetDialog3 = liveActionSheetDialog2;
                                            liveActionSheetDialog3.dismiss();
                                            C785410UrT.LIZ(liveActionSheetDialog3);
                                            c932910aNt.LIZ.FQ2(MultiGuestExpandEvent.class);
                                        }

                                        @Override // X.InterfaceC920110a3F
                                        public final void LIZIZ(List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
                                            c932910aNt.LJIIIZ(c957020b0m2, list, function1);
                                        }
                                    });
                                }
                            }
                        }
                    };
                    arrayList.add(new C933070aO9(c933010aO32));
                }
                boolean zLIZ = C932490aND.LIZ(C930540aK4.LIZJ());
                if ((this.LIZJ.LJI() && interfaceC927510aFB != null && (!interfaceC927510aFB.LJIIIIZZ())) || zLIZ) {
                    List<C957020b0m> listLJIIIZ = this.LIZJ.LJIIIZ();
                    ArrayList arrayList2 = new ArrayList();
                    for (C957020b0m c957020b0m2 : listLJIIIZ) {
                        PosIdentity posIdentity3 = c957020b0m2.getPosIdentity();
                        if (posIdentity3 != null && posIdentity3.type == 0) {
                            arrayList2.add(c957020b0m2);
                        }
                    }
                    if (arrayList2.size() >= 1 || zLIZ) {
                        if (C932490aND.LIZ(C930540aK4.LIZJ())) {
                            boolean zLIZIZ = C932820aNk.LIZIZ(c957020b0m.getPosIdentity());
                            PosIdentity posIdentity4 = c957020b0m.getPosIdentity();
                            int spotId = (int) c957020b0m.getSpotId();
                            MultiGuestSpotExtra multiGuestExtra2 = c957020b0m.getMultiGuestExtra();
                            if (multiGuestExtra2 != null) {
                                i = multiGuestExtra2.spotRank;
                            }
                            C917670ZzJ.LIZJ(str2, zLIZIZ, new C917680ZzK(posIdentity4, i, spotId), "");
                        }
                        if (C932820aNk.LIZIZ(c957020b0m.getPosIdentity())) {
                            C933100aOC c933100aOC = new C933100aOC();
                            c933100aOC.LIZLLL = RedDotExtensionKt.LJIILLIIL(C0UX6.MULTI_GUEST_SWITCH_SPOT_RED_DOT);
                            c933100aOC.LIZ = C497740JfY.LJIJI(2131854003);
                            c933100aOC.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNw
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // X.InterfaceC933880aPS
                                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                                    Long lUS;
                                    int i3;
                                    RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_SWITCH_SPOT_RED_DOT);
                                    FragmentManager fragmentManager = (FragmentManager) this.LIZ.LIZ.gg0(C748880TZe.class);
                                    if (fragmentManager != null) {
                                        C932910aNt c932910aNt = this.LIZ;
                                        C957020b0m c957020b0m3 = c957020b0m;
                                        int i4 = i2;
                                        if (C932490aND.LIZ(C930540aK4.LIZJ())) {
                                            boolean zLIZIZ2 = C932820aNk.LIZIZ(c957020b0m3.getPosIdentity());
                                            PosIdentity posIdentity5 = c957020b0m3.getPosIdentity();
                                            float f = C942200acs.LIZ;
                                            int iLIZLLL = C942200acs.LIZLLL(c957020b0m3.getPosIdentity());
                                            MultiGuestSpotExtra multiGuestExtra3 = c957020b0m3.getMultiGuestExtra();
                                            if (multiGuestExtra3 != null) {
                                                i3 = multiGuestExtra3.spotRank;
                                            } else {
                                                i3 = 0;
                                            }
                                            C917670ZzJ.LIZJ("click", zLIZIZ2, new C917680ZzK(posIdentity5, i3, iLIZLLL), "");
                                            C259800zU c259800zU = new C259800zU();
                                            String str3 = SwitchSpotDialogFragment._pnsPageId;
                                            C932830aNl.LIZ(c957020b0m3, c932910aNt.LIZ, null, new C5183020f(c259800zU, (C259800zU<Long>) 2));
                                            lUS = (Long) c259800zU.element;
                                        } else {
                                            NoticeboardSwitchSpotFragment noticeboardSwitchSpotFragment = new NoticeboardSwitchSpotFragment();
                                            noticeboardSwitchSpotFragment.LLJLLL = i4;
                                            lUS = noticeboardSwitchSpotFragment.uS(fragmentManager);
                                        }
                                        c932910aNt.LJ = lUS;
                                    }
                                    liveActionSheetDialog2.dismiss();
                                    C785410UrT.LIZ(liveActionSheetDialog2);
                                }
                            };
                            c933070aO9 = new C933150aOH(c933100aOC);
                        } else {
                            C933010aO3 c933010aO33 = new C933010aO3();
                            c933010aO33.LIZLLL = RedDotExtensionKt.LJIILLIIL(C0UX6.MULTI_GUEST_SWITCH_SPOT_RED_DOT);
                            c933010aO33.LIZ = C497740JfY.LJIJI(2131854003);
                            c933010aO33.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNw
                                /* JADX WARN: Multi-variable type inference failed */
                                @Override // X.InterfaceC933880aPS
                                public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                                    Long lUS;
                                    int i3;
                                    RedDotExtensionKt.LIZ(C0UX6.MULTI_GUEST_SWITCH_SPOT_RED_DOT);
                                    FragmentManager fragmentManager = (FragmentManager) this.LIZ.LIZ.gg0(C748880TZe.class);
                                    if (fragmentManager != null) {
                                        C932910aNt c932910aNt = this.LIZ;
                                        C957020b0m c957020b0m3 = c957020b0m;
                                        int i4 = i2;
                                        if (C932490aND.LIZ(C930540aK4.LIZJ())) {
                                            boolean zLIZIZ2 = C932820aNk.LIZIZ(c957020b0m3.getPosIdentity());
                                            PosIdentity posIdentity5 = c957020b0m3.getPosIdentity();
                                            float f = C942200acs.LIZ;
                                            int iLIZLLL = C942200acs.LIZLLL(c957020b0m3.getPosIdentity());
                                            MultiGuestSpotExtra multiGuestExtra3 = c957020b0m3.getMultiGuestExtra();
                                            if (multiGuestExtra3 != null) {
                                                i3 = multiGuestExtra3.spotRank;
                                            } else {
                                                i3 = 0;
                                            }
                                            C917670ZzJ.LIZJ("click", zLIZIZ2, new C917680ZzK(posIdentity5, i3, iLIZLLL), "");
                                            C259800zU c259800zU = new C259800zU();
                                            String str3 = SwitchSpotDialogFragment._pnsPageId;
                                            C932830aNl.LIZ(c957020b0m3, c932910aNt.LIZ, null, new C5183020f(c259800zU, (C259800zU<Long>) 2));
                                            lUS = (Long) c259800zU.element;
                                        } else {
                                            NoticeboardSwitchSpotFragment noticeboardSwitchSpotFragment = new NoticeboardSwitchSpotFragment();
                                            noticeboardSwitchSpotFragment.LLJLLL = i4;
                                            lUS = noticeboardSwitchSpotFragment.uS(fragmentManager);
                                        }
                                        c932910aNt.LJ = lUS;
                                    }
                                    liveActionSheetDialog2.dismiss();
                                    C785410UrT.LIZ(liveActionSheetDialog2);
                                }
                            };
                            c933070aO9 = new C933070aO9(c933010aO33);
                        }
                        arrayList.add(c933070aO9);
                    }
                }
                C933010aO3 c933010aO34 = new C933010aO3();
                c933010aO34.LIZ = C497740JfY.LJIJI(2131854000);
                c933010aO34.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNx
                    @Override // X.InterfaceC933880aPS
                    public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                        Long l;
                        EnumC945540aiG enumC945540aiG = EnumC945540aiG.EDIT;
                        this.LIZ.getClass();
                        C953770avX c953770avXLJI = C932910aNt.LJI();
                        String str3 = null;
                        if (c953770avXLJI != null) {
                            l = c953770avXLJI.LJIIL;
                        } else {
                            l = null;
                        }
                        this.LIZ.getClass();
                        C953770avX c953770avXLJI2 = C932910aNt.LJI();
                        if (c953770avXLJI2 != null) {
                            str3 = c953770avXLJI2.LJIILIIL;
                        }
                        C946850akN.LJII(enumC945540aiG, l, str3);
                        liveActionSheetDialog2.dismiss();
                        C785410UrT.LIZ(liveActionSheetDialog2);
                        IInteractService iInteractServiceLIZLLL = C915980Zwa.LIZLLL();
                        Context context = contextLJJIJ;
                        DataChannel dataChannel = this.LIZ.LIZ;
                        EnumC952890au7 enumC952890au7 = EnumC952890au7.MASK;
                        C953610avH.LJJI.getClass();
                        String str4 = C953610avH.LJJII;
                        if (str4 == null) {
                            str4 = "";
                        }
                        iInteractServiceLIZLLL.Bg0(context, dataChannel, enumC952890au7, new C916750Zxp(2, 0L, str4), true, true, null, null, null, null);
                    }
                };
                arrayList.add(new C933070aO9(c933010aO34));
                C933000aO2 c933000aO2 = new C933000aO2();
                c933000aO2.LIZ = C497740JfY.LJIJI(2131854001);
                c933000aO2.LIZJ = new InterfaceC933880aPS() { // from class: X.0aNu
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v26, types: [T, X.0a1A] */
                    /* JADX WARN: Type inference failed for: r0v28, types: [T, X.0a1A] */
                    /* JADX WARN: Type inference failed for: r0v33, types: [T, X.0a1A] */
                    /* JADX WARN: Type inference failed for: r0v37, types: [T, X.0a1A] */
                    /* JADX WARN: Type inference failed for: r0v40, types: [T, X.0avX] */
                    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.0a1A] */
                    @Override // X.InterfaceC933880aPS
                    public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                        Long l;
                        ?? LJFF;
                        liveActionSheetDialog2.dismiss();
                        C785410UrT.LIZ(liveActionSheetDialog2);
                        MultiguestNoticeboardV2Setting multiguestNoticeboardV2Setting = MultiguestNoticeboardV2Setting.INSTANCE;
                        int i3 = 2131854009;
                        int i4 = 2131854013;
                        if (multiguestNoticeboardV2Setting.templateEnable()) {
                            C932910aNt c932910aNt = this.LIZ;
                            Context context = contextLJJIJ;
                            c932910aNt.getClass();
                            if (!multiguestNoticeboardV2Setting.isPreviewEnable()) {
                                i4 = 2131854012;
                            }
                            String strLJIJI2 = C497740JfY.LJIJI(i4);
                            String strLJIJI3 = C497740JfY.LJIJI(2131854009);
                            String strLJIJI4 = C497740JfY.LJIJI(2131854001);
                            String strLJIJI5 = C497740JfY.LJIJI(2131854971);
                            C259800zU c259800zU = new C259800zU();
                            ?? r4 = EnumC918820a1A.NOTHING;
                            c259800zU.element = r4;
                            C259800zU c259800zU2 = new C259800zU();
                            C953610avH.LJJI.getClass();
                            String str3 = C953610avH.LJJII;
                            if (str3 != null && (LJFF = C953760avW.LIZIZ.LIZ().LJFF(str3)) != 0) {
                                c259800zU2.element = LJFF;
                            }
                            C953770avX c953770avX = (C953770avX) c259800zU2.element;
                            if (c953770avX != null && (l = c953770avX.LJIIL) != null && !c953770avX.LJIILJJIL) {
                                C953230auf c953230auf = C953230auf.LIZ;
                                String str4 = c953770avX.LJII;
                                c953230auf.getClass();
                                if (!C953230auf.LJIIJ(str4)) {
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
                            C932910aNt.LJIIIIZZ((C953770avX) c259800zU2.element);
                            if (c259800zU.element != r4) {
                                C782110Um9 c782110Um9 = new C782110Um9(context);
                                c782110Um9.LJIILLIIL = false;
                                c782110Um9.LJIILL = false;
                                c782110Um9.LIZJ = strLJIJI2;
                                c782110Um9.LJIIIZ(strLJIJI3);
                                c782110Um9.LJIILJJIL(strLJIJI4, new AcS187S0300000_15(c259800zU2, c259800zU, context, 0));
                                c782110Um9.LJIIJJI(strLJIJI5, new InterfaceC743640TFa() { // from class: X.0aO4
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
                        C932910aNt c932910aNt2 = this.LIZ;
                        Context context2 = contextLJJIJ;
                        c932910aNt2.getClass();
                        if (!multiguestNoticeboardV2Setting.isPreviewEnable()) {
                            i4 = 2131854012;
                        }
                        String strLJIJI6 = C497740JfY.LJIJI(i4);
                        if (multiguestNoticeboardV2Setting.isPreviewEnable()) {
                            i3 = 2131854010;
                        }
                        String strLJIJI7 = C497740JfY.LJIJI(i3);
                        String strLJIJI8 = C497740JfY.LJIJI(2131854001);
                        String strLJIJI9 = C497740JfY.LJIJI(2131854011);
                        C782110Um9 c782110Um92 = new C782110Um9(context2);
                        c782110Um92.LJIILLIIL = false;
                        c782110Um92.LJIILL = false;
                        c782110Um92.LIZJ = strLJIJI6;
                        c782110Um92.LJIIIZ(strLJIJI7);
                        c782110Um92.LJIILJJIL(strLJIJI8, new AcS496S0100000_15(c932910aNt2, 0));
                        c782110Um92.LJIIJJI(strLJIJI9, new InterfaceC743640TFa() { // from class: X.0aO5
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                            }
                        });
                        C786410Ut5.E4(c782110Um92.LIZ());
                    }
                };
                arrayList.add(new C933060aO8(c933000aO2));
                C935270aRh c935270aRh = new C935270aRh(contextLJJIJ);
                c935270aRh.LIZIZ(arrayList);
                C933100aOC c933100aOC2 = new C933100aOC();
                c933100aOC2.LIZ = C497740JfY.LJIJI(2131851480);
                c933100aOC2.LIZJ = new InterfaceC933880aPS() { // from class: X.0Zzr
                    @Override // X.InterfaceC933880aPS
                    public final void LIZ(LiveActionSheetDialog liveActionSheetDialog2) {
                        liveActionSheetDialog2.dismiss();
                        C785410UrT.LIZ(liveActionSheetDialog2);
                    }
                };
                c935270aRh.LIZLLL = new C933150aOH(c933100aOC2);
                LiveActionSheetDialog liveActionSheetDialogLIZ = c935270aRh.LIZ();
                this.LIZLLL = liveActionSheetDialogLIZ;
                C786410Ut5.F4(liveActionSheetDialogLIZ);
                return;
            }
            return;
        }
        if (c957020b0m.getStreamId() != null) {
            String streamId = c957020b0m.getStreamId();
            InterfaceC938530aWx interfaceC938530aWxLIZ = C01IB.LIZ();
            if (interfaceC938530aWxLIZ != null) {
                strLIZLLL = interfaceC938530aWxLIZ.LIZLLL();
            } else {
                strLIZLLL = null;
            }
            if (Intrinsics.LJFF(streamId, strLIZLLL)) {
                this.LIZ.FQ2(GuestShowdownOnMaskClickEvent.class);
                this.LIZ.LC0(GuestShowdownEntranceClickEvent.class, new C334801Rq((String) null, (String) null, 7));
                return;
            }
        }
        this.LIZ.LC0(ClickNoticeboardEvent.class, Unit.LIZ);
    }

    public C932910aNt(DataChannel dataChannel, C934280aQ6 c934280aQ6, InterfaceC920220a3Q interfaceC920220a3Q) {
        super(c934280aQ6, dataChannel);
        this.LIZJ = interfaceC920220a3Q;
    }

    public final void LJIIIZ(C957020b0m c957020b0m, List<PosIdentity> list, Function1<? super PosIdentity, Unit> function1) {
        Context context = (Context) this.LIZ.gg0(C956860b0W.class);
        if (context != null) {
            DialogC933230aOP dialogC933230aOPLIZ = C920230a3R.LIZ(context, true, (PosIdentity) ListProtector.get(list, 0), (PosIdentity) ListProtector.get(list, 1), new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 0));
            dialogC933230aOPLIZ.setOnDismissListener(new DialogInterfaceOnDismissListenerC987000bn8(dialogC933230aOPLIZ, this, 0));
            C786410Ut5.N4(dialogC933230aOPLIZ);
            PosIdentity posIdentity = c957020b0m.getPosIdentity();
            if (posIdentity != null) {
                C915850ZwN.LJIIJ(posIdentity.value, true);
            }
        }
    }
}
