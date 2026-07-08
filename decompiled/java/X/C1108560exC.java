package X;

import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.pincard.service.IPinCardService;
import com.bytedance.android.livesdk.chatroom.api.SubPinCard;
import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0exC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1108560exC extends AbstractC1108380ewu {
    public final int LLJILLL = 1;
    public final C01GW LLJJ = C452501pT.LIZIZ(new C1108830exd());

    @Override // X.AbstractC1108380ewu
    public final int LJIIIZ() {
        return this.LLJILLL;
    }

    @Override // X.AbstractC1108380ewu
    public final void LJIIJ(EnumC1108700exQ enumC1108700exQ) {
        String str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_customized_perk_pin_duration");
        c474500IjALIZ.LJIJJLI(LJI());
        c474500IjALIZ.LJJIIZI(this.LLJIJIL);
        c474500IjALIZ.LJJII(Long.valueOf((this.LLJI - this.LLJ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), "anchor_pin_duration");
        c474500IjALIZ.LJJII(enumC1108700exQ.name().toLowerCase(Locale.ROOT), "finished_type");
        if (C500260Jjc.LJIIZILJ(LJI())) {
            str = "anchor";
        } else {
            str = "moderator";
        }
        c474500IjALIZ.LJJII(str, "user_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1108380ewu
    public boolean LJIIL(C1108790exZ c1108790exZ) {
        long jLongValue;
        SubPinCard subPinCard = c1108790exZ.LIZ;
        if (C494680Jac.LJI(LJI()) || LJIIIIZZ().Qi(EnumC1107860ew4.SUB_PERKS) || !LJ(subPinCard)) {
            return false;
        }
        Long l = c1108790exZ.LIZJ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        this.LLJILJIL = jLongValue;
        ((C515810KKt) this.LLJJ.getValue()).LIZJ(LJFF(), this.LLILZIL, subPinCard, new C1108650exL(this, subPinCard, c1108790exZ));
        return true;
    }

    @Override // X.AbstractC1108380ewu
    public final void LJIIZILJ(final Function1<? super C512740K8y, Unit> function1) {
        if (LJIIIIZZ().Qi(EnumC1107860ew4.SUB_PERKS)) {
            LJIILLIIL(function1, true);
            return;
        }
        final C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_customized_perk_pin_confirm_click");
        c474500IjALIZ.LJIJJLI(LJI());
        c474500IjALIZ.LJJIIZI(this.LLJIJIL);
        C782110Um9 c782110Um9 = new C782110Um9(LJFF());
        c782110Um9.LJIIZILJ(2131843775);
        c782110Um9.LJII(2131843774);
        c782110Um9.LJIILIIL(2131843773, new InterfaceC743640TFa() { // from class: X.0exD
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                if (((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).Ly1()) {
                    ((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).bC1(new C1108760exW(this.LIZ, function1));
                } else {
                    this.LIZ.LJIILLIIL(function1, true);
                }
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII(this.LIZ.LLIZLLLIL.name().toLowerCase(Locale.ROOT), "original_card_type");
                c474500IjA.LJJII("confirm", "click_type");
                c474500IjA.LIZ();
            }
        });
        c782110Um9.LJIIJ(2131843772, new InterfaceC743640TFa() { // from class: X.0exH
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                this.LIZ.LJIILLIIL(function1, false);
                liveDialog.dismiss();
                C474500IjA c474500IjA = c474500IjALIZ;
                c474500IjA.LJJII("cancel", "click_type");
                c474500IjA.LIZ();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.AbstractC1108380ewu, X.InterfaceC1107910ew9
    public void LIZIZ(C1107460evQ c1107460evQ, Map<String, ? extends Object> map) {
        if (LJIIIIZZ().Qi(EnumC1107860ew4.SUB_PERKS) && this.LLJILJIL == UserService.getInstance().user().getCurrentUserId()) {
            LJIIJ(EnumC1108700exQ.OTHER);
        }
        super.LIZIZ(c1107460evQ, map);
    }

    @Override // X.AbstractC1108380ewu
    public final void LJIJ(EnumC1108700exQ enumC1108700exQ, Long l) {
        EnumC1108010ewJ enumC1108010ewJ;
        long jLongValue;
        IPinCardService iPinCardServiceLJIIIIZZ = LJIIIIZZ();
        EnumC1107860ew4 enumC1107860ew4 = EnumC1107860ew4.SUB_PERKS;
        int i = C1108690exP.LIZ[enumC1108700exQ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 4) {
                    enumC1108010ewJ = EnumC1108010ewJ.OTHERS;
                } else {
                    enumC1108010ewJ = EnumC1108010ewJ.MANUALLY_CLOSE;
                }
            } else {
                enumC1108010ewJ = EnumC1108010ewJ.COVER;
            }
        } else {
            enumC1108010ewJ = EnumC1108010ewJ.AUTO;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("reason", enumC1108700exQ);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        pairArr[1] = new Pair("operatorUserId", Long.valueOf(jLongValue));
        iPinCardServiceLJIIIIZZ.Rg(enumC1107860ew4, enumC1108010ewJ, C2097608Jq.LJIIIIZZ(pairArr));
    }
}
