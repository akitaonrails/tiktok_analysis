package X;

import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11zK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19680811zK {
    public final String LIZ;
    public final String LIZIZ;
    public final TextStickerModel LIZJ;
    public final EnumC371580EhY LIZLLL;
    public final C386100FBw LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<Unit> LJI;
    public final C375830EoP<Unit> LJII;
    public final C375830EoP<Unit> LJIIIIZZ;
    public final List<InterfaceC19682311zZ> LJIIIZ;
    public final C19681811zU LJIIJ;

    public C19680811zK() {
        this(null, 2047);
    }

    public /* synthetic */ C19680811zK(C19681811zU c19681811zU, int i) {
        String str;
        TextStickerModel textStickerModel;
        EnumC371580EhY enumC371580EhY;
        C19681811zU c19681811zU2 = c19681811zU;
        if ((i & 1) != 0) {
            str = "";
        } else {
            str = null;
        }
        String str2 = (i & 2) == 0 ? null : "";
        if ((i & 4) != 0) {
            textStickerModel = new TextStickerModel(null, null, null, null, null, 0, 0, 0, 0.0f, null, false, false, false, false, false, null, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, false, null, null, false, false, null, null, null, null, null, null, false, false, null, false, false, false, null, -1, 65535, null);
        } else {
            textStickerModel = null;
        }
        if ((i & 8) != 0) {
            enumC371580EhY = EnumC371580EhY.SHOW;
        } else {
            enumC371580EhY = null;
        }
        this(str, str2, textStickerModel, enumC371580EhY, null, null, null, null, null, (i & 512) != 0 ? new ArrayList() : null, (i & 1024) != 0 ? new C19681811zU(false, false) : c19681811zU2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19680811zK(String str, String str2, TextStickerModel textStickerModel, EnumC371580EhY enumC371580EhY, C386100FBw c386100FBw, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4, List<? extends InterfaceC19682311zZ> list, C19681811zU c19681811zU) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = textStickerModel;
        this.LIZLLL = enumC371580EhY;
        this.LJ = c386100FBw;
        this.LJFF = c375830EoP;
        this.LJI = c375830EoP2;
        this.LJII = c375830EoP3;
        this.LJIIIIZZ = c375830EoP4;
        this.LJIIIZ = list;
        this.LJIIJ = c19681811zU;
    }

    public static C19680811zK LIZ(C19680811zK c19680811zK, String str, String str2, TextStickerModel textStickerModel, EnumC371580EhY enumC371580EhY, C386100FBw c386100FBw, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, List list, C19681811zU c19681811zU, int i) {
        C19681811zU c19681811zU2 = c19681811zU;
        List list2 = list;
        C375830EoP c375830EoP5 = c375830EoP4;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP2;
        C375830EoP c375830EoP8 = c375830EoP;
        C386100FBw c386100FBw2 = c386100FBw;
        EnumC371580EhY enumC371580EhY2 = enumC371580EhY;
        TextStickerModel textStickerModel2 = textStickerModel;
        String str3 = str2;
        String str4 = str;
        if ((i & 1) != 0) {
            str4 = c19680811zK.LIZ;
        }
        if ((i & 2) != 0) {
            str3 = c19680811zK.LIZIZ;
        }
        if ((i & 4) != 0) {
            textStickerModel2 = c19680811zK.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC371580EhY2 = c19680811zK.LIZLLL;
        }
        if ((i & 16) != 0) {
            c386100FBw2 = c19680811zK.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP8 = c19680811zK.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP7 = c19680811zK.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP6 = c19680811zK.LJII;
        }
        if ((i & 256) != 0) {
            c375830EoP5 = c19680811zK.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            list2 = c19680811zK.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            c19681811zU2 = c19680811zK.LJIIJ;
        }
        c19680811zK.getClass();
        return new C19680811zK(str4, str3, textStickerModel2, enumC371580EhY2, c386100FBw2, c375830EoP8, c375830EoP7, c375830EoP6, c375830EoP5, list2, c19681811zU2);
    }
}
