package X;

import android.content.Context;
import android.graphics.Rect;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HdO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C445440HdO extends C09AY implements Function0<Rect> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ C445430HdN LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C445440HdO(Context context, C445430HdN c445430HdN) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = c445430HdN;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Rect invoke() {
        return new Rect(0, 0, C0SK0.LIZ(this.LL), this.LLILLJJLI.getStatusBarHeight());
    }
}
