package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.audioeffect.AudioEffectParam;
import com.ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.119J, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C119J extends AbstractC21673619ry<RecyclerView.ViewHolder> implements InterfaceC19351810nM {
    public final AbstractC214814194y LL;
    public final InterfaceC1452170ntP LLILLJJLI;
    public final VideoPublishEditModel LLILLL;
    public final AudioEffectParam LLILZ;
    public final InterfaceC1455860nzM LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public CategoryPageModel LLIZLLLIL;
    public List<? extends Effect> LLJ;
    public RecyclerView LLJI;
    public final C119M LLJIJIL = new C119M(this);
    public C119Y LLJILJIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        CategoryEffectModel categoryEffects;
        List<Effect> effects;
        CategoryPageModel categoryPageModel = this.LLIZLLLIL;
        return ((categoryPageModel == null || (categoryEffects = categoryPageModel.getCategoryEffects()) == null || (effects = categoryEffects.getEffects()) == null) ? 0 : effects.size()) + 1;
    }

    public final void LLLII(int i) {
        boolean z;
        C19470511Fn c19470511Fn;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        int itemCount = getItemCount();
        int i2 = this.LLIZ;
        if (i2 >= 0 && i2 < itemCount) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = null;
        if (z) {
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C19351610nK) {
                C19470511Fn c19470511Fn2 = ((C19351610nK) viewHolderFindViewHolderForAdapterPosition).LLILZ;
                if (c19470511Fn2 != null) {
                    c19470511Fn2.LJFF(false);
                }
            } else {
                notifyItemChanged(this.LLIZ);
            }
        }
        this.LLIZ = i;
        if (i < getItemCount()) {
            RecyclerView recyclerView2 = this.LLJI;
            if (recyclerView2 != null) {
                viewHolderFindViewHolderForAdapterPosition2 = recyclerView2.findViewHolderForAdapterPosition(this.LLIZ);
            }
            if ((viewHolderFindViewHolderForAdapterPosition2 instanceof C19351610nK) && (c19470511Fn = ((C19351610nK) viewHolderFindViewHolderForAdapterPosition2).LLILZ) != null) {
                c19470511Fn.LJFF(true);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLJI = recyclerView;
    }

    @Override // X.InterfaceC19351810nM
    public final void LIZ(int i, View view) {
        C119M c119m = this.LLJIJIL;
        if (c119m != null) {
            c119m.LIZ(i, view);
        }
    }

    public final void LLLI(int i, int i2) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        if (i >= 0 && i < getItemCount()) {
            RecyclerView recyclerView = this.LLJI;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i);
            } else {
                viewHolderFindViewHolderForAdapterPosition = null;
            }
            if (viewHolderFindViewHolderForAdapterPosition instanceof C19351610nK) {
                ((C19351610nK) viewHolderFindViewHolderForAdapterPosition).L5(i2);
            } else {
                notifyItemChanged(i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00c2  */
    @Override // X.AbstractC21673619ry
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119J.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19351610nK c19351610nK = new C19351610nK((FrameLayout) C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ue, viewGroup, false), this);
        try {
            View view = c19351610nK.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c19351610nK.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c19351610nK.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C19351610nK.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c19351610nK.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c19351610nK.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C19351610nK.class.getName();
        return c19351610nK;
    }

    public final void LLLFZ(Effect effect, String str, String str2, String str3) {
        String str4 = str2;
        if (this.LLILLJJLI != null && str3 != null && str3.length() > 0) {
            if (str4 == null) {
                str4 = "";
            }
            int duration = this.LLILLJJLI.getDuration();
            C2296208zA.LIZ().getClass();
            final AudioEffectParam audioEffectParam = new AudioEffectParam(str, 0, 0, str3, str4, 0, duration, C2299808zk.LJFF.getValue().LIZ.LIZJ(str3), null, new ArrayList());
            audioEffectParam.setShowErrorToast(true);
            this.LLILZIL.tH1(C364410EQl.LIZ(true, audioEffectParam));
            C1446160nji.LIZLLL(this.LLILLL);
            new C1645820svk(C1624570sNT.LIZ(effect), this.LL).LIZ(new InterfaceC1645830svl() { // from class: X.0o86
                @Override // X.InterfaceC1645830svl
                public final void LIZ(AVChallenge aVChallenge) {
                    audioEffectParam.setChallenge(aVChallenge);
                }
            });
        }
    }

    public C119J(AbstractC214814194y abstractC214814194y, InterfaceC1452170ntP interfaceC1452170ntP, VideoPublishEditModel videoPublishEditModel, AudioEffectParam audioEffectParam, InterfaceC1455860nzM interfaceC1455860nzM) {
        this.LL = abstractC214814194y;
        this.LLILLJJLI = interfaceC1452170ntP;
        this.LLILLL = videoPublishEditModel;
        this.LLILZ = audioEffectParam;
        this.LLILZIL = interfaceC1455860nzM;
    }
}
