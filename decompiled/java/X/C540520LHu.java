package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0LHu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540520LHu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0M7N LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C540520LHu(C0M7N c0m7n, String str, String str2, Function0 function0, Function0 function02, boolean z) {
        super(0);
        this.LL = c0m7n;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final String strLIZ = C0DMI.LIZ();
        final C0M7N c0m7n = this.LL;
        InterfaceC578380MmK interfaceC578380MmK = c0m7n.LIZLLL;
        if (interfaceC578380MmK != null) {
            final boolean z = this.LLILLJJLI;
            final String str = this.LLILLL;
            final String str2 = this.LLILZ;
            final Function0<Unit> function0 = this.LLILZIL;
            final Function0<Unit> function02 = this.LLILZLL;
            interfaceC578380MmK.ou(new Runnable() { // from class: X.0LHo
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1");
                    try {
                        C0M7N c0m7n2 = c0m7n;
                        C0M7N.LIZLLL(c0m7n2, null, new C540450LHn(c0m7n2, z, str, strLIZ, str2, function0, function02), 3);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EditExitController@7e76.checkLoginStateBeforeSaveDraftWithNewId$1$1");
                }
            });
        }
        return Unit.LIZ;
    }
}
