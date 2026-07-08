package com.bytedance.android.live.effect.music;

import X.C095G;
import X.C09IR;
import X.C1DEK;
import X.C2252331DDr;
import X.C23250099c;
import X.C762950TwL;
import X.C762990TwP;
import X.C763160Twg;
import X.C763220Twm;
import X.C763390Tx3;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import webcast.data.MusicSong;

/* JADX INFO: loaded from: classes13.dex */
public final class BGMSongListViewModel extends ViewModel {
    public final C763390Tx3 LL;
    public final DataChannel LLILLJJLI;
    public boolean LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public List<C763220Twm> LLJ;
    public boolean LLJILJILJ;
    public final C1DEK LLILLL = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final C2252331DDr LLILZ = C09IR.LIZIZ(0, 10, null, 4);
    public final Map<Long, Boolean> LLILZIL = new HashMap();
    public int LLJI = -1;
    public final Map<Long, Integer> LLJIJIL = new HashMap();
    public long LLJILJIL = -1;

    public final void BQ2(MusicSong musicSong) {
        C763160Twg c763160TwgLIZJ = this.LL.LIZJ(-1L);
        if (c763160TwgLIZJ == null) {
            return;
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C762990TwP(this, musicSong, c763160TwgLIZJ, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object xQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C763110Twb
            if (r0 == 0) goto L7c
            r4 = r7
            X.0Twb r4 = (X.C763110Twb) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 2
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 == r2) goto L76
            if (r0 != r5) goto L82
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r6.LLIZLLLIL
            if (r0 == 0) goto L69
            java.util.List<X.0Twm> r1 = r6.LLJ
        L31:
            r6.LLIZLLLIL = r2
            r6.LLJ = r1
            if (r1 == 0) goto L8a
            int r0 = r1.size()
            if (r0 <= r2) goto L8a
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            X.0Twm r0 = (X.C763220Twm) r0
            X.0Tx3 r2 = r6.LL
            long r0 = r0.LIZIZ
            X.0Twg r0 = r2.LIZJ(r0)
            if (r0 == 0) goto L8a
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto L8a
            java.lang.Object r2 = X.C13LP.LJJJLL(r0)
            webcast.data.MusicSong r2 = (webcast.data.MusicSong) r2
            if (r2 == 0) goto L8a
            X.1DDr r1 = r6.LLILZ
            X.0Tw0 r0 = new X.0Tw0
            r0.<init>(r2)
            r4.LLILLL = r5
            java.lang.Object r0 = r1.emit(r0, r4)
            if (r0 != r3) goto L25
            return r3
        L69:
            X.0Tx3 r1 = r6.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r6.LLILLJJLI
            r4.LLILLL = r2
            java.lang.Object r1 = r1.LIZLLL(r0, r4)
            if (r1 != r3) goto L79
            return r3
        L76:
            X.C155000ia.LIZIZ(r1)
        L79:
            java.util.List r1 = (java.util.List) r1
            goto L31
        L7c:
            X.0Twb r4 = new X.0Twb
            r4.<init>(r6, r7)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.xQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[LOOP:0: B:37:0x008d->B:39:0x0093, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object yQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C763090TwZ
            if (r0 == 0) goto L72
            r6 = r9
            X.0TwZ r6 = (X.C763090TwZ) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r7 = r6.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L59
            if (r0 == r3) goto L80
            if (r0 != r4) goto L78
            X.C155000ia.LIZIZ(r7)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r7)
            boolean r0 = r8.LLIZLLLIL
            if (r0 == 0) goto L4c
            java.util.List<X.0Twm> r7 = r8.LLJ
        L34:
            r8.LLIZLLLIL = r2
            r8.LLJ = r7
            if (r7 == 0) goto L5f
            X.1DDr r1 = r8.LLILZ
            X.0Tw1 r0 = new X.0Tw1
            r0.<init>(r7)
            r6.LL = r7
            r6.LLILZ = r3
            java.lang.Object r0 = r1.emit(r0, r6)
            if (r0 != r5) goto L88
            return r5
        L4c:
            X.0Tx3 r1 = r8.LL
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LLILLJJLI
            r6.LLILZ = r2
            java.lang.Object r7 = r1.LIZLLL(r0, r6)
            if (r7 != r5) goto L5c
            return r5
        L59:
            X.C155000ia.LIZIZ(r7)
        L5c:
            java.util.List r7 = (java.util.List) r7
            goto L34
        L5f:
            r0 = 2131844638(0x7f115e1e, float:1.9322674E38)
            X.C766270U4b.LIZLLL(r0)
            X.1DDr r1 = r8.LLILZ
            X.0Tvy r0 = new X.AbstractC762710Tvx() { // from class: X.0Tvy
                static {
                    /*
                        X.0Tvy r0 = new X.0Tvy
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0Tvy) X.0Tvy.LIZ X.0Tvy
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C762720Tvy.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C762720Tvy.<init>():void");
                }
            }
            r6.LLILZ = r4
            java.lang.Object r0 = r1.emit(r0, r6)
            if (r0 != r5) goto L28
            return r5
        L72:
            X.0TwZ r6 = new X.0TwZ
            r6.<init>(r8, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L80:
            java.lang.Object r0 = r6.LL
            java.util.List r0 = (java.util.List) r0
            X.C155000ia.LIZIZ(r7)
            goto L89
        L88:
            r0 = r7
        L89:
            java.util.Iterator r3 = r0.iterator()
        L8d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r0 = r3.next()
            X.0Twm r0 = (X.C763220Twm) r0
            java.util.Map<java.lang.Long, java.lang.Boolean> r2 = r8.LLILZIL
            long r0 = r0.LIZIZ
            java.lang.Long r1 = X.C2286608xc.LJFF(r0)
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.util.HashMap r2 = (java.util.HashMap) r2
            r2.put(r1, r0)
            goto L8d
        Lac:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.yQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Failed to analyze thrown exceptions
    java.util.ConcurrentModificationException
    	at java.base/java.util.ArrayList$Itr.checkForComodification(Unknown Source)
    	at java.base/java.util.ArrayList$Itr.next(Unknown Source)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:130)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.checkInsn(MethodThrowsVisitor.java:178)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.processInstructions(MethodThrowsVisitor.java:131)
    	at jadx.core.dex.visitors.MethodThrowsVisitor.visit(MethodThrowsVisitor.java:68)
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof X.C763100Twa
            r7 = r13
            if (r0 == 0) goto L61
            r6 = r14
            X.0Twa r6 = (X.C763100Twa) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.LLILZ = r2
        L13:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r1 = -1
            r3 = 1
            if (r0 == 0) goto L38
            if (r0 != r3) goto L9c
            int r9 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L27:
            java.lang.Number r5 = (java.lang.Number) r5
            long r10 = r5.longValue()
            X.0Tx3 r0 = r7.LL
            X.0Twg r8 = r0.LIZJ(r1)
            if (r8 != 0) goto L67
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L38:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r7.LLIZ
            r0 = r0 ^ 1
            if (r0 != 0) goto L44
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.0Tx3 r0 = r7.LL
            X.0Twg r0 = r0.LIZJ(r1)
            if (r0 == 0) goto La4
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto La4
            int r9 = r0.size()
            X.0Tx3 r0 = r7.LL
            r6.LL = r9
            r6.LLILZ = r3
            java.lang.Object r5 = r0.LJ(r6)
            if (r5 != r4) goto L27
            return r4
        L61:
            X.0Twa r6 = new X.0Twa
            r6.<init>(r7, r14)
            goto L13
        L67:
            r2 = 0
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            r2 = 3
            r12 = 0
            if (r1 < 0) goto L99
            X.01wk r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            X.0TwO r6 = new X.0TwO
            r6.<init>(r7, r8, r9, r10, r12)
            X.C23250099c.LIZLLL(r0, r12, r12, r6, r2)
            if (r1 != 0) goto L99
            X.01wk r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r7)
            X.0TwQ r0 = new X.0TwQ
            r0.<init>(r7, r12)
            X.C23250099c.LIZLLL(r1, r12, r12, r0, r2)
            java.util.List<webcast.data.MusicSong> r0 = r8.LIZ
            int r1 = r0.size()
            r0 = 50
            if (r1 <= r0) goto L99
            r0 = 2131844627(0x7f115e13, float:1.9322652E38)
            X.C766270U4b.LIZLLL(r0)
        L99:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La4:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.zQ2(X.05Vn):java.lang.Object");
    }

    public BGMSongListViewModel(C763390Tx3 c763390Tx3, DataChannel dataChannel) {
        this.LL = c763390Tx3;
        this.LLILLJJLI = dataChannel;
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C762950TwL(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object AQ2(long r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r17) {
        /*
            r14 = this;
            r3 = r17
            r7 = r15
            boolean r0 = r3 instanceof X.C763080TwY
            r6 = r14
            if (r0 == 0) goto L78
            r5 = r3
            X.0TwY r5 = (X.C763080TwY) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L16:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L3c
            if (r0 != r3) goto La5
            int r10 = r5.LLILLJJLI
            long r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L2b:
            java.lang.Number r1 = (java.lang.Number) r1
            long r11 = r1.longValue()
            X.0Tx3 r0 = r6.LL
            X.0Twg r9 = r0.LIZJ(r7)
            if (r9 != 0) goto L7e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r6.LLILZLL
            if (r0 != 0) goto Lb0
            java.util.Map<java.lang.Long, java.lang.Boolean> r1 = r6.LLILZIL
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r0 = r1.get(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = X.C500260Jjc.LJJIFFI(r0)
            if (r0 == 0) goto Lb0
            r6.LLILZLL = r3
            X.0Tx3 r0 = r6.LL
            X.0Twg r0 = r0.LIZJ(r7)
            if (r0 == 0) goto Lad
            java.util.List<webcast.data.MusicSong> r0 = r0.LIZ
            if (r0 == 0) goto Lad
            int r10 = r0.size()
            X.0Tx3 r0 = r6.LL
            r5.LL = r7
            r5.LLILLJJLI = r10
            r5.LLILZIL = r3
            java.lang.Object r1 = r0.LJFF(r7, r5)
            if (r1 != r4) goto L2b
            return r4
        L78:
            X.0TwY r5 = new X.0TwY
            r5.<init>(r6, r3)
            goto L16
        L7e:
            r6.LLILZLL = r2
            r2 = 0
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            r2 = 3
            r13 = 0
            if (r1 < 0) goto La2
            X.01wk r0 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.0TwN r5 = new X.0TwN
            r5.<init>(r6, r7, r9, r10, r11, r13)
            X.C23250099c.LIZLLL(r0, r13, r13, r5, r2)
            if (r1 != 0) goto La2
            X.01wk r1 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.0TwM r0 = new X.0TwM
            r0.<init>(r6, r7, r13)
            X.C23250099c.LIZLLL(r1, r13, r13, r0, r2)
        La2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lad:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lb0:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.AQ2(long, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object vQ2(webcast.data.MusicSong r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C763060TwW
            if (r0 == 0) goto L3c
            r4 = r7
            X.0TwW r4 = (X.C763060TwW) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3c
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L42
            webcast.data.MusicSong r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            r6.isFavourite = r1
            r5.BQ2(r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r3)
            X.0Tx3 r0 = r5.LL
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LIZ(r6, r4)
            if (r0 != r2) goto L24
            return r2
        L3c:
            X.0TwW r4 = new X.0TwW
            r4.<init>(r5, r7)
            goto L12
        L42:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.vQ2(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object wQ2(webcast.data.MusicSong r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C763070TwX
            if (r0 == 0) goto L3d
            r4 = r7
            X.0TwX r4 = (X.C763070TwX) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3d
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r3 = r4.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L43
            webcast.data.MusicSong r6 = r4.LL
            X.C155000ia.LIZIZ(r3)
        L24:
            r0 = 0
            r6.isFavourite = r0
            r5.BQ2(r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2d:
            X.C155000ia.LIZIZ(r3)
            X.0Tx3 r0 = r5.LL
            r4.LL = r6
            r4.LLILZ = r1
            java.lang.Object r0 = r0.LIZIZ(r6, r4)
            if (r0 != r2) goto L24
            return r2
        L3d:
            X.0TwX r4 = new X.0TwX
            r4.<init>(r5, r7)
            goto L12
        L43:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.music.BGMSongListViewModel.wQ2(webcast.data.MusicSong, X.05Vn):java.lang.Object");
    }
}
