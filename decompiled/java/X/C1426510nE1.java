package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0nE1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1426510nE1 extends C09AY implements Function1<C1426550nE5, C1426550nE5> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ List<C1427080nEw> LLILLJJLI;
    public final /* synthetic */ List<C1427080nEw> LLILLL;
    public final /* synthetic */ EffectSearchResultResponse LLILZ;
    public final /* synthetic */ C1426520nE2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426510nE1(boolean z, List<C1427080nEw> list, List<C1427080nEw> list2, EffectSearchResultResponse effectSearchResultResponse, C1426520nE2 c1426520nE2) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
        this.LLILZ = effectSearchResultResponse;
        this.LLILZIL = c1426520nE2;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1426550nE5 invoke(X.C1426550nE5 r16) {
        /*
            r15 = this;
            r1 = r16
            X.0nE5 r1 = (X.C1426550nE5) r1
            X.0nEm r3 = X.EnumC1426980nEm.HIDE
            boolean r0 = r15.LL
            if (r0 == 0) goto L54
            java.util.List<X.0nEw> r4 = r15.LLILLJJLI
        Lc:
            com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse r0 = r15.LLILZ
            if (r0 == 0) goto L52
            java.lang.Integer r0 = r0.cursor
            if (r0 == 0) goto L52
            int r5 = r0.intValue()
        L18:
            com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse r0 = r15.LLILZ
            if (r0 == 0) goto L50
            java.lang.Integer r0 = r0._hasMore
            if (r0 == 0) goto L50
            int r0 = r0.intValue()
            r6 = 1
            if (r0 != r6) goto L50
        L27:
            boolean r0 = r15.LL
            if (r0 == 0) goto L43
            X.0nE2 r0 = r15.LLILZIL
            java.lang.Object r0 = r0.T2()
            X.0nE5 r0 = (X.C1426550nE5) r0
            java.lang.String r8 = r0.LJIIIIZZ
        L35:
            r2 = 0
            r7 = 0
            r14 = 15879(0x3e07, float:2.2251E-41)
            r9 = r2
            r10 = r2
            r11 = r2
            r12 = r2
            r13 = r2
            X.0nE5 r0 = X.C1426550nE5.LIZ(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L43:
            com.ss.android.ugc.aweme.editeffect.search.middleware.result.EffectSearchResultResponse r0 = r15.LLILZ
            com.ss.android.ugc.aweme.feed.model.LogPbBean r0 = r0.logPb
            if (r0 == 0) goto L4e
            java.lang.String r8 = r0.getImprId()
            goto L35
        L4e:
            r8 = 0
            goto L35
        L50:
            r6 = 0
            goto L27
        L52:
            r5 = 0
            goto L18
        L54:
            java.util.List<X.0nEw> r4 = r15.LLILLL
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1426510nE1.invoke(java.lang.Object):java.lang.Object");
    }
}
