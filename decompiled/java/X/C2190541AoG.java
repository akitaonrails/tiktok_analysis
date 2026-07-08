package X;

import android.icu.util.ULocale;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1AoG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2190541AoG implements InterfaceC2190701AoW<ULocale> {
    public ULocale LIZ;
    public ULocale.Builder LIZIZ;
    public boolean LIZJ;

    public final void LJI() throws C20129013pQ {
        if (this.LIZJ) {
            try {
                this.LIZ = this.LIZIZ.build();
                this.LIZJ = false;
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
                throw new C20129013pQ(e.getMessage());
            }
        }
    }

    @Override // X.InterfaceC2190701AoW
    public final HashMap<String, String> LIZ() throws C20129013pQ {
        LJI();
        HashMap<String, String> map = new HashMap<>();
        Iterator<String> keywords = this.LIZ.getKeywords();
        if (keywords != null) {
            while (keywords.hasNext()) {
                String next = keywords.next();
                C2190231Anl c2190231Anl = C2190211Anj.LIZ;
                map.put(c2190231Anl.containsKey(next) ? c2190231Anl.get(next) : next, this.LIZ.getKeywordValue(next));
            }
        }
        return map;
    }

    @Override // X.InterfaceC2190701AoW
    public final InterfaceC2190701AoW<ULocale> LIZIZ() throws C20129013pQ {
        LJI();
        return new C2190541AoG(this.LIZ);
    }

    @Override // X.InterfaceC2190701AoW
    public final String LIZJ() throws C20129013pQ {
        LJI();
        return this.LIZ.toLanguageTag();
    }

    @Override // X.InterfaceC2190701AoW
    public final ULocale LIZLLL() throws C20129013pQ {
        LJI();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.LIZ);
        builder.clearExtensions();
        return builder.build();
    }

    @Override // X.InterfaceC2190701AoW
    public final String LJ() throws C20129013pQ {
        LJI();
        ULocale.Builder builder = new ULocale.Builder();
        builder.setLocale(this.LIZ);
        builder.clearExtensions();
        return builder.build().toLanguageTag();
    }

    @Override // X.InterfaceC2190701AoW
    public final ULocale getLocale() throws C20129013pQ {
        LJI();
        return this.LIZ;
    }

    public C2190541AoG(String str) throws C20129013pQ {
        ULocale.Builder builder = new ULocale.Builder();
        this.LIZIZ = builder;
        try {
            builder.setLanguageTag(str);
            this.LIZJ = true;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20129013pQ(e.getMessage());
        }
    }

    public C2190541AoG(ULocale uLocale) {
        this.LIZ = uLocale;
    }

    @Override // X.InterfaceC2190701AoW
    public final void LJFF(String str, ArrayList<String> arrayList) throws C20129013pQ {
        LJI();
        if (this.LIZIZ == null) {
            this.LIZIZ = new ULocale.Builder().setLocale(this.LIZ);
        }
        try {
            this.LIZIZ.setUnicodeLocaleKeyword(str, TextUtils.join("-", arrayList));
            this.LIZJ = true;
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new C20129013pQ(e.getMessage());
        }
    }
}
