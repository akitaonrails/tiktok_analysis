package X;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.00AB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AB extends C09AY implements Function0<String> {
    public final /* synthetic */ View LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ float LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C00AB(View view, String str, Integer num, float f) {
        super(0);
        this.LL = view;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[dispatchTouchEvent] targetView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", viewName=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", viewId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", deltaY=");
        sbLIZ.append(this.LLILZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
