package X;

import Y.AkS477S0100000_15;
import android.graphics.Bitmap;
import android.graphics.Color;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.INoticeboardApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.NoticeboardConfigSetting;
import com.bytedance.android.live.liveinteract.multilive.model.NoticeboardUpdateParams;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiguestNoticeboardV2Setting;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS30S0010000_15;
import kotlin.jvm.internal.AwS451S0200000_15;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0avI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C953620avI {
    public static final /* synthetic */ int LIZ = 0;

    public static C01IL LIZIZ(Bitmap bitmap) {
        C01IL c01il = new C01IL();
        if (bitmap != null) {
            c01il.LIZ = bitmap.getWidth();
            c01il.LIZIZ = bitmap.getHeight();
        }
        c01il.LIZJ = 1;
        c01il.LIZLLL = 800;
        return c01il;
    }

    public static void LIZLLL(C953600avG c953600avG) {
        InterfaceC945610aiN interfaceC945610aiNLIZ = C944400agQ.LIZ();
        if (interfaceC945610aiNLIZ != null) {
            interfaceC945610aiNLIZ.LJ(c953600avG);
        }
    }

    public static int LJ(Bitmap bitmap) {
        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, null));
        NoticeboardConfigSetting.NoticeboardConfig settingValue = NoticeboardConfigSetting.INSTANCE.getSettingValue();
        float f = settingValue.chromaFrom;
        float f2 = settingValue.chromaTo;
        float f3 = settingValue.lightnessFrom;
        float f4 = settingValue.lightnessTo;
        float f5 = settingValue.strategy;
        c204674156yLIZ.LJFF(settingValue.merge);
        c204674156yLIZ.LJ(f, f2, f3, f4, f5);
        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
        if (numLIZIZ == null) {
            return 0;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(numLIZIZ.intValue(), fArr);
        if (fArr[2] > 0.9d) {
            fArr[0] = Math.min(fArr[0] + 20, 359.0f);
            fArr[1] = Math.min(fArr[1] + 0.15f, 1.0f);
            fArr[2] = fArr[2] - 0.1f;
        }
        return Color.HSVToColor(fArr);
    }

    public static float LJI(float f) {
        return ((float) Math.rint(f * r3)) / ((float) Math.pow(10.0f, 2));
    }

    public static void LJII(Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateNoticeboard fail throwable=");
        sbLIZ.append(th);
        C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        if (th instanceof C477520Io2) {
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            if (C500260Jjc.LJJIIZ(c501470JlZ.getPrompt())) {
                C766270U4b.LJIIJJI(c501470JlZ.getPrompt());
            }
        }
    }

    public static void LJIIIIZZ(Integer num) {
        int i;
        int i2;
        int i3;
        if (num != null) {
            if (num.intValue() == 2) {
                if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                    i3 = 2131853956;
                } else {
                    i3 = 2131853955;
                }
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(i3));
                return;
            }
            if (num.intValue() == 5) {
                if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                    i2 = 2131853953;
                } else {
                    i2 = 2131853952;
                }
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(i2));
                return;
            }
            if (num.intValue() == 4) {
                if (MultiguestNoticeboardV2Setting.INSTANCE.isPreviewEnable()) {
                    i = 2131853951;
                } else {
                    i = 2131853950;
                }
                C766270U4b.LJIIJJI(C497740JfY.LJIJI(i));
                return;
            }
            if (num.intValue() != 6) {
                return;
            }
            C766270U4b.LJIIJJI(C497740JfY.LJIJI(2131853957));
        }
    }

    public static C01IM LIZJ(Bitmap bitmap, boolean z) {
        C01IM c01im = new C01IM();
        c01im.LIZ = C01IR.BITMAP;
        if (bitmap != null) {
            AwS30S0010000_15 awS30S0010000_15 = new AwS30S0010000_15(z, 0);
            c01im.LIZIZ = bitmap;
            awS30S0010000_15.invoke(Float.valueOf(bitmap.getWidth() / bitmap.getHeight()));
        }
        return c01im;
    }

    public static void LJIIJJI(C953600avG c953600avG, Function1 function1) {
        String str = c953600avG.LJIIL;
        if (str != null && !a0.LJJJIL(str)) {
            C953370aut.LIZLLL(str, new AwS451S0200000_15(c953600avG, (C953600avG) function1, (Function1<? super String, Unit>) 5));
        } else {
            C20441214yg.LJ("NoticeboardUtils", "uploadImage but path is null or empty");
        }
    }

    public static void LJIILIIL(int i, String str) {
        InterfaceC954180awC interfaceC954180awCLLJLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("writeNoticeboardInfoToSei id=");
        sbLIZ.append(str);
        sbLIZ.append(", status=");
        sbLIZ.append(i);
        sbLIZ.append(", currentNoticeboardId=");
        C953610avH.LJJI.getClass();
        sbLIZ.append(C953610avH.LJJIIJ);
        sbLIZ.append(", nodeId=");
        sbLIZ.append(C953610avH.LJJII);
        C20441214yg.LIZIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
        if (C953610avH.LJJIIJ == null) {
            InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
            if (interfaceC954180awCLLJLL2 != null) {
                interfaceC954180awCLLJLL2.LJJIZ("noticeboard");
                return;
            }
            return;
        }
        if (str == null || (interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL()) == null) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("noticeboard_id", C953610avH.LJJIIJ);
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
        if (i != 4 && i != 5) {
            jSONObject.put("node_id", C953610avH.LJJII);
        }
        linkedHashMap.put(str, jSONObject);
        interfaceC954180awCLLJLL.LJIJI("noticeboard", linkedHashMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.sdk.datachannel.DataChannel r5, X.C953600avG r6, kotlin.jvm.functions.Function0 r7) {
        /*
            X.0auC r4 = X.EnumC952940auC.CREATE
            X.0auu r0 = X.EnumC953380auu.GET_BITMAP
            java.lang.String r3 = "0"
            java.lang.String r2 = ""
            X.C952930auB.LIZ(r4, r0, r3, r2)
            com.bytedance.android.live.liveinteract.multiguestv3.service.IMultiGuestV3InternalServiceV2 r0 = X.C915980Zwa.LJIIIIZZ()
            X.0awC r0 = r0.LLJLL()
            if (r0 == 0) goto L3e
            boolean r1 = r0.LJLLILLLL()
            r0 = 1
            if (r1 != r0) goto L3e
        L1c:
            java.lang.String r1 = "NoticeboardController"
            if (r0 == 0) goto L40
            java.lang.String r0 = "createNoticeboard isRtcEngineOn=true"
            X.C20441214yg.LJIIIZ(r1, r0)
            X.0auu r0 = X.EnumC953380auu.TURN_ON_ENGINE
            X.C952930auB.LIZ(r4, r0, r3, r2)
            if (r5 == 0) goto L3d
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController$CheckIncreaseGuestCountEvent> r3 = com.bytedance.android.live.liveinteract.multiguestv3.main.tool.anchor.common.SwitchLayoutPanelController.CheckIncreaseGuestCountEvent.class
            X.0a4d r2 = new X.0a4d
            kotlin.jvm.internal.AwS416S0200000_15 r1 = new kotlin.jvm.internal.AwS416S0200000_15
            r0 = 38
            r1.<init>(r6, r7, r0)
            r2.<init>(r1)
            r5.LC0(r3, r2)
        L3d:
            return
        L3e:
            r0 = 0
            goto L1c
        L40:
            java.lang.String r0 = "createNoticeboard isRtcEngineOn=false"
            X.C20441214yg.LJIIIZ(r1, r0)
            X.0avN r1 = X.C953610avH.LJJI
            java.lang.String r0 = r6.LIZ
            r1.getClass()
            X.C953670avN.LIZIZ(r0)
            X.0auu r0 = X.EnumC953380auu.TURN_ON_ENGINE
            X.C952930auB.LIZ(r4, r0, r3, r2)
            X.0auu r0 = X.EnumC953380auu.CHECK_INCREASE_GUEST
            X.C952930auB.LIZ(r4, r0, r3, r2)
            r7.invoke()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C953620avI.LIZ(com.bytedance.ies.sdk.datachannel.DataChannel, X.0avG, kotlin.jvm.functions.Function0):void");
    }

    public static C11JF LJIIIZ(Function0 function0, Function2 function2, Function0 function02) {
        NoticeboardConfigSetting noticeboardConfigSetting = NoticeboardConfigSetting.INSTANCE;
        long j = noticeboardConfigSetting.getSettingValue().timeout;
        return (C11JF) C11NZ.LJJJJLL(0L, noticeboardConfigSetting.getSettingValue().tryCount, j, j, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJZ(new C515801zg(function0, function2, 67), new C09JN() { // from class: X.00Rr
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("NoticeboardUtils@5337.trigger$disposable$2");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("trigger onError=");
                sbLIZ.append(obj);
                C20441214yg.LIZIZ("NoticeboardUtils", C2188811AlT.LIZIZ(sbLIZ));
                C1C7U.LIZIZ("NoticeboardUtils@5337.trigger$disposable$2");
            }
        }, new C987100bnI(function02, 21));
    }

    public static void LJIIL(HashMap map, C11NJ c11nj, C953600avG c953600avG, C19489311Mt c19489311Mt) {
        C917840Zza c917840Zza = c953600avG.LJI;
        if (c917840Zza != null && map.get(c953600avG.LIZ) != null) {
            c11nj.LIZ(new C11QI(C953290aul.LIZ(C953370aut.LIZJ(c917840Zza), c19489311Mt).LJIIZILJ(new AkS477S0100000_15(c953600avG, 4)).LJJIJIIJI(C11S5.LIZ())).LJIILL().LJIIZILJ());
        }
    }

    public static void LJFF(C953660avM c953660avM, Long l, String str, EnumC953170auZ enumC953170auZ, Integer num) {
        long jLongValue;
        Iterator<WeakReference<InterfaceC917550Zz7>> it2 = c953660avM.LJFF.iterator();
        while (it2.hasNext()) {
            InterfaceC917550Zz7 interfaceC917550Zz7 = it2.next().get();
            if (interfaceC917550Zz7 != null) {
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                interfaceC917550Zz7.LJ(new C916750Zxp(2, jLongValue, str), enumC953170auZ, num);
            }
        }
        c953660avM.LJFF.clear();
    }

    public static void LJIIJ(DataChannel dataChannel, C11NJ c11nj, Function0 function0, C953600avG c953600avG, int i, String str, InterfaceC1631630sYr interfaceC1631630sYr) {
        long jLongValue;
        Long l = (Long) function0.invoke();
        if (l != null) {
            long jLongValue2 = l.longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateBoard, type=");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("NoticeboardController", C2188811AlT.LIZIZ(sbLIZ));
            C480460Ism.LIZ().getClass();
            INoticeboardApi iNoticeboardApi = (INoticeboardApi) C480460Ism.LIZLLL(INoticeboardApi.class);
            NoticeboardUpdateParams noticeboardUpdateParams = new NoticeboardUpdateParams();
            noticeboardUpdateParams.roomId = C954140aw8.LIZJ();
            noticeboardUpdateParams.channelId = C954140aw8.LIZIZ();
            noticeboardUpdateParams.noticeboardId = jLongValue2;
            noticeboardUpdateParams.updateType = i;
            noticeboardUpdateParams.mediaNodeId = c953600avG.LIZ;
            noticeboardUpdateParams.imagePath = str;
            Long l2 = c953600avG.LJIIIIZZ;
            if (l2 != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            noticeboardUpdateParams.noticeboardTemplateId = jLongValue;
            c11nj.LIZ(new C11QI(iNoticeboardApi.updateNoticeboard(noticeboardUpdateParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJIILL(new C516701zp(interfaceC1631630sYr, dataChannel, c953600avG, 1)).LJIIL(new C516201zk(interfaceC1631630sYr, 59))).LJIILL().LJIIZILJ());
        }
    }
}
