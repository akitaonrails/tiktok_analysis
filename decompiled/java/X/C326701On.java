package X;

import android.text.Spannable;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01On, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.tray.view.RightTagViewUtils$getTextForRightTag$1", f = "RightTagViewUtils.kt", l = {203}, m = "invokeSuspend")
public final class C326701On extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1135810ff9 LLILLJJLI;
    public final /* synthetic */ Function1<CharSequence, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C326701On(C1135810ff9 c1135810ff9, Function1<? super CharSequence, Unit> function1, InterfaceC1364105Vn<? super C326701On> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1135810ff9;
        this.LLILLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326701On(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GiftMessage giftMessage;
        C1C7U.LIZ("RightTagViewUtils@1d39.getTextForRightTag$1");
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
            C1137000fh4 c1137000fh4 = C1137000fh4.LIZ;
            C1135810ff9 c1135810ff9 = this.LLILLJJLI;
            if (c1135810ff9 != null) {
                giftMessage = c1135810ff9.LIZ;
            } else {
                giftMessage = null;
            }
            c1137000fh4.getClass();
            Spannable spannableLIZJ = C1137000fh4.LIZJ(giftMessage);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C326601Om c326601Om = new C326601Om(this.LLILLL, spannableLIZJ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c326601Om) == objLJFF) {
                C1C7U.LIZIZ("RightTagViewUtils@1d39.getTextForRightTag$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RightTagViewUtils@1d39.getTextForRightTag$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
