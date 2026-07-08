package X;

import com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YUx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.reaction.reactionlist.IMReactionListSheet$onMessageEvent$1", f = "IMReactionListSheet.kt", l = {}, m = "invokeSuspend")
public final class C875170YUx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IMReactionListSheet LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C875170YUx(IMReactionListSheet iMReactionListSheet, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C875170YUx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iMReactionListSheet;
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C875170YUx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMReactionListSheet@161c.onMessageEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMReactionListSheet iMReactionListSheet = this.LL;
        C869590Y9l c869590Y9l = this.LLILLJJLI;
        iMReactionListSheet.LLIZ = c869590Y9l;
        ((C893290Z2p) iMReactionListSheet.LLJ.getValue()).LLILLJJLI = c869590Y9l;
        C456160Hug c456160Hug = iMReactionListSheet.LLJIJIL;
        C869590Y9l c869590Y9l2 = iMReactionListSheet.LLIZ;
        if (c869590Y9l2 == null) {
            c869590Y9l2 = null;
        }
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c456160Hug.LL = C879250YeR.LIZJ(c869590Y9l2, curUserId);
        c456160Hug.LLLIIIIL(false);
        C23250099c.LIZLLL(iMReactionListSheet.LLJI, null, null, new C860390Xp7(iMReactionListSheet, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMReactionListSheet@161c.onMessageEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
