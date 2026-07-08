package X;

import android.util.Log;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.draft.model.DraftCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult;
import com.ss.android.ugc.aweme.draft.model.DraftFileCheckResults;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0MYA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MYA {
    public static final long LJI() {
        C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().getCreativeRoot());
        C570490MZb.LJFF(c0vsj);
        return C2260008tK.LJI(c0vsj.getAbsolutePath());
    }

    public static final DraftCheckResult LIZ(AwemeDraft awemeDraft) throws Throwable {
        ImageAlbumData imageAlbumData;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (awemeDraft.LJIJ() || ((imageAlbumData = awemeDraft.LJJJJIZL.imageAlbumData) != null && imageAlbumData.isTextModeWhenInit())) {
            return new DraftCheckResult(System.currentTimeMillis() - jCurrentTimeMillis, new DraftFileCheckResults(new ArrayList(), new ArrayList()), null, 0);
        }
        Pair<List<DraftFileCheckResult>, List<DraftFileCheckResult>> pairLIZIZ = LIZIZ(awemeDraft.LIZIZ(), awemeDraft.LJJJJIZL, AVDraftExtras.class);
        Pair<List<DraftFileCheckResult>, List<DraftFileCheckResult>> pairLIZIZ2 = LIZIZ(awemeDraft.LIZIZ(), awemeDraft.LIZ, CreativeModel.class);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(pairLIZIZ.getFirst());
        arrayList.addAll(pairLIZIZ2.getFirst());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(pairLIZIZ.getSecond());
        arrayList2.addAll(pairLIZIZ2.getSecond());
        return new DraftCheckResult(jCurrentTimeMillis2, new DraftFileCheckResults(arrayList, arrayList2), null, 0);
    }

    public static final void LIZLLL(FileChannel fileChannel) {
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJIIJ(C0MAY.LIZIZ, "close FileChannel error", e);
            }
        }
    }

    public static final void LJ(final CreativeInfo creativeInfo) {
        if (C372020EiG.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("deleteUnUseCreativeFiles skipped due to experiment, creativeInfo: ");
            sbLIZ.append(creativeInfo);
            C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("deleteUnUseCreativeFiles , creativeInfo : ");
        sbLIZ2.append(creativeInfo);
        sbLIZ2.append(" trace : ");
        sbLIZ2.append(Log.getStackTraceString(new RuntimeException()));
        C0M7L.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
        File[] fileArrListFiles = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathService().LIZIZ(new CreativeInfo(creativeInfo.getCreationId(), -1, null, 4, null))).listFiles(new FilenameFilter() { // from class: X.0MYC
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return !Intrinsics.LJFF(str, String.valueOf(creativeInfo.getVersion()));
            }
        });
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                try {
                    C08QA.LJIIZILJ(file);
                } catch (AssertionError e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    public static final File LJFF(File file) {
        if (!file.exists()) {
            File parentFile = file.getParentFile();
            if (parentFile != null) {
                return LJFF(parentFile);
            }
            return null;
        }
        return file;
    }

    public static final String LJII(int i, File file) {
        File[] fileArrListFiles;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("-");
        }
        sb.append(file.getName());
        sb.append("\n");
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                sb.append(LJII(i + 4, file2));
            }
        }
        return sb.toString();
    }

    public static final boolean LJIIIZ(String str, String str2) throws Throwable {
        String strSubstring;
        int iLJJJ;
        Integer numLJIIJJI;
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        String path = c0vsj.getPath();
        boolean z = false;
        int iLJJJ2 = a0.LJJJ(path, str2, 0, false, 6);
        if (iLJJJ2 < 0) {
            return false;
        }
        String strSubstring2 = path.substring(str2.length() + iLJJJ2);
        String str3 = File.separator;
        if (u.LJJIIJZLJL(strSubstring2, str3, false) && (iLJJJ = a0.LJJJ((strSubstring = strSubstring2.substring(1)), str3, 0, false, 6)) >= 0 && (numLJIIJJI = C2095008Iq.LJIIJJI(strSubstring.substring(0, iLJJJ))) != null) {
            final int iIntValue = numLJIIJJI.intValue();
            String strSubstring3 = strSubstring.substring(iLJJJ + 1);
            C0VSJ c0vsj2 = new C0VSJ(path.substring(0, iLJJJ2 + str2.length()));
            if (!c0vsj2.isDirectory() || (fileArrListFiles = c0vsj2.listFiles(new FilenameFilter() { // from class: X.0MYB
                @Override // java.io.FilenameFilter
                public final boolean accept(File file, String str4) {
                    if (!Intrinsics.LJFF(str4, String.valueOf(iIntValue)) && C2095008Iq.LJIIJJI(str4) != null) {
                        return true;
                    }
                    return false;
                }
            })) == null) {
                return false;
            }
            for (File file : fileArrListFiles) {
                C0VSJ c0vsj3 = new C0VSJ(file, strSubstring3);
                if (c0vsj3.isFile() && c0vsj3.length() > 0) {
                    try {
                        File parentFile = c0vsj.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        C08QA.LJIILLIIL(c0vsj3, c0vsj, false, 4);
                        C0MAY c0may = C0MAY.LIZIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Version compensation success: copied from ");
                        sbLIZ.append(c0vsj3.getPath());
                        sbLIZ.append(" to ");
                        sbLIZ.append(path);
                        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
                        z = true;
                        return true;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C0MAY c0may2 = C0MAY.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Version compensation failed: ");
                        sbLIZ2.append(e.getMessage());
                        C201955140j.LJIIJ(c0may2, C2188811AlT.LIZIZ(sbLIZ2), e);
                        return z;
                    }
                }
            }
        }
        return false;
    }

    public static final <DATA> Pair<List<DraftFileCheckResult>, List<DraftFileCheckResult>> LIZIZ(final CreativeInfo creativeInfo, DATA data, final Class<DATA> cls) throws Throwable {
        C576150Mij c576150MijLIZ = C0MY6.LIZ(C0MY6.LIZ, cls, C0MY0.class, false, 12);
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final HashMap map = new HashMap();
        try {
            c576150MijLIZ.LIZIZ(data, new InterfaceC576180Mim<C0MY0>() { // from class: X.0MBe
                @Override // X.InterfaceC576180Mim
                public final void LJ(Field field, Object obj, Annotation annotation) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(obj.getClass().getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(field.getName());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0MYA.LIZJ(map, creativeInfo, arrayList, arrayList2, (String) field.get(obj), (C0MY0) annotation, field, strLIZIZ);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZ(Field field, String str, Annotation annotation, List list) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(field.getName());
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0MYA.LIZJ(map, creativeInfo, arrayList, arrayList2, str, (C0MY0) annotation, field, strLIZIZ);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZIZ(Field field, Map map2, Object obj, Annotation annotation) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(field.getName());
                    sbLIZ.append('[');
                    sbLIZ.append(obj);
                    sbLIZ.append(']');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0MYA.LIZJ(map, creativeInfo, arrayList, arrayList2, (String) map2.get(obj), (C0MY0) annotation, field, strLIZIZ);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZJ(Field field, String[] strArr, int i, Annotation annotation) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(field.getName());
                    sbLIZ.append('[');
                    sbLIZ.append(i);
                    sbLIZ.append(']');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0MYA.LIZJ(map, creativeInfo, arrayList, arrayList2, strArr[i], (C0MY0) annotation, field, strLIZIZ);
                }

                @Override // X.InterfaceC576180Mim
                public final void LIZLLL(Field field, List list, int i, Annotation annotation) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(cls.getSimpleName());
                    sbLIZ.append('.');
                    sbLIZ.append(field.getName());
                    sbLIZ.append('[');
                    sbLIZ.append(i);
                    sbLIZ.append(']');
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C0MYA.LIZJ(map, creativeInfo, arrayList, arrayList2, (String) ListProtector.get(list, i), (C0MY0) annotation, field, strLIZIZ);
                }
            });
        } catch (C0MY4 e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return new Pair<>(arrayList, arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZJ(java.util.Map<java.lang.String, java.lang.Boolean> r17, com.ss.android.ugc.aweme.creative.model.CreativeInfo r18, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult> r19, java.util.List<com.ss.android.ugc.aweme.draft.model.DraftFileCheckResult> r20, java.lang.String r21, X.C0MY0 r22, java.lang.reflect.Field r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0MYA.LIZJ(java.util.Map, com.ss.android.ugc.aweme.creative.model.CreativeInfo, java.util.List, java.util.List, java.lang.String, X.0MY0, java.lang.reflect.Field, java.lang.String):void");
    }
}
