package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Ioi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477940Ioi extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477940Ioi(String str, long j) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        Throwable th2 = th;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TopModuleTimerManager Failed to fetch room data for ");
        sbLIZ.append(this.LL);
        C20441214yg.LJFF("MultiTopLiveTopModuleTimerManager", C2188811AlT.LIZIZ(sbLIZ), th2);
        C477500Io0.LIZ.getClass();
        C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(th2);
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI;
        String str = c477680IoILJIJ.LIZJ;
        if (str == null) {
            str = "";
        }
        C477860Ioa.LJIIL(new C477910Iof("top_module_room_preload", "MultiTopLiveTopModuleTimerManager # fetchRoomDataForModule, onFailed", jCurrentTimeMillis, "error", str, String.valueOf(c477680IoILJIJ.LIZ), c477680IoILJIJ.LIZIZ));
        return Unit.LIZ;
    }
}
