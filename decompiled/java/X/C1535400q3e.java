package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0q3e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1535400q3e extends C09AY implements Function0<Unit> {
    public final /* synthetic */ IResourceServiceX LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ RequestParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1535400q3e(IResourceServiceX iResourceServiceX, String str, RequestParams requestParams) {
        super(0);
        this.LL = iResourceServiceX;
        this.LLILLJJLI = str;
        this.LLILLL = requestParams;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        IResourceServiceX iResourceServiceX = this.LL;
        boolean z = C1536390q5F.LIZ;
        iResourceServiceX.preload(C1536390q5F.LIZLLL(this.LLILLJJLI), this.LLILLL, null);
        return Unit.LIZ;
    }
}
