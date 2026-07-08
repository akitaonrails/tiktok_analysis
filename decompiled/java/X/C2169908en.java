package X;

import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08en, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$uploadImage$2$authKeyDeferred$1", f = "MobileEffectUtil.kt", l = {1469}, m = "invokeSuspend")
public final class C2169908en extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<UploadAuthKeyConfig>>, Object> {
    public int LL;

    public C2169908en(InterfaceC1364105Vn<? super C2169908en> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2169908en(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.uploadImage$2$authKeyDeferred$1");
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
            this.LL = 1;
            obj = C1737900vKG.LJIJI(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.uploadImage$2$authKeyDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.uploadImage$2$authKeyDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1738190vKj<UploadAuthKeyConfig>> interfaceC1364105Vn) {
        return new C2169908en(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
