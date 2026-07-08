package X;

import android.content.Context;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01xn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController$resizeImages$1$3", f = "VideoImageMixedController.kt", l = {}, m = "invokeSuspend")
public final class C504101xn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ VideoImageMixedController LL;
    public final /* synthetic */ Function1<ArrayList<TikTokMediaModel>, Unit> LLILLJJLI;
    public final /* synthetic */ List<TikTokMediaModel> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C504101xn(VideoImageMixedController videoImageMixedController, Function1<? super ArrayList<TikTokMediaModel>, Unit> function1, List<TikTokMediaModel> list, InterfaceC1364105Vn<? super C504101xn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = videoImageMixedController;
        this.LLILLJJLI = function1;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C504101xn(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C1C7U.LIZ("VideoImageMixedController@1fe.resizeImages$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C528030KnJ c528030KnJ = this.LL.LLJJJJJIL;
        if (c528030KnJ != null && (context = c528030KnJ.getContext()) != null && C1388190mED.LIZ(context) != null) {
            this.LL.LJJJJI();
        }
        this.LLILLJJLI.invoke(new ArrayList<>(this.LLILLL));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VideoImageMixedController@1fe.resizeImages$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
