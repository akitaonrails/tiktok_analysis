package X;

import com.bytedance.android.widget.Widget;

/* JADX INFO: renamed from: X.139Q, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C139Q extends Error {
    public final String LL;

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.LL;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C139Q(Class<? extends Widget> cls) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(cls.getSimpleName());
        sbLIZ.append(" should use WidgetContainer!");
        this(C2188811AlT.LIZIZ(sbLIZ));
    }

    public C139Q(Widget widget) {
        this((Class<? extends Widget>) widget.getClass());
    }

    public C139Q(String str) {
        this.LL = str;
    }
}
