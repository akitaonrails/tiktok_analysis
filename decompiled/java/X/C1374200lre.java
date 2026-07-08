package X;

import android.view.View;
import com.ss.android.ugc.aweme.share.improve.pkg.LiveSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0lre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1374200lre implements InterfaceC1373720lqs {
    public final SharePackage LL;
    public final C1372830lpR LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;

    @Override // X.InterfaceC1373720lqs
    public final SharePackage LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC1373720lqs
    public final List<C1376750lvl> LIZIZ(InterfaceC1374230lrh interfaceC1374230lrh) {
        List<InterfaceC1370310llN> list = this.LLILLJJLI.LIZLLL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (InterfaceC1370310llN interfaceC1370310llN : list) {
            arrayList.add(new C1376750lvl(new C1374220lrg(interfaceC1374230lrh, this, interfaceC1370310llN), new C734990SsL(interfaceC1370310llN.LJJIZ(), C1202420hOa.LIZ().getString(interfaceC1370310llN.LJJLIIIJJIZ()))));
        }
        return arrayList;
    }

    @Override // X.InterfaceC1373720lqs
    public final List<AbstractC1373870lr7> LIZJ(InterfaceC1374230lrh interfaceC1374230lrh) {
        return LJFF(interfaceC1374230lrh, true);
    }

    @Override // X.InterfaceC1373720lqs
    public final C1376920lw2 LIZLLL(InterfaceC1374230lrh interfaceC1374230lrh) {
        return new C1376920lw2(this, interfaceC1374230lrh);
    }

    @Override // X.InterfaceC1373720lqs
    public final List<AbstractC1373870lr7> LJ(InterfaceC1374230lrh interfaceC1374230lrh) {
        return LJFF(interfaceC1374230lrh, false);
    }

    public C1374200lre(LiveSharePackage liveSharePackage, C1372830lpR c1372830lpR) {
        this.LL = liveSharePackage;
        this.LLILLJJLI = c1372830lpR;
    }

    public final List<AbstractC1373870lr7> LJFF(final InterfaceC1374230lrh interfaceC1374230lrh, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (final InterfaceC1370310llN interfaceC1370310llN : this.LLILLJJLI.LIZJ) {
            if (C1212260heS.LIZ[interfaceC1370310llN.LJJJZ().ordinal()] == 1) {
                if (z) {
                    List<InterfaceC1370310llN> list = this.LLILLJJLI.LIZLLL;
                    ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
                    for (InterfaceC1370310llN interfaceC1370310llN2 : list) {
                        final C1374220lrg c1374220lrg = new C1374220lrg(interfaceC1374230lrh, this, interfaceC1370310llN2);
                        final C1374250lrj c1374250lrj = new C1374250lrj(interfaceC1370310llN2.LJIIIIZZ(), interfaceC1370310llN2.LJJLIIIJJIZ(), (String) null, 12);
                        interfaceC1370310llN2.LJJIZ();
                        arrayList2.add(new C1373910lrB(c1374250lrj, c1374220lrg) { // from class: X.0lri
                        });
                    }
                    arrayList.addAll(arrayList2);
                    if (interfaceC1374230lrh instanceof DialogC1372820lpQ) {
                        ((DialogC1372820lpQ) interfaceC1374230lrh).LLJILJILJ.LJIJ = new DialogInterfaceOnDismissListenerC1402050maZ(this, interfaceC1374230lrh, interfaceC1370310llN, 2);
                    }
                } else {
                    arrayList.add(new C1373910lrB(new C1374250lrj(interfaceC1370310llN.LJIIIIZZ(), interfaceC1370310llN.LJJLIIIJJIZ(), (String) null, 12), new AbstractC736370SuZ(interfaceC1370310llN, interfaceC1374230lrh, this) { // from class: X.0lrf
                        public final InterfaceC1370310llN LLILZ;
                        public final InterfaceC1374230lrh LLILZIL;
                        public final InterfaceC1373720lqs LLILZLL;

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                        @Override // X.AbstractC1376810lvr
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(android.view.View r4) {
                            /*
                                r3 = this;
                                X.0llN r0 = r3.LLILZ
                                X.0hld r1 = r0.LJJJZ()
                                X.0hld r0 = X.EnumC1216710hld.DISLIKEMORE2
                                if (r1 != r0) goto L32
                                X.0lqs r1 = r3.LLILZLL
                                boolean r0 = r1 instanceof X.C1374200lre
                                if (r0 == 0) goto L32
                                X.0lre r1 = (X.C1374200lre) r1
                                r0 = 1
                                r1.LLILLL = r0
                                X.0lrh r0 = r3.LLILZIL
                                if (r0 == 0) goto L1c
                                r0.LJIILJJIL()
                            L1c:
                                X.0lrh r0 = r3.LLILZIL
                                if (r0 == 0) goto L31
                                android.content.Context r2 = r0.getContext()
                                if (r2 == 0) goto L31
                                X.0llN r1 = r3.LLILZ
                                X.0lqs r0 = r3.LLILZLL
                                com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r0.LIZ()
                                r1.LJJLIIIJILLIZJL(r2, r0)
                            L31:
                                return
                            L32:
                                X.0lqs r1 = r3.LLILZLL
                                boolean r0 = r1 instanceof X.C1374200lre
                                if (r0 == 0) goto L3f
                                X.0lre r1 = (X.C1374200lre) r1
                                if (r1 == 0) goto L3f
                                r0 = 0
                                r1.LLILLL = r0
                            L3f:
                                X.0lrh r0 = r3.LLILZIL
                                if (r0 == 0) goto L1c
                                r0.dismiss()
                                goto L1c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1374210lrf.LIZIZ(android.view.View):void");
                        }

                        {
                            super(this, interfaceC1374230lrh);
                            this.LLILZ = interfaceC1370310llN;
                            this.LLILZIL = interfaceC1374230lrh;
                            this.LLILZLL = this;
                        }
                    }, true));
                }
            } else {
                arrayList.add(new C1373910lrB(new C1374250lrj(interfaceC1370310llN.LJIIIIZZ(), interfaceC1370310llN.LJJLIIIJJIZ(), (String) null, 12), new AbstractC736370SuZ(interfaceC1370310llN, interfaceC1374230lrh, this) { // from class: X.0lrf
                    public final InterfaceC1370310llN LLILZ;
                    public final InterfaceC1374230lrh LLILZIL;
                    public final InterfaceC1373720lqs LLILZLL;

                    @Override // X.AbstractC1376810lvr
                    public final void LIZIZ(View v) {
                        /*
                            this = this;
                            X.0llN r0 = r3.LLILZ
                            X.0hld r1 = r0.LJJJZ()
                            X.0hld r0 = X.EnumC1216710hld.DISLIKEMORE2
                            if (r1 != r0) goto L32
                            X.0lqs r1 = r3.LLILZLL
                            boolean r0 = r1 instanceof X.C1374200lre
                            if (r0 == 0) goto L32
                            X.0lre r1 = (X.C1374200lre) r1
                            r0 = 1
                            r1.LLILLL = r0
                            X.0lrh r0 = r3.LLILZIL
                            if (r0 == 0) goto L1c
                            r0.LJIILJJIL()
                        L1c:
                            X.0lrh r0 = r3.LLILZIL
                            if (r0 == 0) goto L31
                            android.content.Context r2 = r0.getContext()
                            if (r2 == 0) goto L31
                            X.0llN r1 = r3.LLILZ
                            X.0lqs r0 = r3.LLILZLL
                            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r0.LIZ()
                            r1.LJJLIIIJILLIZJL(r2, r0)
                        L31:
                            return
                        L32:
                            X.0lqs r1 = r3.LLILZLL
                            boolean r0 = r1 instanceof X.C1374200lre
                            if (r0 == 0) goto L3f
                            X.0lre r1 = (X.C1374200lre) r1
                            if (r1 == 0) goto L3f
                            r0 = 0
                            r1.LLILLL = r0
                        L3f:
                            X.0lrh r0 = r3.LLILZIL
                            if (r0 == 0) goto L1c
                            r0.dismiss()
                            goto L1c
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1374210lrf.LIZIZ(android.view.View):void");
                    }

                    {
                        super(this, interfaceC1374230lrh);
                        this.LLILZ = interfaceC1370310llN;
                        this.LLILZIL = interfaceC1374230lrh;
                        this.LLILZLL = this;
                    }
                }, interfaceC1370310llN.enable()));
            }
        }
        return arrayList;
    }
}
