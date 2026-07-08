package X;

import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0Wuv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838510Wuv {
    public static final C838510Wuv LIZIZ = LIZ(new Locale[0]);
    public final InterfaceC838530Wux LIZ;

    public final boolean LIZLLL() {
        return this.LIZ.isEmpty();
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ.toString();
    }

    public C838510Wuv(InterfaceC838530Wux interfaceC838530Wux) {
        this.LIZ = interfaceC838530Wux;
    }

    public static C838510Wuv LIZ(final Locale... localeArr) {
        if (Build.VERSION.SDK_INT >= 24) {
            return LJ(C838520Wuw.LIZ(localeArr));
        }
        return new C838510Wuv(new InterfaceC838530Wux(localeArr) { // from class: X.0Wuy
            public static final Locale[] LIZJ = new Locale[0];
            public final Locale[] LIZ;
            public final String LIZIZ;

            static {
                new Locale("en", "XA");
                new Locale("ar", "XB");
                String[] strArrSplit = "en-Latn".split("-", -1);
                if (strArrSplit.length > 2) {
                    new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
                    return;
                }
                if (strArrSplit.length > 1) {
                    new Locale(strArrSplit[0], strArrSplit[1]);
                    return;
                }
                if (strArrSplit.length == 1) {
                    new Locale(strArrSplit[0]);
                    return;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Can not parse language tag: [");
                sbLIZ.append("en-Latn");
                sbLIZ.append(e3.f);
                throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
            }

            @Override // X.InterfaceC838530Wux
            public final Object LIZ() {
                return null;
            }

            public final int hashCode() {
                int iHashCode = 1;
                for (Locale locale : this.LIZ) {
                    iHashCode = (iHashCode * 31) + locale.hashCode();
                }
                return iHashCode;
            }

            @Override // X.InterfaceC838530Wux
            public final boolean isEmpty() {
                return this.LIZ.length == 0;
            }

            @Override // X.InterfaceC838530Wux
            public final int size() {
                return this.LIZ.length;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder(e3.e);
                int i = 0;
                while (true) {
                    Locale[] localeArr2 = this.LIZ;
                    if (i >= localeArr2.length) {
                        sb.append(e3.f);
                        return sb.toString();
                    }
                    sb.append(localeArr2[i]);
                    if (i < this.LIZ.length - 1) {
                        sb.append(',');
                    }
                    i++;
                }
            }

            @Override // X.InterfaceC838530Wux
            public final String LIZIZ() {
                return this.LIZIZ;
            }

            {
                if (localeArr.length == 0) {
                    this.LIZ = LIZJ;
                    this.LIZIZ = "";
                    return;
                }
                ArrayList arrayList = new ArrayList();
                HashSet hashSet = new HashSet();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < localeArr.length; i++) {
                    Locale locale = localeArr[i];
                    if (locale != null) {
                        if (!hashSet.contains(locale)) {
                            Locale locale2 = (Locale) locale.clone();
                            arrayList.add(locale2);
                            sb.append(C786410Ut5.t2(locale2));
                            String strG0 = C2204961BRm.g0(locale2, new C0WZX("dTF6Tg0zW9KSVlgzQFyLdfDhwn3uNqMaIWfXZTjbb/MWKzKF9oEaGg==", new String[]{"01789"}));
                            if (strG0 != null && !strG0.isEmpty()) {
                                sb.append('-');
                                sb.append(C2204961BRm.g0(locale2, new C0WZX("dTF6Tg0zW9KSVlgzQFyLdfDhwn3uNqMaIWfXZTjbb/MWKzKF9oEaGg==", new String[]{"01789"})));
                            }
                            if (i < localeArr.length - 1) {
                                sb.append(',');
                            }
                            hashSet.add(locale2);
                        }
                    } else {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("list[");
                        sbLIZ.append(i);
                        sbLIZ.append("] is null");
                        throw new NullPointerException(C2188811AlT.LIZIZ(sbLIZ));
                    }
                }
                this.LIZ = (Locale[]) arrayList.toArray(new Locale[0]);
                this.LIZIZ = sb.toString();
            }

            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof C838540Wuy)) {
                    return false;
                }
                Locale[] localeArr2 = ((C838540Wuy) obj).LIZ;
                if (this.LIZ.length != localeArr2.length) {
                    return false;
                }
                int i = 0;
                while (true) {
                    Locale[] localeArr3 = this.LIZ;
                    if (i >= localeArr3.length) {
                        return true;
                    }
                    if (!localeArr3[i].equals(localeArr2[i])) {
                        return false;
                    }
                    i++;
                }
            }

            @Override // X.InterfaceC838530Wux
            public final Locale get(int i) {
                if (i >= 0) {
                    Locale[] localeArr2 = this.LIZ;
                    if (i < localeArr2.length) {
                        return localeArr2[i];
                    }
                    return null;
                }
                return null;
            }
        });
    }

    public static C838510Wuv LIZIZ(String str) {
        if (str != null && !str.isEmpty()) {
            String[] strArrSplit = str.split(",", -1);
            int length = strArrSplit.length;
            Locale[] localeArr = new Locale[length];
            for (int i = 0; i < length; i++) {
                localeArr[i] = Locale.forLanguageTag(strArrSplit[i]);
            }
            return LIZ(localeArr);
        }
        return LIZIZ;
    }

    public static C838510Wuv LJ(final LocaleList localeList) {
        return new C838510Wuv(new InterfaceC838530Wux(localeList) { // from class: X.0Wv0
            public final LocaleList LIZ;

            @Override // X.InterfaceC838530Wux
            public final String LIZIZ() {
                return this.LIZ.toLanguageTags();
            }

            public final int hashCode() {
                return this.LIZ.hashCode();
            }

            @Override // X.InterfaceC838530Wux
            public final boolean isEmpty() {
                return this.LIZ.isEmpty();
            }

            @Override // X.InterfaceC838530Wux
            public final int size() {
                return this.LIZ.size();
            }

            public final String toString() {
                return this.LIZ.toString();
            }

            @Override // X.InterfaceC838530Wux
            public final Object LIZ() {
                return this.LIZ;
            }

            {
                this.LIZ = (LocaleList) localeList;
            }

            public final boolean equals(Object obj) {
                return this.LIZ.equals(((InterfaceC838530Wux) obj).LIZ());
            }

            @Override // X.InterfaceC838530Wux
            public final Locale get(int i) {
                return this.LIZ.get(i);
            }
        });
    }

    public final Locale LIZJ(int i) {
        return this.LIZ.get(i);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C838510Wuv) && this.LIZ.equals(((C838510Wuv) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
