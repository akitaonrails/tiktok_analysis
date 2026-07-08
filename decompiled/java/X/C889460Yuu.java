package X;

import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Yuu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889460Yuu {
    public static String LIZ(InterfaceC889560Yv4 interfaceC889560Yv4) {
        String batchActionTypeMobValue;
        EnumC885270Yo9 enumC885270Yo9LJIIIZ = interfaceC889560Yv4.LJIIIZ();
        if (enumC885270Yo9LJIIIZ == null || (batchActionTypeMobValue = enumC885270Yo9LJIIIZ.getBatchActionTypeMobValue()) == null) {
            return "";
        }
        return batchActionTypeMobValue;
    }

    public static boolean LIZIZ(InterfaceC889560Yv4 interfaceC889560Yv4) {
        List<InterfaceC888500YtM> listInvoke;
        Function0<List<InterfaceC888500YtM>> function0LIZ = interfaceC889560Yv4.LIZ();
        if (function0LIZ != null) {
            listInvoke = function0LIZ.invoke();
        } else {
            listInvoke = null;
        }
        return C866950Xzh.LIZIZ(listInvoke);
    }

    public static String LIZJ(InterfaceC889560Yv4 interfaceC889560Yv4) {
        C878950Ydx c878950Ydx;
        String str;
        InterfaceC879010Ye3 interfaceC879010Ye3LIZIZ = interfaceC889560Yv4.LIZIZ();
        if (!(interfaceC879010Ye3LIZIZ instanceof C878950Ydx) || (c878950Ydx = (C878950Ydx) interfaceC879010Ye3LIZIZ) == null || (str = c878950Ydx.LLILLJJLI) == null) {
            return "notification_page";
        }
        return str;
    }

    public static void LIZLLL(InterfaceC889560Yv4 interfaceC889560Yv4, AwS558S0100000_14 awS558S0100000_14, AwS558S0100000_14 awS558S0100000_142) {
        Function0<List<InterfaceC888500YtM>> function0LIZ;
        List<InterfaceC888500YtM> listInvoke;
        EnumC885270Yo9 enumC885270Yo9LJIIIZ = interfaceC889560Yv4.LJIIIZ();
        if (enumC885270Yo9LJIIIZ != null && (function0LIZ = interfaceC889560Yv4.LIZ()) != null && (listInvoke = function0LIZ.invoke()) != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listInvoke, 10));
            Iterator<InterfaceC888500YtM> it2 = listInvoke.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getSessionId());
            }
            int i = C2187451AjH.LIZ;
            String tag = interfaceC889560Yv4.getTag();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC885270Yo9LJIIIZ.getBatchActionTypeMobValue());
            sbLIZ.append(" click, curPageKey: ");
            sbLIZ.append(interfaceC889560Yv4.LIZIZ());
            sbLIZ.append(" list: ");
            sbLIZ.append(arrayList);
            C1720106oR.LJI(tag, C2188811AlT.LIZIZ(sbLIZ));
            if (!arrayList.isEmpty()) {
                IMChatListApi.LJJIII.getClass();
                C885700Yoq.LIZ(C890330YwJ.LIZ().LJJJIL(), interfaceC889560Yv4.getEnterFrom(), arrayList, interfaceC889560Yv4.LIZIZ(), enumC885270Yo9LJIIIZ, interfaceC889560Yv4.LJIIIIZZ(), awS558S0100000_14, awS558S0100000_142, 33);
                interfaceC889560Yv4.LJII(arrayList.size(), enumC885270Yo9LJIIIZ.getBatchActionTypeMobValue());
            }
        }
    }

    public static void LJ(InterfaceC889560Yv4 interfaceC889560Yv4, String str, int i) {
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        IMChatListApi.LJJIII.getClass();
        InterfaceC890150Yw1 interfaceC890150Yw1LIZIZ = C890330YwJ.LIZ().LIZIZ();
        String enterFrom = interfaceC889560Yv4.getEnterFrom();
        InterfaceC879010Ye3 interfaceC879010Ye3LIZIZ = interfaceC889560Yv4.LIZIZ();
        String mobValue = null;
        if ((interfaceC879010Ye3LIZIZ instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3LIZIZ) != null && (filterTabType = c878950Ydx.LLILLL) != null) {
            mobValue = filterTabType.getMobValue();
        }
        interfaceC890150Yw1LIZIZ.LJ(i, enterFrom, "direct_click", str, mobValue);
    }
}
