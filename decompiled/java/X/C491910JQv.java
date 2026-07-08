package X;

import android.os.Bundle;
import android.view.View;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.emote.poll.detail.view.fragment.EmotePollDetailDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491910JQv extends C09AY implements Function0<C1119170fEJ> {
    public final /* synthetic */ EmotePollDetailDialog LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C491910JQv(EmotePollDetailDialog emotePollDetailDialog) {
        super(0);
        this.LL = emotePollDetailDialog;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1119170fEJ invoke() {
        C758170Tod c758170TodWR;
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        final EmotePollDetailDialog emotePollDetailDialog = this.LL;
        c1119170fEJ.LIZ(C497740JfY.LJIJI(2131852076));
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        emotePollDetailDialog.getClass();
        Bundle arguments = emotePollDetailDialog.getArguments();
        if (C1533950q1J.LJ(arguments != null ? arguments.getString("navigate_up_page", "") : null) && (c758170TodWR = emotePollDetailDialog.WR(new View.OnClickListener() { // from class: X.0JQu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String string;
                DataChannel dataChannelLJ;
                String str;
                EmotePollDetailDialog emotePollDetailDialog2 = emotePollDetailDialog;
                Bundle arguments2 = emotePollDetailDialog2.getArguments();
                String str2 = "";
                if (arguments2 != null) {
                    string = arguments2.getString("navigate_up_page", "");
                } else {
                    string = null;
                }
                if (Intrinsics.LJFF(string, "poll_panel")) {
                    IRoomFunctionService iRoomFunctionService = (IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class);
                    if (iRoomFunctionService != null) {
                        iRoomFunctionService.le1();
                        return;
                    }
                    return;
                }
                if (!Intrinsics.LJFF(string, "community") || (dataChannelLJ = C475510Ikn.LJ(emotePollDetailDialog2)) == null) {
                    return;
                }
                C0JRE c0jreUS = emotePollDetailDialog2.uS();
                if (c0jreUS != null && (str = c0jreUS.LLJILJIL) != null) {
                    str2 = str;
                }
                C0JKJ.LIZ(dataChannelLJ, str2);
            }
        })) != null) {
            arrayList.add(c758170TodWR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }
}
