package X;

import com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS590S0100000_11;
import njp.a;

/* JADX INFO: renamed from: X.0Rqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.captionsheet.PhotoTranslationPanelFragment$initDoNotTranslateRow$2", f = "PhotoTranslationPanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C708490Rqh extends C09AX implements Function2<List<? extends String>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ PhotoTranslationPanelFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708490Rqh(PhotoTranslationPanelFragment photoTranslationPanelFragment, InterfaceC1364105Vn<? super C708490Rqh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = photoTranslationPanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C708490Rqh c708490Rqh = new C708490Rqh(this.LLILLJJLI, interfaceC1364105Vn);
        c708490Rqh.LL = obj;
        return c708490Rqh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PhotoTranslationPanelFragment@8b22.initDoNotTranslateRow$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List list = (List) this.LL;
        PhotoTranslationPanelFragment photoTranslationPanelFragment = this.LLILLJJLI;
        String[] strArr = (String[]) list.toArray(new String[0]);
        if (!Arrays.equals(strArr, photoTranslationPanelFragment.LLJILJIL)) {
            photoTranslationPanelFragment.LLJILJIL = strArr;
            photoTranslationPanelFragment.ZR(photoTranslationPanelFragment.LLJILJIL);
            C20693915yL c20693915yL = photoTranslationPanelFragment.LLJI;
            if (c20693915yL != null) {
                c20693915yL.LJI(new AwS590S0100000_11(photoTranslationPanelFragment, 597));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PhotoTranslationPanelFragment@8b22.initDoNotTranslateRow$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends String> list, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(list, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
