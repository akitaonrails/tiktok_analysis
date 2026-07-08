package X;

import android.graphics.Typeface;
import com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.powercell.BaseCommentCell$onItemViewCreated$8$1$1", f = "BaseCommentCell.kt", l = {}, m = "invokeSuspend")
public final class C433030GyT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Typeface LL;
    public final /* synthetic */ BaseCommentCell<T> LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433030GyT(Typeface typeface, BaseCommentCell<T> baseCommentCell, String str, InterfaceC1364105Vn<? super C433030GyT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = typeface;
        this.LLILLJJLI = baseCommentCell;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433030GyT(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommentCell@3af4.onItemViewCreated$8$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Typeface typeface = this.LL;
        if (typeface != null) {
            BaseCommentCell<T> baseCommentCell = this.LLILLJJLI;
            String str = this.LLILLL;
            C1353360lK2 c1353360lK2 = baseCommentCell.LLJJI;
            if (c1353360lK2 != null) {
                c1353360lK2.setTypeface(typeface);
            }
            BaseCommentCell.LLLLLZ.put(str, typeface);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommentCell@3af4.onItemViewCreated$8$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
