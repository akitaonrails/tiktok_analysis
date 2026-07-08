package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: X.1Aru, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192801Aru implements InterfaceC2190701AoW<Locale> {
    public Locale LIZ;
    public C2192811Arv LIZIZ;
    public boolean LIZJ;

    @Override // X.InterfaceC2190701AoW
    public final HashMap<String, String> LIZ() {
        HashMap<String, String> map = new HashMap<>();
        TreeMap<String, ArrayList<String>> treeMap = this.LIZIZ.LIZJ;
        if (treeMap != null) {
            for (String str : treeMap.keySet()) {
                map.put(str, TextUtils.join("-", this.LIZIZ.LIZJ.get(str)));
            }
        }
        return map;
    }

    public final void LJI() throws C20129013pQ {
        if (this.LIZJ) {
            try {
                LJII();
                this.LIZJ = false;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C20129013pQ(e.getMessage());
            }
        }
    }

    public final void LJII() throws C20129013pQ {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer stringBuffer2 = new StringBuffer();
        StringBuffer stringBuffer3 = new StringBuffer();
        StringBuffer stringBuffer4 = new StringBuffer();
        String str = this.LIZIZ.LIZ.LIZ;
        if (str != null && !str.isEmpty()) {
            stringBuffer2.append(this.LIZIZ.LIZ.LIZ);
        }
        String str2 = this.LIZIZ.LIZ.LIZIZ;
        if (str2 != null && !str2.isEmpty()) {
            stringBuffer3.append(this.LIZIZ.LIZ.LIZIZ);
        }
        String str3 = this.LIZIZ.LIZ.LIZJ;
        if (str3 != null && !str3.isEmpty()) {
            stringBuffer4.append(this.LIZIZ.LIZ.LIZJ);
        }
        if (stringBuffer2.length() > 0) {
            stringBuffer.append(stringBuffer2.toString());
        }
        if (stringBuffer3.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer3.toString());
        }
        if (stringBuffer4.length() > 0) {
            stringBuffer.append("-");
            stringBuffer.append(stringBuffer4.toString());
        }
        ArrayList<String> arrayList = this.LIZIZ.LIZ.LIZLLL;
        if (arrayList != null && !arrayList.isEmpty()) {
            stringBuffer.append("-");
            stringBuffer.append(TextUtils.join("-", this.LIZIZ.LIZ.LIZLLL));
        }
        TreeMap<Character, ArrayList<String>> treeMap = this.LIZIZ.LJFF;
        if (treeMap != null) {
            for (Map.Entry<Character, ArrayList<String>> entry : treeMap.entrySet()) {
                stringBuffer.append("-");
                stringBuffer.append(entry.getKey());
                stringBuffer.append("-");
                stringBuffer.append(TextUtils.join("-", entry.getValue()));
            }
        }
        C2192811Arv c2192811Arv = this.LIZIZ;
        if (c2192811Arv.LIZLLL != null || c2192811Arv.LJ != null) {
            stringBuffer.append("-t-");
            StringBuffer stringBuffer5 = new StringBuffer();
            C2192821Arw c2192821Arw = this.LIZIZ.LIZLLL;
            if (c2192821Arw != null) {
                stringBuffer5.append(c2192821Arw.LIZ);
                if (this.LIZIZ.LIZLLL.LIZIZ != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.LIZIZ.LIZLLL.LIZIZ);
                }
                if (this.LIZIZ.LIZLLL.LIZJ != null) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(this.LIZIZ.LIZLLL.LIZJ);
                }
                ArrayList<String> arrayList2 = this.LIZIZ.LIZLLL.LIZLLL;
                if (arrayList2 != null && !arrayList2.isEmpty()) {
                    stringBuffer5.append("-");
                    stringBuffer5.append(TextUtils.join("-", this.LIZIZ.LIZLLL.LIZLLL));
                }
            }
            TreeMap<String, ArrayList<String>> treeMap2 = this.LIZIZ.LJ;
            if (treeMap2 != null) {
                for (Map.Entry<String, ArrayList<String>> entry2 : treeMap2.entrySet()) {
                    String key = entry2.getKey();
                    ArrayList<String> value = entry2.getValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("-");
                    sbLIZ.append(key);
                    stringBuffer5.append(C2188811AlT.LIZIZ(sbLIZ));
                    for (String str4 : value) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("-");
                        sbLIZ2.append(str4);
                        stringBuffer5.append(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                }
                if (stringBuffer5.length() > 0 && stringBuffer5.charAt(0) == '-') {
                    stringBuffer5.deleteCharAt(0);
                }
            }
            stringBuffer.append(stringBuffer5.toString());
        }
        C2192811Arv c2192811Arv2 = this.LIZIZ;
        if (c2192811Arv2.LIZIZ != null || c2192811Arv2.LIZJ != null) {
            stringBuffer.append("-u-");
            StringBuffer stringBuffer6 = new StringBuffer();
            ArrayList<CharSequence> arrayList3 = this.LIZIZ.LIZIZ;
            if (arrayList3 != null) {
                stringBuffer6.append(TextUtils.join("-", arrayList3));
            }
            TreeMap<String, ArrayList<String>> treeMap3 = this.LIZIZ.LIZJ;
            if (treeMap3 != null) {
                for (Map.Entry<String, ArrayList<String>> entry3 : treeMap3.entrySet()) {
                    String key2 = entry3.getKey();
                    ArrayList<String> value2 = entry3.getValue();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("-");
                    sbLIZ3.append(key2);
                    stringBuffer6.append(C2188811AlT.LIZIZ(sbLIZ3));
                    for (String str5 : value2) {
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("-");
                        sbLIZ4.append(str5);
                        stringBuffer6.append(C2188811AlT.LIZIZ(sbLIZ4));
                    }
                }
            }
            if (stringBuffer6.length() > 0 && stringBuffer6.charAt(0) == '-') {
                stringBuffer6.deleteCharAt(0);
            }
            stringBuffer.append(stringBuffer6.toString());
        }
        if (this.LIZIZ.LJI != null) {
            stringBuffer.append("-x-");
            stringBuffer.append(TextUtils.join("-", this.LIZIZ.LJI));
        }
        try {
            this.LIZ = Locale.forLanguageTag(stringBuffer.toString());
            this.LIZJ = false;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20129013pQ(e.getMessage());
        }
    }

    @Override // X.InterfaceC2190701AoW
    public final InterfaceC2190701AoW<Locale> LIZIZ() throws C20129013pQ {
        LJI();
        return new C2192801Aru(this.LIZ);
    }

    @Override // X.InterfaceC2190701AoW
    public final String LIZJ() throws C20129013pQ {
        LJI();
        return this.LIZ.toLanguageTag();
    }

    @Override // X.InterfaceC2190701AoW
    public final Locale LIZLLL() throws C20129013pQ {
        LJI();
        if (this.LIZIZ == null) {
            this.LIZIZ = C2192831Arx.LIZLLL(this.LIZ.toLanguageTag());
        }
        C2192811Arv c2192811Arv = new C2192811Arv();
        c2192811Arv.LIZ = this.LIZIZ.LIZ;
        C2192801Aru c2192801Aru = new C2192801Aru(c2192811Arv);
        c2192801Aru.LJI();
        return c2192801Aru.LIZ;
    }

    @Override // X.InterfaceC2190701AoW
    public final String LJ() throws C20129013pQ {
        LJI();
        if (this.LIZIZ == null) {
            this.LIZIZ = C2192831Arx.LIZLLL(this.LIZ.toLanguageTag());
        }
        C2192811Arv c2192811Arv = new C2192811Arv();
        c2192811Arv.LIZ = this.LIZIZ.LIZ;
        C2192801Aru c2192801Aru = new C2192801Aru(c2192811Arv);
        c2192801Aru.LJI();
        return c2192801Aru.LIZ.toLanguageTag();
    }

    @Override // X.InterfaceC2190701AoW
    public final Locale getLocale() throws C20129013pQ {
        LJI();
        return this.LIZ;
    }

    public C2192801Aru(String str) throws C20129013pQ {
        this.LIZIZ = C2192831Arx.LIZLLL(str);
        LJII();
    }

    public C2192801Aru(C2192811Arv c2192811Arv) throws C20129013pQ {
        this.LIZIZ = c2192811Arv;
        LJII();
    }

    public C2192801Aru(Locale locale) {
        this.LIZ = locale;
    }

    @Override // X.InterfaceC2190701AoW
    public final void LJFF(String str, ArrayList<String> arrayList) throws C20129013pQ {
        LJI();
        if (this.LIZIZ == null) {
            this.LIZIZ = C2192831Arx.LIZLLL(this.LIZ.toLanguageTag());
        }
        C2192811Arv c2192811Arv = this.LIZIZ;
        if (c2192811Arv.LIZJ == null) {
            c2192811Arv.LIZJ = new TreeMap<>();
        }
        if (!this.LIZIZ.LIZJ.containsKey(str)) {
            this.LIZIZ.LIZJ.put(str, new ArrayList<>());
        }
        this.LIZIZ.LIZJ.get(str).clear();
        this.LIZIZ.LIZJ.get(str).addAll(arrayList);
        this.LIZJ = true;
    }
}
