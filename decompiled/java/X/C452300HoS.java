package X;

import com.ss.android.ugc.aweme.im.common.model.StickerItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HoS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.typing.CommentTypingRecManager$fetchFromLocal$2", f = "CommentTypingRecManager.kt", l = {214}, m = "invokeSuspend")
public final class C452300HoS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>>, Object> {
    public int LL;
    public final /* synthetic */ C452280HoQ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C452300HoS(C452280HoQ c452280HoQ, String str, InterfaceC1364105Vn<? super C452300HoS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c452280HoQ;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C452300HoS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r0 = "CommentTypingRecManager@ed40.fetchFromLocal$2"
            X.C1C7U.LIZ(r0)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L2d
            if (r0 != r4) goto L9f
            X.C155000ia.LIZIZ(r7)
            X.00o6 r7 = (X.C189200o6) r7
            java.lang.Object r1 = r7.m10unboximpl()
        L1a:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L21
            r1 = r3
        L21:
            com.ss.android.ugc.aweme.data.TypingRecommendationCacheData r1 = (com.ss.android.ugc.aweme.data.TypingRecommendationCacheData) r1
        L23:
            if (r1 == 0) goto L27
            java.util.List<com.ss.android.ugc.aweme.im.common.model.StickerItem> r3 = r1.stickerList
        L27:
            java.lang.String r0 = "CommentTypingRecManager@ed40.fetchFromLocal$2"
            X.C1C7U.LIZIZ(r0)
            return r3
        L2d:
            X.C155000ia.LIZIZ(r7)
            com.ss.android.ugc.aweme.experiment.CommentStickerTypingRecConfig r0 = X.C452340HoW.LIZ()
            if (r0 != 0) goto L38
            com.ss.android.ugc.aweme.experiment.CommentStickerTypingRecConfig r0 = X.C452340HoW.LIZ
        L38:
            boolean r0 = r0.useLocalCache
            if (r0 == 0) goto L9d
            X.01GW r1 = X.C289110BUv.LIZ
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L55
            r0 = 1
        L4b:
            if (r0 == 0) goto L76
            X.0HoQ r2 = r6.LLILLJJLI
            X.0Hop r1 = r2.LJIIJ
            if (r1 != 0) goto L66
            monitor-enter(r2)
            goto L57
        L55:
            r0 = 0
            goto L4b
        L57:
            X.0Hop r1 = r2.LJIIJ     // Catch: java.lang.Throwable -> La7
            if (r1 != 0) goto L65
            java.lang.Object r1 = X.C1807670x8n.LJJJI()     // Catch: java.lang.Throwable -> La7
            X.0Hop r1 = (X.C452530Hop) r1     // Catch: java.lang.Throwable -> La7
            r2.LJIIJ = r1     // Catch: java.lang.Throwable -> La7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La7
            goto L66
        L65:
            monitor-exit(r2)
        L66:
            java.lang.String r0 = r6.LLILLL
            r6.LL = r4
            java.lang.Object r1 = r1.LJIILJJIL(r0, r3, r6)
            if (r1 != r5) goto L1a
            java.lang.String r0 = "CommentTypingRecManager@ed40.fetchFromLocal$2"
            X.C1C7U.LIZIZ(r0)
            return r5
        L76:
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L83
            r4 = 0
        L83:
            if (r4 == 0) goto L9d
            X.0HoQ r0 = r6.LLILLJJLI
            X.0HoY r1 = r0.LIZIZ()
            java.lang.String r0 = r6.LLILLL
            X.0Hoq r1 = (X.C452540Hoq) r1
            java.lang.Object r1 = r1.LJIILJJIL(r0)
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)
            if (r0 == 0) goto L9a
            r1 = r3
        L9a:
            com.ss.android.ugc.aweme.data.TypingRecommendationCacheData r1 = (com.ss.android.ugc.aweme.data.TypingRecommendationCacheData) r1
            goto L23
        L9d:
            r1 = r3
            goto L23
        L9f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La7:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C452300HoS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends StickerItem>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
