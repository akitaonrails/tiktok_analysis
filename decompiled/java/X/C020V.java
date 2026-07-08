package X;

import com.bytedance.android.livesdk.grouplive.inroomranking.panel.GroupLiveRankingPanelViewModel;
import com.bytedance.android.livesdk.model.message.CompetitionRankListMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.020V, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020V extends C09AY implements Function1 {
    public final int $t;
    public long j2;
    public Object l0;
    public Object l1;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            default:
                return null;
        }
    }

    public static final Object invoke$0(C020V c020v, Object obj) {
        ((Number) obj).longValue();
        C01IS c01is = (C01IS) c020v.l0;
        long j = c01is.LJ;
        if (j > 0) {
            ((C238400w2) c020v.l1).element = c020v.j2 - j;
        }
        c01is.LJ = c020v.j2;
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$1(X.C020V r5, java.lang.Object r6) {
        /*
            X.0avK r6 = (X.EnumC953640avK) r6
            java.lang.Object r0 = r5.l0
            X.0avH r0 = (X.C953610avH) r0
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0avK> r2 = r0.LJFF
            long r0 = r5.j2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r0, r6)
            java.lang.Object r3 = r5.l1
            X.0avG r3 = (X.C953600avG) r3
            r4 = 0
            r2 = 4
            if (r3 == 0) goto L30
            int r0 = r6.getValue()
            if (r0 == 0) goto L30
            int r0 = r6.getValue()
            if (r0 == r2) goto L30
            kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r1 = r3.LJIILIIL
            if (r1 == 0) goto L2e
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.invoke(r0)
        L2e:
            r3.LJIILIIL = r4
        L30:
            java.lang.Object r3 = r5.l0
            X.0avH r3 = (X.C953610avH) r3
            int r1 = r6.getValue()
            r3.getClass()
            if (r1 == r2) goto L46
            r0 = 5
            if (r1 == r0) goto L46
            r3.LJIIIZ()
        L43:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L46:
            X.11JF r0 = r3.LJIIJ
            if (r0 == 0) goto L5c
            X.11JF r0 = r3.LJIIJ
            if (r0 == 0) goto L56
            boolean r0 = r0.isDisposed()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
        L56:
            boolean r0 = X.C500260Jjc.LJJJI(r4)
            if (r0 == 0) goto L43
        L5c:
            X.01uv r2 = new X.01uv
            r2.<init>(r3)
            X.01uo r1 = new X.01uo
            r1.<init>(r3)
            X.01uu r0 = new X.01uu
            r0.<init>(r3)
            X.11JF r0 = X.C953620avI.LJIIIZ(r2, r1, r0)
            r3.LJIIJ = r0
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C020V.invoke$1(X.020V, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$2(C020V c020v, Object obj) {
        C23250099c.LIZLLL((InterfaceC497601wk) obj, null, null, new C312101Ix(c020v.j2, (GroupLiveRankingPanelViewModel) c020v.l0, (CompetitionRankListMessage) c020v.l1, null), 3);
        return Unit.LIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020V(long j, GroupLiveRankingPanelViewModel groupLiveRankingPanelViewModel, CompetitionRankListMessage competitionRankListMessage, int i) {
        super(1);
        this.$t = i;
        this.j2 = j;
        this.l0 = groupLiveRankingPanelViewModel;
        this.l1 = competitionRankListMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020V(C01IS c01is, C238400w2 c238400w2, long j, int i) {
        super(1);
        this.$t = i;
        this.l0 = c01is;
        this.l1 = c238400w2;
        this.j2 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020V(C953610avH c953610avH, long j, C953600avG c953600avG, int i) {
        super(1);
        this.$t = i;
        this.l0 = c953610avH;
        this.j2 = j;
        this.l1 = c953600avG;
    }
}
