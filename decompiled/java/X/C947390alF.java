package X;

import Y.AcS187S0300000_15;
import Y.AcS496S0100000_15;
import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.settting.InvitationInterceptorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0alF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C947390alF {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, final InterfaceC947410alH interfaceC947410alH, Function0 function0, Function0 function02) {
        List listSingletonList;
        if (!InvitationInterceptorSetting.INSTANCE.enabled()) {
            listSingletonList = C13BV.INSTANCE;
        } else if (interfaceC947410alH instanceof InterfaceC949420aoW) {
            final boolean z = !C13LP.LJJJJ(interfaceC947410alH, Collections.singletonList(C947400alG.LIZ));
            listSingletonList = C1697810uHb.LJIIJJI(new InterfaceC947380alE(z) { // from class: X.0alA
                public final boolean LIZ;

                {
                    this.LIZ = z;
                }

                @Override // X.InterfaceC947380alE
                public final void LIZ(Context context2, LifecycleOwner lifecycleOwner2, DataChannel dataChannel2, C947360alC c947360alC) {
                    Integer numValueOf;
                    String strLJIJI;
                    String strLJIJI2;
                    AbstractC1273900jFs liveCore;
                    InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
                    if (!C948770anT.LIZLLL()) {
                        c947360alC.invoke(Boolean.TRUE);
                        return;
                    }
                    InterfaceC769940UIe interfaceC769940UIe = (InterfaceC769940UIe) DataChannelGlobal.LLILZ.gg0(C930890aKd.class);
                    if (interfaceC769940UIe != null && (liveCore = interfaceC769940UIe.getLiveCore()) != null && (interfaceC1268690j7TLJIJJLI = liveCore.LJIJJLI()) != null) {
                        numValueOf = Integer.valueOf(interfaceC1268690j7TLJIJJLI.M3());
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null && (numValueOf.intValue() == 2 || numValueOf.intValue() == 3)) {
                        c947360alC.invoke(Boolean.TRUE);
                        return;
                    }
                    if (context2 == null) {
                        c947360alC.invoke(Boolean.FALSE);
                        return;
                    }
                    if (this.LIZ) {
                        strLJIJI = C497740JfY.LJIJI(2131851825);
                    } else {
                        strLJIJI = C497740JfY.LJIJI(2131851823);
                    }
                    if (this.LIZ) {
                        strLJIJI2 = C497740JfY.LJIJI(2131851824);
                    } else {
                        strLJIJI2 = C497740JfY.LJIJI(2131851822);
                    }
                    C782110Um9 c782110Um9 = new C782110Um9(context2);
                    c782110Um9.LIZJ = strLJIJI;
                    c782110Um9.LJIIIZ(strLJIJI2);
                    C494720Jag c494720Jag = new C494720Jag();
                    C755620TkW c755620TkW = new C755620TkW();
                    c755620TkW.LIZ = C497740JfY.LJIJI(2131851826);
                    c755620TkW.LIZJ = new AcS187S0300000_15(dataChannel2, this, c947360alC, 5);
                    c494720Jag.LIZ(new C0TZ2(c755620TkW));
                    C755630TkX c755630TkX = new C755630TkX();
                    c755630TkX.LIZ = "Cancel";
                    c755630TkX.LIZJ = new AcS496S0100000_15(c947360alC, 35);
                    c494720Jag.LIZ(new C0TZ3(c755630TkX));
                    c494720Jag.LIZIZ = 1;
                    c782110Um9.LIZJ(new C494730Jah(c494720Jag));
                    c782110Um9.LJIILLIIL = false;
                    c782110Um9.LJIILL = false;
                    C786410Ut5.E4(c782110Um9.LIZ());
                }
            }, new InterfaceC947380alE(interfaceC947410alH) { // from class: X.0aoV
                public final InterfaceC947410alH LIZ;

                {
                    this.LIZ = interfaceC947410alH;
                }

                @Override // X.InterfaceC947380alE
                public final void LIZ(Context context2, LifecycleOwner lifecycleOwner2, DataChannel dataChannel2, C947360alC c947360alC) {
                    String str;
                    if (context2 != null && dataChannel2 != null) {
                        GiftService giftService = GiftService.LLILLJJLI;
                        InterfaceC949480aoc viewerWishesService = giftService.getViewerWishesService();
                        int i = 1;
                        if (viewerWishesService != null && viewerWishesService.LIZIZ(dataChannel2)) {
                            InterfaceC947410alH interfaceC947410alH2 = this.LIZ;
                            if (interfaceC947410alH2 instanceof C947400alG) {
                                str = "exit_vw_when_receive_cohost_invitation";
                            } else if (interfaceC947410alH2 instanceof C949430aoX) {
                                str = "exit_vw_to_multiguest_find_guests";
                            } else if (interfaceC947410alH2 instanceof InterfaceC949420aoW) {
                                str = "exit_vw_to_cohost";
                            } else {
                                str = "exit_vw_to_multiguest";
                            }
                            if (interfaceC947410alH2 instanceof C949440aoY) {
                                i = 3;
                            } else if (!(interfaceC947410alH2 instanceof InterfaceC949420aoW)) {
                                i = 2;
                            }
                            InterfaceC949480aoc viewerWishesService2 = giftService.getViewerWishesService();
                            if (viewerWishesService2 != null) {
                                viewerWishesService2.LIZLLL(context2, lifecycleOwner2, dataChannel2, str, i, c947360alC);
                                return;
                            }
                            return;
                        }
                        c947360alC.invoke(Boolean.TRUE);
                        return;
                    }
                    c947360alC.invoke(Boolean.FALSE);
                }
            });
        } else {
            listSingletonList = Collections.singletonList(new InterfaceC947380alE(interfaceC947410alH) { // from class: X.0aoV
                public final InterfaceC947410alH LIZ;

                {
                    this.LIZ = interfaceC947410alH;
                }

                @Override // X.InterfaceC947380alE
                public final void LIZ(Context context2, LifecycleOwner lifecycleOwner2, DataChannel dataChannel2, C947360alC c947360alC) {
                    String str;
                    if (context2 != null && dataChannel2 != null) {
                        GiftService giftService = GiftService.LLILLJJLI;
                        InterfaceC949480aoc viewerWishesService = giftService.getViewerWishesService();
                        int i = 1;
                        if (viewerWishesService != null && viewerWishesService.LIZIZ(dataChannel2)) {
                            InterfaceC947410alH interfaceC947410alH2 = this.LIZ;
                            if (interfaceC947410alH2 instanceof C947400alG) {
                                str = "exit_vw_when_receive_cohost_invitation";
                            } else if (interfaceC947410alH2 instanceof C949430aoX) {
                                str = "exit_vw_to_multiguest_find_guests";
                            } else if (interfaceC947410alH2 instanceof InterfaceC949420aoW) {
                                str = "exit_vw_to_cohost";
                            } else {
                                str = "exit_vw_to_multiguest";
                            }
                            if (interfaceC947410alH2 instanceof C949440aoY) {
                                i = 3;
                            } else if (!(interfaceC947410alH2 instanceof InterfaceC949420aoW)) {
                                i = 2;
                            }
                            InterfaceC949480aoc viewerWishesService2 = giftService.getViewerWishesService();
                            if (viewerWishesService2 != null) {
                                viewerWishesService2.LIZLLL(context2, lifecycleOwner2, dataChannel2, str, i, c947360alC);
                                return;
                            }
                            return;
                        }
                        c947360alC.invoke(Boolean.TRUE);
                        return;
                    }
                    c947360alC.invoke(Boolean.FALSE);
                }
            });
        }
        LIZJ(context, lifecycleOwner, dataChannel, function02, function0, listSingletonList, 0);
    }

    public static void LIZJ(Context context, LifecycleOwner lifecycleOwner, DataChannel dataChannel, Function0 function0, Function0 function02, List list, int i) {
        if (!list.isEmpty() && i < list.size()) {
            ((InterfaceC947380alE) ListProtector.get(list, i)).LIZ(context, lifecycleOwner, dataChannel, new C947360alC(context, lifecycleOwner, dataChannel, function0, function02, list, i));
        } else {
            function0.invoke();
        }
    }
}
