package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ss.android.ugc.aweme.commercialize.ba.impl.automessage.data.model.AutoReplyStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.1Apc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191381Apc {
    public static final C2191381Apc LIZ = new C2191381Apc();
    public static final InterfaceC2191391Apd LIZIZ;

    static {
        IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) ServiceManager.get().getService(IRetrofitFactory.class);
        InterfaceC2191391Apd.LIZ.getClass();
        LIZIZ = (InterfaceC2191391Apd) iRetrofitFactory.LIZ(C1487620ooa.LIZIZ).create(InterfaceC2191391Apd.class);
    }

    public static ListenableFuture LIZ() {
        return LIZIZ.LIZJ();
    }

    public static ListenableFuture LIZIZ() {
        return LIZIZ.LJ();
    }

    public static ListenableFuture LIZJ() {
        return LIZIZ.LIZ();
    }

    public static ListenableFuture LIZLLL() {
        return LIZIZ.LJFF();
    }

    public static ListenableFuture LJ(int i, AutoReplyStruct autoReplyStruct) {
        return LIZIZ.LIZIZ(i, GsonProtectorUtils.toJson(C09C2.LIZ(), autoReplyStruct));
    }

    public static ListenableFuture LJFF(int i, int i2) {
        return LIZIZ.LIZLLL(i, i2);
    }

    public static ListenableFuture LJI(int i, Long l, String str) {
        return LIZIZ.LJI(i, str, l);
    }
}
