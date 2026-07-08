package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05FL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audiometrics.AudioModelHelper$preFetchModel$1", f = "AudioModelHelper.kt", l = {56}, m = "invokeSuspend")
public final class C05FL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05FL(String str, String str2, Function0<Unit> function0, InterfaceC1364105Vn<? super C05FL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05FL(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AudioModelHelper@dc9f.preFetchModel$1");
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
            C05X0 c05x0 = C05X0.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            c05x0.getClass();
            obj = C05X0.LIZ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AudioModelHelper@dc9f.preFetchModel$1");
                return objLJFF;
            }
        }
        String str3 = (String) obj;
        if (str3.length() == 0) {
            Function0<Unit> function0 = this.LLILZ;
            if (function0 != null) {
                function0.invoke();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("AudioModelHelper@dc9f.preFetchModel$1");
            return unit;
        }
        C05X0.LIZIZ.put(new Pair<>(this.LLILLJJLI, this.LLILLL), str3);
        Function0<Unit> function02 = this.LLILZ;
        if (function02 != null) {
            function02.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("AudioModelHelper@dc9f.preFetchModel$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
