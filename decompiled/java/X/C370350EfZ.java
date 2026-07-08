package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0EfZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370350EfZ extends C09AY implements Function0<Integer> {
    public final /* synthetic */ TuxTextView LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C370350EfZ(TuxTextView tuxTextView, C118300cf c118300cf, int i, int i2) {
        super(0);
        this.LL = tuxTextView;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = i;
        this.LLILZ = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(this.LL.getHeight() + C390810FTz.LIZ(this.LLILLJJLI.element) + C390810FTz.LIZ(this.LLILLL) + C390810FTz.LIZ(this.LLILZ));
    }
}
