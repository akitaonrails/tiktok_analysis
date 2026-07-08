package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder.MultiGuestMainColorConfig;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.viewbinder.MultiGuestMainColorConfigSetting;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestPlaybookActiveContentFixSetting;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14rB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20394714rB {
    public static final C20394714rB LIZ = new C20394714rB();

    public static Bitmap LIZ(C1324720kZq c1324720kZq) {
        if (c1324720kZq.getWidth() != 0 && c1324720kZq.getHeight() != 0) {
            try {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1324720kZq.getWidth(), c1324720kZq.getHeight(), Bitmap.Config.RGB_565);
                C842150X1x.LIZIZ(new Canvas(bitmapCreateBitmap), c1324720kZq);
                return bitmapCreateBitmap;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getBitmapFromView error:");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("getBitmapFromView", C2188811AlT.LIZIZ(sbLIZ));
                return null;
            }
        }
        return null;
    }

    public static int LIZIZ(Bitmap bitmap) {
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
        MultiGuestMainColorConfig settingValue = MultiGuestMainColorConfigSetting.INSTANCE.getSettingValue();
        c204674156yLIZ.LJ(settingValue.chromaFrom, settingValue.chromaTo, settingValue.lightnessFrom, settingValue.lightnessTo, settingValue.strategy);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ != null) {
            return numLIZIZ.intValue();
        }
        return 0;
    }

    public static void LJI(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                bitmap.recycle();
                BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("recycleBitmap error: ");
                sbLIZ.append(e.getMessage());
                C20441214yg.LJ("recycleBitmap", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C20406514t5 LIZJ(webcast.data.multi_guest_play.Playbook r10, X.C1117360fBO r11, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel r12) {
        /*
            X.14t5 r9 = new X.14t5
            boolean r0 = r10.isMyFavorite
            if (r0 == 0) goto L6b
            java.lang.String r8 = "favorite"
        L8:
            r7 = 1
            if (r11 != 0) goto L2a
            r5 = 0
        Lc:
            if (r12 == 0) goto L28
            androidx.lifecycle.MutableLiveData<java.lang.Long> r0 = r12.LLJJ
            if (r0 == 0) goto L28
            long r3 = r10.playbookId
            java.lang.Object r0 = r0.getValue()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L28
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L28
        L24:
            r9.<init>(r8, r5, r7)
            return r9
        L28:
            r7 = 0
            goto L24
        L2a:
            java.util.List<?> r0 = r11.LL
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L35:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r1 = r2.next()
            boolean r0 = r1 instanceof X.InterfaceC1868370yih
            if (r0 == 0) goto L35
            r3.add(r1)
            goto L35
        L47:
            java.util.Iterator r6 = r3.iterator()
            r5 = 0
        L4c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            X.0yih r0 = (X.InterfaceC1868370yih) r0
            webcast.data.multi_guest_play.Playbook r0 = r0.LIZ()
            long r3 = r0.playbookId
            long r1 = r10.playbookId
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            int r5 = r5 + 1
            goto L4c
        L67:
            r5 = -1
        L68:
            int r5 = r5 + 1
            goto Lc
        L6b:
            java.lang.String r8 = "recommended"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20394714rB.LIZJ(webcast.data.multi_guest_play.Playbook, X.0fBO, com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel):X.14t5");
    }

    public static void LIZLLL(DataChannel dataChannel, String str, Playbook playbook, C20406514t5 c20406514t5, PlaybookAnchorViewModel playbookAnchorViewModel) {
        int iLJJIL;
        C20384514pX c20384514pX;
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        String str2 = c20406514t5.LIZ;
        int i = c20406514t5.LIZIZ + 1;
        if (playbookAnchorViewModel != null && (c20384514pX = playbookAnchorViewModel.LLJJJJJIL) != null) {
            iLJJIL = c20384514pX.LJJIL();
        } else {
            iLJJIL = 0;
        }
        C978360bZC.LJIILL(dataChannel, str, playbook, str2, i, true, false, Integer.valueOf(iLJJIL), Integer.valueOf(C20385714pj.LIZ(playbookAnchorViewModel)), c20406514t5.LIZJ, null, null, 3136);
    }

    public static void LJII(PlaybookAnchorViewModel playbookAnchorViewModel, Playbook playbook, Map map, String str, final Function0 function0) {
        long j;
        InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>> interfaceC170900l9 = new InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>>() { // from class: X.01ZH
            @Override // X.InterfaceC170900l9
            public final void onFailed(Throwable th) {
            }

            @Override // X.InterfaceC170900l9
            public final void LIZ(C470590Icr<PlaybookStartResponse.ResponseData> c470590Icr) {
                if (C500260Jjc.LJJIL()) {
                    C766270U4b.LIZLLL(2131854097);
                } else {
                    C766270U4b.LIZLLL(2131854099);
                }
                function0.invoke();
            }
        };
        long j2 = playbook.playbookId;
        PlaybookContent playbookContent = playbook.content;
        long j3 = 0;
        if (playbookContent != null) {
            j = playbookContent.playbookContentId;
            j3 = playbookContent.originalPlaybookContentId;
        } else {
            j = 0;
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        PlaybookAnchorViewModel.SQ2(playbookAnchorViewModel, interfaceC170900l9, null, Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3), str, map, C978360bZC.LJFF().LIZ, C20392214qm.LIZ(), false, null, C978360bZC.LIZLLL(), null, null, false, true, 95232);
    }

    public static void LJ(final DataChannel dataChannel, Context context, final Playbook playbook, final PlaybookAnchorViewModel playbookAnchorViewModel, final C20406514t5 c20406514t5, final Map map, String str, final Function0 function0) {
        Playbook playbook2;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        final String strLJJJJL = str;
        if (playbookAnchorViewModel == null) {
            return;
        }
        LIZLLL(dataChannel, "use", playbook, c20406514t5, playbookAnchorViewModel);
        ActivePlaybook value = playbookAnchorViewModel.LLILLJJLI.getValue();
        if (strLJJJJL == null && MultiGuestPlaybookActiveContentFixSetting.INSTANCE.enable() && C930540aK4.LIZJ() && (dataChannel == null || (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) == null || (strLJJJJL = playbookAnchorServiceV2LIZIZ.LJJJJL(playbook)) == null)) {
            strLJJJJL = "";
        }
        if (value == null || ((playbook2 = value.playbook) != null && playbook2.playbookId == playbook.playbookId)) {
            LJII(playbookAnchorViewModel, playbook, map, strLJJJJL, function0);
            return;
        }
        C782110Um9 c782110Um9 = new C782110Um9(context);
        c782110Um9.LJIIZILJ(2131854094);
        c782110Um9.LJII(2131854093);
        c782110Um9.LJIILL = false;
        c782110Um9.LJIILIIL(2131854092, new InterfaceC743640TFa() { // from class: X.14qx
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                C20394714rB c20394714rB = C20394714rB.LIZ;
                PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorViewModel;
                DataChannel dataChannel2 = dataChannel;
                Playbook playbook3 = playbook;
                final C20393514qz c20393514qz = new C20393514qz(playbookAnchorViewModel2, c20406514t5, dataChannel2, strLJJJJL, map, function0, playbook3);
                c20394714rB.getClass();
                if (playbookAnchorViewModel2 != null) {
                    playbookAnchorViewModel2.GQ2(new InterfaceC170900l9<C470590Icr<PlaybookEndResponse.ResponseData>>() { // from class: X.00lG
                        @Override // X.InterfaceC170900l9
                        public final void LIZ(C470590Icr<PlaybookEndResponse.ResponseData> c470590Icr) {
                            c20393514qz.invoke(Boolean.TRUE);
                        }

                        @Override // X.InterfaceC170900l9
                        public final void onFailed(Throwable th) {
                            String message;
                            String strLIZ = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("end onFailed:");
                            if (th != null) {
                                message = th.getMessage();
                            } else {
                                message = null;
                            }
                            sbLIZ.append(message);
                            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                            c20393514qz.invoke(Boolean.FALSE);
                        }
                    }, false, true, null, true);
                }
                DataChannel dataChannel3 = dataChannel;
                if (dataChannel3 != null) {
                    PlaybookUtilKt.LJIIIZ(dataChannel3, playbook);
                }
            }
        });
        c782110Um9.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.14r1
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
                DataChannel dataChannel2 = dataChannel;
                if (dataChannel2 != null) {
                    PlaybookUtilKt.LJIIIIZZ(dataChannel2, playbook);
                }
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
        if (dataChannel == null) {
            return;
        }
        PlaybookUtilKt.LJIIJ(dataChannel, playbook);
    }
}
