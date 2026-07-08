package X;

import com.bytedance.android.btm.api.PageProp;
import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21250618Ee extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageProp LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<PageInfoStack> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21250618Ee(String str, PageProp pageProp, boolean z, boolean z2, C259800zU<PageInfoStack> c259800zU) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = pageProp;
        this.LLILLL = z;
        this.LLILZ = z2;
        this.LLILZIL = c259800zU;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(" prop=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPage=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isContainer=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", savedInfoStack=");
        sbLIZ.append(this.LLILZIL.element);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
