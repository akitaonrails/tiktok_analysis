package X;

import com.ss.android.ugc.aweme.creative.model.edit.TextImageTaskInfo;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0Cct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.texttoimage.choose.Text2ImageListScene$refreshPageWithSkeleton$1$1", f = "Text2ImageListScene.kt", l = {662}, m = "invokeSuspend")
public final class C317730Cct extends C09AX implements InterfaceC1631630sYr<List<? extends TextImageTaskInfo>, Boolean, Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public /* synthetic */ int LLILLL;
    public final /* synthetic */ C558180Luq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317730Cct(C558180Luq c558180Luq, InterfaceC1364105Vn<? super C317730Cct> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = c558180Luq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1");
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
            boolean z = this.LLILLJJLI;
            int i2 = this.LLILLL;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C317740Ccu c317740Ccu = new C317740Ccu(i2, z, this.LLILZ, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c317740Ccu) == objLJFF) {
                C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Text2ImageListScene@1b50.refreshPageWithSkeleton$1$1");
        return unit;
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(List<? extends TextImageTaskInfo> list, Boolean bool, Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        int iIntValue = num.intValue();
        C317730Cct c317730Cct = new C317730Cct(this.LLILZ, interfaceC1364105Vn);
        c317730Cct.LLILLJJLI = zBooleanValue;
        c317730Cct.LLILLL = iIntValue;
        return c317730Cct.invokeSuspend(Unit.LIZ);
    }
}
