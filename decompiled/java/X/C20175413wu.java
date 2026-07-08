package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13wu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.cover.manager.framework.ExtractionTask$execute$bitmap$1", f = "Task.kt", l = {127}, m = "invokeSuspend")
public final class C20175413wu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Bitmap>, Object> {
    public int LL;
    public final /* synthetic */ C20177513xF LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20175413wu(C20177513xF c20177513xF, InterfaceC1364105Vn<? super C20175413wu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20177513xF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20175413wu(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExtractionTask@f910.execute$bitmap$1");
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
            C20177513xF c20177513xF = this.LLILLJJLI;
            InterfaceC20175613ww interfaceC20175613ww = c20177513xF.LJI;
            C1457070o1J c1457070o1J = c20177513xF.LJFF;
            this.LL = 1;
            obj = interfaceC20175613ww.LIZ(c1457070o1J, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ExtractionTask@f910.execute$bitmap$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ExtractionTask@f910.execute$bitmap$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Bitmap> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
