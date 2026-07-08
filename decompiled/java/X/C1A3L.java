package X;

import com.ss.android.ugc.aweme.tako.otherpage.image.detail.assem.TakoContentPreviewItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1A3L, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3L extends C09AY implements Function1<C1A3K, C1A3K> {
    public final /* synthetic */ TakoContentPreviewItem.Image LL;
    public final /* synthetic */ InterfaceC1361305Ul LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1A3L(TakoContentPreviewItem.Image image, C1361505Un c1361505Un, Function0 function0, boolean z) {
        super(1);
        this.LL = image;
        this.LLILLJJLI = c1361505Un;
        this.LLILLL = function0;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1A3K invoke(C1A3K c1a3k) {
        C1A3J c1a3j = new C1A3J(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ);
        c1a3k.getClass();
        return new C1A3K(c1a3j, 0.0f, 0);
    }
}
