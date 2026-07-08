package X;

import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.ability.LandscapeFeedAutoPlayAbility;
import com.ss.android.ugc.aweme.feed.landscape.cell.assem.speed.LandscapeCellSpeedAssem;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandScapeFeedIntroAbility;
import com.ss.android.ugc.aweme.feed.landscape.component.ability.LandscapeFeedPlayerAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS7S0000001_11;

/* JADX INFO: renamed from: X.0DVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C340340DVw extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final Context LL;
    public final ArrayList<C340360DVy> LLILLJJLI;
    public int LLILLL;
    public C708140Rq8 LLILZ;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LLILLJJLI.size();
    }

    public C340340DVw(Context context, ArrayList<C340360DVy> arrayList) {
        this.LL = context;
        this.LLILLJJLI = arrayList;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int i) {
        if (!(viewHolder instanceof C340350DVx)) {
            return;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.0Rq7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                float fFloatValue;
                C2189821An6 c2189821An6;
                LandscapeFeedPlayerAbility landscapeFeedPlayerAbility;
                C0RJN c0rjnLIZIZ;
                C708140Rq8 c708140Rq8 = this.LL.LLILZ;
                if (c708140Rq8 != null) {
                    int i3 = i;
                    ArrayList<C340360DVy> arrayList = c708140Rq8.LIZ.LLJLIL;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        i2 = 0;
                        while (i2 < size) {
                            if (((C340360DVy) ListProtector.get(arrayList, i2)).LIZIZ) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                        i2 = -1;
                    } else {
                        i2 = -1;
                    }
                    if (i2 != i3) {
                        C586360MzC c586360MzC = C586360MzC.LIZ;
                        Aweme aweme = c708140Rq8.LIZIZ.getAweme();
                        String str = c708140Rq8.LIZIZ.mEventType;
                        List<Float> list = LandscapeCellSpeedAssem.LLJZIJLIL;
                        float fFloatValue2 = ((Number) ListProtector.get(list, i3)).floatValue();
                        if (i2 != -1) {
                            fFloatValue = ((Number) ListProtector.get(list, i2)).floatValue();
                        } else {
                            fFloatValue = 1.0f;
                        }
                        Context context = c708140Rq8.LIZJ;
                        Fragment fragmentLJI = C724240Sb0.LJI(c708140Rq8.LIZ);
                        AnimatorSet animatorSet = null;
                        if (fragmentLJI != null && (c0rjnLIZIZ = C1578630rBN.LIZIZ(fragmentLJI)) != null) {
                            c2189821An6 = c0rjnLIZIZ.LIZJ;
                        } else {
                            c2189821An6 = null;
                        }
                        c586360MzC.getClass();
                        C586360MzC.LIZ(aweme, str, "click_landscape_screen_button", fFloatValue2, fFloatValue, context, 0L, c2189821An6);
                        c708140Rq8.LIZLLL.vibrate(12L);
                        c708140Rq8.LIZ.dp(i3);
                        C340340DVw c340340DVw = c708140Rq8.LIZ.LLJJJJLIIL;
                        if (c340340DVw != null) {
                            c340340DVw.notifyDataSetChanged();
                        }
                        AssemViewModel assemViewModel = (AssemViewModel) c708140Rq8.LIZ.LLJLLIL.getValue();
                        float fFloatValue3 = ((Number) ListProtector.get(list, i3)).floatValue();
                        assemViewModel.getClass();
                        assemViewModel.setState(new AwS7S0000001_11(fFloatValue3, 1));
                        AssemViewModel assemViewModel2 = (AssemViewModel) c708140Rq8.LIZ.LLJLLL.getValue();
                        float fFloatValue4 = ((Number) ListProtector.get(list, i3)).floatValue();
                        assemViewModel2.getClass();
                        assemViewModel2.setState(new AwS7S0000001_11(fFloatValue4, 0));
                        Fragment fragmentLJI2 = C724240Sb0.LJI(c708140Rq8.LIZ);
                        if (fragmentLJI2 != null && (landscapeFeedPlayerAbility = (LandscapeFeedPlayerAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLJI2, null), LandscapeFeedPlayerAbility.class, null)) != null) {
                            landscapeFeedPlayerAbility.gO0(((Number) ListProtector.get(list, i3)).floatValue());
                        }
                        if (C692480REg.LIZ()) {
                            LandscapeFeedAutoPlayAbility landscapeFeedAutoPlayAbility = (LandscapeFeedAutoPlayAbility) C1558520qew.LIZ(C1558520qew.LJIIL(c708140Rq8.LIZ), LandscapeFeedAutoPlayAbility.class, null);
                            if (landscapeFeedAutoPlayAbility != null) {
                                landscapeFeedAutoPlayAbility.ic1();
                            }
                            LandScapeFeedIntroAbility landScapeFeedIntroAbility = (LandScapeFeedIntroAbility) C1558520qew.LIZ(C1558520qew.LJIIL(c708140Rq8.LIZ), LandScapeFeedIntroAbility.class, null);
                            if (landScapeFeedIntroAbility != null) {
                                landScapeFeedIntroAbility.iI();
                            }
                        }
                        AnimatorSet animatorSet2 = c708140Rq8.LIZ.LLJL;
                        if (animatorSet2 != null) {
                            animatorSet = animatorSet2;
                        }
                        animatorSet.start();
                    }
                }
            }
        }, viewHolder.itemView);
        C340350DVx c340350DVx = (C340350DVx) viewHolder;
        c340350DVx.LL.setText(((C340360DVy) ListProtector.get(this.LLILLJJLI, i)).LIZ);
        if (((C340360DVy) ListProtector.get(this.LLILLJJLI, i)).LIZIZ) {
            c340350DVx.LL.setTextColor(C960203pA.LIZ(R.attr.a1h, C1385040m98.LIZ(this.LL, false)));
            if (i == 0) {
                c340350DVx.LL.setBackgroundResource(R.drawable.cet);
                return;
            } else if (i == getItemCount() - 1) {
                c340350DVx.LL.setBackgroundResource(R.drawable.ceu);
                return;
            } else {
                c340350DVx.LL.setBackgroundResource(R.drawable.ces);
                return;
            }
        }
        c340350DVx.LL.setTextColor(C960203pA.LIZ(R.attr.ef, this.LL));
        c340350DVx.LL.setBackgroundResource(R.drawable.cer);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(this.LL), R.layout.d0l, viewGroup, false);
        if (this.LLILLL > 0) {
            viewTd.getLayoutParams().height = this.LLILLL / getItemCount();
        }
        C340350DVx c340350DVx = new C340350DVx(viewTd);
        try {
            View view = c340350DVx.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c340350DVx.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c340350DVx.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C340350DVx.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c340350DVx.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c340350DVx.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C340350DVx.class.getName();
        return c340350DVx;
    }
}
