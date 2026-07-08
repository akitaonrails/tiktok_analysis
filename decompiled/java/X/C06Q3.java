package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Q3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.StoryPublishServiceImpl$getCover$1", f = "StoryPublishServiceImpl.kt", l = {84}, m = "invokeSuspend")
public final class C06Q3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C06Q3(String str, Function1<? super Bitmap, Unit> function1, InterfaceC1364105Vn<? super C06Q3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06Q3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryPublishServiceImpl@e66c.getCover$1");
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
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.LLILLJJLI);
            if (bitmapDecodeFile == null && ((Number) C287140BNg.LIZ.getValue()).intValue() == 1) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.getCover$1");
                return unit;
            }
            C2238608ps c2238608ps = C2108108Nr.LIZ;
            C1318405Dy c1318405Dy = new C1318405Dy(bitmapDecodeFile, this.LLILLL, null);
            this.LL = 1;
            if (C23250099c.LJI(this, c2238608ps, c1318405Dy) == objLJFF) {
                C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.getCover$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("StoryPublishServiceImpl@e66c.getCover$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
