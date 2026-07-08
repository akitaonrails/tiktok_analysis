package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968030bIX extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ LinkUser LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968030bIX(long j, String str, LinkUser linkUser) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = linkUser;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LLF(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
