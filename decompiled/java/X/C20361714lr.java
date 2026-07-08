package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14lr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20361714lr extends C09AY implements Function0<Object> {
    public final /* synthetic */ C259800zU<PageInfo> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20361714lr(C259800zU<PageInfo> c259800zU) {
        super(0);
        this.LL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.element);
        sbLIZ.append("\nisFirstPage, not set source");
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
