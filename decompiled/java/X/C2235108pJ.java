package X;

import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS22S0000100_3;
import njp.a;

/* JADX INFO: renamed from: X.08pJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$doAclCheckLogic$1", f = "CommentLongPressFragment.kt", l = {}, m = "invokeSuspend")
public final class C2235108pJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ CommentLongPressFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235108pJ(CommentLongPressFragment commentLongPressFragment, InterfaceC1364105Vn<? super C2235108pJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentLongPressFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2235108pJ c2235108pJ = new C2235108pJ(this.LLILLJJLI, interfaceC1364105Vn);
        c2235108pJ.LL = obj;
        return c2235108pJ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        String cid;
        C1C7U.LIZ("CommentLongPressFragment@922.doAclCheckLogic$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        Aweme aweme = this.LLILLJJLI.LLJI;
        if (aweme != null && (aid = aweme.getAid()) != null) {
            Comment comment = this.LLILLJJLI.LLJ;
            if (comment != null && (cid = comment.getCid()) != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                CommentLongPressFragment commentLongPressFragment = this.LLILLJJLI;
                C099G c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, C0PEM.LIZJ, null, new C2235008pI(aid, cid, null), 2);
                c099gLIZIZ.LJII(new AwS22S0000100_3(jCurrentTimeMillis, 0));
                commentLongPressFragment.LLJJJ = c099gLIZIZ;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$1");
                return unit;
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
