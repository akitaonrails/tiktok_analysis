package X;

import android.view.View;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HY1, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.helper.CommentStickerClickHelper$Companion$addStickerToFavourite$1", f = "CommentStickerClickHelper.kt", l = {218}, m = "invokeSuspend")
public final class C0HY1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Long LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC450440HlS LLJ;
    public final /* synthetic */ Integer LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HY1(Long l, String str, String str2, View view, String str3, int i, String str4, InterfaceC450440HlS interfaceC450440HlS, Integer num, InterfaceC1364105Vn<? super C0HY1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = l;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = view;
        this.LLILZLL = str3;
        this.LLIZ = i;
        this.LLIZLLLIL = str4;
        this.LLJ = interfaceC450440HlS;
        this.LLJI = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HY1(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        C1C7U.LIZ("CommentStickerClickHelper$Companion@fa5e.addStickerToFavourite$1");
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
                Long l = this.LLILLJJLI;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                EnumC441530HTb enumC441530HTb = EnumC441530HTb.TOP;
                String str = this.LLILLL;
                String str2 = this.LLILZ;
                View view = this.LLILZIL;
                String str3 = this.LLILZLL;
                int i2 = this.LLIZ;
                String str4 = this.LLIZLLLIL;
                InterfaceC450440HlS interfaceC450440HlS = this.LLJ;
                Integer num = this.LLJI;
                this.LL = 1;
                if (iStickerStoreHelperLIZ.LIZIZ(str, str2, view, jLongValue, str3, i2, str4, null, interfaceC450440HlS, null, false, Integer.valueOf(C0HK7.UNKNOWN.getSource()), null, false, null, enumC441530HTb, num, "comment", false, this) == objLJFF) {
                    C1C7U.LIZIZ("CommentStickerClickHelper$Companion@fa5e.addStickerToFavourite$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentStickerClickHelper$Companion@fa5e.addStickerToFavourite$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
