package X;

import android.content.Context;
import com.bytedance.im.core.proto.BatchUpdateConversationParticipantResponseBody;
import com.bytedance.im.core.proto.UpdateConversationParticipantResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.model.GroupCheckMsg;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0hz8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1225080hz8 extends C1225700i08 {
    public final C01GW LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.0hzA] */
    @Override // X.C1225700i08, X.InterfaceC1224490hyB
    public final void LJIJ(C1224590hyL c1224590hyL) {
        C1224780hye c1224780hyeLJIILLIIL;
        List<C1224840hyk> list;
        super.LJIJ(c1224590hyL);
        if (!c1224590hyL.LJ && c1224590hyL.LIZIZ) {
            EnumC1227730i3P enumC1227730i3P = c1224590hyL.LIZ;
            EnumC1227730i3P enumC1227730i3P2 = EnumC1227730i3P.MAIN;
            if (enumC1227730i3P != enumC1227730i3P2) {
                return;
            }
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R != null) {
                interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P2, (Boolean) null, (String) null, Boolean.TRUE, 14), false);
            }
            InterfaceC1226510i1R interfaceC1226510i1R2 = this.LL.LIZ;
            if (interfaceC1226510i1R2 != null && (c1224780hyeLJIILLIIL = interfaceC1226510i1R2.LJIILLIIL()) != null && (list = c1224780hyeLJIILLIIL.LIZIZ) != null) {
                ArrayList arrayList = new ArrayList();
                for (C1224840hyk c1224840hyk : list) {
                    if (!c1224840hyk.LLJILLL) {
                        arrayList.add(c1224840hyk);
                    }
                }
                final ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C1224840hyk) it2.next()).LLILZ);
                }
                AbstractC879060Ye8 abstractC879060Ye8 = (AbstractC879060Ye8) this.LLILZLL.getValue();
                if (abstractC879060Ye8 == 0) {
                    InterfaceC1226510i1R interfaceC1226510i1R3 = this.LL.LIZ;
                    if (interfaceC1226510i1R3 != null) {
                        interfaceC1226510i1R3.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, (Boolean) null, (String) null, Boolean.FALSE, 14), false);
                    }
                    C0I0B.LJFF.LIZJ();
                    return;
                }
                abstractC879060Ye8.LIZ(arrayList2, C0Z9N.ADMIN.getValue(), C2097608Jq.LJ(), new InterfaceC863560XuE<BatchUpdateConversationParticipantResponseBody>() { // from class: X.0hzA
                    @Override // X.InterfaceC863600XuI
                    public final void LIZIZ(C0YMW c0ymw) {
                        InterfaceC1226510i1R interfaceC1226510i1R4 = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R4 != null) {
                            interfaceC1226510i1R4.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, (Boolean) null, (String) null, Boolean.FALSE, 14), false);
                        }
                        IIMErrorUtils.LIZ.getClass();
                        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
                        if (iIMErrorUtilsLIZ != null) {
                            C0I0B.LJFF.LIZJ();
                            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
                        }
                    }

                    @Override // X.InterfaceC863600XuI
                    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                    }

                    @Override // X.InterfaceC863560XuE
                    public final void LJ(BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody, C0YMW c0ymw) {
                        int size;
                        C19EG activity;
                        Object c098200Yq;
                        String statusMsg;
                        List<UpdateConversationParticipantResult> list2;
                        BatchUpdateConversationParticipantResponseBody batchUpdateConversationParticipantResponseBody2 = batchUpdateConversationParticipantResponseBody;
                        if (batchUpdateConversationParticipantResponseBody2 != null && (list2 = batchUpdateConversationParticipantResponseBody2.success_participants) != null) {
                            size = list2.size();
                        } else {
                            size = 0;
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R4 = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R4 != null) {
                            interfaceC1226510i1R4.LJIIJJI(new C1224600hyM(EnumC1227730i3P.MAIN, (Boolean) null, (String) null, Boolean.FALSE, 14), false);
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R5 = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R5 != null && (activity = interfaceC1226510i1R5.getActivity()) != null) {
                            if (c0ymw == null) {
                                statusMsg = C20642515q3.LJ(2131755189, size, String.valueOf(size));
                            } else {
                                try {
                                    c098200Yq = (GroupCheckMsg) C051M.LIZIZ(GroupCheckMsg.class, c0ymw.getCheckMsg());
                                    C189200o6.m2constructorimpl(c098200Yq);
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    c098200Yq = new C098200Yq(th);
                                    C189200o6.m2constructorimpl(c098200Yq);
                                }
                                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                    c098200Yq = null;
                                }
                                GroupCheckMsg groupCheckMsg = (GroupCheckMsg) c098200Yq;
                                if (groupCheckMsg != null) {
                                    statusMsg = groupCheckMsg.getStatusMsg();
                                }
                            }
                            if (statusMsg != null) {
                                C1389890mGx c1389890mGx = new C1389890mGx(activity);
                                c1389890mGx.LJIIJ(statusMsg);
                                c1389890mGx.LIZ(true);
                                c1389890mGx.LJIIJJI();
                            }
                        }
                        InterfaceC1226510i1R interfaceC1226510i1R6 = this.LIZ.LL.LIZ;
                        if (interfaceC1226510i1R6 != null) {
                            interfaceC1226510i1R6.LJIILL(C343970De7.LIZ, null);
                        }
                        C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
                        int value = C0Z9N.ADMIN.getValue();
                        List<String> list3 = arrayList2;
                        String str = (String) this.LIZ.LLILZIL.getValue();
                        if (str == null) {
                            str = "";
                        }
                        c913630Zsn.LJII("admin_add_button", value, list3, str, C0I0B.LJFF.LIZIZ());
                    }
                });
            }
        }
    }

    @Override // X.C1225700i08, X.InterfaceC1224250hxn
    public final void LJJJ(C1224790hyf c1224790hyf) {
        boolean z;
        List<C1224840hyk> list = c1224790hyf.LIZIZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<C1224840hyk> it2 = list.iterator();
            while (true) {
                z = true;
                if (!it2.hasNext()) {
                    break;
                }
                C1224840hyk next = it2.next();
                if (true ^ next.LLJILLL) {
                    arrayList.add(next);
                }
            }
            int size = arrayList.size();
            String string = ((Context) this.LLILZ.getValue()).getString(2131830186, String.valueOf(size), String.valueOf(this.LLILLJJLI.LJJJJLL().LIZJ().LIZIZ()));
            InterfaceC1226510i1R interfaceC1226510i1R = this.LL.LIZ;
            if (interfaceC1226510i1R != null) {
                EnumC1227730i3P enumC1227730i3P = EnumC1227730i3P.MAIN;
                if (size <= 0) {
                    z = false;
                }
                interfaceC1226510i1R.LJIIJJI(new C1224600hyM(enumC1227730i3P, Boolean.valueOf(z), string, (Boolean) null, (Boolean) null), false);
            }
        }
    }

    public C1225080hz8(AbstractC1225770i0F abstractC1225770i0F, C1225090hz9 c1225090hz9) {
        super(abstractC1225770i0F, c1225090hz9);
        this.LLILZ = C452501pT.LIZIZ(new AwS563S0100000_19(abstractC1225770i0F, 3175));
        this.LLILZIL = C452501pT.LIZIZ(new AwS563S0100000_19(c1225090hz9, 3176));
        this.LLILZLL = C1509305vX.LIZ(new AwS563S0100000_19(this, 3177));
    }
}
