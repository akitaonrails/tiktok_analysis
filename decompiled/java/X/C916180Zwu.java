package X;

import Y.AcS495S0100000_12;
import Y.AfS151S0200000_15;
import android.content.Context;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiLiveApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.api.ILinkMicService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AwS139S0201000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0Zwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916180Zwu {
    public static final List<Integer> LJFF = C1697810uHb.LJIIJJI(2, 3, 5, 8);
    public static final List<Integer> LJI = C1697810uHb.LJIIJJI(4, 6, 8);
    public final C11NJ LIZ;
    public final DataChannel LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(453));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(525));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS559S0100000_15(this, 1096));

    public final void LIZLLL(String str) {
        C1303170k15 c1303170k15Y22;
        if (str != null && (c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22()) != null) {
            c1303170k15Y22.LJJL(0, str, new InterfaceC1303160k14() { // from class: X.0Zwv
                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    this.LIZ.getClass();
                }
            }, null);
        }
    }

    public C916180Zwu(DataChannel dataChannel, C11NJ c11nj) {
        this.LIZ = c11nj;
        this.LIZIZ = dataChannel;
    }

    public final void LIZ(String str, final Function0 function0) {
        C1303170k15 c1303170k15Y22 = ((ILinkMicService) C1161920gLG.LIZJ(ILinkMicService.class)).y22();
        if (c1303170k15Y22 != null) {
            c1303170k15Y22.LJJL(0, str, new InterfaceC1303160k14() { // from class: X.0Zwx
                public final /* synthetic */ boolean LIZJ = false;

                @Override // X.InterfaceC1303160k14
                public final void LIZ(Layout layout) {
                    Integer next;
                    if (layout != null) {
                        int i = layout.micCount;
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null) {
                            int iLIZIZ = interfaceC954180awCLLJLL.LIZIZ();
                            if (iLIZIZ <= i) {
                                function0.invoke();
                                return;
                            }
                            EnumC918990a1R enumC918990a1RLIZ = C916560ZxW.LIZ(layout.businessType);
                            int i2 = iLIZIZ - 1;
                            int i3 = C916220Zwy.LIZ[enumC918990a1RLIZ.ordinal()];
                            Integer num = null;
                            if (i3 != 1 && i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
                                        C20441214yg.LJIIIZ("CancelZoomMoreGuidance", "do not guide");
                                        function0.invoke();
                                    } else {
                                        C916180Zwu c916180Zwu = this;
                                        c916180Zwu.LIZIZ(new AwS416S0200000_15(c916180Zwu, (C916180Zwu) function0, (Function0<Unit>) 110), this.LIZJ);
                                    }
                                } else {
                                    Iterator<Integer> it2 = C916180Zwu.LJI.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (next.intValue() >= i2) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    Integer num2 = next;
                                    if (num2 == null) {
                                        Iterator<Integer> it3 = C916180Zwu.LJFF.iterator();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                break;
                                            }
                                            Integer next2 = it3.next();
                                            if (next2.intValue() >= i2) {
                                                num = next2;
                                                break;
                                            }
                                        }
                                        Integer num3 = num;
                                        if (num3 != null) {
                                            C916180Zwu c916180Zwu2 = this;
                                            c916180Zwu2.LIZIZ(new AwS139S0201000_15(num3.intValue(), (int) c916180Zwu2, (C916180Zwu) function0, (Function0<Unit>) 9), this.LIZJ);
                                        }
                                    } else {
                                        C916180Zwu c916180Zwu3 = this;
                                        c916180Zwu3.LIZIZ(new AwS259S0300000_15(num2, (Integer) c916180Zwu3, (C916180Zwu) function0, (Function0<Unit>) 52), this.LIZJ);
                                    }
                                }
                            } else {
                                Iterator<Integer> it4 = C916180Zwu.LJFF.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        break;
                                    }
                                    Integer next3 = it4.next();
                                    if (next3.intValue() >= i2) {
                                        num = next3;
                                        break;
                                    }
                                }
                                Integer num4 = num;
                                if (num4 != null) {
                                    C916180Zwu c916180Zwu4 = this;
                                    c916180Zwu4.LIZIZ(new AwS139S0201000_15(num4.intValue(), (int) c916180Zwu4, (C916180Zwu) function0, (Function0<Unit>) 8), this.LIZJ);
                                }
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onZoomMoreCanceled currentLinkedSize=");
                            sbLIZ.append(iLIZIZ);
                            sbLIZ.append(" currentLayoutName=");
                            sbLIZ.append(enumC918990a1RLIZ);
                            C20441214yg.LJIIIZ("CancelZoomMoreGuidance", C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
            }, null);
        }
    }

    public final void LIZIZ(Function0 function0, boolean z) {
        Context context;
        if (z) {
            function0.invoke();
            return;
        }
        DataChannel dataChannel = this.LIZIZ;
        if (dataChannel == null || (context = (Context) dataChannel.gg0(C956860b0W.class)) == null) {
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131843526);
        c782110Um9.LJII(2131843525);
        c782110Um9.LJIILIIL(2131843583, new AcS495S0100000_12(function0, 79));
        c782110Um9.LJIIJ(2131843510, new InterfaceC743640TFa() { // from class: X.0Zww
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        c782110Um9.LJIILL = false;
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    public final void LIZJ(String str, int i, Function1 function1) {
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        long id;
        String str2;
        int i2;
        MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModelGL0;
        C935540aS8 state;
        MultiGuestDataHolder multiGuestDataHolderLIZJ = C916490ZxP.LIZJ();
        if (multiGuestDataHolderLIZJ != null && (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolderLIZJ.LIZIZ()) != null) {
            MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZ = MultiLiveAnchorPanelSettings.LIZ(multiLiveAnchorPanelSettingsLIZIZ, 0, 0, 0, 8388607);
            multiLiveAnchorPanelSettingsLIZ.layoutType = 0;
            multiLiveAnchorPanelSettingsLIZ.fixMicNumAction = i;
            C480460Ism.LIZ().getClass();
            MultiLiveApi multiLiveApi = (MultiLiveApi) C480460Ism.LIZLLL(MultiLiveApi.class);
            Room room = (Room) this.LIZJ.getValue();
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            long jLJIILL = C921180a4y.LJIILL(C915980Zwa.LJIIIIZZ());
            long jIntValue = ((Number) this.LIZLLL.getValue()).intValue();
            int i3 = multiLiveAnchorPanelSettingsLIZ.layoutType;
            int i4 = multiLiveAnchorPanelSettingsLIZ.fixMicNumAction;
            int i5 = multiLiveAnchorPanelSettingsLIZ.allowViewerReq;
            int i6 = multiLiveAnchorPanelSettingsLIZ.onlyAllowFollowerReq;
            ISharedBgAbility iSharedBgAbility = (ISharedBgAbility) this.LJ.getValue();
            if (iSharedBgAbility != null && (multiGuestSharedBgAnchorViewModelGL0 = iSharedBgAbility.GL0()) != null && (state = multiGuestSharedBgAnchorViewModelGL0.getState()) != null) {
                str2 = state.LLILZ;
            } else {
                str2 = null;
            }
            String strLIZ = C936270aTJ.LIZ(str2);
            int i7 = multiLiveAnchorPanelSettingsLIZ.applierSortSetting;
            long j = multiLiveAnchorPanelSettingsLIZ.applierSortGiftScoreThreshold;
            int i8 = multiLiveAnchorPanelSettingsLIZ.enableShowMultiGuestLayout;
            if (C931790aM5.LIZIZ()) {
                i2 = 4;
            } else {
                i2 = 0;
            }
            this.LIZ.LIZ(multiLiveApi.updateAnchorPanelSettings(id, jLJIILL, jIntValue, i3, i4, i5, i6, str, strLIZ, i2, i7, j, 0, 0, 0, 0, 0, i8, C924810aAp.LJ().LJJIIJ).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS151S0200000_15(multiLiveAnchorPanelSettingsLIZ, function1, 66), new C516201zk(function1, 315)));
        }
    }
}
