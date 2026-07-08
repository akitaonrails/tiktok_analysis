package X;

import com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings;
import com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings;
import com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings;
import com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings;
import com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings;
import com.bytedance.android.livesdk.chatroom.model.UserStats;
import com.bytedance.android.livesdk.livesetting.LiveRoomFunctionUpdateIntervalSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tpw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C758980Tpw {
    public final DataChannel LIZ;
    public final long LIZIZ;
    public CommentSwitchSettings LIZJ;
    public EnigmaWhisperSwitchSettings LIZLLL;
    public ContentDisclosureSettings LJ;
    public AgeRestrictionSettings LJFF;
    public long LJI;
    public UserStats LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public int LJIILIIL;
    public LocationIconDisplaySettings LJIILJJIL;
    public EnumC759110Tq9 LJII = EnumC759110Tq9.UNSET;
    public final long LJIIJJI = LiveRoomFunctionUpdateIntervalSetting.INSTANCE.getInterval();
    public boolean LJIIL = true;

    public final void LIZ(CommentSwitchSettings commentSwitchSettings) {
        boolean z;
        Integer numValueOf = Integer.valueOf(commentSwitchSettings.chat);
        if (numValueOf.intValue() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int iIntValue = numValueOf.intValue();
            CommentSwitchSettings commentSwitchSettings2 = this.LIZJ;
            if (commentSwitchSettings2 != null) {
                commentSwitchSettings2.chat = iIntValue;
            }
        }
        Integer numValueOf2 = Integer.valueOf(commentSwitchSettings.chatL2);
        if (numValueOf2.intValue() != 0) {
            int iIntValue2 = numValueOf2.intValue();
            CommentSwitchSettings commentSwitchSettings3 = this.LIZJ;
            if (commentSwitchSettings3 != null) {
                commentSwitchSettings3.chatL2 = iIntValue2;
            }
        }
        Integer numValueOf3 = Integer.valueOf(commentSwitchSettings.chatSpamComments);
        if (numValueOf3.intValue() != 0) {
            int iIntValue3 = numValueOf3.intValue();
            CommentSwitchSettings commentSwitchSettings4 = this.LIZJ;
            if (commentSwitchSettings4 != null) {
                commentSwitchSettings4.chatSpamComments = iIntValue3;
            }
        }
        Integer numValueOf4 = Integer.valueOf(commentSwitchSettings.chatCommunityFlagged);
        if (numValueOf4.intValue() != 0) {
            int iIntValue4 = numValueOf4.intValue();
            CommentSwitchSettings commentSwitchSettings5 = this.LIZJ;
            if (commentSwitchSettings5 != null) {
                commentSwitchSettings5.chatCommunityFlagged = iIntValue4;
            }
        }
        Integer numValueOf5 = Integer.valueOf(commentSwitchSettings.chatCommunityFlaggedReview);
        if (numValueOf5.intValue() != 0) {
            int iIntValue5 = numValueOf5.intValue();
            CommentSwitchSettings commentSwitchSettings6 = this.LIZJ;
            if (commentSwitchSettings6 != null) {
                commentSwitchSettings6.chatCommunityFlaggedReview = iIntValue5;
            }
        }
        Integer numValueOf6 = Integer.valueOf(commentSwitchSettings.commentTray);
        if (numValueOf6.intValue() != 0) {
            int iIntValue6 = numValueOf6.intValue();
            CommentSwitchSettings commentSwitchSettings7 = this.LIZJ;
            if (commentSwitchSettings7 != null) {
                commentSwitchSettings7.commentTray = iIntValue6;
            }
        }
        Integer numValueOf7 = Integer.valueOf(commentSwitchSettings.muteDuration);
        if (numValueOf7.intValue() != 0) {
            int iIntValue7 = numValueOf7.intValue();
            CommentSwitchSettings commentSwitchSettings8 = this.LIZJ;
            if (commentSwitchSettings8 != null) {
                commentSwitchSettings8.muteDuration = iIntValue7;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C759040Tq2
            if (r0 == 0) goto L68
            r6 = r10
            X.0Tq2 r6 = (X.C759040Tq2) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L3f
            if (r0 != r8) goto L6e
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r3 = r3 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r6.LLILLL = r5
            java.lang.Object r0 = r9.LJIIIIZZ(r6)
            if (r0 != r7) goto L42
            return r7
        L3f:
            X.C155000ia.LIZIZ(r1)
        L42:
            r6.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r1.<init>(r5, r0)
            r1.LJIJJ()
            com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings r0 = r9.LJFF
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L65
            X.C099Q.LIZJ(r6)
        L65:
            if (r1 != r7) goto L25
            return r7
        L68:
            X.0Tq2 r6 = new X.0Tq2
            r6.<init>(r9, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LIZIZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1364105Vn<? super java.lang.Integer> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C759050Tq3
            if (r0 == 0) goto L70
            r4 = r10
            X.0Tq3 r4 = (X.C759050Tq3) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L26
            if (r0 == r7) goto L43
            if (r0 != r8) goto L76
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r5 = r5 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L46
            boolean r0 = r9.LJIIIZ
            if (r0 != 0) goto L46
            r4.LLILLL = r7
            java.lang.Object r0 = r9.LJIIIIZZ(r4)
            if (r0 != r3) goto L46
            return r3
        L43:
            X.C155000ia.LIZIZ(r1)
        L46:
            r4.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r1.<init>(r7, r0)
            r1.LJIJJ()
            int r0 = r9.LJIILIIL
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L6d
            X.C099Q.LIZJ(r4)
        L6d:
            if (r1 != r3) goto L25
            return r3
        L70:
            X.0Tq3 r4 = new X.0Tq3
            r4.<init>(r9, r10)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LIZJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZLLL(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C754230TiH
            if (r0 == 0) goto L68
            r6 = r10
            X.0TiH r6 = (X.C754230TiH) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L3f
            if (r0 != r8) goto L6e
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r3 = r3 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r6.LLILLL = r5
            java.lang.Object r0 = r9.LJIIIIZZ(r6)
            if (r0 != r7) goto L42
            return r7
        L3f:
            X.C155000ia.LIZIZ(r1)
        L42:
            r6.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r1.<init>(r5, r0)
            r1.LJIJJ()
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r0 = r9.LIZJ
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L65
            X.C099Q.LIZJ(r6)
        L65:
            if (r1 != r7) goto L25
            return r7
        L68:
            X.0TiH r6 = new X.0TiH
            r6.<init>(r9, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LIZLLL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C759060Tq4
            if (r0 == 0) goto L68
            r6 = r10
            X.0Tq4 r6 = (X.C759060Tq4) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L3f
            if (r0 != r8) goto L6e
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r3 = r3 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r6.LLILLL = r5
            java.lang.Object r0 = r9.LJIIIIZZ(r6)
            if (r0 != r7) goto L42
            return r7
        L3f:
            X.C155000ia.LIZIZ(r1)
        L42:
            r6.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r1.<init>(r5, r0)
            r1.LJIJJ()
            com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings r0 = r9.LJ
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L65
            X.C099Q.LIZJ(r6)
        L65:
            if (r1 != r7) goto L25
            return r7
        L68:
            X.0Tq4 r6 = new X.0Tq4
            r6.<init>(r9, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C754240TiI
            if (r0 == 0) goto L68
            r6 = r10
            X.0TiI r6 = (X.C754240TiI) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L3f
            if (r0 != r8) goto L6e
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r3 = r3 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r6.LLILLL = r5
            java.lang.Object r0 = r9.LJIIIIZZ(r6)
            if (r0 != r7) goto L42
            return r7
        L3f:
            X.C155000ia.LIZIZ(r1)
        L42:
            r6.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r1.<init>(r5, r0)
            r1.LJIJJ()
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r0 = r9.LIZLLL
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L65
            X.C099Q.LIZJ(r6)
        L65:
            if (r1 != r7) goto L25
            return r7
        L68:
            X.0TiI r6 = new X.0TiI
            r6.<init>(r9, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJFF(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1364105Vn<? super X.EnumC759110Tq9> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C759070Tq5
            if (r0 == 0) goto L68
            r6 = r10
            X.0Tq5 r6 = (X.C759070Tq5) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 2
            r5 = 1
            if (r0 == 0) goto L26
            if (r0 == r5) goto L3f
            if (r0 != r8) goto L6e
            X.C155000ia.LIZIZ(r1)
        L25:
            return r1
        L26:
            X.C155000ia.LIZIZ(r1)
            long r3 = java.lang.System.currentTimeMillis()
            long r0 = r9.LJIIJ
            long r3 = r3 - r0
            long r1 = r9.LJIIJJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L42
            r6.LLILLL = r5
            java.lang.Object r0 = r9.LJIIIIZZ(r6)
            if (r0 != r7) goto L42
            return r7
        L3f:
            X.C155000ia.LIZIZ(r1)
        L42:
            r6.LLILLL = r8
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r1.<init>(r5, r0)
            r1.LJIJJ()
            X.0Tq9 r0 = r9.LJII
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L65
            X.C099Q.LIZJ(r6)
        L65:
            if (r1 != r7) goto L25
            return r7
        L68:
            X.0Tq5 r6 = new X.0Tq5
            r6.<init>(r9, r10)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJI(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C759080Tq6
            if (r0 == 0) goto L74
            r5 = r8
            X.0Tq6 r5 = (X.C759080Tq6) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r4 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L29
            if (r0 == r2) goto L4b
            if (r0 == r3) goto L39
            if (r0 != r4) goto L7a
            X.C155000ia.LIZIZ(r1)
        L28:
            return r1
        L29:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r7.LJIIIZ
            if (r0 != 0) goto L3c
            r5.LLILLL = r2
            java.lang.Object r0 = r7.LJIIIIZZ(r5)
            if (r0 != r6) goto L4e
            return r6
        L39:
            X.C155000ia.LIZIZ(r1)
        L3c:
            boolean r0 = r7.LJIIIZ
            if (r0 == 0) goto L4e
            r5.LLILLL = r3
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r6) goto L3c
            return r6
        L4b:
            X.C155000ia.LIZIZ(r1)
        L4e:
            r5.LLILLL = r4
            X.1DEt r1 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r5)
            r1.<init>(r2, r0)
            r1.LJIJJ()
            com.bytedance.android.livesdk.chatroom.model.LocationIconDisplaySettings r0 = r7.LJIILJJIL
            X.C189200o6.m2constructorimpl(r0)
            r1.resumeWith(r0)
            java.lang.Object r1 = r1.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L71
            X.C099Q.LIZJ(r5)
        L71:
            if (r1 != r6) goto L28
            return r6
        L74:
            X.0Tq6 r5 = new X.0Tq6
            r5.<init>(r7, r8)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJII(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIIZZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIIIIZZ(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIIZ(X.InterfaceC1364105Vn<? super java.lang.Long> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C755690Tkd
            if (r0 == 0) goto L78
            r4 = r8
            X.0Tkd r4 = (X.C755690Tkd) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L78
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r6 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L29
            if (r0 == r3) goto L4b
            if (r0 == r2) goto L39
            if (r0 != r6) goto L7e
            X.C155000ia.LIZIZ(r1)
        L28:
            return r1
        L29:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r7.LJIIIZ
            if (r0 != 0) goto L3c
            r4.LLILLL = r3
            java.lang.Object r0 = r7.LJIIIIZZ(r4)
            if (r0 != r5) goto L4e
            return r5
        L39:
            X.C155000ia.LIZIZ(r1)
        L3c:
            boolean r0 = r7.LJIIIZ
            if (r0 == 0) goto L4e
            r4.LLILLL = r2
            r0 = 100
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r0 != r5) goto L3c
            return r5
        L4b:
            X.C155000ia.LIZIZ(r1)
        L4e:
            r4.LLILLL = r6
            X.1DEt r2 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r2.<init>(r3, r0)
            r2.LJIJJ()
            long r0 = r7.LJI
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            X.C189200o6.m2constructorimpl(r0)
            r2.resumeWith(r0)
            java.lang.Object r1 = r2.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L75
            X.C099Q.LIZJ(r4)
        L75:
            if (r1 != r5) goto L28
            return r5
        L78:
            X.0Tkd r4 = new X.0Tkd
            r4.<init>(r7, r8)
            goto L12
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIIIZ(X.05Vn):java.lang.Object");
    }

    public C758980Tpw(long j, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = j;
        this.LJIILIIL = Intrinsics.LJFF(InterfaceC1106030et7.J7.LIZ(), Boolean.TRUE) ? 1 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJ(com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C758990Tpx
            if (r0 == 0) goto L23
            r7 = r10
            X.0Tpx r7 = (X.C758990Tpx) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r1 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings r9 = r7.LL
            goto L5d
        L23:
            X.0Tpx r7 = new X.0Tpx
            r7.<init>(r8, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L7d
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L7d
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L7d
            com.bytedance.android.livesdk.function.RoomFunctionApi r3 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r3     // Catch: java.lang.Exception -> L7d
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r2 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L7d
            r2.<init>()     // Catch: java.lang.Exception -> L7d
            r2.commentSwitchSettings = r5     // Catch: java.lang.Exception -> L7d
            r2.contentDisclosureSettings = r5     // Catch: java.lang.Exception -> L7d
            r2.ageRestrictionSettings = r9     // Catch: java.lang.Exception -> L7d
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> L7d
            r2.roomId = r0     // Catch: java.lang.Exception -> L7d
            r7.LL = r9     // Catch: java.lang.Exception -> L7d
            r7.LLILZ = r4     // Catch: java.lang.Exception -> L7d
            java.lang.Object r0 = r3.requestAnchorSettingsUpdate(r2, r7)     // Catch: java.lang.Exception -> L7d
            if (r0 != r6) goto L60
            return r6
        L5d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L7d
        L60:
            int r0 = r9.ageRestricted     // Catch: java.lang.Exception -> L7d
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L7d
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L6d
            r4 = 0
        L6d:
            if (r4 != 0) goto L70
            r5 = r1
        L70:
            if (r5 == 0) goto L88
            int r1 = r5.intValue()     // Catch: java.lang.Exception -> L7d
            com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings r0 = r8.LJFF     // Catch: java.lang.Exception -> L7d
            if (r0 == 0) goto L88
            r0.ageRestricted = r1     // Catch: java.lang.Exception -> L7d
            goto L88
        L7d:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "RoomFunctionSettingsManager"
            java.lang.String r0 = "updateAgeRestrictionSettings error"
            X.C20441214yg.LJFF(r1, r0, r2)
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIIJ(com.bytedance.android.livesdk.chatroom.model.AgeRestrictionSettings, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C759020Tq0
            if (r0 == 0) goto L23
            r6 = r10
            X.0Tq0 r6 = (X.C759020Tq0) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r2 = r6.LLILLJJLI
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L31
            if (r0 != r4) goto L29
            boolean r9 = r6.LL
            goto L6d
        L23:
            X.0Tq0 r6 = new X.0Tq0
            r6.<init>(r8, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LIZ     // Catch: java.lang.Exception -> L93
            boolean r0 = X.C500260Jjc.LJJJIL(r0)     // Catch: java.lang.Exception -> L93
            if (r0 != 0) goto L90
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L93
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L93
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L93
            com.bytedance.android.livesdk.function.RoomFunctionApi r3 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r3     // Catch: java.lang.Exception -> L93
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r2 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L93
            r2.<init>()     // Catch: java.lang.Exception -> L93
            r0 = 0
            r2.commentSwitchSettings = r0     // Catch: java.lang.Exception -> L93
            r2.contentDisclosureSettings = r0     // Catch: java.lang.Exception -> L93
            r2.ageRestrictionSettings = r0     // Catch: java.lang.Exception -> L93
            if (r9 == 0) goto L5b
            r0 = 1
            goto L5c
        L5b:
            r0 = 2
        L5c:
            r2.aiCommentReplySwitch = r0     // Catch: java.lang.Exception -> L93
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> L93
            r2.roomId = r0     // Catch: java.lang.Exception -> L93
            r6.LL = r9     // Catch: java.lang.Exception -> L93
            r6.LLILZ = r4     // Catch: java.lang.Exception -> L93
            java.lang.Object r2 = r3.requestAnchorSettingsUpdate(r2, r6)     // Catch: java.lang.Exception -> L93
            if (r2 != r7) goto L70
            return r7
        L6d:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L93
        L70:
            X.0Icr r2 = (X.C470590Icr) r2     // Catch: java.lang.Exception -> L93
            int r0 = r2.statusCode     // Catch: java.lang.Exception -> L93
            if (r0 != 0) goto L88
            if (r9 == 0) goto L79
            r5 = 1
        L79:
            r8.LJIILIIL = r5     // Catch: java.lang.Exception -> L93
            X.0JT6<java.lang.Boolean> r1 = X.InterfaceC1106030et7.J7     // Catch: java.lang.Exception -> L93
            if (r9 != 0) goto L80
            r4 = 0
        L80:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Exception -> L93
            r1.LIZJ(r0)     // Catch: java.lang.Exception -> L93
            goto L90
        L88:
            X.0Jle r1 = new X.0Jle     // Catch: java.lang.Exception -> L93
            int r0 = r2.statusCode     // Catch: java.lang.Exception -> L93
            r1.<init>(r0)     // Catch: java.lang.Exception -> L93
            throw r1     // Catch: java.lang.Exception -> L93
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L93:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIIJJI(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r9, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C754260TiK
            if (r0 == 0) goto L22
            r7 = r10
            X.0TiK r7 = (X.C754260TiK) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 1
            if (r0 == 0) goto L30
            if (r0 != r4) goto L28
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r9 = r7.LL
            goto L65
        L22:
            X.0TiK r7 = new X.0TiK
            r7.<init>(r8, r10)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r6)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LIZ     // Catch: java.lang.Exception -> L6e
            boolean r0 = X.C500260Jjc.LJJJIL(r0)     // Catch: java.lang.Exception -> L6e
            r6 = 0
            if (r0 != 0) goto L6a
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L6e
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L6e
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L6e
            com.bytedance.android.livesdk.function.RoomFunctionApi r3 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r3     // Catch: java.lang.Exception -> L6e
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r2 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L6e
            r2.<init>()     // Catch: java.lang.Exception -> L6e
            r2.commentSwitchSettings = r9     // Catch: java.lang.Exception -> L6e
            r2.contentDisclosureSettings = r6     // Catch: java.lang.Exception -> L6e
            r2.ageRestrictionSettings = r6     // Catch: java.lang.Exception -> L6e
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> L6e
            r2.roomId = r0     // Catch: java.lang.Exception -> L6e
            r7.LL = r9     // Catch: java.lang.Exception -> L6e
            r7.LLILZ = r4     // Catch: java.lang.Exception -> L6e
            java.lang.Object r6 = r3.requestAnchorSettingsUpdate(r2, r7)     // Catch: java.lang.Exception -> L6e
            if (r6 != r5) goto L68
            return r5
        L65:
            X.C155000ia.LIZIZ(r6)     // Catch: java.lang.Exception -> L6e
        L68:
            X.0Icr r6 = (X.C470590Icr) r6     // Catch: java.lang.Exception -> L6e
        L6a:
            r8.LIZ(r9)     // Catch: java.lang.Exception -> L6e
            return r6
        L6e:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "RoomFunctionSettingsManager"
            java.lang.String r0 = "updateCommentSettings"
            X.C20441214yg.LJFF(r1, r0, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIIL(com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIILIIL(com.bytedance.android.livesdk.chatroom.model.ContentDisclosureSettings, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: Exception -> 0x0089, TryCatch #0 {Exception -> 0x0089, blocks: (B:21:0x0067, B:22:0x006a, B:23:0x006c, B:29:0x007e, B:31:0x0086, B:15:0x0034, B:17:0x003c), top: B:36:0x001c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r9, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C754250TiJ
            if (r0 == 0) goto L23
            r7 = r10
            X.0TiJ r7 = (X.C754250TiJ) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L23
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r2 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r5 = 1
            r4 = 0
            if (r0 == 0) goto L31
            if (r0 != r5) goto L29
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r9 = r7.LL
            goto L67
        L23:
            X.0TiJ r7 = new X.0TiJ
            r7.<init>(r8, r10)
            goto L12
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L31:
            X.C155000ia.LIZIZ(r2)
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r8.LIZ     // Catch: java.lang.Exception -> L89
            boolean r0 = X.C500260Jjc.LJJJIL(r0)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L65
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L89
            java.lang.Object r3 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.function.RoomFunctionApi r3 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r3     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r2 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L89
            r2.<init>()     // Catch: java.lang.Exception -> L89
            r2.enigmaWhisperSwitchSettings = r9     // Catch: java.lang.Exception -> L89
            r2.contentDisclosureSettings = r4     // Catch: java.lang.Exception -> L89
            r2.ageRestrictionSettings = r4     // Catch: java.lang.Exception -> L89
            long r0 = r8.LIZIZ     // Catch: java.lang.Exception -> L89
            r2.roomId = r0     // Catch: java.lang.Exception -> L89
            r7.LL = r9     // Catch: java.lang.Exception -> L89
            r7.LLILZ = r5     // Catch: java.lang.Exception -> L89
            java.lang.Object r2 = r3.requestAnchorSettingsUpdate(r2, r7)     // Catch: java.lang.Exception -> L89
            if (r2 != r6) goto L6a
            return r6
        L65:
            r2 = r4
            goto L6c
        L67:
            X.C155000ia.LIZIZ(r2)     // Catch: java.lang.Exception -> L89
        L6a:
            X.0Icr r2 = (X.C470590Icr) r2     // Catch: java.lang.Exception -> L89
        L6c:
            int r0 = r9.enigmaWhisper     // Catch: java.lang.Exception -> L89
            java.lang.Integer r1 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Exception -> L89
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L79
            r5 = 0
        L79:
            if (r5 != 0) goto L7c
            r4 = r1
        L7c:
            if (r4 == 0) goto L88
            int r1 = r4.intValue()     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings r0 = r8.LIZLLL     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L88
            r0.enigmaWhisper = r1     // Catch: java.lang.Exception -> L89
        L88:
            return r2
        L89:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "RoomFunctionSettingsManager"
            java.lang.String r0 = "updateEnigmaSettings"
            X.C20441214yg.LJFF(r1, r0, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIILJJIL(com.bytedance.android.livesdk.chatroom.model.EnigmaWhisperSwitchSettings, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.EnumC759110Tq9 r11, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C759010Tpz
            if (r0 == 0) goto L22
            r8 = r12
            X.0Tpz r8 = (X.C759010Tpz) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r7 = 1
            if (r0 == 0) goto L30
            if (r0 != r7) goto L28
            X.0Tq9 r11 = r8.LL
            goto L71
        L22:
            X.0Tpz r8 = new X.0Tpz
            r8.<init>(r10, r12)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L79
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L79
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L79
            com.bytedance.android.livesdk.function.RoomFunctionApi r6 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r6     // Catch: java.lang.Exception -> L79
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r5 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L79
            r5.<init>()     // Catch: java.lang.Exception -> L79
            com.bytedance.android.livesdk.chatroom.model.UserAttrSettings r4 = new com.bytedance.android.livesdk.chatroom.model.UserAttrSettings     // Catch: java.lang.Exception -> L79
            r4.<init>()     // Catch: java.lang.Exception -> L79
            java.util.List<com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch> r3 = r4.userAttr     // Catch: java.lang.Exception -> L79
            com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch r2 = new com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch     // Catch: java.lang.Exception -> L79
            r2.<init>()     // Catch: java.lang.Exception -> L79
            r0 = 34
            r2.attrType = r0     // Catch: java.lang.Exception -> L79
            long r0 = r11.getValue()     // Catch: java.lang.Exception -> L79
            r2.status = r0     // Catch: java.lang.Exception -> L79
            r3.add(r2)     // Catch: java.lang.Exception -> L79
            r5.userAttrSettings = r4     // Catch: java.lang.Exception -> L79
            long r0 = r10.LIZIZ     // Catch: java.lang.Exception -> L79
            r5.roomId = r0     // Catch: java.lang.Exception -> L79
            r8.LL = r11     // Catch: java.lang.Exception -> L79
            r8.LLILZ = r7     // Catch: java.lang.Exception -> L79
            java.lang.Object r1 = r6.requestAnchorSettingsUpdate(r5, r8)     // Catch: java.lang.Exception -> L79
            if (r1 != r9) goto L74
            return r9
        L71:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L79
        L74:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L79
            r10.LJII = r11     // Catch: java.lang.Exception -> L79
            return r1
        L79:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "RoomFunctionSettingsManager"
            java.lang.String r0 = "updateGuardianSetting error"
            X.C20441214yg.LJFF(r1, r0, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIILL(X.0Tq9, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILLIIL(boolean r13, X.InterfaceC1364105Vn<? super X.C470590Icr<com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateResponse>> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof X.C759030Tq1
            if (r0 == 0) goto L24
            r8 = r14
            X.0Tq1 r8 = (X.C759030Tq1) r8
            int r2 = r8.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r8.LLILZ = r2
        L12:
            java.lang.Object r1 = r8.LLILLJJLI
            java.lang.Object r9 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r2 = 1
            r7 = 1
            if (r0 == 0) goto L32
            if (r0 != r7) goto L2a
            boolean r13 = r8.LL
            goto L7d
        L24:
            X.0Tq1 r8 = new X.0Tq1
            r8.<init>(r12, r14)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r1)
            X.0Ism r1 = X.C480460Ism.LIZ()     // Catch: java.lang.Exception -> L89
            java.lang.Class<com.bytedance.android.livesdk.function.RoomFunctionApi> r0 = com.bytedance.android.livesdk.function.RoomFunctionApi.class
            r1.getClass()     // Catch: java.lang.Exception -> L89
            java.lang.Object r6 = X.C480460Ism.LIZLLL(r0)     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.function.RoomFunctionApi r6 = (com.bytedance.android.livesdk.function.RoomFunctionApi) r6     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest r5 = new com.bytedance.android.livesdk.chatroom.model.AnchorSettingsUpdateRequest     // Catch: java.lang.Exception -> L89
            r5.<init>()     // Catch: java.lang.Exception -> L89
            r0 = 0
            r5.commentSwitchSettings = r0     // Catch: java.lang.Exception -> L89
            r5.contentDisclosureSettings = r0     // Catch: java.lang.Exception -> L89
            r5.ageRestrictionSettings = r0     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.chatroom.model.UserAttrSettings r11 = new com.bytedance.android.livesdk.chatroom.model.UserAttrSettings     // Catch: java.lang.Exception -> L89
            r11.<init>()     // Catch: java.lang.Exception -> L89
            java.util.List<com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch> r10 = r11.userAttr     // Catch: java.lang.Exception -> L89
            com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch r4 = new com.bytedance.android.livesdk.chatroom.model.UserAttrSwitch     // Catch: java.lang.Exception -> L89
            r4.<init>()     // Catch: java.lang.Exception -> L89
            r0 = 19
            r4.attrType = r0     // Catch: java.lang.Exception -> L89
            if (r13 == 0) goto L65
            r0 = 1
            goto L67
        L65:
            r0 = 2
        L67:
            r4.status = r0     // Catch: java.lang.Exception -> L89
            r10.add(r4)     // Catch: java.lang.Exception -> L89
            r5.userAttrSettings = r11     // Catch: java.lang.Exception -> L89
            long r0 = r12.LIZIZ     // Catch: java.lang.Exception -> L89
            r5.roomId = r0     // Catch: java.lang.Exception -> L89
            r8.LL = r13     // Catch: java.lang.Exception -> L89
            r8.LLILZ = r7     // Catch: java.lang.Exception -> L89
            java.lang.Object r1 = r6.requestAnchorSettingsUpdate(r5, r8)     // Catch: java.lang.Exception -> L89
            if (r1 != r9) goto L80
            return r9
        L7d:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L89
        L80:
            X.0Icr r1 = (X.C470590Icr) r1     // Catch: java.lang.Exception -> L89
            if (r13 != 0) goto L86
            r2 = 2
        L86:
            r12.LJI = r2     // Catch: java.lang.Exception -> L89
            return r1
        L89:
            r2 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
            java.lang.String r1 = "RoomFunctionSettingsManager"
            java.lang.String r0 = "updateShowLocationSetting error"
            X.C20441214yg.LJFF(r1, r0, r2)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C758980Tpw.LJIILLIIL(boolean, X.05Vn):java.lang.Object");
    }
}
