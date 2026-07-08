package X;

import Y.ARunnableS126S0100000_26;
import Y.ARunnableS1S2300000_26;
import Y.ARunnableS20S1300000_26;
import Y.ARunnableS95S0200000_26;
import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.biz.bnpl.network.model.ConfirmRegisterMobileResponse;
import com.ss.android.ugc.aweme.biz.wallet.biz.landing.base.BaseWalletLandingAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberAssem;
import com.ss.android.ugc.aweme.component.phone.PhoneNumberFragment;
import com.ss.android.ugc.aweme.component.phone.change.setting.PhoneSettingAssem;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoCardDTO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoViewHolder;
import com.ss.android.ugc.aweme.ecommerce.core.ab.EcSeaPdpCreatorVideoSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthAssem;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthResponse;
import com.ss.android.ugc.aweme.pipo.auth.PipoAuthViewModel;
import com.ss.android.ugc.aweme.pipo.cashier.refund.api.model.RefundCashierBasicInfo;
import com.ss.android.ugc.aweme.pipo.cashier.refund.cashier.RefundCashierAssem;
import com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS210S0300000_1;
import kotlin.jvm.internal.AwS235S0300000_26;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0wK2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class C1776200wK2 extends C09AY implements InterfaceC1685420txc {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC1685420txc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2, obj3, obj4, obj5);
            case 1:
                return invoke$1(this, obj, obj2, obj3, obj4, obj5);
            case 2:
                return invoke$2(this, obj, obj2, obj3, obj4, obj5);
            case 3:
                return invoke$3(this, obj, obj2, obj3, obj4, obj5);
            case 4:
                return invoke$4(this, obj, obj2, obj3, obj4, obj5);
            case 5:
                return invoke$5(this, obj, obj2, obj3, obj4, obj5);
            case 6:
                return invoke$6(this, obj, obj2, obj3, obj4, obj5);
            case 7:
                return invoke$7(this, obj, obj2, obj3, obj4, obj5);
            case 8:
                return invoke$8(this, obj, obj2, obj3, obj4, obj5);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(C1717190umr c1717190umr, int i) {
        super(5);
        this.$t = i;
        this.l0 = c1717190umr;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(BaseWalletLandingAssem baseWalletLandingAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = baseWalletLandingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(PhoneNumberAssem phoneNumberAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = phoneNumberAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(PhoneSettingAssem phoneSettingAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = phoneSettingAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder, int i) {
        super(5);
        this.$t = i;
        this.l0 = seaPdpCreatorVideoViewHolder;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(PipoAuthAssem pipoAuthAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = pipoAuthAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(RefundCashierAssem refundCashierAssem, int i) {
        super(5);
        this.$t = i;
        this.l0 = refundCashierAssem;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1776200wK2(EffectEditV2Assem effectEditV2Assem, int i) {
        super(5);
        this.$t = i;
        this.l0 = effectEditV2Assem;
    }

    public static final Object invoke$0(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strLJIIIIZZ;
        C1054104Ah c1054104Ah;
        Context context = (Context) obj;
        SeaPdpCreatorVideoCardDTO seaPdpCreatorVideoCardDTO = (SeaPdpCreatorVideoCardDTO) obj2;
        View view = (View) obj3;
        Integer num = (Integer) obj4;
        String str = (String) obj5;
        SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder = (SeaPdpCreatorVideoViewHolder) c1776200wK2.l0;
        String str2 = seaPdpCreatorVideoCardDTO.vid;
        seaPdpCreatorVideoViewHolder.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", "pdp_creator_video");
        linkedHashMap.put("entrance_form", "content_goods_card");
        if (num != null) {
            int iIntValue = num.intValue();
            linkedHashMap.put("click_ranking", Integer.valueOf(iIntValue));
            linkedHashMap.put("ranking", Integer.valueOf(iIntValue));
        }
        if (str2 != null) {
            linkedHashMap.put("group_id", str2);
        }
        C1054104Ah c1054104Ah2 = seaPdpCreatorVideoViewHolder.d6().LLJLIL;
        if (c1054104Ah2 != null) {
            Map<String, ? extends Object> map = seaPdpCreatorVideoViewHolder.d6().LLLLLLLLLL.LIZLLL;
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ = c1054104Ah2.LJJIZ();
            if (interfaceC1748810vbrLJJIZ != null) {
                C1748720vbi.LIZ(interfaceC1748810vbrLJJIZ, new C10516049i(), str, PageFinder.via(view), new AwS210S0300000_1(c1054104Ah2, (C1054104Ah) linkedHashMap, map, (Map<String, ? extends Object>) 58));
            }
        }
        if (num != null && (c1054104Ah = seaPdpCreatorVideoViewHolder.d6().LLJLIL) != null) {
            Map<String, ? extends Object> map2 = seaPdpCreatorVideoViewHolder.d6().LLLLLLLLLL.LIZLLL;
            Map<String, Object> mapLIZ = seaPdpCreatorVideoCardDTO.LIZ();
            Map mapLIZJ = C2097908Jt.LIZJ(new Pair("source_page_type", "pdp_creator_video"));
            InterfaceC1748810vbr interfaceC1748810vbrLJJIZ2 = c1054104Ah.LJJIZ();
            if (interfaceC1748810vbrLJJIZ2 != null) {
                C1748720vbi.LIZ(interfaceC1748810vbrLJJIZ2, new C049N(), str, PageFinder.via(view), new AwS37S0500000_1(c1054104Ah, (C1054104Ah) linkedHashMap, map2, (Map<String, ? extends Object>) mapLIZ, (Map<String, ? extends Object>) mapLIZJ, (Map<String, ? extends Object>) 7));
            }
        }
        String str3 = seaPdpCreatorVideoCardDTO.schema;
        if (str3 != null) {
            SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder2 = (SeaPdpCreatorVideoViewHolder) c1776200wK2.l0;
            seaPdpCreatorVideoViewHolder2.getClass();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            EcSeaPdpCreatorVideoSettings.EcSeaPdpCreatorVideoModel ecSeaPdpCreatorVideoModel = EcSeaPdpCreatorVideoSettings.LIZ;
            Integer num2 = ecSeaPdpCreatorVideoModel.loadMoreVideoDetailCount;
            if (num2 != null) {
                linkedHashMap2.put("detail_load_page_count", Integer.valueOf(num2.intValue()));
            }
            Integer num3 = ecSeaPdpCreatorVideoModel.clickIntoFeedOffset;
            if (num3 != null) {
                linkedHashMap2.put("click_into_inner_feed_offset", Integer.valueOf(num3.intValue()));
            }
            linkedHashMap2.put("feed_type", 3);
            linkedHashMap2.put("feed_sub_type", 3001);
            String str4 = seaPdpCreatorVideoViewHolder2.d6().LLLLLLLLLL.LJII;
            if (str4 != null) {
                linkedHashMap2.put(Scene.SCENE_SERVICE, str4);
            }
            String str5 = seaPdpCreatorVideoViewHolder2.d6().LLLLLLLLLL.LJI;
            if (str5 != null) {
                linkedHashMap2.put("session_id", str5);
            }
            String str6 = seaPdpCreatorVideoViewHolder2.d6().LLLLLLLLLL.LJFF;
            if (str6 != null) {
                linkedHashMap2.put("ids", str6);
            }
            Object objPut = null;
            String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken(str, PageFinder.via(view), null);
            if (strCreateJumpSourceBtmToken != null) {
                linkedHashMap2.put("source_btm_token", strCreateJumpSourceBtmToken);
            }
            Object objPut2 = null;
            try {
                Map<String, ? extends Object> map3 = seaPdpCreatorVideoViewHolder2.d6().LLLLLLLLLL.LIZLLL;
                if (map3 != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(map3)) != null) {
                    objPut = linkedHashMap2.put("module_da_info", strLJIIIIZZ);
                }
                C189200o6.m2constructorimpl(objPut);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            try {
                List<String> list = seaPdpCreatorVideoViewHolder2.d6().LLLLLLLLLL.LJ;
                if (list != null) {
                    objPut2 = linkedHashMap2.put("card_da_info_list", list);
                }
                C189200o6.m2constructorimpl(objPut2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C189200o6.m2constructorimpl(new C098200Yq(th2));
            }
            SmartRoute smartRouteLIZIZ = C919503ib.LIZIZ(context, str3, linkedHashMap2, false);
            C960603pE.LJII(smartRouteLIZIZ, view);
            smartRouteLIZIZ.open();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$1(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        final UIAssem uIAssem = (UIAssem) obj;
        final EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        final String str = (String) obj3;
        final String str2 = (String) obj4;
        final String str3 = (String) obj5;
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        final BaseWalletLandingAssem baseWalletLandingAssem = (BaseWalletLandingAssem) c1776200wK2.l0;
        C786410Ut5.LJJZZIII(bPEAHandler, new Runnable() { // from class: X.0unG
            public final void LIZ() {
                C1749280vcc c1749280vcc;
                Integer numLIZJ;
                C1749280vcc c1749280vcc2;
                C19EG c19egLIZ;
                C19EG c19egLIZ2;
                int i = C0JDD.LIZ[enumC488160JCk.ordinal()];
                if (i == 1) {
                    uIAssem.LJJIJL().setBackgroundColor(0);
                    View viewLJJIJL = uIAssem.LJJIJL();
                    if (viewLJJIJL == null || (c1749280vcc = (C1749280vcc) viewLJJIJL.findViewById(R.id.z18)) == null) {
                        return;
                    }
                    c1749280vcc.LJ();
                    return;
                }
                if (i != 2) {
                    if (i != 3) {
                        throw new C1954807lC();
                    }
                    if (Intrinsics.LJFF(str3, "RISK_PIN_MANAGEMENT_REJECTED") && (c19egLIZ2 = C724240Sb0.LIZ(uIAssem)) != null) {
                        C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ2);
                        c1397580mTM.LJI(c19egLIZ2.getString(2131840370));
                        c1397580mTM.LIZIZ(c19egLIZ2.getString(2131840369));
                        C1238130iKB.LIZ(c1397580mTM, new AwS605S0100000_26(c19egLIZ2, 62));
                        c1397580mTM.LJII = false;
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                    if (Intrinsics.LJFF(str3, "RISK_REJECTED") && (c19egLIZ = C724240Sb0.LIZ(uIAssem)) != null) {
                        C1397580mTM c1397580mTM2 = new C1397580mTM(c19egLIZ);
                        c1397580mTM2.LJI(c19egLIZ.getString(2131840367));
                        c1397580mTM2.LIZIZ(c19egLIZ.getString(2131840365));
                        C1238130iKB.LIZ(c1397580mTM2, new AwS605S0100000_26(c19egLIZ, 63));
                        c1397580mTM2.LJII = false;
                        new C1397510mTF(c1397580mTM2).LIZLLL();
                        return;
                    }
                    View viewLJJIJL2 = uIAssem.LJJIJL();
                    if (viewLJJIJL2 != null && (c1749280vcc2 = (C1749280vcc) viewLJJIJL2.findViewById(R.id.z18)) != null) {
                        C1722300uv6 c1722300uv6 = new C1722300uv6();
                        C1719940urI.LIZIZ(c1722300uv6, str, new AwS570S0100000_26(baseWalletLandingAssem, 118));
                        c1749280vcc2.setStatus(c1722300uv6);
                    }
                    Context context = uIAssem.getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, context)) != null) {
                        uIAssem.LJJIJL().setBackgroundColor(numLIZJ.intValue());
                    }
                    baseWalletLandingAssem.Vo(str2);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseWalletLandingAssem@c71d.onViewCreated$6$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseWalletLandingAssem@c71d.onViewCreated$6$1");
            }
        });
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$2(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str;
        C1748440vbG c1748440vbG;
        UIAssem uIAssem = (UIAssem) obj;
        EnumC1717850unv enumC1717850unv = (EnumC1717850unv) obj2;
        ConfirmRegisterMobileResponse confirmRegisterMobileResponse = (ConfirmRegisterMobileResponse) obj3;
        String str2 = (String) obj4;
        int[] iArr = C1717840unu.LIZ;
        int i = iArr[enumC1717850unv.ordinal()];
        C1748330vb5 c1748330vb5 = null;
        if (i != 1) {
            if (i == 2) {
                if (Intrinsics.LJFF(obj5, "RISK_REJECTED")) {
                    C19EG c19egLIZ = C724240Sb0.LIZ(uIAssem);
                    if (c19egLIZ != null) {
                        PhoneNumberAssem phoneNumberAssem = (PhoneNumberAssem) c1776200wK2.l0;
                        C1397580mTM c1397580mTM = new C1397580mTM(c19egLIZ);
                        c1397580mTM.LJII = false;
                        c1397580mTM.LJI(c19egLIZ.getString(2131840170));
                        c1397580mTM.LIZIZ(c19egLIZ.getString(2131840168));
                        C1238130iKB.LIZ(c1397580mTM, new AwS392S0200000_26(phoneNumberAssem, c19egLIZ, 11));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        phoneNumberAssem.So().CQ2("phone_set_change_risk_block");
                    }
                } else if (str2 == null) {
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(uIAssem);
                    if (c19egLIZ2 != null) {
                        C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ2);
                        c1389890mGx.LJIIJ(c19egLIZ2.getString(2131832568));
                        c1389890mGx.LJIIJJI();
                    }
                } else if (str2.length() == 0) {
                    C19EG c19egLIZ3 = C724240Sb0.LIZ(uIAssem);
                    if (c19egLIZ3 != null) {
                        C1389890mGx c1389890mGx2 = new C1389890mGx(c19egLIZ3);
                        c1389890mGx2.LJIIJ(c19egLIZ3.getString(2131832569));
                        c1389890mGx2.LJIIJJI();
                    }
                } else {
                    View viewLJJIJL = uIAssem.LJJIJL();
                    if (viewLJJIJL != null) {
                        c1748440vbG = (C1748440vbG) viewLJJIJL.findViewById(R.id.c4x);
                    } else {
                        c1748440vbG = null;
                    }
                    c1748440vbG.setValidationStatus(3);
                    View viewLJJIJL2 = uIAssem.LJJIJL();
                    if (viewLJJIJL2 != null) {
                        c1748330vb5 = (C1748330vb5) viewLJJIJL2.findViewById(R.id.c59);
                    }
                    c1748330vb5.setMessage(str2);
                }
            }
        } else {
            C19EG c19egLIZ4 = C724240Sb0.LIZ((PhoneNumberAssem) c1776200wK2.l0);
            if (c19egLIZ4 != null) {
                PhoneNumberAssem phoneNumberAssem2 = (PhoneNumberAssem) c1776200wK2.l0;
                if (confirmRegisterMobileResponse != null) {
                    if (confirmRegisterMobileResponse.popOutInfo != null) {
                        Context context = uIAssem.getContext();
                        if (context != null) {
                            C1397580mTM c1397580mTM2 = new C1397580mTM(context);
                            c1397580mTM2.LJII = false;
                            c1397580mTM2.LJI(confirmRegisterMobileResponse.popOutInfo.title);
                            c1397580mTM2.LIZIZ(confirmRegisterMobileResponse.popOutInfo.content);
                            C1238130iKB.LIZ(c1397580mTM2, new AwS235S0300000_26(confirmRegisterMobileResponse, phoneNumberAssem2, context, 4));
                            new C1397510mTF(c1397580mTM2).LIZLLL();
                            phoneNumberAssem2.So().CQ2("phone_set_regional_error");
                        }
                    } else if (confirmRegisterMobileResponse != null && (str = confirmRegisterMobileResponse.verifyInfo) != null) {
                        String strCreateJumpSourceBtmToken = BtmSDK.INSTANCE.createJumpSourceBtmToken("a2270.b70343.c22710.d47335", PageFinder.via(C724240Sb0.LJI(uIAssem)), null);
                        if (phoneNumberAssem2.Oo().LLJIJIL) {
                            C1716360ulW c1716360ulW = C1716360ulW.LIZ;
                            String str3 = phoneNumberAssem2.Oo().LLILLL;
                            boolean z = phoneNumberAssem2.Oo().LLJILJIL;
                            C1716310ulR c1716310ulR = C1716310ulR.LIZ;
                            String str4 = phoneNumberAssem2.Oo().LLILZLL;
                            c1716310ulR.getClass();
                            C1716360ulW.LIZLLL(c1716360ulW, c19egLIZ4, str3, str, "bnpl_activate_phone_number", z, C1716310ulR.LIZ(str4), phoneNumberAssem2.Oo().LLJILJILJ, strCreateJumpSourceBtmToken, new C1717830unt(phoneNumberAssem2, c19egLIZ4), 136);
                        } else {
                            C1717860unw.LIZ(PhoneNumberFragment.LLJJI, phoneNumberAssem2.Oo().LLILLL, true, str, c19egLIZ4, strCreateJumpSourceBtmToken, 16);
                        }
                    }
                }
            }
        }
        if (iArr[enumC1717850unv.ordinal()] == 1) {
            C786410Ut5.LJLIIL(1000L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS126S0100000_26(uIAssem, 18));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS95S0200000_26(uIAssem, enumC1717850unv, 4));
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$3(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        UIAssem uIAssem = (UIAssem) obj;
        EnumC488160JCk enumC488160JCk = (EnumC488160JCk) obj2;
        String str = (String) obj3;
        String str2 = (String) obj4;
        if (((Boolean) obj5).booleanValue()) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S2300000_26(enumC488160JCk, uIAssem, (PhoneSettingAssem) c1776200wK2.l0, str2, str, 0));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS20S1300000_26(enumC488160JCk, uIAssem, str, (PhoneSettingAssem) c1776200wK2.l0, 0));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$4(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        String str;
        String str2;
        Object c098200Yq;
        String str3;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        EnumC1723290uwh enumC1723290uwh = (EnumC1723290uwh) obj2;
        String str4 = (String) obj3;
        String str5 = (String) obj4;
        PipoAuthResponse pipoAuthResponse = (PipoAuthResponse) obj5;
        if (enumC1723290uwh != null && (i = C1723280uwg.LIZ[enumC1723290uwh.ordinal()]) != -1) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        Dialog dialog = (Dialog) ((PipoAuthAssem) c1776200wK2.l0).LLJ.getValue();
                        if (dialog != null) {
                            C0FNV.LIZ(dialog);
                        }
                        Context context = abstractC738140SxQ.getContext();
                        if (context != null) {
                            PipoAuthAssem pipoAuthAssem = (PipoAuthAssem) c1776200wK2.l0;
                            Uri uriLIZIZ = null;
                            if (pipoAuthResponse != null) {
                                str = pipoAuthResponse.loginSuccessPage;
                            } else {
                                str = null;
                            }
                            if (C1948507kB.LIZ(str)) {
                                if (pipoAuthResponse != null) {
                                    try {
                                        String str6 = pipoAuthResponse.loginSuccessPage;
                                        if (str6 != null) {
                                            C1948407kA c1948407kA = C1948407kA.LIZ;
                                            Map mapLIZIZ = C1716300ulQ.LIZIZ();
                                            c1948407kA.getClass();
                                            String strLIZ = C1948407kA.LIZ(str6, mapLIZIZ);
                                            if (strLIZ != null) {
                                                Uri uri = UriProtector.parse(strLIZ);
                                                C1723260uwe c1723260uwe = (C1723260uwe) pipoAuthAssem.LLJI.getValue();
                                                if (c1723260uwe == null || (str2 = c1723260uwe.LLJIJIL) == null) {
                                                    str2 = "";
                                                }
                                                uriLIZIZ = C1948407kA.LIZIZ(uri, "source_btm_token", str2);
                                            }
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        c098200Yq = new C098200Yq(th);
                                        C189200o6.m2constructorimpl(c098200Yq);
                                    }
                                }
                                String strValueOf = String.valueOf(uriLIZIZ);
                                if (u.LJJIIJZLJL(strValueOf, "http", false)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("aweme://webview?url=");
                                    sbLIZ.append(strValueOf);
                                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                    IPipoContainerService iPipoContainerService = (IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class);
                                    C1723260uwe c1723260uwe2 = (C1723260uwe) pipoAuthAssem.LLJI.getValue();
                                    if (c1723260uwe2 == null || (str3 = c1723260uwe2.LLILZLL) == null) {
                                        str3 = "";
                                    }
                                    iPipoContainerService.LIZIZ(context, strLIZIZ, str3, false, -1, null, null, null);
                                } else {
                                    SmartRouter.buildRoute(context, strValueOf).open();
                                }
                                PipoAuthViewModel.vQ2(pipoAuthAssem.Go(), 1, 0, str5, null, 8);
                                c098200Yq = Unit.LIZ;
                                C189200o6.m2constructorimpl(c098200Yq);
                                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                                    PipoAuthViewModel.vQ2(pipoAuthAssem.Go(), 0, 5, str5, null, 8);
                                }
                                C189200o6.m1boximpl(c098200Yq);
                            } else {
                                PipoAuthViewModel.vQ2(pipoAuthAssem.Go(), 0, 4, str5, null, 8);
                                pipoAuthAssem.bu(null);
                            }
                            C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
                            if (c19egLIZ != null) {
                                c19egLIZ.finish();
                            }
                        }
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    Dialog dialog2 = (Dialog) ((PipoAuthAssem) c1776200wK2.l0).LLJ.getValue();
                    if (dialog2 != null) {
                        C0FNV.LIZ(dialog2);
                    }
                    ((PipoAuthAssem) c1776200wK2.l0).bu(str4);
                    C19EG c19egLIZ2 = C724240Sb0.LIZ(abstractC738140SxQ);
                    if (c19egLIZ2 != null) {
                        c19egLIZ2.finish();
                    }
                }
            } else {
                Dialog dialog3 = (Dialog) ((PipoAuthAssem) c1776200wK2.l0).LLJ.getValue();
                if (dialog3 != null) {
                    C0FNV.LIZJ(dialog3);
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$5(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS1S2300000_26((EnumC1710890uch) obj2, (UIAssem) obj, (RefundCashierAssem) c1776200wK2.l0, (String) obj4, (String) obj5, 1));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$6(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        BPEAHandler bPEAHandler = new BPEAHandler(Looper.getMainLooper());
        RefundCashierAssem refundCashierAssem = (RefundCashierAssem) c1776200wK2.l0;
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS20S1300000_26((EnumC1710890uch) obj2, refundCashierAssem, (String) obj4, (RefundCashierBasicInfo) obj3, (String) obj5, 1));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$7(X.C1776200wK2 r5, java.lang.Object r6, java.lang.Object r7, java.lang.Object r8, java.lang.Object r9, java.lang.Object r10) {
        /*
            java.lang.String r7 = (java.lang.String) r7
            X.01Au r8 = (X.C291001Au) r8
            X.01Au r9 = (X.C291001Au) r9
            X.01Au r10 = (X.C291001Au) r10
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem r0 = (com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem) r0
            com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData r0 = r0.ip()
            com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean r1 = r0.effect
            r0 = 0
            if (r1 == 0) goto L17
            java.lang.String r0 = r1.name
        L17:
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r7, r0)
            r4 = 1
            r2 = r0 ^ 1
            if (r9 == 0) goto L58
            T r0 = r9.LIZ
            if (r0 == 0) goto L58
            if (r8 == 0) goto L58
            T r0 = r8.LIZ
            if (r0 == 0) goto L58
            r1 = 1
        L2b:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem r0 = (com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem) r0
            android.widget.TextView r3 = r0.LLJJIJIL
            if (r3 == 0) goto L53
            if (r2 != 0) goto L41
            if (r1 == 0) goto L56
            T r0 = r10.LIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L56
        L41:
            java.lang.Object r0 = r5.l0
            com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem r0 = (com.ss.android.ugc.aweme.prop.mobileefffect.edit.EffectEditV2Assem) r0
            int r2 = r0.LLJJI
            int r1 = r7.length()
            r0 = 2
            if (r0 > r1) goto L56
            if (r1 > r2) goto L56
        L50:
            r3.setEnabled(r4)
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L56:
            r4 = 0
            goto L50
        L58:
            r1 = 0
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1776200wK2.invoke$7(X.0wK2, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$8(C1776200wK2 c1776200wK2, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String str = (String) obj;
        String str2 = (String) obj5;
        int iHashCode = str.hashCode();
        if (iHashCode != -1881380961) {
            if (iHashCode != 2448401) {
                if (iHashCode == 1980572282 && str.equals("CANCEL")) {
                    ((InterfaceC1716260ulM) c1776200wK2.l0).LIZ(null);
                }
            } else if (str.equals("PASS")) {
                ((InterfaceC1716260ulM) c1776200wK2.l0).LIZJ(null, str2, Collections.singletonList(obj4));
            }
        } else if (str.equals("REJECT")) {
            ((InterfaceC1716260ulM) c1776200wK2.l0).LIZ(null);
        }
        return Unit.LIZ;
    }
}
