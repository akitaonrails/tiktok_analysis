package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0i49, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1228190i49 {
    public final C1228170i47 LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(646));

    public C1228190i49(C1228170i47 c1228170i47) {
        this.LIZ = c1228170i47;
    }

    public final void LIZ(Map<String, ? extends Object> map, final Function1<? super C0Y8T, Unit> function1) {
        C1228040i3u c1228040i3uLIZJ = C1226680i1i.LIZJ(this.LIZ.LLILLJJLI);
        C913630Zsn c913630Zsn = C913630Zsn.LJIIJJI;
        String str = c1228040i3uLIZJ.LIZ;
        String str2 = c1228040i3uLIZJ.LIZIZ;
        String str3 = c1228040i3uLIZJ.LIZJ;
        c913630Zsn.getClass();
        C1229380i64 c1229380i64 = new C1229380i64(str, str2, str3);
        EnumC1230500i7s enumC1230500i7s = null;
        Object obj = null;
        C1229390i65 c1229390i65 = new C1229390i65(C13BV.INSTANCE, null, EnumC913760Zt0.QR_CODE_GROUP, null, null, map, null, null, null, 474);
        String strLIZJ = this.LIZ.LJJJJJL().LJIIIZ().LIZJ();
        String strLIZLLL = this.LIZ.LJJJJJL().LJIIIZ().LIZLLL();
        if (map != null) {
            obj = map.get("a:join_group_source");
        }
        if (obj instanceof EnumC1230500i7s) {
            enumC1230500i7s = (EnumC1230500i7s) obj;
        }
        c1229380i64.LIZ(c1229390i65, new C1229400i66(strLIZJ, strLIZLLL, this.LIZ.LLJIJIL, enumC1230500i7s), new C1231500i9U() { // from class: X.0i4A
            @Override // X.C1231500i9U, X.InterfaceC863580XuG, X.InterfaceC863600XuI
            public final void LIZIZ(C0YMW c0ymw) {
                super.LIZIZ(c0ymw);
                Function1<C0Y8T, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(null);
                }
            }

            @Override // X.C1231500i9U, X.InterfaceC863580XuG
            /* JADX INFO: renamed from: LIZJ */
            public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                super.LJ(c0y8t, c0ymw);
                Function1<C0Y8T, Unit> function12 = function1;
                if (function12 != null) {
                    function12.invoke(c0y8t);
                }
            }
        }, null);
    }
}
