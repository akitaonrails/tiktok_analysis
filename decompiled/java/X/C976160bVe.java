package X;

import com.bytedance.android.live.liveinteract.match.business.event.BattleAICommentaryPlayChannel;
import com.bytedance.android.livesdk.model.message.AudioMeta;
import com.bytedance.android.livesdk.model.message.BattleAICommentaryMessage;
import com.bytedance.android.livesdk.model.message.BattleMeta;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bVe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976160bVe {
    public static final C976160bVe LIZ = new C976160bVe();
    public static final LinkedList<C973720bRi> LIZIZ = new LinkedList<>();
    public static boolean LIZJ;

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0bVx] */
    public final synchronized void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consumeNext: isConsuming ");
        sbLIZ.append(LIZJ);
        C20441214yg.LIZIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ));
        if (LIZJ) {
            return;
        }
        final C973720bRi c973720bRiPoll = LIZIZ.poll();
        if (c973720bRiPoll == null) {
            return;
        }
        if (!LIZIZ(c973720bRiPoll)) {
            LIZ();
            return;
        }
        LIZJ = true;
        c973720bRiPoll.LIZLLL = C974520bT0.LIZ();
        C1300300jwS c1300300jwS = C1300300jwS.LIZ;
        ?? r0 = new InterfaceC986180blo() { // from class: X.0bVx
            @Override // X.InterfaceC986180blo
            public final void onStart() {
                C20441214yg.LJIIIZ("AICommentaryQueueManager", "AICommentaryPlayer onStart: ");
                c973720bRiPoll.LJI = C974520bT0.LIZ();
                C976160bVe.LIZLLL(c973720bRiPoll.LIZJ, true);
                C973660bRc c973660bRc = C973660bRc.LIZ;
                C973660bRc.LIZ.LJJJJI("start", c973720bRiPoll, false, "", null);
            }

            @Override // X.InterfaceC986180blo
            public final void onComplete(String str) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("AICommentaryPlayer complete: queue.size ");
                sbLIZ2.append(C976160bVe.LIZIZ.size());
                sbLIZ2.append(" errorReason ");
                sbLIZ2.append(str);
                C20441214yg.LJIIIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ2));
                C976160bVe.LIZJ = false;
                c973720bRiPoll.LJII = C974520bT0.LIZ();
                C973660bRc.LIZ.LJJJJI("end", c973720bRiPoll, false, "", str);
                if (!r3.isEmpty()) {
                    C976160bVe.LIZ.LIZ();
                } else {
                    C976160bVe.LIZLLL(c973720bRiPoll.LIZJ, false);
                }
            }
        };
        c1300300jwS.getClass();
        C1300300jwS.LJIIIIZZ(c973720bRiPoll, r0);
    }

    public static void LIZJ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("release: isConsuming ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(" queue.size ");
        LinkedList<C973720bRi> linkedList = LIZIZ;
        sbLIZ.append(linkedList.size());
        C20441214yg.LJIIIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ));
        LIZJ = false;
        C973720bRi c973720bRiPoll = linkedList.poll();
        if (c973720bRiPoll != null) {
            C973660bRc.LIZ.LJJJJI("block", c973720bRiPoll, true, "match_finished", null);
        }
        linkedList.clear();
    }

    public static boolean LIZIZ(C973720bRi c973720bRi) {
        Long lValueOf;
        boolean z;
        boolean z2;
        String str;
        AudioMeta audioMeta;
        BattleAICommentaryMessage battleAICommentaryMessage = c973720bRi.LIZIZ;
        BattleMeta battleMeta = battleAICommentaryMessage.battleMeta;
        Long lValueOf2 = null;
        if (battleMeta != null) {
            lValueOf = Long.valueOf(battleMeta.battleId);
        } else {
            lValueOf = null;
        }
        boolean z3 = false;
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null) {
            lValueOf2 = Long.valueOf(interfaceC973730bRjYf2.LJJJJJL());
        }
        boolean zLJFF = Intrinsics.LJFF(lValueOf, lValueOf2);
        if (battleAICommentaryMessage.timestampExpire > C974520bT0.LIZ()) {
            z = true;
        } else {
            z = false;
        }
        if (battleAICommentaryMessage.audioStream != null && (audioMeta = battleAICommentaryMessage.commentaryMeta) != null && audioMeta.channels != 0 && audioMeta.sampleRateHz != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean zJG = C915980Zwa.LJ().jG();
        boolean zCo0 = C915980Zwa.LJFF().co0();
        if (z && zLJFF && z2 && zJG && zCo0) {
            z3 = true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("consumeNext: message isMessageValid ");
        sbLIZ.append(z3);
        sbLIZ.append(", battleIDValid ");
        sbLIZ.append(zLJFF);
        sbLIZ.append(", playTimeValid ");
        sbLIZ.append(z);
        sbLIZ.append(", paramsValid ");
        sbLIZ.append(z2);
        sbLIZ.append(", featureTurnOn ");
        sbLIZ.append(zJG);
        sbLIZ.append(", isInMatch ");
        sbLIZ.append(zCo0);
        C20441214yg.LJIIIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!z3) {
            if (!zJG) {
                str = "user_turn_off";
            } else if (!zCo0) {
                str = "not_in_match";
            } else if (!zLJFF) {
                str = "battle_id_invalid";
            } else if (!z) {
                str = "play_time_invalid";
            } else {
                str = "params_invalid";
            }
            C973660bRc.LIZ.LJJJJI("block", c973720bRi, true, str, null);
        }
        return z3;
    }

    public static void LIZLLL(DataChannel dataChannel, boolean z) {
        Object objGg0 = dataChannel.gg0(BattleAICommentaryPlayChannel.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendAICommentaryPlayEvent: playStatus ");
        sbLIZ.append(z);
        sbLIZ.append(", currentStatus ");
        sbLIZ.append(objGg0);
        C20441214yg.LJIIIZ("AICommentaryQueueManager", C2188811AlT.LIZIZ(sbLIZ));
        if (!Intrinsics.LJFF(objGg0, Boolean.valueOf(z))) {
            dataChannel.zW(BattleAICommentaryPlayChannel.class, Boolean.valueOf(z));
        }
    }
}
