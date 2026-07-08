package X;

import android.os.Build;
import com.ss.android.ugc.aweme.im.contacts.api.util.ContactLocaleUtilBase;
import com.ss.android.ugc.aweme.im.contacts.impl.serviceimpl.ContactLocaleUtilBase1;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0orP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1489370orP {
    public static final ContactLocaleUtilBase LIZ;
    public static final C01GW LIZIZ;

    static {
        ContactLocaleUtilBase c1489360orO;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C818720W9u());
        LIZIZ = c01gwLIZIZ;
        final ArrayList arrayList = new ArrayList();
        arrayList.add(c01gwLIZIZ.getValue());
        if (Build.VERSION.SDK_INT > 24) {
            String strT2 = C786410Ut5.t2((Locale) c01gwLIZIZ.getValue());
            if (Intrinsics.LJFF(strT2, C786410Ut5.t2(Locale.CHINESE)) || Intrinsics.LJFF(strT2, C786410Ut5.t2(Locale.ENGLISH))) {
                c1489360orO = new C1489360orO(arrayList) { // from class: X.0orQ
                    @Override // X.C1489360orO
                    public final int LIZLLL(int i, String str) {
                        int iLIZJ = LIZJ(str.substring(i, i + 1));
                        char cCharAt = str.charAt(i);
                        if (i != 0 && Character.isLowerCase(cCharAt)) {
                            iLIZJ += 26;
                        }
                        if (iLIZJ == -1) {
                            if (Character.isDigit(cCharAt)) {
                                return (((this.LIZIZ + 1) + cCharAt) - 48) + 26;
                            }
                            if (C1489350orN.LJFF(cCharAt)) {
                                return this.LIZIZ + 1 + 36;
                            }
                            if (C1489350orN.LIZLLL(str.substring(i))) {
                                return 99;
                            }
                            return this.LIZIZ + 1 + 37;
                        }
                        return iLIZJ;
                    }
                };
            } else if (Intrinsics.LJFF(strT2, C786410Ut5.t2(Locale.JAPANESE))) {
                arrayList.add(Locale.CHINESE);
                c1489360orO = new C1489360orO(arrayList) { // from class: X.0orR
                    @Override // X.C1489360orO
                    public final int LIZJ(String str) {
                        boolean z;
                        if (str != null && str.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            return -1;
                        }
                        int iLIZJ = super.LIZJ(str);
                        if (iLIZJ == -1) {
                            return super.LIZJ(C1489350orN.LIZJ(str));
                        }
                        return iLIZJ;
                    }
                };
            } else {
                c1489360orO = Intrinsics.LJFF(strT2, C786410Ut5.t2(Locale.KOREAN)) ? new C1489360orO(arrayList) { // from class: X.0orS
                } : new C1489360orO(arrayList);
            }
        } else {
            Object objLIZ = C04TD.LIZ(ContactLocaleUtilBase.class, false);
            if (objLIZ != null) {
                c1489360orO = (ContactLocaleUtilBase) objLIZ;
            } else {
                if (C04TD.Y0 == null) {
                    synchronized (ContactLocaleUtilBase.class) {
                        if (C04TD.Y0 == null) {
                            C04TD.Y0 = new ContactLocaleUtilBase1();
                        }
                    }
                }
                c1489360orO = C04TD.Y0;
            }
        }
        LIZ = c1489360orO;
    }

    public static final String LIZ(String str) {
        return LIZ.LIZIZ(str);
    }
}
