package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.fcpanchor.render.debug.DebugCtaAnchorProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05jR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fcpanchor.render.debug.DebugCtaAnchorProvider$provideCustomEvents$1$1$invoke$2", f = "DebugCtaAnchorProvider.kt", l = {}, m = "invokeSuspend")
public final class C1434305jR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ WeakReference<C704830Rkn> LL;
    public final /* synthetic */ DebugCtaAnchorProvider LLILLJJLI;
    public final /* synthetic */ VideoItemParams LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1434305jR(WeakReference<C704830Rkn> weakReference, DebugCtaAnchorProvider debugCtaAnchorProvider, VideoItemParams videoItemParams, InterfaceC1364105Vn<? super C1434305jR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = weakReference;
        this.LLILLJJLI = debugCtaAnchorProvider;
        this.LLILLL = videoItemParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1434305jR(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C704830Rkn c704830Rkn;
        Function0<VideoItemParams> function0;
        VideoItemParams videoItemParamsInvoke;
        Aweme aweme;
        String aid;
        Fragment fragment;
        C1C7U.LIZ("DebugCtaAnchorProvider@106c.provideCustomEvents$1$1$invoke$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WeakReference<C704830Rkn> weakReference = this.LL;
        if (weakReference != null && (c704830Rkn = weakReference.get()) != null && (function0 = c704830Rkn.LIZLLL) != null && (videoItemParamsInvoke = function0.invoke()) != null && (aweme = videoItemParamsInvoke.getAweme()) != null && (aid = aweme.getAid()) != null) {
            String str = (String) ((LinkedHashMap) this.LLILLJJLI.LL).get(aid);
            String str2 = "register";
            if (Intrinsics.LJFF(str, "register")) {
                str2 = "unregister";
            }
            this.LLILLJJLI.LL.put(aid, str2);
            VideoItemParams videoItemParams = this.LLILLL;
            if (videoItemParams != null && (fragment = videoItemParams.fragment) != null) {
                C1389890mGx c1389890mGx = new C1389890mGx(fragment);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append(" click!");
                c1389890mGx.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
                c1389890mGx.LJIIJJI();
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DebugCtaAnchorProvider@106c.provideCustomEvents$1$1$invoke$2");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DebugCtaAnchorProvider@106c.provideCustomEvents$1$1$invoke$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
