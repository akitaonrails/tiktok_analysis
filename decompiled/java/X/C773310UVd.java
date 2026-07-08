package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import webcast.api.room.DeviceSignalInfo;

/* JADX INFO: renamed from: X.0UVd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C773310UVd {
    public final C557050Lt1 LIZ = new C557050Lt1(false);
    public final ArrayList<Long> LIZIZ = new ArrayList<>();
    public final C0UWA LIZJ = new C0UWA(0);
    public final C0UWA LIZLLL = new C0UWA(0);
    public long LJ;
    public long LJFF;

    public final void LIZ(DeviceSignalInfo deviceSignalInfo) {
        int size = this.LIZIZ.size();
        if (size > 0) {
            long jLongValue = ((Number) C13LP.LJJLJ(this.LIZIZ)).longValue();
            ArrayList<Long> arrayList = this.LIZIZ;
            int i = 0;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator<Long> it2 = arrayList.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if (it2.next().longValue() > 5 && (i = i + 1) < 0) {
                        C1697810uHb.LJIJ();
                        throw null;
                    }
                }
            }
            long jLIZ = this.LIZJ.LIZ();
            long jLIZ2 = this.LIZLLL.LIZ();
            long j = 0;
            if (this.LIZ.LIZIZ() && jLIZ2 > 0) {
                jLIZ = this.LIZJ.LIZ.addAndGet((System.currentTimeMillis() - jLIZ2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                this.LIZLLL.LIZIZ(System.currentTimeMillis());
                C20441214yg.LIZIZ("DeviceSignalInfo", "muteduration: " + this.LIZJ.LIZ());
            }
            List<DeviceSignalInfo.MicrophoneVolume> list = deviceSignalInfo.microphoneVolume;
            DeviceSignalInfo.MicrophoneVolume microphoneVolume = new DeviceSignalInfo.MicrophoneVolume();
            microphoneVolume.firstRecordTime = this.LJ;
            microphoneVolume.lastRecordTime = this.LJFF;
            microphoneVolume.maxMicroSound = jLongValue;
            long j2 = size;
            long j3 = j2 - jLIZ;
            if (j3 >= 0) {
                j = j3;
            }
            if (j <= j2) {
                j2 = j;
            }
            microphoneVolume.unmuteDuration = j2;
            microphoneVolume.effectiveSoundDuration = i;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("VolumeInfo: firstRecordTime = ");
            sbLIZ.append(microphoneVolume.firstRecordTime);
            sbLIZ.append(", lastRecordTime = ");
            sbLIZ.append(microphoneVolume.lastRecordTime);
            sbLIZ.append(", maxMicroSound = ");
            sbLIZ.append(microphoneVolume.maxMicroSound);
            sbLIZ.append(", unmuteDuration = ");
            sbLIZ.append(microphoneVolume.unmuteDuration);
            sbLIZ.append(", effectiveSoundDuration = ");
            sbLIZ.append(microphoneVolume.effectiveSoundDuration);
            sbLIZ.append(", maxMicroSound = ");
            sbLIZ.append(microphoneVolume.maxMicroSound);
            sbLIZ.append(", unmuteDuration = ");
            sbLIZ.append(microphoneVolume.unmuteDuration);
            sbLIZ.append(", effectiveSoundDuration = ");
            sbLIZ.append(microphoneVolume.effectiveSoundDuration);
            C20441214yg.LIZIZ("DeviceSignalInfo", C2188811AlT.LIZIZ(sbLIZ));
            list.add(microphoneVolume);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC769940UIe r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C773320UVe
            if (r0 == 0) goto L53
            r4 = r8
            X.0UVe r4 = (X.C773320UVe) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L53
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L49
            if (r0 != r3) goto L59
            X.0UIe r7 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            long r0 = java.lang.System.currentTimeMillis()
            r6.LJFF = r0
            java.util.ArrayList<java.lang.Long> r2 = r6.LIZIZ
            if (r7 == 0) goto L46
            long r0 = r7.LIZIZ()
        L32:
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
            r2.add(r0)
            r4.LL = r7
            r4.LLILZ = r3
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r4)
            if (r0 != r5) goto L24
            return r5
        L46:
            r0 = 0
            goto L32
        L49:
            X.C155000ia.LIZIZ(r1)
            long r0 = java.lang.System.currentTimeMillis()
            r6.LJ = r0
            goto L24
        L53:
            X.0UVe r4 = new X.0UVe
            r4.<init>(r6, r8)
            goto L12
        L59:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C773310UVd.LIZIZ(X.0UIe, X.05Vn):java.lang.Object");
    }
}
