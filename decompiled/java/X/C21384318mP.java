package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.NewCreatorCaptionEditItem;
import com.ss.android.ugc.aweme.newcreatoredit.NewCreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18mP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21384318mP extends AbstractC21673619ry<C21384418mQ> {
    public final NewCreatorCaptionEditViewModel LL;
    public final InterfaceC21384918mV LLILLJJLI;
    public final boolean LLILLL;
    public final C21384118mN LLILZ;
    public View LLILZLL;
    public RecyclerView LLIZLLLIL;
    public int LLILZIL = -1;
    public int LLIZ = -1;
    public final int LLJ = 200;

    public final List<CreatorCaptionEditData> LLLI() {
        if (this.LLILLL) {
            NewCreatorCaptionEditItem newCreatorCaptionEditItemXQ2 = this.LL.xQ2();
            if (newCreatorCaptionEditItemXQ2 != null) {
                return newCreatorCaptionEditItemXQ2.transSubtitleItem;
            }
            return null;
        }
        NewCreatorCaptionEditItem newCreatorCaptionEditItemZQ2 = this.LL.zQ2();
        if (newCreatorCaptionEditItemZQ2 != null) {
            return newCreatorCaptionEditItemZQ2.transSubtitleItem;
        }
        return null;
    }

    public final boolean LLLIIIIL() {
        if (!this.LLILLL) {
            NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel = this.LL;
            if (!newCreatorCaptionEditViewModel.LLJJIII) {
                return false;
            }
            String strVQ2 = newCreatorCaptionEditViewModel.vQ2();
            return strVQ2 == null || !newCreatorCaptionEditViewModel.LLJJIJI.contains(strVQ2);
        }
        NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel2 = this.LL;
        if (!newCreatorCaptionEditViewModel2.LLJJI) {
            return false;
        }
        String strVQ22 = newCreatorCaptionEditViewModel2.vQ2();
        if (strVQ22 != null && newCreatorCaptionEditViewModel2.LLJJIJI.contains(strVQ22)) {
            return false;
        }
        return true;
    }

    public final void LLLIILIL() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLIZ)) == null) {
            return;
        }
        C21384418mQ c21384418mQ = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition;
        if (c21384418mQ.LLILZ.getVisibility() == 0) {
            c21384418mQ.LLILZ.pauseAnimation();
            C786410Ut5.LLD(8, c21384418mQ.LLILZ);
            C786410Ut5.LJZI(0, c21384418mQ.LLILZIL);
        }
    }

    public final void LLLILZ() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view = this.LLILZLL;
        if (view != null) {
            KeyboardUtils.LIZIZ(view);
            view.clearFocus();
        }
        RecyclerView recyclerView = this.LLIZLLLIL;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLIZ)) == null) {
            return;
        }
        C21384418mQ c21384418mQ = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition;
        c21384418mQ.LLILZ.pauseAnimation();
        C786410Ut5.LLD(8, c21384418mQ.LLILZ);
        C786410Ut5.LJZI(8, c21384418mQ.LLILZIL);
    }

    public static int LLLFZ() {
        Integer numLIZJ;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null || (numLIZJ = C1308910kAL.LIZJ(R.attr.a03, topActivity)) == null) {
            return 0;
        }
        return numLIZJ.intValue();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<CreatorCaptionEditData> listLLLI = LLLI();
        if (listLLLI != null) {
            return listLLLI.size();
        }
        return 0;
    }

    public final void LLLII(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        if (i != -1 && i != this.LLILZIL) {
            this.LLILZIL = i;
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, getItemCount()).iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                RecyclerView recyclerView = this.LLIZLLLIL;
                if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(iNextInt)) != null) {
                    C21384418mQ c21384418mQ = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition2;
                    EditText editText = c21384418mQ.LLILLJJLI;
                    C844470XAv.LIZ.getClass();
                    editText.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.bg));
                    c21384418mQ.LLILZ.pauseAnimation();
                    C786410Ut5.LLD(8, c21384418mQ.LLILZ);
                    C786410Ut5.LJZI(8, c21384418mQ.LLILZIL);
                    c21384418mQ.LLILLL.setBackgroundColor(C844470XAv.LIZ().getResources().getColor(R.color.a1d));
                }
            }
            RecyclerView recyclerView2 = this.LLIZLLLIL;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(i)) != null) {
                C21384418mQ c21384418mQ2 = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition;
                EditText editText2 = c21384418mQ2.LLILLJJLI;
                C844470XAv.LIZ.getClass();
                editText2.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.f569bc));
                if (Intrinsics.LJFF(this.LL.LLJIJIL.getValue(), Boolean.FALSE)) {
                    c21384418mQ2.LLILLL.setBackgroundColor(LLLFZ());
                }
                if (!LLLIIIIL()) {
                    c21384418mQ2.LLILLJJLI.clearFocus();
                    c21384418mQ2.LLILLJJLI.setSelected(false);
                }
            }
        }
    }

    public final void LLLIL(boolean z) {
        C21384418mQ c21384418mQ;
        TuxTextView tuxTextView;
        int i;
        Iterator<Integer> it2 = C13LZ.LJIILJJIL(0, getItemCount()).iterator();
        while (it2.hasNext()) {
            int iNextInt = ((AbstractC2098408Jy) it2).nextInt();
            RecyclerView recyclerView = this.LLIZLLLIL;
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = null;
            if (recyclerView != null) {
                viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iNextInt);
            }
            if ((viewHolderFindViewHolderForAdapterPosition instanceof C21384418mQ) && (c21384418mQ = (C21384418mQ) viewHolderFindViewHolderForAdapterPosition) != null && (tuxTextView = c21384418mQ.LL) != null) {
                if (z) {
                    i = 0;
                } else {
                    i = 8;
                }
                C786410Ut5.LLLLZLL(tuxTextView, i);
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZLLLIL = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<CreatorCaptionEditData> listLLLI;
        CreatorCaptionEditData creatorCaptionEditData;
        int i2;
        C21384418mQ c21384418mQ = (C21384418mQ) viewHolder;
        if (i < getItemCount() && (listLLLI = LLLI()) != null && (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(listLLLI, i)) != null) {
            c21384418mQ.LLILZLL = creatorCaptionEditData;
            EditText editText = c21384418mQ.LLILLJJLI;
            C844470XAv.LIZ.getClass();
            Resources resources = C844470XAv.LIZ().getResources();
            int i3 = 0;
            if (c21384418mQ.LLJ.LLILZIL == i) {
                i2 = R.color.f569bc;
            } else {
                i2 = R.color.bg;
            }
            editText.setTextColor(resources.getColor(i2));
            C21384318mP c21384318mP = c21384418mQ.LLJ;
            if (c21384318mP.LLILZIL == i) {
                ConstraintLayout constraintLayout = c21384418mQ.LLILLL;
                c21384318mP.getClass();
                constraintLayout.setBackgroundColor(LLLFZ());
            }
            if (!c21384418mQ.LLJ.LLILLL) {
                c21384418mQ.LL.setText(creatorCaptionEditData.getSourceText());
            }
            TuxTextView tuxTextView = c21384418mQ.LL;
            C21384318mP c21384318mP2 = c21384418mQ.LLJ;
            if (c21384318mP2.LLILLL || !Intrinsics.LJFF(c21384318mP2.LL.LLJIJIL.getValue(), Boolean.TRUE)) {
                i3 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i3);
            c21384418mQ.LLILLJJLI.setText(creatorCaptionEditData.getText());
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C21384418mQ c21384418mQ = new C21384418mQ(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b5m, viewGroup, false));
        try {
            View view = c21384418mQ.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21384418mQ.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21384418mQ.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21384418mQ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21384418mQ.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21384418mQ.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21384418mQ.class.getName();
        return c21384418mQ;
    }

    public C21384318mP(NewCreatorCaptionEditViewModel newCreatorCaptionEditViewModel, InterfaceC21384918mV interfaceC21384918mV, boolean z, C21384118mN c21384118mN) {
        this.LL = newCreatorCaptionEditViewModel;
        this.LLILLJJLI = interfaceC21384918mV;
        this.LLILLL = z;
        this.LLILZ = c21384118mN;
    }
}
