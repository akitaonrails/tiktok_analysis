package X;

import com.bytedance.android.live.effect.music.BGMPlaylistViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TvI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.music.BGMPlaylistViewModel$onInit$1", f = "BGMPlaylistViewModel.kt", l = {94, 95, 96, 99}, m = "invokeSuspend")
public final class C762300TvI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ BGMPlaylistViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C762300TvI(BGMPlaylistViewModel bGMPlaylistViewModel, InterfaceC1364105Vn<? super C762300TvI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bGMPlaylistViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C762300TvI(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082 A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r13 = "BGMPlaylistViewModel@a4b3.onInit$1"
            X.C1C7U.LIZ(r13)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r14.LL
            r8 = 0
            r6 = 0
            r5 = 4
            r11 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L24
            if (r0 == r1) goto L35
            if (r0 == r2) goto L46
            if (r0 == r11) goto L84
            if (r0 != r5) goto La1
            X.C155000ia.LIZIZ(r15)
        L1e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r13)
            return r0
        L24:
            X.C155000ia.LIZIZ(r15)
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r14.LLILLJJLI
            r14.LL = r1
            java.lang.Object r0 = r0.xQ2(r14)
            if (r0 != r7) goto L38
            X.C1C7U.LIZIZ(r13)
            return r7
        L35:
            X.C155000ia.LIZIZ(r15)
        L38:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r14.LLILLJJLI
            r14.LL = r2
            java.lang.Object r0 = r0.wQ2(r14)
            if (r0 != r7) goto L49
            X.C1C7U.LIZIZ(r13)
            return r7
        L46:
            X.C155000ia.LIZIZ(r15)
        L49:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r10 = r14.LLILLJJLI
            java.util.List r0 = r10.yQ2()
            java.util.Iterator r12 = r0.iterator()
        L53:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r9 = r12.next()
            r0 = r9
            webcast.data.MusicSong r0 = (webcast.data.MusicSong) r0
            long r3 = r0.id
            X.14i1<java.lang.Long> r0 = X.InterfaceC766480U4w.LJJIJLIJ
            java.lang.Object r0 = r0.LIZIZ()
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L53
            long r1 = r0.longValue()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L53
        L74:
            webcast.data.MusicSong r9 = (webcast.data.MusicSong) r9
            r14.LL = r11
            java.lang.Object r0 = r10.FQ2(r9, r14)
            if (r0 != r7) goto L87
            X.C1C7U.LIZIZ(r13)
            return r7
        L82:
            r9 = r6
            goto L74
        L84:
            X.C155000ia.LIZIZ(r15)
        L87:
            com.bytedance.android.live.effect.music.BGMPlaylistViewModel r0 = r14.LLILLJJLI
            X.1DDr r3 = r0.LLILLL
            X.0TvJ r2 = new X.0TvJ
            java.util.List r1 = r0.yQ2()
            r0 = 6
            r2.<init>(r1, r6, r8, r0)
            r14.LL = r5
            java.lang.Object r0 = r3.emit(r2, r14)
            if (r0 != r7) goto L1e
            X.C1C7U.LIZIZ(r13)
            return r7
        La1:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C762300TvI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
