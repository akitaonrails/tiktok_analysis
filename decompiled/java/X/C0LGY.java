package X;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LGY, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LGY {
    public static final C0LGY LIZ = new C0LGY();

    public static boolean LJFF() {
        if (Build.VERSION.SDK_INT < 33 || !LIZ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"})) {
            return LIZLLL("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return true;
    }

    public static boolean LJI() {
        if (Build.VERSION.SDK_INT >= 34 && LIZLLL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
            return (LIZLLL("android.permission.READ_MEDIA_IMAGES") && LIZLLL("android.permission.READ_MEDIA_VIDEO")) ? false : true;
        }
        return false;
    }

    public static boolean LJII() {
        int i = Build.VERSION.SDK_INT;
        return i < 33 ? LIZLLL("android.permission.READ_EXTERNAL_STORAGE") : i < 34 ? LIZ(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}) : LIZLLL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED");
    }

    public static boolean LIZ(String[] strArr) {
        Application application = C0CHQ.LIZ;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(application, str)));
        }
        for (int i : C13LP.LLII(arrayList)) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(C0L91 c0l91) {
        String[] strArr;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            int i2 = C524390KhR.LIZ[c0l91.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
                }
            } else {
                strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
            }
            if (LIZ(strArr) || (i >= 34 && LIZLLL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED"))) {
                return true;
            }
        }
        return LIZLLL("android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean LIZLLL(String str) {
        return LIZ(new String[]{str});
    }

    public static String[] LJ(C0L91 c0l91) {
        boolean z;
        boolean z2;
        String[] strArr;
        if (c0l91 != C0L91.IMAGE && c0l91 != C0L91.IMAGE_AND_VIDEO) {
            z = false;
        } else {
            z = true;
        }
        if (c0l91 != C0L91.VIDEO && c0l91 != C0L91.IMAGE_AND_VIDEO) {
            z2 = false;
        } else {
            z2 = true;
        }
        int i = Build.VERSION.SDK_INT;
        String str = "android.permission.READ_MEDIA_VIDEO";
        String str2 = "android.permission.READ_MEDIA_IMAGES";
        if (i >= 34) {
            strArr = new String[3];
            strArr[0] = "android.permission.READ_MEDIA_VISUAL_USER_SELECTED";
            if (!z) {
                str2 = null;
            }
            strArr[1] = str2;
            if (!z2) {
                str = null;
            }
            strArr[2] = str;
        } else if (i >= 33) {
            strArr = new String[2];
            if (!z) {
                str2 = null;
            }
            strArr[0] = str2;
            if (!z2) {
                str = null;
            }
            strArr[1] = str;
        } else {
            strArr = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        }
        return (String[]) ((ArrayList) C13LP.LJJJJLI(C13LQ.LJLI(strArr))).toArray(new String[0]);
    }

    public static final Pair<String, Integer> LJIIIIZZ(String str) {
        LIZ.getClass();
        return new Pair<>(str, Integer.valueOf(LIZLLL(str) ? 1 : 0));
    }

    public static void LJIIJJI(C19EG c19eg, C0L91 c0l91, TokenCert tokenCert, Function0 function0) {
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        if (LJI()) {
            C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCert).LIZIZ((String[]) Arrays.copyOf(new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_IMAGES"}, 3)).LIZJ(new C581140Mqm(function0, 5));
        } else {
            C0L0I.LIZ.getClass();
            C0L0I.LIZ(c19eg, c0l91);
        }
    }

    public static void LJIIIZ(C0LGY c0lgy, C19EG c19eg, TokenCert tokenCert, InterfaceC540100LGe interfaceC540100LGe, C0LGZ c0lgz) {
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        c0lgy.getClass();
        LJIIJ(c19eg, tokenCert, c0l91, interfaceC540100LGe, c0lgz);
    }

    public static void LJIIJ(Activity activity, TokenCert tokenCert, final C0L91 c0l91, final InterfaceC540100LGe interfaceC540100LGe, final C0LGZ c0lgz) {
        int i;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission");
        final String[] strArrLJ = LJ(c0l91);
        if (LIZ(strArrLJ)) {
            C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(before): allPermissionsGranted 1");
            if (c0lgz != null) {
                C0L9U c0l9u = C0L9U.GRANTED_BEFORE_REQUEST;
                ArrayList arrayList = new ArrayList(strArrLJ.length);
                int length = strArrLJ.length;
                for (int i2 = 0; i2 < length; i2++) {
                    arrayList.add(0);
                }
                c0lgz.LIZ(c0l9u, strArrLJ, C13LP.LLII(arrayList));
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && LIZLLL("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") && !(LIZLLL("android.permission.READ_MEDIA_IMAGES") ^ LIZLLL("android.permission.READ_MEDIA_VIDEO"))) {
            C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(before): allPermissionsGranted 2");
            if (c0lgz != null) {
                C0L9U c0l9u2 = C0L9U.GRANTED_BEFORE_REQUEST;
                ArrayList arrayList2 = new ArrayList(strArrLJ.length);
                for (String str : strArrLJ) {
                    LIZ.getClass();
                    if (LIZLLL(str)) {
                        i = 0;
                    } else {
                        i = -1;
                    }
                    arrayList2.add(Integer.valueOf(i));
                }
                c0lgz.LIZ(c0l9u2, strArrLJ, C13LP.LLII(arrayList2));
                return;
            }
            return;
        }
        C537680L6w.LIZ(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(after)", new Throwable("by who"));
        C19514711Wn.LIZIZ.LIZIZ(activity, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArrLJ, strArrLJ.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0LGc
            @Override // X.InterfaceC19515111Wr
            public final void onCanceled() {
            }

            @Override // X.InterfaceC19515111Wr
            public final void LIZ(C0HWO... c0hwoArr) {
                String[] strArr;
                ArrayList arrayList3 = new ArrayList(c0hwoArr.length);
                int i3 = 0;
                for (C0HWO c0hwo : c0hwoArr) {
                    arrayList3.add(c0hwo.LIZ);
                }
                String[] strArr2 = (String[]) arrayList3.toArray(new String[0]);
                ArrayList arrayList4 = new ArrayList(c0hwoArr.length);
                int length2 = c0hwoArr.length;
                int i4 = 0;
                while (true) {
                    int i5 = -1;
                    if (i4 >= length2) {
                        break;
                    }
                    if (c0hwoArr[i4].LIZ()) {
                        i5 = 0;
                    }
                    arrayList4.add(Integer.valueOf(i5));
                    i4++;
                }
                int[] iArrLJJLIIIJLLLLLLLZ = C13LQ.LJJLIIIJLLLLLLLZ((Integer[]) arrayList4.toArray(new Integer[0]));
                if (Build.VERSION.SDK_INT >= 34) {
                    int length3 = c0hwoArr.length;
                    while (true) {
                        if (i3 >= length3) {
                            break;
                        }
                        C0HWO c0hwo2 = c0hwoArr[i3];
                        if (Intrinsics.LJFF(c0hwo2.LIZ, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED")) {
                            EnumC442280HVy enumC442280HVy = c0hwo2.LIZIZ;
                            if (enumC442280HVy != null) {
                                int i6 = C540090LGd.LIZIZ[enumC442280HVy.ordinal()];
                                if (i6 != 1) {
                                    if (i6 == 2 || i6 == 3) {
                                        int i7 = C540090LGd.LIZ[c0l91.ordinal()];
                                        if (i7 != 1) {
                                            if (i7 != 2) {
                                                if (i7 == 3) {
                                                    strArr = new String[]{"android.permission.READ_MEDIA_VIDEO"};
                                                } else {
                                                    throw new C1954807lC();
                                                }
                                            } else {
                                                strArr = new String[]{"android.permission.READ_MEDIA_IMAGES"};
                                            }
                                        } else {
                                            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
                                        }
                                        C0LGY.LIZ.getClass();
                                        if (C0LGY.LIZ(strArr)) {
                                            C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionGranted 2");
                                            C0LGZ c0lgz2 = c0lgz;
                                            if (c0lgz2 == null) {
                                                return;
                                            }
                                            c0lgz2.LIZ(C0L9U.GRANTED_AFTER_REQUEST, strArr, iArrLJJLIIIJLLLLLLLZ);
                                            return;
                                        }
                                        C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionDenied 1");
                                        InterfaceC540100LGe interfaceC540100LGe2 = interfaceC540100LGe;
                                        if (interfaceC540100LGe2 == null) {
                                            return;
                                        }
                                        interfaceC540100LGe2.LIZ(iArrLJJLIIIJLLLLLLLZ, strArr);
                                        return;
                                    }
                                } else {
                                    C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionGranted 1");
                                    C0LGZ c0lgz3 = c0lgz;
                                    if (c0lgz3 == null) {
                                        return;
                                    }
                                    c0lgz3.LIZ(C0L9U.GRANTED_AFTER_REQUEST, strArr2, iArrLJJLIIIJLLLLLLLZ);
                                    return;
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                    C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionDenied 2");
                    InterfaceC540100LGe interfaceC540100LGe3 = interfaceC540100LGe;
                    if (interfaceC540100LGe3 != null) {
                        interfaceC540100LGe3.LIZ(iArrLJJLIIIJLLLLLLLZ, strArr2);
                        return;
                    }
                    return;
                }
                C0LGY c0lgy = C0LGY.LIZ;
                String[] strArr3 = strArrLJ;
                c0lgy.getClass();
                if (C0LGY.LIZ(strArr3)) {
                    C537680L6w.LIZ(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(<34): onPermissionGranted", null);
                    C0LGZ c0lgz4 = c0lgz;
                    if (c0lgz4 == null) {
                        return;
                    }
                    c0lgz4.LIZ(C0L9U.GRANTED_AFTER_REQUEST, strArr2, iArrLJJLIIIJLLLLLLLZ);
                    return;
                }
                C537680L6w.LIZ(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(<34): onPermissionDenied", null);
                InterfaceC540100LGe interfaceC540100LGe4 = interfaceC540100LGe;
                if (interfaceC540100LGe4 == null) {
                    return;
                }
                interfaceC540100LGe4.LIZ(iArrLJJLIIIJLLLLLLLZ, strArr2);
            }
        });
    }
}
