package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wDJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1772030wDJ {
    public final C1772650wEJ LIZ;
    public final ECMMKViewModel LIZIZ;
    public final C1772620wEG LIZJ;
    public final C1773140wF6 LIZLLL;
    public final C2252331DDr LJ;
    public final ConcurrentHashMap<String, Integer> LJFF;
    public final CopyOnWriteArrayList<C1771590wCb> LJI;
    public boolean LJII;
    public final C01GW LJIIIIZZ;
    public volatile C1772630wEH LJIIIZ;
    public volatile C1515870pY9<ECMixMallPageDTO> LJIIJ;
    public volatile boolean LJIIJJI;

    public final void LIZ() {
        ArrayList arrayList = new ArrayList();
        for (C1771590wCb c1771590wCb : this.LJI) {
            if (c1771590wCb != null && (c1771590wCb.LIZLLL || c1771590wCb.LJ)) {
                arrayList.add(c1771590wCb);
            }
        }
        this.LJI.removeAll(C13LP.LLIIJI(arrayList));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C1772180wDY r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r11 = this;
            r9 = r12
            boolean r0 = r13 instanceof X.C1772110wDR
            r5 = r11
            if (r0 == 0) goto L56
            r10 = r13
            X.0wDR r10 = (X.C1772110wDR) r10
            int r2 = r10.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L56
            int r2 = r2 - r1
            r10.LLILZ = r2
        L14:
            java.lang.Object r1 = r10.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILZ
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L2a
            if (r0 == r2) goto L3f
            if (r0 != r3) goto L5c
            X.C155000ia.LIZIZ(r1)
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2a:
            X.C155000ia.LIZIZ(r1)
            com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKViewModel r0 = r5.LIZIZ
            X.1DDq r1 = r0.LLJJI
            X.0wDw r0 = X.C1772420wDw.LIZIZ
            r10.LL = r9
            r10.LLILZ = r2
            r1.setValue(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r0 != r4) goto L44
            return r4
        L3f:
            X.0wDY r9 = r10.LL
            X.C155000ia.LIZIZ(r1)
        L44:
            android.content.Context r6 = r9.LIZIZ
            X.0wCb r7 = r9.LIZ
            X.0wCz r8 = X.EnumC1771830wCz.LOAD_MORE
            r0 = 0
            r10.LL = r0
            r10.LLILZ = r3
            java.lang.Object r0 = r5.LJ(r6, r7, r8, r9, r10)
            if (r0 != r4) goto L27
            return r4
        L56:
            X.0wDR r10 = new X.0wDR
            r10.<init>(r5, r13)
            goto L14
        L5c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772030wDJ.LIZIZ(X.0wDY, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C1772160wDW r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772030wDJ.LIZJ(X.0wDW, X.05Vn):java.lang.Object");
    }

    public C1772030wDJ(C1772650wEJ c1772650wEJ, ECMMKViewModel eCMMKViewModel, C1772620wEG c1772620wEG, C1773140wF6 c1773140wF6) {
        this.LIZ = c1772650wEJ;
        this.LIZIZ = eCMMKViewModel;
        this.LIZJ = c1772620wEG;
        this.LIZLLL = c1773140wF6;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 0, null, 7);
        this.LJ = c2252331DDrLIZIZ;
        this.LJFF = new ConcurrentHashMap<>();
        this.LJI = new CopyOnWriteArrayList<>();
        C09IC.LJJI(ViewModelKt.getViewModelScope(eCMMKViewModel), new C861640Xr8(new C1772050wDL(this, null), c2252331DDrLIZIZ));
        this.LJIIIIZZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(497));
    }

    public final void LIZLLL(C1771590wCb c1771590wCb, EnumC1771830wCz enumC1771830wCz, AbstractC1772170wDX abstractC1772170wDX, AbstractC1771170wBv abstractC1771170wBv) {
        c1771590wCb.LJ = true;
        LIZ();
        if (c1771590wCb.LIZLLL) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Request Canceled: ");
            sbLIZ.append(c1771590wCb);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            return;
        }
        if (abstractC1771170wBv instanceof C1771140wBs) {
            EnumC1771830wCz enumC1771830wCz2 = EnumC1771830wCz.REFRESH;
            String str = CardStruct.IStatusCode.DEFAULT;
            if (enumC1771830wCz == enumC1771830wCz2) {
                ConcurrentHashMap<String, Integer> concurrentHashMap = this.LJFF;
                String str2 = c1771590wCb.LIZ;
                if (str2 != null) {
                    str = str2;
                }
                concurrentHashMap.put(str, 0);
                C1771140wBs c1771140wBs = (C1771140wBs) abstractC1771170wBv;
                this.LIZJ.LJIILL(new C1772140wDU(c1771140wBs.LIZ, c1771140wBs.LIZIZ, abstractC1772170wDX.LIZ, false));
                return;
            }
            C1771140wBs c1771140wBs2 = (C1771140wBs) abstractC1771170wBv;
            C1772690wEN c1772690wEN = c1771140wBs2.LIZ.LIZLLL;
            if (c1772690wEN == null) {
                return;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMap2 = this.LJFF;
            String str3 = c1771590wCb.LIZ;
            if (str3 != null) {
                str = str3;
            }
            concurrentHashMap2.put(str, Integer.valueOf(c1771590wCb.LJIILL));
            this.LIZJ.LJIILL(new C1772220wDc(c1772690wEN, c1771140wBs2.LIZIZ, c1771140wBs2.LIZ, c1771590wCb));
            return;
        }
        if (!(abstractC1771170wBv instanceof C1771480wCQ)) {
            return;
        }
        if (enumC1771830wCz == EnumC1771830wCz.REFRESH) {
            this.LIZJ.LJIILL(new C1772200wDa(abstractC1772170wDX.LIZ, ((C1771480wCQ) abstractC1771170wBv).LIZ, false));
        } else {
            this.LIZJ.LJIILL(new C1772190wDZ(c1771590wCb));
        }
        if (Intrinsics.LJFF(abstractC1772170wDX.LIZ.LJFF, "first_fetch")) {
            this.LJII = true;
        }
        int i = C1771840wD0.LIZ[enumC1771830wCz.ordinal()];
        if (i != 1) {
            if (i == 2) {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZIZ), null, null, new C1772060wDM(this, c1771590wCb, abstractC1771170wBv, null), 3);
                return;
            }
            throw new C1954807lC();
        }
        if (Intrinsics.LJFF(this.LIZIZ.LLJJIII.getValue(), C1772440wDy.LIZIZ)) {
            this.LIZJ.LJFF(EnumC1772960wEo.CACHE);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this.LIZIZ), null, null, new C863040XtO(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(android.content.Context r24, X.C1771590wCb r25, X.EnumC1771830wCz r26, X.AbstractC1772170wDX r27, X.InterfaceC1364105Vn<? super kotlin.Unit> r28) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1772030wDJ.LJ(android.content.Context, X.0wCb, X.0wCz, X.0wDX, X.05Vn):java.lang.Object");
    }
}
