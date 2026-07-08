package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0XDi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845120XDi<T> implements C09JN {
    public static final C845120XDi<T> LL = new C845120XDi<>();

    @Override // X.C09JN
    public final void accept(Object obj) {
        String str;
        C1C7U.LIZ("WsManager@5c00.initSDK$1");
        C845540XEy.LIZ.getClass();
        HashMap map = new HashMap();
        if (C1906580ziK.LJI()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        map.put("IsBackground", str);
        C2203431BLp.LIZIZ.LJIIIIZZ(0L, 0L, 9000, 4, new byte[]{0}, "", "", map);
        C1C7U.LIZIZ("WsManager@5c00.initSDK$1");
    }
}
