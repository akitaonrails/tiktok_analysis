package X;

import com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility;
import com.ss.android.ugc.aweme.internalshare.impl.feedquickshare.QuickShareButtonAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0cF7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004350cF7 extends C09AY implements Function0<IVideoShareAbility> {
    public final /* synthetic */ QuickShareButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1004350cF7(QuickShareButtonAssem quickShareButtonAssem) {
        super(0);
        this.LL = quickShareButtonAssem;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.01wD, com.ss.android.ugc.aweme.feed.assem.ability.IVideoShareAbility] */
    @Override // kotlin.jvm.functions.Function0
    public final IVideoShareAbility invoke() {
        return C1558520qew.LIZ(C1558520qew.LJIIL(this.LL), IVideoShareAbility.class, null);
    }
}
