package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.api.model.FetchInfo;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03JN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03JN extends C09AY implements Function1<C1397630mTR, Unit> {
    public final /* synthetic */ List<DialogButton> LL;
    public final /* synthetic */ C03DB LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ Function1<FetchInfo, Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ HashMap<String, Object> LLJ;
    public final /* synthetic */ Function0<Unit> LLJI;
    public final /* synthetic */ C03O1 LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03JN(List<DialogButton> list, C03DB c03db, Context context, Function0<Unit> function0, Function1<? super FetchInfo, Unit> function1, Function0<Unit> function02, Function0<Unit> function03, String str, HashMap<String, Object> map, Function0<Unit> function04, C03O1 c03o1) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = c03db;
        this.LLILLL = context;
        this.LLILZ = function0;
        this.LLILZIL = function1;
        this.LLILZLL = function02;
        this.LLIZ = function03;
        this.LLIZLLLIL = str;
        this.LLJ = map;
        this.LLJI = function04;
        this.LLJIJIL = c03o1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1397630mTR c1397630mTR) {
        C1397630mTR c1397630mTR2 = c1397630mTR;
        if (C13LP.LJJJLL(this.LL) != null) {
            String str = ((DialogButton) C13LP.LJJJJZI(this.LL)).text;
            if (str == null) {
                str = "";
            }
            c1397630mTR2.LIZJ(0, str, new C03JL(this.LLILLJJLI, this.LLILLL, ((DialogButton) C13LP.LJJJJZI(this.LL)).buttonAction, this.LLILZ, this.LLILZIL, this.LLILZLL, null, null, null, this.LLIZ, this.LLIZLLLIL, this.LLJ, null, null, this.LLJI, this.LLJIJIL, 29120));
        }
        if (C13LP.LJJJLZIJ(1, this.LL) != null) {
            String str2 = ((DialogButton) ListProtector.get(this.LL, 1)).text;
            if (str2 == null) {
                str2 = "";
            }
            c1397630mTR2.LIZJ(1, str2, new C03JL(this.LLILLJJLI, this.LLILLL, ((DialogButton) ListProtector.get(this.LL, 1)).buttonAction, this.LLILZ, this.LLILZIL, this.LLILZLL, null, null, null, this.LLIZ, this.LLIZLLLIL, this.LLJ, null, null, this.LLJI, this.LLJIJIL, 29120));
        }
        return Unit.LIZ;
    }
}
