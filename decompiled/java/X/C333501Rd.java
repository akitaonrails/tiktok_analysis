package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01Rd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.main.MediaPickerListKt$MediaPickerList$2$1$gridListHeightPixel$1$1$3", f = "MediaPickerList.kt", l = {}, m = "invokeSuspend")
public final class C333501Rd extends C09AX implements InterfaceC1631620sYq<Integer, Integer, InterfaceC1364105Vn<? super Integer>, Object> {
    public /* synthetic */ int LL;
    public /* synthetic */ int LLILLJJLI;

    public C333501Rd(InterfaceC1364105Vn<? super C333501Rd> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$gridListHeightPixel$1$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLJ = C2286608xc.LJ(this.LLILLJJLI - this.LL);
        C1C7U.LIZIZ("MediaPickerListKt@5aa8.MediaPickerList$2$1$gridListHeightPixel$1$1$3");
        return numLJ;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(Integer num, Integer num2, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        int iIntValue = num.intValue();
        int iIntValue2 = num2.intValue();
        C333501Rd c333501Rd = new C333501Rd(interfaceC1364105Vn);
        c333501Rd.LL = iIntValue;
        c333501Rd.LLILLJJLI = iIntValue2;
        return c333501Rd.invokeSuspend(Unit.LIZ);
    }
}
