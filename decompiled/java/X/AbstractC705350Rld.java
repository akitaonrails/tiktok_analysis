package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Rld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC705350Rld implements InterfaceC705400Rli {
    public final String LIZ;
    public final Function0<VideoItemParams> LIZIZ;
    public final Map<String, Object> LIZJ;
    public final C705370Rlf LIZLLL;
    public boolean LJFF;
    public final List<AbstractC705350Rld> LJ = new ArrayList();
    public final List<InterfaceC705400Rli> LJI = new ArrayList();

    public abstract void LIZIZ(VideoItemParams videoItemParams, Map<String, ? extends Object> map);

    public void LJFF() {
        this.LJFF = true;
    }

    public final void LJI() {
        this.LJFF = false;
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((AbstractC705350Rld) it2.next()).LJI();
        }
    }

    @Override // X.InterfaceC705400Rli
    public final void LIZ() {
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC705400Rli) it2.next()).LIZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x006e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL() {
        /*
            r6 = this;
            boolean r1 = r6.LJFF
            r0 = 0
            if (r1 == 0) goto L8
            r6.LJFF = r0
            return
        L8:
            X.0Rlf r0 = r6.LIZLLL
            if (r0 == 0) goto L9a
            java.util.List<? extends kotlin.Pair<java.lang.String, ? extends java.util.List<kotlin.jvm.functions.Function0<java.lang.Boolean>>>> r0 = r0.LIZJ
            if (r0 == 0) goto L9a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r5 = r0.iterator()
        L16:
            r4 = 1
        L17:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r3 = r5.next()
            kotlin.Pair r3 = (kotlin.Pair) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r0 = r3.getSecond()
            java.util.List r0 = (java.util.List) r0
            java.util.Iterator r1 = r0.iterator()
        L32:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0
            java.lang.Object r0 = r0.invoke()
            r2.add(r0)
            goto L32
        L46:
            java.lang.Object r1 = r3.getFirst()
            java.lang.String r0 = "&&"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L94
            java.util.Iterator r1 = r2.iterator()
        L5c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L94
            java.lang.Object r0 = r1.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L5c
        L6e:
            r4 = 0
            goto L17
        L70:
            java.lang.String r0 = "||"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L94
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L6e
            java.util.Iterator r1 = r2.iterator()
        L82:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6e
            java.lang.Object r0 = r1.next()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L82
        L94:
            if (r4 == 0) goto L6e
            goto L16
        L97:
            if (r4 != 0) goto L9a
            return
        L9a:
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.feed.model.VideoItemParams> r0 = r6.LIZIZ
            if (r0 == 0) goto Laa
            java.lang.Object r1 = r0.invoke()
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r1 = (com.ss.android.ugc.aweme.feed.model.VideoItemParams) r1
        La4:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r6.LIZJ
            r6.LIZIZ(r1, r0)
            return
        Laa:
            r1 = 0
            goto La4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC705350Rld.LIZLLL():void");
    }

    @Override // X.InterfaceC705400Rli
    public final void onStop() {
        Iterator it2 = ((ArrayList) this.LJI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC705400Rli) it2.next()).onStop();
        }
    }

    public final void LIZJ() {
        LJFF();
        Iterator it2 = ((ArrayList) this.LJ).iterator();
        while (it2.hasNext()) {
            ((AbstractC705350Rld) it2.next()).LIZJ();
        }
    }

    public final void LJ(List<String> list) {
        LIZ();
        List<AbstractC705350Rld> list2 = this.LJ;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) list2) {
            AbstractC705350Rld abstractC705350Rld = (AbstractC705350Rld) obj;
            if (list == null || list.contains(abstractC705350Rld.LIZ)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AbstractC705350Rld) it2.next()).LIZLLL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC705350Rld(String str, Function0<? extends VideoItemParams> function0, Map<String, ? extends Object> map, C705370Rlf c705370Rlf) {
        this.LIZ = str;
        this.LIZIZ = function0;
        this.LIZJ = map;
        this.LIZLLL = c705370Rlf;
    }
}
