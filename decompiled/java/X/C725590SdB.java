package X;

import com.bytedance.keva.Keva;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0SdB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.popup.PopupWeaver$assembleTasks$2", f = "PopupWeaver.kt", l = {167, 169}, m = "invokeSuspend")
public final class C725590SdB extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C725580SdA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C725590SdB(C725580SdA c725580SdA, InterfaceC1364105Vn<? super C725590SdB> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c725580SdA;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C725590SdB(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PopupWeaver@4083.assembleTasks$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(1000L, this) == objLJFF) {
                C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$2");
                return objLJFF;
            }
        }
        C01GW<Keva> c01gw = C725580SdA.LJIIJ;
        if (C0RN1.LIZIZ() && C725580SdA.LIZJ(this.LLILLJJLI.LIZLLL.invoke())) {
            C725580SdA c725580SdA = this.LLILLJJLI;
            C20674415vC c20674415vC = new C20674415vC(c725580SdA.LIZJ, new C725640SdG(this.LLILLJJLI));
            InterfaceC725710SdN interfaceC725710SdN = new InterfaceC725710SdN() { // from class: X.0SdL
                @Override // X.InterfaceC725710SdN
                public final void LIZ(Keva keva) {
                    keva.storeInt("music_detail_avatar_gesture_education_shown", keva.getInt("music_detail_avatar_gesture_education_shown", 0) + 1);
                }
            };
            this.LL = 2;
            if (C725580SdA.LJFF(c725580SdA, c20674415vC, interfaceC725710SdN, this) == objLJFF) {
                C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$2");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PopupWeaver@4083.assembleTasks$2");
        return unit2;
    }
}
