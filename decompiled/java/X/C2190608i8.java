package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08i8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.download.DraftStickerDownloadMgrKt$unzipDraftStickerRes$2", f = "DraftStickerDownloadMgr.kt", l = {}, m = "invokeSuspend")
public final class C2190608i8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Effect LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2190608i8(Effect effect, InterfaceC1364105Vn<? super C2190608i8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2190608i8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftStickerDownloadMgrKt@ddef.unzipDraftStickerRes$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0VSJ c0vsj = new C0VSJ(this.LL.getZipPath());
        try {
            try {
                FileUtils fileUtils = FileUtils.INSTANCE;
                fileUtils.removeDir(this.LL.getUnzipPath());
                fileUtils.unZip(this.LL.getZipPath(), this.LL.getUnzipPath());
            } catch (IOException e) {
                TryCatchGuardChecker.doCheck(e);
                C201955140j.LJ(Log.getStackTraceString(e));
            }
            c0vsj.delete();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftStickerDownloadMgrKt@ddef.unzipDraftStickerRes$2");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c0vsj.delete();
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
