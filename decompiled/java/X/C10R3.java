package X;

import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.plugin.journey.NewUserInterestStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import wh6.AbS513S0200000_28;

/* JADX INFO: renamed from: X.10R3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public class C10R3 extends RecyclerView.ViewHolder {
    public final C21592319er LL;
    public final C21592319er LLILLJJLI;
    public final int LLILLL;
    public final /* synthetic */ C19245410Qy LLILZ;

    public final int L5() {
        this.LLILZ.getClass();
        return getBindingAdapterPosition() - 1;
    }

    public final void I5() {
        NewUserInterestStruct newUserInterestStruct = (NewUserInterestStruct) ListProtector.get(this.LLILZ.LLILLL, L5());
        N5(newUserInterestStruct);
        P5(null, this.LLILZ.LLLIL(newUserInterestStruct));
    }

    public void N5(NewUserInterestStruct newUserInterestStruct) {
        ((TextView) this.itemView.findViewById(R.id.text)).setText(newUserInterestStruct.text);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10R3(C19245410Qy c19245410Qy, View view) {
        int iIntValue;
        super(view);
        this.LLILZ = c19245410Qy;
        Context context = view.getContext();
        C21592419es c21592419es = new C21592419es(C12ES.LIZJ(8.0f, context), BlurMaskFilter.Blur.NORMAL, C12ES.LIZJ(2.0f, context), ColorProtector.parseColor("#1f000000"), C12ES.LIZJ(24.0f, context));
        C21592319er c21592319er = new C21592319er(view.getResources().getColor(R.color.ao), c21592419es);
        this.LL = c21592319er;
        this.LLILLJJLI = new C21592319er(view.getResources().getColor(R.color.ct), c21592419es);
        this.LLILLL = (int) C12ES.LIZJ(28.0f, view.getContext());
        C786410Ut5.I7(new AbS513S0200000_28(this, c19245410Qy, 0), this.itemView);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ng, view.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16777216;
        }
        if (c21592319er.LIZIZ != iIntValue) {
            c21592319er.LIZIZ = iIntValue;
            ((Paint) c21592319er.LJFF.getValue()).setColor(iIntValue);
            c21592319er.invalidateSelf();
        }
        view.setLayerType(1, null);
    }

    public void P5(String str, boolean z) {
        this.itemView.findViewById(R.id.kwr).setSelected(z);
        if (this.LLILZ.LLJ) {
            C786410Ut5.LLFF(0, (SmartImageView) this.itemView.findViewById(R.id.kwr).findViewById(R.id.kfu));
        } else {
            C786410Ut5.LLFF(8, (SmartImageView) this.itemView.findViewById(R.id.kwr).findViewById(R.id.kfu));
            C426750GoL.LJIIIZ(this.itemView.findViewById(R.id.kwr).findViewById(R.id.text), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.5d)))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(22.5d)))), false, 16);
        }
        if (z) {
            this.itemView.findViewById(R.id.kwr).setBackground(this.LLILLJJLI);
            ((TextView) this.itemView.findViewById(R.id.kwr).findViewById(R.id.text)).setTextColor(this.itemView.getResources().getColor(R.color.f569bc));
            if (this.LLILZ.LLJ) {
                ((C1322110kVd) this.itemView.findViewById(R.id.kwr).findViewById(R.id.kfu)).setActualImageResource(R.drawable.bxn);
            }
            if (str != null) {
                this.LLILZ.getClass();
                C10R1.LLLIILIL("click", str);
                return;
            }
            return;
        }
        this.itemView.findViewById(R.id.kwr).setBackground(this.LL);
        ((TextView) this.itemView.findViewById(R.id.kwr).findViewById(R.id.text)).setTextColor(this.itemView.getContext().getResources().getColor(R.color.da));
        C19245410Qy c19245410Qy = this.LLILZ;
        if (c19245410Qy.LLJ) {
            String str2 = ((NewUserInterestStruct) ListProtector.get(c19245410Qy.LLILLL, L5())).cover_url;
            if (str2 == null) {
                str2 = "";
            }
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            int i = this.LLILLL;
            c1331670kl3LJIIIZ.LJIIIIZZ = i;
            c1331670kl3LJIIIZ.LJIIIZ = i;
            c1331670kl3LJIIIZ.LIZLLL(this.itemView.getContext().getClass().getName());
            c1331670kl3LJIIIZ.LJJ((InterfaceC1334290kpH) this.itemView.findViewById(R.id.kwr).findViewById(R.id.kfu));
            c1331670kl3LJIIIZ.LJIIJ(new C19245910Rd(this.LLILZ.LLILZLL));
        } else {
            C786410Ut5.LLFF(8, (SmartImageView) this.itemView.findViewById(R.id.kwr).findViewById(R.id.kfu));
        }
        if (str == null) {
            return;
        }
        C19245410Qy c19245410Qy2 = this.LLILZ;
        c19245410Qy2.getClass();
        C10R1.LLLIILIL("cancel", str);
        ((ArrayList) c19245410Qy2.LLIZLLLIL).add(str);
    }
}
