package X;

import Y.ARunnableS105S0100000_5;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.creative.model.SoundEffect;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.ss.ugc.android.editor.base.viewmodel.AudioViewModel;
import com.ss.ugc.android.editor.components.base.model.SelectedMusicInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Dyd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C356690Dyd implements C0EBB {
    public final C0E48 LIZ;
    public final SafeHandler LIZIZ;
    public final List<SoundEffect> LIZJ = new ArrayList();
    public long LIZLLL = System.currentTimeMillis();

    @Override // X.C0EBB
    public final void LIZ() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48 = this.LIZ;
        if (c0e48 == null || (nLETrackSlotLLLLLLIL = c0e48.LLLLLLIL()) == null || !C348850Dlz.LJI(nLETrackSlotLLLLLLIL, c0e48)) {
            return;
        }
        if (nLETrackSlotLLLLLLIL.hasExtra("ep_audio_music_id")) {
            nLETrackSlotLLLLLLIL.getExtra("ep_audio_music_id");
        }
        AudioViewModel.Companion.getClass();
        ConcurrentHashMap<String, InterfaceC364230EPt> concurrentHashMap = C364210EPr.LIZ;
        boolean zDeleteAudio = ((AudioViewModel) C364210EPr.LIZIZ(AudioViewModel.class)).deleteAudio(nLETrackSlotLLLLLLIL, c0e48);
        Iterator it2 = ((ArrayList) C348850Dlz.LIZJ(C350870DpF.LJI(c0e48))).iterator();
        boolean z = false;
        while (it2.hasNext()) {
            VecNLETrackSlotSPtr slots = ((NLETrack) it2.next()).getSlots();
            if (slots != null && slots.contains(nLETrackSlotLLLLLLIL)) {
                z = true;
            }
        }
        if (!zDeleteAudio || z) {
            C356530DyN.LIZIZ(C0E6D.LIZIZ, "deleteSound", "delete Sound failed.");
            return;
        }
        C348850Dlz.LJII(C350870DpF.LJI(c0e48));
        LJ(this);
        C350890DpH.LIZIZ(c0e48, C0E1V.DELETE.getNameId());
    }

    @Override // X.C0EBB
    public final void LIZIZ() {
        NLETrackSlot nLETrackSlotLLLLLLIL;
        C0E48 c0e48;
        C0E48 c0e482 = this.LIZ;
        if (c0e482 == null || (nLETrackSlotLLLLLLIL = c0e482.LLLLLLIL()) == null || !C348850Dlz.LJI(nLETrackSlotLLLLLLIL, this.LIZ) || (c0e48 = this.LIZ) == null) {
            return;
        }
        NLETrackSlot nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLLLLLIL.deepClone(true));
        C357540E0a.LJIIJ(C350870DpF.LJI(c0e48), nLETrackSlotDynamicCast, C348850Dlz.LIZJ(C350870DpF.LJI(c0e48)), new AwS549S0100000_5(c0e48, 1688), false);
        c0e48.S7().LIZIZ(new C358740E4q(nLETrackSlotDynamicCast, 0, null, false, 0, 254), "selected_audio_track_slot", true);
        C350890DpH.LIZIZ(c0e48, C0E1V.COPY_SOUND_EFFECT.getNameId());
    }

    @Override // X.C0EBB
    public final void U0() {
        this.LIZIZ.post(new ARunnableS105S0100000_5(this, 145));
    }

    @Override // X.C0EBB
    public final void T0() {
        LJ(this);
    }

    public static void LJ(C356690Dyd c356690Dyd) {
        C0E48 c0e48 = c356690Dyd.LIZ;
        if (c0e48 != null) {
            List listLIZJ = C348850Dlz.LIZJ(C350870DpF.LJI(c0e48));
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ, 10));
            Iterator it2 = ((ArrayList) listLIZJ).iterator();
            while (it2.hasNext()) {
                arrayList.add(Integer.valueOf(((NLETrack) it2.next()).getSortedSlots().size()));
            }
            if (C13LP.LJZI(arrayList) != ((ArrayList) c356690Dyd.LIZJ).size()) {
                List listLIZJ2 = C348850Dlz.LIZJ(C350870DpF.LJI(c0e48));
                ((ArrayList) c356690Dyd.LIZJ).clear();
                Iterator it3 = ((ArrayList) listLIZJ2).iterator();
                while (it3.hasNext()) {
                    VecNLETrackSlotSPtr sortedSlots = ((NLETrack) it3.next()).getSortedSlots();
                    if (sortedSlots != null) {
                        Iterator<NLETrackSlot> it4 = sortedSlots.iterator();
                        while (it4.hasNext()) {
                            SoundEffect soundEffectLIZIZ = C356680Dyc.LIZIZ(it4.next().getExtra("ep_audio_music_id"));
                            if (soundEffectLIZIZ != null) {
                                ((ArrayList) c356690Dyd.LIZJ).add(soundEffectLIZIZ);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // X.C0EBB
    public final void LIZLLL(float f) {
        C0E48 c0e48 = this.LIZ;
        if (c0e48 == null) {
            return;
        }
        Iterator it2 = ((ArrayList) C348850Dlz.LIZJ(C350870DpF.LJI(c0e48))).iterator();
        while (it2.hasNext()) {
            Iterator<NLETrackSlot> it3 = ((NLETrack) it2.next()).getSortedSlots().iterator();
            while (it3.hasNext()) {
                NLESegmentAudio nLESegmentAudio = (NLESegmentAudio) NLESegmentAudio.class.getMethod("dynamicCast", NLENode.class).invoke(null, it3.next().getMainSegment());
                if (nLESegmentAudio != null) {
                    nLESegmentAudio.setVolume(f);
                }
            }
        }
        C350870DpF.LIZ(c0e48, false);
    }

    @Override // X.C0EBB
    public final void LIZJ(SoundEffect soundEffect, String str) {
        Integer num;
        C356680Dyc.LIZ(soundEffect);
        long musicDuration = soundEffect.fileDuration;
        long jJh = 0;
        if (musicDuration <= 0) {
            musicDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(str);
        }
        C0E48 c0e48 = this.LIZ;
        if (c0e48 != null) {
            jJh = c0e48.getPlayer().Jh();
        }
        long j = jJh * 1000;
        long j2 = j + (musicDuration * 1000);
        String str2 = soundEffect.musicName;
        if (str2 == null) {
            str2 = "";
        }
        SelectedMusicInfo selectedMusicInfo = new SelectedMusicInfo(str2, str, String.valueOf(soundEffect.id), EnumC356650DyZ.SONG);
        AVMusic aVMusicLIZ = C19556611fI.LIZ(soundEffect);
        C0CRH c0crh = C0CRH.LL;
        C356640DyY c356640DyY = new C356640DyY(this, selectedMusicInfo, j, j2, soundEffect);
        c0crh.getClass();
        AwS371S0200000_5 awS371S0200000_5 = new AwS371S0200000_5(aVMusicLIZ, c356640DyY, 287);
        if (str != null && str.length() != 0) {
            C141Q.LIZ.getClass();
            if (str != null && (num = C141Q.LIZIZ.get(str)) != null && num.intValue() > 0) {
                awS371S0200000_5.invoke(0);
                return;
            }
            if (C298180BmS.LIZ() && aVMusicLIZ.getDuration() > 0) {
                awS371S0200000_5.invoke(Integer.valueOf(aVMusicLIZ.getDuration()));
                return;
            }
            String strLJIIIIZZ = C141Q.LJIIIIZZ(str);
            if (strLJIIIIZZ != null && strLJIIIIZZ.length() != 0) {
                C0CRH.LLILZ = C23250099c.LIZLLL(c0crh, C0PEM.LIZJ, null, new C0CRG(str, awS371S0200000_5, null), 2);
                return;
            } else {
                awS371S0200000_5.invoke(0);
                return;
            }
        }
        awS371S0200000_5.invoke(0);
    }

    public C356690Dyd(C19GS c19gs, C358780E4u c358780E4u, C0E48 c0e48) {
        this.LIZ = c0e48;
        this.LIZIZ = new SafeHandler(c358780E4u.LLILLJJLI);
    }
}
