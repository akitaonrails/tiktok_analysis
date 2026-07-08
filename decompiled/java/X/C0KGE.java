package X;

import android.text.method.LinkMovementMethod;
import android.widget.CompoundButton;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.packagepage.assem.BottomSubscribeComponent;
import com.bytedance.android.livesdk.livesetting.subscription.LiveGiftSubTermsCheckboxSetting;
import com.bytedance.android.livesdk.subscribe.model.SubscriptionProductDetailWithTemplateInfo;
import com.bytedance.assem.arch.core.UIAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.sub.TagInfo;
import webcast.api.sub.TemplateInfo;

/* JADX INFO: renamed from: X.0KGE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KGE extends C09AY implements Function2<UIAssem, SubscriptionProductDetailWithTemplateInfo, Unit> {
    public final /* synthetic */ BottomSubscribeComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KGE(BottomSubscribeComponent bottomSubscribeComponent) {
        super(2);
        this.LL = bottomSubscribeComponent;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(UIAssem uIAssem, SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo) {
        String str;
        String str2;
        String strLJIJI;
        TemplateInfo templateInfo;
        TagInfo tagInfo;
        TemplateInfo templateInfo2;
        TagInfo tagInfo2;
        TemplateInfo templateInfo3;
        TagInfo tagInfo3;
        final SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo2 = subscriptionProductDetailWithTemplateInfo;
        if (subscriptionProductDetailWithTemplateInfo2 == null) {
            this.LL.LLJJL = Boolean.FALSE;
        }
        BottomSubscribeComponent bottomSubscribeComponent = this.LL;
        Boolean bool = bottomSubscribeComponent.LLJJL;
        if (bool == null) {
            bottomSubscribeComponent.LLJJL = Boolean.FALSE;
        } else if (Intrinsics.LJFF(bool, Boolean.FALSE)) {
            this.LL.LLJJL = Boolean.TRUE;
        }
        C16FS c16fs = this.LL.LLJJIJIIJIL;
        TemplateInfo templateInfo4 = null;
        if (c16fs != null) {
            if (subscriptionProductDetailWithTemplateInfo2 != null && (templateInfo3 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null && (tagInfo3 = templateInfo3.tagInfo) != null) {
                str2 = tagInfo3.packageSubscribeButton;
            } else {
                str2 = null;
            }
            if (C500260Jjc.LJJIIZ(str2)) {
                if (subscriptionProductDetailWithTemplateInfo2 != null && (templateInfo2 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) != null && (tagInfo2 = templateInfo2.tagInfo) != null) {
                    strLJIJI = tagInfo2.packageSubscribeButton;
                } else {
                    strLJIJI = null;
                }
            } else if (subscriptionProductDetailWithTemplateInfo2 == null || (templateInfo = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo()) == null || (tagInfo = templateInfo.tagInfo) == null || (strLJIJI = tagInfo.promotionButton) == null || (strLJIJI.length() == 0 && (strLJIJI = C497740JfY.LJIJI(2131844418)) == null)) {
                strLJIJI = C497740JfY.LJIJI(2131844418);
            }
            c16fs.setText(strLJIJI);
        }
        final BottomSubscribeComponent bottomSubscribeComponent2 = this.LL;
        bottomSubscribeComponent2.getClass();
        bottomSubscribeComponent2.LLJJJJLIIL = System.currentTimeMillis();
        C0HZQ c0hzq = bottomSubscribeComponent2.LLJJIJIL;
        if (c0hzq != null) {
            LiveGiftSubTermsCheckboxSetting liveGiftSubTermsCheckboxSetting = LiveGiftSubTermsCheckboxSetting.INSTANCE;
            if (liveGiftSubTermsCheckboxSetting.getValue() == liveGiftSubTermsCheckboxSetting.getHIDE()) {
                C500260Jjc.LJIILIIL(c0hzq);
                bottomSubscribeComponent2.LLJJJJ = true;
                bottomSubscribeComponent2.LLJJJJJIL = System.currentTimeMillis();
                C513680KCo c513680KCoHp = bottomSubscribeComponent2.hp();
                if (c513680KCoHp != null) {
                    str = c513680KCoHp.LJI;
                } else {
                    str = null;
                }
                if (subscriptionProductDetailWithTemplateInfo2 != null) {
                    templateInfo4 = subscriptionProductDetailWithTemplateInfo2.getTemplateInfo();
                }
                C0KDR.LIZIZ(str, templateInfo4, liveGiftSubTermsCheckboxSetting.getHIDE());
            } else {
                C500260Jjc.LLFFF(c0hzq);
                C786410Ut5.D7(c0hzq, new CompoundButton.OnCheckedChangeListener() { // from class: X.0KGw
                    @Override // android.widget.CompoundButton.OnCheckedChangeListener
                    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                        String str3;
                        BottomSubscribeComponent bottomSubscribeComponent3 = bottomSubscribeComponent2;
                        bottomSubscribeComponent3.LLJJJJ = z;
                        if (z) {
                            bottomSubscribeComponent3.LLJJJJJIL = System.currentTimeMillis();
                            C513680KCo c513680KCoHp2 = bottomSubscribeComponent2.hp();
                            TemplateInfo templateInfo5 = null;
                            if (c513680KCoHp2 != null) {
                                str3 = c513680KCoHp2.LJI;
                            } else {
                                str3 = null;
                            }
                            SubscriptionProductDetailWithTemplateInfo subscriptionProductDetailWithTemplateInfo3 = subscriptionProductDetailWithTemplateInfo2;
                            if (subscriptionProductDetailWithTemplateInfo3 != null) {
                                templateInfo5 = subscriptionProductDetailWithTemplateInfo3.getTemplateInfo();
                            }
                            C0KDR.LIZIZ(str3, templateInfo5, LiveGiftSubTermsCheckboxSetting.INSTANCE.getValue());
                        }
                    }
                });
                C635860Owq.LIZ.LIZJ(8, c0hzq);
            }
        }
        C16F5 c16f5 = bottomSubscribeComponent2.LLJJJ;
        if (c16f5 != null) {
            c16f5.setText(C0KCA.LIZIZ(c16f5.getContext(), bottomSubscribeComponent2.getContext(), new C0KIL(bottomSubscribeComponent2)));
            c16f5.setMovementMethod(LinkMovementMethod.getInstance());
            c16f5.setHighlightColor(0);
            C0HZQ c0hzq2 = bottomSubscribeComponent2.LLJJIJIL;
            if (c0hzq2 != null && c0hzq2.getVisibility() == 8 && c16f5.getLineCount() == 1) {
                c16f5.setGravity(1);
            }
        }
        C513680KCo c513680KCoHp2 = this.LL.hp();
        if (c513680KCoHp2 != null && Intrinsics.LJFF(c513680KCoHp2.LJFF, "sub_change_price_email")) {
            BottomSubscribeComponent bottomSubscribeComponent3 = this.LL;
            if (!bottomSubscribeComponent3.LLJJLIIIJLLLLLLLZ) {
                C0HZQ c0hzq3 = bottomSubscribeComponent3.LLJJIJIL;
                if (c0hzq3 != null) {
                    c0hzq3.setChecked(true);
                }
                C16FS c16fs2 = this.LL.LLJJIJIIJIL;
                if (c16fs2 != null) {
                    c16fs2.performClick();
                }
                this.LL.LLJJLIIIJLLLLLLLZ = true;
            }
        }
        return Unit.LIZ;
    }
}
