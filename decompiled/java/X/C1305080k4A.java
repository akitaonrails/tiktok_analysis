package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.interact.digg.VibeDiggOperatorImpl$obtainAnimationResource$1", f = "VibeDiggOperatorImpl.kt", l = {BaseNotice.CREATOR, 63}, m = "invokeSuspend")
public final class C1305080k4A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1305090k4B LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C1305090k4B LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<UrlModel> LLILZLL;
    public final /* synthetic */ Integer LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1305080k4A(C1305090k4B c1305090k4B, String str, List<? extends UrlModel> list, Integer num, Function0<Unit> function0, InterfaceC1364105Vn<? super C1305080k4A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1305090k4B;
        this.LLILZIL = str;
        this.LLILZLL = list;
        this.LLIZ = num;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1305080k4A c1305080k4A = new C1305080k4A(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1305080k4A.LLILLL = obj;
        return c1305080k4A;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "VibeDiggOperatorImpl@9bb0.obtainAnimationResource$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r7 = 2
            r4 = 1
            if (r0 == 0) goto L39
            if (r0 == r4) goto L64
            if (r0 != r7) goto L90
            X.0k4B r4 = r9.LL
            java.lang.Object r5 = r9.LLILLL
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.C155000ia.LIZIZ(r10)
        L1c:
            com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource r10 = (com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource) r10
            r4.LJI = r10
            X.0k4B r1 = r9.LLILZ
            java.lang.String r0 = r9.LLILZIL
            r1.LJII = r0
        L26:
            boolean r0 = X.C2296808zG.LJI(r5)
            if (r0 == 0) goto L33
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r9.LLIZLLLIL
            if (r0 == 0) goto L33
            r0.invoke()
        L33:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L39:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r5 = r9.LLILLL
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.0k4B r0 = r9.LLILZ
            java.lang.String r1 = r0.LJII
            java.lang.String r0 = r9.LLILZIL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L26
            X.0k4B r3 = r9.LLILZ
            java.util.List<com.ss.android.ugc.aweme.base.model.UrlModel> r2 = r9.LLILZLL
            java.lang.Integer r1 = r9.LLIZ
            r9.LLILLL = r5
            r9.LL = r3
            r9.LLILLJJLI = r4
            X.0mGL r0 = r3.LIZ
            java.lang.Object r10 = r0.LIZ(r2, r1, r9)
            if (r10 != r6) goto L6d
            X.C1C7U.LIZIZ(r8)
            return r6
        L64:
            X.0k4B r3 = r9.LL
            java.lang.Object r5 = r9.LLILLL
            X.01wk r5 = (X.InterfaceC497601wk) r5
            X.C155000ia.LIZIZ(r10)
        L6d:
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
            r3.LJFF = r10
            X.0k4B r4 = r9.LLILZ
            r9.LLILLL = r5
            r9.LL = r4
            r9.LLILLJJLI = r7
            X.0mGL r3 = r4.LIZ
            r3.getClass()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.11Fb r1 = new X.11Fb
            r0 = 0
            r1.<init>(r3, r0)
            java.lang.Object r10 = X.C23250099c.LJI(r9, r2, r1)
            if (r10 != r6) goto L1c
            X.C1C7U.LIZIZ(r8)
            return r6
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1305080k4A.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
