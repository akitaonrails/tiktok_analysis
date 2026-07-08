package X;

import android.os.Looper;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.AlgorithmData;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.C3FeatureData;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ClassifyData;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.FaceFeatureV2;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.FacedFeatureData;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ImageInfoList;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.NhFeatureData;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.PictureInfoOpt;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.ThemeFeature;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08z2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2295408z2 {
    public static final C2295408z2 LIZ = new C2295408z2();

    public static void LIZ(String str) {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" must not run on main thread");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SmartMovieExt ");
        sbLIZ2.append(strLIZIZ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public static ImageInfoList LIZIZ(MetaExt metaExt) {
        metaExt.setIncludes(Collections.singletonList("image"));
        return new ImageInfoList(metaExt, null, null, null, null, null, 62, null);
    }

    public static void LIZLLL(List list) {
        long j;
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            j = 10000;
        } else {
            j = 100000;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            MetaExt metaExt = (MetaExt) it2.next();
            metaExt.setDuration(Math.min(metaExt.duration, j));
        }
    }

    public static Object LIZJ(String str, String str2, List list, List list2, InterfaceC1364105Vn interfaceC1364105Vn) throws Throwable {
        Throwable th;
        boolean z;
        C0VSP c0vsp;
        ImageInfoList imageInfoListLIZIZ;
        LIZ("generateZip");
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("generateZip timestamp=");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c1398350mUb, "SmartMovieLogicExt", C2188811AlT.LIZIZ(sbLIZ));
        C23118094a.LJI(interfaceC1364105Vn.getContext());
        C0VSJ c0vsj = new C0VSJ(str2, "tos");
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
        if (!c0vsj2.exists()) {
            c0vsj2.mkdirs();
        }
        C0VSJ c0vsj3 = new C0VSJ(c0vsj2, "upload.zip");
        JSONArray jSONArray = new JSONArray();
        if (list != null) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PictureInfoOpt pictureInfoOpt = (PictureInfoOpt) obj;
                    C23118094a.LJI(interfaceC1364105Vn.getContext());
                    MetaExt metaExt = (MetaExt) ListProtector.get(list2, i);
                    if (pictureInfoOpt.needFeature) {
                        C2295408z2 c2295408z2 = LIZ;
                        AlgorithmData algorithmData = pictureInfoOpt.algorithmData;
                        if (algorithmData == null) {
                            algorithmData = new AlgorithmData(new ArrayList(), new FacedFeatureData(new ArrayList()), new C3FeatureData(null, 1, null), new NhFeatureData(null, 1, null), new ClassifyData(null, null, 3, null));
                        }
                        c2295408z2.getClass();
                        imageInfoListLIZIZ = new ImageInfoList(null, null, null, null, null, null, 63, null);
                        imageInfoListLIZIZ.setMeta(metaExt);
                        imageInfoListLIZIZ.setFaceFeatureV2(algorithmData.facedFeatureData.vcFaceFeature);
                        imageInfoListLIZIZ.setC3Feature(algorithmData.c3FeatureData.vcC3Feature);
                        imageInfoListLIZIZ.setSaliencyMask(algorithmData.nhFeatureData.vcNhFeature);
                        ClassifyData classifyData = algorithmData.classifyData;
                        imageInfoListLIZIZ.setThemeFeature(new ThemeFeature(classifyData.vcScore, classifyData.vcFeature));
                        ArrayList arrayList = new ArrayList();
                        if (!imageInfoListLIZIZ.c3Feature.isEmpty()) {
                            arrayList.add("c3");
                        }
                        if (!imageInfoListLIZIZ.saliencyMask.isEmpty()) {
                            arrayList.add("saliency");
                        }
                        if (!imageInfoListLIZIZ.faceFeatureV2.isEmpty()) {
                            arrayList.add("face");
                        }
                        if (!imageInfoListLIZIZ.themeFeature.score.isEmpty()) {
                            arrayList.add("themefeature");
                        }
                        metaExt.setIncludes(arrayList);
                    } else {
                        LIZ.getClass();
                        imageInfoListLIZIZ = LIZIZ(metaExt);
                    }
                    LIZ.getClass();
                    JSONObject jSONObject = new JSONObject();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("name", imageInfoListLIZIZ.meta.name);
                    jSONObject2.put("width", imageInfoListLIZIZ.meta.width);
                    jSONObject2.put("height", imageInfoListLIZIZ.meta.height);
                    jSONObject2.put("path", imageInfoListLIZIZ.meta.path);
                    jSONObject2.put("rotation", imageInfoListLIZIZ.meta.rotation);
                    jSONObject2.put("includes", new JSONArray((Collection) imageInfoListLIZIZ.meta.includes));
                    jSONObject2.put("duration", imageInfoListLIZIZ.meta.duration);
                    jSONObject2.put("isVideo", imageInfoListLIZIZ.meta.isVideo());
                    jSONObject2.put("frameTimeStamp", imageInfoListLIZIZ.meta.frameTimeStamp);
                    jSONObject2.put("hasAudio", imageInfoListLIZIZ.meta.hasAudio);
                    jSONObject.put("meta", jSONObject2);
                    jSONObject.put("c3Feature", new JSONArray((Collection) imageInfoListLIZIZ.c3Feature));
                    jSONObject.put("saliencyMask", new JSONArray((Collection) imageInfoListLIZIZ.saliencyMask));
                    List<FaceFeatureV2> list3 = imageInfoListLIZIZ.faceFeatureV2;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list3, 10));
                    for (FaceFeatureV2 faceFeatureV2 : list3) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("x", Float.valueOf(faceFeatureV2.x));
                        jSONObject3.put("y", Float.valueOf(faceFeatureV2.y));
                        jSONObject3.put("width", Float.valueOf(faceFeatureV2.width));
                        jSONObject3.put("height", Float.valueOf(faceFeatureV2.height));
                        arrayList2.add(jSONObject3);
                    }
                    jSONObject.put("faceFeatureV2", new JSONArray((Collection) arrayList2));
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put("score", new JSONArray((Collection) imageInfoListLIZIZ.themeFeature.score));
                    jSONObject4.put("feature", new JSONArray((Collection) imageInfoListLIZIZ.themeFeature.feature));
                    jSONObject.put("themeFeature", jSONObject4);
                    jSONObject.put("relationTag", new JSONArray((Collection) imageInfoListLIZIZ.relationTag));
                    jSONArray.put(jSONObject);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("image_info_list", jSONArray);
        jSONObject5.put("version", "2.0");
        C0VSJ c0vsj4 = new C0VSJ(c0vsj2, "feature.json");
        String strJ3 = C786410Ut5.J3(jSONObject5);
        LIZ("writeStringToFile");
        File parentFile = c0vsj4.getParentFile();
        if (parentFile != null) {
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            C794210VDn c794210VDn = new C794210VDn(c0vsj4);
            try {
                c794210VDn.write(strJ3);
                C2107108Nh.LIZ(c794210VDn, null);
            } finally {
                th = th;
                try {
                } catch (Throwable th2) {
                    while (true) {
                    }
                }
            }
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(new C0VSV(c0vsj3));
        try {
            HashSet hashSet = new HashSet();
            if (list != null) {
                try {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        PictureInfoOpt pictureInfoOpt2 = (PictureInfoOpt) it2.next();
                        if (!pictureInfoOpt2.needFeature) {
                            if (pictureInfoOpt2.resizePath.length() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                C0VSJ c0vsj5 = new C0VSJ(pictureInfoOpt2.resizePath);
                                if (c0vsj5.exists() && hashSet.add(c0vsj5.getName())) {
                                    zipOutputStream.putNextEntry(new ZipEntry(c0vsj5.getName()));
                                    C0VSP c0vsp2 = new C0VSP(c0vsj5);
                                    try {
                                        C2106208My.LIZ(c0vsp2, zipOutputStream);
                                        C2107108Nh.LIZ(c0vsp2, null);
                                        zipOutputStream.closeEntry();
                                    } catch (Throwable th3) {
                                        th = th3;
                                        try {
                                            try {
                                                TryCatchGuardChecker.doCheck(th);
                                                throw th;
                                            } catch (Throwable th4) {
                                                th = th4;
                                                TryCatchGuardChecker.doCheck(th);
                                                C2107108Nh.LIZ(c0vsp2, th);
                                                throw th;
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            th = null;
                                            TryCatchGuardChecker.doCheck(th);
                                            C2107108Nh.LIZ(c0vsp2, th);
                                            throw th;
                                        }
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    zipOutputStream.putNextEntry(new ZipEntry(c0vsj4.getName()));
                    c0vsp = new C0VSP(c0vsj4);
                    try {
                        C2106208My.LIZ(c0vsp, zipOutputStream);
                        th = null;
                        try {
                            C2107108Nh.LIZ(c0vsp, null);
                            zipOutputStream.closeEntry();
                            C2107108Nh.LIZ(zipOutputStream, null);
                            return c0vsj3.getAbsolutePath();
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } finally {
                        th = th;
                        th = null;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                                while (true) {
                                    try {
                                        TryCatchGuardChecker.doCheck(th);
                                        try {
                                            C2107108Nh.LIZ(c0vsp, th);
                                        } catch (Throwable th8) {
                                            th = th8;
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                    }
                                }
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            th = null;
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    th = null;
                }
            } else {
                zipOutputStream.putNextEntry(new ZipEntry(c0vsj4.getName()));
                c0vsp = new C0VSP(c0vsj4);
                C2106208My.LIZ(c0vsp, zipOutputStream);
                th = null;
                C2107108Nh.LIZ(c0vsp, null);
                zipOutputStream.closeEntry();
                C2107108Nh.LIZ(zipOutputStream, null);
                return c0vsj3.getAbsolutePath();
            }
        } catch (Throwable th12) {
            th = th12;
            th = null;
        }
        try {
            TryCatchGuardChecker.doCheck(th);
            try {
                throw th;
            } catch (Throwable th13) {
                th = th13;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2107108Nh.LIZ(zipOutputStream, th);
                        throw th;
                    } catch (Throwable th14) {
                        th = th14;
                    }
                }
            }
        } catch (Throwable th15) {
            th = th15;
            th = th;
        }
    }
}
