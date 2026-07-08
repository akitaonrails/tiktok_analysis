package X;

import Y.ACListenerS74S0300000_7;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.FreeTrialInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.subscription.pgc.api.PGCSubscriptionProductDetailWithTemplateInfo;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.packagepage.model.ISubPackagePageAbility;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C513850KDf extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public boolean LL;
    public boolean LLILLJJLI;
    public C0KE8 LLILLL;
    public List<PGCSubscriptionProductDetailWithTemplateInfo> LLILZ;
    public ISubPackagePageAbility LLILZIL;
    public C0KC4 LLILZLL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<PGCSubscriptionProductDetailWithTemplateInfo> list = this.LLILZ;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final void LLLI(C0KE8 c0ke8) {
        ViewGroup viewGroup;
        RadioButton radioButton;
        C0KE8 c0ke82 = this.LLILLL;
        if (c0ke82 != null && (radioButton = c0ke82.LLIZLLLIL) != null) {
            radioButton.setChecked(false);
        }
        C0KE8 c0ke83 = this.LLILLL;
        if (c0ke83 != null && (viewGroup = c0ke83.LL) != null) {
            viewGroup.setBackground(viewGroup.getContext().getDrawable(R.drawable.dc2));
        }
        ViewGroup viewGroup2 = c0ke8.LL;
        viewGroup2.setBackground(viewGroup2.getContext().getDrawable(R.drawable.dc8));
        RadioButton radioButton2 = c0ke8.LLIZLLLIL;
        if (radioButton2 != null) {
            radioButton2.setChecked(true);
        }
        this.LLILLL = c0ke8;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
    }

    public static void LLLFZ(C0KE8 c0ke8, PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo) {
        String strLJI = C513890KDj.LJI(pGCSubscriptionProductDetailWithTemplateInfo);
        TextView textView = c0ke8.LLILZIL;
        textView.setText(C513890KDj.LIZ(textView, strLJI, C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo())));
        C0K0R.LIZJ(textView);
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfo;
        String str;
        long j;
        OfferInfo offerInfo;
        TagInfo tagInfo;
        String str2;
        TagInfo tagInfo2;
        String str3;
        String str4;
        int i2;
        OfferInfo offerInfo2;
        FreeTrialInfo freeTrialInfo;
        List<PGCSubscriptionProductDetailWithTemplateInfo> list = this.LLILZ;
        if (list != null && (pGCSubscriptionProductDetailWithTemplateInfo = (PGCSubscriptionProductDetailWithTemplateInfo) C13LP.LJJJLZIJ(i, list)) != null && (viewHolder instanceof C0KE8)) {
            C0KE8 c0ke8 = (C0KE8) viewHolder;
            RadioButton radioButton = c0ke8.LLIZLLLIL;
            if (radioButton != null) {
                radioButton.setClickable(false);
            }
            TextView textView = c0ke8.LLILLL;
            TemplateInfo templateInfo = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
            if (templateInfo == null || (str = templateInfo.tplName) == null) {
                str = "";
            }
            textView.setText(str);
            boolean zLJIIJJI = C513840KDe.LJIIJJI(pGCSubscriptionProductDetailWithTemplateInfo);
            boolean zLJIILIIL = C513840KDe.LJIILIIL(pGCSubscriptionProductDetailWithTemplateInfo);
            boolean zLJIIL = C513840KDe.LJIIL(pGCSubscriptionProductDetailWithTemplateInfo);
            if (zLJIIL) {
                TextView textView2 = c0ke8.LLILZ;
                TemplateInfo templateInfo2 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo2 != null && (offerInfo2 = templateInfo2.offerInfo) != null && (freeTrialInfo = offerInfo2.freeTrialInfo) != null) {
                    i2 = (int) freeTrialInfo.durationValue;
                } else {
                    i2 = 7;
                }
                textView2.setText(C511520K4g.LJ(2131755212, i2, Integer.valueOf(i2)));
                LLLFZ(c0ke8, pGCSubscriptionProductDetailWithTemplateInfo);
            } else {
                TextView textView3 = c0ke8.LLILZ;
                textView3.setText(C511960K5y.LIZ(textView3, C513840KDe.LJFF(pGCSubscriptionProductDetailWithTemplateInfo, true), C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()), zLJIILIIL));
                C0K0R.LIZJ(textView3);
                TextView textView4 = c0ke8.LLILZ;
                textView4.setText(C511960K5y.LIZ(textView4, C513840KDe.LJFF(pGCSubscriptionProductDetailWithTemplateInfo, true), C513840KDe.LJIILJJIL(pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo()), zLJIILIIL));
                C0K0R.LIZJ(textView4);
            }
            if (!zLJIILIIL && !zLJIIJJI && !zLJIIL) {
                C0K0R.LIZ(c0ke8.LLILZLL);
                C0K0R.LIZ(c0ke8.LLIZ);
            } else {
                TemplateInfo templateInfo3 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo3 != null && (tagInfo2 = templateInfo3.tagInfo) != null && (str3 = tagInfo2.promotionTitle) != null) {
                    if (C0K51.LJ(str3)) {
                        c0ke8.LLILZLL.setText(str3);
                        C0K0R.LIZJ(c0ke8.LLILZLL);
                    } else {
                        C0K0R.LIZ(c0ke8.LLILZLL);
                    }
                }
                TemplateInfo templateInfo4 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo4 != null && (tagInfo = templateInfo4.tagInfo) != null && (str2 = tagInfo.promotionDesc) != null) {
                    if (C0K51.LJ(str2)) {
                        c0ke8.LLIZ.setText(str2);
                        if (zLJIIL) {
                            C0K0R.LIZ(c0ke8.LLIZ);
                        } else {
                            C0K0R.LIZJ(c0ke8.LLIZ);
                        }
                    } else {
                        C0K0R.LIZ(c0ke8.LLIZ);
                    }
                }
                C0KEC c0kec = EnumC514030KDx.Companion;
                TemplateInfo templateInfo5 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo5 != null && (offerInfo = templateInfo5.offerInfo) != null) {
                    j = offerInfo.campaignType;
                } else {
                    j = 0;
                }
                c0kec.getClass();
                if (C1697810uHb.LJIIJJI(EnumC514030KDx.COMMON, EnumC514030KDx.CUSTOM_PROMOTION).contains(C0KEC.LIZ(j))) {
                    LLLFZ(c0ke8, pGCSubscriptionProductDetailWithTemplateInfo);
                }
            }
            ISubPackagePageAbility iSubPackagePageAbility = this.LLILZIL;
            if (iSubPackagePageAbility != null) {
                PGCSubscriptionProductDetailWithTemplateInfo pGCSubscriptionProductDetailWithTemplateInfoE7 = iSubPackagePageAbility.e7();
                if (this.LLILLJJLI) {
                    if (i == 0) {
                        this.LLILLJJLI = false;
                        ISubPackagePageAbility iSubPackagePageAbility2 = this.LLILZIL;
                        if (iSubPackagePageAbility2 != null) {
                            iSubPackagePageAbility2.js1(pGCSubscriptionProductDetailWithTemplateInfo);
                        }
                        LLLI(c0ke8);
                    }
                } else if (pGCSubscriptionProductDetailWithTemplateInfoE7 != null) {
                    TemplateInfo templateInfo6 = pGCSubscriptionProductDetailWithTemplateInfoE7.getTemplateInfo();
                    String str5 = null;
                    if (templateInfo6 != null) {
                        str4 = templateInfo6.basePlanId;
                    } else {
                        str4 = null;
                    }
                    TemplateInfo templateInfo7 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo7 != null) {
                        str5 = templateInfo7.basePlanId;
                    }
                    if (Intrinsics.LJFF(str4, str5)) {
                        LLLI(c0ke8);
                    }
                } else if (this.LL) {
                    TemplateInfo templateInfo8 = pGCSubscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo8 != null && templateInfo8.tplType == 2) {
                        ISubPackagePageAbility iSubPackagePageAbility3 = this.LLILZIL;
                        if (iSubPackagePageAbility3 != null) {
                            iSubPackagePageAbility3.js1(pGCSubscriptionProductDetailWithTemplateInfo);
                        }
                        LLLI(c0ke8);
                    }
                } else if (i == 0) {
                    ISubPackagePageAbility iSubPackagePageAbility4 = this.LLILZIL;
                    if (iSubPackagePageAbility4 != null) {
                        iSubPackagePageAbility4.js1(pGCSubscriptionProductDetailWithTemplateInfo);
                    }
                    LLLI(c0ke8);
                }
            }
            C786410Ut5.I7(new ACListenerS74S0300000_7(this, pGCSubscriptionProductDetailWithTemplateInfo, viewHolder, 7), viewHolder.itemView);
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0KE8 c0ke8 = new C0KE8(C0KEJ.LIZ(viewGroup, R.layout.fgw));
        try {
            View view = c0ke8.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c0ke8.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c0ke8.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C0KE8.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c0ke8.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c0ke8.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C0KE8.class.getName();
        return c0ke8;
    }
}
