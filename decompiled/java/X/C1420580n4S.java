package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS108S0110000_22;

/* JADX INFO: renamed from: X.0n4S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1420580n4S extends C2217421BqW implements Function2<Boolean, C1419590n2r, Unit> {
    public C1420580n4S(C1422180n72 c1422180n72) {
        super(2, c1422180n72, C1422180n72.class, "onMute", "onMute(ZLcom/ss/android/ugc/aweme/tools/mvtemplate/core/MixAsset;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, C1419590n2r c1419590n2r) {
        boolean zBooleanValue = bool.booleanValue();
        C1422180n72 c1422180n72 = (C1422180n72) this.receiver;
        c1422180n72.getClass();
        c1422180n72.LJFF(new AwS108S0110000_22(c1419590n2r, zBooleanValue, 14));
        return Unit.LIZ;
    }
}
