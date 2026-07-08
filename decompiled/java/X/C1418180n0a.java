package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.autocut.s;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.cutsame.CutsameDataItem;
import com.ss.android.ugc.aweme.cutsame.TemplateList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0n0a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.AutoCutComponent$preRecommendMusic$1", f = "AutoCutComponent.kt", l = {}, m = "invokeSuspend")
public final class C1418180n0a extends C09AX implements Function2<C096D, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1418150n0X LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ EnumC1418280n0k LLILZ;
    public final /* synthetic */ Function2<List<AutoCutThemeData>, String, Unit> LLILZIL;
    public final /* synthetic */ AutoCutThemeData LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1418180n0a(C1418150n0X c1418150n0X, Function0<Unit> function0, EnumC1418280n0k enumC1418280n0k, Function2<? super List<AutoCutThemeData>, ? super String, Unit> function2, AutoCutThemeData autoCutThemeData, InterfaceC1364105Vn<? super C1418180n0a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1418150n0X;
        this.LLILLL = function0;
        this.LLILZ = enumC1418280n0k;
        this.LLILZIL = function2;
        this.LLILZLL = autoCutThemeData;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1418180n0a c1418180n0a = new C1418180n0a(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1418180n0a.LL = obj;
        return c1418180n0a;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Function0<Unit> function0;
        boolean z;
        C1C7U.LIZ("AutoCutComponent@2715.preRecommendMusic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C096D c096d = (C096D) this.LL;
        C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preRecommendMusic onInfoCallBack extraParams=");
        sbLIZ.append(c096d.LIZ());
        C201955140j.LIZLLL(c1398350mUb, "AutoCutComponent", C2188811AlT.LIZIZ(sbLIZ));
        boolean z2 = c096d instanceof C096C;
        if (z2 || (c096d instanceof C096E)) {
            this.LLILLJJLI.LLIZLLLIL.LIZ = null;
            if (z2 && (function0 = this.LLILLL) != null) {
                function0.invoke();
            }
        }
        if (c096d instanceof C096E) {
            C443120HZe<TemplateList, String, String> c443120HZeLJJLI = s.LJJLI(((C096E) c096d).LIZIZ);
            TemplateList first = c443120HZeLJJLI.getFirst();
            String second = c443120HZeLJJLI.getSecond();
            if (first == null || first.templateList == null || second == null) {
                C1417710mzp.LIZ(LogLevel.LEVEL_INFO, "AutoCutComponent preRecommend parse musicList or taskId from response failed");
                Function0<Unit> function02 = this.LLILLL;
                if (function02 != null) {
                    function02.invoke();
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("AutoCutComponent@2715.preRecommendMusic$1");
                return unit;
            }
            C201955140j.LIZLLL(c1398350mUb, "AutoCutCore", "non-refactor: preRecommendMusic success");
            if (this.LLILZ == EnumC1418280n0k.MUSIC_DETAIL) {
                z = true;
            } else {
                z = false;
            }
            List<CutsameDataItem> list = first.templateList;
            if (list != null) {
                Function2<List<AutoCutThemeData>, String, Unit> function2 = this.LLILZIL;
                AutoCutThemeData autoCutThemeData = this.LLILZLL;
                s.LIZ.getClass();
                function2.invoke(s.LJIIJ(list, autoCutThemeData, z), second);
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutComponent@2715.preRecommendMusic$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C096D c096d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c096d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
