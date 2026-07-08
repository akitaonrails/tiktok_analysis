package X;

import android.content.Context;
import com.ss.android.ugc.aweme.aigc.quality.mob.business.AIGCEntranceInfo;
import com.ss.android.ugc.aweme.aikit.api.common.AIGCDraft;
import com.ss.android.ugc.aweme.aikit.api.common.task.CameoDraft;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.common.InputBlock;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LO5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LO5 {
    public final C0LQY LIZ;
    public final InterfaceC1631620sYq<CreativeModel, String, AIGCDraft, Unit> LIZIZ;
    public final InterfaceC1631620sYq<CreativeModel, String, AIGCDraft, Unit> LIZJ;
    public final Function0<AIGCEntranceInfo> LIZLLL;
    public final Function0<String> LJ;
    public final Function1<InterfaceC546090LbL, String> LJFF;
    public final Function2<Context, CreativeInfo, Unit> LJI;
    public final Function1<CameoDraft, List<InputBlock>> LJII;
    public final Function0<Boolean> LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LO5)) {
            return false;
        }
        C0LO5 c0lo5 = (C0LO5) obj;
        return this.LIZ == c0lo5.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lo5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0lo5.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0lo5.LIZLLL) && Intrinsics.LJFF(this.LJ, c0lo5.LJ) && Intrinsics.LJFF(this.LJFF, c0lo5.LJFF) && Intrinsics.LJFF(this.LJI, c0lo5.LJI) && Intrinsics.LJFF(this.LJII, c0lo5.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c0lo5.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        Function0<Boolean> function0 = this.LJIIIIZZ;
        return iHashCode + (function0 == null ? 0 : function0.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CloudDraftPreviewConfig(aiBiz=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onStart=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", defaultEntranceInfoProvider=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", createPostFailureText=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", draftDeletedText=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onClickAICreate=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", promptTextInCloudDraftPage=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", shouldShowCastButton=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0LO5(C0LQY c0lqy, InterfaceC1631620sYq<? super CreativeModel, ? super String, ? super AIGCDraft, Unit> interfaceC1631620sYq, InterfaceC1631620sYq<? super CreativeModel, ? super String, ? super AIGCDraft, Unit> interfaceC1631620sYq2, Function0<AIGCEntranceInfo> function0, Function0<String> function02, Function1<? super InterfaceC546090LbL, String> function1, Function2<? super Context, ? super CreativeInfo, Unit> function2, Function1<? super CameoDraft, ? extends List<InputBlock>> function12, Function0<Boolean> function03) {
        this.LIZ = c0lqy;
        this.LIZIZ = interfaceC1631620sYq;
        this.LIZJ = interfaceC1631620sYq2;
        this.LIZLLL = function0;
        this.LJ = function02;
        this.LJFF = function1;
        this.LJI = function2;
        this.LJII = function12;
        this.LJIIIIZZ = function03;
    }

    public static C0LO5 LIZ(C0LO5 c0lo5, C0LQY c0lqy, InterfaceC1631620sYq interfaceC1631620sYq, InterfaceC1631620sYq interfaceC1631620sYq2, Function0 function0, Function1 function1, Function1 function12, Function0 function02, int i) {
        Function0<AIGCEntranceInfo> function03;
        Function1 function13 = function1;
        InterfaceC1631620sYq interfaceC1631620sYq3 = interfaceC1631620sYq2;
        Function0 function04 = function0;
        Function0 function05 = function02;
        InterfaceC1631620sYq interfaceC1631620sYq4 = interfaceC1631620sYq;
        Function1 function14 = function12;
        C0LQY c0lqy2 = c0lqy;
        if ((i & 1) != 0) {
            c0lqy2 = c0lo5.LIZ;
        }
        if ((i & 2) != 0) {
            interfaceC1631620sYq4 = c0lo5.LIZIZ;
        }
        if ((i & 4) != 0) {
            interfaceC1631620sYq3 = c0lo5.LIZJ;
        }
        Function2<Context, CreativeInfo, Unit> function2 = null;
        if ((i & 8) != 0) {
            function03 = c0lo5.LIZLLL;
        } else {
            function03 = null;
        }
        if ((i & 16) != 0) {
            function04 = c0lo5.LJ;
        }
        if ((i & 32) != 0) {
            function13 = c0lo5.LJFF;
        }
        if ((i & 64) != 0) {
            function2 = c0lo5.LJI;
        }
        if ((i & 128) != 0) {
            function14 = c0lo5.LJII;
        }
        if ((i & 256) != 0) {
            function05 = c0lo5.LJIIIIZZ;
        }
        return new C0LO5(c0lqy2, interfaceC1631620sYq4, interfaceC1631620sYq3, function03, function04, function13, function2, function14, function05);
    }
}
