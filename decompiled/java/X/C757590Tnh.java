package X;

import com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS149S1100000_35;
import njp.a;

/* JADX INFO: renamed from: X.0Tnh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.FollowRelationTabFragment$newAuthDialogCenter$1", f = "FollowRelationTabFragment.kt", l = {795}, m = "invokeSuspend")
public final class C757590Tnh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ FollowRelationTabFragment LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C757590Tnh(FollowRelationTabFragment followRelationTabFragment, String str, InterfaceC1364105Vn<? super C757590Tnh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = followRelationTabFragment;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C757590Tnh c757590Tnh = new C757590Tnh(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c757590Tnh.LLILLJJLI = obj;
        return c757590Tnh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C095D c095dLIZIZ;
        C1C7U.LIZ("FollowRelationTabFragment@dc13.newAuthDialogCenter$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC1264610j0t interfaceC1264610j0tLIZIZ = C1072350e0n.LIZIZ(this.LLILLL, new AwS149S1100000_35(this.LLILZ, (InterfaceC497601wk) this.LLILLJJLI, 10));
            if (interfaceC1264610j0tLIZIZ != null && (c095dLIZIZ = ((C1073210e2B) interfaceC1264610j0tLIZIZ).LIZIZ()) != null) {
                this.LL = 1;
                if (C09IC.LJI(c095dLIZIZ, this) == objLJFF) {
                    C1C7U.LIZIZ("FollowRelationTabFragment@dc13.newAuthDialogCenter$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowRelationTabFragment@dc13.newAuthDialogCenter$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
