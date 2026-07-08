package X;

import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImageEffectImgCreatorData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vK0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.preupload.task.prepare.CropIconTask$run$2$4$1", f = "CropIconTask.kt", l = {47}, m = "invokeSuspend")
public final class C1737740vK0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1737760vK2 LLILLJJLI;
    public final /* synthetic */ EnumC1736950vIj LLILLL;
    public final /* synthetic */ EditImage LLILZ;
    public final /* synthetic */ EditImageEffectImgCreatorData LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1737740vK0(C1737760vK2 c1737760vK2, EnumC1736950vIj enumC1736950vIj, EditImage editImage, EditImageEffectImgCreatorData editImageEffectImgCreatorData, InterfaceC1364105Vn<? super C1737740vK0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1737760vK2;
        this.LLILLL = enumC1736950vIj;
        this.LLILZ = editImage;
        this.LLILZIL = editImageEffectImgCreatorData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1737740vK0(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CropIconTask@eb99.run$2$4$1");
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
            C1737760vK2 c1737760vK2 = this.LLILLJJLI;
            EnumC1736950vIj enumC1736950vIj = this.LLILLL;
            String path = this.LLILZ.url.getPath();
            String str = "";
            if (path == null) {
                path = "";
            }
            String str2 = this.LLILZIL.iconId;
            if (str2 != null) {
                str = str2;
            }
            this.LL = 1;
            if (c1737760vK2.LIZ(enumC1736950vIj, path, str, this) == objLJFF) {
                C1C7U.LIZIZ("CropIconTask@eb99.run$2$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CropIconTask@eb99.run$2$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
