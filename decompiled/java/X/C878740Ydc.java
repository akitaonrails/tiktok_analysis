package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.api.IInboxMobEventService;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ydc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.analytics.IMEmptyInboxMonitor$onInboxNodeHide$1", f = "IMEmptyInboxMonitor.kt", l = {}, m = "invokeSuspend")
public final class C878740Ydc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878740Ydc(String str, String str2, String str3, String str4, InterfaceC1364105Vn<? super C878740Ydc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878740Ydc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [kotlin.jvm.functions.Function1] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C869690Y9v c869690Y9v;
        boolean z;
        boolean z2;
        String string;
        Long lValueOf;
        InterfaceC884020Ym8 interfaceC884020Ym8;
        List<InterfaceC884440Ymo> listLIZIZ;
        boolean z3;
        boolean z4;
        Long lValueOf2;
        C1C7U.LIZ("IMEmptyInboxMonitor@f253.onInboxNodeHide$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C885850Yp5 c885850Yp5 = C885850Yp5.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        c885850Yp5.getClass();
        C0YSQ c0ysq = InterfaceC876950Yaj.LIZ;
        C878750Ydd c878750YddLJIILJJIL = C0YSQ.LIZIZ(c0ysq).LJIILJJIL();
        if (c878750YddLJIILJJIL != null) {
            int i = ((c878750YddLJIILJJIL.LIZ - c878750YddLJIILJJIL.LIZIZ) - c878750YddLJIILJJIL.LIZJ) - c878750YddLJIILJJIL.LIZLLL;
            int i2 = ((c878750YddLJIILJJIL.LJ - c878750YddLJIILJJIL.LJFF) - c878750YddLJIILJJIL.LJI) - c878750YddLJIILJJIL.LJII;
            if ((i > 0 || i2 > 0) && C885850Yp5.LIZIZ <= 0 && C885850Yp5.LIZJ <= 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            Pair[] pairArr = new Pair[27];
            pairArr[0] = new Pair("total_private_count", String.valueOf(c878750YddLJIILJJIL.LIZ));
            pairArr[1] = new Pair("empty_private_count", String.valueOf(c878750YddLJIILJJIL.LIZIZ));
            pairArr[2] = new Pair("risky_private_count", String.valueOf(c878750YddLJIILJJIL.LIZJ));
            pairArr[3] = new Pair("deleted_private_count", String.valueOf(c878750YddLJIILJJIL.LIZLLL));
            pairArr[4] = new Pair("total_group_count", String.valueOf(c878750YddLJIILJJIL.LJ));
            pairArr[5] = new Pair("empty_group_count", String.valueOf(c878750YddLJIILJJIL.LJFF));
            pairArr[6] = new Pair("risky_group_count", String.valueOf(c878750YddLJIILJJIL.LJI));
            pairArr[7] = new Pair("deleted_group_count", String.valueOf(c878750YddLJIILJJIL.LJII));
            pairArr[8] = new Pair("stranger_count", String.valueOf(c878750YddLJIILJJIL.LJIIIIZZ));
            pairArr[9] = new Pair("shown_private_count", String.valueOf(C885850Yp5.LIZIZ));
            pairArr[10] = new Pair("shown_group_count", String.valueOf(C885850Yp5.LIZJ));
            pairArr[11] = new Pair("is_sdk_login", C885850Yp5.LJIJI(((C876310YZh) C876340YZk.LIZ(C876340YZk.LIZ)).LIZIZ()));
            C882400YjW.LIZ.getClass();
            C882400YjW.LIZ();
            C883250Ykt c883250Ykt = C883250Ykt.LL;
            pairArr[12] = new Pair("is_im_func_off", C885850Yp5.LJIJI(C883250Ykt.LIZLLL()));
            C882400YjW.LIZ();
            pairArr[13] = new Pair("is_kids_mode", C885850Yp5.LJIJI(C883250Ykt.LIZJ()));
            C882400YjW.LIZ();
            pairArr[14] = new Pair("is_user_login", C885850Yp5.LJIJI(C461720I8s.LJ()));
            C882400YjW.LIZ();
            pairArr[15] = new Pair("is_token_valid", C885850Yp5.LJIJI(C123100dR.LIZ(C847400XMc.LJI())));
            C882400YjW.LIZ();
            if (C461720I8s.LIZJ() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            pairArr[16] = new Pair("is_uid_valid", C885850Yp5.LJIJI(z4));
            pairArr[17] = new Pair("is_preload_finish", str3);
            pairArr[18] = new Pair("dm_data_received", str4);
            pairArr[19] = new Pair("is_empty_inbox", C885850Yp5.LJIJI(z3));
            pairArr[20] = new Pair("inbox_duration", str);
            pairArr[21] = new Pair("is_using_creator_inbox", C885850Yp5.LJIJI(C19212010Ec.LIZJ.LJLLLLLL()));
            pairArr[22] = new Pair("from_receive_to_hide_duration", str2);
            pairArr[23] = new Pair("adapter_dm_count", String.valueOf(C885850Yp5.LJFF));
            pairArr[24] = new Pair("dm_activeness_level", C885850Yp5.LJIIZILJ());
            IInboxMobEventService iInboxMobEventService = (IInboxMobEventService) PluggableExtentionKt.pluggableSpi$default(IInboxMobEventService.class, false, false, false, 14, null);
            if (iInboxMobEventService != null) {
                lValueOf2 = Long.valueOf(iInboxMobEventService.LIZIZ());
            } else {
                lValueOf2 = null;
            }
            pairArr[25] = new Pair("launch_to_enter_inbox_duration_ms", String.valueOf(lValueOf2));
            pairArr[26] = new Pair("leave_inbox_times", String.valueOf(C885850Yp5.LJIIIIZZ.LIZJ()));
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
            C0I0B.LJFF.LIZIZ();
            C20684815ws.LJIILLIIL("im_empty_inbox", mapLJIIIIZZ);
        }
        if (((Number) C0BBM.LIZ.getValue()).intValue() == 1) {
            String str5 = this.LL;
            String str6 = this.LLILLJJLI;
            String str7 = this.LLILLL;
            boolean zLJLLLLLL = C19212010Ec.LIZJ.LJLLLLLL();
            if (zLJLLLLLL) {
                c869690Y9v = new C869690Y9v(null, new C0YB9(C0YZX.PRIMARY), null, null, null, null, 1019);
            } else {
                C0YAJ c0yaj = new C0YAJ();
                c869690Y9v = new C869690Y9v(c0yaj.LIZ, c0yaj.LIZIZ, c0yaj.LIZJ, c0yaj.LIZLLL, c0yaj.LJ, c0yaj.LJFF, c0yaj.LJI, c0yaj.LJII, c0yaj.LJIIIIZZ, false);
            }
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = C0YSQ.LIZIZ(c0ysq).LJIIJJI(C869770YAd.LIZ(c869690Y9v, LSPassThroughRecordSizeConfig.DEFAULT, 0L, false, 58));
            if (c0y6qLJIIJJI.LIZIZ == null) {
                List<C0Y8T> list = c0y6qLJIIJJI.LIZ.LIZIZ;
                int size = list.size();
                int i3 = 0;
                int i4 = 0;
                for (C0Y8T c0y8t : list) {
                    if (zLJLLLLLL && (c0y8t.getCategory() != FilterTabType.PRIMARY.getValue() || c0y8t.getCategory() != FilterTabType.OVERALL.getValue())) {
                        i3++;
                    } else {
                        C0Z2V.LIZ.getClass();
                        if (!C0Z2V.LJI(c0y8t)) {
                            i4++;
                        }
                    }
                }
                int i5 = (size - i3) - i4;
                if (i5 > 0 && !C885850Yp5.LIZLLL) {
                    z = true;
                } else {
                    z = false;
                }
                Pair[] pairArr2 = new Pair[19];
                pairArr2[0] = new Pair("valid_conv_count", String.valueOf(i5));
                pairArr2[1] = new Pair("shown_inbox_chat", C885850Yp5.LJIJI(C885850Yp5.LIZLLL));
                pairArr2[2] = new Pair("adapter_dm_count", String.valueOf(C885850Yp5.LJFF));
                C876340YZk c876340YZk = C876340YZk.LIZ;
                pairArr2[3] = new Pair("im_init_state", ((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZIZ.LJFF());
                pairArr2[4] = new Pair("is_sdk_login", C885850Yp5.LJIJI(((C876310YZh) C876340YZk.LIZ(c876340YZk)).LIZIZ()));
                C882400YjW.LIZ.getClass();
                C882400YjW.LIZ();
                C883250Ykt c883250Ykt2 = C883250Ykt.LL;
                pairArr2[5] = new Pair("is_im_func_off", C885850Yp5.LJIJI(C883250Ykt.LIZLLL()));
                C882400YjW.LIZ();
                pairArr2[6] = new Pair("is_kids_mode", C885850Yp5.LJIJI(C883250Ykt.LIZJ()));
                C882400YjW.LIZ();
                pairArr2[7] = new Pair("is_user_login", C885850Yp5.LJIJI(C461720I8s.LJ()));
                C882400YjW.LIZ();
                pairArr2[8] = new Pair("is_token_valid", C885850Yp5.LJIJI(C123100dR.LIZ(C847400XMc.LJI())));
                C882400YjW.LIZ();
                if (C461720I8s.LIZJ() > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                pairArr2[9] = new Pair("is_uid_valid", C885850Yp5.LJIJI(z2));
                pairArr2[10] = new Pair("is_preload_finish", str7);
                AbstractC883730Ylf.LJIIIIZZ.getClass();
                AbstractC883730Ylf abstractC883730YlfLJ = C881500Yi4.LJ();
                if (abstractC883730YlfLJ == null || (interfaceC884020Ym8 = abstractC883730YlfLJ.LJIIZILJ().get(C881500Yi4.LIZLLL())) == null || (listLIZIZ = interfaceC884020Ym8.LIZIZ(false)) == null || (string = Integer.valueOf(listLIZIZ.size()).toString()) == null) {
                    string = CardStruct.IStatusCode.DEFAULT;
                }
                pairArr2[11] = new Pair("dm_data_received", string);
                pairArr2[12] = new Pair("is_empty_inbox", C885850Yp5.LJIJI(z));
                pairArr2[13] = new Pair("inbox_duration", str5);
                pairArr2[14] = new Pair("from_receive_to_hide_duration", str6);
                pairArr2[15] = new Pair("is_using_creator_inbox", C885850Yp5.LJIJI(zLJLLLLLL));
                pairArr2[16] = new Pair("dm_activeness_level", C885850Yp5.LJIIZILJ());
                CharSequence charSequence = null;
                IInboxMobEventService iInboxMobEventService2 = (IInboxMobEventService) PluggableExtentionKt.pluggableSpi$default(IInboxMobEventService.class, false, false, false, 14, null);
                if (iInboxMobEventService2 != null) {
                    lValueOf = Long.valueOf(iInboxMobEventService2.LIZIZ());
                } else {
                    lValueOf = null;
                }
                pairArr2[17] = new Pair("launch_to_enter_inbox_duration_ms", String.valueOf(lValueOf));
                pairArr2[18] = new Pair("leave_inbox_times", String.valueOf(C885850Yp5.LJIIIIZZ.LIZJ()));
                Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr2);
                if (C1207204nu.LIZ()) {
                    charSequence = null;
                    mapLJIIJ.putAll(C2097608Jq.LJIIIIZZ(new Pair("actor_work", C885850Yp5.LJIJI(((AtomicBoolean) C885850Yp5.LJIILIIL.getValue()).get())), new Pair("broken_tag_before_filter", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIILJJIL.getValue(), ",", null, null, 0, null, null, 62)), new Pair("before_filter_size", String.valueOf(((C563400M7u) C885850Yp5.LJIILL.getValue()).LIZJ())), new Pair("after_filter_size", String.valueOf(((C563400M7u) C885850Yp5.LJIILLIIL.getValue()).LIZJ())), new Pair("broken_tag_after_filter", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIIZILJ.getValue(), ",", null, null, 0, null, null, 62)), new Pair("broken_tag_decorate", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIJ.getValue(), ",", null, null, 0, null, null, 62)), new Pair("broken_tag_vo_convert", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIJI.getValue(), ",", null, null, 0, null, null, 62)), new Pair("broken_tag_before_chat_list_data_update", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIJJ.getValue(), ",", null, null, 0, null, null, 62)), new Pair("broken_tag_on_chat_list_data_update", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIJJLI.getValue(), ",", null, null, 0, null, null, 62)), new Pair("preload_size_from_data_source", String.valueOf(((C563400M7u) C885850Yp5.LJIIJ.getValue()).LIZJ())), new Pair("preload_result_end_size", String.valueOf(((C563400M7u) C885850Yp5.LJIIJJI.getValue()).LIZJ())), new Pair("invalid_conv_size_from_data_source", String.valueOf(((C563400M7u) C885850Yp5.LJIIL.getValue()).LIZJ())), new Pair("broken_common_bridge_observer", C13LP.LJJLIIIJ((C823170WQx) C885850Yp5.LJIL.getValue(), ",", null, null, 0, null, null, 62)), new Pair("common_bridge_observer_block_reason", ((AtomicReference) C885850Yp5.LJJ.getValue()).get()), new Pair("common_bridge_before_on_next_size", String.valueOf(((C563400M7u) C885850Yp5.LJJI.getValue()).LIZJ())), new Pair("convert_entrance_exception_count", String.valueOf(((C563400M7u) C885850Yp5.LJJIFFI.getValue()).LIZJ()))));
                }
                if (C289920BXy.LIZ()) {
                    mapLJIIJ.putAll(C2097608Jq.LJIIIIZZ(new Pair("on_next_error", C885850Yp5.LJIJI(((AtomicBoolean) C885850Yp5.LJJII.getValue()).get())), new Pair("message_inbox_widget_observe_flag", C885850Yp5.LJIJI(((AtomicBoolean) C885850Yp5.LJJIII.getValue()).get())), new Pair("message_inbox_widget_on_next_receive_size", String.valueOf(((C563400M7u) C885850Yp5.LJJIIJ.getValue()).LIZJ())), new Pair("message_inbox_widget_data_process_tag", C13LP.LJJLIIIJ(C13LP.LJLLJ(C13LP.LLIIII((C823170WQx) C885850Yp5.LJJIIZ.getValue())), ",", charSequence, charSequence, 0, charSequence, charSequence, 62)), new Pair("message_inbox_widget_fragment_v2_vm_size", String.valueOf(((C563400M7u) C885850Yp5.LJJIIZI.getValue()).LIZJ())), new Pair("widget_status", ((AtomicReference) C885850Yp5.LJJIJ.getValue()).get()), new Pair("entrance_request_result_status_code", ((AtomicReference) C885850Yp5.LJJIJIIJI.getValue()).get())));
                }
                if (C0BBO.LIZ()) {
                    mapLJIIJ.put("first_dm_cell_index", String.valueOf(((C563400M7u) C885850Yp5.LJI.getValue()).LIZJ()));
                }
                C0I0B.LJFF.LIZIZ();
                C20684815ws.LJIILLIIL("im_empty_inbox_v2", mapLJIIJ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMEmptyInboxMonitor@f253.onInboxNodeHide$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
