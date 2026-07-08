package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710260RtY extends C09AY implements Function1<C0S5G, Unit> {
    public final /* synthetic */ TranslationStatusViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710260RtY(TranslationStatusViewModel translationStatusViewModel) {
        super(1);
        this.LL = translationStatusViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C0S5G r7) {
        /*
            r6 = this;
            X.0S5G r7 = (X.C0S5G) r7
            X.0S5P r0 = r7.LL
            boolean r0 = r0 instanceof X.C0S5K
            r5 = 0
            if (r0 == 0) goto L1f
            X.161N r1 = X.C161N.LIZIZ
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r0 = r6.LL
            java.lang.Object r0 = r0.getItem()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r0 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r0
            if (r0 == 0) goto L3e
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getAweme()
        L19:
            boolean r0 = r1.LJJIJIL(r0)
            if (r0 == 0) goto L25
        L1f:
            X.0S5P r0 = r7.LL
            boolean r0 = r0 instanceof X.C0S5L
            if (r0 == 0) goto L3b
        L25:
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r4 = r6.LL
            X.0S5P r0 = r7.LL
            r4.getClass()
            X.01wk r3 = androidx.lifecycle.ViewModelKt.getViewModelScope(r4)
            X.1DFH r2 = X.C0PEM.LIZ
            X.0RtV r1 = new X.0RtV
            r1.<init>(r0, r4, r5)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r5, r1, r0)
        L3b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            r0 = r5
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C710260RtY.invoke(java.lang.Object):java.lang.Object");
    }
}
