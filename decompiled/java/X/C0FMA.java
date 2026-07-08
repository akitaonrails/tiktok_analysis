package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS654S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0FMA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$fetchTemplateDependResources$1", f = "TextTemplateComponent.kt", l = {408}, m = "invokeSuspend")
public final class C0FMA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C194431114z LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Pair<Integer, Integer> LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMA(C194431114z c194431114z, Effect effect, Pair<Integer, Integer> pair, boolean z, boolean z2, boolean z3, InterfaceC1364105Vn<? super C0FMA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c194431114z;
        this.LLILLL = effect;
        this.LLILZ = pair;
        this.LLILZIL = z;
        this.LLILZLL = z2;
        this.LLIZ = z3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Effect effect;
        TextTemplateTools.TextTemplateDependResource next;
        String str;
        C1C7U.LIZ("TextTemplateComponent@b18.fetchTemplateDependResources$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            TextTemplateTools textTemplateTools = TextTemplateTools.LIZ;
            C194431114z c194431114z = this.LLILLJJLI;
            InterfaceC1635410sex interfaceC1635410sex = c194431114z.LLJJIJIIJIL;
            Effect effect2 = this.LLILLL;
            AwS654S0100000_5 awS654S0100000_5 = new AwS654S0100000_5(c194431114z, 3);
            AwS619S0100000_5 awS619S0100000_5 = new AwS619S0100000_5(this.LLILLJJLI, 5);
            this.LL = 1;
            obj = textTemplateTools.LIZJ(interfaceC1635410sex, effect2, true, awS654S0100000_5, awS619S0100000_5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TextTemplateComponent@b18.fetchTemplateDependResources$1");
                return objLJFF;
            }
        }
        AbstractC387820FIm abstractC387820FIm = (AbstractC387820FIm) obj;
        if (abstractC387820FIm instanceof C387810FIl) {
            C387810FIl c387810FIl = (C387810FIl) abstractC387820FIm;
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), c387810FIl.LIZ);
            Iterator<TextTemplateTools.TextTemplateDependResource> it2 = c387810FIl.LIZ.dependResourceList.iterator();
            while (true) {
                effect = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.type, "fonts")) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            TextTemplateTools.TextTemplateDependResource textTemplateDependResource = next;
            if (textTemplateDependResource != null) {
                str = textTemplateDependResource.resourcePath;
            } else {
                str = null;
            }
            String strLJFF = TextTemplateTools.LJFF(str);
            C194431114z c194431114z2 = this.LLILLJJLI;
            Effect effect3 = this.LLILLL;
            Pair<Integer, Integer> pair = this.LLILZ;
            if (textTemplateDependResource != null) {
                effect = textTemplateDependResource.LIZ;
            }
            if (strLJFF == null) {
                strLJFF = "";
            }
            c194431114z2.F4(effect3, pair, effect, strLJFF, this.LLILZIL, this.LLILZLL, this.LLIZ, json);
        } else if (abstractC387820FIm instanceof C387830FIn) {
            this.LLILLJJLI.Z4(this.LLILZ);
        } else {
            throw new C1954807lC();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.fetchTemplateDependResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
