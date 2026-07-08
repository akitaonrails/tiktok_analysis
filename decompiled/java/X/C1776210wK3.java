package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.message.ext.ECommerceMessage;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pipo.ttpay.onboarding.TTPayOnboardingAssem;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.pipo.ttpay.recharge.network.Amount;
import com.bytedance.pipo.ttpay.recharge.network.OrderDetail;
import com.bytedance.pipo.ttpay.recharge.network.SubmitPaymentResponse;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.wallet.network.model.WalletFlowDecision;
import com.ss.android.ugc.aweme.component.guide.GuidePageAssem;
import com.ss.android.ugc.aweme.component.guide.MemberInfoCollectManager;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopProductResp;
import com.ss.android.ugc.aweme.publish.detail.EffectPublishOldFuncAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776210wK3 extends C09AY implements InterfaceC1685430txd {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685430txd
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4, obj5, obj6);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4, obj5, obj6);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(AbstractC21194117wp abstractC21194117wp, int i) {
        super(6);
        this.$t = i;
        this.l0 = abstractC21194117wp;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(AbstractC21194217wq abstractC21194217wq, int i) {
        super(6);
        this.$t = i;
        this.l0 = abstractC21194217wq;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(TTPayOnboardingAssem tTPayOnboardingAssem, int i) {
        super(6);
        this.$t = i;
        this.l0 = tTPayOnboardingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(RechargeAssem rechargeAssem, int i) {
        super(6);
        this.$t = i;
        this.l0 = rechargeAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(GuidePageAssem guidePageAssem, int i) {
        super(6);
        this.$t = i;
        this.l0 = guidePageAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776210wK3(EffectPublishOldFuncAssem effectPublishOldFuncAssem, int i) {
        super(6);
        this.$t = i;
        this.l0 = effectPublishOldFuncAssem;
    }

    public static final Object invoke$0(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        C19EG c19egLIZ;
        C1397510mTF c1397510mTF;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) obj3;
        EnumC1717110umj enumC1717110umj = (EnumC1717110umj) obj4;
        String str2 = (String) obj6;
        int i = C488240JCs.LIZ[((EnumC488160JCk) obj2).ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((TTPayOnboardingAssem) c1776210wK3.l0).cp(false, enumC1717110umj);
                    ((TTPayOnboardingAssem) c1776210wK3.l0).bp(str);
                    ((TTPayOnboardingAssem) c1776210wK3.l0).Vo(str2);
                    if ((enumC1717110umj != EnumC1717110umj.CHANGE_PHONE || (c1397510mTF = ((TTPayOnboardingAssem) c1776210wK3.l0).LLJJIJI) == null || !c1397510mTF.LJIIIZ()) && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
                        c19egLIZ.finish();
                    }
                } else {
                    throw new C1954807lC();
                }
            } else {
                ((TTPayOnboardingAssem) c1776210wK3.l0).cp(false, enumC1717110umj);
            }
        } else {
            ((TTPayOnboardingAssem) c1776210wK3.l0).cp(true, enumC1717110umj);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$1(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        Context context;
        Object obj7 = obj5;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        WalletFlowDecision walletFlowDecision = (WalletFlowDecision) obj3;
        if (enumC488160JCk == null) {
            i = -1;
        } else {
            i = C488260JCu.LIZ[enumC488160JCk.ordinal()];
        }
        if (i != 1) {
            String str = "";
            if (i != 2) {
                if (i == 3) {
                    ((GuidePageAssem) c1776210wK3.l0).No(false);
                    GuidePageAssem guidePageAssem = (GuidePageAssem) c1776210wK3.l0;
                    guidePageAssem.getClass();
                    Fragment fragmentLJI = C724240Sb0.LJI(guidePageAssem);
                    if (fragmentLJI != null && (context = fragmentLJI.getContext()) != null) {
                        C1397580mTM c1397580mTM = new C1397580mTM(context);
                        c1397580mTM.LJI(context.getString(2131840291));
                        c1397580mTM.LIZIZ(context.getString(2131840289));
                        C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(guidePageAssem, 580));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                    }
                    GuidePageAssem guidePageAssem2 = (GuidePageAssem) c1776210wK3.l0;
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = new Pair(Scene.SCENE_SERVICE, guidePageAssem2.Go().LL);
                    if (obj7 == null) {
                        obj7 = "";
                    }
                    pairArr[1] = new Pair("error_message", obj7);
                    pairArr[2] = new Pair("source_id", guidePageAssem2.Go().LLILLJJLI);
                    C1716470ulh.LIZ(guidePageAssem2.Go().LL, "fp_sdk_entry_request_error", C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(pairArr)));
                }
            } else {
                ((GuidePageAssem) c1776210wK3.l0).No(false);
                if (walletFlowDecision != null) {
                    final GuidePageAssem guidePageAssem3 = (GuidePageAssem) c1776210wK3.l0;
                    C1716480uli.LIZ.put(guidePageAssem3.Go().LL, walletFlowDecision);
                    C1716550ulp c1716550ulp = C1716550ulp.LIZ;
                    String str2 = guidePageAssem3.Go().LL;
                    String str3 = walletFlowDecision.sessionId;
                    if (str3 == null) {
                        str3 = "";
                    }
                    c1716550ulp.getClass();
                    C1716550ulp.LIZ(str2, str3);
                    Pair[] pairArr2 = new Pair[5];
                    pairArr2[0] = new Pair(Scene.SCENE_SERVICE, guidePageAssem3.Go().LL);
                    pairArr2[1] = new Pair("duration", String.valueOf(System.currentTimeMillis() - guidePageAssem3.LLJI));
                    pairArr2[2] = new Pair("retry_count", String.valueOf(guidePageAssem3.LLJIJIL));
                    pairArr2[3] = new Pair("source_id", guidePageAssem3.Go().LLILLJJLI);
                    String str4 = guidePageAssem3.Go().LLIZ;
                    if (str4 != null) {
                        str = str4;
                    }
                    pairArr2[4] = new Pair("enter_from", str);
                    C1716470ulh.LIZ(guidePageAssem3.Go().LL, "fp_sdk_entry_loading_jump", C2097608Jq.LJIIZILJ(C2097608Jq.LJIIJ(pairArr2)));
                    final C19EG c19egLIZ = C724240Sb0.LIZ(guidePageAssem3);
                    if (c19egLIZ != null) {
                        final MemberInfoCollectManager memberInfoCollectManager = new MemberInfoCollectManager(walletFlowDecision, guidePageAssem3.Go().LL, guidePageAssem3.Go().LLILZ, guidePageAssem3.Go().LLIZ);
                        memberInfoCollectManager.LIZJ(c19egLIZ, new InterfaceC1717210umt() { // from class: X.0ul4
                            @Override // X.InterfaceC1717210umt
                            public final void LIZ() {
                            }

                            @Override // X.InterfaceC1717210umt
                            public final void LIZIZ() {
                                MemberInfoCollectManager memberInfoCollectManager2 = memberInfoCollectManager;
                                GuidePageAssem guidePageAssem4 = guidePageAssem3;
                                C19EG c19eg = c19egLIZ;
                                try {
                                    String strLJFF = memberInfoCollectManager2.LJFF();
                                    if (!C123100dR.LIZ(strLJFF) || strLJFF == null) {
                                        strLJFF = guidePageAssem4.Jo() ? C20642515q3.LJI(2131840292) : C20642515q3.LJI(2131840293);
                                    }
                                    C1389880mGw c1389880mGw = new C1389880mGw(c19eg);
                                    c1389880mGw.LJIIIZ(strLJFF);
                                    c1389880mGw.LJ(R.raw.icon_tick);
                                    c1389880mGw.LJI(R.attr.a1h);
                                    c1389880mGw.LIZ(true);
                                    c1389880mGw.LIZLLL(2500L);
                                    c1389880mGw.LJIIJ();
                                    C189200o6.m2constructorimpl(Unit.LIZ);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    C189200o6.m2constructorimpl(new C098200Yq(th));
                                }
                            }
                        }, null);
                    }
                }
            }
        } else {
            ((GuidePageAssem) c1776210wK3.l0).No(true);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$2(X.C1776210wK3 r12, java.lang.Object r13, java.lang.Object r14, java.lang.Object r15, java.lang.Object r16, java.lang.Object r17, java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776210wK3.invoke$2(X.0wK3, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$3(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        ((AbstractC21194217wq) c1776210wK3.l0).LJJJJI((PopProductResp) obj, (String) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (ECommerceMessage) obj5, zBooleanValue, false);
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj6).booleanValue();
        ((AbstractC21194217wq) c1776210wK3.l0).LJJJJI((PopProductResp) obj, (String) obj2, ((Boolean) obj3).booleanValue(), ((Boolean) obj4).booleanValue(), (ECommerceMessage) obj5, zBooleanValue, false);
        return Unit.LIZ;
    }

    public static final Object invoke$5(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ((AbstractC21194117wp) c1776210wK3.l0).LJJJJI((PopProductResp) obj, ((Boolean) obj2).booleanValue(), ((Boolean) obj3).booleanValue(), (ECommerceMessage) obj4, ((Boolean) obj5).booleanValue(), (JSONObject) obj6);
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x01ac A[PHI: r1
      0x01ac: PHI (r1v44 java.lang.String) = (r1v20 java.lang.String), (r1v45 java.lang.String) binds: [B:64:0x01f0, B:49:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ java.lang.Object invoke$6(X.C1776210wK3 r27, java.lang.Object r28, java.lang.Object r29, java.lang.Object r30, java.lang.Object r31, java.lang.Object r32, java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 1439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776210wK3.invoke$6(X.0wK3, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$7(C1776210wK3 c1776210wK3, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i;
        OrderDetail orderDetail;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        UIAssem uIAssem = (UIAssem) obj;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        SubmitPaymentResponse submitPaymentResponse = (SubmitPaymentResponse) obj3;
        String str6 = (String) obj4;
        Amount amount = (Amount) obj5;
        String str7 = (String) obj6;
        if (enumC488160JCk != null && (i = C488250JCt.LIZ[enumC488160JCk.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        ((RechargeAssem) c1776210wK3.l0).Jo().setLoading(false);
                        if (str7 != null) {
                            ((RechargeAssem) c1776210wK3.l0).Zo(str7);
                        } else if (submitPaymentResponse != null && (orderDetail = submitPaymentResponse.orderDetail) != null && (str = orderDetail.receiveJumpUrl) != null) {
                            RechargeAssem rechargeAssem = (RechargeAssem) c1776210wK3.l0;
                            Uri uriLIZJ = UriProtector.parse(str);
                            Uri uri = UriProtector.parse(str);
                            C1721560utu c1721560utuHo = rechargeAssem.Ho();
                            if (c1721560utuHo != null && (str5 = c1721560utuHo.LLILZ) != null) {
                                uriLIZJ = C1719940urI.LIZJ(uri, "enter_from", str5);
                            }
                            Uri.Builder builderBuildUpon = uriLIZJ.buildUpon();
                            C1721560utu c1721560utuHo2 = rechargeAssem.Ho();
                            String str8 = "";
                            if (c1721560utuHo2 == null || (str2 = c1721560utuHo2.LLJJJJ) == null) {
                                str2 = "";
                            }
                            Uri.Builder builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("qr_code_type", str2).appendQueryParameter("previous_page_id", "receiving_qr_create");
                            C1721560utu c1721560utuHo3 = rechargeAssem.Ho();
                            if (c1721560utuHo3 == null || (str3 = c1721560utuHo3.LLILLL) == null) {
                                str3 = "";
                            }
                            Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("trace_id", str3).appendQueryParameter("result_link", str6);
                            if (amount != null && (str4 = amount.value) != null) {
                                str8 = str4;
                            }
                            rechargeAssem.Zo(builderAppendQueryParameter2.appendQueryParameter("transaction_amount", str8).build().toString());
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    ((RechargeAssem) c1776210wK3.l0).Jo().setLoading(true);
                }
            } else {
                ((RechargeAssem) c1776210wK3.l0).Jo().setLoading(false);
                Context context = uIAssem.getContext();
                if (context != null) {
                    RechargeAssem rechargeAssem2 = (RechargeAssem) c1776210wK3.l0;
                    C1397580mTM c1397580mTM = new C1397580mTM(context);
                    c1397580mTM.LJFF(2131840186);
                    C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(rechargeAssem2, uIAssem, 139));
                    new C1397510mTF(c1397580mTM).LIZLLL();
                }
            }
        }
        return Unit.LIZ;
    }
}
