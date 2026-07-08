package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import com.ss.android.vesdk.clipparam.VEAlgorithmPath;

/* JADX INFO: renamed from: X.0E1t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357990E1t {
    public final C19EG LIZ;
    public final C363230ELx LIZIZ;
    public final C0E48 LIZJ;
    public final LifecycleOwner LIZLLL;
    public AVMusic LJ;
    public final C1446430nk9 LJFF;
    public C2472609mW LJI;
    public final C054G LJII;

    public static VideoPublishEditModel LIZ() {
        EditModelProvider.Companion.getClass();
        return C0E1T.LIZ().getEditModel();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ() {
        /*
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = LIZ()
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L1c
            com.ss.android.ugc.aweme.creative.model.PUgcTemplateData r0 = r0.pugcTemplateData
            if (r0 == 0) goto L1c
            boolean r1 = r0.isFromCreateTemplate
            r0 = 1
            if (r1 != r0) goto L1c
        L13:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C351230Dpp.LJ(r0)
            return r0
        L1c:
            r0 = 0
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357990E1t.LIZJ():boolean");
    }

    public final void LIZLLL(InterfaceC358010E1v interfaceC358010E1v) {
        synchronized (this.LJFF) {
            try {
                C2472609mW c2472609mW = this.LJI;
                if (c2472609mW != null && c2472609mW.LIZIZ()) {
                    return;
                }
                this.LJI = null;
                if (interfaceC358010E1v != null) {
                    interfaceC358010E1v.onFailed();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(AVMusic aVMusic, String str) {
        NLESegment mainSegment;
        NLEResourceNode resource;
        String strLIZIZ;
        VecNLETrackSlotSPtr sortedSlots;
        NLENode nLENode;
        NLESegment mainSegment2;
        NLEResourceNode resource2;
        C0E48 c0e48 = this.LIZJ;
        if (c0e48 == null) {
            return;
        }
        NLETrack nLETrackLIZLLL = C350890DpH.LIZLLL(c0e48);
        if (nLETrackLIZLLL == null) {
            if (aVMusic != null && str != null) {
                NLETrackSlot nLETrackSlotX0 = this.LIZIZ.X0(aVMusic, str, 0L, 0L, false, EnumC356070Dxd.NONE, false, true);
                if (nLETrackSlotX0 != null && (mainSegment2 = nLETrackSlotX0.getMainSegment()) != null && (resource2 = mainSegment2.getResource()) != null) {
                    resource2.setResourceName(C1419800n3C.LIZIZ(this.LIZ, aVMusic));
                }
            } else {
                C356530DyN.LIZIZ(C0E5P.LIZIZ, "initMusicTrackForSync", "no local music file");
            }
        } else {
            NLETrackSlot nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(nLETrackLIZLLL.getSlots());
            if (nLETrackSlot != null && (mainSegment = nLETrackSlot.getMainSegment()) != null && (resource = mainSegment.getResource()) != null) {
                if (aVMusic != null) {
                    strLIZIZ = C1419800n3C.LIZIZ(this.LIZ, aVMusic);
                } else {
                    strLIZIZ = null;
                }
                resource.setResourceName(strLIZIZ);
            }
            nLETrackLIZLLL.setExtra("AudioTrackType", "BGM");
        }
        NLETrack nLETrackLIZLLL2 = C350890DpH.LIZLLL(this.LIZJ);
        if (nLETrackLIZLLL2 != null && (sortedSlots = nLETrackLIZLLL2.getSortedSlots()) != null && (nLENode = (NLENode) C13LP.LJJJLZIJ(0, sortedSlots)) != null) {
            nLENode.setExtra("is_editor_pro_sync_used", "true");
        }
        C350870DpF.LIZ(this.LIZJ, false);
        this.LIZIZ.LJIIL(false);
    }

    public final void LJ(InterfaceC358010E1v interfaceC358010E1v, int i) {
        synchronized (this.LJFF) {
            try {
                C2472609mW c2472609mW = this.LJI;
                if (c2472609mW != null && c2472609mW.LIZIZ()) {
                    return;
                }
                this.LJI = null;
                if (interfaceC358010E1v != null) {
                    interfaceC358010E1v.LIZ(i);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(int r30, java.util.List r31) {
        /*
            Method dump skipped, instruction units count: 2095
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C357990E1t.LJI(int, java.util.List):void");
    }

    public C357990E1t(C19GS c19gs, C363230ELx c363230ELx, C0E48 c0e48, C372480Ej0 c372480Ej0) {
        this.LIZ = c19gs;
        this.LIZIZ = c363230ELx;
        this.LIZJ = c0e48;
        this.LIZLLL = c372480Ej0;
        C1446430nk9 c1446430nk9 = new C1446430nk9();
        this.LJFF = c1446430nk9;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        c1446430nk9.LIZ = new C0E27() { // from class: X.0E2V
            /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
            @Override // X.C0E27
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final int LIZ(java.lang.String r10, int r11, int r12, com.ss.android.vesdk.clipparam.VEAlgorithmPath r13) {
                /*
                    Method dump skipped, instruction units count: 252
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C0E2V.LIZ(java.lang.String, int, int, com.ss.android.vesdk.clipparam.VEAlgorithmPath):int");
            }
        };
    }

    public static final void LJFF(final C357990E1t c357990E1t, String str, final int i, VEAlgorithmPath vEAlgorithmPath, int i2, AVMusic aVMusic, final InterfaceC358010E1v interfaceC358010E1v) {
        InterfaceC358010E1v interfaceC358010E1v2 = new InterfaceC358010E1v() { // from class: X.0E1u
            @Override // X.InterfaceC358010E1v
            public final void onFailed() {
                this.LIZ.LIZLLL(interfaceC358010E1v);
            }

            @Override // X.InterfaceC358010E1v
            public final void LIZ(int i3) {
                this.LIZ.LJI(i, C13BV.INSTANCE);
                this.LIZ.LJ(interfaceC358010E1v, i3);
            }
        };
        if (c357990E1t.LIZJ == null) {
            c357990E1t.LIZLLL(interfaceC358010E1v2);
        } else {
            C23250099c.LIZLLL(c357990E1t.LJII, null, null, new C0E22(c357990E1t, str, vEAlgorithmPath, i2, i, aVMusic, interfaceC358010E1v2, null), 3);
        }
    }
}
