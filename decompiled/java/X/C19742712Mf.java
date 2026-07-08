package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Banner;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressAwemeFragment;
import com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl;
import com.ss.android.ugc.ur.longpress.ActionFailureResult;
import com.ss.android.ugc.ur.longpress.AwemeRouteDetailPageParams;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.12Mf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.longpress.LongPressServiceImpl$startActivity$1$1", f = "LongPressServiceImpl.kt", l = {212}, m = "invokeSuspend")
public final class C19742712Mf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Object>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<Pair<LongPressAwemeFragment, Bundle>> LLILLL;
    public final /* synthetic */ AbstractC1387200mCc LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ Integer LLILZLL;
    public final /* synthetic */ Fragment LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;
    public final /* synthetic */ LongPressServiceImpl LLJ;
    public final /* synthetic */ AwemeRouteDetailPageParams LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19742712Mf(AnonymousClass0957<Pair<LongPressAwemeFragment, Bundle>> anonymousClass0957, AbstractC1387200mCc abstractC1387200mCc, C19EG c19eg, Integer num, Fragment fragment, Function0<Unit> function0, LongPressServiceImpl longPressServiceImpl, AwemeRouteDetailPageParams awemeRouteDetailPageParams, InterfaceC1364105Vn<? super C19742712Mf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = abstractC1387200mCc;
        this.LLILZIL = c19eg;
        this.LLILZLL = num;
        this.LLIZ = fragment;
        this.LLIZLLLIL = function0;
        this.LLJ = longPressServiceImpl;
        this.LLJI = awemeRouteDetailPageParams;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C19742712Mf c19742712Mf = new C19742712Mf(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
        c19742712Mf.LLILLJJLI = obj;
        return c19742712Mf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        FragmentManager supportFragmentManager;
        Object objLJ;
        C1C7U.LIZ("LongPressServiceImpl@1400.startActivity$1$1");
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
            Object obj2 = this.LLILLJJLI;
            AnonymousClass0957<Pair<LongPressAwemeFragment, Bundle>> anonymousClass0957 = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = anonymousClass0957.LJLIIIL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("LongPressServiceImpl@1400.startActivity$1$1");
                return objLJFF;
            }
        }
        Pair pair = (Pair) obj;
        LongPressAwemeFragment longPressAwemeFragment = (LongPressAwemeFragment) pair.getFirst();
        Bundle bundle = (Bundle) pair.getSecond();
        AbstractC1387200mCc abstractC1387200mCc = this.LLILZ;
        if (abstractC1387200mCc == null || (supportFragmentManager = abstractC1387200mCc.LJ()) == null) {
            Object obj3 = null;
            try {
                Fragment fragmentLJ = C651580Ph6.LJ(this.LLIZ);
                if (fragmentLJ != null) {
                    c098200Yq = fragmentLJ.getChildFragmentManager();
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj3 = c098200Yq;
            }
            supportFragmentManager = (FragmentManager) obj3;
            if (supportFragmentManager == null) {
                supportFragmentManager = this.LLILZIL.getSupportFragmentManager();
            }
        }
        longPressAwemeFragment.setArguments(bundle);
        longPressAwemeFragment.LLJLLIL = new AwS573S0100000_29(this.LLIZLLLIL, (Function0<? extends Banner>) 743);
        final LongPressServiceImpl longPressServiceImpl = this.LLJ;
        final C19EG c19eg = this.LLILZIL;
        final Fragment fragment = this.LLIZ;
        final AwemeRouteDetailPageParams awemeRouteDetailPageParams = this.LLJI;
        supportFragmentManager.LLIIIJ("LongPressAweme_requestKey", longPressAwemeFragment, new C0TSA() { // from class: X.0Svv
            @Override // X.C0TSA
            public final void LIZ(Bundle bundle2, String str) {
                String aid;
                InterfaceC737090Svj interfaceC737090Svj;
                if (!Intrinsics.LJFF(str, "LongPressAweme_requestKey")) {
                    return;
                }
                LongPressServiceImpl longPressServiceImpl2 = longPressServiceImpl;
                C19EG c19eg2 = c19eg;
                C128Y c128y = fragment;
                AwemeRouteDetailPageParams awemeRouteDetailPageParams2 = awemeRouteDetailPageParams;
                longPressServiceImpl2.getClass();
                boolean z = bundle2.getBoolean("longpress_aweme_fragment_favorite_video_key", false);
                ActionFailureResult actionFailureResult = (ActionFailureResult) bundle2.getParcelable("longpress_aweme_fragment_action_failure_key");
                String message = null;
                if (bundle2.getBoolean("longpress_aweme_fragment_refresh_list_key", false) && (c128y instanceof InterfaceC737090Svj) && (interfaceC737090Svj = (InterfaceC737090Svj) c128y) != null) {
                    interfaceC737090Svj.W0();
                }
                Aweme aweme = awemeRouteDetailPageParams2.aweme;
                if (aweme != null) {
                    aid = aweme.getAid();
                } else {
                    aid = null;
                }
                if (z && aid != null) {
                    C0O9L.LIZIZ(C0O9L.LIZ, c19eg2, aid, "profile_long_press");
                }
                if (actionFailureResult != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("ILongPressService handleLikeActionFailure, it.failureException is ");
                    Exception exc = actionFailureResult.failureException;
                    if (exc != null) {
                        message = exc.getMessage();
                    }
                    sbLIZ.append(message);
                    sbLIZ.append(", it.msgStringId is ");
                    sbLIZ.append(actionFailureResult.msgStringId);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1354920lMY.LIZLLL(c19eg2, actionFailureResult.failureException, actionFailureResult.msgStringId);
                }
            }
        });
        try {
            C19EH c19ehLJIIJ = supportFragmentManager.LJIIJ();
            c19ehLJIIJ.LIZIZ(this.LLILZLL.intValue(), longPressAwemeFragment);
            c19ehLJIIJ.LJII("LongPressAweme");
            objLJ = C2286608xc.LJ(c19ehLJIIJ.LJIIIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            int i2 = C2187451AjH.LIZ;
            C1720106oR.LIZIZ("LongPressServiceImpl", "Failed to launch transaction.", e);
            objLJ = Unit.LIZ;
        }
        C1C7U.LIZIZ("LongPressServiceImpl@1400.startActivity$1$1");
        return objLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Object> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
