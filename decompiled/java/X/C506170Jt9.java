package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.JoinSubSpaceAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jt9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C506170Jt9 extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ JoinSubSpaceAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C506170Jt9(JoinSubSpaceAssem joinSubSpaceAssem) {
        super(1);
        this.LL = joinSubSpaceAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        return Unit.LIZ;
    }
}
