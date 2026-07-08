package X;

import com.bytedance.android.livesdk.broadcast.preview.widget.setting.AutoShareToBulletinBoardSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tgo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.setting.AutoShareToBulletinBoardSheet$onViewCreated$1$1$1", f = "AutoShareToBulletinBoardSheet.kt", l = {}, m = "invokeSuspend")
public final class C753320Tgo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AutoShareToBulletinBoardSheet LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753320Tgo(AutoShareToBulletinBoardSheet autoShareToBulletinBoardSheet, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = autoShareToBulletinBoardSheet;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753320Tgo(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20743716Ff c20743716Ff = this.LL.LLJZ;
        if (c20743716Ff != null) {
            c20743716Ff.setChecked(!this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoShareToBulletinBoardSheet@4f2b.onViewCreated$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
