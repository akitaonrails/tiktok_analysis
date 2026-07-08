package X;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.guest.GuestApplyEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestReserveResponse;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.AudienceReserveUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aG3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C928050aG3 implements C0IMT<Integer> {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJI;
    public View LL;
    public C16FS LLILLJJLI;
    public C19GN LLILLL;
    public DataChannel LLILZ;
    public C926940aEG LLILZIL;
    public Context LLILZLL;
    public C11NJ LLIZ;
    public Function1<? super Boolean, Unit> LLIZLLLIL;
    public final C304201Fw LLJ = new C304201Fw("MULTI_GUEST_DATA_HOLDER");

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C928050aG3.class, "dataHolder", "getDataHolder()Lcom/bytedance/android/live/liveinteract/multiguestv3/main/common/MultiGuestDataHolder;", 0);
        C13LE.LIZ.getClass();
        LLJI = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL() {
        if (C925150aBN.LJJIL(true, false, 2)) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToNoPermission");
            C500260Jjc.LJIILIIL(this.LL);
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            return;
        }
        if (C929810aIt.LIZ()) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToCancelReverse");
            C500260Jjc.LLFFF(this.LL);
            C500260Jjc.LLFFF(this.LLILLJJLI);
            LIZJ(2131841110, R.style.a82);
            return;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        if (num != null) {
            if (num.intValue() == -1 || num.intValue() == 0) {
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToIdle");
                C500260Jjc.LLFFF(this.LL);
                C500260Jjc.LLFFF(this.LLILLJJLI);
                C925320aBe c925320aBe = C925320aBe.LIZ;
                DataChannel dataChannel = this.LLILZ;
                c925320aBe.getClass();
                if (C925320aBe.LIZJ(dataChannel)) {
                    LIZJ(2131841110, R.style.a85);
                    return;
                } else {
                    LIZJ(2131843980, R.style.a7g);
                    return;
                }
            }
            if (num.intValue() == 1) {
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToWaiting");
                C500260Jjc.LLFFF(this.LL);
                C500260Jjc.LLFFF(this.LLILLJJLI);
                LIZJ(2131840602, R.style.a85);
                return;
            }
            if (num.intValue() == 2) {
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "viewStateToOnline");
                C500260Jjc.LJIILIIL(this.LL);
                C500260Jjc.LJIILIIL(this.LLILLJJLI);
            }
        }
    }

    public C928050aG3() {
        C948450amx.LIZIZ.LIZJ(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(boolean z) {
        C19GN c19gn;
        Room room;
        if (C929810aIt.LIZ()) {
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onClickCancelReservation");
            C11NJ c11nj = this.LLIZ;
            if (c11nj != null) {
                C921390a5J c921390a5J = C921390a5J.LIZ;
                Context context = this.LLILZLL;
                DataChannel dataChannel = this.LLILZ;
                if (dataChannel != null) {
                    room = (Room) dataChannel.gg0(RoomChannel.class);
                } else {
                    room = null;
                }
                InterfaceC921410a5L interfaceC921410a5L = new InterfaceC921410a5L() { // from class: X.0aG4
                    @Override // X.InterfaceC921410a5L
                    public final void LIZ(MultiGuestReserveResponse.ResponseData responseData) {
                        long j;
                        AudienceReserveUserInfo audienceReserveUserInfo;
                        C928050aG3 c928050aG3 = this.LIZ;
                        c928050aG3.getClass();
                        C1143300frE.LJIIJJI().getClass();
                        AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onCancelReserveSuccess");
                        if (responseData != null && (audienceReserveUserInfo = responseData.reserveUserInfo) != null) {
                            j = audienceReserveUserInfo.reserveId;
                        } else {
                            j = 0;
                        }
                        c928050aG3.LIZ(j, "click", true);
                        C929810aIt.LIZIZ(1);
                        C929810aIt.LIZLLL = 0L;
                        c928050aG3.LIZLLL();
                        Function1<? super Boolean, Unit> function1 = c928050aG3.LLIZLLLIL;
                        if (function1 != null) {
                            function1.invoke(Boolean.TRUE);
                        }
                    }

                    @Override // X.InterfaceC921410a5L
                    public final void onFailed(Throwable th) {
                        String message;
                        C928050aG3 c928050aG3 = this.LIZ;
                        c928050aG3.getClass();
                        C1143300frE c1143300frELJIIJJI = C1143300frE.LJIIJJI();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onCancelReserveFailed, throwable=");
                        if (th != null) {
                            message = th.getMessage();
                        } else {
                            message = null;
                        }
                        sbLIZ.append(message);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        c1143300frELJIIJJI.getClass();
                        AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", strLIZIZ);
                        c928050aG3.LIZ(C929810aIt.LIZLLL, "click", true);
                        Function1<? super Boolean, Unit> function1 = c928050aG3.LLIZLLLIL;
                        if (function1 != null) {
                            function1.invoke(Boolean.FALSE);
                        }
                    }
                };
                c921390a5J.getClass();
                C921390a5J.LIZIZ(context, room, c11nj, interfaceC921410a5L);
            }
            LIZ(C929810aIt.LIZLLL, "show", true);
            return;
        }
        Integer num = (Integer) C924790aAn.LIZLLL().LIZIZ;
        boolean z2 = false;
        int i = -1;
        if (num != null) {
            if (num.intValue() != -1 && num.intValue() != 0) {
                if (num.intValue() != 1 || z) {
                    return;
                }
                C1143300frE.LJIIJJI().getClass();
                AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onClickCancelApply");
                C19GN c19gn2 = this.LLILLL;
                if (c19gn2 != null && c19gn2.isShowing() && (c19gn = this.LLILLL) != null) {
                    c19gn.dismiss();
                    C785410UrT.LIZ(c19gn);
                }
                C19GO c19go = new C19GO(this.LLILZLL);
                c19go.LJI(2131844676);
                c19go.LIZIZ(2131844677);
                c19go.LJ(2131844675, new DialogInterfaceOnClickListenerC986970bn5(this, 5), false);
                c19go.LIZJ(2131843825, new DialogInterface.OnClickListener() { // from class: X.0aGG
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        dialogInterface.dismiss();
                    }
                }, false);
                C19GN c19gnLIZ = c19go.LIZ();
                this.LLILLL = c19gnLIZ;
                c19gnLIZ.setCanceledOnTouchOutside(false);
                C19GN c19gn3 = this.LLILLL;
                if (c19gn3 != null) {
                    C926630aDl.LIZ(c19gn3, 5, true, false, false, 120);
                }
                C19GN c19gn4 = this.LLILLL;
                if (c19gn4 != null) {
                    C786410Ut5.M4(c19gn4);
                }
                LIZ(0L, "show", false);
                return;
            }
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onClickApply");
            Integer num2 = (Integer) C924790aAn.LIZLLL().LIZIZ;
            if ((num2 == null || num2.intValue() != 2) && C921180a4y.LJIIJJI(C915980Zwa.LJIIIIZZ()) != 5) {
                C925320aBe c925320aBe = C925320aBe.LIZ;
                DataChannel dataChannel2 = this.LLILZ;
                c925320aBe.getClass();
                if (C925320aBe.LIZJ(dataChannel2)) {
                    C1143300frE.LJIIJJI().getClass();
                    AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "state is STATE_IDLE but in INVITE_PRE_APPROVE");
                    C925320aBe.LIZ(this.LLILZLL, this.LLILZ, false);
                    return;
                }
                C927240aEk c927240aEk = new C927240aEk("applyV", "applyBtn");
                C928100aG8.LIZ(c927240aEk);
                c927240aEk.LIZ();
                DataChannel dataChannel3 = this.LLILZ;
                if (dataChannel3 != null) {
                    C926940aEG c926940aEG = this.LLILZIL;
                    if (c926940aEG != null) {
                        i = c926940aEG.LIZIZ;
                    }
                    Integer numValueOf = Integer.valueOf(i);
                    C926940aEG c926940aEG2 = this.LLILZIL;
                    if (c926940aEG2 != null) {
                        z2 = c926940aEG2.LIZJ;
                    }
                    dataChannel3.LC0(GuestApplyEvent.class, new C925770aCN(numValueOf, 0, 3, false, 0, z2, 0, 0L, null, 0L, null, 8058));
                    return;
                }
                return;
            }
            C1143300frE.LJIIJJI().getClass();
            AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "state is STATE_ONLINE or LinkMicState is FRAME_LINKED");
        }
    }

    @Override // X.C0IMT
    public final void onChanged(Integer num) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LIZ("ModeratorsMangeDialogGuestOperationViewSet", "onChanged");
        LIZLLL();
    }

    public final void LIZJ(int i, int i2) {
        C16FS c16fs = this.LLILLJJLI;
        if (c16fs != null) {
            c16fs.setText(i);
        }
        C16FS c16fs2 = this.LLILLJJLI;
        if (c16fs2 != null) {
            c16fs2.j0(i2);
        }
    }

    public final void LIZ(long j, String str, boolean z) {
        long jCurrentTimeMillis;
        String str2;
        MultiGuestDataHolder multiGuestDataHolder;
        C304201Fw c304201Fw = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJI;
        MultiGuestDataHolder multiGuestDataHolder2 = (MultiGuestDataHolder) c304201Fw.LIZ();
        if (multiGuestDataHolder2 != null) {
            jCurrentTimeMillis = multiGuestDataHolder2.LJI;
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        if (z) {
            MultiGuestDataHolder multiGuestDataHolder3 = (MultiGuestDataHolder) this.LLJ.LIZ();
            if (multiGuestDataHolder3 != null) {
                jCurrentTimeMillis = multiGuestDataHolder3.LJII;
            } else {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            str2 = "reservation";
        } else {
            str2 = "apply";
        }
        C925640aCA.LJIIZILJ(str, System.currentTimeMillis() - jCurrentTimeMillis, j, str2, null, null, 0, 0, null, null, this.LLILZ, 1008);
        if (Intrinsics.LJFF(str, "click") && (multiGuestDataHolder = (MultiGuestDataHolder) this.LLJ.LIZ()) != null) {
            multiGuestDataHolder.LJI = System.currentTimeMillis();
        }
    }
}
