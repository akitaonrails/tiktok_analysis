package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friends.utils.ContactUploadUtil$uploadContacts$1$contactItemList$1", f = "ContactUploadUtil.kt", l = {37}, m = "invokeSuspend")
public final class C1055960daM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Collection<? extends C1074830e4n>>, Object> {
    public int LL;
    public final /* synthetic */ EnumC1074240e3q LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055960daM(EnumC1074240e3q enumC1074240e3q, InterfaceC1364105Vn<? super C1055960daM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1074240e3q;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055960daM(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Collection<C1074830e4n> collectionValues;
        C1C7U.LIZ("ContactUploadUtil@889d.uploadContacts$1$contactItemList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC1055970daN interfaceC1055970daNLIZIZ = C1071540dzU.LIZIZ.LIZIZ();
                EnumC1074240e3q enumC1074240e3q = this.LLILLJJLI;
                this.LL = 1;
                obj = interfaceC1055970daNLIZIZ.LIZ(enumC1074240e3q, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContacts$1$contactItemList$1");
                    return objLJFF;
                }
            }
            collectionValues = ((C1074840e4o) obj).hashNationalNumberMap.values();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            collectionValues = null;
        }
        C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContacts$1$contactItemList$1");
        return collectionValues;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Collection<? extends C1074830e4n>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
