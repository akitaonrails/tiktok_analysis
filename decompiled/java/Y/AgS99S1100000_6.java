package Y;

import X.C1383370m6R;
import X.C1558520qew;
import X.C724240Sb0;
import X.C909290Zln;
import X.InterfaceC1364105Vn;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346701Wf;
import X.InterfaceC665370Q7z;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.ExtraInputContentProcessAssem;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.extrainput.IAutoFilledInputContentAbility;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public class AgS99S1100000_6 implements InterfaceC346701Wf {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public AgS99S1100000_6(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS99S1100000_6 r3, java.lang.Object r4, X.InterfaceC1364105Vn r5) {
        /*
            java.lang.Object r2 = r3.l1
            com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM r2 = (com.ss.android.ugc.aweme.im.chatroom.input.components.inputfield.InputFieldVM) r2
            X.01GW r0 = X.C269990Ai5.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 1
            if (r1 != r0) goto L32
            X.0629 r0 = com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.ai.api.IMAIServiceAPI r0 = X.AnonymousClass0629.LIZ()
            X.06k7 r1 = r0.LIZ()
            java.lang.String r0 = r3.s0
            boolean r0 = r1.LJIL(r0)
            if (r0 != 0) goto L32
            if (r4 != 0) goto L3c
            java.lang.String r0 = ""
        L2c:
            r2.vQ2(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            if (r4 != 0) goto L3c
            r0 = 2131831183(0x7f11298f, float:1.9295384E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            goto L2c
        L3c:
            r0 = 2131835712(0x7f113b40, float:1.930457E38)
            java.lang.String r0 = X.C1383370m6R.LJIIJ(r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS99S1100000_6.emit$0(Y.AgS99S1100000_6, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$1(AgS99S1100000_6 agS99S1100000_6, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        IAutoFilledInputContentAbility iAutoFilledInputContentAbility;
        String trafficType;
        if (((Boolean) obj).booleanValue()) {
            ExtraInputContentProcessAssem extraInputContentProcessAssem = (ExtraInputContentProcessAssem) agS99S1100000_6.l1;
            String str = agS99S1100000_6.s0;
            AssemVMLazy assemVMLazy = extraInputContentProcessAssem.LLILLJJLI;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = ExtraInputContentProcessAssem.LLILZ;
            ((InputFieldVM) assemVMLazy.getValue()).rv();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIIIZZ = C1383370m6R.LJIIIIZZ(C724240Sb0.LIZ(extraInputContentProcessAssem));
            if (interfaceC665370Q7zLJIIIIZZ != null && (iAutoFilledInputContentAbility = (IAutoFilledInputContentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIIIZZ, IAutoFilledInputContentAbility.class, null)) != null) {
                C909290Zln c909290ZlnBo = extraInputContentProcessAssem.bo();
                if (c909290ZlnBo == null || (trafficType = c909290ZlnBo.getTrafficType()) == null) {
                    trafficType = "";
                }
                iAutoFilledInputContentAbility.Jn1(str, trafficType);
            }
            C909290Zln c909290ZlnBo2 = extraInputContentProcessAssem.bo();
            if (c909290ZlnBo2 != null && c909290ZlnBo2.getShowKeyBoardByDefault()) {
                ((InputFieldVM) extraInputContentProcessAssem.LLILLJJLI.getValue()).LLJZIJLIL();
            }
        }
        return Unit.LIZ;
    }
}
