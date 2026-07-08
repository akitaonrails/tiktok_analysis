package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Wo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.util.GroupMemberUtil$loadGroupManagerToCache$1", f = "GroupMemberUtil.kt", l = {}, m = "invokeSuspend")
public final class C1366805Wo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366805Wo(String str, InterfaceC1364105Vn<? super C1366805Wo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1366805Wo(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupMemberUtil@7ee8.loadGroupManagerToCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1461005nk c1461005nk = C1461005nk.LIZ;
        String str = this.LL;
        c1461005nk.getClass();
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        final String str2 = this.LL;
        c866530Xz1LIZIZ.LJIIIZ(new InterfaceC863600XuI<List<? extends C0YAE>>() { // from class: X.05Wn
            @Override // X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
            }

            @Override // X.InterfaceC863600XuI
            public final void onSuccess(List<? extends C0YAE> list) {
                List<? extends C0YAE> list2 = list;
                if (list2 != null) {
                    String str3 = str2;
                    C1461005nk.LIZ.getClass();
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
                    for (C0YAE c0yae : list2) {
                        C1462005nu c1462005nu = new C1462005nu(String.valueOf(c0yae.getUid()), c0yae.getSecUid());
                        c1462005nu.setMember(c0yae);
                        arrayList.add(c1462005nu);
                    }
                    C1461005nk.LJ.put(str3, arrayList);
                }
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GroupMemberUtil@7ee8.loadGroupManagerToCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
