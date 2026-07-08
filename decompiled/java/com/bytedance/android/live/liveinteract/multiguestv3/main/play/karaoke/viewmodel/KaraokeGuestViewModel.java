package com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel;

import X.C0TZ2;
import X.C0TZ3;
import X.C0UTB;
import X.C0UTD;
import X.C19GN;
import X.C494720Jag;
import X.C494730Jah;
import X.C500260Jjc;
import X.C755620TkW;
import X.C755630TkX;
import X.C782110Um9;
import X.C785410UrT;
import X.C786410Ut5;
import X.C917720ZzO;
import X.C930540aK4;
import X.InterfaceC923600a8s;
import X.InterfaceC934710aQn;
import Y.AcS496S0100000_15;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.dialog.MultiGuestFollowGuideDialog;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS5S0400100_15;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes16.dex */
public final class KaraokeGuestViewModel extends ViewModel {
    public final DataChannel LL;
    public MultiGuestFollowGuideDialog LLILLJJLI;
    public LiveDialog LLILLL;
    public C0UTB LLILZ;
    public C0UTD LLILZIL;
    public int LLILZLL = 1;
    public boolean LLIZ;
    public boolean LLIZLLLIL;

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C19GN c19gn;
        super.onCleared();
        LiveDialog liveDialog = this.LLILLL;
        if (liveDialog != null) {
            C500260Jjc.LJJLIIIJL(liveDialog);
        }
        MultiGuestFollowGuideDialog multiGuestFollowGuideDialog = this.LLILLJJLI;
        if (multiGuestFollowGuideDialog != null) {
            C930540aK4.LJJIZ(multiGuestFollowGuideDialog);
        }
        this.LLILLL = null;
        this.LLILLJJLI = null;
        C0UTB c0utb = this.LLILZ;
        if (c0utb == null || (c19gn = c0utb.LIZ) == null) {
            return;
        }
        c19gn.dismiss();
        C785410UrT.LIZ(c19gn);
    }

    public KaraokeGuestViewModel(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    public final void vQ2(InterfaceC923600a8s interfaceC923600a8s, long j, Function1<? super Boolean, Unit> function1, Function1<? super Throwable, Unit> function12) {
        Context context;
        Context context2;
        Boolean boolValueOf;
        Context context3;
        if (this.LLILZ == null) {
            this.LLILZ = new C0UTB();
        }
        Context context4 = null;
        if (this.LLILZIL == null) {
            if (interfaceC923600a8s != null) {
                context3 = interfaceC923600a8s.getContext();
            } else {
                context3 = null;
            }
            this.LLILZIL = new C0UTD(context3, this.LL, new AwS5S0400100_15(this, interfaceC923600a8s, j, function1, function12, 0), new AwS559S0100000_15(function12, (Function1<? super Throwable, Unit>) 303), 0, 48);
        }
        C0UTD c0utd = this.LLILZIL;
        if (c0utd != null) {
            C0UTB c0utb = this.LLILZ;
            if (c0utb != null) {
                boolValueOf = Boolean.valueOf(c0utb.LIZ(c0utd, false));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return;
            }
        }
        AwS5S0400100_15 awS5S0400100_15 = new AwS5S0400100_15(this, interfaceC923600a8s, j, function1, function12, 1);
        AwS594S0100000_15 awS594S0100000_15 = new AwS594S0100000_15(function12, (Function1<? super PosIdentity, Unit>) 381);
        if (InterfaceC934710aQn.f137dc.LIZIZ().booleanValue()) {
            if (this.LLILLL == null) {
                if (interfaceC923600a8s != null && (context2 = interfaceC923600a8s.getContext()) != null) {
                    C782110Um9 c782110Um9 = new C782110Um9(context2);
                    c782110Um9.LIZIZ = interfaceC923600a8s;
                    c782110Um9.LJIIZILJ(2131843320);
                    c782110Um9.LJII(2131843318);
                    c782110Um9.LIZIZ = interfaceC923600a8s;
                    c782110Um9.LJIILL = false;
                    c782110Um9.LJIILLIIL = false;
                    this.LLILLL = c782110Um9.LIZ();
                } else {
                    return;
                }
            }
            C755620TkW c755620TkW = new C755620TkW();
            if (interfaceC923600a8s != null) {
                context = interfaceC923600a8s.getContext();
            } else {
                context = null;
            }
            c755620TkW.LIZ(2131843319, context);
            c755620TkW.LIZJ = new AcS496S0100000_15(awS5S0400100_15, 80);
            C0TZ2 c0tz2 = new C0TZ2(c755620TkW);
            C755630TkX c755630TkX = new C755630TkX();
            if (interfaceC923600a8s != null) {
                context4 = interfaceC923600a8s.getContext();
            }
            c755630TkX.LIZ(2131840681, context4);
            c755630TkX.LIZJ = new AcS496S0100000_15(awS594S0100000_15, 79);
            C0TZ3 c0tz3 = new C0TZ3(c755630TkX);
            LiveDialog liveDialog = this.LLILLL;
            if (liveDialog != null) {
                C494720Jag c494720Jag = new C494720Jag();
                c494720Jag.LIZ(c0tz2);
                c494720Jag.LIZ(c0tz3);
                liveDialog.LJLJI(new C494730Jah(c494720Jag));
            }
            LiveDialog liveDialog2 = this.LLILLL;
            if (liveDialog2 != null && liveDialog2.isShowing()) {
                return;
            }
            LiveDialog liveDialog3 = this.LLILLL;
            if (liveDialog3 != null) {
                C786410Ut5.E4(liveDialog3);
            }
            C917720ZzO.LIZ.getClass();
            C917720ZzO.LJFF("show");
            return;
        }
        awS5S0400100_15.invoke(Boolean.TRUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void wQ2(X.InterfaceC923600a8s r29, long r30, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r32, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r33) {
        /*
            Method dump skipped, instruction units count: 467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.karaoke.viewmodel.KaraokeGuestViewModel.wQ2(X.0a8s, long, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):void");
    }
}
