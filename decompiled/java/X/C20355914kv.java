package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20355914kv extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC20354714kj LL;
    public final /* synthetic */ AbstractC20356314kz LLILLJJLI;
    public final /* synthetic */ C20361214lm LLILLL;
    public final /* synthetic */ LifecycleOwner LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Long LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20355914kv(InterfaceC20354714kj interfaceC20354714kj, AbstractC20356314kz abstractC20356314kz, C20361214lm c20361214lm, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        super(0);
        this.LL = interfaceC20354714kj;
        this.LLILLJJLI = abstractC20356314kz;
        this.LLILLL = c20361214lm;
        this.LLILZ = lifecycleOwner;
        this.LLILZIL = str;
        this.LLILZLL = l;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC20354714kj interfaceC20354714kj = this.LL;
        if (interfaceC20354714kj != null) {
            interfaceC20354714kj.LJIIJ();
        }
        AbstractC20356314kz abstractC20356314kz = this.LLILLJJLI;
        C20361214lm c20361214lm = this.LLILLL;
        InterfaceC20354714kj interfaceC20354714kj2 = this.LL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        String str = this.LLILZIL;
        Long l = this.LLILZLL;
        String str2 = this.LLIZ;
        String str3 = this.LLIZLLLIL;
        abstractC20356314kz.LJJJLL(c20361214lm, interfaceC20354714kj2, lifecycleOwner, str, l, str2, (str3 == null || str3.length() == 0) ? "playbook_entity" : this.LLIZLLLIL);
        return Unit.LIZ;
    }
}
