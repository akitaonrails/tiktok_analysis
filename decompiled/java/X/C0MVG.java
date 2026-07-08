package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.0MVG, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MVG extends C09AY implements Function0<C0M4R> {
    public C0MVG() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0M4R] */
    @Override // kotlin.jvm.functions.Function0
    public final C0M4R invoke() {
        return new InterfaceC1443020nee() { // from class: X.0M4R
            public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(507));

            @Override // X.InterfaceC1443020nee
            public final String LIZIZ() {
                AwemeDraft awemeDraftLIZJ = C0CHQ.LIZ().LJI().LJIILJJIL().LIZJ(new C0M4L(EnumC562240M3i.BY_CREATE_TIME, EnumC562220M3g.NORMAL));
                if (awemeDraftLIZJ == null) {
                    C201955140j.LIZLLL(C0MAY.LIZIZ, "DraftNotificationService", "No draft found");
                    return null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Pair<Integer, Integer> pairLIZ = ((C0M4T) this.LIZ.getValue()).LIZ();
                int iIntValue = pairLIZ.getFirst().intValue();
                int iIntValue2 = pairLIZ.getSecond().intValue();
                long j = jCurrentTimeMillis - awemeDraftLIZJ.saveTime;
                EnumC19990213Jk enumC19990213Jk = EnumC19990213Jk.MILLISECONDS;
                long jLJIIJ = C19990113Jj.LJIIJ(C19990313Jl.LJIIIIZZ(j, enumC19990213Jk));
                C0MAY c0may = C0MAY.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("draft elapsed time: ");
                sbLIZ.append(jLJIIJ);
                sbLIZ.append(" Timeframe:[");
                sbLIZ.append(iIntValue);
                sbLIZ.append(", ");
                sbLIZ.append(iIntValue2);
                sbLIZ.append(']');
                C201955140j.LIZLLL(c0may, "DraftNotificationService", C2188811AlT.LIZIZ(sbLIZ));
                long j2 = iIntValue;
                if (j2 > jLJIIJ || jLJIIJ > iIntValue2) {
                    C201955140j.LIZLLL(c0may, "DraftNotificationService", "Latest draft not in timeframe");
                    return null;
                }
                long jLJIIJ2 = C19990113Jj.LJIIJ(C19990313Jl.LJIIIIZZ(jCurrentTimeMillis - ((C0M4T) this.LIZ.getValue()).LIZJ(), enumC19990213Jk));
                long jLJIIJ3 = C19990113Jj.LJIIJ(C19990313Jl.LJIIIIZZ(jCurrentTimeMillis - ((C0M4T) this.LIZ.getValue()).LIZIZ(), enumC19990213Jk));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Publish elapsed time:");
                sbLIZ2.append(jLJIIJ2);
                sbLIZ2.append(" Draft Box elapsed time: ");
                sbLIZ2.append(jLJIIJ3);
                C201955140j.LIZLLL(c0may, "DraftNotificationService", C2188811AlT.LIZIZ(sbLIZ2));
                if (j2 <= jLJIIJ3 && jLJIIJ3 <= iIntValue2) {
                    C201955140j.LIZLLL(c0may, "DraftNotificationService", "Latest draft box entrance in timeframe, abort");
                    return null;
                }
                if (j2 > jLJIIJ2 || jLJIIJ2 > iIntValue2) {
                    return awemeDraftLIZJ.LIZIZ().getCreationId();
                }
                C201955140j.LIZLLL(c0may, "DraftNotificationService", "Latest publish in timeframe, abort");
                return null;
            }

            @Override // X.InterfaceC1443020nee
            public final void LIZ(String str) {
                C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0M4S(str, null), 3);
            }
        };
    }
}
