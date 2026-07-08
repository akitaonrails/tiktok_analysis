package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869300Y8i extends C0YB2 {
    public final C0Y97 LIZ;
    public final Integer LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;
    public final List<C869450Y8x> LJ;
    public final boolean LJFF;
    public final EnumC869410Y8t LJI;
    public final EnumC871430YGn LJII;
    public final long LJIIIIZZ;
    public final Integer LJIIIZ;
    public final AbstractC1176904j1 LJIIJ;

    @Override // X.C0YB2
    public final String LIZ() {
        return "";
    }

    @Override // X.C0YB2
    public final String LIZLLL() {
        return "conversation_list.*";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869300Y8i)) {
            return false;
        }
        C869300Y8i c869300Y8i = (C869300Y8i) obj;
        return this.LIZ == c869300Y8i.LIZ && Intrinsics.LJFF(this.LIZIZ, c869300Y8i.LIZIZ) && this.LIZJ == c869300Y8i.LIZJ && this.LIZLLL == c869300Y8i.LIZLLL && Intrinsics.LJFF(this.LJ, c869300Y8i.LJ) && this.LJFF == c869300Y8i.LJFF && this.LJI == c869300Y8i.LJI && this.LJII == c869300Y8i.LJII && this.LJIIIIZZ == c869300Y8i.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c869300Y8i.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c869300Y8i.LJIIJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Integer num = this.LIZIZ;
        int iHashCode2 = (((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL)) * 31;
        List<C869450Y8x> list = this.LJ;
        int iHashCode3 = (((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31;
        EnumC871430YGn enumC871430YGn = this.LJII;
        int iHashCode4 = (((iHashCode3 + (enumC871430YGn == null ? 0 : enumC871430YGn.hashCode())) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31;
        Integer num2 = this.LJIIIZ;
        return ((iHashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LJIIJ.hashCode();
    }

    public final String toString() {
        return "ConvTableQueryInfo(readFlag=" + this.LIZ + ", conversationType=" + this.LIZIZ + ", minOrder=" + this.LIZJ + ", maxOrder=" + this.LIZLLL + ", orderList=" + this.LJ + ", filterEmpty=" + this.LJFF + ", type=" + this.LJI + ", messageRequestType=" + this.LJII + ", maxConvId=" + this.LJIIIIZZ + ", inboxType=" + this.LJIIIZ + ", statusFilter=" + this.LJIIJ + ')';
    }

    public C869300Y8i() {
        this(C0Y97.ALL, null, -1L, -1L, null, false, EnumC869410Y8t.ALL, null, -1L, null, C1177004j2.LIZIZ);
    }

    @Override // X.C0YB2
    public final String LIZJ() {
        List<C869450Y8x> list = this.LJ;
        return (list == null || !(list.isEmpty() ^ true)) ? "" : C13LP.LJJLIIIJ(this.LJ, null, null, null, 0, null, new C869440Y8w(), 31);
    }

    @Override // X.C0YB2
    public final String LJ() {
        String strLIZIZ;
        int i;
        String strLIZIZ2;
        String strLIZIZ3;
        int i2 = C869420Y8u.LIZIZ[this.LJI.ordinal()];
        String strLIZIZ4 = "";
        if (i2 == 1) {
            EnumC871430YGn enumC871430YGn = this.LJII;
            if (enumC871430YGn == null || (i = C869420Y8u.LIZ[enumC871430YGn.ordinal()]) == 1) {
                strLIZIZ = "";
            } else if (i == 2) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(EnumC869310Y8j.COLUMN_RISKY.key);
                sbLIZ.append(" = 0");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                if (i != 3) {
                    throw new C1954807lC();
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("");
                sbLIZ2.append('(');
                String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ2);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ5);
                sbLIZ3.append(EnumC869310Y8j.COLUMN_STRANGER.key);
                sbLIZ3.append(" = 0");
                String strLIZIZ6 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ6);
                sbLIZ4.append(" and ");
                String strLIZIZ7 = C2188811AlT.LIZIZ(sbLIZ4);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(strLIZIZ7);
                EnumC869310Y8j enumC869310Y8j = EnumC869310Y8j.COLUMN_RISKY;
                sbLIZ5.append(enumC869310Y8j.key);
                sbLIZ5.append(" = 0");
                String strLIZIZ8 = C2188811AlT.LIZIZ(sbLIZ5);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(strLIZIZ8);
                sbLIZ6.append(" or ");
                String strLIZIZ9 = C2188811AlT.LIZIZ(sbLIZ6);
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ9);
                sbLIZ7.append(enumC869310Y8j.key);
                sbLIZ7.append(" = 1");
                String strLIZIZ10 = C2188811AlT.LIZIZ(sbLIZ7);
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append(strLIZIZ10);
                sbLIZ8.append(')');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ8);
            }
        } else if (i2 == 2) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append("");
            sbLIZ9.append(EnumC869310Y8j.COLUMN_STRANGER.key);
            sbLIZ9.append(" = 0");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ9);
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            if (this.LJII != null) {
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("");
                EnumC871430YGn enumC871430YGn2 = this.LJII;
                if (enumC871430YGn2 != null) {
                    int i3 = C869420Y8u.LIZ[enumC871430YGn2.ordinal()];
                    if (i3 == 1) {
                        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                        sbLIZ11.append(EnumC869310Y8j.COLUMN_STRANGER.key);
                        sbLIZ11.append(" = 1");
                        strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ11);
                    } else if (i3 == 2) {
                        StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                        sbLIZ12.append(EnumC869310Y8j.COLUMN_STRANGER.key);
                        sbLIZ12.append(" = 1 and ");
                        sbLIZ12.append(EnumC869310Y8j.COLUMN_RISKY.key);
                        sbLIZ12.append(" = 0");
                        strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ12);
                    } else if (i3 == 3) {
                        StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                        sbLIZ13.append(EnumC869310Y8j.COLUMN_RISKY.key);
                        sbLIZ13.append(" = 1");
                        strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ13);
                    }
                    sbLIZ10.append(strLIZIZ3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
                }
                throw new C1954807lC();
            }
            StringBuilder sbLIZ14 = C2188811AlT.LIZ();
            sbLIZ14.append("");
            sbLIZ14.append('(');
            String strLIZIZ11 = C2188811AlT.LIZIZ(sbLIZ14);
            StringBuilder sbLIZ15 = C2188811AlT.LIZ();
            sbLIZ15.append(strLIZIZ11);
            sbLIZ15.append(EnumC869310Y8j.COLUMN_STRANGER.key);
            sbLIZ15.append(" = 1");
            String strLIZIZ12 = C2188811AlT.LIZIZ(sbLIZ15);
            StringBuilder sbLIZ16 = C2188811AlT.LIZ();
            sbLIZ16.append(strLIZIZ12);
            sbLIZ16.append(" or ");
            String strLIZIZ13 = C2188811AlT.LIZIZ(sbLIZ16);
            StringBuilder sbLIZ17 = C2188811AlT.LIZ();
            sbLIZ17.append(strLIZIZ13);
            sbLIZ17.append(EnumC869310Y8j.COLUMN_RISKY.key);
            sbLIZ17.append(" = 1");
            String strLIZIZ14 = C2188811AlT.LIZIZ(sbLIZ17);
            StringBuilder sbLIZ18 = C2188811AlT.LIZ();
            sbLIZ18.append(strLIZIZ14);
            sbLIZ18.append(')');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ18);
        }
        C0Y97 c0y97 = this.LIZ;
        if (c0y97 == C0Y97.UNREAD) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ19 = C2188811AlT.LIZ();
                sbLIZ19.append(strLIZIZ);
                sbLIZ19.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ19);
            }
            StringBuilder sbLIZ20 = C2188811AlT.LIZ();
            sbLIZ20.append(strLIZIZ);
            sbLIZ20.append(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key);
            sbLIZ20.append(" > 0");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ20);
        } else if (c0y97 == C0Y97.READ) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ21 = C2188811AlT.LIZ();
                sbLIZ21.append(strLIZIZ);
                sbLIZ21.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ21);
            }
            StringBuilder sbLIZ22 = C2188811AlT.LIZ();
            sbLIZ22.append(strLIZIZ);
            sbLIZ22.append(EnumC869310Y8j.COLUMN_UNREAD_COUNT.key);
            sbLIZ22.append(" = 0");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ22);
        }
        if (this.LIZIZ != null) {
            EnumC869400Y8s[] enumC869400Y8sArrValues = EnumC869400Y8s.values();
            ArrayList arrayList = new ArrayList(enumC869400Y8sArrValues.length);
            for (EnumC869400Y8s enumC869400Y8s : enumC869400Y8sArrValues) {
                arrayList.add(Integer.valueOf(enumC869400Y8s.getValue()));
            }
            if (arrayList.contains(this.LIZIZ)) {
                if (strLIZIZ.length() > 0) {
                    StringBuilder sbLIZ23 = C2188811AlT.LIZ();
                    sbLIZ23.append(strLIZIZ);
                    sbLIZ23.append(" and ");
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ23);
                }
                StringBuilder sbLIZ24 = C2188811AlT.LIZ();
                sbLIZ24.append(strLIZIZ);
                sbLIZ24.append(EnumC869310Y8j.COLUMN_CONVERSATION_TYPE.key);
                sbLIZ24.append(" = ");
                sbLIZ24.append(this.LIZIZ);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ24);
            }
        }
        if (this.LJIIIZ != null) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ25 = C2188811AlT.LIZ();
                sbLIZ25.append(strLIZIZ);
                sbLIZ25.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ25);
            }
            StringBuilder sbLIZ26 = C2188811AlT.LIZ();
            sbLIZ26.append(strLIZIZ);
            sbLIZ26.append(EnumC869310Y8j.COLUMN_INBOX.key);
            sbLIZ26.append(" = ");
            sbLIZ26.append(this.LJIIIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ26);
        }
        if (this.LIZJ != -1 || this.LIZLLL != -1) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ27 = C2188811AlT.LIZ();
                sbLIZ27.append(strLIZIZ);
                sbLIZ27.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ27);
            }
            StringBuilder sbLIZ28 = C2188811AlT.LIZ();
            sbLIZ28.append(strLIZIZ);
            if (this.LJII == null) {
                if (this.LIZJ == this.LIZLLL) {
                    StringBuilder sbLIZ29 = C2188811AlT.LIZ();
                    sbLIZ29.append(EnumC869310Y8j.COLUMN_SORT_ORDER.key);
                    sbLIZ29.append(" = ");
                    sbLIZ29.append(this.LIZJ);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ29);
                } else {
                    StringBuilder sbLIZ30 = C2188811AlT.LIZ();
                    sbLIZ30.append(EnumC869310Y8j.COLUMN_SORT_ORDER.key);
                    sbLIZ30.append(" between ");
                    sbLIZ30.append(this.LIZJ);
                    sbLIZ30.append(" and ");
                    sbLIZ30.append(this.LIZLLL);
                    strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ30);
                }
            } else if (this.LIZJ == this.LIZLLL) {
                StringBuilder sbLIZ31 = C2188811AlT.LIZ();
                sbLIZ31.append(EnumC869310Y8j.COLUMN_UPDATE_TIME.key);
                sbLIZ31.append(" = ");
                sbLIZ31.append(this.LIZJ);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ31);
            } else {
                StringBuilder sbLIZ32 = C2188811AlT.LIZ();
                sbLIZ32.append(EnumC869310Y8j.COLUMN_UPDATE_TIME.key);
                sbLIZ32.append(" between ");
                sbLIZ32.append(this.LIZJ);
                sbLIZ32.append(" and ");
                sbLIZ32.append(this.LIZLLL);
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ32);
            }
            sbLIZ28.append(strLIZIZ2);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ28);
        }
        if (this.LJIIIIZZ != -1) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ33 = C2188811AlT.LIZ();
                sbLIZ33.append(strLIZIZ);
                sbLIZ33.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ33);
            }
            StringBuilder sbLIZ34 = C2188811AlT.LIZ();
            sbLIZ34.append(strLIZIZ);
            sbLIZ34.append(EnumC869310Y8j.COLUMN_SHORT_ID.key);
            sbLIZ34.append(" < ");
            sbLIZ34.append(this.LJIIIIZZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ34);
        }
        AbstractC1176904j1 abstractC1176904j1 = this.LJIIJ;
        String str = EnumC869310Y8j.COLUMN_STATUS.key;
        if (!(abstractC1176904j1 instanceof C1177004j2)) {
            if (abstractC1176904j1 instanceof C1176704iz) {
                StringBuilder sbLIZ35 = C2188811AlT.LIZ();
                sbLIZ35.append(str);
                sbLIZ35.append(" = ");
                abstractC1176904j1.getClass();
                sbLIZ35.append(0);
                strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ35);
            } else {
                if (abstractC1176904j1 instanceof C1176604iy) {
                    abstractC1176904j1.getClass();
                    throw null;
                }
                if (!(abstractC1176904j1 instanceof C1176804j0)) {
                    throw new C1954807lC();
                }
                C1176804j0 c1176804j0 = (C1176804j0) abstractC1176904j1;
                if (!c1176804j0.LIZIZ.isEmpty()) {
                    StringBuilder sbLIZ36 = C2188811AlT.LIZ();
                    sbLIZ36.append('(');
                    sbLIZ36.append(str);
                    sbLIZ36.append(" is null or ");
                    sbLIZ36.append(str);
                    sbLIZ36.append(" not in (");
                    sbLIZ36.append(C13LP.LJJLIIIJ(c1176804j0.LIZIZ, ",", null, null, 0, null, null, 62));
                    sbLIZ36.append("))");
                    strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ36);
                }
            }
        }
        if (strLIZIZ4.length() > 0) {
            if (strLIZIZ.length() > 0) {
                StringBuilder sbLIZ37 = C2188811AlT.LIZ();
                sbLIZ37.append(strLIZIZ);
                sbLIZ37.append(" and ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ37);
            }
            StringBuilder sbLIZ38 = C2188811AlT.LIZ();
            sbLIZ38.append(strLIZIZ);
            sbLIZ38.append(strLIZIZ4);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ38);
        }
        if (!this.LJFF) {
            return strLIZIZ;
        }
        if (strLIZIZ.length() > 0) {
            StringBuilder sbLIZ39 = C2188811AlT.LIZ();
            sbLIZ39.append(strLIZIZ);
            sbLIZ39.append(" and ");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ39);
        }
        StringBuilder sbLIZ40 = C2188811AlT.LIZ();
        sbLIZ40.append(strLIZIZ);
        sbLIZ40.append(EnumC869310Y8j.COLUMN_LAST_MSG_UUID.key);
        sbLIZ40.append(" <> ''");
        return C2188811AlT.LIZIZ(sbLIZ40);
    }

    public C869300Y8i(C0Y97 c0y97, Integer num, long j, long j2, List<C869450Y8x> list, boolean z, EnumC869410Y8t enumC869410Y8t, EnumC871430YGn enumC871430YGn, long j3, Integer num2, AbstractC1176904j1 abstractC1176904j1) {
        this.LIZ = c0y97;
        this.LIZIZ = num;
        this.LIZJ = j;
        this.LIZLLL = j2;
        this.LJ = list;
        this.LJFF = z;
        this.LJI = enumC869410Y8t;
        this.LJII = enumC871430YGn;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = num2;
        this.LJIIJ = abstractC1176904j1;
    }
}
