package X;

import com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0iHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.school.findschoolfriends.schoolgroups.SchoolGroupsListViewModel$fetchSchoolGroupsAPI$2$1$1", f = "SchoolGroupsListViewModel.kt", l = {168}, m = "invokeSuspend")
public final class C1236470iHV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1007450cK7 LLILLJJLI;
    public final /* synthetic */ SchoolGroupsListViewModel LLILLL;
    public final /* synthetic */ InterfaceC20236714Gf<AbstractC316870CbV<C1007450cK7>> LLILZ;
    public final /* synthetic */ C1236480iHW LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1236470iHV(C1007450cK7 c1007450cK7, SchoolGroupsListViewModel schoolGroupsListViewModel, InterfaceC20236714Gf<? super AbstractC316870CbV<C1007450cK7>> interfaceC20236714Gf, C1236480iHW c1236480iHW, InterfaceC1364105Vn<? super C1236470iHV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1007450cK7;
        this.LLILLL = schoolGroupsListViewModel;
        this.LLILZ = interfaceC20236714Gf;
        this.LLILZIL = c1236480iHW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1236470iHV(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x019b  */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.13BV] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 667
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1236470iHV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
