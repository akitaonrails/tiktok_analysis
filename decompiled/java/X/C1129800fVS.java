package X;

import com.bytedance.android.livesdk.model.Gift;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fVS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1129800fVS extends C09AY implements Function1<C1129150fUP, C1129150fUP> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ Gift LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1129800fVS(int i, Gift gift, int i2) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = gift;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1129150fUP invoke(C1129150fUP c1129150fUP) {
        return C1129150fUP.LIZ(c1129150fUP, EnumC1129590fV7.READY, null, this.LL, this.LLILLJJLI, null, null, false, this.LLILLL, EnumC1129600fV8.TAB_SWITCH, 0, null, 0L, 3698);
    }
}
