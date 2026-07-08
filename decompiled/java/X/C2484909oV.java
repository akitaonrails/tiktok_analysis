package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl$onChosenResult$1$2$1", f = "AIPlaygroundAIGCChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C2484909oV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIPlaygroundAIGCChooseResultImpl LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2484909oV(AIPlaygroundAIGCChooseResultImpl aIPlaygroundAIGCChooseResultImpl, int i, Intent intent, int i2, InterfaceC1364105Vn<? super C2484909oV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIPlaygroundAIGCChooseResultImpl;
        this.LLILLJJLI = i;
        this.LLILLL = intent;
        this.LLILZ = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2484909oV(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LL.LL);
        if (interfaceC20597015iiLIZJ != null && (interfaceC20597015iiLIZJ.LC() instanceof SelectMaterialScene)) {
            C198H c198hLC = interfaceC20597015iiLIZJ.LC();
            if (c198hLC != null) {
                c198hLC.setResult(this.LLILLJJLI, this.LLILLL);
            }
            C198H c198hLC2 = interfaceC20597015iiLIZJ.LC();
            if (c198hLC2 != null) {
                c198hLC2.finish();
            }
        } else {
            C2204961BRm.LJIIL(this.LLILZ, this.LL.LL, this.LLILLL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3ST1tGjhQwmMMqzJdEOwCpOD0KK3qjRdojT584ZrQUanEs=", null));
            this.LL.LL.finish();
            C20622515mp.LIZ(this.LL.LL, R.anim.a8);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
