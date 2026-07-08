package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: renamed from: X.14pH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20382914pH extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C501601xO LL;
    public final /* synthetic */ Playbook LLILLJJLI;
    public final /* synthetic */ C20382814pG LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20382914pH(C501601xO c501601xO, Playbook playbook, C20382814pG c20382814pG, Function0<Unit> function0) {
        super(1);
        this.LL = c501601xO;
        this.LLILLJJLI = playbook;
        this.LLILLL = c20382814pG;
        this.LLILZ = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        long j;
        String str;
        String strLIZ;
        String strLIZ2;
        bool.booleanValue();
        C501601xO c501601xO = this.LL;
        Playbook playbook = this.LLILLJJLI;
        C20382814pG c20382814pG = this.LLILLL;
        final Function0<Unit> function0 = this.LLILZ;
        PlaybookAnchorViewModel playbookAnchorViewModel = c501601xO.LIZIZ;
        if (playbookAnchorViewModel != null) {
            InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>> interfaceC170900l9 = new InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>>() { // from class: X.00lE
                @Override // X.InterfaceC170900l9
                public final void LIZ(C470590Icr<PlaybookStartResponse.ResponseData> c470590Icr) {
                    C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookOpenDetailHelper"), "clickPlaybook start onSucceeded", null, null);
                    function0.invoke();
                }

                @Override // X.InterfaceC170900l9
                public final void onFailed(Throwable th) {
                    String message;
                    String strLIZ3 = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("clickPlaybook start onFailed:");
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    sbLIZ.append(message);
                    C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ), null, null);
                }
            };
            long j2 = playbook.playbookId;
            PlaybookContent playbookContent = playbook.content;
            long j3 = 0;
            if (playbookContent != null) {
                j = playbookContent.playbookContentId;
                j3 = playbookContent.originalPlaybookContentId;
            } else {
                j = 0;
            }
            C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
            String str2 = C978360bZC.LJFF().LIZ;
            String strLIZ3 = C20392214qm.LIZ();
            if (c20382814pG == null || (str = c20382814pG.LJI) == null) {
                str = "fun_kit";
            }
            String strLIZLLL = C978360bZC.LIZLLL();
            InterfaceC986020blY interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
            String str3 = "";
            if (interfaceC986020blYMb0 == null || (strLIZ = interfaceC986020blYMb0.LIZ(EnumC20429914wr.PAGE, EnumC499801x6.PLAYBOOK)) == null) {
                strLIZ = "";
            }
            InterfaceC986020blY interfaceC986020blYMb02 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
            if (interfaceC986020blYMb02 != null && (strLIZ2 = interfaceC986020blYMb02.LIZ(EnumC20429914wr.ENTRANCE, EnumC499801x6.PLAYBOOK)) != null) {
                str3 = strLIZ2;
            }
            PlaybookAnchorViewModel.SQ2(playbookAnchorViewModel, interfaceC170900l9, null, Long.valueOf(j2), Long.valueOf(j), Long.valueOf(j3), null, null, str2, strLIZ3, true, str, strLIZLLL, strLIZ, str3, false, false, 114784);
        }
        return Unit.LIZ;
    }
}
