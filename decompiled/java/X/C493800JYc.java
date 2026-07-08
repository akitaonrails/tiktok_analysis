package X;

import kotlin.jvm.functions.Function1;
import webcast.api.sub.VIPSubOnlyLiveSettingInfo;

/* JADX INFO: renamed from: X.0JYc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C493800JYc extends C09AY implements Function1<VIPSubOnlyLiveSettingInfo.Category, Boolean> {
    public final /* synthetic */ C493830JYf LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C493800JYc(C493830JYf c493830JYf) {
        super(1);
        this.LL = c493830JYf;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(VIPSubOnlyLiveSettingInfo.Category category) {
        boolean z;
        if (category.lowerBound == this.LL.LJFF) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
