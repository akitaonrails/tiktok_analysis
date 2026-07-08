package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import kotlin.Unit;

/* JADX INFO: renamed from: X.01yl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$fetchAiBeautyUntilEnd$1$3", f = "LiveSmallItemBeautyViewModel.kt", l = {349}, m = "invokeSuspend")
public final class C510101yl extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510101yl(LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC1364105Vn<? super C510101yl> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILLL = liveSmallItemBeautyViewModel;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            java.lang.String r5 = "LiveSmallItemBeautyViewModel@ff2.fetchAiBeautyUntilEnd$1$3"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r15.LL
            r2 = 1
            if (r0 == 0) goto L23
            if (r0 != r2) goto L82
            X.C155000ia.LIZIZ(r16)
        L13:
            com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel r0 = r15.LLILLL
            X.0956 r1 = r0.LLJJIII
            if (r1 == 0) goto L1d
            r0 = 0
            r1.LIZIZ(r0)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L23:
            X.C155000ia.LIZIZ(r16)
            java.lang.Object r4 = r15.LLILLJJLI
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.String r3 = "AIBeauty#cactch"
            java.lang.String r0 = "exception break"
            X.C20441214yg.LIZIZ(r3, r0)
            boolean r0 = r4 instanceof java.util.concurrent.CancellationException
            if (r0 == 0) goto L13
            java.lang.String r3 = r4.getMessage()
            if (r3 == 0) goto L13
            int r0 = r3.hashCode()
            switch(r0) {
                case -58529607: goto L43;
                case 350711073: goto L4c;
                case 2011110042: goto L55;
                case 2104391859: goto L7c;
                default: goto L42;
            }
        L42:
            goto L13
        L43:
            java.lang.String r0 = "Canceled"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            goto L13
        L4c:
            java.lang.String r0 = "TimeOut"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            goto L13
        L55:
            java.lang.String r0 = "Cancel"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L5e
            goto L13
        L5e:
            com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel r0 = r15.LLILLL
            X.1DDr r0 = r0.LLILLL
            X.01yq r6 = new X.01yq
            r7 = 0
            r8 = 0
            r14 = 252(0xfc, float:3.53E-43)
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r7
            r13 = r8
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.LL = r2
            java.lang.Object r0 = r0.emit(r6, r15)
            if (r0 != r1) goto L13
            X.C1C7U.LIZIZ(r5)
            return r1
        L7c:
            java.lang.String r0 = "Finish"
            r3.equals(r0)
            goto L13
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C510101yl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C510101yl c510101yl = new C510101yl(this.LLILLL, interfaceC1364105Vn);
        c510101yl.LLILLJJLI = th;
        return c510101yl.invokeSuspend(Unit.LIZ);
    }
}
