package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.analysis.IMSmartReplyAnalysis$onAIAsstChatExit$1", f = "IMSmartReplyAnalysis.kt", l = {}, m = "invokeSuspend")
public final class C1499605ty extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1499605ty(InterfaceC1364105Vn<? super C1499605ty> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1499605ty(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("IMSmartReplyAnalysis@3a3f.onAIAsstChatExit$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String strLIZIZ = C461720I8s.LIZIZ();
        boolean z = !Intrinsics.LJFF(C1508705vR.LLILZ, strLIZIZ);
        C1508705vR.LLILZ = strLIZIZ;
        C1508705vR c1508705vR = C1508705vR.LL;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("enter_from", "notification_page");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[1] = new Pair("is_first_enter", str);
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
        c1508705vR.getClass();
        C1508705vR.LIZLLL("ttsocial_aiasst_chat_exit", mapLJIIIIZZ);
        Set<Long> set = C1508705vR.LLILZIL;
        synchronized (set) {
            try {
                set.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1499405tw.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMSmartReplyAnalysis@3a3f.onAIAsstChatExit$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1499605ty(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
