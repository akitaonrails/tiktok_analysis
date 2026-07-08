package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H01, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.MemeElementDisplayStrategy$3$1", f = "MemeElementDisplayStrategy.kt", l = {158}, m = "invokeSuspend")
public final class C0H01 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C0H6L LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H01(Context context, String str, C0H6L c0h6l, int i, InterfaceC1364105Vn<? super C0H01> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = c0h6l;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H01(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Pair pair;
        C1C7U.LIZ("MemeElementDisplayStrategy@f7dd.<init>$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Context context = this.LLILLJJLI;
                String str = this.LLILLL;
                this.LL = 1;
                obj = C0H05.LIZJ(context, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MemeElementDisplayStrategy@f7dd.<init>$3$1");
                    return objLJFF;
                }
            }
            Bitmap bitmap = (Bitmap) obj;
            int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int width = (bitmap.getWidth() - iMin) / 2;
            int height = (bitmap.getHeight() - iMin) / 2;
            pair = new Pair(bitmap, new Rect(width, height, width + iMin, iMin + height));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            pair = null;
        }
        if (pair != null) {
            C0H6L c0h6l = this.LLILZ;
            ListProtector.set(c0h6l.LJJIFFI, this.LLILZIL, pair);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemeElementDisplayStrategy@f7dd.<init>$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
