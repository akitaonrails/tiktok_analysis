package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687330u0h extends C09AY implements Function1<C1679860toe, C1679860toe> {
    public final /* synthetic */ List<TakoContentPreviewItem> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ List<String> LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ boolean LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1687330u0h(List<? extends TakoContentPreviewItem> list, int i, String str, boolean z, List<String> list2, Map<String, String> map, String str2, boolean z2, boolean z3) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = list2;
        this.LLILZLL = map;
        this.LLIZ = str2;
        this.LLIZLLLIL = z2;
        this.LLJ = z3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1679860toe invoke(C1679860toe c1679860toe) {
        List<TakoContentPreviewItem> list = this.LL;
        int i = this.LLILLJJLI;
        String str = this.LLILLL;
        boolean z = this.LLILZ;
        List<String> list2 = this.LLILZIL;
        Map<String, String> map = this.LLILZLL;
        String str2 = this.LLIZ;
        boolean z2 = this.LLIZLLLIL;
        boolean z3 = this.LLJ;
        c1679860toe.getClass();
        return new C1679860toe(list, i, str, z, list2, map, str2, z2, z3);
    }
}
