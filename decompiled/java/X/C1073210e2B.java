package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.auth.dialogcenter.RelationFreqControlData;
import com.ss.android.ugc.aweme.relation.frequencycenter.service.IAuthFrequencyService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e2B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073210e2B implements InterfaceC1264610j0t {
    public final C1071630dzd LIZ;
    public C1073410e2V LIZIZ;
    public final C01GW LIZJ;

    public final C095D LIZIZ() {
        return new C095D(new C1073220e2C(this, null));
    }

    @Override // X.InterfaceC1264610j0t
    public final boolean check() throws Throwable {
        C013C c013c = new C013C();
        c013c.element = true;
        C23250099c.LJ(C23271099x.INSTANCE, new C1073230e2D(this, c013c, null));
        return c013c.element;
    }

    public C1073210e2B(C1071630dzd c1071630dzd) {
        C1073410e2V c1073410e2V = new C1073410e2V(c1071630dzd, new C1073120e22(0));
        this.LIZ = c1071630dzd;
        this.LIZIZ = c1073410e2V;
        this.LIZJ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<InterfaceC1073390e2T> LIZ(boolean z) {
        final int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        final boolean z2 = true;
        if (this.LIZ.LJFF.LIZ == EnumC1070340dxY.EMAIL) {
            return C1697810uHb.LJIIJJI(new InterfaceC1073390e2T() { // from class: X.0e1x
                public final boolean LIZ;
                public final Function0<Boolean> LIZIZ;

                {
                    boolean zLIZ = C1073090e1z.LIZ();
                    AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(221);
                    this.LIZ = zLIZ;
                    this.LIZIZ = aFwS189S0000000_3;
                }

                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    boolean z3;
                    ArrayList arrayList = new ArrayList();
                    EnumC1070340dxY enumC1070340dxY = EnumC1070340dxY.EMAIL;
                    if (!C1070450dxj.LIZ(enumC1070340dxY)) {
                        arrayList.add(enumC1070340dxY);
                    }
                    if (this.LIZIZ.invoke().booleanValue() && this.LIZ && (!arrayList.isEmpty())) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, z3, null, null, arrayList, false, null, null, false, 246);
                }
            }, new InterfaceC1073390e2T() { // from class: X.0e2F
                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, C2276131E7f.LIZ(C1E7L.EMAIL, null), null, null, null, false, null, null, false, 254);
                }
            }, new InterfaceC1073390e2T() { // from class: X.0e2N
                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, null, false, null, EnumC1073290e2J.START_AUTH_PIPELINE, false, 190);
                }
            }, new C1073130e23(), new InterfaceC1073540e2i() { // from class: X.0e2E
                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    C1E7L c1e7l = C1E7L.EMAIL;
                    C2276131E7f.LIZLLL(c1e7l);
                    C2276131E7f.LIZJ(c1e7l);
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, false, null, null, null, false, null, EnumC1073290e2J.UPDATE_LOCAL_FREQ_DATA, false, 191);
                }
            });
        }
        if (z) {
            final Object[] objArr5 = objArr4 == true ? 1 : 0;
            return C1697810uHb.LJIIJJI(new InterfaceC1073540e2i(i) { // from class: X.0e2A
                public final Keva LIZ;
                public final Function0<Boolean> LIZIZ;

                {
                    String str = C1071790dzt.LIZIZ;
                    Keva keva = C1071800dzu.LIZ().LIZ;
                    AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(12);
                    this.LIZ = keva;
                    this.LIZIZ = aFwS204S0000000_16;
                }

                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    EnumC1070340dxY enumC1070340dxY;
                    int i2 = this.LIZ.getInt("last_permission_pop_up_type", 0);
                    if (this.LIZIZ.invoke().booleanValue()) {
                        enumC1070340dxY = EnumC1070340dxY.CONTACT;
                    } else {
                        int i3 = this.LIZ.getInt("contact_pop_up_count", 0);
                        if (i2 != 0) {
                            if (i2 != 1) {
                                if (i2 == 2) {
                                    enumC1070340dxY = EnumC1070340dxY.CONTACT;
                                } else {
                                    "wrong relationAuthPlatform".toString();
                                    throw new IllegalStateException("wrong relationAuthPlatform");
                                }
                            } else {
                                enumC1070340dxY = EnumC1070340dxY.FACEBOOK;
                            }
                        } else if (i3 > 0) {
                            enumC1070340dxY = EnumC1070340dxY.FACEBOOK;
                        } else {
                            enumC1070340dxY = EnumC1070340dxY.CONTACT;
                        }
                    }
                    AbstractC1073470e2b abstractC1073470e2b = c1073410e2V.LIZ.LJ.LIZIZ;
                    if (!Intrinsics.LJFF(abstractC1073470e2b, C1073450e2Z.LIZ)) {
                        if (abstractC1073470e2b instanceof C1073460e2a) {
                            enumC1070340dxY = ((C1073460e2a) abstractC1073470e2b).LIZ;
                        } else {
                            throw new C1954807lC();
                        }
                    }
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, enumC1070340dxY, null, null, false, null, null, false, 252);
                }
            }, new InterfaceC1073540e2i() { // from class: X.0e21
                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    List listLJLIL;
                    EnumC1070340dxY enumC1070340dxY = c1073410e2V.LIZIZ.LIZIZ;
                    AbstractC1073160e26 abstractC1073160e26 = c1073410e2V.LIZ.LJ.LIZJ;
                    if (Intrinsics.LJFF(abstractC1073160e26, new AbstractC1073160e26() { // from class: X.0e27
                    })) {
                        listLJLIL = Collections.singletonList(enumC1070340dxY);
                    } else if (abstractC1073160e26 instanceof C1073100e20) {
                        listLJLIL = C13LP.LJLIL(C13LP.LJLIIIL(enumC1070340dxY, ((C1073100e20) abstractC1073160e26).LIZ), Collections.singletonList(enumC1070340dxY));
                    } else {
                        throw new C1954807lC();
                    }
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, listLJLIL, false, null, null, false, 246);
                }
            }, new InterfaceC1073540e2i(objArr5) { // from class: X.0e1v
                public final Keva LIZ;
                public final boolean LIZIZ;
                public final Function0<Boolean> LIZJ;

                {
                    String str = C1071790dzt.LIZIZ;
                    Keva keva = C1071800dzu.LIZ().LIZ;
                    boolean zLIZ = C1073090e1z.LIZ();
                    AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(220);
                    this.LIZ = keva;
                    this.LIZIZ = zLIZ;
                    this.LIZJ = aFwS189S0000000_3;
                }

                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    boolean z3;
                    List<EnumC1070340dxY> list = c1073410e2V.LIZIZ.LIZLLL;
                    ArrayList arrayList = new ArrayList();
                    Iterator<EnumC1070340dxY> it2 = list.iterator();
                    while (true) {
                        z3 = true;
                        if (!it2.hasNext()) {
                            break;
                        }
                        EnumC1070340dxY next = it2.next();
                        if (!C1070450dxj.LIZ(next)) {
                            Boolean.valueOf(arrayList.add(next));
                        } else {
                            this.LIZ.storeBoolean(C1071190dyv.LIZ(next), true);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        this.LIZ.storeBoolean("has_go_through_process", true);
                    }
                    if (!this.LIZJ.invoke().booleanValue() || !this.LIZIZ || !(!arrayList.isEmpty())) {
                        z3 = false;
                    }
                    return C1073120e22.LIZ(c1073410e2V.LIZIZ, z3, null, null, arrayList, false, null, null, false, 246);
                }
            }, new InterfaceC1073540e2i(z2) { // from class: X.0e28
                public final boolean LIZ;
                public final Keva LIZIZ;
                public final C01GW LIZJ;

                public final RelationFreqControlData LIZIZ() {
                    return new RelationFreqControlData(this.LIZIZ.getInt("reask_count", 0) + this.LIZIZ.getInt("rules_major_stage", 0), this.LIZIZ.getLong("last_show_contact_time", 0L), this.LIZIZ.getInt("rules_major_stage", 0), this.LIZIZ.getInt("reask_count", 0), Math.max(this.LIZIZ.getInt("total_pop_up_count", 0), this.LIZIZ.getInt("rules_major_stage", 0) + this.LIZIZ.getInt("reask_count", 0)));
                }

                {
                    this.LIZ = z2;
                    String str = C1071790dzt.LIZIZ;
                    this.LIZIZ = C1071800dzu.LIZ().LIZ;
                    this.LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(11));
                }

                @Override // X.InterfaceC1073390e2T
                public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                    boolean zLIZ;
                    int i2 = C1070900dyS.LIZ[c1073410e2V.LIZ.LJ.LIZ.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, null, false, LIZIZ(), null, false, 222);
                        }
                        throw new C1954807lC();
                    }
                    C1073120e22 c1073120e22 = c1073410e2V.LIZIZ;
                    EnumC1073320e2M enumC1073320e2M = c1073410e2V.LIZ.LIZLLL;
                    if (((IAuthFrequencyService) this.LIZJ.getValue()).LJIIJ()) {
                        zLIZ = C2276131E7f.LIZ(C1E7L.AUTH_PHASE2, new C1073300e2K(enumC1073320e2M, this.LIZ));
                    } else {
                        zLIZ = C2276131E7f.LIZ(C1E7L.AUTH_PHASE1, new C1073300e2K(enumC1073320e2M, this.LIZ));
                    }
                    return C1073120e22.LIZ(c1073120e22, zLIZ, null, null, null, ((IAuthFrequencyService) this.LIZJ.getValue()).LJIIJ(), LIZIZ(), null, false, 206);
                }
            });
        }
        final Object[] objArr6 = objArr3 == true ? 1 : 0;
        final Object[] objArr7 = objArr2 == true ? 1 : 0;
        final Object[] objArr8 = objArr == true ? 1 : 0;
        return C1697810uHb.LJIIJJI(new InterfaceC1073540e2i(objArr6) { // from class: X.0e2A
            public final Keva LIZ;
            public final Function0<Boolean> LIZIZ;

            {
                String str = C1071790dzt.LIZIZ;
                Keva keva = C1071800dzu.LIZ().LIZ;
                AFwS204S0000000_16 aFwS204S0000000_16 = AFwS204S0000000_16.get$arr$(12);
                this.LIZ = keva;
                this.LIZIZ = aFwS204S0000000_16;
            }

            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                EnumC1070340dxY enumC1070340dxY;
                int i2 = this.LIZ.getInt("last_permission_pop_up_type", 0);
                if (this.LIZIZ.invoke().booleanValue()) {
                    enumC1070340dxY = EnumC1070340dxY.CONTACT;
                } else {
                    int i3 = this.LIZ.getInt("contact_pop_up_count", 0);
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                enumC1070340dxY = EnumC1070340dxY.CONTACT;
                            } else {
                                "wrong relationAuthPlatform".toString();
                                throw new IllegalStateException("wrong relationAuthPlatform");
                            }
                        } else {
                            enumC1070340dxY = EnumC1070340dxY.FACEBOOK;
                        }
                    } else if (i3 > 0) {
                        enumC1070340dxY = EnumC1070340dxY.FACEBOOK;
                    } else {
                        enumC1070340dxY = EnumC1070340dxY.CONTACT;
                    }
                }
                AbstractC1073470e2b abstractC1073470e2b = c1073410e2V.LIZ.LJ.LIZIZ;
                if (!Intrinsics.LJFF(abstractC1073470e2b, C1073450e2Z.LIZ)) {
                    if (abstractC1073470e2b instanceof C1073460e2a) {
                        enumC1070340dxY = ((C1073460e2a) abstractC1073470e2b).LIZ;
                    } else {
                        throw new C1954807lC();
                    }
                }
                return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, enumC1070340dxY, null, null, false, null, null, false, 252);
            }
        }, new InterfaceC1073540e2i() { // from class: X.0e21
            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                List listLJLIL;
                EnumC1070340dxY enumC1070340dxY = c1073410e2V.LIZIZ.LIZIZ;
                AbstractC1073160e26 abstractC1073160e26 = c1073410e2V.LIZ.LJ.LIZJ;
                if (Intrinsics.LJFF(abstractC1073160e26, new AbstractC1073160e26() { // from class: X.0e27
                })) {
                    listLJLIL = Collections.singletonList(enumC1070340dxY);
                } else if (abstractC1073160e26 instanceof C1073100e20) {
                    listLJLIL = C13LP.LJLIL(C13LP.LJLIIIL(enumC1070340dxY, ((C1073100e20) abstractC1073160e26).LIZ), Collections.singletonList(enumC1070340dxY));
                } else {
                    throw new C1954807lC();
                }
                return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, listLJLIL, false, null, null, false, 246);
            }
        }, new InterfaceC1073540e2i(objArr7) { // from class: X.0e1v
            public final Keva LIZ;
            public final boolean LIZIZ;
            public final Function0<Boolean> LIZJ;

            {
                String str = C1071790dzt.LIZIZ;
                Keva keva = C1071800dzu.LIZ().LIZ;
                boolean zLIZ = C1073090e1z.LIZ();
                AFwS189S0000000_3 aFwS189S0000000_3 = AFwS189S0000000_3.get$arr$(220);
                this.LIZ = keva;
                this.LIZIZ = zLIZ;
                this.LIZJ = aFwS189S0000000_3;
            }

            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                boolean z3;
                List<EnumC1070340dxY> list = c1073410e2V.LIZIZ.LIZLLL;
                ArrayList arrayList = new ArrayList();
                Iterator<EnumC1070340dxY> it2 = list.iterator();
                while (true) {
                    z3 = true;
                    if (!it2.hasNext()) {
                        break;
                    }
                    EnumC1070340dxY next = it2.next();
                    if (!C1070450dxj.LIZ(next)) {
                        Boolean.valueOf(arrayList.add(next));
                    } else {
                        this.LIZ.storeBoolean(C1071190dyv.LIZ(next), true);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.LIZ.storeBoolean("has_go_through_process", true);
                }
                if (!this.LIZJ.invoke().booleanValue() || !this.LIZIZ || !(!arrayList.isEmpty())) {
                    z3 = false;
                }
                return C1073120e22.LIZ(c1073410e2V.LIZIZ, z3, null, null, arrayList, false, null, null, false, 246);
            }
        }, new InterfaceC1073540e2i(objArr8) { // from class: X.0e28
            public final boolean LIZ;
            public final Keva LIZIZ;
            public final C01GW LIZJ;

            public final RelationFreqControlData LIZIZ() {
                return new RelationFreqControlData(this.LIZIZ.getInt("reask_count", 0) + this.LIZIZ.getInt("rules_major_stage", 0), this.LIZIZ.getLong("last_show_contact_time", 0L), this.LIZIZ.getInt("rules_major_stage", 0), this.LIZIZ.getInt("reask_count", 0), Math.max(this.LIZIZ.getInt("total_pop_up_count", 0), this.LIZIZ.getInt("rules_major_stage", 0) + this.LIZIZ.getInt("reask_count", 0)));
            }

            {
                this.LIZ = objArr8;
                String str = C1071790dzt.LIZIZ;
                this.LIZIZ = C1071800dzu.LIZ().LIZ;
                this.LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(11));
            }

            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                boolean zLIZ;
                int i2 = C1070900dyS.LIZ[c1073410e2V.LIZ.LJ.LIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, null, false, LIZIZ(), null, false, 222);
                    }
                    throw new C1954807lC();
                }
                C1073120e22 c1073120e22 = c1073410e2V.LIZIZ;
                EnumC1073320e2M enumC1073320e2M = c1073410e2V.LIZ.LIZLLL;
                if (((IAuthFrequencyService) this.LIZJ.getValue()).LJIIJ()) {
                    zLIZ = C2276131E7f.LIZ(C1E7L.AUTH_PHASE2, new C1073300e2K(enumC1073320e2M, this.LIZ));
                } else {
                    zLIZ = C2276131E7f.LIZ(C1E7L.AUTH_PHASE1, new C1073300e2K(enumC1073320e2M, this.LIZ));
                }
                return C1073120e22.LIZ(c1073120e22, zLIZ, null, null, null, ((IAuthFrequencyService) this.LIZJ.getValue()).LJIIJ(), LIZIZ(), null, false, 206);
            }
        }, new InterfaceC1073540e2i() { // from class: X.0e2G
            {
                String str = C1071790dzt.LIZIZ;
                C1071800dzu.LIZ();
            }

            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                return C1073120e22.LIZ(c1073410e2V.LIZIZ, true, null, null, null, false, null, EnumC1073290e2J.START_AUTH_PIPELINE, false, 190);
            }
        }, new C1073040e1u(), new InterfaceC1073540e2i() { // from class: X.0e29
            public final Keva LIZ;

            {
                String str = C1071790dzt.LIZIZ;
                this.LIZ = C1071800dzu.LIZ().LIZ;
            }

            @Override // X.InterfaceC1073390e2T
            public final Object LIZ(C1073410e2V c1073410e2V, InterfaceC1364105Vn<? super C1073120e22> interfaceC1364105Vn) {
                C1073120e22 c1073120e22 = c1073410e2V.LIZIZ;
                if (c1073120e22.LJII) {
                    return C1073120e22.LIZ(c1073120e22, false, null, null, null, false, null, EnumC1073290e2J.UPDATE_LOCAL_FREQ_DATA, false, 191);
                }
                EnumC1070340dxY enumC1070340dxY = c1073120e22.LIZJ;
                int i2 = 1;
                this.LIZ.storeInt("total_pop_up_count", c1073120e22.LJFF.totalPopupCount + 1);
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i3 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("NEWAUTH - UpdateContactFBLocalFreqDataTask, lastShowPlatform ");
                sbLIZ.append(enumC1070340dxY);
                sbLIZ.append(", lastShowTime ");
                sbLIZ.append(jCurrentTimeMillis);
                C2188811AlT.LIZIZ(sbLIZ);
                int i4 = C1073270e2H.LIZ[c1073410e2V.LIZ.LJ.LIZLLL.ordinal()];
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            C2276131E7f.LIZLLL(C1E7L.AUTH);
                            Keva keva = this.LIZ;
                            int i5 = C1073270e2H.LIZIZ[enumC1070340dxY.ordinal()];
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    i2 = 2;
                                } else {
                                    "wrong relationAuthPlatform".toString();
                                    throw new IllegalStateException("wrong relationAuthPlatform");
                                }
                            }
                            keva.storeInt("last_permission_pop_up_type", i2);
                            if (c1073410e2V.LIZIZ.LJ) {
                                C2276131E7f.LIZJ(C1E7L.AUTH_PHASE2);
                            } else {
                                C2276131E7f.LIZJ(C1E7L.AUTH_PHASE1);
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        C2276131E7f.LIZLLL(C1E7L.AUTH);
                        Keva keva2 = this.LIZ;
                        int i6 = C1073270e2H.LIZIZ[enumC1070340dxY.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                i2 = 2;
                            } else {
                                "wrong relationAuthPlatform".toString();
                                throw new IllegalStateException("wrong relationAuthPlatform");
                            }
                        }
                        keva2.storeInt("last_permission_pop_up_type", i2);
                    }
                }
                return C1073120e22.LIZ(c1073410e2V.LIZIZ, false, null, null, null, false, null, EnumC1073290e2J.UPDATE_LOCAL_FREQ_DATA, false, 191);
            }
        });
    }
}
