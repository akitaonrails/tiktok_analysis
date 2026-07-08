package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkCoreError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bGs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967000bGs extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C966920bGk LL;
    public final /* synthetic */ InterfaceC968200bIo LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967000bGs(C966920bGk c966920bGk, InterfaceC968200bIo interfaceC968200bIo) {
        super(0);
        this.LL = c966920bGk;
        this.LLILLJJLI = interfaceC968200bIo;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C966920bGk c966920bGk = this.LL;
        if (!c966920bGk.LJFF) {
            c966920bGk.LIZLLL.invoke();
        }
        this.LLILLJJLI.LIZJ(new C967640bHu("", new C966980bGq(r1.errorCode, LinkCoreError.Companion.getBLOCK_BY_RUST_ERROR().errorMsg, "", "", ""), null));
        return Unit.LIZ;
    }
}
