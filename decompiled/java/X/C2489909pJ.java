package X;

import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.PhotoModeTemplateChosenResultImpl$startUseTemplate$1$downloadStickerIconTask$1", f = "PhotoModeTemplateChosenResultImpl.kt", l = {156}, m = "invokeSuspend")
public final class C2489909pJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Long>, Object> {
    public int LL;
    public final /* synthetic */ C0L1E LLILLJJLI;
    public final /* synthetic */ NLETemplateModel LLILLL;
    public final /* synthetic */ ShortVideoContext LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2489909pJ(C0L1E c0l1e, NLETemplateModel nLETemplateModel, ShortVideoContext shortVideoContext, InterfaceC1364105Vn<? super C2489909pJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0l1e;
        this.LLILLL = nLETemplateModel;
        this.LLILZ = shortVideoContext;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2489909pJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLIZIZ;
        C1C7U.LIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadStickerIconTask$1");
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
            C0L1E c0l1e = this.LLILLJJLI;
            NLETemplateModel nLETemplateModel = this.LLILLL;
            ShortVideoContext shortVideoContext = this.LLILZ;
            this.LL = 1;
            c0l1e.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (nLETemplateModel == null) {
                obj = C2286608xc.LJFF(0L);
            } else {
                try {
                    zLIZIZ = C036E.LIZ.LIZIZ();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    zLIZIZ = false;
                }
                if (!zLIZIZ || !C2490009pK.LIZ()) {
                    obj = C2286608xc.LJFF(0L);
                } else {
                    C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                    C020U c020u = new C020U(c23260099m, jCurrentTimeMillis, 5);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C576120Mig.LIZIZ.plus(new C09AL())), null, null, new C353620Dtg(nLETemplateModel, new ArrayList(), c020u, linkedHashSet, shortVideoContext, null), 3);
                    obj = c23260099m.LIZ();
                    if (obj == C099R.LJFF()) {
                        C099Q.LIZJ(this);
                    }
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadStickerIconTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("PhotoModeTemplateChosenResultImpl@e1dd.startUseTemplate$1$downloadStickerIconTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
