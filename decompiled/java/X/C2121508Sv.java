package X;

import android.os.Build;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08Sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2121508Sv {
    public static final Pattern LIZIZ = PatternProtector.compile("lib/([^/]+)/(.*\\.so)$");
    public final C08PR LIZ;

    public C2121508Sv(C08PR c08pr) {
        this.LIZ = c08pr;
    }

    public final Set LIZIZ() throws IOException {
        Set setLIZIZ = this.LIZ.LIZIZ();
        C08PR c08pr = this.LIZ;
        c08pr.getClass();
        ArrayList<String> arrayList = new ArrayList();
        C0VSJ c0vsj = new C0VSJ(c08pr.LJII(), "native-libraries");
        C08PR.LJFF(c0vsj);
        File[] fileArrListFiles = c0vsj.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                if (file.isDirectory()) {
                    arrayList.add(file.getName());
                }
            }
        }
        try {
            if (!AabPluginServiceImpl.LJ) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    if (!obj.toString().contains("ttwebview")) {
                        arrayList2.add(obj);
                    }
                }
                arrayList = arrayList2;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        for (String str : arrayList) {
            Iterator it2 = ((HashSet) setLIZIZ).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    C786410Ut5.j4("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str});
                    C08PR c08pr2 = this.LIZ;
                    c08pr2.getClass();
                    C0VSJ c0vsj2 = new C0VSJ(c08pr2.LJII(), "native-libraries");
                    C08PR.LJFF(c0vsj2);
                    C0VSJ c0vsjLJ = C08PR.LJ(c0vsj2, str);
                    C08PR.LJFF(c0vsjLJ);
                    C08PR.LIZLLL(c0vsjLJ);
                    break;
                }
                if (((C08T5) it2.next()).LIZIZ().equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        for (final C08T5 c08t5 : (HashSet) setLIZIZ) {
            final HashSet hashSet2 = new HashSet();
            LIZJ(c08t5, new C08T8() { // from class: X.08Sy
                @Override // X.C08T8
                public final void LIZ(final C09NU c09nu, Set set) {
                    Set set2 = hashSet2;
                    C2121508Sv c2121508Sv = this.LIZJ;
                    final C08T5 c08t52 = c08t5;
                    final HashSet hashSet3 = new HashSet();
                    c2121508Sv.LIZLLL(c08t52, set, new C08T9() { // from class: X.08Sw
                        @Override // X.C08T9
                        public final void LIZ(C08T7 c08t7, C0VSJ c0vsj3, boolean z) throws IOException {
                            hashSet3.add(c0vsj3);
                            if (!z) {
                                C786410Ut5.j4("NativeLibraryExtractor: split '%s' has native library '%s' that does not exist; extracting from '%s!%s' to '%s'", new Object[]{c08t52.LIZIZ(), c08t7.LIZ, c08t52.LIZ().getAbsolutePath(), c08t7.LIZIZ.getName(), c0vsj3.getAbsolutePath()});
                                ZipFile zipFile = c09nu;
                                ZipEntry zipEntry = c08t7.LIZIZ;
                                byte[] bArr = new byte[SpeechEngineDefines.TTS_WORK_MODE_BOTH];
                                if (c0vsj3.exists()) {
                                    c0vsj3.delete();
                                }
                                InputStream inputStream = zipFile.getInputStream(zipEntry);
                                try {
                                    C0VSV c0vsv = new C0VSV(c0vsj3);
                                    try {
                                        c0vsj3.setWritable(false, true);
                                        c0vsj3.setWritable(false, false);
                                        while (true) {
                                            int i = inputStream.read(bArr);
                                            if (i > 0) {
                                                c0vsv.write(bArr, 0, i);
                                            } else {
                                                c0vsv.close();
                                                inputStream.close();
                                                return;
                                            }
                                        }
                                    } finally {
                                    }
                                } catch (Throwable th2) {
                                    TryCatchGuardChecker.doCheck(th2);
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                            throw th2;
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C08T0.LIZ(th2, th3);
                                            throw th2;
                                        }
                                    }
                                    throw th2;
                                }
                            }
                        }
                    });
                    set2.addAll(hashSet3);
                }
            });
            C08PR c08pr3 = this.LIZ;
            String strLIZIZ = c08t5.LIZIZ();
            c08pr3.getClass();
            HashSet<File> hashSet3 = new HashSet();
            C0VSJ c0vsj3 = new C0VSJ(c08pr3.LJII(), "native-libraries");
            C08PR.LJFF(c0vsj3);
            C0VSJ c0vsjLJ2 = C08PR.LJ(c0vsj3, strLIZIZ);
            C08PR.LJFF(c0vsjLJ2);
            File[] fileArrListFiles2 = c0vsjLJ2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file2 : fileArrListFiles2) {
                    if (file2.isFile()) {
                        hashSet3.add(file2);
                    }
                }
            }
            for (File file3 : hashSet3) {
                if (!hashSet2.contains(file3)) {
                    C786410Ut5.j4("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file3.getAbsolutePath(), c08t5.LIZIZ(), c08t5.LIZ().getAbsolutePath()});
                    C08PR c08pr4 = this.LIZ;
                    c08pr4.getClass();
                    File parentFile = file3.getParentFile().getParentFile();
                    C0VSJ c0vsj4 = new C0VSJ(c08pr4.LJII(), "native-libraries");
                    C08PR.LJFF(c0vsj4);
                    if (!parentFile.equals(c0vsj4)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    C08PR.LIZLLL(file3);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final Set LIZ(C08T5 c08t5) throws IOException {
        if (((Boolean) C275470Aqv.LIZIZ.getValue()).booleanValue() && c08t5 != null && !a0.LJJIIZI(c08t5.toString(), ".config.arm", false)) {
            return null;
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        HashSet hashSet = new HashSet();
        LIZJ(c08t5, new C08T1(this, c08t5, hashSet, atomicBoolean));
        if (!atomicBoolean.get()) {
            return null;
        }
        return hashSet;
    }

    public static void LIZJ(C08T5 c08t5, C08T8 c08t8) throws IOException {
        try {
            C09NU c09nu = new C09NU(c08t5.LIZ());
            try {
                c08t5.LIZIZ();
                HashMap map = new HashMap();
                Enumeration<? extends ZipEntry> enumerationEntries = c09nu.entries();
                while (enumerationEntries.hasMoreElements()) {
                    ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                    Matcher matcher = LIZIZ.matcher(zipEntryNextElement.getName());
                    if (matcher.matches()) {
                        String strGroup = matcher.group(1);
                        String strGroup2 = matcher.group(2);
                        Set hashSet = (Set) map.get(strGroup);
                        if (hashSet == null) {
                            hashSet = new HashSet();
                            map.put(strGroup, hashSet);
                        }
                        hashSet.add(new C08T7(zipEntryNextElement, strGroup2));
                    }
                }
                HashMap map2 = new HashMap();
                for (String str : Build.SUPPORTED_ABIS) {
                    if (map.containsKey(str)) {
                        for (C08T7 c08t7 : (Set) map.get(str)) {
                            if (!map2.containsKey(c08t7.LIZ)) {
                                map2.put(c08t7.LIZ, c08t7);
                            }
                        }
                    }
                }
                c08t8.LIZ(c09nu, new HashSet(map2.values()));
                c09nu.close();
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                try {
                    c09nu.close();
                    throw e;
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C08T0.LIZ(e, e2);
                    throw e;
                }
            }
        } catch (IOException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw e3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.C08T5 r9, java.util.Set r10, X.C08T9 r11) {
        /*
            r8 = this;
            java.util.HashSet r10 = (java.util.HashSet) r10
            java.util.Iterator r7 = r10.iterator()
        L6:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L59
            java.lang.Object r6 = r7.next()
            X.08T7 r6 = (X.C08T7) r6
            X.08PR r0 = r8.LIZ
            java.lang.String r4 = r9.LIZIZ()
            java.lang.String r3 = r6.LIZ
            r0.getClass()
            X.0VSJ r2 = new X.0VSJ
            X.0VSJ r1 = r0.LJII()
            java.lang.String r0 = "native-libraries"
            r2.<init>(r1, r0)
            X.C08PR.LJFF(r2)
            X.0VSJ r0 = X.C08PR.LJ(r2, r4)
            X.C08PR.LJFF(r0)
            X.0VSJ r5 = X.C08PR.LJ(r0, r3)
            boolean r0 = r5.exists()
            if (r0 == 0) goto L57
            long r3 = r5.length()
            java.util.zip.ZipEntry r0 = r6.LIZIZ
            long r1 = r0.getSize()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L57
            boolean r0 = r5.canWrite()
            r1 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L57
        L53:
            r11.LIZ(r6, r5, r1)
            goto L6
        L57:
            r1 = 0
            goto L53
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2121508Sv.LIZLLL(X.08T5, java.util.Set, X.08T9):void");
    }
}
