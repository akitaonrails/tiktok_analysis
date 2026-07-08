package X;

import com.bytedance.android.livesdk.chatroom.api.SMBOptInStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0mp4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411040mp4 {
    public static final List<SMBOptInStep> LIZIZ(List<SMBOptInStep> list) {
        ArrayList arrayList = new ArrayList();
        for (SMBOptInStep sMBOptInStep : list) {
            if (C1697810uHb.LJIIJJI(2, 3, 4).contains(Integer.valueOf(sMBOptInStep.type))) {
                arrayList.add(sMBOptInStep);
            }
        }
        return arrayList;
    }

    public static final List<SMBOptInStep> LIZ(List<SMBOptInStep> list, boolean z) {
        List<SMBOptInStep> listLIZJ = LIZJ(list, z);
        ArrayList arrayList = new ArrayList();
        for (SMBOptInStep sMBOptInStep : listLIZJ) {
            if (sMBOptInStep.type != 3) {
                arrayList.add(sMBOptInStep);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (((SMBOptInStep) it2.next()).type == 9) {
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : arrayList) {
                        if (((SMBOptInStep) obj).type != 2) {
                            arrayList2.add(obj);
                        }
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }

    public static final List<SMBOptInStep> LIZJ(List<SMBOptInStep> list, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (SMBOptInStep sMBOptInStep : list) {
            if (!C1697810uHb.LJIIJJI(5, 6, 7).contains(Integer.valueOf(sMBOptInStep.type))) {
                arrayList.add(sMBOptInStep);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            SMBOptInStep sMBOptInStep2 = (SMBOptInStep) obj;
            if (sMBOptInStep2.type != 8 || !sMBOptInStep2.isCompleted) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!C1697810uHb.LJIIJJI(2, 3).contains(Integer.valueOf(((SMBOptInStep) obj2).type)) || !z) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }
}
