package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0J18, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.MaterialSelectPagingScene$setupListContainer$3$9$1", f = "MaterialSelectPagingScene.kt", l = {}, m = "invokeSuspend")
public final class C0J18 extends C09AX implements Function2<EnumC485010J0h, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ MaterialSelectPagingScene LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0J18(MaterialSelectPagingScene materialSelectPagingScene, InterfaceC1364105Vn<? super C0J18> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = materialSelectPagingScene;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0J18 c0j18 = new C0J18(this.LLILLJJLI, interfaceC1364105Vn);
        c0j18.LL = obj;
        return c0j18;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MaterialSelectPagingScene@7b25.setupListContainer$3$9$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC485010J0h enumC485010J0h = (EnumC485010J0h) this.LL;
        C0J19 c0j19 = this.LLILLJJLI.LLLF;
        if (c0j19 != null) {
            c0j19.LLLIIIIL(enumC485010J0h);
        }
        int i = C485020J0i.LIZ[enumC485010J0h.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3 || i == 4) {
                    this.LLILLJJLI.LLLLLLLLLL();
                } else {
                    throw new C1954807lC();
                }
            }
        } else {
            C0J1D c0j1d = this.LLILLJJLI.LLLFF;
            if (c0j1d != null && c0j1d.getItemCount() == 0) {
                MaterialSelectPagingScene materialSelectPagingScene = this.LLILLJJLI;
                C1390410mHn c1390410mHn = materialSelectPagingScene.LLJJLIIIJLLLLLLLZ;
                if (c1390410mHn != null) {
                    C786410Ut5.LLLZZIL(c1390410mHn, 0);
                }
                C1390410mHn c1390410mHn2 = materialSelectPagingScene.LLJJLIIIJLLLLLLLZ;
                if (c1390410mHn2 != null) {
                    c1390410mHn2.LIZJ();
                }
                View view = materialSelectPagingScene.LLJJJJ;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(8, view);
                }
                C0HZQ c0hzq = materialSelectPagingScene.LLJJJIL;
                if (c0hzq != null) {
                    C786410Ut5.LLLLLZ(c0hzq, 8);
                }
                View view2 = materialSelectPagingScene.LLJJL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                TuxTextView tuxTextView = materialSelectPagingScene.LLJJJJJIL;
                if (tuxTextView != null) {
                    C786410Ut5.LLLLZLL(tuxTextView, 8);
                }
                RecyclerView recyclerView = materialSelectPagingScene.LLJL;
                if (recyclerView != null) {
                    C786410Ut5.LLIZLLLIL(recyclerView, 8);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MaterialSelectPagingScene@7b25.setupListContainer$3$9$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EnumC485010J0h enumC485010J0h, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(enumC485010J0h, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
