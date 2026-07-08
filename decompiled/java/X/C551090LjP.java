package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS239S0000000_8;

/* JADX INFO: renamed from: X.0LjP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C551090LjP extends C09AY implements Function1<C552770Lm7, C551100LjQ> {
    public final /* synthetic */ CreativeInfo LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C551090LjP(CreativeInfo creativeInfo, boolean z, boolean z2) {
        super(1);
        this.LL = creativeInfo;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C551100LjQ invoke(C552770Lm7 c552770Lm7) {
        return C551030LjJ.LIZIZ(c552770Lm7, this.LL, this.LLILLJJLI, !this.LLILLL, new C550560LiY(0), AFwS239S0000000_8.get$arr$(328));
    }
}
