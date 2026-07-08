package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.LruCache;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.05ne, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1460405ne {
    public static final C1460405ne LIZ = new C1460405ne();
    public static final ConcurrentHashMap<String, Pair<AbstractC879060Ye8, InterfaceC866850XzX>> LIZIZ = new ConcurrentHashMap<>();
    public static final LruCache<String, Bitmap> LIZJ = new LruCache<>(20);
    public static final Map<String, C05XL<Bitmap>> LIZLLL = new LinkedHashMap();

    public static void LIZ(String str) {
        LIZJ.remove(str);
        Pair<AbstractC879060Ye8, InterfaceC866850XzX> pairRemove = LIZIZ.remove(str);
        if (pairRemove != null) {
            pairRemove.getFirst().LJIILLIIL(pairRemove.getSecond());
        }
        Map<String, C05XL<Bitmap>> map = LIZLLL;
        synchronized (map) {
            try {
                C05XL<Bitmap> c05xlRemove = map.remove(str);
                if (c05xlRemove != null) {
                    c05xlRemove.LIZIZ(null);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static String LIZJ(Object obj) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(obj.getClass().getSimpleName());
        sbLIZ.append('@');
        sbLIZ.append(System.identityHashCode(obj));
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJ(final String str) {
        ConcurrentHashMap<String, Pair<AbstractC879060Ye8, InterfaceC866850XzX>> concurrentHashMap = LIZIZ;
        if (concurrentHashMap.keySet().contains(str)) {
            return;
        }
        InterfaceC866850XzX interfaceC866850XzX = new InterfaceC866850XzX() { // from class: X.05nf
            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJJJJL(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLIIIJ(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLJLI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJLL(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJJZZI(List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLI(String str2, List<C0YAE> list) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLILLLLZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLJI(int i, C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJZI(C0Y8T c0y8t) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIIII(int i, String str2) {
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LLIILZL(int i, String str2, List list) {
            }

            @Override // X.InterfaceC868050Y3n
            public final int LLLIIII() {
                return 0;
            }

            @Override // X.InterfaceC866850XzX, X.InterfaceC868050Y3n
            public final void LJLL(C1711306n1 c1711306n1) {
                Long l;
                if (c1711306n1 != null && (l = c1711306n1.LIZ) != null) {
                    long jLongValue = l.longValue();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("unregister retry observer and remove cache for convId: ");
                    sbLIZ.append(str);
                    C2188811AlT.LIZIZ(sbLIZ);
                    C1460405ne c1460405ne = C1460405ne.LIZ;
                    String strValueOf = String.valueOf(jLongValue);
                    c1460405ne.getClass();
                    C1460405ne.LIZ(strValueOf);
                }
            }
        };
        C866530Xz1 c866530Xz1LIZIZ = C0YNP.LIZIZ(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register retry observer for convId: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        Pair<AbstractC879060Ye8, InterfaceC866850XzX> pair = new Pair<>(c866530Xz1LIZIZ, interfaceC866850XzX);
        c866530Xz1LIZIZ.LJIIJJI(interfaceC866850XzX);
        concurrentHashMap.put(str, pair);
    }

    public static AbstractC1460205nc LIZIZ(Context context, String str, List list, InterfaceC497601wk interfaceC497601wk) {
        Bitmap bitmap = LIZJ.get(str);
        if (bitmap != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOrGenerateAvatar ");
            sbLIZ.append(str);
            sbLIZ.append(" hit cache");
            C2188811AlT.LIZIZ(sbLIZ);
            return new C1460305nd(bitmap);
        }
        Map<String, C05XL<Bitmap>> map = LIZLLL;
        synchronized (map) {
            try {
                C05XL c05xl = (C05XL) ((LinkedHashMap) map).get(str);
                if (c05xl != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("getOrGenerateAvatar avatar for group_");
                    sbLIZ2.append(str);
                    sbLIZ2.append(" is generating by task :");
                    sbLIZ2.append(c05xl);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return new C1460105nb(c05xl);
                }
                C099F c099fLIZIZ = C090F.LIZIZ();
                map.put(str, c099fLIZIZ);
                C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1459805nY(str, list, c099fLIZIZ, context, null), 2);
                return new C1460105nb(c099fLIZIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZLLL(Context context, String str, C1322110kVd c1322110kVd, List list, InterfaceC497601wk interfaceC497601wk) {
        Resources resources;
        if (context != null && (resources = context.getResources()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadLocalAvatar start, avatar: ");
            sbLIZ.append(LIZJ(c1322110kVd));
            sbLIZ.append(", conversationId=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            try {
                AbstractC1460205nc abstractC1460205ncLIZIZ = LIZIZ(context, str, list, interfaceC497601wk);
                if (abstractC1460205ncLIZIZ instanceof C1460305nd) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("loadLocalAvatar finish directly, avatar: ");
                    sbLIZ2.append(LIZJ(c1322110kVd));
                    sbLIZ2.append(", conversationId=");
                    sbLIZ2.append(str);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, ((C1460305nd) abstractC1460205ncLIZIZ).LIZ);
                    c1322110kVd.setImageDrawable(bitmapDrawable);
                    C1331070kk5 hierarchy = c1322110kVd.getHierarchy();
                    if (hierarchy != null) {
                        hierarchy.LJIJ(bitmapDrawable, 1);
                        return;
                    }
                    return;
                }
                if (abstractC1460205ncLIZIZ instanceof C1460105nb) {
                    C23250099c.LIZLLL(interfaceC497601wk, C0PEM.LIZJ, null, new C1460005na(abstractC1460205ncLIZIZ, c1322110kVd, str, resources, null), 2);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
