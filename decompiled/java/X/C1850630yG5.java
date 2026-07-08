package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem;
import com.ss.android.ugc.aweme.tako.ccl.model.api.BaseImage;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.BottomInputAssem$initCarriedPhotoIfNeeded$1$2$1", f = "BottomInputAssem.kt", l = {485, 486}, m = "invokeSuspend")
public final class C1850630yG5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ BottomInputAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1850630yG5(List<String> list, BottomInputAssem bottomInputAssem, InterfaceC1364105Vn<? super C1850630yG5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = bottomInputAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1850630yG5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        BaseImage baseImage;
        C1854760yMk c1854760yMk;
        C1854650yMZ photoDisplayLayout;
        C1C7U.LIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$1$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    baseImage = (BaseImage) obj;
                    if (baseImage != null && (c1854760yMk = this.LLILLL.LLJJJ) != null && (photoDisplayLayout = c1854760yMk.getPhotoDisplayLayout()) != null) {
                        photoDisplayLayout.LIZ("feed_carried", baseImage, null);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$1$2$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = C339320DRy.LIZ(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$1$2$1");
                return objLJFF;
            }
        }
        C1DFB c1dfb = C0PEM.LIZJ;
        C1850600yG2 c1850600yG2 = new C1850600yG2(this.LLILLL, (Bitmap) obj, null);
        this.LL = 2;
        obj = C23250099c.LJI(this, c1dfb, c1850600yG2);
        if (obj == objLJFF) {
            C1C7U.LIZIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$1$2$1");
            return objLJFF;
        }
        baseImage = (BaseImage) obj;
        if (baseImage != null) {
            photoDisplayLayout.LIZ("feed_carried", baseImage, null);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BottomInputAssem@df38.initCarriedPhotoIfNeeded$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
