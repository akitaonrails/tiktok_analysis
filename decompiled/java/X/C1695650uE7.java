package X;

import android.os.Build;
import android.os.LocaleList;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695650uE7 {
    public static final InterfaceC1694540uCK LIZ;

    static {
        LIZ = Build.VERSION.SDK_INT >= 24 ? new InterfaceC1694540uCK() { // from class: X.0uE8
            public LocaleList LIZ;
            public C1694560uCM LIZIZ;
            public final C0NUG LIZJ = new C0NUG();

            @Override // X.InterfaceC1694540uCK
            public final C1694560uCM LIZ() {
                LocaleList localeList = LocaleList.getDefault();
                synchronized (this.LIZJ) {
                    try {
                        C1694560uCM c1694560uCM = this.LIZIZ;
                        if (c1694560uCM != null && localeList == this.LIZ) {
                            return c1694560uCM;
                        }
                        int size = localeList.size();
                        ArrayList arrayList = new ArrayList(size);
                        for (int i = 0; i < size; i++) {
                            arrayList.add(new C1694530uCJ(localeList.get(i)));
                        }
                        C1694560uCM c1694560uCM2 = new C1694560uCM(arrayList);
                        this.LIZ = localeList;
                        this.LIZIZ = c1694560uCM2;
                        return c1694560uCM2;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // X.InterfaceC1694540uCK
            public final Locale LIZIZ(String str) {
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                Intrinsics.LJFF(localeForLanguageTag.toLanguageTag(), "und");
                return localeForLanguageTag;
            }
        } : new InterfaceC1694540uCK() { // from class: X.0uE9
            @Override // X.InterfaceC1694540uCK
            public final C1694560uCM LIZ() {
                return new C1694560uCM(Collections.singletonList(new C1694530uCJ(Locale.getDefault())));
            }

            @Override // X.InterfaceC1694540uCK
            public final Locale LIZIZ(String str) {
                Locale localeForLanguageTag = Locale.forLanguageTag(str);
                Intrinsics.LJFF(localeForLanguageTag.toLanguageTag(), "und");
                return localeForLanguageTag;
            }
        };
    }
}
