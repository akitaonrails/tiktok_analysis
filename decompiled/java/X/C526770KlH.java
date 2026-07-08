package X;

import Y.ACallableS240S0200000_8;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0KlH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C526770KlH {
    public static final C526770KlH LIZ = new C526770KlH();

    public static final void LIZJ(int i, int i2) {
        if (i != -6) {
            if (i != -5) {
                if (i != -2) {
                    if (i == -1) {
                        i = 1;
                    }
                } else {
                    i = 3;
                }
            } else {
                i = 0;
            }
        } else {
            i = 2;
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LIZ(i2, "type");
        c0lab.LIZ(i, "code");
        C2341909Fp.LIZ("tool_performance_asset_unavailable", c0lab.LIZ);
    }

    public static void LIZ(final ShortVideoContext shortVideoContext, List list, final int i, final int i2, final String str, final String str2, final String str3, final C528230Knd c528230Knd, final C524800Ki6 c524800Ki6) {
        if (list != null && !list.isEmpty()) {
            final ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(((MediaModel) it2.next()).clone());
            }
            C15O7.LIZJ(new ACallableS240S0200000_8(arrayList, list, 0)).LJ(new InterfaceC2385309Wh() { // from class: X.0Kqi
                @Override // X.InterfaceC2385309Wh
                public final Object then(C15O7<VEUtils.VEVideoFileInfo> c15o7) {
                    VEUtils.VEVideoFileInfo vEVideoFileInfoLJIIL;
                    MediaModel mediaModel;
                    String str4;
                    String str5;
                    boolean z;
                    Integer numValueOf;
                    String string;
                    Integer numValueOf2;
                    int i3;
                    Integer num;
                    String string2;
                    MediaModel next;
                    C1C7U.LIZ("VideoChosenResultLogger@55cc.mobUploadEvent$2");
                    C526770KlH c526770KlH = C526770KlH.LIZ;
                    ShortVideoContext shortVideoContext2 = shortVideoContext;
                    List<MediaModel> list2 = arrayList;
                    int i4 = i;
                    int i5 = i2;
                    if (c15o7 != null) {
                        vEVideoFileInfoLJIIL = c15o7.LJIIL();
                    } else {
                        vEVideoFileInfoLJIIL = null;
                    }
                    String str6 = str;
                    String str7 = str2;
                    String str8 = str3;
                    C528230Knd c528230Knd2 = c528230Knd;
                    C524800Ki6 c524800Ki62 = c524800Ki6;
                    c526770KlH.getClass();
                    if (list2 != null) {
                        Iterator<MediaModel> it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                next = it3.next();
                                if (next.LJIILJJIL()) {
                                    break;
                                }
                            } else {
                                next = null;
                                break;
                            }
                        }
                        mediaModel = next;
                    } else {
                        mediaModel = null;
                    }
                    if (c524800Ki62 == null || (str4 = c524800Ki62.LIZ) == null) {
                        str4 = "video";
                    }
                    if (list2.size() > 1) {
                        str5 = "multiple_content";
                    } else {
                        str5 = "single_content";
                    }
                    int size = list2.size() - i4;
                    String strLIZ = C560460LyW.LIZ(i4, list2.size() - i4);
                    if (list2.size() > 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = false;
                    int i6 = 0;
                    C528210Knb c528210Knb = new C528210Knb(shortVideoContext2, str4, str5, i4, size, strLIZ, z, C525670KjV.LIZ(list2), z2, z2, z2, C530690Krb.LIZ(list2), list2, c528230Knd2, 1792);
                    C0LAB c0lab = c528210Knb.LIZIZ;
                    String str9 = "";
                    if (str8 == null) {
                        str8 = "";
                    }
                    c0lab.LJ("tt_template_type", str8);
                    C0LAB c0lab2 = c528210Knb.LIZIZ;
                    if (str7 == null) {
                        str7 = "";
                    }
                    c0lab2.LJ("mv_name", str7);
                    c528210Knb.LIZJ(str6);
                    c528210Knb.LIZIZ.LIZ(0, "is_add_more");
                    c528210Knb.LIZIZ(i5);
                    if (vEVideoFileInfoLJIIL != null) {
                        numValueOf = Integer.valueOf(vEVideoFileInfoLJIIL.fps);
                    } else {
                        numValueOf = null;
                    }
                    C0LAB c0lab3 = c528210Knb.LIZIZ;
                    if (numValueOf == null || (string = numValueOf.toString()) == null) {
                        string = "";
                    }
                    c0lab3.LJ("fps", string);
                    if (vEVideoFileInfoLJIIL != null) {
                        numValueOf2 = Integer.valueOf(vEVideoFileInfoLJIIL.bitrate);
                    } else {
                        numValueOf2 = null;
                    }
                    C0LAB c0lab4 = c528210Knb.LIZIZ;
                    if (numValueOf2 != null && (string2 = numValueOf2.toString()) != null) {
                        str9 = string2;
                    }
                    c0lab4.LJ("file_bitrate", str9);
                    if (mediaModel != null) {
                        i6 = mediaModel.width;
                        i3 = mediaModel.height;
                    } else {
                        i3 = 0;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(Math.max(0, i6));
                    sbLIZ.append('*');
                    sbLIZ.append(Math.max(0, i3));
                    c528210Knb.LIZIZ.LJ("resolution", C2188811AlT.LIZIZ(sbLIZ));
                    c528210Knb.LIZLLL(shortVideoContext2);
                    if (c524800Ki62 != null && (num = c524800Ki62.LIZIZ) != null) {
                        c528210Knb.LIZIZ.LIZ(num.intValue(), "is_shown_in_picker");
                    }
                    c528210Knb.LIZ();
                    C1C7U.LIZIZ("VideoChosenResultLogger@55cc.mobUploadEvent$2");
                    return null;
                }
            }, C15O7.LJIIIIZZ, null);
        }
    }
}
