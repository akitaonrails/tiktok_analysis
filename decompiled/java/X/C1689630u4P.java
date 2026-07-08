package X;

import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u4P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1689630u4P extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1689630u4P(Object obj) {
        super(1, obj, ConnectNowFragment.class, "doOnUserBackground", "doOnUserBackground(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ConnectNowFragment connectNowFragment = (ConnectNowFragment) this.receiver;
        if (zBooleanValue) {
            connectNowFragment.UR().yQ2();
        } else {
            connectNowFragment.getClass();
        }
        return Unit.LIZ;
    }
}
