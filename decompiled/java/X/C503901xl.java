package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$prepareWithLoading$1", f = "VideoImageMixedController.kt", l = {887, 904, 908, 912}, m = "invokeSuspend")
public final class C503901xl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ VideoImageMixedController LLILLL;
    public final /* synthetic */ List<TikTokMediaModel> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C503901xl(boolean z, VideoImageMixedController videoImageMixedController, List<? extends TikTokMediaModel> list, boolean z2, Function0<Unit> function0, InterfaceC1364105Vn<? super C503901xl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = videoImageMixedController;
        this.LLILZ = list;
        this.LLILZIL = z2;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C503901xl(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "VideoImageMixedController@1fe.prepareWithLoading$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 4
            r3 = 3
            r8 = 2
            r7 = 1
            r4 = 0
            if (r0 == 0) goto L23
            if (r0 == r7) goto L3b
            if (r0 == r8) goto L64
            if (r0 == r3) goto L8d
            if (r0 != r6) goto La7
            X.C155000ia.LIZIZ(r11)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.C155000ia.LIZIZ(r11)
            X.08ps r2 = X.C2108108Nr.LIZ
            X.01xo r1 = new X.01xo
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r0 = r10.LLILLL
            r1.<init>(r0, r4)
            r10.LL = r7
            java.lang.Object r0 = X.C23250099c.LJI(r10, r2, r1)
            if (r0 != r5) goto L3e
            X.C1C7U.LIZIZ(r9)
            return r5
        L3b:
            X.C155000ia.LIZIZ(r11)
        L3e:
            boolean r0 = r10.LLILLJJLI
            if (r0 == 0) goto L67
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r0 = r10.LLILLL
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r2 = r10.LLILZ
            r10.LL = r8
            r0.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01wl r0 = new X.01wl
            r0.<init>(r2, r4)
            java.lang.Object r1 = X.C23250099c.LJI(r10, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L5e
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L5e:
            if (r1 != r5) goto L67
            X.C1C7U.LIZIZ(r9)
            return r5
        L64:
            X.C155000ia.LIZIZ(r11)
        L67:
            boolean r0 = r10.LLILZIL
            if (r0 == 0) goto L90
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r0 = r10.LLILLL
            java.util.List<com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel> r2 = r10.LLILZ
            r10.LL = r3
            r0.getClass()
            X.1DFB r1 = X.C0PEM.LIZJ
            X.01wm r0 = new X.01wm
            r0.<init>(r2, r4)
            java.lang.Object r1 = X.C23250099c.LJI(r10, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L87
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L87:
            if (r1 != r5) goto L90
            X.C1C7U.LIZIZ(r9)
            return r5
        L8d:
            X.C155000ia.LIZIZ(r11)
        L90:
            X.08ps r3 = X.C2108108Nr.LIZ
            X.01xm r2 = new X.01xm
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController r1 = r10.LLILLL
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r10.LLILZLL
            r2.<init>(r1, r0, r4)
            r10.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r10, r3, r2)
            if (r0 != r5) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r5
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C503901xl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
