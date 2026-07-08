package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.12zz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19939712zz {
    public final Set<AnonymousClass1302> LIZ;
    public final Map<String, AbstractC19939512zx> LIZJ = new HashMap();
    public final boolean LIZIZ = true;

    public C19939712zz(AnonymousClass1302[] anonymousClass1302Arr) {
        this.LIZ = Collections.newSetFromMap(new IdentityHashMap(anonymousClass1302Arr.length));
        for (AnonymousClass1302 anonymousClass1302 : anonymousClass1302Arr) {
            this.LIZ.add(anonymousClass1302);
            LIZLLL(anonymousClass1302);
        }
        for (AnonymousClass1302 anonymousClass13022 : this.LIZ) {
            try {
                LIZ(anonymousClass13022, anonymousClass13022.LLILLJJLI.getPackage());
            } catch (C19939612zy e) {
                TryCatchGuardChecker.doCheck(e);
                throw new AssertionError(e);
            }
        }
    }

    public final void LIZIZ(AbstractC19939512zx abstractC19939512zx) {
        String strLJIIIZ = abstractC19939512zx.LJIIIZ();
        if (strLJIIIZ.length() != 0) {
            for (int i = 0; i < strLJIIIZ.length(); i++) {
                char cCharAt = strLJIIIZ.charAt(i);
                if ('a' <= cCharAt) {
                    if (cCharAt > 'z') {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append('\"');
                        sbLIZ.append(strLJIIIZ);
                        sbLIZ.append("\" is not a valid identifier.");
                        throw new C19939612zy(abstractC19939512zx, C2188811AlT.LIZIZ(sbLIZ));
                    }
                } else {
                    if (('A' > cCharAt || (cCharAt > 'Z' && cCharAt != '_')) && ('0' > cCharAt || cCharAt > '9' || i <= 0)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append('\"');
                        sbLIZ2.append(strLJIIIZ);
                        sbLIZ2.append("\" is not a valid identifier.");
                        throw new C19939612zy(abstractC19939512zx, C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
            }
            String strLJII = abstractC19939512zx.LJII();
            AbstractC19939512zx abstractC19939512zxPut = this.LIZJ.put(strLJII, abstractC19939512zx);
            if (abstractC19939512zxPut != null) {
                this.LIZJ.put(strLJII, abstractC19939512zxPut);
                if (abstractC19939512zx.LJI() == abstractC19939512zxPut.LJI()) {
                    int iLastIndexOf = strLJII.lastIndexOf(46);
                    if (iLastIndexOf == -1) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append('\"');
                        sbLIZ3.append(strLJII);
                        sbLIZ3.append("\" is already defined.");
                        throw new C19939612zy(abstractC19939512zx, C2188811AlT.LIZIZ(sbLIZ3));
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append('\"');
                    sbLIZ4.append(strLJII.substring(iLastIndexOf + 1));
                    sbLIZ4.append("\" is already defined in \"");
                    sbLIZ4.append(strLJII.substring(0, iLastIndexOf));
                    sbLIZ4.append("\".");
                    throw new C19939612zy(abstractC19939512zx, C2188811AlT.LIZIZ(sbLIZ4));
                }
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append('\"');
                sbLIZ5.append(strLJII);
                sbLIZ5.append("\" is already defined in file \"");
                sbLIZ5.append(abstractC19939512zxPut.LJI().LJIIIZ());
                sbLIZ5.append("\".");
                throw new C19939612zy(abstractC19939512zx, C2188811AlT.LIZIZ(sbLIZ5));
            }
            return;
        }
        throw new C19939612zy(abstractC19939512zx, "Missing name.");
    }

    public final void LIZLLL(AnonymousClass1302 anonymousClass1302) {
        for (AnonymousClass1302 anonymousClass13022 : Collections.unmodifiableList(Arrays.asList(anonymousClass1302.LLIZLLLIL))) {
            if (this.LIZ.add(anonymousClass13022)) {
                LIZLLL(anonymousClass13022);
            }
        }
    }

    public final void LIZ(final AnonymousClass1302 anonymousClass1302, final String str) {
        final String strSubstring;
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf == -1) {
            strSubstring = str;
        } else {
            LIZ(anonymousClass1302, str.substring(0, iLastIndexOf));
            strSubstring = str.substring(iLastIndexOf + 1);
        }
        AbstractC19939512zx abstractC19939512zx = (AbstractC19939512zx) ((HashMap) this.LIZJ).put(str, new AbstractC19939512zx(strSubstring, str, anonymousClass1302) { // from class: X.1300
            public final String LLILLJJLI;
            public final String LLILLL;
            public final AnonymousClass1302 LLILZ;

            @Override // X.AbstractC19939512zx
            public final InterfaceC19930912yZ LJIILJJIL() {
                return this.LLILZ.LLILLJJLI;
            }

            @Override // X.AbstractC19939512zx
            public final AnonymousClass1302 LJI() {
                return this.LLILZ;
            }

            @Override // X.AbstractC19939512zx
            public final String LJII() {
                return this.LLILLL;
            }

            @Override // X.AbstractC19939512zx
            public final String LJIIIZ() {
                return this.LLILLJJLI;
            }

            @Override // X.AbstractC19939512zx
            public final AbstractC19939512zx LJIIJ() {
                return this.LLILZ;
            }

            {
                this.LLILZ = anonymousClass1302;
                this.LLILLL = str;
                this.LLILLJJLI = strSubstring;
            }
        });
        if (abstractC19939512zx != null) {
            ((HashMap) this.LIZJ).put(str, abstractC19939512zx);
            if (!(abstractC19939512zx instanceof AnonymousClass1300)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('\"');
                sbLIZ.append(strSubstring);
                sbLIZ.append("\" is already defined (as something other than a package) in file \"");
                sbLIZ.append(abstractC19939512zx.LJI().LJIIIZ());
                sbLIZ.append("\".");
                throw new C19939612zy(anonymousClass1302, C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    public final AbstractC19939512zx LIZJ(String str, EnumC19939412zw enumC19939412zw) {
        AbstractC19939512zx abstractC19939512zx = (AbstractC19939512zx) ((HashMap) this.LIZJ).get(str);
        if (abstractC19939512zx != null && (enumC19939412zw == EnumC19939412zw.ALL_SYMBOLS || ((enumC19939412zw == EnumC19939412zw.TYPES_ONLY && ((abstractC19939512zx instanceof AnonymousClass1301) || (abstractC19939512zx instanceof C199422130y))) || (enumC19939412zw == EnumC19939412zw.AGGREGATES_ONLY && ((abstractC19939512zx instanceof AnonymousClass1301) || (abstractC19939512zx instanceof C199422130y) || (abstractC19939512zx instanceof AnonymousClass1300) || (abstractC19939512zx instanceof AnonymousClass1305)))))) {
            return abstractC19939512zx;
        }
        Iterator<AnonymousClass1302> it2 = this.LIZ.iterator();
        while (it2.hasNext()) {
            AbstractC19939512zx abstractC19939512zx2 = (AbstractC19939512zx) ((HashMap) it2.next().LLJ.LIZJ).get(str);
            if (abstractC19939512zx2 != null) {
                if (enumC19939412zw != EnumC19939412zw.ALL_SYMBOLS && (enumC19939412zw != EnumC19939412zw.TYPES_ONLY || (!(abstractC19939512zx2 instanceof AnonymousClass1301) && !(abstractC19939512zx2 instanceof C199422130y)))) {
                    if (enumC19939412zw != EnumC19939412zw.AGGREGATES_ONLY) {
                        continue;
                    } else if (!(abstractC19939512zx2 instanceof AnonymousClass1301) && !(abstractC19939512zx2 instanceof C199422130y) && !(abstractC19939512zx2 instanceof AnonymousClass1300)) {
                        if (abstractC19939512zx2 instanceof AnonymousClass1305) {
                            return abstractC19939512zx2;
                        }
                    }
                }
                return abstractC19939512zx2;
            }
        }
        return null;
    }

    public final AbstractC19939512zx LJ(String str, AbstractC19939512zx abstractC19939512zx) throws C19939612zy {
        String strSubstring;
        AbstractC19939512zx abstractC19939512zxLIZJ;
        String string;
        EnumC19939412zw enumC19939412zw = EnumC19939412zw.TYPES_ONLY;
        if (str.startsWith(e3.d)) {
            string = str.substring(1);
            abstractC19939512zxLIZJ = LIZJ(string, enumC19939412zw);
        } else {
            int iIndexOf = str.indexOf(46);
            if (iIndexOf == -1) {
                strSubstring = str;
            } else {
                strSubstring = str.substring(0, iIndexOf);
            }
            StringBuilder sb = new StringBuilder(abstractC19939512zx.LJII());
            while (true) {
                int iLastIndexOf = sb.lastIndexOf(e3.d);
                if (iLastIndexOf == -1) {
                    abstractC19939512zxLIZJ = LIZJ(str, enumC19939412zw);
                    string = str;
                    break;
                }
                int i = iLastIndexOf + 1;
                sb.setLength(i);
                sb.append(strSubstring);
                abstractC19939512zxLIZJ = LIZJ(sb.toString(), EnumC19939412zw.AGGREGATES_ONLY);
                if (abstractC19939512zxLIZJ != null) {
                    if (iIndexOf != -1) {
                        sb.setLength(i);
                        sb.append(str);
                        abstractC19939512zxLIZJ = LIZJ(sb.toString(), enumC19939412zw);
                    }
                    string = sb.toString();
                } else {
                    sb.setLength(iLastIndexOf);
                }
            }
        }
        if (abstractC19939512zxLIZJ == null) {
            if (this.LIZIZ) {
                AnonymousClass1303.LIZ.warning("The descriptor for message type \"" + str + "\" cannot be found and a placeholder is created for it");
                AnonymousClass1301 anonymousClass1301 = new AnonymousClass1301(string);
                this.LIZ.add(anonymousClass1301.LJI());
                return anonymousClass1301;
            }
            throw new C19939612zy(abstractC19939512zx, "\"" + str + "\" is not defined.");
        }
        return abstractC19939512zxLIZJ;
    }
}
