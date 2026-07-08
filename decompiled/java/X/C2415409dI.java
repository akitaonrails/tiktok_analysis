package X;

import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09dI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.edit.effectdebugger.EffectDebuggerComponent$handleButtonClick$1$1", f = "EffectDebuggerComponent.kt", l = {}, m = "invokeSuspend")
public final class C2415409dI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2415509dJ LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ C2416009dO LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2415409dI(C2415509dJ c2415509dJ, File file, C2416009dO c2416009dO, InterfaceC1364105Vn<? super C2415409dI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2415509dJ;
        this.LLILLJJLI = file;
        this.LLILLL = c2416009dO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2415409dI(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectDebuggerComponent@97b3.handleButtonClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getClass();
        try {
            this.LL.getClass();
            Integer numLJ = C2286608xc.LJ(CastIntegerProtector.parseInt(null));
            if (numLJ != null) {
                this.LL.getClass();
                if (Intrinsics.LJFF(null, CardStruct.IStatusCode.DEFAULT)) {
                    INLEPlayer iNLEPlayer = this.LLILLL.LLJJI;
                    if (iNLEPlayer != null) {
                        C2286608xc.LJ(iNLEPlayer.seekForward());
                    }
                } else if (Intrinsics.LJFF(null, "1")) {
                    INLEPlayer iNLEPlayer2 = this.LLILLL.LLJJI;
                    if (iNLEPlayer2 != null) {
                        C2286608xc.LJ(iNLEPlayer2.seekBackward());
                    }
                } else {
                    INLEPlayer iNLEPlayer3 = this.LLILLL.LLJJI;
                    if (iNLEPlayer3 != null) {
                        int iIntValue = numLJ.intValue();
                        this.LL.getClass();
                        C2286608xc.LJ(iNLEPlayer3.handleEffectDebugService(iIntValue, "", this.LLILLJJLI.getAbsolutePath()));
                    }
                }
            }
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectDebuggerComponent@97b3.handleButtonClick$1$1");
        return unit;
    }
}
