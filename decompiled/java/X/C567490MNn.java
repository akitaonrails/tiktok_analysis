package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResSmallCardStyle$1$generateCommentOriginTagStickerTask$1", f = "CommentForwardResolver.kt", l = {547}, m = "invokeSuspend")
public final class C567490MNn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq>, Object> {
    public int LL;
    public final /* synthetic */ C0MO0 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567490MNn(C0MO0 c0mo0, InterfaceC1364105Vn<? super C567490MNn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0mo0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567490MNn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginTagStickerTask$1");
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
            C1D7S<C0MO0, C567520MNq> c1d7s = new C1D7S<C0MO0, C567520MNq>() { // from class: X.0MNt
                @Override // X.C1D7S
                public final Object LIZIZ(Object obj2, C1D7T c1d7t) throws Throwable {
                    int iIntValue;
                    C0MO0 c0mo0 = (C0MO0) obj2;
                    Context context = c0mo0.LIZIZ.LIZ;
                    FrameLayout frameLayout = new FrameLayout(context);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20))));
                    layoutParams.gravity = 17;
                    C786410Ut5.a6(frameLayout, layoutParams);
                    C426750GoL.LJIIL(frameLayout, C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(6)))), null, C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(6)))), null, 26);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = C2286608xc.LJ(R.attr.zg);
                    c384050F3z.LIZJ = C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(4)));
                    frameLayout.setBackground(c384050F3z.LIZ(context));
                    TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
                    tuxTextView.setText(context.getString(2131836392));
                    tuxTextView.setMaxLines(1);
                    tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.zi, context);
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxTextView.setTextColor(iIntValue);
                    tuxTextView.setTuxFont(72);
                    ViewGroup.LayoutParams layoutParams2 = new ViewGroup.LayoutParams(-2, -1);
                    tuxTextView.setGravity(17);
                    C786410Ut5.R6(tuxTextView, layoutParams2);
                    if (C444960Hcc.LIZJ(context)) {
                        tuxTextView.setLayoutDirection(1);
                    }
                    frameLayout.addView(tuxTextView);
                    frameLayout.measure(View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(156))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8))), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(20))), 1073741824));
                    frameLayout.layout(0, 0, frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight());
                    Bitmap bitmapLIZ = C1100080ejW.LIZ(frameLayout.getMeasuredWidth(), frameLayout.getMeasuredHeight(), frameLayout);
                    if (bitmapLIZ == null) {
                        return null;
                    }
                    String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c0mo0.LIZ, EnumC20228214Cy.CUSTOM_STICKER, null, false, 12);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(strLIZLLL);
                    sbLIZ.append(System.currentTimeMillis());
                    sbLIZ.append("OriginalTag.png");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    C2477909nN.LJI(bitmapLIZ, strLIZIZ, null, 0, 6);
                    return new C567520MNq(strLIZIZ, bitmapLIZ.getWidth(), bitmapLIZ.getHeight(), null);
                }
            };
            C0MO0 c0mo0 = this.LLILLJJLI;
            this.LL = 1;
            obj = C1D7S.LIZ(c1d7s, c0mo0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginTagStickerTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginTagStickerTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
