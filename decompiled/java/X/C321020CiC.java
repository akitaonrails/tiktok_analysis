package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ActionDoc;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.BotDoc;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.ExtraRequestInfo;
import com.ss.android.ugc.aweme.commercialize.chatagent.msg.base.api.Message;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CiC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321020CiC implements InterfaceC320970Ci7 {
    public final int LIZ;
    public final Message LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Integer LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final Function1<C321110CiL, Unit> LJI;
    public final boolean LJII;
    public final C320640Cha LJIIIIZZ;
    public final ActionDoc LJIIIZ;
    public final BotDoc LJIIJ;
    public final List<Message> LJIIJJI;
    public final Message LJIIL;
    public final ExtraRequestInfo LJIILIIL;
    public final Map<String, String> LJIILJJIL;
    public volatile boolean LJIILL;
    public final int LJIILLIIL;
    public final boolean LJIIZILJ;
    public final Map<String, String> LJIJ;
    public final Message LJIJI;
    public EnumC320940Ci4 LJIJJ;

    public C321020CiC() {
        throw null;
    }

    public final boolean LIZIZ() {
        return C1697810uHb.LJIIJJI(1, 2, 1003, 16).contains(Integer.valueOf(getOp()));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321020CiC)) {
            return false;
        }
        C321020CiC c321020CiC = (C321020CiC) obj;
        return this.LIZ == c321020CiC.LIZ && Intrinsics.LJFF(this.LIZIZ, c321020CiC.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321020CiC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c321020CiC.LIZLLL) && this.LJ == c321020CiC.LJ && this.LJFF == c321020CiC.LJFF && Intrinsics.LJFF(this.LJI, c321020CiC.LJI) && this.LJII == c321020CiC.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c321020CiC.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c321020CiC.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c321020CiC.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c321020CiC.LJIIJJI) && Intrinsics.LJFF(null, null) && Intrinsics.LJFF(this.LJIIL, c321020CiC.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c321020CiC.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c321020CiC.LJIILJJIL) && this.LJIILL == c321020CiC.LJIILL && Intrinsics.LJFF(null, null) && this.LJIILLIIL == c321020CiC.LJIILLIIL && this.LJIIZILJ == c321020CiC.LJIIZILJ && Intrinsics.LJFF(this.LJIJ, c321020CiC.LJIJ) && Intrinsics.LJFF(this.LJIJI, c321020CiC.LJIJI);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31;
        Function0<Unit> function0 = this.LIZJ;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode3 = (((((((((((((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.hashCode()) * 31 * 31) + this.LJIIL.hashCode()) * 31;
        ExtraRequestInfo extraRequestInfo = this.LJIILIIL;
        int iHashCode4 = (((((((((iHashCode3 + (extraRequestInfo == null ? 0 : extraRequestInfo.hashCode())) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31 * 31) + this.LJIILLIIL) * 31) + C786410Ut5.Z2(this.LJIIZILJ)) * 31;
        Map<String, String> map = this.LJIJ;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Message message = this.LJIJI;
        return iHashCode5 + (message != null ? message.hashCode() : 0);
    }

    public final String toString() {
        return "MessageActionImpl(op=" + this.LIZ + ", sendItem=" + this.LIZIZ + ", sendSuccessCallback=" + this.LIZJ + ", entityOpRetryType=" + this.LIZLLL + ", pullCount=" + this.LJ + ", pullMsgSource=" + this.LJFF + ", callback=" + this.LJI + ", syncCheck=" + this.LJII + ", conversationModel=" + this.LJIIIIZZ + ", actionDoc=" + this.LJIIIZ + ", botDoc=" + this.LJIIJ + ", batchDeleteList=" + this.LJIIJJI + ", chunkRspCallback=null, stopMessage=" + this.LJIIL + ", extraRequestInfo=" + this.LJIILIIL + ", ext=" + this.LJIILJJIL + ", withScrollAnimation=" + this.LJIILL + ", uploader=null, genStyle=" + this.LJIILLIIL + ", isPreFetch=" + this.LJIIZILJ + ", preFetchParams=" + this.LJIJ + ", defaultAnswer=" + this.LJIJI + ')';
    }

    public final C321240CiY LIZ() {
        String str;
        if (this.LJIIZILJ) {
            Map<String, String> map = this.LJIJ;
            if (map == null || (str = map.get("process_id")) == null) {
                str = "";
            }
        } else {
            str = this.LJIIIIZZ.LIZIZ;
        }
        return new C321240CiY(this, str, 39);
    }

    @Override // X.InterfaceC320970Ci7
    public final int getOp() {
        return this.LIZ;
    }

    public C321020CiC(int i, Message message, int i2, Function1 function1, C320640Cha c320640Cha, ActionDoc actionDoc, BotDoc botDoc, List list, ExtraRequestInfo extraRequestInfo, Map map, boolean z, int i3) {
        Message message2;
        boolean z2 = z;
        Map linkedHashMap = map;
        ExtraRequestInfo extraRequestInfo2 = extraRequestInfo;
        List list2 = list;
        BotDoc botDoc2 = botDoc;
        Function1 function12 = function1;
        int i4 = i2;
        Message message3 = message;
        ActionDoc actionDoc2 = actionDoc;
        int i5 = (i3 & 1) != 0 ? 0 : i;
        message3 = (i3 & 2) != 0 ? new Message(null, null, null, null, null, null, 0L, 0L, null, 0, null, null, null, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, false, false, 0, null, 0L, 0, 0, null, 0L, null, null, null, null, null, -1, 31, null) : message3;
        i4 = (i3 & 16) != 0 ? 0 : i4;
        function12 = (i3 & 64) != 0 ? AFwS232S0000000_4.get$arr$(167) : function12;
        actionDoc2 = (i3 & 512) != 0 ? new ActionDoc(0L, "") : actionDoc2;
        botDoc2 = (i3 & 1024) != 0 ? new BotDoc(0L, "", -1) : botDoc2;
        list2 = (i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? C13BV.INSTANCE : list2;
        if ((i3 & 8192) != 0) {
            message2 = new Message(null, null, null, null, null, null, 0L, 0L, null, 0, null, null, null, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, false, false, 0, null, 0L, 0, 0, null, 0L, null, null, null, null, null, -1, 31, null);
        } else {
            message2 = null;
        }
        extraRequestInfo2 = (i3 & 16384) != 0 ? null : extraRequestInfo2;
        linkedHashMap = (32768 & i3) != 0 ? new LinkedHashMap() : linkedHashMap;
        z2 = (i3 & 65536) != 0 ? false : z2;
        this.LIZ = i5;
        this.LIZIZ = message3;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = i4;
        this.LJFF = 0;
        this.LJI = function12;
        this.LJII = false;
        this.LJIIIIZZ = c320640Cha;
        this.LJIIIZ = actionDoc2;
        this.LJIIJ = botDoc2;
        this.LJIIJJI = list2;
        this.LJIIL = message2;
        this.LJIILIIL = extraRequestInfo2;
        this.LJIILJJIL = linkedHashMap;
        this.LJIILL = z2;
        this.LJIILLIIL = 0;
        this.LJIIZILJ = false;
        this.LJIJ = null;
        this.LJIJI = null;
        this.LJIJJ = EnumC320940Ci4.QUEUE;
    }
}
