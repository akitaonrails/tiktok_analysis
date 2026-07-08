package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.VoucherInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.03xf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1012903xf extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C259800zU<String> LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ VoucherInfo LLILZLL = null;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ Boolean LLJI;
    public final /* synthetic */ String LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ List<String> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ Integer LLJJ;
    public final /* synthetic */ Integer LLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1012903xf(C259800zU c259800zU, Context context, String str, String str2, Map map, String str3, String str4, String str5, Boolean bool, String str6, String str7, List list, boolean z, Integer num, Integer num2) {
        super(0);
        this.LL = c259800zU;
        this.LLILLJJLI = context;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = map;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = str5;
        this.LLJI = bool;
        this.LLJIJIL = str6;
        this.LLJILJIL = str7;
        this.LLJILJILJ = list;
        this.LLJILLL = z;
        this.LLJJ = num;
        this.LLJJI = num2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.element = C1013103xh.LIZIZ(C1013103xh.LIZ, this.LLILLJJLI, this.LLILLL, 1, "product_detail", 2, this.LLILZ, this.LLILZIL, this.LLILZLL, null, null, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, null, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, null, null, 12617472);
        return Unit.LIZ;
    }
}
