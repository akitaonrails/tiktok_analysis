package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03Ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C832803Ne extends C09AY implements Function1<C2262851Dhb, C2262851Dhb> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ C259800zU<Integer> LLILLL;
    public final /* synthetic */ C259800zU<Integer> LLILZ;
    public final /* synthetic */ C259800zU<Float> LLILZIL;
    public final /* synthetic */ C259800zU<C03MQ> LLILZLL;
    public final /* synthetic */ C03ME LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C832803Ne(C013C c013c, int i, C259800zU c259800zU, C259800zU c259800zU2, C259800zU c259800zU3, C259800zU c259800zU4, C03ME c03me, boolean z) {
        super(1);
        this.LL = c013c;
        this.LLILLJJLI = i;
        this.LLILLL = c259800zU;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
        this.LLILZLL = c259800zU4;
        this.LLIZ = c03me;
        this.LLIZLLLIL = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C2262851Dhb invoke(C2262851Dhb c2262851Dhb) {
        boolean z;
        C2262851Dhb c2262851Dhb2 = c2262851Dhb;
        C833003Ng c833003Ng = new C833003Ng(this.LL.element, 2);
        C830003Mc c830003Mc = new C830003Mc(3, Integer.valueOf(this.LLILLJJLI), this.LLILLL.element, this.LLILZ.element, this.LLILZIL.element, null, 66);
        C03MQ c03mq = this.LLILZLL.element;
        if (!this.LLIZ.LIZ().LLILZIL && this.LLIZLLLIL) {
            z = true;
        } else {
            z = false;
        }
        return C2262851Dhb.LIZ(c2262851Dhb2, null, null, null, new C03MY(c833003Ng, c830003Mc, c03mq, z, null, this.LLIZ.LIZ().LLILZIL, C03MZ.SINGLE, null, 48), null, null, null, null, null, null, null, 2039);
    }
}
