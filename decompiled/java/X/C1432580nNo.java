package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.ss.android.ugc.aweme.sticker.model.BackgroundVideo;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0nNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432580nNo extends AbstractC1432780nO8 {
    public final C1432620nNs LIZLLL;
    public final VideoPublishEditModel LJ;

    @Override // X.InterfaceC1432810nOB
    public final String LIZ() {
        return "extract_bgv";
    }

    @Override // X.AbstractC1432780nO8
    public final boolean LIZLLL() {
        return false;
    }

    @Override // X.AbstractC1432780nO8
    public final List<C1429800nJK> LIZIZ() {
        String videoPath;
        String strSubstring;
        VideoPublishEditModel videoPublishEditModel = this.LJ;
        ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(videoPublishEditModel.getVideoSegmentsDesc());
        if (C580130Mp9.LIZ(arrayListLJIIIIZZ)) {
            return null;
        }
        ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList();
        for (TimeSpeedModelExtension timeSpeedModelExtension : arrayListLJIIIIZZ) {
            if (timeSpeedModelExtension.getBackgroundVideo() != null) {
                arrayList.add(timeSpeedModelExtension);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (TimeSpeedModelExtension timeSpeedModelExtension2 : arrayList) {
            BackgroundVideo backgroundVideo = timeSpeedModelExtension2.getBackgroundVideo();
            if (backgroundVideo != null && (videoPath = backgroundVideo.getVideoPath()) != null) {
                String str = "";
                if (!C2286708xd.LIZJ(videoPath)) {
                    String strLJJIJIIJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJI(videoPublishEditModel, "");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLJJIJIIJI);
                    sbLIZ.append((String) C13LP.LJJLIIIJJI(a0.LJJLIIIJILLIZJL(videoPath, new String[]{File.separator}, 0, 6)));
                    videoPath = C2188811AlT.LIZIZ(sbLIZ);
                }
                String strLJIIJ = C2471909mP.LJIIJ(C0CHQ.LIZ, videoPath);
                if (strLJIIJ != null && (strSubstring = strLJIIJ.substring(a0.LJJJJI(strLJIIJ, File.separator, 0, 6) + 1)) != null) {
                    str = strSubstring;
                }
                String strLJJIJIIJI2 = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJI(videoPublishEditModel, str);
                if (C2354709Kn.LIZIZ(strLJJIJIIJI2)) {
                    strLJIIJ = strLJJIJIIJI2;
                }
                if (C2286708xd.LIZJ(strLJIIJ)) {
                    Long l = (Long) linkedHashMap.get(String.valueOf(strLJIIJ));
                    if (timeSpeedModelExtension2.getSpeed() > 0.0d) {
                        linkedHashMap.put(String.valueOf(strLJIIJ), Long.valueOf((l != null ? l.longValue() : 0L) + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed()))));
                    }
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayListLJIIIIZZ.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str2 = (String) entry.getKey();
            long jLongValue = ((Number) entry.getValue()).longValue();
            C1429800nJK c1429800nJK = new C1429800nJK();
            c1429800nJK.LIZ = str2;
            c1429800nJK.LIZIZ = jLongValue;
            arrayList2.add(c1429800nJK);
        }
        return arrayList2;
    }

    public final ExtractFramesModel LJI() {
        ExtractFramesModel extractFramesModel;
        Function0<ExtractFramesModel> function0 = this.LIZLLL.LIZIZ;
        if ((function0 == null || (extractFramesModel = function0.invoke()) == null) && (extractFramesModel = this.LJ.getExtractFramesModel()) == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        int i = C1432590nNp.LIZ[this.LIZLLL.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                throw new C1954807lC();
            }
            extractFramesModel = this.LJ.getExtractFramesModel();
            if (extractFramesModel == null) {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        return extractFramesModel;
    }

    @Override // X.AbstractC1432780nO8
    public final void LJFF(InterfaceC1432820nOC interfaceC1432820nOC) {
        super.LJFF(interfaceC1432820nOC);
        if (!AbstractC1432780nO8.LIZJ()) {
            return;
        }
        C15O7.LIZJ(new Callable() { // from class: X.0nO5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String videoPath;
                C1C7U.LIZ("BackgroundVideoExtractor@31a2.start$1");
                ArrayList<TimeSpeedModelExtension> arrayListLJIIIIZZ = CameraComponentModel.LJIIIIZZ(this.LL.LJ.getVideoSegmentsDesc());
                C1432580nNo c1432580nNo = this.LL;
                String strLIZIZ = c1432580nNo.LIZLLL.LIZ == EnumC1432600nNq.WATERMARK_MODERATION ? C2298208zU.LIZIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), new CreativeInfo(null, 0, null, 7, null), EnumC20228014Cw.WATERMARK_MODERATION, "bg_video", 8) : c1432580nNo.LIZIZ.LIZIZ;
                String str = File.separator;
                if (!u.LJIIZILJ(strLIZIZ, str, false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZIZ);
                    sbLIZ.append(str);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                C570490MZb.LJFF(new C0VSJ(strLIZIZ));
                C1432580nNo c1432580nNo2 = this.LL;
                ArrayList<TimeSpeedModelExtension> arrayList = new ArrayList();
                for (TimeSpeedModelExtension timeSpeedModelExtension : arrayListLJIIIIZZ) {
                    if (timeSpeedModelExtension.getBackgroundVideo() != null) {
                        arrayList.add(timeSpeedModelExtension);
                    }
                }
                c1432580nNo2.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (TimeSpeedModelExtension timeSpeedModelExtension2 : arrayList) {
                    BackgroundVideo backgroundVideo = timeSpeedModelExtension2.getBackgroundVideo();
                    if (backgroundVideo != null && (videoPath = backgroundVideo.getVideoPath()) != null) {
                        String strLJJIJIIJI = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJI(c1432580nNo2.LJ, videoPath.substring(a0.LJJJJI(videoPath, File.separator, 0, 6) + 1));
                        if (C2286708xd.LIZJ(strLJJIJIIJI)) {
                            videoPath = strLJJIJIIJI;
                        }
                        if (C2286708xd.LIZJ(videoPath)) {
                            Long l = (Long) linkedHashMap.get(String.valueOf(videoPath));
                            if (timeSpeedModelExtension2.getSpeed() > 0.0d) {
                                linkedHashMap.put(String.valueOf(videoPath), Long.valueOf((l != null ? l.longValue() : 0L) + ((long) TimeSpeedModelExtension.calculateRealTime(timeSpeedModelExtension2.getDuration(), timeSpeedModelExtension2.getSpeed()))));
                            }
                        }
                    }
                }
                int i = 0;
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    long jLongValue = ((Number) entry.getValue()).longValue();
                    this.LL.getClass();
                    int i2 = (((int) jLongValue) / 500) + 1;
                    int[] iArr = new int[i2];
                    for (int i3 = 0; i3 < i2; i3++) {
                        iArr[i3] = 500 * i3;
                    }
                    int i4 = C2224308nZ.LIZ[0];
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(i);
                    sbLIZ2.append("_extract_frame");
                    VEUtils.saveVideoFrames(str2, iArr, i4, -1, false, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), 1);
                    i++;
                }
                String extractFramesDir = this.LL.LJI().getExtractFramesDir();
                String str3 = File.separator;
                if (!u.LJIIZILJ(extractFramesDir, str3, false)) {
                    extractFramesDir = extractFramesDir + str3;
                }
                File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
                if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                    C089E c089e = new C089E(fileArrListFiles);
                    while (c089e.hasNext()) {
                        File file = (File) c089e.next();
                        String str4 = extractFramesDir + file.getName();
                        C2354709Kn.LIZLLL(file.getAbsolutePath(), str4);
                        this.LL.LJI().addFrameAtLastSegment(new FrameItem(str4, 1, -1, false, null, null));
                    }
                }
                C2354709Kn.LJIJJ(strLIZIZ);
                C2354709Kn.LJIJJLI(strLIZIZ);
                C1C7U.LIZIZ("BackgroundVideoExtractor@31a2.start$1");
                return null;
            }
        }).LIZLLL(new C1466860oH6(this, (C1432870nOH) interfaceC1432820nOC, 6));
    }

    public C1432580nNo(C1432620nNs c1432620nNs, VideoPublishEditModel videoPublishEditModel) {
        super(videoPublishEditModel.getCreativeInfo());
        this.LIZLLL = c1432620nNs;
        this.LJ = videoPublishEditModel;
    }
}
