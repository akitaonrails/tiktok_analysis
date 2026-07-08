package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUserBizInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yb5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877170Yb5 implements InterfaceC1670106gN {
    public static final C877170Yb5 LIZ = new C877170Yb5();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(407));

    public static InterfaceC865850Xxv LIZJ() {
        C0YHX c0yhxLIZ;
        C0YH4 c0yh4LJIIL;
        InterfaceC866310Xyf interfaceC866310XyfLIZIZ;
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ == null || (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) == null || (c0yh4LJIIL = c0yhxLIZ.LJIIL()) == null || (interfaceC866310XyfLIZIZ = c0yh4LJIIL.LIZIZ()) == null) {
            return null;
        }
        return interfaceC866310XyfLIZIZ.LJIIIZ();
    }

    @Override // X.InterfaceC1670106gN
    public final void LIZIZ(List<IMUserBizInfo> list) {
        C0Y8T c0y8tLIZ;
        if (list.isEmpty() || !C1665606fe.LIZ()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (IMUserBizInfo iMUserBizInfo : list) {
            Long lValueOf = Long.valueOf(iMUserBizInfo.getUserId());
            if (lValueOf.longValue() != 0) {
                long jLongValue = lValueOf.longValue();
                String strLIZLLL = C0YNP.LIZLLL(Long.valueOf(jLongValue));
                if (strLIZLLL.length() != 0 && (c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(strLIZLLL)) != null) {
                    IMUser iMUser = new IMUser();
                    iMUser.setUid(String.valueOf(jLongValue));
                    iMUser.setImUserBizInfo(iMUserBizInfo);
                    linkedHashMap.put(strLIZLLL, new Pair(c0y8tLIZ, iMUser));
                }
            }
        }
        if (!linkedHashMap.isEmpty() && C1665606fe.LIZ()) {
            C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C877160Yb4(linkedHashMap, null), 3);
        }
    }

    @Override // X.InterfaceC1670106gN
    public final void LIZ(String str, EnumC877180Yb6 enumC877180Yb6, boolean z) {
        String str2;
        if (str.length() == 0 || !C1665606fe.LIZ()) {
            return;
        }
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        C23250099c.LIZLLL((InterfaceC497601wk) LIZIZ.getValue(), null, null, new C877150Yb3(str, enumC877180Yb6, str2, null), 3);
    }
}
