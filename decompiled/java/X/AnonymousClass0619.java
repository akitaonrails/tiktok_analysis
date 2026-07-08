package X;

import com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0619, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0619 {
    public static final C054G LIZ = C2296808zG.LIZ(new C2232408os(C786410Ut5.h4()).plus(C2296908zH.LIZ()));

    public static final void LIZ(C869590Y9l c869590Y9l, Function1<? super C869590Y9l, Boolean> function1, Function1<? super C869590Y9l, Unit> function12) {
        C0YHX c0yhxLIZ;
        InterfaceC870590YDh interfaceC870590YDhLJIIJ;
        c869590Y9l.getMsgId();
        if (c869590Y9l.getMsgId() <= 0 || !c869590Y9l.isSuccessStatus() || !function1.invoke(c869590Y9l).booleanValue()) {
            return;
        }
        IIMCoreProxyService.LIZ.getClass();
        IIMCoreProxyService iIMCoreProxyServiceLIZ = C875420YVw.LIZ();
        if (iIMCoreProxyServiceLIZ != null && (c0yhxLIZ = iIMCoreProxyServiceLIZ.LIZ(C0YM2.TIKTOK_SOCIAL_IM)) != null && (interfaceC870590YDhLJIIJ = c0yhxLIZ.LJIIJ()) != null) {
            C23250099c.LIZLLL(LIZ, null, null, new AnonymousClass0618(interfaceC870590YDhLJIIJ, c869590Y9l, function12, null), 3);
        }
    }
}
