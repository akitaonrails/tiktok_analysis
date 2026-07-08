package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.aigc.AIGCCreationModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546040LbG {
    public final Function1<CreativeModel, Boolean> LIZ;
    public final Function1<CreativeModel, Boolean> LIZIZ;
    public final Function1<CreativeModel, String> LIZJ;
    public final Function1<CreativeModel, String> LIZLLL;
    public final Function1<CreativeModel, AIGCCreationModel> LJ;
    public final Function1<CreativeModel, AIGCEntranceInfo> LJFF;

    /* JADX WARN: Illegal instructions before constructor call */
    public C546040LbG() {
        Function1 function1 = null;
        this(function1, function1, function1, function1, function1, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C546040LbG)) {
            return false;
        }
        C546040LbG c546040LbG = (C546040LbG) obj;
        return Intrinsics.LJFF(this.LIZ, c546040LbG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c546040LbG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c546040LbG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c546040LbG.LIZLLL) && Intrinsics.LJFF(this.LJ, c546040LbG.LJ) && Intrinsics.LJFF(this.LJFF, c546040LbG.LJFF);
    }

    public final int hashCode() {
        Function1<CreativeModel, Boolean> function1 = this.LIZ;
        int iHashCode = (function1 == null ? 0 : function1.hashCode()) * 31;
        Function1<CreativeModel, Boolean> function12 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function12 == null ? 0 : function12.hashCode())) * 31;
        Function1<CreativeModel, String> function13 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function13 == null ? 0 : function13.hashCode())) * 31;
        Function1<CreativeModel, String> function14 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (function14 == null ? 0 : function14.hashCode())) * 31;
        Function1<CreativeModel, AIGCCreationModel> function15 = this.LJ;
        int iHashCode5 = (iHashCode4 + (function15 == null ? 0 : function15.hashCode())) * 31;
        Function1<CreativeModel, AIGCEntranceInfo> function16 = this.LJFF;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreationConfig(initApplied=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isApplied=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", findClientTaskId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", findServerTaskId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", findAIGCCreationModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", findEntranceInfo=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C546040LbG(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i) {
        this((Function1<? super CreativeModel, Boolean>) ((i & 1) != 0 ? null : function1), (Function1<? super CreativeModel, Boolean>) ((i & 2) != 0 ? null : function12), (Function1<? super CreativeModel, String>) null, (Function1<? super CreativeModel, String>) ((i & 8) != 0 ? null : function13), (Function1<? super CreativeModel, ? extends AIGCCreationModel>) ((i & 16) != 0 ? null : function14), (Function1<? super CreativeModel, AIGCEntranceInfo>) ((i & 32) != 0 ? null : function15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C546040LbG(Function1<? super CreativeModel, Boolean> function1, Function1<? super CreativeModel, Boolean> function12, Function1<? super CreativeModel, String> function13, Function1<? super CreativeModel, String> function14, Function1<? super CreativeModel, ? extends AIGCCreationModel> function15, Function1<? super CreativeModel, AIGCEntranceInfo> function16) {
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = function13;
        this.LIZLLL = function14;
        this.LJ = function15;
        this.LJFF = function16;
    }
}
