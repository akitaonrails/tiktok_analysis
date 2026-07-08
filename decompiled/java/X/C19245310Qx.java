package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.10Qx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19245310Qx extends C19245410Qy {
    public final boolean LLJI;

    @Override // X.C19245410Qy, X.C03AM
    public final RecyclerView.ViewHolder LLLI(ViewGroup viewGroup) {
        C1150504el.LIZ().LIZLLL("interest_fragment_create_dataholder", false);
        final View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.czk, viewGroup, false);
        C10R3 c10r3 = new C10R3(viewTd) { // from class: X.10R2
            public final SmartImageView LLILZIL;
            public final TuxTextView LLILZLL;
            public final ImageView LLIZ;

            @Override // X.C10R3
            public final void N5(NewUserInterestStruct newUserInterestStruct) {
                String str;
                this.LLILZLL.setTuxFont(102);
                this.LLILZLL.setText(newUserInterestStruct.text);
                this.itemView.setSelected(false);
                this.LLIZ.setSelected(false);
                if (this.LLIZLLLIL.LLJI && (str = newUserInterestStruct.cover_url) != null && str.length() != 0) {
                    C786410Ut5.LLFF(0, this.LLILZIL);
                    int i = this.LLILZIL.getLayoutParams().width;
                    String str2 = newUserInterestStruct.cover_url;
                    if (str2 == null) {
                        str2 = "";
                    }
                    C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                    c1331670kl3LJIIIZ.LJIIIIZZ = i;
                    c1331670kl3LJIIIZ.LJIIIZ = i;
                    c1331670kl3LJIIIZ.LIZLLL(this.itemView.getContext().getClass().getName());
                    c1331670kl3LJIIIZ.LJJ(this.LLILZIL);
                    c1331670kl3LJIIIZ.LJIIJ(new C19245910Rd(this.LLIZLLLIL.LLILZLL));
                    return;
                }
                C786410Ut5.LLFF(8, this.LLILZIL);
            }

            {
                super(this.LLIZLLLIL, viewTd);
                this.LLILZIL = (SmartImageView) viewTd.findViewById(R.id.gzv);
                this.LLILZLL = (TuxTextView) viewTd.findViewById(R.id.text);
                this.LLIZ = (ImageView) viewTd.findViewById(R.id.kwh);
            }

            @Override // X.C10R3
            public final void P5(String str, boolean z) {
                this.LLIZ.setSelected(z);
            }
        };
        C1150504el.LIZ().LJI("interest_fragment_create_dataholder", false);
        return c10r3;
    }

    @Override // X.C10R1, X.C03AM
    public final AbstractC1216180hkm LLLII(ViewGroup viewGroup) {
        String string;
        String string2;
        int iLIZIZ;
        C1150504el.LIZ().LIZLLL("interest_fragment_create_headholder", false);
        int i = C1911390zq5.LL;
        C19245810Rc c19245810Rc = this.LLILZIL;
        if (c19245810Rc == null || (string = c19245810Rc.LIZ) == null) {
            string = viewGroup.getContext().getString(2131838464);
        }
        C19245810Rc c19245810Rc2 = this.LLILZIL;
        if (c19245810Rc2 == null || (string2 = c19245810Rc2.LIZIZ) == null) {
            string2 = viewGroup.getContext().getString(2131838463);
        }
        C19233810Mm.LIZ.getClass();
        C1911390zq5 c1911390zq5LIZ = C1911380zq4.LIZ(viewGroup, string, string2, C19233810Mm.LIZ(C10HH.class).LIZLLL("text_alignment_style", "start"), ((C19233310Mh) C19233810Mm.LIZ(C19233310Mh.class)).LJFF());
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) c1911390zq5LIZ.itemView.getLayoutParams();
        if (C1911400zq6.LIZ(viewGroup.getContext())) {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(16.0f)));
        } else {
            iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(28.0f)));
        }
        marginLayoutParams.bottomMargin = iLIZIZ;
        C786410Ut5.W5(c1911390zq5LIZ.itemView, marginLayoutParams);
        C1150504el.LIZ().LJI("interest_fragment_create_headholder", false);
        return c1911390zq5LIZ;
    }

    @Override // X.C19245410Qy, X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (viewHolder instanceof C10R2) {
            ((C10R3) viewHolder).I5();
        }
    }

    public C19245310Qx(List list, AwS607S0100000_28 awS607S0100000_28, C19245810Rc c19245810Rc, C19246210Rg c19246210Rg, boolean z) {
        super(list, list, awS607S0100000_28, c19245810Rc, c19246210Rg, null);
        this.LLJI = z;
    }
}
