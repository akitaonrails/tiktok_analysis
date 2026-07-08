package X;

import Y.ACListenerS166S0100000_32;
import Y.ACListenerS54S0201000_32;
import Y.ACListenerS63S0101000_32;
import android.content.res.Resources;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditData;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditItem;
import com.ss.android.ugc.aweme.creatoredit.CreatorCaptionEditViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.18mC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21383018mC extends AbstractC21673619ry<C21383318mF> {
    public final CreatorCaptionEditViewModel LL;
    public final InterfaceC21383418mG LLILLJJLI;
    public View LLILLL;
    public View LLILZIL;
    public RecyclerView LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public int LLILZ = -1;
    public int LLILZLL = -1;

    public final void LLLI() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLILZLL)) == null) {
            return;
        }
        C21383318mF c21383318mF = (C21383318mF) viewHolderFindViewHolderForAdapterPosition;
        if (c21383318mF.LLILZ.getVisibility() == 0) {
            c21383318mF.LLILZ.pauseAnimation();
            C786410Ut5.LLD(8, c21383318mF.LLILZ);
            C786410Ut5.LJZI(0, c21383318mF.LLILZIL);
        }
    }

    public final void LLLII() {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        View view = this.LLILZIL;
        if (view != null) {
            KeyboardUtils.LIZIZ(view);
            view.clearFocus();
        }
        RecyclerView recyclerView = this.LLIZ;
        if (recyclerView == null || (viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(this.LLILZLL)) == null) {
            return;
        }
        C21383318mF c21383318mF = (C21383318mF) viewHolderFindViewHolderForAdapterPosition;
        c21383318mF.LLILZ.pauseAnimation();
        C786410Ut5.LLD(8, c21383318mF.LLILZ);
        C786410Ut5.LJZI(8, c21383318mF.LLILZIL);
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<CreatorCaptionEditData> list;
        CreatorCaptionEditItem creatorCaptionEditItem = this.LL.LLIZ;
        if (creatorCaptionEditItem == null || (list = creatorCaptionEditItem.transSubtitleItem) == null) {
            return 0;
        }
        return list.size();
    }

    public final void LLLFZ(int i) {
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2;
        if (i != -1 && i != this.LLILZ) {
            this.LLILZ = i;
            C531650Kt9 it2 = C13LZ.LJIILJJIL(0, getItemCount()).iterator();
            while (it2.LLILLL) {
                int iNextInt = it2.nextInt();
                RecyclerView recyclerView = this.LLIZ;
                if (recyclerView != null && (viewHolderFindViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(iNextInt)) != null) {
                    C21383318mF c21383318mF = (C21383318mF) viewHolderFindViewHolderForAdapterPosition2;
                    EditText editText = c21383318mF.LL;
                    C844470XAv.LIZ.getClass();
                    editText.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.bg));
                    c21383318mF.LLILZ.pauseAnimation();
                    C786410Ut5.LLD(8, c21383318mF.LLILZ);
                    C786410Ut5.LJZI(8, c21383318mF.LLILZIL);
                }
            }
            RecyclerView recyclerView2 = this.LLIZ;
            if (recyclerView2 != null && (viewHolderFindViewHolderForAdapterPosition = recyclerView2.findViewHolderForAdapterPosition(i)) != null) {
                EditText editText2 = ((C21383318mF) viewHolderFindViewHolderForAdapterPosition).LL;
                C844470XAv.LIZ.getClass();
                editText2.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.f569bc));
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZ = recyclerView;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        C21383318mF c21383318mF = (C21383318mF) viewHolder;
        super.onViewAttachedToWindow(c21383318mF);
        if (this.LLIZLLLIL && C2204961BRm.LLJILLL(c21383318mF.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a0yCxoGMK+Gc17indfW/FOXw2uAU8eXbItoX+94DuXi8=", null)).toString().length() == 0) {
            c21383318mF.LL.requestFocus();
            c21383318mF.LL.callOnClick();
            this.LLIZLLLIL = false;
        }
    }

    public C21383018mC(CreatorCaptionEditViewModel creatorCaptionEditViewModel, InterfaceC21383418mG interfaceC21383418mG) {
        this.LL = creatorCaptionEditViewModel;
        this.LLILLJJLI = interfaceC21383418mG;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int i) {
        boolean z;
        String str;
        Number number;
        String text;
        CreatorCaptionEditData creatorCaptionEditData;
        CaptionItemModel captionItemModelLJIIIIZZ;
        final C21383318mF c21383318mF = (C21383318mF) viewHolder;
        final CreatorCaptionEditItem creatorCaptionEditItem = this.LL.LLIZ;
        if (creatorCaptionEditItem != null) {
            int i2 = 0;
            if (this.LLILZ == i) {
                z = true;
            } else {
                z = false;
            }
            int i3 = R.color.f569bc;
            if (z) {
                EditText editText = c21383318mF.LL;
                C844470XAv.LIZ.getClass();
                editText.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.f569bc));
            } else {
                EditText editText2 = c21383318mF.LL;
                C844470XAv.LIZ.getClass();
                editText2.setTextColor(C844470XAv.LIZ().getResources().getColor(R.color.bg));
            }
            EditText editText3 = c21383318mF.LL;
            int visibility = editText3.getVisibility();
            editText3.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, editText3);
            c21383318mF.LL.setTypeface(null, 1);
            c21383318mF.LL.addTextChangedListener(new TextWatcher() { // from class: X.15gv
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    for (int length = editable.length() - 1; -1 < length; length--) {
                        if (editable.charAt(length) == '\n' || editable.charAt(length) == '\r') {
                            editable.delete(length, length + 1);
                            return;
                        }
                    }
                }
            });
            Aweme value = this.LL.vQ2().getValue();
            if (value != null && (captionItemModelLJIIIIZZ = C20703515zt.LJIIIIZZ(value)) != null) {
                str = captionItemModelLJIIIIZZ.languageCode;
            } else {
                str = null;
            }
            Map map = (Map) SettingsManager.LIZLLL().LJIIIIZZ("cec_max_num_lines", HashMap.class, null);
            if (map == null || (number = (Number) map.get(str)) == null) {
                number = 105;
            }
            c21383318mF.LL.setFilters(new InputFilter[]{new InputFilter.LengthFilter(number.intValue())});
            EditText editText4 = c21383318mF.LL;
            List<CreatorCaptionEditData> list = creatorCaptionEditItem.transSubtitleItem;
            if (list == null || (creatorCaptionEditData = (CreatorCaptionEditData) ListProtector.get(list, i)) == null || (text = creatorCaptionEditData.getText()) == null) {
                text = "";
            }
            editText4.setText(text);
            c21383318mF.LL.addTextChangedListener(new TextWatcher() { // from class: X.18mE
                @Override // android.text.TextWatcher
                public final void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public final void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override // android.text.TextWatcher
                public final void afterTextChanged(Editable editable) {
                    CreatorCaptionEditData creatorCaptionEditData2;
                    List<CreatorCaptionEditData> list2 = creatorCaptionEditItem.transSubtitleItem;
                    if (list2 != null && (creatorCaptionEditData2 = (CreatorCaptionEditData) ListProtector.get(list2, i)) != null) {
                        creatorCaptionEditData2.setText(C2204961BRm.LLJILLL(c21383318mF.LL, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOm6Zp7a0yCxoGMK+Gc17indfW/FOXw2uAU8eXbItoX+94DuXi8=", null)).toString());
                    }
                    this.LL.AQ2();
                }
            });
            c21383318mF.setIsRecyclable(false);
            C1295960jpS c1295960jpS = c21383318mF.LLILZ;
            c1295960jpS.setAnimation("creation_audio_wave_anim_tux_lottie.json");
            c1295960jpS.setRepeatCount(-1);
            C786410Ut5.N7(c21383318mF.LL, new ACListenerS54S0201000_32(i, c21383318mF, this, 0));
            c21383318mF.LL.setClickable(this.LLJ);
            c21383318mF.LL.setEnabled(this.LLJ);
            C786410Ut5.N7(c21383318mF.LL, new ACListenerS63S0101000_32(this, i, 0));
            View view = c21383318mF.LLILLJJLI;
            if (this.LLJ) {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, view);
            C786410Ut5.I7(new ACListenerS166S0100000_32(this, 16), c21383318mF.LLILLJJLI);
            EditText editText5 = c21383318mF.LL;
            C844470XAv.LIZ.getClass();
            Resources resources = C844470XAv.LIZ().getResources();
            if (i != this.LLILZ) {
                i3 = R.color.bg;
            }
            editText5.setTextColor(resources.getColor(i3));
            c21383318mF.LLILZ.pauseAnimation();
            C786410Ut5.LLD(8, c21383318mF.LLILZ);
            C786410Ut5.LJZI(8, c21383318mF.LLILZIL);
            c21383318mF.LL.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: X.18mD
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view2, boolean z2) {
                    if (z2) {
                        this.LLILLJJLI.z1(i);
                        C21383018mC c21383018mC = this;
                        c21383018mC.LLILZIL = view2;
                        c21383018mC.LLILZLL = i;
                        C786410Ut5.LJZI(0, c21383318mF.LLILZIL);
                        LinearLayout linearLayout = c21383318mF.LLILLL;
                        C844470XAv.LIZ.getClass();
                        linearLayout.setBackgroundColor(C844470XAv.LIZ().getResources().getColor(R.color.b4));
                        return;
                    }
                    C786410Ut5.LJZI(8, c21383318mF.LLILZIL);
                    C786410Ut5.LLD(8, c21383318mF.LLILZ);
                    c21383318mF.LLILZ.pauseAnimation();
                    LinearLayout linearLayout2 = c21383318mF.LLILLL;
                    C844470XAv.LIZ.getClass();
                    linearLayout2.setBackgroundColor(C844470XAv.LIZ().getResources().getColor(R.color.a1d));
                }
            });
            C786410Ut5.Q7(c21383318mF.LLILZIL, new ACListenerS54S0201000_32(i, c21383318mF, this, 1));
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        this.LLILLL = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.b5p, viewGroup, false);
        View view = this.LLILLL;
        if (view == null) {
            view = null;
        }
        C21383318mF c21383318mF = new C21383318mF(view);
        try {
            View view2 = c21383318mF.itemView;
            if (view2 != null) {
                view2.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c21383318mF.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c21383318mF.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C21383318mF.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c21383318mF.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c21383318mF.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C21383318mF.class.getName();
        return c21383318mF;
    }
}
