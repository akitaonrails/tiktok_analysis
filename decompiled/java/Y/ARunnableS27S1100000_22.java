package Y;

import X.AbstractC1433570nPP;
import X.C1417710mzp;
import X.C1420050n3b;
import X.C1433500nPI;
import X.C1433530nPL;
import X.C1433730nPf;
import X.C1433740nPg;
import X.C15438062q;
import X.C1664750tQH;
import X.C1C7U;
import X.InterfaceC1433360nP4;
import X.InterfaceC2217461Bqa;
import com.bytedance.ies.nle.editor_jni.INLEPlayer;
import com.ss.android.ugc.aweme.commerce.tools.sticker.service.CommerceToolsStickerServiceImpl;
import com.ss.android.ugc.aweme.creative.model.AutoCutAsyncRenderModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class ARunnableS27S1100000_22 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (((C1420050n3b) this.l1).LJIIJ.get()) {
            return;
        }
        C1420050n3b c1420050n3b = (C1420050n3b) this.l1;
        C1664750tQH c1664750tQH = c1420050n3b.LIZIZ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = C1420050n3b.LJIJ;
        AutoCutModel autoCutModel = ((VideoPublishEditModel) c1664750tQH.getValue(c1420050n3b, interfaceC2217461BqaArr[0])).creativeModel.autoCutModel;
        C1420050n3b c1420050n3b2 = (C1420050n3b) this.l1;
        String str = this.s0;
        Set<String> set = autoCutModel.asyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        if (set == null || set.isEmpty()) {
            return;
        }
        INLEPlayer iNLEPlayer = c1420050n3b2.LJIILLIIL;
        long duration = iNLEPlayer != null ? iNLEPlayer.getDuration() : 0L;
        long j = autoCutModel.asyncRenderModel.costDuration;
        long j2 = c1420050n3b2.LJ.get();
        long jCurrentTimeMillis = System.currentTimeMillis() - c1420050n3b2.LJIIIIZZ.get();
        AutoCutAsyncRenderModel autoCutAsyncRenderModel = autoCutModel.asyncRenderModel;
        int i = autoCutAsyncRenderModel.asyncRenderNecessaryDownloadCount;
        int i2 = autoCutAsyncRenderModel.asyncRenderNecessaryTotalCount;
        Set<String> set2 = autoCutAsyncRenderModel.asyncRenderUnnecessaryDownloadSet;
        C1417710mzp.LJIIIZ(str, duration, j, j2, jCurrentTimeMillis, i, i2, set2 != null ? set2.size() : 0, autoCutModel.asyncRenderModel.asyncRenderUnnecessaryTotalCount, c1420050n3b2.LJFF.get(), c1420050n3b2.LJI.get(), c1420050n3b2.LJII.get(), c1420050n3b2.LJII.get() - c1420050n3b2.LJFF.get(), autoCutModel.mediaList, ((VideoPublishEditModel) c1420050n3b2.LIZIZ.getValue(c1420050n3b2, interfaceC2217461BqaArr[0])).creativeModel.autoCutModel.curTemplateType);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0174, code lost:
    
        if (((java.util.ArrayList) r6.LL).isEmpty() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0176, code lost:
    
        r6.LL = new java.util.ArrayList(r5);
        r6.notifyDataSetChanged();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0180, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x018d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.LJFF(((X.C1452010nt9) com.bytedance.mt.protector.impl.collections.ListProtector.get(r5, 0)).LIZ, "adjust_item_enhance") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x018f, code lost:
    
        ((java.util.ArrayList) r6.LL).addAll(0, r5);
        r6.notifyItemRangeInserted(0, r5.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x019d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x019e, code lost:
    
        r1 = ((java.util.ArrayList) r6.LL).size();
        ((java.util.ArrayList) r6.LL).addAll(r5);
        r6.notifyItemRangeInserted(r1, r5.size());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01b4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ$1() {
        /*
            Method dump skipped, instruction units count: 437
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS27S1100000_22.LIZ$1():void");
    }

    public final void LIZ$2() {
        C1433740nPg c1433740nPg = C1433730nPf.LJFF;
        String str = this.s0;
        AbstractC1433570nPP abstractC1433570nPP = (AbstractC1433570nPP) this.l1;
        C1433730nPf.LIZ.getClass();
        ExecutorService executorService = C1433730nPf.LJI;
        synchronized (c1433740nPg) {
            for (C1433530nPL c1433530nPL : c1433740nPg.LIZ) {
                if (Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                    executorService.execute(new ARunnableS91S0200000_22(c1433530nPL, abstractC1433570nPP, 41));
                }
            }
        }
    }

    public final void LIZ$3() {
        C1433500nPI c1433500nPI = C1433730nPf.LJIIIZ;
        if (c1433500nPI != null) {
            c1433500nPI.LJJIZ((InterfaceC1433360nP4) this.l1);
        }
        C1433740nPg c1433740nPg = C1433730nPf.LJFF;
        String str = this.s0;
        InterfaceC1433360nP4 interfaceC1433360nP4 = (InterfaceC1433360nP4) this.l1;
        C1433730nPf.LIZ.getClass();
        ExecutorService executorService = C1433730nPf.LJI;
        synchronized (c1433740nPg) {
            if (str != null) {
                for (C1433530nPL c1433530nPL : c1433740nPg.LIZ) {
                    if (Intrinsics.LJFF(c1433530nPL.LIZIZ, str)) {
                        executorService.execute(new ARunnableS91S0200000_22(c1433530nPL, interfaceC1433360nP4, 42));
                    }
                }
            } else {
                List<C1433530nPL> list = c1433740nPg.LIZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C1433530nPL> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(it2.next().LJI);
                }
                executorService.execute(new ARunnableS91S0200000_22(arrayList, interfaceC1433360nP4, 43));
            }
        }
    }

    public static final void run$0(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceToolsStickerServiceImpl@9d03.logCommerceStickerClick$1");
        try {
            CommerceToolsStickerServiceImpl commerceToolsStickerServiceImpl = (CommerceToolsStickerServiceImpl) aRunnableS27S1100000_22.l1;
            String str = aRunnableS27S1100000_22.s0;
            commerceToolsStickerServiceImpl.getClass();
            CommerceToolsStickerServiceImpl.LIZ("click", str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceToolsStickerServiceImpl@9d03.logCommerceStickerClick$1");
    }

    public static final void run$1(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("CommerceToolsStickerServiceImpl@9d03.logCommerceStickerShow$1");
        try {
            CommerceToolsStickerServiceImpl commerceToolsStickerServiceImpl = (CommerceToolsStickerServiceImpl) aRunnableS27S1100000_22.l1;
            String str = aRunnableS27S1100000_22.s0;
            commerceToolsStickerServiceImpl.getClass();
            CommerceToolsStickerServiceImpl.LIZ("show", str);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("CommerceToolsStickerServiceImpl@9d03.logCommerceStickerShow$1");
    }

    public static final void run$2(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("AutoCutAsyncRenderService@10d.mobAutoCutAsyncRender$1");
        try {
            aRunnableS27S1100000_22.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AutoCutAsyncRenderService@10d.mobAutoCutAsyncRender$1");
    }

    public static final void run$3(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("ImageAdjustScene@250a.updateAdjustList$1");
        try {
            aRunnableS27S1100000_22.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ImageAdjustScene@250a.updateAdjustList$1");
    }

    public static final void run$4(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.addCallback$1");
        try {
            C1433730nPf c1433730nPf = C1433730nPf.LIZ;
            AbstractC1433570nPP abstractC1433570nPP = (AbstractC1433570nPP) aRunnableS27S1100000_22.l1;
            String str = aRunnableS27S1100000_22.s0;
            c1433730nPf.getClass();
            C1433730nPf.LIZIZ(str, abstractC1433570nPP);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.addCallback$1");
    }

    public static final void run$5(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.removeCallback$1");
        try {
            aRunnableS27S1100000_22.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.removeCallback$1");
    }

    public static final void run$6(ARunnableS27S1100000_22 aRunnableS27S1100000_22) {
        boolean zLIZ;
        C1C7U.LIZ("PublishScheduler@ecda.removeCallback$2");
        try {
            aRunnableS27S1100000_22.LIZ$3();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PublishScheduler@ecda.removeCallback$2");
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS27S1100000_22(java.lang.String r2, X.AbstractC1433570nPP r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 4 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.s0 = r2
            r0.l1 = r3
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r2
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS27S1100000_22.<init>(java.lang.String, X.0nPP, int):void");
    }

    public ARunnableS27S1100000_22(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
