package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1Au0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2194101Au0 {
    public static Object LIZ(String str, String str2, String str3, String str4, int i, String str5, String str6, AbstractC23140094w abstractC23140094w) {
        InterfaceC2194121Au2.LIZ.getClass();
        C1499850p8J c1499850p8JCreateBuilder = ((IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class)).createBuilder(C0CQT.LIZJ);
        c1499850p8JCreateBuilder.LJIIIZ = 1;
        return ((InterfaceC2194121Au2) c1499850p8JCreateBuilder.build().retrofit.LIZ(InterfaceC2194121Au2.class)).LIZ(str, str2, str3, str4, i, str5, str6, abstractC23140094w);
    }
}
