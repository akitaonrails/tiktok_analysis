package X;

import com.ss.android.ugc.aweme.compliance.privacy.checkup.CheckupBasePageFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10An, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final /* synthetic */ class C19202710An extends C2217421BqW implements Function1<EnumC19202910Ap, Unit> {
    public C19202710An(Object obj) {
        super(1, obj, CheckupBasePageFragment.class, "mobClickEvent", "mobClickEvent(Lcom/ss/android/ugc/aweme/compliance/privacy/checkup/CheckupBasePageFragment$ClickEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(EnumC19202910Ap enumC19202910Ap) {
        ((CheckupBasePageFragment) this.receiver).OR(enumC19202910Ap);
        return Unit.LIZ;
    }
}
