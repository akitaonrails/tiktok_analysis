package Y;

import X.C086I;
import X.C1356160lOY;
import X.C1371710lnd;
import X.C2188811AlT;
import X.C352000Dr4;
import X.C419910GdJ;
import X.EnumC1356100lOS;
import X.InterfaceC1369790lkX;
import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.improve.channel.CopyLinkChannel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes22.dex */
public class AObjectS195S0300000_21 implements Function1 {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(AObjectS195S0300000_21 aObjectS195S0300000_21, Object obj) {
        Function1 function1 = (Function1) aObjectS195S0300000_21.l0;
        InterfaceC1369790lkX interfaceC1369790lkX = (InterfaceC1369790lkX) aObjectS195S0300000_21.l1;
        Activity activity = (Activity) aObjectS195S0300000_21.l2;
        ArrayList<String> arrayList = (ArrayList) obj;
        if (!C086I.LIZIZ(arrayList)) {
            for (String str : arrayList) {
                C352000Dr4 c352000Dr4 = C352000Dr4.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Util] channel key: ");
                sbLIZ.append(str);
                c352000Dr4.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                if (!TextUtils.equals(str, "chat_merge")) {
                    if ("copy".equalsIgnoreCase(str)) {
                        function1.invoke(new Pair(new CopyLinkChannel(), interfaceC1369790lkX.LJJII(activity, false)));
                        return null;
                    }
                    InterfaceC1369790lkX interfaceC1369790lkXLIZ = C1371710lnd.LIZ(activity, str);
                    if (interfaceC1369790lkXLIZ != null && interfaceC1369790lkXLIZ.LJIIZILJ(activity)) {
                        function1.invoke(new Pair(interfaceC1369790lkXLIZ, interfaceC1369790lkXLIZ.LJJII(activity, false)));
                        return null;
                    }
                }
            }
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_color_link_circle;
        function1.invoke(new Pair(new CopyLinkChannel(), c419910GdJ.LIZ(activity)));
        return null;
    }

    public static final Object invoke$1(AObjectS195S0300000_21 aObjectS195S0300000_21, Object obj) {
        String str;
        C1356160lOY c1356160lOY = C1356160lOY.LIZ;
        Aweme aweme = (Aweme) aObjectS195S0300000_21.l0;
        String str2 = (String) ((Map) aObjectS195S0300000_21.l1).get("enter_from");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String value = ((EnumC1356100lOS) aObjectS195S0300000_21.l2).getValue();
        c1356160lOY.getClass();
        C1356160lOY.LIZIZ(str2, value, "cancel", aweme);
        String aid = ((Aweme) aObjectS195S0300000_21.l0).getAid();
        if (aid != null) {
            str3 = aid;
        }
        String value2 = ((EnumC1356100lOS) aObjectS195S0300000_21.l2).getValue();
        if (Collections.singletonList(EnumC1356100lOS.BOTTOM_BUTTON).contains((EnumC1356100lOS) aObjectS195S0300000_21.l2)) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        C1356160lOY.LIZLLL(c1356160lOY, str3, "lemon8_detail_popup", value2, str, "cancel");
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObjectS195S0300000_21(Object obj, Aweme aweme, Map<String, String> map, EnumC1356100lOS enumC1356100lOS) {
        this.$t = enumC1356100lOS;
        this.l0 = obj;
        this.l1 = aweme;
        this.l2 = map;
    }
}
