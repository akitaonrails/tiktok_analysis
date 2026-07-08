package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bDW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964920bDW extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C964760bDG LL;
    public final /* synthetic */ LinkUser LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C964920bDW(C964760bDG c964760bDG, LinkUser linkUser) {
        super(0);
        this.LL = c964760bDG;
        this.LLILLJJLI = linkUser;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJFF.invoke().LLIIIZ(EnumC918810a19.StatePreparing, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
