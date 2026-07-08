package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkDisableSeiAudienceReduceOnNewLayoutLayer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966850bGd extends C09AY implements Function0<Boolean> {
    public final /* synthetic */ C965340bEC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966850bGd(C965340bEC c965340bEC) {
        super(0);
        this.LL = c965340bEC;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(LinkMicSdkDisableSeiAudienceReduceOnNewLayoutLayer.INSTANCE.isEnable() ? this.LL.LLJLILLLLZIIL() instanceof C1AXM : true);
    }
}
