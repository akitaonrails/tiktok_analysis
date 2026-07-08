package X;

import Y.ARunnableS132S0100000_32;
import android.content.Context;
import android.os.Build;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.17py, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21151617py extends C09AY implements Function0<Unit> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ InterfaceC21263418Jc LLILLJJLI;
    public final /* synthetic */ Function0 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21151617py(Context context, InterfaceC21263418Jc interfaceC21263418Jc, C21263218Ja c21263218Ja) {
        super(0);
        this.LL = context;
        this.LLILLJJLI = interfaceC21263418Jc;
        this.LLILLL = c21263218Ja;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        int i;
        Field field = C0W08.LIZ;
        if (C0W08.LIZ(this.LL)) {
            if (this.LLILLJJLI.threadMode() != EnumC714840S2g.MUTIPLE || ((i = Build.VERSION.SDK_INT) >= 24 && i <= 27)) {
                C786410Ut5.LJJZZIII(C21172617tM.LJFF.LIZ(), new ARunnableS132S0100000_32(this, 57));
            } else {
                C21172617tM.LJFF.LIZIZ().execute(new Runnable() { // from class: X.17px
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("AbsSchduler@adf6.getInflateFunc$func$1$1");
                        try {
                            this.LL.LLILLL.invoke();
                            C21172617tM c21172617tM = C21172617tM.LJFF;
                            Thread threadU3 = C786410Ut5.u3();
                            c21172617tM.getClass();
                            C687000Qx8 c687000Qx8 = C21172617tM.LIZLLL.get(threadU3.getName());
                            if (c687000Qx8 == null) {
                                Intrinsics.LJIIL();
                            }
                            c687000Qx8.LIZ(this.LL.LL);
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("AbsSchduler@adf6.getInflateFunc$func$1$1");
                    }
                });
            }
        }
        return Unit.LIZ;
    }
}
