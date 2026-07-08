package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.shortvideo.album.SelectMaterialScene;
import com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09oU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemedia.AIPlaygroundAIGCChooseResultImpl$onChosenResult$1$1$2", f = "AIPlaygroundAIGCChooseResultImpl.kt", l = {}, m = "invokeSuspend")
public final class C2484809oU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<String> LL;
    public final /* synthetic */ Intent LLILLJJLI;
    public final /* synthetic */ AIPlaygroundAIGCChooseResultImpl LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2484809oU(List<String> list, Intent intent, AIPlaygroundAIGCChooseResultImpl aIPlaygroundAIGCChooseResultImpl, int i, int i2, InterfaceC1364105Vn<? super C2484809oU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
        this.LLILLJJLI = intent;
        this.LLILLL = aIPlaygroundAIGCChooseResultImpl;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2484809oU(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isEmpty()) {
            this.LLILLJJLI.putExtra("key_ai_playground_take_photo_bitmap", C09HN.LIZ(this.LL));
        }
        InterfaceC20597015ii interfaceC20597015iiLIZJ = C20622515mp.LIZJ(this.LLILLL.LL);
        Unit unit = null;
        if (interfaceC20597015iiLIZJ != null && (interfaceC20597015iiLIZJ.LC() instanceof SelectMaterialScene)) {
            C198H c198hLC = interfaceC20597015iiLIZJ.LC();
            if (c198hLC != null) {
                c198hLC.setResult(this.LLILZ, this.LLILLJJLI);
            }
            C198H c198hLC2 = interfaceC20597015iiLIZJ.LC();
            if (c198hLC2 != null) {
                c198hLC2.finish();
                unit = Unit.LIZ;
            }
        } else {
            C2204961BRm.LJIIL(this.LLILZIL, this.LLILLL.LL, this.LLILLJJLI, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KP6nbJPdkj9dPSVF/XyG/+XDBbwJ/OleZzFPj3ST1tGjhQwmMMqzJdEOwCpOD0KK3qjRdojT584ZrQUanEs=", null));
            this.LLILLL.LL.finish();
            C20622515mp.LIZ(this.LLILLL.LL, R.anim.a8);
            unit = Unit.LIZ;
        }
        C1C7U.LIZIZ("AIPlaygroundAIGCChooseResultImpl@3555.onChosenResult$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
