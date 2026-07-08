package X;

import Y.ACListenerS153S0100000_18;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import com.ss.android.ugc.aweme.poi.reviews.refactorv1.cell.AbstractRefactorPoiReviewCell;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0h7E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191660h7E implements InterfaceC1192080h7u {
    public final Function0<InterfaceC1191710h7J> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final C1191730h7L LIZLLL;
    public InterfaceC1191840h7W LJ;
    public C1202300hOO LJFF;

    @Override // X.InterfaceC1192080h7u
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1192080h7u
    public final void onResume(boolean z) {
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZIZ(InterfaceC1191840h7W interfaceC1191840h7W) {
        InterfaceC1191840h7W interfaceC1191840h7W2;
        AbstractRefactorPoiReviewCell abstractRefactorPoiReviewCellLLLLLLIL;
        View view;
        Context context;
        C1202300hOO c1202300hOO;
        C19ME c19me;
        C1202300hOO c1202300hOO2;
        this.LJ = interfaceC1191840h7W;
        C1202300hOO c1202300hOO3 = (C1202300hOO) interfaceC1191840h7W.LLLLLLIL().itemView.findViewById(R.id.text);
        this.LJFF = c1202300hOO3;
        interfaceC1191840h7W.y5(c1202300hOO3, "expandableText.tvContent");
        if (C1209504oH.LIZ() && (c1202300hOO2 = this.LJFF) != null) {
            c1202300hOO2.setLineSpacing(C418440Gaw.LIZIZ(4), 1.0f);
        }
        if (C297470BlJ.LIZ() && this.LIZLLL.LJFF && (interfaceC1191840h7W2 = this.LJ) != null && (abstractRefactorPoiReviewCellLLLLLLIL = interfaceC1191840h7W2.LLLLLLIL()) != null && (view = abstractRefactorPoiReviewCellLLLLLLIL.itemView) != null && (context = view.getContext()) != null && (c1202300hOO = this.LJFF) != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1j, context);
            if (numLIZJ != null) {
                int iIntValue = numLIZJ.intValue();
                c1202300hOO.setExpandActionColor(iIntValue);
                c1202300hOO.setCollapseActionColor(iIntValue);
                c1202300hOO.setExpandActionSize(41);
                c1202300hOO.setCollapseActionSize(41);
            }
            ViewGroup.LayoutParams layoutParams = c1202300hOO.getLayoutParams();
            if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                ((ViewGroup.MarginLayoutParams) c19me).width = 0;
                c19me.startToStart = R.id.ji7;
                c19me.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
                ((ViewGroup.MarginLayoutParams) c19me).topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                C786410Ut5.k7(c1202300hOO, c19me);
            }
        }
        C1202300hOO c1202300hOO4 = this.LJFF;
        if (c1202300hOO4 != null) {
            C786410Ut5.ja(c1202300hOO4, new ACListenerS153S0100000_18(this, 178));
        }
        C1202300hOO c1202300hOO5 = this.LJFF;
        if (c1202300hOO5 != null) {
            c1202300hOO5.setOnLongClickListener(new ViewOnLongClickListenerC1208780hYq(this, 29));
        }
    }

    @Override // X.InterfaceC1192080h7u
    public final void LIZJ(PoiReviewsApi.PoiReviewModel poiReviewModel, List<? extends Object> list) {
        String str;
        String str2;
        Object objLJJJLL = C13LP.LJJJLL(list);
        if (objLJJJLL != null && !(objLJJJLL instanceof C1190010h4Z) && !(objLJJJLL instanceof C00I5)) {
            return;
        }
        int i = 8;
        String str3 = "";
        if (list.isEmpty() && this.LIZLLL.LIZJ) {
            C1202300hOO c1202300hOO = this.LJFF;
            if (c1202300hOO != null) {
                C786410Ut5.n0(c1202300hOO, 8);
            }
            C1202300hOO c1202300hOO2 = this.LJFF;
            if (c1202300hOO2 != null) {
                c1202300hOO2.setText("");
            }
        }
        C1202300hOO c1202300hOO3 = this.LJFF;
        if (c1202300hOO3 != null) {
            PoiReviewsApi.PoiReviewContentModel content = poiReviewModel.getContent();
            if (content != null && (str2 = content.text) != null && str2.length() != 0) {
                i = 0;
            }
            C786410Ut5.n0(c1202300hOO3, i);
            if (poiReviewModel.getWantTranslate() && C123100dR.LIZ(poiReviewModel.getTranslatedContent())) {
                String translatedContent = poiReviewModel.getTranslatedContent();
                if (translatedContent != null) {
                    str3 = translatedContent;
                }
            } else {
                PoiReviewsApi.PoiReviewContentModel content2 = poiReviewModel.getContent();
                if (content2 != null && (str = content2.text) != null) {
                    str3 = str;
                }
            }
            c1202300hOO3.setOriginalText(str3);
            c1202300hOO3.setExpanded$poi_release(poiReviewModel.getExpanded());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1191660h7E(Function0<? extends InterfaceC1191710h7J> function0, Function0<Boolean> function02, Function0<Unit> function03, C1191730h7L c1191730h7L) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = function03;
        this.LIZLLL = c1191730h7L;
    }
}
