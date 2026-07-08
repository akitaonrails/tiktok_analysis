package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.StickerSetCategory;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0snb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1640770snb extends AbstractC1640400sn0<StickerSetCategory> {
    public final LifecycleOwner LJJIJIL;
    public final InterfaceC1640330smt<StickerSetCategory> LJJIJL;
    public final int LJJIJLIJ;
    public final InterfaceC1640870snl<Effect> LJJIL;

    @Override // X.AbstractC1640400sn0
    public final Function0<Integer> LJI() {
        return AFwS199S0000000_12.get$arr$(242);
    }

    @Override // X.AbstractC1640400sn0
    public final C0DXR LJJIIJ() {
        final int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(7.0f)));
        final int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(12.0f)));
        final int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(0.0f)));
        return new C0DXR(iLIZIZ, iLIZIZ2, iLIZIZ3) { // from class: X.0DX7
            public final int LL;
            public final int LLILLJJLI;
            public final int LLILLL;

            {
                this.LL = iLIZIZ;
                this.LLILLJJLI = iLIZIZ2;
                this.LLILLL = iLIZIZ3;
            }

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view, RecyclerView recyclerView, C21673919s1 c21673919s1) {
                int i;
                Object tag = view.getTag(R.id.kmv);
                if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                    rect.top = -this.LLILLJJLI;
                    return;
                }
                int childAdapterPosition = recyclerView.getChildAdapterPosition(view) % 3;
                int i2 = this.LLILLL;
                rect.top = i2;
                if (childAdapterPosition == 0) {
                    i = i2;
                } else {
                    i = this.LL / 2;
                }
                rect.left = i;
                if (childAdapterPosition != 2) {
                    i2 = this.LL / 2;
                }
                rect.right = i2;
                rect.bottom = this.LLILLJJLI;
            }
        };
    }

    @Override // X.AbstractC1640400sn0, X.InterfaceC1640870snl
    public final void vw() {
        super.vw();
        C1231520i9W.LIZLLL();
    }

    @Override // X.AbstractC1640400sn0
    public final LifecycleOwner LJIIIZ() {
        return this.LJJIJIL;
    }

    @Override // X.AbstractC1640400sn0
    public final int LJIIJ() {
        return this.LJJIJLIJ;
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView LJJIIZ(View view) {
        RecyclerView recyclerViewLJJIIZ = super.LJJIIZ(view);
        Float fValueOf = Float.valueOf(16.0f);
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf)));
        Float fValueOf2 = Float.valueOf(12.0f);
        C426750GoL.LJIIL(recyclerViewLJJIIZ, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(fValueOf2))), 16);
        return recyclerViewLJJIIZ;
    }

    @Override // X.AbstractC1640400sn0
    public final RecyclerView.ViewHolder LJFF(ViewGroup viewGroup, int i, AwS674S0100000_25 awS674S0100000_25) {
        return new C1640780snc(C786410Ut5.Td(C786410Ut5.ne(this.LIZ), R.layout.i_3, viewGroup, false), awS674S0100000_25);
    }

    @Override // X.AbstractC1640400sn0
    public final void LIZJ(RecyclerView.ViewHolder viewHolder, int i, StickerSetCategory stickerSetCategory, EnumC1641420soe enumC1641420soe, Integer num) {
        C1640780snc c1640780snc;
        StickerSetCategory stickerSetCategory2 = stickerSetCategory;
        if ((viewHolder instanceof C1640780snc) && (c1640780snc = (C1640780snc) viewHolder) != null) {
            c1640780snc.LL = stickerSetCategory2;
            c1640780snc.LLILLJJLI = enumC1641420soe;
            c1640780snc.LLILLL = i;
            TuxTextView tuxTextView = c1640780snc.LLILZLL;
            tuxTextView.setText(stickerSetCategory2.name);
            tuxTextView.setTextSize(12.0f);
            tuxTextView.setLetterSpacing(-0.036f);
            tuxTextView.setTypeface(null, 3);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c1640780snc.LLILZIL);
            sbLIZ.append("@@");
            sbLIZ.append(c1640780snc.LLILZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            List<String> list = stickerSetCategory2.set_icon_url;
            if (list != null && (!list.isEmpty())) {
                C1324800kZy c1324800kZy = c1640780snc.LLIZ;
                String str = (String) ListProtector.get(list, 0);
                int i2 = c1640780snc.LLJ;
                final String str2 = stickerSetCategory2.id;
                final String str3 = (String) ListProtector.get(list, 0);
                C1324750kZt.LJIIJJI(c1324800kZy, str, i2, i2, null, null, new AbstractC1636120sg6(str2, str3) { // from class: X.0sg8
                    public final String LIZIZ;
                    public final String LIZJ;

                    @Override // X.AbstractC1636120sg6
                    public final String LJIILIIL() {
                        return "set_sticker_cover";
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIJJI() {
                        return this.LIZJ;
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIL() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZIZ = str2;
                        this.LIZJ = str3;
                    }
                }, strLIZIZ);
                C1324800kZy c1324800kZy2 = c1640780snc.LLIZLLLIL;
                String str4 = (String) ListProtector.get(list, 1);
                int i3 = c1640780snc.LLJ;
                final String str5 = stickerSetCategory2.id;
                final String str6 = (String) ListProtector.get(list, 1);
                C1324750kZt.LJIIJJI(c1324800kZy2, str4, i3, i3, null, null, new AbstractC1636120sg6(str5, str6) { // from class: X.0sg8
                    public final String LIZIZ;
                    public final String LIZJ;

                    @Override // X.AbstractC1636120sg6
                    public final String LJIILIIL() {
                        return "set_sticker_cover";
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIJJI() {
                        return this.LIZJ;
                    }

                    @Override // X.AbstractC1636120sg6
                    public final String LJIIL() {
                        return this.LIZIZ;
                    }

                    {
                        this.LIZIZ = str5;
                        this.LIZJ = str6;
                    }
                }, strLIZIZ);
            }
            c1640780snc.itemView.setContentDescription(stickerSetCategory2.name);
        }
    }

    public C1640770snb(Context context, LifecycleOwner lifecycleOwner, InterfaceC1640330smt interfaceC1640330smt, InterfaceC1640420sn2 interfaceC1640420sn2, ViewGroup viewGroup, boolean z, Function1 function1, C1640580snI c1640580snI) {
        super(context, lifecycleOwner, interfaceC1640330smt, interfaceC1640420sn2, viewGroup, 3, false, true, true, z, function1);
        this.LJJIJIL = lifecycleOwner;
        this.LJJIJL = interfaceC1640330smt;
        this.LJJIJLIJ = 3;
        this.LJJIL = c1640580snI;
    }
}
