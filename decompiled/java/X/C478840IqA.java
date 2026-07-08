package X;

import java.util.List;
import kotlin.jvm.functions.Function1;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;

/* JADX INFO: renamed from: X.0IqA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C478840IqA extends C09AY implements Function1<C478850IqB, C478850IqB> {
    public final /* synthetic */ List<MGModuleInteraction> LL;
    public final /* synthetic */ List<MGModuleTab> LLILLJJLI;
    public final /* synthetic */ EnumC479370Ir1 LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478840IqA(EnumC479370Ir1 enumC479370Ir1, String str, List list, List list2, boolean z) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = list2;
        this.LLILLL = enumC479370Ir1;
        this.LLILZ = z;
        this.LLILZIL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C478850IqB invoke(C478850IqB c478850IqB) {
        return C478850IqB.LIZ(c478850IqB, this.LL, this.LLILLJJLI, this.LLILLL, null, this.LLILZ, this.LLILZIL, 8);
    }
}
