package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DOG, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOG implements C0TSA {
    public final /* synthetic */ Function1<C0DOH, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C0DOG(Function1<? super C0DOH, Unit> function1) {
        this.LIZ = function1;
    }

    @Override // X.C0TSA
    public final void LIZ(Bundle bundle, String str) {
        int i;
        if (bundle.containsKey("GraduationYearResultChosenReset")) {
            this.LIZ.invoke(C0DOK.LIZ);
        } else {
            if (!bundle.containsKey("GraduationYearResultChosenYear") || (i = bundle.getInt("GraduationYearResultChosenYear", -1)) == -1) {
                return;
            }
            this.LIZ.invoke(new C0DOJ(i));
        }
    }
}
