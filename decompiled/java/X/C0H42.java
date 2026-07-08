package X;

import android.text.TextUtils;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS104S0400000_6;
import njp.a;

/* JADX INFO: renamed from: X.0H42, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoCommentAssem$onViewCreated$5$1$1", f = "SearchVideoCommentAssem.kt", l = {216, 222}, m = "invokeSuspend")
public final class C0H42 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public int LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ C259800zU<View> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ SearchVideoCommentAssem LLIZ;
    public final /* synthetic */ Comment LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H42(TuxTextView tuxTextView, C259800zU<View> c259800zU, String str, C259800zU<String> c259800zU2, SearchVideoCommentAssem searchVideoCommentAssem, Comment comment, InterfaceC1364105Vn<? super C0H42> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = tuxTextView;
        this.LLILZ = c259800zU;
        this.LLILZIL = str;
        this.LLILZLL = c259800zU2;
        this.LLIZ = searchVideoCommentAssem;
        this.LLIZLLLIL = comment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H42(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C259800zU<String> c259800zU;
        T t;
        C1C7U.LIZ("SearchVideoCommentAssem@362c.onViewCreated$5$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    c259800zU = this.LL;
                    C155000ia.LIZIZ(obj);
                    t = obj;
                    c259800zU.element = t;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                this.LLILZLL.element = C434630H2n.LIZIZ(this.LLILLL);
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (C426750GoL.LIZLLL(this.LLILLL.getContext())) {
                View view = this.LLILZ.element;
                if (view != null) {
                    C12ES.LJIILL(0, view);
                }
                this.LLILLL.setGravity(5);
                this.LLILLL.setEllipsize(TextUtils.TruncateAt.END);
                this.LLILLL.setText(this.LLILZIL);
                TuxTextView tuxTextView = this.LLILLL;
                this.LLILLJJLI = 1;
                if (C434630H2n.LIZ(tuxTextView, this) == objLJFF) {
                    C1C7U.LIZIZ("SearchVideoCommentAssem@362c.onViewCreated$5$1$1");
                    return objLJFF;
                }
                this.LLILZLL.element = C434630H2n.LIZIZ(this.LLILLL);
            } else {
                View view2 = this.LLILZ.element;
                if (view2 != null) {
                    C0H1U.LIZIZ(view2);
                }
                this.LLILLL.setGravity(0);
                this.LLILLL.setEllipsize(null);
                c259800zU = this.LLILZLL;
                SearchVideoCommentAssem searchVideoCommentAssem = this.LLIZ;
                TuxTextView tuxTextView2 = this.LLILLL;
                String str = this.LLILZIL;
                this.LL = c259800zU;
                this.LLILLJJLI = 2;
                Object objDp = searchVideoCommentAssem.dp(tuxTextView2, str, this);
                t = objDp;
                if (objDp == objLJFF) {
                    C1C7U.LIZIZ("SearchVideoCommentAssem@362c.onViewCreated$5$1$1");
                    return objLJFF;
                }
                c259800zU.element = t;
            }
        }
        TuxTextView tuxTextView3 = this.LLILLL;
        C2211631BhB.LJ(tuxTextView3, new AwS104S0400000_6(this.LLIZLLLIL, (Comment) this.LLIZ, (SearchVideoCommentAssem) tuxTextView3, (TuxTextView) this.LLILZLL, (C259800zU<String>) 1));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchVideoCommentAssem@362c.onViewCreated$5$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
