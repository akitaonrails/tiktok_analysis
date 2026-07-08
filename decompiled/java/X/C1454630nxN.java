package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.creative.model.album.AlbumModel;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.gamora.editor.services.IMusicEditService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nxN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454630nxN extends AbstractC1459270o4r {
    public final C01GW LLLIIIL;

    private final IMusicEditService h8() {
        return (IMusicEditService) this.LLLIIIL.getValue();
    }

    @Override // X.AbstractC1459270o4r
    public boolean F4() {
        C348100Dkm c348100DkmLIZIZ;
        C348100Dkm c348100DkmLIZIZ2;
        if (((Number) C283500B9g.LIZ.getValue()).intValue() > 0) {
            return S5().hasMusic() || S5().getMusicId() != null;
        }
        if (!C294040Bfm.LIZ()) {
            InterfaceC1452170ntP value = E5().g().getValue();
            if (value == null || (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) == null) {
                return false;
            }
            Iterator<NLETrack> it2 = c348100DkmLIZIZ.LIZ.getModel().getTracks().iterator();
            while (it2.hasNext()) {
                NLETrack next = it2.next();
                if (Intrinsics.LJFF(next.getExtra("AudioTrackType"), "BGM")) {
                    return next != null;
                }
            }
            return false;
        }
        InterfaceC1452170ntP value2 = E5().g().getValue();
        if (value2 == null || (c348100DkmLIZIZ2 = C352130DrH.LIZIZ(value2)) == null) {
            return false;
        }
        Iterator<NLETrack> it3 = c348100DkmLIZIZ2.LIZ.getModel().getTracks().iterator();
        while (it3.hasNext()) {
            NLETrack next2 = it3.next();
            NLETrack nLETrack = next2;
            if (Intrinsics.LJFF(nLETrack.getExtra("AudioTrackType"), "BGM") || u.LJIJI(nLETrack.getExtra("biz_extra_type"), "BGM", true)) {
                return next2 != null;
            }
        }
        return false;
    }

    private final AbstractC1452680nuE gc() {
        AbstractC1452680nuE abstractC1452680nuEGc = E5().gc();
        if (abstractC1452680nuEGc != null) {
            return abstractC1452680nuEGc;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.AbstractC1459270o4r
    public boolean H4() {
        AudioRecorderParam veAudioRecorderParam;
        InterfaceC1452170ntP value;
        NLEModel nLEModelLIZ;
        InterfaceC1452170ntP value2;
        NLEModel nLEModelLIZ2;
        boolean zK7 = (!C294050Bfn.LIZ() || (value2 = E5().g().getValue()) == null || (nLEModelLIZ2 = C352130DrH.LIZ(value2)) == null || !C0EYQ.LJIIL(nLEModelLIZ2)) ? k7() && ((veAudioRecorderParam = S5().getVeAudioRecorderParam()) == null || veAudioRecorderParam.getNeedOriginalSound()) : k7();
        int i = S5().creativeModel.albumModel.videoCount;
        return (!C294050Bfn.LIZ() || (value = E5().g().getValue()) == null || (nLEModelLIZ = C352130DrH.LIZ(value)) == null || !C0EYQ.LJIIL(nLEModelLIZ)) ? (i == 0 && S5().creativeModel.albumModel.photoCount == 0) ? zK7 : zK7 && i != 0 : zK7;
    }

    @Override // X.AbstractC1459270o4r
    public boolean k7() {
        if (C537970L7z.LIZLLL(S5().creativeModel.editorProSchemeModel)) {
            AlbumModel albumModel = S5().creativeModel.albumModel;
            if (albumModel.videoCount == 0 && albumModel.photoCount > 0) {
                return false;
            }
        }
        return super.k7();
    }

    @Override // X.AbstractC1459270o4r
    public void K4(VEVolumeChangeOp vEVolumeChangeOp) {
        gc().LJIIL(vEVolumeChangeOp);
    }

    @Override // X.AbstractC1459270o4r
    public void N6(String str) {
        InterfaceC1456910o13 interfaceC1456910o13H5;
        InterfaceC1456910o13 interfaceC1456910o13H52;
        C1463670oBx c1463670oBx;
        C348100Dkm c348100DkmLIZLLL;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData;
        boolean z;
        NLEModel nLEModelLIZ = null;
        if (S5().getEditorProModel().isAdvancedEditDraft()) {
            InterfaceC1452170ntP value = E5().g().getValue();
            if ((value instanceof C1463670oBx) && (c1463670oBx = (C1463670oBx) value) != null && (c348100DkmLIZLLL = c1463670oBx.LIZLLL()) != null) {
                EditorProModel editorProModel = S5().getEditorProModel();
                IMusicEditService iMusicEditServiceH8 = h8();
                if (iMusicEditServiceH8 != null) {
                    editorProModel.setHasAudioInAdvanceEdit(iMusicEditServiceH8.LJFF(c348100DkmLIZLLL));
                    VecNLETrackSlotSPtr sortedSlots = c348100DkmLIZLLL.LIZ.getModel().getMainTrack().getSortedSlots();
                    if (sortedSlots != null) {
                        int i = 0;
                        for (NLETrackSlot nLETrackSlot : sortedSlots) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                NLETrackSlot nLETrackSlot2 = nLETrackSlot;
                                MultiEditVideoRecordData curMultiEditVideoRecordData = S5().getCurMultiEditVideoRecordData();
                                if (curMultiEditVideoRecordData != null && (list = curMultiEditVideoRecordData.segmentDataList) != null && (multiEditVideoSegmentRecordData = (MultiEditVideoSegmentRecordData) C13LP.LJJJLZIJ(i, list)) != null) {
                                    if (C351220Dpo.LJLLLL(nLETrackSlot2.getMainSegment()) == 0.0f) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    multiEditVideoSegmentRecordData.isMute = z;
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                    }
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
        }
        IMusicEditService iMusicEditServiceH82 = h8();
        if (iMusicEditServiceH82 != null && iMusicEditServiceH82.LJIIL(S5()) && (interfaceC1456910o13H5 = H5()) != null && interfaceC1456910o13H5.sj1() && (interfaceC1456910o13H52 = H5()) != null) {
            interfaceC1456910o13H52.n80();
            InterfaceC1452170ntP value2 = E5().g().getValue();
            if (value2 != null) {
                nLEModelLIZ = C352130DrH.LIZ(value2);
            }
            interfaceC1456910o13H52.Dt1(nLEModelLIZ);
        }
        super.N6(str);
    }

    public C1454630nxN(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3, c1drg);
        this.LLLIIIL = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(274));
    }

    @Override // X.AbstractC1459270o4r, X.InterfaceC1418580n1E
    public void Hr1(boolean z, boolean z2, boolean z3) {
        AudioRecorderParam veAudioRecorderParam;
        super.Hr1(z, z2, z3);
        if (C537970L7z.LIZLLL(S5().creativeModel.editorProSchemeModel)) {
            AlbumModel albumModel = S5().creativeModel.albumModel;
            if (albumModel.videoCount == 0 && albumModel.photoCount > 0 && (veAudioRecorderParam = S5().getVeAudioRecorderParam()) != null) {
                veAudioRecorderParam.setHasOriginalSound(false);
            }
        }
    }
}
