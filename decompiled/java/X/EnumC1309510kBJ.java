package X;

import Y.ACallableS425S0100000_20;
import Y.AfS189S0100000_20;
import android.content.Context;
import android.content.res.AssetManager;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kBJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1309510kBJ implements InterfaceC767110U7h {
    public static final EnumC1309510kBJ INST;
    public static final String LLILZ;
    public static final String LLILZIL;
    public static final String LLILZLL;
    public static final String LLIZ;
    public static final String LLIZLLLIL;
    public static final String LLJ;
    public static final String LLJI;
    public static final String LLJIJIL;
    public static final String LLJILJIL;
    public static final String[] LLJILJILJ;
    public static final String[] LLJILLL;
    public static final String LLJJ;
    public static final /* synthetic */ EnumC1309510kBJ[] LLJJI;
    public String LLILLJJLI;
    public final Map<String, Object> LL = new HashMap();
    public boolean LLILLL = false;
    public MutableLiveData<Boolean> isLoadedRes = new MutableLiveData<>();

    public synchronized void loadResources() {
        C20441214yg.LIZIZ("LiveCameraResManager", "call loadResources");
        if (this.LLILLL) {
            C20441214yg.LIZIZ("LiveCameraResManager", "resources is loading, return");
            return;
        }
        if (!"0.0.21".equals(InterfaceC772190UQv.d3.LIZIZ())) {
            this.LLILLL = true;
            C11NN.LJFF(new ACallableS425S0100000_20(this, 3)).LJIIZILJ(C11S5.LIZ()).LJIIJ(C1701940uOG.LIZIZ()).LJIILJJIL(new AfS189S0100000_20(this, 1), new AfS189S0100000_20(this, 2), new C1339290kxL(this, 0), C11NU.INSTANCE);
        } else {
            C20441214yg.LIZIZ("LiveCameraResManager", "resources is already loaded, return");
            if (this.isLoadedRes.getValue() == null || !this.isLoadedRes.getValue().booleanValue()) {
                C11NZ.LJJJJZ(1).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS189S0100000_20(this, 0));
            }
        }
    }

    static {
        EnumC1309510kBJ enumC1309510kBJ = new EnumC1309510kBJ();
        INST = enumC1309510kBJ;
        LLJJI = new EnumC1309510kBJ[]{enumC1309510kBJ};
        LLILZ = C497740JfY.LJIJI(2131853507);
        LLILZIL = C497740JfY.LJIJI(2131853506);
        LLJ = C497740JfY.LJIJI(2131853509);
        LLILZLL = C497740JfY.LJIJI(2131853510);
        LLIZ = C497740JfY.LJIJI(2131853504);
        LLIZLLLIL = C497740JfY.LJIJI(2131853503);
        LLJIJIL = C497740JfY.LJIJI(2131853514);
        LLJI = C497740JfY.LJIJI(2131853512);
        LLJILJIL = C497740JfY.LJIJI(2131853513);
        Context contextLJII = C497740JfY.LJII();
        String[] stringArray = contextLJII == null ? new String[0] : contextLJII.getResources().getStringArray(R.array.bj);
        LLJILJILJ = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String[] strArr = LLJILJILJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(stringArray[i]);
            sbLIZ.append(".zip");
            strArr[i] = C2188811AlT.LIZIZ(sbLIZ);
        }
        Context contextLJII2 = C497740JfY.LJII();
        LLJILLL = contextLJII2 == null ? new String[0] : contextLJII2.getResources().getStringArray(R.array.bk);
        File dir = C497740JfY.LJII().getDir(LLILZ, 0);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(dir.getAbsolutePath());
        sbLIZ2.append(File.separator);
        LLJJ = C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static EnumC1309510kBJ[] values() {
        return (EnumC1309510kBJ[]) LLJJI.clone();
    }

    public boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.21".equals(InterfaceC772190UQv.d3.LIZIZ())));
        }
        return this.isLoadedRes.getValue().booleanValue();
    }

    public void loadSmoothComposerFile() {
        if (new C0VSJ(getSmoothComposerFilePath()).exists()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJIJIL);
        sbLIZ.append(".zip");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        AssetManager assets = C497740JfY.LJII().getAssets();
        try {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(LLJJ);
            sbLIZ2.append(strLIZIZ);
            LIZJ(strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), assets);
            LJFF(strLIZIZ);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("LiveCameraResManager", e);
        }
    }

    public String getBeautyComposerFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLIZLLLIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getBeautyFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        return C2355009Kq.LIZ(strLIZIZ) ? strLIZIZ : "";
    }

    public String getFaceReshapeFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getFilterFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLILZLL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getLiveComposerFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLILZIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getROIResPath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLJILJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getReshapeComposerFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLJI);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getSmoothComposerFilePath() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LLJJ);
        sbLIZ.append(LLJIJIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public String getLastTimeFailedReason() {
        return this.LLILLJJLI;
    }

    public String getModelFilePath() {
        return LLJJ;
    }

    public static void LJFF(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = LLJJ;
        sbLIZ.append(str2);
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new C0VSP(strLIZIZ)));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("..");
        sbLIZ2.append(File.separator);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (!C2093608Ic.LJ(name) && name.contains(strLIZIZ2)) {
                    throw new IOException("Unzip maybe be unsafe.");
                }
                if (nextEntry.isDirectory()) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str2);
                    sbLIZ3.append(File.separator);
                    sbLIZ3.append(name);
                    new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)).mkdirs();
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(str2);
                    sbLIZ4.append(File.separator);
                    sbLIZ4.append(name);
                    C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ4));
                    if (c0vsj.exists()) {
                        c0vsj.delete();
                    } else {
                        c0vsj.getParentFile().mkdirs();
                    }
                    c0vsj.createNewFile();
                    BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C0VSV(c0vsj));
                    byte[] bArr = new byte[SpeechEngineDefines.ASR_WORK_MODE_OFFLINE];
                    while (true) {
                        int i = zipInputStream.read(bArr);
                        if (i == -1) {
                            break;
                        } else {
                            bufferedOutputStream.write(bArr, 0, i);
                        }
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                }
            } else {
                zipInputStream.close();
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("1 file unzipped: ");
                sbLIZ5.append(strLIZIZ);
                C20441214yg.LIZIZ("LiveCameraResManager", C2188811AlT.LIZIZ(sbLIZ5));
                return;
            }
        }
    }

    public static EnumC1309510kBJ valueOf(String str) {
        return (EnumC1309510kBJ) C08FF.LIZ(EnumC1309510kBJ.class, str);
    }

    public Object getResourceFinder(Context context) {
        return ((IHostCreativeTool) C781270Ukn.LJI.getValue()).Nd1(context, getModelFilePath());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZJ(java.lang.String r9, java.lang.String r10, android.content.res.AssetManager r11) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L7
            return
        L7:
            r8 = 0
            java.io.InputStream r7 = r11.open(r9)     // Catch: java.lang.Throwable -> L8f
            X.0p2e r4 = X.C1496330p2d.LIZJ(r7)     // Catch: java.lang.Throwable -> L8a
            X.0VSJ r6 = new X.0VSJ     // Catch: java.lang.Throwable -> L87
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L87
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L87
            java.lang.String r5 = "LiveCameraResManager"
            if (r0 == 0) goto L4b
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = "old file found when copy res, path is "
            r1.append(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L87
            r1.append(r0)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L87
            X.C20441214yg.LIZIZ(r5, r0)     // Catch: java.lang.Throwable -> L87
            boolean r2 = r6.delete()     // Catch: java.lang.Throwable -> L87
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = "old file delete result: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L87
            r1.append(r2)     // Catch: java.lang.Throwable -> L87
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L87
            X.C20441214yg.LIZIZ(r5, r0)     // Catch: java.lang.Throwable -> L87
        L4b:
            X.0VSV r1 = new X.0VSV     // Catch: java.lang.Throwable -> L87
            r0 = 0
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L87
            X.0p39 r3 = X.C1496330p2d.LIZ(r1)     // Catch: java.lang.Throwable -> L87
            X.0p3F r2 = new X.0p3F     // Catch: java.lang.Throwable -> L84
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L84
            r2.LLIIJI(r4)     // Catch: java.lang.Throwable -> L98
            r2.flush()     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = "1 file copied: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r6.getAbsolutePath()     // Catch: java.lang.Throwable -> L98
            r1.append(r0)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L98
            X.C20441214yg.LIZIZ(r5, r0)     // Catch: java.lang.Throwable -> L98
            r2.close()
            r3.close()
            r4.close()
            r7.close()
            return
        L84:
            r0 = move-exception
            r2 = r8
            goto L94
        L87:
            r0 = move-exception
            r2 = r8
            goto L8d
        L8a:
            r0 = move-exception
            r4 = r8
            r2 = r8
        L8d:
            r3 = r2
            goto L94
        L8f:
            r0 = move-exception
            r3 = r8
            r4 = r8
            r2 = r8
            r7 = r3
        L94:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L98
            goto L9a
        L98:
            r0 = move-exception
            goto L94
        L9a:
            if (r2 == 0) goto L9f
            r2.close()
        L9f:
            if (r3 == 0) goto La4
            r3.close()
        La4:
            if (r4 == 0) goto La9
            r4.close()
        La9:
            if (r7 == 0) goto Lae
            r7.close()
        Lae:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EnumC1309510kBJ.LIZJ(java.lang.String, java.lang.String, android.content.res.AssetManager):void");
    }
}
