package X;

import android.view.ViewParent;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0oDk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1464780oDk extends C2217421BqW implements Function1<ViewParent, ViewParent> {
    public static final C1464780oDk LL = new C1464780oDk();

    public C1464780oDk() {
        super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final ViewParent invoke(ViewParent viewParent) {
        return viewParent.getParent();
    }
}
