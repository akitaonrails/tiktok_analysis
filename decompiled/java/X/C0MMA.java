package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MMA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.Forward2StoryEnvironment$downloadCanvasStyleResource$1", f = "Forward2StoryEnvironment.kt", l = {991, 993}, m = "invokeSuspend")
public final class C0MMA extends C09AX implements Function2<InterfaceC346701Wf<? super C0MM6>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C0MML LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MMA(C0MML c0mml, InterfaceC1364105Vn<? super C0MMA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0mml;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0MMA c0mma = new C0MMA(this.LLILLL, interfaceC1364105Vn);
        c0mma.LLILLJJLI = obj;
        return c0mma;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        String str;
        String unzipPath;
        C1C7U.LIZ("Forward2StoryEnvironment@d506.downloadCanvasStyleResource$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    C0MMB.LIZIZ(C0MM5.LIZIZ.LIZLLL);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("Forward2StoryEnvironment@d506.downloadCanvasStyleResource$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            C138P c138p = C0MM5.LIZIZ.LIZLLL;
            if (!c138p.LIZIZ) {
                C0MMB.LIZ(c138p);
            }
            if (this.LLILLL.getUseCanVasNewStyle()) {
                str = "674187156";
            } else {
                str = "2283488";
            }
            C0MMX c0mmx = new C0MMX(str);
            C0MMD c0mmd = new C0MMD();
            this.LLILLJJLI = interfaceC346701Wf;
            this.LL = 1;
            obj = C1D7S.LIZ(c0mmx, c0mmd, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("Forward2StoryEnvironment@d506.downloadCanvasStyleResource$1");
                return objLJFF;
            }
        }
        C0MMC c0mmc = (C0MMC) obj;
        String str2 = c0mmc.LIZ;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        Effect effect = c0mmc.LIZIZ;
        if (effect != null && (unzipPath = effect.getUnzipPath()) != null) {
            str3 = unzipPath;
        }
        C0MM6 c0mm6 = new C0MM6(str2, str3, (String) null, 12);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(c0mm6, this) == objLJFF) {
            C1C7U.LIZIZ("Forward2StoryEnvironment@d506.downloadCanvasStyleResource$1");
            return objLJFF;
        }
        C0MMB.LIZIZ(C0MM5.LIZIZ.LIZLLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("Forward2StoryEnvironment@d506.downloadCanvasStyleResource$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super C0MM6> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
