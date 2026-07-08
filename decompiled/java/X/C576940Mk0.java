package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.MicDataModel;
import com.ss.android.ugc.aweme.creative.model.NowsExtra;
import com.ss.android.ugc.aweme.creative.model.NowsShootModel;
import com.ss.android.ugc.aweme.creative.model.PhotoEditData;
import com.ss.android.ugc.aweme.creative.model.record.CameraLayoutModel;
import com.ss.android.ugc.aweme.creative.model.record.LayoutApplyFrom;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.creative.model.record.LayoutPlayerType;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.d4;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mn3.e0;

/* JADX INFO: renamed from: X.0Mk0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576940Mk0 {
    public final C1DRG LIZ;
    public final C19EG LIZIZ;
    public final e0 LIZJ;
    public final InterfaceC1648570t0B LIZLLL;
    public final ShortVideoContext LJ;
    public final C580090Mp5 LJFF;

    public static AIGCInfo LIZ(List list) {
        Iterator it2 = list.iterator();
        AIGCInfo aIGCInfo = null;
        while (it2.hasNext()) {
            LayoutItemMedia layoutItemMedia = (LayoutItemMedia) it2.next();
            C552700Lm0 c552700Lm0 = C552700Lm0.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("combineAIGCInfo ");
            sbLIZ.append(layoutItemMedia.aigcInfo);
            C201955140j.LIZLLL(c552700Lm0, "CameraLayoutGoNextAction", C2188811AlT.LIZIZ(sbLIZ));
            AIGCInfo aIGCInfo2 = layoutItemMedia.aigcInfo;
            if (aIGCInfo2 != null) {
                if (aIGCInfo == null) {
                    aIGCInfo = new AIGCInfo(0, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, false, 131071, null);
                }
                C140C.LIZIZ(aIGCInfo, aIGCInfo2);
            }
        }
        return aIGCInfo;
    }

    public C576940Mk0(C1DRG c1drg, C19EG c19eg, e0 e0Var, InterfaceC1648570t0B interfaceC1648570t0B, ShortVideoContext shortVideoContext) {
        this.LIZ = c1drg;
        this.LIZIZ = c19eg;
        this.LIZJ = e0Var;
        this.LIZLLL = interfaceC1648570t0B;
        this.LJ = shortVideoContext;
        this.LJFF = (C580090Mp5) c1drg.LJII(C580090Mp5.class, null);
    }

    public final void LIZIZ(String str, boolean z, boolean z2, AbstractC577050MkB abstractC577050MkB, LayoutApplyFrom layoutApplyFrom, List<LayoutItemMedia> list) {
        LayoutMediaType layoutMediaType;
        LayoutPlayerType layoutPlayerType;
        TimeSpeedModelExtension timeSpeedModelExtension;
        int i;
        C385670FAf<InterfaceC1647520syU> c385670FAfHl0;
        InterfaceC1647520syU interfaceC1647520syULIZJ;
        ShortVideoContext shortVideoContext = this.LJ;
        if (shortVideoContext.shootMode == 16) {
            CreativeModel creativeModel = shortVideoContext.creativeModel;
            creativeModel.eventData.extraEventParams = shortVideoContext.extraEventParams;
            NowsShootModel nowsShootModel = new NowsShootModel(0, null, null, null, null, new NowsExtra("back_first", "", null, "", "", "now", "now_shoot_page", null, 0, null, null, false, false, 0, null), new PhotoEditData(1, true, true), null, null, null, "");
            NowsExtra nowsExtra = nowsShootModel.nowsExtra;
            ShortVideoContext shortVideoContext2 = this.LJ;
            nowsExtra.enterFrom = shortVideoContext2.enterFrom;
            nowsExtra.shootWay = shortVideoContext2.shootWay;
            nowsExtra.nowTabEnterMethod = shortVideoContext2.enterMethod;
            nowsExtra.allowChangeRatio = true;
            nowsExtra.is9To16Ratio = true;
            nowsShootModel.editData.setAllowGestureOpti(true);
            PhotoEditData photoEditData = nowsShootModel.editData;
            int i2 = 2;
            if (nowsShootModel.nowsExtra.is9To16Ratio) {
                i = 2;
            } else {
                i = 1;
            }
            photoEditData.setRatio(i);
            InterfaceC1647420syK interfaceC1647420syK = (InterfaceC1647420syK) this.LIZ.LJIIL(null, InterfaceC1647420syK.class);
            if (interfaceC1647420syK != null && (c385670FAfHl0 = interfaceC1647420syK.Hl0()) != null && (interfaceC1647520syULIZJ = c385670FAfHl0.LIZJ()) != null) {
                interfaceC1647520syULIZJ.Rz(true);
            }
            creativeModel.nowsShootModel = nowsShootModel;
            NowsShootModel nowsShootModel2 = this.LJ.creativeModel.nowsShootModel;
            if (nowsShootModel2 != null) {
                if (!z) {
                    i2 = 0;
                }
                nowsShootModel2.type = i2;
            }
        }
        boolean zLJJ = d4.LJJ(this.LJ);
        boolean zLJJI = d4.LJJI(this.LJ);
        ShortVideoContext shortVideoContext3 = this.LJ;
        CreativeModel creativeModel2 = shortVideoContext3.creativeModel;
        MicDataModel micDataModel = creativeModel2.micDataModel;
        if (micDataModel.recordOriginalSoundWithBGM && (zLJJ || zLJJI)) {
            micDataModel.editDefaultVolume = 1.0f;
        }
        shortVideoContext3.musicBeforeRetake = MusicBeanUtilKt.extractAVMusic(creativeModel2.musicBuzModel);
        this.LJ.cameraComponentModel.extractFramesModel = ((C1656090tCJ) this.LIZJ.yP()).LJIIJJI;
        float fFloatValue = new BigDecimal(this.LJ.cameraComponentModel.latestUsedZoomValue).setScale(1, 4).floatValue();
        ShortVideoContext shortVideoContext4 = this.LJ;
        shortVideoContext4.currentZoomValue = fFloatValue;
        CreativeModel creativeModel3 = shortVideoContext4.creativeModel;
        String strLIZLLL = abstractC577050MkB.LIZLLL();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<LayoutItemMedia> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().mediaType);
        }
        ArrayList arrayListLIZ = C09HN.LIZ(arrayList);
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<LayoutItemMedia> it3 = list.iterator();
        while (it3.hasNext()) {
            arrayList2.add(it3.next().mediaSource);
        }
        ArrayList arrayListLIZ2 = C09HN.LIZ(arrayList2);
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<LayoutItemMedia> it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList3.add(it4.next().filePath);
        }
        ArrayList arrayListLIZ3 = C09HN.LIZ(arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (LayoutItemMedia layoutItemMedia : list) {
            if (layoutItemMedia.mediaSource == LayoutMediaSource.CAPTURE && (timeSpeedModelExtension = layoutItemMedia.shortVideoSegment) != null) {
                arrayList4.add(timeSpeedModelExtension);
            }
        }
        ArrayList arrayListLIZ4 = C09HN.LIZ(arrayList4);
        if (z2) {
            layoutMediaType = LayoutMediaType.LIVE_PHOTO;
        } else if (z) {
            layoutMediaType = LayoutMediaType.VIDEO;
        } else {
            layoutMediaType = LayoutMediaType.PHOTO;
        }
        if (C299870BpB.LIZ() == 0) {
            layoutPlayerType = LayoutPlayerType.NLE;
        } else {
            layoutPlayerType = LayoutPlayerType.SYS;
        }
        creativeModel3.cameraLayoutModel = new CameraLayoutModel(true, strLIZLLL, layoutApplyFrom, arrayListLIZ, arrayListLIZ2, arrayListLIZ3, arrayListLIZ4, layoutMediaType, str, layoutPlayerType, null);
    }
}
