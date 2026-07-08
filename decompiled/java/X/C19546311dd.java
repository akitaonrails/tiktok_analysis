package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.ies.nle.editor_jni.INLEPurePlayer;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11dd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19546311dd {
    public final VideoPublishEditModel LIZ;
    public final InterfaceC19547311dn LIZIZ;
    public final C0FF5 LIZJ;
    public final C19537911cH LIZLLL;
    public Effect LJ;
    public final C19546211dc LJFF;
    public volatile long LJIIJJI;
    public InterfaceC1219340hps LJIILJJIL;
    public C1219400hpy LJIILL;
    public long LJIILLIIL;
    public RunnableC19546811di LJIJ;
    public AtomicBoolean LJI = new AtomicBoolean(false);
    public AtomicBoolean LJII = new AtomicBoolean(false);
    public final C054G LJIIIIZZ = C2296808zG.LIZIZ();
    public AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public volatile EnumC19547111dl LJIIJ = EnumC19547111dl.ALL;
    public AtomicBoolean LJIIL = new AtomicBoolean(false);
    public final C19546511df LJIILIIL = new C19546511df();
    public final BPEAHandler LJIIZILJ = new BPEAHandler(Looper.getMainLooper());
    public final C19546911dj LJIJI = new INLEPurePlayer.INLEPurePlayerInfoListener() { // from class: X.11dj
        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onFirstFrameRender() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onFirstFrameRender(this);
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onPlayEnd() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayEnd(this);
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onPlayerPause() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayerPause(this);
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onPrepared() {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPrepared(this);
        }

        @Override // com.bytedance.ies.nle.editor_jni.INLEPurePlayer.INLEPurePlayerInfoListener
        public final void onPlayTime(int i, long j) {
            INLEPurePlayer.INLEPurePlayerInfoListener.DefaultImpls.onPlayTime(this, i, j);
            this.LIZ.LJIIJJI = j;
            C19546111db c19546111db = C19546111db.LIZ;
            EnumC19547111dl enumC19547111dl = this.LIZ.LJIIJ;
            Effect effect = this.LIZ.LJ;
            c19546111db.getClass();
            long jLJ = C19546111db.LJ(enumC19547111dl, effect);
            if (jLJ >= j) {
                C19546311dd.LIZJ(this.LIZ);
                return;
            }
            if (jLJ <= 0) {
                return;
            }
            if (!C19546111db.LJIIJ(this.LIZ.LJ) && !C19546111db.LJIIIIZZ(this.LIZ.LJ)) {
                return;
            }
            this.LIZ.LJIIIZ.compareAndSet(false, true);
            C201955140j.LIZIZ("VoiceConversionStream", "video pause");
            C19546311dd c19546311dd = this.LIZ;
            c19546311dd.getClass();
            C201955140j.LIZIZ("VoiceConversionStream", "pause()");
            c19546311dd.LIZIZ.pause();
            C201955140j.LIZIZ("VoiceConversionStream", "StreamVCCallback onResult play false");
        }
    };

    /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            r5 = this;
            X.054G r2 = r5.LJIIIIZZ
            X.0hpo r1 = new X.0hpo
            r3 = 0
            r1.<init>(r5, r3)
            r0 = 3
            X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            X.11db r1 = X.C19546111db.LIZ
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.LJ
            r1.getClass()
            boolean r4 = X.C19546111db.LJIIIIZZ(r0)
            com.ss.android.ugc.effectmanager.effect.model.Effect r0 = r5.LJ
            boolean r2 = X.C19546111db.LJIIJ(r0)
            r5.LJIIIZ()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r5.LJIIL = r0
            if (r2 == 0) goto L57
            X.11e5 r0 = X.C19548411dy.LIZ()
            X.11do r0 = (X.C19547411do) r0
            r0.LJ(r1)
            X.11df r1 = r5.LJIILIIL
            r0 = 53
            r1.LJ(r0)
            if (r4 != 0) goto L3e
            if (r2 == 0) goto L4c
        L3e:
            X.0hps r0 = r5.LJIILJJIL
            if (r0 == 0) goto L45
            r0.onCancel()
        L45:
            X.11df r1 = r5.LJIILIIL
            r0 = 50
            r1.LJ(r0)
        L4c:
            r5.LJ = r3
            r5.LJIIJ()
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r5.LJIIZILJ
            r0.removeCallbacksAndMessages(r3)
            return
        L57:
            if (r4 == 0) goto L4c
            X.11e5 r1 = X.C19548411dy.LIZ()
            r0 = 1
            X.11do r1 = (X.C19547411do) r1
            r1.LJ(r0)
            X.11df r1 = r5.LJIILIIL
            r0 = 55
            r1.LJ(r0)
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19546311dd.LIZ():void");
    }

    public final void LJIIIZ() {
        C201955140j.LIZIZ("VoiceConversionStream", "removeStreamPlayListener");
        INLEPlayer iNLEPlayerW0 = this.LIZIZ.w0();
        if (iNLEPlayerW0 == null) {
            return;
        }
        iNLEPlayerW0.removePlayerInfoListener(this.LJIJI);
    }

    public final void LJIIJ() {
        this.LJFF.LIZ.clear();
        this.LJFF.LIZIZ.clear();
        this.LJI = new AtomicBoolean(false);
        this.LJIIJ = EnumC19547111dl.ALL;
        this.LJIIIZ = new AtomicBoolean(true);
        ((C19547411do) C19548411dy.LIZ()).LJIIL();
        ((LinkedHashMap) this.LIZLLL.LIZJ).clear();
    }

    public static void LIZJ(C19546311dd c19546311dd) {
        if (c19546311dd.LJIIIZ.get() && c19546311dd.LJI.get() && !c19546311dd.LJIIL.get()) {
            C201955140j.LIZIZ("VoiceConversionStream", "video play");
            c19546311dd.LJIIIIZZ(false);
            C201955140j.LIZIZ("VoiceConversionStream", "StreamVCCallback onResult play true");
            c19546311dd.LJIIIZ.compareAndSet(true, false);
        }
    }

    public final void LJIIIIZZ(boolean z) {
        C19546111db c19546111db = C19546111db.LIZ;
        EnumC19547111dl enumC19547111dl = this.LJIIJ;
        Effect effect = this.LJ;
        c19546111db.getClass();
        if (((C19546111db.LJ(enumC19547111dl, effect) <= this.LJIIJJI && C19546111db.LJ(this.LJIIJ, this.LJ) != -1024) || this.LJIIL.get()) && !z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("play() is not satisfy status:");
            sbLIZ.append(this.LJIIJ);
            sbLIZ.append(",currentDonload:");
            sbLIZ.append(C19546111db.LJ(this.LJIIJ, this.LJ));
            sbLIZ.append(",currentPlayTimeUS:");
            sbLIZ.append(this.LJIIJJI);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        this.LIZIZ.play();
        C201955140j.LIZIZ("VoiceConversionStream", "play() is ok");
    }

    public final void LIZLLL(Effect effect, C19536311c1 c19536311c1) {
        String strLJJIFFI;
        String str = c19536311c1.LJ;
        if (str != null && str.length() > 0) {
            strLJJIFFI = u.LJJIFFI(str, "_stream_1024_temp", "", false);
        } else {
            strLJJIFFI = null;
        }
        if (strLJJIFFI != null) {
            String str2 = c19536311c1.LJ;
            if (str2 != null) {
                C19546111db.LIZ.getClass();
                C0VSJ c0vsj = new C0VSJ(str2);
                if (c0vsj.exists()) {
                    boolean zRenameTo = c0vsj.renameTo(new C0VSJ(strLJJIFFI));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("renameTmpFile result:");
                    sbLIZ.append(zRenameTo);
                    C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
                }
                c19536311c1.LJ = strLJJIFFI;
                this.LIZLLL.LIZIZ(c19536311c1, C1664460tPo.LJII(effect), strLJJIFFI);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(" applyVoiceChange in finalFileProcessAndApply filePath:");
                sbLIZ2.append(strLJJIFFI);
                sbLIZ2.append(",tempPath:");
                sbLIZ2.append(str2);
                sbLIZ2.append("，threadid:");
                sbLIZ2.append(C786410Ut5.u3().getId());
                C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ2));
                this.LIZJ.LLLII(c19536311c1, strLJJIFFI, null);
                return;
            }
            return;
        }
        C201955140j.LIZIZ("VoiceConversionStream", " finalFileProcessAndApply  path is isEmpty ");
    }

    public static boolean LIZIZ(Effect effect, String str, C19537911cH c19537911cH) {
        if (effect != null) {
            if (str.length() <= 0 || (a0.LJJIIZI(str, C1664460tPo.LJIIIIZZ(effect), false) && C1664460tPo.LJFF(effect))) {
                return false;
            }
            C201955140j.LIZIZ("VoiceConversionStream", "checkToDeleteTmpFile");
            C19546111db c19546111db = C19546111db.LIZ;
            String strLJIIIIZZ = C1664460tPo.LJIIIIZZ(effect);
            c19546111db.getClass();
            if (a0.LJJIIZI(str, strLJIIIIZZ, false)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkToDeleteTmpFile-->curEffect streamSpeakId:");
                sbLIZ.append(strLJIIIIZZ);
                sbLIZ.append(" filePath:");
                sbLIZ.append(str);
                C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
                c19537911cH.LIZJ.put(C19546111db.LIZLLL(str), "");
            }
            return true;
        }
        C19546111db.LIZ.getClass();
        c19537911cH.LIZJ.put(C19546111db.LIZLLL(str), "");
        return true;
    }

    public final C19547611dq LJ(List<C19536311c1> list, Effect effect, boolean z) {
        NLETrack mainTrack;
        NLETrackType trackType;
        VecNLETrackSPtr tracks;
        NLETrack nLETrack;
        NLEResType type;
        NLESegment mainSegment;
        C19547611dq c19547611dq = new C19547611dq();
        C19546111db c19546111db = C19546111db.LIZ;
        String strLJIIIIZZ = C1664460tPo.LJIIIIZZ(effect);
        c19546111db.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLJIIIIZZ);
        sbLIZ.append('_');
        sbLIZ.append(C19546111db.LIZIZ);
        c19547611dq.LJIIL = C19546111db.LIZJ(this.LIZ, C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            String strLJIIIIZZ2 = C1664460tPo.LJIIIIZZ(effect);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLJIIIIZZ2);
            sbLIZ2.append('_');
            sbLIZ2.append(C19546111db.LIZJ);
            c19547611dq.LJIIL = C19546111db.LIZJ(this.LIZ, C2188811AlT.LIZIZ(sbLIZ2));
            VideoPublishEditModel videoPublishEditModel = this.LIZ;
            C19546211dc c19546211dc = this.LJFF;
            ArrayList<C19536311c1> arrayList = new ArrayList();
            for (C19536311c1 c19536311c1 : list) {
                NLETrackSlot nLETrackSlot = c19536311c1.LIZ;
                if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null) {
                    type = mainSegment.getType();
                } else {
                    type = null;
                }
                if (type == NLEResType.RECORD) {
                    arrayList.add(c19536311c1);
                }
            }
            for (C19536311c1 c19536311c12 : arrayList) {
                C19546111db.LIZ.getClass();
                C19546111db.LIZIZ(c19536311c12, videoPublishEditModel, effect, c19546211dc, c19547611dq);
            }
            c19547611dq.LJIILIIL = 1;
        } else {
            VideoPublishEditModel videoPublishEditModel2 = this.LIZ;
            C19546211dc c19546211dc2 = this.LJFF;
            ArrayList<C19536311c1> arrayList2 = new ArrayList();
            for (C19536311c1 c19536311c13 : list) {
                C19536311c1 c19536311c14 = c19536311c13;
                NLEModel nLEModel = c19536311c14.LIZIZ;
                if (nLEModel != null) {
                    mainTrack = nLEModel.getMainTrack();
                } else {
                    mainTrack = null;
                }
                if (C350870DpF.LJIIIIZZ(mainTrack) != NLETrackType.VIDEO) {
                    NLEModel nLEModel2 = c19536311c14.LIZIZ;
                    if (nLEModel2 != null && (tracks = nLEModel2.getTracks()) != null && (nLETrack = (NLETrack) C13LP.LJJJLL(tracks)) != null) {
                        trackType = nLETrack.getTrackType();
                    } else {
                        trackType = null;
                    }
                    if (trackType == NLETrackType.AUDIO) {
                    }
                }
                arrayList2.add(c19536311c13);
            }
            for (C19536311c1 c19536311c15 : arrayList2) {
                C19546111db.LIZ.getClass();
                C19546111db.LIZIZ(c19536311c15, videoPublishEditModel2, effect, c19546211dc2, c19547611dq);
            }
        }
        if (!c19547611dq.LJIILJJIL && c19547611dq.LJIIIZ.size() == 0) {
            return null;
        }
        return c19547611dq;
    }

    public final void LJIILIIL(String str, String str2, boolean z) {
        if (str != null && C123100dR.LIZ(str)) {
            this.LJIILIIL.LIZLLL("task_id", str);
            if (z) {
                this.LJIILIIL.LIZIZ("task_id", str);
            } else {
                this.LJIILIIL.LIZJ("task_id", str);
            }
        }
        if (str2 != null && C123100dR.LIZ(str2)) {
            this.LJIILIIL.LIZLLL("error_msg", str2);
            if (z) {
                this.LJIILIIL.LIZIZ("error_msg", str2);
            } else {
                this.LJIILIIL.LIZJ("error_msg", str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.11dj] */
    public C19546311dd(VideoPublishEditModel videoPublishEditModel, InterfaceC19547311dn interfaceC19547311dn, C0FF5 c0ff5, C19537911cH c19537911cH) {
        this.LIZ = videoPublishEditModel;
        this.LIZIZ = interfaceC19547311dn;
        this.LIZJ = c0ff5;
        this.LIZLLL = c19537911cH;
        this.LJFF = new C19546211dc(new ConcurrentHashMap(), new ConcurrentHashMap(), c19537911cH, c0ff5);
    }

    public final void LJFF(Effect effect, String str, InterfaceC1219340hps interfaceC1219340hps, String str2, boolean z) {
        if (!Intrinsics.LJFF(this.LJ, effect)) {
            return;
        }
        LJIIIZ();
        C23250099c.LIZLLL(this.LJIIIIZZ, null, null, new C1219350hpt(interfaceC1219340hps, str, null), 3);
        C19546111db.LIZ.getClass();
        if (C19546111db.LJIIIIZZ(effect)) {
            this.LJIILIIL.LJ(44);
        }
        if (C19546111db.LJIIJ(effect)) {
            this.LJIILIIL.LJ(43);
        }
        if (C19546111db.LJII(effect)) {
            this.LJIILIIL.LJ(40);
            ((C19547411do) C19548411dy.LIZ()).LJFF(str2, z);
        } else {
            ((C19547411do) C19548411dy.LIZ()).LJFF(str2, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.11dh] */
    public final void LJIIJJI(final Effect effect, final String str, final List<C19536311c1> list, final InterfaceC1219340hps interfaceC1219340hps, final C19547611dq c19547611dq, final C1219400hpy c1219400hpy) {
        ((C19547411do) C19548411dy.LIZ()).LJIILJJIL(new InterfaceC19548711e1() { // from class: X.11dh
            @Override // X.InterfaceC19548711e1
            public final void LIZ(int i, int i2, long j, long j2, String str2, String str3, String str4, String str5, String str6) {
                String name;
                StringBuilder sb = new StringBuilder("startVoiceChangeDubTrack onResult-->effectInList:");
                sb.append(effect.getName());
                sb.append(" taskId:");
                sb.append(str2);
                sb.append(", statusText:");
                sb.append(str3);
                sb.append(", currentDownloadTimeMS:");
                sb.append(j);
                sb.append(",totalDownloadTimeMS:");
                sb.append(j2);
                sb.append(",status:");
                sb.append(i);
                sb.append(" msg:");
                sb.append(str6);
                sb.append("  waitForVCAudioData:");
                sb.append(this.LJIIIZ);
                sb.append(" curEffect:");
                Effect effect2 = this.LJ;
                if (effect2 != null) {
                    name = effect2.getName();
                } else {
                    name = null;
                }
                sb.append(name);
                sb.append(" currentFilePath:");
                sb.append(str4);
                sb.append(" totalFilePath:");
                sb.append(c19547611dq.LJIIL);
                sb.append(", network:");
                sb.append(C0XF1.LIZLLL(C0CHQ.LIZ));
                C201955140j.LIZIZ("VoiceConversionStream", sb.toString());
                C19546311dd c19546311dd = this;
                if (C19546311dd.LIZIZ(c19546311dd.LJ, str4, c19546311dd.LIZLLL)) {
                    return;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4 && i != 5) {
                                if (i == 8) {
                                    this.LJII(effect, str, list, interfaceC1219340hps, str4, c19547611dq.LJIIL, true);
                                    return;
                                }
                                return;
                            } else {
                                this.LJIILIIL(str2, str3, true);
                                this.LJIILIIL.LIZLLL("error_code", String.valueOf(i2));
                                this.LJIILIIL.LIZIZ("error_code", String.valueOf(i2));
                                this.LJFF(effect, str, interfaceC1219340hps, c19547611dq.LJIIL, true);
                                return;
                            }
                        }
                        C19536311c1 c19536311c1 = this.LJFF.LIZIZ.get(str4);
                        if (c19536311c1 != null) {
                            this.LIZLLL(effect, c19536311c1);
                        }
                        this.LJIILIIL.LJ(34);
                        return;
                    }
                    C19536311c1 c19536311c12 = this.LJFF.LIZIZ.get(str4);
                    if (c19536311c12 == null) {
                        return;
                    }
                    c19536311c12.LJ = str4;
                    this.LJI(effect, str, c19536311c12, j, str4, interfaceC1219340hps, c1219400hpy);
                    return;
                }
                this.LJIILIIL.LJ(24);
                C19546311dd c19546311dd2 = this;
                C23250099c.LIZLLL(c19546311dd2.LJIIIIZZ, null, null, new C1219280hpm(c19546311dd2, interfaceC1219340hps, str, null), 3);
                this.LJIILIIL(str2, str3, true);
            }
        });
        this.LJIILIIL.LJ(4);
        ((C19547411do) C19548411dy.LIZ()).LJIIZILJ(C1664460tPo.LJIIIIZZ(effect), c19547611dq.LJIILIIL, c19547611dq.LJIIIIZZ, c19547611dq.LJIIIZ, c19547611dq.LJIIJ, c19547611dq.LJIIJJI, c19547611dq.LJIJJ, c19547611dq.LJIJJLI, c19547611dq.LJIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVoiceChangeDubTrack start noDub is finish:");
        C19546111db.LIZ.getClass();
        sbLIZ.append(!C19546111db.LJIIJ(effect));
        sbLIZ.append(",dub:");
        sbLIZ.append(!C19546111db.LJIIIIZZ(effect));
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.11dg] */
    public final void LJIIL(final Effect effect, final String str, final List<C19536311c1> list, final InterfaceC1219340hps interfaceC1219340hps, final C19547611dq c19547611dq, final C1219400hpy c1219400hpy) {
        if (c19547611dq.LJIIIZ.size() == 0) {
            return;
        }
        ((C19547411do) C19548411dy.LIZ()).LJIILIIL(new InterfaceC19548711e1() { // from class: X.11dg
            @Override // X.InterfaceC19548711e1
            public final void LIZ(int i, int i2, long j, long j2, String str2, String str3, String str4, String str5, String str6) {
                String name;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("startVoiceChangeInNonDubTrack effectInList:");
                sbLIZ.append(effect.getName());
                sbLIZ.append(" status:");
                sbLIZ.append(i);
                sbLIZ.append(" ,currentDownloadTimeMS:");
                sbLIZ.append(j);
                sbLIZ.append(",totalDownloadTimeMS:");
                sbLIZ.append(j2);
                sbLIZ.append("msg:");
                sbLIZ.append(str6);
                sbLIZ.append("  waitForVCAudioData:");
                sbLIZ.append(this.LJIIIZ);
                sbLIZ.append(" curEffect:");
                Effect effect2 = this.LJ;
                if (effect2 != null) {
                    name = effect2.getName();
                } else {
                    name = null;
                }
                sbLIZ.append(name);
                sbLIZ.append(" currentFilePath:");
                sbLIZ.append(str4);
                sbLIZ.append(" network:");
                sbLIZ.append(C0XF1.LIZLLL(C0CHQ.LIZ));
                C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
                C19546311dd c19546311dd = this;
                if (C19546311dd.LIZIZ(c19546311dd.LJ, str4, c19546311dd.LIZLLL)) {
                    return;
                }
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3 && i != 4 && i != 5) {
                                if (i == 8) {
                                    this.LJII(effect, str, list, interfaceC1219340hps, str4, c19547611dq.LJIIL, false);
                                    return;
                                }
                                return;
                            } else {
                                this.LJIILIIL(str2, str3, false);
                                this.LJIILIIL.LIZLLL("error_code", String.valueOf(i2));
                                this.LJIILIIL.LIZJ("error_code", String.valueOf(i2));
                                this.LJFF(effect, str, interfaceC1219340hps, c19547611dq.LJIIL, false);
                                return;
                            }
                        }
                        C19536311c1 c19536311c1 = this.LJFF.LIZ.get(str4);
                        if (c19536311c1 != null) {
                            this.LIZLLL(effect, c19536311c1);
                        }
                        this.LJIILIIL.LJ(33);
                        return;
                    }
                    C19536311c1 c19536311c12 = this.LJFF.LIZ.get(str4);
                    if (c19536311c12 == null) {
                        return;
                    }
                    c19536311c12.LJ = str4;
                    this.LJI(effect, str, c19536311c12, j, str4, interfaceC1219340hps, c1219400hpy);
                    return;
                }
                this.LJIILIIL.LJ(23);
                this.LJIILIIL(str2, str3, false);
                C19546311dd c19546311dd2 = this;
                C23250099c.LIZLLL(c19546311dd2.LJIIIIZZ, null, null, new C1219280hpm(c19546311dd2, interfaceC1219340hps, str, null), 3);
            }
        });
        this.LJIILIIL.LJ(3);
        ((C19547411do) C19548411dy.LIZ()).LJIILL(C1664460tPo.LJIIIIZZ(effect), c19547611dq.LJIILIIL, c19547611dq.LJIIIIZZ, c19547611dq.LJIIIZ, c19547611dq.LJIIJ, c19547611dq.LJIIJJI, c19547611dq.LJIJJ, c19547611dq.LJIJJLI, c19547611dq.LJIIL);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startVoiceChangeInNonDubTrack start noDub is finish:");
        C19546111db.LIZ.getClass();
        sbLIZ.append(!C19546111db.LJIIJ(effect));
        sbLIZ.append(",dub:");
        sbLIZ.append(!C19546111db.LJIIIIZZ(effect));
        C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LJI(Effect effect, String str, C19536311c1 c19536311c1, long j, String str2, InterfaceC1219340hps interfaceC1219340hps, C1219400hpy c1219400hpy) {
        if (!Intrinsics.LJFF(this.LJ, effect)) {
            return;
        }
        LIZJ(this);
        int iLJIIIIZZ = ((C19547411do) C19548411dy.LIZ()).LJIIIIZZ(true) + ((C19547411do) C19548411dy.LIZ()).LJIIIIZZ(false);
        C19546111db.LIZ.getClass();
        if (C19546111db.LJII(effect)) {
            C23250099c.LIZLLL(c1219400hpy.LIZLLL, null, null, new C1219390hpx(iLJIIIIZZ, 3, interfaceC1219340hps, c1219400hpy, str, null), 3);
        }
        C19537911cH c19537911cH = this.LIZLLL;
        if (!C2286708xd.LIZJ((String) ((LinkedHashMap) c19537911cH.LIZJ).get(C19546111db.LIZLLL(str2))) && j >= 1000) {
            C19537911cH c19537911cH2 = this.LIZLLL;
            c19537911cH2.LIZJ.put(C19546111db.LIZLLL(str2), str2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(" applyVoiceChange in onStreamProgress filePath:");
            sbLIZ.append(str2);
            C201955140j.LIZIZ("VoiceConversionStream", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZJ.LLLII(c19536311c1, str2, null);
            LJIIIIZZ(false);
            if (!this.LJI.get()) {
                this.LJIILIIL.LJ(10);
            }
            long jLJI = C19546111db.LJI(c19536311c1);
            if (C19546111db.LJIIIZ(c19536311c1)) {
                this.LJIILIIL.LIZIZ("origin_duration_ms", String.valueOf(jLJI));
                this.LJIILIIL.LJ(14);
            } else {
                this.LJIILIIL.LIZJ("origin_duration_ms", String.valueOf(jLJI));
                this.LJIILIIL.LJ(13);
            }
            this.LJI.compareAndSet(false, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(com.ss.android.ugc.effectmanager.effect.model.Effect r12, java.lang.String r13, java.util.List<X.C19536311c1> r14, X.InterfaceC1219340hps r15, java.lang.String r16, java.lang.String r17, boolean r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19546311dd.LJII(com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.String, java.util.List, X.0hps, java.lang.String, java.lang.String, boolean):void");
    }
}
