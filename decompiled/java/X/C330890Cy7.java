package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.EffectEditVM$quit$1$1", f = "EffectEditVM.kt", l = {488}, m = "invokeSuspend")
public final class C330890Cy7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1736830vIX LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330890Cy7(C1736830vIX c1736830vIX, InterfaceC1364105Vn<? super C330890Cy7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1736830vIX;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330890Cy7(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        C1C7U.LIZ("EffectEditVM@62f.quit$1$1");
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
            EditImage editImage = this.LLILLJJLI.LLILZLL;
            if (editImage != null && (uri = editImage.url) != null) {
                this.LL = 1;
                if (C23250099c.LJI(this, C0PEM.LIZJ, new C492701vx(uri, null)) == objLJFF) {
                    C1C7U.LIZIZ("EffectEditVM@62f.quit$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditVM@62f.quit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
