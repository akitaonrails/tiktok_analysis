package X;

import c34.IDbS44S0000000_16;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import java.util.Collections;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dUT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.util.LemonCardUtil$preloadResources$1", f = "LemonCardUtil.kt", l = {}, m = "invokeSuspend")
public final class C1052310dUT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1077200e8c LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1052310dUT(String str, IDbS44S0000000_16 iDbS44S0000000_16, InterfaceC1364105Vn<? super C1052310dUT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = iDbS44S0000000_16;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1052310dUT(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LemonCardUtil@94ea.preloadResources$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1052320dUU.LIZ.getClass();
        String strLIZ = C1553670qX7.LIZ();
        HashMap map = new HashMap();
        CheckRequestBodyModel.TargetChannel targetChannel = new CheckRequestBodyModel.TargetChannel();
        targetChannel.channelName = this.LL;
        map.put(strLIZ, Collections.singletonList(targetChannel));
        C1551950qUL c1551950qULLJIIIZ = C1552050qUV.LJIIIZ(C1553670qX7.LIZ());
        if (c1551950qULLJIIIZ != null) {
            c1551950qULLJIIIZ.LIZJ(map, this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LemonCardUtil@94ea.preloadResources$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
