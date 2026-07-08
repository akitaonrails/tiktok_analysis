package X;

import androidx.fragment.app.FragmentManager;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS338S0000000_15;

/* JADX INFO: renamed from: X.0bXy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C977600bXy extends C2217421BqW implements Function1<EnumC919170a1j, Unit> {
    public C977600bXy(Object obj) {
        super(1, obj, C977560bXu.class, "handleLynxErrorDuringInvited", "handleLynxErrorDuringInvited(Lcom/bytedance/android/live/liveinteract/match/MatchType;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC919170a1j enumC919170a1j) {
        EnumC919170a1j enumC919170a1j2 = enumC919170a1j;
        C977560bXu c977560bXu = (C977560bXu) this.receiver;
        c977560bXu.getClass();
        C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", "Lynx error callback");
        c977560bXu.LIZLLL();
        MatchBaseWidget matchBaseWidget = c977560bXu.LIZ;
        if (matchBaseWidget != null) {
            if (enumC919170a1j2 == EnumC919170a1j.MATCH_TYPE_2V2 && C915980Zwa.LJII().LLILZLL(true).size() == 2) {
                C977650bY3.LJFF((C977630bY1) matchBaseWidget.y1(C977630bY1.class), null, c977560bXu.LIZJ, AFwS203S0000000_15.get$arr$(315), c977560bXu.LJIILJJIL, false);
            } else {
                int i = C917370Zyp.LIZ[enumC919170a1j2.ordinal()];
                FragmentManager fragmentManager = null;
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            C20441214yg.LIZIZ("CombinedMatchInviterCoordinator", "unrecognized match type");
                        } else {
                            GiftMode giftMode = c977560bXu.LJFF;
                            boolean z = c977560bXu.LJ;
                            LinkDialog linkDialog = new LinkDialog(matchBaseWidget);
                            EnumC977660bY4 enumC977660bY4 = EnumC977660bY4.TYPE_INDIVIDUAL_MATCH_INVITE;
                            C979910bbh c979910bbh = new C979910bbh(matchBaseWidget, giftMode, z, true);
                            linkDialog.LLILZIL = enumC977660bY4;
                            linkDialog.LLILZLL = c979910bbh;
                            c977560bXu.LJIILIIL = linkDialog;
                            DataChannel dataChannel = c977560bXu.LIZJ;
                            if (dataChannel != null) {
                                fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class);
                            }
                            linkDialog.show(fragmentManager, "CombinedMatchInviterCoordinator");
                            LinkDialog linkDialog2 = c977560bXu.LJIILIIL;
                            if (linkDialog2 != null) {
                                linkDialog2.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(c977560bXu, 19));
                            }
                        }
                    } else {
                        C979770bbT c979770bbT = new C979770bbT(matchBaseWidget, c977560bXu.LJ, "", AFwS338S0000000_15.get$arr$(10));
                        LinkDialog linkDialog3 = new LinkDialog(matchBaseWidget);
                        linkDialog3.LLILZIL = EnumC977660bY4.TYPE_TWO_MATCH_INVITER;
                        linkDialog3.LLILZLL = c979770bbT;
                        c977560bXu.LJIILIIL = linkDialog3;
                        DataChannel dataChannel2 = c977560bXu.LIZJ;
                        if (dataChannel2 != null) {
                            fragmentManager = (FragmentManager) dataChannel2.gg0(C748880TZe.class);
                        }
                        linkDialog3.show(fragmentManager, "CombinedMatchInviterCoordinator");
                        LinkDialog linkDialog4 = c977560bXu.LJIILIIL;
                        if (linkDialog4 != null) {
                            linkDialog4.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(c977560bXu, 21));
                        }
                    }
                } else {
                    LinkDialog linkDialogLIZJ = C977650bY3.LIZJ(matchBaseWidget, matchBaseWidget, c977560bXu.LJI, c977560bXu.LJFF, false, AFwS338S0000000_15.get$arr$(9), c977560bXu.LJ, true);
                    c977560bXu.LJIILIIL = linkDialogLIZJ;
                    DataChannel dataChannel3 = c977560bXu.LIZJ;
                    if (dataChannel3 != null) {
                        fragmentManager = (FragmentManager) dataChannel3.gg0(C748880TZe.class);
                    }
                    linkDialogLIZJ.show(fragmentManager, "CombinedMatchInviterCoordinator");
                    LinkDialog linkDialog5 = c977560bXu.LJIILIIL;
                    if (linkDialog5 != null) {
                        linkDialog5.setOnDismissListener(new DialogInterfaceOnDismissListenerC987010bn9(c977560bXu, 20));
                    }
                }
            }
            C975060bTs.LIZ("livesdk_match_inviter_lynx_fallback_success", new HashMap());
        }
        return Unit.LIZ;
    }
}
