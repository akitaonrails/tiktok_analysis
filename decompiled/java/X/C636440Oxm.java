package X;

import android.content.Context;
import com.bytedance.tux.navigation.TuxNavBar;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Oxm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C636440Oxm extends C1696260uF6 implements Function1<Context, TuxNavBar> {
    public static final C636440Oxm LLIZ = new C636440Oxm();

    public C636440Oxm() {
        super(1, TuxNavBar.class, "<init>", "<init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final TuxNavBar invoke(Context context) {
        return new TuxNavBar(context, null, 6);
    }
}
