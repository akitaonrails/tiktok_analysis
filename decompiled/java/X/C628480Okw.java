package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse;
import com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Okw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel$toggleFavorite$2$2", f = "TemplateFavoriteViewModel.kt", l = {81, 83}, m = "invokeSuspend")
public final class C628480Okw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public TemplateFavoriteResponse LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ TemplateFavoriteViewModel LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Fragment LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C628480Okw(TemplateFavoriteViewModel templateFavoriteViewModel, boolean z, String str, Fragment fragment, InterfaceC1364105Vn<? super C628480Okw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = templateFavoriteViewModel;
        this.LLILZIL = z;
        this.LLILZLL = str;
        this.LLIZ = fragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C628480Okw(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r10 = r16
            java.lang.String r8 = "TemplateFavoriteViewModel@dc86.toggleFavorite$2$2"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r15.LLILLL
            r6 = 2
            r7 = 1
            if (r0 == 0) goto L5c
            if (r0 == r7) goto L79
            if (r0 != r6) goto La3
            long r0 = r15.LL
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r4 = r15.LLILLJJLI
            X.C155000ia.LIZIZ(r10)
        L1c:
            java.lang.String r7 = r15.LLILZLL
            boolean r6 = r15.LLILZIL
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            java.lang.Integer r0 = r4.status_code
            if (r0 == 0) goto L5a
            int r5 = r0.intValue()
        L2d:
            X.0LAB r4 = new X.0LAB
            r4.<init>()
            java.lang.String r0 = "resource_id"
            r4.LJ(r0, r7)
            java.lang.String r1 = "enter_from"
            java.lang.String r0 = "template_detail_page"
            r4.LJ(r1, r0)
            java.lang.String r0 = "to_status"
            r4.LIZ(r6, r0)
            java.lang.String r0 = "duration"
            r4.LIZIZ(r2, r0)
            java.lang.String r0 = "status_code"
            r4.LIZ(r5, r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = r4.LIZ
            java.lang.String r0 = "template_favorite_api_performance"
            X.C20684815ws.LJIILLIIL(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L5a:
            r5 = -1
            goto L2d
        L5c:
            X.C155000ia.LIZIZ(r10)
            long r0 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel r2 = r15.LLILZ
            X.0Ol9 r4 = r2.LLILZLL
            boolean r3 = r15.LLILZIL
            java.lang.String r2 = r15.LLILZLL
            r15.LL = r0
            r15.LLILLL = r7
            java.lang.Object r10 = r4.LIZ(r2, r3, r15)
            if (r10 != r5) goto L7e
            X.C1C7U.LIZIZ(r8)
            return r5
        L79:
            long r0 = r15.LL
            X.C155000ia.LIZIZ(r10)
        L7e:
            com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse r10 = (com.ss.android.ugc.aweme.template.net.TemplateFavoriteResponse) r10
            X.1DFH r2 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Okx r9 = new X.0Okx
            com.ss.android.ugc.aweme.template.viewmodel.TemplateFavoriteViewModel r11 = r15.LLILZ
            androidx.fragment.app.Fragment r12 = r15.LLIZ
            boolean r13 = r15.LLILZIL
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14)
            r15.LLILLJJLI = r10
            r15.LL = r0
            r15.LLILLL = r6
            java.lang.Object r2 = X.C23250099c.LJI(r15, r2, r9)
            if (r2 != r5) goto La0
            X.C1C7U.LIZIZ(r8)
            return r5
        La0:
            r4 = r10
            goto L1c
        La3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C628480Okw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
