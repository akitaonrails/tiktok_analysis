package X;

import com.ss.android.ugc.aweme.ecommerce.network.IECRetrofitFactory;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.03ga, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C907003ga {
    public static final /* synthetic */ C907003ga LIZ = new C907003ga();
    public static final C01K1 LIZIZ = ((IECRetrofitFactory) ServiceManager.get().getService(IECRetrofitFactory.class)).createBuilder("https://oec-api.tiktokv.com/").build();

    public static C11NZ LIZIZ(HashMap map) {
        return ((InterfaceC907103gb) LIZIZ.create(InterfaceC907103gb.class)).LIZ(map);
    }

    public static C11NZ LIZ(Boolean bool, String str) {
        InterfaceC907103gb interfaceC907103gb = (InterfaceC907103gb) LIZIZ.create(InterfaceC907103gb.class);
        C914303hl.LIZ.getClass();
        return interfaceC907103gb.LIZIZ(bool, str, C914303hl.LJ);
    }
}
