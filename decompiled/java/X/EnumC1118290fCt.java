package X;

import java.util.LinkedList;
import java.util.List;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1118290fCt {
    public static final /* synthetic */ EnumC1118290fCt[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1118290fCt SHOW;
    public static final EnumC1118290fCt TOAST;
    public String LL;
    public List<C1118330fCx> LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1118290fCt> getEntries() {
        return LLILZ;
    }

    static {
        LinkedList linkedList = new LinkedList();
        EnumC1118320fCw enumC1118320fCw = EnumC1118320fCw.YES;
        EnumC1118320fCw enumC1118320fCw2 = EnumC1118320fCw.WHATEVER;
        linkedList.add(new C1118330fCx(enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw2, enumC1118320fCw));
        linkedList.add(new C1118330fCx(EnumC1118320fCw.NO, enumC1118320fCw2, enumC1118320fCw, enumC1118320fCw, enumC1118320fCw));
        EnumC1118290fCt enumC1118290fCt = new EnumC1118290fCt("SHOW", 0, "Show the gift icon", linkedList);
        SHOW = enumC1118290fCt;
        EnumC1118290fCt enumC1118290fCt2 = new EnumC1118290fCt("TOAST", 1, "Show the toast but not the low age Dialog", null);
        TOAST = enumC1118290fCt2;
        EnumC1118290fCt[] enumC1118290fCtArr = {enumC1118290fCt, enumC1118290fCt2};
        LLILLL = enumC1118290fCtArr;
        LLILZ = new C2254308sP(enumC1118290fCtArr);
    }

    public static EnumC1118290fCt[] values() {
        return (EnumC1118290fCt[]) LLILLL.clone();
    }

    public final String getDescription() {
        return this.LL;
    }

    public final List<C1118330fCx> getMStatusSets() {
        return this.LLILLJJLI;
    }

    public static EnumC1118290fCt valueOf(String str) {
        return (EnumC1118290fCt) C08FF.LIZ(EnumC1118290fCt.class, str);
    }

    public final void setDescription(String str) {
        this.LL = str;
    }

    public final void setMStatusSets(List<C1118330fCx> list) {
        this.LLILLJJLI = list;
    }

    public EnumC1118290fCt(String str, int i, String str2, List list) {
        this.LL = str2;
        this.LLILLJJLI = list;
    }
}
