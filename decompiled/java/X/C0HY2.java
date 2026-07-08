package X;

import android.view.View;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.helper.CommentStickerClickHelper$Companion$removeStickerFromFavourite$1", f = "CommentStickerClickHelper.kt", l = {190}, m = "invokeSuspend")
public final class C0HY2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ Long LLIZ;
    public final /* synthetic */ InterfaceC450440HlS LLIZLLLIL;
    public final /* synthetic */ Integer LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY2(View view, Long l, String str, int i, String str2, Long l2, InterfaceC450440HlS interfaceC450440HlS, Integer num, InterfaceC1364105Vn<? super C0HY2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = view;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = i;
        this.LLILZLL = str2;
        this.LLIZ = l2;
        this.LLIZLLLIL = interfaceC450440HlS;
        this.LLJ = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY2(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentStickerClickHelper$Companion@fa5e.removeStickerFromFavourite$1");
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
            IStickerStoreHelper.LIZ.getClass();
            IStickerStoreHelper iStickerStoreHelperLIZ = C0HY9.LIZ();
            if (iStickerStoreHelperLIZ != null) {
                View view = this.LLILLJJLI;
                Long l = this.LLILLL;
                String str = this.LLILZ;
                Integer numLJ = C2286608xc.LJ(this.LLILZIL);
                String str2 = this.LLILZLL;
                Long l2 = this.LLIZ;
                InterfaceC450440HlS interfaceC450440HlS = this.LLIZLLLIL;
                Integer num = this.LLJ;
                this.LL = 1;
                if (iStickerStoreHelperLIZ.LJFF(view, l, str, numLJ, str2, l2, null, interfaceC450440HlS, num, "comment", false, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentStickerClickHelper$Companion@fa5e.removeStickerFromFavourite$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentStickerClickHelper$Companion@fa5e.removeStickerFromFavourite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
