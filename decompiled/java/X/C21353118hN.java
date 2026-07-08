package X;

import Y.ARunnableS11S2100000_23;
import android.widget.FrameLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18hN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21353118hN implements InterfaceC1164530gPT, InterfaceC687370Qxj {
    public static final C21353118hN LL = new C21353118hN();
    public static final C054G LLILLJJLI;
    public static C21353418hQ LLILLL;
    public static volatile boolean LLILZ;

    static {
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        LLILLJJLI = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ.LLIILII()));
    }

    public static void LJ() {
        C21353418hQ c21353418hQ = LLILLL;
        if (c21353418hQ == null) {
            return;
        }
        if (!c21353418hQ.LJII) {
            LIZLLL(c21353418hQ);
            LLILLL = null;
        } else {
            if (LJIIJJI()) {
                return;
            }
            LLILLL = null;
        }
    }

    public final void LJI() {
        if (LLILZ) {
            return;
        }
        synchronized (this) {
            try {
                if (LLILZ) {
                    return;
                }
                LLILZ = true;
                IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter != null) {
                    C21353118hN c21353118hN = LL;
                    iEventCenter.LIZLLL("ttkec_replay_preload", c21353118hN);
                    iEventCenter.LIZLLL("ttkec_replay_dispose", c21353118hN);
                }
                List<InterfaceC687370Qxj> list = C687360Qxi.LIZ;
                C687360Qxi.LIZ(LL);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC687370Qxj
    public final void onLowMemory() {
        C23250099c.LIZLLL(LLILLJJLI, null, null, new C21353818hU(null), 3);
    }

    public static final boolean LJFF() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_replay_preload", false);
    }

    public static boolean LJIIJJI() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LIZ("enable_replay_reuse", false);
    }

    public static C1568780qvU LIZIZ(JSONObject jSONObject) {
        return LIZ(LJIIIZ(jSONObject, "room_id", "roomId", "roomID"), LJIIIZ(jSONObject, "order_id", "orderId", "orderID"), LJIIIZ(jSONObject, "order_create_time_ms", "orderCreateTimeMs", "createOrderTimestamp", "createTimestamp", "order_create_timestamp", "create_timestamp"), LJIIIZ(jSONObject, "enter_from", "enterFrom"), LJIIIZ(jSONObject, "previous_page", "previousPage"));
    }

    public static Map LIZJ(C1568780qvU c1568780qvU) {
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("EVENT_ORIGIN_FEATURE", "TEMAI");
        pairArr[1] = new Pair("room_id", c1568780qvU.LIZ);
        String str = c1568780qvU.LJ;
        if (str == null) {
            str = "order_detail";
        }
        pairArr[2] = new Pair("previous_page", str);
        pairArr[3] = new Pair("page_name", "video_receipt");
        String str2 = c1568780qvU.LIZLLL;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        pairArr[4] = new Pair("enter_from", str2);
        String str4 = c1568780qvU.LIZLLL;
        if (str4 != null) {
            str3 = str4;
        }
        pairArr[5] = new Pair("enter_from_info", str3);
        pairArr[6] = new Pair("order_id", c1568780qvU.LIZIZ);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static void LIZLLL(C21353418hQ c21353418hQ) {
        AnonymousClass0956 anonymousClass0956 = c21353418hQ.LJIJJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c21353418hQ.LIZJ();
        InterfaceC1482530ogN interfaceC1482530ogN = c21353418hQ.LJIJ;
        if (interfaceC1482530ogN != null) {
            try {
                c21353418hQ.LIZIZ.getPlayer().LJJIIZ(interfaceC1482530ogN);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            c21353418hQ.LJIJ = null;
        }
        C09AE c09ae = c21353418hQ.LJIJI;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
        }
        c21353418hQ.LJIJI = null;
        try {
            c21353418hQ.LIZIZ.LIZIZ();
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static boolean LJIIIIZZ(FrameLayout frameLayout) {
        boolean zIsAttachedToWindow = frameLayout.isAttachedToWindow();
        boolean zIsShown = frameLayout.isShown();
        int width = frameLayout.getWidth();
        int height = frameLayout.getHeight();
        if (zIsAttachedToWindow && zIsShown && width > 0 && height > 0) {
            return true;
        }
        return false;
    }

    public static String LJIIIZ(JSONObject jSONObject, String... strArr) {
        for (String str : strArr) {
            String string = a0.LJLIIIL(jSONObject.optString(str, "")).toString();
            if (string.length() > 0) {
                return string;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    @Override // X.InterfaceC1164530gPT
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "ttkec_replay_preload"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            r4 = 3
            r3 = 0
            if (r0 == 0) goto L4e
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Exception -> L10
            r6.<init>(r9)     // Catch: java.lang.Exception -> L10
            goto L19
        L10:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
        L19:
            X.0qvU r2 = LIZIZ(r6)
            if (r2 != 0) goto L6a
            java.lang.String r5 = "data"
            org.json.JSONObject r1 = r6.optJSONObject(r5)
            if (r1 == 0) goto L32
            X.18hN r0 = X.C21353118hN.LL
            r0.getClass()
            X.0qvU r2 = LIZIZ(r1)
            if (r2 != 0) goto L6a
        L32:
            java.lang.String r0 = ""
            java.lang.String r2 = r6.optString(r5, r0)
            boolean r0 = kotlin.text.a0.LJJJIL(r2)
            r0 = r0 ^ 1
            if (r0 == 0) goto L4c
            if (r2 == 0) goto L4c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L48
            r1.<init>(r2)     // Catch: java.lang.Exception -> L48
            goto L61
        L48:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L4c:
            r2 = r3
            goto L6a
        L4e:
            java.lang.String r0 = "ttkec_replay_dispose"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L74
            X.054G r1 = X.C21353118hN.LLILLJJLI
            X.18hW r0 = new X.18hW
            r0.<init>(r3)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
            return
        L61:
            X.18hN r0 = X.C21353118hN.LL
            r0.getClass()
            X.0qvU r2 = LIZIZ(r1)
        L6a:
            X.054G r1 = X.C21353118hN.LLILLJJLI
            X.18hM r0 = new X.18hM
            r0.<init>(r2, r3)
            X.C23250099c.LIZLLL(r1, r3, r3, r0, r4)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21353118hN.onEvent(java.lang.String, java.lang.String):void");
    }

    public static void LJIILIIL(C1568780qvU c1568780qvU, boolean z, String str) {
        Map mapLJIIJ;
        if (c1568780qvU != null) {
            mapLJIIJ = LIZJ(c1568780qvU);
        } else {
            mapLJIIJ = C2097608Jq.LJIIJ(new Pair("EVENT_ORIGIN_FEATURE", "TEMAI"), new Pair("room_id", ""), new Pair("previous_page", ""), new Pair("page_name", "video_receipt"), new Pair("enter_from", ""), new Pair("enter_from_info", ""), new Pair("order_id", ""));
        }
        mapLJIIJ.put("has_cache", Boolean.valueOf(z));
        mapLJIIJ.put("trigger_by", str);
        C1018703yb.LIZIZ("rd_tiktokec_replay_dispose_cache", mapLJIIJ);
    }

    public static void LJIILJJIL(C1568780qvU c1568780qvU, boolean z, String str) {
        Map mapLIZJ = LIZJ(c1568780qvU);
        mapLIZJ.put("has_reset", Boolean.valueOf(z));
        if (str != null) {
            mapLIZJ.put("fail_reason", str);
        }
        C1018703yb.LIZIZ("rd_tiktokec_replay_reset_cache", mapLIZJ);
    }

    public static void LJII(long j, FrameLayout frameLayout, VideoInfo videoInfo, C21353418hQ c21353418hQ) {
        float duration;
        int width;
        InterfaceC1479620obg interfaceC1479620obg;
        if (!c21353418hQ.LJII && LLILLL == c21353418hQ && c21353418hQ.LJIJJLI == frameLayout && LJIIIIZZ(frameLayout)) {
            C1488750oqP c1488750oqP = c21353418hQ.LIZIZ;
            if (j < 0) {
                j = 0;
            }
            c1488750oqP.setStartTimeMs(j);
            c21353418hQ.LJIIIIZZ = true;
            c21353418hQ.LJIILL = 1;
            C1488750oqP c1488750oqP2 = c21353418hQ.LIZIZ;
            long j2 = c1488750oqP2.LLJJIJI;
            c1488750oqP2.LLJJIJI = 0L;
            if (Intrinsics.LJFF(c1488750oqP2.LLJJIJIL, videoInfo.videoId) && (interfaceC1479620obg = c1488750oqP2.LLJILJILJ) != null) {
                c1488750oqP2.LIZLLL();
                c1488750oqP2.getPlayer().LJFF(new C1484040oio(interfaceC1479620obg, frameLayout));
                return;
            }
            Video video = videoInfo.video;
            if (video != null) {
                duration = video.getDuration();
            } else {
                duration = 0.0f;
            }
            c1488750oqP2.LLJJIJIIJIL = duration / 1000.0f;
            final String str = videoInfo.videoId;
            c1488750oqP2.LLJJIJIL = str;
            final WeakReference weakReference = new WeakReference(c1488750oqP2);
            C1482560ogQ c1482560ogQLIZ = c1488750oqP2.LIZ(videoInfo, j2, new OnPreRenderListener() { // from class: X.0oqT
                @Override // com.ss.android.ugc.aweme.player.sdk.api.OnPreRenderListener
                public final void onPreRenderReady(String str2) {
                    C1488750oqP c1488750oqP3 = weakReference.get();
                    if (c1488750oqP3 == null) {
                        return;
                    }
                    String str3 = str;
                    if ((str2 != null && !Intrinsics.LJFF(str2, str3)) || !Intrinsics.LJFF(c1488750oqP3.LLJJIJIL, str3)) {
                        return;
                    }
                    HandlerHook.viewPost(c1488750oqP3, new ARunnableS11S2100000_23(weakReference, str, str2, 11));
                }
            });
            c1488750oqP2.LLJILJILJ = c1482560ogQLIZ;
            if (c1482560ogQLIZ == null) {
                return;
            }
            Video video2 = videoInfo.video;
            int height = 0;
            if (video2 != null) {
                width = video2.getWidth();
            } else {
                width = 0;
            }
            Video video3 = videoInfo.video;
            if (video3 != null) {
                height = video3.getHeight();
            }
            c1488750oqP2.LJIIJ(width, height);
            c1488750oqP2.LIZLLL();
            c1488750oqP2.getPlayer().LJFF(new C1484040oio(c1482560ogQLIZ, frameLayout));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0077 A[PHI: r1
      0x0077: PHI (r1v7 java.lang.Integer) = (r1v6 java.lang.Integer), (r1v16 java.lang.Integer) binds: [B:20:0x006b, B:22:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.18ha, android.view.View$OnLayoutChangeListener] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIIL(final X.C21353418hQ r13, final com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo r14, final long r15, java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21353118hN.LJIIL(X.18hQ, com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo, long, java.lang.String):boolean");
    }

    public static C1568780qvU LIZ(String str, String str2, String str3, String str4, String str5) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        if (str == null || (string = a0.LJLIIIL(str).toString()) == null || string.length() <= 0 || str2 == null || (string2 = a0.LJLIIIL(str2).toString()) == null || string2.length() <= 0 || str3 == null || (string3 = a0.LJLIIIL(str3).toString()) == null || string3.length() <= 0) {
            return null;
        }
        if (str4 == null || (string4 = a0.LJLIIIL(str4).toString()) == null || string4.length() <= 0) {
            string4 = null;
        }
        if (str5 == null || (string5 = a0.LJLIIIL(str5).toString()) == null || string5.length() <= 0) {
            string5 = null;
        }
        return new C1568780qvU(string, string2, string3, string4, string5);
    }

    public static final void LJIIJ(C013C c013c, C21353418hQ c21353418hQ, C259800zU<InterfaceC1482530ogN> c259800zU, C259800zU<C09AE> c259800zU2, long j, int i, C188G c188g, boolean z, String str) {
        InterfaceC1482530ogN interfaceC1482530ogN;
        C09AE c09ae;
        if (c013c.element) {
            return;
        }
        c013c.element = true;
        InterfaceC1484830ok5 player = c21353418hQ.LIZIZ.getPlayer();
        InterfaceC1482530ogN interfaceC1482530ogN2 = c259800zU.element;
        if (interfaceC1482530ogN2 == null) {
            interfaceC1482530ogN = null;
        } else {
            interfaceC1482530ogN = interfaceC1482530ogN2;
        }
        player.LJJIIZ(interfaceC1482530ogN);
        InterfaceC1482530ogN interfaceC1482530ogN3 = c21353418hQ.LJIJ;
        InterfaceC1482530ogN interfaceC1482530ogN4 = c259800zU.element;
        if (interfaceC1482530ogN4 == null) {
            interfaceC1482530ogN4 = null;
        }
        if (interfaceC1482530ogN3 == interfaceC1482530ogN4) {
            c21353418hQ.LJIJ = null;
        }
        C09AE c09ae2 = c259800zU2.element;
        if (c09ae2 == null) {
            c09ae = null;
        } else {
            c09ae = c09ae2;
        }
        c09ae.LIZIZ(null);
        C09AE c09ae3 = c21353418hQ.LJIJI;
        C09AE c09ae4 = c259800zU2.element;
        if (c09ae4 == null) {
            c09ae4 = null;
        }
        if (c09ae3 == c09ae4) {
            c21353418hQ.LJIJI = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 0) {
            jCurrentTimeMillis = 0;
        }
        int i2 = (int) jCurrentTimeMillis;
        if (LLILLL == c21353418hQ && c21353418hQ.LJIIZILJ == i) {
            C21353118hN c21353118hN = LL;
            C1568780qvU c1568780qvU = c21353418hQ.LIZ;
            c21353118hN.getClass();
            Map mapLIZJ = LIZJ(c1568780qvU);
            mapLIZJ.put("duration", Integer.valueOf(i2));
            mapLIZJ.put("is_success", Boolean.valueOf(z));
            mapLIZJ.put("is_forward", Boolean.FALSE);
            mapLIZJ.put("trigger_by", "reset");
            C1018703yb.LIZIZ("rd_tiktokec_replay_seek", mapLIZJ);
            LJIILJJIL(c21353418hQ.LIZ, z, str);
            if (z) {
                c21353418hQ.LIZLLL = EnumC1569640qws.NORMAL;
                c21353418hQ.LJ = c188g;
                c21353418hQ.LIZLLL();
                return;
            }
            c21353418hQ.LIZLLL = EnumC1569640qws.INVALID;
            if (str == null) {
                str = "";
            }
            c21353418hQ.LJ = new C188H(-5, 0, str, 9);
            c21353418hQ.LIZLLL();
            LJIILIIL(c21353418hQ.LIZ, true, "reset");
            if (c21353418hQ.LJII) {
                if (LLILLL != c21353418hQ) {
                    return;
                }
                LLILLL = null;
            } else {
                if (LLILLL == c21353418hQ) {
                    LLILLL = null;
                }
                LIZLLL(c21353418hQ);
            }
        }
    }
}
