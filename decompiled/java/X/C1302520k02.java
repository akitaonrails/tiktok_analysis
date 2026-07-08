package X;

import android.os.Bundle;
import android.os.OutcomeReceiver;
import android.os.ParcelUuid;
import android.telecom.CallControl;
import android.telecom.CallControlCallback;
import android.telecom.CallEndpoint;
import android.telecom.CallEventCallback;
import android.telecom.DisconnectCause;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0k02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302520k02 implements CallControlCallback, CallEventCallback, AutoCloseable {
    public static final String LLJJIJIL = C1302520k02.class.getSimpleName();
    public final CoroutineContext LL;
    public final C1302880k0c LLILLJJLI;
    public final Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LLILLL;
    public final Function2<DisconnectCause, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZIL;
    public final Function1<InterfaceC1364105Vn<? super Unit>, Object> LLILZLL;
    public final C1302920k0g LLIZ;
    public final C05YC<EnumC1302210jzX> LLIZLLLIL;
    public final InterfaceC1631620sYq<String, Bundle, InterfaceC1364105Vn<? super Unit>, Object> LLJ;
    public final C05XL<Unit> LLJI;
    public final int LLJIJIL;
    public CallControl LLJILJIL;
    public C1302410jzr LLJILJILJ;
    public List<C1302410jzr> LLJILLL;
    public C1302410jzr LLJJ;
    public final C099F LLJJI;
    public final C099F LLJJIII;
    public final boolean LLJJIJI;
    public final HashMap<ParcelUuid, CallEndpoint> LLJJIJIIJIL;

    @Override // java.lang.AutoCloseable
    public final void close() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("close: CallSessionId=[");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        C1302440jzu c1302440jzu = C1302440jzu.LIZ;
        int i = this.LLJIJIL;
        c1302440jzu.getClass();
        C1302440jzu.LIZ(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C1302650k0F
            if (r0 == 0) goto L20
            r5 = r7
            X.0k0F r5 = (X.C1302650k0F) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L32
            if (r0 != r3) goto L2a
            goto L26
        L20:
            X.0k0F r5 = new X.0k0F
            r5.<init>(r6, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L55
            goto L6d
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0k0c r0 = r6.LLILLJJLI
            int r1 = r0.LIZLLL
            r0 = 2
            if (r1 != r0) goto L42
            r0 = 1
        L3d:
            if (r0 != 0) goto L44
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L42:
            r0 = 0
            goto L3d
        L44:
            X.0k06 r2 = new X.0k06     // Catch: java.lang.Exception -> L55
            r0 = 0
            r2.<init>(r6, r0)     // Catch: java.lang.Exception -> L55
            r5.LLILLL = r3     // Catch: java.lang.Exception -> L55
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.C099A.LIZIZ(r0, r2, r5)     // Catch: java.lang.Exception -> L55
            if (r0 != r4) goto L6d
            return r4
        L55:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "maybeSwitchToSpeaker: hit exception=["
            r1.append(r0)
            r1.append(r2)
            r0 = 93
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L6d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1302630k0D
            if (r0 == 0) goto L51
            r6 = r8
            X.0k0D r6 = (X.C1302630k0D) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L57
            X.0k02 r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0jzm r2 = (X.AbstractC1302360jzm) r2
            X.0jzX r0 = X.EnumC1302210jzX.ACTIVE
            r1.LJI(r2, r0)
            return r2
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.099F r3 = X.C090F.LIZIZ()
            android.telecom.CallControl r2 = r7.LLJILJIL
            if (r2 == 0) goto L44
            X.0k0H r1 = new X.0k0H
            r1.<init>()
            X.0k0G r0 = new X.0k0G
            r0.<init>(r3)
            r2.setActive(r1, r0)
        L44:
            r6.LL = r7
            r6.LLILZ = r4
            java.lang.Object r2 = r3.LJLIIIL(r6)
            if (r2 != r5) goto L4f
            return r5
        L4f:
            r1 = r7
            goto L24
        L51:
            X.0k0D r6 = new X.0k0D
            r6.<init>(r7, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LJIILL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C1302640k0E
            if (r0 == 0) goto L51
            r6 = r8
            X.0k0E r6 = (X.C1302640k0E) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L57
            X.0k02 r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0jzm r2 = (X.AbstractC1302360jzm) r2
            X.0jzX r0 = X.EnumC1302210jzX.INACTIVE
            r1.LJI(r2, r0)
            return r2
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.099F r3 = X.C090F.LIZIZ()
            android.telecom.CallControl r2 = r7.LLJILJIL
            if (r2 == 0) goto L44
            X.0k0H r1 = new X.0k0H
            r1.<init>()
            X.0k0G r0 = new X.0k0G
            r0.<init>(r3)
            r2.setInactive(r1, r0)
        L44:
            r6.LL = r7
            r6.LLILZ = r4
            java.lang.Object r2 = r3.LJLIIIL(r6)
            if (r2 != r5) goto L4f
            return r5
        L4f:
            r1 = r7
            goto L24
        L51:
            X.0k0E r6 = new X.0k0E
            r6.<init>(r7, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LJIILLIIL(X.05Vn):java.lang.Object");
    }

    public final C1302410jzr LJIJJ(CallEndpoint callEndpoint) {
        C1302440jzu c1302440jzu = C1302440jzu.LIZ;
        int i = this.LLJIJIL;
        int endpointType = callEndpoint.getEndpointType();
        String string = callEndpoint.getEndpointName().toString();
        c1302440jzu.getClass();
        ParcelUuid parcelUuidLIZIZ = C1302440jzu.LIZIZ(i, endpointType, string);
        this.LLJJIJIIJIL.put(parcelUuidLIZIZ, callEndpoint);
        C1302410jzr c1302410jzr = new C1302410jzr(callEndpoint.getEndpointName(), callEndpoint.getEndpointType(), parcelUuidLIZIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" n=[");
        sbLIZ.append((Object) callEndpoint.getEndpointName());
        sbLIZ.append("]  plat=[");
        sbLIZ.append(callEndpoint);
        sbLIZ.append("] --> jet=[");
        sbLIZ.append(c1302410jzr);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        return c1302410jzr;
    }

    @Override // android.telecom.CallEventCallback
    public final void onAvailableCallEndpointsChanged(List<CallEndpoint> list) throws Throwable {
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<CallEndpoint> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJIJJ(it2.next()));
        }
        ArrayList arrayList2 = new ArrayList(C13LP.LJLLJ(arrayList));
        this.LLJILLL = arrayList2;
        C1302460jzw.LJFF(arrayList2);
        C094N.LIZJ(this.LLIZ.LIZIZ.LJIIIIZZ(this.LLJILLL));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAvailableCallEndpointsChanged: endpoints=[");
        sbLIZ.append(list);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJJIII.isCompleted()) {
            this.LLJJIII.LJJLIIIJILLIZJL(Unit.LIZ);
        }
    }

    @Override // android.telecom.CallEventCallback
    public final void onCallEndpointChanged(CallEndpoint callEndpoint) throws Throwable {
        int i;
        C1302410jzr c1302410jzrLIZLLL;
        CallControl callControl;
        C1302410jzr c1302410jzr = this.LLJILJILJ;
        C1302410jzr c1302410jzrLJIJJ = LJIJJ(callEndpoint);
        this.LLJILJILJ = c1302410jzrLJIJJ;
        C094N.LIZJ(this.LLIZ.LIZ.LJIIIIZZ(c1302410jzrLJIJJ));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCallEndpointChanged: endpoint=[");
        sbLIZ.append(callEndpoint);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        if (!this.LLJJI.isCompleted()) {
            this.LLJJI.LJJLIIIJILLIZJL(Unit.LIZ);
        }
        C1302410jzr c1302410jzr2 = this.LLJILJILJ;
        try {
            if (this.LLJJIJI && C1302460jzw.LJ(c1302410jzr2) && c1302410jzr != null && (((i = c1302410jzr.LLILLJJLI) == 2 || i == 3) && !C1302460jzw.LJ(this.LLJJ) && (c1302410jzrLIZLLL = C1302460jzw.LIZLLL(this.LLJILLL)) != null && (callControl = this.LLJILJIL) != null)) {
                callControl.requestCallEndpointChange(C1302420jzs.LIZ(c1302410jzrLIZLLL), new ExecutorC1302670k0H(), new OutcomeReceiver() { // from class: X.0k0I
                    @Override // android.os.OutcomeReceiver
                    public final void onResult(Object obj) {
                    }
                });
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("maybeSwitchToSpeakerOnHeadsetDisconnect: exception=[");
            sbLIZ2.append(e);
            sbLIZ2.append(']');
            C2188811AlT.LIZIZ(sbLIZ2);
        }
        C1302410jzr c1302410jzr3 = this.LLJJ;
        if (c1302410jzr3 != null && c1302410jzr3.LLILLJJLI == callEndpoint.getEndpointType()) {
            this.LLJJ = null;
        }
    }

    @Override // android.telecom.CallEventCallback
    public final void onCallStreamingFailed(int i) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Implement with the CallStreaming code");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.telecom.CallControlCallback
    public final void onCallStreamingStarted(Consumer<Boolean> consumer) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("An operation is not implemented: ");
        sbLIZ.append("Implement with the CallStreaming code");
        throw new C1284660jXE(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.telecom.CallEventCallback
    public final void onMuteStateChanged(boolean z) throws Throwable {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302180jzU(z, this, null), 3);
        C094N.LIZJ(this.LLIZ.LIZJ.LJIIIIZZ(Boolean.valueOf(z)));
    }

    @Override // android.telecom.CallControlCallback
    public final void onSetActive(Consumer<Boolean> consumer) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302550k05(this, consumer, null), 3);
    }

    @Override // android.telecom.CallControlCallback
    public final void onSetInactive(Consumer<Boolean> consumer) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302500k00(this, consumer, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(int r8, X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1302620k0C
            if (r0 == 0) goto L51
            r6 = r9
            X.0k0C r6 = (X.C1302620k0C) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L57
            X.0k02 r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0jzm r2 = (X.AbstractC1302360jzm) r2
            X.0jzX r0 = X.EnumC1302210jzX.ACTIVE
            r1.LJI(r2, r0)
            return r2
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.099F r3 = X.C090F.LIZIZ()
            android.telecom.CallControl r2 = r7.LLJILJIL
            if (r2 == 0) goto L44
            X.0k0H r1 = new X.0k0H
            r1.<init>()
            X.0k0G r0 = new X.0k0G
            r0.<init>(r3)
            r2.answer(r8, r1, r0)
        L44:
            r6.LL = r7
            r6.LLILZ = r4
            java.lang.Object r2 = r3.LJLIIIL(r6)
            if (r2 != r5) goto L4f
            return r5
        L4f:
            r1 = r7
            goto L24
        L51:
            X.0k0C r6 = new X.0k0C
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LIZ(int, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(android.telecom.DisconnectCause r8, X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1302570k07
            if (r0 == 0) goto L51
            r6 = r9
            X.0k07 r6 = (X.C1302570k07) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 != r4) goto L57
            X.0k02 r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0jzm r2 = (X.AbstractC1302360jzm) r2
            X.0jzX r0 = X.EnumC1302210jzX.DISCONNECTED
            r1.LJI(r2, r0)
            return r2
        L2c:
            X.C155000ia.LIZIZ(r2)
            X.099F r3 = X.C090F.LIZIZ()
            android.telecom.CallControl r2 = r7.LLJILJIL
            if (r2 == 0) goto L44
            X.0k0H r1 = new X.0k0H
            r1.<init>()
            X.0k0G r0 = new X.0k0G
            r0.<init>(r3)
            r2.disconnect(r8, r1, r0)
        L44:
            r6.LL = r7
            r6.LLILZ = r4
            java.lang.Object r2 = r3.LJLIIIL(r6)
            if (r2 != r5) goto L4f
            return r5
        L4f:
            r1 = r7
            goto L24
        L51:
            X.0k07 r6 = new X.0k07
            r6.<init>(r7, r9)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LIZIZ(android.telecom.DisconnectCause, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.C1302410jzr r9, X.InterfaceC1364105Vn<? super java.lang.Boolean> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1302580k08
            if (r0 == 0) goto L60
            r4 = r10
            X.0k08 r4 = (X.C1302580k08) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L60
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r7 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZIL
            r2 = 1
            r5 = 2
            r6 = 3
            if (r0 == 0) goto L2d
            if (r0 == r2) goto L6e
            if (r0 == r5) goto L93
            if (r0 != r6) goto L66
            X.C155000ia.LIZIZ(r7)
        L28:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L2d:
            X.C155000ia.LIZIZ(r7)
            java.util.List<X.0jzr> r0 = r8.LLJILLL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r1 = r0.iterator()
        L38:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            X.0jzr r0 = (X.C1302410jzr) r0
            int r0 = r0.LLILLJJLI
            if (r0 != r5) goto L38
            r4.LL = r8
            r4.LLILLJJLI = r9
            r4.LLILZIL = r2
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r0 != r3) goto L76
            return r3
        L57:
            r4.LLILZIL = r6
            java.lang.Object r0 = r8.LJII(r9, r4)
            if (r0 != r3) goto L28
            return r3
        L60:
            X.0k08 r4 = new X.0k08
            r4.<init>(r8, r10)
            goto L12
        L66:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6e:
            X.0jzr r9 = r4.LLILLJJLI
            X.0k02 r1 = r4.LL
            X.C155000ia.LIZIZ(r7)
            goto L77
        L76:
            r1 = r8
        L77:
            X.0jzr r0 = r1.LLJILJILJ
            if (r0 == 0) goto L85
            int r0 = r0.LLILLJJLI
            if (r0 != r5) goto L85
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L85:
            r0 = 0
            r4.LL = r0
            r4.LLILLJJLI = r0
            r4.LLILZIL = r5
            java.lang.Object r0 = r1.LJII(r9, r4)
            if (r0 != r3) goto L96
            return r3
        L93:
            X.C155000ia.LIZIZ(r7)
        L96:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LIZLLL(X.0jzr, X.05Vn):java.lang.Object");
    }

    public final void LJI(AbstractC1302360jzm abstractC1302360jzm, EnumC1302210jzX enumC1302210jzX) {
        if (Intrinsics.LJFF(abstractC1302360jzm, new C1302340jzk())) {
            C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302190jzV(this, enumC1302210jzX, null), 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.C1302410jzr r9, X.InterfaceC1364105Vn<? super X.AbstractC1302360jzm> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1302590k09
            if (r0 == 0) goto L97
            r6 = r10
            X.0k09 r6 = (X.C1302590k09) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L97
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 1
            if (r0 == 0) goto L33
            if (r0 != r5) goto L9e
            X.0k02 r1 = r6.LL
            X.C155000ia.LIZIZ(r2)
        L24:
            X.0jzk r0 = new X.0jzk
            r0.<init>()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 != 0) goto L32
            r0 = 0
            r1.LLJJ = r0
        L32:
            return r2
        L33:
            X.C155000ia.LIZIZ(r2)
            X.099F r4 = X.C090F.LIZIZ()
            r8.LLJJ = r9
            java.util.HashMap<android.os.ParcelUuid, android.telecom.CallEndpoint> r1 = r8.LLJJIJIIJIL
            android.os.ParcelUuid r0 = r9.LLILLL
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L5a
            java.util.HashMap<android.os.ParcelUuid, android.telecom.CallEndpoint> r1 = r8.LLJJIJIIJIL
            android.os.ParcelUuid r0 = r9.LLILLL
            java.lang.Object r3 = r1.get(r0)
            android.telecom.CallEndpoint r3 = (android.telecom.CallEndpoint) r3
        L50:
            android.telecom.CallControl r0 = r8.LLJILJIL
            if (r0 != 0) goto L5f
            X.0jzl r0 = new X.0jzl
            r0.<init>(r5)
            return r0
        L5a:
            android.telecom.CallEndpoint r3 = X.C1302420jzs.LIZ(r9)
            goto L50
        L5f:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "jet=["
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "] --> plat=["
            r1.append(r0)
            r1.append(r3)
            r0 = 93
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
            android.telecom.CallControl r2 = r8.LLJILJIL
            X.0k0H r1 = new X.0k0H
            r1.<init>()
            X.0k0G r0 = new X.0k0G
            r0.<init>(r4)
            r2.requestCallEndpointChange(r3, r1, r0)
            r6.LL = r8
            r6.LLILZ = r5
            java.lang.Object r2 = r4.LJLIIIL(r6)
            if (r2 != r7) goto L95
            return r7
        L95:
            r1 = r8
            goto L24
        L97:
            X.0k09 r6 = new X.0k09
            r6.<init>(r8, r10)
            goto L12
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LJII(X.0jzr, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIZILJ(X.C1302410jzr r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1302610k0B
            if (r0 == 0) goto L20
            r4 = r7
            X.0k0B r4 = (X.C1302610k0B) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r2 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2a
            goto L26
        L20:
            X.0k0B r4 = new X.0k0B
            r4.<init>(r5, r7)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L46
            goto L5e
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r2)
            X.0k03 r2 = new X.0k03     // Catch: java.lang.Exception -> L46
            r0 = 0
            r2.<init>(r5, r6, r0)     // Catch: java.lang.Exception -> L46
            r4.LLILLL = r1     // Catch: java.lang.Exception -> L46
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.C099A.LIZIZ(r0, r2, r4)     // Catch: java.lang.Exception -> L46
            if (r0 != r3) goto L5e
            return r3
        L46:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "switchStartingCallEndpointOnCallStart: hit exception=["
            r1.append(r0)
            r1.append(r2)
            r0 = 93
            r1.append(r0)
            X.C2188811AlT.LIZIZ(r1)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302520k02.LJIIZILJ(X.0jzr, X.05Vn):java.lang.Object");
    }

    @Override // android.telecom.CallControlCallback
    public final void onAnswer(int i, Consumer<Boolean> consumer) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302510k01(this, i, consumer, null), 3);
    }

    @Override // android.telecom.CallControlCallback
    public final void onDisconnect(DisconnectCause disconnectCause, Consumer<Boolean> consumer) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C1302490jzz(this, disconnectCause, consumer, null), 3);
    }

    @Override // android.telecom.CallEventCallback
    public final void onEvent(String str, Bundle bundle) {
        C23250099c.LIZLLL(C2296808zG.LIZ(this.LL), null, null, new C0NRG(this, str, bundle, null), 3);
    }

    public C1302520k02(CoroutineContext coroutineContext, C1302880k0c c1302880k0c, Function2 function2, Function2 function22, Function1 function1, Function1 function12, C1302920k0g c1302920k0g, C2252331DDr c2252331DDr, C324530Cnr c324530Cnr, C099F c099f) {
        boolean z;
        this.LL = coroutineContext;
        this.LLILLJJLI = c1302880k0c;
        this.LLILLL = function2;
        this.LLILZ = function22;
        this.LLILZIL = function1;
        this.LLILZLL = function12;
        this.LLIZ = c1302920k0g;
        this.LLIZLLLIL = c2252331DDr;
        this.LLJ = c324530Cnr;
        this.LLJI = c099f;
        C1302440jzu.LIZ.getClass();
        this.LLJIJIL = C1302440jzu.LIZLLL();
        this.LLJILLL = new ArrayList();
        this.LLJJI = C090F.LIZIZ();
        this.LLJJIII = C090F.LIZIZ();
        if (c1302880k0c.LIZLLL == 2) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJIJI = z;
        this.LLJJIJIIJIL = new HashMap<>();
        C23250099c.LIZLLL(C2296808zG.LIZ(coroutineContext), null, null, new C1302200jzW(this, null), 3);
    }
}
