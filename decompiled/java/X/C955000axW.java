package X;

import Y.AComparatorS514S0100000_15;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.view.View;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.text.a0;
import tikcast.linkmic.common.MultiGuestLayoutExtra;
import tikcast.linkmic.common.PosIdentity;
import tikcast.linkmic.common.SpotInfo;

/* JADX INFO: renamed from: X.0axW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C955000axW {
    public final boolean LIZ;
    public final DataChannel LIZIZ;
    public AwS594S0100000_15 LIZJ;
    public AwS594S0100000_15 LIZLLL;
    public AwS594S0100000_15 LJ;
    public AwS594S0100000_15 LJFF;
    public AwS224S0300000_15 LJI;
    public AwS224S0300000_15 LJII;
    public AwS594S0100000_15 LJIIIIZZ;
    public final C954990axV LJIIIZ = new InterfaceC2181591AZp() { // from class: X.0axV
        @Override // X.InterfaceC2181591AZp
        public final void LIZIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LIZLLL() {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJFF(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC942070acf enumC942070acf, EnumC942070acf enumC942070acf2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIIZ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIJ() {
        }

        @Override // X.InterfaceC2181591AZp
        public final boolean LJIJJLI() {
            return false;
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIL(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC1286590jaL enumC1286590jaL, EnumC1286590jaL enumC1286590jaL2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJJ(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, boolean z, boolean z2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJJI(EnumC965730bEp enumC965730bEp, C1283230jUv c1283230jUv, EnumC943640afC enumC943640afC, EnumC943640afC enumC943640afC2) {
        }

        @Override // X.InterfaceC2181591AZp
        public final void LIZ(String str, boolean z) {
            final long id;
            if (z || !a0.LJJIIZI(str, "EndSuccess", false) || !C955020axY.LIZJ()) {
                return;
            }
            Room roomLJJLIIIIJ = C500260Jjc.LJJLIIIIJ(this.LIZ.LIZIZ);
            if (roomLJJLIIIIJ != null) {
                id = roomLJJLIIIIJ.getId();
            } else {
                id = 0;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onSingleViewModeChange restore search layout after EndSuccess (source=");
            sbLIZ.append(str);
            sbLIZ.append(" roomId=");
            sbLIZ.append(id);
            sbLIZ.append(')');
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0axi
                public final void LIZ() {
                    long j = id;
                    if (C955020axY.LIZJ()) {
                        if (j <= 0) {
                            C20441214yg.LJIIL("QuickCoHostSearchingLayout", "restoreSearchLayoutAfterTransientInviteReject skipped invalid roomId");
                            return;
                        }
                        if (!C955020axY.LIZ()) {
                            C20441214yg.LJIIIZ("QuickCoHostSearchingLayout", "restoreSearchLayoutAfterTransientInviteReject — re-applying search layout");
                            C955130axj.LIZ(j);
                            return;
                        }
                        C20441214yg.LJIIIZ("QuickCoHostSearchingLayout", "restoreSearchLayoutAfterTransientInviteReject — requestUpdateLayout (layout model intact)");
                        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
                        if (c955010axXI30 != null) {
                            c955010axXI30.LJIIZILJ(22);
                        }
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("CoHostLayoutSDKDelegate@cb5b.externalLinkMicLayoutDelegate$1$onSingleViewModeChange$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("CoHostLayoutSDKDelegate@cb5b.externalLinkMicLayoutDelegate$1$onSingleViewModeChange$1");
                }
            });
        }

        @Override // X.InterfaceC2181591AZp
        public final C955310ay1 LJI(C955310ay1 c955310ay1, C955230axt c955230axt) {
            Double dValueOf;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onPipelineWillStart layoutModel=");
            sbLIZ.append(c955310ay1);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onPipelineWillStart  new inset top=");
            C955220axs c955220axs = c955310ay1.LJII;
            Double dValueOf2 = null;
            if (c955220axs != null) {
                dValueOf = Double.valueOf(c955220axs.LIZIZ);
            } else {
                dValueOf = null;
            }
            sbLIZ2.append(dValueOf);
            sbLIZ2.append(", source=");
            sbLIZ2.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ2));
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LJFF;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955190axp(c955310ay1, c955230axt));
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("onPipelineWillStart new inset top=");
            C955220axs c955220axs2 = c955310ay1.LJII;
            if (c955220axs2 != null) {
                dValueOf2 = Double.valueOf(c955220axs2.LIZIZ);
            }
            sbLIZ3.append(dValueOf2);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ3));
            return c955310ay1;
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIIIZZ(List<C957020b0m> list, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onOnlyWindowExtraChanged linkMicWindowView=");
            sbLIZ.append(list);
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIL(C942080acg c942080acg, C955230axt c955230axt) {
            this.LIZ.getClass();
            EnumC965730bEp enumC965730bEpLJFF = C955000axW.LJFF();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutPipelineEndSuccess currentArchType=");
            sbLIZ.append(enumC965730bEpLJFF);
            sbLIZ.append(", renderResult=");
            sbLIZ.append(C937310aUz.LJIIIIZZ(c942080acg.LIZ));
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            if (enumC965730bEpLJFF != EnumC965730bEp.CROSS) {
                return;
            }
            AwS224S0300000_15 awS224S0300000_15 = this.LIZ.LJI;
            if (awS224S0300000_15 != null) {
                awS224S0300000_15.invoke(new C955180axo(c942080acg, c955230axt));
            }
            if (C958370b2x.LIZIZ()) {
                ArrayList arrayList = new ArrayList();
                this.LIZ.getClass();
                arrayList.add(new Pair("time", C955000axW.LIZIZ()));
                arrayList.add(new Pair("desc", "sdk layout callback success"));
                arrayList.add(new Pair("func", "onLayoutPipelineEndSuccess"));
                arrayList.add(new Pair("param renderResult", C937310aUz.LJIIIIZZ(c942080acg.LIZ)));
                C956230azV.LIZ().LIZ(arrayList);
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIILJJIL(String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutWillBegin layoutKey=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            this.LIZ.getClass();
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIILL(String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutDidBegin layoutKey=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIILLIIL(C942080acg c942080acg, C955230axt c955230axt) {
            this.LIZ.getClass();
            EnumC965730bEp enumC965730bEpLJFF = C955000axW.LJFF();
            if (enumC965730bEpLJFF != EnumC965730bEp.CROSS) {
                return;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutDidChanged currentArchType=");
            sbLIZ.append(enumC965730bEpLJFF);
            sbLIZ.append(", renderResult=");
            sbLIZ.append(C937310aUz.LJIIIIZZ(c942080acg.LIZ));
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            AwS224S0300000_15 awS224S0300000_15 = this.LIZ.LJII;
            if (awS224S0300000_15 != null) {
                awS224S0300000_15.invoke(new C955170axn(c942080acg, c955230axt));
            }
            if (C958370b2x.LIZIZ()) {
                ArrayList arrayList = new ArrayList();
                this.LIZ.getClass();
                arrayList.add(new Pair("time", C955000axW.LIZIZ()));
                arrayList.add(new Pair("desc", "sdk layout callback with stream state success, goto add business ui"));
                arrayList.add(new Pair("func", "onLayoutDidChanged"));
                arrayList.add(new Pair("param renderResult", C937310aUz.LJIIIIZZ(c942080acg.LIZ)));
                C956230azV.LIZ().LIZ(arrayList);
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIZILJ(String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutWillEnd layoutKey=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIJ(String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutDidEnd layoutKey=");
            sbLIZ.append(str);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC2181591AZp
        public final void LIZJ(int i, String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutUpdateAbort code=");
            sbLIZ.append(i);
            sbLIZ.append(", msg=");
            sbLIZ.append(str);
            sbLIZ.append(" source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LJ;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955110axh(i, str, c955230axt));
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJ(int i, String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutError errorCode=");
            sbLIZ.append(i);
            sbLIZ.append(" msg=");
            sbLIZ.append(str);
            sbLIZ.append(" source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LJ;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955110axh(i, str, c955230axt));
            }
            if (C958370b2x.LIZIZ()) {
                ArrayList arrayList = new ArrayList();
                this.LIZ.getClass();
                arrayList.add(new Pair("time", C955000axW.LIZIZ()));
                arrayList.add(new Pair("desc", "layout error"));
                arrayList.add(new Pair("func", "onLayoutError"));
                arrayList.add(new Pair("param errorCode", String.valueOf(i)));
                arrayList.add(new Pair("param msg", str));
                arrayList.add(new Pair("param source", C955330ay3.LIZIZ(c955230axt)));
                C956230azV.LIZ().LIZ(arrayList);
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIIJJI(MultiGuestLayoutExtra multiGuestLayoutExtra, String str, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutExtraChanged newExtra=");
            sbLIZ.append(multiGuestLayoutExtra);
            sbLIZ.append(", cohostExtra=");
            sbLIZ.append(str);
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIILIIL(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutArchDidChanged new=");
            sbLIZ.append(enumC965730bEp2);
            sbLIZ.append(" old=");
            sbLIZ.append(enumC965730bEp);
            sbLIZ.append(" source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LIZLLL;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955160axm(enumC965730bEp2, enumC965730bEp, c955230axt));
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final Rect LJIJI(C957020b0m c957020b0m, Rect rect, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLinkMicWindowWillChangeFrame window=");
            sbLIZ.append(c957020b0m);
            sbLIZ.append(" rect=");
            sbLIZ.append(rect);
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            return rect;
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJIJJ(EnumC965730bEp enumC965730bEp, EnumC965730bEp enumC965730bEp2, C955230axt c955230axt) {
            C947470alN c947470alN;
            List<C957020b0m> list;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutArchWillChange new=");
            sbLIZ.append(enumC965730bEp2);
            sbLIZ.append(" old=");
            sbLIZ.append(enumC965730bEp);
            sbLIZ.append(" source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            if (enumC965730bEp2 != EnumC965730bEp.CROSS) {
                this.LIZ.getClass();
                C942080acg c942080acgLIZLLL = C955000axW.LIZLLL();
                if (c942080acgLIZLLL != null && (c947470alN = c942080acgLIZLLL.LIZ) != null && (list = c947470alN.LIZLLL) != null) {
                    Iterator<C957020b0m> it2 = list.iterator();
                    while (it2.hasNext()) {
                        Iterator<View> it3 = new C09RD(it2.next()).iterator();
                        while (true) {
                            C09RE c09re = (C09RE) it3;
                            if (c09re.hasNext()) {
                                View view = (View) c09re.next();
                                if ((view instanceof ViewOnClickListenerC986770bml) || (view instanceof C780900UkC)) {
                                    C930540aK4.LJJIJL(view);
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append("remove bizView=");
                                    sbLIZ2.append(view);
                                    C20441214yg.LIZIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ2));
                                }
                            }
                        }
                    }
                }
            }
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LIZJ;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955160axm(enumC965730bEp2, enumC965730bEp, c955230axt));
            }
        }

        @Override // X.InterfaceC2181591AZp
        public final void LJII(C955320ay2 c955320ay2, List<C957030b0n> list, MultiGuestLayoutExtra multiGuestLayoutExtra, C955230axt c955230axt) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLayoutInfoUpdated layoutState=");
            sbLIZ.append(c955320ay2);
            sbLIZ.append(" spotList=");
            sbLIZ.append(list);
            sbLIZ.append(", source=");
            sbLIZ.append(c955230axt);
            C20441214yg.LJIIIZ("cohostExternalLinkMicLayoutDelegate", C2188811AlT.LIZIZ(sbLIZ));
            AwS594S0100000_15 awS594S0100000_15 = this.LIZ.LJIIIIZZ;
            if (awS594S0100000_15 != null) {
                awS594S0100000_15.invoke(new C955100axg(c955320ay2, list, multiGuestLayoutExtra, c955230axt));
            }
        }
    };

    public static String LIZIZ() {
        return Build.VERSION.SDK_INT >= 26 ? LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss.SSS")) : new SimpleDateFormat("HH:mm:ss.SSS").format(new Date());
    }

    public static C955320ay2 LIZJ() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LJJLIIIJL();
    }

    public static C942080acg LIZLLL() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LJLJI();
    }

    public static List LJ() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LJLLJ();
    }

    public static EnumC965730bEp LJFF() {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ != null ? interfaceC954180awCLJIIIZ.LLIIJLIL() : null;
        if (!(interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) || (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) == null) {
            return null;
        }
        return interfaceC940060aZQ.LJJLL();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0axV] */
    public C955000axW(DataChannel dataChannel, boolean z) {
        this.LIZ = z;
        this.LIZIZ = dataChannel;
    }

    public static void LIZ(boolean z, C917100ZyO c917100ZyO) {
        InterfaceC940060aZQ interfaceC940060aZQ;
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL = null;
        if (z) {
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null) {
                interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("removeLayoutModel layoutManager=");
            sbLIZ.append(interfaceC937900aVwLLIIJLIL);
            C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
            if ((interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) && (interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL) != null) {
                interfaceC940060aZQ.LJJIJ(EnumC965730bEp.CROSS, EnumC965630bEf.DROP, c917100ZyO);
                return;
            }
            return;
        }
        InterfaceC954180awC interfaceC954180awCLJIIIZ2 = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ2 != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ2.LLIIJLIL();
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("dropLayout layoutManager=");
        sbLIZ2.append(interfaceC937900aVwLLIIJLIL);
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ2));
        if (interfaceC937900aVwLLIIJLIL == null) {
            return;
        }
        interfaceC937900aVwLLIIJLIL.LLII();
    }

    public final void LJII(List<C956260azY> list, List<SpotInfo> list2) {
        LinkedHashMap linkedHashMap;
        String str;
        InterfaceC958070b2T interfaceC958070b2TLLJJ;
        String str2;
        int i = 16;
        int i2 = 0;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (C956260azY c956260azY : list) {
                PosIdentity posIdentity = c956260azY.LIZIZ.LIZIZ;
                if (posIdentity != null && posIdentity.type == 1 && posIdentity.value != null) {
                    arrayList.add(c956260azY);
                }
            }
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
            if (iLIZIZ >= 16) {
                i = iLIZIZ;
            }
            linkedHashMap = new LinkedHashMap(i);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C957030b0n c957030b0n = ((C956260azY) it2.next()).LIZIZ;
                PosIdentity posIdentity2 = c957030b0n.LIZIZ;
                if (posIdentity2 == null || (str2 = posIdentity2.value) == null) {
                    str2 = "";
                }
                linkedHashMap.put(str2, Long.valueOf(c957030b0n.LIZ));
            }
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (SpotInfo spotInfo : list2) {
                PosIdentity posIdentity3 = spotInfo.posIdentity;
                if (posIdentity3 != null && posIdentity3.type == 1 && posIdentity3.value != null) {
                    arrayList2.add(spotInfo);
                }
            }
            int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
            if (iLIZIZ2 >= 16) {
                i = iLIZIZ2;
            }
            linkedHashMap = new LinkedHashMap(i);
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                PosIdentity posIdentity4 = ((SpotInfo) it3.next()).posIdentity;
                if (posIdentity4 == null || (str = posIdentity4.value) == null) {
                    str = "";
                }
                linkedHashMap.put(str, Long.valueOf(r1.spotId));
            }
        }
        List<LinkUser> listLLLLIILL = C915980Zwa.LJII().LLLLIILL();
        ArrayList arrayList3 = new ArrayList();
        int i3 = 0;
        for (LinkUser linkUser : listLLLLIILL) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                if (((Long) linkedHashMap.get(linkUser.linkMicId)) == null || Math.max(((int) r0.longValue()) - 1, 0) != i3) {
                    arrayList3.add(linkUser);
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            arrayList4.addAll(listLLLLIILL);
            ArrayList arrayList5 = new ArrayList(C13LP.LJLLLL(new AComparatorS514S0100000_15(linkedHashMap, 17), arrayList4));
            Iterator it4 = arrayList5.iterator();
            while (true) {
                if (!it4.hasNext()) {
                    break;
                }
                Object next = it4.next();
                Long l = ((LinkUser) next).userId;
                long jLJIILLIIL = C950220apo.LJIILLIIL(C500260Jjc.LJJLIIIIJ(this.LIZIZ));
                if (l != null && l.longValue() == jLJIILLIIL) {
                    if (next != null) {
                        arrayList5.remove(next);
                        ListProtector.add(arrayList5, 0, next);
                    }
                }
            }
            StringBuilder sb = new StringBuilder("cohost_layout_main, switchNewLayoutData, updateLocalLinkedList, before:oldList=");
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(listLLLLIILL, 10));
            int i5 = 0;
            for (LinkUser linkUser2 : listLLLLIILL) {
                int i6 = i5 + 1;
                if (i5 >= 0) {
                    LinkUser linkUser3 = linkUser2;
                    Integer numValueOf = Integer.valueOf(i5);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("name=");
                    sbLIZ.append(linkUser3.userId);
                    sbLIZ.append(",linkMicId=");
                    sbLIZ.append(linkUser3.linkMicId);
                    arrayList6.add(new Pair(numValueOf, C2188811AlT.LIZIZ(sbLIZ)));
                    i5 = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            sb.append(arrayList6);
            sb.append("},newList=");
            ArrayList arrayList7 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            int i7 = 0;
            for (Object obj : arrayList5) {
                int i8 = i7 + 1;
                if (i7 >= 0) {
                    LinkUser linkUser4 = (LinkUser) obj;
                    Integer numValueOf2 = Integer.valueOf(i7);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("name=");
                    sbLIZ2.append(linkUser4.userId);
                    sbLIZ2.append(",linkMicId=");
                    sbLIZ2.append(linkUser4.linkMicId);
                    arrayList7.add(new Pair(numValueOf2, C2188811AlT.LIZIZ(sbLIZ2)));
                    i7 = i8;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            sb.append(arrayList7);
            sb.append("}, ");
            C20441214yg.LIZIZ("CoHostLayoutAdapter", sb.toString());
            InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
            if (interfaceC954180awCLJIIIZ != null && (interfaceC958070b2TLLJJ = interfaceC954180awCLJIIIZ.LLJJ()) != null) {
                interfaceC958070b2TLLJJ.LJJJJJ(arrayList5, null);
            }
            List<LinkUser> listLLLLIILL2 = C915980Zwa.LJII().LLLLIILL();
            StringBuilder sb2 = new StringBuilder("cohost_layout_main, switchNewLayoutData, updateLocalLinkedList, after:updatedList=");
            ArrayList arrayList8 = new ArrayList(C15438062q.LJIJJ(listLLLLIILL2, 10));
            for (LinkUser linkUser5 : listLLLLIILL2) {
                int i9 = i2 + 1;
                if (i2 >= 0) {
                    LinkUser linkUser6 = linkUser5;
                    Integer numValueOf3 = Integer.valueOf(i2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("name=");
                    sbLIZ3.append(linkUser6.userId);
                    sbLIZ3.append(",linkMicId=");
                    sbLIZ3.append(linkUser6.linkMicId);
                    arrayList8.add(new Pair(numValueOf3, C2188811AlT.LIZIZ(sbLIZ3)));
                    i2 = i9;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            sb2.append(arrayList8);
            sb2.append("}, ");
            C20441214yg.LIZIZ("CoHostLayoutAdapter", sb2.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0055 A[PHI: r7
      0x0055: PHI (r7v8 java.lang.String) = (r7v3 java.lang.String), (r7v9 java.lang.String) binds: [B:25:0x0053, B:23:0x0050] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d A[PHI: r7
      0x005d: PHI (r7v4 java.lang.String) = (r7v3 java.lang.String), (r7v8 java.lang.String), (r7v8 java.lang.String) binds: [B:25:0x0053, B:27:0x0057, B:29:0x005b] A[DONT_GENERATE, DONT_INLINE]] */
    @X.InterfaceC1294060jmO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C955320ay2 r12, java.util.List<X.C956260azY> r13) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955000axW.LJIIIIZZ(X.0ay2, java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051 A[PHI: r4
      0x0051: PHI (r4v12 java.lang.String) = (r4v8 java.lang.String), (r4v13 java.lang.String) binds: [B:25:0x004f, B:23:0x004c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(java.lang.String r11, java.util.List<tikcast.linkmic.common.SpotInfo> r12) {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C955000axW.LJIIIZ(java.lang.String, java.util.List):void");
    }

    public final void LJI(C955250axv c955250axv, AbstractC957950b2H abstractC957950b2H, String str) {
        InterfaceC937900aVw interfaceC937900aVwLLIIJLIL;
        LJII(c955250axv.LIZIZ, Collections.emptyList());
        LJIIIIZZ(c955250axv.LIZ, c955250axv.LIZIZ);
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        InterfaceC940060aZQ interfaceC940060aZQ = null;
        if (interfaceC954180awCLJIIIZ != null) {
            interfaceC937900aVwLLIIJLIL = interfaceC954180awCLJIIIZ.LLIIJLIL();
        } else {
            interfaceC937900aVwLLIIJLIL = null;
        }
        if (interfaceC937900aVwLLIIJLIL instanceof InterfaceC940060aZQ) {
            interfaceC940060aZQ = (InterfaceC940060aZQ) interfaceC937900aVwLLIIJLIL;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("cohost_layout_main, switchNewLayoutData layoutManager=");
        sbLIZ.append(interfaceC937900aVwLLIIJLIL);
        sbLIZ.append(", newLayoutInterface=");
        sbLIZ.append(interfaceC940060aZQ);
        sbLIZ.append(", layoutData=");
        sbLIZ.append(C1058250de3.LIZLLL(c955250axv));
        sbLIZ.append(", triggerScene=");
        sbLIZ.append(C13LE.LIZ(abstractC957950b2H.getClass()).LJI());
        C20441214yg.LIZIZ("CoHostLayoutAdapter", C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList();
        Iterator<C956260azY> it2 = c955250axv.LIZIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZIZ);
        }
        C955340ay4 c955340ay4 = new C955340ay4(c955250axv.LIZ, arrayList, c955250axv.LIZJ, c955250axv.LIZLLL);
        C917100ZyO c917100ZyO = new C917100ZyO(String.valueOf(abstractC957950b2H.LIZ), str);
        if (interfaceC940060aZQ != null) {
            interfaceC940060aZQ.LLIL(EnumC965730bEp.CROSS, c955340ay4, c917100ZyO);
        }
        if (C958370b2x.LIZIZ()) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new Pair("time", LIZIZ()));
            arrayList2.add(new Pair("desc", "trigger switch layout"));
            arrayList2.add(new Pair("func", "switchNewLayoutData"));
            arrayList2.add(new Pair("param scene", String.valueOf(abstractC957950b2H.LIZ)));
            String strLIZLLL = C1058250de3.LIZLLL(c955340ay4);
            if (strLIZLLL == null) {
                strLIZLLL = "";
            }
            arrayList2.add(new Pair("param updateInfo", strLIZLLL));
            C956230azV.LIZ().LIZ(arrayList2);
        }
    }
}
