package X;

import com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings;

/* JADX INFO: renamed from: X.0Tpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.function.RoomFunctionSettingsManager", f = "RoomFunctionSettingsManager.kt", l = {339}, m = "updateAgeRestrictionSettings")
public final class C758990Tpx extends AbstractC23140094w {
    public AgeRestrictionSettings LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C758980Tpw LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C758990Tpx(C758980Tpw c758980Tpw, InterfaceC1364105Vn<? super C758990Tpx> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c758980Tpw;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RoomFunctionSettingsManager@eba.updateAgeRestrictionSettings$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJIIJ = this.LLILLL.LJIIJ(null, this);
        C1C7U.LIZIZ("RoomFunctionSettingsManager@eba.updateAgeRestrictionSettings$1");
        return objLJIIJ;
    }
}
