package X;

import Y.AUListenerS230S0200000_27;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.bytedance.ies.ugc.aweme.rich.model.commercialize.model.LeftSlideGuideConfig;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.rich.reward.GmtRewardAdModel;
import com.ss.android.ugc.aweme.rich.reward.ui.carousel.RewardPagerLayoutManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0y75, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1845050y75 extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public final List<String> LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1032140cxw LLILLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size() + 1;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        if (i == this.LL.size()) {
            return 1;
        }
        return 0;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C1845070y77) {
            ((C1845070y77) viewHolder).LL.LIZJ();
        }
    }

    public C1845050y75(C1032140cxw c1032140cxw, List<String> list) {
        this.LLILLL = c1032140cxw;
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        LeftSlideGuideConfig leftSlideGuideConfig;
        String str;
        ViewGroup viewGroup;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup2;
        String guideText = null;
        if (viewHolder instanceof C1845070y77) {
            if (i < this.LL.size()) {
                str = (String) ListProtector.get(this.LL, i);
            } else {
                str = null;
            }
            final C1845070y77 c1845070y77 = (C1845070y77) viewHolder;
            View view = c1845070y77.itemView;
            if ((view instanceof ViewGroup) && (viewGroup = (ViewGroup) view) != null) {
                C1845060y76 c1845060y76 = c1845070y77.LL;
                if (c1845060y76.LIZ != viewGroup || c1845060y76.LIZIZ == null) {
                    c1845060y76.LIZ = viewGroup;
                    C426320Gne c426320Gne = c1845060y76.LIZIZ;
                    if (c426320Gne == null) {
                        c426320Gne = new C426320Gne(viewGroup.getContext(), null, 6);
                        c1845060y76.LIZIZ = c426320Gne;
                    }
                    if (c426320Gne.getId() == -1) {
                        c426320Gne.setId(View.generateViewId());
                    }
                    if (c426320Gne.getParent() != viewGroup) {
                        ViewParent parent = c426320Gne.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                            C786410Ut5.LJJJLZIJ(c426320Gne, viewGroup2);
                        }
                        if (viewGroup instanceof FrameLayout) {
                            layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))), 17);
                        } else if (viewGroup instanceof ConstraintLayout) {
                            C19ME c19me = new C19ME(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))));
                            c19me.startToStart = 0;
                            c19me.endToEnd = 0;
                            c19me.topToTop = 0;
                            c19me.bottomToBottom = 0;
                            layoutParams = c19me;
                        } else {
                            layoutParams = new ViewGroup.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(64.0f))));
                        }
                        viewGroup.addView(c426320Gne, layoutParams);
                    }
                    C786410Ut5.LLLZZ(c426320Gne, 8);
                    C786410Ut5.E5(c426320Gne, 1.0f);
                    c426320Gne.LIZ(10.0f, false);
                    c1845060y76.LIZLLL = 10.0f;
                }
                final C1322110kVd c1322110kVd = (C1322110kVd) c1845070y77.LLILLJJLI.getValue();
                if (c1322110kVd != null) {
                    if (str != null && str.length() != 0) {
                        C1845060y76 c1845060y762 = c1845070y77.LL;
                        C426320Gne c426320Gne2 = c1845060y762.LIZIZ;
                        if (c426320Gne2 != null && c1845060y762.LIZ != null) {
                            C786410Ut5.LLLZZ(c426320Gne2, 0);
                            C786410Ut5.E5(c426320Gne2, 1.0f);
                            if (c1845060y762.LIZLLL == 10.0f) {
                                c1845060y762.LIZ();
                                c426320Gne2.LIZ(10.0f, false);
                                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(10.0f, 65.0f);
                                valueAnimatorOfFloat.setDuration(1000L);
                                valueAnimatorOfFloat.addUpdateListener(new AUListenerS230S0200000_27(c1845060y762, c426320Gne2, 16));
                                valueAnimatorOfFloat.start();
                                c1845060y762.LIZJ = valueAnimatorOfFloat;
                            }
                        }
                        final C1032140cxw c1032140cxw = c1845070y77.LLILLL.LLILLL;
                        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0d0Y
                            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                            public final void LIZLLL(String str2, Throwable th) {
                                RecyclerView recyclerView;
                                View viewFindViewByPosition;
                                InterfaceC1032440cyQ interfaceC1032440cyQ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("load image failed position:");
                                sbLIZ.append(c1845070y77.getAbsoluteAdapterPosition());
                                C2188811AlT.LIZIZ(sbLIZ);
                                c1845070y77.LL.LIZIZ();
                                int absoluteAdapterPosition = c1845070y77.getAbsoluteAdapterPosition();
                                if (absoluteAdapterPosition != -1) {
                                    c1032140cxw.LIZJ();
                                    if (absoluteAdapterPosition >= 0 && absoluteAdapterPosition < ((ArrayList) c1032140cxw.LJIJI).size()) {
                                        ListProtector.set(c1032140cxw.LJIJI, absoluteAdapterPosition, Boolean.FALSE);
                                    }
                                    C1032140cxw c1032140cxw2 = c1032140cxw;
                                    RewardPagerLayoutManager rewardPagerLayoutManager = c1032140cxw2.LIZLLL;
                                    if (rewardPagerLayoutManager != null && (recyclerView = c1032140cxw2.LIZJ) != null && recyclerView.getWidth() != 0 && absoluteAdapterPosition >= 0 && absoluteAdapterPosition < c1032140cxw2.LJFF.size() && (viewFindViewByPosition = rewardPagerLayoutManager.findViewByPosition(absoluteAdapterPosition)) != null && viewFindViewByPosition.getLeft() < recyclerView.getWidth() && viewFindViewByPosition.getRight() > 0 && (interfaceC1032440cyQ = c1032140cxw.LJIIIZ) != null) {
                                        interfaceC1032440cyQ.LIZ();
                                    }
                                }
                            }

                            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                            public final void LJ(String str2, Object obj, Animatable animatable) {
                                int iIntValue;
                                int iIntValue2;
                                ImageView.ScaleType scaleType;
                                float f;
                                InterfaceC1320380kSq interfaceC1320380kSq;
                                ConstraintLayout constraintLayout;
                                InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("load image success position:");
                                sbLIZ.append(c1845070y77.getAbsoluteAdapterPosition());
                                C2188811AlT.LIZIZ(sbLIZ);
                                c1845070y77.LL.LIZIZ();
                                if (interfaceC1330440kj4 != null) {
                                    Integer numValueOf = Integer.valueOf(interfaceC1330440kj4.getWidth());
                                    Integer numValueOf2 = Integer.valueOf(interfaceC1330440kj4.getHeight());
                                    if (numValueOf != null) {
                                        iIntValue = numValueOf.intValue();
                                    } else {
                                        iIntValue = 1;
                                    }
                                    if (numValueOf2 != null && numValueOf2.intValue() != 0) {
                                        iIntValue2 = numValueOf2.intValue();
                                    } else {
                                        iIntValue2 = 1;
                                    }
                                    if (((int) Math.rint((((double) iIntValue) / ((double) iIntValue2)) * ((double) 100))) / 100 <= ((Number) C340270DVp.LIZ.getValue()).floatValue()) {
                                        scaleType = ImageView.ScaleType.CENTER_CROP;
                                    } else {
                                        scaleType = ImageView.ScaleType.FIT_CENTER;
                                    }
                                    if (C340250DVn.LIZ[scaleType.ordinal()] == 1) {
                                        f = 0.83f;
                                    } else {
                                        f = 1.0f;
                                    }
                                    C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
                                    int i3 = C340240DVm.LIZ[scaleType.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 != 2) {
                                            interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                                        } else {
                                            interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
                                        }
                                    } else {
                                        interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
                                    }
                                    hierarchy.LJIIZILJ(interfaceC1320380kSq);
                                    View view2 = c1845070y77.itemView;
                                    if ((view2 instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) view2) != null && !Float.isNaN(f)) {
                                        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
                                        C19MB c19mb = new C19MB();
                                        c19mb.LJII(constraintLayout);
                                        c19mb.LJIJI(R.id.til).LIZLLL.LJJJJZI = fLIZLLL;
                                        c19mb.LIZIZ(constraintLayout);
                                    }
                                }
                                int absoluteAdapterPosition = c1845070y77.getAbsoluteAdapterPosition();
                                if (absoluteAdapterPosition != -1) {
                                    c1032140cxw.LIZJ();
                                    if (absoluteAdapterPosition >= 0 && absoluteAdapterPosition < ((ArrayList) c1032140cxw.LJIJI).size()) {
                                        ListProtector.set(c1032140cxw.LJIJI, absoluteAdapterPosition, Boolean.TRUE);
                                    }
                                    InterfaceC1032440cyQ interfaceC1032440cyQ = c1032140cxw.LJIIIZ;
                                    if (interfaceC1032440cyQ != null) {
                                        interfaceC1032440cyQ.LIZJ();
                                    }
                                }
                            }
                        };
                        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                        c1320810kTXLIZJ.LJII(str);
                        c1320810kTXLIZJ.LJIIIIZZ = c1320700kTM;
                        c1320810kTXLIZJ.LJIILJJIL = c1322110kVd.getController();
                        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("start load image position:");
                        sbLIZ.append(c1845070y77.getAbsoluteAdapterPosition());
                        C2188811AlT.LIZIZ(sbLIZ);
                        c1322110kVd.setController(abstractC1320710kTNLIZ);
                        return;
                    }
                    c1845070y77.LL.LIZJ();
                    return;
                }
                return;
            }
            return;
        }
        if (!(viewHolder instanceof C1845080y78)) {
            return;
        }
        C1845080y78 c1845080y78 = (C1845080y78) viewHolder;
        GmtRewardAdModel gmtRewardAdModel = this.LLILLL.LIZ;
        TextView textView = (TextView) c1845080y78.LLILLJJLI.getValue();
        if (textView != null) {
            GMTBaseModel gMTBaseModel = gmtRewardAdModel.awemeRawAd;
            if (gMTBaseModel != null && (leftSlideGuideConfig = gMTBaseModel.getLeftSlideGuideConfig()) != null) {
                guideText = leftSlideGuideConfig.getGuideText();
            }
            textView.setText(guideText);
        }
        int i3 = this.LLILLJJLI;
        TuxIconView tuxIconView = (TuxIconView) c1845080y78.LL.getValue();
        if (tuxIconView == null) {
            return;
        }
        if (i3 == 2) {
            i2 = R.raw.icon_tick_circle_fill;
        } else {
            i2 = R.raw.icon_arrow_left_circle_ltr;
        }
        tuxIconView.setIconRes(i2);
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1845080y78;
        if (i == 0) {
            c1845080y78 = new C1845070y77(this, C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.cct, viewGroup, false));
        } else {
            c1845080y78 = new C1845080y78(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.ccs, viewGroup, false));
        }
        try {
            View view = c1845080y78.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1845080y78.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1845080y78.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1845080y78.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1845080y78.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1845080y78.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1845080y78.getClass().getName();
        return c1845080y78;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        int i2;
        if ((viewHolder instanceof C1845080y78) && list.contains("payload_hint_bg")) {
            int i3 = this.LLILLJJLI;
            TuxIconView tuxIconView = (TuxIconView) ((C1845080y78) viewHolder).LL.getValue();
            if (tuxIconView != null) {
                if (i3 == 2) {
                    i2 = R.raw.icon_tick_circle_fill;
                } else {
                    i2 = R.raw.icon_arrow_left_circle_ltr;
                }
                tuxIconView.setIconRes(i2);
                return;
            }
            return;
        }
        super.onBindViewHolder(viewHolder, i, list);
    }
}
