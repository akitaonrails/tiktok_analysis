package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0daL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.friends.utils.ContactUploadUtil$uploadContactWhenFetchABConfig$1$isSyncSuccess$1", f = "ContactUploadUtil.kt", l = {94}, m = "invokeSuspend")
public final class C1055950daL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;

    public C1055950daL(InterfaceC1364105Vn<? super C1055950daL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055950daL(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zBooleanValue;
        C1C7U.LIZ("ContactUploadUtil@889d.uploadContactWhenFetchABConfig$1$isSyncSuccess$1");
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
                EnumC1074240e3q enumC1074240e3q = EnumC1074240e3q.COLD_START;
                this.LL = 1;
                obj = interfaceC1055970daNLIZIZ.LIZIZ(enumC1074240e3q, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContactWhenFetchABConfig$1$isSyncSuccess$1");
                    return objLJFF;
                }
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zBooleanValue = false;
        }
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        C1C7U.LIZIZ("ContactUploadUtil@889d.uploadContactWhenFetchABConfig$1$isSyncSuccess$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return new C1055950daL(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
