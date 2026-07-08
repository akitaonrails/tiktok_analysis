package X;

import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0n0W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418140n0W extends C09AY implements Function2<List<? extends CutsameDataItem>, String, Unit> {
    public final /* synthetic */ C1418230n0f LL;
    public final /* synthetic */ AutoCutThemeData LLILLJJLI;
    public final /* synthetic */ C1418150n0X LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1418140n0W(C1418230n0f c1418230n0f, AutoCutThemeData autoCutThemeData, C1418150n0X c1418150n0X, String str) {
        super(2);
        this.LL = c1418230n0f;
        this.LLILLJJLI = autoCutThemeData;
        this.LLILLL = c1418150n0X;
        this.LLILZ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.0n0X] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.List] */
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
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends CutsameDataItem> list, String str) {
        ?? arrayList;
        EnumC1412640mre enumC1412640mreLIZJ;
        EnumC1417520mzW enumC1417520mzW;
        EnumC1417520mzW enumC1417520mzW2;
        String str2;
        boolean z;
        int value;
        boolean z2;
        List<? extends CutsameDataItem> list2 = list;
        String str3 = str;
        if (str3.length() > 0) {
            if (this.LL.LIZ.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                z2 = true;
            } else {
                z2 = false;
            }
            s sVar = s.LIZ;
            AutoCutThemeData autoCutThemeData = this.LLILLJJLI;
            sVar.getClass();
            arrayList = s.LJIIJ(list2, autoCutThemeData, z2);
        } else {
            s.LIZ.getClass();
            arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            int i = 0;
            for (CutsameDataItem cutsameDataItem : list2) {
                C0MJ9 c0mj9 = C0MJ9.AUTO_CUT;
                s.LIZ.getClass();
                arrayList.add(C1417910n09.LIZLLL(cutsameDataItem, c0mj9, i, s.LJIJJLI(false), false));
                i++;
            }
        }
        this.LLILLL.H2(this.LL.LJI, arrayList, str3, null, false);
        this.LLILLL.LLIZLLLIL.LJI = true;
        AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) C13LP.LJJJJZI(arrayList);
        if (this.LL.LIZ.LJIIJJI) {
            enumC1412640mreLIZJ = EnumC1412640mre.SOUND_SYNC_TEMPLATE;
        } else {
            enumC1412640mreLIZJ = C1412660mrg.LIZJ(autoCutThemeData2.templateType);
        }
        C1417310mzB c1417310mzB = this.LLILLL.LLIZLLLIL.LJFF;
        if (c1417310mzB != null) {
            if (enumC1412640mreLIZJ != null) {
                value = enumC1412640mreLIZJ.getValue();
            } else {
                value = EnumC1412640mre.DESIGNER_FIXED_TEMPLATE.getValue();
            }
            c1417310mzB.LIZJ = value;
            c1417310mzB.LJIIIZ = autoCutThemeData2.templateId;
            c1417310mzB.LJIJJ = autoCutThemeData2.musicId;
            c1417310mzB.LJIIJ = autoCutThemeData2.templateGroupId;
            c1417310mzB.LJIIJJI = autoCutThemeData2.templateTag;
            c1417310mzB.LJIIL = autoCutThemeData2.sceneType;
            if (C123100dR.LIZ(autoCutThemeData2.musicUrl)) {
                c1417310mzB.LJIJI = autoCutThemeData2.musicUrl;
            }
        }
        C1418230n0f c1418230n0f = this.LL;
        C1418200n0c c1418200n0c = c1418230n0f.LIZ;
        if (!c1418200n0c.LIZIZ && !c1418200n0c.LIZJ) {
            this.LLILLL.O4(c1418230n0f.LJI);
        } else {
            if ((!C123100dR.LIZ(this.LLILZ) || enumC1412640mreLIZJ == EnumC1412640mre.PUGC_TEMPLATE || enumC1412640mreLIZJ == EnumC1412640mre.UGC_TEMPLATE) && enumC1412640mreLIZJ != EnumC1412640mre.DESIGNER_FIXED_TEMPLATE && enumC1412640mreLIZJ != EnumC1412640mre.ALGORITHM_TEMPLATE && enumC1412640mreLIZJ != EnumC1412640mre.SOUND_SYNC_TEMPLATE && enumC1412640mreLIZJ != EnumC1412640mre.AUTOCUT_TEMPLATE && enumC1412640mreLIZJ != EnumC1412640mre.LYRICS_RULE_TEMPLATE) {
                if (enumC1412640mreLIZJ == EnumC1412640mre.PUGC_TEMPLATE) {
                    enumC1417520mzW = EnumC1417520mzW.TEMPLATE_PUGC;
                } else if (enumC1412640mreLIZJ == EnumC1412640mre.UGC_TEMPLATE) {
                    enumC1417520mzW = EnumC1417520mzW.TEMPLATE_UGC;
                } else if (enumC1412640mreLIZJ == EnumC1412640mre.AIGT) {
                    enumC1417520mzW = EnumC1417520mzW.TEMPLATE_AIGT;
                } else if (enumC1412640mreLIZJ == EnumC1412640mre.SGT) {
                    enumC1417520mzW = EnumC1417520mzW.TEMPLATE_SGT;
                } else {
                    enumC1417520mzW = EnumC1417520mzW.TEMPLATE_CC;
                }
            } else {
                enumC1417520mzW = EnumC1417520mzW.TEMPLATE_MUSIC;
            }
            EnumC1417520mzW enumC1417520mzW3 = EnumC1417520mzW.TEMPLATE_CC;
            if (enumC1417520mzW == enumC1417520mzW3 && !C1417320mzC.LIZ(autoCutThemeData2)) {
                this.LL.LIZ.LIZJ = false;
                this.LLILLL.LLILZLL.LIZJ = 1.0f;
            }
            C1418230n0f c1418230n0f2 = this.LL;
            C1418200n0c c1418200n0c2 = c1418230n0f2.LIZ;
            if (!c1418200n0c2.LIZIZ && !c1418200n0c2.LIZJ) {
                this.LLILLL.O4(c1418230n0f2.LJI);
            } else {
                s.LIZ.getClass();
                Pair pairLJJL = s.LJJL(autoCutThemeData2);
                AVMusic aVMusic = (AVMusic) pairLJJL.getFirst();
                String str4 = (String) pairLJJL.getSecond();
                if (this.LL.LIZ.LIZIZ) {
                    if (enumC1417520mzW != enumC1417520mzW3) {
                        InterfaceC1418120n0U interfaceC1418120n0U = this.LLILLL.LLJI;
                        if (interfaceC1418120n0U != null) {
                            interfaceC1418120n0U.cancel();
                        }
                        this.LLILLL.LLJI = null;
                    }
                    C1418150n0X c1418150n0X = this.LLILLL;
                    String str5 = "";
                    if (str4 == null) {
                        str2 = "";
                    } else {
                        str2 = str4;
                    }
                    String str6 = autoCutThemeData2.templateId;
                    if (str6 == null) {
                        str6 = "";
                    }
                    String str7 = autoCutThemeData2.templateGroupId;
                    if (str7 == null) {
                        str7 = "";
                    }
                    String str8 = autoCutThemeData2.templateTag;
                    if (str8 == null) {
                        str8 = "";
                    }
                    if (enumC1412640mreLIZJ == null) {
                        enumC1412640mreLIZJ = EnumC1412640mre.DESIGNER_FIXED_TEMPLATE;
                    }
                    int value2 = enumC1412640mreLIZJ.getValue();
                    String str9 = autoCutThemeData2.templateUrl;
                    if (str9 != null) {
                        str5 = str9;
                    }
                    String str10 = autoCutThemeData2.templateData;
                    C1418230n0f c1418230n0f3 = this.LL;
                    C1418200n0c c1418200n0c3 = c1418230n0f3.LIZ;
                    List<AutoCutMediaModel> list3 = c1418200n0c3.LJII;
                    Set<String> set = autoCutThemeData2.preloadUrsSet;
                    CreativeInfo creativeInfo = c1418200n0c3.LJIIL;
                    InterfaceC1418120n0U interfaceC1418120n0U2 = this.LLILLL.LLJI;
                    if (c1418200n0c3.LJIILJJIL == EnumC1418280n0k.MUSIC_DETAIL) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z3 = c1418230n0f3.LJIIIIZZ;
                    boolean zLIZ = C1417320mzC.LIZ(autoCutThemeData2);
                    C1418230n0f c1418230n0f4 = this.LL;
                    enumC1417520mzW2 = enumC1417520mzW;
                    String str11 = str6;
                    String str12 = str7;
                    String str13 = str8;
                    c1418150n0X.k5(new C1418250n0h(str3, str2, str11, str12, str13, value2, str5, str10, enumC1417520mzW2, list3, set, interfaceC1418120n0U2, creativeInfo, z, z3, zLIZ, c1418230n0f4.LJI, false, c1418230n0f4.LJIIJ, null, null, 1703936));
                } else {
                    enumC1417520mzW2 = enumC1417520mzW;
                }
                C1418230n0f c1418230n0f5 = this.LL;
                if (c1418230n0f5.LIZ.LIZJ) {
                    if (enumC1417520mzW2 != EnumC1417520mzW.TEMPLATE_MUSIC && enumC1417520mzW2 != EnumC1417520mzW.TEMPLATE_PUGC && enumC1417520mzW2 != EnumC1417520mzW.TEMPLATE_AIGT && enumC1417520mzW2 != EnumC1417520mzW.TEMPLATE_SGT && enumC1417520mzW2 != EnumC1417520mzW.TEMPLATE_UGC) {
                        if (enumC1417520mzW2 == enumC1417520mzW3) {
                            C0LCY c0lcy = C0LCY.LIZ;
                            String str14 = c1418230n0f5.LJIIJ.LIZ;
                            c0lcy.getClass();
                            C0LCY.LIZJ(autoCutThemeData2, str14);
                            if (C1417320mzC.LIZ(autoCutThemeData2)) {
                                C1418150n0X c1418150n0X2 = this.LLILLL;
                                String str15 = autoCutThemeData2.musicId;
                                String str16 = autoCutThemeData2.musicUrl;
                                Boolean bool = autoCutThemeData2.musicPostUnavailable;
                                C1418100n0S c1418100n0S = this.LL.LJIIJ;
                                c1418100n0S.LIZIZ = autoCutThemeData2.templateId;
                                c1418100n0S.LIZJ = C1412660mrg.LIZJ(autoCutThemeData2.templateType);
                                c1418150n0X2.i3(str15, str16, aVMusic, bool, c1418100n0S, this.LL.LJI);
                            }
                        }
                    } else if (aVMusic != null) {
                        this.LLILLL.c3(aVMusic, c1418230n0f5.LJI);
                    } else if (str4 != null) {
                        this.LLILLL.q3(str4, c1418230n0f5.LJI);
                    } else {
                        this.LLILLL.E3(1009, Integer.MIN_VALUE, null, null, null);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
