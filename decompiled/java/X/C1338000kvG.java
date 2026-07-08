package X;

import android.graphics.Bitmap;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1338000kvG extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1337860kv2 LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1338000kvG(C1337860kv2 c1337860kv2, Bitmap bitmap, String str) {
        super(0);
        this.LL = c1337860kv2;
        this.LLILLJJLI = bitmap;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJIIL(this.LLILLJJLI);
        C1337990kvF.LIZ.put(this.LLILLL, new WeakReference<>(this.LLILLJJLI));
        return Unit.LIZ;
    }
}
