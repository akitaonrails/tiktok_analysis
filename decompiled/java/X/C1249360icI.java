package X;

import com.ss.android.ugc.profile.platform.base.component.BaseUIComponent;
import com.ss.android.ugc.profile.platform.business.navbar.base.NavbarBaseUIComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0icI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class C1249360icI extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1249360icI(Object obj) {
        super(1, obj, NavbarBaseUIComponent.class, "reportProfileStandardInfoCollect", "reportProfileStandardInfoCollectAlias(Ljava/lang/Boolean;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((BaseUIComponent) this.receiver).op(bool);
        return Unit.LIZ;
    }
}
