package Y;

import X.C0DSB;
import X.C1119210fEN;
import X.C1846730y9n;
import X.C1846860yA0;
import X.C1846870yA1;
import X.C1846880yA2;
import X.C1846890yA3;
import X.C1854760yMk;
import X.C19748512Ol;
import X.C1C7U;
import X.C2174781A9k;
import X.C439101nJ;
import X.C766270U4b;
import X.C786410Ut5;
import X.InterfaceC1094280eaA;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.android.live.rank.impl.sticker.base.RankStickerExtra;
import com.bytedance.android.livesdk.dataChannel.InsertStickerChannel;
import com.bytedance.android.livesdk.livesetting.rank.TeamRankStickerSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.inputv2.inner.InputInnerAssem;

/* JADX INFO: loaded from: classes28.dex */
public class ARunnableS46S0110000_27 implements Runnable {
    public final int $t;
    public Object l0;
    public boolean z1;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        RankStickerExtra rankStickerExtra = new RankStickerExtra();
        boolean z = this.z1;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIL;
        rankStickerExtra.rankType = rankTypeV2.type;
        rankStickerExtra.showType = z ? "auto_show" : "active_set";
        DataChannel dataChannel = ((C1846870yA1) this.l0).LIZ;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.type = 11;
        roomSticker.xPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(81);
        roomSticker.yPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(31);
        C1119210fEN.LIZ.getClass();
        roomSticker.id = C1119210fEN.LIZ(1007L, rankTypeV2);
        roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankStickerExtra);
        dataChannel.zW(InsertStickerChannel.class, roomSticker);
        if (this.z1) {
            return;
        }
        C766270U4b.LIZLLL(2131855327);
    }

    public final void LIZ$1() {
        RankStickerExtra rankStickerExtra = new RankStickerExtra();
        boolean z = this.z1;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIIL;
        rankStickerExtra.rankType = rankTypeV2.type;
        rankStickerExtra.showType = z ? "auto_show" : "active_set";
        DataChannel dataChannel = ((C1846860yA0) this.l0).LIZ;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.type = 8;
        roomSticker.xPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(81);
        roomSticker.yPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(31);
        C1119210fEN.LIZ.getClass();
        roomSticker.id = C1119210fEN.LIZ(1002L, rankTypeV2);
        roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankStickerExtra);
        dataChannel.zW(InsertStickerChannel.class, roomSticker);
        if (this.z1) {
            return;
        }
        C766270U4b.LIZLLL(2131855327);
    }

    public final void LIZ$2() {
        RankStickerExtra rankStickerExtra = new RankStickerExtra();
        boolean z = this.z1;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIILJJIL;
        rankStickerExtra.rankType = rankTypeV2.type;
        rankStickerExtra.showType = z ? "auto_show" : "active_set";
        DataChannel dataChannel = ((C1846890yA3) this.l0).LIZ;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.type = 12;
        roomSticker.xPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(81);
        roomSticker.yPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(31);
        C1119210fEN.LIZ.getClass();
        roomSticker.id = C1119210fEN.LIZ(1010L, rankTypeV2);
        roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankStickerExtra);
        dataChannel.zW(InsertStickerChannel.class, roomSticker);
        if (this.z1) {
            return;
        }
        C766270U4b.LIZLLL(2131855327);
    }

    public final void LIZ$3() {
        RankStickerExtra rankStickerExtra = new RankStickerExtra();
        boolean z = this.z1;
        RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
        rankStickerExtra.rankType = rankTypeV2.type;
        rankStickerExtra.showType = z ? "auto_show" : "active_set";
        DataChannel dataChannel = ((C1846880yA2) this.l0).LIZ;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.type = 10;
        roomSticker.xPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(81);
        roomSticker.yPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(31);
        C1119210fEN.LIZ.getClass();
        roomSticker.id = C1119210fEN.LIZ(1004L, rankTypeV2);
        roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankStickerExtra);
        dataChannel.zW(InsertStickerChannel.class, roomSticker);
        if (this.z1) {
            return;
        }
        C766270U4b.LIZLLL(2131855327);
    }

    public final void LIZ$4() {
        RankStickerExtra rankStickerExtra = new RankStickerExtra();
        boolean z = this.z1;
        RankTypeV2 rankTypeV2 = RankTypeV2.LJIJJLI;
        rankStickerExtra.rankType = rankTypeV2.type;
        rankStickerExtra.showType = z ? "auto_show" : "active_set";
        DataChannel dataChannel = ((C1846730y9n) this.l0).LIZ;
        RoomSticker roomSticker = new RoomSticker(false, null, null, 0, 0, 0, 0, "", "", 0, false, null, "", false, "", "", false);
        roomSticker.type = 9;
        int iLIZ = C439101nJ.LIZ(12);
        TeamRankStickerSetting teamRankStickerSetting = TeamRankStickerSetting.INSTANCE;
        roomSticker.xPosition = iLIZ + C439101nJ.LIZ(teamRankStickerSetting.getUseNewStyle() ? 80 : 60);
        roomSticker.yPosition = C439101nJ.LIZ(12) + C439101nJ.LIZ(teamRankStickerSetting.getUseNewStyle() ? 40 : 30);
        C1119210fEN.LIZ.getClass();
        roomSticker.id = C1119210fEN.LIZ(1003L, rankTypeV2);
        roomSticker.extra = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, rankStickerExtra);
        dataChannel.zW(InsertStickerChannel.class, roomSticker);
        InterfaceC1094280eaA.Pd.LJFF(Boolean.FALSE);
        if (this.z1) {
            return;
        }
        C766270U4b.LIZLLL(2131855327);
    }

    public static final void run$0(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("InputInnerAssem@e064.updateExpandButtonVisibility$1");
        try {
            View view = ((InputInnerAssem) aRunnableS46S0110000_27.l0).LLJJJIL;
            if (view != null && view.getParent() != null) {
                if (aRunnableS46S0110000_27.z1) {
                    View view2 = ((InputInnerAssem) aRunnableS46S0110000_27.l0).LLJJJIL;
                    if (view2 != null) {
                        C0DSB.LIZJ(view2);
                    }
                } else {
                    View view3 = ((InputInnerAssem) aRunnableS46S0110000_27.l0).LLJJJIL;
                    if (view3 != null) {
                        C0DSB.LIZIZ(view3);
                    }
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("InputInnerAssem@e064.updateExpandButtonVisibility$1");
    }

    public static final void run$1(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoInputView@807b.updateExpandButtonVisibility$1");
        try {
            if (((View) aRunnableS46S0110000_27.l0).getParent() != null) {
                if (aRunnableS46S0110000_27.z1) {
                    C0DSB.LIZJ((View) aRunnableS46S0110000_27.l0);
                } else {
                    C0DSB.LIZIZ((View) aRunnableS46S0110000_27.l0);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoInputView@807b.updateExpandButtonVisibility$1");
    }

    public static final void run$2(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TakoInputView@807b.showSoftKeyboard$1");
        try {
            ((C1854760yMk) aRunnableS46S0110000_27.l0).getInputView().requestFocus();
            if (aRunnableS46S0110000_27.z1) {
                C2174781A9k.LIZIZ((C1854760yMk) aRunnableS46S0110000_27.l0);
            } else {
                InputMethodManager imm = ((C1854760yMk) aRunnableS46S0110000_27.l0).getImm();
                if (imm != null) {
                    imm.showSoftInput(((C1854760yMk) aRunnableS46S0110000_27.l0).getInputView(), 1);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoInputView@807b.showSoftKeyboard$1");
    }

    public static final void run$3(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        InputMethodManager inputMethodManager;
        C1C7U.LIZ("TakoKeyboardUtil@2a09.showKeyboard$1$1");
        try {
            ((View) aRunnableS46S0110000_27.l0).requestFocus();
            if (aRunnableS46S0110000_27.z1) {
                C2174781A9k.LIZIZ((View) aRunnableS46S0110000_27.l0);
            } else {
                Object objH2 = C786410Ut5.H2(((View) aRunnableS46S0110000_27.l0).getContext(), "input_method");
                if ((objH2 instanceof InputMethodManager) && (inputMethodManager = (InputMethodManager) objH2) != null) {
                    inputMethodManager.showSoftInput((View) aRunnableS46S0110000_27.l0, 1);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TakoKeyboardUtil@2a09.showKeyboard$1$1");
    }

    public static final void run$4(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("ClassRankStickerCenter@75bc.addSticker$addRunnable$1");
        try {
            aRunnableS46S0110000_27.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ClassRankStickerCenter@75bc.addSticker$addRunnable$1");
    }

    public static final void run$5(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("DailyRankStickerCenter@a3bf.addSticker$addRunnable$1");
        try {
            aRunnableS46S0110000_27.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DailyRankStickerCenter@a3bf.addSticker$addRunnable$1");
    }

    public static final void run$6(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("GameDailyRankStickerCenter@73ed.addSticker$addRunnable$1");
        try {
            aRunnableS46S0110000_27.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("GameDailyRankStickerCenter@73ed.addSticker$addRunnable$1");
    }

    public static final void run$7(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("HourlyRankStickerCenter@74c7.addSticker$addRunnable$1");
        try {
            aRunnableS46S0110000_27.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("HourlyRankStickerCenter@74c7.addSticker$addRunnable$1");
    }

    public static final void run$8(ARunnableS46S0110000_27 aRunnableS46S0110000_27) {
        boolean zLIZ;
        C1C7U.LIZ("TeamRankStickerCenter@ad4a.addSticker$addRunnable$1");
        try {
            aRunnableS46S0110000_27.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TeamRankStickerCenter@ad4a.addSticker$addRunnable$1");
    }

    public ARunnableS46S0110000_27(Object obj, boolean z, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z1 = z;
    }
}
