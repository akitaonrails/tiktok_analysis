package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0sjw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public class C1638500sjw extends C0NC4<EffectCategoryResponse, Effect> {
    public C1638500sjw(C19YA c19ya) {
        super(c19ya);
    }

    @Override // X.C0NC4
    public void LJI(View view) {
        C1091360eVS c1091360eVS;
        if ((view instanceof C1091360eVS) && (c1091360eVS = (C1091360eVS) view) != null) {
            c1091360eVS.getContentView().setBackground(c1091360eVS.getContext().getResources().getDrawable(R.drawable.aom));
            C786410Ut5.H5(c1091360eVS.getIconImgView(), 1.0f);
            c1091360eVS.getTextView().setTextColor(c1091360eVS.getContext().getResources().getColor(R.color.ab0));
        }
    }

    @Override // X.C0NC4
    public void LJIIIIZZ(View view, int i) {
        C1091360eVS c1091360eVS;
        if ((view instanceof C1091360eVS) && (c1091360eVS = (C1091360eVS) view) != null) {
            c1091360eVS.getContentView().setBackground(null);
            C786410Ut5.H5(c1091360eVS.getIconImgView(), 0.5f);
            c1091360eVS.getTextView().setTextColor(c1091360eVS.getContext().getResources().getColor(R.color.ab1));
        }
    }

    @Override // X.C0NC4
    /* JADX INFO: renamed from: LJIIJ, reason: merged with bridge method [inline-methods] */
    public C1091360eVS LJFF(Context context, EffectCategoryResponse effectCategoryResponse) {
        C1091360eVS c1091360eVS = new C1091360eVS(context);
        c1091360eVS.getTextView().setText(effectCategoryResponse.getName());
        String icon_selected_url = effectCategoryResponse.getIcon_selected_url();
        if (icon_selected_url != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sticker_tab_panel");
            sbLIZ.append("@@");
            sbLIZ.append("creation");
            C1324750kZt.LJIIJJI(c1091360eVS.getIconImgView(), icon_selected_url, -1, -1, null, null, null, C2188811AlT.LIZIZ(sbLIZ));
        }
        C786410Ut5.H5(c1091360eVS.getIconImgView(), 0.5f);
        return c1091360eVS;
    }

    public void LJIIIZ(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        float fLIZIZ;
        float fLIZIZ2;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            if (i == 0) {
                fLIZIZ = C11VU.LIZIZ(12.0f, view.getContext());
            } else {
                fLIZIZ = C11VU.LIZIZ(5.0f, view.getContext());
            }
            int i3 = (int) fLIZIZ;
            if (i == i2 - 1) {
                fLIZIZ2 = C11VU.LIZIZ(12.0f, view.getContext());
            } else {
                fLIZIZ2 = C11VU.LIZIZ(5.0f, view.getContext());
            }
            int i4 = (int) fLIZIZ2;
            marginLayoutParams.setMarginStart(i3);
            marginLayoutParams.setMarginEnd(i4);
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i4;
            C786410Ut5.W5(view, marginLayoutParams);
            view.invalidate();
        }
    }

    @Override // X.C0NC4
    public /* bridge */ /* synthetic */ void LJ(int i, int i2, View view, Object obj) {
        LJIIIZ(view, i, i2);
    }
}
