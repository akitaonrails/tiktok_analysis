package X;

import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.touchpoint.api.model.TextLink;
import com.bytedance.touchpoint.data.parser.notify.TextLinkViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zY0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900180zY0 implements InterfaceC1217270hmX, InterfaceC724530SbT, InterfaceC1895290zQ7 {
    public static final C1900180zY0 LL = new C1900180zY0();
    public static final C736950SvV LLILLJJLI;
    public static TextLink LLILLL;

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

    static {
        LifecycleOwner lifecycleOwner = C0J3E.LL;
        LLILLJJLI = new C736950SvV(C13LE.LIZ(TextLinkViewModel.class), null, new C452070Ho5(), C724750Sbp.LJII(lifecycleOwner), C1220000hqw.LIZ(lifecycleOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) lifecycleOwner : null), new C1895160zPu(), null, null, null);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return C0J3E.LL.getLifecycleRegistry();
    }

    public static boolean LIZJ(TextLink textLink) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4 = null;
        if (textLink != null) {
            num = textLink.showTimes;
            num2 = textLink.dismissAfter;
        } else {
            num = null;
            num2 = null;
        }
        if (textLink != null) {
            num3 = textLink.LIZJ;
        } else {
            num3 = null;
        }
        C1900200zY2 c1900200zY2LIZ = C1900210zY3.LIZ(num3);
        if (num != null && C1900210zY3.LIZIZ().getInt(C1894310zOX.LIZ(c1900200zY2LIZ.LIZIZ), 0) >= num.intValue()) {
            return false;
        }
        if (textLink != null) {
            num4 = textLink.LIZJ;
        }
        C1900200zY2 c1900200zY2LIZ2 = C1900210zY3.LIZ(num4);
        if (num2 == null || C1900210zY3.LIZIZ().getInt(C1894310zOX.LIZ(c1900200zY2LIZ2.LIZJ), 0) < num2.intValue()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1895290zQ7
    public final void LJIIIIZZ(EnumC1895270zQ5 enumC1895270zQ5) {
        LLILLJJLI.getValue().setState(new AwS607S0100000_28(enumC1895270zQ5, 270));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d A[Catch: Exception -> 0x00db, PHI: r1
      0x002d: PHI (r1v8 java.util.Set) = (r1v1 java.util.Set), (r1v9 java.util.Set) binds: [B:13:0x002b, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00db, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x0022, B:14:0x002d, B:16:0x0031, B:17:0x0036, B:20:0x0042, B:22:0x0048, B:24:0x004e, B:26:0x0054, B:33:0x0069, B:36:0x0073, B:37:0x0077, B:39:0x007d, B:41:0x0089, B:43:0x008f, B:49:0x00a2, B:52:0x00ac, B:53:0x00b5, B:59:0x00c4, B:56:0x00bc, B:29:0x005c, B:12:0x0026, B:64:0x00d3, B:65:0x00d5), top: B:72:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[Catch: Exception -> 0x00db, PHI: r1
      0x0031: PHI (r1v7 java.util.Set) = (r1v1 java.util.Set), (r1v8 java.util.Set) binds: [B:13:0x002b, B:15:0x002f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00db, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0013, B:8:0x0019, B:10:0x0022, B:14:0x002d, B:16:0x0031, B:17:0x0036, B:20:0x0042, B:22:0x0048, B:24:0x004e, B:26:0x0054, B:33:0x0069, B:36:0x0073, B:37:0x0077, B:39:0x007d, B:41:0x0089, B:43:0x008f, B:49:0x00a2, B:52:0x00ac, B:53:0x00b5, B:59:0x00c4, B:56:0x00bc, B:29:0x005c, B:12:0x0026, B:64:0x00d3, B:65:0x00d5), top: B:72:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0077 A[SYNTHETIC] */
    @Override // X.InterfaceC1217270hmX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r13, java.lang.String r14, java.util.HashMap r15, java.util.List r16) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1900180zY0.LIZ(java.lang.String, java.lang.String, java.util.HashMap, java.util.List):boolean");
    }

    @Override // X.InterfaceC725030ScH
    public final <S extends InterfaceC0148002o> C0ZP4 subscribe(AssemViewModel<S> assemViewModel, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, Function2<? super C03H5, ? super S, Unit> function2) {
        return C736680Sv4.LJIILLIIL(this, assemViewModel, c1770850wBP, function1, function2);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x009d A[Catch: Exception -> 0x0115, PHI: r1
      0x009d: PHI (r1v13 java.lang.String) = (r1v6 java.lang.String), (r1v14 java.lang.String) binds: [B:37:0x0096, B:40:0x009b] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0016, B:8:0x001b, B:10:0x001f, B:11:0x0024, B:13:0x0030, B:17:0x0039, B:19:0x0041, B:20:0x0048, B:22:0x004e, B:26:0x005d, B:32:0x008d, B:41:0x009d, B:46:0x00a6, B:49:0x00c5, B:50:0x00d4, B:52:0x00de, B:53:0x00f7, B:44:0x00a2, B:36:0x0094), top: B:58:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c1 A[PHI: r0 r1
      0x00c1: PHI (r0v29 java.lang.String) = (r0v13 java.lang.String), (r0v30 java.lang.String) binds: [B:45:0x00a4, B:42:0x009f] A[DONT_GENERATE, DONT_INLINE]
      0x00c1: PHI (r1v12 java.lang.String) = (r1v7 java.lang.String), (r1v13 java.lang.String) binds: [B:45:0x00a4, B:42:0x009f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c5 A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0016, B:8:0x001b, B:10:0x001f, B:11:0x0024, B:13:0x0030, B:17:0x0039, B:19:0x0041, B:20:0x0048, B:22:0x004e, B:26:0x005d, B:32:0x008d, B:41:0x009d, B:46:0x00a6, B:49:0x00c5, B:50:0x00d4, B:52:0x00de, B:53:0x00f7, B:44:0x00a2, B:36:0x0094), top: B:58:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00de A[Catch: Exception -> 0x0115, TryCatch #0 {Exception -> 0x0115, blocks: (B:3:0x0002, B:5:0x0006, B:7:0x0016, B:8:0x001b, B:10:0x001f, B:11:0x0024, B:13:0x0030, B:17:0x0039, B:19:0x0041, B:20:0x0048, B:22:0x004e, B:26:0x005d, B:32:0x008d, B:41:0x009d, B:46:0x00a6, B:49:0x00c5, B:50:0x00d4, B:52:0x00de, B:53:0x00f7, B:44:0x00a2, B:36:0x0094), top: B:58:0x0002 }] */
    @Override // X.InterfaceC1217270hmX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(final android.content.Context r16, final java.lang.String r17, java.util.List<java.lang.String> r18, kotlin.jvm.functions.Function1<? super android.view.View.OnClickListener, kotlin.Unit> r19, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1900180zY0.LIZIZ(android.content.Context, java.lang.String, java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2):void");
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
