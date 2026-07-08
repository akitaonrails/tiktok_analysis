package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14Ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20242214Ii extends C09AY implements Function1<C20241914If, C20241914If> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ EnumC20241814Ie LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Message LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20242214Ii(boolean z, EnumC20241814Ie enumC20241814Ie, String str, Message message) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = enumC20241814Ie;
        this.LLILLL = str;
        this.LLILZ = message;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C20241914If invoke(C20241914If c20241914If) {
        boolean z = this.LL;
        EnumC20241814Ie enumC20241814Ie = this.LLILLJJLI;
        String str = this.LLILLL;
        Message message = this.LLILZ;
        c20241914If.getClass();
        return new C20241914If(z, enumC20241814Ie, str, message);
    }
}
