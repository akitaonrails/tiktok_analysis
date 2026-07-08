package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS619S0100000_5;
import kotlin.jvm.internal.AwS654S0100000_5;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0FIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.text.TextEditFontListAbility$fetchTemplateDependResources$1", f = "TextEditFontListAbility.kt", l = {412}, m = "invokeSuspend")
public final class C387740FIe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0FII LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function1<C0FMO, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C387740FIe(C0FII c0fii, Effect effect, String str, String str2, Function1<? super C0FMO, Unit> function1, InterfaceC1364105Vn<? super C387740FIe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0fii;
        this.LLILLL = effect;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C387740FIe(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC388160FJu interfaceC388160FJuLJIIJ;
        TextTemplateTools.TextTemplateDependResource next;
        String str;
        C1C7U.LIZ("TextEditFontListAbility@a0ef.fetchTemplateDependResources$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Effect effect = null;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0FF8 c0ff8 = this.LLILLJJLI.LJI;
            if (c0ff8 != null) {
                interfaceC388160FJuLJIIJ = c0ff8.LJIIJ();
            } else {
                interfaceC388160FJuLJIIJ = null;
            }
            TextTemplateTools textTemplateTools = TextTemplateTools.LIZ;
            InterfaceC1635410sex interfaceC1635410sex = this.LLILLJJLI.LJIIJ;
            Effect effect2 = this.LLILLL;
            AwS654S0100000_5 awS654S0100000_5 = new AwS654S0100000_5(interfaceC388160FJuLJIIJ, 9);
            AwS619S0100000_5 awS619S0100000_5 = new AwS619S0100000_5(interfaceC388160FJuLJIIJ, 61);
            this.LL = 1;
            obj = textTemplateTools.LIZJ(interfaceC1635410sex, effect2, true, awS654S0100000_5, awS619S0100000_5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TextEditFontListAbility@a0ef.fetchTemplateDependResources$1");
                return objLJFF;
            }
        }
        AbstractC387820FIm abstractC387820FIm = (AbstractC387820FIm) obj;
        if (abstractC387820FIm instanceof C387810FIl) {
            C387810FIl c387810FIl = (C387810FIl) abstractC387820FIm;
            String json = GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), c387810FIl.LIZ);
            Iterator<TextTemplateTools.TextTemplateDependResource> it2 = c387810FIl.LIZ.dependResourceList.iterator();
            while (true) {
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
            C0FII c0fii = this.LLILLJJLI;
            Effect effect3 = this.LLILLL;
            if (textTemplateDependResource != null) {
                effect = textTemplateDependResource.LIZ;
            }
            if (strLJFF == null) {
                strLJFF = "";
            }
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            Function1<C0FMO, Unit> function1 = this.LLILZLL;
            c0fii.getClass();
            C0FII.LJIILLIIL(effect3, effect, strLJFF, str2, str3, function1, json);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextEditFontListAbility@a0ef.fetchTemplateDependResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
