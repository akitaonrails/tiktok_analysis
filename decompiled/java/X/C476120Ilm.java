package X;

import Y.AfS143S0200000_7;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.livesetting.LiveWidgetExitRoomCheckParamsSetting;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Ilm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476120Ilm {
    public static final C11JH LIZ(C11NZ c11nz, InterfaceC475810IlH interfaceC475810IlH, Map map) {
        boolean z;
        if (C08SQ.LIZ && LiveWidgetExitRoomCheckParamsSetting.INSTANCE.enable() && map != null) {
            try {
                Set<Map.Entry> setEntrySet = map.entrySet();
                if (setEntrySet != null) {
                    for (Map.Entry entry : setEntrySet) {
                        boolean z2 = C08SQ.LIZ;
                        C1970207ng.LIZ(entry.getValue());
                    }
                }
            } finally {
                if (z) {
                }
            }
        }
        C19500811Re c19500811ReLJJLIIJ = c11nz.LJJLIIJ();
        interfaceC475810IlH.LIZ(map);
        c19500811ReLJJLIIJ.LJJLL(new AfS143S0200000_7((Object) interfaceC475810IlH, (EmoteModel) map, (InterfaceC1631620sYq<? super EmoteModel, ? super String, ? super Integer, Unit>) 46), new C09JN() { // from class: X.00RJ
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PersistenceTaskManagerKt@677b.trans2NonCancelableObservable$disposable$2");
                C20441214yg.LJFF("PersistenceTaskUtil", "trans2NonCancelableObservable", (Throwable) obj);
                C1C7U.LIZIZ("PersistenceTaskManagerKt@677b.trans2NonCancelableObservable$disposable$2");
            }
        });
        return c19500811ReLJJLIIJ.LJJIIZ(new C521850KdL(interfaceC475810IlH, 11));
    }
}
