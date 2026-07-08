package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLERenderResourceUtil;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutCategory;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.effectmanager.effect.model.AssetFrom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0myt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public abstract class AbstractC1417130myt implements InterfaceC1418410n0x {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<AutoCutMediaModel> LIZLLL;
    public final String LJ;
    public final int LJFF;
    public final AutoCutModel LJI;
    public final String LJII;
    public final boolean LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final Function1<AVMusic, String> LJIIJJI;
    public final boolean LJIIL;
    public final boolean LJIILIIL;
    public final Function1<C0LAB, Unit> LJIILJJIL;
    public final Function1<C1417310mzB, String> LJIILL;
    public final boolean LJIILLIIL;
    public final Integer LJIIZILJ;
    public final boolean LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public long LJJ;
    public long LJJI;
    public String LJJIFFI;
    public String LJJII;
    public String LJJIII;
    public String LJJIIJ;
    public String LJJIIJZLJL;
    public int LJJIIZ;
    public String LJJIIZI;
    public int LJJIJ;
    public int LJJIJIIJI;
    public int LJJIJIIJIL;
    public final Map<String, Long> LJJIJIL;
    public NLEModel LJJIJL;
    public int LJJIJLIJ;
    public String LJJIL;
    public long LJJIZ;

    @Override // X.InterfaceC1418260n0i
    public void LJIIZILJ() {
    }

    @Override // X.InterfaceC1418410n0x
    public final void LIZIZ() {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        int i = this.LJJIJIIJIL;
        int i2 = this.LJFF;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("content_source", i2 == 0 ? "upload" : "shoot");
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(i, "error_type");
        C20684815ws.LJIILLIIL("click_autocut_retry", c0lab.LIZ);
    }

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
    @Override // X.InterfaceC1418410n0x
    public void LIZJ() {
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        int i = this.LJFF;
        String str4 = this.LJI.clickFrom;
        boolean z = this.LJIILIIL;
        String str5 = this.LJ;
        Function1<C0LAB, Unit> function1 = this.LJIILJJIL;
        C443120HZe<Integer, Integer, Integer> c443120HZeLJ = C1417710mzp.LJ(list);
        int iIntValue = c443120HZeLJ.getFirst().intValue();
        int iIntValue2 = c443120HZeLJ.getSecond().intValue();
        int iIntValue3 = c443120HZeLJ.getThird().intValue();
        int i2 = 0;
        if (list != null && !list.isEmpty()) {
            Iterator<AutoCutMediaModel> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().isLiveHighlight && (i2 = i2 + 1) < 0) {
                    C1697810uHb.LJIJ();
                    throw null;
                }
            }
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("content_source", i == 0 ? "upload" : "shoot");
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(iIntValue, "content_cnt");
        C1417710mzp.LIZ.getClass();
        c0lab.LJ("content_form", C1417710mzp.LIZJ(list));
        c0lab.LIZ(iIntValue2, "pic_cnt");
        c0lab.LIZ(iIntValue3, "video_cnt");
        c0lab.LIZ(i2, "highlights_cnt");
        c0lab.LIZ(z ? 1 : 0, "is_from_multi_photo_special_page");
        c0lab.LJ("autocut_click_from", str4);
        c0lab.LJ("reuse_music_type", str5);
        function1.invoke(c0lab);
        C20684815ws.LJIILLIIL("enter_autocut_edit_page", c0lab.LIZ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIILL() {
        this.LJJIJIIJI++;
    }

    public final boolean LJJIFFI() {
        String str = this.LJJIL;
        return str != null && str.length() > 0;
    }

    @Override // X.InterfaceC1418410n0x
    public void onCancel() {
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        String str3 = this.LIZJ;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LJIJI);
        String str4 = this.LJ;
        int i = this.LJFF;
        String str5 = this.LJI.clickFrom;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str);
        c0lab.LJ("shoot_way", str2);
        c0lab.LJ("content_source", i == 0 ? "upload" : "shoot");
        c0lab.LJ("creation_id", str3);
        c0lab.LIZ(list != null ? list.size() : 0, "content_cnt");
        C1417710mzp.LIZ.getClass();
        c0lab.LJ("content_form", C1417710mzp.LIZJ(list));
        c0lab.LIZIZ(jLIZLLL, "duration");
        c0lab.LJ("reuse_music_type", str4);
        c0lab.LJ("autocut_click_from", str5);
        C20684815ws.LJIILLIIL("exit_autocut_edit_page", c0lab.LIZ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJ() {
        this.LJIJJ = System.currentTimeMillis();
    }

    @Override // X.InterfaceC1418410n0x
    public final void LJIJJLI() {
        this.LJIJI = System.currentTimeMillis();
        ((LinkedHashMap) this.LJJIJIL).clear();
        this.LJJIL = null;
        this.LJJIIZ = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tool_performance_generate_autocut start, time=");
        sbLIZ.append(System.currentTimeMillis());
        C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1418260n0i
    public final void LIZ(String str) {
        C1417710mzp.LJIIJ("source_auto_cut", true, 0, null, C1417710mzp.LIZLLL(this.LJIL), str, this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LIZLLL(String str) {
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutMobListener: onStageStart stage=");
        sbLIZ.append(str);
        sbLIZ.append(", time=");
        sbLIZ.append(System.currentTimeMillis());
        C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
        this.LJJIJIL.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // X.InterfaceC1418260n0i
    public void LJIIJJI(C1417310mzB c1417310mzB) {
        Integer numValueOf;
        String strLIZ;
        int i;
        String str;
        boolean z;
        int i2;
        AutoCutCategory autoCutCategory;
        String str2;
        String str3;
        boolean zLIZIZ;
        Set<String> set;
        long jLIZLLL = C1417710mzp.LIZLLL(this.LJIJI);
        long j = this.LJJIZ;
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str4 = this.LIZIZ;
        String str5 = this.LIZJ;
        String str6 = this.LJ;
        int i3 = this.LJFF;
        String str7 = this.LIZ;
        int i4 = c1417310mzB.LIZJ;
        AutoCutModel autoCutModel = this.LJI;
        String str8 = autoCutModel.clickFrom;
        String str9 = c1417310mzB.LJIIIZ;
        String str10 = c1417310mzB.LJIIJ;
        String str11 = this.LJJII;
        int i5 = this.LJJIJLIJ;
        boolean zLJJIFFI = LJJIFFI();
        String str12 = this.LJJIFFI;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLL(this.LJI.templateList);
        Integer numValueOf2 = null;
        if (autoCutThemeData != null && (set = autoCutThemeData.preloadUrsSet) != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        String str13 = c1417310mzB.LJIIJJI;
        String str14 = this.LJII;
        boolean z2 = this.LJIIL;
        NLEModel nLEModel = this.LJJIJL;
        if (nLEModel != null) {
            strLIZ = C0FPT.LIZ(nLEModel);
        } else {
            strLIZ = null;
        }
        C1417710mzp.LJJIFFI(true, 0, Integer.MIN_VALUE, null, jLIZLLL, j, list, str4, str5, str6, i3, str7, i4, str8, str9, str11, null, autoCutModel, i5, zLJJIFFI, str10, str12, numValueOf, str13, str14, z2, strLIZ, this.LJIILJJIL);
        AutoCutModel autoCutModel2 = this.LJI;
        autoCutModel2.clickFromMostRecent = autoCutModel2.clickFrom;
        if (!this.LJIIJ && !this.LJIIL) {
            C443120HZe<Integer, Integer, Integer> c443120HZeLJ = C1417710mzp.LJ(this.LIZLLL);
            c443120HZeLJ.getFirst().intValue();
            int iIntValue = c443120HZeLJ.getSecond().intValue();
            int iIntValue2 = c443120HZeLJ.getThird().intValue();
            List<AutoCutMediaModel> list2 = this.LIZLLL;
            if (list2 == null || list2.isEmpty()) {
                i = 0;
            } else {
                Iterator<AutoCutMediaModel> it2 = list2.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().isLiveHighlight && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            s sVar = s.LIZ;
            AutoCutModel autoCutModel3 = this.LJI;
            sVar.getClass();
            AutoCutThemeData autoCutThemeData2 = (AutoCutThemeData) C13LP.LJJJLZIJ(0, s.LJJIFFI(autoCutModel3));
            if (autoCutThemeData2 != null) {
                str = autoCutThemeData2.uuid;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str) && !this.LJI.hasTryTemplateSet.contains(str)) {
                this.LJI.hasTryTemplateSet.add(str);
                if (!Intrinsics.LJFF(this.LJII, "single_song") && this.LJIJ) {
                    z = false;
                } else {
                    z = true;
                }
                C0MJ9 c0mj9 = c1417310mzB.LIZ;
                C0MJ9 c0mj92 = C0MJ9.AUTO_CUT;
                if (c0mj9 == c0mj92 && ((C0CHU.LIZ() || C0CHV.LIZ()) && z)) {
                    if (C0CHU.LIZ()) {
                        i2 = 1;
                    } else {
                        i2 = 2;
                    }
                } else {
                    i2 = 0;
                }
                AutoCutThemeData autoCutThemeData3 = (AutoCutThemeData) C13LP.LJJJLZIJ(0, this.LJI.templateList);
                if (autoCutThemeData3 != null) {
                    autoCutCategory = autoCutThemeData3.category;
                } else {
                    autoCutCategory = null;
                }
                String str15 = this.LJI.clickFrom;
                int i6 = c1417310mzB.LIZJ;
                String str16 = c1417310mzB.LJIIIZ;
                String str17 = c1417310mzB.LJIIJ;
                String str18 = c1417310mzB.LJIIJJI;
                boolean z3 = this.LJIIIIZZ;
                String str19 = this.LIZJ;
                String str20 = this.LIZIZ;
                String str21 = this.LIZ;
                int i7 = this.LJFF;
                String str22 = this.LJJIFFI;
                String strInvoke = this.LJIILL.invoke(c1417310mzB);
                if (autoCutCategory != null) {
                    str2 = autoCutCategory.categoryName;
                    str3 = autoCutCategory.categoryKey;
                } else {
                    str2 = null;
                    str3 = null;
                }
                boolean z4 = this.LJIIIZ;
                C1417720mzq c1417720mzq = new C1417720mzq(iIntValue2, iIntValue, null, null, 12);
                String strInvoke2 = this.LJIIJJI.invoke(c1417310mzB.LJ);
                Function1<C0LAB, Unit> function1 = this.LJIILJJIL;
                if (c1417310mzB.LIZ == c0mj92) {
                    AutoCutThemeData autoCutThemeData4 = (AutoCutThemeData) C13LP.LJJJLZIJ(0, s.LJJIFFI(this.LJI));
                    if (autoCutThemeData4 != null) {
                        numValueOf2 = autoCutThemeData4.assetFrom;
                    }
                } else {
                    numValueOf2 = Integer.valueOf(AssetFrom.CLIENT_INSERT.getValue());
                }
                boolean z5 = this.LJIILIIL;
                boolean z6 = this.LJIILLIIL;
                Integer num = this.LJIIZILJ;
                AutoCutThemeData autoCutThemeData5 = (AutoCutThemeData) C13LP.LJJJLZIJ(0, s.LJJIFFI(this.LJI));
                if (autoCutThemeData5 != null) {
                    zLIZIZ = C1402530mbL.LIZIZ(autoCutThemeData5.featureBits, autoCutThemeData5.featureCode);
                } else {
                    zLIZIZ = false;
                }
                C1417710mzp.LJJIL(str15, 1, i6, str16, str17, str18, z3, str19, str20, str21, i7, str22, 1, iIntValue, iIntValue2, i, strInvoke, null, str2, str3, z4, null, c1417720mzq, strInvoke2, numValueOf2, z5, z6, function1, num, zLIZIZ, i2, false, c1417310mzB.LJIIL, 2228224);
            }
            String str23 = this.LJI.clickFrom;
            C1417710mzp.LJIL(str23, str23, C0L9M.FIRST_GENERATE_AUTOCUT.getValue(), c1417310mzB.LIZJ, c1417310mzB.LJIIIZ, c1417310mzB.LJIIJ, this.LJIIIIZZ, this.LIZJ, this.LIZIZ, this.LIZ, this.LJFF, this.LJJIFFI, "1", iIntValue, iIntValue2, null, null, null, null);
        }
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIILJJIL(String str) {
        this.LJIL = System.currentTimeMillis();
        this.LJJIIZI = str;
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIILLIIL(String str) {
        long jLongValue;
        String strLIZ;
        Long l = (Long) ((LinkedHashMap) this.LJJIJIL).get(str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = -1;
        }
        long jLIZLLL = C1417710mzp.LIZLLL(jLongValue);
        String str2 = this.LJJIFFI;
        String str3 = this.LJJII;
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str4 = this.LIZ;
        String str5 = this.LIZIZ;
        String str6 = this.LIZJ;
        String str7 = this.LJ;
        int i = this.LJJIIZ;
        NLEModel nLEModel = this.LJJIJL;
        if (nLEModel != null) {
            strLIZ = C0FPT.LIZ(nLEModel);
        } else {
            strLIZ = null;
        }
        C1417710mzp.LJIILL(str, jLIZLLL, str2, str3, list, str4, str5, str6, str7, i, LJJIFFI(), strLIZ);
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutMobListener: onStageComplete stage=");
        sbLIZ.append(str);
        sbLIZ.append(", time=");
        sbLIZ.append(System.currentTimeMillis());
        C201955140j.LIZLLL(c1398350mUb, "msg-log", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIJI(String str) {
        C1417710mzp.LJIILIIL("source_auto_cut", C1417710mzp.LIZLLL(this.LJJ), str, this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIL(String str) {
        this.LJJ = System.currentTimeMillis();
        this.LJJIIZI = str;
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIIL(int i, String str) {
        if (!this.LJIIIIZZ) {
            this.LJJIIZ = i;
            this.LJJIL = str;
        }
    }

    public final void LJJ(String str, AutoCutModel autoCutModel) {
        Integer numValueOf;
        long duration;
        if (this.LJJIJL == null) {
            return;
        }
        autoCutModel.asyncRenderModel.costDuration = C1417710mzp.LIZLLL(this.LJIJI);
        Set<String> setLLIIJI = C13LP.LLIIJI(NLERenderResourceUtil.getUnpreparedUnnecessaryResources(this.LJJIJL));
        autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet = setLLIIJI;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_RENDER: templateType=");
        sbLIZ.append(autoCutModel.curTemplateType);
        sbLIZ.append(", Unnecessary Count=");
        Set<String> set = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", List=");
        sbLIZ.append(setLLIIJI);
        C201955140j.LIZLLL(c1398350mUb, str, C2188811AlT.LIZIZ(sbLIZ));
        Set<String> set2 = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set2 != null && set2.size() == 0) {
            NLEModel nLEModel = this.LJJIJL;
            if (nLEModel != null) {
                duration = nLEModel.getDuration();
            } else {
                duration = 0;
            }
            AutoCutAsyncRenderModel autoCutAsyncRenderModel = autoCutModel.asyncRenderModel;
            C1417710mzp.LJIIIZ("completed", duration, autoCutAsyncRenderModel.costDuration, 0L, 0L, autoCutAsyncRenderModel.asyncRenderNecessaryDownloadCount, autoCutAsyncRenderModel.asyncRenderNecessaryTotalCount, 0, autoCutAsyncRenderModel.asyncRenderUnnecessaryTotalCount, 0, 0, 0, 0, this.LIZLLL, autoCutModel.curTemplateType);
        }
    }

    public final void LJJI(String str, AutoCutModel autoCutModel, int i) {
        NLEModel nLEModel = this.LJJIJL;
        if (nLEModel == null) {
            return;
        }
        VecString unpreparedNecessaryResources = NLERenderResourceUtil.getUnpreparedNecessaryResources(nLEModel);
        autoCutModel.asyncRenderModel.asyncRenderNecessaryTotalCount = unpreparedNecessaryResources.size();
        VecString unpreparedUnnecessaryResources = NLERenderResourceUtil.getUnpreparedUnnecessaryResources(this.LJJIJL);
        autoCutModel.asyncRenderModel.asyncRenderUnnecessaryTotalCount = unpreparedUnnecessaryResources.size();
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ASYNC_RENDER: templateType=");
        sbLIZ.append(i);
        sbLIZ.append(", Count asyncRenderNecessaryTotalCount=");
        sbLIZ.append(autoCutModel.asyncRenderModel.asyncRenderNecessaryTotalCount);
        sbLIZ.append(", List=");
        sbLIZ.append(unpreparedNecessaryResources);
        C201955140j.LIZLLL(c1398350mUb, str, C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ASYNC_RENDER: templateType=");
        sbLIZ2.append(i);
        sbLIZ2.append(", Count asyncRenderUnnecessaryTotalCount=");
        sbLIZ2.append(autoCutModel.asyncRenderModel.asyncRenderUnnecessaryTotalCount);
        sbLIZ2.append(", List=");
        sbLIZ2.append(unpreparedUnnecessaryResources);
        C201955140j.LIZLLL(c1398350mUb, str, C2188811AlT.LIZIZ(sbLIZ2));
    }

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
    @Override // X.InterfaceC1418260n0i
    public void LJII(List<AutoCutThemeData> list, String str, Scene scene, boolean z) {
        String str2;
        C1417710mzp.LJJIII(true, 0, null, C1417710mzp.LIZLLL(this.LJIJJ), this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJJIIZ, LJJIFFI());
        String str3 = this.LJI.clickFrom;
        boolean z2 = this.LJIIIIZZ;
        String str4 = this.LIZIZ;
        String str5 = this.LIZJ;
        String str6 = this.LIZ;
        int i = this.LJFF;
        Function1<C0LAB, Unit> function1 = this.LJIILJJIL;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (AutoCutThemeData autoCutThemeData : list) {
            String str7 = autoCutThemeData.templateId;
            if (str7.length() == 0 && (str7 = autoCutThemeData.templateGroupId) == null) {
                str7 = "";
            }
            if (str7.length() > 0) {
                arrayList2.add(str7);
            } else {
                arrayList2.add(CardStruct.IStatusCode.DEFAULT);
            }
            arrayList.add(Integer.valueOf(autoCutThemeData.templateType));
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("click_from", str3);
        c0lab.LJ("shoot_way", str4);
        c0lab.LJ("creation_id", str5);
        c0lab.LIZ(z2 ? 1 : 0, "is_reuse_music");
        c0lab.LJ("enter_from", str6);
        if (i == 0) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        c0lab.LJ("content_source", str2);
        c0lab.LJ("template_type_list", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList));
        c0lab.LJ("template_id_list", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), arrayList2));
        if (function1 != null) {
            function1.invoke(c0lab);
        }
        c0lab.LJ("recommend_request_id", str);
        C20684815ws.LJIILLIIL("recommend_autocut_template", c0lab.LIZ);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIIIZ(int i, String str, String str2, String str3) {
        this.LJJIII = str;
        this.LJJIIZ = i;
        this.LJJIIJ = str2;
        this.LJJIIJZLJL = str3;
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIILIIL(int i, String str, String str2, String str3) {
        int i2 = this.LJJIJ;
        C1417710mzp.LJIJJLI("source_auto_cut", this.LIZIZ, i2 - this.LJJIJIIJI, this.LIZJ, i2, str, str2, str3, i, C1417710mzp.LIZLLL(this.LJJI));
    }

    @Override // X.InterfaceC1418260n0i
    public void LJIJJ(int i, Integer num, String str, EnumC1418300n0m enumC1418300n0m) {
        String str2;
        Integer numValueOf;
        Set<String> set;
        this.LJJIJIIJIL = i;
        String str3 = this.LIZ;
        String str4 = this.LIZIZ;
        String str5 = this.LIZJ;
        int i2 = this.LJFF;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("enter_from", str3);
        c0lab.LJ("shoot_way", str4);
        if (i2 == 0) {
            str2 = "upload";
        } else {
            str2 = "shoot";
        }
        c0lab.LJ("content_source", str2);
        c0lab.LJ("creation_id", str5);
        c0lab.LIZ(i, "error_type");
        C20684815ws.LJIILLIIL("enter_autocut_retry_page", c0lab.LIZ);
        long jLIZLLL = C1417710mzp.LIZLLL(this.LJIJI);
        long jLIZLLL2 = C1417710mzp.LIZLLL(this.LJIJI);
        List<AutoCutMediaModel> list = this.LIZLLL;
        String str6 = this.LIZIZ;
        String str7 = this.LIZJ;
        String str8 = this.LJ;
        int i3 = this.LJFF;
        String str9 = this.LIZ;
        int i4 = this.LJJIIZ;
        AutoCutModel autoCutModel = this.LJI;
        String str10 = autoCutModel.clickFrom;
        String str11 = this.LJJIII;
        String str12 = this.LJJIIJ;
        String str13 = this.LJJII;
        int i5 = this.LJJIJLIJ;
        boolean zLJJIFFI = LJJIFFI();
        String str14 = this.LJJIFFI;
        AutoCutThemeData autoCutThemeData = (AutoCutThemeData) C13LP.LJJJLL(this.LJI.templateList);
        String strLIZ = null;
        if (autoCutThemeData != null && (set = autoCutThemeData.preloadUrsSet) != null) {
            numValueOf = Integer.valueOf(set.size());
        } else {
            numValueOf = null;
        }
        String str15 = this.LJJIIJZLJL;
        String str16 = this.LJII;
        boolean z = this.LJIIL;
        NLEModel nLEModel = this.LJJIJL;
        if (nLEModel != null) {
            strLIZ = C0FPT.LIZ(nLEModel);
        }
        C1417710mzp.LJJIFFI(false, i, num, str, jLIZLLL, jLIZLLL2, list, str6, str7, str8, i3, str9, i4, str10, str11, str13, null, autoCutModel, i5, zLJJIFFI, str12, str14, numValueOf, str15, str16, z, strLIZ, this.LJIILJJIL);
        if (i != SmartMovieErrorCode.ZIP_EMPTY.swigValue() && i != SmartMovieErrorCode.UPLOAD_TOS_FAILURE.swigValue() && i != SmartMovieErrorCode.MUSIC_REQUEST_FAILURE.swigValue() && i != 1004 && i != 1005 && i != 1006) {
            if (i != SmartMovieErrorCode.COMPRESS_FAILURE.swigValue() && i != SmartMovieErrorCode.CONFIG_REQUEST_FAILURE.swigValue() && i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue() && i != SmartMovieErrorCode.HANDLE_TEMPLATE_FAILURE.swigValue() && i != SmartMovieErrorCode.INPUT_RESOURCE_EXCEPTION.swigValue()) {
                if (i == 1001 || i == 1003 || i == 1002 || i == 1007) {
                    C1417710mzp.LJIIJ("source_auto_cut", false, i, str, C1417710mzp.LIZLLL(this.LJIL), this.LJJIIZI, this.LIZIZ, this.LIZJ);
                    return;
                }
                return;
            }
            C1417710mzp.LJJIIJ("source_auto_cut", false, i, num, str, C1417710mzp.LIZLLL(this.LJIJJLI), this.LJJIFFI, this.LJJII, this.LIZLLL, this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, this.LJJIII, this.LJJIIZ, LJJIFFI(), this.LJJIIJ, this.LJIIL);
            return;
        }
        C1417710mzp.LJJIII(false, i, str, C1417710mzp.LIZLLL(this.LJIJJ), this.LIZLLL, this.LIZIZ, this.LIZJ, this.LJJIIZ, LJJIFFI());
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJFF(int i, int i2, String str, String str2, String str3, String str4) {
        this.LJJIZ = C1417710mzp.LIZLLL(this.LJIJI);
        this.LJJIJLIJ = i2;
        C1417710mzp.LJJIIJ("source_auto_cut", true, 0, Integer.MIN_VALUE, null, C1417710mzp.LIZLLL(this.LJIJJLI), str, str2, this.LIZLLL, this.LIZ, this.LIZIZ, this.LIZJ, this.LJ, str3, i, LJJIFFI(), str4, this.LJIIL);
    }

    @Override // X.InterfaceC1418260n0i
    public final void LJIIIIZZ(int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.LJIJJLI = System.currentTimeMillis();
        this.LJJIFFI = str;
        this.LJJII = str2;
        this.LJJIII = str3;
        this.LJJIIZ = i;
        this.LJJIL = str6;
        this.LJJIIJ = str4;
        this.LJJIIJZLJL = str5;
    }

    public /* synthetic */ AbstractC1417130myt(String str, String str2, String str3, List list, String str4, AutoCutModel autoCutModel, String str5, boolean z, boolean z2, Function1 function1, boolean z3, Function1 function12, Function1 function13, boolean z4, Integer num, boolean z5, int i) {
        this(str, str2, str3, list, str4, 0, autoCutModel, str5, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, false, function1, false, (i & 8192) != 0 ? false : z3, (i & 16384) != 0 ? AFwS261S0000000_22.get$arr$(258) : function12, (32768 & i) != 0 ? AFwS261S0000000_22.get$arr$(259) : function13, (65536 & i) != 0 ? false : z4, (131072 & i) != 0 ? null : num, (i & 262144) != 0 ? true : z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1417130myt(String str, String str2, String str3, List<AutoCutMediaModel> list, String str4, int i, AutoCutModel autoCutModel, String str5, boolean z, boolean z2, boolean z3, Function1<? super AVMusic, String> function1, boolean z4, boolean z5, Function1<? super C0LAB, Unit> function12, Function1<? super C1417310mzB, String> function13, boolean z6, Integer num, boolean z7) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
        this.LJ = str4;
        this.LJFF = i;
        this.LJI = autoCutModel;
        this.LJII = str5;
        this.LJIIIIZZ = z;
        this.LJIIIZ = z2;
        this.LJIIJ = z3;
        this.LJIIJJI = function1;
        this.LJIIL = z4;
        this.LJIILIIL = z5;
        this.LJIILJJIL = function12;
        this.LJIILL = function13;
        this.LJIILLIIL = z6;
        this.LJIIZILJ = num;
        this.LJIJ = z7;
        this.LJIJI = -1L;
        this.LJIJJ = -1L;
        this.LJIJJLI = -1L;
        this.LJIL = -1L;
        this.LJJ = -1L;
        this.LJJI = -1L;
        this.LJJIIZ = EnumC1412640mre.ALGORITHM_TEMPLATE.getValue();
        this.LJJIJ = -1;
        this.LJJIJIIJIL = -1;
        this.LJJIJIL = new LinkedHashMap();
    }
}
