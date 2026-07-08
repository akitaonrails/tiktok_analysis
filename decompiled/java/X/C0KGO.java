package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.chatroom.api.FreeTrialInfo;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.viewmodel.UpDowngradePackageViewModel;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.OfferInfo;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGO extends AbstractC21673619ry<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LLILZLL = 0;
    public final UpDowngradePackageViewModel LL;
    public final Map<String, String> LLILLJJLI;
    public boolean LLILLL;
    public C514780KGu LLILZ;
    public C514830KGz LLILZIL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        List<SubscriptionProductDetailWithTemplateInfo> list;
        C514830KGz c514830KGz = this.LLILZIL;
        if (c514830KGz == null || (list = c514830KGz.LIZ) == null) {
            return 0;
        }
        return list.size();
    }

    public final void LLLI(C514780KGu c514780KGu) {
        RadioButton radioButton;
        View view;
        Drawable drawable;
        Context context = c514780KGu.itemView.getContext();
        C514780KGu c514780KGu2 = this.LLILZ;
        Drawable drawable2 = null;
        if (c514780KGu2 != null && (view = c514780KGu2.itemView) != null) {
            if (context != null) {
                drawable = context.getDrawable(R.drawable.fby);
            } else {
                drawable = null;
            }
            view.setBackground(drawable);
        }
        C514780KGu c514780KGu3 = this.LLILZ;
        if (c514780KGu3 != null && (radioButton = c514780KGu3.LLJ) != null) {
            radioButton.setChecked(false);
        }
        View view2 = c514780KGu.itemView;
        if (context != null) {
            drawable2 = context.getDrawable(R.drawable.fbz);
        }
        view2.setBackground(drawable2);
        c514780KGu.LLJ.setChecked(true);
        this.LLILZ = c514780KGu;
    }

    @Override // X.AbstractC21673619ry
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        if (viewHolder instanceof C514780KGu) {
            C514780KGu c514780KGu = (C514780KGu) viewHolder;
            CountDownTimer countDownTimer = c514780KGu.LLIZLLLIL;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            c514780KGu.LLIZLLLIL = null;
        }
    }

    public C0KGO(UpDowngradePackageViewModel upDowngradePackageViewModel, Map<String, String> map) {
        this.LL = upDowngradePackageViewModel;
        this.LLILLJJLI = map;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, int i) {
        List<SubscriptionProductDetailWithTemplateInfo> list;
        final SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo;
        String str;
        C0KFB c0kfb;
        String str2;
        int i2;
        int i3;
        String strLJIIL;
        String str3;
        String str4;
        OfferInfo offerInfo;
        long j;
        TagInfo tagInfo;
        String str5;
        TagInfo tagInfo2;
        String str6;
        Drawable drawable;
        View view;
        Drawable drawable2;
        LiveData<SubscriptionProductDetailWithTemplateInfo> liveData;
        String str7;
        String str8;
        TemplateInfo templateInfo;
        int i4;
        OfferInfo offerInfo2;
        FreeTrialInfo freeTrialInfo;
        OfferInfo offerInfo3;
        FreeTrialInfo freeTrialInfo2;
        Map<String, C0KFB> map;
        C514830KGz c514830KGz = this.LLILZIL;
        if (c514830KGz != null && (list = c514830KGz.LIZ) != null && (subscriptionProductDetailWithTemplateInfo = (SubscriptionProductDetailWithTemplateInfo) C13LP.LJJJLZIJ(i, list)) != null) {
            boolean zLJIIL = C513940KDo.LJIIL(subscriptionProductDetailWithTemplateInfo);
            if (viewHolder instanceof C514780KGu) {
                TemplateInfo templateInfo2 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                String str9 = "";
                if (templateInfo2 == null || (str = templateInfo2.packageId) == null) {
                    str = "";
                }
                C514830KGz c514830KGz2 = this.LLILZIL;
                String string = null;
                if (c514830KGz2 != null && (map = c514830KGz2.LIZLLL) != null) {
                    c0kfb = map.get(str);
                } else {
                    c0kfb = null;
                }
                C514780KGu c514780KGu = (C514780KGu) viewHolder;
                C16F5 c16f5 = c514780KGu.LL;
                if (c0kfb != null) {
                    str2 = c0kfb.LIZ;
                } else {
                    str2 = null;
                }
                c16f5.setText(str2);
                if (zLJIIL) {
                    C16F5 c16f52 = c514780KGu.LLILLJJLI;
                    TemplateInfo templateInfo3 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    int i5 = 7;
                    if (templateInfo3 != null && (offerInfo3 = templateInfo3.offerInfo) != null && (freeTrialInfo2 = offerInfo3.freeTrialInfo) != null) {
                        i4 = (int) freeTrialInfo2.durationValue;
                    } else {
                        i4 = 7;
                    }
                    c16f52.setText(C497740JfY.LJIIL(2131755212, i4, Integer.valueOf(i4)));
                    String strLJI = C513900KDk.LJI(subscriptionProductDetailWithTemplateInfo);
                    C500260Jjc.LLFFF(c514780KGu.LLILZLL);
                    TemplateInfo templateInfo4 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo4 != null && (offerInfo2 = templateInfo4.offerInfo) != null && (freeTrialInfo = offerInfo2.freeTrialInfo) != null) {
                        i5 = (int) freeTrialInfo.durationValue;
                    }
                    c514780KGu.LLILZLL.setText(C497740JfY.LJIIL(2131755211, i5, Integer.valueOf(i5), strLJI));
                    C500260Jjc.LLFFF(c514780KGu.LLILZIL);
                    C16F5 c16f53 = c514780KGu.LLILZIL;
                    c16f53.setText(C513900KDk.LIZ(c16f53, strLJI, C513940KDo.LJIILJJIL(subscriptionProductDetailWithTemplateInfo.getTemplateInfo())));
                    C500260Jjc.LLFFF(c16f53);
                } else {
                    C16F5 c16f54 = c514780KGu.LLILLJJLI;
                    c16f54.setText(C0IQD.LIZ(c16f54, C513940KDo.LJIILJJIL(subscriptionProductDetailWithTemplateInfo.getTemplateInfo()), C513940KDo.LJFF(subscriptionProductDetailWithTemplateInfo, true)));
                }
                if (c0kfb != null) {
                    i2 = c0kfb.LIZIZ;
                    i3 = c0kfb.LIZJ;
                } else {
                    i2 = 0;
                    i3 = 0;
                }
                C16F5 c16f55 = c514780KGu.LLILZ;
                if (i3 > 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(C497740JfY.LJIIL(2131755569, i3, Integer.valueOf(i3)));
                    sbLIZ.append(" · ");
                    sbLIZ.append(C497740JfY.LJIIL(2131755568, i2, Integer.valueOf(i2)));
                    strLJIIL = C2188811AlT.LIZIZ(sbLIZ);
                } else {
                    strLJIIL = C497740JfY.LJIIL(2131755568, i2, Integer.valueOf(i2));
                }
                c16f55.setText(strLJIIL);
                UpDowngradePackageViewModel upDowngradePackageViewModel = this.LL;
                if (upDowngradePackageViewModel != null && (liveData = upDowngradePackageViewModel.LLIZLLLIL) != null && liveData.getValue() != null) {
                    SubscriptionProductDetailWithTemplateInfo value = this.LL.LLIZLLLIL.getValue();
                    if (value != null && (templateInfo = value.getTemplateInfo()) != null) {
                        str7 = templateInfo.basePlanId;
                    } else {
                        str7 = null;
                    }
                    TemplateInfo templateInfo5 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                    if (templateInfo5 != null) {
                        str8 = templateInfo5.basePlanId;
                    } else {
                        str8 = null;
                    }
                    if (Intrinsics.LJFF(str7, str8)) {
                        LLLI(c514780KGu);
                    }
                } else if (i == 0) {
                    UpDowngradePackageViewModel upDowngradePackageViewModel2 = this.LL;
                    if (upDowngradePackageViewModel2 != null) {
                        TemplateInfo templateInfo6 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                        if (templateInfo6 != null) {
                            str3 = templateInfo6.iapId;
                        } else {
                            str3 = null;
                        }
                        TemplateInfo templateInfo7 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
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
                        upDowngradePackageViewModel2.LLIZ.setValue(new C0KJ5(str3, str9));
                    }
                    LLLI(c514780KGu);
                }
                if (this.LLILLL) {
                    Context context = c514780KGu.itemView.getContext();
                    C514780KGu c514780KGu2 = this.LLILZ;
                    if (c514780KGu2 != null && (view = c514780KGu2.itemView) != null) {
                        if (context != null) {
                            drawable2 = context.getDrawable(R.drawable.fc5);
                        } else {
                            drawable2 = null;
                        }
                        view.setBackground(drawable2);
                    }
                    View view2 = c514780KGu.itemView;
                    if (context != null) {
                        drawable = context.getDrawable(R.drawable.fc3);
                    } else {
                        drawable = null;
                    }
                    view2.setBackground(drawable);
                    RadioButton radioButton = c514780KGu.LLJ;
                    if (radioButton != null) {
                        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(radioButton);
                        radioButton.setAlpha(0.34f);
                    }
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ex7, c514780KGu.LLILZ.getContext());
                    if (numLIZJ != null) {
                        c514780KGu.LLILZ.setTextColor(numLIZJ.intValue());
                    }
                }
                C786410Ut5.I7(new View.OnClickListener() { // from class: X.0KGQ
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view3) {
                        EnumC513810KDb value2;
                        OfferInfo offerInfo4;
                        String str10;
                        MutableLiveData<EnumC513810KDb> mutableLiveData;
                        UpDowngradePackageViewModel upDowngradePackageViewModel3 = this.LL.LL;
                        String str11 = null;
                        if (upDowngradePackageViewModel3 != null && (mutableLiveData = upDowngradePackageViewModel3.LLJI) != null) {
                            value2 = mutableLiveData.getValue();
                        } else {
                            value2 = null;
                        }
                        if (!C513940KDo.LJIIJ(value2) && !this.LL.LLILLL) {
                            TemplateInfo templateInfo8 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                            if (templateInfo8 != null) {
                                offerInfo4 = templateInfo8.offerInfo;
                            } else {
                                offerInfo4 = null;
                            }
                            C513970KDr.LIZ(offerInfo4);
                            C0KDR.LIZLLL(this.LL.LLILLJJLI, subscriptionProductDetailWithTemplateInfo.getTemplateInfo());
                            C0KDR.LIZJ(this.LL.LLILLJJLI, subscriptionProductDetailWithTemplateInfo.getTemplateInfo());
                            this.LL.LLLI((C514780KGu) viewHolder);
                            UpDowngradePackageViewModel upDowngradePackageViewModel4 = this.LL.LL;
                            if (upDowngradePackageViewModel4 != null) {
                                TemplateInfo templateInfo9 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                                if (templateInfo9 != null) {
                                    str10 = templateInfo9.iapId;
                                } else {
                                    str10 = null;
                                }
                                TemplateInfo templateInfo10 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                                if (templateInfo10 != null) {
                                    str11 = templateInfo10.basePlanId;
                                }
                                if (str10 == null) {
                                    str10 = "";
                                }
                                if (str11 == null) {
                                    str11 = "";
                                }
                                upDowngradePackageViewModel4.LLIZ.setValue(new C0KJ5(str10, str11));
                            }
                        }
                    }
                }, viewHolder.itemView);
                TemplateInfo templateInfo8 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo8 != null) {
                    offerInfo = templateInfo8.offerInfo;
                } else {
                    offerInfo = null;
                }
                if (offerInfo != null) {
                    j = offerInfo.offerEndTimestamp;
                } else {
                    j = 0;
                }
                TemplateInfo templateInfo9 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo9 != null && (tagInfo2 = templateInfo9.tagInfo) != null && (str6 = tagInfo2.promotionTitle) != null) {
                    if (C500260Jjc.LJJIIZ(str6)) {
                        C514780KGu c514780KGu3 = (C514780KGu) viewHolder;
                        c514780KGu3.LLIZ.setText(str6);
                        C500260Jjc.LLFFF(c514780KGu3.LLIZ);
                    } else {
                        C500260Jjc.LJIILIIL(((C514780KGu) viewHolder).LLIZ);
                    }
                }
                TemplateInfo templateInfo10 = subscriptionProductDetailWithTemplateInfo.getTemplateInfo();
                if (templateInfo10 != null && (tagInfo = templateInfo10.tagInfo) != null && (str5 = tagInfo.promotionDesc) != null) {
                    if (C500260Jjc.LJJIIZ(str5)) {
                        C514780KGu c514780KGu4 = (C514780KGu) viewHolder;
                        c514780KGu4.LLILLL.setText(str5);
                        C500260Jjc.LLFFF(c514780KGu4.LLILLL);
                        c514780KGu4.LLILLJJLI.setMaxWidth((int) ((C497740JfY.LJIIZILJ() - c514780KGu4.LLILLL.getPaint().measureText(str5)) - ((int) C497740JfY.LIZIZ(104.0f))));
                    } else {
                        C500260Jjc.LJIILIIL(((C514780KGu) viewHolder).LLILLL);
                    }
                }
                final C514780KGu c514780KGu5 = (C514780KGu) viewHolder;
                if (c514780KGu5.LLIZ.getVisibility() == 0) {
                    C0KJ6 c0kj6 = new C0KJ6();
                    final C514910KHh c514910KHh = new C514910KHh(viewHolder);
                    CountDownTimer countDownTimer = c514780KGu5.LLIZLLLIL;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    c514780KGu5.LLIZLLLIL = null;
                    final long j2 = j * 1000;
                    final long jCurrentTimeMillis = j2 - System.currentTimeMillis();
                    if (jCurrentTimeMillis >= 0) {
                        c0kj6.getClass();
                        CharSequence text = c514780KGu5.LLIZ.getText();
                        if (text != null) {
                            string = text.toString();
                        }
                        LLLFZ(c514780KGu5, this, string, jCurrentTimeMillis);
                        final C013C c013c = new C013C();
                        final String str10 = string;
                        c514780KGu5.LLIZLLLIL = new CountDownTimer(jCurrentTimeMillis) { // from class: X.0KHV
                            @Override // android.os.CountDownTimer
                            public final void onFinish() {
                                C013C c013c2 = c013c;
                                if (c013c2.element) {
                                    return;
                                }
                                c013c2.element = true;
                                c514910KHh.invoke();
                            }

                            @Override // android.os.CountDownTimer
                            public final void onTick(long j3) {
                                long jCurrentTimeMillis2 = j2 - System.currentTimeMillis();
                                if (jCurrentTimeMillis2 <= 1000) {
                                    cancel();
                                    C013C c013c2 = c013c;
                                    if (!c013c2.element) {
                                        c013c2.element = true;
                                        c514910KHh.invoke();
                                        return;
                                    }
                                    return;
                                }
                                C0KGO.LLLFZ(c514780KGu5, this, str10, jCurrentTimeMillis2);
                            }
                        }.start();
                        return;
                    }
                    return;
                }
                CountDownTimer countDownTimer2 = c514780KGu5.LLIZLLLIL;
                if (countDownTimer2 != null) {
                    countDownTimer2.cancel();
                }
                c514780KGu5.LLIZLLLIL = null;
            }
        }
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C514780KGu c514780KGu = new C514780KGu(C500260Jjc.LJIILL(R.layout.hpo, viewGroup, false));
        try {
            View view = c514780KGu.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c514780KGu.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c514780KGu.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(C514780KGu.class.getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c514780KGu.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c514780KGu.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = C514780KGu.class.getName();
        return c514780KGu;
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0015 A[PHI: r4
      0x0015: PHI (r4v5 java.lang.String) = (r4v3 java.lang.String), (r4v0 java.lang.String) binds: [B:14:0x0042, B:4:0x0013] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LLLFZ(X.C514780KGu r8, X.C0KGO r9, java.lang.String r10, long r11) {
        /*
            X.16F5 r0 = r8.LLIZ
            X.C500260Jjc.LLFFF(r0)
            X.16F5 r3 = r8.LLIZ
            r9.getClass()
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            java.lang.String r4 = ""
            if (r0 <= 0) goto L1a
            if (r10 != 0) goto L16
        L15:
            r10 = r4
        L16:
            r3.setText(r10)
            return
        L1a:
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            java.lang.String r2 = " · "
            r9 = 0
            r7 = 1
            if (r0 <= 0) goto L56
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r11 = r11 / r0
            int r0 = (int) r11
            int r0 = r0 + 1
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r9] = r0
            r0 = 2131856512(0x7f118c80, float:1.9346758E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            if (r0 == 0) goto L3e
            r4 = r0
        L3e:
            boolean r0 = X.C500260Jjc.LJJIIZ(r10)
            if (r0 == 0) goto L15
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r4)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L16
        L56:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r0
            r0 = 60
            long r4 = (long) r0
            long r0 = r11 % r4
            int r6 = (int) r0
            long r0 = r11 / r4
            long r0 = r0 % r4
            int r8 = (int) r0
            r0 = 3600(0xe10, float:5.045E-42)
            long r0 = (long) r0
            long r11 = r11 / r0
            int r0 = (int) r11
            r5 = 3
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r4[r7] = r0
            r1 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r4[r1] = r0
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r0 = "%02d:%02d:%02d"
            java.lang.String r1 = X.C786410Ut5.j4(r0, r1)
            boolean r0 = X.C500260Jjc.LJJIIZ(r10)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r10)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r10 = X.C2188811AlT.LIZIZ(r0)
            goto L16
        La1:
            r10 = r1
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0KGO.LLLFZ(X.0KGu, X.0KGO, java.lang.String, long):void");
    }
}
