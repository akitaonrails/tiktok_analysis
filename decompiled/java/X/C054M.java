package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054M, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054M implements AnonymousClass0547 {
    public final String LIZ;
    public final /* synthetic */ Function0<Boolean> LIZIZ;
    public final /* synthetic */ Function0<String> LIZJ;

    @Override // X.AnonymousClass0547
    public final String getTaskId() {
        return this.LIZ;
    }

    @Override // X.AnonymousClass0547
    public final void LIZ(InterfaceC12999056v interfaceC12999056v) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        if (!this.LIZIZ.invoke().booleanValue()) {
            return;
        }
        EnumC12995056r enumC12995056r = EnumC12995056r.SHOW;
        String strInvoke = this.LIZJ.invoke();
        IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi != null) {
            jCurrentTimeMillis = iMHostApi.LIZIZ();
        } else {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
        if (iMHostApi2 != null) {
            jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
        } else {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        interfaceC12999056v.LJ(enumC12995056r, strInvoke, jCurrentTimeMillis, jCurrentTimeMillis2);
    }

    public C054M(String str, Function0<Boolean> function0, Function0<String> function02) {
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZ = str;
    }
}
