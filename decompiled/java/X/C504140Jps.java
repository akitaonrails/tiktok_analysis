package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jps, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504140Jps extends C09AY implements Function1<AbstractC509530JyZ, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504140Jps(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(1);
        this.LL = subSpaceFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(AbstractC509530JyZ abstractC509530JyZ) {
        C508910JxZ.LIZ(abstractC509530JyZ, new C504150Jpt(this.LL));
        return Unit.LIZ;
    }
}
