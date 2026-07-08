package X;

import android.widget.RelativeLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RhJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C702670RhJ implements InterfaceC702680RhK<RelativeLayout.LayoutParams> {
    public final /* synthetic */ Function1<RelativeLayout.LayoutParams, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C702670RhJ(Function1<? super RelativeLayout.LayoutParams, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.InterfaceC702680RhK
    public final void LIZ(RelativeLayout.LayoutParams layoutParams) {
        this.LIZ.invoke(layoutParams);
    }
}
