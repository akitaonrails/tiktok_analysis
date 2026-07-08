package X;

import android.provider.MediaStore;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.AutoCutAnchorModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutSoundSyncModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveException;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileSaveResults;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mvtheme.MvCreateVideoData;
import com.ss.android.ugc.aweme.services.dm.DMPath;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS110S0101000_2;
import kotlin.jvm.internal.AwS116S0101000_8;
import kotlin.jvm.internal.AwS368S0200000_2;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS406S0200000_5;
import kotlin.jvm.internal.AwS444S0200000_8;
import kotlin.jvm.internal.AwS90S1000000_5;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MYD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYD {
    public static final ArrayList<String> LIZ;
    public static final ArrayList<String> LIZIZ;

    static {
        String strLJJLIIIIJ = C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLIIIIJ("");
        String str = File.separator;
        LIZ = C1697810uHb.LJ(a0.LJJJLL(str, strLJJLIIIIJ), a0.LJJJLL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIIJIL("")), a0.LJJJLL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJLI("")), a0.LJJJLL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL("")), a0.LJJJLL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJJIJIL("")), a0.LJJJLL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().genMusicPath("")), "content://");
        C140D.LIZ.getClass();
        InterfaceC570310MYj pathService = C0CHQ.LIZ().LJJIIJZLJL().getPathService();
        EnumC20227914Cv enumC20227914Cv = EnumC20227914Cv.UGC_TEMPLATE;
        EnumC23090092y enumC23090092y = EnumC23090092y.TEMPLATE_CACHE;
        LIZIZ = C1697810uHb.LJ(a0.LJJJLL(str, C140D.LJIIJJI().getAbsolutePath()), pathService.LJIIJ(enumC20227914Cv, enumC23090092y.getDirName(), true).getAbsolutePath(), C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.AUTOCUT_TEMPLATE, enumC23090092y.getDirName(), true).getAbsolutePath(), C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.ALBUM_AI, "", false).getAbsolutePath(), C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJIIJ(EnumC20227914Cv.LIVE_RECORDINGS, "", false).getAbsolutePath());
    }

    public static final List<C0MYM> LIZIZ(AwemeDraft awemeDraft) {
        ImageAlbumData imageAlbumData;
        if (awemeDraft.LJIJ() || ((imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData) != null && imageAlbumData.isTextModeWhenInit())) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(LIZ(awemeDraft.LIZIZ(), awemeDraft.LJJJJIZL, AVDraftExtras.class));
        arrayList.addAll(LIZ(awemeDraft.LIZIZ(), awemeDraft.LIZ, CreativeModel.class));
        return arrayList;
    }

    public static final String LIZLLL(String str) {
        int iLJJJJ = a0.LJJJJ(str, '.', 0, 6);
        if (iLJJJJ > 0 && iLJJJJ < str.length() - 1) {
            String lowerCase = str.substring(iLJJJJ + 1).toLowerCase(Locale.ROOT);
            if (lowerCase.length() <= 10) {
                return lowerCase;
            }
            return "";
        }
        return "";
    }

    public static final boolean LJ(String str) {
        if (C0CHD.LIZ() && C2471909mP.LJJIIZI(str) && C570280MYg.LJ(UriProtector.parse(str)) >= -2147483648L) {
            return true;
        }
        if (C298240BmY.LIZ() && C2471909mP.LJJIIZI(str)) {
            return true;
        }
        return false;
    }

    public static final void LJFF(AwemeDraft awemeDraft) {
        ArrayList<String> arrayList;
        MvCreateVideoData mvCreateVideoData = awemeDraft.LJJJJIZL.mvCreateVideoData;
        if (mvCreateVideoData != null && (arrayList = mvCreateVideoData.selectMediaList) != null) {
            arrayList.size();
            C19719612Di.LJJIIJ(arrayList, AFwS239S0000000_8.get$arr$(163), true);
        }
    }

    public static final DraftFileSaveResult LJII(AwemeDraft awemeDraft) {
        boolean z;
        String str = awemeDraft.LIZ.autoCutAnchorModel.nleData;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(awemeDraft.LIZIZ(), EnumC20228214Cy.AUTOCUT_NLE_DATA, "autocut_nle_data_file_name.json", true).getAbsolutePath();
        AutoCutAnchorModel autoCutAnchorModel = awemeDraft.LIZ.autoCutAnchorModel;
        C391370FWd.LIZ("", new AwS90S1000000_5(absolutePath, 0));
        autoCutAnchorModel.nleDataVersion = 1;
        DraftFileSaveException draftFileSaveExceptionLIZ = C2350209Iu.LIZ(absolutePath, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSaveOp write autocut nle path ");
        sbLIZ.append(absolutePath);
        sbLIZ.append(" result ");
        sbLIZ.append(draftFileSaveExceptionLIZ.errorCode);
        sbLIZ.append(" data ");
        sbLIZ.append(awemeDraft.LJIIJJI);
        C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!draftFileSaveExceptionLIZ.isSuc()) {
            return new DraftFileSaveResult(8, draftFileSaveExceptionLIZ);
        }
        awemeDraft.LIZ.autoCutAnchorModel.nleDataPath = absolutePath;
        return null;
    }

    public static final void LJIIJJI(AwemeDraft awemeDraft) {
        for (Map.Entry<String, String> entry : awemeDraft.LJIJJ.entrySet()) {
            ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIILJJIL(entry.getValue(), entry.getKey(), awemeDraft.LIZ());
        }
    }

    public static final DraftFileSaveResult LJIIL(AwemeDraft awemeDraft) {
        boolean z;
        String str = awemeDraft.LIZ.autoCutModel.soundSyncModel.soundSyncNleData;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String absolutePath = C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZJ(awemeDraft.LIZIZ(), EnumC20228214Cy.SOUND_SYNC, "sound_sync_nle_data_file_name.json", true).getAbsolutePath();
        AutoCutSoundSyncModel autoCutSoundSyncModel = awemeDraft.LIZ.autoCutModel.soundSyncModel;
        C391370FWd.LIZ("", new AwS90S1000000_5(absolutePath, 0));
        autoCutSoundSyncModel.soundSyncNleDataVersion = 1;
        DraftFileSaveException draftFileSaveExceptionLIZ = C2350209Iu.LIZ(absolutePath, str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftSaveOp write sound sync nle path ");
        sbLIZ.append(absolutePath);
        sbLIZ.append(" result ");
        sbLIZ.append(draftFileSaveExceptionLIZ.errorCode);
        sbLIZ.append(" data ");
        sbLIZ.append(awemeDraft.LJIIJJI);
        C349910Dnh.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (!draftFileSaveExceptionLIZ.isSuc()) {
            return new DraftFileSaveResult(8, draftFileSaveExceptionLIZ);
        }
        awemeDraft.LIZ.autoCutModel.soundSyncModel.soundSyncNleDataPath = absolutePath;
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.LinkedHashMap] */
    public static final DraftFileSaveResults LJIIIIZZ(AwemeDraft awemeDraft, boolean z) throws Throwable {
        List<EditVideoSegment> videoList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        HashMap map = new HashMap();
        C13BV c13bv = C13BV.INSTANCE;
        Pair<List<DraftFileSaveResult>, List<DraftFileSaveResult>> pair = new Pair<>(c13bv, c13bv);
        Pair<List<DraftFileSaveResult>, List<DraftFileSaveResult>> pair2 = new Pair<>(c13bv, c13bv);
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new LinkedHashMap();
        if (!z) {
            pair = LJIIIZ(awemeDraft.LIZIZ(), awemeDraft.LJJJJIZL, AVDraftExtras.class, map, new AwS444S0200000_8(awemeDraft, (AwemeDraft) c259800zU, (C259800zU<Map<String, String>>) 9));
            pair2 = LJIIIZ(awemeDraft.LIZIZ(), awemeDraft.LIZ, CreativeModel.class, map, new AwS444S0200000_8(awemeDraft, (AwemeDraft) c259800zU, (C259800zU<Map<String, String>>) 10));
        }
        EditPreviewInfo editPreviewInfo = awemeDraft.LIZ.editModel.editPreviewInfo;
        if (editPreviewInfo != null && (videoList = editPreviewInfo.getVideoList()) != null) {
            for (EditVideoSegment editVideoSegment : videoList) {
                String str = (String) ((Map) c259800zU.element).get(editVideoSegment.getVideoPath());
                if (str == null) {
                    str = "";
                }
                if (u.LJJIIJZLJL(editVideoSegment.getVideoPath(), MediaStore.Video.Media.EXTERNAL_CONTENT_URI.toString(), false)) {
                    editVideoSegment.setOriginImportPath(editVideoSegment.getVideoPath());
                } else {
                    editVideoSegment.setOriginImportPath(str);
                }
            }
        }
        C259800zU c259800zU2 = new C259800zU();
        C391360FWc.LJ("", new AwS406S0200000_5(awemeDraft, (AwemeDraft) c259800zU2, (C259800zU<DraftFileSaveResult>) 21));
        T t = c259800zU2.element;
        DraftFileSaveResult draftFileSaveResultLJII = LJII(awemeDraft);
        DraftFileSaveResult draftFileSaveResultLJIIL = LJIIL(awemeDraft);
        DraftFileSaveResult draftFileSaveResultLJIILIIL = C365970EWl.LIZ.LJIILIIL(awemeDraft);
        LJIIJJI(awemeDraft);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(pair.getFirst());
        arrayList.addAll(pair2.getFirst());
        if (t != 0) {
            arrayList.add(t);
        }
        if (draftFileSaveResultLJII != null) {
            arrayList.add(draftFileSaveResultLJII);
        }
        if (draftFileSaveResultLJIIL != null) {
            arrayList.add(draftFileSaveResultLJIIL);
        }
        if (draftFileSaveResultLJIILIIL != null) {
            arrayList.add(draftFileSaveResultLJIILIIL);
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(pair.getSecond());
        arrayList2.addAll(pair2.getSecond());
        return new DraftFileSaveResults(jCurrentTimeMillis2, arrayList, arrayList2);
    }

    public static final <DATA> List<C0MYM> LIZ(final CreativeInfo creativeInfo, DATA data, Class<DATA> cls) throws Throwable {
        C0MY6 c0my6 = C0MY6.LIZ;
        C576150Mij c576150MijLIZ = C0MY6.LIZ(c0my6, cls, C0MY0.class, false, 12);
        C576150Mij c576150MijLIZ2 = C0MY6.LIZ(c0my6, cls, InterfaceC2270908v5.class, false, 12);
        C576150Mij c576150MijLIZ3 = C0MY6.LIZ(c0my6, cls, InterfaceC2270808v4.class, false, 12);
        final ArrayList arrayList = new ArrayList();
        c576150MijLIZ.LIZIZ(data, new InterfaceC576180Mim<C0MY0>() { // from class: X.0MYH
            @Override // X.InterfaceC576180Mim
            public final void LJ(Field field, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) field.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZ(Field field, String str, Annotation annotation, List list) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, str);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZIZ(Field field, Map map, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) map.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, strArr[i]);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZLLL(Field field, List list, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) ListProtector.get(list, i));
            }
        });
        c576150MijLIZ2.LIZIZ(data, new InterfaceC576180Mim<InterfaceC2270908v5>() { // from class: X.0MYJ
            @Override // X.InterfaceC576180Mim
            public final void LJ(Field field, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) field.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZ(Field field, String str, Annotation annotation, List list) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, str);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZIZ(Field field, Map map, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) map.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, strArr[i]);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZLLL(Field field, List list, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) ListProtector.get(list, i));
            }
        });
        c576150MijLIZ3.LIZIZ(data, new InterfaceC576180Mim<InterfaceC2270808v4>() { // from class: X.0MYI
            @Override // X.InterfaceC576180Mim
            public final void LJ(Field field, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) field.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZ(Field field, String str, Annotation annotation, List list) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, str);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZIZ(Field field, Map map, Object obj, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) map.get(obj));
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, strArr[i]);
            }

            @Override // X.InterfaceC576180Mim
            public final void LIZLLL(Field field, List list, int i, Annotation annotation) {
                C0MYD.LIZJ(creativeInfo, arrayList, field, (String) ListProtector.get(list, i));
            }
        });
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:176:0x03a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LJI(X.C538590LAj r16, kotlin.jvm.functions.Function1<? super com.ss.android.ugc.aweme.draft.model.AwemeDraft, kotlin.Unit> r17, X.InterfaceC1364105Vn<? super X.C540340LHc> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 949
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MYD.LJI(X.0LAj, kotlin.jvm.functions.Function1, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(CreativeInfo creativeInfo, List<C0MYM> list, Field field, final String str) {
        C570490MZb.LIZLLL(str);
        for (Annotation annotation : field.getAnnotations()) {
            if (annotation instanceof C0MY0) {
                if (str.length() != 0 && !C570490MZb.LIZLLL(str)) {
                    ArrayList<String> arrayList = LIZIZ;
                    if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                        Iterator<String> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (u.LJJIIJZLJL(str, it2.next(), false)) {
                                return;
                            }
                        }
                    }
                    if (C287010BMt.LIZ() && u.LJJIIJZLJL(str, C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, null, 2), false)) {
                        return;
                    }
                    String root = DMPath.Companion.getROOT();
                    for (int i = 0; i < root.length(); i++) {
                        if (a0.LJJLIIIJJIZ(str, root.charAt(i))) {
                            return;
                        }
                    }
                    if (u.LJJIIJZLJL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(creativeInfo), false) && ((Regex) C20021913Vp.LJI.getValue()).matches(str)) {
                        return;
                    }
                } else {
                    return;
                }
            } else if (annotation instanceof InterfaceC2270908v5) {
                if (str.length() == 0) {
                    return;
                }
                Iterator<String> it3 = LIZ.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    String next = it3.next();
                    if (u.LJJIIJZLJL(str, next, false)) {
                        if (next != null) {
                            return;
                        }
                    }
                }
                String root2 = DMPath.Companion.getROOT();
                for (int i2 = 0; i2 < root2.length(); i2++) {
                    if (a0.LJJLIIIJJIZ(str, root2.charAt(i2))) {
                        return;
                    }
                }
                if (u.LJJIIJZLJL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathService().LJFF(), false) && ((Regex) C20021913Vp.LJI.getValue()).matches(str)) {
                    return;
                }
            } else if (!(annotation instanceof InterfaceC2270808v4)) {
                continue;
            } else {
                if (str.length() == 0) {
                    return;
                }
                if (u.LJJIIJZLJL(str, C0CHQ.LIZ().LJJIIJZLJL().getPathService().getPersistentRoot(), false) && ((Regex) C20021913Vp.LJI.getValue()).matches(str)) {
                    return;
                }
            }
        }
        final String string = field.toString();
        list.add(new Object(string, str) { // from class: X.0MYM
            public final String LIZ;
            public final String LIZIZ;

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PathInfo(fieldInfo='");
                sbLIZ.append(this.LIZ);
                sbLIZ.append("', fileDes='");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append("')");
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = string;
                this.LIZIZ = str;
            }
        });
    }

    public static final <DATA> Pair<List<DraftFileSaveResult>, List<DraftFileSaveResult>> LJIIIZ(final CreativeInfo creativeInfo, DATA data, Class<DATA> cls, final Map<String, String> map, final Function2<? super String, ? super String, Unit> function2) throws Throwable {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        try {
            C0MY6.LIZ(C0MY6.LIZ, cls, C0MY0.class, false, 12).LIZIZ(data, new InterfaceC576180Mim<C0MY0>() { // from class: X.0MYF
                @Override // X.InterfaceC576180Mim
                public final void LJ(Field field, Object obj, Annotation annotation) throws Throwable {
                    C0MYD.LJIIJ(map, function2, creativeInfo, arrayList, arrayList2, (String) field.get(obj), (C0MY0) annotation, new AwS374S0200000_8(field, obj, 90));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZ(Field field, String str, Annotation annotation, List list) throws Throwable {
                    C0MYD.LJIIJ(map, function2, creativeInfo, arrayList, arrayList2, str, (C0MY0) annotation, new C020R(list, (List<Pair<String, String>>) str, (String) 4));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZIZ(Field field, Map map2, Object obj, Annotation annotation) throws Throwable {
                    C0MYD.LJIIJ(map, function2, creativeInfo, arrayList, arrayList2, (String) map2.get(obj), (C0MY0) annotation, new AwS368S0200000_2(obj, map2, 68));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) throws Throwable {
                    C0MYD.LJIIJ(map, function2, creativeInfo, arrayList, arrayList2, strArr[i], (C0MY0) annotation, new AwS116S0101000_8(i, strArr, 5));
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZLLL(Field field, List list, int i, Annotation annotation) throws Throwable {
                    C0MYD.LJIIJ(map, function2, creativeInfo, arrayList, arrayList2, (String) ListProtector.get(list, i), (C0MY0) annotation, new AwS110S0101000_2(list, (List<String>) i, 3));
                }
            });
        } catch (C0MY5 e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0431  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e7 A[EDGE_INSN: B:163:0x00e7->B:46:0x00e7 BREAK  A[LOOP:2: B:42:0x00d5->B:164:?], PHI: r15 r16
      0x00e7: PHI (r15v2 ??) = (r15v6 ?? I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), (r15v1 ??), (r15v0 ??) binds: [B:163:0x00e7, B:39:0x00c4, B:33:0x009b] A[DONT_GENERATE, DONT_INLINE]
      0x00e7: PHI (r16v2 ??) = (r16v10 ??), (r16v1 ??), (r16v10 ??) binds: [B:163:0x00e7, B:39:0x00c4, B:33:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0271 A[Catch: Exception -> 0x02d2, all -> 0x03f4, TRY_ENTER, TryCatch #1 {all -> 0x03f4, blocks: (B:87:0x0271, B:89:0x0298, B:92:0x02a2, B:93:0x02ad, B:95:0x02bb, B:96:0x02d1, B:101:0x02d7), top: B:155:0x0236 }] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Throwable, java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10, types: [X.0WZX] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.nio.channels.FileChannel] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v36, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r21v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r3v18, types: [T] */
    /* JADX WARN: Type inference failed for: r3v62 */
    /* JADX WARN: Type inference failed for: r3v63 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(java.util.Map<java.lang.String, java.lang.String> r21, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r22, com.ss.android.ugc.aweme.creative.model.CreativeInfo r23, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult> r24, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileSaveResult> r25, java.lang.String r26, X.C0MY0 r27, kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MYD.LJIIJ(java.util.Map, kotlin.jvm.functions.Function2, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, java.util.List, java.lang.String, X.0MY0, kotlin.jvm.functions.Function1):void");
    }
}
