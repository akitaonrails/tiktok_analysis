package X;

import com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0c7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999450c7D extends C09AY implements Function0<ICommerceTransAndCaptionAbility> {
    public final /* synthetic */ C999500c7I LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C999450c7D(C999500c7I c999500c7I) {
        super(0);
        this.LL = c999500c7I;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.ad.feed.caption.ICommerceTransAndCaptionAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final ICommerceTransAndCaptionAbility invoke() {
        InterfaceC665370Q7z interfaceC665370Q7z = this.LL.LL;
        if (interfaceC665370Q7z != null) {
            return C1558520qew.LIZ(interfaceC665370Q7z, ICommerceTransAndCaptionAbility.class, null);
        }
        return null;
    }
}
