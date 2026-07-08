package X;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.marketing.widget.BubbleImageLoader$loadAll$2$3$1", f = "BubbleImageLoader.kt", l = {105}, m = "invokeSuspend")
public final class C324401Nq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Bitmap>>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324401Nq(int i, Context context, String str, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = context;
        this.LLILZIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILLL;
        return new C324401Nq(this.LLILZIL, this.LLILZ, str, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("BubbleImageLoader@6f48.loadAll$2$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.LL;
                C155000ia.LIZIZ(obj);
                obj2 = obj3;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String str = this.LLILLL;
            Context context = this.LLILZ;
            int i2 = this.LLILZIL;
            this.LL = str;
            this.LLILLJJLI = 1;
            obj = C468101rz.LIZ(i2, context, str, this);
            obj2 = str;
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BubbleImageLoader@6f48.loadAll$2$3$1");
                return objLJFF;
            }
        }
        Pair pair = new Pair(obj2, obj);
        C1C7U.LIZIZ("BubbleImageLoader@6f48.loadAll$2$3$1");
        return pair;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends String, ? extends Bitmap>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
