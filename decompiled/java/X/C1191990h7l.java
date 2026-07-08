package X;

import Y.ACListenerS121S0200000_18;
import android.content.Context;
import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0h7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191990h7l implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function1<Boolean, Unit> LIZIZ;
    public final Function1<Boolean, Unit> LIZJ;
    public final C1192000h7m LIZLLL;
    public InterfaceC1191840h7W LJ;
    public TuxTextView LJFF;
    public TuxIconView LJI;
    public View LJII;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        this.LJ = interfaceC1191840h7W;
        View view = interfaceC1191840h7W.LLLLLLIL().itemView;
        this.LJFF = (TuxTextView) view.findViewById(R.id.yil);
        this.LJII = view.findViewById(R.id.ujd);
        this.LJI = (TuxIconView) view.findViewById(R.id.k4x);
        interfaceC1191840h7W.y5(this.LJII, "translate.areaSeeOriginal");
        TuxTextView tuxTextView = this.LJFF;
        if (tuxTextView != null) {
            tuxTextView.setText(2131846662);
        }
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        Context context;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        int i;
        String str;
        if (this.LIZLLL.LIZIZ && list.isEmpty()) {
            C339190DRl.LIZIZ(this.LJII);
            TuxTextView tuxTextView = this.LJFF;
            if (tuxTextView != null) {
                tuxTextView.setText("");
            }
        }
        CharSequence text = null;
        if (C1EDK.LIZIZ()) {
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null) {
                str = content.translatedContent;
            } else {
                str = null;
            }
            if (C123100dR.LIZ(str)) {
                C339190DRl.LIZLLL(this.LJII);
                InterfaceC1191710h7J interfaceC1191710h7JInvoke = this.LIZ.invoke();
                if (interfaceC1191710h7JInvoke != null) {
                    interfaceC1191710h7JInvoke.Ez1(poiReviewModel, !poiReviewModel.getWantTranslate());
                }
                InterfaceC1191840h7W interfaceC1191840h7W = this.LJ;
                if (interfaceC1191840h7W != null) {
                    interfaceC1191840h7W.y5(Boolean.TRUE, "translate.hasBeenTranslate");
                }
            } else {
                C339190DRl.LIZIZ(this.LJII);
            }
        }
        View view2 = this.LJII;
        if (view2 != null) {
            C786410Ut5.I7(new ACListenerS121S0200000_18(poiReviewModel, this, 59), view2);
        }
        TuxIconView tuxIconView = this.LJI;
        if (tuxIconView != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            if (poiReviewModel.getWantTranslate()) {
                i = R.raw.icon_languages_tick;
            } else {
                i = R.raw.icon_languages;
            }
            c419910GdJ.LIZ = i;
            c419910GdJ.LJ = Integer.valueOf(R.attr.a1j);
            tuxIconView.setTuxIcon(c419910GdJ);
        }
        InterfaceC1191840h7W interfaceC1191840h7W2 = this.LJ;
        if (interfaceC1191840h7W2 != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W2.LLLLLLIL()) != null && (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        TuxTextView tuxTextView2 = this.LJFF;
        if (tuxTextView2 != null) {
            if (poiReviewModel.getWantTranslate()) {
                if (context != null) {
                    text = context.getText(2131846662);
                }
            } else if (context != null) {
                text = context.getText(2131846663);
            }
            tuxTextView2.setText(text);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191990h7l(Function0<? extends InterfaceC1191710h7J> function0, Function1<? super Boolean, Unit> function1, Function1<? super Boolean, Unit> function12, C1192000h7m c1192000h7m) {
        this.LIZ = function0;
        this.LIZIZ = function1;
        this.LIZJ = function12;
        this.LIZLLL = c1192000h7m;
    }
}
