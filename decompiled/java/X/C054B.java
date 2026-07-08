package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054B implements AnonymousClass0547 {
    public final String LIZ;
    public final /* synthetic */ Function0<String> LIZIZ;
    public final /* synthetic */ Function0<Map<EnumC12995056r, Integer>> LIZJ;

    @Override // X.AnonymousClass0547
    public final String getTaskId() {
        return this.LIZ;
    }

    @Override // X.AnonymousClass0547
    public final void LIZ(InterfaceC12999056v interfaceC12999056v) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        String strInvoke = this.LIZIZ.invoke();
        for (Map.Entry<EnumC12995056r, Integer> entry : this.LIZJ.invoke().entrySet()) {
            EnumC12995056r key = entry.getKey();
            int iIntValue = entry.getValue().intValue();
            if (iIntValue >= 0) {
                for (int i = 0; i < iIntValue; i++) {
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
                    interfaceC12999056v.LJ(key, strInvoke, jCurrentTimeMillis, jCurrentTimeMillis2);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C054B(String str, Function0<String> function0, Function0<? extends Map<EnumC12995056r, Integer>> function02) {
        this.LIZIZ = function0;
        this.LIZJ = function02;
        this.LIZ = str;
    }
}
