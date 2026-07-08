package X;

import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS291S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.draftbox.DraftBoxFragment$onResume$1$1", f = "DraftBoxFragment.kt", l = {}, m = "invokeSuspend")
public final class C561560M0s extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ DraftBoxFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C561560M0s(boolean z, DraftBoxFragment draftBoxFragment, InterfaceC1364105Vn<? super C561560M0s> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = draftBoxFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C561560M0s(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxFragment@80e.onResume$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            this.LLILLJJLI.MR("onResume: enableShowAIRemixEntrance = true, refresh list");
            this.LLILLJJLI.VR().notifyDataSetChanged();
        } else {
            this.LLILLJJLI.MR("onResume: enableShowAIRemixEntrance = false, remove entrance item");
            this.LLILLJJLI.VR().LLLII(Collections.singletonList(new C561950M2f(120, 6)), AFwS291S0000000_8.get$arr$(15));
            DraftBoxFragment draftBoxFragment = this.LLILLJJLI;
            draftBoxFragment.LLLJIL = false;
            if (draftBoxFragment.LLJLILLLLZIIL == 0) {
                draftBoxFragment.MR("onResume: draftCount = 0, quit draft box");
                DraftBoxFragment draftBoxFragment2 = this.LLILLJJLI;
                if (draftBoxFragment2.LLJJL) {
                    C19EG activity = draftBoxFragment2.getActivity();
                    if (activity != null) {
                        DraftBoxFragment draftBoxFragment3 = this.LLILLJJLI;
                        C561520M0o.LIZ.getClass();
                        SmartRouter.buildRoute(activity, "aweme://openShoot?landing_tab=editor_tab&schema_tag=draft_box").open();
                        C01TT.LIZIZ(400L, new AwS552S0100000_8(draftBoxFragment3, 486));
                    }
                } else {
                    C0M11 c0m11 = draftBoxFragment2.LLLF;
                    if (c0m11 != null) {
                        c0m11.LIZJ();
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxFragment@80e.onResume$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
