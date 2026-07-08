package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Hun, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456230Hun extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C456210Hul LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C456230Hun(C456210Hul c456210Hul, View view, String str, int i) {
        super(0);
        this.LL = c456210Hul;
        this.LLILLJJLI = view;
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        AbstractC456130Hud abstractC456130Hud = this.LL.LLILLJJLI;
        if (abstractC456130Hud != null) {
            abstractC456130Hud.LIZ(this.LLILZ, this.LLILLJJLI, this.LLILLL);
        }
        this.LL.performClick();
        return Unit.LIZ;
    }
}
