package X;

import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Td9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragment$onViewCreated$7", f = "LiveCommentSettingFragment.kt", l = {303}, m = "invokeSuspend")
public final class C751050Td9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommentSettingFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751050Td9(LiveCommentSettingFragment liveCommentSettingFragment, InterfaceC1364105Vn<? super C751050Td9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommentSettingFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751050Td9(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCommentSettingFragment@ca1d.onViewCreated$7");
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
            C751280TdW c751280TdW = this.LLILLJJLI.LLJJIJIL;
            if (c751280TdW != null) {
                this.LL = 1;
                if (c751280TdW.LIZLLL(this) == objLJFF) {
                    C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.onViewCreated$7");
                    return objLJFF;
                }
            }
        }
        LiveCommentSettingFragment liveCommentSettingFragment = this.LLILLJJLI;
        View viewFindViewById = liveCommentSettingFragment.LLJ;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = liveCommentSettingFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.eeu);
            } else {
                viewFindViewById = null;
            }
            liveCommentSettingFragment.LLJ = (C20743716Ff) viewFindViewById;
        }
        C786410Ut5.A7((C20743716Ff) viewFindViewById, this.LLILLJJLI.LLJJL);
        LiveCommentSettingFragment liveCommentSettingFragment2 = this.LLILLJJLI;
        View viewFindViewById3 = liveCommentSettingFragment2.LLJI;
        if (viewFindViewById3 == null) {
            View view2 = liveCommentSettingFragment2.getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.eay);
            } else {
                viewFindViewById3 = null;
            }
            liveCommentSettingFragment2.LLJI = (C20743716Ff) viewFindViewById3;
        }
        C786410Ut5.A7((C20743716Ff) viewFindViewById3, new C785990UsP(this.LLILLJJLI, 9));
        LiveCommentSettingFragment liveCommentSettingFragment3 = this.LLILLJJLI;
        View view3 = liveCommentSettingFragment3.LLJIJIL;
        if (view3 == null) {
            View view4 = liveCommentSettingFragment3.getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.h6o);
            }
            liveCommentSettingFragment3.LLJIJIL = (C20743716Ff) viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.A7((C20743716Ff) view3, new C785990UsP(this.LLILLJJLI, 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentSettingFragment@ca1d.onViewCreated$7");
        return unit;
    }
}
