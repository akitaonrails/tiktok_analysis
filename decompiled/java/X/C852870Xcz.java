package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.login.v2.base.BaseAccountFlowFragment;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0Xcz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C852870Xcz extends C09AY implements InterfaceC1685420txc<BaseAccountFlowFragment, String, String, EnumC850750XYz, Integer, AbstractC19483511Kn<C0XT7<C849450XTz>>> {
    public C852870Xcz() {
        super(5);
    }

    @Override // X.InterfaceC1685420txc
    public final AbstractC19483511Kn<C0XT7<C849450XTz>> invoke(BaseAccountFlowFragment baseAccountFlowFragment, String str, String str2, EnumC850750XYz enumC850750XYz, Integer num) {
        BaseAccountFlowFragment baseAccountFlowFragment2 = baseAccountFlowFragment;
        String str3 = str;
        String str4 = str2;
        EnumC850750XYz enumC850750XYz2 = enumC850750XYz;
        int iIntValue = num.intValue();
        C852810Xct.LIZ.getClass();
        String strLJIIJ = C852810Xct.LJIIJ(baseAccountFlowFragment2);
        C854460XfY.LIZ.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C854460XfY.LJIIJJI(baseAccountFlowFragment2));
        linkedHashMap.putAll(C854460XfY.LJIIIZ(baseAccountFlowFragment2));
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strLJIIJ)) {
            map.put("ticket", strLJIIJ);
        }
        map.put("email_source", String.valueOf(C0XZL.LIZ(baseAccountFlowFragment2)));
        map.putAll(linkedHashMap);
        return C0XZ4.LJJIII(C0XZ4.LIZ, baseAccountFlowFragment2, baseAccountFlowFragment2, str3, iIntValue, str4, map, null, null, enumC850750XYz2, null, 704);
    }
}
