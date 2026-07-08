package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.SysUtil;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;

/* JADX INFO: renamed from: X.08n5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C2221308n5 extends AbstractC2220508mx {
    public C2221608n8[] LL;
    public final C09NU LLILLJJLI;
    public final AbstractC2220208mu LLILLL;
    public final /* synthetic */ C2221808nA LLILZ;

    @Override // X.AbstractC2220508mx
    public final C2220308mv LIZ() {
        return new C2220308mv(LIZLLL());
    }

    @Override // X.AbstractC2220508mx
    public final AbstractC2221008n2 LIZIZ() {
        return new AbstractC2221008n2() { // from class: X.08n7
            public int LL;

            @Override // X.AbstractC2221008n2
            public final boolean LIZ() {
                this.LLILLJJLI.LIZLLL();
                return this.LL < this.LLILLJJLI.LL.length;
            }

            @Override // X.AbstractC2221008n2
            public final C2220408mw LIZIZ() throws IOException {
                this.LLILLJJLI.LIZLLL();
                C2221308n5 c2221308n5 = this.LLILLJJLI;
                C2221608n8[] c2221608n8Arr = c2221308n5.LL;
                int i = this.LL;
                this.LL = i + 1;
                C2221608n8 c2221608n8 = c2221608n8Arr[i];
                InputStream inputStream = c2221308n5.LLILLJJLI.getInputStream(c2221608n8.LLILLL);
                try {
                    return new C2220408mw(c2221608n8, inputStream);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th;
                }
            }
        };
    }

    public final C2221608n8[] LIZLLL() {
        int i;
        if (this.LL == null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(this.LLILZ.LJIIIIZZ);
            String[] supportedAbis = SysUtil.MarshmallowSysdeps.getSupportedAbis();
            Enumeration<? extends ZipEntry> enumerationEntries = this.LLILLJJLI.entries();
            while (true) {
                i = 0;
                if (!enumerationEntries.hasMoreElements()) {
                    break;
                }
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    while (true) {
                        if (i >= supportedAbis.length) {
                            break;
                        }
                        String str = supportedAbis[i];
                        if (str == null || !strGroup.equals(str)) {
                            i++;
                        } else if (i >= 0) {
                            linkedHashSet.add(strGroup);
                            C2221608n8 c2221608n8 = (C2221608n8) map.get(strGroup2);
                            if (c2221608n8 == null || i < c2221608n8.LLILZ) {
                                map.put(strGroup2, new C2221608n8(strGroup2, zipEntryNextElement, i));
                            }
                        }
                    }
                }
            }
            AbstractC2220208mu abstractC2220208mu = this.LLILLL;
            linkedHashSet.toArray(new String[linkedHashSet.size()]);
            abstractC2220208mu.getClass();
            C2221608n8[] c2221608n8Arr = (C2221608n8[]) map.values().toArray(new C2221608n8[map.size()]);
            Arrays.sort(c2221608n8Arr);
            int i2 = 0;
            for (int i3 = 0; i3 < c2221608n8Arr.length; i3++) {
                C2221608n8 c2221608n82 = c2221608n8Arr[i3];
                ZipEntry zipEntry = c2221608n82.LLILLL;
                String str2 = c2221608n82.LL;
                C2221708n9 c2221708n9 = (C2221708n9) this;
                String name = zipEntry.getName();
                if (str2.equals(c2221708n9.LLIZ.LJ)) {
                    c2221708n9.LLIZ.LJ = null;
                    C786410Ut5.j4("allowing consideration of corrupted lib %s", new Object[]{str2});
                } else if ((c2221708n9.LLILZLL & 1) == 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("allowing consideration of ");
                    sbLIZ.append(name);
                    sbLIZ.append(": self-extraction preferred");
                    C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    C0VSJ c0vsj = new C0VSJ(c2221708n9.LLILZIL, str2);
                    try {
                        if (!c0vsj.getCanonicalPath().startsWith(c2221708n9.LLILZIL.getCanonicalPath())) {
                            C786410Ut5.j4("not allowing consideration of %s: %s not in lib dir", new Object[]{name, str2});
                        } else if (c0vsj.isFile()) {
                            long length = c0vsj.length();
                            long size = zipEntry.getSize();
                            if (length != size) {
                                C786410Ut5.j4("allowing consideration of %s: sysdir file length is %s, but the file is %s bytes long in the APK", new Object[]{c0vsj, Long.valueOf(length), Long.valueOf(size)});
                            } else {
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("not allowing consideration of ");
                                sbLIZ2.append(name);
                                sbLIZ2.append(": deferring to libdir");
                                C2188811AlT.LIZIZ(sbLIZ2);
                            }
                        } else {
                            C786410Ut5.j4("allowing consideration of %s: %s not in system lib dir", new Object[]{name, str2});
                        }
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        C786410Ut5.j4("not allowing consideration of %s: %s, IOException when constructing path: %s", new Object[]{name, str2, e.toString()});
                    }
                    c2221608n8Arr[i3] = null;
                }
                i2++;
            }
            C2221608n8[] c2221608n8Arr2 = new C2221608n8[i2];
            int i4 = 0;
            while (i < c2221608n8Arr.length) {
                C2221608n8 c2221608n83 = c2221608n8Arr[i];
                if (c2221608n83 != null) {
                    c2221608n8Arr2[i4] = c2221608n83;
                    i4++;
                }
                i++;
            }
            this.LL = c2221608n8Arr2;
        }
        return this.LL;
    }

    @Override // X.AbstractC2220508mx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LLILLJJLI.close();
    }

    public C2221308n5(C2221808nA c2221808nA, AbstractC2220208mu abstractC2220208mu) {
        this.LLILZ = c2221808nA;
        this.LLILLJJLI = new C09NU(c2221808nA.LJII);
        this.LLILLL = abstractC2220208mu;
    }
}
