package X;

import com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Nqw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C606720Nqw extends C09AY implements Function0<DataLayerAbility> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ InterfaceC1565950qqv LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C606720Nqw(boolean z, InterfaceC1565950qqv interfaceC1565950qqv) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = interfaceC1565950qqv;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.01wD, com.ss.android.ugc.feed.platform.panel.datalayer.DataLayerAbility] */
    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ DataLayerAbility invoke() {
        if (this.LL && C1578630rBN.LJIIIZ((AbstractC738140SxQ) this.LLILLJJLI)) {
            return null;
        }
        return C1558520qew.LIZ(C1558520qew.LJIIL((AbstractC738140SxQ) this.LLILLJJLI), DataLayerAbility.class, null);
    }
}
