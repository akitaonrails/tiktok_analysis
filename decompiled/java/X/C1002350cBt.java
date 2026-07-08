package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cBt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$newContactUploadAsync$1", f = "FindFriendsPageVM.kt", l = {281}, m = "invokeSuspend")
public final class C1002350cBt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1074840e4o>, Object> {
    public int LL;
    public final /* synthetic */ FindFriendsPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002350cBt(FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1002350cBt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = findFriendsPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002350cBt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1");
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
            FindFriendsPageVM findFriendsPageVM = this.LLILLJJLI;
            C1056210dal c1056210dal = findFriendsPageVM.LLIZLLLIL;
            C1056110dab c1056110dab = new C1056110dab(findFriendsPageVM, null);
            this.LL = 1;
            obj = c1056210dal.LIZLLL(this, c1056110dab);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1074840e4o> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
