package com.bef.effectsdk;

import X.C0VSJ;
import X.C0VSV;
import X.C2188811AlT;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class EffectSDKUtils {
    public static boolean abBundleOptimization;
    public static boolean jniLazyLoad;
    public static Set<File> localFiles = new HashSet();
    public static List<String> assetFiles = ModelsList.list;
    public static Set<File> needRemoveFiles = new HashSet();

    public static native String nativeGetSdkVersion();

    public static void deleteNoUseModel() {
        for (File file : localFiles) {
            if (needRemoveFiles.contains(file) && file.exists()) {
                file.delete();
            }
        }
    }

    public static String getSdkVersion() {
        return nativeGetSdkVersion();
    }

    public static boolean getAbBundleOptimization() {
        return abBundleOptimization;
    }

    public static boolean getJniLazyLoad() {
        return jniLazyLoad;
    }

    public static void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public static String getAssetRelativePath(String str) {
        int iIndexOf = str.indexOf("model/");
        if (iIndexOf >= 0) {
            return str.substring(iIndexOf + 6, str.length());
        }
        return str;
    }

    public static String getFileName(String str) {
        int iLastIndexOf = str.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return str.substring(iLastIndexOf + 1, str.length());
        }
        return "";
    }

    public static void setAbBundleOptimization(boolean z) {
        abBundleOptimization = z;
    }

    public static void setJniLazyLoad(boolean z) {
        jniLazyLoad = z;
    }

    public static void flushAlgorithmModelFiles(Context context, String str) throws Throwable {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, null, false);
        deleteNoUseModel();
        localFiles.clear();
    }

    public static boolean needUpdate(final Context context, String str) {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        try {
            if (assetFiles.size() > localFiles.size()) {
                return true;
            }
            for (final String str2 : assetFiles) {
                if (takeFirstMatchingOrNull(localFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.1
                    @Override // java.io.FileFilter
                    public boolean accept(File file) {
                        boolean z = false;
                        if (!str2.contains(file.getName())) {
                            return false;
                        }
                        InputStream inputStreamOpen = null;
                        try {
                            try {
                                inputStreamOpen = context.getAssets().open(str2);
                                if (file.length() == inputStreamOpen.available()) {
                                    z = true;
                                }
                                EffectSDKUtils.closeQuietly(inputStreamOpen);
                                return z;
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                EffectSDKUtils.closeQuietly(inputStreamOpen);
                                return false;
                            }
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            EffectSDKUtils.closeQuietly(inputStreamOpen);
                            throw th;
                        }
                    }
                }) == null) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public static void scanRecursive(String str, Set<File> set) {
        File[] fileArrListFiles;
        C0VSJ c0vsj = new C0VSJ(str);
        if (c0vsj.exists() && (fileArrListFiles = c0vsj.listFiles()) != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    scanRecursive(file.getAbsolutePath(), set);
                } else {
                    set.add(file);
                }
            }
        }
    }

    public static File takeFirstMatchingOrNull(Set<File> set, FileFilter fileFilter) {
        for (File file : set) {
            if (fileFilter.accept(file)) {
                return file;
            }
        }
        return null;
    }

    public static void copyFile(Context context, String str, String str2) throws Throwable {
        C0VSV c0vsv;
        InputStream inputStream = null;
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str2);
                sbLIZ.append(str.substring(str.indexOf("model") + 6, str.lastIndexOf("/")));
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                C0VSJ c0vsj = new C0VSJ(strLIZIZ);
                if (!c0vsj.exists() && !c0vsj.mkdirs()) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Can not mkdirs ");
                    sbLIZ2.append(c0vsj.getPath());
                    throw new IOException(C2188811AlT.LIZIZ(sbLIZ2));
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append("/");
                sbLIZ3.append(getFileName(str));
                c0vsv = new C0VSV(new C0VSJ(C2188811AlT.LIZIZ(sbLIZ3)));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i = inputStreamOpen.read(bArr);
                        if (i > 0) {
                            c0vsv.write(bArr, 0, i);
                        } else {
                            try {
                                closeQuietly(inputStreamOpen);
                                closeQuietly(c0vsv);
                                return;
                            } finally {
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream = inputStreamOpen;
                    while (true) {
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            try {
                                closeQuietly(inputStream);
                                closeQuietly(c0vsv);
                                throw th;
                            } finally {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                c0vsv = null;
                inputStream = inputStreamOpen;
            }
        } catch (Throwable th4) {
            th = th4;
            c0vsv = null;
        }
    }

    public static void copyAssets(Context context, String str, String[] strArr, boolean z) throws Throwable {
        if (!needRemoveFiles.isEmpty()) {
            needRemoveFiles.clear();
        }
        needRemoveFiles.addAll(localFiles);
        if (!str.endsWith("/")) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("/");
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        for (String str2 : assetFiles) {
            final String fileName = getFileName(str2);
            File fileTakeFirstMatchingOrNull = takeFirstMatchingOrNull(needRemoveFiles, new FileFilter() { // from class: com.bef.effectsdk.EffectSDKUtils.2
                @Override // java.io.FileFilter
                public boolean accept(File file) {
                    return file.getName().contains(fileName);
                }
            });
            if (fileTakeFirstMatchingOrNull != null && new C0VSJ(str, getAssetRelativePath(str2)).exists()) {
                needRemoveFiles.remove(fileTakeFirstMatchingOrNull);
            } else {
                if (strArr != null && !TextUtils.isEmpty(fileName)) {
                    for (String str3 : strArr) {
                        if (fileName.equals(str3)) {
                            if (z) {
                                copyFile(context, str2, str);
                            }
                        }
                    }
                }
                if (!z) {
                    copyFile(context, str2, str);
                }
            }
        }
    }

    public static void flushAlgorithmModelFiles(Context context, String str, String[] strArr, boolean z) throws Throwable {
        if (!localFiles.isEmpty()) {
            localFiles.clear();
        }
        scanRecursive(str, localFiles);
        copyAssets(context, str, strArr, z);
        deleteNoUseModel();
        localFiles.clear();
    }
}
