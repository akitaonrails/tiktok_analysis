package X;

import com.ss.android.ugc.feed.platform.cell.interact.info.horiontag.FcpMetaTagContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0RWq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C697260RWq extends C09AY implements Function0<C0RY5> {
    public final /* synthetic */ FcpMetaTagContainer LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C697260RWq(FcpMetaTagContainer fcpMetaTagContainer) {
        super(0);
        this.LL = fcpMetaTagContainer;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0RY5 invoke() {
        C0RY5 c0ry5 = new C0RY5(new C0RYB(EnumC697700RYi.VIDEO_META_TAG), this.LL, true);
        C0RYJ c0ryjLIZ = C697340RWy.LIZ(this.LL);
        if (c0ryjLIZ != null) {
            ((C697180RWi) c0ryjLIZ).LJI(c0ry5);
        }
        return c0ry5;
    }
}
