package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QHg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C667780QHg extends C2217421BqW implements Function2<C667770QHf, C0Q43, C667770QHf> {
    public C667780QHg(C667790QHh c667790QHh) {
        super(2, c667790QHh, C667790QHh.class, "handlePlayFinishEventForRecoLogicUpdate", "handlePlayFinishEventForRecoLogicUpdate(Lcom/ss/android/ugc/aweme/search/source/flow/model/SearchClickSignalState;Lcom/ss/android/ugc/aweme/search/common/source/vm/SearchClickSignalOperator$SearchAutoPlayAction;)Lcom/ss/android/ugc/aweme/search/source/flow/model/SearchClickSignalState;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final C667770QHf invoke(C667770QHf c667770QHf, C0Q43 c0q43) {
        boolean z;
        C667770QHf c667770QHf2 = c667770QHf;
        C0Q43 c0q432 = c0q43;
        this.receiver.getClass();
        if (!Intrinsics.LJFF(c0q432.LIZIZ, "general_search") && !Intrinsics.LJFF(c0q432.LIZIZ, "search_result")) {
            return C667770QHf.LIZ(c667770QHf2, 0L, false, null, null, null, 0L, 0L, null, 511);
        }
        long j = c667770QHf2.LJII;
        long j2 = c667770QHf2.LJI;
        long j3 = c0q432.LIZ;
        long j4 = j + j3;
        if (j2 < j3) {
            String str = c0q432.LIZJ;
            if (!c667770QHf2.LIZJ && j4 <= C667790QHh.LIZLLL) {
                z = false;
            } else {
                z = true;
            }
            return C667770QHf.LIZ(c667770QHf2, 0L, z, str, null, null, j3, j4, null, 307);
        }
        return C667770QHf.LIZ(c667770QHf2, 0L, false, null, null, null, 0L, j4, null, 383);
    }
}
