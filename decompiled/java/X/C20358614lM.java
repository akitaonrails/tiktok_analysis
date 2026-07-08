package X;

import android.content.Context;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14lM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final /* synthetic */ class C20358614lM extends C2217421BqW implements InterfaceC1631630sYr<C20359414lU, C20361214lm, Long, Function1<? super Context, ? extends Unit>, WeakReference<LiveSheetFragment>> {
    public C20358614lM(AbstractC20358714lN abstractC20358714lN) {
        super(4, abstractC20358714lN, AbstractC20358714lN.class, "showPlaybookAutoStartDialog", "showPlaybookAutoStartDialog(Lcom/bytedance/android/livesdk/model/PlaybookStep;Lcom/bytedance/android/livesdk/entity/PlaybookTask;Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)Ljava/lang/ref/WeakReference;", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631630sYr
    public final WeakReference<LiveSheetFragment> invoke(C20359414lU c20359414lU, C20361214lm c20361214lm, Long l, Function1<? super Context, ? extends Unit> function1) {
        return ((AbstractC20358714lN) this.receiver).LJ(c20359414lU, c20361214lm, l, function1);
    }
}
