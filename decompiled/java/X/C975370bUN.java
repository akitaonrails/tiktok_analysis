package X;

import com.bytedance.android.live.liveinteract.multihost.biz.link.fragment.commonguide.CommonGuideViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bUN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C975370bUN extends C2217421BqW implements Function0<Unit> {
    public C975370bUN(Object obj) {
        super(0, obj, CommonGuideViewModel.class, "onClick", "onClick()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        CommonGuideViewModel commonGuideViewModel = (CommonGuideViewModel) this.receiver;
        if (C588200N5e.LIZ[commonGuideViewModel.LL.ordinal()] != 1) {
            throw new C1954807lC();
        }
        Function1<EnumC919170a1j, Unit> function1 = commonGuideViewModel.LLILLL;
        if (function1 != null) {
            function1.invoke(commonGuideViewModel.LLILLJJLI);
        }
        C973660bRc.LIZ.LJJL("ok");
        commonGuideViewModel.LLILZIL = true;
        return Unit.LIZ;
    }
}
