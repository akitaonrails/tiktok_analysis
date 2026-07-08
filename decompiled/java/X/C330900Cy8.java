package X;

import android.net.Uri;
import com.ss.android.ugc.aweme.prop.mobileefffect.EditImage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cy8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2VM$quit$1$1", f = "EffectEditV2VM.kt", l = {380}, m = "invokeSuspend")
public final class C330900Cy8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1736840vIY LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C330900Cy8(C1736840vIY c1736840vIY, InterfaceC1364105Vn<? super C330900Cy8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1736840vIY;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C330900Cy8(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Uri uri;
        C1C7U.LIZ("EffectEditV2VM@5973.quit$1$1");
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
                    C1C7U.LIZIZ("EffectEditV2VM@5973.quit$1$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectEditV2VM@5973.quit$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
