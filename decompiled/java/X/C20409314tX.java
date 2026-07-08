package X;

import android.content.Context;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.playbooklist.PlaybookAIListFragment;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20409314tX extends C09AY implements Function1<Context, C0UTG> {
    public final /* synthetic */ C20382814pG LL;
    public final /* synthetic */ PlaybookAIListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20409314tX(C20382814pG c20382814pG, PlaybookAIListFragment playbookAIListFragment) {
        super(1);
        this.LL = c20382814pG;
        this.LLILLJJLI = playbookAIListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0UTG invoke(Context context) {
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        return new C0UTG(context, c915190ZvJ.LIZ, c915190ZvJ.LIZIZ, this.LL, this.LLILLJJLI.LLJZIJLIL, false);
    }
}
