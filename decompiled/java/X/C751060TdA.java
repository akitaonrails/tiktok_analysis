package X;

import android.view.View;
import com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TdA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.adminsetting.LiveCommentSettingFragmentSheet$onViewCreated$3", f = "LiveCommentSettingFragmentSheet.kt", l = {314}, m = "invokeSuspend")
public final class C751060TdA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveCommentSettingFragmentSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751060TdA(LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet, InterfaceC1364105Vn<? super C751060TdA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveCommentSettingFragmentSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751060TdA(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCommentSettingFragmentSheet@941e.onViewCreated$3");
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
            C751280TdW c751280TdWZS = this.LLILLJJLI.zS();
            this.LL = 1;
            if (c751280TdWZS.LIZLLL(this) == objLJFF) {
                C1C7U.LIZIZ("LiveCommentSettingFragmentSheet@941e.onViewCreated$3");
                return objLJFF;
            }
        }
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet = this.LLILLJJLI;
        View viewFindViewById = liveCommentSettingFragmentSheet.LLLFFI;
        View viewFindViewById2 = null;
        if (viewFindViewById == null) {
            View view = liveCommentSettingFragmentSheet.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.eay);
            } else {
                viewFindViewById = null;
            }
            liveCommentSettingFragmentSheet.LLLFFI = (C20743716Ff) viewFindViewById;
        }
        C786410Ut5.A7((C20743716Ff) viewFindViewById, new C785990UsP(this.LLILLJJLI, 13));
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet2 = this.LLILLJJLI;
        View viewFindViewById3 = liveCommentSettingFragmentSheet2.LLLI;
        if (viewFindViewById3 == null) {
            View view2 = liveCommentSettingFragmentSheet2.getView();
            if (view2 != null) {
                viewFindViewById3 = view2.findViewById(R.id.eeu);
            } else {
                viewFindViewById3 = null;
            }
            liveCommentSettingFragmentSheet2.LLLI = (C20743716Ff) viewFindViewById3;
        }
        C786410Ut5.A7((C20743716Ff) viewFindViewById3, this.LLILLJJLI.LLLLIIIILLL);
        LiveCommentSettingFragmentSheet liveCommentSettingFragmentSheet3 = this.LLILLJJLI;
        View view3 = liveCommentSettingFragmentSheet3.LLLFZ;
        if (view3 == null) {
            View view4 = liveCommentSettingFragmentSheet3.getView();
            if (view4 != null) {
                viewFindViewById2 = view4.findViewById(R.id.h6o);
            }
            liveCommentSettingFragmentSheet3.LLLFZ = viewFindViewById2;
            view3 = viewFindViewById2;
        }
        C786410Ut5.A7((C20743716Ff) view3, new C785990UsP(this.LLILLJJLI, 14));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCommentSettingFragmentSheet@941e.onViewCreated$3");
        return unit;
    }
}
