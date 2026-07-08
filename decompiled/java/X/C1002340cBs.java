package X;

import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0cBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$newFacebookUploadAsync$1$1", f = "FindFriendsPageVM.kt", l = {261}, m = "invokeSuspend")
public final class C1002340cBs extends C09AX implements Function1<InterfaceC1364105Vn<? super List<? extends User>>, Object> {
    public int LL;
    public final /* synthetic */ FindFriendsPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002340cBs(FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1002340cBs> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = findFriendsPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002340cBs(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super List<? extends User>> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.newFacebookUploadAsync$1$1");
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
            InterfaceC1004520cFO interfaceC1004520cFO = this.LLILLJJLI.LLILLJJLI;
            EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.FIND_FRIENDS;
            this.LL = 1;
            obj = interfaceC1004520cFO.LIZ(enumC1074240e3q, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newFacebookUploadAsync$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newFacebookUploadAsync$1$1");
        return obj;
    }
}
