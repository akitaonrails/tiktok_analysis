package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0MQD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.onthisday.celebration.CelebrationVideoTemplatePreviewScene$onBackFromSelectMaterial$1$1", f = "CelebrationVideoTemplatePreviewScene.kt", l = {}, m = "invokeSuspend")
public final class C0MQD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ CelebrationVideoTemplatePreviewScene LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MQD(boolean z, CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene, long j, InterfaceC1364105Vn<? super C0MQD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = celebrationVideoTemplatePreviewScene;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0MQD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C568720MSg c568720MSgLLLLIILL;
        C0MLL c0mll;
        C568720MSg c568720MSgLLLLIILL2;
        C1C7U.LIZ("CelebrationVideoTemplatePreviewScene@bef4.onBackFromSelectMaterial$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C201955140j.LIZJ(C554890LpX.LIZIZ, "OnThisDayVideoPreviewSceneafter activity result, data changed");
            CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene = this.LLILLJJLI;
            TuxTextView tuxTextView = celebrationVideoTemplatePreviewScene.LLJZ;
            if (tuxTextView != null && (c0mll = celebrationVideoTemplatePreviewScene.LLLFZ) != null) {
                C0MQS c0mqs = celebrationVideoTemplatePreviewScene.LLL;
                if (c0mqs != null) {
                    c568720MSgLLLLIILL2 = c0mqs.LJJIL().LLLLIILL();
                } else {
                    c568720MSgLLLLIILL2 = null;
                }
                c0mll.WU1(tuxTextView, false, c568720MSgLLLLIILL2, new C0MQE(celebrationVideoTemplatePreviewScene));
            }
            CelebrationVideoTemplatePreviewScene celebrationVideoTemplatePreviewScene2 = this.LLILLJJLI;
            AwS552S0100000_8 awS552S0100000_8 = new AwS552S0100000_8(celebrationVideoTemplatePreviewScene2, 807);
            celebrationVideoTemplatePreviewScene2.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0MHP c0mhp = celebrationVideoTemplatePreviewScene2.LLLFFI;
            if (c0mhp != null) {
                c0mhp.F40(false, new C0MQN(celebrationVideoTemplatePreviewScene2, jCurrentTimeMillis, false, awS552S0100000_8));
            }
        } else {
            C0MQS c0mqs2 = this.LLILLJJLI.LLL;
            if (c0mqs2 != null && (c568720MSgLLLLIILL = c0mqs2.LJJIL().LLLLIILL()) != null) {
                C201955140j.LIZJ(C554890LpX.LIZIZ, "CelePlayer, unblock and play");
                c568720MSgLLLLIILL.LJFF = c568720MSgLLLLIILL.LJI;
                c568720MSgLLLLIILL.LIZJ();
            }
            this.LLILLJJLI.LLLLLJLJLL(false);
        }
        C554890LpX c554890LpX = C554890LpX.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OnThisDayVideoPreviewScene on activity result, hashCode = ");
        sbLIZ.append(this.LLILLJJLI.hashCode());
        sbLIZ.append(", [end] setVideoData, cost = ");
        sbLIZ.append(System.currentTimeMillis() - this.LLILLL);
        sbLIZ.append(" ms");
        C201955140j.LJIILJJIL(c554890LpX, C2188811AlT.LIZIZ(sbLIZ));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CelebrationVideoTemplatePreviewScene@bef4.onBackFromSelectMaterial$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
