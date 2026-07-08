package Y;

import X.C09JN;
import X.C123100dR;
import X.C1417710mzp;
import X.C1419510n2j;
import X.C1441050nbT;
import X.C1441070nbV;
import X.C1447650nm7;
import X.C1449860npg;
import X.C1449870nph;
import X.C1C7U;
import X.C201955140j;
import X.C2188811AlT;
import X.C2286708xd;
import X.C259800zU;
import X.C348100Dkm;
import X.C348450DlL;
import X.C352130DrH;
import X.C385200F8k;
import X.InterfaceC1419480n2g;
import X.InterfaceC1449880npi;
import X.InterfaceC2329309At;
import X.InterfaceC420801kM;
import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.smartmovie.jni.CommonRequestCallback;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes23.dex */
public class AfS114S0300000_22 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
            case 3:
                accept$3(this, obj);
                break;
            case 4:
                accept$4(this, obj);
                break;
            case 5:
                accept$5(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS114S0300000_22 afS114S0300000_22, Object obj) {
        C1C7U.LIZ("ReuseTemplateProcessorComponent@4454.applyTemplate$1$2");
        ((C1441070nbV) afS114S0300000_22.l0).q3((SingleImageData) afS114S0300000_22.l1);
        C385200F8k.LIZJ("ReuseTemplateProcessorComponent", "applyTemplate succeed");
        ((InterfaceC2329309At) afS114S0300000_22.l2).onSuccess(Unit.LIZ);
        C1C7U.LIZIZ("ReuseTemplateProcessorComponent@4454.applyTemplate$1$2");
    }

    public static final void accept$1(AfS114S0300000_22 afS114S0300000_22, Object obj) {
        C1C7U.LIZ("ReuseTemplateProcessorComponent@4454.applyTemplate$1$3");
        C385200F8k.LIZIZ("ReuseTemplateProcessorComponent", "applyTemplate failed", (Throwable) obj);
        ((C1441070nbV) afS114S0300000_22.l0).m3((SingleImageData) afS114S0300000_22.l1);
        ((InterfaceC2329309At) afS114S0300000_22.l2).onError(new RuntimeException("applyTemplate failed"));
        C1C7U.LIZIZ("ReuseTemplateProcessorComponent@4454.applyTemplate$1$3");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(2:78|(0)(9:81|311|82|(1:86)|87|90|(1:92)|93|(10:295|95|297|96|(1:100)|101|106|(1:108)|109|(10:305|111|309|112|(1:116)|117|122|(1:124)|125|(8:127|(1:129)(1:144)|130|(1:132)(1:143)|133|(1:135)(1:142)|136|(2:138|(2:140|141)(49:145|(1:147)(1:160)|148|(2:149|(2:151|(1:320)(1:321))(2:319|159))|153|(1:155)|156|(1:158)|317|161|(1:163)(1:164)|291|165|(2:167|(2:169|(1:171))(0))(1:172)|293|173|(2:175|(3:177|(2:179|181)|182)(2:181|182))(1:180)|183|(3:299|185|(1:194)(1:193))(1:195)|315|196|208|(1:210)|211|(1:213)|214|(1:216)|217|(1:219)|220|(1:222)|223|(1:225)|307|226|(1:228)(1:230)|229|233|(1:235)(1:239)|236|(1:238)|301|240|(1:242)(1:244)|243|247|(1:249)(1:274)|250|(7:252|(1:254)(1:273)|255|(1:257)(1:272)|(1:271)(1:261)|262|(2:(1:267)(1:270)|268)(1:(3:265|(0)(0)|268)(3:269|270|268)))))(2:275|276))(2:277|278))(2:279|280))(2:281|282)))(1:72)|73|(0)(1:77)|311|82|(7:84|86|87|90|(0)|93|(0)(0))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b9, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ba, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        r3 = new X.C098200Yq(r2);
        X.C189200o6.m2constructorimpl(r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03e4 A[Catch: all -> 0x03f9, TryCatch #8 {all -> 0x03f9, blocks: (B:226:0x03d8, B:228:0x03e4, B:229:0x03f3), top: B:307:0x03d8 }] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0438 A[Catch: 0n2U -> 0x0443, TryCatch #5 {0n2U -> 0x0443, blocks: (B:240:0x042a, B:242:0x0438, B:243:0x043c), top: B:301:0x042a }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x04cc A[PHI: r0
      0x04cc: PHI (r0v46 java.lang.String) = (r0v44 java.lang.String), (r0v47 java.lang.String) binds: [B:266:0x04a8, B:269:0x04cb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x01d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a0 A[PHI: r18
      0x01a0: PHI (r18v1 int) = (r18v0 int), (r18v3 int), (r18v3 int) binds: [B:79:0x019d, B:74:0x018f, B:76:0x0196] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void accept$2(Y.AfS114S0300000_22 r35, java.lang.Object r36) {
        /*
            Method dump skipped, instruction units count: 1299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AfS114S0300000_22.accept$2(Y.AfS114S0300000_22, java.lang.Object):void");
    }

    public static final void accept$3(AfS114S0300000_22 afS114S0300000_22, Object obj) {
        String str;
        C1C7U.LIZ("AutoCutTosDelegate@4f50.getTosUrl$3");
        String str2 = (String) obj;
        InterfaceC420801kM interfaceC420801kM = (InterfaceC420801kM) ((C259800zU) afS114S0300000_22.l0).element;
        if (interfaceC420801kM != null) {
            interfaceC420801kM.dispose();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoCutTosDelegate getTosUrl success zipUrl=");
        sbLIZ.append(str2);
        C1417710mzp.LIZ(LogLevel.LEVEL_INFO, C2188811AlT.LIZIZ(sbLIZ));
        CommonRequestCallback commonRequestCallback = (CommonRequestCallback) afS114S0300000_22.l1;
        if (commonRequestCallback != null) {
            if (str2 == null) {
                str = "";
            } else {
                str = str2;
            }
            commonRequestCallback.onSuccess(str);
        }
        InterfaceC1419480n2g interfaceC1419480n2g = ((C1419510n2j) afS114S0300000_22.l2).LIZJ;
        if (interfaceC1419480n2g != null) {
            if (str2 == null) {
                str2 = "";
            }
            interfaceC1419480n2g.LJI(0, null, str2, true);
        }
        C1C7U.LIZIZ("AutoCutTosDelegate@4f50.getTosUrl$3");
    }

    public static final void accept$4(AfS114S0300000_22 afS114S0300000_22, Object obj) {
        C1C7U.LIZ("CanvasEmbeddedAttributionLinkStickerView@a3a7.addStickerInternal$1");
        C1441050nbT c1441050nbT = (C1441050nbT) obj;
        C1449860npg c1449860npg = (C1449860npg) afS114S0300000_22.l0;
        StickerItemModel stickerItemModel = c1449860npg.LIZJ;
        stickerItemModel.path = c1441050nbT.LIZ;
        InterfaceC1449880npi interfaceC1449880npi = (InterfaceC1449880npi) afS114S0300000_22.l1;
        c1449860npg.LJIIIZ = c1441050nbT;
        if (c1449860npg.LIZIZ || (C123100dR.LIZ(stickerItemModel.uuid) && C2286708xd.LIZJ(c1449860npg.LIZJ.path))) {
            c1449860npg.LJIIIIZZ = c1449860npg.LIZJ.uuid;
        } else {
            c1449860npg.LJII(c1441050nbT, interfaceC1449880npi.LIZIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addStickerOnBitmapRender,xOffset:");
            sbLIZ.append(c1449860npg.LJ);
            sbLIZ.append(",yOffset:");
            sbLIZ.append(c1449860npg.LJFF);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CanvasEmbeddedSticker->");
            sbLIZ2.append(strLIZIZ);
            C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            C348450DlL c348450DlL = new C348450DlL(true, 7);
            c348450DlL.LJIIL = c1441050nbT.LIZ;
            c348450DlL.LJFF = c1449860npg.LJ;
            c348450DlL.LJI = c1449860npg.LJFF;
            c348450DlL.LJIILIIL = c1441050nbT.LIZIZ / interfaceC1449880npi.LIZIZ().getFirst().floatValue();
            c348450DlL.LJIILJJIL = c1441050nbT.LIZJ / interfaceC1449880npi.LIZIZ().getSecond().floatValue();
            c348450DlL.LIZJ = c1449860npg.LIZJ.layerWeight;
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1449880npi.LLFII());
            if (c348100DkmLIZIZ != null) {
                String strLJJJJI = c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                c1449860npg.LJIIIIZZ = strLJJJJI;
                c1449860npg.LIZJ.uuid = strLJJJJI;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ((Function0) afS114S0300000_22.l2).invoke();
        C1C7U.LIZIZ("CanvasEmbeddedAttributionLinkStickerView@a3a7.addStickerInternal$1");
    }

    public static final void accept$5(AfS114S0300000_22 afS114S0300000_22, Object obj) {
        C1C7U.LIZ("VECanvasEmbeddedTextStickerView@97f5.addStickerInternal$1");
        C1447650nm7 c1447650nm7 = (C1447650nm7) obj;
        C1449870nph c1449870nph = (C1449870nph) afS114S0300000_22.l0;
        StickerItemModel stickerItemModel = c1449870nph.LIZJ;
        stickerItemModel.path = c1447650nm7.LIZ;
        InterfaceC1449880npi interfaceC1449880npi = (InterfaceC1449880npi) afS114S0300000_22.l1;
        c1449870nph.LJIIL = c1447650nm7;
        if (c1449870nph.LIZIZ || (C123100dR.LIZ(stickerItemModel.uuid) && C2286708xd.LIZJ(c1449870nph.LIZJ.path))) {
            c1449870nph.LJIIJJI = c1449870nph.LIZJ.uuid;
        } else {
            c1449870nph.LJII(c1447650nm7, interfaceC1449880npi.LIZIZ());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("addStickerOnBitmapRender,xOffset:");
            sbLIZ.append(c1449870nph.LJI);
            sbLIZ.append(",yOffset:");
            sbLIZ.append(c1449870nph.LJII);
            C1449870nph.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
            C348450DlL c348450DlL = new C348450DlL(false, 15);
            c348450DlL.LJIIL = c1447650nm7.LIZ;
            c348450DlL.LJFF = c1449870nph.LJI;
            c348450DlL.LJI = c1449870nph.LJII;
            c348450DlL.LJIILIIL = c1447650nm7.LIZIZ / interfaceC1449880npi.LIZIZ().getFirst().floatValue();
            c348450DlL.LJIILJJIL = c1447650nm7.LIZJ / interfaceC1449880npi.LIZIZ().getSecond().floatValue();
            c348450DlL.LIZJ = c1449870nph.LIZJ.layerWeight;
            C348100Dkm c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1449880npi.LLFII());
            if (c348100DkmLIZIZ != null) {
                String strLJJJJI = c348100DkmLIZIZ.LJIIIZ().LJJJJI(c348450DlL);
                c1449870nph.LJIIJJI = strLJJJJI;
                c1449870nph.LIZJ.uuid = strLJJJJI;
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        ((Function0) afS114S0300000_22.l2).invoke();
        C1C7U.LIZIZ("VECanvasEmbeddedTextStickerView@97f5.addStickerInternal$1");
    }

    public AfS114S0300000_22(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
