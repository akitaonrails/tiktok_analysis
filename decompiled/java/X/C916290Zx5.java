package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.CurrentRealDisplayChannel;
import com.bytedance.android.livesdk.chatroom.model.multilive.MultiLiveAnchorPanelSettings;
import com.bytedance.android.livesdk.comp.api.linkcore.model.ChangeMaxPositionResult;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS416S0200000_15;

/* JADX INFO: renamed from: X.0Zx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916290Zx5 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C921520a5W LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ MultiLiveAnchorPanelSettings LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C916290Zx5(C921520a5W c921520a5W, String str, int i, Function0<Unit> function0, MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings) {
        super(0);
        this.LL = c921520a5W;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = multiLiveAnchorPanelSettings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final String strLIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ;
        MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettingsLIZIZ2;
        MultiGuestDataHolder multiGuestDataHolder = this.LL.getMultiGuestDataHolder();
        if (multiGuestDataHolder == null || (multiLiveAnchorPanelSettingsLIZIZ2 = multiGuestDataHolder.LIZIZ()) == null || (strLIZ = C916490ZxP.LIZ(multiLiveAnchorPanelSettingsLIZIZ2)) == null) {
            strLIZ = "";
        }
        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL != null) {
            interfaceC954180awCLLJLL.LLILIL(Boolean.FALSE, this.LLILLJJLI);
        }
        MultiGuestDataHolder multiGuestDataHolder2 = this.LL.getMultiGuestDataHolder();
        final int iLIZJ = C922550a7B.LIZJ((multiGuestDataHolder2 == null || (multiLiveAnchorPanelSettingsLIZIZ = multiGuestDataHolder2.LIZIZ()) == null) ? null : C923170a8B.LIZ(multiLiveAnchorPanelSettingsLIZIZ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("changeLayoutByLayoutId : ");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", ");
        sbLIZ.append(iLIZJ);
        C20441214yg.LIZIZ("hhh", C2188811AlT.LIZIZ(sbLIZ));
        final C921520a5W c921520a5W = this.LL;
        int i = this.LLILLL;
        final String str = this.LLILLJJLI;
        final Function0<Unit> function0 = this.LLILZ;
        final MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings = this.LLILZIL;
        c921520a5W.LJJLIIIJJI(i, iLIZJ, new InterfaceC920680a4A<ChangeMaxPositionResult>() { // from class: X.0Zx1
            @Override // X.InterfaceC920680a4A
            public final void onSuccess(ChangeMaxPositionResult changeMaxPositionResult) {
                Map<Integer, String> map;
                c921520a5W.LLILZ.zW(CurrentRealDisplayChannel.class, new Pair(str, Integer.valueOf(iLIZJ)));
                MultiGuestDataHolder multiGuestDataHolder3 = c921520a5W.getMultiGuestDataHolder();
                if (multiGuestDataHolder3 != null && (map = multiGuestDataHolder3.LJIJJLI) != null) {
                    ((ConcurrentHashMap) map).clear();
                }
                C921520a5W c921520a5W2 = c921520a5W;
                c921520a5W2.LJLJJI(str, new AwS416S0200000_15(c921520a5W2, (C921520a5W) function0, (Function0<Unit>) 53));
            }

            @Override // X.InterfaceC920680a4A
            public final void LIZ(LinkCoreError linkCoreError, Throwable th) {
                C501540Jlg.LIZJ(C176600m4.LIZ(), th);
                InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
                if (interfaceC954180awCLLJLL2 != null) {
                    interfaceC954180awCLLJLL2.LLILIL(Boolean.FALSE, strLIZ);
                }
                if (th != null) {
                    C919310a1x.LIZJ("MultiGuestV3AnchorPresenter", "changeLayoutByLayoutId failed,", th);
                }
                C924810aAp c924810aApLJ = C924810aAp.LJ();
                MultiLiveAnchorPanelSettings multiLiveAnchorPanelSettings2 = multiLiveAnchorPanelSettings;
                c924810aApLJ.LJJIII = multiLiveAnchorPanelSettings2;
                InterfaceC934710aQn.Mb.LJFF(multiLiveAnchorPanelSettings2);
            }
        }, str);
        return Unit.LIZ;
    }
}
