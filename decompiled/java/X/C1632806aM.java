package X;

import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS229S0000000_2;

/* JADX INFO: renamed from: X.06aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1632806aM extends C2217421BqW implements Function0<Unit> {
    public C1632806aM(Object obj) {
        super(0, obj, GroupChatNoticeAssem.class, "closeScreen", "closeScreen()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        GroupChatNoticeAssem groupChatNoticeAssem = (GroupChatNoticeAssem) this.receiver;
        if (((Boolean) groupChatNoticeAssem.LLLIILIL.getValue()).booleanValue()) {
            AssemVMLazy assemVMLazy = groupChatNoticeAssem.LLLJ;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = GroupChatNoticeAssem.LLLLJ;
            assemVMLazy.getValue().setState(AFwS229S0000000_2.get$arr$(575));
        } else {
            C19EG c19egLIZ = C724240Sb0.LIZ(groupChatNoticeAssem);
            if (c19egLIZ != null) {
                c19egLIZ.onBackPressed();
            }
        }
        return Unit.LIZ;
    }
}
