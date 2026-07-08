package X;

import Y.ARunnableS22S1100000_17;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.livesetting.gift.GiftEventTrackSamplingSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0fjU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1138500fjU {
    public final AssetsModel LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final Long LJ;
    public final ConcurrentHashMap<String, String> LJFF;
    public long LJI;
    public boolean LJII;

    public final void LIZJ(boolean z) {
        String str;
        this.LJI = System.currentTimeMillis();
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJFF;
        if (concurrentHashMap != null) {
            if (z) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap.put("download_retry_count", str);
        }
        boolean z2 = this.LIZIZ;
        if (z2) {
            C01WH.LIZ(new ARunnableS22S1100000_17(this, "_self", 5));
        } else if (C2640010k.LIZIZ()) {
            C1140740fn6.LIZ().getClass();
            if (!C781880Ulm.LIZLLL) {
                C01WH.LIZ(new ARunnableS22S1100000_17(this, "_anchor", 5));
            }
        } else if (C1128450fTH.LJJIJ()) {
            C01WH.LIZ(new ARunnableS22S1100000_17(this, "_guest", 5));
        }
        if (!GiftEventTrackSamplingSetting.shouldBlock(this.LIZJ)) {
            if (GiftEventTrackSamplingSetting.enable() && (z2 || C2640010k.LIZIZ() || C1128450fTH.LJJIJ())) {
                return;
            }
            C01WH.LIZ(new ARunnableS22S1100000_17(this, "", 5));
        }
    }

    public final void LIZ(final boolean z, final C1141050fnb c1141050fnb, boolean z2) {
        boolean z3;
        final boolean z4;
        final boolean z5;
        String str;
        ConcurrentHashMap<String, String> concurrentHashMap = this.LJFF;
        if (concurrentHashMap != null) {
            if (z2) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            concurrentHashMap.put("download_retry_count", str);
        }
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = "";
        boolean z6 = this.LIZIZ;
        if (C2640010k.LIZIZ()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z6) {
            c259800zU.element = "_self";
        } else {
            if (z3) {
                C1140740fn6.LIZ().getClass();
                z4 = !C781880Ulm.LIZLLL;
                c259800zU.element = "_anchor";
            } else if (C1128450fTH.LJJIJ()) {
                c259800zU.element = "_guest";
            } else {
                z4 = !GiftEventTrackSamplingSetting.shouldBlock(this.LIZJ);
            }
            z5 = !z;
            if (z4 && !z5) {
                return;
            }
            C01WH.LIZ(new Runnable() { // from class: X.0fjT
                /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
                /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
                /* JADX WARN: Removed duplicated region for block: B:113:0x02e3  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
                /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZ() throws org.json.JSONException {
                    /*
                        Method dump skipped, instruction units count: 755
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1138490fjT.LIZ():void");
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LiveGiftEffectMsgLoadMonitor@e584.endDownload$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LiveGiftEffectMsgLoadMonitor@e584.endDownload$1");
                }
            });
        }
        z4 = true;
        z5 = !z;
        if (z4) {
        }
        C01WH.LIZ(new Runnable() { // from class: X.0fjT
            /* JADX WARN: Removed duplicated region for block: B:110:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:111:0x02dd  */
            /* JADX WARN: Removed duplicated region for block: B:113:0x02e3  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x0210  */
            /* JADX WARN: Removed duplicated region for block: B:97:0x0232  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ() throws org.json.JSONException {
                /*
                    Method dump skipped, instruction units count: 755
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.RunnableC1138490fjT.LIZ():void");
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LiveGiftEffectMsgLoadMonitor@e584.endDownload$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LiveGiftEffectMsgLoadMonitor@e584.endDownload$1");
            }
        });
    }

    public C1138500fjU(AssetsModel assetsModel, boolean z, boolean z2, String str, Long l, ConcurrentHashMap<String, String> concurrentHashMap) {
        this.LIZ = assetsModel;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
        this.LJ = l;
        this.LJFF = concurrentHashMap;
    }
}
