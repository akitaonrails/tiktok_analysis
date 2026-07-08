package X;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.liveinteract.multilive.model.GuestApplyStillInLineResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0aIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class DialogC929590aIX extends AbstractDialogC423201kk {
    public final Context LLJILJIL;
    public final EnumC928480aGk LLJILJILJ;
    public final Function0<Unit> LLJILLL;
    public List<GuestApplyStillInLineResponse.GuestApplyItem> LLJJ;
    public final List<GuestApplyStillInLineResponse.GuestInvitedItem> LLJJI;
    public final DataChannel LLJJIII;
    public final int LLJJIJI;
    public final String LLJJIJIIJIL;
    public C16F5 LLJJIJIL;
    public C16F5 LLJJJ;
    public RecyclerView LLJJJIL;
    public C16FZ LLJJJJ;
    public C21578619ce LLJJJJJIL;
    public ConstraintLayout LLJJJJLIIL;
    public ConstraintLayout LLJJL;
    public LinearLayout LLJJLIIIJLLLLLLLZ;
    public ImageView LLJL;
    public ImageView LLJLIL;
    public final C951190arN LLJLILLLLZIIL;

    public DialogC929590aIX() {
        throw null;
    }

    @Override // X.AbstractDialogC972150bPB
    public final int LJJZZIII() {
        return R.layout.g95;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0262  */
    @Override // X.AbstractDialogC423201kk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJL() {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DialogC929590aIX.LJL():void");
    }

    public final void LJLI(int i, List list, List list2) {
        if (list.isEmpty() && list2.isEmpty()) {
            LinearLayout linearLayout = this.LLJJLIIIJLLLLLLLZ;
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            C16FZ c16fz = this.LLJJJJ;
            if (c16fz != null) {
                C786410Ut5.LLLIZZ(c16fz, 4);
                return;
            }
            return;
        }
        C16FZ c16fz2 = this.LLJJJJ;
        if (c16fz2 != null) {
            C786410Ut5.LLLIZZ(c16fz2, 4);
        }
        this.LLJJ = list;
        this.LLJLILLLLZIIL.LLLII(C928340aGW.LJ(i, list, list2));
        C928460aGi.LIZLLL(this.LLJILJILJ, list, list2, this.LLJJIII, this.LLJJIJIIJIL);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC929590aIX(Context context, EnumC928480aGk enumC928480aGk, C929690aIh c929690aIh, List list, List list2, DataChannel dataChannel, int i, String str, int i2) {
        super(context, false);
        i = (i2 & 64) != 0 ? 0 : i;
        str = (i2 & 128) != 0 ? null : str;
        this.LLJILJIL = context;
        this.LLJILJILJ = enumC928480aGk;
        this.LLJILLL = c929690aIh;
        this.LLJJ = list;
        this.LLJJI = list2;
        this.LLJJIII = dataChannel;
        this.LLJJIJI = i;
        this.LLJJIJIIJIL = str;
        this.LLJLILLLLZIIL = new C951190arN();
    }
}
