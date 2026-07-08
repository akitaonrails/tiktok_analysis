package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.services.EffectPrefetchPreloadConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.FixedStickerListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS11S0000001_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.AwS653S0100000_4;
import kotlin.jvm.internal.AwS674S0100000_25;

/* JADX INFO: renamed from: X.0sgw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1636640sgw extends C1636320sgQ {
    public final InterfaceC1631620sYq<Effect, Integer, Integer, Unit> LLJJJ;
    public final ShortVideoContext LLJJJIL;
    public final InterfaceC1631620sYq<Effect, Integer, Integer, Unit> LLJJJJ;

    public static void LLLLIILL(C1662850tND c1662850tND) {
        int iIntValue;
        TextView textView = c1662850tND.getTextView();
        if (textView != null) {
            textView.setMaxLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, textView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
            textView.setTextColor(iIntValue);
            textView.setGravity(1);
        }
    }

    @Override // X.AbstractC1636650sgx
    public final C1636260sgK<Effect> LLLILZ(ViewGroup viewGroup) {
        if (C1656550tD3.LIZ()) {
            return new C1631750sZ3(0, viewGroup);
        }
        return super.LLLILZ(viewGroup);
    }

    @Override // X.AbstractC1636650sgx
    public final C1636260sgK<Effect> LLLILZLLLI(ViewGroup viewGroup) {
        if (C1656550tD3.LIZ()) {
            return new C1631750sZ3(0, viewGroup);
        }
        return super.LLLILZLLLI(viewGroup);
    }

    @Override // X.C1636320sgQ
    /* JADX INFO: renamed from: LLLLII */
    public final void onViewDetachedFromWindow(C1636260sgK<Effect> c1636260sgK) {
        super.onViewDetachedFromWindow(c1636260sgK);
        EffectPrefetchPreloadConfig effectPrefetchPreloadConfig = EffectPrefetchPreloadConfig.INSTANCE;
        if ((effectPrefetchPreloadConfig.propPanelPreloadEnabled() || effectPrefetchPreloadConfig.propPanelPrefetchEnabled()) && c1636260sgK.getBindingAdapterPosition() >= 0 && c1636260sgK.getBindingAdapterPosition() < ((ArrayList) this.LLILZ).size()) {
            Effect effect = (Effect) C13LP.LJJJLZIJ(c1636260sgK.getBindingAdapterPosition(), this.LLILZ);
            if (effect != null) {
                this.LLIZ.LIZLLL(effect, false);
            }
        }
    }

    @Override // X.C1636320sgQ
    public final void LLLLIIIILLL(C1636690sh1 c1636690sh1) {
        if (C339670DTh.LIZ()) {
            c1636690sh1.LIZIZ(AFwS189S0000000_3.get$arr$(1382), new AwS604S0100000_25(this, 746), new AwS604S0100000_25(this, 747));
        } else {
            c1636690sh1.LIZ(new AwS604S0100000_25(this, 750), new AwS604S0100000_25(this, 751));
        }
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 752), new AwS604S0100000_25(this, 753));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 754), new AwS604S0100000_25(this, 755));
        c1636690sh1.LIZ(new AwS604S0100000_25(this, 743), new AwS604S0100000_25(this, 744));
    }

    public final Pair<FrameLayout, C1662850tND> LLLLIIL(ViewGroup viewGroup) {
        C443120HZe c443120HZe;
        boolean zLIZ = C339670DTh.LIZ();
        Float fValueOf = Float.valueOf(8.0f);
        if (zLIZ) {
            c443120HZe = new C443120HZe(Float.valueOf(100.0f), Float.valueOf(140.0f), fValueOf);
        } else {
            c443120HZe = new C443120HZe(Float.valueOf(54.0f), Float.valueOf(76.0f), fValueOf);
        }
        float fFloatValue = ((Number) c443120HZe.getFirst()).floatValue();
        float fFloatValue2 = ((Number) c443120HZe.getSecond()).floatValue();
        return C1641090so7.LIZ(this.LLJ.LJII, viewGroup.getContext(), fFloatValue, fFloatValue2, -2.0f, -2.0f, (int) fFloatValue, (int) fFloatValue2, C339670DTh.LIZ(), new AwS11S0000001_25(((Number) c443120HZe.getThird()).floatValue(), 5), 2656);
    }

    public final C1636160sgA LLLLIILLL(ViewGroup viewGroup) {
        if (C1656550tD3.LIZ()) {
            Pair<FrameLayout, C1662850tND> pairLLLLIIL = LLLLIIL(viewGroup);
            C1636710sh3 c1636710sh3 = new C1636710sh3(pairLLLLIIL.getFirst(), pairLLLLIIL.getSecond(), this.LLIZ, this.LLIZLLLIL, this.LL, this.LLJJJIL, this.LLJJJJ);
            c1636710sh3.LLIZLLLIL = this.LLJI;
            return c1636710sh3;
        }
        Pair pairLIZ = C1641090so7.LIZ(this.LLJ.LJII, viewGroup.getContext(), 60.0f, 60.0f, -2.0f, -2.0f, 0, 0, false, AFwS266S0000000_25.get$arr$(517), 4064);
        View view = (View) pairLIZ.getFirst();
        C1662850tND c1662850tND = (C1662850tND) pairLIZ.getSecond();
        LLLLIILL(c1662850tND);
        C1636680sh0 c1636680sh0 = new C1636680sh0(view, c1662850tND, this.LLIZ, this.LLIZLLLIL, this.LL, this.LLJJJIL, this.LLJJJJ);
        c1636680sh0.LLIZLLLIL = this.LLJI;
        return c1636680sh0;
    }

    public final void LLLLIL(int i) {
        int i2 = i - 1;
        if (this.LLILZ.size() <= i2) {
            return;
        }
        ListProtector.remove(this.LLILZ, i2);
        notifyItemRemoved(i);
    }

    @Override // X.C1636320sgQ, X.AbstractC1636650sgx, X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.C1636320sgQ, X.AbstractC21673619ry
    public final /* bridge */ /* synthetic */ void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        onViewDetachedFromWindow((C1636260sgK) viewHolder);
    }

    public C1636640sgw(InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1635560sfC interfaceC1635560sfC, FixedStickerListViewModel fixedStickerListViewModel, C1636520sgk c1636520sgk, InterfaceC1625970sPj interfaceC1625970sPj, InterfaceC1636390sgX interfaceC1636390sgX, C1631250sYF c1631250sYF, EffectCategoryModel effectCategoryModel, int i, AwS653S0100000_4 awS653S0100000_4, ShortVideoContext shortVideoContext, AwS674S0100000_25 awS674S0100000_25) {
        super(interfaceC1624480sNK, interfaceC1635560sfC, fixedStickerListViewModel, c1636520sgk, interfaceC1625970sPj, interfaceC1636390sgX, c1631250sYF, effectCategoryModel, i, 512);
        this.LLJJJ = awS653S0100000_4;
        this.LLJJJIL = shortVideoContext;
        this.LLJJJJ = awS674S0100000_25;
    }
}
