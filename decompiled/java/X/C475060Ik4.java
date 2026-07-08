package X;

import Y.ACListenerS46S0400000_7;
import Y.ACListenerS74S0300000_7;
import Y.ACListenerS9S0600000_7;
import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.user.CoverImageModel;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Answer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.CascadeAnswer;
import com.bytedance.android.livesdkapi.depend.model.live.debug.Question;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Ik4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475060Ik4 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public List<Question> LL;
    public Context LLILLJJLI;
    public CoverImageModel LLILLL;
    public HashMap<Long, Answer> LLILZ = new HashMap<>();
    public InterfaceC475100Ik8 LLILZIL;

    public final void LLLI() {
        List<Question> listLLLII = LLLII(false);
        if (listLLLII != null) {
            for (Question question : listLLLII) {
                if (!LLLFZ(question)) {
                    this.LLILZ.remove(Long.valueOf(question.questionId));
                }
            }
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<Question> listLLLII = LLLII(true);
        if (listLLLII != null) {
            return listLLLII.size();
        }
        return 0;
    }

    public final boolean LLLFZ(Question question) {
        if (C2093608Ic.LJ(question.displayValue)) {
            return true;
        }
        Iterator<Map.Entry<Long, Answer>> it2 = this.LLILZ.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().answers.contains(question.displayValue)) {
                return true;
            }
        }
        return false;
    }

    public final List<Question> LLLII(boolean z) {
        if (z) {
            List<Question> list = this.LL;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (Question question : list) {
                    if (LLLFZ(question)) {
                        arrayList.add(question);
                    }
                }
                return arrayList;
            }
            return null;
        }
        return this.LL;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        List<Question> listLLLII = LLLII(true);
        if (listLLLII != null && listLLLII.size() > i) {
            return ((Question) ListProtector.get(listLLLII, i)).questionType;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Question question;
        List<CascadeAnswer> list;
        Question question2;
        long j;
        HashSet<String> hashSet;
        List<String> list2;
        Question question3;
        List<CascadeAnswer> list3;
        int itemViewType = getItemViewType(i);
        int i2 = 8;
        int i3 = R.id.wg_;
        int i4 = R.id.zi7;
        int i5 = R.id.fs7;
        ViewGroup viewGroup = null;
        if (itemViewType == 2) {
            if (viewHolder instanceof C475070Ik5) {
                C475070Ik5 c475070Ik5 = (C475070Ik5) viewHolder;
                List<Question> listLLLII = LLLII(true);
                if (listLLLII != null) {
                    question3 = (Question) ListProtector.get(listLLLII, i);
                } else {
                    question3 = null;
                }
                c475070Ik5.LLILLL.LLLIIIIL(question3, c475070Ik5.LLILLJJLI, i);
                C786410Ut5.LJJJJI(c475070Ik5.LL);
                if (question3 != null && (list3 = question3.subValue) != null) {
                    C475060Ik4 c475060Ik4 = c475070Ik5.LLILLL;
                    for (CascadeAnswer cascadeAnswer : list3) {
                        LayoutInflater layoutInflaterNe = C786410Ut5.ne(c475060Ik4.LLILLJJLI);
                        int i6 = R.layout.h6g;
                        View viewSd = C786410Ut5.Sd(R.layout.h6g, layoutInflaterNe, viewGroup);
                        ViewGroup viewGroup2 = (ViewGroup) viewSd.findViewById(i5);
                        ((TextView) viewSd.findViewById(i4)).setText(cascadeAnswer.value);
                        C20744116Fj c20744116Fj = (C20744116Fj) viewSd.findViewById(R.id.djh);
                        if (!cascadeAnswer.hasSub) {
                            c20744116Fj.setChecked(c475070Ik5.I5(question3.questionId, cascadeAnswer.value));
                        }
                        viewGroup2.setTag(cascadeAnswer);
                        LinearLayout linearLayout = (LinearLayout) viewSd.findViewById(i3);
                        C786410Ut5.LJZL(i2, linearLayout);
                        if (cascadeAnswer.hasSub) {
                            for (CascadeAnswer cascadeAnswer2 : cascadeAnswer.subValue) {
                                View viewSd2 = C786410Ut5.Sd(i6, C786410Ut5.ne(c475060Ik4.LLILLJJLI), viewGroup);
                                ViewGroup viewGroup3 = (ViewGroup) viewSd2.findViewById(R.id.fs7);
                                TextView textView = (TextView) viewSd2.findViewById(R.id.zi7);
                                C20744116Fj c20744116Fj2 = (C20744116Fj) viewSd2.findViewById(R.id.djh);
                                c20744116Fj2.setChecked(c475070Ik5.I5(question3.questionId, cascadeAnswer2.value));
                                if (c20744116Fj2.isChecked()) {
                                    c20744116Fj.setChecked(true);
                                    C786410Ut5.LJZL(0, linearLayout);
                                }
                                textView.setText(cascadeAnswer2.value);
                                viewGroup3.setTag(cascadeAnswer2);
                                C786410Ut5.K7(viewGroup3, new ACListenerS74S0300000_7(c20744116Fj2, c475070Ik5, question3, 2));
                                linearLayout.addView(viewSd2);
                                viewGroup = null;
                                i6 = R.layout.h6g;
                            }
                        }
                        C786410Ut5.K7(viewGroup2, new ACListenerS9S0600000_7(c20744116Fj, cascadeAnswer, linearLayout, c475060Ik4, question3, c475070Ik5, 0));
                        c475070Ik5.LL.addView(viewSd);
                        i2 = 8;
                        i3 = R.id.wg_;
                        i4 = R.id.zi7;
                        i5 = R.id.fs7;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (itemViewType == 3) {
            if (viewHolder instanceof C475090Ik7) {
                C475090Ik7 c475090Ik7 = (C475090Ik7) viewHolder;
                List<Question> listLLLII2 = LLLII(true);
                if (listLLLII2 != null) {
                    question2 = (Question) ListProtector.get(listLLLII2, i);
                } else {
                    question2 = null;
                }
                c475090Ik7.LLILLL.LLLIIIIL(question2, c475090Ik7.LLILLJJLI, i);
                C786410Ut5.LJJJJI(c475090Ik7.LL);
                View viewSd3 = C786410Ut5.Sd(R.layout.h6f, C786410Ut5.ne(c475090Ik7.LLILLL.LLILLJJLI), null);
                View viewFindViewById = viewSd3.findViewById(R.id.lel);
                TextView textView2 = (TextView) viewSd3.findViewById(R.id.hcy);
                CoverImageModel coverImageModel = c475090Ik7.LLILLL.LLILLL;
                if (coverImageModel != null && (list2 = coverImageModel.urlList) != null) {
                    C1143680frq.LJII(viewFindViewById, list2);
                }
                HashMap<Long, Answer> map = c475090Ik7.LLILLL.LLILZ;
                if (question2 != null) {
                    j = question2.questionId;
                } else {
                    j = 0;
                }
                Answer answer = map.get(Long.valueOf(j));
                if (answer != null && (hashSet = answer.answers) != null && (!hashSet.isEmpty())) {
                    textView2.setText((CharSequence) C13LP.LJJJJZ(hashSet));
                }
                textView2.addTextChangedListener(new C521830KdJ(c475090Ik7, question2, 1));
                c475090Ik7.LL.addView(viewSd3);
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C475080Ik6)) {
            return;
        }
        C475080Ik6 c475080Ik6 = (C475080Ik6) viewHolder;
        List<Question> listLLLII3 = LLLII(true);
        if (listLLLII3 != null) {
            question = (Question) ListProtector.get(listLLLII3, i);
        } else {
            question = null;
        }
        c475080Ik6.LLILLL.LLLIIIIL(question, c475080Ik6.LLILLJJLI, i);
        C786410Ut5.LJJJJI(c475080Ik6.LL);
        if (question == null || (list = question.subValue) == null) {
            return;
        }
        C475060Ik4 c475060Ik42 = c475080Ik6.LLILLL;
        for (CascadeAnswer cascadeAnswer3 : list) {
            LayoutInflater layoutInflaterNe2 = C786410Ut5.ne(c475060Ik42.LLILLJJLI);
            int i7 = R.layout.h6h;
            View viewSd4 = C786410Ut5.Sd(R.layout.h6h, layoutInflaterNe2, null);
            ViewGroup viewGroup4 = (ViewGroup) viewSd4.findViewById(R.id.fs7);
            TextView textView3 = (TextView) viewSd4.findViewById(R.id.zi7);
            int i8 = R.id.ssw;
            C20744016Fi c20744016Fi = (C20744016Fi) viewSd4.findViewById(R.id.ssw);
            if (!cascadeAnswer3.hasSub) {
                c20744016Fi.setChecked(c475080Ik6.I5(question.questionId, cascadeAnswer3.value));
            }
            textView3.setText(cascadeAnswer3.value);
            viewGroup4.setTag(cascadeAnswer3);
            LinearLayout linearLayout2 = (LinearLayout) viewSd4.findViewById(R.id.wg_);
            C786410Ut5.LJZL(8, linearLayout2);
            if (cascadeAnswer3.hasSub) {
                for (CascadeAnswer cascadeAnswer4 : cascadeAnswer3.subValue) {
                    View viewSd5 = C786410Ut5.Sd(i7, C786410Ut5.ne(c475060Ik42.LLILLJJLI), null);
                    ViewGroup viewGroup5 = (ViewGroup) viewSd5.findViewById(R.id.fs7);
                    TextView textView4 = (TextView) viewSd5.findViewById(R.id.zi7);
                    C20744016Fi c20744016Fi2 = (C20744016Fi) viewSd5.findViewById(i8);
                    c20744016Fi2.setChecked(c475080Ik6.I5(question.questionId, cascadeAnswer4.value));
                    if (c20744016Fi2.isChecked()) {
                        c20744016Fi.setChecked(true);
                        C786410Ut5.LJZL(0, linearLayout2);
                    }
                    textView4.setText(cascadeAnswer4.value);
                    viewGroup5.setTag(cascadeAnswer4);
                    C786410Ut5.K7(viewGroup5, new ACListenerS46S0400000_7(c20744016Fi2, c475080Ik6, question, c475060Ik42, 1));
                    linearLayout2.addView(viewSd5);
                    i8 = R.id.ssw;
                    i7 = R.layout.h6h;
                }
            }
            C786410Ut5.K7(viewGroup4, new ACListenerS9S0600000_7(c20744016Fi, cascadeAnswer3, linearLayout2, c475060Ik42, question, c475080Ik6, 1));
            c475080Ik6.LL.addView(viewSd4);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c475080Ik6;
        this.LLILLJJLI = viewGroup.getContext();
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.h6i, viewGroup, false);
        if (i == 2) {
            c475080Ik6 = new C475070Ik5(this, viewTd);
        } else if (i == 3) {
            c475080Ik6 = new C475090Ik7(this, viewTd);
        } else {
            c475080Ik6 = new C475080Ik6(this, viewTd);
        }
        try {
            View view = c475080Ik6.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c475080Ik6.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c475080Ik6.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c475080Ik6.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c475080Ik6.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c475080Ik6.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c475080Ik6.getClass().getName();
        return c475080Ik6;
    }

    public final void LLLIIIIL(Question question, C16F5 c16f5, int i) {
        ForegroundColorSpan foregroundColorSpan;
        ForegroundColorSpan foregroundColorSpan2;
        boolean z = true;
        String strValueOf = String.valueOf(i + 1);
        if (question == null || !question.required) {
            z = false;
        }
        String str = null;
        ForegroundColorSpan foregroundColorSpan3 = null;
        if (z) {
            String str2 = question.questionContent;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strValueOf);
            sbLIZ.append("* ");
            sbLIZ.append(str2);
            SpannableString spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            Context context = this.LLILLJJLI;
            if (context != null) {
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a04, context);
                if (numLIZJ != null) {
                    foregroundColorSpan = new ForegroundColorSpan(numLIZJ.intValue());
                } else {
                    foregroundColorSpan = null;
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan, strValueOf.length(), strValueOf.length() + 2, 18);
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.ej, context);
                if (numLIZJ2 != null) {
                    foregroundColorSpan2 = new ForegroundColorSpan(numLIZJ2.intValue());
                } else {
                    foregroundColorSpan2 = null;
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan2, 0, strValueOf.length(), 18);
                Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.ej, context);
                if (numLIZJ3 != null) {
                    foregroundColorSpan3 = new ForegroundColorSpan(numLIZJ3.intValue());
                }
                C786410Ut5.p2(spannableString, foregroundColorSpan3, strValueOf.length() + 3, spannableString.length(), 18);
            }
            c16f5.setText(spannableString);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strValueOf);
        if (question != null) {
            str = question.questionContent;
        }
        sbLIZ2.append(str);
        c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }
}
