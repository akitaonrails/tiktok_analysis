package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R2j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.common.mob.TakoRecyclerViewScroller$trackPageSlide$1$1", f = "TakoRecyclerViewScroller.kt", l = {}, m = "invokeSuspend")
public final class C689390R2j extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1863850ybP LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Integer LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C689390R2j(C1863850ybP c1863850ybP, String str, String str2, Integer num, boolean z, Integer num2, int i, int i2, InterfaceC1364105Vn<? super C689390R2j> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1863850ybP;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = num;
        this.LLILZIL = z;
        this.LLILZLL = num2;
        this.LLIZ = i;
        this.LLIZLLLIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C689390R2j(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        boolean z;
        C1C7U.LIZ("TakoRecyclerViewScroller@4097.trackPageSlide$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1862330yYx c1862330yYx = C1862330yYx.LIZ;
        C1863850ybP c1863850ybP = this.LL;
        String str3 = c1863850ybP.LLILZIL;
        String str4 = "";
        if (str3 == null) {
            str3 = "";
        }
        String str5 = c1863850ybP.LL;
        if (str5 == null) {
            str5 = "";
        }
        String str6 = c1863850ybP.LLILLJJLI;
        if (str6 == null) {
            str6 = "";
        }
        Map<String, String> map = c1863850ybP.LLJLL;
        String str7 = null;
        if (map != null) {
            str = map.get("word_id");
        } else {
            str = null;
        }
        Map<String, String> map2 = this.LL.LLJLL;
        if (map2 != null) {
            str2 = map2.get("impr_id");
        } else {
            str2 = null;
        }
        Map<String, String> map3 = this.LL.LLJLL;
        if (map3 != null) {
            str7 = map3.get("words_content");
        }
        String str8 = this.LLILLJJLI;
        String str9 = this.LLILLL;
        Integer num = this.LLILZ;
        boolean z2 = this.LLILZIL;
        Integer num2 = this.LLILZLL;
        if (this.LLIZ < 0) {
            z = true;
        } else {
            z = false;
        }
        float fAbs = Math.abs(r1) / this.LLIZLLLIL;
        C1863850ybP c1863850ybP2 = this.LL;
        String str10 = c1863850ybP2.LLILZLL;
        if (str10 != null) {
            str4 = str10;
        }
        C1862330yYx.LJJJJZ(c1862330yYx, str3, str5, str6, str, str2, str7, str8, str9, num, z2, num2, z, fAbs, str4, c1863850ybP2.LLIZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoRecyclerViewScroller@4097.trackPageSlide$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
