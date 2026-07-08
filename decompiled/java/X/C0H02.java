package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H02, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.elements.MemeElementDisplayStrategy$2", f = "MemeElementDisplayStrategy.kt", l = {135}, m = "invokeSuspend")
public final class C0H02 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0H6L LL;
    public C0H6L LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C0H6L LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H02(C0H6L c0h6l, Context context, InterfaceC1364105Vn<? super C0H02> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c0h6l;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H02(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C0H6L c0h6l;
        C0H6L c0h6l2;
        Bitmap bitmap;
        C1C7U.LIZ("MemeElementDisplayStrategy@f7dd.<init>$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        if (i != 0) {
            if (i == 1) {
                c0h6l = this.LLILLJJLI;
                c0h6l2 = this.LL;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (C0H04 e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    bitmap = null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c0h6l = this.LLILZ;
            String str = c0h6l.LJIILL;
            Context context = this.LLILZIL;
            try {
                this.LL = c0h6l;
                this.LLILLJJLI = c0h6l;
                this.LLILLL = 1;
                obj = C0H05.LIZJ(context, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MemeElementDisplayStrategy@f7dd.<init>$2");
                    return objLJFF;
                }
                c0h6l2 = c0h6l;
            } catch (C0H04 e2) {
                e = e2;
                TryCatchGuardChecker.doCheck(e);
                bitmap = null;
            }
        }
        bitmap = (Bitmap) obj;
        int iMin = Math.min(bitmap.getWidth(), bitmap.getHeight());
        int width = (bitmap.getWidth() - iMin) / 2;
        int height = (bitmap.getHeight() - iMin) / 2;
        c0h6l2.LJJIIZ.set(width, height, width + iMin, iMin + height);
        List<Pair<Bitmap, Rect>> list = c0h6l2.LJJIFFI;
        ListProtector.set(list, ((CopyOnWriteArrayList) list).size() - 1, new Pair(bitmap, c0h6l2.LJJIIZ));
        c0h6l.LJJII = bitmap;
        C0H6L c0h6l3 = this.LLILZ;
        if (c0h6l3.LJJII == null) {
            c0h6l3.LJJIII = true;
        }
        c0h6l3.LJIIIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MemeElementDisplayStrategy@f7dd.<init>$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
