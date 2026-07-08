package X;

import Y.AAListenerS332S0100000_21;
import Y.ARunnableS121S0100000_21;
import Y.AUListenerS270S0100000_21;
import Y.AsS48S0100000_21;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0lhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public abstract class AbstractC1368060lhk extends AbstractC21673619ry<C1368080lhm> {
    public int LL;
    public boolean LLILZ;
    public String LLILZIL;
    public RecyclerView LLIZ;
    public LinearLayoutManager LLIZLLLIL;
    public ARunnableS121S0100000_21 LLJ;
    public C1367550lgv LLJI;
    public AsS48S0100000_21 LLJIJIL;
    public final AAListenerS332S0100000_21 LLJILJIL = new AAListenerS332S0100000_21(this, 23);
    public boolean LLILLJJLI = false;
    public final List<IMContact> LLILLL = new ArrayList();
    public LinkedHashSet<IMContact> LLILZLL = new LinkedHashSet<>();

    public abstract String LLLFZ(IMContact iMContact);

    @Override // X.AbstractC21673619ry
    public int getItemCount() {
        List<IMContact> list = this.LLILLL;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return 0;
        }
        return ((ArrayList) this.LLILLL).size();
    }

    public void LLLII(int i) {
        notifyItemChanged(i);
    }

    public final void LLLIL(List<IMContact> list) {
        this.LLILZIL = null;
        ((ArrayList) this.LLILLL).clear();
        this.LL = 0;
        ((ArrayList) this.LLILLL).addAll(list);
        if (((ArrayList) this.LLILLL).isEmpty()) {
            IMUser iMUser = new IMUser();
            iMUser.setType(-1);
            ((ArrayList) this.LLILLL).add(iMUser);
        } else {
            if (((ArrayList) this.LLILLL).size() == 1 && ((IMContact) ListProtector.get(this.LLILLL, 0)).getType() == -1) {
                return;
            }
            if (((IMContact) ListProtector.get(this.LLILLL, 0)).getType() == -1) {
                ListProtector.remove(this.LLILLL, 0);
            }
        }
        notifyDataSetChanged();
    }

    public final void LLLJ(boolean z) {
        if (this.LLILZ != z) {
            this.LLILZ = z;
            if (!z) {
                this.LLILZLL.clear();
            }
            AnimatorSet.Builder builderPlay = null;
            if (this.LLILZ) {
                AnimatorSet animatorSet = new AnimatorSet();
                if (this.LLIZLLLIL != null) {
                    for (int i = 0; i < this.LLIZLLLIL.getChildCount(); i++) {
                        View childAt = this.LLIZLLLIL.getChildAt(i);
                        if (childAt != null) {
                            C1368080lhm c1368080lhm = (C1368080lhm) childAt.getTag();
                            if (builderPlay == null) {
                                ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(c1368080lhm.LLJ, c1368080lhm.LLIZLLLIL);
                                valueAnimatorOfInt.addUpdateListener(new AUListenerS270S0100000_21(c1368080lhm, 31));
                                builderPlay = animatorSet.play(valueAnimatorOfInt);
                            } else {
                                ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(c1368080lhm.LLJ, c1368080lhm.LLIZLLLIL);
                                valueAnimatorOfInt2.addUpdateListener(new AUListenerS270S0100000_21(c1368080lhm, 31));
                                builderPlay.with(valueAnimatorOfInt2);
                            }
                        }
                    }
                    animatorSet.setDuration(300L);
                    animatorSet.addListener(this.LLJILJIL);
                    animatorSet.start();
                    return;
                }
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            for (int i2 = 0; i2 < this.LLIZLLLIL.getChildCount(); i2++) {
                View childAt2 = this.LLIZLLLIL.getChildAt(i2);
                if (childAt2 != null) {
                    C1368080lhm c1368080lhm2 = (C1368080lhm) childAt2.getTag();
                    if (builderPlay == null) {
                        ValueAnimator valueAnimatorOfInt3 = ValueAnimator.ofInt(c1368080lhm2.LLIZLLLIL, c1368080lhm2.LLJ);
                        valueAnimatorOfInt3.addUpdateListener(new AUListenerS270S0100000_21(c1368080lhm2, 32));
                        builderPlay = animatorSet2.play(valueAnimatorOfInt3);
                    } else {
                        ValueAnimator valueAnimatorOfInt4 = ValueAnimator.ofInt(c1368080lhm2.LLIZLLLIL, c1368080lhm2.LLJ);
                        valueAnimatorOfInt4.addUpdateListener(new AUListenerS270S0100000_21(c1368080lhm2, 32));
                        builderPlay.with(valueAnimatorOfInt4);
                    }
                }
            }
            animatorSet2.setDuration(300L);
            animatorSet2.addListener(this.LLJILJIL);
            animatorSet2.start();
        }
    }

    @Override // X.AbstractC21673619ry
    public int getItemViewType(int i) {
        if (((IMContact) ListProtector.get(this.LLILLL, i)).getType() == -1) {
            return -1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LLIZ = recyclerView;
        this.LLIZLLLIL = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (this.LLJIJIL == null) {
            this.LLJIJIL = new AsS48S0100000_21(this, 4);
        }
        this.LLIZ.addOnScrollListener(this.LLJIJIL);
    }

    @Override // X.AbstractC21673619ry
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.LLIZ = null;
    }

    @Override // X.AbstractC21673619ry
    /* JADX INFO: renamed from: LLLIIIIL, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C1368080lhm c1368080lhm, int i) {
        c1368080lhm.I5(i, (IMContact) ListProtector.get(this.LLILLL, i));
    }

    public C1368080lhm LLLIILIL(int i, ViewGroup viewGroup) {
        int i2;
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(viewGroup.getContext());
        if (i == 0) {
            i2 = R.layout.cmq;
        } else {
            i2 = R.layout.cmk;
        }
        return new C1368080lhm(this, C786410Ut5.Td(layoutInflaterNe, i2, viewGroup, false));
    }

    @Override // X.AbstractC21673619ry
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C1368080lhm c1368080lhmLLLIILIL = LLLIILIL(i, viewGroup);
        if (c1368080lhmLLLIILIL != null) {
            try {
                View view = c1368080lhmLLLIILIL.itemView;
                if (view != null) {
                    view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        c1368080lhmLLLIILIL.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1368080lhmLLLIILIL.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1368080lhmLLLIILIL.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1368080lhmLLLIILIL.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1368080lhmLLLIILIL.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1368080lhmLLLIILIL.getClass().getName();
        return c1368080lhmLLLIILIL;
    }

    public static void LLLILZ(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            if (TextUtils.isEmpty(iMUser.getDisplayName())) {
                C786410Ut5.LLIL(textView, 8);
                return;
            } else {
                textView.setText(iMUser.getDisplayName());
                C786410Ut5.LLIL(textView, 0);
                return;
            }
        }
        int i = iMUser.searchType;
        if (i == 5) {
            if (TextUtils.isEmpty(iMUser.getSignature())) {
                C786410Ut5.LLIL(textView, 8);
            } else {
                textView.setText(iMUser.getSignature());
                C786410Ut5.LLIL(textView, 0);
            }
        } else if (i == 3) {
            if (TextUtils.isEmpty(iMUser.getRemarkName())) {
                if (TextUtils.isEmpty(iMUser.getSignature())) {
                    C786410Ut5.LLIL(textView, 8);
                } else {
                    textView.setText(iMUser.getSignature());
                    C786410Ut5.LLIL(textView, 0);
                }
            } else {
                String string = C2213981Bky.LIZIZ.getApplicationContext().getResources().getString(2131835750, iMUser.getNickName());
                str = C1489350orN.LIZ(iMUser.getNickName(), iMUser.getNickNamePinyin(), iMUser.getNickNameInitial(), str);
                LLLI(textView, string, str, 3);
                C786410Ut5.LLIL(textView, 0);
            }
        } else {
            String string2 = "";
            if (i == 1) {
                String displayId = iMUser.getDisplayId();
                String lowerCase = C1489350orN.LIZJ(displayId).toLowerCase();
                if (!TextUtils.isEmpty(displayId)) {
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < displayId.length(); i2++) {
                        sb.append(C1E91.LIZJ(displayId.charAt(i2)).charAt(0));
                    }
                    string2 = sb.toString();
                }
                str = C1489350orN.LIZ(displayId, lowerCase, string2, str);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(C2213981Bky.LIZIZ.getApplicationContext().getResources().getString(2131835657));
                sbLIZ.append(displayId);
                LLLI(textView, C2188811AlT.LIZIZ(sbLIZ), str, 4);
                C786410Ut5.LLIL(textView, 0);
            } else if (i == 2) {
                str = C1489350orN.LIZ(iMUser.getContactName(), iMUser.getContactNamePinyin(), iMUser.getContactNameInitial(), str);
                LLLI(textView, "", str, 6);
                C786410Ut5.LLIL(textView, 0);
            } else {
                C786410Ut5.LLIL(textView, 8);
            }
        }
        if (TextUtils.isEmpty(iMUser.getDisplayName())) {
            C786410Ut5.LLIL(textView, 8);
            return;
        }
        textView.setText(iMUser.getDisplayName());
        C786410Ut5.LLIL(textView, 0);
        LLLI(textView, iMUser.getDisplayName(), str, 0);
    }

    public static void LLLILZLLLI(TextView textView, IMUser iMUser, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText(iMUser.getDisplayId());
        } else {
            LLLI(textView, iMUser.getDisplayId(), str, 0);
        }
    }

    public static void LLLI(TextView textView, String str, String str2, int i) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.toLowerCase(Locale.getDefault()).indexOf(str2.toLowerCase(Locale.getDefault()), i);
        if (iIndexOf != -1) {
            str2 = str.substring(iIndexOf, Math.min(str2.length() + iIndexOf, str.length()));
        }
        textView.setText(C0I1S.LIZ(C1308910kAL.LIZJ(R.attr.a04, textView.getContext()).intValue(), i, str, str2));
    }
}
