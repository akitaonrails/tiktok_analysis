package X;

import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC460370I3n {
    public static final /* synthetic */ EnumC460370I3n[] LLIZLLLIL;
    public static final /* synthetic */ C2254308sP LLJ;
    public static final EnumC460370I3n PHOTO;
    public static final EnumC460370I3n QUICK_LIVE_REACTION;
    public static final EnumC460370I3n STICKER;
    public static final EnumC460370I3n VIDEO;
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final InterfaceC460900I5o LLILZ;
    public final InterfaceC460300I3g LLILZIL;
    public final C0I5E LLILZLL;
    public final EnumC460470I3x LLIZ;

    public static InterfaceC2044707zh<EnumC460370I3n> getEntries() {
        return LLJ;
    }

    static {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90));
        int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
        int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
        C1233704sB c1233704sB = new C1233704sB(2131831882, (List<String>) null);
        C0I5E c0i5e = C0I5E.NONE;
        EnumC460470I3x enumC460470I3x = EnumC460470I3x.ROUNDED_CORNERS;
        EnumC460370I3n enumC460370I3n = new EnumC460370I3n("PHOTO", 0, iLIZIZ, iLIZIZ2, iLIZIZ3, null, c1233704sB, c0i5e, enumC460470I3x);
        PHOTO = enumC460370I3n;
        EnumC460370I3n enumC460370I3n2 = new EnumC460370I3n("VIDEO", 1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), new C460450I3v(R.raw.icon_play_fill, Integer.valueOf(R.attr.ef)), new C1233704sB(2131831618, (List<String>) null), C0I5E.PLAY, enumC460470I3x);
        VIDEO = enumC460370I3n2;
        EnumC460370I3n enumC460370I3n3 = new EnumC460370I3n("STICKER", 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), null, new C1233704sB(2131831887, (List<String>) null), c0i5e, enumC460470I3x);
        STICKER = enumC460370I3n3;
        EnumC460370I3n enumC460370I3n4 = new EnumC460370I3n("QUICK_LIVE_REACTION", 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(200)), null, new C1233704sB(2131831618, (List<String>) null), c0i5e, EnumC460470I3x.CIRCLE);
        QUICK_LIVE_REACTION = enumC460370I3n4;
        EnumC460370I3n[] enumC460370I3nArr = {enumC460370I3n, enumC460370I3n2, enumC460370I3n3, enumC460370I3n4};
        LLIZLLLIL = enumC460370I3nArr;
        LLJ = new C2254308sP(enumC460370I3nArr);
    }

    public static EnumC460370I3n[] values() {
        return (EnumC460370I3n[]) LLIZLLLIL.clone();
    }

    public final C460460I3w toMediaUIState() {
        return new C460460I3w(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILZ, this.LLILLJJLI, this.LL, this.LLILLL);
    }

    public static EnumC460370I3n valueOf(String str) {
        return (EnumC460370I3n) C08FF.LIZ(EnumC460370I3n.class, str);
    }

    public EnumC460370I3n(String str, int i, int i2, int i3, int i4, C460450I3v c460450I3v, C1233704sB c1233704sB, C0I5E c0i5e, EnumC460470I3x enumC460470I3x) {
        this.LL = i2;
        this.LLILLJJLI = i3;
        this.LLILLL = i4;
        this.LLILZ = c460450I3v;
        this.LLILZIL = c1233704sB;
        this.LLILZLL = c0i5e;
        this.LLIZ = enumC460470I3x;
    }
}
