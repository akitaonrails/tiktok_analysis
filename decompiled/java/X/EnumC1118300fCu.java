package X;

import java.util.LinkedList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fCu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1118300fCu {
    public static final EnumC1118300fCu GREY;
    public static final EnumC1118300fCu HIDE;
    public static final /* synthetic */ EnumC1118300fCu[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1118300fCu SHOW;
    public String LL;
    public List<C1118330fCx> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1118300fCu> getEntries() {
        return LLILZ;
    }

    static {
        LinkedList linkedList = new LinkedList();
        EnumC1118320fCw enumC1118320fCw = EnumC1118320fCw.YES;
        EnumC1118320fCw enumC1118320fCw2 = EnumC1118320fCw.WHATEVER;
        EnumC1118320fCw enumC1118320fCw3 = EnumC1118320fCw.NO;
        linkedList.add(new C1118330fCx(enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw, enumC1118320fCw3));
        linkedList.add(new C1118330fCx(enumC1118320fCw3, enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw, enumC1118320fCw2));
        EnumC1118300fCu enumC1118300fCu = new EnumC1118300fCu("SHOW", 0, "Show the gift icon", linkedList);
        SHOW = enumC1118300fCu;
        EnumC1118300fCu enumC1118300fCu2 = new EnumC1118300fCu("HIDE", 1, "Hide the gift icon", null);
        HIDE = enumC1118300fCu2;
        EnumC1118300fCu enumC1118300fCu3 = new EnumC1118300fCu("GREY", 2, "Show the grey gift icon", null);
        GREY = enumC1118300fCu3;
        EnumC1118300fCu[] enumC1118300fCuArr = {enumC1118300fCu, enumC1118300fCu2, enumC1118300fCu3};
        LLILLL = enumC1118300fCuArr;
        LLILZ = new C2254308sP(enumC1118300fCuArr);
    }

    public static EnumC1118300fCu[] values() {
        return (EnumC1118300fCu[]) LLILLL.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public final List<C1118330fCx> getMStatusSets() {
        return this.LLILLJJLI;
    }

    public static EnumC1118300fCu valueOf(String str) {
        return (EnumC1118300fCu) C08FF.LIZ(EnumC1118300fCu.class, str);
    }

    public final void setDescription(String str) {
        this.LL = str;
    }

    public final void setMStatusSets(List<C1118330fCx> list) {
        this.LLILLJJLI = list;
    }

    public EnumC1118300fCu(String str, int i, String str2, List list) {
        this.LL = str2;
        this.LLILLJJLI = list;
    }
}
