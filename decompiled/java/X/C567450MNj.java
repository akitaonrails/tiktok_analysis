package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0MNj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.CommentForwardResolver$prepareForwardResSmallCardStyle$1$generateCommentOriginVideoTitleStickerTask$1", f = "CommentForwardResolver.kt", l = {551}, m = "invokeSuspend")
public final class C567450MNj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq>, Object> {
    public int LL;
    public final /* synthetic */ int[] LLILLJJLI;
    public final /* synthetic */ C0MO0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C567450MNj(int[] iArr, C0MO0 c0mo0, InterfaceC1364105Vn<? super C567450MNj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iArr;
        this.LLILLL = c0mo0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C567450MNj(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginVideoTitleStickerTask$1");
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
            final int i2 = this.LLILLJJLI[0];
            final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(52)));
            C1D7S<C0MO0, C567520MNq> c1d7s = new C1D7S<C0MO0, C567520MNq>(i2, iLIZIZ) { // from class: X.0MNs
                public final int LIZIZ;
                public int LIZJ;

                {
                    this.LIZIZ = i2;
                    this.LIZJ = iLIZIZ;
                }

                @Override // X.C1D7S
                public final Object LIZIZ(Object obj2, C1D7T c1d7t) throws Throwable {
                    boolean z;
                    boolean z2;
                    TuxTextView tuxTextView;
                    int iIntValue;
                    int iIntValue2;
                    C0MO0 c0mo0 = (C0MO0) obj2;
                    C0MND c0mnd = c0mo0.LIZIZ;
                    Context context = c0mnd.LIZ;
                    ForwardMedia forwardMedia = c0mnd.LIZIZ;
                    if (forwardMedia.desc.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.LIZJ -= C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(18)));
                    }
                    LinearLayout linearLayout = new LinearLayout(context);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.LIZIZ, this.LIZJ);
                    layoutParams.gravity = 17;
                    C786410Ut5.d6(linearLayout, layoutParams);
                    linearLayout.setOrientation(1);
                    C384050F3z c384050F3z = new C384050F3z();
                    c384050F3z.LIZIZ = C2286608xc.LJ(R.attr.zb);
                    c384050F3z.LJIIJ = C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(8)));
                    c384050F3z.LJIIJJI = C2286608xc.LIZLLL(C418440Gaw.LIZIZ(C2286608xc.LJ(8)));
                    linearLayout.setBackground(c384050F3z.LIZ(context));
                    C426750GoL.LJIIL(linearLayout, C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(10)))), C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(7)))), C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(10)))), C2286608xc.LJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(8)))), 16);
                    if (forwardMedia.desc.length() > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        tuxTextView = new TuxTextView(context, null, 6, 0);
                        C786410Ut5.R6(tuxTextView, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(18)))));
                        tuxTextView.setText(forwardMedia.desc);
                        tuxTextView.setMaxLines(1);
                        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, context);
                        if (numLIZJ != null) {
                            iIntValue2 = numLIZJ.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        tuxTextView.setTextColor(iIntValue2);
                        tuxTextView.setTuxFont(52);
                        tuxTextView.setGravity(48);
                    } else {
                        tuxTextView = null;
                    }
                    TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
                    C786410Ut5.R6(tuxTextView2, new ViewGroup.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(18)))));
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('@');
                    sbLIZ.append(forwardMedia.author.getNickName());
                    tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                    tuxTextView2.setMaxLines(1);
                    tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.a0w, context);
                    if (numLIZJ2 != null) {
                        iIntValue = numLIZJ2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    tuxTextView2.setTextColor(iIntValue);
                    tuxTextView2.setTuxFont(61);
                    tuxTextView2.setGravity(48);
                    if (C444960Hcc.LIZJ(context)) {
                        if (tuxTextView != null) {
                            tuxTextView.setLayoutDirection(1);
                        }
                        tuxTextView2.setLayoutDirection(1);
                    }
                    if (tuxTextView != null) {
                        linearLayout.addView(tuxTextView);
                    }
                    linearLayout.addView(tuxTextView2);
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(this.LIZIZ, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LIZJ, 1073741824));
                    linearLayout.layout(0, 0, linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight());
                    Bitmap bitmapLIZ = C1100080ejW.LIZ(linearLayout.getMeasuredWidth(), linearLayout.getMeasuredHeight(), linearLayout);
                    if (bitmapLIZ == null) {
                        return null;
                    }
                    String strLIZLLL = C2298208zU.LIZLLL(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), c0mo0.LIZ, EnumC20228214Cy.CUSTOM_STICKER, null, false, 12);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(strLIZLLL);
                    sbLIZ2.append(System.currentTimeMillis());
                    sbLIZ2.append("VideoTitle.png");
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                    C2477909nN.LJI(bitmapLIZ, strLIZIZ, null, 0, 6);
                    return new C567520MNq(strLIZIZ, bitmapLIZ.getWidth(), bitmapLIZ.getHeight(), null);
                }
            };
            C0MO0 c0mo0 = this.LLILLL;
            this.LL = 1;
            obj = C1D7S.LIZ(c1d7s, c0mo0, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginVideoTitleStickerTask$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentForwardResolver@871e.prepareForwardResSmallCardStyle$1$generateCommentOriginVideoTitleStickerTask$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C567520MNq> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
