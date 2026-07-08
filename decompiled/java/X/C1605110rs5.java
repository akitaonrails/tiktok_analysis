package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolInfoStruct;
import com.ss.android.ugc.profile.business.ur.school.datasource.SchoolPostsAPI;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rs5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostInnerCacheManager$request$1", f = "SchoolPostInnerCacheManager.kt", l = {97}, m = "invokeSuspend")
public final class C1605110rs5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Aweme LLILLJJLI;
    public final /* synthetic */ SchoolPostsAPI LLILLL;
    public final /* synthetic */ SchoolInfoStruct LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1605110rs5(Aweme aweme, SchoolInfoStruct schoolInfoStruct, SchoolPostsAPI schoolPostsAPI, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = aweme;
        this.LLILLL = schoolPostsAPI;
        this.LLILZ = schoolInfoStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1605110rs5(this.LLILLJJLI, this.LLILZ, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4 A[PHI: r1 r2
      0x00a4: PHI (r1v7 X.05XL) = (r1v6 X.05XL), (r1v12 X.05XL) binds: [B:29:0x00a2, B:24:0x0078] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r2v3 java.util.Map<java.lang.String, X.05XL<kotlin.Unit>>) = 
      (r2v2 java.util.Map<java.lang.String, X.05XL<kotlin.Unit>>)
      (r2v8 java.util.Map<java.lang.String, X.05XL<kotlin.Unit>>)
     binds: [B:29:0x00a2, B:24:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1605110rs5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
