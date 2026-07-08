package X;

import Y.ARunnableS74S0200000_5;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FW1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.sticker.lyric.LyricStickerPanelTagController$showNewTagIfNeed$1$1", f = "LyricStickerPanelTagController.kt", l = {}, m = "invokeSuspend")
public final class C0FW1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ LyricStickerPanelTagController LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FW1(boolean z, LyricStickerPanelTagController lyricStickerPanelTagController, InterfaceC1364105Vn<? super C0FW1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = lyricStickerPanelTagController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0FW1 c0fw1 = new C0FW1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c0fw1.LL = obj;
        return c0fw1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1644640stq interfaceC1644640stqInvoke;
        C1C7U.LIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LLILLJJLI) {
            this.LLILLL.LIZIZ();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1$1");
            return unit;
        }
        Function0<InterfaceC1644640stq> function0 = this.LLILLL.LJ;
        if (function0 != null && (interfaceC1644640stqInvoke = function0.invoke()) != null && interfaceC1644640stqInvoke.X0()) {
            LyricStickerPanelTagController lyricStickerPanelTagController = this.LLILLL;
            try {
                View viewLIZ = lyricStickerPanelTagController.LIZ();
                C786410Ut5.LJLLLLLL(0, viewLIZ);
                HandlerHook.viewPost(viewLIZ, new ARunnableS74S0200000_5(lyricStickerPanelTagController, viewLIZ, 16));
                C0E12 c0e12 = C391320FVy.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("has_show_lyric_guide_in_sticker_panel_");
                sbLIZ.append(C391320FVy.LIZ());
                c0e12.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), true);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1$1");
            return unit2;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("LyricStickerPanelTagController@dcae.showNewTagIfNeed$1$1");
        return unit3;
    }
}
