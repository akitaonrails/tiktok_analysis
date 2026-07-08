package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.activity.assem.SubSpaceActivityContentAssem;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C507910Jvx extends C09AY implements Function2<UIAssem, C291001Au<? extends Throwable>, Unit> {
    public final /* synthetic */ SubSpaceActivityContentAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C507910Jvx(SubSpaceActivityContentAssem subSpaceActivityContentAssem) {
        super(2);
        this.LL = subSpaceActivityContentAssem;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, C291001Au<? extends Throwable> c291001Au) {
        C291001Au<? extends Throwable> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ != 0) {
            SubSpaceActivityContentAssem subSpaceActivityContentAssem = this.LL;
            C16FZ c16fz = subSpaceActivityContentAssem.LLJJIJI;
            if (c16fz != null) {
                C500260Jjc.LJIILIIL(c16fz);
            }
            subSpaceActivityContentAssem.lp();
        }
        return Unit.LIZ;
    }
}
