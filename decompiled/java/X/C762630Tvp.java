package X;

import com.bytedance.android.live.effect.music.BGMListFragment;
import com.bytedance.android.live.effect.music.BGMSongListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMListFragment$onViewCreated$1", f = "BGMListFragment.kt", l = {115}, m = "invokeSuspend")
public final class C762630Tvp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMListFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762630Tvp(BGMListFragment bGMListFragment, InterfaceC1364105Vn<? super C762630Tvp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMListFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762630Tvp(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("BGMListFragment@5821.onViewCreated$1");
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
            BGMListFragment bGMListFragment = this.LLILLJJLI;
            BGMSongListViewModel bGMSongListViewModel = bGMListFragment.LLILLJJLI;
            if (bGMSongListViewModel != null && (c1dek = bGMSongListViewModel.LLILLL) != null) {
                C762940TwK c762940TwK = new C762940TwK(bGMListFragment.LLILZIL);
                this.LL = 1;
                if (c1dek.LJIJI(c762940TwK, this) == objLJFF) {
                    C1C7U.LIZIZ("BGMListFragment@5821.onViewCreated$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BGMListFragment@5821.onViewCreated$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
