package X;

import com.ss.android.ugc.aweme.comment.poll.CommentPollViewModel;
import com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0e6Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.keyboard.inboxquickcomment.SingleKeyboardFragment$publishPoll$5", f = "SingleKeyboardFragment.kt", l = {657}, m = "invokeSuspend")
public final class C1075930e6Z extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleKeyboardFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1075920e6Y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1075930e6Z(SingleKeyboardFragment singleKeyboardFragment, String str, C1075920e6Y c1075920e6Y, InterfaceC1364105Vn<? super C1075930e6Z> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleKeyboardFragment;
        this.LLILLL = str;
        this.LLILZ = c1075920e6Y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1075930e6Z(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String uid;
        int awemeType;
        User author;
        C1C7U.LIZ("SingleKeyboardFragment@7e2a.publishPoll$5");
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
            CommentPollViewModel commentPollViewModel = (CommentPollViewModel) this.LLILLJJLI.LLJIJIL.getValue();
            String str = this.LLILLL;
            Long l = this.LLILZ.LIZJ;
            Aweme aweme = this.LLILLJJLI.LLILLJJLI;
            if (aweme == null || (author = aweme.getAuthor()) == null || (uid = author.getUid()) == null) {
                uid = "";
            }
            Aweme aweme2 = this.LLILLJJLI.LLILLJJLI;
            if (aweme2 != null) {
                awemeType = aweme2.getAwemeType();
            } else {
                awemeType = 0;
            }
            this.LL = 1;
            obj = commentPollViewModel.xQ2(awemeType, l, str, uid, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SingleKeyboardFragment@7e2a.publishPoll$5");
                return objLJFF;
            }
        }
        if (obj != null) {
            C1075940e6a.LIZ.getClass();
            String strLIZIZ = C1075940e6a.LIZIZ();
            Map<String, Integer> map = C1075940e6a.LIZLLL;
            Integer num = (Integer) ((LinkedHashMap) map).get(strLIZIZ);
            if (num == null || num.intValue() != 1) {
                map.put(strLIZIZ, 1);
                C1075940e6a.LIZLLL().storeBoolean(C1075940e6a.LIZJ(strLIZIZ), true);
            }
            if (this.LLILLJJLI.isAdded()) {
                C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
                c1389890mGx.LJIIIZ(2131829095);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleKeyboardFragment@7e2a.publishPoll$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
