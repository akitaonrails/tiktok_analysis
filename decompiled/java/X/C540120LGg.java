package X;

import android.content.Context;
import android.os.Build;
import com.bytedance.bpea.cert.token.TokenCert;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LGg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540120LGg {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZLLL() {
        if (Build.VERSION.SDK_INT < 33 || !LIZ(new String[]{"android.permission.READ_MEDIA_IMAGES"})) {
            return LIZIZ("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        return true;
    }

    public static boolean LJ() {
        return Build.VERSION.SDK_INT >= 34 && LIZIZ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") && !LIZIZ("android.permission.READ_MEDIA_IMAGES");
    }

    public static boolean LIZ(String[] strArr) {
        C844470XAv.LIZ.getClass();
        Context contextLIZ = C844470XAv.LIZ();
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(Integer.valueOf(C838410Wul.LIZ(contextLIZ, str)));
        }
        for (int i : C13LP.LLII(arrayList)) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(String str) {
        return LIZ(new String[]{str});
    }

    public static String[] LIZJ(EnumC540140LGi enumC540140LGi) {
        boolean z;
        boolean z2;
        String[] strArr;
        if (enumC540140LGi != EnumC540140LGi.IMAGE && enumC540140LGi != EnumC540140LGi.IMAGE_AND_VIDEO) {
            z = false;
        } else {
            z = true;
        }
        if (enumC540140LGi != EnumC540140LGi.VIDEO && enumC540140LGi != EnumC540140LGi.IMAGE_AND_VIDEO) {
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

    public static boolean LJI(C19EG c19eg, EnumC540140LGi enumC540140LGi) {
        String[] strArrLIZJ = LIZJ(enumC540140LGi);
        for (String str : strArrLIZJ) {
            if (!LIZIZ(str)) {
                if (Build.VERSION.SDK_INT >= 34 && LIZIZ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") && !(LIZIZ("android.permission.READ_MEDIA_IMAGES") ^ LIZIZ("android.permission.READ_MEDIA_VIDEO"))) {
                    return false;
                }
                for (String str2 : strArrLIZJ) {
                    if (!LIZIZ(str2)) {
                        C19741112Lp.LIZ.getClass();
                        if (!C19741112Lp.LJI(c19eg, str2, true)) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static void LJFF(C19EG c19eg, TokenCert tokenCert, final EnumC540140LGi enumC540140LGi, final InterfaceC540170LGl interfaceC540170LGl, final InterfaceC540160LGk interfaceC540160LGk) {
        int i;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission");
        final String[] strArrLIZJ = LIZJ(enumC540140LGi);
        if (LIZ(strArrLIZJ)) {
            C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(before): allPermissionsGranted 1");
            C0L9V c0l9v = C0L9V.GRANTED_BEFORE_REQUEST;
            ArrayList arrayList = new ArrayList(strArrLIZJ.length);
            int length = strArrLIZJ.length;
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(0);
            }
            C13LP.LLII(arrayList);
            interfaceC540160LGk.LIZ(c0l9v);
            return;
        }
        if (Build.VERSION.SDK_INT >= 34 && LIZIZ("android.permission.READ_MEDIA_VISUAL_USER_SELECTED") && !(LIZIZ("android.permission.READ_MEDIA_IMAGES") ^ LIZIZ("android.permission.READ_MEDIA_VIDEO"))) {
            C201955140j.LJIILL(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(before): allPermissionsGranted 2");
            C0L9V c0l9v2 = C0L9V.GRANTED_BEFORE_REQUEST;
            ArrayList arrayList2 = new ArrayList(strArrLIZJ.length);
            for (String str : strArrLIZJ) {
                if (LIZIZ(str)) {
                    i = 0;
                } else {
                    i = -1;
                }
                arrayList2.add(Integer.valueOf(i));
            }
            C13LP.LLII(arrayList2);
            interfaceC540160LGk.LIZ(c0l9v2);
            return;
        }
        final boolean zLJI = LJI(c19eg, enumC540140LGi);
        C537680L6w.LIZ(c533790Kwb, "MediaPermissionChecker", "requestMediaPermission(after)", new Throwable("by who"));
        C19514711Wn.LIZIZ.LIZIZ(c19eg, tokenCert).LIZIZ((String[]) Arrays.copyOf(strArrLIZJ, strArrLIZJ.length)).LIZJ(new InterfaceC19515111Wr() { // from class: X.0LGf
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
                arrayList3.toArray(new String[0]);
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
                C13LQ.LJJLIIIJLLLLLLLZ((Integer[]) arrayList4.toArray(new Integer[0]));
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
                                int i6 = C540130LGh.LIZIZ[enumC442280HVy.ordinal()];
                                if (i6 != 1) {
                                    if (i6 == 2 || i6 == 3) {
                                        int i7 = C540130LGh.LIZ[enumC540140LGi.ordinal()];
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
                                        if (C540120LGg.LIZ(strArr)) {
                                            C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionGranted 2");
                                            InterfaceC540160LGk interfaceC540160LGk2 = interfaceC540160LGk;
                                            if (interfaceC540160LGk2 == null) {
                                                return;
                                            }
                                            interfaceC540160LGk2.LIZ(C0L9V.GRANTED_AFTER_REQUEST);
                                            return;
                                        }
                                        C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionDenied 1");
                                        InterfaceC540170LGl interfaceC540170LGl2 = interfaceC540170LGl;
                                        if (interfaceC540170LGl2 == null) {
                                            return;
                                        }
                                        interfaceC540170LGl2.LIZ(zLJI);
                                        return;
                                    }
                                } else {
                                    C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionGranted 1");
                                    InterfaceC540160LGk interfaceC540160LGk3 = interfaceC540160LGk;
                                    if (interfaceC540160LGk3 == null) {
                                        return;
                                    }
                                    interfaceC540160LGk3.LIZ(C0L9V.GRANTED_AFTER_REQUEST);
                                    return;
                                }
                            }
                        } else {
                            i3++;
                        }
                    }
                    C201955140j.LJIILL(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(>34): onPermissionDenied 2");
                    InterfaceC540170LGl interfaceC540170LGl3 = interfaceC540170LGl;
                    if (interfaceC540170LGl3 != null) {
                        interfaceC540170LGl3.LIZ(zLJI);
                        return;
                    }
                    return;
                }
                if (C540120LGg.LIZ(strArrLIZJ)) {
                    C537680L6w.LIZ(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(<34): onPermissionGranted", null);
                    InterfaceC540160LGk interfaceC540160LGk4 = interfaceC540160LGk;
                    if (interfaceC540160LGk4 == null) {
                        return;
                    }
                    interfaceC540160LGk4.LIZ(C0L9V.GRANTED_AFTER_REQUEST);
                    return;
                }
                C537680L6w.LIZ(C533790Kwb.LIZIZ, "MediaPermissionChecker", "requestMediaPermission(<34): onPermissionDenied", null);
                InterfaceC540170LGl interfaceC540170LGl4 = interfaceC540170LGl;
                if (interfaceC540170LGl4 == null) {
                    return;
                }
                interfaceC540170LGl4.LIZ(zLJI);
            }
        });
    }
}
