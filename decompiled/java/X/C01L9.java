package X;

import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.livesdk.gift.model.GiftHintInfo;
import com.bytedance.android.livesdk.gift.model.GiftHintRequest;
import com.bytedance.android.livesdk.hints.GiftHintsManager;
import com.bytedance.keva.Keva;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.01L9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.hints.GiftHintsManager$tryFetchHints$1", f = "GiftHintsManager.kt", l = {55}, m = "invokeSuspend")
public final class C01L9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LifecycleOwner LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01L9(LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C01L9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01L9 c01l9 = new C01L9(this.LLILLL, interfaceC1364105Vn);
        c01l9.LLILLJJLI = obj;
        return c01l9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Lifecycle lifecycle;
        Integer numValueOf;
        List<GiftHintInfo> listLJLLLL;
        boolean z;
        LifecycleCoroutineScope lifecycleScope;
        C1C7U.LIZ("GiftHintsManager@be32.tryFetchHints$1");
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
            GiftHintsManager.LL.getClass();
            C01LB[] c01lbArrValues = C01LB.values();
            ArrayList arrayList = new ArrayList();
            for (C01LB c01lb : c01lbArrValues) {
                if (c01lb.shouldShow() && (numValueOf = Integer.valueOf(c01lb.getHintId())) != null) {
                    arrayList.add(numValueOf);
                }
            }
            if (!arrayList.isEmpty()) {
                LifecycleOwner lifecycleOwner = this.LLILLL;
                GiftHintsManager giftHintsManager = GiftHintsManager.LL;
                if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                    if (lifecycleOwner != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                        lifecycle.addObserver(giftHintsManager);
                    }
                } else {
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LJ(C2107308Nj.LIZ.LLIILII(), new C01LA(lifecycleOwner, giftHintsManager, null));
                }
                GiftHintRequest giftHintRequest = new GiftHintRequest();
                giftHintRequest.hintIds = arrayList;
                GiftHintsManager.LLILLJJLI = true;
                this.LL = 1;
                obj = giftHintsManager.LIZ(giftHintRequest, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GiftHintsManager@be32.tryFetchHints$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GiftHintsManager@be32.tryFetchHints$1");
                return unit;
            }
        }
        Iterable iterable = (Iterable) obj;
        if (iterable != null) {
            listLJLLLL = C13LP.LJLLLL(new C512401z8(62), iterable);
        } else {
            listLJLLLL = null;
        }
        GiftHintsManager.LLILLJJLI = false;
        if (listLJLLLL != null) {
            z = true;
        } else {
            z = false;
        }
        GiftHintsManager.LLILLL = z;
        if (listLJLLLL != null) {
            LifecycleOwner lifecycleOwner2 = this.LLILLL;
            for (GiftHintInfo giftHintInfo : listLJLLLL) {
                if (giftHintInfo.hintId == C01LB.RANDOM_FIREWORKS.getHintId() || giftHintInfo.hintId == C01LB.FANS_CLUB_JOIN_GIFT.getHintId()) {
                    GiftHintsManager.LL.getClass();
                    String str = giftHintInfo.hintText;
                    if (str != null && str.length() != 0) {
                        long j = giftHintInfo.hintShowDelayMs;
                        if (j < 0) {
                            j = 0;
                        }
                        C5182020e c5182020e = new C5182020e(giftHintInfo, 500);
                        C1DFH c1dfh2 = C0PEM.LIZ;
                        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                        if (lifecycleOwner2 != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) != null) {
                            C23250099c.LIZLLL(lifecycleScope, abstractC2238408pq, null, new C01L8(j, c5182020e, null), 2);
                        }
                    }
                }
                if (giftHintInfo.hintId == C01LB.FIRST_GIFT_TIPS.getHintId()) {
                    InterfaceC1094160eZy.D1.LIZJ(Boolean.valueOf(!giftHintInfo.hasGiftHistory));
                    Keva keva = C1124560fN0.LIZ;
                    C1124560fN0.LIZIZ = giftHintInfo.hasGiftHistory;
                }
                if (giftHintInfo.hintId == 3) {
                    C1124560fN0.LIZJ = true;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftHintsManager@be32.tryFetchHints$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
