package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.AFwS187S0000000_2;
import kotlin.text.u;

/* JADX INFO: renamed from: X.06Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1566106Bf implements C057E {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(882));

    public final String LIZLLL() {
        return (String) this.LIZ.getValue();
    }

    public final <T> T LIZIZ(Class<T> cls) {
        C1499850p8J c1499850p8JCreateBuilder;
        T t;
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(LIZLLL())) != null && (t = (T) c1499850p8JCreateBuilder.build().retrofit.LIZ(cls)) != null) {
            return t;
        }
        String strConcat = "Failed to create Retrofit API service for ".concat(cls.getName());
        strConcat.toString();
        throw new IllegalArgumentException(strConcat);
    }

    public final InterfaceC2661011f LIZ(String str, boolean z) {
        C1499850p8J c1499850p8JCreateBuilder;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZLLL = LIZLLL();
        if (!u.LJIIZILJ(strLIZLLL, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append('/');
            strLIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) != null) {
            if (z) {
                c1499850p8JCreateBuilder.LIZJ = true;
            }
            return c1499850p8JCreateBuilder.build();
        }
        return null;
    }

    public final Object LIZJ(Class cls, String str) {
        String strSubstring;
        C1499850p8J c1499850p8JCreateBuilder;
        Object objLIZ;
        if (u.LJJIIJZLJL(str, "/", false)) {
            strSubstring = str.substring(1);
        } else {
            strSubstring = str;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String strLIZLLL = LIZLLL();
        if (!u.LJIIZILJ(strLIZLLL, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZLLL);
            sbLIZ2.append('/');
            strLIZLLL = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZLLL);
        sbLIZ.append(strSubstring);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
        if (iRetrofitFactory != null && (c1499850p8JCreateBuilder = iRetrofitFactory.createBuilder(strLIZIZ)) != null && (objLIZ = c1499850p8JCreateBuilder.build().retrofit.LIZ(cls)) != null) {
            return objLIZ;
        }
        String str2 = "Failed to create Retrofit API service for " + cls.getName() + " with path " + str;
        str2.toString();
        throw new IllegalArgumentException(str2);
    }
}
