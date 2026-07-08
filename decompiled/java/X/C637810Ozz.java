package X;

import com.ss.android.ugc.aweme.mvtemplate.model.MvDetailModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Ozz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637810Ozz extends C09AY implements Function0<MvDetailModel> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C637810Ozz(String str, int i, int i2) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MvDetailModel invoke() {
        String str = C0P00.LIZ;
        String str2 = this.LL;
        int i = this.LLILLJJLI;
        int i2 = this.LLILLL;
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(C0P00.LIZ);
        return ((InterfaceC637800Ozy) (interfaceC2661011fLIZ != null ? interfaceC2661011fLIZ.create(InterfaceC637800Ozy.class) : null)).LIZ(str2, i, i2).get();
    }
}
