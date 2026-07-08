package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.model.RoomSticker;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.util.DMGreetingCardGeckoChannelManager;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.020c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5180020c extends C09AY implements Function1 {
    public final int $t;
    public String s0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj);
            case 14:
                return invoke$14(this, obj);
            case 15:
                return invoke$15(this, obj);
            case 16:
                return invoke$16(this, obj);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5180020c(int i) {
        super(1);
        this.$t = i;
        this.s0 = ".png";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5180020c(String str, int i) {
        super(1);
        this.$t = i;
        this.s0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$0(X.C5180020c r3, java.lang.Object r4) {
        /*
            java.io.File r4 = (java.io.File) r4
            boolean r0 = r4.isFile()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r3.s0
            r2 = 1
            if (r0 == 0) goto L19
            java.lang.String r1 = r4.getName()
            java.lang.String r0 = r3.s0
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r2)
            if (r0 == 0) goto L1e
        L19:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L1e:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C5180020c.invoke$0(X.020c, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$1(C5180020c c5180020c, Object obj) {
        if (((Number) obj).intValue() == 2) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("user_id", c5180020c.s0);
            C20684815ws.LJIILLIIL("downgrade_profile_popup_close", c2344009Gk.LIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$10(C5180020c c5180020c, Object obj) {
        final InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) obj;
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
        String str = C0UD4.LIZ;
        C766720U5u.LJIIIZ("livesticker", c5180020c.s0, new InterfaceC760910Tt3<RoomSticker>() { // from class: X.01Pg
            @Override // X.InterfaceC760910Tt3
            public final void LIZ(String str2) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020Q(str2, (InterfaceC1631620sYq) interfaceC1631620sYq, 14));
            }

            @Override // X.InterfaceC760910Tt3
            public final void LIZIZ(Object obj2, String str2) {
                C500260Jjc.LJJLIIIJILLIZJL(new C020G((InterfaceC1631620sYq) interfaceC1631620sYq, (InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>) str2, (String) obj2, (RoomSticker) 5));
            }
        });
        return Unit.LIZ;
    }

    public static final Object invoke$11(C5180020c c5180020c, Object obj) {
        C291001Au c291001Au = new C291001Au(c5180020c.s0);
        obj.getClass();
        return new C231900uz(c291001Au);
    }

    public static final Object invoke$12(C5180020c c5180020c, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c5180020c.s0);
        sbLIZ.append("-g-");
        sbLIZ.append((String) obj);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$13(C5180020c c5180020c, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c5180020c.s0);
        sbLIZ.append(':');
        return Boolean.valueOf(u.LJJIIJZLJL((String) obj, C2188811AlT.LIZIZ(sbLIZ), false));
    }

    public static final Object invoke$14(C5180020c c5180020c, Object obj) {
        String strLIZLLL;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && (strLIZLLL = c1533790q13.LIZLLL()) != null) {
            ((ConcurrentHashMap) DMGreetingCardGeckoChannelManager.LIZLLL).put(c5180020c.s0, strLIZLLL);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$15(C5180020c c5180020c, Object obj) {
        C451501pJ c451501pJ = C451501pJ.LIZ;
        String str = c5180020c.s0;
        c451501pJ.getClass();
        ((Keva) C451501pJ.LIZIZ.getValue()).storeBoolean(str, true);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fixed ");
        sbLIZ.append(c5180020c.s0);
        sbLIZ.append(" status!");
        C1720106oR.LJI("LinkStatusFixer", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    public static final Object invoke$16(C5180020c c5180020c, Object obj) {
        String absolutePath;
        C1533790q13 c1533790q13 = (C1533790q13) obj;
        if (c1533790q13.LIZIZ && c1533790q13.LIZLLL() != null) {
            String strLIZLLL = c1533790q13.LIZLLL();
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            File parentFile = new C0VSJ(strLIZLLL).getParentFile();
            if (parentFile != null) {
                absolutePath = parentFile.getAbsolutePath();
            } else {
                absolutePath = null;
            }
            DMGeckoCommonChannelManager.LJIIJJI = absolutePath;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c5180020c.s0);
            sbLIZ.append(c1533790q13.LIZLLL);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$17(C5180020c c5180020c, Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("row_");
        sbLIZ.append(c5180020c.s0);
        sbLIZ.append('_');
        sbLIZ.append(((C0M0P) C13LP.LJJJJZI((List) obj)).LJ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final Object invoke$2(C5180020c c5180020c, Object obj) {
        C1173560ge2 c1173560ge2 = (C1173560ge2) obj;
        C1173680geE c1173680geELIZIZ = c1173560ge2.LL.LIZIZ(c5180020c.s0);
        C1173680geE c1173680geELIZIZ2 = c1173560ge2.LLILLJJLI.LIZIZ(c5180020c.s0);
        Map<String, Aweme> map = c1173560ge2.LLILLL;
        String str = c5180020c.s0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, Aweme> entry : map.entrySet()) {
            if (!Intrinsics.LJFF(entry.getKey(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return C1173560ge2.LIZ(c1173560ge2, c1173680geELIZIZ, c1173680geELIZIZ2, linkedHashMap, null, 0L, false, false, false, null, 1016);
    }

    public static final Object invoke$3(C5180020c c5180020c, Object obj) {
        return Boolean.valueOf(Intrinsics.LJFF(((Pair) obj).getFirst(), c5180020c.s0));
    }

    public static final Object invoke$4(C5180020c c5180020c, Object obj) {
        PlaybookUtilKt.LJIILIIL(c5180020c.s0, "livebackground", new C5185020h((InterfaceC1631620sYq) obj, (InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>) 20));
        return Unit.LIZ;
    }

    public static final Object invoke$5(C5180020c c5180020c, Object obj) {
        ((C062P) obj).LIZ = new C111900bd(c5180020c.s0);
        return Unit.LIZ;
    }

    public static final Object invoke$6(C5180020c c5180020c, Object obj) {
        return Boolean.valueOf(u.LJJIIJZLJL((String) obj, c5180020c.s0, false));
    }

    public static final Object invoke$7(C5180020c c5180020c, Object obj) {
        return Boolean.valueOf(u.LJJIIJZLJL((String) obj, c5180020c.s0, false));
    }

    public static final Object invoke$8(C5180020c c5180020c, Object obj) {
        String str = c5180020c.s0;
        final C5185020h c5185020h = new C5185020h((InterfaceC1631620sYq) obj, (InterfaceC1631620sYq<? super String, ? super String, ? super List<String>, Unit>) 44);
        if (str != null && !a0.LJJJIL(str)) {
            ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectDataProvider();
            C766720U5u.LJIIIZ("livebackground", str, new InterfaceC760910Tt3<LiveEffect>() { // from class: X.01Pf
                @Override // X.InterfaceC760910Tt3
                public final void LIZ(String str2) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C020Q((Function2) c5185020h, (Function2<? super String, ? super LiveEffect, Unit>) str2, (String) 13));
                }

                @Override // X.InterfaceC760910Tt3
                public final void LIZIZ(Object obj2, String str2) {
                    C500260Jjc.LJJLIIIJILLIZJL(new C020G((LiveEffect) obj2, str2, c5185020h, 4));
                }
            });
        } else {
            C500260Jjc.LJJLIIIJILLIZJL(new C5182020e(c5185020h, 486));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$9(C5180020c c5180020c, Object obj) {
        ((InterfaceC1631620sYq) obj).invoke("", "", Collections.singletonList(c5180020c.s0));
        return Unit.LIZ;
    }
}
