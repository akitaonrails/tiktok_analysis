package X;

import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H8v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.detail.comment.ui.BaseSearchVideoDetailCommentAssem$onViewCreated$3$1", f = "BaseSearchVideoDetailCommentAssem.kt", l = {128}, m = "invokeSuspend")
public final class C436270H8v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BaseSearchVideoDetailCommentAssem LL;
    public int LLILLJJLI;
    public final /* synthetic */ BaseSearchVideoDetailCommentAssem<C03H5> LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ Comment LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C436270H8v(BaseSearchVideoDetailCommentAssem<C03H5> baseSearchVideoDetailCommentAssem, View view, Comment comment, InterfaceC1364105Vn<? super C436270H8v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseSearchVideoDetailCommentAssem;
        this.LLILZ = view;
        this.LLILZIL = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C436270H8v(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BaseSearchVideoDetailCommentAssem<C03H5> baseSearchVideoDetailCommentAssem;
        C1C7U.LIZ("BaseSearchVideoDetailCommentAssem@618d.onViewCreated$3$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                baseSearchVideoDetailCommentAssem = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            baseSearchVideoDetailCommentAssem = this.LLILLL;
            View viewLJJIJL = baseSearchVideoDetailCommentAssem.LJJIJL();
            TuxTextView tuxTextViewTp = this.LLILLL.Tp(this.LLILZ);
            Comment comment = this.LLILZIL;
            boolean zIp = this.LLILLL.Ip();
            this.LL = baseSearchVideoDetailCommentAssem;
            this.LLILLJJLI = 1;
            obj = C436240H8s.LIZJ(viewLJJIJL, tuxTextViewTp, comment, zIp, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("BaseSearchVideoDetailCommentAssem@618d.onViewCreated$3$1");
                return objLJFF;
            }
        }
        baseSearchVideoDetailCommentAssem.LLLFF = (C436260H8u) obj;
        C099F c099f = this.LLILLL.LLLFFI;
        if (c099f != null) {
            Boolean.valueOf(c099f.LJJLIIIJILLIZJL(Unit.LIZ));
        }
        this.LLILLL.LLLFFI = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSearchVideoDetailCommentAssem@618d.onViewCreated$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
