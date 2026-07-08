package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0fp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.musicgift.preview.MusicGiftPreviewPlayer$scheduleResumeFallback$1", f = "MusicGiftPreviewPlayer.kt", l = {669}, m = "invokeSuspend")
public final class C1141990fp7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C1136870fgr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1141990fp7(String str, C1136870fgr c1136870fgr, InterfaceC1364105Vn<? super C1141990fp7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c1136870fgr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1141990fp7(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1136870fgr c1136870fgr;
        C1C7U.LIZ("MusicGiftPreviewPlayer@5196.scheduleResumeFallback$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(600L, this) == objLJFF) {
                C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.scheduleResumeFallback$1");
                return objLJFF;
            }
        }
        C1142020fpA c1142020fpA = (C1142020fpA) C1142070fpF.LIZLLL.getValue();
        if (Intrinsics.LJFF(c1142020fpA.LIZIZ, this.LLILLJJLI) && (c1136870fgr = c1142020fpA.LIZ) != null && c1136870fgr.LIZ(this.LLILLL) && c1142020fpA.LIZJ == EnumC1142140fpM.LOADING) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resume fallback restart giftId=");
            sbLIZ.append(this.LLILLL.LIZ);
            sbLIZ.append(", snippetId=");
            sbLIZ.append(this.LLILLL.LIZLLL);
            C20441214yg.LIZIZ("MusicGiftPreviewPlayer", C2188811AlT.LIZIZ(sbLIZ));
            C1142070fpF c1142070fpF = C1142070fpF.LIZ;
            C1136870fgr c1136870fgr2 = this.LLILLL;
            c1142070fpF.getClass();
            C1142070fpF.LJIIZILJ(c1136870fgr2, null, false);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.scheduleResumeFallback$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MusicGiftPreviewPlayer@5196.scheduleResumeFallback$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
