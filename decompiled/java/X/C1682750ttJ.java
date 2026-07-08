package X;

import android.content.Context;
import com.bytedance.tux.navigation.TuxNavBar;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0ttJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1682750ttJ extends C1696260uF6 implements Function1<Context, TuxNavBar> {
    public static final C1682750ttJ LLIZ = new C1682750ttJ();

    public C1682750ttJ() {
        super(1, TuxNavBar.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TuxNavBar invoke(Context context) {
        return new TuxNavBar(context, null, 6);
    }
}
