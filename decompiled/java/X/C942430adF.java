package X;

import android.graphics.Rect;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestEmojiPositionModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0adF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.common.layout.component.render.plugin.micemoji.MultiGuestMicSeatEmojiPlayer$getEmojiRectInLayoutContainer$result$1", f = "MultiGuestMicSeatEmojiPlayer.kt", l = {}, m = "invokeSuspend")
public final class C942430adF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MultiGuestEmojiPositionModel, ? extends Boolean>>, Object> {
    public final /* synthetic */ C942410adD LL;
    public final /* synthetic */ Rect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C942430adF(C942410adD c942410adD, Rect rect, InterfaceC1364105Vn<? super C942430adF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c942410adD;
        this.LLILLJJLI = rect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C942430adF(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x010c A[EDGE_INSN: B:87:0x010c->B:50:0x010c BREAK  A[LOOP:1: B:66:0x0181->B:90:0x0181], SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C942430adF.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Pair<? extends MultiGuestEmojiPositionModel, ? extends Boolean>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
