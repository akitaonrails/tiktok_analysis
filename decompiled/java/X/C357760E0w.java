package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0E0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357760E0w extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C357700E0q LL;
    public final /* synthetic */ ResourceItem LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C357760E0w(int i, C357700E0q c357700E0q, ResourceItem resourceItem, boolean z) {
        super(0);
        this.LL = c357700E0q;
        this.LLILLJJLI = resourceItem;
        this.LLILLL = i;
        this.LLILZ = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.W7(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        return Unit.LIZ;
    }
}
