package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.CreateChannelResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkmicCoHostCreateChannelRetrySetting;
import com.bytedance.android.livesdk.model.message.linkcore.AllListUser;
import com.bytedance.android.livesdk.model.message.linkcore.LinkLayerListUser;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import tikcast.linkmic.controller.ResumeResp;
import webcast.data.multilive_biz.BizResumeParams;

/* JADX INFO: renamed from: X.0bEO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965460bEO extends C09AY implements Function2<CreateChannelResult, Function1<? super CreateChannelResult, ? extends Unit>, Unit> {
    public final /* synthetic */ C966020bFI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C965460bEO(C966020bFI c966020bFI, BizResumeParams bizResumeParams) {
        super(2);
        this.LL = c966020bFI;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(CreateChannelResult createChannelResult, Function1<? super CreateChannelResult, ? extends Unit> function1) {
        int i;
        final CreateChannelResult createChannelResult2 = createChannelResult;
        final Function1<? super CreateChannelResult, ? extends Unit> function12 = function1;
        final C966020bFI c966020bFI = this.LL;
        if (c966020bFI.LJIJI && ((i = c966020bFI.LIZJ) == 4 || i == 0)) {
            InterfaceC966890bGh<ResumeResp> interfaceC966890bGh = new InterfaceC966890bGh<ResumeResp>() { // from class: X.0bEK
                @Override // X.InterfaceC966890bGh
                public final void LIZ(ResumeResp resumeResp) {
                    int size;
                    List<LinkLayerListUser> list;
                    ResumeResp resumeResp2 = resumeResp;
                    C966020bFI c966020bFI2 = c966020bFI;
                    C965350bED c965350bED = c966020bFI2.LJJ;
                    String str = c966020bFI2.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onResumeSucceeded ");
                    sbLIZ.append(resumeResp2);
                    C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    createChannelResult2.resumeResp = resumeResp2;
                    C966020bFI c966020bFI3 = c966020bFI;
                    AllListUser allListUser = resumeResp2.list;
                    if (allListUser != null && (list = allListUser.linkedList) != null) {
                        size = list.size();
                    } else {
                        size = 0;
                    }
                    c966020bFI3.LJJIIZ = size;
                    function12.invoke(createChannelResult2);
                    C965900bF6.LIZ(new C966460bG0(c966020bFI));
                }

                @Override // X.InterfaceC966890bGh
                public final void LIZIZ(LinkCoreError linkCoreError, Throwable th) {
                    C966020bFI c966020bFI2 = c966020bFI;
                    C965350bED c965350bED = c966020bFI2.LJJ;
                    String str = c966020bFI2.LJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onResumeFailed ");
                    sbLIZ.append(linkCoreError);
                    C1AZW.LIZIZ(c965350bED, str, C2188811AlT.LIZIZ(sbLIZ), null, null);
                    function12.invoke(null);
                }
            };
            C966920bGk c966920bGkLJ = c966020bFI.LJ();
            C968590bJR c968590bJR = new C968590bJR(LinkmicCoHostCreateChannelRetrySetting.INSTANCE.getValue());
            C966100bFQ c966100bFQ = new C966100bFQ(c966020bFI.LJ, "resume", interfaceC966890bGh, new C966380bFs());
            c966020bFI.LJIIJ(c966100bFQ, null);
            c966920bGkLJ.LLFFF(c968590bJR, new C966240bFe(c966100bFQ, null));
        } else {
            function12.invoke(createChannelResult2);
        }
        return Unit.LIZ;
    }
}
