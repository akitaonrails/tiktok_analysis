package X;

import Y.ACListenerS128S0200000_26;
import Y.ACListenerS160S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vLC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738480vLC extends LinearLayout {
    public View LL;
    public RecyclerView LLILLJJLI;
    public FrameLayout LLILLL;

    public final RecyclerView getDraftSubmissionItemList() {
        RecyclerView recyclerView = this.LLILLJJLI;
        if (recyclerView != null) {
            return recyclerView;
        }
        return null;
    }

    public final FrameLayout getExpandingListContainer() {
        FrameLayout frameLayout = this.LLILLL;
        if (frameLayout != null) {
            return frameLayout;
        }
        return null;
    }

    public final View getItemView() {
        View view = this.LL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public C1738480vLC(Context context) {
        super(context);
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        setOrientation(1);
        setItemView(C786410Ut5.Td(C786410Ut5.ne(getContext()).cloneInContext(getContext()), R.layout.cxt, this, true));
        setDraftSubmissionItemList((RecyclerView) findViewById(R.id.gw4));
        setExpandingListContainer((FrameLayout) findViewById(R.id.g7j));
        getDraftSubmissionItemList().setLayoutManager(new LinearLayoutManager(getItemView().getContext(), 0, false));
        C786410Ut5.LLIZLLLIL(getDraftSubmissionItemList(), 8);
    }

    public final void setData(Pair<EffectDraftSubmissionListViewModel, ? extends Map<String, String>> pair) {
        if (pair == null) {
            return;
        }
        final EffectDraftSubmissionListViewModel first = pair.getFirst();
        final Map<String, String> second = pair.getSecond();
        AbstractC21673619ry<C1738450vL9> abstractC21673619ry = new AbstractC21673619ry<C1738450vL9>(first, second) { // from class: X.0vLA
            public final EffectDraftSubmissionListViewModel LL;
            public final Map<String, String> LLILLJJLI;

            @Override // X.AbstractC21673619ry
            public final int getItemCount() {
                List<C2211008lQ> value = this.LL.LLILLL.getValue();
                if (value != null) {
                    return value.size();
                }
                return 0;
            }

            {
                this.LL = first;
                this.LLILLJJLI = second;
            }

            @Override // X.AbstractC21673619ry
            public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                C2211008lQ c2211008lQ;
                C1738450vL9 c1738450vL9 = (C1738450vL9) viewHolder;
                List<C2211008lQ> value = this.LL.LLILLL.getValue();
                if (value != null && (c2211008lQ = (C2211008lQ) ListProtector.get(value, i)) != null) {
                    Map<String, String> map = this.LLILLJJLI;
                    c1738450vL9.LLILZ = c2211008lQ;
                    c1738450vL9.LLILLL = map;
                    EnumC2159908dB enumC2159908dB = c2211008lQ.LIZ;
                    float f = 1.0f;
                    if (enumC2159908dB == EnumC2159908dB.DRAFT_EFFECT && c2211008lQ.LIZJ != null) {
                        C0VSJ c0vsj = new C0VSJ(c2211008lQ.LIZJ.iconFilePath);
                        c1738450vL9.LLILZLL.setText(c2211008lQ.LIZJ.effectName);
                        C1331670kl3 c1331670kl3LJII = C1331660kl2.LJII(c0vsj);
                        c1331670kl3LJII.LJJ = EnumC1338240kve.FIT_CENTER;
                        c1331670kl3LJII.LJJ(c1738450vL9.LLIZ);
                        C786410Ut5.h3(c1331670kl3LJII);
                        c1738450vL9.LLILZIL.setChecked(c2211008lQ.LIZIZ);
                        View view = c1738450vL9.itemView;
                        if (!c2211008lQ.LIZJ.enableSubmission) {
                            f = 0.34f;
                        }
                        C786410Ut5.T4(view, f);
                    } else if (enumC2159908dB == EnumC2159908dB.MOBILE_EFFECT && c2211008lQ.LIZLLL != null) {
                        C0VSJ c0vsj2 = new C0VSJ(c2211008lQ.LIZLLL.iconFilePath);
                        c1738450vL9.LLILZLL.setText(c2211008lQ.LIZLLL.effectName);
                        C1331670kl3 c1331670kl3LJII2 = C1331660kl2.LJII(c0vsj2);
                        c1331670kl3LJII2.LJJ = EnumC1338240kve.FIT_CENTER;
                        c1331670kl3LJII2.LJJ(c1738450vL9.LLIZ);
                        C786410Ut5.h3(c1331670kl3LJII2);
                        c1738450vL9.LLILZIL.setChecked(c2211008lQ.LIZIZ);
                        View view2 = c1738450vL9.itemView;
                        if (!c2211008lQ.LIZLLL.enableSubmission) {
                            f = 0.34f;
                        }
                        C786410Ut5.T4(view2, f);
                    }
                    if (C345050Dfr.LIZ) {
                        C786410Ut5.LLLLLLZZ(c1738450vL9.LLIZLLLIL, 0);
                        C786410Ut5.b9(c1738450vL9.LLILZIL, new ACListenerS160S0100000_26(c1738450vL9, 83));
                        C786410Ut5.H9(c1738450vL9.LLIZ, new ACListenerS128S0200000_26(c1738450vL9, c2211008lQ, 36));
                        C786410Ut5.a9(c1738450vL9.LLIZLLLIL, new ACListenerS128S0200000_26(c1738450vL9, c2211008lQ, 37));
                        return;
                    }
                    C786410Ut5.LLLLLLZZ(c1738450vL9.LLIZLLLIL, 8);
                    C786410Ut5.I7(new ACListenerS160S0100000_26(c1738450vL9, 84), c1738450vL9.itemView);
                }
            }

            @Override // X.AbstractC21673619ry
            public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                C1738450vL9 c1738450vL9 = new C1738450vL9(this.LL, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cw1, viewGroup, false), viewGroup.getContext());
                try {
                    View view = c1738450vL9.itemView;
                    if (view != null) {
                        view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
                c1738450vL9.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
                try {
                    if (c1738450vL9.itemView.getParent() != null) {
                        try {
                            SettingsManager.LIZLLL().getClass();
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                        if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                            StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                            stringBuffer.append(C1738450vL9.class.getName());
                            stringBuffer.append(" parent ");
                            stringBuffer.append(viewGroup.getClass().getName());
                            stringBuffer.append(" viewType ");
                            stringBuffer.append(i);
                            C1AF0.LIZJ(stringBuffer.toString());
                            ViewGroup viewGroup2 = (ViewGroup) c1738450vL9.itemView.getParent();
                            if (viewGroup2 != null) {
                                C786410Ut5.LJJJLZIJ(c1738450vL9.itemView, viewGroup2);
                            }
                        }
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C2081408Dk.LIZ(e2);
                    C2344809Gs.LIZ(e2);
                }
                C20612085q.LIZ = C1738450vL9.class.getName();
                return c1738450vL9;
            }
        };
        if (this.LLILLJJLI != null) {
            getDraftSubmissionItemList().setAdapter(abstractC21673619ry);
        }
    }

    public final void setDraftSubmissionItemList(RecyclerView recyclerView) {
        this.LLILLJJLI = recyclerView;
    }

    public final void setExpandingListContainer(FrameLayout frameLayout) {
        this.LLILLL = frameLayout;
    }

    public final void setItemView(View view) {
        this.LL = view;
    }
}
