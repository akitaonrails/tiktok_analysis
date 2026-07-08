package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaSource;
import com.ss.android.ugc.aweme.creative.model.record.LayoutMediaType;
import com.ss.android.ugc.aweme.filter.FilterBean;
import com.ss.android.ugc.aweme.mediachoose.helper.AIGCInfo;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.model.RecordFilterModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.ss.android.ugc.gamora.recorder.layout.model.LayoutItemMedia;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.text.a0;
import ln3.a;
import lnn.q;
import mn3.e0;
import pyl.s;

/* JADX INFO: renamed from: X.0Mjy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C576920Mjy extends AbstractC2255721DQs<InterfaceC576780Mjk> implements InterfaceC576780Mjk, InterfaceC379610EuV {
    public static final C576930Mjz LLJJIJI;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LL;
    public int LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public final InterfaceC576780Mjk LLILLJJLI = this;
    public final ShortVideoContext LLILLL = (ShortVideoContext) getDiContainer().LJII(ShortVideoContext.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), q.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), e0.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1644770su3.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), a.class, null);
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new AwS552S0100000_8(this, 767));
    public final C01GW LLJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(315));
    public final CopyOnWriteArrayList<LayoutItemMedia> LLJILJILJ = new CopyOnWriteArrayList<>();
    public final ConcurrentHashSet<String> LLJILLL = new ConcurrentHashSet<>();
    public final ConcurrentHashSet<String> LLJJ = new ConcurrentHashSet<>();
    public final ConcurrentHashSet<String> LLJJI = new ConcurrentHashSet<>();
    public final ConcurrentHashSet<String> LLJJIII = new ConcurrentHashSet<>();

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0Mjz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C576920Mjy.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C576920Mjy.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C2217381BqS(C576920Mjy.class, "filterApiComponent", "getFilterApiComponent()Lcom/bytedance/creativex/recorder/filter/api/FilterApiComponent;", 0), new C2217381BqS(C576920Mjy.class, "beautyApiComponent", "getBeautyApiComponent()Lcom/bytedance/creativex/recorder/beauty/api/BeautyApiComponent;", 0)};
        LLJJIJI = new Object() { // from class: X.0Mjz
        };
        LLJJIJIL = 8;
    }

    private final void G2() {
        C576730Mjf.LJIIIZ("CameraLayoutWorkspaceComponent", "---------Layout Workspace Updating---------");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("layoutSegments count: ");
        sbLIZ.append(gQ().size());
        C576730Mjf.LJIIIZ("CameraLayoutWorkspaceComponent", C2188811AlT.LIZIZ(sbLIZ));
        for (LayoutItemMedia layoutItemMedia : this.LLJILJILJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("layoutItemMedia: ");
            sbLIZ2.append(layoutItemMedia);
            C576730Mjf.LJIIIZ("CameraLayoutWorkspaceComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
        C576730Mjf.LJIIIZ("CameraLayoutWorkspaceComponent", "---------Layout Workspace Updated---------");
    }

    private final e0 getCameraApiComponent() {
        return (e0) this.LLILZIL.getValue(this, LLJJIJIIJIL[1]);
    }

    private final InterfaceC1644770su3 getFilterApiComponent() {
        return (InterfaceC1644770su3) this.LLILZLL.getValue(this, LLJJIJIIJIL[2]);
    }

    private final q getStickerApiComponent() {
        return (q) this.LLILZ.getValue(this, LLJJIJIIJIL[0]);
    }

    private final a o2() {
        return (a) this.LLIZ.getValue(this, LLJJIJIIJIL[3]);
    }

    private final C0LFI w2() {
        return (C0LFI) this.LLIZLLLIL.getValue();
    }

    @Override // X.InterfaceC576780Mjk
    public Pair<String, String> Vv1() {
        Pair<String, String> pairLJ = C576730Mjf.LJ(this.LLILLL);
        String first = pairLJ.getFirst();
        String second = pairLJ.getSecond();
        this.LLJJI.add(first);
        this.LLJJI.add(second);
        return new Pair<>(first, second);
    }

    @Override // X.InterfaceC576780Mjk
    public C1441190nbh gQ() {
        return (C1441190nbh) this.LLJ.getValue();
    }

    @Override // X.InterfaceC576780Mjk
    public String w12() {
        String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), this.LLILLL.creativeInfo, EnumC20228214Cy.RECORD_MP4, null, false, 12);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZLLL);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append('-');
        sbLIZ2.append(this.LLJIJIL);
        sbLIZ2.append(".mp4");
        sbLIZ.append(C1449640npK.LIZ(C2188811AlT.LIZIZ(sbLIZ2)));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LLJJ.add(strLIZIZ);
        return strLIZIZ;
    }

    @Override // X.InterfaceC576780Mjk
    public List<LayoutItemMedia> KG2() {
        return this.LLJILJILJ;
    }

    public InterfaceC576780Mjk Z1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C576920Mjy(C1DRG c1drg) {
        this.LL = c1drg;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC576780Mjk
    public LayoutItemMedia OF1(Bitmap bitmap) throws Throwable {
        String string;
        RecordFilterModel recordFilterModel;
        C385670FAf<FilterBean> c385670FAfI70;
        FilterBean filterBeanLIZJ;
        Object objValueOf;
        LiveData<C1643870ssb> liveDataRT;
        C1643870ssb value;
        InterfaceC1452660nuC interfaceC1452660nuC;
        String strPF = PF(false);
        C2477909nN.LJI(bitmap, strPF, Bitmap.CompressFormat.JPEG, 0, 4);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJIJL(bundle, "currentSticker", getStickerApiComponent().jr());
        bundle.putInt("cameraId", getCameraApiComponent().LJLJJLL());
        C786410Ut5.LJJJI("cameraLensInfo", getCameraApiComponent().Th2(), bundle);
        Bundle bundle2 = new Bundle();
        a aVarO2 = o2();
        if (aVarO2 != null) {
            C786410Ut5.LJJIJL(bundle2, "beauty_segment_info", new BeautifySegmentInfo(aVarO2.Ty0()));
        }
        gQ().begin(s.NORMAL, bundle, bundle2);
        gQ().end(C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(this.LLILLL.shootMode), new Bundle());
        TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJLIIIJJI(gQ());
        C1449000noI c1449000noI = (C1449000noI) getStickerApiComponent().C0().LJII().LJ().getValue();
        StickerInfo stickerInfo = timeSpeedModelExtension.getStickerInfo();
        if (c1449000noI == null || (string = Integer.valueOf(c1449000noI.LIZJ).toString()) == null) {
            string = "1";
        }
        stickerInfo.setImprPosition(string);
        InterfaceC1644770su3 filterApiComponent = getFilterApiComponent();
        if (filterApiComponent != null && (c385670FAfI70 = filterApiComponent.i70()) != null && (filterBeanLIZJ = c385670FAfI70.LIZJ()) != null) {
            String enName = filterBeanLIZJ.getEnName();
            InterfaceC1644770su3 filterApiComponent2 = getFilterApiComponent();
            if (filterApiComponent2 != null && (liveDataRT = filterApiComponent2.RT()) != null && (value = liveDataRT.getValue()) != null && (interfaceC1452660nuC = value.LIZJ) != null) {
                objValueOf = Float.valueOf(C1453230nv7.LJIIIIZZ(filterBeanLIZJ, interfaceC1452660nuC));
            } else {
                objValueOf = 0;
            }
            String id = filterBeanLIZJ.getId();
            id.toString();
            recordFilterModel = new RecordFilterModel(id, enName, objValueOf.toString(), filterBeanLIZJ.getCategoryKey());
        } else {
            recordFilterModel = null;
        }
        timeSpeedModelExtension.setRecordFilterModel(recordFilterModel);
        return W1(LayoutMediaType.PHOTO, LayoutMediaSource.CAPTURE, strPF, null);
    }

    @Override // X.InterfaceC576780Mjk
    public String PF(boolean z) {
        String strLIZ = w2().LIZ();
        if (z) {
            this.LLJJI.add(strLIZ);
            return strLIZ;
        }
        this.LLJILLL.add(strLIZ);
        return strLIZ;
    }

    @Override // X.InterfaceC576780Mjk
    public void ga(int i) {
        LayoutItemMedia layoutItemMedia = this.LLJILJILJ.get(i);
        int i2 = C536480L2g.LIZ[layoutItemMedia.mediaType.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.LLJILJIL--;
                } else {
                    throw new C1954807lC();
                }
            } else {
                this.LLJIJIL--;
            }
        } else {
            this.LLJI--;
        }
        gQ().remove(i);
        this.LLJILJILJ.remove(i);
        int size = this.LLJILJILJ.size();
        while (i < size) {
            LayoutItemMedia layoutItemMedia2 = this.LLJILJILJ.get(i);
            layoutItemMedia2.layoutIndex--;
            int i3 = C536480L2g.LIZ[layoutItemMedia.mediaType.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 3) {
                        layoutItemMedia2.livePhotoIndex--;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    layoutItemMedia2.videoIndex--;
                }
            } else {
                layoutItemMedia2.photoIndex--;
            }
            i++;
        }
        G2();
    }

    @Override // X.InterfaceC576780Mjk
    public LayoutItemMedia n70(String str) {
        return W1(LayoutMediaType.VIDEO, LayoutMediaSource.CAPTURE, str, null);
    }

    @Override // X.InterfaceC576780Mjk
    public LayoutItemMedia pn(int i) {
        gQ().add(gQ().get(i));
        W1(this.LLJILJILJ.get(i).mediaType, this.LLJILJILJ.get(i).mediaSource, this.LLJILJILJ.get(i).filePath, this.LLJILJILJ.get(i).aigcInfo);
        return (LayoutItemMedia) C13LP.LJJLIIIJJI(this.LLJILJILJ);
    }

    @Override // X.InterfaceC576780Mjk
    public LayoutItemMedia sn2(MediaModel mediaModel) {
        MediaModel mediaModelLIZIZ;
        long maxShootingDuration;
        LayoutMediaType layoutMediaType;
        if (mediaModel.LJIIJJI()) {
            C527420KmK c527420KmK = C527420KmK.LIZ;
            CreativeInfo creativeInfo = this.LLILLL.creativeInfo;
            c527420KmK.getClass();
            mediaModelLIZIZ = C527420KmK.LIZIZ(creativeInfo, mediaModel);
        } else {
            mediaModelLIZIZ = null;
        }
        String strLJFF = C576730Mjf.LJFF(mediaModel, this.LLILLL);
        if (C305160Bxi.LIZ() && mediaModel.LJIILJJIL() && !TextUtils.equals(mediaModel.originLocalUriPath, mediaModel.LJFF()) && a0.LJJIIZI(mediaModel.LJFF(), this.LLILLL.getCreationId(), false)) {
            this.LLJJIII.add(strLJFF);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("appendSegmentAndMediaFromMediaModel: absolutePath=");
        sbLIZ.append(strLJFF);
        C576730Mjf.LJIIIZ("CameraLayoutWorkspaceComponent", C2188811AlT.LIZIZ(sbLIZ));
        C1441190nbh c1441190nbhGQ = gQ();
        TimeSpeedModelExtension timeSpeedModelExtension = new TimeSpeedModelExtension();
        if (mediaModel.LJIIJJI()) {
            if (mediaModelLIZIZ != null) {
                maxShootingDuration = mediaModelLIZIZ.duration;
            } else {
                maxShootingDuration = mediaModel.duration;
            }
        } else if (mediaModel.LJIIJ()) {
            maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(this.LLILLL.shootMode);
        } else {
            maxShootingDuration = mediaModel.duration;
        }
        timeSpeedModelExtension.setDuration((int) maxShootingDuration);
        c1441190nbhGQ.add(timeSpeedModelExtension);
        if (mediaModel.LJIIJJI()) {
            layoutMediaType = LayoutMediaType.LIVE_PHOTO;
        } else if (mediaModel.LJIIJ()) {
            layoutMediaType = LayoutMediaType.PHOTO;
        } else {
            layoutMediaType = LayoutMediaType.VIDEO;
        }
        W1(layoutMediaType, LayoutMediaSource.UPLOAD, strLJFF, mediaModel.aigcInfo);
        return (LayoutItemMedia) C13LP.LJJLIIIJJI(this.LLJILJILJ);
    }

    private final void X1(boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.addAll(this.LLJILLL);
            arrayList.addAll(this.LLJJ);
            this.LLJILLL.clear();
            this.LLJJ.clear();
            if (C305160Bxi.LIZ()) {
                arrayList.addAll(this.LLJJIII);
                this.LLJJIII.clear();
            }
        }
        if (z2) {
            arrayList.addAll(this.LLJJI);
            this.LLJJI.clear();
        }
        if (!arrayList.isEmpty()) {
            C0CNO.LIZ(C15O7.LJI, new AwS552S0100000_8(arrayList, (List<String>) 766));
        }
    }

    @Override // X.InterfaceC576780Mjk
    public void c91(boolean z, boolean z2) {
        X1(z, z2);
        this.LLJI = 0;
        this.LLJIJIL = 0;
        this.LLJILJIL = 0;
        gQ().clear();
        this.LLJILJILJ.clear();
        G2();
    }

    @Override // X.InterfaceC576780Mjk
    public void yA0(boolean z, boolean z2) {
        X1(z, z2);
    }

    private final LayoutItemMedia W1(LayoutMediaType layoutMediaType, LayoutMediaSource layoutMediaSource, String str, AIGCInfo aIGCInfo) {
        if (gQ().size() >= this.LLJILJILJ.size() + 1) {
            TimeSpeedModelExtension timeSpeedModelExtension = (TimeSpeedModelExtension) C13LP.LJJLIIIJL(gQ());
            if (timeSpeedModelExtension == null) {
                return null;
            }
            LayoutItemMedia layoutItemMedia = new LayoutItemMedia(layoutMediaType, layoutMediaSource, str, timeSpeedModelExtension, this.LLJILJILJ.size(), aIGCInfo);
            int i = C536480L2g.LIZ[layoutMediaType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        int i2 = this.LLJILJIL + 1;
                        this.LLJILJIL = i2;
                        layoutItemMedia.livePhotoIndex = i2 - 1;
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    int i3 = this.LLJIJIL + 1;
                    this.LLJIJIL = i3;
                    layoutItemMedia.videoIndex = i3 - 1;
                }
            } else {
                int i4 = this.LLJI + 1;
                this.LLJI = i4;
                layoutItemMedia.photoIndex = i4 - 1;
            }
            this.LLJILJILJ.add(layoutItemMedia);
            G2();
            return layoutItemMedia;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("segments are not ready. layoutSegments: ");
        sbLIZ.append(gQ().size());
        sbLIZ.append(", layoutItemMedias: ");
        sbLIZ.append(this.LLJILJILJ.size());
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
