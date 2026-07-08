package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bHX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967410bHX extends C09AY implements Function1<LinkUser, Boolean> {
    public final /* synthetic */ long LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967410bHX(long j) {
        super(1);
        this.LL = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(LinkUser linkUser) {
        boolean z;
        Long l = linkUser.userId;
        long j = this.LL;
        if (l != null && l.longValue() == j) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
