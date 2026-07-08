package X;

import android.content.Context;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0d0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033870d0j implements C0SM6, InterfaceC1034260d1M {
    public final Context LIZ;
    public final Aweme LIZIZ;
    public final C1009340cNA LIZJ;
    public final InterfaceC1007910cKr LIZLLL;
    public final C1008160cLG LJ;
    public final List<InterfaceC1034150d1B> LJFF = C1697810uHb.LJIILJJIL(new InterfaceC1034150d1B() { // from class: X.0d0p
        @Override // X.InterfaceC1034150d1B
        public final C1033940d0q LIZ(IAnoleManager iAnoleManager, View view) {
            View viewFindViewById;
            ViewGroup viewGroup;
            if (!iAnoleManager.LJIJJ(EnumC696280RSw.TT_PHOTO_MODE_PIC_FULL.getSlotName()) || (viewFindViewById = view.findViewById(R.id.ymh)) == null || !(viewFindViewById instanceof ViewGroup) || (viewGroup = (ViewGroup) viewFindViewById) == null) {
                return null;
            }
            C2271391DvN.LIZ(viewGroup, (C1A5L) C2271381DvM.LJJLIIIJ.getValue());
            return new C1033940d0q(viewGroup);
        }
    });
    public final Map<Integer, C1033970d0t> LJI = new LinkedHashMap();
    public final C01GW LJII = C452501pT.LIZIZ(new AwS560S0100000_16(this, 733));
    public final List<AbstractC1033980d0u> LJIIIIZZ = C1697810uHb.LJIIJJI(new C1033890d0l(this), new C1033920d0o(this), new C1033900d0m(this), new AbstractC1033980d0u(this) { // from class: X.0d0k
        public Integer LLILZ;
        public boolean LLILZIL;
        public final Set<Integer> LLILZLL = new LinkedHashSet();
        public final Set<Integer> LLIZ = new LinkedHashSet();

        @Override // X.AbstractC1033980d0u
        public final void LIZLLL() {
            this.LLILZ = null;
            this.LLILZIL = false;
            this.LLILZLL.clear();
            this.LLIZ.clear();
        }

        @Override // X.AbstractC1033980d0u
        public final void LJFF() throws JSONException {
            Integer num = this.LLILZ;
            if (num != null) {
                LJIILJJIL(num.intValue());
            }
        }

        @Override // X.AbstractC1033980d0u
        public final void LJI() {
            super.LJI();
            this.LLILZ = null;
            this.LLILZIL = false;
            this.LLILZLL.clear();
            this.LLIZ.clear();
        }

        @Override // X.AbstractC1033980d0u
        public final void LJII() {
            super.LJII();
            this.LLILZ = null;
            this.LLILZIL = false;
        }

        @Override // X.AbstractC1033980d0u
        public final void LIZJ(C0SCK c0sck) throws JSONException {
            Integer num;
            super.LIZJ(c0sck);
            if (c0sck instanceof C0SCH) {
                C0SCH c0sch = (C0SCH) c0sck;
                this.LLILZLL.add(Integer.valueOf(c0sch.LIZ));
                LJIILL(c0sch.LIZ, true);
                Integer num2 = this.LLILZ;
                int i = c0sch.LIZ;
                if (num2 != null && num2.intValue() == i) {
                    this.LLILZIL = false;
                    return;
                }
                return;
            }
            if (!(c0sck instanceof C1009260cN2) || (num = this.LLILZ) == null) {
                return;
            }
            LJIILL(num.intValue(), false);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
        @Override // X.AbstractC1033980d0u
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void LJIIIZ(int r8) throws org.json.JSONException {
            /*
                r7 = this;
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                r7.LLILZ = r0
                X.0d0t r5 = r7.LIZIZ(r8)
                r3 = 1
                r4 = 0
                if (r5 == 0) goto L1e
                java.util.List<X.0d1A> r1 = r5.LIZLLL
                if (r1 != 0) goto L14
                X.13BV r1 = X.C13BV.INSTANCE
            L14:
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L2d
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L2d
            L1e:
                java.util.Set<java.lang.Integer> r1 = r7.LLIZ
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                r1.remove(r0)
                r7.LLILZIL = r4
            L29:
                r7.LJIILJJIL(r8)
                return
            L2d:
                java.util.Iterator r6 = r1.iterator()
            L31:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L1e
                java.lang.Object r0 = r6.next()
                X.0d1A r0 = (X.InterfaceC1034140d1A) r0
                com.ss.android.ugc.aweme.IAnoleManager r1 = r5.LIZJ
                java.lang.String r0 = r0.getName()
                java.util.List r1 = r1.LJIIJ(r0)
                if (r1 != 0) goto L4b
                X.13BV r1 = X.C13BV.INSTANCE
            L4b:
                boolean r0 = r1 instanceof java.util.Collection
                if (r0 == 0) goto L56
                boolean r0 = r1.isEmpty()
                if (r0 == 0) goto L56
                goto L31
            L56:
                java.util.Iterator r2 = r1.iterator()
            L5a:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L31
                java.lang.Object r0 = r2.next()
                X.0cKt r0 = (X.InterfaceC1007930cKt) r0
                com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel r0 = r0.Ak()
                java.lang.String r1 = r0.type
                X.0cMU r0 = X.EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN
                java.lang.String r0 = r0.getType()
                boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
                if (r0 == 0) goto L5a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.util.Set<java.lang.Integer> r0 = r7.LLIZ
                r0.add(r1)
                r7.LLILZIL = r3
                goto L29
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C1033880d0k.LJIIIZ(int):void");
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIJ(int i) {
            super.LJIIJ(i);
            Integer num = this.LLILZ;
            if (num != null && num.intValue() == i) {
                this.LLILZ = null;
            }
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIJJI(int i) {
            super.LJIIJJI(i);
            this.LLILZLL.remove(Integer.valueOf(i));
            this.LLIZ.remove(Integer.valueOf(i));
            Integer num = this.LLILZ;
            if (num != null && num.intValue() == i) {
                this.LLILZ = null;
                this.LLILZIL = false;
            }
        }

        public final void LJIILJJIL(int i) throws JSONException {
            if (!this.LLILZIL || !this.LLIZ.contains(Integer.valueOf(i)) || !this.LLILZLL.contains(Integer.valueOf(i))) {
                return;
            }
            LJIILL(i, true);
            this.LLILZIL = false;
        }

        public final void LJIILL(final int i, boolean z) throws JSONException {
            final C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
            if (c1033970d0tLIZIZ == null) {
                return;
            }
            if (!z) {
                LJIILIIL(c1033970d0tLIZIZ, i, AFwS252S0000000_16.get$arr$(518));
            } else {
                C786410Ut5.v2().postFrameCallback(new Choreographer.FrameCallback() { // from class: X.0d17
                    @Override // android.view.Choreographer.FrameCallback
                    public final void doFrame(long j) throws JSONException {
                        LJIILIIL(c1033970d0tLIZIZ, i, AFwS252S0000000_16.get$arr$(519));
                    }
                });
            }
        }
    }, new AbstractC1033980d0u(this) { // from class: X.0d11
        public boolean LLILZ;
        public int LLILZIL = -1;

        @Override // X.AbstractC1033980d0u
        public final void LJFF() {
            this.LLILZ = true;
            this.LLILZIL = -1;
        }

        @Override // X.AbstractC1033980d0u
        public final void LJII() {
            super.LJII();
            this.LLILZ = false;
            this.LLILZIL = -1;
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIIZ(int i) throws JSONException {
            if (!this.LLILZ || this.LLILZIL == i) {
                return;
            }
            this.LLILZIL = i;
            C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
            if (c1033970d0tLIZIZ == null) {
                return;
            }
            LJIILIIL(c1033970d0tLIZIZ, i, AFwS252S0000000_16.get$arr$(516));
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIJ(int i) {
            super.LJIIJ(i);
            this.LLILZIL = -1;
        }
    }, new AbstractC1033980d0u(this) { // from class: X.0d0r
        public int LLILZ = -1;
        public int LLILZIL = -1;

        @Override // X.AbstractC1033980d0u
        public final void LJFF() {
            this.LLILZ = -1;
            this.LLILZIL = -1;
        }

        @Override // X.AbstractC1033980d0u
        public final void LJII() throws JSONException {
            int iIntValue;
            C1033970d0t c1033970d0tLIZIZ;
            Integer numValueOf = Integer.valueOf(this.LLILZ);
            if (numValueOf.intValue() >= 0 && (c1033970d0tLIZIZ = LIZIZ((iIntValue = numValueOf.intValue()))) != null && this.LLILZIL != iIntValue) {
                this.LLILZIL = iIntValue;
                LJIILIIL(c1033970d0tLIZIZ, iIntValue, AFwS252S0000000_16.get$arr$(517));
            }
            this.LLILZ = -1;
            this.LLILZIL = -1;
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIIZ(int i) {
            this.LLILZ = i;
        }

        @Override // X.AbstractC1033980d0u
        public final void LJIIJ(int i) throws JSONException {
            C1033970d0t c1033970d0tLIZIZ = LIZIZ(i);
            if (c1033970d0tLIZIZ != null && this.LLILZIL != i) {
                this.LLILZIL = i;
                LJIILIIL(c1033970d0tLIZIZ, i, AFwS252S0000000_16.get$arr$(517));
            }
        }
    }, new ViewOnLayoutChangeListenerC1034060d12(this));

    @Override // X.C0SM6
    public final void LJFF() {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJII();
        }
    }

    @Override // X.C0SM6
    public final List<IAnoleManager> LJI() {
        Collection collectionValues = ((LinkedHashMap) this.LJI).values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        Iterator it2 = collectionValues.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1033970d0t) it2.next()).LIZJ);
        }
        if (!arrayList.isEmpty()) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    @Override // X.C0SM6
    public final void LJII() {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJ(this.LIZIZ);
        }
    }

    @Override // X.C0SM6
    public final void LJIIIZ() {
        LJIIL(((Boolean) C1034390d1Z.LIZJ.getValue()).booleanValue());
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJI();
        }
    }

    @Override // X.C0SM6
    public final void LJJIIJ() {
        LJIIL(((Boolean) C1034390d1Z.LIZJ.getValue()).booleanValue());
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZLLL();
        }
    }

    @Override // X.C0SM6
    public final void LIZ(C0SCK c0sck) {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZJ(c0sck);
        }
    }

    @Override // X.C0SM6
    public final void LIZIZ(int i) {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJ(i);
        }
    }

    @Override // X.C0SM6
    public final void LIZJ(int i) {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJFF();
        }
    }

    @Override // X.InterfaceC1034260d1M
    public final C1033970d0t LIZLLL(int i) {
        return (C1033970d0t) ((LinkedHashMap) this.LJI).get(Integer.valueOf(i));
    }

    @Override // X.C0SM6
    public final void LJ(int i) {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIIZ(i);
        }
    }

    @Override // X.C0SM6
    public final void LJIIJ(int i) {
        Iterator<AbstractC1033980d0u> it2 = this.LJIIIIZZ.iterator();
        while (it2.hasNext()) {
            it2.next().LJIIJJI(i);
        }
    }

    public final void LJIIL(boolean z) {
        Iterator it2 = ((LinkedHashMap) this.LJI).entrySet().iterator();
        while (it2.hasNext()) {
            LJIIJJI((C1033970d0t) ((Map.Entry) it2.next()).getValue(), z);
            it2.remove();
        }
    }

    public static void LJIIJJI(C1033970d0t c1033970d0t, boolean z) {
        c1033970d0t.LIZJ.LIZ();
        List<InterfaceC1034140d1A> list = c1033970d0t.LIZLLL;
        if (list != null) {
            Iterator<InterfaceC1034140d1A> it2 = list.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ(c1033970d0t.LIZJ);
            }
        }
        if (z) {
            c1033970d0t.LIZJ.clear();
        }
        c1033970d0t.LIZIZ.setTag(R.id.dgf, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e4 A[ORIG_RETURN, RETURN] */
    @Override // X.C0SM6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(final int r18, android.view.View r19, com.ss.android.ugc.aweme.feed.model.Aweme r20) {
        /*
            Method dump skipped, instruction units count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1033870d0j.LJIIIIZZ(int, android.view.View, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public C1033870d0j(Context context, Aweme aweme, C1009340cNA c1009340cNA, InterfaceC1007910cKr interfaceC1007910cKr, C1008160cLG c1008160cLG) {
        this.LIZ = context;
        this.LIZIZ = aweme;
        this.LIZJ = c1009340cNA;
        this.LIZLLL = interfaceC1007910cKr;
        this.LJ = c1008160cLG;
    }
}
