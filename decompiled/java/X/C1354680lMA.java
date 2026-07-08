package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.util.AIPhotoCommentHelperKt$enterAIChatPage$1", f = "AIPhotoCommentHelper.kt", l = {118, 122}, m = "invokeSuspend")
public final class C1354680lMA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC1354700lMC LLILLL;
    public final /* synthetic */ UrlModel LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C788550UwX LLILZLL;
    public final /* synthetic */ C1347430lAT LLIZ;
    public final /* synthetic */ Context LLIZLLLIL;
    public final /* synthetic */ OnActivityResultCallback LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354680lMA(long j, InterfaceC1354700lMC interfaceC1354700lMC, UrlModel urlModel, String str, C788550UwX c788550UwX, C1347430lAT c1347430lAT, Context context, OnActivityResultCallback onActivityResultCallback, InterfaceC1364105Vn<? super C1354680lMA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC1354700lMC;
        this.LLILZ = urlModel;
        this.LLILZIL = str;
        this.LLILZLL = c788550UwX;
        this.LLIZ = c1347430lAT;
        this.LLIZLLLIL = context;
        this.LLJ = onActivityResultCallback;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1354680lMA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJI = obj;
        C1C7U.LIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLJI);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLJI);
        } else {
            C155000ia.LIZIZ(objLJI);
            C1DFB c1dfb = C0PEM.LIZJ;
            C1354690lMB c1354690lMB = new C1354690lMB(this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            objLJI = C23250099c.LJI(this, c1dfb, c1354690lMB);
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1");
                return objLJFF;
            }
        }
        String str = C1357140lQ8.LIZIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIPhotoCommentHelper -> enterAIChatPage: launchFromComment；duration = ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLJJLI);
        C201955140j.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1354670lM9 c1354670lM9 = new C1354670lM9(this.LLILZLL, (C07YI) objLJI, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILLJJLI, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1354670lM9) == objLJFF) {
            C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AIPhotoCommentHelperKt@1fb1.enterAIChatPage$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
