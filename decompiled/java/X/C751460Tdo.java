package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.effectmanager.common.utils.MD5Utils;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Tdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C751460Tdo {
    public static final C751460Tdo LIZ = new C751460Tdo();
    public static final Map<Long, C745220TLc> LIZIZ = new LinkedHashMap();

    public static C745220TLc LIZ() {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        Map<Long, C745220TLc> map = LIZIZ;
        C745220TLc c745220TLc = (C745220TLc) ((LinkedHashMap) map).get(Long.valueOf(currentUserId));
        if (c745220TLc != null) {
            return c745220TLc;
        }
        C20337914i1 c20337914i1LIZJ = LIZJ();
        if (c20337914i1LIZJ.LIZIZ() == null) {
            c20337914i1LIZJ.LJFF(-1L);
        }
        C745220TLc c745220TLc2 = new C745220TLc(((Number) c20337914i1LIZJ.LIZIZ()).longValue());
        map.put(Long.valueOf(currentUserId), c745220TLc2);
        return c745220TLc2;
    }

    public static C20337914i1 LIZJ() {
        long currentUserId = UserService.getInstance().user().getCurrentUserId();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tmp_mute_duration_");
        sbLIZ.append(MD5Utils.getMD5String(String.valueOf(currentUserId)));
        return new C20337914i1(C2188811AlT.LIZIZ(sbLIZ), (Type) Long.TYPE);
    }

    public static C11HU LIZIZ(final DataChannel dataChannel) {
        C11KS c11ksLJII = AbstractC19484711Kz.LJII(new InterfaceC300801Eo() { // from class: X.0Tdn
            @Override // X.InterfaceC300801Eo
            public final void subscribe(InterfaceC2329309At<C745220TLc> interfaceC2329309At) {
                C23250099c.LIZLLL(C817503Hh.LL, null, null, new C751440Tdm(dataChannel, interfaceC2329309At, null), 3);
            }
        });
        C745220TLc c745220TLcLIZJ = C0TYC.LIZJ(Integer.valueOf(C0TYC.LIZ(LIZ())));
        C1701890uOB.LIZ(c745220TLcLIZJ, "value is null");
        return new C11KD(c11ksLJII, null, c745220TLcLIZJ).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C745220TLc r6, com.bytedance.ies.sdk.datachannel.DataChannel r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof X.C751470Tdp
            if (r0 == 0) goto L22
            r4 = r8
            X.0Tdp r4 = (X.C751470Tdp) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L28
            X.0TLc r6 = r4.LL
            goto L4b
        L22:
            X.0Tdp r4 = new X.0Tdp
            r4.<init>(r5, r8)
            goto L12
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L30:
            X.C155000ia.LIZIZ(r1)
            com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings r1 = new com.bytedance.android.livesdk.chatroom.model.CommentSwitchSettings
            r1.<init>()
            int r0 = X.C0TYC.LIZ(r6)
            r1.muteDuration = r0
            X.0Tde r0 = X.C751360Tde.LIZ     // Catch: java.lang.Exception -> L58
            r4.LL = r6     // Catch: java.lang.Exception -> L58
            r4.LLILZ = r2     // Catch: java.lang.Exception -> L58
            java.lang.Object r0 = r0.LIZJ(r1, r7, r4)     // Catch: java.lang.Exception -> L58
            if (r0 != r3) goto L4e
            return r3
        L4b:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L58
        L4e:
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LLILZ     // Catch: java.lang.Exception -> L58
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.MuteDurationEvent> r0 = com.bytedance.android.livesdk.dataChannel.MuteDurationEvent.class
            r1.FQ2(r0, r6)     // Catch: java.lang.Exception -> L58
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L58:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C751460Tdo.LJFF(X.0TLc, com.bytedance.ies.sdk.datachannel.DataChannel, X.05Vn):java.lang.Object");
    }

    public static void LJ(long j, long j2, String str, boolean z) {
        C760160Trq c760160TrqLIZJ;
        if (z) {
            c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_add_mute");
        } else {
            c760160TrqLIZJ = C759970TrX.LIZJ("ttlive_delete_mute");
        }
        c760160TrqLIZJ.LIZJ(Long.valueOf(j2), "user_id");
        c760160TrqLIZJ.LIZLLL("sec_user_id", str);
        c760160TrqLIZJ.LIZJ(Long.valueOf(j), "room_id");
        c760160TrqLIZJ.LJIIIZ();
    }

    public static void LIZLLL(boolean z, Throwable th, long j, long j2, String str) {
        C760160Trq c760160TrqLIZ;
        if (z) {
            c760160TrqLIZ = C752620Tfg.LIZ("ttlive_add_mute", th);
        } else {
            c760160TrqLIZ = C752620Tfg.LIZ("ttlive_delete_mute", th);
        }
        c760160TrqLIZ.LIZJ(Long.valueOf(j2), "user_id");
        c760160TrqLIZ.LIZLLL("sec_user_id", str);
        c760160TrqLIZ.LIZJ(Long.valueOf(j), "room_id");
        c760160TrqLIZ.LJIIIZ();
    }
}
