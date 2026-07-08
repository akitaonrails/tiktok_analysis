package X;

import android.app.Application;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.autocut.sdk.smartmovie.model.MetaExt;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.services.external.TemplateScene;
import com.ss.android.ugc.cut_ui.CutSource;
import com.ss.android.ugc.cut_ui.CutSourceType;
import com.ss.ugc.android.davinciresource.DavinciResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0n0C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutHelper$requestNLEModelAsFlow$1", f = "AutoCutHelper.kt", l = {680, 696, 702, 751}, m = "invokeSuspend")
public final class C1417940n0C extends C09AX implements Function2<InterfaceC346701Wf<? super C096H>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ List<AutoCutMediaModel> LLILZLL;
    public final /* synthetic */ EnumC1417520mzW LLIZ;
    public final /* synthetic */ int LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ CreativeInfo LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Set<String> LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ InterfaceC1635410sex LLJJ;
    public final /* synthetic */ boolean LLJJI;
    public final /* synthetic */ InterfaceC1418120n0U LLJJIII;
    public final /* synthetic */ LifecycleOwner LLJJIJI;
    public final /* synthetic */ boolean LLJJIJIIJIL;
    public final /* synthetic */ String LLJJIJIL;
    public final /* synthetic */ String LLJJJ;
    public final /* synthetic */ boolean LLJJJIL;
    public final /* synthetic */ boolean LLJJJJ;
    public final /* synthetic */ boolean LLJJJJJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1417940n0C(String str, String str2, String str3, List<AutoCutMediaModel> list, EnumC1417520mzW enumC1417520mzW, int i, String str4, String str5, CreativeInfo creativeInfo, String str6, Set<String> set, boolean z, InterfaceC1635410sex interfaceC1635410sex, boolean z2, InterfaceC1418120n0U interfaceC1418120n0U, LifecycleOwner lifecycleOwner, boolean z3, String str7, String str8, boolean z4, boolean z5, boolean z6, InterfaceC1364105Vn<? super C1417940n0C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = list;
        this.LLIZ = enumC1417520mzW;
        this.LLIZLLLIL = i;
        this.LLJ = str4;
        this.LLJI = str5;
        this.LLJIJIL = creativeInfo;
        this.LLJILJIL = str6;
        this.LLJILJILJ = set;
        this.LLJILLL = z;
        this.LLJJ = interfaceC1635410sex;
        this.LLJJI = z2;
        this.LLJJIII = interfaceC1418120n0U;
        this.LLJJIJI = lifecycleOwner;
        this.LLJJIJIIJIL = z3;
        this.LLJJIJIL = str7;
        this.LLJJJ = str8;
        this.LLJJJIL = z4;
        this.LLJJJJ = z5;
        this.LLJJJJJIL = z6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1417940n0C c1417940n0C = new C1417940n0C(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, this.LLJJIJIL, this.LLJJJ, this.LLJJJIL, this.LLJJJJ, this.LLJJJJJIL, interfaceC1364105Vn);
        c1417940n0C.LLILLJJLI = obj;
        return c1417940n0C;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object next;
        Boolean boolValueOf;
        boolean z;
        boolean z2;
        boolean z3;
        String str2;
        long jLongValue;
        C1C7U.LIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            C155000ia.LIZIZ(obj);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C155000ia.LIZIZ(obj);
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                    return unit2;
                }
                C155000ia.LIZIZ(obj);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                return unit3;
            }
            C155000ia.LIZIZ(obj);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
            return unit4;
        }
        C155000ia.LIZIZ(obj);
        InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
        StringBuilder sb = new StringBuilder("AutoCutHelper requestRecommendedNLEModel: taskId = ");
        sb.append(this.LLILLL);
        sb.append(", musicId: ");
        sb.append(this.LLILZ);
        sb.append(", templateId: ");
        sb.append(this.LLILZIL);
        sb.append("mediaModelList: ");
        List<AutoCutMediaModel> list = this.LLILZLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<AutoCutMediaModel> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().filePath);
        }
        sb.append(arrayList);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, sb.toString());
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("COMPREHENSION_NLE: requestType=");
        sbLIZ.append(this.LLIZ.name());
        sbLIZ.append(", templateType=");
        sbLIZ.append(this.LLIZLLLIL);
        C201955140j.LIZLLL(c1398350mUb, "AutoCutHelper", C2188811AlT.LIZIZ(sbLIZ));
        DavinciResource.INSTANCE.setHttpClient(C1419920n3O.LIZ());
        ArrayList arrayList2 = new ArrayList();
        List<AutoCutMediaModel> list2 = this.LLILZLL;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<AutoCutMediaModel> it3 = list2.iterator();
        while (true) {
            str = "";
            if (!it3.hasNext()) {
                break;
            }
            AutoCutMediaModel next2 = it3.next();
            MetaExt metaExt = new MetaExt(0, null, null, null, null, 0, 0L, 0L, 0, false, 0L, false, 4095, null);
            if (C2286708xd.LIZJ(next2.filePath)) {
                str = next2.filePath;
            } else {
                String str3 = next2.fileUriPath;
                if (str3 != null) {
                    str = str3;
                }
            }
            metaExt.setPath(str);
            metaExt.setWidth(next2.width);
            metaExt.setHeight(next2.height);
            metaExt.setVideo(next2.isVideoType);
            metaExt.setDuration(next2.duration);
            Long l = next2.date;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            metaExt.setCreateTime(jLongValue);
            arrayList3.add(metaExt);
        }
        arrayList2.addAll(arrayList3);
        Iterator it4 = arrayList2.iterator();
        while (true) {
            if (it4.hasNext()) {
                next = it4.next();
                if (!C2286708xd.LIZJ(((MetaExt) next).path)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        MetaExt metaExt2 = (MetaExt) next;
        if (metaExt2 != null) {
            C1417710mzp.LIZ.getClass();
            C096G c096g = new C096G(C1417710mzp.LJI(metaExt2), 1010);
            this.LL = 1;
            if (interfaceC346701Wf.emit(c096g, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                return objLJFF;
            }
            Unit unit42 = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
            return unit42;
        }
        C1418000n0I.LIZ.getClass();
        C2295408z2.LIZ.getClass();
        C2295408z2.LIZLLL(arrayList2);
        String str4 = this.LLJ;
        C1398350mUb c1398350mUb2 = C1398350mUb.LIZIZ;
        StringBuilder sb2 = new StringBuilder("JSON_COMPRESS,requestType=");
        sb2.append(this.LLIZ);
        sb2.append(", templateId=");
        sb2.append(this.LLILZIL);
        sb2.append(", is cmp = ");
        String str5 = this.LLJ;
        if (str5 != null) {
            boolValueOf = Boolean.valueOf(a0.LJJIIZI(str5, "CMP", false));
        } else {
            boolValueOf = null;
        }
        sb2.append(boolValueOf);
        sb2.append(", templateData empty=");
        String str6 = this.LLJ;
        if (str6 != null && str6.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        sb2.append(z);
        sb2.append(", templateUrl=");
        sb2.append(this.LLJI);
        C201955140j.LIZLLL(c1398350mUb2, "AutoCutHelper", sb2.toString());
        C1227904rF c1227904rF = C1227904rF.LIZ;
        CreativeInfo creativeInfo = this.LLJIJIL;
        c1227904rF.getClass();
        String strLJI = C1227904rF.LJI(creativeInfo);
        if (strLJI == null) {
            strLJI = "";
        }
        if (this.LLIZLLLIL == EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue()) {
            C1426005i6.LIZ(c1398350mUb2, "AutoCutHelper.LR.SkipServerNLE", "requestNLEModelAsFlow short-circuit templateId=" + C13LN.LJZL(8, this.LLILZIL) + " musicId=" + this.LLILZ + " source=" + this.LLJILJIL + " mediaCount=" + arrayList2.size());
            s.LIZ.getClass();
            NLEModel nLEModelLIZLLL = s.LIZLLL(arrayList2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("autocut_template_type", String.valueOf(this.LLIZLLLIL));
            C23149095f c23149095f = new C23149095f(nLEModelLIZLLL, linkedHashMap);
            this.LL = 2;
            if (interfaceC346701Wf.emit(c23149095f, this) == objLJFF) {
                C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                return objLJFF;
            }
            Unit unit32 = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
            return unit32;
        }
        EnumC1417520mzW enumC1417520mzW = this.LLIZ;
        if (enumC1417520mzW != EnumC1417520mzW.TEMPLATE_CC && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_PUGC && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_AIGT && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_SGT && enumC1417520mzW != EnumC1417520mzW.TEMPLATE_UGC) {
            C1429050nI7 c1429050nI7 = C1429050nI7.LIZ;
            TemplateScene templateScene = TemplateScene.AUTO_CUT;
            c1429050nI7.getClass();
            Pair pairLIZJ = C1429050nI7.LIZJ(templateScene);
            ArrayList arrayList4 = new ArrayList();
            if (str4 != null) {
                str = str4;
            }
            C23186096q c23186096q = new C23186096q(this.LLILLL, this.LLILZ, arrayList2, arrayList4, strLJI, true, this.LLJJIJIIJIL, str, this.LLJILLL, 50624);
            String str7 = this.LLJILJIL;
            int i2 = this.LLIZLLLIL;
            String str8 = this.LLJJIJIL;
            String str9 = this.LLJI;
            String str10 = this.LLILZIL;
            String str11 = this.LLJJJ;
            boolean z4 = this.LLJJJIL;
            boolean z5 = this.LLJJJJ;
            boolean z6 = this.LLJJJJJIL;
            HashMap map = new HashMap();
            map.put("source", str7);
            map.put("autocut_template_type", String.valueOf(i2));
            if (str8 != null && str8.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                str8 = "not_set";
            }
            map.put("autocut_music_log_id", str8);
            if (str9.length() == 0) {
                str9 = "not_set";
            }
            map.put("autocut_log_template_url", str9);
            if (str10.length() == 0) {
                str10 = "not_set";
            }
            map.put("autocut_log_template_url", str10);
            map.put("autocut_template_group_id", str11);
            if (z4) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_first_template_from_mdp", str2);
            map.put("enable_preloading", String.valueOf(z5));
            map.put("feature_list", pairLIZJ.getFirst());
            map.put("feature_codes", pairLIZJ.getSecond());
            Map<C0CIJ, C311200CHu> map2 = C311170CHr.LIZ;
            map.put("protocol_version", "2");
            map.put("use_aigt", String.valueOf(z6));
            c23186096q.LJIILJJIL = map;
            C1418130n0V c1418130n0V = new C1418130n0V(null);
            C23157095n.LIZ.getClass();
            C095D c095d = new C095D(new C1418030n0L(C23157095n.LIZIZ(c23186096q), null, arrayList2, this.LLJIJIL, this.LLJJ, this.LLJJIII, this.LLJJIJI, c1418130n0V));
            this.LL = 4;
            if (C09IC.LJIILLIIL(this, c095d, interfaceC346701Wf) == objLJFF) {
                C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
                return objLJFF;
            }
            Unit unit5 = Unit.LIZ;
            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
            return unit5;
        }
        StringBuilder sb3 = new StringBuilder("CC_PRELOAD_EFFECT: source=");
        sb3.append(this.LLJILJIL);
        sb3.append(", isURL=");
        String str12 = this.LLJ;
        if (str12 != null && str12.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        sb3.append(z2);
        C201955140j.LIZLLL(c1398350mUb2, "AutoCutHelper", sb3.toString());
        s sVar = s.LIZ;
        Set<String> set = this.LLJILJILJ;
        Integer numLJ = C2286608xc.LJ(this.LLIZLLLIL);
        sVar.getClass();
        s.LJJJJL(set, "", numLJ);
        Application application = C0CHQ.LIZ;
        String str13 = this.LLJI;
        b bVarLIZLLL = C1418000n0I.LIZLLL(application, new CutSource(str13, CutSourceType.URL), arrayList2, strLJI, this.LLJILLL, this.LLILZIL, str13, this.LLIZLLLIL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI);
        this.LL = 3;
        if (C09IC.LJIILLIIL(this, bVarLIZLLL, interfaceC346701Wf) == objLJFF) {
            C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
            return objLJFF;
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutHelper@27e4.requestNLEModelAsFlow$1");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C096H> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
