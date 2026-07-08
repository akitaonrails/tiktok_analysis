package Y;

import X.AbstractC1407390mjB;
import X.AbstractC1407430mjF;
import X.C089E;
import X.C0CHQ;
import X.C0FIG;
import X.C0VSJ;
import X.C13LP;
import X.C1407400mjC;
import X.C1429990nJd;
import X.C1440500naa;
import X.C1442120ndC;
import X.C15438062q;
import X.C1656090tCJ;
import X.C1697810uHb;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2224308nZ;
import X.C2248208rQ;
import X.C2286708xd;
import X.C2298208zU;
import X.C2475009mu;
import X.C786410Ut5;
import X.EnumC20228214Cy;
import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.vesdk.LoudnessDetectResult;
import com.ss.android.vesdk.VEEditor;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: loaded from: classes23.dex */
public class ACallableS181S0300000_22 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS181S0300000_22 aCallableS181S0300000_22) {
        String strLIZIZ;
        String strLIZIZ2;
        C1C7U.LIZ("DefaultFrameExtractor@8ea6.compressPhoto$1");
        ArrayList arrayList = new ArrayList();
        String str = ((C1656090tCJ) aCallableS181S0300000_22.l0).LJIILJJIL.LIZIZ;
        if (!C2286708xd.LIZJ(str) || !a0.LJJIIZI(str, ((C1656090tCJ) aCallableS181S0300000_22.l0).LIZIZ, false)) {
            String str2 = ((C1656090tCJ) aCallableS181S0300000_22.l0).LJIJJ;
            if (str2 != null && str2.length() != 0) {
                C1656090tCJ c1656090tCJ = (C1656090tCJ) aCallableS181S0300000_22.l0;
                C2248208rQ c2248208rQ = c1656090tCJ.LJIILJJIL;
                String str3 = c1656090tCJ.LJIJJ;
                String str4 = c1656090tCJ.LIZIZ;
                String str5 = c1656090tCJ.LJIILIIL;
                C2248208rQ c2248208rQ2 = c1656090tCJ.LJIIIZ;
                if (c2248208rQ2 == null || (strLIZIZ = c2248208rQ2.LIZLLL()) == null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1656090tCJ.LIZ.getFilesDir());
                    sbLIZ.append("/shortvideo/draft/");
                    sbLIZ.append(str3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(strLIZIZ);
                String str6 = File.separator;
                sb.append(str6);
                sb.append(str4);
                sb.append(str6);
                sb.append(str5);
                String string = sb.toString();
                if (!C2286708xd.LIZJ(string)) {
                    C2286708xd.LJIIIIZZ(string, false);
                }
                c2248208rQ.LIZIZ = string;
            } else {
                C1656090tCJ c1656090tCJ2 = (C1656090tCJ) aCallableS181S0300000_22.l0;
                c1656090tCJ2.LJIILJJIL.LJ(c1656090tCJ2.LIZIZ, c1656090tCJ2.LJIILIIL);
            }
            C1656090tCJ c1656090tCJ3 = (C1656090tCJ) aCallableS181S0300000_22.l0;
            c1656090tCJ3.LJIIJJI.setExtractFramesDir(c1656090tCJ3.LJIILJJIL.LIZIZ);
        }
        List<String> list = (List) aCallableS181S0300000_22.l1;
        C1656090tCJ c1656090tCJ4 = (C1656090tCJ) aCallableS181S0300000_22.l0;
        for (String str7 : list) {
            if (C2286708xd.LIZJ(str7)) {
                C2248208rQ c2248208rQ3 = c1656090tCJ4.LJIILJJIL;
                c1656090tCJ4.LJII.LIZJ();
                c2248208rQ3.getClass();
                if (TextUtils.isEmpty("upload_sticker_frame")) {
                    strLIZIZ2 = c2248208rQ3.LIZJ();
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(c2248208rQ3.LIZIZ);
                    sbLIZ2.append(File.separator);
                    sbLIZ2.append("extract-frame-");
                    sbLIZ2.append("upload_sticker_frame");
                    sbLIZ2.append("_");
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append(".jpg");
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                }
                C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, C2475009mu.LIZ(str7, C1656090tCJ.LJJ), new C0VSJ(strLIZIZ2));
                arrayList.add(strLIZIZ2);
            }
        }
        ((Function1) aCallableS181S0300000_22.l2).invoke(arrayList);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultFrameExtractor@8ea6.compressPhoto$1");
        return unit;
    }

    public static final Object call$1(ACallableS181S0300000_22 aCallableS181S0300000_22) {
        C1C7U.LIZ("LoudnessNormalizationOperatorBase@4d85.goTo$1");
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List list = (List) aCallableS181S0300000_22.l0;
        ArrayList<C1407400mjC> arrayList2 = new ArrayList();
        for (Object obj : list) {
            String str = ((C1407400mjC) obj).LIZ;
            if (str != null && str.length() > 0) {
                arrayList2.add(obj);
            }
        }
        VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS181S0300000_22.l1;
        AbstractC1407430mjF abstractC1407430mjF = (AbstractC1407430mjF) aCallableS181S0300000_22.l2;
        ArrayList arrayList3 = new ArrayList();
        for (C1407400mjC c1407400mjC : arrayList2) {
            AbstractC1407390mjB abstractC1407390mjB = c1407400mjC.LJII;
            if (abstractC1407390mjB != null) {
                LoudnessDetectResult loudnessDetectResultLIZIZ = abstractC1407390mjB.LIZIZ(c1407400mjC);
                if (loudnessDetectResultLIZIZ != null && loudnessDetectResultLIZIZ.avgLoudness != 0.0d && loudnessDetectResultLIZIZ.peakLoudness != 0.0d) {
                    String str2 = c1407400mjC.LIZ;
                    if (str2 != null) {
                        linkedHashMap.put(str2, loudnessDetectResultLIZIZ);
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Dont Need to detect loudness for ");
                    sbLIZ.append(c1407400mjC.LJI);
                    C201955140j.LIZIZ("LoudnessNormalization", C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Need to detect loudness for ");
                    sbLIZ2.append(c1407400mjC.LJI);
                    C201955140j.LIZIZ("LoudnessNormalization", C2188811AlT.LIZIZ(sbLIZ2));
                    arrayList3.add(c1407400mjC);
                }
            }
        }
        if (!arrayList3.isEmpty()) {
            videoPublishEditModel.creativeModel.audioAlgorithmModel.isLoudnessCheckOn = true;
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String str3 = ((C1407400mjC) it2.next()).LIZ;
                if (str3 != null) {
                    arrayList4.add(str3);
                } else {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            String[] strArr = (String[]) arrayList4.toArray(new String[0]);
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Integer.valueOf(((C1407400mjC) it3.next()).LIZIZ));
            }
            int[] iArrLLII = C13LP.LLII(arrayList5);
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                arrayList6.add(Integer.valueOf(((C1407400mjC) it4.next()).LIZJ));
            }
            int[] iArrLLII2 = C13LP.LLII(arrayList6);
            abstractC1407430mjF.getClass();
            LoudnessDetectResult[] loudnessDetectResultArrLJIILJJIL = VEEditor.LJIILJJIL(strArr, iArrLLII, iArrLLII2);
            int i = 0;
            for (Object obj2 : arrayList3) {
                int i2 = i + 1;
                if (i >= 0) {
                    C1407400mjC c1407400mjC2 = (C1407400mjC) obj2;
                    String str4 = c1407400mjC2.LIZ;
                    if (str4 != null) {
                        linkedHashMap.put(str4, loudnessDetectResultArrLJIILJJIL[i]);
                        AbstractC1407390mjB abstractC1407390mjB2 = c1407400mjC2.LJII;
                        if (abstractC1407390mjB2 != null) {
                            LoudnessDetectResult loudnessDetectResult = loudnessDetectResultArrLJIILJJIL[i];
                            Map<String, com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult> map = abstractC1407390mjB2.LIZ.creativeModel.loudnessBalanceModel.loudnessMap;
                            com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult loudnessDetectResult2 = new com.ss.android.ugc.aweme.creative.model.audio.LoudnessDetectResult(-1, 0.0d, 0.0d, "");
                            loudnessDetectResult2.result = loudnessDetectResult.result;
                            loudnessDetectResult2.avgLoudness = loudnessDetectResult.avgLoudness;
                            loudnessDetectResult2.peakLoudness = loudnessDetectResult.peakLoudness;
                            loudnessDetectResult2.audioPath = str4;
                            map.put(str4, loudnessDetectResult2);
                        }
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("detect result: ");
                        sbLIZ3.append(loudnessDetectResultArrLJIILJJIL[i].avgLoudness);
                        sbLIZ3.append(' ');
                        sbLIZ3.append(loudnessDetectResultArrLJIILJJIL[i].peakLoudness);
                        C201955140j.LIZIZ("LoudnessNormalization", C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        Iterator it5 = ((List) aCallableS181S0300000_22.l0).iterator();
        while (it5.hasNext()) {
            Object obj3 = linkedHashMap.get(((C1407400mjC) it5.next()).LIZ);
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        Object[] array = arrayList.toArray(new LoudnessDetectResult[0]);
        C1C7U.LIZIZ("LoudnessNormalizationOperatorBase@4d85.goTo$1");
        return array;
    }

    public static final Object call$2(ACallableS181S0300000_22 aCallableS181S0300000_22) {
        int[] iArr;
        C1C7U.LIZ("AutoCutFrameExtractor@6d96.start$1");
        String strLIZIZ = ((C1429990nJd) aCallableS181S0300000_22.l0).LIZIZ.LIZIZ;
        String str = File.separator;
        if (!u.LJIIZILJ(strLIZIZ, str, false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strLIZIZ);
            sbLIZ.append(str);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Iterator it2 = ((List) aCallableS181S0300000_22.l1).iterator();
        int i = 0;
        while (true) {
            boolean zHasNext = it2.hasNext();
            iArr = C2224308nZ.LIZ;
            if (!zHasNext) {
                break;
            }
            AutoCutMediaModel autoCutMediaModel = (AutoCutMediaModel) it2.next();
            String str2 = autoCutMediaModel.filePath;
            ((C1429990nJd) aCallableS181S0300000_22.l0).getClass();
            long j = autoCutMediaModel.cutStartTime;
            int i2 = ((int) (autoCutMediaModel.cutDuration / ((long) 500))) + 1;
            int[] iArr2 = new int[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr2[i3] = ((int) j) + (500 * i3);
            }
            int i4 = iArr[0];
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(i);
            sbLIZ2.append("extract_frame");
            VEUtils.saveVideoFrames(str2, iArr2, i4, -1, false, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), 1);
            i++;
        }
        File[] fileArrListFiles = new C0VSJ(strLIZIZ).listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length > 0) {
            C089E c089e = new C089E(fileArrListFiles);
            while (c089e.hasNext()) {
                ((C1429990nJd) aCallableS181S0300000_22.l0).LIZ.addFrameAtLastSegment(new FrameItem(((File) c089e.next()).getAbsolutePath(), 1, -1, false, null, null));
            }
        }
        Iterator it3 = ((List) aCallableS181S0300000_22.l2).iterator();
        while (it3.hasNext()) {
            Bitmap bitmapLIZ = C2475009mu.LIZ(((AutoCutMediaModel) it3.next()).filePath, iArr);
            if (bitmapLIZ != null) {
                String strLIZJ = ((C1429990nJd) aCallableS181S0300000_22.l0).LIZIZ.LIZJ();
                C2475009mu.LJFF(70, Bitmap.CompressFormat.JPEG, bitmapLIZ, new C0VSJ(strLIZJ));
                ((C1429990nJd) aCallableS181S0300000_22.l0).LIZ.addFrameAtLastSegment(new FrameItem(strLIZJ, 1, -1, false, null, null));
            }
        }
        C1C7U.LIZIZ("AutoCutFrameExtractor@6d96.start$1");
        return null;
    }

    public static final Object call$3(ACallableS181S0300000_22 aCallableS181S0300000_22) {
        C1C7U.LIZ("ImageEditRootScene@a14e.getCompileInteractEmbedStickersTask$1");
        Activity activity = ((ImageEditRootScene) aCallableS181S0300000_22.l0).mActivity;
        if (activity != null) {
            VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) aCallableS181S0300000_22.l1;
            List<? extends StickerModel> list = (List) aCallableS181S0300000_22.l2;
            String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), videoPublishEditModel.getCreativeInfo(), EnumC20228214Cy.IMAGE_STICKER, null, false, 12);
            C786410Ut5.M3(C0CHQ.LIZ);
            C0FIG c0fig = new C0FIG();
            new Pair(0, 0);
            new C1442120ndC(activity, strLIZLLL, new C1440500naa(null, null), c0fig, "").LIZ(list);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageEditRootScene@a14e.getCompileInteractEmbedStickersTask$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACallableS181S0300000_22(Object obj, C1656090tCJ c1656090tCJ, List<String> list, Function1<? super List<String>, Unit> function1) {
        this.$t = function1;
        this.l0 = obj;
        this.l1 = c1656090tCJ;
        this.l2 = list;
    }
}
