package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS595S0100000_16;
import njp.a;

/* JADX INFO: renamed from: X.0dai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$notifyAuthSync$1", f = "FindFriendsPageVM.kt", l = {}, m = "invokeSuspend")
public final class C1056180dai extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ FindFriendsPageVM LL;
    public final /* synthetic */ EnumC1070410dxf LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056180dai(FindFriendsPageVM findFriendsPageVM, EnumC1070410dxf enumC1070410dxf, InterfaceC1364105Vn<? super C1056180dai> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = findFriendsPageVM;
        this.LLILLJJLI = enumC1070410dxf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056180dai(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.notifyAuthSync$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1073970e3P c1073970e3P = this.LL.getState().LLILZIL;
        int i = C1056190daj.LIZ[this.LLILLJJLI.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.LL.LLILZIL.LIZIZ(new AwS595S0100000_16(c1073970e3P, 14));
            } else {
                throw new C1954807lC();
            }
        } else {
            this.LL.LLILZ.LIZIZ(new AwS595S0100000_16(c1073970e3P, 13));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.notifyAuthSync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
