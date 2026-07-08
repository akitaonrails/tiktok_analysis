package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
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

/* JADX INFO: renamed from: X.0FJ9, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.PreLoadHelper$fetchTemplateDependResources$1", f = "PreLoadHelper.kt", l = {104}, m = "invokeSuspend")
public final class C0FJ9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ Function1<C0FMO, Unit> LLILLL;
    public final /* synthetic */ VideoPublishEditModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0FJ9(Effect effect, Function1<? super C0FMO, Unit> function1, VideoPublishEditModel videoPublishEditModel, InterfaceC1364105Vn<? super C0FJ9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effect;
        this.LLILLL = function1;
        this.LLILZ = videoPublishEditModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FJ9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        TextTemplateTools.TextTemplateDependResource next;
        Effect effect;
        C1C7U.LIZ("PreLoadHelper@6364.fetchTemplateDependResources$1");
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
            C0FJA.LIZ.getClass();
            InterfaceC1635410sex interfaceC1635410sex = C0FJA.LIZIZ;
            Effect effect2 = this.LLILLJJLI;
            AwS654S0100000_5 awS654S0100000_5 = new AwS654S0100000_5(this.LLILZ, 2);
            AwS619S0100000_5 awS619S0100000_5 = new AwS619S0100000_5(this.LLILZ, 4);
            this.LL = 1;
            obj = textTemplateTools.LIZJ(interfaceC1635410sex, effect2, false, awS654S0100000_5, awS619S0100000_5, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PreLoadHelper@6364.fetchTemplateDependResources$1");
                return objLJFF;
            }
        }
        AbstractC387820FIm abstractC387820FIm = (AbstractC387820FIm) obj;
        if (abstractC387820FIm instanceof C387810FIl) {
            C387810FIl c387810FIl = (C387810FIl) abstractC387820FIm;
            Iterator<TextTemplateTools.TextTemplateDependResource> it2 = c387810FIl.LIZ.dependResourceList.iterator();
            while (true) {
                str = null;
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
            Function1<C0FMO, Unit> function1 = this.LLILLL;
            Effect effect3 = this.LLILLJJLI;
            if (textTemplateDependResource != null) {
                effect = textTemplateDependResource.LIZ;
            } else {
                effect = null;
            }
            if (textTemplateDependResource != null) {
                str = textTemplateDependResource.resourcePath;
            }
            String strLJFF = TextTemplateTools.LJFF(str);
            if (strLJFF == null) {
                strLJFF = "";
            }
            function1.invoke(new C0FMO(effect3, effect, strLJFF, "", "", GsonProtectorUtils.toJson(C0CHQ.LIZ().getGson(), c387810FIl.LIZ)));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreLoadHelper@6364.fetchTemplateDependResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
