package X;

import com.bytedance.ies.nle.editor_jni.NLEBranch;
import com.bytedance.ies.nle.editor_jni.NLECommit;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E2A, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E2A {
    public final C19EG LIZ;
    public final C0E5S LIZIZ;
    public final Function0<C0E48> LIZJ;
    public final Function0<C0EB6> LIZLLL;
    public final Function0<InterfaceC359940E9g> LJ;
    public final Function0<VideoPublishEditModel> LJFF;
    public final Function0<Unit> LJI;
    public final C0E29 LJII = new InterfaceC357170DzP() { // from class: X.0E29
        public String LIZ;
        public boolean LIZIZ;
        public final C01GW LIZJ = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(306));

        public final void LIZ(EnumC357140DzM enumC357140DzM) {
            String description;
            boolean z;
            String str;
            String extra;
            C0E1X c0e1x;
            NLEEditor nLEEditorLJI;
            NLEBranch branch;
            NLECommit head;
            C0E48 c0e48Invoke = this.LIZLLL.LIZJ.invoke();
            String strLIZ = null;
            if (c0e48Invoke != null && (nLEEditorLJI = c0e48Invoke.LLFII().LJI()) != null && (branch = nLEEditorLJI.getBranch()) != null && (head = branch.getHead()) != null) {
                description = head.getDescription();
            } else {
                description = null;
            }
            if (description != null && description.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            String str2 = "";
            if (z || (c0e1x = (C0E1X) C051R.LIZ(description, C0E1X.class)) == null) {
                str = "";
            } else {
                C0E2A c0e2a = this.LIZLLL;
                this.LIZ = c0e1x.LIZ;
                strLIZ = C0E1W.LIZ(c0e1x, enumC357140DzM, c0e2a.LIZ, (Map) this.LIZJ.getValue());
                str = c0e1x.LJ;
            }
            if (enumC357140DzM == EnumC357140DzM.UNDO) {
                if (Intrinsics.LJFF(this.LIZ, C0E1V.ADD_RECORDED_AUDIO.getNameId())) {
                    VideoPublishEditModel videoPublishEditModelInvoke = this.LIZLLL.LJFF.invoke();
                    if (videoPublishEditModelInvoke != null) {
                        C0LAB c0labLIZIZ = C1402900mbw.LIZIZ(videoPublishEditModelInvoke);
                        c0labLIZIZ.LJ("is_editor_pro", "1");
                        C20684815ws.LJIILLIIL("delete_dub", c0labLIZIZ.LIZ);
                    }
                } else if (Intrinsics.LJFF(this.LIZ, C0E1V.VIDEO_TRANSITION.getNameId()) || (Intrinsics.LJFF(this.LIZ, C0E1V.APPLY_TO_ALL.getNameId()) && Intrinsics.LJFF(str, "apply_to_all"))) {
                    VideoPublishEditModel videoPublishEditModelInvoke2 = this.LIZLLL.LJFF.invoke();
                    if (videoPublishEditModelInvoke2 == null || c0e48Invoke == null) {
                        return;
                    }
                    C0LAB c0labLJFF = C361680EFy.LJFF(-1L, videoPublishEditModelInvoke2, c0e48Invoke, new Pair(-1, -1));
                    c0labLJFF.LJ("music_id", videoPublishEditModelInvoke2.getMusicId());
                    c0labLJFF.LJ("enter_from", videoPublishEditModelInvoke2.getEnterFrom());
                    c0labLJFF.LIZ(1, "is_editor_pro");
                    c0labLJFF.LJ("apply_method", str);
                    C20684815ws.LJIILLIIL("undo_transition", c0labLJFF.LIZ);
                }
            }
            if (enumC357140DzM == EnumC357140DzM.REDO) {
                if (Intrinsics.LJFF(this.LIZ, C0E1V.ADD_RECORDED_AUDIO.getNameId())) {
                    VideoPublishEditModel videoPublishEditModelInvoke3 = this.LIZLLL.LJFF.invoke();
                    if (videoPublishEditModelInvoke3 == null || c0e48Invoke == null) {
                        return;
                    }
                    C0LAB c0labLJFF2 = C361680EFy.LJFF(-1L, videoPublishEditModelInvoke3, c0e48Invoke, new Pair(-1, -1));
                    c0labLJFF2.LJ("enter_from", videoPublishEditModelInvoke3.getEnterFrom());
                    NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48Invoke);
                    if (nLETrackLIZLLL != null && (extra = nLETrackLIZLLL.getExtra("ep_audio_music_id")) != null) {
                        str2 = extra;
                    }
                    c0labLJFF2.LJ("music_id", str2);
                    c0labLJFF2.LJ("is_editor_pro", "1");
                    C20684815ws.LJIILLIIL("redo_dub", c0labLJFF2.LIZ);
                } else if (Intrinsics.LJFF(this.LIZ, C0E1V.VIDEO_TRANSITION.getNameId()) || (Intrinsics.LJFF(this.LIZ, C0E1V.APPLY_TO_ALL.getNameId()) && Intrinsics.LJFF(str, "apply_to_all"))) {
                    VideoPublishEditModel videoPublishEditModelInvoke4 = this.LIZLLL.LJFF.invoke();
                    if (videoPublishEditModelInvoke4 == null || c0e48Invoke == null) {
                        return;
                    }
                    C0LAB c0labLJFF3 = C361680EFy.LJFF(-1L, videoPublishEditModelInvoke4, c0e48Invoke, new Pair(-1, -1));
                    c0labLJFF3.LJ("music_id", videoPublishEditModelInvoke4.getMusicId());
                    c0labLJFF3.LJ("enter_from", videoPublishEditModelInvoke4.getEnterFrom());
                    c0labLJFF3.LIZ(1, "is_editor_pro");
                    c0labLJFF3.LJ("apply_method", str);
                    C20684815ws.LJIILLIIL("redo_transition", c0labLJFF3.LIZ);
                }
            }
            if (strLIZ != null) {
                C0E2A c0e2a2 = this.LIZLLL;
                if (strLIZ.length() > 0) {
                    C15L2.LIZ(c0e2a2.LIZ, strLIZ);
                }
            }
        }

        @Override // X.InterfaceC357170DzP
        public final void LIZJ(EnumC357140DzM enumC357140DzM) {
            C0E48 c0e48Invoke = this.LIZLLL.LIZJ.invoke();
            if (c0e48Invoke == null) {
                return;
            }
            boolean z = false;
            this.LIZIZ = false;
            C0E75 value = this.LIZLLL.LIZIZ.dQ().getValue();
            if (value == null || value.LJ == null) {
                C0E6E c0e6e = C0E6E.LINE;
            }
            C0E6E c0e6e2 = C0E6E.NONE;
            if (enumC357140DzM == EnumC357140DzM.UNDO) {
                LIZ(enumC357140DzM);
            }
            NLETrackSlot nLETrackSlotLLLLLLIL = c0e48Invoke.LLLLLLIL();
            if (nLETrackSlotLLLLLLIL != null) {
                if (nLETrackSlotLLLLLLIL.getKeyframes().size() > 0 || C351220Dpo.LLIIIJ(nLETrackSlotLLLLLLIL)) {
                    z = true;
                }
                this.LIZIZ = z;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
        @Override // X.InterfaceC357170DzP
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LIZIZ(X.EnumC357140DzM r9, boolean r10) {
            /*
                Method dump skipped, instruction units count: 211
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C0E29.LIZIZ(X.0DzM, boolean):void");
        }
    };

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0E29] */
    public C0E2A(C19EG c19eg, C0E5S c0e5s, AwS549S0100000_5 awS549S0100000_5, AwS549S0100000_5 awS549S0100000_52, AwS549S0100000_5 awS549S0100000_53, AwS549S0100000_5 awS549S0100000_54, AwS549S0100000_5 awS549S0100000_55) {
        this.LIZ = c19eg;
        this.LIZIZ = c0e5s;
        this.LIZJ = awS549S0100000_5;
        this.LIZLLL = awS549S0100000_52;
        this.LJ = awS549S0100000_53;
        this.LJFF = awS549S0100000_54;
        this.LJI = awS549S0100000_55;
    }
}
