package X;

import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03lT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C937303lT extends C09AY implements Function1<C936903lP, C936903lP> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Image LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ C259800zU<EnumC1012103xX> LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C937303lT(List<String> list, String str, Image image, int i, C259800zU<EnumC1012103xX> c259800zU, String str2) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = str;
        this.LLILLL = image;
        this.LLILZ = i;
        this.LLILZIL = c259800zU;
        this.LLILZLL = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C936903lP invoke(C936903lP c936903lP) {
        return C936903lP.LIZ(c936903lP, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, new C937003lQ(this.LLILZIL.element, this.LLILZLL, 4), 1, null, null, null, 0, 1936);
    }
}
