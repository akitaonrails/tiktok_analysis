package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activestatus.impl.analytics.performance.ActivityStatusAccuracyClient$collectLongPressAccuracyInfo$1", f = "ActivityStatusAccuracyClient.kt", l = {}, m = "invokeSuspend")
public final class C0ZJ6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ZJD LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ RecyclerView LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZJ6(C0ZJD c0zjd, View view, RecyclerView recyclerView, InterfaceC1364105Vn<? super C0ZJ6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0zjd;
        this.LLILLJJLI = view;
        this.LLILLL = recyclerView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZJ6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusAccuracyClient@c0db.collectLongPressAccuracyInfo$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZLLL.getClass();
        ArrayList arrayList = new ArrayList();
        Rect rect = new Rect();
        this.LLILLJJLI.getGlobalVisibleRect(rect);
        int i = rect.top;
        int i2 = rect.bottom;
        int childCount = this.LLILLL.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.LLILLL.getChildAt(i3);
            if (childAt != null && childAt.getGlobalVisibleRect(rect)) {
                int i4 = rect.top;
                int i5 = rect.bottom;
                if (i4 >= i2) {
                    break;
                }
                if (i5 > i) {
                    Object tag = childAt.getTag(R.id.kag);
                    if ((tag instanceof C0ZJ8) && tag != null) {
                        arrayList.add(tag);
                    }
                }
            }
        }
        EnumC1910440zoY enumC1910440zoY = this.LL.LIZ;
        C0ZJ9.LIZ.getClass();
        C0ZJ9.LJ(enumC1910440zoY, arrayList);
        this.LL.LIZLLL.getClass();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusAccuracyClient@c0db.collectLongPressAccuracyInfo$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
