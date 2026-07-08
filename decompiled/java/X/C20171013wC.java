package X;

import android.util.Log;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.social.sticker.model.StorySocialEventPrepareData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS274S0000000_30;
import kotlin.jvm.internal.AwS239S0300000_30;
import kotlin.jvm.internal.AwS609S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.13wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.sticker.BaseCreateSocialStickerHandler$preload$1", f = "BaseCreateSocialStickerHandler.kt", l = {120}, m = "invokeSuspend")
public final class C20171013wC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20171713wJ LLILLJJLI;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20171013wC(C20171713wJ c20171713wJ, Function1<? super Boolean, Unit> function1, Function0<Unit> function0, InterfaceC1364105Vn<? super C20171013wC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20171713wJ;
        this.LLILLL = function1;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20171013wC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("BaseCreateSocialStickerHandler@12bc.preload$1");
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
            if (C0BWO.LIZ()) {
                String creationId = this.LLILLJJLI.LJII.getCreationId();
                AnonymousClass0522 anonymousClass0522 = AnonymousClass0522.LIZ;
                try {
                    anonymousClass0522.getClass();
                    AnonymousClass0522.LIZ().put(creationId, Boolean.TRUE);
                    anonymousClass0522.LIZJ();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trackPreloadStart: ");
                    sbLIZ.append(creationId);
                    sbLIZ.append(", total=");
                    sbLIZ.append(AnonymousClass0522.LIZ().size());
                    c098200Yq = Integer.valueOf(Log.d("SSticker-PreloadTracker", C2188811AlT.LIZIZ(sbLIZ)));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
            }
            this.LLILLJJLI.LJIIIIZZ = System.currentTimeMillis();
            C20171713wJ c20171713wJ = this.LLILLJJLI;
            C20170113w3 c20170113w3 = c20171713wJ.LJIIJJI;
            StorySocialEventPrepareData storySocialEventPrepareData = c20171713wJ.LJII;
            AFwS274S0000000_30 aFwS274S0000000_30 = AFwS274S0000000_30.get$arr$(123);
            AwS609S0100000_30 awS609S0100000_30 = new AwS609S0100000_30(c20171713wJ, 86);
            AwS239S0300000_30 awS239S0300000_30 = new AwS239S0300000_30((Function1) this.LLILLL, (Function1<? super Boolean, Unit>) this.LLILLJJLI, (C20171713wJ) this.LLILZ, (Function0<Unit>) 5);
            this.LL = 1;
            if (c20170113w3.LIZJ(storySocialEventPrepareData, aFwS274S0000000_30, awS609S0100000_30, awS239S0300000_30, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCreateSocialStickerHandler@12bc.preload$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseCreateSocialStickerHandler@12bc.preload$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
