package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.MatchedFriendStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Yq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886460Yq4 implements InterfaceC886490Yq7<C886420Yq0, C886470Yq5> {
    public final C886470Yq5 LIZ = new C886470Yq5(null);
    public final String LIZIZ = "message_request_chat_list_vo_converter";

    @Override // X.InterfaceC886490Yq7
    public final String LIZ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC886490Yq7
    public final /* bridge */ /* synthetic */ InterfaceC886910Yqn LIZIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC886490Yq7
    public final boolean LIZLLL(C879540Yeu<?> c879540Yeu) {
        return c879540Yeu.LIZ instanceof C1709506mj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC886490Yq7
    public final InterfaceC884440Ymo LIZJ(C879540Yeu c879540Yeu, InterfaceC879010Ye3 interfaceC879010Ye3) {
        C0Y8T c0y8t;
        C878630YdR c878630YdR;
        long jLongValue;
        int iLIZ;
        UrlModel urlModel;
        InterfaceC879500Yeq interfaceC879500Yeq;
        C881260Yhg c881260Yhg;
        C886440Yq2 c886440Yq2;
        C879630Yf3 c879630Yf3;
        Long l;
        List list;
        AbstractC884010Ym7 abstractC884010Ym7;
        MatchedFriendStruct matchedFriendStruct;
        C788490UwR c788490UwR;
        C882070Yiz c882070Yiz;
        Long l2;
        Map<InterfaceC887040Yr0<?>, Object> mapLIZ = C886500Yq8.LIZ(this, c879540Yeu);
        C429270GsP c429270GsP = null;
        if (!(c879540Yeu.LIZ instanceof C1709506mj)) {
            return null;
        }
        T t = c879540Yeu.LIZJ;
        if (t instanceof C0Y8T) {
            c0y8t = (C0Y8T) t;
        } else {
            c0y8t = null;
        }
        InterfaceC1491305sd interfaceC1491305sd = c879540Yeu.LIZIZ;
        if (!(interfaceC1491305sd instanceof C878630YdR) || (c878630YdR = (C878630YdR) interfaceC1491305sd) == null) {
            c878630YdR = new C878630YdR("");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) mapLIZ;
        Object obj = linkedHashMap.get(C886860Yqi.LIZ);
        if ((obj instanceof Long) && (l2 = (Long) obj) != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = Long.MAX_VALUE;
        }
        if (c0y8t != null) {
            iLIZ = C0YU8.LIZ(c0y8t);
        } else {
            iLIZ = 0;
        }
        Object obj2 = linkedHashMap.get(C886790Yqb.LIZ);
        if (obj2 instanceof UrlModel) {
            urlModel = (UrlModel) obj2;
        } else {
            urlModel = null;
        }
        Object obj3 = linkedHashMap.get(C886830Yqf.LIZ);
        if (obj3 instanceof InterfaceC879500Yeq) {
            interfaceC879500Yeq = (InterfaceC879500Yeq) obj3;
        } else {
            interfaceC879500Yeq = null;
        }
        Object obj4 = linkedHashMap.get(C886820Yqe.LIZ);
        if (obj4 instanceof C881260Yhg) {
            c881260Yhg = (C881260Yhg) obj4;
        } else {
            c881260Yhg = null;
        }
        Object obj5 = linkedHashMap.get(C886800Yqc.LIZ);
        if (obj5 instanceof C886440Yq2) {
            c886440Yq2 = (C886440Yq2) obj5;
        } else {
            c886440Yq2 = null;
        }
        Object obj6 = linkedHashMap.get(C886840Yqg.LIZ);
        if (obj6 instanceof C879630Yf3) {
            c879630Yf3 = (C879630Yf3) obj6;
        } else {
            c879630Yf3 = null;
        }
        Object obj7 = linkedHashMap.get(C886870Yqj.LIZ);
        if (obj7 instanceof Long) {
            l = (Long) obj7;
        } else {
            l = null;
        }
        Object obj8 = linkedHashMap.get(C886640YqM.LIZ);
        if (obj8 instanceof List) {
            list = (List) obj8;
        } else {
            list = null;
        }
        Object obj9 = linkedHashMap.get(C886880Yqk.LIZ);
        if (obj9 instanceof AbstractC884010Ym7) {
            abstractC884010Ym7 = (AbstractC884010Ym7) obj9;
        } else {
            abstractC884010Ym7 = null;
        }
        Object obj10 = linkedHashMap.get(C886850Yqh.LIZ);
        if (obj10 instanceof MatchedFriendStruct) {
            matchedFriendStruct = (MatchedFriendStruct) obj10;
        } else {
            matchedFriendStruct = null;
        }
        Object obj11 = linkedHashMap.get(C886810Yqd.LIZ);
        if (obj11 instanceof C788490UwR) {
            c788490UwR = (C788490UwR) obj11;
        } else {
            c788490UwR = null;
        }
        Object obj12 = linkedHashMap.get(C887000Yqw.LIZ);
        if ((obj12 instanceof C882070Yiz) && (c882070Yiz = (C882070Yiz) obj12) != null) {
            c429270GsP = c882070Yiz.LIZIZ;
        }
        return new C886420Yq0(interfaceC879010Ye3, C1709506mj.INSTANCE, c878630YdR, jLongValue, iLIZ, urlModel, interfaceC879500Yeq, c881260Yhg, c886440Yq2, c879630Yf3, l, list, abstractC884010Ym7, matchedFriendStruct, c788490UwR, c429270GsP);
    }
}
