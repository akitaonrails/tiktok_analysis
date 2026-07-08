package X;

import android.graphics.RectF;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.comp.api.linkcore.model.Layout;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LayoutArray;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveMicLayoutZOrderSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkMultiguestOptimizeLinkmicSeiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MixStreamServerControlParamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAvatarConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.VolumeMixStreamConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.1AYu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181381AYu extends LiveStreamMixer {
    public final C2177031AIb LL;
    public final OnLineMicInfo LLILLJJLI;
    public final Function0<LinkUser> LLILLL;
    public final Function0<Long> LLILZ;
    public final Function0<List<String>> LLILZIL;
    public final Function0<Float> LLILZLL;
    public final Function1<String, Unit> LLIZ;
    public final Function0<Boolean> LLIZLLLIL;
    public final Function0<Boolean> LLJ;
    public final Function0<Layout> LLJI;
    public final Function0<Layout> LLJIJIL;
    public final HashMap<String, Map<String, String>> LLJILJIL;
    public final HashMap<String, Map<String, String>> LLJILJILJ;
    public final Map<String, Object> LLJILLL;
    public final HashMap<String, Map<String, JSONObject>> LLJJ;
    public final Function0<List<PosIdentity>> LLJJI;
    public volatile Map<String, ? extends Object> LLJJIII = C2097608Jq.LJ();

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
    public final boolean updateMixSpatialAudio(C1276650jKJ c1276650jKJ, C1276630jKH c1276630jKH) {
        return false;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
    public final boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE) {
        VolumeMixStreamConfig value;
        EnumC1276610jKF enumC1276610jKF;
        LivesdkMultiguestOptimizeLinkmicSeiSetting livesdkMultiguestOptimizeLinkmicSeiSetting = LivesdkMultiguestOptimizeLinkmicSeiSetting.INSTANCE;
        if (livesdkMultiguestOptimizeLinkmicSeiSetting.enable(this.LL.LIZIZ) && (value = MixStreamServerControlParamSetting.INSTANCE.getValue()) != null) {
            c1276600jKE.LIZ = value.volumeIndicationInterval;
            c1276600jKE.LIZIZ = value.talkVolumeThreshold;
            c1276600jKE.LIZJ = value.addVolume;
            if (value.seiContentMode == 1) {
                enumC1276610jKF = EnumC1276610jKF.VOLUME_INDICATION_CONTENT_MODE_VOLUME_ONLY;
            } else {
                enumC1276610jKF = EnumC1276610jKF.VOLUME_INDICATION_CONTENT_MODE_FULL;
            }
            c1276600jKE.LIZLLL = enumC1276610jKF;
        }
        return livesdkMultiguestOptimizeLinkmicSeiSetting.enable(this.LL.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04e7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x07b2  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0859  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0058 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0126  */
    /* JADX WARN: Type inference failed for: r0v74, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v85, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r44v0, types: [java.util.List] */
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mixStream(int r46, int r47, java.util.List<X.C1276580jKC> r48) {
        /*
            Method dump skipped, instruction units count: 2256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181381AYu.mixStream(int, int, java.util.List):java.lang.String");
    }

    public final void LJIIIIZZ(String str, Map<String, LayoutArray> map, int i, C1276580jKC c1276580jKC, RectF rectF, InterfaceC969870bLV interfaceC969870bLV, float f) {
        Integer num;
        Integer num2;
        boolean zLJIILJJIL;
        InterfaceC969870bLV infoProvider;
        if (map.get(String.valueOf(i + 1)) == null) {
            Function1<String, Unit> function1 = this.LLIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("linkMicId = ");
            sbLIZ.append(c1276580jKC.LIZIZ);
            sbLIZ.append(" isNotInMic");
            function1.invoke(C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        C1282280jTO c1282280jTO = new C1282280jTO(rectF.left + (r1.getLeft() * rectF.width()), rectF.top + (r1.getTop() * rectF.height()), r1.getWidth() * rectF.width(), r1.getHeight() * rectF.height(), r1.getRadius() * rectF.width());
        double d = c1282280jTO.LIZJ;
        double d2 = c1282280jTO.LIZLLL;
        c1276580jKC.LJI = d;
        c1276580jKC.LJII = d2;
        if (getEnableRoundCorner()) {
            c1276580jKC.LJIILL = c1282280jTO.LJ;
        }
        double d3 = c1282280jTO.LIZ;
        double d4 = c1282280jTO.LIZIZ + ((double) f);
        c1276580jKC.LJ = d3;
        c1276580jKC.LJFF = d4;
        int i2 = this.LL.LIZIZ;
        boolean z = false;
        if (i2 == 4) {
            if (interfaceC969870bLV != null) {
                if (!c1276580jKC.LJIILLIIL) {
                    c1276580jKC.LJIIJJI = false;
                }
                LayoutArray layoutArray = map.get(String.valueOf(i + 1));
                if (layoutArray != null) {
                    num2 = layoutArray.zOrder;
                } else {
                    num2 = null;
                }
                if (LiveMicLayoutZOrderSetting.enable() && num2 != null) {
                    c1276580jKC.LJIILIIL = num2.intValue();
                } else if (i == 0) {
                    c1276580jKC.LJIILIIL = 10;
                } else {
                    c1276580jKC.LJIILIIL = 20;
                }
                if (MultiGuestAvatarConfigSetting.INSTANCE.getValue().enable && (infoProvider = getInfoProvider()) != null) {
                    zLJIILJJIL = infoProvider.LJIILJJIL(c1276580jKC.LIZIZ);
                } else {
                    zLJIILJJIL = false;
                }
                if (!c1276580jKC.LJIILLIIL) {
                    if (zLJIILJJIL) {
                        c1276580jKC.LJIIL = false;
                    } else {
                        String str2 = c1276580jKC.LIZIZ;
                        if (str2 == null) {
                            str2 = "";
                        }
                        int i3 = interfaceC969870bLV.L8(str2).videoMuted;
                        if (i3 == 2 || i3 == 4) {
                            z = true;
                        }
                        c1276580jKC.LJIIL = Boolean.valueOf(z).booleanValue();
                    }
                }
            }
        } else if (i2 == 2) {
            if (Intrinsics.LJFF(c1276580jKC.LIZIZ, str)) {
                c1276580jKC.LJIIJJI = false;
            }
            LayoutArray layoutArray2 = map.get(String.valueOf(i + 1));
            if (layoutArray2 != null && (num = layoutArray2.zOrder) != null) {
                c1276580jKC.LJIILIIL = num.intValue();
            }
        }
        if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).ny1(String.valueOf(this.LL.LIZJ))) {
            c1276580jKC.LJIIJJI = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2181381AYu(C2177031AIb c2177031AIb, OnLineMicInfo onLineMicInfo, Function0<LinkUser> function0, Function0<Long> function02, Function0<? extends List<String>> function03, Function0<Float> function04, Function1<? super String, Unit> function1, Function0<Boolean> function05, Function0<Boolean> function06, Function0<Layout> function07, Function0<Layout> function08, HashMap<String, Map<String, String>> map, HashMap<String, Map<String, String>> map2, Map<String, Object> map3, HashMap<String, Map<String, JSONObject>> map4, Function0<? extends List<PosIdentity>> function09) {
        this.LL = c2177031AIb;
        this.LLILLJJLI = onLineMicInfo;
        this.LLILLL = function0;
        this.LLILZ = function02;
        this.LLILZIL = function03;
        this.LLILZLL = function04;
        this.LLIZ = function1;
        this.LLIZLLLIL = function05;
        this.LLJ = function06;
        this.LLJI = function07;
        this.LLJIJIL = function08;
        this.LLJILJIL = map;
        this.LLJILJILJ = map2;
        this.LLJILLL = map3;
        this.LLJJ = map4;
        this.LLJJI = function09;
    }
}
