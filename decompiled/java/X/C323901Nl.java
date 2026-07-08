package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$2$1", f = "MediaPickerList.kt", l = {}, m = "invokeSuspend")
public final class C323901Nl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ boolean[] LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323901Nl(int i, boolean[] zArr, boolean z, long j, InterfaceC1364105Vn<? super C323901Nl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = zArr;
        this.LLILLL = z;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323901Nl(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL > 0) {
            boolean[] zArr = this.LLILLJJLI;
            if (!zArr[0]) {
                zArr[0] = true;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
