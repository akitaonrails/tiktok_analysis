package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ck1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.utils.TakoBitmapUtil$loadBitmapFromUrlsNew$3", f = "TakoBitmapUtil.kt", l = {510}, m = "invokeSuspend")
public final class C322150Ck1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ Function1<Bitmap, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C322150Ck1(List<String> list, String str, Context context, Function1<? super Bitmap, Unit> function1, InterfaceC1364105Vn<? super C322150Ck1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322150Ck1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoBitmapUtil@73d4.loadBitmapFromUrlsNew$3");
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
            C444880HcU c444880HcU = C0H9N.LIZ;
            List<String> list = this.LLILLJJLI;
            this.LL = 1;
            obj = C0H9N.LJFF(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoBitmapUtil@73d4.loadBitmapFromUrlsNew$3");
                return objLJFF;
            }
        }
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled() && this.LLILLL.length() > 0) {
            C444880HcU c444880HcU2 = C0H9N.LIZ;
            C0H9N.LIZLLL(ColorProtector.parseColor(this.LLILLL), this.LLILZ, bitmap);
            this.LLILZIL.invoke(bitmap);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoBitmapUtil@73d4.loadBitmapFromUrlsNew$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
