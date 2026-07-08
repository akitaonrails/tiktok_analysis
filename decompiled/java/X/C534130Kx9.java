package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kx9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewImageScene$showAnimateAsync$1", f = "PreviewImageScene.kt", l = {145}, m = "invokeSuspend")
public final class C534130Kx9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PreviewImageScene LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C534130Kx9(PreviewImageScene previewImageScene, boolean z, InterfaceC1364105Vn<? super C534130Kx9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = previewImageScene;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C534130Kx9(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String strLJFF;
        C1C7U.LIZ("PreviewImageScene@d7e3.showAnimateAsync$1");
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
            TikTokMediaModel tikTokMediaModel = this.LLILLJJLI.LLJJJIL;
            if (tikTokMediaModel != null) {
                strLJFF = tikTokMediaModel.LJFF();
            } else {
                strLJFF = null;
            }
            int iLIZIZ = C2475309mx.LIZIZ(strLJFF);
            C2238608ps c2238608ps = C2108108Nr.LIZ;
            C534140KxA c534140KxA = new C534140KxA(this.LLILLJJLI, this.LLILLL, iLIZIZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c534140KxA) == objLJFF) {
                C1C7U.LIZIZ("PreviewImageScene@d7e3.showAnimateAsync$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewImageScene@d7e3.showAnimateAsync$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
