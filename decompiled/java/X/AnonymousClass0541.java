package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0541, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class AnonymousClass0541 implements IFrequencyControlService, IFrequencyControlSyncService {
    public static final AnonymousClass0541 LIZIZ = new AnonymousClass0541();
    public static final C12853051f LIZJ = new AbstractC12881052h<String>((AnonymousClass0531) AnonymousClass0530.LIZ.getValue()) { // from class: X.051f
        /* JADX WARN: Multi-variable type inference failed */
        @Override // X.C053I
        public final boolean LJII(FrequencyMarkRecord frequencyMarkRecord) {
            if (((String) frequencyMarkRecord).length() > 0) {
                return true;
            }
            return false;
        }

        @Override // X.C053I
        public final Pair<Boolean, String> getData(String str) {
            boolean z;
            String string = LIZ().getString(str, "");
            if (string.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            return new Pair<>(Boolean.valueOf(z), string);
        }

        @Override // X.C053I
        public final void LJFF(Object obj, String str) {
            LIZ().storeString(str, (String) obj);
        }
    };
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new AnonymousClass0545());
    public static final C01GW LJ = C452501pT.LIZIZ(new AnonymousClass0546());
    public static final C01GW LJFF = C452501pT.LIZIZ(new AnonymousClass0544());
    public final /* synthetic */ AnonymousClass0543 LIZ = AnonymousClass0543.LIZ;

    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService
    public final InterfaceC12999056v LIZ(String str, AnonymousClass0547 anonymousClass0547) {
        return this.LIZ.LIZ(str, anonymousClass0547);
    }

    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlSyncService
    public final InterfaceC12999056v LIZJ(String str) {
        return this.LIZ.LIZJ(str);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.051f] */
    static {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C057Q(null), 3);
    }

    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService
    public final void init() {
        C13002056y.LIZ.getClass();
        C13002056y.LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079 A[PHI: r2
      0x0079: PHI (r2v9 X.054c) = (r2v4 X.054c), (r2v10 X.054c) binds: [B:28:0x0077, B:26:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007d A[PHI: r2
      0x007d: PHI (r2v8 X.054c) = (r2v4 X.054c), (r2v9 X.054c) binds: [B:28:0x0077, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0081 A[PHI: r1 r2
      0x0081: PHI (r1v6 X.05uN) = (r1v9 X.05uN), (r1v10 X.05uN) binds: [B:32:0x007f, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]
      0x0081: PHI (r2v5 X.054c) = (r2v8 X.054c), (r2v9 X.054c) binds: [B:32:0x007f, B:30:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0085 A[PHI: r1 r2
      0x0085: PHI (r1v8 X.05uN) = (r1v6 X.05uN), (r1v9 X.05uN) binds: [B:34:0x0083, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE]
      0x0085: PHI (r2v7 X.054c) = (r2v5 X.054c), (r2v8 X.054c) binds: [B:34:0x0083, B:32:0x007f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1411705fn LIZIZ(X.C053W r9) {
        /*
            Method dump skipped, instruction units count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0541.LIZIZ(X.053W):X.05fn");
    }
}
