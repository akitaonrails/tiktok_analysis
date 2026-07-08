package X;

import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Lbg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C546300Lbg {
    public static final List<String> LIZ(CreativeModel creativeModel) {
        boolean z;
        List<String> listLLIIII;
        MultiEditVideoRecordData multiEditVideoRecordData;
        List<MultiEditVideoSegmentRecordData> list;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        List<MultiEditVideoSegmentRecordData> list2;
        List<SingleImageData> imageList;
        if (creativeModel.creationTypeModel.creationMode == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
            if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(imageList, 10));
                Iterator<SingleImageData> it2 = imageList.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().getSrcImageInfo().getPath());
                }
                return arrayList;
            }
        } else {
            MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = creativeModel.editModel.multiEditVideoStatusRecordData;
            if (multiEditVideoStatusRecordData != null && (multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData) != null && (list = multiEditVideoRecordData.segmentDataList) != null && !list.isEmpty()) {
                MultiEditVideoStatusRecordData multiEditVideoStatusRecordData2 = creativeModel.editModel.multiEditVideoStatusRecordData;
                if (multiEditVideoStatusRecordData2 != null && (multiEditVideoRecordData2 = multiEditVideoStatusRecordData2.curMultiEditVideoRecordData) != null && (list2 = multiEditVideoRecordData2.segmentDataList) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<MultiEditVideoSegmentRecordData> it3 = list2.iterator();
                    while (it3.hasNext()) {
                        String str = it3.next().videoPath;
                        if (str != null) {
                            arrayList2.add(str);
                        }
                    }
                    return arrayList2;
                }
            } else {
                CanvasVideoData canvasVideoData = creativeModel.canvasVideoData;
                if (canvasVideoData != null) {
                    List<String> list3 = canvasVideoData.sourceInfo;
                    if (list3 != null && (listLLIIII = C13LP.LLIIII(list3)) != null) {
                        return listLLIIII;
                    }
                } else {
                    ArrayList<ImportVideoInfo> arrayList3 = creativeModel.albumModel.importInfoList;
                    if (arrayList3 != null) {
                        ArrayList arrayList4 = new ArrayList();
                        Iterator<ImportVideoInfo> it4 = arrayList3.iterator();
                        while (it4.hasNext()) {
                            String originImportPath = it4.next().getOriginImportPath();
                            if (originImportPath != null) {
                                arrayList4.add(originImportPath);
                            }
                        }
                        return arrayList4;
                    }
                }
            }
        }
        return C13BV.INSTANCE;
    }

    public static List LIZJ(CreativeModel creativeModel) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(false);
        if (listLJFF != null) {
            ArrayList arrayList = new ArrayList();
            for (C546230LbZ c546230LbZ : listLJFF) {
                C546040LbG c546040LbGLIZIZ = c546230LbZ.LIZIZ();
                if (c546040LbGLIZIZ != null && (function1 = c546040LbGLIZIZ.LIZ) != null && function1.invoke(creativeModel).booleanValue()) {
                    arrayList.add(c546230LbZ);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }

    public static final List<C546230LbZ> LIZIZ(CreativeModel creativeModel, boolean z) {
        Function1<CreativeModel, Boolean> function1;
        C547860LeC.LIZ.getClass();
        List<C546230LbZ> listLJFF = C547860LeC.LIZIZ().LJFF(z);
        if (listLJFF != null) {
            ArrayList arrayList = new ArrayList();
            for (C546230LbZ c546230LbZ : listLJFF) {
                C546040LbG c546040LbGLIZIZ = c546230LbZ.LIZIZ();
                if (c546040LbGLIZIZ != null && (function1 = c546040LbGLIZIZ.LIZIZ) != null && function1.invoke(creativeModel).booleanValue()) {
                    arrayList.add(c546230LbZ);
                }
            }
            return arrayList;
        }
        return C13BV.INSTANCE;
    }
}
