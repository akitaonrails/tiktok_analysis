package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.feed.view.assem.SubSpaceFeedAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Jpo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C504100Jpo extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ SubSpaceFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C504100Jpo(SubSpaceFeedAssem subSpaceFeedAssem) {
        super(1);
        this.LL = subSpaceFeedAssem;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        this.LL.LJIIL();
        C501540Jlg.LIZJ(this.LL.getContext(), th);
        return Unit.LIZ;
    }
}
