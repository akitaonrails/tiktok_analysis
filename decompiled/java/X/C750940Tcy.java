package X;

import Y.AcS110S1100000_12;
import android.text.Editable;
import android.view.View;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet;
import com.bytedance.android.livesdk.function.MuteRuleApi;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;
import njp.a;
import webcast.api.room.CheckMuteRuleResponse;

/* JADX INFO: renamed from: X.0Tcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveMuteRulesEditFragmentSheet$requestServerForAddMuteRule$1", f = "LiveMuteRulesEditFragmentSheet.kt", l = {149, 160}, m = "invokeSuspend")
public final class C750940Tcy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ LiveMuteRulesEditFragmentSheet LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750940Tcy(LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet, InterfaceC1364105Vn<? super C750940Tcy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveMuteRulesEditFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750940Tcy(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        CharSequence charSequenceLJLIIIL;
        String strValueOf;
        String str;
        MuteRuleApi muteRuleApi;
        long jLongValue;
        long jLongValue2;
        C470590Icr c470590Icr;
        Object objMuteRuleCheck = obj;
        C1C7U.LIZ("LiveMuteRulesEditFragmentSheet@3f89.requestServerForAddMuteRule$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objMuteRuleCheck);
                    C786410Ut5.E4((LiveDialog) objMuteRuleCheck);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.requestServerForAddMuteRule$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strValueOf = (String) this.LL;
            try {
                C155000ia.LIZIZ(objMuteRuleCheck);
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL.wS(e);
                c470590Icr = null;
            }
        } else {
            C155000ia.LIZIZ(objMuteRuleCheck);
            Editable editableLLLFZ = C2204961BRm.LLLFZ(this.LLILLL.zS(), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yefFGJAl6i5qfP8xlUTU2p2v5UQGOxs8ySUUrl+V/LCUjWqEEt30EcltNBv9fEEbhQ==", null));
            if (editableLLLFZ != null) {
                charSequenceLJLIIIL = a0.LJLIIIL(editableLLLFZ);
            } else {
                charSequenceLJLIIIL = null;
            }
            strValueOf = String.valueOf(charSequenceLJLIIIL);
            DataChannel dataChannelLJ = C475510Ikn.LJ(this.LLILLL);
            if (dataChannelLJ != null) {
                C01C7.LIZ(dataChannelLJ, "livesdk_comment_mute_rule_save_click", C2097608Jq.LJIIJ(new Pair("word", strValueOf), new Pair("mute_duration", String.valueOf(this.LLILLL.LLLIIII.LIZ))));
            }
            LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet = this.LLILLL;
            View viewFindViewById = liveMuteRulesEditFragmentSheet.LLJZ;
            if (viewFindViewById == null) {
                View view = liveMuteRulesEditFragmentSheet.getView();
                if (view != null) {
                    viewFindViewById = view.findViewById(R.id.nnp);
                } else {
                    viewFindViewById = null;
                }
                liveMuteRulesEditFragmentSheet.LLJZ = (C16FZ) viewFindViewById;
            }
            C16FZ c16fz = (C16FZ) viewFindViewById;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 0);
            }
            try {
                C480460Ism.LIZ().getClass();
                muteRuleApi = (MuteRuleApi) C480460Ism.LIZLLL(MuteRuleApi.class);
                jLongValue = ((Number) this.LLILLL.LLLFZ.getValue()).longValue();
                jLongValue2 = ((Number) this.LLILLL.LLLI.getValue()).longValue();
                this.LL = strValueOf;
                this.LLILLJJLI = 1;
                str = strValueOf;
            } catch (Exception e2) {
                e = e2;
                str = strValueOf;
            }
            try {
                objMuteRuleCheck = muteRuleApi.muteRuleCheck(jLongValue, jLongValue2, strValueOf, this);
                if (objMuteRuleCheck == objLJFF) {
                    C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.requestServerForAddMuteRule$1");
                    return objLJFF;
                }
            } catch (Exception e3) {
                e = e3;
                strValueOf = str;
                TryCatchGuardChecker.doCheck(e);
                this.LLILLL.wS(e);
                c470590Icr = null;
            }
        }
        c470590Icr = (C470590Icr) objMuteRuleCheck;
        LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet2 = this.LLILLL;
        View viewFindViewById2 = liveMuteRulesEditFragmentSheet2.LLJZ;
        if (viewFindViewById2 == null) {
            View view2 = liveMuteRulesEditFragmentSheet2.getView();
            if (view2 != null) {
                viewFindViewById2 = view2.findViewById(R.id.nnp);
            } else {
                viewFindViewById2 = null;
            }
            liveMuteRulesEditFragmentSheet2.LLJZ = (C16FZ) viewFindViewById2;
        }
        C16FZ c16fz2 = (C16FZ) viewFindViewById2;
        if (c16fz2 != null) {
            C786410Ut5.LLLIZZ(c16fz2, 8);
        }
        if (c470590Icr != null) {
            LiveMuteRulesEditFragmentSheet liveMuteRulesEditFragmentSheet3 = this.LLILLL;
            long j = ((CheckMuteRuleResponse.ResponseData) c470590Icr.data).muteUserCnt;
            this.LL = null;
            this.LLILLJJLI = 2;
            liveMuteRulesEditFragmentSheet3.getClass();
            C782110Um9 c782110Um9 = new C782110Um9(liveMuteRulesEditFragmentSheet3.getContext());
            c782110Um9.LJIIZILJ(2131837805);
            c782110Um9.LJIIIZ(C497740JfY.LJIJJ(2131837803, C2286608xc.LJFF(j), strValueOf));
            c782110Um9.LJIIJ(2131837804, new InterfaceC743640TFa() { // from class: X.0Td2
                @Override // X.InterfaceC743640TFa
                public final void LIZ(LiveDialog liveDialog) {
                    liveDialog.dismiss();
                }
            });
            c782110Um9.LJIILIIL(2131837802, new AcS110S1100000_12(liveMuteRulesEditFragmentSheet3, strValueOf, 0));
            objMuteRuleCheck = c782110Um9.LIZ();
            if (objMuteRuleCheck == objLJFF) {
                C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.requestServerForAddMuteRule$1");
                return objLJFF;
            }
            C786410Ut5.E4((LiveDialog) objMuteRuleCheck);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LiveMuteRulesEditFragmentSheet@3f89.requestServerForAddMuteRule$1");
        return unit2;
    }
}
