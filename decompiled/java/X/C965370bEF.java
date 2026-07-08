package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupResult;
import java.util.List;
import kotlin.jvm.functions.Function2;
import webcast.data.cohost_biz.BizJoinGroupResponse;

/* JADX INFO: renamed from: X.0bEF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965370bEF extends C09AY implements Function2<String, C965950bFB, ApplyGroupResult> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954590awr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965370bEF(C966020bFI c966020bFI, C954590awr c954590awr) {
        super(2);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954590awr;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ApplyGroupResult invoke(String str, C965950bFB c965950bFB) {
        List<InterfaceC965500bES> listLJLJL;
        String str2 = str;
        C965950bFB c965950bFB2 = c965950bFB;
        InterfaceC965990bFF interfaceC965990bFF = this.LL.LJIIZILJ;
        if (interfaceC965990bFF != null && (listLJLJL = interfaceC965990bFF.LJLJL()) != null) {
            C954590awr c954590awr = this.LLILLJJLI;
            C966020bFI c966020bFI = this.LL;
            for (InterfaceC965500bES interfaceC965500bES : listLJLJL) {
                if (interfaceC965500bES != null) {
                    String str3 = c965950bFB2.LIZJ.get("group_channel_id");
                    c966020bFI.getClass();
                    interfaceC965500bES.LIZ(c954590awr, str2, C966020bFI.LJIIL(str3));
                }
            }
        }
        BizJoinGroupResponse bizJoinGroupResponse = (BizJoinGroupResponse) C966250bFf.LIZ(c965950bFB2.LIZIZ, BizJoinGroupResponse.class);
        C966020bFI c966020bFI2 = this.LL;
        C965350bED c965350bED = c966020bFI2.LJJ;
        String str4 = c966020bFI2.LJ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("call on ApplyGroupResult : ");
        sbLIZ.append(bizJoinGroupResponse);
        C1AZW.LIZIZ(c965350bED, str4, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return new ApplyGroupResult(bizJoinGroupResponse, str2);
    }
}
