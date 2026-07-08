package androidx.core.content;

import X.C08RN;
import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C2119408Sa;
import X.C2188811AlT;
import X.C2361809Ng;
import X.C2361909Nh;
import X.C2362209Nk;
import X.C786410Ut5;
import X.C786450Ut9;
import X.C793770VBv;
import X.InterfaceC2119608Sc;
import android.app.Application;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public class FileProvider extends ContentProvider {
    public static final String[] COLUMNS = {"_display_name", "_size"};
    public static final File DEVICE_ROOT = new File("/");
    public static final HashMap<String, InterfaceC2119608Sc> sCache = new HashMap<>();
    public String mAuthority;
    public Object mLazyProviderInfo;
    public InterfaceC2119608Sc mLocalPathStrategy;
    public final Object mLock;
    public final int mResourceId;

    public FileProvider() {
        this(0);
    }

    public static Uri getUriForFile(Context context, String str, File file) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file);
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(this, context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(this, uri, str, strArr);
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(this, uri);
    }

    @Override // android.content.ContentProvider
    public String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_insert(this, uri, contentValues);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(this, uri, str);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        Uri uri2;
        String[] strArr3;
        String str3;
        String[] strArr4;
        String str4;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(11068, "androidx/core/content/FileProvider", "query", this, new Object[]{uri, strArr, str, strArr2, str2}, "android.database.Cursor", new C0WZW(false, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", new C0WZX("dTF6Tg0zW9KSVlgzQFyHafvE/Tf/OU9VdfmyYStWQN/OqQ==", new String[]{"01789"})));
        if (c0wsuLIZIZ.LIZ) {
            return (Cursor) c0wsuLIZIZ.LIZIZ;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null) {
            Object obj = objArr[0];
            uri2 = obj != null ? (Uri) obj : uri;
            Object obj2 = objArr[1];
            strArr3 = obj2 != null ? (String[]) obj2 : strArr;
            Object obj3 = objArr[2];
            str3 = obj3 != null ? (String) obj3 : str;
            Object obj4 = objArr[3];
            strArr4 = obj4 != null ? (String[]) obj4 : strArr2;
            Object obj5 = objArr[4];
            str4 = obj5 != null ? (String) obj5 : str2;
        } else {
            uri2 = uri;
            strArr3 = strArr;
            str3 = str;
            strArr4 = strArr2;
            str4 = str2;
        }
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(this, uri2, strArr3, str3, strArr4, str4);
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_update(this, uri, contentValues, str, strArr);
    }

    private InterfaceC2119608Sc getLocalPathStrategy() {
        InterfaceC2119608Sc interfaceC2119608Sc;
        synchronized (this.mLock) {
            try {
                if (this.mAuthority == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                if (this.mLocalPathStrategy == null) {
                    this.mLocalPathStrategy = getPathStrategy(getContext(), this.mAuthority, this.mResourceId);
                }
                interfaceC2119608Sc = this.mLocalPathStrategy;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return interfaceC2119608Sc;
    }

    public FileProvider(int i) {
        this.mLock = new Object();
        this.mResourceId = i;
    }

    public static File INVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) throws Throwable {
        File file = C786450Ut9.LIZJ;
        if (file != null && C786450Ut9.LJ) {
            return file;
        }
        try {
            C786450Ut9.LIZJ = context.getFilesDir();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            Context applicationContext = null;
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                Field declaredField = cls.getDeclaredField("mInitialApplication");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(objInvoke);
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Application context obtained through ActivityThread: ");
                    sbLIZ.append(applicationContext);
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ));
                } else {
                    System.out.println("Error: mInitialApplication is not an instance of Application");
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                PrintStream printStream2 = System.out;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Error: ");
                sbLIZ2.append(e.getMessage());
                printStream2.println(C2188811AlT.LIZIZ(sbLIZ2));
            }
            if (applicationContext != null) {
                C786450Ut9.LIZJ = applicationContext.getFilesDir();
                C08RN.LIZ(applicationContext);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(th.getMessage());
                sbLIZ3.append(":");
                sbLIZ3.append(C08RN.LIZJ());
                sbLIZ3.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
        return C786450Ut9.LIZJ;
    }

    public static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if (!"w".equals(str) && !"wt".equals(str)) {
            if ("wa".equals(str)) {
                return 704643072;
            }
            if ("rw".equals(str)) {
                return 939524096;
            }
            if ("rwt".equals(str)) {
                return 1006632960;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Invalid mode: ");
            sbLIZ.append(str);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
        }
        return 738197504;
    }

    public static String removeTrailingSlash(String str) {
        if (str.length() > 0 && str.charAt(str.length() - 1) == '/') {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    public String androidx_core_content_FileProvider__getType$___twin___(Uri uri) {
        File fileLIZ = getLocalPathStrategy().LIZ(uri);
        int iLastIndexOf = fileLIZ.getName().lastIndexOf(46);
        if (iLastIndexOf >= 0) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileLIZ.getName().substring(iLastIndexOf + 1));
            if (mimeTypeFromExtension != null) {
                return mimeTypeFromExtension;
            }
            return "application/octet-stream";
        }
        return "application/octet-stream";
    }

    public static String androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_getType(FileProvider fileProvider, Uri uri) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                try {
                    Object obj = fileProvider.mLazyProviderInfo;
                    if (obj != null && (obj instanceof ProviderInfo)) {
                        try {
                            fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw new RuntimeException(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__getType$___twin___(uri);
    }

    public static File buildPath(File file, String... strArr) {
        for (String str : strArr) {
            if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    public static Object[] copyOf(Object[] objArr, int i) {
        Object[] objArr2 = new Object[i];
        System.arraycopy(objArr, 0, objArr2, 0, i);
        return objArr2;
    }

    public void androidx_core_content_FileProvider__attachInfo$___twin___(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (!providerInfo.exported) {
            if (providerInfo.grantUriPermissions) {
                String str = providerInfo.authority.split(";")[0];
                synchronized (this.mLock) {
                    try {
                        this.mAuthority = str;
                    } finally {
                    }
                }
                HashMap<String, InterfaceC2119608Sc> map = sCache;
                synchronized (map) {
                    try {
                        map.remove(str);
                    } finally {
                    }
                }
                return;
            }
            throw new SecurityException("Provider must grant uri permissions");
        }
        throw new SecurityException("Provider must not be exported");
    }

    public Uri androidx_core_content_FileProvider__insert$___twin___(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    public ParcelFileDescriptor androidx_core_content_FileProvider__openFile$___twin___(Uri uri, String str) {
        return ParcelFileDescriptor.open(getLocalPathStrategy().LIZ(uri), modeToMode(str));
    }

    public static String[] copyOf(String[] strArr, int i) {
        String[] strArr2 = new String[i];
        System.arraycopy(strArr, 0, strArr2, 0, i);
        return strArr2;
    }

    public static Uri androidx_core_content_FileProvider__getUriForFile$___twin___(Context context, String str, File file) {
        return getPathStrategy(context, str, 0).LIZIZ(file);
    }

    public static Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_insert(FileProvider fileProvider, Uri uri, ContentValues contentValues) {
        C2362209Nk.LIZ(uri, "insert");
        return fileProvider.androidx_core_content_FileProvider__insert$___twin___(uri, contentValues);
    }

    public static Uri androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(Context context, String str, File file) {
        if (C2361909Nh.LIZ) {
            String absolutePath = file.getAbsolutePath();
            try {
                int iLastIndexOf = absolutePath.lastIndexOf(47);
                if (iLastIndexOf > 0) {
                    absolutePath = absolutePath.substring(0, iLastIndexOf);
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, absolutePath);
                jSONObject.put("authority", str);
                jSONObject.put("path", absolutePath);
                C793770VBv.LJII("helios_file_provider_monitor", jSONObject, null, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return androidx_core_content_FileProvider__getUriForFile$___twin___(context, str, file);
    }

    public static void androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_attachInfo(FileProvider fileProvider, Context context, ProviderInfo providerInfo) {
        if (fileProvider != null) {
            if (fileProvider.getContext() == null) {
                if (!providerInfo.exported) {
                    if (providerInfo.grantUriPermissions) {
                        fileProvider.mLazyProviderInfo = providerInfo;
                        providerInfo.grantUriPermissions = false;
                        try {
                            fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
                        } catch (SecurityException e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        providerInfo.grantUriPermissions = true;
                        return;
                    }
                    throw new SecurityException("Provider must grant uri permissions");
                }
                throw new SecurityException("Provider must not be exported");
            }
            fileProvider.androidx_core_content_FileProvider__attachInfo$___twin___(context, providerInfo);
            return;
        }
        throw new NullPointerException("androidx_core_content_FileProvider__attachInfo$___twin___");
    }

    public static ParcelFileDescriptor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_openFile(FileProvider fileProvider, Uri uri, String str) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                try {
                    Object obj = fileProvider.mLazyProviderInfo;
                    if (obj != null && (obj instanceof ProviderInfo)) {
                        try {
                            fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw new RuntimeException(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return fileProvider.androidx_core_content_FileProvider__openFile$___twin___(uri, str);
    }

    public static InterfaceC2119608Sc getPathStrategy(Context context, String str, int i) {
        InterfaceC2119608Sc pathStrategy;
        HashMap<String, InterfaceC2119608Sc> map = sCache;
        synchronized (map) {
            try {
                pathStrategy = map.get(str);
                if (pathStrategy == null) {
                    try {
                        pathStrategy = parsePathStrategy(context, str, i);
                        map.put(str, pathStrategy);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                    } catch (XmlPullParserException e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return pathStrategy;
    }

    public static InterfaceC2119608Sc parsePathStrategy(Context context, String str, int i) throws Throwable {
        File fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir;
        C2119408Sa c2119408Sa = new C2119408Sa(str);
        XmlResourceParser fileProviderPathsMetaData = getFileProviderPathsMetaData(context, str, context.getPackageManager().resolveContentProvider(str, 128), i);
        while (true) {
            int next = fileProviderPathsMetaData.next();
            if (next != 1) {
                if (next == 2) {
                    String name = fileProviderPathsMetaData.getName();
                    String attributeValue = fileProviderPathsMetaData.getAttributeValue(null, "name");
                    String attributeValue2 = fileProviderPathsMetaData.getAttributeValue(null, "path");
                    if ("root-path".equals(name)) {
                        fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = DEVICE_ROOT;
                    } else if ("files-path".equals(name)) {
                        fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = INVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context);
                    } else if ("cache-path".equals(name)) {
                        fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = C786410Ut5.w2(context);
                    } else if ("external-path".equals(name)) {
                        fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = C786410Ut5.W3();
                    } else if ("external-files-path".equals(name)) {
                        File[] externalFilesDirs = context.getExternalFilesDirs(null);
                        if (externalFilesDirs.length > 0) {
                            fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = externalFilesDirs[0];
                        } else {
                            continue;
                        }
                    } else if ("external-cache-path".equals(name)) {
                        File[] externalCacheDirs = context.getExternalCacheDirs();
                        if (externalCacheDirs.length > 0) {
                            fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = externalCacheDirs[0];
                        } else {
                            continue;
                        }
                    } else if ("external-media-path".equals(name)) {
                        File[] fileArrLIZ = C2361809Ng.LIZ(context);
                        if (fileArrLIZ.length > 0) {
                            fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir = fileArrLIZ[0];
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                    if (fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir != null) {
                        File fileBuildPath = buildPath(fileINVOKEVIRTUAL_androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir, attributeValue2);
                        if (!TextUtils.isEmpty(attributeValue)) {
                            try {
                                c2119408Sa.LIZIZ.put(attributeValue, fileBuildPath.getCanonicalFile());
                            } catch (IOException e) {
                                TryCatchGuardChecker.doCheck(e);
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Failed to resolve canonical path for ");
                                sbLIZ.append(fileBuildPath);
                                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ), e);
                            }
                        } else {
                            throw new IllegalArgumentException("Name must not be empty");
                        }
                    } else {
                        continue;
                    }
                }
            } else {
                return c2119408Sa;
            }
        }
    }

    public int androidx_core_content_FileProvider__delete$___twin___(Uri uri, String str, String[] strArr) {
        return getLocalPathStrategy().LIZ(uri).delete() ? 1 : 0;
    }

    public static int androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_delete(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "delete");
        return fileProvider.androidx_core_content_FileProvider__delete$___twin___(uri, str, strArr);
    }

    public static int androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_delete(FileProvider fileProvider, Uri uri, String str, String[] strArr) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                try {
                    Object obj = fileProvider.mLazyProviderInfo;
                    if (obj != null && (obj instanceof ProviderInfo)) {
                        try {
                            fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw new RuntimeException(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_delete(fileProvider, uri, str, strArr);
    }

    public static XmlResourceParser getFileProviderPathsMetaData(Context context, String str, ProviderInfo providerInfo, int i) {
        if (providerInfo != null) {
            if (providerInfo.metaData == null && i != 0) {
                Bundle bundle = new Bundle(1);
                providerInfo.metaData = bundle;
                bundle.putInt("android.support.FILE_PROVIDER_PATHS", i);
            }
            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfo.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
            if (xmlResourceParserLoadXmlMetaData != null) {
                return xmlResourceParserLoadXmlMetaData;
            }
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Couldn't find meta-data for provider with authority ");
        sbLIZ.append(str);
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static Uri getUriForFile(Context context, String str, File file, String str2) {
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_FileProviderLancet_getUriForFile(context, str, file).buildUpon().appendQueryParameter("displayName", str2).build();
    }

    public int androidx_core_content_FileProvider__update$___twin___(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }

    public static int androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_update(FileProvider fileProvider, Uri uri, ContentValues contentValues, String str, String[] strArr) {
        C2362209Nk.LIZ(uri, "update");
        return fileProvider.androidx_core_content_FileProvider__update$___twin___(uri, contentValues, str, strArr);
    }

    public Cursor androidx_core_content_FileProvider__query$___twin___(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        String name;
        File fileLIZ = getLocalPathStrategy().LIZ(uri);
        String queryParameter = UriProtector.getQueryParameter(uri, "displayName");
        if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                if (queryParameter == null) {
                    name = fileLIZ.getName();
                } else {
                    name = queryParameter;
                }
                objArr[i2] = name;
            } else if ("_size".equals(str3)) {
                strArr3[i2] = "_size";
                i = i2 + 1;
                objArr[i2] = Long.valueOf(fileLIZ.length());
            }
            i2 = i;
        }
        String[] strArrCopyOf = copyOf(strArr3, i2);
        Object[] objArrCopyOf = copyOf(objArr, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf);
        return matrixCursor;
    }

    public static Cursor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_query(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        C2362209Nk.LIZ(uri, "query");
        return fileProvider.androidx_core_content_FileProvider__query$___twin___(uri, strArr, str, strArr2, str2);
    }

    public static Cursor androidx_core_content_FileProvider_com_ss_android_ugc_aweme_lancet_file_LazyFileProvider_query(FileProvider fileProvider, Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (fileProvider != null) {
            synchronized (fileProvider) {
                try {
                    Object obj = fileProvider.mLazyProviderInfo;
                    if (obj != null && (obj instanceof ProviderInfo)) {
                        try {
                            fileProvider.attachInfo(fileProvider.getContext(), (ProviderInfo) obj);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw new RuntimeException(th);
                        }
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        return androidx_core_content_FileProvider_com_ss_android_ugc_aweme_boot_source_StartSourceLancet_query(fileProvider, uri, strArr, str, strArr2, str2);
    }
}
