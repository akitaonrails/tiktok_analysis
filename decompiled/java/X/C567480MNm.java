package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResNormalStyle$1$generateNickNameStickerTask$1", f = "CommentForwardResolver.kt", l = {381}, m = "invokeSuspend")
public final class C567480MNm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq>, Object> {
    public int LL;
    public final /* synthetic */ C0MO0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567480MNm(C0MO0 c0mo0, InterfaceC1364105Vn<? super C567480MNm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mo0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567480MNm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$generateNickNameStickerTask$1");
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
            C1D7S<C0MO0, C567520MNq> c1d7s = new C1D7S<C0MO0, C567520MNq>() { // from class: X.0MNr
                @Override // X.C1D7S
                public final Object LIZIZ(Object obj2, C1D7T c1d7t) throws Throwable {
                    int iIntValue;
                    C0MO0 c0mo0 = (C0MO0) obj2;
                    Context context = c0mo0.LIZIZ.LIZ;
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    C0MM5 c0mm5 = C0MM5.LIZ;
                    C0MM9 c0mm9 = c0mo0.LIZIZ.LIZIZ.author;
                    c0mm5.getClass();
                    sbLIZ.append(C0MM5.LIZLLL(c0mm9));
                    tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
                    tuxTextView.setMaxLines(1);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.eg, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxTextView.setTextColor(iIntValue);
                    tuxTextView.setTextSize(1, tuxTextView.getTextSize());
                    tuxTextView.setMinTextSize(10.0f);
                    tuxTextView.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))));
                    tuxTextView.setTuxFont(52);
                    C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, -2));
                    if (C444960Hcc.LIZJ(context)) {
                        tuxTextView.setLayoutDirection(1);
                    }
                    tuxTextView.measure(View.MeasureSpec.makeMeasureSpec((int) ((ScreenUtils.getScreenWidth(context) * 0.68f) - C567560MNu.LIZIZ), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
                    tuxTextView.layout(0, 0, tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight());
                    Bitmap bitmapLIZ = C1100080ejW.LIZ(tuxTextView.getMeasuredWidth(), tuxTextView.getMeasuredHeight(), tuxTextView);
                    if (bitmapLIZ == null) {
                        return null;
                    }
                    String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c0mo0.LIZ, EnumC20228214Cy.CUSTOM_STICKER, null, false, 12);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZLLL);
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append(".png");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C2477909nN.LJI(bitmapLIZ, strLIZIZ, null, 0, 6);
                    return new C567520MNq(strLIZIZ, bitmapLIZ.getWidth(), bitmapLIZ.getHeight(), null);
                }
            };
            C0MO0 c0mo0 = this.LLILLJJLI;
            this.LL = 1;
            obj = C1D7S.LIZ(c1d7s, c0mo0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$generateNickNameStickerTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResNormalStyle$1$generateNickNameStickerTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
