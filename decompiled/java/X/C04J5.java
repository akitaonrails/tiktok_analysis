package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.BulletSpan;
import android.text.style.ClickableSpan;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.combinesku.payment.USCombinedSkuExtraFeeCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeDialog;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeRichText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.policy.UserTrustCell;
import com.ss.android.ugc.aweme.ecommerce.compliance.repository.dto.LinkText;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.zhiliaoapp.musically.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.04J5, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04J5 extends ClickableSpan {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

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
            default:
                super.updateDrawState(textPaint);
                break;
        }
    }

    public static final void onClick$0(C04J5 c04j5, View view) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        List<String> list;
        C1748720vbi.LIZLLL((View) c04j5.l0, new C049Y(), new AwS580S0100000_1((C928903k7) c04j5.l2, 181));
        Integer num = ((ExtraFeeRichText) c04j5.l1).type;
        boolean zBooleanValue = false;
        String str = null;
        if (num != null && num.intValue() == 1) {
            C928903k7 c928903k7 = (C928903k7) c04j5.l2;
            View view2 = (View) c04j5.l0;
            ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) c04j5.l1;
            c928903k7.getClass();
            ExtraFeeDialog extraFeeDialog = extraFeeRichText.dialog;
            if (extraFeeDialog != null && (list = extraFeeDialog.content) != null) {
                try {
                    if (!list.isEmpty()) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (String str2 : list) {
                            SpannableString spannableString = new SpannableString(str2);
                            C786410Ut5.p2(spannableString, new BulletSpan(15), 0, str2.length(), 33);
                            spannableStringBuilder.append((CharSequence) spannableString).append('\n');
                        }
                        C1397580mTM c1397580mTM = new C1397580mTM(view2.getContext());
                        C991903uH c991903uH = new C991903uH(view2.getContext());
                        ExtraFeeDialog extraFeeDialog2 = extraFeeRichText.dialog;
                        if (extraFeeDialog2 != null) {
                            str = extraFeeDialog2.title;
                        }
                        c991903uH.LIZLLL = str;
                        c991903uH.LJ = spannableStringBuilder;
                        c1397580mTM.LJIIJ = c991903uH;
                        C985403tE.LIZ(c1397580mTM, new AwS210S0300000_1(view2, extraFeeRichText, c928903k7, 37));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        C1748720vbi.LIZLLL(view2, new AnonymousClass0487(), new AwS580S0100000_1(c928903k7, 195));
                        return;
                    }
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1AF0.LJ(e);
                    return;
                }
            }
            return;
        }
        ExtraFeeRichText extraFeeRichText2 = (ExtraFeeRichText) c04j5.l1;
        String str3 = extraFeeRichText2.link;
        if (str3 != null) {
            View view3 = (View) c04j5.l0;
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
            Context context = view3.getContext();
            C03GB c03gb = UserTrustCell.LLJ;
            Boolean bool = extraFeeRichText2.isThirdPartyLink;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c03gb.getClass();
            HashMap mapLIZ = C03GB.LIZ(zBooleanValue);
            C864503Zj c864503Zj = C864503Zj.LIZ;
            Context context2 = view3.getContext();
            c864503Zj.getClass();
            Pair pairLIZ = C864503Zj.LIZ(context2);
            mapLIZ.put(pairLIZ.getFirst(), pairLIZ.getSecond());
            mapLIZ.put("target_handler", "pipo_hybrid");
            mapLIZ.put("disable_auto_append_crossplatform_plugin", "1");
            iBusinessDependencyService.bulletStart(context, C919503ib.LIZJ(str3, mapLIZ).build().toString(), null, null);
        }
    }

    public static final void onClick$1(C04J5 c04j5, View view) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        String str = ((LinkText) c04j5.l0).link;
        boolean zBooleanValue = false;
        if (str != null && str.length() != 0) {
            Function0 function0 = (Function0) c04j5.l1;
            if (function0 != null) {
                function0.invoke();
            }
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
            Context context = (Context) c04j5.l2;
            LinkText linkText = (LinkText) c04j5.l0;
            String str2 = linkText.link;
            Boolean bool = linkText.isThirdPartyLink;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            HashMap map = new HashMap();
            map.put("disableBounces", 1);
            if (!zBooleanValue) {
                map.put("__status_bar", Boolean.TRUE);
                map.put("hide_nav_bar", 1);
                map.put("container_color_auto_dark", 1);
                map.put("should_full_screen", 1);
            } else {
                map.put("use_webview_title", 1);
            }
            iBusinessDependencyService.bulletStart(context, C919503ib.LIZJ(str2, map).build().toString(), null, null);
        }
    }

    public static final void onClick$2(C04J5 c04j5, View view) throws IOException {
        List<String> list;
        C1748720vbi.LIZLLL((View) c04j5.l0, new C049Y(), new AwS580S0100000_1((USCombinedSkuExtraFeeCell) c04j5.l2, 745));
        Integer num = ((ExtraFeeRichText) c04j5.l1).type;
        boolean zBooleanValue = false;
        if (num != null && num.intValue() == 1) {
            USCombinedSkuExtraFeeCell uSCombinedSkuExtraFeeCell = (USCombinedSkuExtraFeeCell) c04j5.l2;
            Context context = ((View) c04j5.l0).getContext();
            ExtraFeeRichText extraFeeRichText = (ExtraFeeRichText) c04j5.l1;
            View view2 = (View) c04j5.l0;
            uSCombinedSkuExtraFeeCell.getClass();
            ExtraFeeDialog extraFeeDialog = extraFeeRichText.dialog;
            String str = null;
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
                C985403tE.LIZ(c1397580mTM, new AwS210S0300000_1(view2, uSCombinedSkuExtraFeeCell, extraFeeRichText, 80));
                new C1397510mTF(c1397580mTM).LIZLLL();
                C1748720vbi.LIZLLL(view2, new AnonymousClass0487(), new AwS580S0100000_1(uSCombinedSkuExtraFeeCell, 747));
                return;
            }
            return;
        }
        ExtraFeeRichText extraFeeRichText2 = (ExtraFeeRichText) c04j5.l1;
        String str3 = extraFeeRichText2.link;
        if (str3 != null) {
            USCombinedSkuExtraFeeCell uSCombinedSkuExtraFeeCell2 = (USCombinedSkuExtraFeeCell) c04j5.l2;
            Context context2 = ((View) c04j5.l0).getContext();
            Boolean bool = extraFeeRichText2.isThirdPartyLink;
            uSCombinedSkuExtraFeeCell2.getClass();
            C03GB c03gb = UserTrustCell.LLJ;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
            c03gb.getClass();
            String strLJJIJIIJIL = C03S8.LJJIJIIJIL(C919503ib.LIZJ(str3, C03GB.LIZ(zBooleanValue)).build().toString());
            C1537900q7g c1537900q7g = C1541950qED.LIZJ;
            SparkContext sparkContext = new SparkContext();
            sparkContext.LJJLIIJ(strLJJIJIIJIL);
            c1537900q7g.getClass();
            new C1541950qED(context2, sparkContext).LIZIZ();
        }
    }

    public static final void updateDrawState$0(C04J5 c04j5, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, ((View) c04j5.l0).getContext());
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$1(C04J5 c04j5, TextPaint textPaint) {
        textPaint.setColor(C960203pA.LIZ(R.attr.a1h, (Context) c04j5.l2));
        textPaint.setUnderlineText(false);
    }

    public static final void updateDrawState$2(C04J5 c04j5, TextPaint textPaint) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1h, ((View) c04j5.l0).getContext());
        if (numLIZJ != null) {
            textPaint.setColor(numLIZJ.intValue());
        }
        textPaint.setUnderlineText(false);
    }

    public C04J5(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj3;
        this.l2 = obj2;
    }
}
