package X;

import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1AaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181841AaE extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2181481AZe LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181841AaE(SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, C2181481AZe c2181481AZe) {
        super(0);
        this.LL = c2181481AZe;
        this.LLILLJJLI = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        View view;
        C2181481AZe c2181481AZe = this.LL;
        if (!c2181481AZe.LLJILJILJ || this.LLILLJJLI == null) {
            WeakReference<View> weakReference = c2181481AZe.LLJJI;
            if (weakReference != null && (view = weakReference.get()) != null) {
                C500260Jjc.LJJJLL(view);
            }
            this.LL.LLJJI = null;
        } else {
            WeakReference<View> weakReference2 = c2181481AZe.LLJJI;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            if (!Intrinsics.LJFF(view2, this.LLILLJJLI)) {
                if (view2 != null) {
                    C500260Jjc.LJJJLL(view2);
                }
                this.LL.LLJJI = new WeakReference<>(this.LLILLJJLI);
            }
            this.LL.LJIILIIL();
        }
        return Unit.LIZ;
    }
}
