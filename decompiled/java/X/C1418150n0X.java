package X;

import Y.ARunnableS122S0100000_22;
import android.app.Activity;
import android.os.SystemClock;
import android.widget.ImageView;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERenderResourceUtil;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallback;
import com.bytedance.ies.smartmovie.jni.MusicRequestCallbackInfoType;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateResourceService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.ss.android.ugc.effectmanager.effect.model.AssetPanelModelKt;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.ss.android.ugc.effectmanager.effect.model.FileInf;
import com.ss.android.ugc.effectmanager.effect.model.Icon;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS300S0300000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0n0X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418150n0X extends AbstractC2255721DQs<C0L4W> implements C0L4W, InterfaceC379610EuV, C0F1U {
    public static final C1418440n10 LLJILLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJ;
    public final C1DRG LL;
    public final Scene LLILLJJLI;
    public C1418220n0e LLILZ;
    public C1418230n0f LLIZ;
    public boolean LLJ;
    public InterfaceC1418120n0U LLJI;
    public List<AutoCutMediaModel> LLJIJIL;
    public long LLJILJIL;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), Activity.class, null);
    public C1418420n0y LLILZIL = new C1418420n0y(0.0f, 0.0f, 0.0f, 15);
    public C1418420n0y LLILZLL = new C1418420n0y(0.0f, 0.0f, 0.0f, 15);
    public C1418390n0v LLIZLLLIL = new C1418390n0v(null, false, 127);
    public final C01GW LLJILJILJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(71));

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0n10] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1418150n0X.class, "activity", "getActivity()Landroid/app/Activity;", 0);
        C13LE.LIZ.getClass();
        LLJJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILLL = new Object() { // from class: X.0n10
        };
    }

    public C0L4W v3() {
        return this;
    }

    private final InterfaceC1635410sex B3() {
        return (InterfaceC1635410sex) this.LLJILJILJ.getValue();
    }

    private final void C5() {
        this.LLIZLLLIL = new C1418390n0v(null, false, 127);
    }

    private final Activity getActivity() {
        return (Activity) this.LLILLL.getValue(this, LLJJ[0]);
    }

    private final void o2() {
        String str = this.LLIZLLLIL.LIZ;
        if (str != null) {
            s.LJI(str);
            this.LLIZLLLIL.LIZ = null;
        }
        String str2 = this.LLIZLLLIL.LIZIZ;
        if (str2 != null) {
            s.LJI(str2);
            this.LLIZLLLIL.LIZIZ = null;
        }
        InterfaceC1418120n0U interfaceC1418120n0U = this.LLJI;
        if (interfaceC1418120n0U != null) {
            interfaceC1418120n0U.cancel();
        }
        C09AE c09ae = this.LLIZLLLIL.LIZJ;
        if (c09ae != null) {
            c09ae.LIZIZ(null);
            this.LLIZLLLIL.LIZJ = null;
        }
        C09AE c09ae2 = this.LLIZLLLIL.LIZLLL;
        if (c09ae2 != null) {
            c09ae2.LIZIZ(null);
            this.LLIZLLLIL.LIZLLL = null;
        }
        C09AE c09ae3 = this.LLIZLLLIL.LJ;
        if (c09ae3 != null) {
            c09ae3.LIZIZ(null);
            this.LLIZLLLIL.LJ = null;
        }
    }

    private final void xa2() {
        this.LLILZLL = new C1418420n0y(0.0f, 0.0f, 0.0f, 15);
    }

    public final void KH0() {
        InterfaceC1418410n0x interfaceC1418410n0x;
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent cancelAutoCut");
        C1418230n0f c1418230n0f = this.LLIZ;
        if (c1418230n0f != null && (interfaceC1418410n0x = c1418230n0f.LJI) != null) {
            interfaceC1418410n0x.onCancel();
        }
        exit();
    }

    public final int Z1() {
        C1418420n0y c1418420n0y = this.LLILZLL;
        C1418420n0y c1418420n0y2 = this.LLILZIL;
        s sVar = s.LIZ;
        return (int) (((c1418420n0y.LIZ * c1418420n0y2.LIZ) + (c1418420n0y.LIZJ * c1418420n0y2.LIZJ) + (c1418420n0y.LIZIZ * c1418420n0y2.LIZIZ) + (c1418420n0y.LIZLLL * c1418420n0y2.LIZLLL)) * 100);
    }

    @Override // X.C0L4W
    public void exit() {
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent exit");
        C1418230n0f c1418230n0f = this.LLIZ;
        InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f != null ? c1418230n0f.LJI : null;
        this.LLIZ = null;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_first_template_jumped_exit_fix", true, true)) {
            if (!C1417040myk.LIZ() || !this.LLJ) {
                o2();
            }
            this.LLJ = false;
        } else if (!C1417040myk.LIZ() || !this.LLJ) {
            o2();
            this.LLJ = false;
        }
        C5();
        this.LLJI = null;
        C1418220n0e c1418220n0e = this.LLILZ;
        if (c1418220n0e != null) {
            C01TT.LIZLLL(new AwS566S0100000_22(c1418220n0e, 995));
        }
        InterfaceC539200LCs interfaceC539200LCs = C539190LCr.LIZ;
        if (interfaceC539200LCs != null) {
            interfaceC539200LCs.LIZIZ();
        }
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.onExit();
        }
    }

    @Override // X.C0L4W
    public void rG0() {
        C1418220n0e c1418220n0e = this.LLILZ;
        if (c1418220n0e != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C428201lY(c1418220n0e, null), 3);
        }
    }

    public final void retry() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent retry = ");
        sbLIZ.append(this.LLIZ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C1418230n0f c1418230n0f = this.LLIZ;
        if (c1418230n0f != null) {
            InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
            if (interfaceC1418410n0x != null) {
                interfaceC1418410n0x.LIZIZ();
            }
            P4(c1418230n0f);
        }
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        v3();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    private final void O3(C1418200n0c c1418200n0c) {
        this.LLIZLLLIL = new C1418390n0v(new C1417310mzB(c1418200n0c.LJI, c1418200n0c.LJFF, 0, null, null, null, null, null, null, null, null, null, null, null, null, false, 16777212), !c1418200n0c.LIZ, 31);
    }

    private final C1418420n0y X1(C1418230n0f c1418230n0f) {
        float f;
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        float f2 = 0.0f;
        if (c1418200n0c.LIZ) {
            if (!c1418200n0c.LIZJ && !c1418200n0c.LIZIZ) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
        } else {
            f = 0.0f;
        }
        if (c1418200n0c.LIZJ) {
            if (c1418200n0c.LIZIZ) {
                f2 = (1.0f - f) / 2;
            } else if (!c1418200n0c.LIZIZ) {
                f2 = 1.0f - f;
            }
        }
        return new C1418420n0y(f, (1 - f) - f2, f2, 8);
    }

    private final void d5(C1418230n0f c1418230n0f) {
        Integer numValueOf;
        boolean z;
        EnumC1417520mzW enumC1417520mzW;
        boolean z2;
        String str;
        AutoCutThemeData autoCutThemeData = c1418230n0f.LIZ.LJIIIZ;
        s.LIZ.getClass();
        Pair pairLJJL = s.LJJL(autoCutThemeData);
        AVMusic aVMusic = (AVMusic) pairLJJL.getFirst();
        String str2 = (String) pairLJJL.getSecond();
        AutoCutThemeData autoCutThemeData2 = c1418230n0f.LIZ.LJIIIIZZ;
        String str3 = (String) s.LJJL(autoCutThemeData2).getSecond();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non-refactor, non-concurrent: realStartAutoCut: targetTheme = ");
        sbLIZ.append(s.LJ(autoCutThemeData));
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (c1418200n0c.LIZ) {
            List<AutoCutMediaModel> list = c1418200n0c.LJII;
            if (str3 == null) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = str3;
            }
            n5(list, str, c1418200n0c.LIZLLL, c1418200n0c.LJIIL, true, c1418200n0c.LJIILJJIL, c1418230n0f.LJI, c1418230n0f.LJIIIIZZ, new AwS566S0100000_22(c1418230n0f, 40), new C1418140n0W(c1418230n0f, autoCutThemeData2, this, str3), c1418230n0f.LJIIJJI);
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_cc_template_autocut", true) != 0) {
                C1419950n3R c1419950n3R = new C1419950n3R("preload", C1417910n09.LIZIZ(c1418230n0f.LIZ.LJII), GsonProtectorUtils.toJson(C7740030o.LIZ().getGson(), c1418230n0f.LIZ.LJIIL));
                this.LLJI = c1419950n3R;
                c1419950n3R.LIZIZ();
                return;
            }
            return;
        }
        if (autoCutThemeData != null) {
            numValueOf = Integer.valueOf(autoCutThemeData.templateType);
        } else {
            numValueOf = null;
        }
        int value = EnumC1412640mre.CUT_SAME.getValue();
        if (numValueOf == null || numValueOf.intValue() != value) {
            int value2 = EnumC1412640mre.PUGC_TEMPLATE.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                int value3 = EnumC1412640mre.UGC_TEMPLATE.getValue();
                if (numValueOf == null || numValueOf.intValue() != value3) {
                    int value4 = EnumC1412640mre.AIGT.getValue();
                    if (numValueOf == null || numValueOf.intValue() != value4) {
                        int value5 = EnumC1412640mre.SGT.getValue();
                        if (numValueOf == null || numValueOf.intValue() != value5) {
                            if (str2 != null && str2.length() > 0) {
                                C1418200n0c c1418200n0c2 = c1418230n0f.LIZ;
                                if (c1418200n0c2.LIZIZ) {
                                    String str4 = c1418200n0c2.LJIIJ;
                                    int value6 = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
                                    EnumC1417520mzW enumC1417520mzW2 = EnumC1417520mzW.TEMPLATE_MUSIC;
                                    C1418200n0c c1418200n0c3 = c1418230n0f.LIZ;
                                    List<AutoCutMediaModel> list2 = c1418200n0c3.LJII;
                                    CreativeInfo creativeInfo = c1418200n0c3.LJIIL;
                                    if (c1418200n0c3.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    k5(new C1418250n0h(str4, str2, "", "", "", value6, "", "", enumC1417520mzW2, list2, null, null, creativeInfo, z, c1418230n0f.LJIIIIZZ, false, c1418230n0f.LJI, false, c1418230n0f.LJIIJ, null, null, 1707008));
                                }
                                C1418200n0c c1418200n0c4 = c1418230n0f.LIZ;
                                if (c1418200n0c4.LIZJ) {
                                    if (aVMusic != null) {
                                        c3(aVMusic, c1418230n0f.LJI);
                                        return;
                                    } else {
                                        q3(str2, c1418230n0f.LJI);
                                        return;
                                    }
                                }
                                if (c1418200n0c4.LIZIZ) {
                                    return;
                                }
                                O4(c1418230n0f.LJI);
                                return;
                            }
                            return;
                        }
                    }
                }
            }
        }
        C1417310mzB c1417310mzB = this.LLIZLLLIL.LJFF;
        if (c1417310mzB != null) {
            c1417310mzB.LIZJ = autoCutThemeData.templateType;
            c1417310mzB.LJIIIZ = autoCutThemeData.templateId;
            c1417310mzB.LJIJJ = autoCutThemeData.musicId;
            c1417310mzB.LJIIJ = autoCutThemeData.templateGroupId;
            c1417310mzB.LJIIJJI = autoCutThemeData.templateTag;
            c1417310mzB.LJIIL = autoCutThemeData.sceneType;
        }
        if (c1418230n0f.LIZ.LIZIZ) {
            if (autoCutThemeData.templateType == EnumC1412640mre.AIGT.getValue()) {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_AIGT;
            } else if (autoCutThemeData.templateType == EnumC1412640mre.SGT.getValue()) {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_SGT;
            } else if (autoCutThemeData.templateType == EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_PUGC;
            } else if (autoCutThemeData.templateType == EnumC1412640mre.UGC_TEMPLATE.getValue()) {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_UGC;
            } else {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_CC;
            }
            String str5 = autoCutThemeData.templateId;
            int i = autoCutThemeData.templateType;
            String str6 = autoCutThemeData.templateUrl;
            String str7 = autoCutThemeData.templateData;
            C1418200n0c c1418200n0c5 = c1418230n0f.LIZ;
            List<AutoCutMediaModel> list3 = c1418200n0c5.LJII;
            Set<String> set = autoCutThemeData.preloadUrsSet;
            CreativeInfo creativeInfo2 = c1418200n0c5.LJIIL;
            InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
            String str8 = autoCutThemeData.templateGroupId;
            String str9 = "";
            if (str8 == null) {
                str8 = "";
            }
            if (c1418200n0c5.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z3 = c1418230n0f.LJIIIIZZ;
            String str10 = autoCutThemeData.templateTag;
            if (str10 != null) {
                str9 = str10;
            }
            String str11 = str8;
            k5(new C1418250n0h("", "", str5, str11, str9, i, str6, str7, enumC1417520mzW, list3, set, null, creativeInfo2, z2, z3, C1417320mzC.LIZ(autoCutThemeData), interfaceC1418410n0x, false, c1418230n0f.LJIIJ, null, null, 1705984));
        }
        if (autoCutThemeData.templateType != EnumC1412640mre.PUGC_TEMPLATE.getValue() && autoCutThemeData.templateType != EnumC1412640mre.UGC_TEMPLATE.getValue() && autoCutThemeData.templateType != EnumC1412640mre.AIGT.getValue() && autoCutThemeData.templateType != EnumC1412640mre.SGT.getValue()) {
            if (C0LCZ.LIZ(C1412660mrg.LIZJ(autoCutThemeData.templateType), autoCutThemeData.musicPostUnavailable, autoCutThemeData.musicId, autoCutThemeData.musicUrl)) {
                C0LCY c0lcy = C0LCY.LIZ;
                String str12 = c1418230n0f.LJIIJ.LIZ;
                c0lcy.getClass();
                C0LCY.LIZJ(autoCutThemeData, str12);
                String str13 = autoCutThemeData.musicId;
                String str14 = autoCutThemeData.musicUrl;
                Boolean bool = autoCutThemeData.musicPostUnavailable;
                C1418100n0S c1418100n0S = c1418230n0f.LJIIJ;
                c1418100n0S.LIZIZ = autoCutThemeData.templateId;
                c1418100n0S.LIZJ = C1412660mrg.LIZJ(autoCutThemeData.templateType);
                i3(str13, str14, aVMusic, bool, c1418100n0S, c1418230n0f.LJI);
                return;
            }
            C1418200n0c c1418200n0c6 = c1418230n0f.LIZ;
            c1418200n0c6.LIZJ = false;
            this.LLILZLL.LIZJ = 1.0f;
            if (c1418200n0c6.LIZIZ) {
                return;
            }
            O4(c1418230n0f.LJI);
            return;
        }
        if (!c1418230n0f.LIZ.LIZJ) {
            return;
        }
        if (aVMusic != null) {
            c3(aVMusic, c1418230n0f.LJI);
        } else {
            if (!C123100dR.LIZ(str2)) {
                return;
            }
            q3(str2, c1418230n0f.LJI);
        }
    }

    public final void O4(InterfaceC1418410n0x interfaceC1418410n0x) {
        String str;
        C1418230n0f c1418230n0f;
        NLEModel nLEModel;
        C1417310mzB c1417310mzB = this.LLIZLLLIL.LJFF;
        if (c1417310mzB != null && c1417310mzB.LJII != null && (c1417310mzB == null || (nLEModel = c1417310mzB.LJII) == null || nLEModel.getMainTrack() == null)) {
            str = "AUTO_CUT_NO_TRACK_CRASH: ";
        } else {
            str = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent processSuccessResult: ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLIZLLLIL.LJFF);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        C1417310mzB c1417310mzB2 = this.LLIZLLLIL.LJFF;
        if (c1417310mzB2 != null && (c1418230n0f = this.LLIZ) != null && Q3(c1418230n0f, c1417310mzB2)) {
            if (interfaceC1418410n0x != null) {
                interfaceC1418410n0x.LJIIJJI(new C1417310mzB(c1417310mzB2.LIZ, c1417310mzB2.LIZIZ, c1417310mzB2.LIZJ, c1417310mzB2.LIZLLL, c1417310mzB2.LJ, c1417310mzB2.LJFF, c1417310mzB2.LJI, c1417310mzB2.LJII, c1417310mzB2.LJIIIIZZ, c1417310mzB2.LJIIIZ, c1417310mzB2.LJIIJ, c1417310mzB2.LJIIJJI, c1417310mzB2.LJIIL, c1417310mzB2.LJIILIIL, c1417310mzB2.LJIILJJIL, c1417310mzB2.LJIILL, c1417310mzB2.LJIILLIIL, c1417310mzB2.LJIIZILJ, c1417310mzB2.LJIJ, c1417310mzB2.LJIJI, c1417310mzB2.LJIJJ, c1417310mzB2.LJIJJLI, c1417310mzB2.LJIL, c1417310mzB2.LJJ));
            }
            C5();
            this.LLJI = null;
            C1418220n0e c1418220n0e = this.LLILZ;
            if (c1418220n0e != null) {
                c1418220n0e.LJIIJJI(c1417310mzB2);
            }
        }
    }

    public final void P4(C1418230n0f c1418230n0f) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", "non-refactor: realStartAutoCut ==========================");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent realStartAutoCut: config = ");
        sbLIZ.append(c1418230n0f);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        s.LJJLIIIJLLLLLLLZ(C2537209ww.LIZ());
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (c1418200n0c.LIZ || c1418200n0c.LIZIZ) {
            C1419810n3D.LIZJ(null);
            if (!C1419810n3D.LJIILIIL) {
                E3(1017, Integer.MIN_VALUE, "SmartMovie SDK init failed: VE plugin not installed", null, null);
                return;
            }
        }
        o2();
        xa2();
        O3(c1418230n0f.LIZ);
        this.LLJI = null;
        C1418220n0e c1418220n0e = this.LLILZ;
        if (c1418220n0e != null) {
            C01TT.LIZLLL(new AwS566S0100000_22(c1418220n0e, 998));
        }
        InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIJJLI();
        }
        AutoCutThemeData autoCutThemeData = c1418230n0f.LIZ.LJIIIIZZ;
        s.LIZ.getClass();
        Pair pairLJJL = s.LJJL(autoCutThemeData);
        AVMusic aVMusic = (AVMusic) pairLJJL.getFirst();
        String str = (String) pairLJJL.getSecond();
        int iLIZ = C311120CHm.LIZ();
        if (C1697810uHb.LJIIJJI(1, 2).contains(Integer.valueOf(iLIZ))) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C534740Ky8(this, c1418230n0f, iLIZ, null), 3);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("non-refactor: realStartAutoCut: presetTheme = ");
        sbLIZ2.append(s.LJ(autoCutThemeData));
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ2));
        if (c1418230n0f.LIZJ && autoCutThemeData != null && aVMusic != null && C123100dR.LIZ(str)) {
            T4(c1418230n0f, autoCutThemeData, aVMusic, str);
        } else {
            d5(c1418230n0f);
        }
    }

    public final void k5(final C1418250n0h c1418250n0h) {
        boolean z;
        C1418200n0c c1418200n0c;
        boolean z2;
        C1418200n0c c1418200n0c2;
        InterfaceC1418410n0x interfaceC1418410n0x;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non-refactor: requestNLEModel: musicId = ");
        sbLIZ.append(c1418250n0h.LIZIZ);
        sbLIZ.append(", templateId = ");
        sbLIZ.append(c1418250n0h.LIZJ);
        sbLIZ.append(", templateType = ");
        sbLIZ.append(c1418250n0h.LJFF);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoCutComponent start requestNLEModel: mediaList: ");
        sbLIZ2.append(C13LP.LJJLIIIJ(c1418250n0h.LJIIIZ, null, null, null, 0, null, AFwS239S0000000_8.get$arr$(42), 31));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
        m3(20L, new AwS601S0100000_22(this, 39));
        InterfaceC1418410n0x interfaceC1418410n0x2 = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x2 != null) {
            interfaceC1418410n0x2.LJIIIIZZ(c1418250n0h.LJFF, c1418250n0h.LIZIZ, c1418250n0h.LIZ, c1418250n0h.LIZJ, c1418250n0h.LIZLLL, c1418250n0h.LJ, c1418250n0h.LJII);
        }
        EnumC1417520mzW enumC1417520mzW = c1418250n0h.LJIIIIZZ;
        if (enumC1417520mzW != EnumC1417520mzW.TEMPLATE_CC && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_PUGC && c1418250n0h.LJFF != EnumC1412640mre.AIGT.getValue() && c1418250n0h.LJFF != EnumC1412640mre.SGT.getValue() && c1418250n0h.LJIIIIZZ != EnumC1417520mzW.TEMPLATE_UGC && (interfaceC1418410n0x = c1418250n0h.LJIILLIIL) != null) {
            interfaceC1418410n0x.LIZLLL("compress");
        }
        InterfaceC1418410n0x interfaceC1418410n0x3 = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x3 != null) {
            interfaceC1418410n0x3.LIZLLL("nlemodel_request_success");
        }
        String str = null;
        if (C295320Bhq.LIZ()) {
            C1418390n0v c1418390n0v = this.LLIZLLLIL;
            s sVar = s.LIZ;
            String str2 = c1418250n0h.LIZ;
            String str3 = c1418250n0h.LIZIZ;
            String str4 = c1418250n0h.LIZJ;
            String str5 = c1418250n0h.LJI;
            String str6 = c1418250n0h.LJII;
            EnumC1417520mzW enumC1417520mzW2 = c1418250n0h.LJIIIIZZ;
            List<AutoCutMediaModel> list = c1418250n0h.LJIIIZ;
            Set<String> set = c1418250n0h.LJIIJ;
            CreativeInfo creativeInfo = c1418250n0h.LJIIL;
            C1418230n0f c1418230n0f = this.LLIZ;
            if (c1418230n0f != null && (c1418200n0c2 = c1418230n0f.LIZ) != null && c1418200n0c2.LJIILIIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = c1418250n0h.LJFF;
            C1417310mzB c1417310mzB = c1418390n0v.LJFF;
            if (c1417310mzB != null) {
                str = c1417310mzB.LJIILJJIL;
            }
            String str7 = c1418250n0h.LIZLLL;
            InterfaceC1635410sex interfaceC1635410sexB3 = B3();
            InterfaceC1418120n0U interfaceC1418120n0U = c1418250n0h.LJIIJJI;
            boolean z3 = c1418250n0h.LJIILIIL;
            boolean z4 = c1418250n0h.LJIILJJIL;
            boolean z5 = c1418250n0h.LJIILL;
            boolean z6 = c1418250n0h.LJIIZILJ;
            sVar.getClass();
            c1418390n0v.LJ = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1417980n0G(this, c1418250n0h, null), s.LJJJJLL(str2, str3, str4, str5, str6, enumC1417520mzW2, list, set, creativeInfo, z2, true, i, "source_auto_cut", str, str7, interfaceC1635410sexB3, interfaceC1418120n0U, z3, z4, z5, z6, this)));
            return;
        }
        C1418390n0v c1418390n0v2 = this.LLIZLLLIL;
        String str8 = c1418250n0h.LIZ;
        String str9 = c1418250n0h.LIZIZ;
        String str10 = c1418250n0h.LIZJ;
        String str11 = c1418250n0h.LJI;
        String str12 = c1418250n0h.LJII;
        EnumC1417520mzW enumC1417520mzW3 = c1418250n0h.LJIIIIZZ;
        List<AutoCutMediaModel> list2 = c1418250n0h.LJIIIZ;
        Set<String> set2 = c1418250n0h.LJIIJ;
        CreativeInfo creativeInfo2 = c1418250n0h.LJIIL;
        C1418230n0f c1418230n0f2 = this.LLIZ;
        if (c1418230n0f2 != null && (c1418200n0c = c1418230n0f2.LIZ) != null && c1418200n0c.LJIILIIL) {
            z = true;
        } else {
            z = false;
        }
        int i2 = c1418250n0h.LJFF;
        C1417310mzB c1417310mzB2 = c1418390n0v2.LJFF;
        if (c1417310mzB2 != null) {
            str = c1417310mzB2.LJIILJJIL;
        }
        String str13 = c1418250n0h.LIZLLL;
        InterfaceC1635410sex interfaceC1635410sexB32 = B3();
        InterfaceC1418120n0U interfaceC1418120n0U2 = c1418250n0h.LJIIJJI;
        boolean z7 = c1418250n0h.LJIILIIL;
        boolean z8 = c1418250n0h.LJIILJJIL;
        boolean z9 = c1418250n0h.LJIILL;
        boolean z10 = c1418250n0h.LJIIZILJ;
        final List listSingletonList = Collections.singletonList(c1418250n0h.LJIILLIIL);
        c1418390n0v2.LIZIZ = s.LJJJLIIL(str8, str9, str10, str11, str12, enumC1417520mzW3, list2, set2, creativeInfo2, z, true, i2, "source_auto_cut", str, str13, interfaceC1635410sexB32, interfaceC1418120n0U2, z7, z8, z9, z10, this, new C1417970n0F(listSingletonList) { // from class: X.0n0M
            @Override // X.C1417970n0F
            public final void LIZ(String str14) {
                this.LJII.e4(str14, c1418250n0h);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressDone(VecMeta vecMeta) throws Throwable {
                List<MetaExt> listLIZJ;
                C1418150n0X c1418150n0X = this.LJII;
                if (vecMeta != null) {
                    listLIZJ = C1418020n0K.LIZJ(vecMeta);
                } else {
                    listLIZJ = null;
                }
                c1418150n0X.o4(listLIZJ, c1418250n0h);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onCompressProgress(float f) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoCutComponent requestNLEModel onCompressProgress progress: ");
                sbLIZ3.append(f);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFetchProgress(float f) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoCutComponent requestNLEModel onFetchProgress: progress = ");
                sbLIZ3.append(f);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onNeedFetch(VecStr vecStr) {
                List<String> listLLIIII;
                C1418150n0X c1418150n0X = this.LJII;
                if (vecStr != null) {
                    listLLIIII = C13LP.LLIIII(vecStr);
                } else {
                    listLLIIII = null;
                }
                c1418150n0X.F4(listLLIIII, c1418250n0h);
            }

            @Override // X.C1417970n0F
            public final void LIZIZ(NLEModel nLEModel, Map<String, String> map) {
                this.LJII.K4(nLEModel, c1418250n0h, map);
            }

            @Override // X.C1417970n0F, com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
                Map<String, String> mapLJIIZILJ;
                super.onResponse(nLEModel, unorderedMapStrStr);
                C1418150n0X c1418150n0X = this.LJII;
                if (unorderedMapStrStr != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
                } else {
                    mapLJIIZILJ = null;
                }
                c1418150n0X.H4(nLEModel, mapLJIIZILJ, c1418250n0h);
            }

            @Override // X.C1417970n0F
            public final void LIZJ(int i3, int i4, String str14) {
                this.LJII.E3(i3, Integer.valueOf(i4), str14, null, null);
            }

            @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
            public final void onFailure(String str14, int i3, String str15, UnorderedMapStrStr unorderedMapStrStr) {
                Map<String, String> mapLJIIZILJ;
                C1418150n0X c1418150n0X = this.LJII;
                if (unorderedMapStrStr != null) {
                    mapLJIIZILJ = C2097608Jq.LJIIZILJ(unorderedMapStrStr);
                } else {
                    mapLJIIZILJ = null;
                }
                c1418150n0X.z4(str14, i3, str15, mapLJIIZILJ, c1418250n0h);
            }
        });
    }

    @Override // X.C0L4W
    public void ob0(C1418230n0f c1418230n0f) {
        AutoCutThemeData autoCutThemeData;
        boolean z;
        AutoCutThemeData autoCutThemeData2;
        MusicBuzModel musicBuzModel;
        String str;
        List<AutoCutMediaModel> list;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent startAutoCut: config = ");
        sbLIZ.append(c1418230n0f);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (!C545820Lau.LIZLLL(getActivity(), this.LLILLJJLI)) {
            s.LIZ.getClass();
            if (s.LJJIJIL()) {
                Activity activity = getActivity();
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.messageRes(2131829438);
                C1390380mHk.LIZ(activity, 1026, creativeToastBuilder);
                return;
            }
        }
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (c1418200n0c.LIZ) {
            if (!(!c1418200n0c.LJII.isEmpty())) {
                return;
            }
        } else {
            AutoCutThemeData autoCutThemeData3 = c1418200n0c.LJIIIZ;
            if ((autoCutThemeData3 != null && autoCutThemeData3.templateType == EnumC1412640mre.CUT_SAME.getValue()) || ((autoCutThemeData = c1418230n0f.LIZ.LJIIIZ) != null && autoCutThemeData.templateType == EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue())) {
                z = true;
            } else {
                z = false;
            }
            AutoCutThemeData autoCutThemeData4 = c1418230n0f.LIZ.LJIIIZ;
            if (autoCutThemeData4 != null && C1417320mzC.LIZ(autoCutThemeData4)) {
                z = false;
            }
            AutoCutThemeData autoCutThemeData5 = c1418230n0f.LIZ.LJIIIZ;
            if ((autoCutThemeData5 == null || (str = autoCutThemeData5.musicId) == null || str.length() <= 0) && (((autoCutThemeData2 = c1418230n0f.LIZ.LJIIIZ) == null || (musicBuzModel = autoCutThemeData2.musicBuzModel) == null || MusicBeanUtilKt.extractAVMusic(musicBuzModel) == null) && !z)) {
                return;
            }
        }
        if (!c1418230n0f.LJ && ((list = this.LLJIJIL) == null || !C1416110mxF.LJI(list, c1418230n0f.LIZ.LJII))) {
            rG0();
            this.LLJIJIL = c1418230n0f.LIZ.LJII;
        }
        this.LLIZ = c1418230n0f;
        this.LLILZIL = X1(c1418230n0f);
        InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LIZJ();
        }
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C539180LCq(null), 3);
        Scene scene = this.LLILLJJLI;
        C1418220n0e c1418220n0e = new C1418220n0e(scene, c1418230n0f, new C1418430n0z(new C1418400n0w(this), new C539240LCw(this)));
        this.LLILZ = c1418220n0e;
        if (!scene.mViewDestroyed) {
            C1418270n0j c1418270n0j = c1418220n0e.LJ;
            C1418320n0o c1418320n0o = c1418230n0f.LIZIZ;
            EnumC1418280n0k enumC1418280n0k = c1418230n0f.LIZ.LJIILJJIL;
            c1418270n0j.LLILZ = (TuxTextView) c1418270n0j.LL.findViewById(R.id.rwk);
            c1418270n0j.LLILZIL = (TuxTextView) c1418270n0j.LL.findViewById(R.id.jow);
            c1418270n0j.LLILZLL = (TuxIconView) c1418270n0j.LL.findViewById(R.id.hff);
            c1418270n0j.LLIZ = (C1322110kVd) c1418270n0j.LL.findViewById(R.id.o57);
            c1418270n0j.LLIZLLLIL = (TuxIconView) c1418270n0j.LL.findViewById(R.id.nmk);
            c1418270n0j.LLJ = (TuxTextView) c1418270n0j.LL.findViewById(R.id.s9w);
            c1418270n0j.LLJI = (TuxIconView) c1418270n0j.LL.findViewById(R.id.tec);
            c1418270n0j.LLJIJIL = (ImageView) c1418270n0j.LL.findViewById(R.id.cover);
            Integer numLIZJ = C1308910kAL.LIZJ(c1418320n0o.LIZIZ, c1418270n0j.getContext());
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                TuxTextView tuxTextView = c1418270n0j.LLILZ;
                if (tuxTextView != null) {
                    tuxTextView.setTextColor(iIntValue);
                }
            }
            Integer numLIZJ2 = C1308910kAL.LIZJ(c1418320n0o.LIZJ, c1418270n0j.getContext());
            if (numLIZJ2 != null) {
                int iIntValue2 = numLIZJ2.intValue();
                TuxTextView tuxTextView2 = c1418270n0j.LLILZIL;
                if (tuxTextView2 != null) {
                    tuxTextView2.setTextColor(iIntValue2);
                }
            }
            Integer numLIZJ3 = C1308910kAL.LIZJ(c1418320n0o.LIZLLL, c1418270n0j.getContext());
            if (numLIZJ3 != null) {
                int iIntValue3 = numLIZJ3.intValue();
                TuxIconView tuxIconView = c1418270n0j.LLILZLL;
                if (tuxIconView != null) {
                    tuxIconView.setTintColor(iIntValue3);
                }
            }
            Integer numLIZJ4 = C1308910kAL.LIZJ(c1418320n0o.LJ, c1418270n0j.getContext());
            if (numLIZJ4 != null) {
                int iIntValue4 = numLIZJ4.intValue();
                TuxIconView tuxIconView2 = c1418270n0j.LLJI;
                if (tuxIconView2 != null) {
                    tuxIconView2.setTintColor(iIntValue4);
                }
            }
            c1418270n0j.LLJILJIL = c1418320n0o.LJFF;
            if (C0C64.LJIILLIIL().LJIIIZ(31744, "autocut_loading_change_title", true, false) && C13LQ.LJLIIL(new EnumC1418280n0k[]{EnumC1418280n0k.UPLOAD_PAGE, EnumC1418280n0k.PREVIEW_PAGE, EnumC1418280n0k.SHOOT_PAGE_EDIT_TAB}).contains(enumC1418280n0k)) {
                TuxTextView tuxTextView3 = c1418270n0j.LLILZ;
                if (tuxTextView3 != null) {
                    tuxTextView3.setText(c1418270n0j.getContext().getString(2131826926));
                }
                TuxTextView tuxTextView4 = c1418270n0j.LLILZIL;
                if (tuxTextView4 != null) {
                    tuxTextView4.setText(c1418270n0j.getContext().getString(2131826925));
                }
            }
            if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_auto_cut_cancel_delay_seconds", true) > 0 && C13LQ.LJLIIL(new EnumC1418280n0k[]{EnumC1418280n0k.UPLOAD_PAGE, EnumC1418280n0k.PREVIEW_PAGE, EnumC1418280n0k.SHOOT_PAGE_EDIT_TAB}).contains(enumC1418280n0k)) {
                TuxIconView tuxIconView3 = c1418270n0j.LLILZLL;
                if (tuxIconView3 != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView3, 4);
                }
                TuxIconView tuxIconView4 = c1418270n0j.LLILZLL;
                if (tuxIconView4 != null) {
                    C786410Ut5.x5(tuxIconView4, 0.0f);
                }
                ARunnableS122S0100000_22 aRunnableS122S0100000_22 = new ARunnableS122S0100000_22(c1418270n0j, 114);
                c1418270n0j.LLILLL = aRunnableS122S0100000_22;
                C786410Ut5.LJLIIL(C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_auto_cut_cancel_delay_seconds", true) * LSPassThroughRecordSizeConfig.DEFAULT, c1418270n0j.LLILLJJLI, aRunnableS122S0100000_22);
            }
            c1418270n0j.LIZ(true);
            c1418220n0e.LJJ();
            C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
            c1390920mIc.LIZ.LLJJIII = c1418220n0e.LJ;
            c1390920mIc.LJIIIIZZ(0);
            c1390920mIc.LIZ.LLJJIJIIJIL = true;
            Integer numLIZJ5 = C1308910kAL.LIZJ(c1418230n0f.LIZIZ.LIZ, c1418220n0e.LIZLLL);
            TuxSheet tuxSheet = c1390920mIc.LIZ;
            tuxSheet.LLJI = numLIZJ5;
            tuxSheet.LLILLL = false;
            tuxSheet.LLJLLIL = true;
            tuxSheet.LLJLLL = false;
            tuxSheet.LL = new DialogInterfaceOnCancelListenerC1466620oGi(c1418220n0e, 3);
            c1418220n0e.LJFF = tuxSheet;
            if (!c1418230n0f.LJIIIIZZ && !c1418230n0f.LJIIIZ) {
                tuxSheet.show(C20622515mp.LJIILL((C19EG) scene.mActivity, scene), "AutoCutLoadingPopView");
            }
            c1418220n0e.LJ.setExitListener(new AwS566S0100000_22(c1418220n0e, 996));
            c1418220n0e.LJ.setRetryListener(new AwS566S0100000_22(c1418220n0e, 997));
            C0T6J.LIZ(c1418220n0e.LJ, AFwS210S0000000_22.get$arr$(437));
        }
        this.LLJILJIL = SystemClock.elapsedRealtime();
        C09AE c09ae = c1418230n0f.LJII;
        if (c09ae != null) {
            C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), C0PEM.LIZ, null, new C539170LCp(c09ae, this, c1418230n0f, null), 2);
        } else {
            P4(c1418230n0f);
        }
    }

    public C1418150n0X(C1DRG c1drg, Scene scene) {
        this.LL = c1drg;
        this.LLILLJJLI = scene;
    }

    private final void H5(C1418250n0h c1418250n0h, Asset asset) {
        FileInf file;
        Icon icon;
        List<String> url_list;
        String str;
        C1417310mzB c1417310mzB;
        C1417310mzB c1417310mzB2;
        String str2;
        EnumC1412640mre enumC1412640mreLIZLLL;
        if (C296620Bjw.LIZ()) {
            List<FileInf> package_list = asset.getPackage_list();
            if (package_list == null || (file = (FileInf) C13LP.LJJJLL(package_list)) == null) {
                file = new FileInf(null, null, null, null, null);
            }
            List<Icon> icon_list = asset.getIcon_list();
            if (icon_list != null) {
                icon = (Icon) C13LP.LJJJLL(icon_list);
            } else {
                icon = null;
            }
        } else {
            file = asset.getFile();
            icon = asset.getIcon();
        }
        AssetType assetType = AssetPanelModelKt.toAssetType(asset.getAsset_type());
        if (assetType != null && (enumC1412640mreLIZLLL = C1412660mrg.LIZLLL(assetType)) != null) {
            int value = enumC1412640mreLIZLLL.getValue();
            c1418250n0h.LJFF = value;
            C1417310mzB c1417310mzB3 = this.LLIZLLLIL.LJFF;
            if (c1417310mzB3 != null) {
                c1417310mzB3.LIZJ = value;
            }
        }
        String asset_id = asset.getAsset_id();
        c1418250n0h.LIZJ = asset_id;
        C1417310mzB c1417310mzB4 = this.LLIZLLLIL.LJFF;
        if (c1417310mzB4 != null) {
            c1417310mzB4.LJIIIZ = asset_id;
        }
        List<String> url_list2 = file.getUrl_list();
        if (url_list2 != null && (str2 = (String) C13LP.LJJJLL(url_list2)) != null) {
            c1418250n0h.LJI = str2;
            C1417310mzB c1417310mzB5 = this.LLIZLLLIL.LJFF;
            if (c1417310mzB5 != null) {
                c1417310mzB5.LJIILLIIL = str2;
            }
        }
        String title = asset.getTitle();
        C1417310mzB c1417310mzB6 = this.LLIZLLLIL.LJFF;
        if (c1417310mzB6 != null) {
            c1417310mzB6.LJIIZILJ = title;
        }
        String template_tag = asset.getBusiness_extra().getTemplate_tag();
        if (template_tag != null) {
            c1418250n0h.LJ = template_tag;
            C1417310mzB c1417310mzB7 = this.LLIZLLLIL.LJFF;
            if (c1417310mzB7 != null) {
                c1417310mzB7.LJIIJJI = template_tag;
            }
        }
        String scene_type = asset.getBusiness_extra().getScene_type();
        if (scene_type != null && (c1417310mzB2 = this.LLIZLLLIL.LJFF) != null) {
            c1417310mzB2.LJIIL = scene_type;
        }
        String template_group_id = asset.getBusiness_extra().getTemplate_group_id();
        if (template_group_id != null) {
            c1418250n0h.LIZLLL = template_group_id;
            C1417310mzB c1417310mzB8 = this.LLIZLLLIL.LJFF;
            if (c1417310mzB8 != null) {
                c1417310mzB8.LJIIJ = template_group_id;
            }
        }
        if (icon != null && (url_list = icon.getUrl_list()) != null && (str = (String) C13LP.LJJJLL(url_list)) != null && (c1417310mzB = this.LLIZLLLIL.LJFF) != null) {
            c1417310mzB.LJIL = str;
        }
        InterfaceC1418410n0x interfaceC1418410n0x = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIIIZ(c1418250n0h.LJFF, c1418250n0h.LIZJ, c1418250n0h.LIZLLL, c1418250n0h.LJ);
        }
    }

    private final boolean Q3(C1418230n0f c1418230n0f, C1417310mzB c1417310mzB) {
        if ((!this.LLIZLLLIL.LJI && c1418230n0f.LIZ.LIZ) || !c1417310mzB.LIZLLL()) {
            return false;
        }
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (!c1417310mzB.LIZJ(c1418200n0c.LIZJ, c1418200n0c.LIZIZ)) {
            return false;
        }
        return true;
    }

    private final void m3(long j, Function1<? super Float, Unit> function1) {
        C1418230n0f c1418230n0f = this.LLIZ;
        if (c1418230n0f != null && c1418230n0f.LJIIIIZZ) {
            return;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C0LD4(this, j, function1, null), 3);
    }

    private final EnumC1418300n0m w2(int i, Map<String, String> map) {
        String str;
        if (C1697810uHb.LJIIJJI(Integer.valueOf(SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue()), Integer.valueOf(SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue())).contains(Integer.valueOf(i))) {
            if (!C0XF1.LIZLLL(C0CHQ.LIZ)) {
                return EnumC1418300n0m.ERROR_PROCESS_INTERNET;
            }
            if (map != null) {
                str = map.get("weak_net");
            } else {
                str = null;
            }
            if (Intrinsics.LJFF("weak_net", str)) {
                return EnumC1418300n0m.ERROR_PROCESS_INTERNET_WEAK;
            }
        }
        return EnumC1418300n0m.ERROR_PROCESS_GENERAL;
    }

    public final void E5(C096D c096d, InterfaceC1418410n0x interfaceC1418410n0x) {
        if (c096d instanceof C096B) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutComponent requestRecommendedMusicList: ");
            sbLIZ.append(c096d);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C096B c096b = (C096B) c096d;
            AbstractC23165095v abstractC23165095v = c096b.LIZIZ;
            if (Intrinsics.LJFF(abstractC23165095v, C23167095x.LIZ)) {
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("before_extract");
                    interfaceC1418410n0x.LIZLLL("after_extract");
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" BEFORE_EXTRACTOR");
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            if (Intrinsics.LJFF(abstractC23165095v, C23166095w.LIZ)) {
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("after_extract");
                }
                if (C311120CHm.LIZIZ()) {
                    if (interfaceC1418410n0x != null) {
                        interfaceC1418410n0x.LIZLLL("zip_generate");
                    }
                } else if (C311120CHm.LIZ() != 1 && interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("music_request_success");
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" AFTER_EXTRACTOR");
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                return;
            }
            if (Intrinsics.LJFF(abstractC23165095v, C23168095y.LIZ)) {
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("zip_generate");
                }
                if (C290450BZz.LIZ()) {
                    if (C311120CHm.LIZ() != 1 && interfaceC1418410n0x != null) {
                        interfaceC1418410n0x.LIZLLL("music_request_success");
                    }
                } else if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("zip_upload_tos");
                }
                if (C311120CHm.LIZ() == 1 && interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("extract_clip_128");
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(" ZIP_GENERATE_SUCCESS, path = ");
                sbLIZ4.append(c096b.LJ);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ4));
                return;
            }
            throw new C1954807lC();
        }
        if (c096d instanceof C096E) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("AutoCutComponent requestRecommendedMusicList: ");
            sbLIZ5.append(c096d);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
            if (interfaceC1418410n0x != null) {
                interfaceC1418410n0x.LJIILLIIL("music_request_success");
            }
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(strLIZIZ2);
            sbLIZ6.append(" RESPONSE_SUCCESS, result = ");
            sbLIZ6.append(((C096E) c096d).LIZIZ);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ6));
            return;
        }
        if (!(c096d instanceof C096C)) {
            return;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("AutoCutComponent requestRecommendedMusicList: ");
        sbLIZ7.append(c096d);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
        StringBuilder sbLIZ8 = C2188811AlT.LIZ();
        sbLIZ8.append(strLIZIZ3);
        sbLIZ8.append(" REQUEST_ERROR, code = ");
        C096C c096c = (C096C) c096d;
        sbLIZ8.append(c096c.LIZIZ);
        sbLIZ8.append(", msg = ");
        sbLIZ8.append(c096c.LIZJ);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ8));
    }

    public final void F4(List<String> list, C1418250n0h c1418250n0h) {
        StringBuilder sb = new StringBuilder();
        int size = 0;
        Integer numValueOf = null;
        if (list != null) {
            int i = 0;
            for (String str : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = str;
                    if (i != 0) {
                        sb.append(",");
                    }
                    sb.append(str2);
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent ASYNC_RENDER: templateType=");
        sbLIZ.append(c1418250n0h.LJFF);
        sbLIZ.append(", Necessary Count=");
        if (list != null) {
            numValueOf = Integer.valueOf(list.size());
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(" onNeedFetch effect: ");
        sbLIZ.append((Object) sb);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        if (!C13LQ.LJLIIL(new EnumC1417520mzW[]{EnumC1417520mzW.TEMPLATE_CC, EnumC1417520mzW.TEMPLATE_PUGC, EnumC1417520mzW.TEMPLATE_AIGT, EnumC1417520mzW.TEMPLATE_SGT, EnumC1417520mzW.TEMPLATE_UGC}).contains(c1418250n0h.LJIIIIZZ)) {
            InterfaceC1418410n0x interfaceC1418410n0x = c1418250n0h.LJIILLIIL;
            if (interfaceC1418410n0x != null) {
                if (list != null) {
                    size = list.size();
                }
                interfaceC1418410n0x.LJIIJ(size);
            }
            InterfaceC1418410n0x interfaceC1418410n0x2 = c1418250n0h.LJIILLIIL;
            if (interfaceC1418410n0x2 != null) {
                interfaceC1418410n0x2.LIZLLL("download_effect");
            }
        }
    }

    public final void c3(final AVMusic aVMusic, final InterfaceC1418410n0x interfaceC1418410n0x) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non-refactor: downloadMusic with avMusic: ");
        sbLIZ.append(aVMusic.getMusicId());
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoCutComponent start downloadMusic: musicId = ");
        sbLIZ2.append(aVMusic.getMusicId());
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
        C1417310mzB c1417310mzB = this.LLIZLLLIL.LJFF;
        if (c1417310mzB != null) {
            c1417310mzB.LJ = aVMusic;
        }
        m3(20L, new AwS601S0100000_22(this, 35));
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIILJJIL(aVMusic.getMusicId());
        }
        C1403010mc7.LIZ.getMusicService().LJ("auto_cut", getActivity(), aVMusic, 0, false, new InterfaceC1416880myU() { // from class: X.0n0d
            @Override // X.InterfaceC1416880myU
            public final void LIZJ(boolean z) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onProgress(int i) {
            }

            @Override // X.InterfaceC1416880myU
            public final void onStart() {
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZ(Integer num, String str) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoCutComponent download music onFailed: code = ");
                sbLIZ3.append(num);
                sbLIZ3.append(", msg = ");
                sbLIZ3.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                this.LIZ.E3(1007, num, str, null, null);
            }

            @Override // X.InterfaceC1416880myU
            public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
                C1418150n0X c1418150n0X;
                C1418220n0e c1418220n0e;
                C201955140j.LIZLLL(C1398350mUb.LIZIZ, "AutoCutCore", "non-refactor: downloadMusic Success");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("AutoCutComponent download music onSuccess: musicPath: ");
                sbLIZ3.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                C1418150n0X c1418150n0X2 = this.LIZ;
                C1417310mzB c1417310mzB2 = c1418150n0X2.LLIZLLLIL.LJFF;
                if (c1417310mzB2 != null) {
                    c1417310mzB2.LJFF = str;
                }
                c1418150n0X2.LLILZLL.LIZJ = 1.0f;
                if (c1417310mzB2 != null && c1417310mzB2.LIZLLL() && (c1418220n0e = (c1418150n0X = this.LIZ).LLILZ) != null) {
                    c1418220n0e.LJJI(c1418150n0X.Z1());
                }
                InterfaceC1418410n0x interfaceC1418410n0x2 = interfaceC1418410n0x;
                if (interfaceC1418410n0x2 != null) {
                    interfaceC1418410n0x2.LIZ(aVMusic.getMusicId());
                }
                this.LIZ.O4(interfaceC1418410n0x);
            }
        }, false);
    }

    public final void e4(String str, C1418250n0h c1418250n0h) {
        Object c098200Yq;
        try {
            C1227904rF.LIZ.getClass();
            c098200Yq = (Asset) C1227904rF.LIZIZ(str, Asset.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Asset asset = (Asset) c098200Yq;
        if (asset != null) {
            H5(c1418250n0h, asset);
            Function1<Asset, Unit> function1 = c1418250n0h.LJIJI;
            if (function1 != null) {
                function1.invoke(asset);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o4(java.util.List<com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt> r28, X.C1418250n0h r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418150n0X.o4(java.util.List, X.0n0h):void");
    }

    public final void q3(final String str, final InterfaceC1418410n0x interfaceC1418410n0x) {
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIL(str);
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non-refactor: fetchAndDownloadMusic: musicId = ");
        sbLIZ.append(str);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoCutComponent start fetchAndDownloadMusic: musicId = ");
        sbLIZ2.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
        C1403010mc7.LIZ.getMusicService().requestMusic(str, new InterfaceC1416890myV() { // from class: X.0n0p
            @Override // X.InterfaceC1416890myV
            public final void LIZIZ(Exception exc) {
                this.LIZ.E3(1002, Integer.MIN_VALUE, null, null, null);
            }

            @Override // X.InterfaceC1416890myV
            public final void LIZLLL(AVMusic aVMusic) {
                if (aVMusic == null) {
                    this.LIZ.E3(1003, Integer.MIN_VALUE, null, null, null);
                    return;
                }
                InterfaceC1418410n0x interfaceC1418410n0x2 = interfaceC1418410n0x;
                if (interfaceC1418410n0x2 != null) {
                    interfaceC1418410n0x2.LJIJI(str);
                }
                this.LIZ.c3(aVMusic, interfaceC1418410n0x);
            }
        });
    }

    public final void H4(NLEModel nLEModel, Map<String, String> map, C1418250n0h c1418250n0h) {
        String str;
        String strValueOf = null;
        if (nLEModel == null || nLEModel.getMainTrack() == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoCutComponent AUTO_CUT_NO_TRACK_CRASH: extraParams=");
            sbLIZ.append(map);
            sbLIZ.append(", source=source_auto_cut, nleModelJob=");
            sbLIZ.append(nLEModel);
            C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        }
        if (map != null) {
            str = map.get("aigt_response");
            strValueOf = map.get("aigt_resp_status");
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            C1417710mzp c1417710mzp = C1417710mzp.LIZ;
            C1418100n0S c1418100n0S = c1418250n0h.LJIJ;
            String str2 = c1418100n0S.LIZLLL;
            String str3 = c1418100n0S.LJ;
            String str4 = c1418100n0S.LJFF;
            c1417710mzp.getClass();
            C1417710mzp.LJIIIIZZ(str2, str3, str4, strValueOf);
            return;
        }
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ASYNC_RENDER: templateType=");
        sbLIZ2.append(c1418250n0h.LJFF);
        sbLIZ2.append(", templateId=");
        sbLIZ2.append(c1418250n0h.LIZJ);
        sbLIZ2.append(", templateUrl=");
        sbLIZ2.append(c1418250n0h.LJI);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ2));
        s sVar = s.LIZ;
        int i = c1418250n0h.LJFF;
        sVar.getClass();
        if (nLEModel != null) {
            if (i != EnumC1412640mre.CUT_SAME.getValue() && i != EnumC1412640mre.PUGC_TEMPLATE.getValue()) {
                NLERenderResourceUtil.setNLEResourceNecessary(nLEModel, 132L, C0C64.LJIILLIIL().LJIJ(31744, 0, "autocut_progressive_render_necessary_time", true));
            } else {
                NLERenderResourceUtil.setUnnecessaryNLEResourceByTime(nLEModel, C0C64.LJIILLIIL().LJIJ(31744, 0, "autocut_cc_progressive_render_necessary_time", true));
            }
        }
        InterfaceC1418410n0x interfaceC1418410n0x = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJI(nLEModel, c1418250n0h.LJFF, c1418250n0h.LJIJJ);
        }
        InterfaceC1418410n0x interfaceC1418410n0x2 = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x2 != null) {
            interfaceC1418410n0x2.LJIILLIIL("nlemodel_request_success");
        }
        int iLIZ = C311140CHo.LIZ();
        if (strValueOf == null || iLIZ == -1) {
            return;
        }
        if (iLIZ > 0) {
            strValueOf = String.valueOf(iLIZ);
        }
        C1417710mzp c1417710mzp2 = C1417710mzp.LIZ;
        C1418100n0S c1418100n0S2 = c1418250n0h.LJIJ;
        String str5 = c1418100n0S2.LIZLLL;
        String str6 = c1418100n0S2.LJ;
        String str7 = c1418100n0S2.LJFF;
        c1417710mzp2.getClass();
        C1417710mzp.LJIIIIZZ(str5, str6, str7, strValueOf);
    }

    public final void K4(NLEModel nLEModel, C1418250n0h c1418250n0h, Map<String, String> map) {
        long jLJIJ = C0C64.LJIILLIIL().LJIJ(31744, LSPassThroughRecordSizeConfig.DEFAULT, "autocut_quick_loading_min_duration", true);
        boolean zLIZ = C1417040myk.LIZ();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.LLJILJIL;
        long j2 = jElapsedRealtime - j;
        C1418230n0f c1418230n0f = this.LLIZ;
        if (c1418230n0f != null && c1418230n0f.LIZJ && 1 != 0 && zLIZ && jLJIJ > 0 && j > 0) {
            long jMax = Math.max(0L, jLJIJ - j2);
            if (jMax > 0) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("AutoCutComponent onSuccessWhenRequestNLE: delay ");
                sbLIZ.append(jMax);
                sbLIZ.append("ms for min loading duration");
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZ), null, null, new C0L4T(jMax, this, nLEModel, c1418250n0h, map, null), 3);
                return;
            }
        }
        W2(nLEModel, c1418250n0h, map);
    }

    public final List<AutoCutThemeData> W1(List<AutoCutThemeData> list, AutoCutThemeData autoCutThemeData, C1418230n0f c1418230n0f) {
        if (!C0CHU.LIZ() && !C0CHV.LIZ()) {
            return list;
        }
        if (!Intrinsics.LJFF(c1418230n0f.LJIIL, "single_song") && c1418230n0f.LJIILIIL) {
            return list;
        }
        int iLIZ = C0CHI.LIZ();
        String str = c1418230n0f.LJIILJJIL;
        if (C0CHU.LIZ()) {
            return s.LIZIZ(list, autoCutThemeData, iLIZ, str);
        }
        if (C0CHV.LIZ()) {
            return s.LIZ(list, autoCutThemeData, iLIZ, str);
        }
        return list;
    }

    public final void W2(NLEModel nLEModel, C1418250n0h c1418250n0h, Map<String, String> map) {
        int iIntValue;
        NLEModel nLEModel2;
        NLETrack mainTrack;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        String str;
        Integer numValueOf;
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "AutoCutCore", "non-refactor: requestNLEModel Success");
        this.LLILZLL.LIZIZ = 1.0f;
        InterfaceC1418410n0x interfaceC1418410n0x = c1418250n0h.LJIILLIIL;
        String str2 = null;
        if (interfaceC1418410n0x != null) {
            String str3 = c1418250n0h.LIZIZ;
            String str4 = c1418250n0h.LIZ;
            String str5 = c1418250n0h.LIZJ;
            s.LIZ.getClass();
            String strLJJIIZ = s.LJJIIZ(map);
            if (strLJJIIZ == null) {
                strLJJIIZ = c1418250n0h.LIZLLL;
            }
            Integer numLJJIJ = s.LJJIJ(map);
            if (numLJJIJ != null) {
                iIntValue3 = numLJJIJ.intValue();
            } else {
                iIntValue3 = c1418250n0h.LJFF;
            }
            if (map != null && (str = map.get("text_sticker_duration")) != null && (numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str))) != null) {
                iIntValue4 = numValueOf.intValue();
            } else {
                iIntValue4 = 0;
            }
            interfaceC1418410n0x.LJFF(iIntValue3, iIntValue4, str3, str4, str5, strLJJIIZ);
        }
        EnumC1417520mzW enumC1417520mzW = EnumC1417520mzW.TEMPLATE_CC;
        if (!C13LQ.LJLIIL(new EnumC1417520mzW[]{enumC1417520mzW, EnumC1417520mzW.TEMPLATE_PUGC, EnumC1417520mzW.TEMPLATE_AIGT, EnumC1417520mzW.TEMPLATE_SGT, EnumC1417520mzW.TEMPLATE_UGC}).contains(c1418250n0h.LJIIIIZZ)) {
            InterfaceC1418410n0x interfaceC1418410n0x2 = c1418250n0h.LJIILLIIL;
            if (interfaceC1418410n0x2 != null) {
                String str6 = c1418250n0h.LIZIZ;
                String str7 = c1418250n0h.LIZJ;
                s.LIZ.getClass();
                String strLJJIIZ2 = s.LJJIIZ(map);
                if (strLJJIIZ2 == null) {
                    strLJJIIZ2 = c1418250n0h.LIZLLL;
                }
                Integer numLJJIJ2 = s.LJJIJ(map);
                if (numLJJIJ2 != null) {
                    iIntValue2 = numLJJIJ2.intValue();
                } else {
                    iIntValue2 = c1418250n0h.LJFF;
                }
                interfaceC1418410n0x2.LJIILIIL(iIntValue2, str6, str7, strLJJIIZ2);
            }
            InterfaceC1418410n0x interfaceC1418410n0x3 = c1418250n0h.LJIILLIIL;
            if (interfaceC1418410n0x3 != null) {
                interfaceC1418410n0x3.LJIILLIIL("download_effect");
            }
        }
        this.LLIZLLLIL.LIZIZ = null;
        s.LIZ.getClass();
        Integer numLJJIJ3 = s.LJJIJ(map);
        if (numLJJIJ3 != null) {
            iIntValue = numLJJIJ3.intValue();
        } else {
            iIntValue = c1418250n0h.LJFF;
        }
        if (C291070Baz.LIZ() && c1418250n0h.LJIIIIZZ == enumC1417520mzW && nLEModel != null && (mainTrack = nLEModel.getMainTrack()) != null) {
            mainTrack.setExtra("async_render", "async_render");
        }
        C1417310mzB c1417310mzB = this.LLIZLLLIL.LJFF;
        if (c1417310mzB != null) {
            if (C294050Bfn.LIZ()) {
                c1417310mzB.LJII = nLEModel;
            } else {
                if (nLEModel != null) {
                    C0EYQ.LJFF(nLEModel, iIntValue, c1418250n0h.LIZJ);
                    nLEModel2 = nLEModel;
                } else {
                    nLEModel2 = null;
                }
                c1417310mzB.LJII = nLEModel2;
            }
            c1417310mzB.LJI = s.LJJ(nLEModel);
            c1417310mzB.LIZJ = iIntValue;
            c1417310mzB.LJIIIZ = c1418250n0h.LIZJ;
            String strLJJIIZ3 = s.LJJIIZ(map);
            if (strLJJIIZ3 == null) {
                strLJJIIZ3 = c1418250n0h.LIZLLL;
            }
            c1417310mzB.LJIIJ = strLJJIIZ3;
            String strLJJIIZI = s.LJJIIZI(map);
            if (strLJJIIZI == null) {
                strLJJIIZI = c1418250n0h.LJ;
            }
            c1417310mzB.LJIIJJI = strLJJIIZI;
            if (map != null) {
                str2 = map.get("autocut_nle_log_id");
            }
            c1417310mzB.LJIILL = str2;
            c1417310mzB.LJIILLIIL = c1418250n0h.LJI;
            if (map != null) {
                String str8 = map.get("template_title");
                if (str8 != null && str8.length() > 0) {
                    c1417310mzB.LJIIZILJ = str8;
                }
                String str9 = map.get("template_subtitle");
                if (str9 != null && str9.length() > 0) {
                    c1417310mzB.LJIJ = str9;
                }
                String str10 = map.get("icon_url");
                if (str10 != null && str10.length() > 0) {
                    c1417310mzB.LJIL = str10;
                }
            }
        }
        O4(c1418250n0h.LJIILLIIL);
    }

    private final void T4(C1418230n0f c1418230n0f, AutoCutThemeData autoCutThemeData, AVMusic aVMusic, String str) {
        boolean z;
        boolean z2;
        if (C1417040myk.LIZ()) {
            Z4(c1418230n0f, autoCutThemeData, aVMusic, str);
            return;
        }
        C201955140j.LIZLLL(C1398350mUb.LIZIZ, "AutoCutCore", "non-refactor, concurrent: realStartAutoCutConcurrent");
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (c1418200n0c.LIZ) {
            n5(c1418200n0c.LJII, str, c1418200n0c.LIZLLL, c1418200n0c.LJIIL, false, c1418200n0c.LJIILJJIL, c1418230n0f.LJI, c1418230n0f.LJIIIIZZ, null, new AwS300S0300000_22(c1418230n0f, this, autoCutThemeData, 0), c1418230n0f.LJIIJJI);
        }
        C1418200n0c c1418200n0c2 = c1418230n0f.LIZ;
        if (c1418200n0c2.LIZIZ) {
            String str2 = c1418200n0c2.LJIIJ;
            int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
            EnumC1417520mzW enumC1417520mzW = EnumC1417520mzW.TEMPLATE_MUSIC;
            C1418200n0c c1418200n0c3 = c1418230n0f.LIZ;
            List<AutoCutMediaModel> list = c1418200n0c3.LJII;
            CreativeInfo creativeInfo = c1418200n0c3.LJIIL;
            if (c1418200n0c3.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = c1418230n0f.LJIIIIZZ;
            InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
            if (C311140CHo.LIZ() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            k5(new C1418250n0h(str2, str, "", "", "", value, "", "", enumC1417520mzW, list, null, null, creativeInfo, z, z3, false, interfaceC1418410n0x, z2, c1418230n0f.LJIIJ, new AwS601S0100000_22(autoCutThemeData, 37), null, 1051648));
        }
        if (c1418230n0f.LIZ.LIZJ) {
            c3(aVMusic, c1418230n0f.LJI);
        }
    }

    private final void Z4(C1418230n0f c1418230n0f, AutoCutThemeData autoCutThemeData, AVMusic aVMusic, String str) {
        boolean z;
        boolean z2;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("并发加载开始: reuseMusic=");
        sbLIZ.append(c1418230n0f.LIZJ);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LLJ = true;
        this.LLIZLLLIL.LJI = true;
        this.LLILZIL = new C1418420n0y(0.0f, 1.0f, 0.0f, 8);
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        String str2 = str;
        if (c1418200n0c.LIZ) {
            str2 = str2;
            n5(c1418200n0c.LJII, str2, c1418200n0c.LIZLLL, c1418200n0c.LJIIL, false, c1418200n0c.LJIILJJIL, c1418230n0f.LJI, c1418230n0f.LJIIIIZZ, new AwS566S0100000_22(c1418230n0f, 39), new AwS300S0300000_22(c1418230n0f, this, autoCutThemeData, 1), c1418230n0f.LJIIJJI);
        }
        C1418200n0c c1418200n0c2 = c1418230n0f.LIZ;
        if (c1418200n0c2.LIZIZ) {
            String str3 = c1418200n0c2.LJIIJ;
            int value = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
            EnumC1417520mzW enumC1417520mzW = EnumC1417520mzW.TEMPLATE_MUSIC;
            C1418200n0c c1418200n0c3 = c1418230n0f.LIZ;
            List<AutoCutMediaModel> list = c1418200n0c3.LJII;
            CreativeInfo creativeInfo = c1418200n0c3.LJIIL;
            if (c1418200n0c3.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                z = true;
            } else {
                z = false;
            }
            boolean z3 = c1418230n0f.LJIIIIZZ;
            InterfaceC1418410n0x interfaceC1418410n0x = c1418230n0f.LJI;
            if (C311140CHo.LIZ() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            k5(new C1418250n0h(str3, str2, "", "", "", value, "", "", enumC1417520mzW, list, null, null, creativeInfo, z, z3, false, interfaceC1418410n0x, z2, c1418230n0f.LJIIJ, new AwS601S0100000_22(autoCutThemeData, 38), autoCutThemeData, 3072));
        } else {
            this.LLILZLL.LIZIZ = 1.0f;
            C1418220n0e c1418220n0e = this.LLILZ;
            if (c1418220n0e != null) {
                c1418220n0e.LJJI(Z1());
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("并发加载启动完成: 耗时=");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append("ms");
        C201955140j.LJIILL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void D5(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i, String str, InterfaceC1418410n0x interfaceC1418410n0x) {
        int i2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent requestRecommendedMusicList: ");
        sbLIZ.append(f);
        sbLIZ.append(' ');
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (musicRequestCallbackInfoType == null) {
            i2 = -1;
        } else {
            i2 = C1418380n0u.LIZ[musicRequestCallbackInfoType.ordinal()];
        }
        switch (i2) {
            case 1:
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("before_extract");
                    interfaceC1418410n0x.LIZLLL("after_extract");
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(" BEFORE_EXTRACTOR");
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
                break;
            case 2:
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("after_extract");
                }
                if (C311120CHm.LIZIZ()) {
                    if (interfaceC1418410n0x != null) {
                        interfaceC1418410n0x.LIZLLL("zip_generate");
                    }
                } else if (C311120CHm.LIZ() != 1 && interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("music_request_success");
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(" AFTER_EXTRACTOR");
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ3));
                break;
            case 3:
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("zip_generate");
                }
                if (C290450BZz.LIZ()) {
                    if (C311120CHm.LIZ() != 1 && interfaceC1418410n0x != null) {
                        interfaceC1418410n0x.LIZLLL("music_request_success");
                    }
                } else if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("zip_upload_tos");
                }
                if (C311120CHm.LIZ() == 1 && interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LIZLLL("extract_clip_128");
                }
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ);
                sbLIZ4.append(" ZIP_GENERATE_SUCCESS, path = ");
                if (str == null) {
                    str = "";
                }
                sbLIZ4.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ4));
                break;
            case 4:
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("zip_upload_tos");
                    interfaceC1418410n0x.LIZLLL("music_request_success");
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ);
                sbLIZ5.append(" ZIP_UPLOAD_TOS_SUCCESS, tosPath = ");
                if (str == null) {
                    str = "";
                }
                sbLIZ5.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ5));
                break;
            case 5:
                if (interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("music_request_success");
                }
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ);
                sbLIZ6.append(" RESPONSE_SUCCESS, result = ");
                if (str == null) {
                    str = "";
                }
                sbLIZ6.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ6));
                break;
            case 6:
                if (C311120CHm.LIZ() == 1 && interfaceC1418410n0x != null) {
                    interfaceC1418410n0x.LJIILLIIL("extract_clip_128");
                    interfaceC1418410n0x.LIZLLL("music_request_success");
                    break;
                }
                break;
            case 7:
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ);
                sbLIZ7.append(" REQUEST_ERROR, code = ");
                sbLIZ7.append(i);
                sbLIZ7.append(", msg = ");
                if (str == null) {
                    str = "";
                }
                sbLIZ7.append(str);
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ7));
                break;
        }
    }

    public final void E3(int i, Integer num, String str, Map<String, String> map, Function0<Unit> function0) {
        boolean z;
        InterfaceC1418410n0x interfaceC1418410n0x;
        C1418230n0f c1418230n0f;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent handleFailure: errorCode = ");
        sbLIZ.append(i);
        sbLIZ.append(", errorMsg = ");
        sbLIZ.append(str);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = true;
        if (C1417040myk.LIZ() && this.LLJ) {
            z = true;
        } else {
            z = false;
        }
        if (!C306420Bzk.LIZ() || (c1418230n0f = this.LLIZ) == null || !c1418230n0f.LJIIIZ) {
            z2 = false;
        }
        if ((z || z2) && function0 != null) {
            function0.invoke();
            return;
        }
        EnumC1418300n0m enumC1418300n0mW2 = w2(i, map);
        C1418230n0f c1418230n0f2 = this.LLIZ;
        if (c1418230n0f2 != null && (interfaceC1418410n0x = c1418230n0f2.LJI) != null) {
            interfaceC1418410n0x.LJIJJ(i, num, str, enumC1418300n0mW2);
        }
        o2();
        C5();
        this.LLJI = null;
        C1418220n0e c1418220n0e = this.LLILZ;
        if (c1418220n0e != null) {
            c1418220n0e.LJIJJ(i, num, str, enumC1418300n0mW2);
        }
    }

    public final void H2(InterfaceC1418260n0i interfaceC1418260n0i, List<AutoCutThemeData> list, String str, Scene scene, boolean z) {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C539230LCv(list, interfaceC1418260n0i, str, scene, z, null), 3);
    }

    public final void z4(String str, int i, String str2, Map<String, String> map, C1418250n0h c1418250n0h) {
        String str3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutComponent requestNLEModel onFailure: ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(str2);
        sbLIZ.append(", extraParams=");
        sbLIZ.append(map);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        Map mapLJIIZILJ = null;
        numLJIIJJI = null;
        Integer numLJIIJJI = null;
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            if (map != null && (str3 = map.get("sub_error_code")) != null) {
                numLJIIJJI = C2095008Iq.LJIIJJI(str3);
            }
            E3(i, numLJIIJJI, str2, map, null);
            return;
        }
        InterfaceC1418410n0x interfaceC1418410n0x = c1418250n0h.LJIILLIIL;
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIILL();
        }
        if (map != null) {
            mapLJIIZILJ = C2097608Jq.LJIIZILJ(map);
        }
        C1417710mzp.LJIJI("source_auto_cut", str, i, str2, mapLJIIZILJ, null);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("AutoCutComponent templateType=");
        sbLIZ2.append(c1418250n0h.LJFF);
        sbLIZ2.append(", ASYNC_RENDER: Necessary onFailure urs=");
        sbLIZ2.append(str);
        sbLIZ2.append(", code=");
        sbLIZ2.append(i);
        sbLIZ2.append(", msg=");
        sbLIZ2.append(str2);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void i3(final String str, final String str2, AVMusic aVMusic, Boolean bool, C1418100n0S c1418100n0S, final InterfaceC1418410n0x interfaceC1418410n0x) {
        boolean zLJI = MethodIDManager.LJI(137915);
        if (interfaceC1418410n0x != null) {
            interfaceC1418410n0x.LJIL(str);
        }
        m3(20L, new AwS601S0100000_22(this, 36));
        ((ITemplateResourceService) ServiceManager.get().getService(ITemplateResourceService.class)).LIZ(getActivity(), str, str2, aVMusic, bool, c1418100n0S, new InterfaceC1428880nHq() { // from class: X.0n0g
            @Override // X.InterfaceC1428880nHq
            public final void LIZIZ(Exception exc) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZLLL(AVMusic aVMusic2) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJI() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJII(int i) {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC1428880nHq
            public final void LIZ(Integer num, String str3) {
                this.LIZ.E3(1007, num, str3, null, null);
            }

            @Override // X.InterfaceC1428880nHq
            public final void LJFF(AVMusic aVMusic2, String str3, boolean z, boolean z2) {
                C1418150n0X c1418150n0X;
                C1418220n0e c1418220n0e;
                C1417310mzB c1417310mzB = this.LIZ.LLIZLLLIL.LJFF;
                if (c1417310mzB != null) {
                    c1417310mzB.LJ = aVMusic2;
                    c1417310mzB.LJFF = str3;
                    c1417310mzB.LJIJI = str2;
                    c1417310mzB.LJIJJ = str;
                    c1417310mzB.LJIJJLI = Boolean.valueOf(z2);
                }
                C1418150n0X c1418150n0X2 = this.LIZ;
                c1418150n0X2.LLILZLL.LIZJ = 1.0f;
                C1417310mzB c1417310mzB2 = c1418150n0X2.LLIZLLLIL.LJFF;
                if (c1417310mzB2 != null && c1417310mzB2.LIZLLL() && (c1418220n0e = (c1418150n0X = this.LIZ).LLILZ) != null) {
                    c1418220n0e.LJJI(c1418150n0X.Z1());
                }
                InterfaceC1418410n0x interfaceC1418410n0x2 = interfaceC1418410n0x;
                if (interfaceC1418410n0x2 != null) {
                    interfaceC1418410n0x2.LIZ(aVMusic2.getMusicId());
                }
                this.LIZ.O4(interfaceC1418410n0x);
            }
        });
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0 A[PHI: r19
      0x00d0: PHI (r19v2 boolean) = (r19v1 boolean), (r19v7 boolean) binds: [B:24:0x00cd, B:15:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c A[PHI: r20
      0x012c: PHI (r20v1 boolean) = (r20v0 boolean), (r20v6 boolean) binds: [B:49:0x0129, B:40:0x00ef] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n5(java.util.List<com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel> r35, java.lang.String r36, int r37, com.ss.android.ugc.aweme.creative.model.CreativeInfo r38, boolean r39, X.EnumC1418280n0k r40, final X.InterfaceC1418410n0x r41, boolean r42, final kotlin.jvm.functions.Function0<kotlin.Unit> r43, final kotlin.jvm.functions.Function2<? super java.util.List<com.ss.android.ugc.aweme.cutsame.CutsameDataItem>, ? super java.lang.String, kotlin.Unit> r44, java.lang.String r45) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1418150n0X.n5(java.util.List, java.lang.String, int, com.ss.android.ugc.aweme.creative.model.CreativeInfo, boolean, X.0n0k, X.0n0x, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, java.lang.String):void");
    }

    private final void v5(List<AutoCutMediaModel> list, String str, int i, CreativeInfo creativeInfo, boolean z, EnumC1418280n0k enumC1418280n0k, InterfaceC1418410n0x interfaceC1418410n0x, boolean z2, String str2, Function0<Unit> function0, Function2<? super List<CutsameDataItem>, ? super String, Unit> function2) {
        n5(list, str, i, creativeInfo, z, enumC1418280n0k, interfaceC1418410n0x, z2, function0, function2, str2);
    }

    @Override // X.C0L4W
    public void OG1(List<AutoCutMediaModel> list, final AutoCutThemeData autoCutThemeData, String str, int i, boolean z, CreativeInfo creativeInfo, final EnumC1418280n0k enumC1418280n0k, String str2, Map<String, ? extends Object> map, final Function0<Unit> function0, final Function2<? super List<AutoCutThemeData>, ? super String, Unit> function2) throws JSONException {
        String str3;
        String str4;
        String str5;
        boolean z2;
        String str6;
        String str7;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("non-refactor: preRecommendMusic: presetTheme = ");
        s.LIZ.getClass();
        sbLIZ.append(s.LJ(autoCutThemeData));
        C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", C2188811AlT.LIZIZ(sbLIZ));
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommendMusic");
        Integer num = null;
        C1419810n3D.LIZJ(null);
        if (!C1419810n3D.LJIILIIL) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (C295320Bhq.LIZ()) {
            C1418390n0v c1418390n0v = this.LLIZLLLIL;
            C1418230n0f c1418230n0f = this.LLIZ;
            if (c1418230n0f != null) {
                str5 = c1418230n0f.LJIIL;
                z2 = c1418230n0f.LJIILIIL;
            } else {
                str5 = null;
                z2 = true;
            }
            if (c1418230n0f != null) {
                str6 = c1418230n0f.LJIILL;
                str7 = c1418230n0f.LJIILLIIL;
                num = c1418230n0f.LJIIZILJ;
            } else {
                str6 = null;
                str7 = null;
            }
            c1418390n0v.LIZLLL = C09IC.LJJI(LifecycleOwnerKt.getLifecycleScope(this), new C861640Xr8(new C1418180n0a(this, function0, enumC1418280n0k, function2, autoCutThemeData, null), s.LJJJLZIJ(list, str, i, creativeInfo, false, z, "source_preload_music", false, enumC1418280n0k, false, str2, str5, z2, map, str6, str7, num)));
            return;
        }
        C1418390n0v c1418390n0v2 = this.LLIZLLLIL;
        C1418230n0f c1418230n0f2 = this.LLIZ;
        if (c1418230n0f2 != null) {
            str3 = c1418230n0f2.LJIILL;
            str4 = c1418230n0f2.LJIILLIIL;
            num = c1418230n0f2.LJIIZILJ;
        } else {
            str3 = null;
            str4 = null;
        }
        c1418390n0v2.LIZ = s.LJJJJZI(list, str, i, creativeInfo, false, z, "source_preload_music", false, enumC1418280n0k, false, new MusicRequestCallback() { // from class: X.0n0b
            @Override // com.bytedance.ies.smartmovie.jni.MusicRequestCallback
            public final void onInfoCallBack(MusicRequestCallbackInfoType musicRequestCallbackInfoType, float f, int i2, String str8, UnorderedMapStrStr unorderedMapStrStr) {
                boolean z3;
                Function0<Unit> function02;
                C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("preRecommendMusic onInfoCallBack extraParams=");
                sbLIZ2.append(unorderedMapStrStr);
                C201955140j.LIZLLL(c1398350mUb2, "AutoCutComponent", C2188811AlT.LIZIZ(sbLIZ2));
                MusicRequestCallbackInfoType musicRequestCallbackInfoType2 = MusicRequestCallbackInfoType.REQUEST_ERROR;
                if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2 || musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
                    this.LIZ.LLIZLLLIL.LIZ = null;
                }
                if (musicRequestCallbackInfoType == musicRequestCallbackInfoType2 && (function02 = function0) != null) {
                    function02.invoke();
                }
                if (musicRequestCallbackInfoType == MusicRequestCallbackInfoType.RESPONSE_SUCCESS) {
                    C443120HZe<TemplateList, String, String> c443120HZeLJJLI = s.LJJLI(str8);
                    TemplateList first = c443120HZeLJJLI.getFirst();
                    String second = c443120HZeLJJLI.getSecond();
                    if (first == null || first.templateList == null || second == null) {
                        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommend parse musicList or taskId from response failed");
                        Function0<Unit> function03 = function0;
                        if (function03 == null) {
                            return;
                        }
                        function03.invoke();
                        return;
                    }
                    C201955140j.LIZLLL(c1398350mUb2, "AutoCutCore", "non-refactor: preRecommendMusic success");
                    if (enumC1418280n0k == EnumC1418280n0k.MUSIC_DETAIL) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    List<CutsameDataItem> list2 = first.templateList;
                    if (list2 != null) {
                        Function2<List<AutoCutThemeData>, String, Unit> function22 = function2;
                        AutoCutThemeData autoCutThemeData2 = autoCutThemeData;
                        s.LIZ.getClass();
                        function22.invoke(s.LJIIJ(list2, autoCutThemeData2, z3), second);
                    }
                }
            }
        }, str2, null, true, map, str3, str4, num);
    }
}
