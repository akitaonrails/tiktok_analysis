package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0rFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolposts.SchoolPostsListViewModel$fetchSchoolPosts$2$1$1", f = "SchoolPostsListViewModel.kt", l = {144, 148}, m = "invokeSuspend")
public final class C1581040rFG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ SchoolPostsListViewModel LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C1579330rCV LLILZIL;
    public final /* synthetic */ InterfaceC20236714Gf<AbstractC316870CbV<C1581060rFI>> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1581040rFG(SchoolPostsListViewModel schoolPostsListViewModel, boolean z, C1579330rCV c1579330rCV, InterfaceC20236714Gf<? super AbstractC316870CbV<C1581060rFI>> interfaceC20236714Gf, InterfaceC1364105Vn<? super C1581040rFG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = schoolPostsListViewModel;
        this.LLILZ = z;
        this.LLILZIL = c1579330rCV;
        this.LLILZLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1581040rFG(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a2  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1581040rFG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
