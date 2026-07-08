package X;

import Y.AfS180S0100000_11;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.story.inbox.InsertStory;
import com.tts.oecverify.BdTuring;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0sHY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620900sHY implements InterfaceC1255404vg {
    public final int $t;

    @Override // X.InterfaceC1255404vg
    public final InterfaceC1603360rpG LIZ(C2189821An6 c2189821An6, AbstractC1255880imo<?, ?> abstractC1255880imo, JediViewModel<?> jediViewModel) {
        switch (this.$t) {
            case 0:
                return LIZ$0(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 1:
                return LIZ$1(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 2:
                return LIZ$2(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 3:
                return LIZ$3(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 4:
                return LIZ$4(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 5:
                return LIZ$5(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 6:
                return LIZ$6(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 7:
                return LIZ$7(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case 8:
                return LIZ$8(this, c2189821An6, abstractC1255880imo, jediViewModel);
            case BdTuring.TYPE_ECAF /* 9 */:
                return LIZ$9(this, c2189821An6, abstractC1255880imo, jediViewModel);
            default:
                return null;
        }
    }

    public C1620900sHY(int i) {
        this.$t = i;
    }

    public static final InterfaceC1603360rpG LIZ$0(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        InterfaceC1608000rwk interfaceC1608000rwk = C1603960rqE.LIZLLL;
        if (!((Boolean) C286210BJr.LIZ.getValue()).booleanValue() && C1603960rqE.LIZLLL == interfaceC1608000rwk) {
            C1603960rqE.LIZLLL = null;
        }
        if (interfaceC1608000rwk != null) {
            String conversationId = c2189821An6.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            return new C1607980rwi(interfaceC1608000rwk, conversationId);
        }
        return new C1210260hbE();
    }

    public static final InterfaceC1603360rpG LIZ$1(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        InterfaceC1608000rwk interfaceC1608000rwk = C1603960rqE.LIZLLL;
        C1603960rqE.LIZLLL = null;
        if (interfaceC1608000rwk != null) {
            String conversationId = c2189821An6.getConversationId();
            if (conversationId == null) {
                conversationId = "";
            }
            return new C1607980rwi(interfaceC1608000rwk, conversationId);
        }
        return new C1210260hbE();
    }

    public static final InterfaceC1603360rpG LIZ$2(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C728480Shq();
    }

    public static final InterfaceC1603360rpG LIZ$3(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C728480Shq() { // from class: X.0Shn
            @Override // X.C728480Shq
            public final void LIZIZ(C2189821An6 c2189821An62) {
                String aid = c2189821An62.getAid();
                C730000SkI.LIZIZ.LIZJ(249372176, 4);
                this.LL.LIZ(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LIZLLL(aid, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS180S0100000_11(this, 8), new AfS180S0100000_11(this, 9)));
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$4(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        final C728410Shj c728410Shj;
        if (abstractC1255880imo instanceof C728410Shj) {
            c728410Shj = (C728410Shj) abstractC1255880imo;
        } else {
            c728410Shj = null;
        }
        return new C728480Shq(c728410Shj) { // from class: X.0Shm
            public final C728410Shj LLILZLL;
            public InterfaceC1209780haS LLIZ;
            public final C728510Sht LLIZLLLIL = new C1260870iur<C728410Shj, InterfaceC728550Shx>() { // from class: X.0Sht
                @Override // X.C1260870iur, X.InterfaceC1526205yG
                public final void onSuccess() {
                    InterfaceC728550Shx interfaceC728550Shx = (InterfaceC728550Shx) this.LLILLJJLI;
                    if (interfaceC728550Shx != null) {
                        interfaceC728550Shx.G90(new Pair<>(0, ((C728410Shj) this.LL).LLILLL));
                    }
                }

                @Override // X.C1260870iur, X.InterfaceC1526205yG
                public final void onFailed(Exception exc) {
                    InterfaceC728550Shx interfaceC728550Shx = (InterfaceC728550Shx) this.LLILLJJLI;
                    if (interfaceC728550Shx != null) {
                        interfaceC728550Shx.qJ1(exc);
                    }
                }
            };

            @Override // X.C728480Shq, X.InterfaceC1603360rpG
            public final Object getViewModel() {
                return null;
            }

            @Override // X.C728480Shq, X.InterfaceC1603360rpG
            public final boolean isDataEmpty() {
                return false;
            }

            @Override // X.C728480Shq, X.InterfaceC1603360rpG
            public final void unInit() {
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0Sht] */
            {
                this.LLILZLL = c728410Shj;
            }

            @Override // X.C728480Shq
            public final void LIZIZ(C2189821An6 c2189821An62) {
                LIZJ(1);
            }

            @Override // X.C728480Shq, X.InterfaceC1603360rpG
            public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
                this.LLIZ = interfaceC1209780haS;
                C728510Sht c728510Sht = this.LLIZLLLIL;
                c728510Sht.LLILLJJLI = interfaceC1209780haS;
                C728410Shj c728410Shj2 = this.LLILZLL;
                if (c728410Shj2 != null) {
                    c728510Sht.LJIIJ(c728410Shj2);
                }
            }

            @Override // X.C728480Shq, X.InterfaceC1603360rpG
            public final int getPageType(int i) {
                C728410Shj c728410Shj2 = this.LLILZLL;
                if (c728410Shj2 == null || !c728410Shj2.LLILLJJLI) {
                    return 0;
                }
                return 40;
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$5(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C728480Shq() { // from class: X.0Sho
            public static final /* synthetic */ int LLILZLL = 0;

            @Override // X.C728480Shq
            public final void LIZIZ(C2189821An6 c2189821An62) {
                C730000SkI.LIZIZ.LIZJ(249372176, 4);
                String aid = c2189821An62.getAid();
                if (aid != null) {
                    this.LL.LIZ(C1618440sDa.LIZIZ.LJJLIIIJLJLI().LJII(aid).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS180S0100000_11(this, 11), new AfS180S0100000_11(this, 12)));
                }
            }
        };
    }

    public static final InterfaceC1603360rpG LIZ$6(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C726780Sf6(c2189821An6);
    }

    public static final InterfaceC1603360rpG LIZ$7(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C728490Shr();
    }

    public static final InterfaceC1603360rpG LIZ$8(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        C728350Shd c728350Shd;
        if (abstractC1255880imo instanceof C728350Shd) {
            c728350Shd = (C728350Shd) abstractC1255880imo;
        } else {
            c728350Shd = null;
        }
        return new C728590Si1(c728350Shd);
    }

    public static final InterfaceC1603360rpG LIZ$9(C1620900sHY c1620900sHY, C2189821An6 c2189821An6, AbstractC1255880imo abstractC1255880imo, JediViewModel jediViewModel) {
        return new C728480Shq() { // from class: X.0Shl
            @Override // X.C728480Shq
            public final void LIZIZ(C2189821An6 c2189821An62) {
                String aid = c2189821An62.getAid();
                String uid = c2189821An62.getUid();
                String string = Collections.singletonList(uid).toString();
                String strLIZ = C728840SiQ.LIZ(new InsertStory(CastLongProtector.parseLong(uid), CastLongProtector.parseLong(aid)));
                C730000SkI.LIZIZ.LIZJ(249372176, 4);
                this.LL.LIZ(C728370Shf.LIZ(C728370Shf.LIZ, string, strLIZ, 0, null, 12).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LJJIIZ(new AfS180S0100000_11(this, 13), new AfS180S0100000_11(this, 14)));
            }
        };
    }
}
