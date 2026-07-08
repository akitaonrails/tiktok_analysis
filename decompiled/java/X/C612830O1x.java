package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0O1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.editshare.vm.suggested.EditShareSuggestedDataSource$preLoadSuggestedContacts$1", f = "EditShareSuggestedDataSource.kt", l = {141}, m = "invokeSuspend")
public final class C612830O1x extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C612830O1x(InterfaceC1364105Vn<? super C612830O1x> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C612830O1x(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditShareSuggestedDataSource@8e47.preLoadSuggestedContacts$1");
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
            C0O22 c0o22 = C0O22.LIZ;
            this.LL = 1;
            obj = c0o22.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EditShareSuggestedDataSource@8e47.preLoadSuggestedContacts$1");
                return objLJFF;
            }
        }
        ConcurrentLinkedQueue<IMContact> concurrentLinkedQueue = C0O22.LIZJ;
        concurrentLinkedQueue.clear();
        concurrentLinkedQueue.addAll((Collection) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EditShareSuggestedDataSource@8e47.preLoadSuggestedContacts$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C612830O1x(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
