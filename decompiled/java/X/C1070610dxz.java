package X;

import com.ss.android.ugc.aweme.relation.auth.SuggestAuthPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0dxz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class C1070610dxz extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1070610dxz(Object obj) {
        super(1, obj, SuggestAuthPage.class, "onAuthGrant", "onAuthGrant(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((SuggestAuthPage) this.receiver).cS(bool.booleanValue());
        return Unit.LIZ;
    }
}
