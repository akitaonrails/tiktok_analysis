package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicLockMixStreamData;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSEIPrecisionSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkMultiguestOptimizeLinkmicSeiSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MixStreamServerControlParamSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.VolumeMixStreamConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMixStreamOptSeparate;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMixStreamOptSeparatePart1List;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMixStreamOptSeparatePart2Included;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicRtcRatioOptimize;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestFloatLayoutStyleMapSettings;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.AFwS224S0000000_33;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AYv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181391AYv extends LiveStreamMixer implements InterfaceC2182051AaZ, InterfaceC2181261AYi {
    public static final Pair<Integer, Integer> LLJJIJI = new Pair<>(720, 1280);
    public final C2181271AYj LL;
    public C1AZU LLILLJJLI = C1AZU.Unknown;
    public List<C2181251AYh> LLILLL;
    public C2181431AYz LLILZ;
    public C2182111Aaf LLILZIL;
    public List<C2181811AaB> LLILZLL;
    public C1AZ9 LLIZ;
    public final List<C1AZC> LLIZLLLIL;
    public List<String> LLJ;
    public long LLJI;
    public C2181531AZj LLJIJIL;
    public final C2181241AYg LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
    public final boolean updateMixSpatialAudio(C1276650jKJ c1276650jKJ, C1276630jKH c1276630jKH) {
        return false;
    }

    @Override // X.InterfaceC2181261AYi
    public final String LIZ() {
        C2181431AYz c2181431AYz = this.LLILZ;
        if (c2181431AYz != null) {
            return c2181431AYz.LIZIZ;
        }
        return null;
    }

    @Override // X.InterfaceC2181971AaR
    public final boolean LIZJ() {
        C2181531AZj c2181531AZj = this.LLJIJIL;
        String str = c2181531AZj != null ? c2181531AZj.LIZIZ : null;
        if (!LinkMicMixStreamOptSeparate.INSTANCE.getValue() || TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableCrop ratio is null, sw1:");
            MultiGuestFloatLayoutStyleMapSettings multiGuestFloatLayoutStyleMapSettings = MultiGuestFloatLayoutStyleMapSettings.INSTANCE;
            sbLIZ.append(multiGuestFloatLayoutStyleMapSettings.isEnable());
            sbLIZ.append(", sw2:");
            sbLIZ.append(multiGuestFloatLayoutStyleMapSettings.getTTLHStreamRatio());
            sbLIZ.append(", sw3: ");
            sbLIZ.append(LinkMicRtcRatioOptimize.isAnchorEnable());
            sbLIZ.append(", ");
            C20441214yg.LIZIZ("LinkMicMixStreamService", C2188811AlT.LIZIZ(sbLIZ));
            return multiGuestFloatLayoutStyleMapSettings.isEnable() && multiGuestFloatLayoutStyleMapSettings.getTTLHStreamRatio() == 1 && LinkMicRtcRatioOptimize.isAnchorEnable();
        }
        for (String str2 : LinkMicMixStreamOptSeparatePart1List.INSTANCE.getValue()) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("enableCrop: loop key:");
            sbLIZ2.append(str2);
            sbLIZ2.append(", layoutKey:");
            sbLIZ2.append(str);
            C20441214yg.LIZIZ("LinkMicMixStreamService", C2188811AlT.LIZIZ(sbLIZ2));
            if (str != null && a0.LJJIIZI(str, str2, false)) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("enableCrop: MultiGuestFloatLayoutStyleMapSettings:");
                MultiGuestFloatLayoutStyleMapSettings multiGuestFloatLayoutStyleMapSettings2 = MultiGuestFloatLayoutStyleMapSettings.INSTANCE;
                sbLIZ3.append(multiGuestFloatLayoutStyleMapSettings2.isEnable());
                sbLIZ3.append(", MultiGuestFloatLayoutStyleMapSettings.getTTLHStreamRatio():");
                sbLIZ3.append(multiGuestFloatLayoutStyleMapSettings2.getTTLHStreamRatio());
                C20441214yg.LIZIZ("LinkMicMixStreamService", C2188811AlT.LIZIZ(sbLIZ3));
                return multiGuestFloatLayoutStyleMapSettings2.isEnable() && multiGuestFloatLayoutStyleMapSettings2.getTTLHStreamRatio() == 1;
            }
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("enableCrop: isAnchorEnable:");
        sbLIZ4.append(LinkMicRtcRatioOptimize.isAnchorEnable());
        sbLIZ4.append(", part2 included:");
        LinkMicMixStreamOptSeparatePart2Included linkMicMixStreamOptSeparatePart2Included = LinkMicMixStreamOptSeparatePart2Included.INSTANCE;
        sbLIZ4.append(linkMicMixStreamOptSeparatePart2Included.getValue());
        C20441214yg.LIZIZ("LinkMicMixStreamService", C2188811AlT.LIZIZ(sbLIZ4));
        return linkMicMixStreamOptSeparatePart2Included.getValue() && LinkMicRtcRatioOptimize.isAnchorEnable();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0103  */
    @Override // X.InterfaceC2181971AaR
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1AZ9 LJ() {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181391AYv.LJ():X.1AZ9");
    }

    @Override // X.InterfaceC2182051AaZ
    public final List<C1276580jKC> LJI() {
        return this.LL.LJI.LJIILL();
    }

    @Override // X.InterfaceC2182051AaZ
    public final C1AZA LJII() {
        return new C1AZA(this.LLIZ, this.LLILLL);
    }

    public final Map<String, Object> LJIIIZ() {
        return (Map) this.LLJILLL.getValue();
    }

    public final HashMap<String, Map<String, JSONObject>> LJIIJ() {
        return (HashMap) this.LLJJ.getValue();
    }

    public final HashMap<String, Map<String, String>> LJIIJJI() {
        return (HashMap) this.LLJILJILJ.getValue();
    }

    public final Pair<Integer, Integer> LJIIL() {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        InterfaceC965060bDk interfaceC965060bDk;
        InterfaceC754220TiG interfaceC754220TiGCreate;
        C949400aoU c949400aoULJJJJJL = this.LL.LJI.LJJJJJL();
        InterfaceC1273910jFt liveCore = null;
        if (c949400aoULJJJJJL != null && (interfaceC965060bDk = c949400aoULJJJJJL.LIZJ) != null && (interfaceC754220TiGCreate = interfaceC965060bDk.create()) != null) {
            liveCore = interfaceC754220TiGCreate.getLiveCore();
        }
        return (!(liveCore instanceof AbstractC1273900jFs) || (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) ? LLJJIJI : new Pair<>(Integer.valueOf(c1269340j8WLLD.LJJIL(1)), Integer.valueOf(c1269340j8WLLD.LJJIJIIJIL(1)));
    }

    public final int LJIJ() {
        if (!this.LL.LJI.LJJIJ()) {
            return this.LL.LIZ;
        }
        int i = C1AZS.LIZ[this.LLILLJJLI.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return this.LL.LIZ;
        }
        return 2;
    }

    @Override // X.InterfaceC2181261AYi
    public final String getLayoutId() {
        C2181431AYz c2181431AYz = this.LLILZ;
        if (c2181431AYz != null) {
            return c2181431AYz.LIZ;
        }
        return null;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
    public final InterfaceC969870bLV getPlayerInfoProvider() {
        C1AZU c1azu = this.LLILLJJLI;
        if (c1azu == C1AZU.Unknown) {
            return getInfoProvider();
        }
        InterfaceC969870bLV playerInfoProviderWithArchType = getPlayerInfoProviderWithArchType(c1azu);
        return playerInfoProviderWithArchType == null ? getInfoProvider() : playerInfoProviderWithArchType;
    }

    @Override // X.InterfaceC2181261AYi
    public final C1AZ9 LIZIZ() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC2181261AYi
    public final List<C2181251AYh> LJFF() {
        return this.LLILLL;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
    public final boolean getEnableRoundCorner() {
        return this.LLJJIII;
    }

    public C2181391AYv(C2181271AYj c2181271AYj) {
        this.LL = c2181271AYj;
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLL = c13bv;
        this.LLILZLL = c13bv;
        Pair<Integer, Integer> pair = LLJJIJI;
        this.LLIZ = new C1AZ9(((double) pair.getFirst().intValue()) / ((double) pair.getSecond().intValue()), pair.getFirst().intValue(), pair.getSecond().intValue());
        this.LLIZLLLIL = new CopyOnWriteArrayList();
        this.LLJILJIL = new C2181241AYg(c2181271AYj, this, new AwS577S0100000_33(this, 4032));
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(592));
        this.LLJILLL = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(591));
        this.LLJJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(359));
        this.LLJJI = C452501pT.LIZIZ(AFwS224S0000000_33.get$arr$(593));
    }

    public static String LJIILJJIL(C1283230jUv c1283230jUv) {
        EnumC1283210jUt enumC1283210jUt = c1283230jUv.LIZ;
        if (enumC1283210jUt != EnumC1283210jUt.RtcStreamId && enumC1283210jUt != EnumC1283210jUt.RtcUserId) {
            return null;
        }
        return c1283230jUv.LIZIZ;
    }

    public static String LJIILL(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("uid_str");
        String strOptString2 = jSONObject.optString("stream_id");
        int iOptInt = jSONObject.optInt("content_type");
        if (iOptInt != 1 && iOptInt != 2 && iOptInt != 3) {
            return strOptString;
        }
        return strOptString2;
    }

    public static double LJIIZILJ(double d) {
        if (LinkMicSEIPrecisionSetting.INSTANCE.enable()) {
            return new BigDecimal(d).setScale(4, RoundingMode.DOWN).doubleValue();
        }
        return d;
    }

    public final void LJIIIIZZ(C1AZC c1azc) {
        ((CopyOnWriteArrayList) this.LLIZLLLIL).add(c1azc);
    }

    public final void LJIILIIL(String str) {
        this.LL.LJI.LIZJ(str);
    }

    public final void LJIILLIIL(Runnable runnable) {
        if (LinkMicLockMixStreamData.INSTANCE.isEnable()) {
            synchronized (this) {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        runnable.run();
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer
    public final void setEnableRoundCorner(boolean z) {
        this.LLJJIII = z;
        this.LLJILJIL.LJI = z;
    }

    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
    public final boolean updateMixAudioVolumeIndication(C1276600jKE c1276600jKE) {
        VolumeMixStreamConfig value;
        EnumC1276610jKF enumC1276610jKF;
        int iLJIJ = LJIJ();
        LivesdkMultiguestOptimizeLinkmicSeiSetting livesdkMultiguestOptimizeLinkmicSeiSetting = LivesdkMultiguestOptimizeLinkmicSeiSetting.INSTANCE;
        if (livesdkMultiguestOptimizeLinkmicSeiSetting.enable(iLJIJ) && c1276600jKE != null && (value = MixStreamServerControlParamSetting.INSTANCE.getValue()) != null) {
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
        return livesdkMultiguestOptimizeLinkmicSeiSetting.enable(iLJIJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x0733  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x05cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v13, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.1AYx] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer, X.InterfaceC1276590jKD
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String mixStream(final int r44, final int r45, final java.util.List<X.C1276580jKC> r46) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2181391AYv.mixStream(int, int, java.util.List):java.lang.String");
    }

    @Override // X.InterfaceC2181971AaR
    public final void LIZLLL(final C1AZU c1azu, final List<C2181251AYh> list, final C1AZ9 c1az9, final C2181431AYz c2181431AYz, final List<C2181811AaB> list2, final C2182111Aaf c2182111Aaf) {
        LJIILLIIL(new Runnable() { // from class: X.1AYy
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LinkMicMixStreamService@6df2.updateCanvasInfo$1");
                try {
                    C2181391AYv c2181391AYv = this.LL;
                    c2181391AYv.LLILLJJLI = c1azu;
                    c2181391AYv.LLILLL = list;
                    c2181391AYv.LLIZ = c1az9;
                    c2181391AYv.LLILZ = c2181431AYz;
                    c2181391AYv.LLILZLL = list2;
                    c2181391AYv.LLILZIL = c2182111Aaf;
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LinkMicMixStreamService@6df2.updateCanvasInfo$1");
            }
        });
        Iterator it2 = C13LP.LLIIII(this.LLIZLLLIL).iterator();
        while (it2.hasNext()) {
            ((C1AZC) it2.next()).LIZ(c1az9, c2181431AYz, list);
        }
        this.LLJILJIL.LJI("updateCanvasInfo", false);
    }
}
