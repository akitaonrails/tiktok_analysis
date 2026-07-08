package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.net.URI;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.08m6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215208m6 extends File {
    public static final C2215108m5 LL = C2215408m8.LIZ;

    @Override // java.io.File
    public C2215208m6 getAbsoluteFile() {
        try {
            return new C2215208m6(getAbsolutePath());
        } catch (C2190508i7 e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public String getParent() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C2215208m6(parent).getPath();
        } catch (C2190508i7 e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public C2215208m6 getParentFile() {
        String parent = super.getParent();
        if (parent == null) {
            return null;
        }
        try {
            return new C2215208m6(parent);
        } catch (C2190508i7 e) {
            TryCatchGuardChecker.doCheck(e);
            e.toString();
            return null;
        }
    }

    @Override // java.io.File
    public C2215208m6[] listFiles() {
        String[] list = list();
        if (list == null) {
            return null;
        }
        int length = list.length;
        C2215208m6[] c2215208m6Arr = new C2215208m6[length];
        for (int i = 0; i < length; i++) {
            try {
                c2215208m6Arr[i] = new C2215208m6(getPath(), list[i]);
            } catch (C2190508i7 e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
            }
        }
        return c2215208m6Arr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2215208m6(URI uri) {
        C2215108m5 c2215108m5 = LL;
        c2215108m5.getClass();
        if (uri.isAbsolute()) {
            if (!uri.isOpaque()) {
                String scheme = uri.getScheme();
                if (scheme != null && scheme.equalsIgnoreCase("file")) {
                    if (uri.getAuthority() == null) {
                        if (uri.getFragment() == null) {
                            if (uri.getQuery() == null) {
                                String path = uri.getPath();
                                if (!path.equals("")) {
                                    if (path.endsWith("/") && path.length() > 1) {
                                        path = path.substring(0, path.length() - 1);
                                    }
                                    char c = File.separatorChar;
                                    path = c != '/' ? path.replace('/', c) : path;
                                    int length = path.length();
                                    char[] charArray = path.toCharArray();
                                    int i = 0;
                                    char c2 = 0;
                                    int i2 = 0;
                                    while (i < length) {
                                        char c3 = charArray[i];
                                        if (c3 != '/' || c2 != '/') {
                                            charArray[i2] = c3;
                                            i2++;
                                        }
                                        i++;
                                        c2 = c3;
                                    }
                                    if (c2 == '/' && length > 1) {
                                        i2--;
                                    }
                                    super(c2215108m5.LIZ(i2 != length ? new String(charArray, 0, i2) : path));
                                    return;
                                }
                                throw new IllegalArgumentException("URI path component is empty");
                            }
                            throw new IllegalArgumentException("URI has a query component");
                        }
                        throw new IllegalArgumentException("URI has a fragment component");
                    }
                    throw new IllegalArgumentException("URI has an authority component");
                }
                throw new IllegalArgumentException("URI scheme is not \"file\"");
            }
            throw new IllegalArgumentException("URI is not hierarchical");
        }
        throw new IllegalArgumentException("URI is not absolute");
    }

    @Override // java.io.File
    public C2215208m6[] listFiles(FileFilter fileFilter) {
        C2215208m6 c2215208m6;
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            try {
                c2215208m6 = new C2215208m6(getPath(), str);
            } catch (C2190508i7 e) {
                TryCatchGuardChecker.doCheck(e);
                e.toString();
                c2215208m6 = null;
            }
            if (fileFilter == null || fileFilter.accept(c2215208m6)) {
                arrayList.add(c2215208m6);
            }
        }
        return (C2215208m6[]) arrayList.toArray(new C2215208m6[arrayList.size()]);
    }

    public C2215208m6(String str) {
        super(LL.LIZ(str));
    }

    @Override // java.io.File
    public C2215208m6[] listFiles(FilenameFilter filenameFilter) {
        String[] list = list();
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (filenameFilter == null || filenameFilter.accept(this, str)) {
                try {
                    arrayList.add(new C2215208m6(getPath(), str));
                } catch (C2190508i7 e) {
                    TryCatchGuardChecker.doCheck(e);
                    e.toString();
                }
            }
        }
        return (C2215208m6[]) arrayList.toArray(new C2215208m6[arrayList.size()]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C2215208m6(File file, String str) {
        C2215108m5 c2215108m5 = LL;
        c2215108m5.getClass();
        if (str != null) {
            if (file != null) {
                if (file.getPath().equals("")) {
                    str = c2215108m5.LIZIZ("/", str);
                } else {
                    str = c2215108m5.LIZIZ(file.getPath(), str);
                }
            } else {
                str = c2215108m5.LIZ(str);
            }
        }
        super(str);
    }

    public C2215208m6(String str, String str2) {
        super(LL.LIZIZ(str, str2));
    }
}
