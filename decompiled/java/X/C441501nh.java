package X;

import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.core.Assembler;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.input.draft.MessageDraftVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01nh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C441501nh {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZ;

    static {
        C2217401BqU c2217401BqU = new C2217401BqU(C441501nh.class, "draftVM", "<v#0>", 1);
        C13LE.LIZ.getClass();
        LIZ = new InterfaceC2217461Bqa[]{c2217401BqU};
    }

    public static final void LIZ(AbstractC738140SxQ abstractC738140SxQ, Function1<? super Assembler, Unit> function1) {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MessageDraftVM.class);
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ), null, null, new C441001nc(abstractC738140SxQ, C724750Sbp.LIZ(abstractC738140SxQ, C724750Sbp.LJIIJ(abstractC738140SxQ, c19719912DlLIZ), c019f, C1637806bA.LIZ, new C5182020e((C13IQ) c19719912DlLIZ, 501), AnonymousClass0207.get$arr$(135), null, true), function1, null), 3);
    }
}
