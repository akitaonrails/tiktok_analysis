package X;

import com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RtX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C710250RtX extends C09AY implements Function1<C0S5G, Unit> {
    public final /* synthetic */ C0S5P LL;
    public final /* synthetic */ TranslationStatusViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C710250RtX(C0S5P c0s5p, TranslationStatusViewModel translationStatusViewModel) {
        super(1);
        this.LL = c0s5p;
        this.LLILLJJLI = translationStatusViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.C0S5G r7) {
        /*
            r6 = this;
            X.0S5G r7 = (X.C0S5G) r7
            X.0S5P r1 = r7.LL
            X.0S5P r0 = r6.LL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 != 0) goto L51
            X.0S5P r0 = r7.LL
            X.0SKK r2 = r0.LIZ
            X.0S5P r1 = r6.LL
            X.0SKK r0 = r1.LIZ
            if (r2 == r0) goto L43
            boolean r0 = r1 instanceof X.C0S5K
            if (r0 == 0) goto L54
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r1 = r6.LLILLJJLI
            boolean r0 = r1.LLILLJJLI
            if (r0 == 0) goto L26
            X.002o r0 = r1.getState()
            X.0S5G r0 = (X.C0S5G) r0
        L26:
            X.0S5P r0 = r7.LL
            boolean r0 = r0 instanceof X.C710270RtZ
            if (r0 != 0) goto L43
        L2c:
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r5 = r6.LLILLJJLI
            X.0S5P r0 = r6.LL
            r5.getClass()
            X.01wk r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r5)
            X.1DFH r3 = X.C0PEM.LIZ
            X.0RtV r2 = new X.0RtV
            r1 = 0
            r2.<init>(r0, r5, r1)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r1, r2, r0)
        L43:
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r3 = r6.LLILLJJLI
            kotlin.jvm.internal.AwS590S0100000_11 r2 = new kotlin.jvm.internal.AwS590S0100000_11
            X.0S5P r1 = r6.LL
            r0 = 277(0x115, float:3.88E-43)
            r2.<init>(r1, r0)
            r3.setState(r2)
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L54:
            boolean r0 = r1 instanceof X.C0S5L
            if (r0 == 0) goto L43
            com.ss.android.ugc.aweme.translation.viewmodel.TranslationStatusViewModel r0 = r6.LLILLJJLI
            boolean r0 = r0.LLILLJJLI
            if (r0 == 0) goto L43
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C710250RtX.invoke(java.lang.Object):java.lang.Object");
    }
}
