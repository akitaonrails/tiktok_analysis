package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.gift.model.GiftLimitGetResponse;
import com.bytedance.android.livesdk.giftlimitnotification.api.GiftLimitNotificationApi;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00xu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C250000xu {
    public static boolean LJFF;
    public static boolean LJI;
    public static long LJII;
    public static String LJIIIIZZ;
    public static String LJIIIZ;
    public static String LJIIJJI;
    public static String LJIIL;
    public static List<Integer> LJIILJJIL;
    public static boolean LJIILL;
    public static boolean LJJIIJ;
    public static boolean LJJIIZ;
    public static final MutableLiveData<Integer> LJJIIZI;
    public static final MutableLiveData<Boolean> LJJIJ;
    public static String LJJIJIIJI;
    public static String LJJIJIIJIL;
    public static DataChannel LJJIJIL;
    public static final BPEAHandler LJJIJL;
    public static final RunnableC250200xw LJJIJLIJ;
    public static final C250000xu LIZ = new C250000xu();
    public static final String LIZIZ = C250000xu.class.getName();
    public static boolean LIZJ = true;
    public static boolean LIZLLL = true;
    public static boolean LJ = true;
    public static int LJIIJ = 7;
    public static String LJIILIIL = "";
    public static float LJIILLIIL = 1.0f;
    public static String LJIIZILJ = "";
    public static String LJIJ = "";
    public static int LJIJI = -1;
    public static int LJIJJ = -1;
    public static String LJIJJLI = "";
    public static int LJIL = -1;
    public static final MutableLiveData<Integer> LJJ = new MutableLiveData<>(-1);
    public static String LJJI = "";
    public static String LJJIFFI = "";
    public static boolean LJJII = true;
    public static String LJJIII = "";
    public static String LJJIIJZLJL = "";

    static {
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.postValue(0);
        LJJIIZI = mutableLiveData;
        LJJIJ = new MutableLiveData<>(null);
        LJJIJIIJI = "";
        LJJIJIIJIL = "";
        LJJIJL = new BPEAHandler(Looper.getMainLooper());
        LJJIJLIJ = RunnableC250200xw.LL;
    }

    public static Integer LIZ() {
        if (!Intrinsics.LJFF(LJIJJLI, "COIN")) {
            return LJJ.getValue();
        }
        return Integer.valueOf((int) ((LJJ.getValue() != null ? r0.intValue() : 0) * LJIILLIIL));
    }

    public static int LIZIZ() {
        int i = LJIJI;
        int i2 = LJIJJ;
        return i <= i2 ? i2 : i;
    }

    public static void LIZLLL() {
        LJJIJ.setValue(null);
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            String str = LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("room===>");
            sbLIZ.append(room);
            sbLIZ.append(" roomId====>");
            sbLIZ.append(room.getId());
            C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            ((GiftLimitNotificationApi) C480460Ism.LIZLLL(GiftLimitNotificationApi.class)).giftLimitNotificationInitial(room.getId()).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00xr
                @Override // X.C09JN
                public final void accept(Object obj) {
                    int iIntValue;
                    int iIntValue2;
                    C1C7U.LIZ("GiftLimitNotificationManager@c802.init$1");
                    BaseResponse baseResponse = (BaseResponse) obj;
                    String str2 = C250000xu.LIZIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("it.data.notification====>");
                    sbLIZ2.append(baseResponse.data);
                    sbLIZ2.append(' ');
                    C20441214yg.LIZIZ(str2, C2188811AlT.LIZIZ(sbLIZ2));
                    GiftLimitGetResponse.Data data = (GiftLimitGetResponse.Data) baseResponse.data;
                    if (data != null && data.giftPromptStall != null) {
                        C250000xu.LIZ.getClass();
                        C250000xu.LJJIIZI.setValue(Integer.valueOf(((GiftLimitGetResponse.Data) baseResponse.data).notificationStatus));
                        T t = baseResponse.data;
                        String str3 = ((GiftLimitGetResponse.Data) t).setSuccessfullyToast;
                        String str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        C250000xu.LJJI = str3;
                        String str5 = ((GiftLimitGetResponse.Data) t).setFailedToast;
                        if (str5 == null) {
                            str5 = "";
                        }
                        C250000xu.LJJIFFI = str5;
                        C250000xu.LJJII = ((GiftLimitGetResponse.Data) t).allowCustomStall;
                        String str6 = ((GiftLimitGetResponse.Data) t).suggestedCustomStallText;
                        if (str6 == null) {
                            str6 = "";
                        }
                        C250000xu.LJJIII = str6;
                        C250000xu.LJJIIJ = ((GiftLimitGetResponse.Data) t).inUserGiftingAddictionExpr;
                        String str7 = ((GiftLimitGetResponse.Data) t).giftPromptStall.currencyCode;
                        if (str7 == null) {
                            str7 = "";
                        }
                        C250000xu.LJIILIIL = str7;
                        if (!C250000xu.LJJII) {
                            List<Integer> list = ((GiftLimitGetResponse.Data) t).giftPromptStall.amountStalls;
                            if (list != null && list.size() != 0) {
                                C250000xu.LJIILJJIL = new ArrayList(((GiftLimitGetResponse.Data) baseResponse.data).giftPromptStall.amountStalls);
                                C250000xu.LJJIIZ = false;
                            } else {
                                C250000xu.LJJIIZ = true;
                            }
                        } else {
                            C250000xu.LJJIIZ = false;
                        }
                        T t2 = baseResponse.data;
                        C250000xu.LJIILL = ((GiftLimitGetResponse.Data) t2).giftPromptStall.useCoinLimit;
                        C250000xu.LJIILLIIL = (float) ((GiftLimitGetResponse.Data) t2).giftPromptStall.coinExchangeRate;
                        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall = ((GiftLimitGetResponse.Data) t2).giftPromptStall;
                        C250000xu.LJIL = giftPromptStall.selectedStallInCoin;
                        String str8 = giftPromptStall.currencySymbol;
                        if (str8 == null) {
                            str8 = "";
                        }
                        C250000xu.LJIIZILJ = str8;
                        GiftLimitGetResponse.Data.GiftPromptStall giftPromptStall2 = ((GiftLimitGetResponse.Data) t2).giftPromptStall;
                        String str9 = giftPromptStall2.region;
                        if (str9 != null) {
                            str4 = str9;
                        }
                        C250000xu.LJIJ = str4;
                        Integer num = giftPromptStall2.pastMaxMoney;
                        if (num != null) {
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = -1;
                        }
                        C250000xu.LJIJI = iIntValue;
                        Integer num2 = ((GiftLimitGetResponse.Data) baseResponse.data).giftPromptStall.suggestedStallThreshold;
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else {
                            iIntValue2 = -1;
                        }
                        C250000xu.LJIJJ = iIntValue2;
                        C250000xu.LJIJJLI = ((GiftLimitGetResponse.Data) baseResponse.data).giftPromptStall.selectedCode;
                        C250000xu.LJJIJ.setValue(Boolean.TRUE);
                        MutableLiveData<Integer> mutableLiveData = C250000xu.LJJ;
                        int i = ((GiftLimitGetResponse.Data) baseResponse.data).giftPromptStall.selectedStall;
                        if (i == null) {
                            i = -1;
                        }
                        mutableLiveData.setValue(i);
                    }
                    C1C7U.LIZIZ("GiftLimitNotificationManager@c802.init$1");
                }
            }, new C09JN() { // from class: X.00xs
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("GiftLimitNotificationManager@c802.init$2");
                    C20441214yg.LJ("GiftLimitNotification", ((Throwable) obj).getMessage());
                    C250000xu.LIZ.getClass();
                    C250000xu.LJJIJ.setValue(Boolean.FALSE);
                    C1C7U.LIZIZ("GiftLimitNotificationManager@c802.init$2");
                }
            });
        }
    }

    public static boolean LJ() {
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        return room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId();
    }

    public static boolean LJII() {
        Integer value = LJJIIZI.getValue();
        boolean z = value != null && value.intValue() == 1;
        Integer value2 = LJJ.getValue();
        return z || (value2 == null || value2.intValue() != -1) || (LJJIII.length() == 0) || (LJIJJ == -1);
    }

    public static boolean LIZJ() {
        LJI = SystemClock.uptimeMillis() - LJII <= 2000;
        String str = LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isTrayExited===>");
        sbLIZ.append(LIZJ);
        sbLIZ.append("\nisGiftPanelDismissed===>");
        sbLIZ.append(LIZLLL);
        sbLIZ.append("\nisTreasureBoxPanelDismissed===>");
        sbLIZ.append(LJ);
        sbLIZ.append("\nisCombo===>");
        sbLIZ.append(LJI);
        sbLIZ.append("\n ReachedLimit===>");
        sbLIZ.append(LJFF);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        return LIZJ && LIZLLL && LJ && !LJI && LJFF;
    }

    public static void LJI(int i) {
        switch (i) {
            case -4:
                LJFF = false;
                break;
            case -3:
                LJ = false;
                break;
            case -2:
                LIZLLL = false;
                break;
            case -1:
                LIZJ = false;
                break;
            case 1:
                LIZJ = true;
                break;
            case 2:
                LIZLLL = true;
                break;
            case 3:
                LJ = true;
                break;
            case 4:
                LJFF = true;
                break;
        }
    }

    public static void LJFF(final int i, final Integer num, final int i2, final String str, final boolean z, final InterfaceC250300xx interfaceC250300xx) {
        Integer value;
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (num == null) {
            value = LJJ.getValue();
            if (value == null) {
                return;
            }
        } else {
            value = num;
        }
        if (room != null) {
            C480460Ism.LIZ().getClass();
            ((GiftLimitNotificationApi) C480460Ism.LIZLLL(GiftLimitNotificationApi.class)).giftLimitNotificationSetLimit(room.getId(), i, value.intValue(), LJIJ).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00xv
                @Override // X.C09JN
                public final void accept(Object obj) {
                    String str2;
                    C1C7U.LIZ("GiftLimitNotificationManager@c802.setGiftLimit$1");
                    int i3 = i;
                    C250000xu.LIZ.getClass();
                    boolean zLJ = C250000xu.LJ();
                    String str3 = C250000xu.LJJIJIIJI;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_limit_notification_open");
                    c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_open");
                    c474500IjALIZ.LJJII(Integer.valueOf(zLJ ? 1 : 0), "is_anchor");
                    c474500IjALIZ.LJJII(str3, "first_panel_from");
                    c474500IjALIZ.LJJII("basic", "reminder_type");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LIZ();
                    C250000xu.LJJIIZI.setValue(Integer.valueOf(i));
                    Integer num2 = num;
                    if (num2 != null) {
                        if (C250000xu.LJIILL) {
                            C250000xu.LJIJJLI = "COIN";
                            C250000xu.LJIL = num2.intValue();
                        }
                        C250000xu.LJJ.setValue(num);
                    }
                    if (i == 1 && num != null) {
                        boolean zLJ2 = C250000xu.LJ();
                        String str4 = C250000xu.LJIJ;
                        String str5 = C250000xu.LJIILIIL;
                        int iIntValue = num.intValue();
                        String str6 = C250000xu.LJJIJIIJI;
                        String str7 = C250000xu.LJJIJIIJIL;
                        int i4 = i2;
                        String str8 = str;
                        boolean z2 = z;
                        boolean z3 = C250000xu.LJIILL;
                        C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_gift_limit_notification_set");
                        c474500IjALIZ2.LJJII(Integer.valueOf(zLJ2 ? 1 : 0), "is_anchor");
                        c474500IjALIZ2.LJJII("basic", "reminder_type");
                        c474500IjALIZ2.LJJII(str4, "region");
                        String str9 = "currency";
                        c474500IjALIZ2.LJJII(str5, "currency");
                        c474500IjALIZ2.LJJII(Integer.valueOf(iIntValue), "gift_limit_gear");
                        c474500IjALIZ2.LJJII(str6, "first_panel_from");
                        c474500IjALIZ2.LJJII(str7, "second_panel_from");
                        c474500IjALIZ2.LJJII(Integer.valueOf(i4), "if_use_apply");
                        c474500IjALIZ2.LJJII(str8, "apply_type");
                        if (z2) {
                            str2 = "1";
                        } else {
                            str2 = "2";
                        }
                        c474500IjALIZ2.LJJII(str2, "style");
                        if (z3) {
                            str9 = "coins";
                        }
                        c474500IjALIZ2.LJJII(str9, "coins_or_currency");
                        c474500IjALIZ2.LJIL();
                        c474500IjALIZ2.LIZ();
                    }
                    interfaceC250300xx.onSuccess();
                    C1C7U.LIZIZ("GiftLimitNotificationManager@c802.setGiftLimit$1");
                }
            }, new C516201zk(interfaceC250300xx, 77));
        }
    }
}
