package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.Feed;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0vSV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743010vSV implements InterfaceC1742900vSK {
    public String LL;
    public String LLILLL;
    public boolean LLILZ;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(539));
    public final LinkedHashSet<Feed> LLILZIL = new LinkedHashSet<>();
    public final C1DEV LLILZLL = C2191201ApK.LIZ();
    public final LinkedList<Feed> LLIZ = new LinkedList<>();
    public final LinkedList<Feed> LLIZLLLIL = new LinkedList<>();
    public final LinkedList<Feed> LLJ = new LinkedList<>();

    public final C1894707bV LJLZ() {
        return (C1894707bV) this.LLILLJJLI.getValue();
    }

    @Override // X.InterfaceC1742900vSK
    public final void LJJIII(boolean z) {
        C2126408Us c2126408Us = C2126308Ur.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C2126308Ur.LJFF)), null, null, new C1309610kBT(this, z, null), 3);
    }

    @Override // X.InterfaceC1742900vSK
    public final void LLLLLZ(Feed feed) {
        this.LLILZIL.add(feed);
    }

    public static void LLZLLIL(C1743010vSV c1743010vSV, LinkedList linkedList) {
        c1743010vSV.getClass();
        while (linkedList.size() > 200) {
            linkedList.poll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    @Override // X.InterfaceC1742900vSK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLD(X.C1742820vSC r7, X.InterfaceC1364105Vn<? super X.C1742950vSP> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1743030vSX
            if (r0 == 0) goto L4e
            r5 = r8
            X.0vSX r5 = (X.C1743030vSX) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L54
            X.C155000ia.LIZIZ(r1)
        L22:
            r0 = r1
            X.0vSP r0 = (X.C1742950vSP) r0
            java.lang.String r0 = r0.LJFF
            r6.LL = r0
            return r1
        L2a:
            X.C155000ia.LIZIZ(r1)
            r2 = 0
            if (r7 == 0) goto L4c
            java.lang.String r0 = r7.LJIIIIZZ
        L32:
            r6.LLILLL = r0
            X.07bV r1 = r6.LJLZ()
            r1.LIZ = r2
            r1.LIZIZ = r2
            r1.LIZJ = r2
            r0 = 0
            r1.LIZLLL = r0
            r1.LJ = r0
            r5.LLILLL = r3
            java.lang.Object r1 = r6.LLJLILLLLZIIL(r3, r7, r5)
            if (r1 != r4) goto L22
            return r4
        L4c:
            r0 = r2
            goto L32
        L4e:
            X.0vSX r5 = new X.0vSX
            r5.<init>(r6, r8)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743010vSV.LLD(X.0vSC, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1742900vSK
    public final Object LLZLI(C1742820vSC c1742820vSC, InterfaceC1364105Vn<? super C1742950vSP> interfaceC1364105Vn) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("load more feed data ");
        sbLIZ.append(LJLZ().LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        C1309620kBU.LIZ("repo");
        return LLJLILLLLZIIL(false, c1742820vSC, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x037b A[Catch: all -> 0x03eb, LOOP:0: B:169:0x0375->B:171:0x037b, LOOP_END, TryCatch #4 {all -> 0x03eb, blocks: (B:168:0x0362, B:169:0x0375, B:171:0x037b, B:172:0x03a3), top: B:276:0x0362 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0438 A[Catch: all -> 0x04ab, LOOP:1: B:190:0x0432->B:192:0x0438, LOOP_END, TryCatch #3 {all -> 0x04ab, blocks: (B:189:0x041f, B:190:0x0432, B:192:0x0438, B:193:0x0460), top: B:274:0x041f }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04f4 A[Catch: all -> 0x05f3, LOOP:2: B:212:0x04ee->B:214:0x04f4, LOOP_END, TryCatch #0 {all -> 0x05f3, blocks: (B:211:0x04df, B:212:0x04ee, B:214:0x04f4, B:215:0x0517), top: B:268:0x04df }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x057a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x021d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LLJLILLLLZIIL(boolean r29, X.C1742820vSC r30, X.InterfaceC1364105Vn<? super X.C1742950vSP> r31) {
        /*
            Method dump skipped, instruction units count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1743010vSV.LLJLILLLLZIIL(boolean, X.0vSC, X.05Vn):java.lang.Object");
    }
}
