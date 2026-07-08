package X;

import Y.ACListenerS74S0300000_7;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.FreeTrialInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KDI extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final UpDowngradePackageViewModel LL;
    public final Map<String, String> LLILLJJLI;
    public boolean LLILLL;
    public C0KDJ LLILZ;
    public C0KCJ LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<PGCSubscriptionProductDetailWithTemplateInfo> list;
        C0KCJ c0kcj = this.LLILZIL;
        if (c0kcj == null || (list = c0kcj.LIZ) == null) {
            return 0;
        }
        return list.size();
    }

    public final void LLLFZ(C0KDJ c0kdj) {
        C1841350y17 c1841350y17;
        ConstraintLayout constraintLayout;
        Drawable drawable;
        Context context = c0kdj.itemView.getContext();
        C0KDJ c0kdj2 = this.LLILZ;
        Drawable drawable2 = null;
        if (c0kdj2 != null && (constraintLayout = c0kdj2.LL) != null) {
            if (context != null) {
                drawable = context.getDrawable(R.drawable.dc5);
            } else {
                drawable = null;
            }
            constraintLayout.setBackground(drawable);
        }
        C0KDJ c0kdj3 = this.LLILZ;
        if (c0kdj3 != null && (c1841350y17 = c0kdj3.LLJ) != null) {
            c1841350y17.setChecked(false);
        }
        ConstraintLayout constraintLayout2 = c0kdj.LL;
        if (context != null) {
            drawable2 = context.getDrawable(R.drawable.dc6);
        }
        constraintLayout2.setBackground(drawable2);
        c0kdj.LLJ.setChecked(true);
        this.LLILZ = c0kdj;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
    }

    public C0KDI(UpDowngradePackageViewModel upDowngradePackageViewModel, Map<String, String> map) {
        this.LL = upDowngradePackageViewModel;
        this.LLILLJJLI = map;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<PGCSubscriptionProductDetailWithTemplateInfo> list;
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo;
        String str;
        C0KDH c0kdh;
        String str2;
        int i2;
        int i3;
        String strLJ;
        String str3;
        String str4;
        TagInfo tagInfo;
        String str5;
        TagInfo tagInfo2;
        String str6;
        ConstraintLayout constraintLayout;
        Drawable drawable;
        LiveData<PGCSubscriptionProductDetailWithTemplateInfo> liveData;
        String str7;
        String str8;
        TemplateInfo templateInfo;
        int i4;
        OfferInfo offerInfo;
        FreeTrialInfo freeTrialInfo;
        OfferInfo offerInfo2;
        FreeTrialInfo freeTrialInfo2;
        Map<String, C0KDH> map;
        C0KCJ c0kcj = this.LLILZIL;
        if (c0kcj != null && (list = c0kcj.LIZ) != null && (pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) C13LP.LJJJLZIJ(i, list)) != null) {
            boolean zLJIIL = C513840KDe.LJIIL(pGCSubscriptionProductDetailWithTemplateInfo);
            if (viewHolder instanceof C0KDJ) {
                TemplateInfo templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                String str9 = "";
                if (templateInfo2 == null || (str = templateInfo2.packageId) == null) {
                    str = "";
                }
                C0KCJ c0kcj2 = this.LLILZIL;
                Drawable drawable2 = null;
                if (c0kcj2 != null && (map = c0kcj2.LIZLLL) != null) {
                    c0kdh = map.get(str);
                } else {
                    c0kdh = null;
                }
                C0KDJ c0kdj = (C0KDJ) viewHolder;
                TuxTextView tuxTextView = c0kdj.LLILLJJLI;
                if (c0kdh != null) {
                    str2 = c0kdh.LIZ;
                } else {
                    str2 = null;
                }
                tuxTextView.setText(str2);
                if (zLJIIL) {
                    TuxTextView tuxTextView2 = c0kdj.LLILLL;
                    TemplateInfo templateInfo3 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    int i5 = 7;
                    if (templateInfo3 != null && (offerInfo2 = templateInfo3.offerInfo) != null && (freeTrialInfo2 = offerInfo2.freeTrialInfo) != null) {
                        i4 = (int) freeTrialInfo2.durationValue;
                    } else {
                        i4 = 7;
                    }
                    tuxTextView2.setText(C511520K4g.LJ(2131755212, i4, Integer.valueOf(i4)));
                    String strLJI = C513890KDj.LJI(pGCSubscriptionProductDetailWithTemplateInfo);
                    C0K0R.LIZJ(c0kdj.LLIZ);
                    TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo4 != null && (offerInfo = templateInfo4.offerInfo) != null && (freeTrialInfo = offerInfo.freeTrialInfo) != null) {
                        i5 = (int) freeTrialInfo.durationValue;
                    }
                    c0kdj.LLIZ.setText(C511520K4g.LJ(2131755211, i5, Integer.valueOf(i5), strLJI));
                    C0K0R.LIZJ(c0kdj.LLILZLL);
                    TuxTextView tuxTextView3 = c0kdj.LLILZLL;
                    tuxTextView3.setText(C513890KDj.LIZ(tuxTextView3, strLJI, C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo())));
                    C0K0R.LIZJ(tuxTextView3);
                } else {
                    c0kdj.LLILLL.setText(C0KDL.LIZ(C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()), C513840KDe.LJFF(pGCSubscriptionProductDetailWithTemplateInfo, true)));
                }
                if (c0kdh != null) {
                    i2 = c0kdh.LIZIZ;
                    i3 = c0kdh.LIZJ;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                TuxTextView tuxTextView4 = c0kdj.LLILZIL;
                if (i3 > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C511520K4g.LJ(2131755461, i3, Integer.valueOf(i3)));
                    sbLIZ.append(" · ");
                    sbLIZ.append(C511520K4g.LJ(2131755460, i2, Integer.valueOf(i2)));
                    strLJ = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLJ = C511520K4g.LJ(2131755460, i2, Integer.valueOf(i2));
                }
                tuxTextView4.setText(strLJ);
                UpDowngradePackageViewModel upDowngradePackageViewModel = this.LL;
                if (upDowngradePackageViewModel != null && (liveData = upDowngradePackageViewModel.LLIZLLLIL) != null && liveData.getValue() != null) {
                    PGCSubscriptionProductDetailWithTemplateInfo value = this.LL.LLIZLLLIL.getValue();
                    if (value != null && (templateInfo = value.getTemplateInfo()) != null) {
                        str7 = templateInfo.basePlanId;
                    } else {
                        str7 = null;
                    }
                    TemplateInfo templateInfo5 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo5 != null) {
                        str8 = templateInfo5.basePlanId;
                    } else {
                        str8 = null;
                    }
                    if (Intrinsics.LJFF(str7, str8)) {
                        LLLFZ(c0kdj);
                    }
                } else if (i == 0) {
                    UpDowngradePackageViewModel upDowngradePackageViewModel2 = this.LL;
                    if (upDowngradePackageViewModel2 != null) {
                        TemplateInfo templateInfo6 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                        if (templateInfo6 != null) {
                            str3 = templateInfo6.iapId;
                        } else {
                            str3 = null;
                        }
                        TemplateInfo templateInfo7 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                        if (templateInfo7 != null) {
                            str4 = templateInfo7.basePlanId;
                        } else {
                            str4 = null;
                        }
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (str4 != null) {
                            str9 = str4;
                        }
                        upDowngradePackageViewModel2.LLIZ.setValue(new C0KDK(str3, str9));
                    }
                    LLLFZ(c0kdj);
                }
                if (this.LLILLL) {
                    Context context = c0kdj.itemView.getContext();
                    C0KDJ c0kdj2 = this.LLILZ;
                    if (c0kdj2 != null && (constraintLayout = c0kdj2.LL) != null) {
                        if (context != null) {
                            drawable = context.getDrawable(R.drawable.dc_);
                        } else {
                            drawable = null;
                        }
                        constraintLayout.setBackground(drawable);
                    }
                    ConstraintLayout constraintLayout2 = c0kdj.LL;
                    if (context != null) {
                        drawable2 = context.getDrawable(R.drawable.dc9);
                    }
                    constraintLayout2.setBackground(drawable2);
                    C1841350y17 c1841350y17 = c0kdj.LLJ;
                    if (c1841350y17 != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1841350y17);
                        c1841350y17.setAlpha(0.34f);
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.f_j, c0kdj.LLILZIL.getContext());
                    if (numLIZJ != null) {
                        c0kdj.LLILZIL.setTextColor(numLIZJ.intValue());
                    }
                }
                C786410Ut5.I7(new ACListenerS74S0300000_7(this, pGCSubscriptionProductDetailWithTemplateInfo, viewHolder, 9), viewHolder.itemView);
                pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                TemplateInfo templateInfo8 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo8 != null && (tagInfo2 = templateInfo8.tagInfo) != null && (str6 = tagInfo2.promotionTitle) != null) {
                    if (C0K51.LJ(str6)) {
                        C0KDJ c0kdj3 = (C0KDJ) viewHolder;
                        c0kdj3.LLIZLLLIL.setText(str6);
                        C0K0R.LIZJ(c0kdj3.LLIZLLLIL);
                    } else {
                        C0K0R.LIZ(((C0KDJ) viewHolder).LLIZLLLIL);
                    }
                }
                TemplateInfo templateInfo9 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo9 != null && (tagInfo = templateInfo9.tagInfo) != null && (str5 = tagInfo.promotionDesc) != null) {
                    if (C0K51.LJ(str5)) {
                        C0KDJ c0kdj4 = (C0KDJ) viewHolder;
                        c0kdj4.LLILZ.setText(str5);
                        C0K0R.LIZJ(c0kdj4.LLILZ);
                        c0kdj4.LLILLL.setMaxWidth((int) ((C511520K4g.LJI() - c0kdj4.LLILZ.getPaint().measureText(str5)) - ((int) C511520K4g.LIZ(104.0f))));
                        return;
                    }
                    C0K0R.LIZ(((C0KDJ) viewHolder).LLILZ);
                }
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0KDJ c0kdj = new C0KDJ(C0KEJ.LIZ(viewGroup, R.layout.fif));
        try {
            View view = c0kdj.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0kdj.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0kdj.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KDJ.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0kdj.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0kdj.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KDJ.class.getName();
        return c0kdj;
    }
}
