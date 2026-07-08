package X;

import Y.AComparatorS22S0000000_3;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.AutoDismissPermissionDialog;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS374S0200000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ML5, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0ML5 {
    public static final C0ML5 LIZ = new C0ML5();
    public static final List<String> LIZIZ = (List) C292610BdT.LIZ.getValue();

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF() {
        /*
            X.0ML6 r0 = X.C0ML6.LIZ
            r0.getClass()
            com.bytedance.keva.Keva r1 = X.C0ML6.LIZ()
            java.lang.String r0 = "has_allow_scan_album"
            r2 = 0
            boolean r0 = r1.getBoolean(r0, r2)
            r4 = 1
            if (r0 == 0) goto L69
            X.0LGY r0 = X.C0LGY.LIZ
            r0.getClass()
            boolean r0 = X.C0LGY.LJFF()
            if (r0 == 0) goto L69
            r3 = 0
        L1f:
            X.01GW r1 = X.C272820Ame.LIZ
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r4) goto L6b
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L6b
            java.lang.Object r0 = r1.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 != r0) goto L68
            if (r3 == 0) goto L68
            X.01GW r0 = X.C272730AmV.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = X.C0ML6.LIZIZ(r0)
            if (r0 == 0) goto L68
            com.bytedance.keva.Keva r1 = X.C0ML6.LIZ()
            java.lang.String r0 = "num_of_show_recall_local_auth_dialog"
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 >= r0) goto L68
            r2 = 1
        L68:
            return r2
        L69:
            r3 = 1
            goto L1f
        L6b:
            if (r3 == 0) goto L80
            X.01GW r0 = X.C272730AmV.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            boolean r0 = X.C0ML6.LIZIZ(r0)
            if (r0 == 0) goto L80
            r2 = 1
        L80:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0ML5.LJFF():boolean");
    }

    public static boolean LIZ() {
        if (!C0CHK.LIZ()) {
            return false;
        }
        C0LGY.LIZ.getClass();
        if (!C0LGY.LJFF()) {
            return false;
        }
        C0ML6.LIZ.getClass();
        return C0ML6.LIZ().getBoolean("has_allow_scan_album", false);
    }

    public static boolean LIZJ(MediaModel mediaModel) {
        if (!LIZIZ.contains(mediaModel.albumClass.toLowerCase(Locale.ROOT)) && !((List) C292690Bdb.LIZ.getValue()).contains(mediaModel.mimeType)) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(MediaModel mediaModel) {
        if (!LIZIZ.contains(mediaModel.albumClass.toLowerCase(Locale.ROOT))) {
            long j = mediaModel.duration;
            if (j < 300000 && j >= 1000 && !((List) C292620BdU.LIZ.getValue()).contains(mediaModel.mimeType)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List LJ(String str, boolean z) {
        int i;
        boolean z2;
        String str2;
        List listSubList;
        int i2;
        int i3;
        C1429810nJL c1429810nJL = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start scan local medias, supportMonth=");
        sbLIZ.append(z);
        C201955140j.LJIILJJIL(c1429810nJL, C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Context contextM3 = C786410Ut5.M3(C0CHQ.LIZ);
        int i4 = 0;
        ArrayList arrayList = (ArrayList) C13LP.LJLIL(C2400609au.LIZIZ(contextM3, false, 1, 0, new C2400709av("%", null, 0L, 0L, "ASC", null, null, false, false, false, 1006), true, true, false, -1), C2400609au.LJIIIIZZ(contextM3, 1, 0, new C2400709av("%", null, 0L, 0L, "ASC", null, null, false, false, false, 1006), false, -1));
        if (arrayList.isEmpty()) {
            i = 1970;
        } else {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                long j = ((MediaModel) it2.next()).modify;
                while (it2.hasNext()) {
                    long j2 = ((MediaModel) it2.next()).modify;
                    if (j > j2) {
                        j = j2;
                    }
                }
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(j * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                i = calendar.get(1);
            } else {
                throw new NoSuchElementException();
            }
        }
        Calendar calendar2 = Calendar.getInstance();
        String str3 = (String) C0BSH.LIZ.getValue();
        if (str3 != null && str3.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            try {
                calendar2.setTime(new SimpleDateFormat("yyyy-MM-dd").parse(str3));
            } catch (ParseException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJII(C1429810nJL.LIZIZ, "mock date format is error");
            }
        }
        int i5 = calendar2.get(2);
        int i6 = calendar2.get(5);
        ArrayList arrayList2 = new ArrayList();
        int i7 = calendar2.get(1) - 1;
        if (i <= i7) {
            while (true) {
                calendar2.set(i7, i5, i6, i4, i4, i4);
                calendar2.set(14, i4);
                long timeInMillis = calendar2.getTimeInMillis();
                long j3 = LSPassThroughRecordSizeConfig.DEFAULT;
                long j4 = timeInMillis / j3;
                calendar2.set(i7, i5, i6, 23, 59, 59);
                calendar2.set(14, 999);
                long timeInMillis2 = calendar2.getTimeInMillis() / j3;
                List<MediaModel> listLJIIIIZZ = C2400609au.LJIIIIZZ(contextM3, -1, -1, new C2400709av("%", null, j4, timeInMillis2, null, null, null, i4, i4, i4, 1010), i4, -1);
                ArrayList arrayList3 = new ArrayList();
                for (MediaModel mediaModel : listLJIIIIZZ) {
                    LIZ.getClass();
                    if (LIZLLL(mediaModel)) {
                        arrayList3.add(mediaModel);
                    }
                }
                List<MediaModel> listLIZIZ = C2400609au.LIZIZ(contextM3, false, -1, -1, new C2400709av("%", null, j4, timeInMillis2, null, null, null, i4, i4, i4, 1010), true, true, false, -1);
                ArrayList arrayList4 = new ArrayList();
                for (MediaModel mediaModel2 : listLIZIZ) {
                    LIZ.getClass();
                    if (LIZJ(mediaModel2)) {
                        arrayList4.add(mediaModel2);
                    }
                }
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList3);
                arrayList5.addAll(arrayList4);
                if (arrayList5.size() > 1) {
                    C08XD.LJJ(arrayList5, new AComparatorS22S0000000_3(14));
                }
                arrayList2.addAll(arrayList5);
                if (i7 == i) {
                    break;
                }
                i7--;
                i4 = 0;
            }
        }
        if (arrayList2.isEmpty() && z) {
            Calendar calendar3 = Calendar.getInstance();
            int i8 = calendar3.get(2);
            ArrayList arrayList6 = new ArrayList();
            int i9 = calendar3.get(1) - 1;
            if (i <= i9) {
                while (true) {
                    calendar3.set(i9, i8, 1, 0, 0, 0);
                    long timeInMillis3 = calendar3.getTimeInMillis();
                    long j5 = LSPassThroughRecordSizeConfig.DEFAULT;
                    long j6 = timeInMillis3 / j5;
                    calendar3.set(i9, i8, 31, 0, 0, 0);
                    long timeInMillis4 = (calendar3.getTimeInMillis() - 1) / j5;
                    List<MediaModel> listLJIIIIZZ2 = C2400609au.LJIIIIZZ(contextM3, -1, -1, new C2400709av("%", null, j6, timeInMillis4, null, null, null, false, false, false, 1010), false, -1);
                    ArrayList arrayList7 = new ArrayList();
                    for (MediaModel mediaModel3 : listLJIIIIZZ2) {
                        LIZ.getClass();
                        if (LIZLLL(mediaModel3)) {
                            arrayList7.add(mediaModel3);
                        }
                    }
                    List<MediaModel> listLIZIZ2 = C2400609au.LIZIZ(contextM3, false, -1, -1, new C2400709av("%", null, j6, timeInMillis4, null, null, null, false, false, false, 1010), true, true, false, -1);
                    ArrayList arrayList8 = new ArrayList();
                    for (MediaModel mediaModel4 : listLIZIZ2) {
                        LIZ.getClass();
                        if (LIZJ(mediaModel4)) {
                            arrayList8.add(mediaModel4);
                        }
                    }
                    ArrayList arrayList9 = new ArrayList();
                    arrayList9.addAll(arrayList7);
                    arrayList9.addAll(arrayList8);
                    if (arrayList9.size() > 1) {
                        C08XD.LJJ(arrayList9, new AComparatorS22S0000000_3(13));
                    }
                    arrayList6.addAll(arrayList9);
                    if (i9 == i) {
                        break;
                    }
                    i9--;
                }
            }
            int size = arrayList6.size();
            str2 = "month";
            listSubList = arrayList6;
            if (size > 5) {
                listSubList = arrayList6.subList(0, 5);
            }
        } else {
            str2 = "day";
            listSubList = arrayList2;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        C0ML7.LIZ.getClass();
        boolean z3 = listSubList instanceof Collection;
        if (z3 && listSubList.isEmpty()) {
            i2 = 0;
        } else {
            Iterator it3 = listSubList.iterator();
            i2 = 0;
            while (it3.hasNext()) {
                if (((MediaModel) it3.next()).LJIIJ() && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        if (z3 && listSubList.isEmpty()) {
            i3 = 0;
        } else {
            Iterator it4 = listSubList.iterator();
            i3 = 0;
            while (it4.hasNext()) {
                if (((MediaModel) it4.next()).LJIILJJIL() && (i3 = i3 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("page_type", str);
        c0lab.LJ("scope", str2);
        c0lab.LIZIZ(jCurrentTimeMillis2, "duration");
        c0lab.LIZ(listSubList.size(), "cnt");
        c0lab.LIZ(i2, "photo_cnt");
        c0lab.LIZ(i3, "video_cnt");
        C20684815ws.LJIILLIIL("past_memory_fetch_album", c0lab.LIZ);
        C1429810nJL c1429810nJL2 = C1429810nJL.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("end scan local medias, size: ");
        sbLIZ2.append(listSubList.size());
        sbLIZ2.append(", cost: ");
        sbLIZ2.append(jCurrentTimeMillis2);
        sbLIZ2.append("ms");
        C201955140j.LJIILJJIL(c1429810nJL2, C2188811AlT.LIZIZ(sbLIZ2));
        return listSubList;
    }

    public static final void LJII(C19EG c19eg, Function0<Unit> function0) {
        AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(function0, (Function0<Unit>) 675);
        C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
        c1397580mTM.LJI(c19eg.getString(2131838694));
        c1397580mTM.LIZIZ(c19eg.getString(2131838693));
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS374S0200000_8(c19eg, awS552S0100000_8, 125));
        AutoDismissPermissionDialog autoDismissPermissionDialog = new AutoDismissPermissionDialog(c19eg, c1397580mTM);
        autoDismissPermissionDialog.LLILZ = new AwS587S0100000_8(awS552S0100000_8, 435);
        autoDismissPermissionDialog.LIZ();
    }

    public static boolean LIZIZ(Context context, ForwardMedia forwardMedia, String str) {
        MediaModel mediaModel = forwardMedia.localMedia;
        if (mediaModel == null) {
            return false;
        }
        String strLJIJ = C2471909mP.LJIJ(mediaModel);
        if (str == null) {
            str = "";
        }
        return C0L0K.LIZIZ(context, strLJIJ, str, false, 24);
    }

    public static void LJI(final C19EG c19eg, final VideoPublishEditModel videoPublishEditModel, String str, final List list, final Function0 function0, final Function0 function02) {
        C0LGY c0lgy = C0LGY.LIZ;
        c0lgy.getClass();
        if (C0LGY.LJFF()) {
            function0.invoke();
            return;
        }
        C523800KgU c523800KgU = new C523800KgU();
        c523800KgU.LIZ = "bpea-request_album_permission_on_this_day_target34";
        c523800KgU.LIZIZ = "bpea-request_album_permission_on_this_day_target33";
        c523800KgU.LIZJ = "request_album_permission_on_this_day";
        C523790KgT c523790KgTLIZ = c523800KgU.LIZ();
        C0ML7.LIZ.getClass();
        C0LAB c0lab = new C0LAB();
        C0ML7.LIZIZ(videoPublishEditModel, c0lab);
        c0lab.LJ("on_this_day_permission_popup_type", str);
        c0lab.LJ("type", "photo");
        c0lab.LJ("on_this_day_enter_method", C0ML7.LIZIZ);
        C0ML7.LJ(c0lab, list);
        C20684815ws.LJIILLIIL("asking_permission_show", c0lab.LIZ);
        final String str2 = "card";
        if (!Intrinsics.LJFF(str, "card")) {
            str2 = "pop_up";
        }
        C0L91 c0l91 = C0L91.IMAGE_AND_VIDEO;
        final String str3 = str2;
        InterfaceC540100LGe interfaceC540100LGe = new InterfaceC540100LGe() { // from class: X.0ML4
            @Override // X.InterfaceC540100LGe
            public final void LIZ(int[] iArr, String[] strArr) {
                C0ML7 c0ml7 = C0ML7.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                String str4 = str3;
                List<ForwardMedia> list2 = list;
                c0ml7.getClass();
                C0ML7.LJIIIZ(videoPublishEditModel2, 0, "not_allowed", str4, list2);
                C0ML5.LJII(c19eg, function02);
            }
        };
        C0LGZ c0lgz = new C0LGZ() { // from class: X.0ML3
            @Override // X.C0LGZ
            public final void LIZ(C0L9U c0l9u, String[] strArr, int[] iArr) {
                C0LGY.LIZ.getClass();
                if (C0LGY.LJI()) {
                    C0ML7 c0ml7 = C0ML7.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    String str4 = str2;
                    List<ForwardMedia> list2 = list;
                    c0ml7.getClass();
                    C0ML7.LJIIIZ(videoPublishEditModel2, 1, "select_photos", str4, list2);
                    C0ML5.LJII(c19eg, function02);
                    return;
                }
                function0.invoke();
                C0ML7 c0ml72 = C0ML7.LIZ;
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                String str5 = str2;
                List<ForwardMedia> list3 = list;
                c0ml72.getClass();
                C0ML7.LJIIIZ(videoPublishEditModel3, 1, "access_to_all_photo", str5, list3);
            }
        };
        c0lgy.getClass();
        C0LGY.LJIIJ(c19eg, c523790KgTLIZ.LIZ(), c0l91, interfaceC540100LGe, c0lgz);
    }
}
