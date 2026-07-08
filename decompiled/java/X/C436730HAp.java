package X;

import android.widget.TextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.bytedance.tiktok.homepage.mainfragment.toolbar.search.SearchBarIconGenerator$onAwemeChange$1", f = "SearchBarIconGenerator.kt", l = {297}, m = "invokeSuspend")
public final class C436730HAp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1586240rNe LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ TextView LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436730HAp(TextView textView, C1586240rNe c1586240rNe, Aweme aweme, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1586240rNe;
        this.LLILLL = aweme;
        this.LLILZ = textView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436730HAp(this.LLILZ, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SearchBarIconGenerator@40f9.onAwemeChange$1");
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
            C1586240rNe c1586240rNe = this.LLILLJJLI;
            Aweme aweme = this.LLILLL;
            TextView textView = this.LLILZ;
            this.LL = 1;
            c1586240rNe.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C1355750lNt(textView, c1586240rNe, aweme, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SearchBarIconGenerator@40f9.onAwemeChange$1");
                return objLJFF;
            }
        }
        C1586240rNe c1586240rNe2 = this.LLILLJJLI;
        TextView textView2 = this.LLILZ;
        Aweme aweme2 = this.LLILLL;
        String str = (String) obj;
        if (c1586240rNe2.LLJJ) {
            textView2.setText(c1586240rNe2.LJI());
        } else {
            textView2.setText(str);
        }
        c1586240rNe2.LLJILJIL = new Pair<>(aweme2, str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchBarIconGenerator@40f9.onAwemeChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
