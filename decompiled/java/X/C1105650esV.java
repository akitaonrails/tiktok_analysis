package X;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0esV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105650esV extends C09AY implements Function2<String, String, Boolean> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1105650esV(int i) {
        super(2);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(String str, String str2) {
        boolean zLJFF;
        String str3 = str;
        String str4 = str2;
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                zLJFF = false;
            } else {
                zLJFF = Intrinsics.LJFF(C1107580evc.LIZLLL(str3), C1107580evc.LIZLLL(str4));
            }
        } else {
            zLJFF = Intrinsics.LJFF(str3, str4);
        }
        return Boolean.valueOf(zLJFF);
    }
}
