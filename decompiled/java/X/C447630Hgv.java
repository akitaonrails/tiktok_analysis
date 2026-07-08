package X;

import Y.ACListenerS39S0210000_6;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.model.CommentStickerStruct;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0110000_6;
import kotlin.jvm.internal.AwS585S0100000_6;
import njp.a;

/* JADX INFO: renamed from: X.0Hgv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.comment.photocomment.component.CommentImageComponent$onStickerLongPress$1$1$1", f = "CommentImageComponent.kt", l = {}, m = "invokeSuspend")
public final class C447630Hgv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1341150l0L LL;
    public final /* synthetic */ View LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ CommentStickerStruct LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C447630Hgv(C1341150l0L c1341150l0L, View view, boolean z, CommentStickerStruct commentStickerStruct, InterfaceC1364105Vn<? super C447630Hgv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1341150l0L;
        this.LLILLJJLI = view;
        this.LLILLL = z;
        this.LLILZ = commentStickerStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C447630Hgv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        int i;
        C1C7U.LIZ("CommentImageComponent@3874.onStickerLongPress$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1341150l0L c1341150l0L = this.LL;
        C1391550mJd c1391550mJd = new C1391550mJd(this.LLILLJJLI.getContext());
        View view = this.LLILLJJLI;
        C1391600mJi c1391600mJi = c1391550mJd.LLILLJJLI;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.BOTTOM;
        c1391550mJd.LJII(R.attr.a1d);
        C1341150l0L c1341150l0L2 = this.LL;
        View view2 = this.LLILLJJLI;
        boolean z = this.LLILLL;
        c1341150l0L2.getClass();
        Context context = view2.getContext();
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        if (z) {
            string = context.getString(2131848902);
        } else {
            string = context.getString(2131848901);
        }
        tuxTextView.setText(string);
        tuxTextView.setTextColorRes(R.attr.a1h);
        tuxTextView.setTuxFont(102);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(C0HD5.LIZ(view2, 14));
        layoutParams.setMarginEnd(C0HD5.LIZ(view2, 14));
        layoutParams.topMargin = C0HD5.LIZ(view2, 14);
        layoutParams.bottomMargin = C0HD5.LIZ(view2, 14);
        C786410Ut5.R6(tuxTextView, layoutParams);
        C419910GdJ c419910GdJ = new C419910GdJ();
        if (z) {
            i = R.raw.icon_star_fill;
        } else {
            i = R.raw.icon_star;
        }
        c419910GdJ.LIZ = i;
        c419910GdJ.LJ = Integer.valueOf(R.attr.a1h);
        c419910GdJ.LIZJ = C0HD5.LIZ(view2, 20);
        c419910GdJ.LIZIZ = C0HD5.LIZ(view2, 20);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(context);
        tuxIconDrawableLIZ.setBounds(0, 0, tuxIconDrawableLIZ.LIZJ(), tuxIconDrawableLIZ.LIZIZ());
        if (!C426750GoL.LIZLLL(context)) {
            tuxTextView.setCompoundDrawables(tuxIconDrawableLIZ, null, null, null);
        } else {
            tuxTextView.setCompoundDrawables(null, null, tuxIconDrawableLIZ, null);
        }
        tuxTextView.setCompoundDrawablePadding(C0HD5.LIZ(view2, 8));
        C1391600mJi c1391600mJi2 = c1391550mJd.LLILLJJLI;
        c1391600mJi2.LJIIZILJ = tuxTextView;
        c1391600mJi2.LJII = -1001L;
        c1391550mJd.LJIIIZ(true, new ACListenerS39S0210000_6(this.LL, this.LLILLL, this.LLILZ, 0));
        c1391550mJd.LJ(new AwS124S0110000_6(this.LL, this.LLILLL, 2));
        c1391550mJd.LIZJ(new AwS585S0100000_6(this.LL, 382));
        c1341150l0L.LJJ = c1391550mJd.LIZIZ();
        C0P0T c0p0t = this.LL.LJJ;
        if (c0p0t != null) {
            c0p0t.show();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentImageComponent@3874.onStickerLongPress$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
