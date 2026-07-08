package X;

import android.widget.ImageView;
import com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01tR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.viewholders.DraftItemBaseBgViewHolder$setBitmapSafely$1$1", f = "DraftItemBaseBgViewHolder.kt", l = {}, m = "invokeSuspend")
public final class C477101tR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0M0P LL;
    public final /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ImageView LLILLL;
    public final /* synthetic */ DraftItemBaseBgViewHolder LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C477101tR(C0M0P c0m0p, Object obj, ImageView imageView, DraftItemBaseBgViewHolder draftItemBaseBgViewHolder, InterfaceC1364105Vn<? super C477101tR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0m0p;
        this.LLILLJJLI = obj;
        this.LLILLL = imageView;
        this.LLILZ = draftItemBaseBgViewHolder;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C477101tR(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0M0P c0m0p = this.LL;
        Object obj2 = this.LLILLJJLI;
        if (C189200o6.m7isFailureimpl(obj2)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            str = "";
        }
        c0m0p.LJFF = str;
        this.LLILLL.setTag(R.id.g5r, false);
        C561130Lzb c561130LzbR5 = this.LLILZ.R5();
        C0M0P c0m0p2 = this.LL;
        c561130LzbR5.LIZIZ(c0m0p2.LJ, c0m0p2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftItemBaseBgViewHolder@3570.setBitmapSafely$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
