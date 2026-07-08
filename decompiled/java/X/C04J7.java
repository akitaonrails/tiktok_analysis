package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy.UserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.extrafee.PaymentExtraFeeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.CCDCAddCardViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.viewholder.SaveNewCardViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.SaveDisplayInfoContent;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.richtext.dto.ECRichTextExtraInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS367S0200000_1;

/* JADX INFO: renamed from: X.04J7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J7 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) throws IOException {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            default:
                super.onClick(view);
                break;
        }
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.$t) {
            case 0:
                updateDrawState$0(this, textPaint);
                break;
            case 1:
                updateDrawState$1(this, textPaint);
                break;
            case 2:
                updateDrawState$2(this, textPaint);
                break;
            case 3:
                updateDrawState$3(this, textPaint);
                break;
            case 4:
                updateDrawState$4(this, textPaint);
                break;
            case 5:
                updateDrawState$5(this, textPaint);
                break;
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C04J7 c04j7, View view) throws IOException {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        List<String> list;
        C1748720vbi.LIZLLL(((PaymentExtraFeeCell) c04j7.l0).itemView, new C049Y(), AFwS228S0000000_1.get$arr$(87));
        Integer num = ((ExtraFeeRichText) c04j7.l1).type;
        boolean zBooleanValue = false;
        String str = null;
        if (num != null && num.intValue() == 1) {
            PaymentExtraFeeCell paymentExtraFeeCell = (PaymentExtraFeeCell) c04j7.l0;
            Context context = paymentExtraFeeCell.itemView.getContext();
            ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) c04j7.l1;
            ExtraFeeDialog extraFeeDialog = extraFeeRichText.dialog;
            if (extraFeeDialog != null && (list = extraFeeDialog.content) != null && !list.isEmpty()) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                for (String str2 : list) {
                    SpannableString spannableString = new SpannableString(str2);
                    C786410Ut5.p2(spannableString, new BulletSpan(15), 0, str2.length(), 33);
                    spannableStringBuilder.append((CharSequence) spannableString).append('\n');
                }
                C1397580mTM c1397580mTM = new C1397580mTM(context);
                C991903uH c991903uH = new C991903uH(context);
                ExtraFeeDialog extraFeeDialog2 = extraFeeRichText.dialog;
                if (extraFeeDialog2 != null) {
                    str = extraFeeDialog2.title;
                }
                c991903uH.LIZLLL = str;
                c991903uH.LJ = spannableStringBuilder;
                c1397580mTM.LJIIJ = c991903uH;
                C985403tE.LIZ(c1397580mTM, new AwS367S0200000_1(extraFeeRichText, paymentExtraFeeCell, 207));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1748720vbi.LIZLLL(paymentExtraFeeCell.itemView, new AnonymousClass0487(), AFwS228S0000000_1.get$arr$(554));
                return;
            }
            return;
        }
        ExtraFeeRichText extraFeeRichText2 = (ExtraFeeRichText) c04j7.l1;
        String str3 = extraFeeRichText2.link;
        if (str3 != null) {
            PaymentExtraFeeCell paymentExtraFeeCell2 = (PaymentExtraFeeCell) c04j7.l0;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IBusinessDependencyService.class.getName();
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
            }
            IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
            Context context2 = paymentExtraFeeCell2.itemView.getContext();
            C03GB c03gb = UserTrustCell.LLJ;
            Boolean bool = extraFeeRichText2.isThirdPartyLink;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c03gb.getClass();
            HashMap mapLIZ = C03GB.LIZ(zBooleanValue);
            C864503Zj c864503Zj = C864503Zj.LIZ;
            Context context3 = paymentExtraFeeCell2.itemView.getContext();
            c864503Zj.getClass();
            Pair pairLIZ = C864503Zj.LIZ(context3);
            mapLIZ.put(pairLIZ.getFirst(), pairLIZ.getSecond());
            mapLIZ.put("target_handler", "pipo_hybrid");
            mapLIZ.put("disable_auto_append_crossplatform_plugin", "1");
            iBusinessDependencyService.bulletStart(context2, C919503ib.LIZJ(str3, mapLIZ).build().toString(), null, null);
        }
    }

    public static final void onClick$1(C04J7 c04j7, View view) {
        ((Function0) c04j7.l0).invoke();
    }

    public static final void onClick$2(C04J7 c04j7, View view) {
        C23250099c.LIZLLL((InterfaceC497601wk) c04j7.l1, null, null, new C912703hV((Context) c04j7.l0, null), 3);
    }

    public static final void onClick$3(C04J7 c04j7, View view) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c04j7.l0;
        C03B1 c03b1 = (C03B1) c04j7.l1;
        String str = c03b1.LIZJ;
        ECRichTextExtraInfo eCRichTextExtraInfo = null;
        if (str == null) {
            str = null;
        }
        ECRichTextExtraInfo eCRichTextExtraInfo2 = c03b1.LJFF;
        if (eCRichTextExtraInfo2 != null) {
            eCRichTextExtraInfo = eCRichTextExtraInfo2;
        }
        interfaceC1631620sYq.invoke(view, str, eCRichTextExtraInfo);
    }

    public static final void onClick$4(C04J7 c04j7, View view) {
        InterfaceC1631620sYq interfaceC1631620sYq = (InterfaceC1631620sYq) c04j7.l0;
        C03B2 c03b2 = (C03B2) c04j7.l1;
        String str = c03b2.LIZJ;
        ECRichTextExtraInfo eCRichTextExtraInfo = null;
        if (str == null) {
            str = null;
        }
        ECRichTextExtraInfo eCRichTextExtraInfo2 = c03b2.LJFF;
        if (eCRichTextExtraInfo2 != null) {
            eCRichTextExtraInfo = eCRichTextExtraInfo2;
        }
        interfaceC1631620sYq.invoke(view, str, eCRichTextExtraInfo);
    }

    public static final void onClick$5(C04J7 c04j7, View view) {
        SaveDisplayInfoContent saveDisplayInfoContent;
        CCDCAddCardViewModel cCDCAddCardViewModelT5 = ((SaveNewCardViewHolder) c04j7.l0).T5();
        List<SaveDisplayInfoContent> list = ((C889503dl) c04j7.l1).LLILLJJLI.content;
        if (list != null) {
            saveDisplayInfoContent = (SaveDisplayInfoContent) C13LP.LJJJLL(list);
        } else {
            saveDisplayInfoContent = null;
        }
        cCDCAddCardViewModelT5.gR2(saveDisplayInfoContent);
        C890103dr.LJFF(C890103dr.LIZ, "learn_more_save_card", null, null, null, null, null, null, 126);
    }

    public static final void updateDrawState$0(C04J7 c04j7, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, ((PaymentExtraFeeCell) c04j7.l0).itemView.getContext()));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C04J7 c04j7, TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
        textPaint.setColor(C0HEZ.LIZ(R.attr.bb, (Context) c04j7.l1));
    }

    public static final void updateDrawState$2(C04J7 c04j7, TextPaint textPaint) {
        int iIntValue;
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1n, (Context) c04j7.l0);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$3(C04J7 c04j7, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setStrikeThruText(false);
    }

    public static final void updateDrawState$4(C04J7 c04j7, TextPaint textPaint) {
        textPaint.setUnderlineText(false);
        textPaint.setStrikeThruText(false);
    }

    public static final void updateDrawState$5(C04J7 c04j7, TextPaint textPaint) {
        int iIntValue;
        super.updateDrawState(textPaint);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.bb, ((SaveNewCardViewHolder) c04j7.l0).itemView.getContext());
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = -16776961;
        }
        textPaint.setColor(iIntValue);
        textPaint.setUnderlineText(false);
    }

    public C04J7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
