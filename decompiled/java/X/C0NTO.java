package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NTO, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.image.bottombar.CommentImageEditBottomBarComponent$isNetworkStable$2", f = "CommentImageEditBottomBarComponent.kt", l = {}, m = "invokeSuspend")
public final class C0NTO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1451860nsu LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NTO(C1451860nsu c1451860nsu, InterfaceC1364105Vn<? super C0NTO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1451860nsu;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NTO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentImageEditBottomBarComponent@a28c.isNetworkStable$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Activity activity = this.LL.getActivity();
        CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
        creativeToastBuilder.messageRes(R.string.m25);
        C1390380mHk.LIZ(activity, 1034, creativeToastBuilder);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageEditBottomBarComponent@a28c.isNetworkStable$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
