package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.101w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191802101w implements InterfaceC722440SVm<C0SVX> {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C102C LIZJ;
    public final C722360SVe LIZLLL;

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722470SVp<C0SVX> LJ() {
        return new InterfaceC722470SVp<C0SVX>() { // from class: X.0cJf
            public final Aweme LIZ;

            /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
            @Override // X.InterfaceC722470SVp
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C07XH LIZ() {
                /*
                    r8 = this;
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r8.LIZ
                    java.util.List r0 = r0.getEcosystemPerceptionInfos()
                    r6 = 0
                    r7 = 0
                    java.lang.String r5 = ""
                    if (r0 == 0) goto L69
                    java.util.Iterator r4 = r0.iterator()
                L10:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L67
                    java.lang.Object r3 = r4.next()
                    r0 = r3
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo r0 = (com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo) r0
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltySourceEnum r2 = r0.getPenaltySource()
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltyResultEnum r1 = r0.getPenaltyResult()
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltySourceEnum r0 = com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo.PenaltySourceEnum.TNS
                    if (r2 == r0) goto L2d
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltySourceEnum r0 = com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo.PenaltySourceEnum.FQ
                    if (r2 != r0) goto L10
                L2d:
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltyResultEnum r0 = com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo.PenaltyResultEnum.NOT_FOR_FEED
                    if (r1 == r0) goto L35
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo$PenaltyResultEnum r0 = com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo.PenaltyResultEnum.NOT_RECOMMENDED
                    if (r1 != r0) goto L10
                L35:
                    com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo r3 = (com.ss.android.ugc.aweme.feed.model.EcosystemPerceptionInfo) r3
                    if (r3 == 0) goto L69
                    java.lang.String r4 = r3.penaltyMaskLayerText
                    if (r4 == 0) goto L69
                L3d:
                    X.0SVT r3 = new X.0SVT
                    X.0SXM r0 = X.C0SXM.COLOR
                    int r2 = r0.ordinal()
                    X.101w r0 = r8.LIZIZ
                    android.content.Context r1 = r0.LIZ
                    r0 = 2131100142(0x7f0601ee, float:1.7812657E38)
                    java.lang.Integer r1 = X.C1308910kAL.LIZJ(r0, r1)
                    r0 = 2
                    r3.<init>(r2, r7, r1, r0)
                    int r0 = r4.length()
                    if (r0 == 0) goto L5b
                    r5 = r4
                L5b:
                    r0 = 72
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                    X.0SVX r0 = new X.0SVX
                    r0.<init>(r3, r5, r1, r6)
                    return r0
                L67:
                    r3 = r6
                    goto L35
                L69:
                    r4 = r5
                    goto L3d
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1007170cJf.LIZ():X.07XH");
            }

            {
                this.LIZ = this.LIZIZ.LIZIZ;
            }
        };
    }

    @Override // X.InterfaceC722440SVm
    public final C722360SVe LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC722440SVm
    public final Class<? extends InterfaceC722460SVo<C0SVX>> LIZIZ() {
        return C0SVW.class;
    }

    @Override // X.InterfaceC722440SVm
    public final C0SVZ LIZJ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC722440SVm
    public final InterfaceC722460SVo LIZLLL(InterfaceC722440SVm interfaceC722440SVm, C07XH c07xh) {
        return new C0SVW(this.LIZ, (C0SVX) c07xh);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.102C] */
    public C191802101w(Context context, Aweme aweme, final Function0 function0) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = new C0SVZ() { // from class: X.102C
            @Override // X.C0SVZ
            public final void LIZIZ() {
            }

            @Override // X.C0SVZ
            public final void LIZ() {
                C20684815ws.onEventV3("tns_profile_page_nrnff_show");
                function0.invoke();
            }
        };
        this.LIZLLL = new C722360SVe("card_mask", "nrnff", C2097908Jt.LIZJ(new Pair("item_id", aweme.getAid())));
    }
}
