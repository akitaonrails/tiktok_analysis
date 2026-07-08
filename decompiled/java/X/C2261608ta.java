package X;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS582S0100000_3;
import njp.a;

/* JADX INFO: renamed from: X.08ta, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.mixediting.resource.feature.MixEditingFeatureExtractionTask$getFramesForSingleMedia$2", f = "MixEditingFeatureExtractionTask.kt", l = {508}, m = "invokeSuspend")
public final class C2261608ta extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1337805Lk LLILLL;
    public final /* synthetic */ C2277408w8 LLILZ;
    public final /* synthetic */ C2263508tt LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2261608ta(InterfaceC1337805Lk interfaceC1337805Lk, C2277408w8 c2277408w8, C2263508tt c2263508tt, InterfaceC1364105Vn<? super C2261608ta> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1337805Lk;
        this.LLILZ = c2277408w8;
        this.LLILZIL = c2263508tt;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2261608ta c2261608ta = new C2261608ta(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2261608ta.LLILLJJLI = obj;
        return c2261608ta;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixEditingFeatureExtractionTask@c1fc.getFramesForSingleMedia$2");
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
            C099G c099gLIZIZ = C23250099c.LIZIZ((InterfaceC497601wk) this.LLILLJJLI, null, null, new C2261708tb(this.LLILLL, this.LLILZ, this.LLILZIL, null), 3);
            c099gLIZIZ.LJII(new AwS582S0100000_3(this.LLILZ, 127));
            this.LL = 1;
            obj = c099gLIZIZ.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getFramesForSingleMedia$2");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("MixEditingFeatureExtractionTask@c1fc.getFramesForSingleMedia$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
