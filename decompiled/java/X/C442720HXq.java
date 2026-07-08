package X;

import com.ss.android.ugc.profile.business.ur.socialavatar.network.RemoteStickerAnimationTask;
import com.ss.android.ugc.profile.business.ur.socialavatar.network.StickerAnimationTasksListResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.0HXq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C442720HXq {
    public final String LIZ;
    public final C0HES LIZIZ;
    public final C01GW LIZJ;
    public final C054G LIZLLL;
    public final C2252321DDq LJ;
    public final AnonymousClass0951 LJFF;
    public AnonymousClass0956 LJI;

    public final C1910890zpH LIZIZ() {
        return (C1910890zpH) this.LIZJ.getValue();
    }

    public final void LIZLLL() {
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "sa_sticker_auto_animation_enabled", false, false)) {
            C1910890zpH c1910890zpHLIZIZ = LIZIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("triggerPolling: AB disabled for uid=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", ignoring");
            c1910890zpHLIZIZ.LIZ("SocialAvatarStickerAnimationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        AnonymousClass0956 anonymousClass0956 = this.LJI;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LJI = C23250099c.LIZLLL(this.LIZLLL, null, null, new C442710HXp(this, null), 3);
            return;
        }
        C1910890zpH c1910890zpHLIZIZ2 = LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("triggerPolling: already polling for uid=");
        sbLIZ2.append(this.LIZ);
        sbLIZ2.append(", ignoring");
        c1910890zpHLIZIZ2.LIZ("SocialAvatarStickerAnimationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public C442720HXq(String str) {
        C0HMR.LIZ.getClass();
        C0HEN c0henLIZ = C0HMR.LIZ();
        this.LIZ = str;
        this.LIZIZ = c0henLIZ;
        this.LIZJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(607));
        this.LIZLLL = C1956107lP.LIZ;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C00F6(0));
        this.LJ = c2252321DDqLIZ;
        this.LJFF = C09IC.LIZIZ(c2252321DDqLIZ);
    }

    public final void LIZ(StickerAnimationTasksListResponse stickerAnimationTasksListResponse) {
        Object value;
        List<RemoteStickerAnimationTask> list = stickerAnimationTasksListResponse.animationTasks;
        ArrayList arrayList = new ArrayList();
        for (RemoteStickerAnimationTask remoteStickerAnimationTask : list) {
            Long l = remoteStickerAnimationTask.stickerId;
            String str = remoteStickerAnimationTask.taskId;
            Integer num = remoteStickerAnimationTask.status;
            if (l != null && str != null && num != null) {
                arrayList.add(new C442740HXs(l.longValue(), str, num.intValue()));
            } else {
                C1910890zpH c1910890zpHLIZIZ = LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("applyResponse: drop malformed task stickerId=");
                sbLIZ.append(l);
                sbLIZ.append(" status=");
                sbLIZ.append(num);
                sbLIZ.append(" taskId=");
                sbLIZ.append(str);
                c1910890zpHLIZIZ.LJII("SocialAvatarStickerAnimationStatusDataSource", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (Object obj : arrayList) {
            linkedHashMap.put(Long.valueOf(((C442740HXs) obj).LIZ), obj);
        }
        C2252321DDq c2252321DDq = this.LJ;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, C00F6.LIZ((C00F6) value, linkedHashMap, false, 2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(int r12, long r13, java.lang.String r15, X.InterfaceC1364105Vn r16) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C442720HXq.LIZJ(int, long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
