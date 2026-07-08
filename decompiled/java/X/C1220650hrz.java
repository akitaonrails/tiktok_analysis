package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.preload.CommentPreRequestHelper$getPreRequestTask$1", f = "CommentPreRequestHelper.kt", l = {277}, m = "invokeSuspend")
public final class C1220650hrz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends CommentItemList>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Aweme LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C118300cf LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C118300cf LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220650hrz(String str, String str2, Aweme aweme, String str3, int i, String str4, C118300cf c118300cf, boolean z, C118300cf c118300cf2, InterfaceC1364105Vn<? super C1220650hrz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = aweme;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = str4;
        this.LLJ = c118300cf;
        this.LLJI = z;
        this.LLJIJIL = c118300cf2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1220650hrz c1220650hrz = new C1220650hrz(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1220650hrz.LLILLJJLI = obj;
        return c1220650hrz;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        String str2;
        boolean z;
        Object objLIZJ = obj;
        C1C7U.LIZ("CommentPreRequestHelper@4e5c.getPreRequestTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    str = (String) this.LLILLJJLI;
                    C155000ia.LIZIZ(objLIZJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLIZJ);
                String str3 = this.LLILLL;
                str = this.LLILZ;
                Aweme aweme = this.LLILZIL;
                String str4 = this.LLILZLL;
                int i2 = this.LLIZ;
                String str5 = this.LLIZLLLIL;
                C118300cf c118300cf = this.LLJ;
                boolean z2 = this.LLJI;
                C118300cf c118300cf2 = this.LLJIJIL;
                if (str3 != null) {
                    str2 = str3;
                } else {
                    str2 = "";
                }
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ("enter_from", str2);
                c2344009Gk.LJIIIIZZ("pre_request_method", str);
                C1350920lG6.LJJJ(c2344009Gk, "comment_pre_request");
                String strLIZ = C1346020l8C.LIZ(aweme, EnumC1342450l2R.DEFAULT_SORT, null);
                ArrayList arrayList = new ArrayList();
                Long lLJFF = C2286608xc.LJFF(C1344240l5K.LIZIZ(aweme));
                Integer numLJ = C2286608xc.LJ(c118300cf.element);
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                C11NZ c11nzLIZ = C1345950l85.LIZ(str4, 0L, i2, str5, 0, 0, aweme, str3, arrayList, strLIZ, lLJFF, numLJ, null, z, C2286608xc.LJ(c118300cf2.element), false, null, null);
                this.LLILLJJLI = str;
                this.LL = 1;
                objLIZJ = C11UD.LIZJ(c11nzLIZ, this);
                if (objLIZJ == objLJFF) {
                    C1C7U.LIZIZ("CommentPreRequestHelper@4e5c.getPreRequestTask$1");
                    return objLJFF;
                }
            }
            CommentItemList commentItemList = (CommentItemList) objLIZJ;
            commentItemList.hitPreRequest = true;
            commentItemList.preRequestMethod = str;
            c098200Yq = (CommentItemList) objLIZJ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(c098200Yq);
        C1C7U.LIZIZ("CommentPreRequestHelper@4e5c.getPreRequestTask$1");
        return c189200o6M1boximpl;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends CommentItemList>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
