package X;

import com.ss.android.ugc.aweme.feed.model.banner.ClientStandardModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0RgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701970RgB extends C09AY implements Function2<C700730ReB, InterfaceC700750ReD, C700730ReB> {
    public final /* synthetic */ C700720ReA LL;
    public final /* synthetic */ Function0<ClientStandardModel> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C701970RgB(C700720ReA c700720ReA, Function0<ClientStandardModel> function0) {
        super(2);
        this.LL = c700720ReA;
        this.LLILLJJLI = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final C700730ReB invoke(C700730ReB c700730ReB, InterfaceC700750ReD interfaceC700750ReD) {
        return C700690Re7.LIZ(this.LL, this.LLILLJJLI, c700730ReB);
    }
}
