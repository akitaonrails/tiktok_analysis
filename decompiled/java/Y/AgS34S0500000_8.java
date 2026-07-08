package Y;

import X.C09JK;
import X.C0CHQ;
import X.C0LCE;
import X.C0LSZ;
import X.C13BV;
import X.C15438062q;
import X.C2188811AlT;
import X.C539070LCf;
import X.EnumC545550LaT;
import X.InterfaceC1364105Vn;
import X.InterfaceC346701Wf;
import com.ss.android.ugc.aweme.aigc.asynctask.AIGCPushMessage;
import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public class AgS34S0500000_8 implements InterfaceC346701Wf {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return emit$0(this, obj, interfaceC1364105Vn);
            case 1:
                return emit$1(this, obj, interfaceC1364105Vn);
            case 2:
                return emit$2(this, obj, interfaceC1364105Vn);
            case 3:
                return emit$3(this, obj, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$0(Y.AgS34S0500000_8 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C0MKO
            if (r0 == 0) goto L50
            r4 = r11
            X.0MKO r4 = (X.C0MKO) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L50
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L56
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r9.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            java.lang.String r10 = (java.lang.String) r10
            X.0MKG r5 = new X.0MKG
            java.lang.Object r6 = r9.l1
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r6 = (com.ss.android.ugc.aweme.creative.model.CreativeInfo) r6
            java.lang.Object r7 = r9.l2
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r7 = (com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia) r7
            java.lang.Object r8 = r9.l3
            X.0MMK r8 = (X.C0MMK) r8
            java.lang.Object r0 = r9.l4
            android.content.Context r0 = (android.content.Context) r0
            kotlin.Pair r9 = X.C0MUO.LIZ(r0)
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r5, r4)
            if (r0 != r3) goto L22
            return r3
        L50:
            X.0MKO r4 = new X.0MKO
            r4.<init>(r9, r11)
            goto L12
        L56:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS34S0500000_8.emit$0(Y.AgS34S0500000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.AgS34S0500000_8 r13, java.lang.Object r14, X.InterfaceC1364105Vn r15) {
        /*
            r1 = r14
            r5 = r15
            boolean r0 = r5 instanceof X.C565830MHd
            if (r0 == 0) goto L69
            r4 = r5
            X.0MHd r4 = (X.C565830MHd) r4
            int r3 = r4.LLILLJJLI
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L69
            int r3 = r3 - r2
            r4.LLILLJJLI = r3
        L14:
            java.lang.Object r5 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r2 = r4.LLILLJJLI
            r0 = 1
            if (r2 == 0) goto L27
            if (r2 != r0) goto L6f
            X.C155000ia.LIZIZ(r5)
        L24:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L27:
            X.C155000ia.LIZIZ(r5)
            java.lang.Object r2 = r13.l0
            X.01Wf r2 = (X.InterfaceC346701Wf) r2
            kotlin.Pair r1 = (kotlin.Pair) r1
            X.0MKE r5 = new X.0MKE
            java.lang.Object r6 = r13.l1
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r6 = (com.ss.android.ugc.aweme.creative.model.CreativeInfo) r6
            java.lang.Object r7 = r13.l2
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r7 = (com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia) r7
            java.lang.Object r8 = r13.l3
            X.0MMK r8 = (X.C0MMK) r8
            java.lang.Object r9 = r1.getFirst()
            X.0MMG r9 = (X.C0MMG) r9
            r10 = 0
            java.lang.Object r0 = r13.l4
            android.content.Context r0 = (android.content.Context) r0
            kotlin.Pair r11 = X.C0MUO.LIZ(r0)
            r12 = 0
            r5 = r5
            r15 = 448(0x1c0, float:6.28E-43)
            r13 = r12
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r0 = r1.getSecond()
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r5, r0)
            r0 = 1
            r4.LLILLJJLI = r0
            java.lang.Object r0 = r2.emit(r1, r4)
            if (r0 != r3) goto L24
            return r3
        L69:
            X.0MHd r4 = new X.0MHd
            r4.<init>(r13, r5)
            goto L14
        L6f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS34S0500000_8.emit$1(Y.AgS34S0500000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$2(Y.AgS34S0500000_8 r9, java.lang.Object r10, X.InterfaceC1364105Vn r11) {
        /*
            boolean r0 = r11 instanceof X.C0MK6
            if (r0 == 0) goto L52
            r4 = r11
            X.0MK6 r4 = (X.C0MK6) r4
            int r2 = r4.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r4.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L25
            if (r0 != r2) goto L58
            X.C155000ia.LIZIZ(r1)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L25:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r1 = r9.l0
            X.01Wf r1 = (X.InterfaceC346701Wf) r1
            X.0MMH r10 = (X.C0MMH) r10
            X.0MKG r5 = new X.0MKG
            java.lang.Object r6 = r9.l1
            com.ss.android.ugc.aweme.creative.model.CreativeInfo r6 = (com.ss.android.ugc.aweme.creative.model.CreativeInfo) r6
            java.lang.Object r7 = r9.l2
            com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia r7 = (com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia) r7
            java.lang.Object r8 = r9.l3
            X.0MMK r8 = (X.C0MMK) r8
            java.lang.Object r0 = r9.l4
            android.content.Context r0 = (android.content.Context) r0
            kotlin.Pair r9 = X.C0MUO.LIZ(r0)
            java.lang.String r10 = r10.LIZ
            r5.<init>(r6, r7, r8, r9, r10)
            r4.LLILLJJLI = r2
            java.lang.Object r0 = r1.emit(r5, r4)
            if (r0 != r3) goto L22
            return r3
        L52:
            X.0MK6 r4 = new X.0MK6
            r4.<init>(r9, r11)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AgS34S0500000_8.emit$2(Y.AgS34S0500000_8, java.lang.Object, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0LBl] */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.ArrayList] */
    public static final Object emit$3(AgS34S0500000_8 agS34S0500000_8, Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean z;
        ?? arrayList;
        C539070LCf c539070LCf = (C539070LCf) obj;
        if (c539070LCf.LIZJ == EnumC545550LaT.COMPLETE) {
            z = true;
        } else {
            z = false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateDraft finished: isSuccess=");
        sbLIZ.append(z);
        sbLIZ.append(", source=");
        sbLIZ.append(c539070LCf.LIZLLL);
        sbLIZ.append(", creationId=");
        sbLIZ.append(((AIGCPushMessage) agS34S0500000_8.l0).creationId);
        C09JK.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        Source source = c539070LCf.LIZLLL;
        if (source == Source.EDIT_AI_LIVE_PHOTO) {
            C0CHQ.LIZ().LJJIFFI().LJIIIIZZ((List) agS34S0500000_8.l2, ((AwemeDraft) agS34S0500000_8.l1).LIZ(), (List) agS34S0500000_8.l3, z);
        } else if (source == Source.TEXT_TO_IMAGE) {
            C0LCE c0lceLJJIJLIJ = C0CHQ.LIZ().LJJIJLIJ();
            if (c0lceLJJIJLIJ != null) {
                c0lceLJJIJLIJ.LJIIIIZZ((List) agS34S0500000_8.l2, ((AwemeDraft) agS34S0500000_8.l1).LIZ(), (List) agS34S0500000_8.l3, z);
            }
        } else if (source != Source.EDITOR_PRO_AIGC_T2V && source != Source.EDITOR_PRO_AIGC_T2I && source != Source.EDIT_AI_PLAYGROUND) {
            C0CHQ.LIZ().LJIL().LJIIIIZZ((List) agS34S0500000_8.l2, ((AwemeDraft) agS34S0500000_8.l1).LIZ(), (List) agS34S0500000_8.l3, z);
        } else {
            List list = (List) agS34S0500000_8.l4;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (((C0LSZ) obj2).LJIJJLI.length() > 0) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((C0LSZ) it2.next()).LJIJJLI);
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            C0CHQ.LIZ().LJJII().LJIIIIZZ(arrayList, ((AwemeDraft) agS34S0500000_8.l1).LIZ(), (List) agS34S0500000_8.l3, z);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AgS34S0500000_8(Object obj, AIGCPushMessage aIGCPushMessage, AwemeDraft awemeDraft, List<String> list, List<String> list2, List<C0LSZ> list3) {
        this.$t = list3;
        this.l0 = obj;
        this.l1 = aIGCPushMessage;
        this.l2 = awemeDraft;
        this.l3 = list;
        this.l4 = list2;
    }
}
