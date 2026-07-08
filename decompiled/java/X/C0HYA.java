package X;

import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import com.ss.android.ugc.aweme.im.common.model.SetSticker;
import com.ss.android.ugc.aweme.im.sticker.api.model.StickerSetInfo;
import com.ss.android.ugc.aweme.util.IStickerStoreHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.0HYA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.sticker.helper.CommentStickerClickHelper$getSetStickerUIData$uiData$1", f = "CommentStickerClickHelper.kt", l = {412}, m = "invokeSuspend")
public final class C0HYA extends C09AX implements Function1<InterfaceC1364105Vn<? super CharSequence>, Object> {
    public int LL;
    public final /* synthetic */ SetSticker LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HYA(SetSticker setSticker, View view, InterfaceC1364105Vn<? super C0HYA> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = setSticker;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HYA(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super CharSequence> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        String str;
        C1C7U.LIZ("CommentStickerClickHelper@ddf8.getSetStickerUIData$uiData$1");
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
                Long setId = this.LLILLJJLI.getSetId();
                this.LL = 1;
                obj = iStickerStoreHelperLIZ.LJ(setId, "comment", this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getSetStickerUIData$uiData$1");
                    return objLJFF;
                }
            }
            obj2 = "";
            C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getSetStickerUIData$uiData$1");
            return obj2;
        }
        StickerSetInfo stickerSetInfo = (StickerSetInfo) obj;
        if (stickerSetInfo != null && (str = stickerSetInfo.name) != null) {
            View view = this.LLILLL;
            String string = view.getContext().getString(2131848900, str);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iLJJJ = a0.LJJJ(string, str, 0, false, 6);
            obj2 = spannableStringBuilder;
            if (iLJJJ != -1) {
                int length = str.length() + iLJJJ;
                C786410Ut5.q2(spannableStringBuilder, new StyleSpan(1), iLJJJ, length, 33);
                C786410Ut5.q2(spannableStringBuilder, new C0ID7(view, 4), 0, length, 33);
                obj2 = spannableStringBuilder;
            }
        } else {
            obj2 = "";
        }
        C1C7U.LIZIZ("CommentStickerClickHelper@ddf8.getSetStickerUIData$uiData$1");
        return obj2;
    }
}
