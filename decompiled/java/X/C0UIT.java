package X;

import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftStickerMonitorSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0UIT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UIT {
    public static final C0UIT LIZ = new C0UIT();
    public static LiveEffect LIZIZ;

    public static void LIZ(C474500IjA c474500IjA, long j) {
        c474500IjA.LJIL();
        c474500IjA.LJJII(Long.valueOf(j), "effect_id");
        c474500IjA.LJJII(LiveGiftStickerMonitorSetting.INSTANCE.getResourceId(), "resource_id");
        c474500IjA.LJJII(GiftService.LLILLJJLI.getRoomStatus(), "sticker_scene");
        Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
        if (room != null) {
            c474500IjA.LJJII(Long.valueOf(room.getId()), "room_id");
            c474500IjA.LJJII(Long.valueOf(room.getOwnerUserId()), "anchor_id");
        }
    }

    public static void LIZIZ(Runnable runnable, boolean z) {
        LiveGiftStickerMonitorSetting liveGiftStickerMonitorSetting = LiveGiftStickerMonitorSetting.INSTANCE;
        String resourceId = liveGiftStickerMonitorSetting.getResourceId();
        String panelName = liveGiftStickerMonitorSetting.getPanelName();
        if (!C0UIQ.LIZ().LJ("gift_monitor").isEmpty()) {
            runnable.run();
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0UIS(runnable, resourceId, panelName, z, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0UIX
            if (r0 == 0) goto L87
            r5 = r9
            X.0UIX r5 = (X.C0UIX) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r2 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r1 = 1
            if (r0 == 0) goto L45
            if (r0 != r1) goto L8d
            com.bytedance.android.livesdkapi.depend.model.LiveEffect r8 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            com.ss.android.ugc.effectmanager.common.task.ExceptionResult r2 = (com.ss.android.ugc.effectmanager.common.task.ExceptionResult) r2
            if (r2 == 0) goto L3a
            int r3 = r2.getErrorCode()
            java.lang.String r2 = r2.getMsg()
            long r0 = r8.getEffectId()
            LJ(r3, r0, r2)
        L37:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3a:
            long r2 = r8.getEffectId()
            r1 = 0
            java.lang.String r0 = "Download success"
            LJ(r1, r2, r0)
            goto L37
        L45:
            X.C155000ia.LIZIZ(r2)
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostCreativeTool> r0 = com.bytedance.android.livesdkapi.host.IHostCreativeTool.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostCreativeTool r0 = (com.bytedance.android.livesdkapi.host.IHostCreativeTool) r0
            com.ss.android.ugc.effectmanager.EffectManager r4 = r0.LLJILJILJ()
            com.ss.android.ugc.effectmanager.effect.model.Effect r3 = r8.LIZJ
            if (r3 != 0) goto L5b
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L5b:
            boolean r0 = r4.isEffectDownloaded(r3)
            if (r0 != 0) goto L37
            r5.LL = r8
            r5.LLILZ = r1
            X.099m r2 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r2.<init>(r0)
            X.06wC r1 = new X.06wC
            r0 = 0
            r1.<init>(r2, r0)
            r4.fetchEffect(r3, r1)
            java.lang.Object r2 = r2.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r2 != r0) goto L84
            X.C099Q.LIZJ(r5)
        L84:
            if (r2 != r6) goto L24
            return r6
        L87:
            X.0UIX r5 = new X.0UIX
            r5.<init>(r7, r9)
            goto L12
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UIT.LIZJ(com.bytedance.android.livesdkapi.depend.model.LiveEffect, X.05Vn):java.lang.Object");
    }

    public static void LJ(int i, long j, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_sticker_monitor_effect_download");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_reason");
        LIZ(c474500IjALIZ, j);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|(2:4|(1:6)(1:49))(0)|7|(1:(1:(10:11|12|(8:16|(1:18)(1:34)|19|(1:23)|24|(1:33)(1:30)|31|32)|52|61|53|(1:55)|56|59|60)(2:50|51))(1:40))(3:35|(1:37)|(1:39))|41|(3:43|(1:45)|(1:47)(11:48|12|(1:14)|16|(0)(0)|19|(2:21|23)(0)|24|(2:26|33)(0)|31|32))|52|61|53|(0)|56|59|60) */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x017b, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x017c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r2));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0167 A[Catch: all -> 0x017b, TryCatch #0 {all -> 0x017b, blocks: (B:53:0x0161, B:55:0x0167, B:56:0x0177), top: B:61:0x0161 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(java.lang.String r19, java.lang.String r20, X.InterfaceC1364105Vn<? super com.bytedance.android.livesdkapi.depend.model.LiveEffect> r21) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0UIT.LIZLLL(java.lang.String, java.lang.String, X.05Vn):java.lang.Object");
    }

    public static void LJFF(int i, int i2, boolean z, String str, long j) {
        int i3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_sticker_monitor_effect_fetch");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_reason");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "model_source");
        if (z) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "is_resource_downloaded");
        LIZ(c474500IjALIZ, j);
        c474500IjALIZ.LIZ();
    }
}
