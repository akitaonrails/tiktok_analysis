package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LeaveGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;
import webcast.data.cohost_biz.BizLeaveJoinGroupResponse;

/* JADX INFO: renamed from: X.0bEH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965390bEH extends C09AY implements Function2<String, C965950bFB, LeaveGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954730ax5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965390bEH(C966020bFI c966020bFI, C954730ax5 c954730ax5) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954730ax5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LeaveGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        C965950bFB c965950bFB2 = c965950bFB;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954730ax5 c954730ax5 = this.LLILLJJLI;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    interfaceC965500bES.LIZJ(c954730ax5, str2);
                }
            }
        }
        BizLeaveJoinGroupResponse bizLeaveJoinGroupResponse = (BizLeaveJoinGroupResponse) C966250bFf.LIZ(c965950bFB2.LIZIZ, BizLeaveJoinGroupResponse.class);
        C966020bFI c966020bFI = this.LL;
        C965350bED c965350bED = c966020bFI.LJJ;
        String str3 = c966020bFI.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on leaveGroup resp: ");
        sbLIZ.append(bizLeaveJoinGroupResponse);
        C1AZW.LIZIZ(c965350bED, str3, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return new LeaveGroupResult(bizLeaveJoinGroupResponse, str2);
    }
}
