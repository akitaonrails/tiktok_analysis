package X;

import android.content.Context;
import com.bytedance.android.live.slot.IFrameSlot;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.common.settings.AnchorPinCardConfig;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS611S0100000_32;

/* JADX INFO: renamed from: X.17xg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21199417xg extends AbstractC21194117wp implements InterfaceC21201017xw {
    public final Context LLLJL;
    public final C21199017xc LLLL;
    public final C21203417yK LLLLII;
    public C21200017xm LLLLIIIILLL;
    public C21200117xn LLLLIIL;

    @Override // X.AbstractC21194117wp
    public final boolean LJJIJLIJ() {
        return true;
    }

    @Override // X.AbstractC21194117wp
    public final boolean LJJJI() {
        return false;
    }

    @Override // X.InterfaceC21201017xw
    public final void LIZJ() {
        C21200017xm c21200017xm;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LJ("checkToDismiss");
        C21200117xn c21200117xn = this.LLLLIIL;
        if (c21200117xn != null && (c21200017xm = this.LLLLIIIILLL) != null) {
            c21200017xm.LJFF(c21200117xn, true);
        }
        this.LLLLIIL = null;
        IFrameSlot.SlotViewModel slotViewModel = this.LLJIJIL;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, false);
        }
    }

    @Override // X.AbstractC21194117wp
    public final void LJJIFFI() {
        IFrameSlot.SlotViewModel slotViewModel = this.LLJIJIL;
        if (slotViewModel != null) {
            C21207817z2.LIZIZ(slotViewModel, false);
        }
        C1440005kM.LIZ(new C083G(1));
    }

    @Override // X.AbstractC21194117wp, X.AbstractC21203317yJ, com.bytedance.android.live.slot.AbsSlotWidget, X.InterfaceC1124060fMC
    public final void onDestroy() {
        String string;
        super.onDestroy();
        C21199917xl.LIZIZ(this.LLJILLL);
        C21208117z5 c21208117z5 = C21208117z5.LIZ;
        Room room = this.LLJILLL;
        if (room == null || (string = Long.valueOf(room.getId()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        c21208117z5.getClass();
        C21208117z5.LIZJ(string);
    }

    @Override // X.AbstractC21194117wp
    public final /* bridge */ /* synthetic */ AbstractC21198517xX LJJIJIIJI() {
        return this.LLLLII;
    }

    @Override // X.AbstractC21194117wp
    public final AbstractC21196817xG LJJIJL() {
        return this.LLLL;
    }

    @Override // X.InterfaceC1124060fMC
    public final Enum LLJ() {
        return EnumC1124020fM8.SLOT_LIVE_BOTTOM_POP_L2_ANCHOR;
    }

    public C21199417xg(Context context) {
        super(context, false);
        this.LLLJL = context;
        C21199017xc c21199017xc = new C21199017xc(this, this, this.LLJI);
        this.LLLL = c21199017xc;
        C21203417yK c21203417yK = new C21203417yK(context, c21199017xc.LJ, this.LLJI);
        c21203417yK.LLILZLL = this;
        this.LLLLII = c21203417yK;
    }

    @Override // X.InterfaceC21201017xw
    public final void LIZIZ(boolean z) throws Throwable {
        Long lValueOf;
        C21200117xn c21200117xn;
        Long lValueOf2;
        Long lValueOf3;
        String string;
        Object obj;
        long jLongValue;
        Long lLJIILIIL;
        C21199917xl c21199917xl = C21199917xl.LIZ;
        Room room = this.LLJILLL;
        Long lValueOf4 = null;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        C21200017xm c21200017xmLIZ = c21199917xl.LIZ(lValueOf);
        if (c21200017xmLIZ != null) {
            c21200017xmLIZ.LJI(4, null);
        }
        final UsPopupCardVO usPopupCardVO = this.LLLLII.LL;
        if (usPopupCardVO != null && C21194017wo.LIZIZ(usPopupCardVO)) {
            C21208117z5 c21208117z5 = C21208117z5.LIZ;
            Context context = this.LLLJL;
            Room room2 = this.LLJILLL;
            String str = CardStruct.IStatusCode.DEFAULT;
            if (room2 == null || (string = Long.valueOf(room2.getId()).toString()) == null) {
                string = CardStruct.IStatusCode.DEFAULT;
            }
            String strLIZJ = C21194017wo.LIZJ(usPopupCardVO);
            int i = usPopupCardVO.cardType;
            Long lValueOf5 = Long.valueOf(usPopupCardVO.productId);
            Room room3 = this.LLJILLL;
            if (room3 != null) {
                lValueOf4 = Long.valueOf(room3.getId());
            }
            C21192617wa c21192617wa = new C21192617wa(usPopupCardVO, lValueOf4);
            final C1743900vTw c1743900vTw = this.LLJILJILJ;
            final LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (z) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_enter_room_card", obj);
            if (!this.LLLILZLLLI) {
                str = "1";
            }
            linkedHashMap.put("is_sync_enter_room", str);
            String strLIZJ2 = this.LLJILJILJ.LIZJ("click_enter_room_time");
            if (strLIZJ2 != null && (lLJIILIIL = C2095008Iq.LJIILIIL(strLIZJ2)) != null) {
                jLongValue = lLJIILIIL.longValue();
            } else {
                jLongValue = 0;
            }
            linkedHashMap.put("click_enter_room_time", Long.valueOf(jLongValue));
            C21208217z6 c21208217z6 = new C21208217z6(context, string, strLIZJ, i, null, lValueOf5, c21192617wa, new AbstractC21191617wQ(usPopupCardVO, c1743900vTw, linkedHashMap) { // from class: X.17w4
                public static final List<String> LJFF = C1697810uHb.LJIIJJI("author_id", "room_id");
                public final C1743900vTw LJ;

                @Override // X.AbstractC21191617wQ
                public final Map<String, Object> LIZIZ() {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    linkedHashMap2.put("page_params", C1741890vQh.LJIIIIZZ(this.LIZIZ));
                    linkedHashMap2.put("track_params", C1741890vQh.LJIIIIZZ(LIZLLL()));
                    return linkedHashMap2;
                }

                @Override // X.AbstractC21191617wQ
                public final Map<String, Object> LIZLLL() {
                    String strLIZJ3;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (String str2 : LJFF) {
                        C1743900vTw c1743900vTw2 = this.LJ;
                        if (c1743900vTw2 == null || (strLIZJ3 = c1743900vTw2.LIZJ(str2)) == null) {
                            strLIZJ3 = "";
                        }
                        linkedHashMap2.put(str2, strLIZJ3);
                    }
                    linkedHashMap2.put("enter_from", "live_screen");
                    return linkedHashMap2;
                }

                {
                    super(usPopupCardVO.getLynxCardData(), linkedHashMap);
                    this.LJ = c1743900vTw;
                }
            }, usPopupCardVO.latencyInfo, null, 528);
            c21208117z5.getClass();
            C21208117z5.LIZLLL(c21208217z6);
        }
        if (this.LLLLIIIILLL == null) {
            Room room4 = this.LLJILLL;
            if (room4 != null) {
                lValueOf3 = Long.valueOf(room4.getId());
            } else {
                lValueOf3 = null;
            }
            this.LLLLIIIILLL = c21199917xl.LIZ(lValueOf3);
        }
        if (this.LLLLIIL == null) {
            C21200017xm c21200017xm = this.LLLLIIIILLL;
            if (c21200017xm == null || (c21200117xn = c21200017xm.LIZLLL(0)) == null) {
                c21200117xn = new C21200117xn(0, 200);
            }
            this.LLLLIIL = c21200117xn;
            UsPopupCardVO usPopupCardVO2 = this.LLLLII.LL;
            if (usPopupCardVO2 != null) {
                lValueOf2 = Long.valueOf(usPopupCardVO2.popCardId);
            } else {
                lValueOf2 = null;
            }
            c21200117xn.LJ = lValueOf2;
        }
        C21200117xn c21200117xn2 = this.LLLLIIL;
        if (c21200117xn2 != null) {
            c21200117xn2.LIZJ = new AwS611S0100000_32(this, 283);
        }
        C21200017xm c21200017xm2 = this.LLLLIIIILLL;
        if (c21200017xm2 != null) {
            c21200017xm2.LIZIZ(this.LLLLIIL);
        }
    }

    @Override // X.AbstractC21194117wp, X.AbstractC21203317yJ
    public final boolean LJJ(Map<String, Object> map) {
        return super.LJJ(map);
    }

    @Override // X.AbstractC21194117wp
    public final boolean LJJII(int i) {
        if (1 == ((AnchorPinCardConfig) C21201217xy.LIZIZ.getValue()).show) {
            return true;
        }
        return false;
    }
}
