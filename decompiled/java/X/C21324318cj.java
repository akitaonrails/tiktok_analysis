package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18cj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21324318cj extends C09AY implements InterfaceC1631620sYq<String, Boolean, String, Unit> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C013C LLILLL;
    public final /* synthetic */ C013C LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21324318cj(C013C c013c, boolean z, C013C c013c2, C013C c013c3) {
        super(3);
        this.LL = c013c;
        this.LLILLJJLI = z;
        this.LLILLL = c013c2;
        this.LLILZ = c013c3;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(String str, Boolean bool, String str2) {
        bool.booleanValue();
        if (Intrinsics.LJFF(str, "z_index")) {
            this.LL.element = true;
        } else if (Intrinsics.LJFF(str, "overflow") && !this.LLILLJJLI) {
            this.LLILLL.element = true;
            this.LLILZ.element = false;
        }
        return Unit.LIZ;
    }
}
