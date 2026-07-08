package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestGaussOptSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestWaterMarkFixSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bJ9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968410bJ9 extends C09AY implements Function0<C966870bGf> {
    public final /* synthetic */ C2181241AYg LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968410bJ9(C2181241AYg c2181241AYg) {
        super(0);
        this.LL = c2181241AYg;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0bGf] */
    @Override // kotlin.jvm.functions.Function0
    public final C966870bGf invoke() {
        final C2181241AYg c2181241AYg = this.LL;
        return new InterfaceC921320a5C() { // from class: X.0bGf
            @Override // X.InterfaceC921320a5C
            public final void LIZ() {
                if (c2181241AYg.LJIIJ && MultiGuestWaterMarkFixSetting.INSTANCE.enable() && MultiGuestGaussOptSetting.INSTANCE.enable()) {
                    c2181241AYg.LJIIJ = false;
                    c2181241AYg.LJI("business", false);
                }
            }
        };
    }
}
