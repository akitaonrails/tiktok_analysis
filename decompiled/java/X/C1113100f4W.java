package X;

import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenChainLogConfigSetting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0f4W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1113100f4W {
    public final List<InterfaceC1113260f4m> LIZ;
    public final C1118670fDV LIZIZ;
    public final C1118660fDU LIZJ;
    public final C1113170f4d LIZLLL;
    public final C1118710fDZ LJ;
    public final C1118720fDa LJFF;
    public final C1118730fDb LJI;

    public final void LIZ() {
        Iterator<InterfaceC1113260f4m> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            it2.next().start();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0fDV, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [X.0fDU, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fDZ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0fDa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.0fDb, java.lang.Object] */
    public C1113100f4W() {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        LivePublicScreenChainLogConfigSetting livePublicScreenChainLogConfigSetting = LivePublicScreenChainLogConfigSetting.INSTANCE;
        if (livePublicScreenChainLogConfigSetting.uploadPerf()) {
            final double dPerfSample = livePublicScreenChainLogConfigSetting.perfSample();
            ?? r0 = new AbstractC1118650fDT(dPerfSample) { // from class: X.0fDV
                @Override // X.InterfaceC1113260f4m
                public final void LIZIZ(Map<String, String> map) {
                    map.put("receive_tps", String.valueOf(this.LIZLLL.LIZ));
                    map.put("receive_tps_max", String.valueOf(this.LIZLLL.LIZIZ));
                    int i = this.LIZLLL.LIZJ;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    map.put("receive_tps_min", String.valueOf(i));
                }
            };
            arrayList.add(r0);
            this.LIZIZ = r0;
            ?? r02 = new AbstractC1118650fDT(dPerfSample) { // from class: X.0fDU
                @Override // X.InterfaceC1113260f4m
                public final void LIZIZ(Map<String, String> map) {
                    map.put("consumer_tps", String.valueOf(this.LIZLLL.LIZ));
                    map.put("consumer_tps_max", String.valueOf(this.LIZLLL.LIZIZ));
                    int i = this.LIZLLL.LIZJ;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    map.put("consumer_tps_min", String.valueOf(i));
                }
            };
            arrayList.add(r02);
            this.LIZJ = r02;
            C1113170f4d c1113170f4d = new C1113170f4d(dPerfSample);
            arrayList.add(c1113170f4d);
            this.LIZLLL = c1113170f4d;
            ?? r03 = new AbstractC1118700fDY(dPerfSample) { // from class: X.0fDZ
                @Override // X.InterfaceC1113260f4m
                public final void LIZIZ(Map<String, String> map) {
                    map.put("backup_buffer_count", String.valueOf(this.LIZIZ.LIZ));
                    map.put("backup_buffer_count_max", String.valueOf(this.LIZIZ.LIZIZ));
                    int i = this.LIZIZ.LIZJ;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    map.put("backup_buffer_count_min", String.valueOf(i));
                }
            };
            arrayList.add(r03);
            this.LJ = r03;
            ?? r04 = new AbstractC1118700fDY(dPerfSample) { // from class: X.0fDa
                @Override // X.InterfaceC1113260f4m
                public final void LIZIZ(Map<String, String> map) {
                    map.put("fold_buffer_count", String.valueOf(this.LIZIZ.LIZ));
                    map.put("fold_buffer_count_max", String.valueOf(this.LIZIZ.LIZIZ));
                    int i = this.LIZIZ.LIZJ;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    map.put("fold_buffer_count_min", String.valueOf(i));
                }
            };
            arrayList.add(r04);
            this.LJFF = r04;
            ?? r05 = new AbstractC1118700fDY(dPerfSample) { // from class: X.0fDb
                @Override // X.InterfaceC1113260f4m
                public final void LIZIZ(Map<String, String> map) {
                    map.put("refresh_buffer_count", String.valueOf(this.LIZIZ.LIZ));
                    map.put("refresh_buffer_count_max", String.valueOf(this.LIZIZ.LIZIZ));
                    int i = this.LIZIZ.LIZJ;
                    if (i == Integer.MAX_VALUE) {
                        i = 0;
                    }
                    map.put("refresh_buffer_count_min", String.valueOf(i));
                }
            };
            arrayList.add(r05);
            this.LJI = r05;
        }
    }
}
