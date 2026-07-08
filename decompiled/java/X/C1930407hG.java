package X;

import com.google.gson.k;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.07hG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1930407hG extends C09AY implements Function2<Integer, k, Boolean> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1930407hG(int i, int i2) {
        super(2);
        this.LL = i;
        this.LLILLJJLI = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Boolean invoke(Integer num, k kVar) {
        boolean z;
        int iIntValue = num.intValue();
        if (this.LL <= iIntValue && iIntValue < this.LLILLJJLI) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
