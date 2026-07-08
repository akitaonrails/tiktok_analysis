package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.MobileEffectUtilKt$uploadImage$2$femaleIconSaveDeferred$1", f = "MobileEffectUtil.kt", l = {1470}, m = "invokeSuspend")
public final class C2170008eo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ EditImage LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2170008eo(EditImage editImage, InterfaceC1364105Vn<? super C2170008eo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = editImage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2170008eo(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectUtilKt@ccb6.uploadImage$2$femaleIconSaveDeferred$1");
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
            EditImage editImage = this.LLILLJJLI;
            this.LL = 1;
            obj = C1737900vKG.LJJ(editImage, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.uploadImage$2$femaleIconSaveDeferred$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MobileEffectUtilKt@ccb6.uploadImage$2$femaleIconSaveDeferred$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
