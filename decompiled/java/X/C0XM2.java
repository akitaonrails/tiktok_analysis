package X;

import com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XM2, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XM2 extends C09AY implements Function0<C1495130p0h> {
    public C0XM2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1495130p0h invoke() {
        return ((INetworkConfigProvider) PluggableExtentionKt.pluggableSpi$default(INetworkConfigProvider.class, false, false, false, 14, null)).LIZ();
    }
}
