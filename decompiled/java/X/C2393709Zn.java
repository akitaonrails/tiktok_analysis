package X;

import android.app.Dialog;
import com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment;
import com.ss.android.ugc.aweme.comment.model.CommentShareACL;
import com.ss.android.ugc.aweme.comment.model.CommentShareInfo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Zn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.longpresspanel.ui.CommentLongPressFragment$doAclCheckLogic$2$1", f = "CommentLongPressFragment.kt", l = {491}, m = "invokeSuspend")
public final class C2393709Zn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CommentLongPressFragment LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2393709Zn(CommentLongPressFragment commentLongPressFragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C2393709Zn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = commentLongPressFragment;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2393709Zn c2393709Zn = new C2393709Zn(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c2393709Zn.LLILLL = obj;
        return c2393709Zn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        long jCurrentTimeMillis;
        C1C7U.LIZ("CommentLongPressFragment@922.doAclCheckLogic$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLL;
            CommentLongPressFragment commentLongPressFragment = this.LLILZ;
            C099G c099g = commentLongPressFragment.LLJJJ;
            if (c099g != null && c099g.isActive()) {
                C1391850mK7.LIZIZ(commentLongPressFragment.LLJJJJ.getValue(), "comment_long_press_share_outside_loading");
                C571830Mbl.LIZIZ((Dialog) commentLongPressFragment.LLJJJJ.getValue());
                jCurrentTimeMillis = System.currentTimeMillis();
            } else {
                jCurrentTimeMillis = -1;
            }
            CommentLongPressFragment commentLongPressFragment2 = this.LLILZ;
            this.LLILLL = interfaceC497601wk;
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            commentLongPressFragment2.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C2234908pH(commentLongPressFragment2, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$2$1");
                return objLJFF;
            }
        }
        CommentShareInfo commentShareInfo = (CommentShareInfo) obj;
        C571830Mbl.LIZ((Dialog) this.LLILZ.LLJJJJ.getValue());
        if (jCurrentTimeMillis > 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LIZLLL(jCurrentTimeMillis2, "duration");
            C20684815ws.LJIILLIIL("comment_external_share_loading", c2344009Gk.LIZ);
        }
        if (!C2296808zG.LJI(interfaceC497601wk)) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$2$1");
            return unit;
        }
        CommentLongPressFragment commentLongPressFragment3 = this.LLILZ;
        Function0<Unit> function0 = this.LLILZIL;
        commentLongPressFragment3.getClass();
        if (commentShareInfo != null) {
            CommentShareACL acl = commentShareInfo.getAcl();
            if (acl != null && acl.getCode() == 0) {
                C20684815ws.LJIILLIIL("comment_external_to_share", new C2344009Gk().LIZ);
                function0.invoke();
            } else {
                C20684815ws.LJIILLIIL("comment_external_share_disable", new C2344009Gk().LIZ);
                C19EG activity = commentLongPressFragment3.getActivity();
                if (activity != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(activity);
                    c1389890mGx.LJIIIZ(2131836858);
                    c1389890mGx.LJIIJJI();
                    String str = CommentLongPressFragment._pnsPageId;
                    C2393909Zp.LIZ(activity);
                }
            }
        } else {
            C20684815ws.LJIILLIIL("comment_external_share_disable", new C2344009Gk().LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommentLongPressFragment@922.doAclCheckLogic$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
