package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08tW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionService$getAllFramesFlow$1$2$1", f = "MixEditingFeatureExtractionService.kt", l = {683}, m = "invokeSuspend")
public final class C2261208tW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public int LL;
    public final /* synthetic */ MixEditingFeatureExtractionService LLILLJJLI;
    public final /* synthetic */ C2262608tk LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C2263508tt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261208tW(MixEditingFeatureExtractionService mixEditingFeatureExtractionService, C2262608tk c2262608tk, String str, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261208tW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixEditingFeatureExtractionService;
        this.LLILLL = c2262608tk;
        this.LLILZ = str;
        this.LLILZIL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2261208tW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("MixEditingFeatureExtractionService@fa48.getAllFramesFlow$1$2$1");
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
            C2277408w8 c2277408w8 = this.LLILLJJLI.LIZ.get(this.LLILLL.LIZ);
            if (c2277408w8 == null) {
                c2277408w8 = new C2277408w8(this.LLILLL);
                this.LLILLJJLI.LIZ.put(this.LLILLL.LIZ, c2277408w8);
            }
            c2277408w8.LIZ.LJFF = this.LLILLL.LJFF;
            InterfaceC1337805Lk interfaceC1337805Lk = (InterfaceC1337805Lk) this.LLILLJJLI.LJ.getValue();
            C2263508tt c2263508tt = this.LLILZIL;
            this.LL = 1;
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2261608ta(interfaceC1337805Lk, c2277408w8, c2263508tt, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.getAllFramesFlow$1$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionService@fa48.getAllFramesFlow$1$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
