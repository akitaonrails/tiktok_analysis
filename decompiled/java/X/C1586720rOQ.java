package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rOQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1586720rOQ extends C09AY implements Function0<C1587300rPM> {
    public C1586720rOQ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final C1587300rPM invoke() {
        return new InterfaceC1586670rOL() { // from class: X.0rPM
            /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x01a0  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x01aa  */
            @Override // X.InterfaceC1586670rOL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZIZ(java.lang.Throwable r21, long r22, long r24, X.EnumC1586970rOp r26, java.lang.Long r27) {
                /*
                    Method dump skipped, instruction units count: 515
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1587300rPM.LIZIZ(java.lang.Throwable, long, long, X.0rOp, java.lang.Long):void");
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x004c  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0056  */
            /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
            /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
            /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
            @Override // X.InterfaceC1586670rOL
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r20, long r21, long r23, X.EnumC1586970rOp r25, com.ss.android.ugc.aweme.friendstab.model.NewContentResponse r26, java.lang.Long r27) {
                /*
                    r19 = this;
                    r16 = 0
                    r1 = r20
                    if (r1 == 0) goto Lc2
                    com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$FriendsFeedRedDotResponse r3 = r1.getFriendsFeedResponse()
                La:
                    if (r26 == 0) goto Lbe
                    com.ss.android.ugc.aweme.friendstab.model.NewContentResponse$FriendsFeedRedDotResponse r2 = r26.getFriendsFeedResponse()
                L10:
                    X.0rOM r0 = X.C1586680rOM.LIZ
                    r0.getClass()
                    X.0rOp r0 = X.C1586680rOM.LIZJ
                    int r4 = r0.ordinal()
                    long r7 = android.os.SystemClock.elapsedRealtime()
                    long r7 = r7 - r23
                    if (r1 == 0) goto Lb8
                    int r0 = r1.status_code
                    if (r0 != 0) goto Lb8
                    r9 = 1
                L28:
                    int r10 = r1.status_code
                L2a:
                    if (r1 == 0) goto L30
                    java.lang.String r11 = r1.status_msg
                    if (r11 != 0) goto L32
                L30:
                    java.lang.String r11 = "onNext"
                L32:
                    if (r3 == 0) goto Lb5
                    int r13 = r3.getRedDotCount()
                    java.util.ArrayList r0 = r3.getAvatarList()
                    if (r0 == 0) goto Lb6
                    int r14 = r0.size()
                L42:
                    X.0rOp r0 = X.EnumC1586970rOp.UNKNOWN
                    r1 = r25
                    if (r1 != r0) goto Lac
                    r15 = r16
                L4a:
                    if (r2 == 0) goto La9
                    int r0 = r2.getNewContentCountForDisplay()
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                L54:
                    if (r3 == 0) goto La6
                    int r0 = r3.getNewContentCountForDisplay()
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                L5e:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    r17 = r0 ^ 1
                    if (r2 == 0) goto La3
                    java.util.ArrayList r0 = r2.getAvatarList()
                    if (r0 == 0) goto La3
                    java.util.Set r1 = X.C13LP.LLIIJI(r0)
                L70:
                    if (r3 == 0) goto La0
                    java.util.ArrayList r0 = r3.getAvatarList()
                    if (r0 == 0) goto La0
                    java.util.Set r0 = X.C13LP.LLIIJI(r0)
                L7c:
                    boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                    r18 = r0 ^ 1
                    if (r27 == 0) goto L8e
                    long r0 = r27.longValue()
                    long r23 = r23 - r0
                    java.lang.Long r16 = java.lang.Long.valueOf(r23)
                L8e:
                    X.0rQ7 r3 = new X.0rQ7
                    java.lang.String r12 = "1"
                    r5 = r21
                    r3.<init>(r4, r5, r7, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                    X.0rQ4 r0 = X.C1587740rQ4.LIZ
                    r0.getClass()
                    X.C1587740rQ4.LIZIZ(r3)
                    return
                La0:
                    r0 = r16
                    goto L7c
                La3:
                    r1 = r16
                    goto L70
                La6:
                    r0 = r16
                    goto L5e
                La9:
                    r1 = r16
                    goto L54
                Lac:
                    int r0 = r1.getType()
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
                    goto L4a
                Lb5:
                    r13 = 0
                Lb6:
                    r14 = 0
                    goto L42
                Lb8:
                    r9 = 0
                    if (r1 != 0) goto L28
                    r10 = -2
                    goto L2a
                Lbe:
                    r2 = r16
                    goto L10
                Lc2:
                    r3 = r16
                    goto La
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1587300rPM.LIZ(com.ss.android.ugc.aweme.friendstab.model.NewContentResponse, long, long, X.0rOp, com.ss.android.ugc.aweme.friendstab.model.NewContentResponse, java.lang.Long):void");
            }
        };
    }
}
