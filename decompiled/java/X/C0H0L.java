package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0L, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.SelectMemeDisplayStrategy$2", f = "SelectMemeDisplayStrategy.kt", l = {110}, m = "invokeSuspend")
public final class C0H0L extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C435630H6j LL;
    public C435630H6j LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C435630H6j LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0L(C435630H6j c435630H6j, String str, InterfaceC1364105Vn<? super C0H0L> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c435630H6j;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H0L(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C435630H6j c435630H6j;
        C435630H6j c435630H6j2;
        C1C7U.LIZ("SelectMemeDisplayStrategy@44c6.<init>$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        Bitmap bitmap = null;
        if (i != 0) {
            if (i == 1) {
                c435630H6j = this.LLILLJJLI;
                c435630H6j2 = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (C0H04 e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c435630H6j = this.LLILZ;
            String str = this.LLILZIL;
            if (str != null) {
                try {
                    Context context = c435630H6j.LJFF;
                    this.LL = c435630H6j;
                    this.LLILLJJLI = c435630H6j;
                    this.LLILLL = 1;
                    obj = C0H05.LIZJ(context, str, this);
                    if (obj == objLJFF) {
                        C1C7U.LIZIZ("SelectMemeDisplayStrategy@44c6.<init>$2");
                        return objLJFF;
                    }
                    c435630H6j2 = c435630H6j;
                } catch (C0H04 e2) {
                    e = e2;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            c435630H6j.LJIJJLI = bitmap;
            this.LLILZ.LJIIIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SelectMemeDisplayStrategy@44c6.<init>$2");
            return unit;
        }
        Bitmap bitmap2 = (Bitmap) obj;
        int iMin = Math.min(bitmap2.getWidth(), bitmap2.getHeight());
        int width = (bitmap2.getWidth() - iMin) / 2;
        int height = (bitmap2.getHeight() - iMin) / 2;
        c435630H6j2.LJIL = new Rect(width, height, width + iMin, iMin + height);
        bitmap = bitmap2;
        c435630H6j.LJIJJLI = bitmap;
        this.LLILZ.LJIIIZ();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SelectMemeDisplayStrategy@44c6.<init>$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
