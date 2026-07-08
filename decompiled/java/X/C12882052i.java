package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.052i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12882052i extends C09AY implements Function0<Keva> {
    public final /* synthetic */ AbstractC12881052h<STORAGE_TYPE> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12882052i(AbstractC12881052h<STORAGE_TYPE> abstractC12881052h) {
        super(0);
        this.LL = abstractC12881052h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        String strLIZ = this.LL.LIZ.LIZ();
        C12883052j.LIZ(this.LL.LIZ.LIZLLL).storeBoolean(strLIZ, true);
        return KevaImpl.getRepo(strLIZ, 0);
    }
}
