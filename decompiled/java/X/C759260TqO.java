package X;

import Y.AObserverS216S0100000_12;
import Y.ARunnableS23S0101000_12;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.NextLiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.comment.filter.CommunityFlaggedManageSheetFragment$onViewCreated$6", f = "CommunityFlaggedManageSheetFragment.kt", l = {153}, m = "invokeSuspend")
public final class C759260TqO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommunityFlaggedManageSheetFragment LLILLJJLI;
    public final /* synthetic */ View LLILLL;
    public final /* synthetic */ DataChannel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C759260TqO(CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment, View view, DataChannel dataChannel, InterfaceC1364105Vn<? super C759260TqO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = communityFlaggedManageSheetFragment;
        this.LLILLL = view;
        this.LLILZ = dataChannel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C759260TqO(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [X.0TqN] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        boolean z;
        Object objUS = obj;
        C1C7U.LIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objUS);
            } else {
                C155000ia.LIZIZ(objUS);
                CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment = this.LLILLJJLI;
                this.LL = 1;
                objUS = communityFlaggedManageSheetFragment.uS(this);
                if (objUS == objLJFF) {
                    C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6");
                    return objLJFF;
                }
            }
            list = (List) objUS;
            RecyclerView recyclerViewLLII = this.LLILLJJLI.LLII();
            if (recyclerViewLLII != null) {
                recyclerViewLLII.setLayoutManager(new LinearLayoutManager(this.LLILLL.getContext(), 1, false));
            }
            CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment2 = this.LLILLJJLI;
            DataChannel dataChannel = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof AbstractC1110520f0M) {
                    arrayList.add(obj2);
                }
            }
            final CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment3 = this.LLILLJJLI;
            final View view = this.LLILLL;
            C759310TqT c759310TqT = new C759310TqT(communityFlaggedManageSheetFragment2, dataChannel, arrayList, new InterfaceC759240TqM() { // from class: X.0TqN
                @Override // X.InterfaceC759240TqM
                public final void LIZ(int i2) {
                    boolean z2;
                    if (i2 > 0) {
                        C16FS c16fsWS = communityFlaggedManageSheetFragment3.wS();
                        if (c16fsWS != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(view.getContext().getString(2131834607));
                            sbLIZ.append(" (");
                            sbLIZ.append(i2);
                            sbLIZ.append(')');
                            c16fsWS.setText(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    } else {
                        C16FS c16fsWS2 = communityFlaggedManageSheetFragment3.wS();
                        if (c16fsWS2 != null) {
                            c16fsWS2.setText(view.getContext().getString(2131834607));
                        }
                    }
                    C16FS c16fsWS3 = communityFlaggedManageSheetFragment3.wS();
                    if (c16fsWS3 != null) {
                        if (i2 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        c16fsWS3.setEnabled(z2);
                    }
                }
            }, communityFlaggedManageSheetFragment3.LLLIIIL, (C1109770ez9) communityFlaggedManageSheetFragment3.LLLIIL.getValue());
            RecyclerView recyclerViewLLII2 = this.LLILLJJLI.LLII();
            if (recyclerViewLLII2 != null) {
                recyclerViewLLII2.setAdapter(c759310TqT);
            }
            NextLiveData<Integer> nextLiveData = c759310TqT.LLIZ;
            CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment4 = this.LLILLJJLI;
            nextLiveData.observe(communityFlaggedManageSheetFragment4, new AObserverS216S0100000_12(communityFlaggedManageSheetFragment4, 21));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (th instanceof C501470JlZ) {
                C766270U4b.LJIIJJI(th.getPrompt());
            } else {
                C766270U4b.LIZLLL(2131854910);
            }
            CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment5 = this.LLILLJJLI;
            communityFlaggedManageSheetFragment5.LLLIIII = 3;
            communityFlaggedManageSheetFragment5.zS();
        }
        if (!list.isEmpty()) {
            CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment6 = this.LLILLJJLI;
            communityFlaggedManageSheetFragment6.LLLIIII = 1;
            communityFlaggedManageSheetFragment6.zS();
            CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment7 = this.LLILLJJLI;
            if (communityFlaggedManageSheetFragment7.LLLIIIL > 0) {
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        if (((InterfaceC1112060f2q) it2.next()).getMessageId() == communityFlaggedManageSheetFragment7.LLLIIIL) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = -1;
                        break;
                    }
                }
                RecyclerView recyclerViewLLII3 = this.LLILLJJLI.LLII();
                if (recyclerViewLLII3 != null) {
                    Boolean.valueOf(HandlerHook.viewPostDelay(recyclerViewLLII3, new ARunnableS23S0101000_12(i2, this.LLILLJJLI, 2), 100L));
                }
            }
            C500260Jjc.LLFFF((View) this.LLILLJJLI.LLLF.getValue());
            C500260Jjc.LJIILIIL((View) this.LLILLJJLI.LLL.getValue());
            C16FS c16fsWS = this.LLILLJJLI.wS();
            if (c16fsWS != null) {
                c16fsWS.setEnabled(false);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6");
            return unit;
        }
        CommunityFlaggedManageSheetFragment communityFlaggedManageSheetFragment8 = this.LLILLJJLI;
        communityFlaggedManageSheetFragment8.LLLIIII = 2;
        communityFlaggedManageSheetFragment8.zS();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CommunityFlaggedManageSheetFragment@2faa.onViewCreated$6");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
