package X;

import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ddV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ad.feed.ibe.IBEGeckoPreloadUtil$fetchGeckoResource$result$1$1", f = "IBEGeckoPreloadUtil.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C1057910ddV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super UpdatePackage>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057910ddV(String str, String str2, InterfaceC1364105Vn<? super C1057910ddV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1057910ddV(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IBEGeckoPreloadUtil@bb2f.fetchGeckoResource$result$1$1");
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
            C1057920ddW c1057920ddW = C1057920ddW.LIZ;
            String str = this.LLILLJJLI;
            String str2 = this.LLILLL;
            this.LL = 1;
            c1057920ddW.getClass();
            C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
            C1551950qUL c1551950qULLJIILJJIL = C1552050qUV.LJIILJJIL(str, null);
            if (c1551950qULLJIILJJIL != null) {
                CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
                targetChannel.channelName = str2;
                c1551950qULLJIILJJIL.LIZJ(C2097908Jt.LIZJ(new Pair(str, C1697810uHb.LJIILJJIL(targetChannel))), new C1077190e8b(c23260099m, 1));
            }
            obj = c23260099m.LIZ();
            if (obj == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("IBEGeckoPreloadUtil@bb2f.fetchGeckoResource$result$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("IBEGeckoPreloadUtil@bb2f.fetchGeckoResource$result$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super UpdatePackage> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
