package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09hW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.tikbot.TakoAssem$refreshIconOpt$1", f = "TakoAssem.kt", l = {498}, m = "invokeSuspend")
public final class C2441609hW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoAssem LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;
    public final /* synthetic */ SmartImageView LLILZ;
    public final /* synthetic */ ImageView LLILZIL;
    public final /* synthetic */ View LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2441609hW(TakoAssem takoAssem, VideoItemParams videoItemParams, SmartImageView smartImageView, ImageView imageView, View view, InterfaceC1364105Vn<? super C2441609hW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoAssem;
        this.LLILLL = videoItemParams;
        this.LLILZ = smartImageView;
        this.LLILZIL = imageView;
        this.LLILZLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2441609hW(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoAssem@6e4b.refreshIconOpt$1");
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
            TakoAssem takoAssem = this.LLILLJJLI;
            this.LL = 1;
            obj = takoAssem.Qp(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TakoAssem@6e4b.refreshIconOpt$1");
                return objLJFF;
            }
        }
        if (((Boolean) obj).booleanValue() && this.LLILLJJLI.Tp(this.LLILLL)) {
            TakoAssem takoAssem2 = this.LLILLJJLI;
            takoAssem2.LLLF = true;
            takoAssem2.Gp(this.LLILZ, this.LLILZIL, this.LLILZLL);
        } else {
            TakoAssem takoAssem3 = this.LLILLJJLI;
            takoAssem3.LLLF = false;
            takoAssem3.Bp(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAssem@6e4b.refreshIconOpt$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
