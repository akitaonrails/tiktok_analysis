package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.helper.SocialFriendsHelper$syncFacebook$1$1", f = "SocialFriendsHelper.kt", l = {417}, m = "invokeSuspend")
public final class C1055910daH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C09AJ<List<Integer>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055910daH(int i, C09AJ<List<Integer>> c09aj, InterfaceC1364105Vn<? super C1055910daH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i;
        this.LLILLL = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055910daH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        EnumC1074240e3q enumC1074240e3q;
        C1C7U.LIZ("SocialFriendsHelper@b1e6.syncFacebook$1$1");
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
            InterfaceC1004520cFO interfaceC1004520cFOLJII = C1071540dzU.LIZIZ.LJII();
            if (this.LLILLJJLI == 2) {
                enumC1074240e3q = EnumC1074240e3q.SIGN_UP;
            } else {
                enumC1074240e3q = EnumC1074240e3q.LOGIN;
            }
            this.LL = 1;
            obj = interfaceC1004520cFOLJII.LIZIZ(enumC1074240e3q, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncFacebook$1$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sync fb ");
        sbLIZ.append(zBooleanValue);
        sbLIZ.append(", ");
        sbLIZ.append(C786410Ut5.u3().getName());
        C2188811AlT.LIZIZ(sbLIZ);
        if (zBooleanValue) {
            this.LLILLL.onNext(Collections.singletonList(C2286608xc.LJ(2)));
        } else {
            this.LLILLL.onNext(Collections.singletonList(C2286608xc.LJ(0)));
        }
        this.LLILLL.onComplete();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialFriendsHelper@b1e6.syncFacebook$1$1");
        return unit;
    }
}
