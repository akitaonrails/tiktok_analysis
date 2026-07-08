package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: renamed from: X.08SA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08SA {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(String str, List<String> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ame-extract-frames");
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append(".zip");
        return LJFF(str, C2188811AlT.LIZIZ(sbLIZ), list);
    }

    public static final String LIZJ(C0VSJ c0vsj, File file) {
        try {
            LJ(new C0VSP(c0vsj), file.getAbsolutePath());
            return file.getAbsolutePath();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            file.delete();
            if (!(e instanceof IOException)) {
                throw new IOException("Error when decompressing zip file.", e);
            }
            throw e;
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:51:0x00d5
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static final void LJ(java.io.InputStream r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08SA.LJ(java.io.InputStream, java.lang.String):void");
    }

    public static void LJI(ZipOutputStream zipOutputStream, List list) throws Throwable {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C0VSJ c0vsj = new C0VSJ((String) it2.next());
            if (c0vsj.exists()) {
                if (c0vsj.isDirectory()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c0vsj.getName());
                    sbLIZ.append(File.separator);
                    LIZIZ(c0vsj, C2188811AlT.LIZIZ(sbLIZ), zipOutputStream);
                } else {
                    LIZIZ(c0vsj, "", zipOutputStream);
                }
            }
        }
        zipOutputStream.flush();
    }

    public static void LIZIZ(File file, String str, ZipOutputStream zipOutputStream) throws Throwable {
        if (file.isDirectory()) {
            C089E c089e = new C089E(file.listFiles());
            while (c089e.hasNext()) {
                File file2 = (File) c089e.next();
                if (file2 != null) {
                    if (file2.isDirectory()) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(file.getName());
                        String str2 = File.separator;
                        sbLIZ.append(str2);
                        sbLIZ.append(file2.getName());
                        sbLIZ.append(str2);
                        LIZIZ(file2, C2188811AlT.LIZIZ(sbLIZ), zipOutputStream);
                    } else {
                        LIZIZ(file2, str, zipOutputStream);
                    }
                }
            }
            return;
        }
        byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new C0VSP(file));
        Throwable th = null;
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append(file.getName());
            zipOutputStream.putNextEntry(new ZipEntry(C2188811AlT.LIZIZ(sbLIZ2)));
            while (true) {
                int i = bufferedInputStream.read(bArr);
                if (i != -1) {
                    zipOutputStream.write(bArr, 0, i);
                } else {
                    C2107108Nh.LIZ(bufferedInputStream, null);
                    return;
                }
            }
        } catch (Throwable th2) {
            try {
                TryCatchGuardChecker.doCheck(th2);
                try {
                    throw th2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th2;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            C2107108Nh.LIZ(bufferedInputStream, th);
                            throw th;
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static final void LIZLLL(Context context, int i, String str) {
        Resources resources;
        if (i != 0 && !TextUtils.isEmpty(str) && (resources = context.getResources()) != null) {
            LJ(resources.openRawResource(i), str);
        }
    }

    public static final String LJFF(String str, String str2, List<String> list) throws Throwable {
        if (list.isEmpty()) {
            return null;
        }
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(File.separator);
            sbLIZ.append(str2);
            C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
            File parentFile = c0vsj.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new C0VSV(c0vsj)));
            try {
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    C0VSJ c0vsj2 = new C0VSJ(it2.next());
                    if (c0vsj2.exists()) {
                        if (c0vsj2.isDirectory()) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(c0vsj2.getName());
                            sbLIZ2.append(File.separator);
                            LIZIZ(c0vsj2, C2188811AlT.LIZIZ(sbLIZ2), zipOutputStream);
                        } else {
                            LIZIZ(c0vsj2, "", zipOutputStream);
                        }
                    }
                }
                zipOutputStream.flush();
                String absolutePath = c0vsj.getAbsolutePath();
                C2107108Nh.LIZ(zipOutputStream, null);
                return absolutePath;
            } catch (Throwable th) {
                th = th;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        th = th2;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(zipOutputStream, th);
                                throw th;
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
