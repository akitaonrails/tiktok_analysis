package X;

import android.content.Context;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.android.livesdk.model.message.Img;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.container.lynxcard.LynxCardEventParams;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.BFFUIConfig;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.GetMoreActionResp;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.LynxCardInfo;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PopupCardBffData;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS213S0000000_24;
import kotlin.jvm.internal.AwS173S1100000_24;
import org.json.JSONObject;
import webcast.data.oec_msg.ProductItem;

/* JADX INFO: renamed from: X.17y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21201917y5 extends AbstractC21202317y9 implements InterfaceC21198817xa, InterfaceC21202517yB {
    public final Function1<Boolean, Unit> LLIZLLLIL;
    public final C21202017y6 LLJ;
    public Function2<? super Boolean, ? super String, Unit> LLJI;
    public InterfaceC21202817yE LLJIJIL;

    @Override // X.InterfaceC21197417xM
    public final void A(int i, C184F c184f) {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJIIJJI(GetMoreActionResp getMoreActionResp, Function0<Unit> function0) {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJIIZI(String str, Img img) {
    }

    @Override // X.InterfaceC21197417xM
    public final void LJJIL() {
    }

    @Override // X.InterfaceC21184217vE
    public final void LJJLIIIJILLIZJL(boolean z) {
    }

    @Override // X.AbstractC21202917yF
    public final boolean h0() {
        return false;
    }

    @Override // X.AbstractC21202317y9, X.AbstractC21202917yF
    public void setAtmosphereTags(List<C184F> list) {
    }

    @Override // X.InterfaceC21198817xa
    public final void LLJI() {
        C21202017y6 c21202017y6 = this.LLJ;
        if (c21202017y6 != null) {
            c21202017y6.i0(new LynxCardEventParams(1, String.valueOf(System.currentTimeMillis())));
        }
        List<C1556460qbc> list = C1563970qnj.LIZ;
        for (C1556460qbc c1556460qbc : (List) C1563970qnj.LJFF(AFwS213S0000000_24.get$arr$(468))) {
            C21202017y6 c21202017y62 = c1556460qbc.LIZ.get();
            if (c21202017y62 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<C1556460qbc> list2 = C1563970qnj.LIZ;
                String str = c1556460qbc.LIZIZ;
                C21202017y6 c21202017y63 = this.LLJ;
                C1563970qnj.LIZLLL(jCurrentTimeMillis, c21202017y63 != null ? c21202017y63.LLILZ : null, c21202017y62, str, "card_in_anim_end_send_event");
                c21202017y62.i0(new LynxCardEventParams(1, String.valueOf(System.currentTimeMillis())));
            }
        }
    }

    @Override // X.InterfaceC21198817xa
    public final void LLLZLZ() {
        C21202017y6 c21202017y6 = this.LLJ;
        if (c21202017y6 != null) {
            c21202017y6.i0(new LynxCardEventParams(2, String.valueOf(System.currentTimeMillis())));
        }
        List<C1556460qbc> list = C1563970qnj.LIZ;
        for (C1556460qbc c1556460qbc : (List) C1563970qnj.LJFF(AFwS213S0000000_24.get$arr$(468))) {
            C21202017y6 c21202017y62 = c1556460qbc.LIZ.get();
            if (c21202017y62 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<C1556460qbc> list2 = C1563970qnj.LIZ;
                String str = c1556460qbc.LIZIZ;
                C21202017y6 c21202017y63 = this.LLJ;
                C1563970qnj.LIZLLL(jCurrentTimeMillis, c21202017y63 != null ? c21202017y63.LLILZ : null, c21202017y62, str, "card_out_anim_end_send_event");
                c21202017y62.i0(new LynxCardEventParams(2, String.valueOf(System.currentTimeMillis())));
            }
        }
    }

    @Override // X.InterfaceC21202517yB
    public final Set<String> events() {
        Set<String> setEvents;
        InterfaceC21202817yE interfaceC21202817yE = this.LLJIJIL;
        return (interfaceC21202817yE == null || (setEvents = interfaceC21202817yE.events()) == null) ? C08CX.INSTANCE : setEvents;
    }

    @Override // X.AbstractC21202317y9, X.AbstractC21202917yF
    public Map<String, String> getCommonShowParams() {
        return C2097608Jq.LJ();
    }

    @Override // X.AbstractC21202917yF
    public Map<String, String> getPromotionLogoDaInfo() {
        return C2097608Jq.LJ();
    }

    public final Function1<Boolean, Unit> getOnResetAutoDismiss() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC21202317y9, X.AbstractC21202917yF, X.InterfaceC21184217vE
    public List<String> getProductShowIds() {
        return C13BV.INSTANCE;
    }

    @Override // X.InterfaceC1865210ydb
    public final Map<String, String> LJLLL(String str) {
        return C2097608Jq.LJ();
    }

    @Override // X.InterfaceC21202517yB
    public final void LLLLLLLLL(C262100zr c262100zr) {
        InterfaceC21202817yE interfaceC21202817yE = this.LLJIJIL;
        if (interfaceC21202817yE != null) {
            interfaceC21202817yE.LLLLLLLLL(c262100zr);
        }
    }

    public C21201917y5(Context context, Function1 function1) {
        super(context, null, 0);
        this.LLIZLLLIL = function1;
        C21202017y6 c21202017y6 = new C21202017y6(context);
        c21202017y6.h0(this);
        addView(c21202017y6, -1, -2);
        this.LLJ = c21202017y6;
    }

    @Override // X.AbstractC21202317y9, X.InterfaceC21184217vE
    public final void U(ProductItem productItem, C1563990qnl c1563990qnl) {
        C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, c1563990qnl, C2097608Jq.LJ());
    }

    @Override // X.InterfaceC21184217vE
    public final void u(UsPopupCardVO usPopupCardVO, String str, Map<String, ? extends Object> map) {
        C1564050qnr c1564050qnr;
        AbstractC21191617wQ abstractC21191617wQ;
        boolean zBooleanValue;
        Boolean bool;
        AbstractC21191617wQ abstractC21191617wQ2;
        C21202017y6 c21202017y6;
        AbstractC21191617wQ abstractC21191617wQ3;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("refresh pop_card_id:");
        sbLIZ.append(usPopupCardVO.popCardId);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("extra:");
        sbLIZ2.append(map);
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        this.LLIZ = usPopupCardVO;
        Object obj = map.get("request_start_time");
        if (obj != null && (c21202017y6 = this.LLJ) != null && (abstractC21191617wQ3 = c21202017y6.LLILLL) != null) {
            abstractC21191617wQ3.LIZ(obj.toString(), "request_start_time");
        }
        C21202017y6 c21202017y62 = this.LLJ;
        if (c21202017y62 != null && (abstractC21191617wQ2 = c21202017y62.LLILLL) != null) {
            JSONObject jSONObject = usPopupCardVO.latencyInfo;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            abstractC21191617wQ2.LIZJ = jSONObject;
            C1563990qnl c1563990qnl = usPopupCardVO.chainInfo;
            if (c1563990qnl != null) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("trigger_source", c1563990qnl.LIZ);
                    jSONObject2.put("chain_id", c1563990qnl.LIZIZ);
                    abstractC21191617wQ2.LIZLLL = jSONObject2;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("UsLynxPopCardView setChainInfo error: ");
                    sbLIZ3.append(e.getMessage());
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
                    c2341109Fh2.getClass();
                    C2341109Fh.LIZJ(strLIZIZ2);
                }
            }
        }
        C21202017y6 c21202017y63 = this.LLJ;
        if (c21202017y63 != null) {
            AbstractC21191617wQ abstractC21191617wQ4 = c21202017y63.LLILLL;
            if (abstractC21191617wQ4 != null) {
                abstractC21191617wQ4.LIZ = usPopupCardVO.getLynxCardData();
            }
            Object obj2 = map.get("is_repin");
            if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            c21202017y63.ga0(zBooleanValue);
            C21192417wY.LIZIZ(EnumC21192517wZ.CHAIN_NATIVE_SUCCEED, usPopupCardVO.chainInfo, C2097608Jq.LJ());
        }
        List<C1556460qbc> list = C1563970qnj.LIZ;
        for (C1556460qbc c1556460qbc : (List) C1563970qnj.LJFF(AFwS213S0000000_24.get$arr$(468))) {
            C21202017y6 c21202017y64 = c1556460qbc.LIZ.get();
            if (c21202017y64 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<C1556460qbc> list2 = C1563970qnj.LIZ;
                String str2 = c1556460qbc.LIZIZ;
                C21202017y6 c21202017y65 = this.LLJ;
                if (c21202017y65 != null) {
                    c1564050qnr = c21202017y65.LLILZ;
                } else {
                    c1564050qnr = null;
                }
                C1563970qnj.LIZLLL(jCurrentTimeMillis, c1564050qnr, c21202017y64, str2, "product_refresh_refresh_data");
                if (obj != null && (abstractC21191617wQ = c21202017y64.LLILLL) != null) {
                    abstractC21191617wQ.LIZ(obj.toString(), "request_start_time");
                }
                AbstractC21191617wQ abstractC21191617wQ5 = c21202017y64.LLILLL;
                if (abstractC21191617wQ5 != null) {
                    JSONObject jSONObject3 = usPopupCardVO.latencyInfo;
                    if (jSONObject3 == null) {
                        jSONObject3 = new JSONObject();
                    }
                    abstractC21191617wQ5.LIZJ = jSONObject3;
                    C1563990qnl c1563990qnl2 = usPopupCardVO.chainInfo;
                    if (c1563990qnl2 != null) {
                        try {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put("trigger_source", c1563990qnl2.LIZ);
                            jSONObject4.put("chain_id", c1563990qnl2.LIZIZ);
                            abstractC21191617wQ5.LIZLLL = jSONObject4;
                        } catch (Exception e2) {
                            TryCatchGuardChecker.doCheck(e2);
                            C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("UsLynxPopCardView setChainInfo error: ");
                            sbLIZ4.append(e2.getMessage());
                            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
                            c2341109Fh3.getClass();
                            C2341109Fh.LIZJ(strLIZIZ3);
                        }
                    }
                }
                AbstractC21191617wQ abstractC21191617wQ6 = c21202017y64.LLILLL;
                if (abstractC21191617wQ6 != null) {
                    abstractC21191617wQ6.LIZ = usPopupCardVO.getLynxCardData();
                }
                c21202017y64.ga0(false);
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zO1;
        String str;
        Map<String, Object> mapLJ;
        InterfaceC2183451Acp interfaceC2183451AcpX3;
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (!getShown()) {
            setShown(true);
            InterfaceC212166181c popCardViewCallback = getPopCardViewCallback();
            if (popCardViewCallback != null) {
                popCardViewCallback.LJ();
            }
        }
        if (z) {
            ILiveOuterService iLiveOuterService = (ILiveOuterService) PluggableExtentionKt.pluggableSpi$default(ILiveOuterService.class, false, false, false, 14, null);
            if (iLiveOuterService != null && (interfaceC2183451AcpX3 = iLiveOuterService.X3()) != null) {
                zO1 = interfaceC2183451AcpX3.o1();
            } else {
                zO1 = false;
            }
            int i5 = i3 - i;
            int iLIZ = C1210230hbB.LIZ(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL, getContext());
            if (!zO1 && i5 >= iLIZ) {
                z2 = false;
            }
            if (z2 != this.LLILZIL) {
                this.LLILZIL = z2;
                C21202017y6 c21202017y6 = this.LLJ;
                if (c21202017y6 != null) {
                    if (z2) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    AbstractC21191617wQ abstractC21191617wQ = c21202017y6.LLILLL;
                    if (abstractC21191617wQ != null) {
                        abstractC21191617wQ.LIZ(str, "is_link_mic");
                    }
                    InterfaceC1541990qEH interfaceC1541990qEH = c21202017y6.LL;
                    if (interfaceC1541990qEH != null) {
                        AbstractC21191617wQ abstractC21191617wQ2 = c21202017y6.LLILLL;
                        if (abstractC21191617wQ2 == null || (mapLJ = abstractC21191617wQ2.LIZIZ()) == null) {
                            mapLJ = C2097608Jq.LJ();
                        }
                        interfaceC1541990qEH.U0(mapLJ);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC21202917yF
    public final void j0(UsPopupCardVO usPopupCardVO, C1743900vTw c1743900vTw, final Function2<? super Boolean, ? super String, Unit> function2, boolean z, boolean z2, int i) {
        InterfaceC21202817yE interfaceC21202817yE;
        String strLIZJ;
        String str;
        Number number;
        BFFUIConfig bFFUIConfig;
        this.LLIZ = usPopupCardVO;
        this.LLJI = function2;
        int i2 = usPopupCardVO.cardType;
        if (i2 != 1) {
            if (i2 != 3) {
                final C21202017y6 c21202017y6 = this.LLJ;
                interfaceC21202817yE = new InterfaceC21202817yE(c21202017y6, function2) { // from class: X.17y7
                    public final C21202017y6 LL;
                    public final Function2<Boolean, String, Unit> LLILLJJLI;

                    @Override // X.InterfaceC21202517yB
                    public final Set<String> events() {
                        return C13LQ.LJLIIL(new String[]{"ec_live_room_close_card", "ec_lynx_card_click"});
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[PHI: r6
                      0x00c7: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v8 java.lang.String) binds: [B:46:0x00c4, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x014e  */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x0154 A[PHI: r6
                      0x0154: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:96:0x0151, B:58:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC21202517yB
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LLLLLLLLL(X.C262100zr r12) {
                        /*
                            Method dump skipped, instruction units count: 342
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21202117y7.LLLLLLLLL(X.00zr):void");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = c21202017y6;
                        this.LLILLJJLI = function2;
                    }
                };
            } else {
                final C21202017y6 c21202017y62 = this.LLJ;
                interfaceC21202817yE = new InterfaceC21202817yE(c21202017y62, function2) { // from class: X.17y7
                    public final C21202017y6 LL;
                    public final Function2<Boolean, String, Unit> LLILLJJLI;

                    @Override // X.InterfaceC21202517yB
                    public final Set<String> events() {
                        return C13LQ.LJLIIL(new String[]{"ec_live_room_close_card", "ec_lynx_card_click"});
                    }

                    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6  */
                    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
                    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
                    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7 A[PHI: r6
                      0x00c7: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v8 java.lang.String) binds: [B:46:0x00c4, B:26:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Removed duplicated region for block: B:72:0x010e  */
                    /* JADX WARN: Removed duplicated region for block: B:81:0x0123  */
                    /* JADX WARN: Removed duplicated region for block: B:94:0x014e  */
                    /* JADX WARN: Removed duplicated region for block: B:98:0x0154 A[PHI: r6
                      0x0154: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v3 java.lang.String) binds: [B:96:0x0151, B:58:0x00df] A[DONT_GENERATE, DONT_INLINE]] */
                    @Override // X.InterfaceC21202517yB
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LLLLLLLLL(X.C262100zr r12) {
                        /*
                            Method dump skipped, instruction units count: 342
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21202117y7.LLLLLLLLL(X.00zr):void");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        this.LL = c21202017y62;
                        this.LLILLJJLI = function2;
                    }
                };
            }
        } else {
            final C21202017y6 c21202017y63 = this.LLJ;
            final Function1<Boolean, Unit> function1 = this.LLIZLLLIL;
            interfaceC21202817yE = new InterfaceC21202817yE(c21202017y63, function2, function1) { // from class: X.17y4
                public final C21202017y6 LL;
                public final Function2<Boolean, String, Unit> LLILLJJLI;
                public final Function1<Boolean, Unit> LLILLL;

                @Override // X.InterfaceC21202517yB
                public final Set<String> events() {
                    return C13LQ.LJLIIL(new String[]{"ec_live_room_close_card", "ec_lynx_card_click"});
                }

                /* JADX WARN: Removed duplicated region for block: B:128:0x01ed  */
                /* JADX WARN: Removed duplicated region for block: B:184:0x02da  */
                /* JADX WARN: Removed duplicated region for block: B:185:0x02dd  */
                /* JADX WARN: Removed duplicated region for block: B:189:0x02e5 A[PHI: r6
                  0x02e5: PHI (r6v12 java.lang.String) = (r6v11 java.lang.String), (r6v14 java.lang.String), (r6v14 java.lang.String) binds: [B:187:0x02e1, B:122:0x01db, B:124:0x01e1] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:197:0x02fe  */
                /* JADX WARN: Removed duplicated region for block: B:208:0x031b  */
                /* JADX WARN: Removed duplicated region for block: B:209:0x031e  */
                /* JADX WARN: Removed duplicated region for block: B:213:0x0326 A[PHI: r6
                  0x0326: PHI (r6v1 java.lang.String) = (r6v0 java.lang.String), (r6v21 java.lang.String) binds: [B:211:0x0322, B:58:0x00e5] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:35:0x00ac  */
                /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00c7  */
                /* JADX WARN: Removed duplicated region for block: B:48:0x00cd A[PHI: r9
                  0x00cd: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v7 java.lang.String) binds: [B:46:0x00ca, B:26:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
                /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // X.InterfaceC21202517yB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LLLLLLLLL(X.C262100zr r21) {
                    /*
                        Method dump skipped, instruction units count: 894
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C21201817y4.LLLLLLLLL(X.00zr):void");
                }

                /* JADX WARN: Multi-variable type inference failed */
                {
                    this.LL = c21202017y63;
                    this.LLILLJJLI = function2;
                    this.LLILLL = function1;
                }
            };
        }
        this.LLJIJIL = interfaceC21202817yE;
        C21202017y6 c21202017y64 = this.LLJ;
        if (c21202017y64 != null) {
            if (c1743900vTw != null) {
                strLIZJ = c1743900vTw.LIZJ("room_id");
            } else {
                strLIZJ = null;
            }
            int i3 = usPopupCardVO.cardType;
            Long lValueOf = Long.valueOf(usPopupCardVO.popCardId);
            LynxCardInfo lynxCardInfo = usPopupCardVO.lynxCardInfo;
            if (lynxCardInfo == null || (str = lynxCardInfo.lynxCardSchema) == null) {
                str = "";
            }
            C1564050qnr c1564050qnr = new C1564050qnr(strLIZJ, i3, lValueOf, str, usPopupCardVO.requestTime, usPopupCardVO.latencyInfo, usPopupCardVO.chainInfo);
            c21202017y64.j0(usPopupCardVO.getLynxCardData(), c1564050qnr, null);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jyq_debug setPopProduct, after setData dataProvider ");
            sbLIZ.append(c21202017y64.LLILLL);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LJ(strLIZIZ);
            AbstractC21191617wQ abstractC21191617wQ = c21202017y64.LLILLL;
            if (abstractC21191617wQ != null) {
                JSONObject jSONObject = usPopupCardVO.latencyInfo;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                abstractC21191617wQ.LIZJ = jSONObject;
                abstractC21191617wQ.LIZ = usPopupCardVO.getLynxCardData();
                C1563990qnl c1563990qnl = usPopupCardVO.chainInfo;
                if (c1563990qnl != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("trigger_source", c1563990qnl.LIZ);
                        jSONObject2.put("chain_id", c1563990qnl.LIZIZ);
                        abstractC21191617wQ.LIZLLL = jSONObject2;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("UsLynxPopCardView setChainInfo error: ");
                        sbLIZ2.append(e.getMessage());
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c2341109Fh2.getClass();
                        C2341109Fh.LIZJ(strLIZIZ2);
                    }
                }
                C2341109Fh c2341109Fh3 = C2341109Fh.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("jyq_debug setPopProduct, updateTemplateData ");
                sbLIZ3.append(this);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                c2341109Fh3.getClass();
                C2341109Fh.LJ(strLIZIZ3);
            } else {
                C21192417wY.LIZIZ(EnumC21192517wZ.LYNX_DATA_ERROR, usPopupCardVO.chainInfo, C2097908Jt.LIZJ(new Pair("reason", "lynx view mount failed: null dataProvider")));
            }
            C2341109Fh c2341109Fh4 = C2341109Fh.LIZ;
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("jyq_debug setPopProduct, pop_card_id:");
            sbLIZ4.append(usPopupCardVO.popCardId);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            c2341109Fh4.getClass();
            C2341109Fh.LJ(strLIZIZ4);
            List<C1556460qbc> list = C1563970qnj.LIZ;
            C1563970qnj.LJ(new AwS173S1100000_24(usPopupCardVO.getLynxCardData(), c1564050qnr, 11));
            for (C1556460qbc c1556460qbc : (List) C1563970qnj.LJFF(AFwS213S0000000_24.get$arr$(468))) {
                C21202017y6 c21202017y65 = c1556460qbc.LIZ.get();
                if (c21202017y65 != null) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    AbstractC21191617wQ abstractC21191617wQ2 = c21202017y65.LLILLL;
                    if (abstractC21191617wQ2 != null) {
                        abstractC21191617wQ2.LIZ = usPopupCardVO.getLynxCardData();
                    }
                    c21202017y65.j0(usPopupCardVO.getLynxCardData(), c1564050qnr, c1556460qbc.LIZIZ);
                    List<C1556460qbc> list2 = C1563970qnj.LIZ;
                    c1564050qnr = c1564050qnr;
                    C1563970qnj.LIZLLL(jCurrentTimeMillis, c1564050qnr, c21202017y65, c1556460qbc.LIZIZ, "set_pop_product_set_data");
                }
            }
            PopupCardBffData popupCardBffData = usPopupCardVO.bffData;
            if (popupCardBffData == null || (bFFUIConfig = popupCardBffData.cardUiConfig) == null || (number = bFFUIConfig.height) == null) {
                number = 94;
            }
            C19ME c19me = new C19ME(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(number)));
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c21202017y64);
            c21202017y64.setLayoutParams(c19me);
        }
    }
}
