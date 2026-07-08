package X;

import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker;
import com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicRtcDispatcher;
import com.bytedance.android.livesdk.livesetting.linkmic.CoHostSeiTalkSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCrossLinkerDestroyRaceFixSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSdkEnableMuteLocalVideoImpl;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Ccl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234371Ccl implements InterfaceC966930bGl {
    public final LinkMicCrossLinker LIZ;
    public final boolean LIZIZ;
    public volatile boolean LIZJ;
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final AtomicReference<Function0<Unit>> LJFF = new AtomicReference<>(new C2234511Ccz(this));

    @Override // X.InterfaceC968620bJU
    public final void LJJIFFI(boolean z) {
    }

    @Override // X.InterfaceC966930bGl
    public final C967830bID LJJL() {
        return null;
    }

    public static final Throwable LJIIJJI() {
        if (C1304630k3R.LIZIZ && C1304650k3T.LIZ) {
            return new Throwable();
        }
        return null;
    }

    @Override // X.InterfaceC966930bGl
    public final void LIZ() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235261CeC(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJII() {
        /*
            r4 = this;
            X.1Ccq r2 = X.C2234421Ccq.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJII():java.util.List");
    }

    public final boolean LJIIL() {
        if (!this.LIZJ) {
            if (!LinkMicCrossLinkerDestroyRaceFixSetting.INSTANCE.isEnable()) {
                return false;
            }
            if (!this.LIZLLL.get() && !this.LJ.get()) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJIL() {
        /*
            r4 = this;
            X.1Ccp r2 = X.C2234411Ccp.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJIL():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJIJIIJI() {
        /*
            r4 = this;
            X.1Cct r2 = X.C2234451Cct.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJIJIIJI():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJIJLIJ() {
        /*
            r4 = this;
            X.1Ccr r2 = X.C2234431Ccr.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJIJLIJ():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJ() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235291CeF(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJJI() {
        /*
            r4 = this;
            X.1Ccv r2 = X.C2234471Ccv.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJJI():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJJJ() {
        /*
            r4 = this;
            X.1Ccu r2 = X.C2234461Ccu.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJJJ():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJ() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235231Ce9(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJJJLI() {
        /*
            r4 = this;
            X.1Ccs r2 = X.C2234441Ccs.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJJJLI():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLIIL() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234121CcM(this)));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJJLIIIIJ() {
        /*
            r4 = this;
            X.1Ccx r2 = X.C2234491Ccx.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJJLIIIIJ():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIJ() {
        CoHostSeiTalkSetting coHostSeiTalkSetting = CoHostSeiTalkSetting.INSTANCE;
        if (coHostSeiTalkSetting.enable()) {
            C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234321Ccg(this, coHostSeiTalkSetting.getInterval(), coHostSeiTalkSetting.getMinAudioVolume())));
        }
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJJLIL() {
        return this.LIZ.LLJL();
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJLI() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234131CcN(this)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLI() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235241CeA(this)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLIIIL() {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235301CeG(this)));
    }

    @Override // X.InterfaceC966930bGl
    public final LinkMicRtcDispatcher LJLIIL() {
        return this.LIZ.LJL();
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968980bK4> LJLIL() {
        List listInvoke = C13BV.INSTANCE;
        C2234351Ccj c2234351Ccj = new C2234351Ccj(this);
        Throwable thLJIIJJI = LJIIJJI();
        if (LJIIL()) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234351Ccj.invoke(this.LIZ);
        }
        return listInvoke;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJLJL() {
        /*
            r4 = this;
            X.1Ccy r2 = X.C2234501Ccy.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJLJL():java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LJLLJ() {
        /*
            r4 = this;
            X.1Ccw r2 = X.C2234481Ccw.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJLLJ():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final void LL() {
        LIZIZ("leaveChannel");
    }

    @Override // X.InterfaceC966930bGl
    public final String LLF() {
        return this.LIZ.LJLIIIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C967180bHA> LLFF() {
        /*
            r4 = this;
            X.1Cck r2 = X.C2234361Cck.LL
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1c
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L12:
            if (r1 != 0) goto L30
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicLinkUser>"
            r1.<init>(r0)
            throw r1
        L1c:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L28
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L12
        L28:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L45
            java.lang.String r1 = ""
        L30:
            java.util.List r1 = (java.util.List) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L3e
            X.C1304630k3R.LIZIZ(r3)
        L3b:
            java.util.List r1 = (java.util.List) r1
            return r1
        L3e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3b
        L45:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L4e
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L12
        L4e:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L57
            X.13BV r1 = X.C13BV.INSTANCE
            goto L12
        L57:
            java.lang.Class<java.util.List> r1 = java.util.List.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L60
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L12
        L60:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LLFF():java.util.List");
    }

    @Override // X.InterfaceC966930bGl
    public final List<C968340bJ2> LJJJJZI() {
        Throwable thLJIIJJI = LJIIJJI();
        List listInvoke = C13BV.INSTANCE;
        C2234551Cd3 c2234551Cd3 = new C2234551Cd3();
        if (LJIIL()) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            listInvoke = c2234551Cd3.invoke(this.LIZ);
        }
        return listInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final int LJJLIIIJILLIZJL() {
        return LJJLIIIIJ().size();
    }

    @Override // X.InterfaceC966930bGl
    public final void LIZIZ(String str) {
        if (LJIIL()) {
            return;
        }
        C931800aM6.LIZ.getClass();
        if (!C931800aM6.LIZIZ() && this.LJFF.get() == null) {
            return;
        }
        C965900bF6.LIZ(new C2234531Cd1(this, str));
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJ(String str) {
        return this.LIZ.LLIIZ(str);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJFF(String str) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235281CeE(this, str)));
    }

    @Override // X.InterfaceC966930bGl
    public final boolean LJI(String str) {
        Object objInvoke = Boolean.FALSE;
        C2234331Cch c2234331Cch = new C2234331Cch(str);
        Throwable thLJIIJJI = LJIIJJI();
        if (LJIIL()) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234331Cch.invoke(this.LIZ);
        }
        return ((Boolean) objInvoke).booleanValue();
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIZILJ(Map<String, C968380bJ6> map) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234091CcJ(this, map)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJIZL(C2227521CGg c2227521CGg) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234111CcL(this, c2227521CGg)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLZIJ(boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234171CcR(this, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final C967180bHA LJJLL(String str) {
        Object objInvoke;
        C2234631CdB c2234631CdB = new C2234631CdB(str);
        Throwable thLJIIJJI = LJIIJJI();
        if (LJIIL()) {
            C1304630k3R.LIZIZ(thLJIIJJI);
            objInvoke = null;
        } else {
            objInvoke = c2234631CdB.invoke(this.LIZ);
        }
        return (C967180bHA) objInvoke;
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLILLLLZI(boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235031Cdp(this, z)));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLJJI(X.InterfaceC2235471CeX r5) {
        /*
            r4 = this;
            X.1Ccn r2 = new X.1Ccn
            r2.<init>(r5, r4)
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1f
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L15:
            if (r0 != 0) goto L54
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Unit"
            r1.<init>(r0)
            throw r1
        L1f:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L2b
            r0 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L15
        L2b:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 == r0) goto L54
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L3a
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L15
        L3a:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L43
            X.13BV r0 = X.C13BV.INSTANCE
            goto L15
        L43:
            java.lang.Class<kotlin.Unit> r1 = kotlin.Unit.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L4c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L15
        L4c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        L54:
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L5e
            X.C1304630k3R.LIZIZ(r3)
            return
        L5e:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            r2.invoke(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJLJJI(X.1CeX):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Long LJLJJL(long r5) {
        /*
            r4 = this;
            X.1Cd5 r2 = new X.1Cd5
            r2.<init>(r5)
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1f
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L15:
            if (r1 != 0) goto L33
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Long"
            r1.<init>(r0)
            throw r1
        L1f:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L2b
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L15
        L2b:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L48
            java.lang.String r1 = ""
        L33:
            java.lang.Long r1 = (java.lang.Long) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L41
            X.C1304630k3R.LIZIZ(r3)
        L3e:
            java.lang.Long r1 = (java.lang.Long) r1
            return r1
        L41:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3e
        L48:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L51
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L15
        L51:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L5a
            X.13BV r1 = X.C13BV.INSTANCE
            goto L15
        L5a:
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L63
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L15
        L63:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJLJJL(long):java.lang.Long");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    @Override // X.InterfaceC966930bGl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJZ(java.lang.String r5) {
        /*
            r4 = this;
            X.1Cd0 r2 = new X.1Cd0
            r2.<init>(r5)
            java.lang.Throwable r3 = LJIIJJI()
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r1 != r0) goto L1f
            r0 = 0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L15:
            if (r1 != 0) goto L33
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Int"
            r1.<init>(r0)
            throw r1
        L1f:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r1 != r0) goto L2b
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            goto L15
        L2b:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r1 != r0) goto L4c
            java.lang.String r1 = ""
        L33:
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r0 = r4.LJIIL()
            if (r0 == 0) goto L45
            X.C1304630k3R.LIZIZ(r3)
        L3e:
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            return r0
        L45:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r4.LIZ
            java.lang.Object r1 = r2.invoke(r0)
            goto L3e
        L4c:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r1 != r0) goto L55
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            goto L15
        L55:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r1 != r0) goto L5e
            X.13BV r1 = X.C13BV.INSTANCE
            goto L15
        L5e:
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            java.lang.Class<kotlin.Unit> r0 = kotlin.Unit.class
            if (r1 != r0) goto L67
            kotlin.Unit r1 = kotlin.Unit.LIZ
            goto L15
        L67:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Unsupported return type when linker destroyed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJZ(java.lang.String):int");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZL(List<C967180bHA> list) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234221CcW(this, list)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLD(String str) {
        if (LJIIL()) {
            return;
        }
        C965900bF6.LIZ(new C2234381Ccm(false, this, LJIIJJI(), new C2235021Cdo(this, str)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFZ(boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235271CeD(this, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final int LLI(String str) {
        C968980bK4 next;
        Long lValueOf;
        Iterator<C968980bK4> it2 = LJLIL().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!Intrinsics.LJFF(next.LIZIZ, str));
        C968980bK4 c968980bK4 = next;
        if (c968980bK4 != null && (lValueOf = Long.valueOf(c968980bK4.LIZ)) != null) {
            return (int) lValueOf.longValue();
        }
        Object objInvoke = -1;
        C2234541Cd2 c2234541Cd2 = new C2234541Cd2(this, str);
        Throwable thLJIIJJI = LJIIJJI();
        if (LJIIL()) {
            C1304630k3R.LIZIZ(thLJIIJJI);
        } else {
            objInvoke = c2234541Cd2.invoke(this.LIZ);
        }
        return ((Number) objInvoke).intValue();
    }

    @Override // X.InterfaceC966930bGl
    public final void changeOnlineUserState(int i) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235251CeB(this, i)));
    }

    public C2234371Ccl(LinkMicCrossLinker linkMicCrossLinker, boolean z) {
        this.LIZ = linkMicCrossLinker;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZJ(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234621CdA(this, c968750bJh, c966240bFe)));
    }

    @Override // X.InterfaceC967010bGt
    public final void LIZLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234831CdV(this, c969130bKJ, c966240bFe)));
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIIIZZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234601Cd8(this, c2231451CVj, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIIIZ(int i, String str) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234101CcK(i, this, str)));
    }

    @Override // X.InterfaceC967010bGt
    public final void LJIIJ(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234611Cd9(this, c920810a4N, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJI(String str, boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235311CeH(this, str, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIIZ(String str, boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234151CcP(this, str, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJIJL(long j, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteRemoteChannelAudioStreamsWithChannelId: ");
        sbLIZ.append(j);
        sbLIZ.append(' ');
        sbLIZ.append(z);
        sbLIZ.append(' ');
        sbLIZ.append("business_mute_remote_host");
        C20441214yg.LIZIZ("CrossLinker", C2188811AlT.LIZIZ(sbLIZ));
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234341Cci(this, j, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJI(C2234021CcC c2234021CcC, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234961Cdi(this, c2234021CcC, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJJL(boolean z, String str) {
        if (!LinkMicSdkEnableMuteLocalVideoImpl.INSTANCE.getValue()) {
            return;
        }
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235221Ce8(this, str, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJL(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234981Cdk(this, c2235631Cen, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJLL(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(false, this, LJIIJJI(), new C2235201Ce6(c969440bKo, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJJZ(C968530bJL c968530bJL, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2235001Cdm(this, c968530bJL, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJLL(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234931Cdf(this, c2234011CcB, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJJZ(C2231451CVj c2231451CVj, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234891Cdb(this, c2231451CVj, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLI(C2235631Cen c2235631Cen, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234851CdX(this, c2235631Cen, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJ(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234881Cda(this, c2235641Ceo, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJIZ(C2234001CcA c2234001CcA, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234591Cd7(this, c2234001CcA, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJL(C969290bKZ c969290bKZ, String str) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234281Ccc(this, c969290bKZ, str)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLJLI(C2234011CcB c2234011CcB, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234951Cdh(this, c2234011CcB, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLJ(C969440bKo c969440bKo, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(false, this, LJIIJJI(), new C2235211Ce7(c969440bKo, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZ(C969140bKK c969140bKK, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234911Cdd(this, c969140bKK, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZI(C972290bPP c972290bPP, InterfaceC968200bIo interfaceC968200bIo) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234251CcZ(this, c972290bPP, interfaceC968200bIo)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJZZIII(C920810a4N c920810a4N, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234971Cdj(this, c920810a4N, c966240bFe)));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0033
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // X.InterfaceC966930bGl
    public final void LJL(java.lang.String r6, boolean r7) {
        /*
            r5 = this;
            if (r7 == 0) goto L18
            boolean r0 = r5.LIZJ
            r4 = 1
            r1 = 0
            if (r0 != 0) goto L18
            com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCrossLinkerDestroyRaceFixSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkMicCrossLinkerDestroyRaceFixSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L19
            java.util.concurrent.atomic.AtomicBoolean r0 = r5.LJ
            boolean r0 = r0.compareAndSet(r1, r4)
            if (r0 != 0) goto L19
        L18:
            return
        L19:
            com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutLeakFixSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.LinkmicLayoutLeakFixSetting.INSTANCE
            boolean r0 = r0.getValue()
            if (r0 == 0) goto L3b
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r3 = r5.LIZ
            r2 = 0
            r3.LJJLIIIJL()     // Catch: java.lang.Throwable -> L2b
            X.C1306420k6K.LIZ(r3, r2)
            goto L40
        L2b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L33
            throw r1     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            r2 = r1
            goto L34
        L33:
            r0 = move-exception
        L34:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            X.C1306420k6K.LIZ(r3, r2)
            throw r0
        L3b:
            com.bytedance.android.livesdk.comp.linkcore.link_mic_sdk_android.LinkMicCrossLinker r0 = r5.LIZ
            r0.LJJLIIIJL()
        L40:
            r5.LIZJ = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2234371Ccl.LJL(java.lang.String, boolean):void");
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJI(C969290bKZ c969290bKZ, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234841CdW(this, c969290bKZ, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJJLL(C968750bJh c968750bJh, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234581Cd6(this, c968750bJh, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLJLJ(List<C2183391Acj> list, C1AZR c1azr) {
        if (LJIIL()) {
            return null;
        }
        return this.LIZ.LJJZ(list, c1azr);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLJLLL(C969130bKJ c969130bKJ, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234871CdZ(this, c969130bKJ, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLI(C2235641Ceo c2235641Ceo, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234921Cde(this, c2235641Ceo, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final C1AZI LJLLILLLL(List<C2183391Acj> list, C1AZQ c1azq) {
        C1304630k3R.LJFF();
        return this.LIZ.LJJLL(list, c1azq);
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLL(C2227521CGg c2227521CGg, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234861CdY(this, c2227521CGg, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLL(C1CKR c1ckr, InterfaceC968200bIo interfaceC968200bIo) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234641CdC(this, c1ckr, interfaceC968200bIo)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLLLLLL(C969280bKY c969280bKY, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234991Cdl(this, c969280bKY, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLZ(C968370bJ5 c968370bJ5, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234901Cdc(this, c968370bJ5, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJZI(InterfaceC967450bHb interfaceC967450bHb, List list) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234561Cd4(this, list, interfaceC967450bHb)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFFF(C968590bJR c968590bJR, C966240bFe c966240bFe) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234941Cdg(this, c968590bJR, c966240bFe)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LLFII(C969130bKJ c969130bKJ, String str) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234311Ccf(this, c969130bKJ, str)));
    }

    @Override // X.InterfaceC966930bGl
    public final void muteRemoteAudioStream(String str, boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234161CcQ(this, str, z)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJIJ(int i, String str, String str2) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234081CcI(i, this, str, str2)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJLLLLLLLZ(long j, int i, EnumC2233251Cax enumC2233251Cax) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234231CcX(this, j, i, enumC2233251Cax)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJLL(int i, String str, boolean z) {
        C965900bF6.LIZ(new C2234381Ccm(true, this, LJIIJJI(), new C2234211CcV(i, z, str)));
    }

    @Override // X.InterfaceC966930bGl
    public final void LJJLIIIJJI(boolean z, boolean z2, String str, EnumC965730bEp enumC965730bEp, boolean z3) {
        long j;
        if (LinkMicCrossLinkerDestroyRaceFixSetting.INSTANCE.isEnable() && (this.LJ.get() || this.LIZJ || !this.LIZLLL.compareAndSet(false, true))) {
            return;
        }
        if (z3) {
            if (this.LIZIZ) {
                LinkMicCrossLinker linkMicCrossLinker = this.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(hashCode());
                sbLIZ.append('_');
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                if (Intrinsics.LJFF(str, "rtc_error")) {
                    j = 10011;
                } else {
                    j = 0;
                }
                linkMicCrossLinker.LJJLIL(new C2234021CcC(strLIZIZ, C1282000jSw.LIZ(j), enumC965730bEp.getLinkArchType()), new C1CMK(new C2235451CeV()));
                return;
            }
            if (!z) {
                return;
            }
            LinkMicCrossLinker linkMicCrossLinker2 = this.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(hashCode());
            sbLIZ2.append('_');
            sbLIZ2.append(str);
            linkMicCrossLinker2.LLILLL(new C1CKR(C2188811AlT.LIZIZ(sbLIZ2), C1282000jSw.LIZIZ(10014), null), new C1CMK(new C2235461CeW()));
            return;
        }
        Function0<Unit> andSet = this.LJFF.getAndSet(null);
        if (andSet == null) {
            return;
        }
        C965900bF6.LIZ(new C2234061CcG(z2, this, andSet, str));
    }
}
