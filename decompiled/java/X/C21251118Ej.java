package X;

import com.bytedance.android.btm.impl.page.model.PageInfoStack;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Ej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21251118Ej extends C09AY implements Function0<Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C013C LLILLJJLI;
    public final /* synthetic */ PageInfoStack LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21251118Ej(String str, C013C c013c, PageInfoStack pageInfoStack) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = c013c;
        this.LLILLL = pageInfoStack;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(", not fromManual & invisible, result is true, hint=");
        sbLIZ.append(this.LLILLJJLI.element);
        sbLIZ.append(", it.hint=");
        sbLIZ.append(this.LLILLL.getUserVisibleHint());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
