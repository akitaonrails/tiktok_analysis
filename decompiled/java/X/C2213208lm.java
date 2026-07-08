package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.modelselect.EPAIGCModelAdapter$VH$bind$1", f = "EPAIGCModelAdapter.kt", l = {240}, m = "invokeSuspend")
public final class C2213208lm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C380730EwJ LLILLL;
    public final /* synthetic */ Context LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2213208lm(String str, C380730EwJ c380730EwJ, Context context, InterfaceC1364105Vn<? super C2213208lm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c380730EwJ;
        this.LLILZ = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2213208lm(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objLJFF;
        C1C7U.LIZ("EPAIGCModelAdapter$VH@f8be.bind$1");
        Object objLJFF2 = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJFF = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2242408qU c2242408qU = C2242408qU.LIZ;
            String str = this.LLILLJJLI;
            this.LL = 1;
            objLJFF = c2242408qU.LJFF(str, this);
            if (objLJFF == objLJFF2) {
                C1C7U.LIZIZ("EPAIGCModelAdapter$VH@f8be.bind$1");
                return objLJFF2;
            }
        }
        if (C189200o6.m7isFailureimpl(objLJFF)) {
            objLJFF = null;
        }
        File file = (File) objLJFF;
        if (file == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EPAIGCModelAdapter$VH@f8be.bind$1");
            return unit;
        }
        if (!Intrinsics.LJFF(this.LLILLL.LLIZLLLIL, this.LLILLJJLI)) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("EPAIGCModelAdapter$VH@f8be.bind$1");
            return unit2;
        }
        this.LLILLL.LL.setImageDrawable(null);
        C383660F2m.LIZ(this.LLILZ, Uri.fromFile(file).toString(), this.LLILLL.LL, new C370690Eg7(new C370680Eg6()));
        C786410Ut5.LLLLLLZZ(this.LLILLL.LL, 0);
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCModelAdapter$VH@f8be.bind$1");
        return unit3;
    }
}
