package X;

import android.content.Context;
import com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl;
import com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl$preload$1", f = "LikeEffectServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C396801gU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<SimpleUriAndUrl> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LikeEffectServiceImpl LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ Context LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C396801gU(List<SimpleUriAndUrl> list, boolean z, LikeEffectServiceImpl likeEffectServiceImpl, Aweme aweme, Function1<? super Boolean, Unit> function1, Context context, InterfaceC1364105Vn<? super C396801gU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = z;
        this.LLILLL = likeEffectServiceImpl;
        this.LLILZ = aweme;
        this.LLILZIL = function1;
        this.LLILZLL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C396801gU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r4 = "LikeEffectServiceImpl@2a22.preload$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r12)
            java.util.List<com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl> r0 = r11.LL
            com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl r5 = r11.LLILLL
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r10 = r11.LLILZIL
            android.content.Context r7 = r11.LLILZLL
            java.util.Iterator r3 = r0.iterator()
            r6 = 0
        L18:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r3.next()
            int r2 = r6 + 1
            r0 = 0
            if (r6 < 0) goto L70
            com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl r1 = (com.ss.android.ugc.aweme.commercialize.model.SimpleUriAndUrl) r1
            if (r1 == 0) goto L63
            java.lang.String r9 = r1.getUrl()
            java.lang.String r8 = r1.getUri()
            if (r9 == 0) goto L63
            int r0 = r9.length()
            if (r0 == 0) goto L63
            if (r8 == 0) goto L63
            int r0 = r8.length()
            if (r0 == 0) goto L63
            android.graphics.Bitmap r0 = r5.LJIJ(r8)
            if (r0 != 0) goto L63
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "preload start url:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "LikeEffectServiceImpl"
            X.C1022620cia.LIZ(r0, r1)
            r5.LJIJI(r6, r7, r8, r9, r10)
        L61:
            r6 = r2
            goto L18
        L63:
            if (r6 != 0) goto L61
            if (r10 == 0) goto L61
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r10.invoke(r0)
            goto L61
        L70:
            X.C1697810uHb.LJIJI()
            throw r0
        L74:
            boolean r0 = r11.LLILLJJLI
            if (r0 == 0) goto L8f
            com.ss.android.ugc.aweme.api.brand.likeeffect.LikeEffectServiceImpl r0 = r11.LLILLL
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r11.LLILZ
            r0.getClass()
            X.01GW r0 = r0.LIZLLL     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L8b
            X.0cbP r0 = (X.C1018170cbP) r0     // Catch: java.lang.Throwable -> L8b
            r0.LIZ(r1)     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L8f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C396801gU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
