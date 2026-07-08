package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAudio;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0E44, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E44 implements InterfaceC379610EuV, C0E7Y {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public final C1DRG LL;
    public final C19A3 LLILLJJLI;
    public final Function1<Boolean, Unit> LLILLL;
    public final C1664750tQH LLILZIL;
    public final C1664750tQH LLILZLL;
    public final C1664740tQG LLIZ;
    public final C1664740tQG LLIZLLLIL;
    public long LLJI;
    public long LLJIJIL;
    public final C01GW LLILZ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 1247));
    public List<Long> LLJ = C13BV.INSTANCE;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C0E44.class, "trackPanelApi", "getTrackPanelApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C0E44.class, "consoleBar", "getConsoleBar()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C0E44.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C0E44.class, "epLegacyApi", "getEpLegacyApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EPSceneLegacyApi;", 0);
        c09r3.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
    }

    @Override // X.C0E7Y
    public final void LIZLLL() {
        this.LLILLL.invoke(Boolean.TRUE);
    }

    @Override // X.C0E7Y
    public final void LJ() {
        this.LLILLL.invoke(Boolean.FALSE);
        LJII();
        C0EB7.LIZIZ((InterfaceC360800ECo) this.LLILZLL.getValue(this, LLJILJIL[1]), true, false);
    }

    public final C0E48 LJII() {
        return (C0E48) this.LLILZ.getValue();
    }

    @Override // X.C0E7Y
    public final List<Long> LIZ() {
        return this.LLJ;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    @Override // X.C0E7Y
    public final void LIZIZ(NLETrackSlot nLETrackSlot) {
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        NLEMediaConfig mediaConfig;
        this.LLILLL.invoke(Boolean.FALSE);
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII == null) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF12 = c0e48LJII.f1();
        if (iNLEMediaSessionF12 != null && (mediaConfig = iNLEMediaSessionF12.getMediaConfig()) != null && !mediaConfig.getEnableLockSeekInVESwingMode()) {
            nLETrackSlot.setIgnoreUserSetEndTime(false);
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setIgnoreUserSetTimeClipEnd(false);
            }
        }
        if (c0e48LJII.Ls() && (iNLEMediaSessionF1 = c0e48LJII.f1()) != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.unlockSeekVideoClip();
        }
        c0e48LJII.getPlayer().skipNextSeek(true);
    }

    @Override // X.C0E7Y
    public final void LJI(NLETrackSlot nLETrackSlot) {
        NLETrack next;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot2;
        long timeClipStart;
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        NLEMediaConfig mediaConfig;
        this.LLILLL.invoke(Boolean.TRUE);
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII == null) {
            return;
        }
        INLEMediaSession iNLEMediaSessionF12 = c0e48LJII.f1();
        if (iNLEMediaSessionF12 != null && (mediaConfig = iNLEMediaSessionF12.getMediaConfig()) != null && !mediaConfig.getEnableLockSeekInVESwingMode()) {
            nLETrackSlot.setIgnoreUserSetEndTime(true);
            NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast != null) {
                nLESegmentVideoDynamicCast.setIgnoreUserSetTimeClipEnd(true);
            }
            C1664750tQH c1664750tQH = this.LLILZIL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            ((C0E5S) c1664750tQH.getValue(this, interfaceC2217461BqaArr[0])).QD2(false, false);
            c0e48LJII.LLFII().LJI().commit();
            ((C0E5S) this.LLILZIL.getValue(this, interfaceC2217461BqaArr[0])).QD2(true, false);
        }
        if (c0e48LJII.Ls() && (iNLEMediaSessionF1 = c0e48LJII.f1()) != null && (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) != null) {
            mediaRuntimeApi.lockSeekVideoClip(nLETrackSlot.getUUID());
        }
        VecNLETrackSPtr tracks = C350870DpF.LJI(c0e48LJII).getTracks();
        if (tracks != null) {
            Iterator<NLETrack> it2 = tracks.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    NLETrack nLETrack = next;
                    if (C351220Dpo.LLILLL(nLETrack) || C351220Dpo.LLJILLL(nLETrack)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLETrack nLETrack2 = next;
            if (nLETrack2 != null && (sortedSlots = nLETrack2.getSortedSlots()) != null && (nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null && nLETrackSlot2.hasExtra("audio_stick_points")) {
                int i = C367650EbD.LLILZLL;
                List listLIZ = C122600dM.LIZ(nLETrackSlot2.getExtra("audio_stick_points"));
                NLESegmentAudio nLESegmentAudioDynamicCast = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                long timeClipEnd = 0;
                if (nLESegmentAudioDynamicCast != null) {
                    timeClipStart = nLESegmentAudioDynamicCast.getTimeClipStart();
                } else {
                    timeClipStart = 0;
                }
                int iLIZ = C352310DrZ.LIZ(timeClipStart);
                NLESegmentAudio nLESegmentAudioDynamicCast2 = NLESegmentAudio.dynamicCast(nLETrackSlot2.getMainSegment());
                if (nLESegmentAudioDynamicCast2 != null) {
                    timeClipEnd = nLESegmentAudioDynamicCast2.getTimeClipEnd();
                }
                int iLIZ2 = C352310DrZ.LIZ(timeClipEnd);
                int iLIZ3 = C352310DrZ.LIZ(nLETrackSlot2.getStartTime());
                float fLJLILLLLZI = C351220Dpo.LJLILLLLZI(nLETrackSlot2.getMainSegment());
                ArrayList arrayList = new ArrayList();
                for (Object obj : listLIZ) {
                    int iIntValue = ((Number) obj).intValue();
                    if (iLIZ <= iIntValue && iIntValue <= iLIZ2) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(Long.valueOf((long) (iLIZ3 + ((((Number) it3.next()).intValue() - iLIZ) / fLJLILLLLZI))));
                }
                this.LLJ = arrayList2;
            }
        }
    }

    public C0E44(C1DRG c1drg, C19A3 c19a3, AwS584S0100000_5 awS584S0100000_5) {
        this.LL = c1drg;
        this.LLILLJJLI = c19a3;
        this.LLILLL = awS584S0100000_5;
        this.LLILZIL = C1664770tQJ.LIZ(c1drg, C0E5S.class, null);
        this.LLILZLL = C1664770tQJ.LIZ(c1drg, InterfaceC360800ECo.class, null);
        this.LLIZ = C1664770tQJ.LIZIZ(c1drg, C0EY2.class, null);
        this.LLIZLLLIL = C1664770tQJ.LIZIZ(c1drg, C0EC7.class, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    @Override // X.C0E7Y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(X.EnumC368970EdL r19, X.EnumC368970EdL r20, long r21, long r23) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0E44.LJFF(X.0EdL, X.0EdL, long, long):void");
    }

    @Override // X.C0E7Y
    public final void LIZJ(NLETrackSlot nLETrackSlot, float f, int i, long j, long j2) {
        long timeClipStart;
        float f2;
        C358780E4u c358780E4uXJ2;
        NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
        if (nLESegmentVideoDynamicCast != null) {
            timeClipStart = nLESegmentVideoDynamicCast.getTimeClipStart();
        } else {
            timeClipStart = 0;
        }
        if (i == 0) {
            long startTime = nLETrackSlot.getStartTime();
            long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
            f2 = (startTime / j3) + ((j - (timeClipStart / j3)) / f);
        } else {
            long startTime2 = nLETrackSlot.getStartTime();
            long j4 = LSPassThroughRecordSizeConfig.DEFAULT;
            f2 = ((startTime2 / j4) + (((j + j2) - (timeClipStart / j4)) / f)) - 1;
        }
        C0E48 c0e48LJII = LJII();
        if (c0e48LJII == null) {
            return;
        }
        if (c0e48LJII.Ls()) {
            c0e48LJII.getPlayer().LIZIZ((long) f2);
        }
        NLETrackSlot nLETrackSlotLLLLLLIL = c0e48LJII.LLLLLLIL();
        if (nLETrackSlotLLLLLLIL != null) {
            C1664750tQH c1664750tQH = this.LLILZLL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLJILJIL;
            C0EB7.LIZIZ((InterfaceC360800ECo) c1664750tQH.getValue(this, interfaceC2217461BqaArr[1]), false, false);
            VecNLETrackSlotSPtr keyframes = nLETrackSlotLLLLLLIL.getKeyframes();
            if ((keyframes != null && !keyframes.isEmpty()) || C351220Dpo.LLIIIJ(nLETrackSlotLLLLLLIL)) {
                long jJh = c0e48LJII.getPlayer().Jh();
                C0EC7 c0ec7 = (C0EC7) this.LLIZLLLIL.getValue(this, interfaceC2217461BqaArr[3]);
                if (c0ec7 != null && (c358780E4uXJ2 = c0ec7.xJ2()) != null) {
                    c358780E4uXJ2.LJIILLIIL(C351220Dpo.LLLLLLJ(jJh));
                }
            }
        }
    }
}
