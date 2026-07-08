package Y;

import X.C0O79;
import X.C0O7B;
import X.C1954807lC;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import X.InterfaceC598890NeJ;
import X.InterfaceC599270Nev;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicGroup;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS240S0000000_9;

/* JADX INFO: loaded from: classes10.dex */
public class AgS167S0300000_9 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$0(X.InterfaceC598890NeJ r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r17 = this;
            r5 = r19
            r1 = r18
            boolean r2 = r5 instanceof X.C598900NeK
            r0 = r17
            if (r2 == 0) goto L28
            r6 = r5
            X.0NeK r6 = (X.C598900NeK) r6
            int r4 = r6.LLILZ
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r4 & r3
            if (r2 == 0) goto L28
            int r4 = r4 - r3
            r6.LLILZ = r4
        L18:
            java.lang.Object r3 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r2 = r6.LLILZ
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            X.0NeJ r1 = r6.LL
            goto L6d
        L28:
            X.0NeK r6 = new X.0NeK
            r6.<init>(r0, r5)
            goto L18
        L2e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L36:
            X.C155000ia.LIZIZ(r3)
            java.lang.Object r2 = r0.l0     // Catch: java.lang.Exception -> L96
            X.0NeV r2 = (X.C599010NeV) r2     // Catch: java.lang.Exception -> L96
            X.0Nf6 r7 = r2.LIZ     // Catch: java.lang.Exception -> L96
            java.lang.String r8 = r1.getName()     // Catch: java.lang.Exception -> L96
            X.0NfL r9 = r1.getType()     // Catch: java.lang.Exception -> L96
            X.0NeL r10 = X.EnumC598910NeL.TRANSMIT     // Catch: java.lang.Exception -> L96
            X.0NeY r11 = X.EnumC599040NeY.PUBLISH     // Catch: java.lang.Exception -> L96
            java.lang.Object r12 = r0.l1     // Catch: java.lang.Exception -> L96
            r13 = 0
            long r15 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L96
            long r2 = r1.LIZ()     // Catch: java.lang.Exception -> L96
            long r15 = r15 - r2
            r7.getClass()     // Catch: java.lang.Exception -> L96
            r14 = r13
            X.C599380Nf6.LIZIZ(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L96
            java.lang.Object r2 = r0.l2     // Catch: java.lang.Exception -> L96
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2     // Catch: java.lang.Exception -> L96
            r6.LL = r1     // Catch: java.lang.Exception -> L96
            r6.LLILZ = r4     // Catch: java.lang.Exception -> L96
            java.lang.Object r2 = r2.invoke(r1, r6)     // Catch: java.lang.Exception -> L96
            if (r2 != r5) goto L70
            return r5
        L6d:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L96
        L70:
            java.lang.Object r2 = r0.l0     // Catch: java.lang.Exception -> L96
            X.0NeV r2 = (X.C599010NeV) r2     // Catch: java.lang.Exception -> L96
            X.0Nf6 r4 = r2.LIZ     // Catch: java.lang.Exception -> L96
            java.lang.String r5 = r1.getName()     // Catch: java.lang.Exception -> L96
            X.0NfL r6 = r1.getType()     // Catch: java.lang.Exception -> L96
            X.0NeL r7 = X.EnumC598910NeL.COMPLETE     // Catch: java.lang.Exception -> L96
            X.0NeY r8 = X.EnumC599040NeY.PUBLISH     // Catch: java.lang.Exception -> L96
            java.lang.Object r9 = r0.l1     // Catch: java.lang.Exception -> L96
            r10 = 0
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L96
            long r2 = r1.LIZ()     // Catch: java.lang.Exception -> L96
            long r12 = r12 - r2
            r4.getClass()     // Catch: java.lang.Exception -> L96
            r11 = r10
            X.C599380Nf6.LIZIZ(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L96
            goto Lbd
        L96:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.Object r2 = r0.l0
            X.0NeV r2 = (X.C599010NeV) r2
            X.0Nf6 r2 = r2.LIZ
            java.lang.String r4 = r1.getName()
            X.0NfL r5 = r1.getType()
            X.0NeL r6 = X.EnumC598910NeL.ERROR
            X.0NeY r7 = X.EnumC599040NeY.PUBLISH
            java.lang.Object r8 = r0.l1
            r9 = 0
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r1.LIZ()
            long r10 = r10 - r0
            r12 = 64
            X.C599380Nf6.LIZ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
        Lbd:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS167S0300000_9.LIZ$0(X.0NeJ, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ$1(X.InterfaceC599270Nev r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r14 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C599240Nes
            if (r0 == 0) goto L24
            r4 = r3
            X.0Nes r4 = (X.C599240Nes) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r4.LLILZ = r2
        L14:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            X.0Nev r15 = r4.LL
            goto L60
        L24:
            X.0Nes r4 = new X.0Nes
            r4.<init>(r14, r3)
            goto L14
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r5 = r15.getName()     // Catch: java.lang.Exception -> L80
            X.0NfI r6 = r15.getType()     // Catch: java.lang.Exception -> L80
            X.0Nek r7 = X.EnumC599160Nek.TRANSMIT     // Catch: java.lang.Exception -> L80
            X.0Nf1 r8 = X.EnumC599330Nf1.PUBLISH     // Catch: java.lang.Exception -> L80
            java.lang.Object r9 = r14.l0     // Catch: java.lang.Exception -> L80
            long r12 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L80
            long r0 = r15.LIZ()     // Catch: java.lang.Exception -> L80
            long r12 = r12 - r0
            r10 = 0
            r11 = r10
            X.C599320Nf0.LIZ(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r14.l1     // Catch: java.lang.Exception -> L80
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0     // Catch: java.lang.Exception -> L80
            r4.LL = r15     // Catch: java.lang.Exception -> L80
            r4.LLILZ = r2     // Catch: java.lang.Exception -> L80
            java.lang.Object r0 = r0.invoke(r15, r4)     // Catch: java.lang.Exception -> L80
            if (r0 != r3) goto L63
            return r3
        L60:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L80
        L63:
            java.lang.String r2 = r15.getName()     // Catch: java.lang.Exception -> L80
            X.0NfI r3 = r15.getType()     // Catch: java.lang.Exception -> L80
            X.0Nek r4 = X.EnumC599160Nek.COMPLETE     // Catch: java.lang.Exception -> L80
            X.0Nf1 r5 = X.EnumC599330Nf1.PUBLISH     // Catch: java.lang.Exception -> L80
            java.lang.Object r6 = r14.l0     // Catch: java.lang.Exception -> L80
            long r9 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L80
            long r0 = r15.LIZ()     // Catch: java.lang.Exception -> L80
            long r9 = r9 - r0
            r7 = 0
            r8 = r7
            X.C599320Nf0.LIZ(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L80
            goto La5
        L80:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            java.lang.Object r2 = r14.l2
            X.0Nen r2 = (X.C599190Nen) r2
            java.lang.String r4 = r15.getName()
            X.0NfI r5 = r15.getType()
            X.0Nek r6 = X.EnumC599160Nek.ERROR
            X.0Nf1 r7 = X.EnumC599330Nf1.PUBLISH
            java.lang.Object r8 = r14.l0
            r9 = 0
            long r10 = java.lang.System.currentTimeMillis()
            long r0 = r15.LIZ()
            long r10 = r10 - r0
            r12 = 64
            X.C599190Nen.LJ(r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
        La5:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS167S0300000_9.LIZ$1(X.0Nev, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS167S0300000_9 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof X.C0NQB
            if (r0 == 0) goto L58
            r8 = r11
            X.0NQB r8 = (X.C0NQB) r8
            int r2 = r8.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r8.LLILLJJLI = r2
        L12:
            java.lang.Object r0 = r8.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r1 = r8.LLILLJJLI
            r6 = 0
            r5 = 2
            r4 = 1
            if (r1 == 0) goto L29
            if (r1 == r4) goto L48
            if (r1 != r5) goto L5e
            X.C155000ia.LIZIZ(r0)
        L26:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L29:
            X.C155000ia.LIZIZ(r0)
            java.lang.Object r3 = r9.l0
            X.01Wf r3 = (X.InterfaceC346701Wf) r3
            java.lang.Object r2 = r9.l1
            X.1DEx r2 = (X.AbstractC2252651DEx) r2
            X.0NQC r1 = new X.0NQC
            java.lang.Object r0 = r9.l2
            com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem r0 = (com.ss.android.ugc.aweme.minis.page.monitor.MinisFpsMonitorAssem) r0
            r1.<init>(r0, r6)
            r8.LLILLL = r3
            r8.LLILLJJLI = r4
            java.lang.Object r0 = X.C23250099c.LJI(r8, r2, r1)
            if (r0 != r7) goto L4d
            return r7
        L48:
            X.01Wf r3 = r8.LLILLL
            X.C155000ia.LIZIZ(r0)
        L4d:
            r8.LLILLL = r6
            r8.LLILLJJLI = r5
            java.lang.Object r0 = r3.emit(r0, r8)
            if (r0 != r7) goto L26
            return r7
        L58:
            X.0NQB r8 = new X.0NQB
            r8.<init>(r9, r11)
            goto L12
        L5e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS167S0300000_9.emit$0(Y.AgS167S0300000_9, java.lang.Object, X.05Vn):java.lang.Object");
    }

    public static final Object emit$1(AgS167S0300000_9 agS167S0300000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        if (obj instanceof C0O79) {
            ((OriginMusicListViewModel) agS167S0300000_9.l0).LLJILJIL = false;
            int iIndexOf = ((OriginMusicListViewModel) agS167S0300000_9.l0).LLJJ.indexOf((MusicGroup) agS167S0300000_9.l1);
            ((OriginMusicListViewModel) agS167S0300000_9.l0).listSetItems(OriginMusicListViewModel.vQ2((OriginMusicListViewModel) agS167S0300000_9.l0, null, null, null, (Music) agS167S0300000_9.l2, null, null, 55));
            if (iIndexOf == 0) {
                ((OriginMusicListViewModel) agS167S0300000_9.l0).setState(AFwS240S0000000_9.get$arr$(565));
            } else {
                ((OriginMusicListViewModel) agS167S0300000_9.l0).setState(AFwS240S0000000_9.get$arr$(566));
            }
        } else if (obj instanceof C0O7B) {
            ((OriginMusicListViewModel) agS167S0300000_9.l0).setState(AFwS240S0000000_9.get$arr$(567));
            ((OriginMusicListViewModel) agS167S0300000_9.l0).LLJILJIL = false;
        } else {
            throw new C1954807lC();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object emit$2(AgS167S0300000_9 agS167S0300000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS167S0300000_9.LIZ$0((InterfaceC598890NeJ) obj, interfaceC1364105Vn);
    }

    public static final /* bridge */ /* synthetic */ Object emit$3(AgS167S0300000_9 agS167S0300000_9, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        return agS167S0300000_9.LIZ$1((InterfaceC599270Nev) obj, interfaceC1364105Vn);
    }

    public AgS167S0300000_9(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
