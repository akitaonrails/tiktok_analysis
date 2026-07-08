package X;

import android.content.Context;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.component.danmaku.model.AnoleDanmakuData;
import com.ss.android.ugc.aweme.component.danmaku.model.Danmu;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dHp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044470dHp extends AbstractC1014240cV4 {
    public final C01GW LLJLIL;
    public final boolean LLJLILLLLZIIL;
    public final C1044630dI5 LLJLL;
    public C1044530dHv LLJLLIL;
    public C1047640dMw LLJLLL;
    public C1044510dHt LLJZ;

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LIZ() {
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        for (C1044640dI6 c1044640dI6 : ((LinkedHashMap) this.LLJLL.LIZ).values()) {
            int i = c1044640dI6.LIZLLL;
            if (i == 0) {
                j += (long) c1044640dI6.LIZJ;
            } else if (i == 1) {
                j2 += (long) c1044640dI6.LIZJ;
            } else if (i == 2) {
                j3 += (long) c1044640dI6.LIZJ;
            }
        }
        LJIIJ().logAd(C1044490dHr.LIZ, new AwS595S0100000_16(new C1044480dHq(j, j2, j3), 411));
        super.LIZ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJ() {
        C1044530dHv c1044530dHv = this.LLJLLIL;
        if (c1044530dHv != null) {
            c1044530dHv.LIZ.LIZLLL();
        }
        this.LLJLLIL = null;
        C1047640dMw c1047640dMw = this.LLJLLL;
        if (c1047640dMw != null) {
            C1044570dHz.LIZ = new C1044500dHs(0, 0);
            c1047640dMw.LIZ(1.0f);
            c1047640dMw.LJI = -1L;
            c1047640dMw.LJII = null;
            c1047640dMw.LJFF.stop();
        }
        this.LLJLLL = null;
        super.LJ();
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void LJFF() {
        C1044510dHt c1044510dHt = this.LLJZ;
        if (c1044510dHt != null) {
            c1044510dHt.LIZ();
        }
        this.LLJZ = null;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final C1014500cVU isReady() {
        AnoleDanmakuData anoleDanmakuData = (AnoleDanmakuData) this.LLJLIL.getValue();
        return (anoleDanmakuData == null || anoleDanmakuData.getDanmuList() == null) ? new C1014500cVU(false, "data parse error") : new C1014500cVU(true, "");
    }

    @Override // X.AbstractC1014240cV4
    public final void LJIJI() {
        super.LJIJI();
        C1047640dMw c1047640dMw = this.LLJLLL;
        if (c1047640dMw != null) {
            C1044570dHz.LIZ = new C1044500dHs(0, 0);
            c1047640dMw.LIZ(1.0f);
            c1047640dMw.LJI = -1L;
            c1047640dMw.LJII = null;
            c1047640dMw.LJFF.stop();
        }
        ((LinkedHashMap) this.LLJLL.LIZIZ).clear();
        this.LLJLL.LIZ();
    }

    @Override // X.AbstractC1014240cV4
    public final boolean LJIILJJIL() {
        return this.LLJLILLLLZIIL;
    }

    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Mk(AbstractC1003980cEW abstractC1003980cEW) {
        C1047640dMw c1047640dMw;
        C1044610dI3 c1044610dI3;
        long j;
        if ((abstractC1003980cEW instanceof AbstractC1003210cDH) && (c1047640dMw = this.LLJLLL) != null) {
            AbstractC1003210cDH abstractC1003210cDH = (AbstractC1003210cDH) abstractC1003980cEW;
            if (Intrinsics.LJFF(abstractC1003210cDH, C1003190cDF.LIZ)) {
                ((LinkedHashMap) c1047640dMw.LIZJ.LIZIZ).clear();
                c1047640dMw.LIZJ.LIZ();
                C1044570dHz.LIZ = new C1044500dHs(0, 0);
                c1047640dMw.LIZ(1.0f);
                c1047640dMw.LJI = -1L;
                List<Danmu> list = c1047640dMw.LIZIZ;
                ArrayList arrayList = new ArrayList();
                for (Danmu danmu : list) {
                    Danmu danmu2 = danmu;
                    String str = danmu2.text;
                    if (str != null && !a0.LJJJIL(str) && !danmu2.isTimed()) {
                        arrayList.add(danmu);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    int i = ((Danmu) obj).type;
                    if (i == 1 || i == 2) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : arrayList) {
                    int i2 = ((Danmu) obj2).type;
                    if (i2 != 1 && i2 != 2) {
                        arrayList3.add(obj2);
                    }
                }
                C1044610dI3 c1044610dI32 = new C1044610dI3(arrayList2, arrayList3);
                c1047640dMw.LJII = c1044610dI32;
                Map<Integer, List<Double>> map = C1044620dI4.LIZ;
                C1044600dI2 c1044600dI2LIZ = C1044620dI4.LIZ(c1047640dMw.LIZ, c1044610dI32, c1047640dMw.LIZLLL, c1047640dMw.LIZJ, 0L);
                c1047640dMw.LJFF.LJJIIZ(0L, c1044600dI2LIZ.LIZ);
                c1047640dMw.LJFF.LJIIJJI(0L);
                if (!c1044600dI2LIZ.LIZ.isEmpty()) {
                    c1044610dI32.LIZ(c1044600dI2LIZ);
                    long j2 = c1044600dI2LIZ.LIZLLL;
                    long j3 = c1047640dMw.LJI;
                    if (j3 >= 0) {
                        long j4 = j3 + 1;
                        if (j2 < j4) {
                            j2 = j4;
                        }
                    }
                    c1047640dMw.LJI = j2;
                    c1047640dMw.LJ.invoke(Long.valueOf(j2));
                    return;
                }
                return;
            }
            if (Intrinsics.LJFF(abstractC1003210cDH, C1003230cDJ.LIZ)) {
                c1047640dMw.LJFF.LJIIJ(0L);
                c1047640dMw.LJFF.LJIIJJI(0L);
                return;
            }
            if (Intrinsics.LJFF(abstractC1003210cDH, C1003180cDE.LIZ)) {
                c1047640dMw.LJFF.resume();
                return;
            }
            if (Intrinsics.LJFF(abstractC1003210cDH, C1003170cDD.LIZ)) {
                c1047640dMw.LJFF.pause();
                return;
            }
            if (abstractC1003210cDH instanceof C1003200cDG) {
                c1047640dMw.LIZ(((C1003200cDG) abstractC1003210cDH).LIZ);
                return;
            }
            if (Intrinsics.LJFF(abstractC1003210cDH, C1003220cDI.LIZ)) {
                C1044570dHz.LIZ = new C1044500dHs(0, 0);
                c1047640dMw.LIZ(1.0f);
                c1047640dMw.LJI = -1L;
                c1047640dMw.LJII = null;
                c1047640dMw.LJFF.pause();
                return;
            }
            if (abstractC1003210cDH instanceof C1003240cDK) {
                long j5 = ((C1003240cDK) abstractC1003210cDH).LIZ;
                long j6 = c1047640dMw.LJI;
                if ((j6 < 0 || j5 >= j6) && (c1044610dI3 = c1047640dMw.LJII) != null) {
                    c1047640dMw.LJI = -1L;
                    Map<Integer, List<Double>> map2 = C1044620dI4.LIZ;
                    Context context = c1047640dMw.LIZ;
                    C1044700dIC c1044700dIC = c1047640dMw.LIZLLL;
                    C1044630dI5 c1044630dI5 = c1047640dMw.LIZJ;
                    C1044500dHs c1044500dHs = C1044570dHz.LIZ;
                    int i3 = c1044500dHs.LIZIZ;
                    if (i3 <= 0) {
                        j = 0;
                    } else {
                        int i4 = c1044500dHs.LIZ / 2;
                        if (i3 < i4) {
                            i3 = i4;
                        }
                        j = ((long) (((i3 + r3) - 1) / c1047640dMw.LIZLLL.LIZ)) * 200;
                        if (j > 1500) {
                            j = 1500;
                        }
                    }
                    C1044600dI2 c1044600dI2LIZ2 = C1044620dI4.LIZ(context, c1044610dI3, c1044700dIC, c1044630dI5, j);
                    if (!c1044600dI2LIZ2.LIZ.isEmpty()) {
                        c1047640dMw.LJFF.LIZLLL(c1044600dI2LIZ2.LIZ);
                        c1047640dMw.LJFF.LJJIIZI();
                        c1044610dI3.LIZ(c1044600dI2LIZ2);
                        long j7 = c1044600dI2LIZ2.LIZLLL;
                        long j8 = c1047640dMw.LJI;
                        if (j8 >= 0) {
                            long j9 = j8 + 1;
                            if (j7 < j9) {
                                j7 = j9;
                            }
                        }
                        c1047640dMw.LJI = j7;
                        c1047640dMw.LJ.invoke(Long.valueOf(j7));
                        return;
                    }
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0cDL] */
    /* JADX WARN: Type inference failed for: r6v1, types: [X.0dHo] */
    @Override // X.AbstractC1014240cV4, X.InterfaceC1007930cKt
    public final void Fk(ViewGroup viewGroup, InterfaceC1014340cVE interfaceC1014340cVE) {
        int iIntValue;
        List<Danmu> danmuList;
        Integer lineCount;
        super.Fk(viewGroup, interfaceC1014340cVE);
        final Context context = viewGroup.getContext();
        if (context == null) {
            context = this.LLILZ;
        }
        final C1044530dHv c1044530dHv = new C1044530dHv(context);
        this.LLJLLIL = c1044530dHv;
        this.LLJJIJIL = c1044530dHv.LIZ;
        AnoleDanmakuData anoleDanmakuData = (AnoleDanmakuData) this.LLJLIL.getValue();
        final C1047640dMw c1047640dMw = null;
        if (anoleDanmakuData != null && (lineCount = anoleDanmakuData.getLineCount()) != null) {
            iIntValue = lineCount.intValue();
        } else {
            iIntValue = 3;
        }
        C1044700dIC c1044700dIC = new C1044700dIC(C13LZ.LJ(iIntValue, 2, 4), 30);
        final C1044510dHt c1044510dHt = new C1044510dHt(new InterfaceC1044550dHx(context, this) { // from class: X.0cDL
            public final Context LIZ;
            public final Aweme LIZIZ;
            public final AwemeRawAd LIZJ;
            public final String LIZLLL;
            public final String LJ;
            public final AnoleDanmakuData LJFF;

            @Override // X.InterfaceC1044550dHx
            public final AnoleDanmakuData LIZ() {
                return this.LJFF;
            }

            @Override // X.InterfaceC1044540dHw
            public final Aweme getAweme() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC1044540dHw
            public final Context getContext() {
                return this.LIZ;
            }

            @Override // X.InterfaceC1044540dHw
            public final AwemeRawAd getRawAd() {
                return this.LIZJ;
            }

            @Override // X.InterfaceC1044540dHw
            public final String getRefer() {
                return this.LJ;
            }

            @Override // X.InterfaceC1044540dHw
            public final String getTag() {
                return this.LIZLLL;
            }

            {
                Aweme aweme;
                this.LIZ = context;
                C1009340cNA c1009340cNA = this.LLILLJJLI;
                Object obj = c1009340cNA.LIZJ;
                if (obj instanceof Aweme) {
                    aweme = (Aweme) obj;
                } else {
                    aweme = null;
                }
                this.LIZIZ = aweme;
                this.LIZJ = c1009340cNA.LIZLLL;
                this.LIZLLL = this.LL.getTag();
                this.LJ = this.LL.getRefer();
                this.LJFF = (AnoleDanmakuData) this.LLJLIL.getValue();
            }
        });
        this.LLJZ = c1044510dHt;
        AnoleDanmakuData anoleDanmakuData2 = (AnoleDanmakuData) this.LLJLIL.getValue();
        if (anoleDanmakuData2 != null && (danmuList = anoleDanmakuData2.getDanmuList()) != null) {
            c1047640dMw = new C1047640dMw(context, danmuList, this.LLJLL, c1044700dIC, new AwS595S0100000_16(this, 412));
            C1384530m8J c1384530m8J = c1047640dMw.LJFF.LIZIZ.LJ;
            int iLIZ = C0GTM.LIZ(R.attr.a1i, context);
            int i = c1384530m8J.LIZIZ;
            c1384530m8J.LIZIZ = iLIZ;
            c1384530m8J.LJI.LIZ(1201);
            c1044530dHv.LIZ.LJ(c1047640dMw.LJFF);
            final Context context2 = context;
            c1047640dMw.LJFF.LIZLLL = new C1045110dIr(new InterfaceC1045100dIq(context2, c1047640dMw, c1044530dHv, this, c1044510dHt) { // from class: X.0dHo
                public final Context LIZ;
                public final C1396830mS9 LIZIZ;
                public final C1044530dHv LIZJ;
                public final C1044630dI5 LIZLLL;
                public final AwS595S0100000_16 LJ;
                public final C1014660cVk LJFF;

                @Override // X.InterfaceC1045100dIq
                public final C1396830mS9 D0() {
                    return this.LIZIZ;
                }

                @Override // X.InterfaceC1045100dIq
                public final AwS595S0100000_16 LIZ() {
                    return this.LJ;
                }

                @Override // X.InterfaceC1045100dIq
                public final C1044530dHv LIZIZ() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC1045100dIq
                public final C1044630dI5 LIZJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC1045100dIq
                public final Context getContext() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC1045100dIq
                public final C1014660cVk getLogger() {
                    return this.LJFF;
                }

                {
                    this.LIZ = context2;
                    this.LIZIZ = c1047640dMw.LJFF;
                    this.LIZJ = c1044530dHv;
                    this.LIZLLL = this.LLJLL;
                    this.LJ = new AwS595S0100000_16(c1044510dHt, 413);
                    this.LJFF = this.LJIIJ();
                }
            });
        }
        this.LLJLLL = c1047640dMw;
    }

    public C1044470dHp(AnoleComponentModel anoleComponentModel, C1009340cNA c1009340cNA, InterfaceC1014270cV7 interfaceC1014270cV7, Context context) {
        super(anoleComponentModel, c1009340cNA, interfaceC1014270cV7, context);
        this.LLJLIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, anoleComponentModel, 952));
        this.LLJLILLLLZIIL = true;
        this.LLJLL = new C1044630dI5();
    }
}
