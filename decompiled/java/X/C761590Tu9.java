package X;

import Y.ACListenerS22S0200100_12;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS98S0201000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tu9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C761590Tu9 extends C761610TuB {
    public long LLIZLLLIL;
    public final ArrayList<Long> LLJ;
    public boolean LLJI;

    @Override // X.C761610TuB
    public final void LLLLLLIL(C761630TuD c761630TuD) {
        if (!this.LLJI) {
            C500260Jjc.LLFFF(c761630TuD.LLILLJJLI);
            C500260Jjc.LJIILLIIL(c761630TuD.LLILLL);
        }
    }

    @Override // X.C761610TuB
    public final void LLLLLLL(C761630TuD c761630TuD) {
        if (!this.LLJI) {
            C500260Jjc.LJIILLIIL(c761630TuD.LLILLJJLI);
            C500260Jjc.LLFFF(c761630TuD.LLILLL);
            C20515815Po c20515815Po = c761630TuD.LLILLL;
            if (c20515815Po != null) {
                c20515815Po.setProgress(90);
            }
        }
    }

    @Override // X.C761610TuB
    public final void LLLLLLLLL(C761630TuD c761630TuD) {
        if (!this.LLJI) {
            C500260Jjc.LJIILLIIL(c761630TuD.LLILLJJLI);
            C500260Jjc.LJIILLIIL(c761630TuD.LLILLL);
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LLLLZI(boolean z) {
        if (z != this.LLJI) {
            this.LLJI = z;
            if (z) {
                this.LLJ.clear();
                ArrayList<Long> arrayList = this.LLJ;
                List<Effect> list = this.LL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Long.valueOf(((SoundEffect) it2.next()).id));
                }
                arrayList.addAll(arrayList2);
            }
            notifyItemRangeChanged(0, getItemCount(), "item_edit_changed");
        }
    }

    @Override // X.C761610TuB
    public final void LLLLLLLLLL(C761630TuD c761630TuD, SoundEffect soundEffect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onbindselect: ");
        sbLIZ.append(soundEffect.name);
        C20441214yg.LIZIZ("sfx-live", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJI) {
            C500260Jjc.LLFFF(c761630TuD.LLILZIL);
            TextView textView = c761630TuD.LLILZ;
            if (textView != null) {
                textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            }
            TextView textView2 = c761630TuD.LLILZ;
            if (textView2 != null) {
                textView2.setSelected(true);
            }
        }
    }

    @Override // X.C761610TuB
    public final void LLLLLLLZIL(C761630TuD c761630TuD, SoundEffect soundEffect) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onbindunselect: ");
        sbLIZ.append(soundEffect.name);
        C20441214yg.LIZIZ("sfx-live", C2188811AlT.LIZIZ(sbLIZ));
        C500260Jjc.LJIILLIIL(c761630TuD.LLILZIL);
        TextView textView = c761630TuD.LLILZ;
        if (textView != null) {
            textView.setEllipsize(null);
        }
        TextView textView2 = c761630TuD.LLILZ;
        if (textView2 != null) {
            textView2.setSelected(false);
        }
    }

    @Override // X.C761610TuB
    public final C761630TuD LLLLLLZZ(int i, ViewGroup viewGroup) {
        return new C761600TuA(this.LLILZLL, viewGroup);
    }

    public final void LLLLZ(C761630TuD c761630TuD, SoundEffect soundEffect) {
        C761600TuA c761600TuA;
        if ((c761630TuD instanceof C761600TuA) && (c761600TuA = (C761600TuA) c761630TuD) != null) {
            if (this.LLJI) {
                C500260Jjc.LLFFF(c761600TuA.LLILZLL);
                C500260Jjc.LJIILLIIL(c761600TuA.LLILLJJLI);
                C500260Jjc.LJIILLIIL(c761600TuA.LLILLL);
                C500260Jjc.LJIILLIIL(c761600TuA.LLILZIL);
                TextView textView = c761600TuA.LLILZ;
                if (textView != null) {
                    textView.setSelected(false);
                    return;
                }
                return;
            }
            C500260Jjc.LJIILLIIL(c761600TuA.LLILZLL);
            SoundEffectViewModel soundEffectViewModel = this.LLILZIL;
            if (soundEffectViewModel != null) {
                soundEffectViewModel.LLILZIL.getClass();
                if (C761740TuO.LJIILLIIL(soundEffect)) {
                    C500260Jjc.LJIILLIIL(c761600TuA.LLILLJJLI);
                    C500260Jjc.LJIILLIIL(c761600TuA.LLILLL);
                    return;
                } else if (soundEffectViewModel.LLILZIL.LIZ.contains(soundEffect)) {
                    C500260Jjc.LJIILLIIL(c761600TuA.LLILLJJLI);
                    C500260Jjc.LLFFF(c761600TuA.LLILLL);
                    return;
                } else {
                    C500260Jjc.LLFFF(c761600TuA.LLILLJJLI);
                    C500260Jjc.LJIILLIIL(c761600TuA.LLILLL);
                    return;
                }
            }
            C500260Jjc.LJIILLIIL(c761600TuA.LLILLJJLI);
            C500260Jjc.LJIILLIIL(c761600TuA.LLILLL);
        }
    }

    @Override // X.C761610TuB, X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C761600TuA c761600TuA = new C761600TuA(this.LLILZLL, viewGroup);
        try {
            View view = c761600TuA.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c761600TuA.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c761600TuA.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C761600TuA.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c761600TuA.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c761600TuA.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C761600TuA.class.getName();
        return c761600TuA;
    }

    public C761590Tu9(DataChannel dataChannel, LifecycleOwner lifecycleOwner, SoundEffectViewModel soundEffectViewModel) {
        super(dataChannel, false, lifecycleOwner, soundEffectViewModel, R.layout.gex);
        this.LLIZLLLIL = -1L;
        this.LLJ = new ArrayList<>();
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLIL((C761630TuD) viewHolder);
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLII(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLL((C761630TuD) viewHolder);
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLIIIILLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLL((C761630TuD) viewHolder);
    }

    @Override // X.AbstractC761920Tug
    public final void LLLLIILL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLZ((C761630TuD) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLLLL((C761630TuD) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLJIL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLLLZIL((C761630TuD) viewHolder, (SoundEffect) obj);
    }

    @Override // X.C761610TuB, X.AbstractC761920Tug
    public final /* bridge */ /* synthetic */ void LLLLLL(int i, RecyclerView.ViewHolder viewHolder, Object obj) {
        LLLLLL((C761630TuD) viewHolder, (SoundEffect) obj, i);
    }

    @Override // X.C761610TuB
    /* JADX INFO: renamed from: LLLLLLZ */
    public final void LLLLLL(C761630TuD c761630TuD, SoundEffect soundEffect, int i) {
        View view;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        C761600TuA c761600TuA;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBindViewHolder: ");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("BaseAnimator", C2188811AlT.LIZIZ(sbLIZ));
        C1819620xS4.LIZ().LJIIIZ(soundEffect.iconUrl).LJJI(c761630TuD.itemView.findViewById(R.id.lkw));
        TextView textView = c761630TuD.LLILZ;
        if (textView != null) {
            textView.setText(soundEffect.name);
        }
        C786410Ut5.I7(new ACListenerS22S0200100_12(this, new AwS98S0201000_12(this, soundEffect, i, 5), 1), c761630TuD.itemView);
        if (this.LLJI) {
            LLLLZ(c761630TuD, soundEffect);
            return;
        }
        Boolean boolValueOf3 = null;
        if ((c761630TuD instanceof C761600TuA) && (c761600TuA = (C761600TuA) c761630TuD) != null) {
            view = c761600TuA.LLILZLL;
        } else {
            view = null;
        }
        C500260Jjc.LJIILLIIL(view);
        SoundEffectViewModel soundEffectViewModel = this.LLILZIL;
        if (soundEffectViewModel != null) {
            soundEffectViewModel.LLILZIL.getClass();
            boolValueOf = Boolean.valueOf(C761740TuO.LJIILLIIL(soundEffect));
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            LLLLLLLLL(c761630TuD);
        } else {
            SoundEffectViewModel soundEffectViewModel2 = this.LLILZIL;
            if (soundEffectViewModel2 != null) {
                boolValueOf2 = Boolean.valueOf(soundEffectViewModel2.LLILZIL.LIZ.contains(soundEffect));
            } else {
                boolValueOf2 = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf2)) {
                LLLLLLL(c761630TuD);
            } else {
                LLLLLLIL(c761630TuD);
            }
        }
        SoundEffectViewModel soundEffectViewModel3 = this.LLILZIL;
        if (soundEffectViewModel3 != null) {
            boolValueOf3 = Boolean.valueOf(Intrinsics.LJFF(soundEffectViewModel3.LLILZ.LIZJ, soundEffect));
        }
        if (C500260Jjc.LJJJI(boolValueOf3)) {
            LLLLLLLLLL(c761630TuD, soundEffect);
        } else {
            LLLLLLLZIL(c761630TuD, soundEffect);
        }
    }

    @Override // X.C761610TuB
    public final void LLLLLZ(View view, SoundEffect soundEffect, int i) {
        int iIndexOf = ((ArrayList) this.LL).indexOf(soundEffect);
        if (this.LLJI) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onItemClicked: ");
            sbLIZ.append(i);
            C20441214yg.LIZIZ("BaseAnimator", C2188811AlT.LIZIZ(sbLIZ));
            C761680TuI.LIZ(this.LLILLJJLI, EnumC761690TuJ.TOP, soundEffect.id);
            if (iIndexOf != -1) {
                ListProtector.add(this.LL, 0, ListProtector.remove(this.LL, iIndexOf));
                notifyItemMoved(iIndexOf, 0);
                return;
            }
            return;
        }
        super.LLLLLZ(view, soundEffect, iIndexOf);
    }
}
