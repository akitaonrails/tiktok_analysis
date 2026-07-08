package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0XzF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C866670XzF extends AbstractC866690XzH<InterfaceC865750Xxl> implements InterfaceC865750Xxl {
    public final Function1<C0YED, InterfaceC865750Xxl> LLILLL;

    @Override // X.InterfaceC865750Xxl
    public final boolean LLJL(Map<String, Map<String, String>> map) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchUpdateMultiple"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LLJL(map);
    }

    @Override // X.AbstractC866690XzH
    public final InterfaceC865750Xxl LLLJ(C0YED c0yed) {
        return this.LLILLL.invoke(c0yed);
    }

    public C866670XzF(C0YEF c0yef, Function1 function1) {
        super(c0yef, "ConvKvModelProxy");
        this.LLILLL = function1;
    }

    @Override // X.InterfaceC865750Xxl
    public final String LJFF(String str, String str2) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("get"));
        if (c0yedLIZIZ == null) {
            return null;
        }
        return LLLJ(c0yedLIZIZ).LJFF(str, str2);
    }

    @Override // X.InterfaceC865750Xxl
    public final Map<String, Map<String, String>> LLIL(List<String> list, List<String> list2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchGet"));
        if (c0yedLIZIZ != null) {
            return LLLJ(c0yedLIZIZ).LLIL(list, list2);
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLLIIIIL(String str, Map<String, String> map) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("batchUpdate"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LLLIIIIL(str, map);
    }

    @Override // X.InterfaceC865750Xxl
    public final boolean LLFZ(String str, String str2, String str3) {
        C0YED c0yedLIZIZ = this.LL.LIZIZ(LLLIZZ("insertOrUpdate"));
        if (c0yedLIZIZ == null) {
            return false;
        }
        return LLLJ(c0yedLIZIZ).LLFZ(str, str2, str3);
    }
}
