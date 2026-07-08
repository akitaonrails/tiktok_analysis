package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0fH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120840fH0 {
    public static final C1120840fH0 LIZ = new C1120840fH0();

    public static boolean LIZ(C1121190fHZ c1121190fHZ, C1120950fHB c1120950fHB, boolean z) {
        String str;
        Context context;
        String str2;
        String strLIZLLL = null;
        if (c1121190fHZ != null) {
            str = c1121190fHZ.LJ;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str) || c1120950fHB == null || c1120950fHB.getContext() == null) {
            return false;
        }
        if (c1120950fHB != null && (context = c1120950fHB.getContext()) != null) {
            C1120840fH0 c1120840fH0 = LIZ;
            if (c1121190fHZ != null) {
                strLIZLLL = c1121190fHZ.LJ;
            }
            if (z) {
                str2 = "guide_bubble";
            } else {
                str2 = "gift_icon";
            }
            c1120840fH0.getClass();
            if (strLIZLLL != null && a0.LJJJIL(strLIZLLL)) {
                strLIZLLL = "";
            } else if (strLIZLLL == null || !a0.LJJIIZI(strLIZLLL, "top_area", false)) {
                C495520Jby c495520Jby = new C495520Jby(strLIZLLL);
                c495520Jby.LIZJ("top_area", str2);
                strLIZLLL = c495520Jby.LIZLLL();
            }
            ((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle(context, strLIZLLL);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, X.0fGz] */
    /* JADX WARN: Type inference failed for: r0v21, types: [T, X.0fGz] */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, X.0fGz] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.util.HashMap, java.util.LinkedHashMap] */
    public static void LIZIZ(final C1121200fHa c1121200fHa, final DataChannel dataChannel, C1120950fHB c1120950fHB, final C1120780fGu c1120780fGu) {
        long jLongValue;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = EnumC1120830fGz.UNKNOWN;
        EnumC1120810fGx enumC1120810fGx = EnumC1120810fGx.UNKNOWN;
        int i = C1121060fHM.LIZ[c1121200fHa.LJ.ordinal()];
        if (i != 1) {
            if (i == 2) {
                c259800zU.element = EnumC1120830fGz.PRIVILEGE_CENTER_UPGRADE_GUIDE;
                enumC1120810fGx = EnumC1120810fGx.PRIVILEGE_CENTER_UPGRADE_BUBBLE_GUIDE;
            }
        } else {
            c259800zU.element = EnumC1120830fGz.PRIVILEGE_GAINED_GUIDE;
            enumC1120810fGx = EnumC1120810fGx.PRIVILEGE_GAINED_BUBBLE_GUIDE;
        }
        final C259800zU c259800zU2 = new C259800zU();
        ?? linkedHashMap = new LinkedHashMap();
        String str = c1121200fHa.LIZ;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("premium_shop_id", str);
        c259800zU2.element = linkedHashMap;
        final C238400w2 c238400w2 = new C238400w2();
        Long l = c1121200fHa.LIZIZ;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c238400w2.element = jLongValue;
        final C1121190fHZ c1121190fHZ = new C1121190fHZ(enumC1120810fGx, EnumC1118040fCU.BUBBLE, jLongValue, (Integer) null, "");
        Context context = c1120950fHB.getContext();
        if (context != null) {
            C459401qa c459401qaLIZ = C459301qZ.LIZ(context, new GiftHintInfo());
            ImageModel imageModel = c1121200fHa.LIZJ;
            Text text = c1121200fHa.LIZLLL;
            List urls = null;
            if (imageModel != null && imageModel.getUrls() != null) {
                C0JBN c0jbnLIZ = C1819620xS4.LIZ();
                if (imageModel != null) {
                    urls = imageModel.getUrls();
                }
                c0jbnLIZ.LIZJ(urls).LJJI(c459401qaLIZ.LL);
            } else {
                C12ES.LJIILL(8, c459401qaLIZ.LL);
            }
            C16F5 c16f5 = c459401qaLIZ.LLILLJJLI;
            C244400x0 c244400x0 = C244400x0.LIZ;
            c244400x0.getClass();
            c16f5.setText(C244400x0.LIZ(text));
            C785240UrC c785240UrC = new C785240UrC(c1120950fHB);
            c785240UrC.LIZJ = c459401qaLIZ;
            c785240UrC.LJIILL = new InterfaceC254600ye() { // from class: X.0fH4
                @Override // X.InterfaceC254600ye
                public final void onShow() {
                    String string;
                    C1123590fLR.LIZ = true;
                    C1121590fID c1121590fID = C1121590fID.LIZ;
                    C1121200fHa c1121200fHa2 = c1121200fHa;
                    EnumC1120860fH2 enumC1120860fH2 = c1121200fHa2.LJ;
                    String str2 = c1121200fHa2.LIZ;
                    C1120840fH0 c1120840fH0 = C1120840fH0.LIZ;
                    DataChannel dataChannel2 = dataChannel;
                    c1120840fH0.getClass();
                    Room room = dataChannel2 != null ? (Room) dataChannel2.gg0(RoomChannel.class) : null;
                    String strValueOf = String.valueOf(c238400w2.element);
                    Long l2 = c1121200fHa.LJI;
                    if (l2 == null || (string = l2.toString()) == null) {
                        string = "";
                    }
                    c1121590fID.getClass();
                    C1121590fID.LIZIZ(enumC1120860fH2, str2, room, strValueOf, string);
                    C1123450fLD.LIZJ(c1121200fHa.LIZIZ, c259800zU.element.getDesc(), 0, c259800zU2.element);
                    InterfaceC1121180fHY interfaceC1121180fHY = c1120780fGu;
                    if (interfaceC1121180fHY != null) {
                        interfaceC1121180fHY.LIZ(c1121190fHZ);
                    }
                }
            };
            c785240UrC.LJIILLIIL = new C1151820g4y(c1120780fGu, c1121190fHZ, 1);
            c785240UrC.LJIIIIZZ = Mp4ScreenVideoLoadTimeout.CONTROL;
            c785240UrC.LJIIIZ = true;
            Text text2 = c1121200fHa.LIZLLL;
            c244400x0.getClass();
            c785240UrC.LJIJJ = C244400x0.LIZ(text2);
            C1113800f5e.LIZ.LJ(new C785310UrJ(c785240UrC), c1121200fHa.LJ, dataChannel);
        }
    }
}
