package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.detail.view.assem.SubSpaceDetailListAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JrH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C505010JrH extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SubSpaceDetailListAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C505010JrH(SubSpaceDetailListAssem subSpaceDetailListAssem) {
        super(1);
        this.LL = subSpaceDetailListAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.LJIIL();
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        return Unit.LIZ;
    }
}
