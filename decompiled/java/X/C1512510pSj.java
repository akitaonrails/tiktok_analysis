package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0pSj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512510pSj extends C09AY implements Function1<C1512110pS5, Unit> {
    public final /* synthetic */ C238400w2 LL;
    public final /* synthetic */ C21208517z9 LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1512510pSj(C238400w2 c238400w2, C21208517z9 c21208517z9, boolean z, boolean z2) {
        super(1);
        this.LL = c238400w2;
        this.LLILLJJLI = c21208517z9;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1512110pS5 c1512110pS5) {
        C1512110pS5 c1512110pS52 = c1512110pS5;
        if (c1512110pS52.LIZ) {
            this.LL.element = c1512110pS52.LIZJ;
            C21208517z9 c21208517z9 = this.LLILLJJLI;
            boolean z = c1512110pS52.LIZIZ;
            c21208517z9.LLJJI = z;
            c21208517z9.LLJJ = z;
            Map<String, Object> map = c1512110pS52.LJ;
            int i = 0;
            if (map != null && Intrinsics.LJFF(map.get("pre_render"), Boolean.TRUE)) {
                i = 1;
            } else {
                Map<String, Object> map2 = c1512110pS52.LJ;
                if (map2 == null || !Intrinsics.LJFF(map2.get("pre_render"), Boolean.FALSE)) {
                    i = -1;
                }
            }
            c21208517z9.LLJJIII = i;
            this.LLILLJJLI.LLJJIJI = c1512110pS52.LIZLLL ? 1 : 0;
        }
        this.LLILLJJLI.LJIIJ(this.LL.element, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
