package X;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Uai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C775020Uai implements AudioDeviceModule.AudioFocusChangedCallBack {
    public static final C775020Uai LIZ = new C775020Uai();

    @Override // com.ss.ttlivestreamer.core.engine.AudioDeviceModule.AudioFocusChangedCallBack
    public final void LIZ(List<C775050Ual> list) {
        boolean z;
        Map<String, Object> map = C1338270kvh.LIZ;
        ArrayList<C775050Ual> arrayList = (ArrayList) list;
        if (arrayList.size() > 1) {
            for (C775050Ual c775050Ual : arrayList) {
                if (c775050Ual.LIZIZ == 1) {
                    if (c775050Ual.LIZ != 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Map<String, Object> map2 = C1338270kvh.LIZ;
                    if (C774950Uab.LIZJ && z != C774950Uab.LIZLLL) {
                        if (z) {
                            Iterator<InterfaceC775040Uak> it2 = C774950Uab.LJII.iterator();
                            while (it2.hasNext()) {
                                it2.next().LIZ();
                            }
                        } else {
                            Iterator<InterfaceC775040Uak> it3 = C774950Uab.LJII.iterator();
                            while (it3.hasNext()) {
                                it3.next().LIZIZ();
                            }
                        }
                    }
                    C774950Uab.LIZLLL = z;
                }
            }
        }
    }
}
