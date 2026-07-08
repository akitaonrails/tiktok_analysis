package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y8k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869320Y8k extends C0YB2 {
    public final EnumC868530Y5j LIZ;
    public final Set<String> LIZIZ;
    public final Set<String> LIZJ;
    public final C0Y95 LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869320Y8k)) {
            return false;
        }
        C869320Y8k c869320Y8k = (C869320Y8k) obj;
        return this.LIZ == c869320Y8k.LIZ && Intrinsics.LJFF(this.LIZIZ, c869320Y8k.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c869320Y8k.LIZJ) && this.LIZLLL == c869320Y8k.LIZLLL;
    }

    public final int hashCode() {
        EnumC868530Y5j enumC868530Y5j = this.LIZ;
        return ((((((enumC868530Y5j == null ? 0 : enumC868530Y5j.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingsTableQueryInfo(category=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", tagsAllNeedQualified=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tagsNeedQualifiedAny=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", muteFlag=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YB2
    public final String LJ() {
        String strLIZIZ;
        String strLIZIZ2;
        int i = C0Y94.LIZ[this.LIZLLL.ordinal()];
        String strLIZIZ3 = "";
        if (i == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("");
            sbLIZ.append(' ');
            sbLIZ.append(EnumC869340Y8m.COLUMN_MUTE.key);
            sbLIZ.append(" = 0");
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
        } else if (i == 2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("");
            sbLIZ2.append(' ');
            sbLIZ2.append(EnumC869340Y8m.COLUMN_MUTE.key);
            sbLIZ2.append(" = 1");
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        if (this.LIZ != null) {
            EnumC868530Y5j enumC868530Y5j = EnumC868530Y5j.USER_SET_CONVERSATION_CATEGORY_PRIMARY;
            int value = enumC868530Y5j.getValue();
            if (strLIZIZ3.length() > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ3);
                sbLIZ3.append(" and ");
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ3);
            if (this.LIZ == enumC868530Y5j) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append(" (");
                EnumC869340Y8m enumC869340Y8m = EnumC869340Y8m.COLUMN_CATEGORY;
                sbLIZ5.append(enumC869340Y8m.key);
                sbLIZ5.append(" = ");
                sbLIZ5.append(value);
                sbLIZ5.append(" or ");
                sbLIZ5.append(enumC869340Y8m.key);
                sbLIZ5.append(" = 0 or ");
                sbLIZ5.append(enumC869340Y8m.key);
                sbLIZ5.append(" is null)");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ5);
            } else {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append(' ');
                sbLIZ6.append(EnumC869340Y8m.COLUMN_CATEGORY.key);
                sbLIZ6.append(" = ");
                sbLIZ6.append(this.LIZ.getValue());
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ6);
            }
            sbLIZ4.append(strLIZIZ2);
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ4);
        }
        for (String str : this.LIZIZ) {
            if (strLIZIZ3.length() > 0) {
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append(strLIZIZ3);
                sbLIZ7.append(" and ");
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ7);
            }
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(strLIZIZ3);
            sbLIZ8.append(' ');
            sbLIZ8.append(EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.key);
            sbLIZ8.append(" like '%");
            sbLIZ8.append(str);
            sbLIZ8.append("%' ESCAPE '\\'");
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ8);
        }
        int i2 = 0;
        for (Object obj : this.LIZJ) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            String str2 = (String) obj;
            if (i2 == 0) {
                if (strLIZIZ3.length() > 0) {
                    StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                    sbLIZ9.append(strLIZIZ3);
                    sbLIZ9.append(" and ");
                    strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ9);
                }
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append(strLIZIZ3);
                sbLIZ10.append(" (");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ10);
            } else {
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append(strLIZIZ3);
                sbLIZ11.append(" or ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ11);
            }
            StringBuilder sbLIZ12 = C2188811AlT.LIZ();
            sbLIZ12.append(strLIZIZ);
            sbLIZ12.append(' ');
            sbLIZ12.append(EnumC869340Y8m.COLUMN_CONVERSATION_TAGS.key);
            sbLIZ12.append(" like '%");
            sbLIZ12.append(str2);
            sbLIZ12.append("%' ESCAPE '\\'");
            strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ12);
            if (i2 == this.LIZJ.size() - 1) {
                StringBuilder sbLIZ13 = C2188811AlT.LIZ();
                sbLIZ13.append(strLIZIZ3);
                sbLIZ13.append(") ");
                strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ13);
            }
            i2 = i3;
        }
        return strLIZIZ3;
    }

    @Override // X.C0YB2
    public final String LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(" left join conversation_setting on conversation_list.");
        sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ.append(" = conversation_setting.");
        sbLIZ.append(EnumC869340Y8m.COLUMN_ID.key);
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0YB2
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("conversation_setting.*, conversation_list.");
        sbLIZ.append(EnumC869310Y8j.COLUMN_ID.key);
        sbLIZ.append(" as ");
        C0Y91.LIZ.getClass();
        sbLIZ.append("conversation_id_alias");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869320Y8k(EnumC868530Y5j enumC868530Y5j, Set<String> set, Set<String> set2, C0Y95 c0y95) {
        this.LIZ = enumC868530Y5j;
        this.LIZIZ = set;
        this.LIZJ = set2;
        this.LIZLLL = c0y95;
    }
}
