package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.LinkedList;
import java.util.List;
import webcast.api.game.TnsPiracyDetail;

/* JADX INFO: renamed from: X.01sU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C471201sU {
    public static C471401sW LIZ;
    public static C11JF LIZIZ;
    public static C11JF LIZJ;
    public static final LinkedList<TnsPiracyDetail> LIZLLL = new LinkedList<>();
    public static LinkedList<TnsPiracyDetail> LJ;

    public static void LIZIZ(TnsPiracyDetail tnsPiracyDetail) {
        boolean z;
        C471401sW c471401sW = LIZ;
        if (c471401sW == null) {
            return;
        }
        List<Double> list = tnsPiracyDetail.angle;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int size = tnsPiracyDetail.angle.size();
            for (int i = 0; i < size; i++) {
                ListProtector.set(tnsPiracyDetail.angle, i, Double.valueOf(0.0d));
            }
        }
        List<Double> list2 = tnsPiracyDetail.acceleration;
        if (list2 != null && !list2.isEmpty()) {
            int size2 = tnsPiracyDetail.acceleration.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ListProtector.set(tnsPiracyDetail.acceleration, i2, Double.valueOf(0.0d));
            }
        }
        tnsPiracyDetail.frontScreenClicks = 0L;
        tnsPiracyDetail.backScreenClicks = 0L;
        tnsPiracyDetail.microSound = 0L;
        tnsPiracyDetail.recordTime = 0L;
        LinkedList<TnsPiracyDetail> linkedList = LIZLLL;
        if (linkedList.size() <= c471401sW.LIZ && !linkedList.contains(tnsPiracyDetail)) {
            linkedList.add(tnsPiracyDetail);
        }
    }

    public static void LIZ(int i, int i2, int i3, int i4, boolean z, String str) {
        int i5;
        C471401sW c471401sW = LIZ;
        if (c471401sW == null) {
            return;
        }
        if (!z) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_tns_piracy_info_report_result");
        c474500IjALIZ.LJJII(c471401sW.LIZJ, "room_id");
        c474500IjALIZ.LJJII(c471401sW.LIZIZ, "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i5), "result");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "details_size");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_mic_volume_valid");
        c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_motion_data_valid");
        c474500IjALIZ.LJJII(str, "error_message");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }
}
