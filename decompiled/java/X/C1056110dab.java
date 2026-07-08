package X;

import com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0dab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.ffp.vm.FindFriendsPageVM$newContactUploadAsync$1$1", f = "FindFriendsPageVM.kt", l = {285, 287}, m = "invokeSuspend")
public final class C1056110dab extends C09AX implements Function1<InterfaceC1364105Vn<? super C1074840e4o>, Object> {
    public int LL;
    public final /* synthetic */ FindFriendsPageVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1056110dab(FindFriendsPageVM findFriendsPageVM, InterfaceC1364105Vn<? super C1056110dab> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = findFriendsPageVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1056110dab(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super C1074840e4o> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1$1");
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1074230e3p.LIZIZ(C1074230e3p.LIZ(this.LLILLJJLI.getState().LLILZIL.LIZ), 2);
            C338980DQq.LIZ.getClass();
            if (C338980DQq.LIZIZ()) {
                C1071540dzU c1071540dzU = C1071540dzU.LIZIZ;
                if (c1071540dzU.LJ(EnumC1070340dxY.CONTACT).LIZIZ()) {
                    InterfaceC1056100daa interfaceC1056100daaLJIIIZ = c1071540dzU.LJIIIZ();
                    int value = EnumC1056090daZ.CONTACT_BOOK_SYNCING.getValue();
                    this.LL = 1;
                    if (interfaceC1056100daaLJIIIZ.LIZ(value, this) == objLJFF) {
                        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1$1");
                        return objLJFF;
                    }
                }
            }
        }
        InterfaceC1055970daN interfaceC1055970daN = this.LLILLJJLI.LL;
        EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.FIND_FRIENDS;
        this.LL = 2;
        obj = interfaceC1055970daN.LIZ(enumC1074240e3q, this);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1$1");
            return objLJFF;
        }
        C1C7U.LIZIZ("FindFriendsPageVM@4a7b.newContactUploadAsync$1$1");
        return obj;
    }
}
