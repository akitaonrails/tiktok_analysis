package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qqz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1565990qqz extends C09AY implements Function1<C062P<InterfaceC111300bX>, Unit> {
    public final /* synthetic */ Fragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1565990qqz(Fragment fragment) {
        super(1);
        this.LL = fragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C062P<InterfaceC111300bX> c062p) {
        String string;
        C062P<InterfaceC111300bX> c062p2 = c062p;
        Bundle arguments = this.LL.getArguments();
        if (arguments != null && (string = arguments.getString("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", "")) != null) {
            C0RJN c0rjn = new C0RJN(string, C690330R5z.LIZ(new ViewModelProvider(this.LL), this.LL, C1565630qqP.LIZ));
            Fragment fragment = this.LL;
            c0rjn.LJ = fragment;
            Bundle arguments2 = fragment.getArguments();
            int i = 0;
            if (arguments2 != null) {
                i = arguments2.getInt("com.ss.android.ugc.aweme.intent.extra.FEED_TYPE", 0);
            }
            c0rjn.LIZLLL = i;
            C1566110qrB<Object> c1566110qrB = C1566090qr9.LIZ;
            C1566080qr8.LIZ(c0rjn, null, true);
            c062p2.LIZ = new C0SU7(c0rjn);
            return Unit.LIZ;
        }
        "must has PanelScene !".toString();
        throw new IllegalArgumentException("must has PanelScene !");
    }
}
