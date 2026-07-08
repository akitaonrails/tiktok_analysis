package X;

import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.awemepushlib.manager.PushImageLoadManager$getPushImageBitmapTemp$1", f = "PushImageLoadManager.kt", l = {289}, m = "invokeSuspend")
public final class C591560NIc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C814730Vxf LLILLJJLI;
    public final /* synthetic */ Bitmap[] LLILLL;
    public final /* synthetic */ Bitmap[] LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C591560NIc(C814730Vxf c814730Vxf, Bitmap[] bitmapArr, Bitmap[] bitmapArr2, InterfaceC1364105Vn<? super C591560NIc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c814730Vxf;
        this.LLILLL = bitmapArr;
        this.LLILZ = bitmapArr2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C591560NIc(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PushImageLoadManager@c8dc.getPushImageBitmapTemp$1");
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
            C814730Vxf c814730Vxf = this.LLILLJJLI;
            Bitmap[] bitmapArr = this.LLILLL;
            Bitmap[] bitmapArr2 = this.LLILZ;
            this.LL = 1;
            if (C815340Vye.LIZLLL(c814730Vxf, bitmapArr, bitmapArr2, this) == objLJFF) {
                C1C7U.LIZIZ("PushImageLoadManager@c8dc.getPushImageBitmapTemp$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PushImageLoadManager@c8dc.getPushImageBitmapTemp$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
