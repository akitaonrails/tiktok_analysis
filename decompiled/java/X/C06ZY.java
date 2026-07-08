package X;

import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.06ZY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigroupshot.AIGroupShotUtil$setAddingPhotoLoadingState$1", f = "AIGroupShotUtil.kt", l = {106}, m = "invokeSuspend")
public final class C06ZY extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06ZY(long j, String str, InterfaceC1364105Vn<? super C06ZY> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06ZY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGroupShotUtil@623c.setAddingPhotoLoadingState$1");
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
            InterfaceC874680YTa interfaceC874680YTaLIZ = C0YNY.LIZ(InterfaceC874680YTa.LIZ);
            List<Long> listSingletonList = Collections.singletonList(C2286608xc.LJFF(this.LLILLJJLI));
            this.LL = 1;
            obj = interfaceC874680YTaLIZ.LJJIJIL(listSingletonList, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AIGroupShotUtil@623c.setAddingPhotoLoadingState$1");
                return objLJFF;
            }
        }
        C869590Y9l c869590Y9l = (C869590Y9l) C13LP.LJJJLL((List) obj);
        if (c869590Y9l != null) {
            String str = this.LLILLL;
            c869590Y9l.getLocalExt().put("local_ext_ai_group_shot_adding_photo_loading_state", str);
            C603540Nlo.LIZ(C0YNY.LIZ(InterfaceC874680YTa.LIZ).LIZIZ(), c869590Y9l, "local_ext_ai_group_shot_adding_photo_loading_state", new C0Y3R(str), new C0Y3I("AI Group Shot update adding-photo state"));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGroupShotUtil@623c.setAddingPhotoLoadingState$1");
        return unit;
    }
}
