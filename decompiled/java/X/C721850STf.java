package X;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEcommerceAnchorOuterService;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Collections;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0STf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C721850STf implements InterfaceC698650Rap, InterfaceC724530SbT {
    public final Lifecycle LL;
    public Function0<String> LLILLL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C721890STj(this));
    public final C721860STg LLILZ = new InterfaceC20685415wy() { // from class: X.0STg
        @Override // X.InterfaceC20685415wy
        public void onEvent(String str) {
            C721850STf.LIZLLL(this.LIZ, str, null, null, 6);
        }

        @Override // X.InterfaceC20685415wy
        public final void LIZ(String str, Map<String, String> map) {
            C721850STf.LIZLLL(this.LIZ, str, map, null, 4);
        }

        @Override // X.InterfaceC20685415wy
        public final void onEvent(String str, JSONObject jSONObject) {
            C721850STf.LIZLLL(this.LIZ, str, null, jSONObject, 2);
        }
    };

    @Override // X.InterfaceC724530SbT, X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC736810SvH getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final InterfaceC725050ScJ<C03H5> getActualReceiverHolder() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final LifecycleOwner getOwnLifecycleOwner() {
        return this;
    }

    @Override // X.InterfaceC725030ScH
    public final C03H5 getReceiverForHostVM() {
        return null;
    }

    @Override // X.InterfaceC725030ScH
    public final boolean getUniqueOnlyDefault() {
        return true;
    }

    @Override // X.InterfaceC698650Rap
    public final void LIZIZ() {
        LIZJ(1003);
        LIZJ(1005);
        LIZJ(1008);
        LIZJ(1010);
        LIZJ(1030);
        LIZJ(1060);
        C20684815ws.LJIJJLI(this.LLILZ);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.0STg] */
    public C721850STf(LifecycleRegistry lifecycleRegistry) {
        this.LL = lifecycleRegistry;
    }

    @Override // X.InterfaceC698650Rap
    public final void LIZ(Function0<String> function0) {
        this.LLILLL = function0;
        C20684815ws.LIZ(this.LLILZ);
    }

    public final void LIZJ(int i) {
        if (((Handler) this.LLILLJJLI.getValue()).hasMessages(i)) {
            ((Handler) this.LLILLJJLI.getValue()).removeMessages(i);
        }
    }

    public static void LJ(String str, C1864107Rv c1864107Rv) {
        LJI(str, C0RY8.LIZ((String) c1864107Rv.invoke("group_id")));
    }

    public static void LJI(String str, Map map) {
        C1440005kM.LIZ(new C2038007yc("fallback", Collections.singletonList(str), map));
    }

    public final void LJII(int i, long j, String str) {
        LIZJ(i);
        C786410Ut5.LJLJLJ((Handler) this.LLILLJJLI.getValue(), ((Handler) this.LLILLJJLI.getValue()).obtainMessage(i, str), j);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void LIZLLL(C721850STf c721850STf, String str, Map map, JSONObject jSONObject, int i) {
        String strInvoke;
        IEcommerceAnchorOuterService iEcommerceAnchorOuterService;
        Function0<String> function0;
        if ((i & 2) != 0) {
            map = null;
        }
        if ((i & 4) != 0) {
            jSONObject = null;
        }
        c721850STf.getClass();
        C1864107Rv c1864107Rv = new C1864107Rv(jSONObject, map);
        if (str == null) {
            return;
        }
        switch (str.hashCode()) {
            case -1947331341:
                if (!str.equals("stay_time")) {
                    return;
                }
                break;
            case -1617968008:
                if (!str.equals("video_play")) {
                    return;
                }
                break;
            case -1330248535:
                if (!str.equals("click_comment_button")) {
                    return;
                }
                LJ("click_comment", c1864107Rv);
                return;
            case -1115125979:
                if (!str.equals("click_more_button")) {
                    return;
                }
                LJ("click_share", c1864107Rv);
                return;
            case -1054981254:
                if (!str.equals("tiktokec_sv_back_to_video")) {
                    return;
                }
                String strInvoke2 = (String) c1864107Rv.invoke("aweme_id");
                if ((strInvoke2 == null && ((function0 = c721850STf.LLILLL) == null || (strInvoke2 = function0.invoke()) == null)) || (iEcommerceAnchorOuterService = (IEcommerceAnchorOuterService) PluggableExtentionKt.pluggableSpi$default(IEcommerceAnchorOuterService.class, false, false, false, 14, null)) == null || !iEcommerceAnchorOuterService.LIZLLL(jSONObject, strInvoke2, map)) {
                    return;
                }
                LJI("ec_back_to_video", C0RY8.LIZ(strInvoke2));
                return;
            case -405326491:
                if (!str.equals("favourite_video")) {
                    return;
                }
                LJ("click_favorite", c1864107Rv);
                return;
            case -17674694:
                if (!str.equals("video_play_finish")) {
                    return;
                }
                LJ("video_play_finish", c1864107Rv);
                return;
            case 3321751:
                if (!str.equals("like")) {
                    return;
                }
                LJ("like_click", c1864107Rv);
                return;
            case 646182113:
                if (!str.equals("follow_finish")) {
                    return;
                }
                LJ("fyp_follow_finish", c1864107Rv);
                LJ("follow_finish", c1864107Rv);
                return;
            default:
                return;
        }
        Function0<String> function02 = c721850STf.LLILLL;
        if (function02 == null || (strInvoke = function02.invoke()) == null) {
            return;
        }
        if (Intrinsics.LJFF(str, "video_play")) {
            Object objInvoke = c1864107Rv.invoke("group_id");
            if (objInvoke == null) {
                return;
            }
            if (Intrinsics.LJFF(strInvoke, objInvoke)) {
                c721850STf.LJII(1003, 3000L, strInvoke);
                c721850STf.LJII(1005, Mp4ScreenVideoLoadTimeout.CONTROL, strInvoke);
                c721850STf.LJII(1008, 8000L, strInvoke);
                c721850STf.LJII(1010, 10000L, strInvoke);
                c721850STf.LJII(1030, 30000L, strInvoke);
                c721850STf.LJII(1060, 60000L, strInvoke);
                return;
            }
            c721850STf.LIZJ(1003);
            c721850STf.LIZJ(1005);
            c721850STf.LIZJ(1008);
            c721850STf.LIZJ(1010);
            c721850STf.LIZJ(1030);
            c721850STf.LIZJ(1060);
            return;
        }
        if (!Intrinsics.LJFF(str, "stay_time")) {
            return;
        }
        c721850STf.LIZJ(1003);
        c721850STf.LIZJ(1005);
        c721850STf.LIZJ(1008);
        c721850STf.LIZJ(1010);
        c721850STf.LIZJ(1030);
        c721850STf.LIZJ(1060);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJ(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A> C0ZP4 selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super A, Unit> function2) {
        return C736680Sv4.LJIILJJIL(this, assemViewModel, interfaceC2217241BqE, c1770850wBP, function1, function2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super C03H5, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C736680Sv4.LIZLLL(assemViewModel, this, c1770850wBP, function1, interfaceC1631620sYq, interfaceC2217241BqE, interfaceC2217241BqE2);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super C03H5, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C736680Sv4.LJFF(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1770850wBP, function1, interfaceC1631630sYr);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super C03H5, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C736680Sv4.LJI(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1770850wBP, function1, interfaceC1685420txc);
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o, A, B, C, D, E> C0ZP4 selectSubscribe(AssemViewModel<S> assemViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1685430txd<? super C03H5, ? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685430txd) {
        return C736680Sv4.LJII(this, assemViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, c1770850wBP, function1, interfaceC1685430txd);
    }
}
