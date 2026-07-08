package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M3X, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C0M3X extends C2217421BqW implements Function2<C561950M2f, C561950M2f, Boolean> {
    public C0M3X(C562180M3c c562180M3c) {
        super(2, c562180M3c, C562180M3c.class, "allowRemove", "allowRemove(Lcom/ss/android/ugc/aweme/tools/draft/entity/BaseDetails;Lcom/ss/android/ugc/aweme/tools/draft/entity/BaseDetails;)Z", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(C561950M2f c561950M2f, C561950M2f c561950M2f2) {
        C561950M2f c561950M2f3 = c561950M2f;
        C561950M2f c561950M2f4 = c561950M2f2;
        this.receiver.getClass();
        boolean z = true;
        if ((!(c561950M2f3 instanceof C0M0P) || !(c561950M2f4 instanceof C0M0P) || !Intrinsics.LJFF(((C0M0P) c561950M2f3).LJ, ((C0M0P) c561950M2f4).LJ)) && (!(c561950M2f3 instanceof C0M3S) || !(c561950M2f4 instanceof C0M3S) || !Intrinsics.LJFF(((C0M3S) c561950M2f3).LJ, ((C0M3S) c561950M2f4).LJ))) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
