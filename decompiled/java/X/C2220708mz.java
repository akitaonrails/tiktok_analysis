package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.soloader.SysUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08mz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2220708mz extends AbstractC2220508mx {
    public final C2220908n1[] LL;

    @Override // X.AbstractC2220508mx
    public final C2220308mv LIZ() {
        return new C2220308mv(this.LL);
    }

    @Override // X.AbstractC2220508mx
    public final AbstractC2221008n2 LIZIZ() {
        return new AbstractC2221008n2() { // from class: X.08n0
            public int LL;

            @Override // X.AbstractC2221008n2
            public final boolean LIZ() {
                return this.LL < this.LLILLJJLI.LL.length;
            }

            @Override // X.AbstractC2221008n2
            public final C2220408mw LIZIZ() throws IOException {
                C2220908n1[] c2220908n1Arr = this.LLILLJJLI.LL;
                int i = this.LL;
                this.LL = i + 1;
                C2220908n1 c2220908n1 = c2220908n1Arr[i];
                C0VSP c0vsp = new C0VSP(c2220908n1.LLILLL);
                try {
                    return new C2220408mw(c2220908n1, c0vsp);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c0vsp.close();
                    throw th;
                }
            }
        };
    }

    /* JADX WARN: Finally extract failed */
    public C2220708mz(C2220608my c2220608my, AbstractC2220208mu abstractC2220208mu) throws IOException {
        BufferedReader bufferedReader;
        int i;
        Context context = c2220608my.LIZLLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("/data/local/tmp/exopackage/");
        sbLIZ.append(context.getPackageName());
        sbLIZ.append("/native-libs/");
        C0VSJ c0vsj = new C0VSJ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : SysUtil.MarshmallowSysdeps.getSupportedAbis()) {
            C0VSJ c0vsj2 = new C0VSJ(c0vsj, str);
            if (c0vsj2.isDirectory()) {
                linkedHashSet.add(str);
                C0VSJ c0vsj3 = new C0VSJ(c0vsj2, "metadata.txt");
                if (c0vsj3.isFile()) {
                    C0VSF c0vsf = new C0VSF(c0vsj3);
                    try {
                        bufferedReader = new BufferedReader(c0vsf);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            c0vsf.close();
                            throw th;
                        } finally {
                            TryCatchGuardChecker.doCheck(th);
                            th.addSuppressed(th);
                        }
                    }
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line != null) {
                                if (line.length() != 0) {
                                    int iIndexOf = line.indexOf(32);
                                    if (iIndexOf != -1) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(line.substring(0, iIndexOf));
                                        sbLIZ2.append(".so");
                                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                                        int size = arrayList.size();
                                        while (true) {
                                            if (i < size) {
                                                i = ((C2220908n1) arrayList.get(i)).LL.equals(strLIZIZ) ? 0 : i + 1;
                                            } else {
                                                String strSubstring = line.substring(iIndexOf + 1);
                                                arrayList.add(new C2220908n1(new C0VSJ(c0vsj2, strSubstring), strLIZIZ, strSubstring));
                                                break;
                                            }
                                        }
                                    } else {
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("illegal line in exopackage metadata: [");
                                        sbLIZ3.append(line);
                                        sbLIZ3.append(e3.f);
                                        throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3));
                                    }
                                }
                            } else {
                                bufferedReader.close();
                                c0vsf.close();
                                break;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                            }
                            throw th2;
                        }
                        TryCatchGuardChecker.doCheck(th2);
                        c0vsf.close();
                        throw th2;
                    }
                }
                continue;
            }
        }
        linkedHashSet.toArray(new String[linkedHashSet.size()]);
        abstractC2220208mu.getClass();
        this.LL = (C2220908n1[]) arrayList.toArray(new C2220908n1[arrayList.size()]);
    }
}
